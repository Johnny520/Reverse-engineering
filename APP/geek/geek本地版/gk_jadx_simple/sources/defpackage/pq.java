package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq {
    public jq a;
    public mq b;

    public final void a(oq r4, iq r5) {
        jq r0 = r5.a();
        jq r1 = this.a;
        ip.o("state1", r1);
        if (r0.compareTo(r1) >= 0) goto L5;
        r1 = r0;
    L5:
        this.a = r1;
        this.b.b(r4, r5);
        this.a = r0;
    }
}
