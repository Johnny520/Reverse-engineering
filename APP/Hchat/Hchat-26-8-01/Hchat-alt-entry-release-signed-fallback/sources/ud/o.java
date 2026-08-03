package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends md.e implements ud.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f13712i;

    public o(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f13712i = r1
            return
    }

    public o(ud.p r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r0.add(r3)
            r2.f13712i = r0
            return
    }

    @Override // ud.h
    public final java.util.List g() {
            r1 = this;
            java.util.List r0 = r1.f13712i
            return r0
    }

    @Override // ud.j
    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = "IC"
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "InsnContainer"
            return r0
    }
}
