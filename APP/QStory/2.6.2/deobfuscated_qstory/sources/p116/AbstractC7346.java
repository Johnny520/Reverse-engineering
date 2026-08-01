package p116;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.layout.C0640;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p089.C7179;
import top.suzhelan.qstory.ui.components.C5961;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7346 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4870 f19578;

    static {
        int i = 13;
        f19578 = new C4870(new C5961((byte) 0, 5), i, new C7179(2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m12511(Object[] objArr, InterfaceC7345 interfaceC7345, InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, int i) {
        return m12512(Arrays.copyOf(objArr, objArr.length), interfaceC7345, interfaceC6542, interfaceC1373, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m12512(Object[] objArr, InterfaceC7345 interfaceC7345, InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, int i) {
        Object[] objArr2;
        InterfaceC7345 interfaceC73452;
        final Object obj;
        Object objMo1473;
        C1324 c1324 = (C1324) interfaceC1373;
        long j = c1324.f3836;
        AbstractC3056.m6677(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        interfaceC7345.getClass();
        final InterfaceC7344 interfaceC7344 = (InterfaceC7344) c1324.m2373(AbstractC7347.f19579);
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            Object objMo3750 = (interfaceC7344 == null || (objMo1473 = interfaceC7344.mo1473(string)) == null) ? null : interfaceC7345.mo3750(objMo1473);
            if (objMo3750 == null) {
                objMo3750 = interfaceC6542.invoke();
            }
            objArr2 = objArr;
            interfaceC73452 = interfaceC7345;
            C7340 c7340 = new C7340(interfaceC73452, interfaceC7344, string, objMo3750, objArr2);
            c1324.m2376(c7340);
            objM2335 = c7340;
        } else {
            objArr2 = objArr;
            interfaceC73452 = interfaceC7345;
        }
        final C7340 c73402 = (C7340) objM2335;
        Object objInvoke = Arrays.equals(objArr2, c73402.f19560) ? c73402.f19561 : null;
        if (objInvoke == null) {
            objInvoke = interfaceC6542.invoke();
        }
        boolean zM2368 = c1324.m2368(c73402) | ((((i & 112) ^ 48) > 32 && c1324.m2368(interfaceC73452)) || (i & 48) == 32) | c1324.m2368(interfaceC7344) | c1324.m2350(string) | c1324.m2368(objInvoke) | c1324.m2368(objArr2);
        Object objM23352 = c1324.m2335();
        if (zM2368 || objM23352 == c1353) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final InterfaceC7345 interfaceC73453 = interfaceC73452;
            InterfaceC6542 interfaceC65422 = new InterfaceC6542() { // from class: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏哲兰
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    boolean z;
                    C7340 c73403 = c73402;
                    InterfaceC7344 interfaceC73442 = c73403.f19564;
                    InterfaceC7344 interfaceC73443 = interfaceC7344;
                    boolean z2 = true;
                    if (interfaceC73442 != interfaceC73443) {
                        c73403.f19564 = interfaceC73443;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = c73403.f19565;
                    String str2 = string;
                    if (AbstractC4394.m8917(str, str2)) {
                        z2 = z;
                    } else {
                        c73403.f19565 = str2;
                    }
                    c73403.f19566 = interfaceC73453;
                    c73403.f19561 = obj;
                    c73403.f19560 = objArr3;
                    InterfaceC7337 interfaceC7337 = c73403.f19562;
                    if (interfaceC7337 != null && z2) {
                        ((C0108) interfaceC7337).m402();
                        c73403.f19562 = null;
                        c73403.m12510();
                    }
                    return C5175.f14739;
                }
            };
            c1324.m2376(interfaceC65422);
            objM23352 = interfaceC65422;
        } else {
            obj = objInvoke;
        }
        AbstractC1367.m2492((InterfaceC6542) objM23352, c1324);
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4870 m12513(InterfaceC6553 interfaceC6553, InterfaceC6557 interfaceC6557) {
        C0640 c0640 = new C0640(interfaceC6553, 15);
        AbstractC4387.m8898(1, interfaceC6557);
        return new C4870(c0640, 13, interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m12514(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }
}
