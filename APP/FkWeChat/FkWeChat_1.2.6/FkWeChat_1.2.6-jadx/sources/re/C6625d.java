package re;

import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import re.AbstractC6630i;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: re.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6625d implements InterfaceC6627f.b {

    /* JADX INFO: renamed from: a */
    public final AbstractC6630i.a f20750a;

    /* JADX INFO: renamed from: b */
    public final Collection f20751b;

    /* JADX INFO: renamed from: c */
    public final Collection f20752c;

    public C6625d(AbstractC6630i.a aVar, Collection collection, Collection collection2) {
        aVar.getClass();
        collection.getClass();
        collection2.getClass();
        this.f20750a = aVar;
        this.f20751b = collection;
        this.f20752c = collection2;
    }

    @Override // re.InterfaceC6627f.b
    /* JADX INFO: renamed from: a */
    public Collection mo26250a() {
        return this.f20752c;
    }

    @Override // re.InterfaceC6627f.b
    /* JADX INFO: renamed from: b */
    public Collection mo26251b() {
        return this.f20751b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC6630i.a m26252c() {
        return this.f20750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6625d)) {
            return false;
        }
        C6625d c6625d = (C6625d) obj;
        return AbstractC1061t.m3842c(this.f20750a, c6625d.f20750a) && AbstractC1061t.m3842c(this.f20751b, c6625d.f20751b) && AbstractC1061t.m3842c(this.f20752c, c6625d.f20752c);
    }

    public int hashCode() {
        return (((this.f20750a.hashCode() * 31) + this.f20751b.hashCode()) * 31) + this.f20752c.hashCode();
    }

    public String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.f20750a + ", parsedNodes=" + this.f20751b + ", rangesToProcessFurther=" + this.f20752c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6625d(AbstractC6630i.a aVar, Collection collection, List list) {
        this(aVar, collection, (Collection) AbstractC5112w.m20789e(list));
        aVar.getClass();
        collection.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6625d(AbstractC6630i.a aVar, Collection collection) {
        this(aVar, collection, (Collection) AbstractC5114x.m20800o());
        aVar.getClass();
        collection.getClass();
    }
}
