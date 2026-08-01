package p383;

import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.InterfaceC5183;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9004 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9004 f25295;

    static {
        C9004 c9004 = new C9004();
        f25295 = c9004;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937711748900193703L), c9004, 1);
        AbstractC9032.m14589(-3937711465432352167L, c7128, true, 2);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C9060.f25366[0].getValue()};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9060.f25366;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else {
                if (iMo10672 != 0) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
                i = 1;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9060(i, list);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9060 c9060 = (C9060) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9060.getClass();
        List list = c9060.f25367;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9060.f25366;
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(list, EmptyList.INSTANCE)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), list);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
