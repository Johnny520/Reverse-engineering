package p116;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.layout.C0640;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import java.util.Arrays;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p089.C7180;
import p175.AbstractC7739;
import top.suzhelan.qstory.ui.components.C5967;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4871 f19573;

    static {
        int i = 13;
        f19573 = new C4871(new C5967((byte) 0, 5), i, new C7180(2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m12538(Object[] objArr, InterfaceC7346 interfaceC7346, InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, int i) {
        return m12539(Arrays.copyOf(objArr, objArr.length), interfaceC7346, interfaceC6543, interfaceC1373, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m12539(Object[] objArr, InterfaceC7346 interfaceC7346, InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, int i) {
        Object[] objArr2;
        InterfaceC7346 interfaceC73462;
        final Object obj;
        Object objMo1483;
        C1324 c1324 = (C1324) interfaceC1373;
        long j = c1324.f3837;
        AbstractC7739.m13083(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        interfaceC7346.getClass();
        final InterfaceC7345 interfaceC7345 = (InterfaceC7345) c1324.m2383(AbstractC7348.f19574);
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (objM2345 == c1353) {
            Object objMo3760 = (interfaceC7345 == null || (objMo1483 = interfaceC7345.mo1483(string)) == null) ? null : interfaceC7346.mo3760(objMo1483);
            if (objMo3760 == null) {
                objMo3760 = interfaceC6543.invoke();
            }
            objArr2 = objArr;
            interfaceC73462 = interfaceC7346;
            C7341 c7341 = new C7341(interfaceC73462, interfaceC7345, string, objMo3760, objArr2);
            c1324.m2386(c7341);
            objM2345 = c7341;
        } else {
            objArr2 = objArr;
            interfaceC73462 = interfaceC7346;
        }
        final C7341 c73412 = (C7341) objM2345;
        Object objInvoke = Arrays.equals(objArr2, c73412.f19555) ? c73412.f19556 : null;
        if (objInvoke == null) {
            objInvoke = interfaceC6543.invoke();
        }
        boolean zM2378 = c1324.m2378(c73412) | ((((i & 112) ^ 48) > 32 && c1324.m2378(interfaceC73462)) || (i & 48) == 32) | c1324.m2378(interfaceC7345) | c1324.m2360(string) | c1324.m2378(objInvoke) | c1324.m2378(objArr2);
        Object objM23452 = c1324.m2345();
        if (zM2378 || objM23452 == c1353) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final InterfaceC7346 interfaceC73463 = interfaceC73462;
            InterfaceC6543 interfaceC65432 = new InterfaceC6543() { // from class: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏哲兰
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    boolean z;
                    C7341 c73413 = c73412;
                    InterfaceC7345 interfaceC73452 = c73413.f19559;
                    InterfaceC7345 interfaceC73453 = interfaceC7345;
                    boolean z2 = true;
                    if (interfaceC73452 != interfaceC73453) {
                        c73413.f19559 = interfaceC73453;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = c73413.f19560;
                    String str2 = string;
                    if (AbstractC4395.m8907(str, str2)) {
                        z2 = z;
                    } else {
                        c73413.f19560 = str2;
                    }
                    c73413.f19561 = interfaceC73463;
                    c73413.f19556 = obj;
                    c73413.f19555 = objArr3;
                    InterfaceC7338 interfaceC7338 = c73413.f19557;
                    if (interfaceC7338 != null && z2) {
                        ((C0108) interfaceC7338).m403();
                        c73413.f19557 = null;
                        c73413.m12537();
                    }
                    return C5176.f14739;
                }
            };
            c1324.m2386(interfaceC65432);
            objM23452 = interfaceC65432;
        } else {
            obj = objInvoke;
        }
        AbstractC1367.m2502((InterfaceC6543) objM23452, c1324);
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4871 m12540(InterfaceC6554 interfaceC6554, InterfaceC6558 interfaceC6558) {
        C0640 c0640 = new C0640(interfaceC6554, 15);
        AbstractC4388.m8888(1, interfaceC6558);
        return new C4871(c0640, 13, interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m12541(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }
}
