package a;

/* JADX INFO: renamed from: a.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462xa extends a.AbstractC0433w<java.lang.String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.Z7 f763a;

    public C0462xa(a.Z7 r1) {
            r0 = this;
            r0.<init>()
            r0.f763a = r1
            return
    }

    @Override // a.AbstractC0397u
    public final int a() {
            r1 = this;
            a.Z7 r0 = r1.f763a
            java.lang.Object r0 = r0.f371a
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // a.AbstractC0397u, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = super.contains(r2)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            a.Z7 r0 = r1.f763a
            java.lang.Object r0 = r0.f371a
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r2 = r0.group(r2)
            if (r2 != 0) goto Le
            java.lang.String r2 = ""
        Le:
            return r2
    }

    @Override // a.AbstractC0433w, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = super.indexOf(r2)
            return r2
    }

    @Override // a.AbstractC0433w, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = super.lastIndexOf(r2)
            return r2
    }
}
