package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq {
    public defpackage.jq a;
    public defpackage.mq b;

    public final void a(defpackage.oq r4, defpackage.iq r5) {
            r3 = this;
            jq r0 = r5.a()
            jq r1 = r3.a
            java.lang.String r2 = "state1"
            defpackage.ip.o(r2, r1)
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L12
            r1 = r0
        L12:
            r3.a = r1
            mq r1 = r3.b
            r1.b(r4, r5)
            r3.a = r0
            return
    }
}
