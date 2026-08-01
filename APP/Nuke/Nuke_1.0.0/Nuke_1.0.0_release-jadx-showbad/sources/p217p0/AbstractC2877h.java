package p217p0;

import p186k.AbstractC2429k;
import p186k.C2439u;

/* JADX INFO: renamed from: p0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2877h {

    /* JADX INFO: renamed from: a */
    public static final C2439u f9103a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2886q c2886q = C2873d.f9075e;
        int i5 = c2886q.f9070c;
        C2874e c2874e = new C2874e(c2886q, c2886q, 1);
        int i6 = c2886q.f9070c;
        C2881l c2881l = C2873d.f9094x;
        int i7 = (c2881l.f9070c << 6) | i6;
        C2876g c2876g = new C2876g(c2886q, c2881l, 0);
        int i8 = (i6 << 6) | c2881l.f9070c;
        C2876g c2876g2 = new C2876g(c2881l, c2886q, 0);
        C2439u c2439u = AbstractC2429k.f7850a;
        C2439u c2439u2 = new C2439u();
        c2439u2.m4344h(i5 | (i5 << 6), c2874e);
        c2439u2.m4344h(i7, c2876g);
        c2439u2.m4344h(i8, c2876g2);
        f9103a = c2439u2;
    }
}
