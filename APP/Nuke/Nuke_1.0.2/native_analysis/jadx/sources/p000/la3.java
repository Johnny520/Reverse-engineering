package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class la3 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6014i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ gu0[] f6015j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la3(gu0[] gu0VarArr, int i) {
        super(2);
        this.f6014i = i;
        this.f6015j = gu0VarArr;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6014i;
        gu0[] gu0VarArr = this.f6015j;
        switch (i) {
            case 0:
                return Float.valueOf(AbstractC0738tl.m5304d((rz1) obj, true, gu0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0738tl.m5304d((rz1) obj, false, gu0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
