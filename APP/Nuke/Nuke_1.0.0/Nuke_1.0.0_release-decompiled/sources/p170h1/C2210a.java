package p170h1;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC1923e;
import java.util.List;
import p029F0.AbstractC0435z;
import p041H0.C0617s;
import p154e2.C2023b;
import p176i1.C2306v;
import p205n1.C2688b;
import p229r1.AbstractC3094x;
import p229r1.C3046G;
import p229r1.C3070c0;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2210a extends AbstractC3094x {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7202f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewGroup f7203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2210a(ViewGroup viewGroup, int i5) {
        super(1);
        this.f7202f = i5;
        this.f7203g = viewGroup;
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: d */
    public final C3070c0 mo683d(C3070c0 c3070c0, List list) {
        switch (this.f7202f) {
            case 0:
                return ((C2233x) this.f7203g).m4028g(c3070c0);
            default:
                C2306v c2306v = (C2306v) this.f7203g;
                if (c2306v.f7503o) {
                    return c3070c0;
                }
                View childAt = c2306v.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2306v.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2306v.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c3070c0 : c3070c0.f9782a.mo5372r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // p229r1.AbstractC3094x
    /* JADX INFO: renamed from: e */
    public final C2023b mo684e(C3046G c3046g, C2023b c2023b) {
        switch (this.f7202f) {
            case 0:
                C0617s c0617s = ((C2233x) this.f7203g).f7230C.f1699J.f1893c;
                if (!c0617s.f1970U.f7199q) {
                    return c2023b;
                }
                long jM3457Q = AbstractC1923e.m3457Q(c0617s.mo638R(0L));
                int i5 = (int) (jM3457Q >> 32);
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = (int) (jM3457Q & 4294967295L);
                if (i6 < 0) {
                    i6 = 0;
                }
                long jMo637Q = AbstractC0435z.m693f(c0617s).mo637Q();
                int i7 = (int) (jMo637Q >> 32);
                int i8 = (int) (jMo637Q & 4294967295L);
                long j5 = c0617s.f1208f;
                long jM3457Q2 = AbstractC1923e.m3457Q(c0617s.mo638R((((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L)));
                int i9 = i7 - ((int) (jM3457Q2 >> 32));
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = i8 - ((int) (4294967295L & jM3457Q2));
                int i11 = i10 >= 0 ? i10 : 0;
                return (i5 == 0 && i6 == 0 && i9 == 0 && i11 == 0) ? c2023b : new C2023b(8, AbstractC2218i.m4027f((C2688b) c2023b.f6752e, i5, i6, i9, i11), AbstractC2218i.m4027f((C2688b) c2023b.f6753f, i5, i6, i9, i11));
            default:
                C2306v c2306v = (C2306v) this.f7203g;
                if (c2306v.f7503o) {
                    return c2023b;
                }
                View childAt = c2306v.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2306v.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2306v.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c2023b;
                }
                C2688b c2688bM4667b = C2688b.m4667b(iMax, iMax2, iMax3, iMax4);
                int i12 = c2688bM4667b.f8572a;
                C2688b c2688b = (C2688b) c2023b.f6752e;
                int i13 = c2688bM4667b.f8573b;
                int i14 = c2688bM4667b.f8574c;
                int i15 = c2688bM4667b.f8575d;
                return new C2023b(8, C3070c0.m5392a(c2688b, i12, i13, i14, i15), C3070c0.m5392a((C2688b) c2023b.f6753f, i12, i13, i14, i15));
        }
    }
}
