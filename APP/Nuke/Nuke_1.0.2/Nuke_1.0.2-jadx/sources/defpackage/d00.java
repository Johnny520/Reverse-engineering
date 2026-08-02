package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {
    public final qm a;
    public final mp b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d00(qm qmVar, mp mpVar) {
        this.a = qmVar;
        this.b = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        mp mpVar = this.b;
        if (mpVar.l.o(f20.i) != null) {
            c80.g();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        xe1.j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(mpVar);
        sb.append(')');
        return sb.toString();
    }
}
