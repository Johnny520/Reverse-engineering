package p000a;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: a.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945z0 extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final String f3557b;

    /* JADX INFO: renamed from: c */
    public final C0020B0 f3558c;

    public C0945z0(DexKitBridge dexKitBridge, String str, C0020B0 c0020b0) {
        super(dexKitBridge, -1, -1);
        this.f3557b = str;
        this.f3558c = c0020b0;
    }

    public final String toString() {
        String str = this.f3557b + " = " + this.f3558c;
        C0631i9.m1481d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
