package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 implements InterfaceC0035ay, Iterable, q41 {

    /* JADX INFO: renamed from: i */
    public int f9133i;

    /* JADX INFO: renamed from: k */
    public int f9135k;

    /* JADX INFO: renamed from: l */
    public int f9136l;

    /* JADX INFO: renamed from: n */
    public boolean f9138n;

    /* JADX INFO: renamed from: o */
    public int f9139o;

    /* JADX INFO: renamed from: q */
    public HashMap f9141q;

    /* JADX INFO: renamed from: r */
    public zj1 f9142r;

    /* JADX INFO: renamed from: h */
    public int[] f9132h = new int[0];

    /* JADX INFO: renamed from: j */
    public Object[] f9134j = new Object[0];

    /* JADX INFO: renamed from: m */
    public final Object f9137m = new Object();

    /* JADX INFO: renamed from: p */
    public ArrayList f9140p = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final int m4272a(ao0 ao0Var) {
        if (this.f9138n) {
            AbstractC0752tx.m5443a("Use active SlotWriter to determine anchor location instead");
        }
        if (!ao0Var.m237a()) {
            j22.m2429a("Anchor refers to a group that was removed");
        }
        return ao0Var.f313a;
    }

    /* JADX INFO: renamed from: b */
    public final void m4273b() {
        this.f9141q = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public final pr2 m4274c() {
        if (this.f9138n) {
            C0676s.m4653l("Cannot read while a writer is pending");
            return null;
        }
        this.f9136l++;
        return new pr2(this);
    }

    /* JADX INFO: renamed from: d */
    public final tr2 m4275d() {
        if (this.f9138n) {
            AbstractC0752tx.m5443a("Cannot start a writer when another writer is pending");
        }
        if (this.f9136l > 0) {
            AbstractC0752tx.m5443a("Cannot start a writer when a reader is pending");
        }
        this.f9138n = true;
        this.f9139o++;
        return new tr2(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4276e(ao0 ao0Var) {
        int iM4993e;
        return ao0Var.m237a() && (iM4993e = sr2.m4993e(this.f9140p, ao0Var.f313a, this.f9133i)) >= 0 && t11.m5086l(this.f9140p.get(iM4993e), ao0Var);
    }

    /* JADX INFO: renamed from: f */
    public final io0 m4277f(int i) {
        int i2;
        ArrayList arrayList;
        int iM4993e;
        HashMap map = this.f9141q;
        if (map != null) {
            if (this.f9138n) {
                AbstractC0752tx.m5443a("use active SlotWriter to crate an anchor for location instead");
            }
            ao0 ao0Var = (i < 0 || i >= (i2 = this.f9133i) || (iM4993e = sr2.m4993e((arrayList = this.f9140p), i, i2)) < 0) ? null : (ao0) arrayList.get(iM4993e);
            if (ao0Var != null) {
                return (io0) map.get(ao0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dr0(this, 0, this.f9133i);
    }
}
