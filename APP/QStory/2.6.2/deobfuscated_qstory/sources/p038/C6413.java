package p038;

import android.widget.ImageView;
import com.bumptech.glide.AbstractC3056;
import p022.C6267;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6413 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11838;
        try {
            clsM11838 = AbstractC6318.m11838("com.tencent.richframework.gallery.part.RFWLayerAnimPart");
        } catch (Throwable unused) {
            clsM11838 = null;
        }
        if (clsM11838 != null) {
            m11802(clsM11838.getDeclaredMethod("initStartAnim", ImageView.class), new C6267(6));
            m11803(clsM11838.getDeclaredMethod("updateBackgroundAlpha", Integer.TYPE), new C6267(7));
        }
    }
}
