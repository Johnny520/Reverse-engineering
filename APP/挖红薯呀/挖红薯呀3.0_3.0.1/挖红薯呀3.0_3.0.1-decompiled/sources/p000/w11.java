package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 implements InterfaceC0804ui, Iterable, p40 {

    /* JADX INFO: renamed from: e */
    public int f6894e;

    /* JADX INFO: renamed from: g */
    public int f6896g;

    /* JADX INFO: renamed from: h */
    public int f6897h;

    /* JADX INFO: renamed from: j */
    public boolean f6899j;

    /* JADX INFO: renamed from: k */
    public int f6900k;

    /* JADX INFO: renamed from: m */
    public HashMap f6902m;

    /* JADX INFO: renamed from: n */
    public ug0 f6903n;

    /* JADX INFO: renamed from: d */
    public int[] f6893d = new int[0];

    /* JADX INFO: renamed from: f */
    public Object[] f6895f = new Object[0];

    /* JADX INFO: renamed from: i */
    public final Object f6898i = new Object();

    /* JADX INFO: renamed from: l */
    public ArrayList f6901l = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m4827a(C0788u2 c0788u2) {
        if (this.f6899j) {
            AbstractC0653qi.m3252a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0788u2.m4246a()) {
            wr0.m5024a("Anchor refers to a group that was removed");
        }
        return c0788u2.f6110a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4828b() {
        this.f6902m = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final v11 m4829c() {
        if (this.f6899j) {
            C0921xc.m5134o("Cannot read while a writer is pending");
            return null;
        }
        this.f6897h++;
        return new v11(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final z11 m4830d() {
        if (this.f6899j) {
            AbstractC0653qi.m3252a("Cannot start a writer when another writer is pending");
        }
        if (this.f6897h > 0) {
            AbstractC0653qi.m3252a("Cannot start a writer when a reader is pending");
        }
        this.f6899j = true;
        this.f6900k++;
        return new z11(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4831e(C0788u2 c0788u2) {
        int iM5202d;
        return c0788u2.m4246a() && (iM5202d = y11.m5202d(this.f6901l, c0788u2.f6110a, this.f6894e)) >= 0 && p30.m3002l(this.f6901l.get(iM5202d), c0788u2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final AbstractC0189ey m4832f(int i) {
        int i2;
        ArrayList arrayList;
        int iM5202d;
        HashMap map = this.f6902m;
        if (map != null) {
            if (this.f6899j) {
                AbstractC0653qi.m3252a("use active SlotWriter to crate an anchor for location instead");
            }
            C0788u2 c0788u2 = (i < 0 || i >= (i2 = this.f6894e) || (iM5202d = y11.m5202d((arrayList = this.f6901l), i, i2)) < 0) ? null : (C0788u2) arrayList.get(iM5202d);
            if (c0788u2 != null) {
                return (AbstractC0189ey) map.get(c0788u2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0152dy(this, 0, this.f6894e);
    }
}
