package p264s0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p024b9.AbstractC1061t;
import p275t0.AbstractC7963h0;

/* JADX INFO: renamed from: s0.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6722f2 implements InterfaceC6706e2 {

    /* JADX INFO: renamed from: a */
    public final String f21255a;

    /* JADX INFO: renamed from: b */
    public final String f21256b;

    /* JADX INFO: renamed from: c */
    public final String f21257c;

    /* JADX INFO: renamed from: d */
    public final Map f21258d = new LinkedHashMap();

    public C6722f2(String str, String str2, String str3) {
        this.f21255a = str;
        this.f21256b = str2;
        this.f21257c = str3;
    }

    @Override // p264s0.InterfaceC6706e2
    /* JADX INFO: renamed from: b */
    public String mo26646b(Long l10, Locale locale, boolean z10) {
        if (l10 == null) {
            return null;
        }
        return AbstractC7963h0.m30732b(l10.longValue(), z10 ? this.f21257c : this.f21256b, locale, this.f21258d);
    }

    @Override // p264s0.InterfaceC6706e2
    /* JADX INFO: renamed from: c */
    public String mo26647c(Long l10, Locale locale) {
        if (l10 == null) {
            return null;
        }
        return AbstractC7963h0.m30732b(l10.longValue(), this.f21255a, locale, this.f21258d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6722f2)) {
            return false;
        }
        C6722f2 c6722f2 = (C6722f2) obj;
        return AbstractC1061t.m3842c(this.f21255a, c6722f2.f21255a) && AbstractC1061t.m3842c(this.f21256b, c6722f2.f21256b) && AbstractC1061t.m3842c(this.f21257c, c6722f2.f21257c);
    }

    public int hashCode() {
        return (((this.f21255a.hashCode() * 31) + this.f21256b.hashCode()) * 31) + this.f21257c.hashCode();
    }
}
