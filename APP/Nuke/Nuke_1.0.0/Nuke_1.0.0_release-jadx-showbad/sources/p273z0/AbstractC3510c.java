package p273z0;

import android.view.KeyEvent;
import p112W2.InterfaceC1601c;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3510c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m5763a(int i5) {
        long j5 = (((long) i5) << 32) | (((long) 0) & 4294967295L);
        int i6 = AbstractC3508a.f10924F;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m5764b(KeyEvent keyEvent) {
        return m5763a(keyEvent.getKeyCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m5765c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC2207p m5766d(InterfaceC1601c interfaceC1601c) {
        return new C3511d(interfaceC1601c, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC2207p m5767e(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C3511d(null, interfaceC1601c));
    }
}
