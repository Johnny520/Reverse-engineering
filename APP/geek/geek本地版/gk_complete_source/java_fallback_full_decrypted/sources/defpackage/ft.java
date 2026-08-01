package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ft extends defpackage.l {
    public final /* synthetic */ defpackage.d4 a;

    public ft(defpackage.d4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.l
    public final int a() {
            r1 = this;
            d4 r0 = r1.a
            java.lang.Object r0 = r0.b
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // defpackage.l, java.util.List, java.util.Collection
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
            d4 r0 = r1.a
            java.lang.Object r0 = r0.b
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r2 = r0.group(r2)
            if (r2 != 0) goto Le
            java.lang.String r2 = ""
        Le:
            return r2
    }

    @Override // defpackage.l, java.util.List
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

    @Override // defpackage.l, java.util.List
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
