package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w31 extends i41 {
    public final boolean h;
    public final String i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w31(Serializable serializable, boolean z) {
        serializable.getClass();
        this.h = z;
        this.i = serializable.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i41
    public final String a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i41
    public final boolean b() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w31.class != obj.getClass()) {
            return false;
        }
        w31 w31Var = (w31) obj;
        return this.h == w31Var.h && t11.l(this.i, w31Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode() + (Boolean.hashCode(this.h) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i41
    public final String toString() {
        boolean z = this.h;
        String str = this.i;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        mv2.a(sb, str);
        return sb.toString();
    }
}
