package p004a3;

import android.graphics.Typeface;
import p004a3.C0052p;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: a3.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0031b0 implements InterfaceC0062z {
    @Override // p004a3.InterfaceC0062z
    /* JADX INFO: renamed from: a */
    public Typeface mo132a(C0054r c0054r, int i10) {
        return m134c(null, c0054r, i10);
    }

    @Override // p004a3.InterfaceC0062z
    /* JADX INFO: renamed from: b */
    public Typeface mo133b(C0058v c0058v, C0054r c0054r, int i10) {
        return m134c(c0058v.m213d(), c0054r, i10);
    }

    /* JADX INFO: renamed from: c */
    public final Typeface m134c(String str, C0054r c0054r, int i10) {
        C0052p.a aVar = C0052p.f99b;
        if (C0052p.m173f(i10, aVar.m178b()) && AbstractC1061t.m3842c(c0054r, C0054r.f120r.m207e()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c0054r.m202m(), C0052p.m173f(i10, aVar.m177a()));
    }
}
