package p275t0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: t0.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7951e0 {

    /* JADX INFO: renamed from: a */
    public final Locale f26505a;

    /* JADX INFO: renamed from: b */
    public final Map f26506b = new LinkedHashMap();

    public AbstractC7951e0(Locale locale) {
        this.f26505a = locale;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo30691a(long j10, String str, Locale locale);

    /* JADX INFO: renamed from: b */
    public abstract C7947d0 mo30692b(long j10);

    /* JADX INFO: renamed from: c */
    public abstract C7991p0 mo30693c(Locale locale);

    /* JADX INFO: renamed from: d */
    public abstract int mo30694d();

    /* JADX INFO: renamed from: e */
    public final Map m30695e() {
        return this.f26506b;
    }

    /* JADX INFO: renamed from: f */
    public final Locale m30696f() {
        return this.f26505a;
    }

    /* JADX INFO: renamed from: g */
    public abstract C7967i0 mo30697g(int i10, int i11);

    /* JADX INFO: renamed from: h */
    public abstract C7967i0 mo30698h(long j10);

    /* JADX INFO: renamed from: i */
    public abstract C7967i0 mo30699i(C7947d0 c7947d0);

    /* JADX INFO: renamed from: j */
    public abstract C7947d0 mo30700j();

    /* JADX INFO: renamed from: k */
    public abstract List mo30701k();

    /* JADX INFO: renamed from: l */
    public abstract C7947d0 mo30702l(String str, String str2, Locale locale);

    /* JADX INFO: renamed from: m */
    public abstract C7967i0 mo30703m(C7967i0 c7967i0, int i10);
}
