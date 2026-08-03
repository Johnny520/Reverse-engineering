package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p018J0.C0234d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0916n {

    /* JADX INFO: renamed from: a */
    public final View f3239a;

    /* JADX INFO: renamed from: b */
    public final C0926s f3240b;

    /* JADX INFO: renamed from: c */
    public int f3241c;

    /* JADX INFO: renamed from: d */
    public C0853C0 f3242d;

    /* JADX INFO: renamed from: e */
    public C0853C0 f3243e;

    /* JADX INFO: renamed from: f */
    public C0853C0 f3244f;

    public C0916n(View r2) {
        this.f3241c = -1;
        this.f3239a = r2;
        PorterDuff.Mode r22 = C0926s.f3289b;
        monitor-enter(C0926s.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (C0926s.f3290c != null) goto L9;
        C0926s.m2259b();     // Catch: Throwable -> L7
    L9:
        C0926s r02 = C0926s.f3290c;     // Catch: Throwable -> L7
        monitor-exit(C0926s.class);
        this.f3240b = r02;
    }

    /* JADX INFO: renamed from: a */
    public final void m2240a() {
        View r02 = this.f3239a;
        Drawable r1 = r02.getBackground();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.f3242d != null) goto L7;
    L21:
        C0853C0 r2 = this.f3243e;
        if (r2 == null) goto L24;
        C0926s.m2260c(r1, r2, r02.getDrawableState());
        return;
    L24:
        C0853C0 r22 = this.f3242d;
        if (r22 == null) goto L30;
        C0926s.m2260c(r1, r22, r02.getDrawableState());
        return;
    L30:
        return;
    L7:
        if (this.f3244f != null) goto L9;
        this.f3244f = new C0853C0();
    L9:
        C0853C0 r23 = this.f3244f;
        r23.f3084a = null;
        r23.f3087d = false;
        r23.f3085b = null;
        r23.f3086c = false;
        Field r3 = AbstractC0080Q.f219a;
        ColorStateList r32 = AbstractC0070G.m217g(r02);
        if (r32 == null) goto L12;
        r23.f3087d = true;
        r23.f3084a = r32;
    L12:
        PorterDuff.Mode r33 = AbstractC0070G.m218h(r02);
        if (r33 == null) goto L16;
        r23.f3086c = true;
        r23.f3085b = r33;
    L16:
        if (r23.f3087d == false) goto L18;
    L19:
        C0926s.m2260c(r1, r23, r02.getDrawableState());
        return;
    L18:
        if (r23.f3086c == false) goto L21;
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2241b() {
        C0853C0 r02 = this.f3243e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2242c() {
        C0853C0 r02 = this.f3243e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2243d(AttributeSet r11, int r12) {
        View r02 = this.f3239a;
        Context r1 = r02.getContext();
        int[] r4 = AbstractC0550a.f1636u;
        C0234d r13 = C0234d.m638s(r1, r11, r4, r12, 0);
        TypedArray r9 = (TypedArray) r13.f475c;
        View r2 = this.f3239a;
        AbstractC0080Q.m290i(r2, r2.getContext(), r4, r11, (TypedArray) r13.f475c, r12);
    L11:
        th = move-exception;
        r13.m657u();
        throw th;
    L4:
        if (r9.hasValue(0) == false) goto L17;
        this.f3241c = r9.getResourceId(0, -1);     // Catch: Throwable -> L11
        C0926s r112 = this.f3240b;     // Catch: Throwable -> L11
        Context r22 = r02.getContext();     // Catch: Throwable -> L11
        int r3 = this.f3241c;     // Catch: Throwable -> L11
        monitor-enter(r112);     // Catch: Throwable -> L11
        ColorStateList r23 = r112.f3291a.m2270h(r22, r3);     // Catch: Throwable -> L13
        monitor-exit(r112);     // Catch: Throwable -> L11
        if (r23 == null) goto L17;
        m2246g(r23);     // Catch: Throwable -> L11
        goto L17
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L17:
        if (r9.hasValue(1) == false) goto L20;
        AbstractC0070G.m227q(r02, r13.m645h(1));     // Catch: Throwable -> L11
    L20:
        if (r9.hasValue(2) == false) goto L22;
        AbstractC0070G.m228r(r02, AbstractC0886W.m2221c(r9.getInt(2, -1), null));     // Catch: Throwable -> L11
    L22:
        r13.m657u();
    }

    /* JADX INFO: renamed from: e */
    public final void m2244e() {
        this.f3241c = -1;
        m2246g(null);
        m2240a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2245f(int r4) {
        this.f3241c = r4;
        C0926s r02 = this.f3240b;
        if (r02 == null) goto L12;
        Context r1 = this.f3239a.getContext();
        monitor-enter(r02);
        ColorStateList r42 = r02.f3291a.m2270h(r1, r4);     // Catch: Throwable -> L9
        monitor-exit(r02);
    L13:
        m2246g(r42);
        m2240a();
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        r42 = null;
        goto L13
    }

    /* JADX INFO: renamed from: g */
    public final void m2246g(ColorStateList r2) {
        if (r2 != null) goto L4;
        this.f3242d = null;
    L8:
        m2240a();
        return;
    L4:
        if (this.f3242d != null) goto L6;
        this.f3242d = new C0853C0();
    L6:
        C0853C0 r02 = this.f3242d;
        r02.f3084a = r2;
        r02.f3087d = true;
        goto L8
    }

    /* JADX INFO: renamed from: h */
    public final void m2247h(ColorStateList r2) {
        if (this.f3243e != null) goto L5;
        this.f3243e = new C0853C0();
    L5:
        C0853C0 r02 = this.f3243e;
        r02.f3084a = r2;
        r02.f3087d = true;
        m2240a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2248i(PorterDuff.Mode r2) {
        if (this.f3243e != null) goto L5;
        this.f3243e = new C0853C0();
    L5:
        C0853C0 r02 = this.f3243e;
        r02.f3085b = r2;
        r02.f3086c = true;
        m2240a();
    }
}
