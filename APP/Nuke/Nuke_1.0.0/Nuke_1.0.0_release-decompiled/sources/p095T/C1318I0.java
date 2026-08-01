package p095T;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p163g0.InterfaceC2171c;
import p186k.C2439u;

/* JADX INFO: renamed from: T.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1318I0 implements InterfaceC2171c, Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: e */
    public int f4706e;

    /* JADX INFO: renamed from: g */
    public int f4708g;

    /* JADX INFO: renamed from: h */
    public int f4709h;

    /* JADX INFO: renamed from: j */
    public boolean f4711j;

    /* JADX INFO: renamed from: k */
    public int f4712k;

    /* JADX INFO: renamed from: m */
    public HashMap f4714m;

    /* JADX INFO: renamed from: n */
    public C2439u f4715n;

    /* JADX INFO: renamed from: d */
    public int[] f4705d = new int[0];

    /* JADX INFO: renamed from: f */
    public Object[] f4707f = new Object[0];

    /* JADX INFO: renamed from: i */
    public final Object f4710i = new Object();

    /* JADX INFO: renamed from: l */
    public ArrayList f4713l = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final int m2436a(C1349a c1349a) {
        if (this.f4711j) {
            AbstractC1387t.m2638a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1349a.m2499a()) {
            AbstractC1380p0.m2542a("Anchor refers to a group that was removed");
        }
        return c1349a.f4783a;
    }

    /* JADX INFO: renamed from: b */
    public final void m2437b() {
        this.f4714m = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public final C1316H0 m2438c() {
        if (this.f4711j) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4709h++;
        return new C1316H0(this);
    }

    /* JADX INFO: renamed from: d */
    public final C1324L0 m2439d() {
        if (this.f4711j) {
            AbstractC1387t.m2638a("Cannot start a writer when another writer is pending");
        }
        if (this.f4709h > 0) {
            AbstractC1387t.m2638a("Cannot start a writer when a reader is pending");
        }
        this.f4711j = true;
        this.f4712k++;
        return new C1324L0(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2440e(C1349a c1349a) {
        int iM2446e;
        return c1349a.m2499a() && (iM2446e = AbstractC1322K0.m2446e(this.f4713l, c1349a.f4783a, this.f4706e)) >= 0 && AbstractC1665j.m2981a(this.f4713l.get(iM2446e), c1349a);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1327N m2441f(int i5) {
        int i6;
        ArrayList arrayList;
        int iM2446e;
        HashMap map = this.f4714m;
        if (map != null) {
            if (this.f4711j) {
                AbstractC1387t.m2638a("use active SlotWriter to crate an anchor for location instead");
            }
            C1349a c1349a = (i5 < 0 || i5 >= (i6 = this.f4706e) || (iM2446e = AbstractC1322K0.m2446e((arrayList = this.f4713l), i5, i6)) < 0) ? null : (C1349a) arrayList.get(iM2446e);
            if (c1349a != null) {
                return (AbstractC1327N) map.get(c1349a);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1325M(this, 0, this.f4706e);
    }
}
