package p042;

import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7140 extends AbstractC7143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Boolean f17770 = Boolean.FALSE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public String mo11794() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12389(Member member, InterfaceC7141 interfaceC7141) {
        XposedBridge.hookMethod(member, new C7142(this, interfaceC7141, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public View.OnClickListener mo11806() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12390(Member member, InterfaceC7141 interfaceC7141) {
        XposedBridge.hookMethod(member, new C7142(this, interfaceC7141, 1));
    }
}
