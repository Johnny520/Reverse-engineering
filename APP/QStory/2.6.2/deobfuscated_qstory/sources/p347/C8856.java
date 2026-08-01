package p347;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.C7082;
import p087.C7117;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8856 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8856 f24966;

    static {
        C8856 c8856 = new C8856();
        f24966 = c8856;
        C7128 c7128 = new C7128("top.suzhelan.qstory.hook.service.proto.OIDBSSOPkg", c8856, 5);
        c7128.m12382("command", true);
        int i = 0;
        c7128.m12381(new C8857(1, i));
        c7128.m12382("serviceType", true);
        c7128.m12381(new C8857(2, i));
        c7128.m12382("result", true);
        c7128.m12381(new C8857(3, i));
        c7128.m12382("bodybuffer", true);
        c7128.m12381(new C8857(4, i));
        c7128.m12382("errorCode", true);
        c7128.m12381(new C8857(12, i));
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7082 c7082 = C7082.f19002;
        return new InterfaceC7183[]{c7082, c7082, c7082, C7117.f19059, c7082};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        int iMo6872 = 0;
        int iMo68722 = 0;
        int iMo68723 = 0;
        int iMo68724 = 0;
        byte[] bArr = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                iMo68722 = interfaceC7188Mo6876.mo6872(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                iMo68723 = interfaceC7188Mo6876.mo6872(interfaceC7190, 2);
                i |= 4;
            } else if (iMo10672 == 3) {
                bArr = (byte[]) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, C7117.f19059, bArr);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                iMo68724 = interfaceC7188Mo6876.mo6872(interfaceC7190, 4);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C8854(bArr, i, iMo6872, iMo68722, iMo68723, iMo68724);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C8854 c8854 = (C8854) obj;
        "encoder";
        "value";
        c8854.getClass();
        int i = c8854.f24961;
        byte[] bArr = c8854.f24962;
        int i2 = c8854.f24963;
        int i3 = c8854.f24964;
        int i4 = c8854.f24965;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i4 != 0) {
            interfaceC7187Mo6800.mo6805(0, i4, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i3 != 0) {
            interfaceC7187Mo6800.mo6805(1, i3, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i2 != 0) {
            interfaceC7187Mo6800.mo6805(2, i2, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(bArr, new byte[0])) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C7117.f19059, bArr);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(4, i, interfaceC7190);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
