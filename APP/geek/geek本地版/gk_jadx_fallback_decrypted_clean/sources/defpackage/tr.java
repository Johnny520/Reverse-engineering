package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr {
    public final android.os.LocaleList a;

    public tr(android.os.LocaleList r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            tr r2 = (defpackage.tr) r2
            android.os.LocaleList r2 = r2.a
            android.os.LocaleList r0 = r1.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
