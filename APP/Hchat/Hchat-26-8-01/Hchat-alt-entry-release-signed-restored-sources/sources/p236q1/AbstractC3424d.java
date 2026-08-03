package p236q1;

import android.view.KeyEvent;
import p085fg.InterfaceC1231l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: q1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3424d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m7197a(int i9) {
        long j3 = (((long) i9) << 32) | (((long) 0) & 4294967295L);
        int i10 = AbstractC3421a.f11064O;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m7198b(KeyEvent keyEvent) {
        return m7197a(keyEvent.getKeyCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m7199c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC5853o m7200d(InterfaceC1231l interfaceC1231l) {
        return new C3423c(interfaceC1231l, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC5853o m7201e(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C3423c(null, interfaceC1231l));
    }
}
