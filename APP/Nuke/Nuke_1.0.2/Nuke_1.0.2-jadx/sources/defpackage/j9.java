package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 extends yn0 implements in0 {
    public final /* synthetic */ m91 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(m91 m91Var) {
        super(1, s11.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.o = m91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        float[] fArr = ((hf1) obj).a;
        c61 c61Var = (c61) this.o.y.getValue();
        if (c61Var != null) {
            if (!c61Var.w()) {
                c61Var = null;
            }
            if (c61Var != null) {
                c61Var.C(fArr);
            }
        }
        return a83.a;
    }
}
