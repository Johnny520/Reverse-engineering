package p004a3;

import android.graphics.Typeface;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: a3.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033c0 implements InterfaceC0062z {
    @Override // p004a3.InterfaceC0062z
    /* JADX INFO: renamed from: a */
    public Typeface mo132a(C0054r c0054r, int i10) {
        return m136c(null, c0054r, i10);
    }

    @Override // p004a3.InterfaceC0062z
    /* JADX INFO: renamed from: b */
    public Typeface mo133b(C0058v c0058v, C0054r c0054r, int i10) {
        Typeface typefaceM137d = m137d(AbstractC0035d0.m142b(c0058v.m213d(), c0054r), c0054r, i10);
        return typefaceM137d == null ? m136c(c0058v.m213d(), c0054r, i10) : typefaceM137d;
    }

    /* JADX INFO: renamed from: c */
    public final Typeface m136c(String str, C0054r c0054r, int i10) {
        if (C0052p.m173f(i10, C0052p.f99b.m178b()) && AbstractC1061t.m3842c(c0054r, C0054r.f120r.m207e()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM140c = AbstractC0034d.m140c(c0054r, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM140c) : Typeface.create(str, iM140c);
    }

    /* JADX INFO: renamed from: d */
    public final Typeface m137d(String str, C0054r c0054r, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM136c = m136c(str, c0054r, i10);
        if (AbstractC1061t.m3842c(typefaceM136c, Typeface.create(Typeface.DEFAULT, AbstractC0034d.m140c(c0054r, i10))) || AbstractC1061t.m3842c(typefaceM136c, m136c(null, c0054r, i10))) {
            return null;
        }
        return typefaceM136c;
    }
}
