package p275t0;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: t0.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7991p0 {

    /* JADX INFO: renamed from: a */
    public final String f26567a;

    /* JADX INFO: renamed from: b */
    public final char f26568b;

    /* JADX INFO: renamed from: c */
    public final String f26569c;

    public C7991p0(String str, char c10) {
        this.f26567a = str;
        this.f26568b = c10;
        this.f26569c = AbstractC8611a0.m33069N(str, String.valueOf(c10), _UrlKt.FRAGMENT_ENCODE_SET, false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final char m30766a() {
        return this.f26568b;
    }

    /* JADX INFO: renamed from: b */
    public final String m30767b() {
        return this.f26567a;
    }

    /* JADX INFO: renamed from: c */
    public final String m30768c() {
        return this.f26569c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7991p0)) {
            return false;
        }
        C7991p0 c7991p0 = (C7991p0) obj;
        return AbstractC1061t.m3842c(this.f26567a, c7991p0.f26567a) && this.f26568b == c7991p0.f26568b;
    }

    public int hashCode() {
        return (this.f26567a.hashCode() * 31) + Character.hashCode(this.f26568b);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f26567a + ", delimiter=" + this.f26568b + ')';
    }
}
