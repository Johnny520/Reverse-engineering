package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sx extends ox {
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sx(dk dkVar, boolean z) {
        super(dkVar);
        this.j = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void d(byte b) {
        if (this.j) {
            i(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((dk) this.i).w(strValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void f(int i) {
        boolean z = this.j;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            i(unsignedString);
        } else {
            unsignedString.getClass();
            ((dk) this.i).w(unsignedString);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void g(long j) {
        boolean z = this.j;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            i(unsignedString);
        } else {
            unsignedString.getClass();
            ((dk) this.i).w(unsignedString);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void h(short s) {
        if (this.j) {
            i(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((dk) this.i).w(strValueOf);
    }
}
