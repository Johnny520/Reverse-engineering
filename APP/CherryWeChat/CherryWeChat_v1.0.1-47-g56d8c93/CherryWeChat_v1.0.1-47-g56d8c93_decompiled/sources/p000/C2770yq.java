package p000;

/* JADX INFO: renamed from: yq */
/* JADX INFO: loaded from: classes.dex */
public final class C2770yq extends AbstractC0000A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2813zq f9416a;

    public C2770yq(C2813zq c2813zq) {
        this.f9416a = c2813zq;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f9416a.f9532a.groupCount() + 1;
    }

    @Override // p000.AbstractC0000A, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f9416a.f9532a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
