package lin.xposed.hook.javaplugin.bean;

import android.graphics.Point;
import com.alibaba.fastjson2.InterfaceC2915;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class OcrText {
    public Float confidence;
    public int orientation;
    public List<Point> points;
    public String text;
    public List<OcrTextResult> textList;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class OcrTextResult {
        public Float confidence;
        public int id;
        public String text;
    }

    public String toString() {
        return InterfaceC2915.m6317(this);
    }
}
