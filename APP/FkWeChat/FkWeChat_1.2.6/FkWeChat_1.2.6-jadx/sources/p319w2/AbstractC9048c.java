package p319w2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import p074f3.AbstractC2284d;
import p104h3.C2852e;
import p104h3.C2853f;
import p104h3.C2857j;
import p121i3.AbstractC3194x;
import p121i3.C3193w;
import p319w2.AbstractC9092k3;
import p335x2.AbstractC9348o0;
import p335x2.C9331h1;
import p366z2.C9835c;

/* JADX INFO: renamed from: w2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9048c {
    /* JADX INFO: renamed from: j */
    public static final CharSequence m35126j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!AbstractC9348o0.m36446a(spannableString, C9835c.class)) {
            AbstractC2284d.m8326w(spannableString, new C9835c(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: k */
    public static final int m35127k(C9331h1 c9331h1, int i10) {
        int iM36372m = c9331h1.m36372m();
        for (int i11 = 0; i11 < iM36372m; i11++) {
            if (c9331h1.m36371l(i11) > i10) {
                return i11;
            }
        }
        return c9331h1.m36372m();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m35128l(C9147v3 c9147v3, boolean z10) {
        if (z10 && !C3193w.m12100e(c9147v3.m35567q(), AbstractC3194x.m12114f(0)) && !C3193w.m12100e(c9147v3.m35567q(), C3193w.f8489b.m12108a())) {
            int iM35576z = c9147v3.m35576z();
            C2857j.a aVar = C2857j.f7471b;
            if (!C2857j.m10221k(iM35576z, aVar.m10231g()) && !C2857j.m10221k(c9147v3.m35576z(), aVar.m10230f()) && !C2857j.m10221k(c9147v3.m35576z(), aVar.m10227c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final int m35129m(int i10) {
        C2857j.a aVar = C2857j.f7471b;
        if (C2857j.m10221k(i10, aVar.m10228d())) {
            return 3;
        }
        if (C2857j.m10221k(i10, aVar.m10229e())) {
            return 4;
        }
        if (C2857j.m10221k(i10, aVar.m10225a())) {
            return 2;
        }
        return (!C2857j.m10221k(i10, aVar.m10230f()) && C2857j.m10221k(i10, aVar.m10226b())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: n */
    public static final int m35130n(int i10) {
        C2853f.b.a aVar = C2853f.b.f7430a;
        if (C2853f.b.m10137e(i10, aVar.m10141c())) {
            return 0;
        }
        if (C2853f.b.m10137e(i10, aVar.m10140b())) {
            return 1;
        }
        return C2853f.b.m10137e(i10, aVar.m10139a()) ? 2 : 0;
    }

    /* JADX INFO: renamed from: o */
    public static final int m35131o(int i10) {
        C2852e.a aVar = C2852e.f7419b;
        if (C2852e.m10112g(i10, aVar.m10116a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        C2852e.m10112g(i10, aVar.m10117b());
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static final int m35132p(int i10) {
        C2853f.c.a aVar = C2853f.c.f7435a;
        if (C2853f.c.m10147f(i10, aVar.m10149a())) {
            return 0;
        }
        if (C2853f.c.m10147f(i10, aVar.m10150b())) {
            return 1;
        }
        if (C2853f.c.m10147f(i10, aVar.m10151c())) {
            return 2;
        }
        return C2853f.c.m10147f(i10, aVar.m10152d()) ? 3 : 0;
    }

    /* JADX INFO: renamed from: q */
    public static final int m35133q(int i10) {
        C2853f.d.a aVar = C2853f.d.f7441a;
        return (!C2853f.d.m10156d(i10, aVar.m10158a()) && C2853f.d.m10156d(i10, aVar.m10159b())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: r */
    public static final int m35134r(int i10) {
        AbstractC9092k3.a aVar = AbstractC9092k3.f31142a;
        return (!AbstractC9092k3.m35312d(i10, aVar.m35313a()) && AbstractC9092k3.m35312d(i10, aVar.m35314b())) ? 1 : 0;
    }
}
