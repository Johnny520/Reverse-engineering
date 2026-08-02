package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni1 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ fq i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ni1(fq fqVar, int i) {
        this.h = i;
        this.i = fqVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        fq fqVar = this.i;
        switch (i) {
            case 0:
                Object objM = fqVar.m();
                if (objM instanceof oq) {
                    objM = null;
                }
                return (oi1) objM;
            default:
                Object objM2 = fqVar.m();
                if (objM2 instanceof oq) {
                    objM2 = null;
                }
                return (b33) objM2;
        }
    }
}
