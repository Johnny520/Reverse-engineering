package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3141i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ gu0[] f3142j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu0(gu0[] gu0VarArr, int i) {
        super(2);
        this.f3141i = i;
        this.f3142j = gu0VarArr;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3141i;
        gu0[] gu0VarArr = this.f3142j;
        switch (i) {
            case 0:
                return Float.valueOf(AbstractC0738tl.m5304d((rz1) obj, true, gu0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0738tl.m5304d((rz1) obj, false, gu0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
