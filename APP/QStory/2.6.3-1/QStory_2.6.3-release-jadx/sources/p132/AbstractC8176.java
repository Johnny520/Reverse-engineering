package p132;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.layout.C1481;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import java.util.Arrays;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p105.C8009;
import p191.AbstractC8568;
import top.suzhelan.qstory.p015ui.components.C6797;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5703 f19918;

    static {
        int i = 13;
        f19918 = new C5703(new C6797((byte) 0, 5), i, new C8009(2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m13097(Object[] objArr, InterfaceC8175 interfaceC8175, InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, int i) {
        return m13098(Arrays.copyOf(objArr, objArr.length), interfaceC8175, interfaceC7372, interfaceC2208, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m13098(Object[] objArr, InterfaceC8175 interfaceC8175, InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, int i) {
        Object[] objArr2;
        InterfaceC8175 interfaceC81752;
        final Object obj;
        Object objMo2043;
        C2159 c2159 = (C2159) interfaceC2208;
        long j = c2159.f4182;
        AbstractC8568.m13642(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        interfaceC8175.getClass();
        final InterfaceC8174 interfaceC8174 = (InterfaceC8174) c2159.m2943(AbstractC8177.f19919);
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            Object objMo4320 = (interfaceC8174 == null || (objMo2043 = interfaceC8174.mo2043(string)) == null) ? null : interfaceC8175.mo4320(objMo2043);
            if (objMo4320 == null) {
                objMo4320 = interfaceC7372.invoke();
            }
            objArr2 = objArr;
            interfaceC81752 = interfaceC8175;
            C8170 c8170 = new C8170(interfaceC81752, interfaceC8174, string, objMo4320, objArr2);
            c2159.m2946(c8170);
            objM2905 = c8170;
        } else {
            objArr2 = objArr;
            interfaceC81752 = interfaceC8175;
        }
        final C8170 c81702 = (C8170) objM2905;
        Object objInvoke = Arrays.equals(objArr2, c81702.f19900) ? c81702.f19901 : null;
        if (objInvoke == null) {
            objInvoke = interfaceC7372.invoke();
        }
        boolean zM2938 = c2159.m2938(c81702) | ((((i & 112) ^ 48) > 32 && c2159.m2938(interfaceC81752)) || (i & 48) == 32) | c2159.m2938(interfaceC8174) | c2159.m2920(string) | c2159.m2938(objInvoke) | c2159.m2938(objArr2);
        Object objM29052 = c2159.m2905();
        if (zM2938 || objM29052 == c2188) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final InterfaceC8175 interfaceC81753 = interfaceC81752;
            InterfaceC7372 interfaceC73722 = new InterfaceC7372() { // from class: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏哲兰
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    boolean z;
                    C8170 c81703 = c81702;
                    InterfaceC8174 interfaceC81742 = c81703.f19904;
                    InterfaceC8174 interfaceC81743 = interfaceC8174;
                    boolean z2 = true;
                    if (interfaceC81742 != interfaceC81743) {
                        c81703.f19904 = interfaceC81743;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = c81703.f19905;
                    String str2 = string;
                    if (AbstractC5227.m9466(str, str2)) {
                        z2 = z;
                    } else {
                        c81703.f19905 = str2;
                    }
                    c81703.f19906 = interfaceC81753;
                    c81703.f19901 = obj;
                    c81703.f19900 = objArr3;
                    InterfaceC8167 interfaceC8167 = c81703.f19902;
                    if (interfaceC8167 != null && z2) {
                        ((C0955) interfaceC8167).m963();
                        c81703.f19902 = null;
                        c81703.m13096();
                    }
                    return C6008.f15084;
                }
            };
            c2159.m2946(interfaceC73722);
            objM29052 = interfaceC73722;
        } else {
            obj = objInvoke;
        }
        AbstractC2202.m3062((InterfaceC7372) objM29052, c2159);
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5703 m13099(InterfaceC7383 interfaceC7383, InterfaceC7387 interfaceC7387) {
        C1481 c1481 = new C1481(interfaceC7383, 15);
        AbstractC5220.m9447(1, interfaceC7387);
        return new C5703(c1481, 13, interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m13100(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }
}
