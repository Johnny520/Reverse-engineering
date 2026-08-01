package p055;

import android.widget.ImageView;
import p035.C7092;
import p042.AbstractC7140;
import p049.AbstractC7166;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7258 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM12425;
        try {
            clsM12425 = AbstractC7166.m12425("com.tencent.richframework.gallery.part.RFWLayerAnimPart");
        } catch (Throwable unused) {
            clsM12425 = null;
        }
        if (clsM12425 != null) {
            m12389(clsM12425.getDeclaredMethod("initStartAnim", ImageView.class), new C7092(6));
            m12390(clsM12425.getDeclaredMethod("updateBackgroundAlpha", Integer.TYPE), new C7092(7));
        }
    }
}
