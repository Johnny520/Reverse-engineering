package p042W;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p037T.AbstractC0274y;
import p037T.C0265p;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0350v extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f797a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [W.x.<clinit>():void] */
    public /* synthetic */ C0350v(int i2) {
        this.f797a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        switch (this.f797a) {
            case 0:
                return new AtomicBoolean(c0493b.mo578n());
            default:
                try {
                    return new AtomicInteger(c0493b.mo580p());
                } catch (NumberFormatException e2) {
                    throw new C0265p(e2);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        switch (this.f797a) {
            case 0:
                c0494c.mo597q(((AtomicBoolean) obj).get());
                break;
            default:
                c0494c.mo593m(((AtomicInteger) obj).get());
                break;
        }
    }
}
