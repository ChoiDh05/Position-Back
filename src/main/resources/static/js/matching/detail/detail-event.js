// 카카오 맵
document.querySelector('.btn-mapview.relay-map').addEventListener('click', function() {
    // 주소 가져오기
    const addressElement = document.querySelector('.spr-jview.txt-adr span:last-child'); // 두 번째 span 요소 선택
    const address = addressElement.innerText; // 주소 텍스트 가져오기

    // 주소로 위도와 경도를 얻기 위한 API 호출
    const geocoder = new kakao.maps.services.Geocoder();

    geocoder.addressSearch(address, function(results, status) {
        if (status === kakao.maps.services.Status.OK) {
            const url = `https://map.kakao.com/link/search/${address}`;

            // 새 창 열기
            window.open(url, "_blank"); // 새 탭에서 열기
        } else {
            alert('주소를 찾을 수 없습니다. 상태: ' + status);
        }
    });
});



