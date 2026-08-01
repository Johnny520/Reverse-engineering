package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p004C.C0064h;
import p058d.AbstractC0515a;
import p099y.AbstractC1038B;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0704p {

    /* JADX INFO: renamed from: a */
    public final View f2372a;

    /* JADX INFO: renamed from: d */
    public C0676f1 f2375d;

    /* JADX INFO: renamed from: e */
    public C0676f1 f2376e;

    /* JADX INFO: renamed from: f */
    public C0676f1 f2377f;

    /* JADX INFO: renamed from: c */
    public int f2374c = -1;

    /* JADX INFO: renamed from: b */
    public final C0719u f2373b = C0719u.m1367a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0704p(View view) {
        this.f2372a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1327a() {
        View view = this.f2372a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2375d != null) {
                if (this.f2377f == null) {
                    this.f2377f = new C0676f1();
                }
                C0676f1 c0676f1 = this.f2377f;
                c0676f1.f2287a = null;
                c0676f1.f2290d = false;
                c0676f1.f2288b = null;
                c0676f1.f2289c = false;
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                ColorStateList colorStateListM2232g = AbstractC1038B.m2232g(view);
                if (colorStateListM2232g != null) {
                    c0676f1.f2290d = true;
                    c0676f1.f2287a = colorStateListM2232g;
                }
                PorterDuff.Mode modeM2233h = AbstractC1038B.m2233h(view);
                if (modeM2233h != null) {
                    c0676f1.f2289c = true;
                    c0676f1.f2288b = modeM2233h;
                }
                if (c0676f1.f2290d || c0676f1.f2289c) {
                    C0719u.m1369d(background, c0676f1, view.getDrawableState());
                    return;
                }
            }
            C0676f1 c0676f12 = this.f2376e;
            if (c0676f12 != null) {
                C0719u.m1369d(background, c0676f12, view.getDrawableState());
                return;
            }
            C0676f1 c0676f13 = this.f2375d;
            if (c0676f13 != null) {
                C0719u.m1369d(background, c0676f13, view.getDrawableState());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ColorStateList m1328b() {
        C0676f1 c0676f1 = this.f2376e;
        if (c0676f1 != null) {
            return c0676f1.f2287a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m1329c() {
        C0676f1 c0676f1 = this.f2376e;
        if (c0676f1 != null) {
            return c0676f1.f2288b;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1330d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListM1256f;
        View view = this.f2372a;
        Context context = view.getContext();
        int[] iArr = AbstractC0515a.f1662z;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        View view2 = this.f2372a;
        AbstractC1048L.m2289h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f2374c = typedArray.getResourceId(0, -1);
                C0719u c0719u = this.f2373b;
                Context context2 = view.getContext();
                int i3 = this.f2374c;
                synchronized (c0719u) {
                    colorStateListM1256f = c0719u.f2439a.m1256f(context2, i3);
                }
                if (colorStateListM1256f != null) {
                    m1333g(colorStateListM1256f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1038B.m2242q(view, c0064hM114t.m122l(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1038B.m2243r(view, AbstractC0705p0.m1337b(typedArray.getInt(2, -1), null));
            }
            c0064hM114t.m130v();
        } catch (Throwable th) {
            c0064hM114t.m130v();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1331e() {
        this.f2374c = -1;
        m1333g(null);
        m1327a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1332f(int i2) {
        ColorStateList colorStateListM1256f;
        this.f2374c = i2;
        C0719u c0719u = this.f2373b;
        if (c0719u != null) {
            Context context = this.f2372a.getContext();
            synchronized (c0719u) {
                colorStateListM1256f = c0719u.f2439a.m1256f(context, i2);
            }
        } else {
            colorStateListM1256f = null;
        }
        m1333g(colorStateListM1256f);
        m1327a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1333g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2375d == null) {
                this.f2375d = new C0676f1();
            }
            C0676f1 c0676f1 = this.f2375d;
            c0676f1.f2287a = colorStateList;
            c0676f1.f2290d = true;
        } else {
            this.f2375d = null;
        }
        m1327a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1334h(ColorStateList colorStateList) {
        if (this.f2376e == null) {
            this.f2376e = new C0676f1();
        }
        C0676f1 c0676f1 = this.f2376e;
        c0676f1.f2287a = colorStateList;
        c0676f1.f2290d = true;
        m1327a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1335i(PorterDuff.Mode mode) {
        if (this.f2376e == null) {
            this.f2376e = new C0676f1();
        }
        C0676f1 c0676f1 = this.f2376e;
        c0676f1.f2288b = mode;
        c0676f1.f2289c = true;
        m1327a();
    }
}
