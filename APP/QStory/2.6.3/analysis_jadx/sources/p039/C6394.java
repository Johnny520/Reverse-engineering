package p039;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.fragment.app.C2330;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.util.Arrays;
import p019.C6263;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p389.C9092;
import p392.C9098;
import p392.C9102;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6394 extends AbstractC6311 implements InterfaceC6317 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        System.currentTimeMillis();
        C9098 c9098 = new C9098();
        c9098.m14687(AbstractC8405.m13972(248), AbstractC8405.m13972(249));
        Class cls = Void.TYPE;
        c9098.f25493 = cls;
        c9098.f25504 = 3;
        m11830(c9098.m14689(), new C6263(19));
        C9098 c90982 = new C9098();
        c90982.f25495 = AbstractC6337.m11866(AbstractC8405.m13972(256));
        c90982.m14687(AbstractC8405.m13972(257), AbstractC8405.m13972(258));
        Method methodM14689 = c90982.m14689();
        C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(256));
        c9092M14673.f25481 = AbstractC8405.m13972(73);
        c9092M14673.f25483 = cls;
        c9092M14673.m14675(Bundle.class);
        m11830((Method) c9092M14673.m14605(), new C0679(this, 3, methodM14689));
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.INVOKE_POLYMORPHIC));
        C9092 c9092M14672 = C9092.m14672(clsM11866);
        Class cls2 = Boolean.TYPE;
        c9092M14672.f25483 = cls2;
        c9092M14672.m14675(cls2);
        m11831((Method) c9092M14672.m14605(), new C6263(20));
        C9102 c9102 = new C9102();
        c9102.f25521.addAll(Arrays.asList(AbstractC8405.m13972(Opcodes.INVOKE_POLYMORPHIC_RANGE)));
        c9102.m14695(AbstractC8405.m13972(Opcodes.INVOKE_CUSTOM), AbstractC8405.m13972(Opcodes.INVOKE_CUSTOM_RANGE));
        Class clsM14696 = c9102.m14696();
        C9098 c90983 = new C9098();
        c90983.f25495 = clsM11866;
        c90983.m14687(AbstractC8405.m13972(Opcodes.CONST_METHOD_HANDLE));
        Method methodM146892 = c90983.m14689();
        C9098 c90984 = new C9098();
        c90984.f25495 = clsM11866;
        c90984.m14687(AbstractC8405.m13972(Opcodes.CONST_METHOD_TYPE));
        Method methodM146893 = c90984.m14689();
        C9092 c9092M146722 = C9092.m14672(clsM14696);
        c9092M146722.f25481 = AbstractC8405.m13972(73);
        c9092M146722.f25483 = cls;
        c9092M146722.m14675(Bundle.class);
        m11830((Method) c9092M146722.m14605(), new C2330(this, clsM11866, methodM146892, methodM146893));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(259);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
    }
}
