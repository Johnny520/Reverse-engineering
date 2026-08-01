package p026;

import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6293 extends AbstractC6296 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Boolean f17376 = Boolean.FALSE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public String mo11178() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11802(Member member, InterfaceC6294 interfaceC6294) {
        XposedBridge.hookMethod(member, new C6295(this, interfaceC6294, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public View.OnClickListener mo11193() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11803(Member member, InterfaceC6294 interfaceC6294) {
        XposedBridge.hookMethod(member, new C6295(this, interfaceC6294, 1));
    }
}
