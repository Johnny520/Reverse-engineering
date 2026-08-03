package p321w;

import be.C0289k;
import java.util.List;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1941n0;
import p177m2.InterfaceC2760d;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import tf.C4173t;

/* JADX INFO: renamed from: w.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4645x0 {

    /* JADX INFO: renamed from: a */
    public final C1926g f15436a;

    /* JADX INFO: renamed from: b */
    public final C1941n0 f15437b;

    /* JADX INFO: renamed from: e */
    public final boolean f15440e;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4233c f15442g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2760d f15443h;

    /* JADX INFO: renamed from: j */
    public C0289k f15445j;

    /* JADX INFO: renamed from: k */
    public EnumC4243m f15446k;

    /* JADX INFO: renamed from: c */
    public final int f15438c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public final int f15439d = 1;

    /* JADX INFO: renamed from: f */
    public final int f15441f = 1;

    /* JADX INFO: renamed from: i */
    public final List f15444i = C4173t.f13710g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4645x0(C1926g c1926g, C1941n0 c1941n0, boolean z9, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d, int i9) {
        this.f15436a = c1926g;
        this.f15437b = c1941n0;
        this.f15440e = z9;
        this.f15442g = interfaceC4233c;
        this.f15443h = interfaceC2760d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9084a(EnumC4243m enumC4243m) {
        C0289k c0289k = this.f15445j;
        if (c0289k == null || enumC4243m != this.f15446k || c0289k.mo1192a()) {
            this.f15446k = enumC4243m;
            c0289k = new C0289k(this.f15436a, AbstractC1923e0.m4790h(this.f15437b, enumC4243m), this.f15444i, this.f15442g, this.f15443h);
        }
        this.f15445j = c0289k;
    }
}
