package p119Y;

import java.util.NoSuchElementException;
import p136b0.C1846h;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1718b extends C1717a {

    /* JADX INFO: renamed from: g */
    public final C1723g f5956g;

    /* JADX INFO: renamed from: h */
    public Object f5957h;

    public C1718b(C1723g c1723g, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f5956g = c1723g;
        this.f5957h = obj2;
    }

    @Override // p119Y.C1717a, java.util.Map.Entry
    public final Object getValue() {
        return this.f5957h;
    }

    @Override // p119Y.C1717a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f5957h;
        this.f5957h = obj;
        C1721e c1721e = (C1721e) this.f5956g.f5971e;
        C1846h c1846h = c1721e.f5964g;
        Object obj3 = this.f5954e;
        if (!c1846h.containsKey(obj3)) {
            return obj2;
        }
        boolean z5 = c1721e.f5963f;
        if (!z5) {
            c1846h.put(obj3, obj);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            AbstractC1729m abstractC1729m = c1721e.f5961d[c1721e.f5962e];
            Object obj4 = abstractC1729m.f5981d[abstractC1729m.f5983f];
            c1846h.put(obj3, obj);
            c1721e.m3058c(obj4 != null ? obj4.hashCode() : 0, c1846h.f6250e, obj4, 0);
        }
        c1721e.f5967j = c1846h.f6252g;
        return obj2;
    }
}
