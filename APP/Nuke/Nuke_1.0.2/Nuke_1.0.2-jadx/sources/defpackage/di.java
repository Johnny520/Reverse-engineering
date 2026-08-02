package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class di {
    public static final ci Companion = new ci();
    public static final j71[] f;
    public final long a;
    public final boolean b;
    public final Set c;
    public final Set d;
    public final gi e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c0 c0Var = new c0(9);
        i91 i91Var = i91.h;
        f = new j71[]{null, null, p7.B(i91Var, c0Var), p7.B(i91Var, new c0(10)), null};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ di(int i, long j, boolean z, Set set, Set set2, gi giVar) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        int i2 = i & 4;
        fe0 fe0Var = fe0.h;
        if (i2 == 0) {
            this.c = fe0Var;
        } else {
            this.c = set;
        }
        if ((i & 8) == 0) {
            this.d = fe0Var;
        } else {
            this.d = set2;
        }
        if ((i & 16) == 0) {
            this.e = new gi();
        } else {
            this.e = giVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return this.a == diVar.a && this.b == diVar.b && t11.l(this.c, diVar.c) && t11.l(this.d, diVar.d) && t11.l(this.e, diVar.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + hk1.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AutoReceiveTransferMoneyConf(waitTime=" + this.a + ", useWhitelist=" + this.b + ", whitelist=" + this.c + ", blacklist=" + this.d + ", autoReplyConf=" + this.e + ")";
    }

    public di(long j, boolean z, Set set, Set set2, gi giVar) {
        set.getClass();
        set2.getClass();
        giVar.getClass();
        this.a = j;
        this.b = z;
        this.c = set;
        this.d = set2;
        this.e = giVar;
    }

    public /* synthetic */ di() {
        gi giVar = new gi();
        fe0 fe0Var = fe0.h;
        this(0L, false, fe0Var, fe0Var, giVar);
    }
}
