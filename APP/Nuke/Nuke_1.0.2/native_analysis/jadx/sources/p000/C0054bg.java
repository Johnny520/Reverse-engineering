package p000;

/* JADX INFO: renamed from: bg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0054bg extends rb1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0054bg(yo2 yo2Var, int i) {
        super(yo2Var);
        this.f839b = i;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        switch (this.f839b) {
            case 0:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
