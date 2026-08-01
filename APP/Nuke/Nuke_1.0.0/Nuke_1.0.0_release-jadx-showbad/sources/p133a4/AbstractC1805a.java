package p133a4;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1805a {

    /* JADX INFO: renamed from: a */
    public final String f6148a;

    /* JADX INFO: renamed from: b */
    public final boolean f6149b;

    /* JADX INFO: renamed from: c */
    public C1807c f6150c;

    /* JADX INFO: renamed from: d */
    public long f6151d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1805a(String str) {
        AbstractC1665j.m2985e(str, "name");
        this.f6148a = str;
        this.f6149b = true;
        this.f6151d = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo3274a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f6148a;
    }
}
