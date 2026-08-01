package p043;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import p026.AbstractC6293;
import p028.C6301;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6447 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17681 = {"J", "com.tencent.qqnt.kernel.nativeinterface.Contact", "java.util.ArrayList", "java.util.HashMap", "com.tencent.qqnt.kernel.nativeinterface.IOperateCallback"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6301 f17682;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f17682 = new C6301("AtTextSummaryChange");
        C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
        c6316M11825.f17409.f3617 = "sendMsg";
        String[] strArr = this.f17681;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC6318.m11838(strArr[i]);
        }
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        m11803(c6316M11825.m11827(), new C2358(this, 19));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u70b9\u51fb\u53ef\u8bbe\u7f6e\u663e\u793a\u7684\u6587\u672c";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 18);
    }
}
