package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements in0 {

    /* JADX INFO: renamed from: i */
    public static final gg1 f3504i = new gg1(0);

    /* JADX INFO: renamed from: j */
    public static final gg1 f3505j = new gg1(1);

    /* JADX INFO: renamed from: k */
    public static final gg1 f3506k = new gg1(2);

    /* JADX INFO: renamed from: l */
    public static final gg1 f3507l = new gg1(3);

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3508h;

    public /* synthetic */ gg1(int i) {
        this.f3508h = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        wf1 bh0Var;
        wf1 bh0Var2;
        wf1 bh0Var3;
        switch (this.f3508h) {
            case 0:
                wf1 wf1Var = (wf1) obj;
                C0067bt c0067btM967a = d72.m967a(bh0.class);
                if (c0067btM967a.equals(d72.m967a(gi0.class))) {
                    bh0Var = new gi0(wf1Var.mo534b());
                } else if (c0067btM967a.equals(d72.m967a(rg1.class))) {
                    bh0Var = new rg1(wf1Var.mo534b());
                } else {
                    if (!c0067btM967a.equals(d72.m967a(bh0.class))) {
                        C0676s.m4652k("Unsupported accessor type: ", d72.m967a(bh0.class));
                        return null;
                    }
                    bh0Var = new bh0(wf1Var.mo534b());
                }
                return (bh0) bh0Var;
            case 1:
                wf1 wf1Var2 = (wf1) obj;
                C0067bt c0067btM967a2 = d72.m967a(gi0.class);
                if (c0067btM967a2.equals(d72.m967a(gi0.class))) {
                    bh0Var2 = new gi0(wf1Var2.mo534b());
                } else if (c0067btM967a2.equals(d72.m967a(rg1.class))) {
                    bh0Var2 = new rg1(wf1Var2.mo534b());
                } else {
                    if (!c0067btM967a2.equals(d72.m967a(bh0.class))) {
                        C0676s.m4652k("Unsupported accessor type: ", d72.m967a(gi0.class));
                        return null;
                    }
                    bh0Var2 = new bh0(wf1Var2.mo534b());
                }
                return (gi0) bh0Var2;
            case 2:
                wf1 wf1Var3 = (wf1) obj;
                C0067bt c0067btM967a3 = d72.m967a(rg1.class);
                if (c0067btM967a3.equals(d72.m967a(gi0.class))) {
                    bh0Var3 = new gi0(wf1Var3.mo534b());
                } else if (c0067btM967a3.equals(d72.m967a(rg1.class))) {
                    bh0Var3 = new rg1(wf1Var3.mo534b());
                } else {
                    if (!c0067btM967a3.equals(d72.m967a(bh0.class))) {
                        C0676s.m4652k("Unsupported accessor type: ", d72.m967a(rg1.class));
                        return null;
                    }
                    bh0Var3 = new bh0(wf1Var3.mo534b());
                }
                return (rg1) bh0Var3;
            default:
                if (t11.m5086l(obj, Boolean.FALSE)) {
                    return new C0363ju(C0363ju.f5217g);
                }
                obj.getClass();
                return new C0363ju(sp0.m4930b(((Integer) obj).intValue()));
        }
    }
}
