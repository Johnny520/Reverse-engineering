package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements in0 {
    public static final gg1 i = new gg1(0);
    public static final gg1 j = new gg1(1);
    public static final gg1 k = new gg1(2);
    public static final gg1 l = new gg1(3);
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [gg1.<clinit>():void] */
    public /* synthetic */ gg1(int i2) {
        this.h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        wf1 bh0Var;
        wf1 bh0Var2;
        wf1 bh0Var3;
        switch (this.h) {
            case 0:
                wf1 wf1Var = (wf1) obj;
                bt btVarA = d72.a(bh0.class);
                if (btVarA.equals(d72.a(gi0.class))) {
                    bh0Var = new gi0(wf1Var.b());
                } else if (btVarA.equals(d72.a(rg1.class))) {
                    bh0Var = new rg1(wf1Var.b());
                } else {
                    if (!btVarA.equals(d72.a(bh0.class))) {
                        s.k("Unsupported accessor type: ", d72.a(bh0.class));
                        return null;
                    }
                    bh0Var = new bh0(wf1Var.b());
                }
                return (bh0) bh0Var;
            case 1:
                wf1 wf1Var2 = (wf1) obj;
                bt btVarA2 = d72.a(gi0.class);
                if (btVarA2.equals(d72.a(gi0.class))) {
                    bh0Var2 = new gi0(wf1Var2.b());
                } else if (btVarA2.equals(d72.a(rg1.class))) {
                    bh0Var2 = new rg1(wf1Var2.b());
                } else {
                    if (!btVarA2.equals(d72.a(bh0.class))) {
                        s.k("Unsupported accessor type: ", d72.a(gi0.class));
                        return null;
                    }
                    bh0Var2 = new bh0(wf1Var2.b());
                }
                return (gi0) bh0Var2;
            case 2:
                wf1 wf1Var3 = (wf1) obj;
                bt btVarA3 = d72.a(rg1.class);
                if (btVarA3.equals(d72.a(gi0.class))) {
                    bh0Var3 = new gi0(wf1Var3.b());
                } else if (btVarA3.equals(d72.a(rg1.class))) {
                    bh0Var3 = new rg1(wf1Var3.b());
                } else {
                    if (!btVarA3.equals(d72.a(bh0.class))) {
                        s.k("Unsupported accessor type: ", d72.a(rg1.class));
                        return null;
                    }
                    bh0Var3 = new bh0(wf1Var3.b());
                }
                return (rg1) bh0Var3;
            default:
                if (t11.l(obj, Boolean.FALSE)) {
                    return new ju(ju.g);
                }
                obj.getClass();
                return new ju(sp0.b(((Integer) obj).intValue()));
        }
    }
}
