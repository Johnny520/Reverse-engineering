package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ch {
    public static final bh Companion = new bh();
    public static final j71[] g;
    public final long a;
    public final int b;
    public final boolean c;
    public final Set d;
    public final Set e;
    public final fh f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c0 c0Var = new c0(6);
        i91 i91Var = i91.h;
        g = new j71[]{null, null, null, p7.B(i91Var, c0Var), p7.B(i91Var, new c0(7)), null};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ch(int i, long j, int i2, boolean z, Set set, Set set2, fh fhVar) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        int i3 = i & 8;
        fe0 fe0Var = fe0.h;
        if (i3 == 0) {
            this.d = fe0Var;
        } else {
            this.d = set;
        }
        if ((i & 16) == 0) {
            this.e = fe0Var;
        } else {
            this.e = set2;
        }
        if ((i & 32) == 0) {
            this.f = new fh();
        } else {
            this.f = fhVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return this.a == chVar.a && this.b == chVar.b && this.c == chVar.c && t11.l(this.d, chVar.d) && t11.l(this.e, chVar.e) && t11.l(this.f, chVar.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + hk1.d(vi0.d(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AutoReceiveRedPacketConf(waitTime=" + this.a + ", receiveMode=" + this.b + ", useWhitelist=" + this.c + ", whitelist=" + this.d + ", blacklist=" + this.e + ", autoReplyConf=" + this.f + ")";
    }

    public ch(long j, int i, boolean z, Set set, Set set2, fh fhVar) {
        set.getClass();
        set2.getClass();
        fhVar.getClass();
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = set;
        this.e = set2;
        this.f = fhVar;
    }

    public /* synthetic */ ch() {
        fh fhVar = new fh();
        fe0 fe0Var = fe0.h;
        this(0L, 1, false, fe0Var, fe0Var, fhVar);
    }
}
