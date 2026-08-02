package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ dw i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qv(dw dwVar, int i) {
        this.h = i;
        this.i = dwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.h;
        dw dwVar = this.i;
        switch (i) {
            case 0:
                dw.d(dwVar);
                break;
            default:
                dwVar.invalidateMenu();
                break;
        }
    }
}
