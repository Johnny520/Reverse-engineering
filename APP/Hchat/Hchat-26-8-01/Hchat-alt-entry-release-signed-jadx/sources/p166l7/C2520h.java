package p166l7;

import bsh.org.objectweb.asm.Opcodes;
import java.util.HashMap;

/* JADX INFO: renamed from: l7.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2520h {

    /* JADX INFO: renamed from: c */
    public static final C2520h[] f8148c;

    /* JADX INFO: renamed from: a */
    public final int f8149a;

    /* JADX INFO: renamed from: b */
    public final String f8150b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2520h[] c2520hArr = {new C2520h(1, "public"), new C2520h(2, "system"), new C2520h(4, "vendor"), new C2520h(8, "product"), new C2520h(16, "signature"), new C2520h(32, "odm"), new C2520h(64, "oem"), new C2520h(128, "actor"), new C2520h(Opcodes.ACC_NATIVE, "config")};
        f8148c = c2520hArr;
        HashMap map = new HashMap();
        for (int i9 = 0; i9 < 9; i9++) {
            C2520h c2520h = c2520hArr[i9];
            map.put(c2520h.f8150b, c2520h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2520h(int i9, String str) {
        this.f8149a = i9;
        this.f8150b = str;
    }
}
