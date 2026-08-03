package p257r7;

import okhttp3.internal.http2.Settings;
import p152k7.AbstractC2331a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3719i extends AbstractC3721k {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f12086q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3719i(int i9, int i10) {
        super(i9);
        this.f12086q = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: P */
    public final int mo7727P() {
        switch (this.f12086q) {
            case 0:
                int iM5542x = AbstractC2331a.m5542x(this.f12076k, 0);
                if (iM5542x == 65535) {
                    return -1;
                }
                return iM5542x * 4;
            default:
                return AbstractC2331a.m5539s(this.f12076k, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3721k
    /* JADX INFO: renamed from: S */
    public final void mo7728S(int i9) {
        int i10;
        switch (this.f12086q) {
            case 0:
                if (i9 == -1) {
                    i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                } else {
                    i10 = i9 / 4;
                    AbstractC3721k.m7732R(i10);
                }
                AbstractC2331a.m5535E(this.f12076k, 0, i10);
                break;
            default:
                AbstractC2331a.m5534D(this.f12076k, 0, i9);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f12086q) {
            case 0:
                AbstractC3721k abstractC3721k = (AbstractC3721k) obj;
                if (abstractC3721k == this) {
                    return 0;
                }
                return AbstractC5999a.m10739b(mo7729N(), abstractC3721k.mo7729N());
            default:
                AbstractC3721k abstractC3721k2 = (AbstractC3721k) obj;
                if (abstractC3721k2 == this) {
                    return 0;
                }
                return AbstractC5999a.m10739b(mo7729N(), abstractC3721k2.mo7729N());
        }
    }
}
