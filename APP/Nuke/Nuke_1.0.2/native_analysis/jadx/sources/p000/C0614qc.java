package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: qc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614qc extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public C0310id f8881l;

    /* JADX INFO: renamed from: m */
    public y62 f8882m;

    /* JADX INFO: renamed from: n */
    public int f8883n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0689sc f8884o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f8885p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ cy2 f8886q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long f8887r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ in0 f8888s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614qc(C0689sc c0689sc, Object obj, cy2 cy2Var, long j, in0 in0Var, t00 t00Var) {
        super(1, t00Var);
        this.f8884o = c0689sc;
        this.f8885p = obj;
        this.f8886q = cy2Var;
        this.f8887r = j;
        this.f8888s = in0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        long j = this.f8887r;
        in0 in0Var = this.f8888s;
        return new C0614qc(this.f8884o, this.f8885p, this.f8886q, j, in0Var, (t00) obj).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        C0689sc c0689sc;
        C0310id c0310id;
        y62 y62Var;
        long j;
        C0575pc c0575pc;
        C0310id c0310id2;
        y62 y62Var2;
        CancellationException cancellationException;
        cy2 cy2Var = this.f8886q;
        int i = this.f8883n;
        C0689sc c0689sc2 = this.f8884o;
        if (i == 0) {
            fg1.m1627T(obj);
            try {
                c0689sc2.f10024c.f4562j = (AbstractC0494nd) c0689sc2.f10022a.f7004a.mo5j(this.f8885p);
                c0689sc2.f10026e.setValue(cy2Var.f1779c);
                c0689sc2.f10025d.setValue(Boolean.TRUE);
                C0310id c0310id3 = c0689sc2.f10024c;
                c0310id = new C0310id(c0310id3.f4560h, c0310id3.f4561i.getValue(), t11.m5092r(c0310id3.f4562j), c0310id3.f4563k, Long.MIN_VALUE, c0310id3.f4565m);
                y62Var = new y62();
                j = this.f8887r;
                c0575pc = new C0575pc(c0689sc2, c0310id, this.f8888s, y62Var, 0);
                c0689sc = c0689sc2;
            } catch (CancellationException e) {
                e = e;
                c0689sc = c0689sc2;
                cancellationException = e;
                C0689sc.m4786b(c0689sc);
                throw cancellationException;
            }
            try {
                this.f8881l = c0310id;
                this.f8882m = y62Var;
                this.f8883n = 1;
                Object objM5222m = AbstractC0731te.m5222m(c0310id, cy2Var, j, c0575pc, this);
                k20 k20Var = k20.f5323h;
                if (objM5222m == k20Var) {
                    return k20Var;
                }
                c0310id2 = c0310id;
                y62Var2 = y62Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                C0689sc.m4786b(c0689sc);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y62Var2 = this.f8882m;
            c0310id2 = this.f8881l;
            try {
                fg1.m1627T(obj);
                c0689sc = c0689sc2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                c0689sc = c0689sc2;
                C0689sc.m4786b(c0689sc);
                throw cancellationException;
            }
        }
        EnumC0199fd enumC0199fd = y62Var2.f13324h ? EnumC0199fd.f2906h : EnumC0199fd.f2907i;
        C0689sc.m4786b(c0689sc);
        return new sz0(2, c0310id2, enumC0199fd);
    }
}
