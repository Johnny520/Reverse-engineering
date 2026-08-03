package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends p000.o4 implements p000.f3<java.lang.Boolean> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.ac f381;

    public fc(p000.ac r1) {
            r0 = this;
            r0.f381 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public final java.lang.Boolean mo11() {
            r6 = this;
            ۟.p8 r0 = new ۟.p8
            r0.<init>()
            ۟.p8 r1 = new ۟.p8
            r1.<init>()
            ۟.kb r2 = p000.q.f899
            java.util.concurrent.ExecutorService r2 = ۟.q.c.m346()
            ۟.ac r3 = r6.f381
            ۟.b5 r4 = new ۟.b5
            r5 = 1
            r4.<init>(r3, r0, r1, r5)
            r2.execute(r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }
}
