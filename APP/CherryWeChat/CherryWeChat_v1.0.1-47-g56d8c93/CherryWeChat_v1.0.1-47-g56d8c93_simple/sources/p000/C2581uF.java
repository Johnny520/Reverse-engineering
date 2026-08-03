package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: uF */
/* JADX INFO: loaded from: classes.dex */
public final class C2581uF extends AbstractC2796zF {

    /* JADX INFO: renamed from: e */
    public static Field f8941e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f8942f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f8943g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f8944h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f8945c;

    /* JADX INFO: renamed from: d */
    public C2765yl f8946d;

    public C2581uF() {
        this.f8945c = m5083i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m5083i() {
        if (f8942f == false) goto L29;
    L6:
        Field r0 = f8941e;
        if (r0 == null) goto L13;
        WindowInsets r02 = (WindowInsets) r0.get(null);     // Catch: ReflectiveOperationException -> L21
        if (r02 == null) goto L13;
        return new WindowInsets(r02);
    L13:
        if (f8944h == false) goto L25;
    L16:
        Constructor r03 = f8943g;
        if (r03 != null) goto L31;
    L20:
        return null;
    L31:
        return (WindowInsets) r03.newInstance(new Object[]{new Rect()});
    L25:
        f8943g = WindowInsets.class.getConstructor(new Class[]{Rect.class});     // Catch: ReflectiveOperationException -> L23
    L15:
        f8944h = true;
        goto L16
    L29:
        f8941e = WindowInsets.class.getDeclaredField("CONSUMED");     // Catch: ReflectiveOperationException -> L24
    L5:
        f8942f = true;
        goto L6
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: b */
    public C0489LF mo5084b() {
        m5362a();
        C0489LF r0 = C0489LF.m939h(null, this.f8945c);
        C2765yl[] r1 = this.f9465b;
        C0317HF r2 = r0.f1602a;
        r2.mo18p(r1);
        r2.mo95s(this.f8946d);
        return r0;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: e */
    public void mo5085e(C2765yl r1) {
        this.f8946d = r1;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: g */
    public void mo5086g(C2765yl r5) {
        WindowInsets r0 = this.f8945c;
        if (r0 == null) goto L6;
        this.f8945c = r0.replaceSystemWindowInsets(r5.f9405a, r5.f9406b, r5.f9407c, r5.f9408d);
        return;
    }

    public C2581uF(C0489LF r1) {
        super(r1);
        this.f8945c = r1.m945g();
    }
}
