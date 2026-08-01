package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 extends m91 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4226g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4226g) {
            case 0:
                int i = this.f3891f;
                this.f3891f = i + 2;
                Object[] objArr = this.f3889d;
                return new id0(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f3891f;
                this.f3891f = i2 + 2;
                return this.f3889d[i2];
            default:
                int i3 = this.f3891f;
                this.f3891f = i3 + 2;
                return this.f3889d[i3 + 1];
        }
    }
}
