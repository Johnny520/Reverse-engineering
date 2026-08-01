package p041V;

import p037T.C0265p;

/* JADX INFO: renamed from: V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0312e implements InterfaceC0323p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f686c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0312e(int i2, String str) {
        this.f685b = i2;
        this.f686c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.InterfaceC0323p
    /* JADX INFO: renamed from: n */
    public final Object mo143n() {
        switch (this.f685b) {
            case 0:
                throw new C0265p(this.f686c);
            case 1:
                throw new C0265p(this.f686c);
            default:
                throw new C0265p(this.f686c);
        }
    }
}
