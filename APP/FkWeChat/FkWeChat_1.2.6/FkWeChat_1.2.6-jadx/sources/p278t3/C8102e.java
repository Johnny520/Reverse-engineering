package p278t3;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: t3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8102e {

    /* JADX INFO: renamed from: b */
    public static final C8102e f27045b = m31319a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final InterfaceC8103f f27046a;

    /* JADX INFO: renamed from: t3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocaleList m31322a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public C8102e(InterfaceC8103f interfaceC8103f) {
        this.f27046a = interfaceC8103f;
    }

    /* JADX INFO: renamed from: a */
    public static C8102e m31319a(Locale... localeArr) {
        return m31320c(a.m31322a(localeArr));
    }

    /* JADX INFO: renamed from: c */
    public static C8102e m31320c(LocaleList localeList) {
        return new C8102e(new C8104g(localeList));
    }

    /* JADX INFO: renamed from: b */
    public Locale m31321b(int i10) {
        return this.f27046a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8102e) && this.f27046a.equals(((C8102e) obj).f27046a);
    }

    public int hashCode() {
        return this.f27046a.hashCode();
    }

    public String toString() {
        return this.f27046a.toString();
    }
}
