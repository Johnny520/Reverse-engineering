package p097T1;

import java.security.MessageDigest;
import p200m2.C2603d;
import p200m2.InterfaceC2601b;

/* JADX INFO: renamed from: T1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1420i implements InterfaceC2601b {

    /* JADX INFO: renamed from: d */
    public final MessageDigest f5076d;

    /* JADX INFO: renamed from: e */
    public final C2603d f5077e = new C2603d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1420i(MessageDigest messageDigest) {
        this.f5076d = messageDigest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p200m2.InterfaceC2601b
    /* JADX INFO: renamed from: b */
    public final C2603d mo2253b() {
        return this.f5077e;
    }
}
