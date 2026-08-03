package p070f0;

import ai.AbstractC0088a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import p020b5.C0192k;
import p057e1.C0808c;
import p071f1.AbstractC0996c0;
import p071f1.C1008i0;
import p119i2.AbstractC1923e0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p190n2.C2884s;
import p259r9.AbstractC3754e0;
import p280t2.EnumC4094j;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: f0.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0986r {

    /* JADX INFO: renamed from: a */
    public final C0969a f3104a;

    /* JADX INFO: renamed from: b */
    public final C0982n f3105b;

    /* JADX INFO: renamed from: d */
    public boolean f3107d;

    /* JADX INFO: renamed from: e */
    public boolean f3108e;

    /* JADX INFO: renamed from: f */
    public boolean f3109f;

    /* JADX INFO: renamed from: g */
    public boolean f3110g;

    /* JADX INFO: renamed from: h */
    public boolean f3111h;

    /* JADX INFO: renamed from: i */
    public boolean f3112i;

    /* JADX INFO: renamed from: j */
    public C2884s f3113j;

    /* JADX INFO: renamed from: k */
    public C1935k0 f3114k;

    /* JADX INFO: renamed from: l */
    public C0192k f3115l;

    /* JADX INFO: renamed from: m */
    public C0808c f3116m;

    /* JADX INFO: renamed from: n */
    public C0808c f3117n;

    /* JADX INFO: renamed from: c */
    public final Object f3106c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f3118o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f3119p = C1008i0.m2593a();

    /* JADX INFO: renamed from: q */
    public final Matrix f3120q = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0986r(C0969a c0969a, C0982n c0982n) {
        this.f3104a = c0969a;
        this.f3105b = c0982n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2445a() {
        float f3;
        float f10;
        C0982n c0982n = this.f3105b;
        InputMethodManager inputMethodManagerM2429a = c0982n.m2429a();
        View view = c0982n.f3096b;
        if (!inputMethodManagerM2429a.isActive(view) || this.f3113j == null || this.f3115l == null || this.f3114k == null || this.f3116m == null || this.f3117n == null) {
            return;
        }
        float[] fArr = this.f3119p;
        C1008i0.m2596d(fArr);
        InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f3104a.f3051n.f3103x.getValue();
        if (interfaceC4428t != null) {
            if (!interfaceC4428t.mo8856C()) {
                interfaceC4428t = null;
            }
            if (interfaceC4428t != null) {
                interfaceC4428t.mo8857E(fArr);
            }
        }
        C0808c c0808c = this.f3117n;
        c0808c.getClass();
        float f11 = -c0808c.f2416a;
        C0808c c0808c2 = this.f3117n;
        c0808c2.getClass();
        C1008i0.m2598f(fArr, f11, -c0808c2.f2417b);
        Matrix matrix = this.f3120q;
        AbstractC0996c0.m2519p(matrix, fArr);
        C2884s c2884s = this.f3113j;
        c2884s.getClass();
        long j3 = c2884s.f9317b;
        C0192k c0192k = this.f3115l;
        c0192k.getClass();
        C1935k0 c1935k0 = this.f3114k;
        c1935k0.getClass();
        C1942o c1942o = c1935k0.f6562b;
        C0808c c0808c3 = this.f3116m;
        c0808c3.getClass();
        float f12 = c0808c3.f2419d;
        float f13 = c0808c3.f2417b;
        C0808c c0808c4 = this.f3117n;
        c0808c4.getClass();
        boolean z9 = this.f3109f;
        boolean z10 = this.f3110g;
        boolean z11 = this.f3111h;
        boolean z12 = this.f3112i;
        CursorAnchorInfo.Builder builder = this.f3118o;
        builder.reset();
        builder.setMatrix(matrix);
        C1939m0 c1939m0 = c2884s.f9318c;
        int iM4816f = C1939m0.m4816f(j3);
        builder.setSelectionRange(iM4816f, C1939m0.m4815e(j3));
        EnumC4094j enumC4094j = EnumC4094j.f13555h;
        if (!z9 || iM4816f < 0) {
            f3 = f12;
            f10 = f13;
        } else {
            c0192k.m859l(iM4816f);
            C0808c c0808cM4803c = c1935k0.m4803c(iM4816f);
            f3 = f12;
            f10 = f13;
            float fM7907q = AbstractC3754e0.m7907q(c0808cM4803c.f2416a, 0.0f, (int) (c1935k0.f6563c >> 32));
            boolean zM2436f = AbstractC0985q.m2436f(c0808c3, fM7907q, c0808cM4803c.f2417b);
            boolean zM2436f2 = AbstractC0985q.m2436f(c0808c3, fM7907q, c0808cM4803c.f2419d);
            boolean z13 = c1935k0.m4801a(iM4816f) == enumC4094j;
            int i9 = (zM2436f || zM2436f2) ? 1 : 0;
            if (!zM2436f || !zM2436f2) {
                i9 |= 2;
            }
            if (z13) {
                i9 |= 4;
            }
            float f14 = c0808cM4803c.f2417b;
            float f15 = c0808cM4803c.f2419d;
            builder.setInsertionMarkerLocation(fM7907q, f14, f15, f15, i9);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z10) {
            int iM4816f2 = c1939m0 != null ? C1939m0.m4816f(c1939m0.f6575a) : -1;
            int iM4815e = c1939m0 != null ? C1939m0.m4815e(c1939m0.f6575a) : -1;
            if (iM4816f2 >= 0 && iM4816f2 < iM4815e) {
                builder2.setComposingText(iM4816f2, c2884s.f9316a.f6529h.subSequence(iM4816f2, iM4815e));
                c0192k.m859l(iM4816f2);
                c0192k.m859l(iM4815e);
                float[] fArr2 = new float[(iM4815e - iM4816f2) * 4];
                c1942o.m4824a(AbstractC1923e0.m4784b(iM4816f2, iM4815e), fArr2);
                int i10 = iM4816f2;
                while (i10 < iM4815e) {
                    c0192k.m859l(i10);
                    int i11 = (i10 - iM4816f2) * 4;
                    float f16 = fArr2[i11];
                    float f17 = fArr2[i11 + 1];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f18 = fArr2[i11 + 2];
                    float f19 = fArr2[i11 + 3];
                    float[] fArr3 = fArr2;
                    int i12 = (c0808c3.f2416a < f18 ? 1 : 0) & (f16 < c0808c3.f2418c ? 1 : 0) & (f10 < f19 ? 1 : 0) & (f17 < f3 ? 1 : 0);
                    if (!AbstractC0985q.m2436f(c0808c3, f16, f17) || !AbstractC0985q.m2436f(c0808c3, f18, f19)) {
                        i12 |= 2;
                    }
                    if (c1935k0.m4801a(i10) == enumC4094j) {
                        i12 |= 4;
                    }
                    int i13 = i10;
                    builder3.addCharacterBounds(i13, f16, f17, f18, f19, i12);
                    builder2 = builder3;
                    i10 = i13 + 1;
                    fArr2 = fArr3;
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z11) {
            builder2.setEditorBoundsInfo(AbstractC0088a.m487m().setEditorBounds(AbstractC0996c0.m2524u(c0808c4)).setHandwritingBounds(AbstractC0996c0.m2524u(c0808c4)).build());
        }
        if (i14 >= 34 && z12 && !c0808c3.m2050f()) {
            int i15 = c1942o.f6588f - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            int iM7909r = AbstractC3754e0.m7909r(c1942o.m4828e(f10), 0, i15);
            int iM7909r2 = AbstractC3754e0.m7909r(c1942o.m4828e(f3), 0, i15);
            if (iM7909r <= iM7909r2) {
                while (true) {
                    builder2.addVisibleLineBounds(c1935k0.m4805e(iM7909r), c1942o.m4829f(iM7909r), c1935k0.m4806f(iM7909r), c1942o.m4825b(iM7909r));
                    if (iM7909r == iM7909r2) {
                        break;
                    } else {
                        iM7909r++;
                    }
                }
            }
        }
        c0982n.m2429a().updateCursorAnchorInfo(view, builder2.build());
        this.f3108e = false;
    }
}
