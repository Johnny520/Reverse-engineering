package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui implements defpackage.vo {
    public final boolean a;

    public ui(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.vo
    public final boolean a() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @Override // defpackage.vo
    public final defpackage.mw d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r1 = r2.a
            if (r1 == 0) goto Le
            java.lang.String r1 = "Active"
            goto L10
        Le:
            java.lang.String r1 = "New"
        L10:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
