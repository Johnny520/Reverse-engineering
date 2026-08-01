package bsh;

/* JADX INFO: renamed from: bsh.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1232p extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: A */
    public boolean f3731A;

    /* JADX INFO: renamed from: B */
    public boolean f3732B;

    /* JADX INFO: renamed from: C */
    public String f3733C;

    /* JADX INFO: renamed from: y */
    public final int f3734y;

    /* JADX INFO: renamed from: z */
    public boolean f3735z;

    public C1232p(int i10) {
        super(i10);
        this.f3734y = C1257t0.f3810O.incrementAndGet();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        InterfaceC1188h3 interfaceC1188h3Mo4051s;
        int i10;
        InterfaceC1188h3 interfaceC1188h3Mo4051s2;
        int i11;
        InterfaceC1188h3 interfaceC1188h3Mo4051s3;
        String str;
        int i12 = 0;
        if (this.f3735z) {
            interfaceC1188h3Mo4051s = mo4051s(0);
            i12 = 1;
        } else {
            interfaceC1188h3Mo4051s = null;
        }
        if (this.f3731A) {
            i10 = i12 + 1;
            interfaceC1188h3Mo4051s2 = mo4051s(i12);
        } else {
            i10 = i12;
            interfaceC1188h3Mo4051s2 = null;
        }
        if (this.f3732B) {
            i11 = i10 + 1;
            interfaceC1188h3Mo4051s3 = mo4051s(i10);
        } else {
            i11 = i10;
            interfaceC1188h3Mo4051s3 = null;
        }
        InterfaceC1188h3 interfaceC1188h3Mo4051s4 = i11 < mo4050r() ? mo4051s(i11) : null;
        C1182g3 c1182g3M4319h = c1174f1.m4319h();
        c1174f1.m4318g(new C1257t0(c1182g3M4319h, this.f3734y));
        try {
            if (this.f3735z) {
                interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
            }
            while (!Thread.interrupted() && (!this.f3731A || C1250s.m5081k(interfaceC1188h3Mo4051s2, c1174f1, runnableC1205k2))) {
                if (interfaceC1188h3Mo4051s4 != null) {
                    Object objM4439k = interfaceC1188h3Mo4051s4 instanceof C1196j ? ((C1196j) interfaceC1188h3Mo4051s4).m4439k(c1174f1, runnableC1205k2, null) : interfaceC1188h3Mo4051s4.mo4048p(c1174f1, runnableC1205k2);
                    if (objM4439k instanceof C1171e4) {
                        C1171e4 c1171e4 = (C1171e4) objM4439k;
                        String str2 = c1171e4.f3542r;
                        if (str2 != null && ((str = this.f3733C) == null || !str.equals(str2))) {
                            c1174f1.m4318g(c1182g3M4319h);
                            return objM4439k;
                        }
                        int i13 = c1171e4.f3541q;
                        if (i13 != 47) {
                            if (i13 == 13) {
                                break;
                            }
                        } else {
                            c1174f1.m4318g(c1182g3M4319h);
                            return objM4439k;
                        }
                    }
                }
                if (this.f3732B) {
                    interfaceC1188h3Mo4051s3.mo4048p(c1174f1, runnableC1205k2);
                }
            }
            Primitive primitive = Primitive.VOID;
            c1174f1.m4318g(c1182g3M4319h);
            return primitive;
        } catch (Throwable th) {
            c1174f1.m4318g(c1182g3M4319h);
            throw th;
        }
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3733C + ": " + this.f3735z + " ; " + this.f3731A + " ; " + this.f3732B;
    }
}
