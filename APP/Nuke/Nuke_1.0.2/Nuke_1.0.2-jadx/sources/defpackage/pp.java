package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pp implements y10, z10 {
    public static final eb i = new eb(10);
    public static final pp j = new pp(1);
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [pp.<clinit>():void] */
    public /* synthetic */ pp(int i2) {
        this.h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y10
    public final z10 getKey() {
        switch (this.h) {
            case 0:
                return i;
            default:
                return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final /* bridge */ a20 k(a20 a20Var) {
        switch (this.h) {
        }
        return xe1.f0(this, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final /* bridge */ y10 o(z10 z10Var) {
        switch (this.h) {
        }
        return xe1.u(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        switch (this.h) {
        }
        return mn0Var.g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final /* bridge */ a20 u(z10 z10Var) {
        switch (this.h) {
        }
        return xe1.W(this, z10Var);
    }
}
