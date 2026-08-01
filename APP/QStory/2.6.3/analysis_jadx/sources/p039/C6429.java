package p039;

import android.widget.ImageView;
import p019.C6263;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6429 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11866;
        try {
            clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(143));
        } catch (Throwable unused) {
            clsM11866 = null;
        }
        if (clsM11866 != null) {
            m11830(clsM11866.getDeclaredMethod(AbstractC8405.m13972(144), ImageView.class), new C6263(6));
            m11831(clsM11866.getDeclaredMethod(AbstractC8405.m13972(145), Integer.TYPE), new C6263(7));
        }
    }
}
