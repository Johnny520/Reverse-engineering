package p223p0;

import bsh.C0353j;
import p069f.C0958s;
import p176m1.C2731f0;
import p266s0.C3877g;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3273a extends C0958s {

    /* JADX INFO: renamed from: j */
    public final C2731f0 f10421j;

    /* JADX INFO: renamed from: k */
    public Object f10422k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3273a(C2731f0 c2731f0, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.f10421j = c2731f0;
        this.f10422k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069f.C0958s, java.util.Map.Entry
    public final Object getValue() {
        return this.f10422k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069f.C0958s, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f10422k;
        this.f10422k = obj;
        C3276d c3276d = (C3276d) this.f10421j.f8875h;
        C3877g c3877g = c3276d.f10429j;
        Object obj3 = this.f3017h;
        if (!c3877g.containsKey(obj3)) {
            return obj2;
        }
        boolean z9 = c3276d.f10428i;
        if (!z9) {
            c3877g.put(obj3, obj);
        } else {
            if (!z9) {
                C0353j.m1307e();
                return null;
            }
            AbstractC3283k abstractC3283k = c3276d.f10426g[c3276d.f10427h];
            Object obj4 = abstractC3283k.f10444g[abstractC3283k.f10446i];
            c3877g.put(obj3, obj);
            c3276d.m6941d(obj4 != null ? obj4.hashCode() : 0, c3877g.f12728h, obj4, 0);
        }
        c3276d.f10432m = c3877g.f12730j;
        return obj2;
    }
}
