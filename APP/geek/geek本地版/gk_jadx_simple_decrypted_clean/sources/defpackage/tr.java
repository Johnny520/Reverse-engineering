package defpackage;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class tr {
    public final LocaleList a;

    public tr(LocaleList r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        LocaleList r22 = ((tr) r2).a;
        return this.a.equals(r22);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
