package lin.xposed.hook.javaplugin.bean;

import android.graphics.Point;
import com.alibaba.fastjson2.InterfaceC2916;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OcrText {
    public Float confidence;
    public int orientation;
    public List<Point> points;
    public String text;
    public List<OcrTextResult> textList;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OcrTextResult {
        public Float confidence;
        public int id;
        public String text;
    }

    public String toString() {
        return InterfaceC2916.m6375(this);
    }
}
