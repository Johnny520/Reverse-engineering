package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class la3 extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ gu0[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la3(gu0[] gu0VarArr, int i) {
        super(2);
        this.i = i;
        this.j = gu0VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        gu0[] gu0VarArr = this.j;
        switch (i) {
            case 0:
                return Float.valueOf(tl.d((rz1) obj, true, gu0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(tl.d((rz1) obj, false, gu0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
