package p055;

import android.view.View;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import p042.AbstractC7140;
import p045.C7149;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7224 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17903 = {"J", "com.tencent.qqnt.kernel.nativeinterface.Contact", "java.util.ArrayList", "java.util.HashMap", "com.tencent.qqnt.kernel.nativeinterface.IOperateCallback"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7149 f17904 = new C7149("MessagePrefixAndSuffixModification");

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
        c7164M12412.f17803.f3963 = "sendMsg";
        String[] strArr = this.f17903;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC7166.m12425(strArr[i]);
        }
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        m12390(c7164M12412.m12414(), new C3191(this, 16));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "点击设置消息前后缀";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 17);
    }
}
