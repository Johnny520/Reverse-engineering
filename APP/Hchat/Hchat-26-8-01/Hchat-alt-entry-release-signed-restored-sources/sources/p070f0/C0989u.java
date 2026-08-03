package p070f0;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.lifecycle.C0119x;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p015b0.AbstractC0130a0;
import p056e0.AbstractC0805e;
import p063e9.C0837h;
import p085fg.InterfaceC1231l;
import p100h0.C1511d1;
import p119i2.C1939m0;
import p136j8.C2104o;
import p162l3.C2455i;
import p190n2.C2875j;
import p190n2.C2884s;
import p225p2.C3289a;
import p225p2.C3290b;
import p259r9.AbstractC3754e0;
import p276sf.EnumC3957d;
import p321w.C4629q0;
import p357y1.InterfaceC5905l2;
import tf.AbstractC4156d0;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: f0.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0989u {

    /* JADX INFO: renamed from: a */
    public final View f3123a;

    /* JADX INFO: renamed from: b */
    public final C0982n f3124b;

    /* JADX INFO: renamed from: e */
    public C4629q0 f3127e;

    /* JADX INFO: renamed from: f */
    public C1511d1 f3128f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5905l2 f3129g;

    /* JADX INFO: renamed from: l */
    public Rect f3134l;

    /* JADX INFO: renamed from: m */
    public final C0986r f3135m;

    /* JADX INFO: renamed from: c */
    public InterfaceC1231l f3125c = new C0837h(21);

    /* JADX INFO: renamed from: d */
    public InterfaceC1231l f3126d = new C0837h(22);

    /* JADX INFO: renamed from: h */
    public C2884s f3130h = new C2884s(4, HttpUrl.FRAGMENT_ENCODE_SET, C1939m0.f6573b);

    /* JADX INFO: renamed from: i */
    public C2875j f3131i = C2875j.f9292g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3132j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Object f3133k = AbstractC0283h.m1127G(EnumC3957d.f12959h, new C0041a(this, 18));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0989u(View view, C0969a c0969a, C0982n c0982n) {
        this.f3123a = view;
        this.f3124b = c0982n;
        this.f3135m = new C0986r(c0969a, c0982n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final InputConnectionC0990v m2446a(EditorInfo editorInfo) {
        int i9;
        int i10;
        C2884s c2884s = this.f3130h;
        String str = c2884s.f9316a.f6529h;
        long j3 = c2884s.f9317b;
        C2875j c2875j = this.f3131i;
        int i11 = c2875j.f9297e;
        int i12 = c2875j.f9296d;
        boolean z9 = c2875j.f9293a;
        if (i11 == 1) {
            i9 = z9 ? 6 : 0;
        } else if (i11 == 0) {
            i9 = 1;
        } else if (i11 == 2) {
            i9 = 2;
        } else if (i11 == 6) {
            i9 = 5;
        } else if (i11 == 5) {
            i9 = 7;
        } else if (i11 == 3) {
            i9 = 3;
        } else if (i11 == 4) {
            i9 = 4;
        } else {
            if (i11 != 7) {
                C2104o.m5276A("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i9;
        C3290b c3290b = c2875j.f9298f;
        if (AbstractC1416l.m3825a(c3290b, C3290b.f10460i)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c3290b));
            Iterator it = c3290b.f10461g.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3289a) it.next()).f10459a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int i13 = 9;
        if (i12 == 1) {
            i10 = 1;
        } else if (i12 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (i12 == 3) {
            i10 = 2;
        } else if (i12 == 4) {
            i10 = 3;
        } else if (i12 == 5) {
            i10 = 17;
        } else if (i12 == 6) {
            i10 = 33;
        } else if (i12 == 7) {
            i10 = 129;
        } else if (i12 == 8) {
            i10 = 18;
        } else {
            if (i12 != 9) {
                C2104o.m5276A("Invalid Keyboard Type");
                return null;
            }
            i10 = 8194;
        }
        editorInfo.inputType = i10;
        if (!z9 && (i10 & 1) == 1) {
            editorInfo.inputType = 131072 | i10;
            if (c2875j.f9297e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = c2875j.f9294b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (c2875j.f9295c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = C1939m0.f6574c;
        editorInfo.initialSelStart = (int) (j3 >> 32);
        editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
        AbstractC3754e0.m7898k0(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC0805e.f2409a || i12 == 7 || i12 == 8) {
            AbstractC3754e0.m7899l0(editorInfo, false);
        } else {
            AbstractC3754e0.m7899l0(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(AbstractC0000a.m101y0(AbstractC0130a0.m668l(), AbstractC0130a0.m679w(), AbstractC0130a0.m675s(), AbstractC0130a0.m677u(), AbstractC0130a0.m681y(), AbstractC0130a0.m653A(), AbstractC0130a0.m655C()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC4156d0.m8355W(AbstractC0130a0.m668l(), AbstractC0130a0.m679w(), AbstractC0130a0.m675s(), AbstractC0130a0.m677u()));
        }
        C0987s c0987s = AbstractC0988t.f3122a;
        if (C2455i.m5847d()) {
            C2455i.m5846a().m5852g(editorInfo);
        }
        InputConnectionC0990v inputConnectionC0990v = new InputConnectionC0990v(this.f3130h, new C0119x(this, i13), this.f3131i.f9295c, this.f3127e, this.f3128f, this.f3129g);
        this.f3132j.add(new WeakReference(inputConnectionC0990v));
        return inputConnectionC0990v;
    }
}
