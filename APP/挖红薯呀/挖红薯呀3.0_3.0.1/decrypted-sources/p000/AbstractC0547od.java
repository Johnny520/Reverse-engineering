package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: od */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0547od implements InterfaceC0334ix {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0618pk f4517d;

    /* JADX INFO: renamed from: e */
    public final int f4518e;

    /* JADX INFO: renamed from: f */
    public final EnumC0758tb f4519f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0296hu f4520g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0547od(InterfaceC0296hu interfaceC0296hu, InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb) {
        this.f4517d = interfaceC0618pk;
        this.f4518e = i;
        this.f4519f = enumC0758tb;
        this.f4520g = interfaceC0296hu;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0547od mo2874a(InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f4518e;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        InterfaceC0322ik interfaceC0322ik2 = null;
        na1 na1Var = na1.f4229a;
        if (i == -3) {
            InterfaceC0618pk interfaceC0618pkMo540e = interfaceC0322ik.mo540e();
            Boolean bool = Boolean.FALSE;
            C0717s8 c0717s8 = new C0717s8(12);
            InterfaceC0618pk interfaceC0618pk = this.f4517d;
            InterfaceC0618pk interfaceC0618pkMo63h = !((Boolean) interfaceC0618pk.mo65p(c0717s8, bool)).booleanValue() ? interfaceC0618pkMo540e.mo63h(interfaceC0618pk) : AbstractC0307i4.m1540p(interfaceC0618pkMo540e, interfaceC0618pk, false);
            if (p30.m3002l(interfaceC0618pkMo63h, interfaceC0618pkMo540e)) {
                Object objMo2876e = mo2876e(interfaceC0331iu, interfaceC0322ik);
                if (objMo2876e == enumC1007zk) {
                    return objMo2876e;
                }
            } else {
                C0496n2 c0496n2 = C0496n2.f4163w;
                if (p30.m3002l(interfaceC0618pkMo63h.mo64l(c0496n2), interfaceC0618pkMo540e.mo64l(c0496n2))) {
                    InterfaceC0618pk interfaceC0618pkMo540e2 = interfaceC0322ik.mo540e();
                    if (!(interfaceC0331iu instanceof o01) && !(interfaceC0331iu instanceof yj0)) {
                        interfaceC0331iu = new C0345j7(interfaceC0331iu, interfaceC0618pkMo540e2);
                    }
                    Object objM1913D = AbstractC0398kl.m1913D(interfaceC0618pkMo63h, interfaceC0331iu, s91.m4029P(interfaceC0618pkMo63h), new C0508nd(this, interfaceC0322ik2, 1), interfaceC0322ik);
                    if (objM1913D == enumC1007zk) {
                        return objM1913D;
                    }
                } else {
                    Object objM3013w = p30.m3013w(new C0302i(interfaceC0331iu, this, interfaceC0322ik2, 3), interfaceC0322ik);
                    if (objM3013w != enumC1007zk) {
                        objM3013w = na1Var;
                    }
                    if (objM3013w == enumC1007zk) {
                        return objM3013w;
                    }
                }
            }
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // p000.InterfaceC0334ix
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0296hu mo981c(InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb) {
        InterfaceC0618pk interfaceC0618pk2 = this.f4517d;
        InterfaceC0618pk interfaceC0618pkMo63h = interfaceC0618pk.mo63h(interfaceC0618pk2);
        EnumC0758tb enumC0758tb2 = EnumC0758tb.f5968d;
        EnumC0758tb enumC0758tb3 = this.f4519f;
        int i2 = this.f4518e;
        if (enumC0758tb == enumC0758tb2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            enumC0758tb = enumC0758tb3;
        }
        return (p30.m3002l(interfaceC0618pkMo63h, interfaceC0618pk2) && i == i2 && enumC0758tb == enumC0758tb3) ? this : mo2874a(interfaceC0618pkMo63h, i, enumC0758tb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public InterfaceC0296hu mo2875d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo2876e(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m2877f() {
        ArrayList arrayList = new ArrayList(4);
        C0220fs c0220fs = C0220fs.f1799d;
        InterfaceC0618pk interfaceC0618pk = this.f4517d;
        if (interfaceC0618pk != c0220fs) {
            arrayList.add("context=" + interfaceC0618pk);
        }
        int i = this.f4518e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC0758tb enumC0758tb = EnumC0758tb.f5968d;
        EnumC0758tb enumC0758tb2 = this.f4519f;
        if (enumC0758tb2 != enumC0758tb) {
            arrayList.add("onBufferOverflow=" + enumC0758tb2);
        }
        return getClass().getSimpleName() + '[' + AbstractC0960ye.m5245O(arrayList, ", ", null, null, null, 62) + ']';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4520g + " -> " + m2877f();
    }
}
