package p121i4;

/* JADX INFO: renamed from: i4.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1983x extends C1968i {

    /* JADX INFO: renamed from: h */
    public int f6712h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.C1968i
    /* JADX INFO: renamed from: k */
    public final int mo4868k() {
        int i9 = this.f6681g;
        if (i9 >= this.f6712h) {
            throw new IndexOutOfBoundsException();
        }
        this.f6681g = i9 + 1;
        return i9;
    }
}
