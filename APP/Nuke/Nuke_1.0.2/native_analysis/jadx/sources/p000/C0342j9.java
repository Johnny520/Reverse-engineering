package p000;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0342j9 extends yn0 implements in0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ m91 f4922o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342j9(m91 m91Var) {
        super(1, s11.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f4922o = m91Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        float[] fArr = ((hf1) obj).f3992a;
        c61 c61Var = (c61) this.f4922o.f6524y.getValue();
        if (c61Var != null) {
            if (!c61Var.mo653w()) {
                c61Var = null;
            }
            if (c61Var != null) {
                c61Var.mo641C(fArr);
            }
        }
        return a83.f116a;
    }
}
