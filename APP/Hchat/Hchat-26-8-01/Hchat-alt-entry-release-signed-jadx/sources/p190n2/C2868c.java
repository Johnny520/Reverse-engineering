package p190n2;

import ai.AbstractC0088a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import be.AbstractC0283h;
import p020b5.C0184c;
import p020b5.C0192k;
import p057e1.C0808c;
import p071f1.AbstractC0996c0;
import p071f1.C1008i0;
import p085fg.InterfaceC1231l;
import p119i2.AbstractC1923e0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p259r9.AbstractC3754e0;
import p280t2.EnumC4094j;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: n2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2868c {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f9269a;

    /* JADX INFO: renamed from: b */
    public final C0184c f9270b;

    /* JADX INFO: renamed from: d */
    public boolean f9272d;

    /* JADX INFO: renamed from: e */
    public boolean f9273e;

    /* JADX INFO: renamed from: f */
    public boolean f9274f;

    /* JADX INFO: renamed from: g */
    public boolean f9275g;

    /* JADX INFO: renamed from: h */
    public boolean f9276h;

    /* JADX INFO: renamed from: i */
    public boolean f9277i;

    /* JADX INFO: renamed from: j */
    public C2884s f9278j;

    /* JADX INFO: renamed from: k */
    public C1935k0 f9279k;

    /* JADX INFO: renamed from: l */
    public C0192k f9280l;

    /* JADX INFO: renamed from: n */
    public C0808c f9282n;

    /* JADX INFO: renamed from: o */
    public C0808c f9283o;

    /* JADX INFO: renamed from: c */
    public final Object f9271c = new Object();

    /* JADX INFO: renamed from: m */
    public InterfaceC1231l f9281m = C2867b.f9263i;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f9284p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f9285q = C1008i0.m2593a();

    /* JADX INFO: renamed from: r */
    public final Matrix f9286r = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2868c(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C0184c c0184c) {
        this.f9269a = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f9270b = c0184c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: a */
    public final void m6284a() {
        View view;
        C0184c c0184c = this.f9270b;
        ?? r2 = c0184c.f470b;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view2 = (View) c0184c.f469a;
        if (inputMethodManager.isActive(view2)) {
            InterfaceC1231l interfaceC1231l = this.f9281m;
            float[] fArr = this.f9285q;
            interfaceC1231l.invoke(new C1008i0(fArr));
            this.f9269a.m10664v(fArr);
            Matrix matrix = this.f9286r;
            AbstractC0996c0.m2519p(matrix, fArr);
            C2884s c2884s = this.f9278j;
            c2884s.getClass();
            long j3 = c2884s.f9317b;
            C0192k c0192k = this.f9280l;
            c0192k.getClass();
            C1935k0 c1935k0 = this.f9279k;
            c1935k0.getClass();
            C1942o c1942o = c1935k0.f6562b;
            C0808c c0808c = this.f9282n;
            c0808c.getClass();
            float f3 = c0808c.f2419d;
            float f10 = c0808c.f2417b;
            C0808c c0808c2 = this.f9283o;
            c0808c2.getClass();
            boolean z9 = this.f9274f;
            boolean z10 = this.f9275g;
            boolean z11 = this.f9276h;
            boolean z12 = this.f9277i;
            CursorAnchorInfo.Builder builder = this.f9284p;
            builder.reset();
            builder.setMatrix(matrix);
            C1939m0 c1939m0 = c2884s.f9318c;
            int iM4816f = C1939m0.m4816f(j3);
            builder.setSelectionRange(iM4816f, C1939m0.m4815e(j3));
            EnumC4094j enumC4094j = EnumC4094j.f13555h;
            if (!z9 || iM4816f < 0) {
                view = view2;
            } else {
                c0192k.m859l(iM4816f);
                C0808c c0808cM4803c = c1935k0.m4803c(iM4816f);
                view = view2;
                float fM7907q = AbstractC3754e0.m7907q(c0808cM4803c.f2416a, 0.0f, (int) (c1935k0.f6563c >> 32));
                boolean zM1177p = AbstractC0283h.m1177p(c0808c, fM7907q, c0808cM4803c.f2417b);
                boolean zM1177p2 = AbstractC0283h.m1177p(c0808c, fM7907q, c0808cM4803c.f2419d);
                boolean z13 = c1935k0.m4801a(iM4816f) == enumC4094j;
                int i9 = (zM1177p || zM1177p2) ? 1 : 0;
                if (!zM1177p || !zM1177p2) {
                    i9 |= 2;
                }
                if (z13) {
                    i9 |= 4;
                }
                float f11 = c0808cM4803c.f2417b;
                float f12 = c0808cM4803c.f2419d;
                builder.setInsertionMarkerLocation(fM7907q, f11, f12, f12, i9);
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
                        float f13 = fArr2[i11];
                        float f14 = fArr2[i11 + 1];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f15 = fArr2[i11 + 2];
                        float f16 = fArr2[i11 + 3];
                        int i12 = iM4815e;
                        int i13 = (c0808c.f2416a < f15 ? 1 : 0) & (f13 < c0808c.f2418c ? 1 : 0) & (f10 < f16 ? 1 : 0) & (f14 < f3 ? 1 : 0);
                        if (!AbstractC0283h.m1177p(c0808c, f13, f14) || !AbstractC0283h.m1177p(c0808c, f15, f16)) {
                            i13 |= 2;
                        }
                        if (c1935k0.m4801a(i10) == enumC4094j) {
                            i13 |= 4;
                        }
                        int i14 = i10;
                        builder3.addCharacterBounds(i14, f13, f14, f15, f16, i13);
                        builder2 = builder3;
                        i10 = i14 + 1;
                        iM4815e = i12;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z11) {
                builder2.setEditorBoundsInfo(AbstractC0088a.m487m().setEditorBounds(AbstractC0996c0.m2524u(c0808c2)).setHandwritingBounds(AbstractC0996c0.m2524u(c0808c2)).build());
            }
            if (i15 >= 34 && z12 && !c0808c.m2050f()) {
                int i16 = c1942o.f6588f - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                int iM7909r = AbstractC3754e0.m7909r(c1942o.m4828e(f10), 0, i16);
                int iM7909r2 = AbstractC3754e0.m7909r(c1942o.m4828e(f3), 0, i16);
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
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f9273e = false;
        }
    }
}
