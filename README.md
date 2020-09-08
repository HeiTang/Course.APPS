# ReadME

### 課程:地理資訊於APPS之應用

### Lab 1 
- 設計一Android APP包含下列功能: 
    - BMI計算 
    - 小算盤

### Lab 2 
- 延伸 Lab 1 並將結果顯示在另一頁。
    - 當輸入好體重、身高，按下 BMI Caculation 按鈕，BMI 資訊會於另一個畫面顯示。
    - 當輸入好一組運算數字按下 +-*/ 按鈕，運算結果資訊會於另一個畫面顯示。

### Lab 3
- 設定金鑰及建立地圖並將標記點設在逢甲大學。

### Lab 4
- 設計一 button 每點擊一下及切換地圖類型。
- button 的文字敘述請加上自己的姓名。

### Lab 5
- 量測標記點拖曳的起始至終點的距離(km)。
- 並將距離用 Toast.makeText 方式顯示出來。
- 參考
    ```
    float[] result = new float[1];
    Location.distanceBetween(latLon1.getLatitude(), latLon1.getLongitude(), latLon2.getLatitude(), latLon2.getLongitude(),result);
    ```

### Lab 6
- 給定初始標記點，再透過標記點拖曳方式延伸出第二及第三頂點以形成三角形，頂點上都需畫上標記點。

### Lab 7 
- 參考本次課程講義 p5-p9 程式，實作一 Map APP，並有下列功能:
    - 點擊 map 時會跳出視窗尋問，是否要新增 marker，並且提供一 Edittext 來設定 marker name (marker name 設為自己的學號)。
    - 新增後的 marker 會顯示於 map 上，我們點擊此 marker 時他會顯示此 marker name 及他的 latitude 座標。
    - UI style 參考此次講義 P4

### Lab 8 
- 實作講義裡的"對相機進行動畫處理(1/4)~(4/4)"範例

### Lab 9
- 依據講義範例 UI 設計及使用意圖功能，再點選 button後，即可以透過 google map 搜尋逢甲大學，並將逢甲大學地理資訊顯示在地圖上。
