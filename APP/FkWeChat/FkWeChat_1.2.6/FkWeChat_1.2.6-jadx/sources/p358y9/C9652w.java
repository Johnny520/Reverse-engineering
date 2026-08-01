package p358y9;

import ga.C2602l;
import ga.EnumC2599k;
import java.util.Collection;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: y9.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9652w {

    /* JADX INFO: renamed from: a */
    public final C2602l f32878a;

    /* JADX INFO: renamed from: b */
    public final Collection f32879b;

    /* JADX INFO: renamed from: c */
    public final boolean f32880c;

    public /* synthetic */ C9652w(C2602l c2602l, Collection collection, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(c2602l, collection, (i10 & 4) != 0 ? c2602l.m9269c() == EnumC2599k.f6899s : z10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9652w m37755b(C9652w c9652w, C2602l c2602l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2602l = c9652w.f32878a;
        }
        if ((i10 & 2) != 0) {
            collection = c9652w.f32879b;
        }
        if ((i10 & 4) != 0) {
            z10 = c9652w.f32880c;
        }
        return c9652w.m37756a(c2602l, collection, z10);
    }

    /* JADX INFO: renamed from: a */
    public final C9652w m37756a(C2602l c2602l, Collection collection, boolean z10) {
        c2602l.getClass();
        collection.getClass();
        return new C9652w(c2602l, collection, z10);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37757c() {
        return this.f32880c;
    }

    /* JADX INFO: renamed from: d */
    public final C2602l m37758d() {
        return this.f32878a;
    }

    /* JADX INFO: renamed from: e */
    public final Collection m37759e() {
        return this.f32879b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9652w)) {
            return false;
        }
        C9652w c9652w = (C9652w) obj;
        return AbstractC1061t.m3842c(this.f32878a, c9652w.f32878a) && AbstractC1061t.m3842c(this.f32879b, c9652w.f32879b) && this.f32880c == c9652w.f32880c;
    }

    public int hashCode() {
        return (((this.f32878a.hashCode() * 31) + this.f32879b.hashCode()) * 31) + Boolean.hashCode(this.f32880c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f32878a + ", qualifierApplicabilityTypes=" + this.f32879b + ", definitelyNotNull=" + this.f32880c + ')';
    }

    public C9652w(C2602l c2602l, Collection collection, boolean z10) {
        c2602l.getClass();
        collection.getClass();
        this.f32878a = c2602l;
        this.f32879b = collection;
        this.f32880c = z10;
    }
}
