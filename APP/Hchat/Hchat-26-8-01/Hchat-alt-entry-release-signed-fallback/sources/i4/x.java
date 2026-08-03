package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends i4.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6492h;

    @Override // i4.i
    public final int k() {
            r2 = this;
            int r0 = r2.f6461g
            int r1 = r2.f6492h
            if (r0 >= r1) goto Lb
            int r1 = r0 + 1
            r2.f6461g = r1
            return r0
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
