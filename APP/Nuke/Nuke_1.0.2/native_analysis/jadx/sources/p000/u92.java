package p000;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u92 implements Closeable {

    /* JADX INFO: renamed from: i */
    public static final t92 f11170i;

    /* JADX INFO: renamed from: h */
    public s92 f11171h;

    static {
        C0505no c0505no = C0505no.f7266k;
        c0505no.getClass();
        C0209fn c0209fn = new C0209fn();
        c0209fn.m1667B(c0505no);
        f11170i = new t92(null, c0505no.f7267h.length, c0209fn);
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m5476b() {
        return mo275g().mo1668C();
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo273c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ug3.m5494b(mo275g());
    }

    /* JADX INFO: renamed from: e */
    public abstract vf1 mo274e();

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC0549on mo275g();
}
