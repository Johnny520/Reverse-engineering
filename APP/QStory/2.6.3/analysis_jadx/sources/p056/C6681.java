package p056;

import kotlin.InterfaceC5184;
import p087.AbstractC7144;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p088.AbstractC7176;
import p088.C7171;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6681 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6681 f18090;

    static {
        C6681 c6681 = new C6681();
        f18090 = c6681;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.JSONRPCRequest", c6681, 4);
        c7129.m12409("id", true);
        c7129.m12409("method", false);
        c7129.m12409("params", true);
        c7129.m12409("jsonrpc", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7135 c7135 = C7135.f19089;
        return new InterfaceC7184[]{C6678.f18080[0].getValue(), c7135, C7171.f19139, c7135};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6678.f18080;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6836 interfaceC6836 = null;
        String strMo10686 = null;
        AbstractC7176 abstractC7176 = null;
        String strMo106862 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                interfaceC6836 = (InterfaceC6836) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), interfaceC6836);
                i |= 1;
            } else if (iMo10718 == 1) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                abstractC7176 = (AbstractC7176) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7171.f19139, abstractC7176);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                strMo106862 = interfaceC7189Mo10676.mo10686(interfaceC7191, 3);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6678(i, interfaceC6836, strMo10686, abstractC7176, strMo106862);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // p089.InterfaceC7184
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(p090.InterfaceC7186 r7, java.lang.Object r8) {
        /*
            r6 = this;
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰 r8 = (p056.C6678) r8
            r8.getClass()
            飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰哲子世 r6 = r8.f18084
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = p056.C6681.descriptor
            飘花落叶言世苏兰楪哲子.飘花落叶言子楪世苏兰哲 r7 = r7.mo10710(r0)
            kotlin.飘花落叶言子楪苏世哲兰[] r1 = p056.C6678.f18080
            boolean r2 = r7.mo10713(r0)
            if (r2 == 0) goto L16
            goto L2c
        L16:
            飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲 r2 = new 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲
            java.util.concurrent.atomic.AtomicLong r3 = p056.AbstractC6604.f17978
            r3.getClass()
            r4 = 1
            long r3 = r3.addAndGet(r4)
            r2.<init>(r3)
            boolean r2 = kotlin.jvm.internal.AbstractC4395.m8907(r6, r2)
            if (r2 != 0) goto L38
        L2c:
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r1 = (p089.InterfaceC7184) r1
            r7.mo10719(r0, r2, r1, r6)
        L38:
            java.lang.String r6 = r8.f18083
            java.lang.String r1 = r8.f18081
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏兰哲世 r8 = r8.f18082
            r2 = 1
            r7.mo10735(r0, r2, r6)
            boolean r6 = r7.mo10713(r0)
            if (r6 == 0) goto L49
            goto L51
        L49:
            飘花落叶言世苏兰哲楪子.飘花落叶言子世楪苏兰哲 r6 = p056.AbstractC6602.f17976
            boolean r6 = kotlin.jvm.internal.AbstractC4395.m8907(r8, r6)
            if (r6 != 0) goto L57
        L51:
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲苏世兰 r6 = p088.C7171.f19139
            r2 = 2
            r7.mo10719(r0, r2, r6, r8)
        L57:
            boolean r6 = r7.mo10713(r0)
            if (r6 == 0) goto L5e
            goto L66
        L5e:
            java.lang.String r6 = "2.0"
            boolean r6 = kotlin.jvm.internal.AbstractC4395.m8907(r1, r6)
            if (r6 != 0) goto L6a
        L66:
            r6 = 3
            r7.mo10735(r0, r6, r1)
        L6a:
            r7.mo10711(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p056.C6681.serialize(飘花落叶言世苏兰楪哲子.飘花落叶言子楪世哲兰苏, java.lang.Object):void");
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
