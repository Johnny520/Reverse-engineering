package p055;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.C1520;
import androidx.fragment.app.C3163;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.util.Arrays;
import p035.C7092;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p405.C9921;
import p408.C9927;
import p408.C9931;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7223 extends AbstractC7140 implements InterfaceC7146 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        System.currentTimeMillis();
        C9927 c9927 = new C9927();
        c9927.m15246(AbstractC9234.m14531(248), AbstractC9234.m14531(249));
        Class cls = Void.TYPE;
        c9927.f25838 = cls;
        c9927.f25849 = 3;
        m12389(c9927.m15248(), new C7092(19));
        C9927 c99272 = new C9927();
        c99272.f25840 = AbstractC7166.m12425(AbstractC9234.m14531(256));
        c99272.m15246(AbstractC9234.m14531(257), AbstractC9234.m14531(258));
        Method methodM15248 = c99272.m15248();
        C9921 c9921M15232 = C9921.m15232(AbstractC9234.m14531(256));
        c9921M15232.f25826 = AbstractC9234.m14531(73);
        c9921M15232.f25828 = cls;
        c9921M15232.m15234(Bundle.class);
        m12389((Method) c9921M15232.m15164(), new C1520(this, 3, methodM15248));
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(Opcodes.INVOKE_POLYMORPHIC));
        C9921 c9921M15231 = C9921.m15231(clsM12425);
        Class cls2 = Boolean.TYPE;
        c9921M15231.f25828 = cls2;
        c9921M15231.m15234(cls2);
        m12390((Method) c9921M15231.m15164(), new C7092(20));
        C9931 c9931 = new C9931();
        c9931.f25866.addAll(Arrays.asList(AbstractC9234.m14531(Opcodes.INVOKE_POLYMORPHIC_RANGE)));
        c9931.m15254(AbstractC9234.m14531(Opcodes.INVOKE_CUSTOM), AbstractC9234.m14531(Opcodes.INVOKE_CUSTOM_RANGE));
        Class clsM15255 = c9931.m15255();
        C9927 c99273 = new C9927();
        c99273.f25840 = clsM12425;
        c99273.m15246(AbstractC9234.m14531(Opcodes.CONST_METHOD_HANDLE));
        Method methodM152482 = c99273.m15248();
        C9927 c99274 = new C9927();
        c99274.f25840 = clsM12425;
        c99274.m15246(AbstractC9234.m14531(Opcodes.CONST_METHOD_TYPE));
        Method methodM152483 = c99274.m15248();
        C9921 c9921M152312 = C9921.m15231(clsM15255);
        c9921M152312.f25826 = AbstractC9234.m14531(73);
        c9921M152312.f25828 = cls;
        c9921M152312.m15234(Bundle.class);
        m12389((Method) c9921M152312.m15164(), new C3163(this, clsM12425, methodM152482, methodM152483));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(259);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
    }
}
