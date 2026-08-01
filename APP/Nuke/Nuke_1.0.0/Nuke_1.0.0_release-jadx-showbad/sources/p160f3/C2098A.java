package p160f3;

import com.bumptech.glide.AbstractC1923e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p190k3.AbstractC2453a;
import p190k3.C2469q;

/* JADX INFO: renamed from: f3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2098A extends C2469q {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7027h = AtomicIntegerFieldUpdater.newUpdater(C2098A.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.C2469q, p160f3.C2122Z
    /* JADX INFO: renamed from: q */
    public final void mo3875q(Object obj) {
        mo3876u(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.C2469q, p160f3.C2122Z
    /* JADX INFO: renamed from: u */
    public final void mo3876u(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f7027h;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC2453a.m4380h(AbstractC1923e.m3448G(this.f7956g), AbstractC2162v.m3995q(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
