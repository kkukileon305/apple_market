package com.goodness.applemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
	val image: Int,
	val title: String,
	val desc: String,
	val price: Int,
	val seller: String,
	val totalComments: Int,
	val totalLikes: Int,
	val place: String
) : Parcelable {
	companion object {
		val DUMMY_DATA = listOf(
			Product(
				title = "산진 한달된 지구 팝니다.",
				desc = "이사가서 필요가 없어졌어요 급하게 내놓습니다",
				image = R.drawable.sample1,
				price = 2000000000,
				seller = "안마담",
				totalComments = 20,
				totalLikes = 12,
				place = "서울 서대문구 창천동",
			),
			Product(
				title = "김치냉장고",
				desc = "설명2",
				image = R.drawable.sample2,
				price = 40000,
				seller = "안마담",
				totalComments = 4,
				totalLikes = 23,
				place = "인천 계양구 귤현동"
			),
			Product(
				title = "샤넬 카드지갑",
				desc = "설명3",
				image = R.drawable.sample3,
				price = 30000,
				seller = "코코유",
				totalComments = 0,
				totalLikes = 3,
				place = "수성구 범어동"
			),
			Product(
				title = "금고",
				desc = "금고\n떼서 가져가야함\n대우월드마크센텀\n미국이주관계로 싸게 팝니다",
				image = R.drawable.sample4,
				price = 30000,
				seller = "Nicole",
				totalComments = 12,
				totalLikes = 7,
				place = "해운대구 우제2동"
			),
			Product(
				title = "갤럭시Z플립3 팝니다",
				desc = "설명3",
				image = R.drawable.sample5,
				price = 30000,
				seller = "절명",
				totalComments = 2,
				totalLikes = 1,
				place = "연제구 연산제8동"
			),
			Product(
				title = "프라다 복조리백",
				desc = "설명zxc3",
				image = R.drawable.sample6,
				price = 30000,
				seller = "미니멀하게",
				totalComments = 12,
				totalLikes = 2,
				place = "수원시 영통구 원천동"
			),
			Product(
				title = "울산 동해오션뷰 60평 복층 펜트하우스 1일 숙박권 펜션 힐링 숙소 별장",
				desc = "울산 동해바다뷰 60평 복층 펜트하우스 1일 숙박권\n(에어컨이 없기에 낮은 가격으로 변경했으며 8월 초 가장 더운날 다녀가신 분 경우 시원했다고 잘 지내다 가셨습니다)\n1. 인원: 6명 기준입니다. 1인 10,000원 추가요금\n2. 장소: 북구 블루마시티, 32-33층\n3. 취사도구, 침구류, 세면도구, 드라이기 2개, 선풍기 4대 구비\n4. 예약방법: 예약금 50,000원 하시면 저희는 명함을 드리며 입실 오전 잔금 입금하시면 저희는 동.호수를 알려드리며 고객님은 예약자분 신분증 앞면 주민번호 뒷자리 가리시거나 지우시고 문자로 보내주시면 저희는 카드키를 우편함에 놓아 둡니다.\n5. 33층 옥상 야외 테라스 있음, 가스버너 있음\n6. 고기 굽기 가능\n7. 입실 오후 3시, 오전 11시 퇴실, 정리, 정돈 , 밸브 잠금 부탁드립니다.\n8. 층간소음 주의 부탁드립니다.\n9. 방3개, 화장실3개, 비데 3개\n10. 저희 집안이 쓰는 별장입니다.",
				image = R.drawable.sample7,
				price = 150000,
				seller = "굿리치",
				totalComments = 12,
				totalLikes = 2,
				place = "남구 옥동"
			),
			Product(
				title = "샤넬 탑핸들 가방",
				desc = "샤넬 트랜디 CC 탑핸들 스몰 램스킨 블랙 금장 플랩백 !\n + \n + \"색상 : 블랙\n\" + \"사이즈 : 25.5cm * 17.5cm * 8cm\n\" + \"구성 : 본품더스트\n\" + \"\n\" + \"급하게 돈이 필요해서 팝니다 ㅠ ㅠ",
				image = R.drawable.sample8,
				price = 150000,
				seller = "난쉽",
				totalComments = 12,
				totalLikes = 2,
				place = "남구 옥동"
			),
			Product(
				title = "4행정 엔진분무기 판매합니다.",
				desc = "3년전에 사서 한번 사용하고 그대로 둔 상태입니다. 요즘 사용은 안해봤습니다. 그래서 저렴하게 내 놓습니다. 중고라 반품은 어렵습니다.\n",
				image = R.drawable.sample9,
				price = 30000,
				seller = "알뜰한",
				totalComments = 28,
				totalLikes = 7,
				place = "원주시 명륜2동"
			),
			Product(
				title = "셀린느 버킷 가방",
				desc = "22년 신세계 대전 구매입니당\n + \"셀린느 버킷백\n\" + \"구매해서 몇번사용했어요\n\" + \"까짐 스크래치 없습니다.\n\" + \"타지역에서 보내는거라 택배로 진행합니당!\"",
				image = R.drawable.sample10,
				price = 190000,
				seller = "똑태현",
				totalComments = 6,
				totalLikes = 40,
				place = "중구 동화동"
			)
		)
	}
}