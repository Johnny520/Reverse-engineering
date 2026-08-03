package p000;

/* JADX INFO: renamed from: yq */
/* JADX INFO: loaded from: classes.dex */
public final class C2770yq extends AbstractC0000A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2813zq f9416a;

    public C2770yq(C2813zq r1) {
        this.f9416a = r1;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f9416a.f9532a.groupCount() + 1;
    }

    @Override // p000.AbstractC0000A, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return false;
    L7:
        return super.contains((String) r2);
    }

    @Override // java.util.List
    public final Object get(int r2) {
        String r22 = this.f9416a.f9532a.group(r2);
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return -1;
    L7:
        return super.indexOf((String) r2);
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return -1;
    L7:
        return super.lastIndexOf((String) r2);
    }
}
