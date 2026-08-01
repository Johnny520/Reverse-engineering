package p056;

import kotlin.InterfaceC5183;
import p087.AbstractC7143;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p088.AbstractC7175;
import p088.C7170;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6680 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6680 f18095;

    static {
        C6680 c6680 = new C6680();
        f18095 = c6680;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.JSONRPCRequest", c6680, 4);
        c7128.m12382("id", true);
        c7128.m12382("method", false);
        c7128.m12382("params", true);
        c7128.m12382("jsonrpc", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7134 c7134 = C7134.f19094;
        return new InterfaceC7183[]{C6677.f18085[0].getValue(), c7134, C7170.f19144, c7134};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6677.f18085;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6835 interfaceC6835 = null;
        String strMo6878 = null;
        AbstractC7175 abstractC7175 = null;
        String strMo68782 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                interfaceC6835 = (InterfaceC6835) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), interfaceC6835);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                abstractC7175 = (AbstractC7175) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7170.f19144, abstractC7175);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 3);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6677(i, interfaceC6835, strMo6878, abstractC7175, strMo68782);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // p089.InterfaceC7183
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(p090.InterfaceC7185 r7, java.lang.Object r8) {
        /*
            r6 = this;
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰 r8 = (p056.C6677) r8
            r8.getClass()
            飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰哲子世 r6 = r8.f18089
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = p056.C6680.descriptor
            飘花落叶言世苏兰楪哲子.飘花落叶言子楪世苏兰哲 r7 = r7.mo6800(r0)
            kotlin.飘花落叶言子楪苏世哲兰[] r1 = p056.C6677.f18085
            boolean r2 = r7.mo10671(r0)
            if (r2 == 0) goto L16
            goto L2c
        L16:
            飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲 r2 = new 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲
            java.util.concurrent.atomic.AtomicLong r3 = p056.AbstractC6603.f17983
            r3.getClass()
            r4 = 1
            long r3 = r3.addAndGet(r4)
            r2.<init>(r3)
            boolean r2 = kotlin.jvm.internal.AbstractC4394.m8917(r6, r2)
            if (r2 != 0) goto L38
        L2c:
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r1 = (p089.InterfaceC7183) r1
            r7.mo6791(r0, r2, r1, r6)
        L38:
            java.lang.String r6 = r8.f18088
            java.lang.String r1 = r8.f18086
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏兰哲世 r8 = r8.f18087
            r2 = 1
            r7.mo6814(r0, r2, r6)
            boolean r6 = r7.mo10671(r0)
            if (r6 == 0) goto L49
            goto L51
        L49:
            飘花落叶言世苏兰哲楪子.飘花落叶言子世楪苏兰哲 r6 = p056.AbstractC6601.f17981
            boolean r6 = kotlin.jvm.internal.AbstractC4394.m8917(r8, r6)
            if (r6 != 0) goto L57
        L51:
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲苏世兰 r6 = p088.C7170.f19144
            r2 = 2
            r7.mo6791(r0, r2, r6, r8)
        L57:
            boolean r6 = r7.mo10671(r0)
            if (r6 == 0) goto L5e
            goto L66
        L5e:
            java.lang.String r6 = "2.0"
            boolean r6 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r6)
            if (r6 != 0) goto L6a
        L66:
            r6 = 3
            r7.mo6814(r0, r6, r1)
        L6a:
            r7.mo6801(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p056.C6680.serialize(飘花落叶言世苏兰楪哲子.飘花落叶言子楪世哲兰苏, java.lang.Object):void");
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
