package p159l0;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p069f.C0965w;
import p114hg.InterfaceC1711a;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1861n1;
import p136j8.C2104o;
import p338x0.InterfaceC5573c;

/* JADX INFO: renamed from: l0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2426h implements InterfaceC5573c, Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: h */
    public int f7950h;

    /* JADX INFO: renamed from: j */
    public int f7952j;

    /* JADX INFO: renamed from: k */
    public int f7953k;

    /* JADX INFO: renamed from: m */
    public boolean f7955m;

    /* JADX INFO: renamed from: n */
    public int f7956n;

    /* JADX INFO: renamed from: p */
    public HashMap f7958p;

    /* JADX INFO: renamed from: q */
    public C0965w f7959q;

    /* JADX INFO: renamed from: g */
    public int[] f7949g = new int[0];

    /* JADX INFO: renamed from: i */
    public Object[] f7951i = new Object[0];

    /* JADX INFO: renamed from: l */
    public final Object f7954l = new Object();

    /* JADX INFO: renamed from: o */
    public ArrayList f7957o = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5781a(C2420b c2420b) {
        if (this.f7955m) {
            AbstractC1855m.m4573a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c2420b.m5756a()) {
            AbstractC1861n1.m4583a("Anchor refers to a group that was removed");
        }
        return c2420b.f7923a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5782c() {
        this.f7958p = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C2425g m5783d() {
        if (this.f7955m) {
            C2104o.m5276A("Cannot read while a writer is pending");
            return null;
        }
        this.f7953k++;
        return new C2425g(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C2429k m5784e() {
        if (this.f7955m) {
            AbstractC1855m.m4573a("Cannot start a writer when another writer is pending");
        }
        if (this.f7953k > 0) {
            AbstractC1855m.m4573a("Cannot start a writer when a reader is pending");
        }
        this.f7955m = true;
        this.f7956n++;
        return new C2429k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m5785f(C2420b c2420b) {
        int iM5791e;
        return c2420b.m5756a() && (iM5791e = AbstractC2428j.m5791e(this.f7957o, c2420b.f7923a, this.f7950h)) >= 0 && AbstractC1416l.m3825a(this.f7957o.get(iM5791e), c2420b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final AbstractC2421c m5786g(int i9) {
        int i10;
        ArrayList arrayList;
        int iM5791e;
        HashMap map = this.f7958p;
        if (map != null) {
            if (this.f7955m) {
                AbstractC1855m.m4573a("use active SlotWriter to crate an anchor for location instead");
            }
            C2420b c2420b = (i9 < 0 || i9 >= (i10 = this.f7950h) || (iM5791e = AbstractC2428j.m5791e((arrayList = this.f7957o), i9, i10)) < 0) ? null : (C2420b) arrayList.get(iM5791e);
            if (c2420b != null) {
                return (AbstractC2421c) map.get(c2420b);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2422d(this, 0, this.f7950h);
    }
}
