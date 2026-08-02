package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class my extends e42 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public my(in0 in0Var) {
        super(new dy(1));
        this.c = new ny(in0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e42
    public final f42 a(Object obj) {
        switch (this.b) {
            case 0:
                return new f42(this, obj, obj == null, null, true);
            default:
                return new f42(this, obj, obj == null, (ks2) this.c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e42
    public m93 b() {
        switch (this.b) {
            case 0:
                return (ny) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(xm0 xm0Var) {
        super(xm0Var);
        sn snVar = sn.T;
        this.c = snVar;
    }
}
