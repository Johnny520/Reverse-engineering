package p051J;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.bumptech.glide.AbstractC1922d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p000A.C0066i0;
import p000A.C0071l;
import p000A.C0078o0;
import p000A.C0099z;
import p028F.AbstractC0359t;
import p046I.AbstractC0658e;
import p047I0.InterfaceC0697T0;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p058L.C0920W;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0974n;
import p061L2.AbstractC0984x;
import p061L2.C0983w;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p115X0.C1636k;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p125Z0.C1780a;
import p125Z0.C1781b;

/* JADX INFO: renamed from: J.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0829u {

    /* JADX INFO: renamed from: a */
    public final View f2668a;

    /* JADX INFO: renamed from: b */
    public final C0822n f2669b;

    /* JADX INFO: renamed from: e */
    public C0078o0 f2672e;

    /* JADX INFO: renamed from: f */
    public C0920W f2673f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0697T0 f2674g;

    /* JADX INFO: renamed from: l */
    public Rect f2679l;

    /* JADX INFO: renamed from: m */
    public final C0826r f2680m;

    /* JADX INFO: renamed from: c */
    public InterfaceC1601c f2670c = new C0071l(18);

    /* JADX INFO: renamed from: d */
    public InterfaceC1601c f2671d = new C0071l(19);

    /* JADX INFO: renamed from: h */
    public C1646u f2675h = new C1646u("", C1259L.f4536b, 4);

    /* JADX INFO: renamed from: i */
    public C1636k f2676i = C1636k.f5625g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2677j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Object f2678k = AbstractC0797o.m1395t(EnumC0880f.f2767e, new C0099z(9, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0829u(View view, C0809a c0809a, C0822n c0822n) {
        this.f2668a = view;
        this.f2669b = c0822n;
        this.f2680m = new C0826r(c0809a, c0822n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InputConnectionC0830v m1471a(EditorInfo editorInfo) {
        int i5;
        int i6;
        Set setSingleton;
        C1646u c1646u = this.f2675h;
        String str = c1646u.f5650a.f4563e;
        long j5 = c1646u.f5651b;
        C1636k c1636k = this.f2676i;
        int i7 = c1636k.f5630e;
        int i8 = c1636k.f5629d;
        boolean z5 = c1636k.f5626a;
        if (i7 == 1) {
            i5 = z5 ? 6 : 0;
        } else if (i7 == 0) {
            i5 = 1;
        } else if (i7 == 2) {
            i5 = 2;
        } else if (i7 == 6) {
            i5 = 5;
        } else if (i7 == 5) {
            i5 = 7;
        } else if (i7 == 3) {
            i5 = 3;
        } else if (i7 == 4) {
            i5 = 4;
        } else if (i7 != 7) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i5;
        C1781b c1781b = c1636k.f5631f;
        if (AbstractC1665j.m2981a(c1781b, C1781b.f6089f)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(c1781b, 10));
            Iterator it = c1781b.f6090d.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1780a) it.next()).f6088a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int i9 = 9;
        if (i8 == 1) {
            i6 = 1;
        } else if (i8 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i6 = 1;
        } else if (i8 == 3) {
            i6 = 2;
        } else if (i8 == 4) {
            i6 = 3;
        } else if (i8 == 5) {
            i6 = 17;
        } else if (i8 == 6) {
            i6 = 33;
        } else if (i8 == 7) {
            i6 = 129;
        } else if (i8 == 8) {
            i6 = 18;
        } else {
            if (i8 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i6 = 8194;
        }
        editorInfo.inputType = i6;
        if (!z5 && (i6 & 1) == 1) {
            editorInfo.inputType = 131072 | i6;
            if (c1636k.f5630e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i10 = editorInfo.inputType;
        if ((i10 & 1) == 1) {
            int i11 = c1636k.f5627b;
            if (i11 == 1) {
                editorInfo.inputType = i10 | 4096;
            } else if (i11 == 2) {
                editorInfo.inputType = i10 | 8192;
            } else if (i11 == 3) {
                editorInfo.inputType = i10 | 16384;
            }
            if (c1636k.f5628c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i12 = C1259L.f4537c;
        editorInfo.initialSelStart = (int) (j5 >> 32);
        editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
        AbstractC1922d.m3417C(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC0658e.f2084a || i8 == 7 || i8 == 8) {
            AbstractC1922d.m3418D(editorInfo, false);
        } else {
            AbstractC1922d.m3418D(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC0972l.m1987K(new Class[]{AbstractC0359t.m585n(), AbstractC0359t.m568A(), AbstractC0359t.m594w(), AbstractC0359t.m597z(), AbstractC0359t.m569B(), AbstractC0359t.m570C(), AbstractC0359t.m571D()}));
            Class[] clsArr = {AbstractC0359t.m585n(), AbstractC0359t.m568A(), AbstractC0359t.m594w(), AbstractC0359t.m597z()};
            int length = clsArr.length;
            if (length == 0) {
                setSingleton = C0983w.f3049d;
            } else if (length != 1) {
                setSingleton = new LinkedHashSet(AbstractC0984x.m2034F(clsArr.length));
                for (Class cls : clsArr) {
                    setSingleton.add(cls);
                }
            } else {
                setSingleton = Collections.singleton(clsArr[0]);
                AbstractC1665j.m2984d(setSingleton, "singleton(...)");
            }
            editorInfo.setSupportedHandwritingGesturePreviews(setSingleton);
        }
        C0827s c0827s = AbstractC0828t.f2667a;
        InputConnectionC0830v inputConnectionC0830v = new InputConnectionC0830v(this.f2675h, new C0066i0(i9, this), this.f2676i.f5628c, this.f2672e, this.f2673f, this.f2674g);
        this.f2677j.add(new WeakReference(inputConnectionC0830v));
        return inputConnectionC0830v;
    }
}
