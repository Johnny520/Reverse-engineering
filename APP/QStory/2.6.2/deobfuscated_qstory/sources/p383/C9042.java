package p383;

import com.bumptech.glide.AbstractC3056;
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
import p316.C8675;
import p347.C8857;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9042 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9042 f25340;

    static {
        C9042 c9042 = new C9042();
        f25340 = c9042;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.NewSyncPush", c9042, 5);
        c7128.m12382("type", true);
        int i = 2;
        c7128.m12381(new C8857(3, i));
        c7128.m12382("pushId", true);
        c7128.m12381(new C8857(4, i));
        c7128.m12382("syncContent", true);
        c7128.m12381(new C8857(7, i));
        c7128.m12382("syncRecallContent", true);
        c7128.m12381(new C8857(8, i));
        c7128.m12382("syncPushExtra", true);
        c7128.m12381(new C8857(9, i));
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7117 c7117 = C7117.f19059;
        InterfaceC7183 interfaceC7183M14355 = C8675.m14355(c7117);
        InterfaceC7183 interfaceC7183M143552 = C8675.m14355(C9035.f25331);
        InterfaceC7183 interfaceC7183M143553 = C8675.m14355(c7117);
        C7082 c7082 = C7082.f19002;
        return new InterfaceC7183[]{c7082, c7082, interfaceC7183M14355, interfaceC7183M143552, interfaceC7183M143553};
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
        byte[] bArr = null;
        C9037 c9037 = null;
        byte[] bArr2 = null;
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
                bArr = (byte[]) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C7117.f19059, bArr);
                i |= 4;
            } else if (iMo10672 == 3) {
                c9037 = (C9037) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C9035.f25331, c9037);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                bArr2 = (byte[]) interfaceC7188Mo6876.mo6875(interfaceC7190, 4, C7117.f19059, bArr2);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9029(i, iMo6872, iMo68722, bArr, c9037, bArr2);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9029 c9029 = (C9029) obj;
        "encoder";
        "value";
        c9029.getClass();
        byte[] bArr = c9029.f25324;
        C9037 c9037 = c9029.f25325;
        byte[] bArr2 = c9029.f25326;
        int i = c9029.f25327;
        int i2 = c9029.f25328;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i2 != 0) {
            interfaceC7187Mo6800.mo6805(0, i2, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(1, i, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || bArr2 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C7117.f19059, bArr2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9037 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C9035.f25331, c9037);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || bArr != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 4, C7117.f19059, bArr);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
