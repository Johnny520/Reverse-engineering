package yyds;

import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᛴᛵᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0864 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final InterfaceC0732 f3963 = AbstractC1090.m2298(C0864.class);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f3964;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f3965;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0989 f3966;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final HashMap f3967;

    public C0864(Object obj, Object obj2, C0989 c0989, HashMap map) {
        this.f3964 = obj;
        this.f3965 = obj2;
        this.f3966 = c0989;
        this.f3967 = map;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m1957(C2623 c2623) {
        boolean z = c2623.f12910;
        C0989 c0989 = this.f3966;
        Object obj = this.f3965;
        if (!z) {
            return c2623.m4740(this.f3964, obj, c0989).m3505(true);
        }
        HashMap map = this.f3967;
        if (!map.containsKey(c2623)) {
            Object objM3505 = c2623.m4740(obj, obj, c0989).m3505(true);
            map.put(c2623, objM3505);
            return objM3505;
        }
        f3963.mo1687("Using cached result for root path: " + c2623.f12909.toString());
        return map.get(c2623);
    }
}
