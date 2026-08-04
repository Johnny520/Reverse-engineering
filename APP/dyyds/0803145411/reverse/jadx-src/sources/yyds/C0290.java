package yyds;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛲᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0290 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2120 f1541 = C2120.m4039(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2014 f1542;

    public C0290(C2014 c2014) {
        this.f1542 = c2014;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        C0714 c0714 = (C0714) obj;
        C2499 c2499 = (C2499) this.f1542.f10074;
        C0745 c0745M1698 = C0745.m1698(c0714);
        Object objM4134 = c2499.m4134(c0745M1698);
        ArrayDeque arrayDeque = C0745.f3443;
        synchronized (arrayDeque) {
            arrayDeque.offer(c0745M1698);
        }
        C0714 c07142 = (C0714) objM4134;
        if (c07142 == null) {
            c2499.m4135(C0745.m1698(c0714), c0714);
        } else {
            c0714 = c07142;
        }
        return new C1199(c0714, new C1857(c0714, ((Integer) c0822.m1891(f1541)).intValue()));
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean mo941(Object obj) {
        return true;
    }
}
