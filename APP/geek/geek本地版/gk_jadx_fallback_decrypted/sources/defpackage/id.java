package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class id implements defpackage.oe {
    public final defpackage.ge a;

    public id(defpackage.ge r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.oe
    public final defpackage.ge e() {
            r1 = this;
            ge r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoroutineScope(coroutineContext="
            r0.<init>(r1)
            ge r1 = r2.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
