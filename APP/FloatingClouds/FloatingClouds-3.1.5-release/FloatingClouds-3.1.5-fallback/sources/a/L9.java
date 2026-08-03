package a;

/* JADX INFO: loaded from: classes.dex */
public final class L9 implements a.K9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.LocaleList f163a;

    public L9(android.os.LocaleList r1) {
            r0 = this;
            r0.<init>()
            r0.f163a = r1
            return
    }

    @Override // a.K9
    public final java.lang.Object a() {
            r1 = this;
            android.os.LocaleList r0 = r1.f163a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            a.K9 r2 = (a.K9) r2
            java.lang.Object r2 = r2.a()
            android.os.LocaleList r0 = r1.f163a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.f163a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.f163a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
