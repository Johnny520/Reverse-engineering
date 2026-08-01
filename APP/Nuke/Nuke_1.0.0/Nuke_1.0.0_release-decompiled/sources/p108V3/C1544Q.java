package p108V3;

import p011B4.AbstractC0231b;
import p044H3.AbstractC0646a;
import p053J3.C0859t;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: V3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1544Q {

    /* JADX INFO: renamed from: a */
    public final AbstractC0646a f5366a;

    /* JADX INFO: renamed from: b */
    public final String f5367b;

    /* JADX INFO: renamed from: c */
    public final EnumC1545S f5368c;

    /* JADX INFO: renamed from: d */
    public final String f5369d;

    /* JADX INFO: renamed from: e */
    public final C0859t f5370e;

    /* JADX INFO: renamed from: f */
    public final Throwable f5371f;

    public C1544Q(AbstractC0646a abstractC0646a, String str, EnumC1545S enumC1545S, String str2, C0859t c0859t, Throwable th) {
        AbstractC1665j.m2985e(str, "displayName");
        AbstractC1665j.m2985e(str2, "reason");
        this.f5366a = abstractC0646a;
        this.f5367b = str;
        this.f5368c = enumC1545S;
        this.f5369d = str2;
        this.f5370e = c0859t;
        this.f5371f = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1544Q)) {
            return false;
        }
        C1544Q c1544q = (C1544Q) obj;
        return this.f5366a.equals(c1544q.f5366a) && AbstractC1665j.m2981a(this.f5367b, c1544q.f5367b) && this.f5368c == c1544q.f5368c && AbstractC1665j.m2981a(this.f5369d, c1544q.f5369d) && AbstractC1665j.m2981a(this.f5370e, c1544q.f5370e) && AbstractC1665j.m2981a(this.f5371f, c1544q.f5371f);
    }

    public final int hashCode() {
        int iM394e = AbstractC0231b.m394e((this.f5368c.hashCode() + AbstractC0231b.m394e(this.f5366a.hashCode() * 31, 961, this.f5367b)) * 31, 31, this.f5369d);
        C0859t c0859t = this.f5370e;
        int iHashCode = (iM394e + (c0859t == null ? 0 : c0859t.hashCode())) * 31;
        Throwable th = this.f5371f;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "HookerDebugItem(hooker=" + this.f5366a + ", displayName=" + this.f5367b + ", description=null, status=" + this.f5368c + ", reason=" + this.f5369d + ", record=" + this.f5370e + ", inMemoryThrowable=" + this.f5371f + ")";
    }
}
