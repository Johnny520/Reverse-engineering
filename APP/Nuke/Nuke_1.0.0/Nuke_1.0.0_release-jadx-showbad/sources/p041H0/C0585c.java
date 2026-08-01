package p041H0;

import p011B4.AbstractC0231b;
import p198m0.InterfaceC2586q;

/* JADX INFO: renamed from: H0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0585c implements InterfaceC2586q {

    /* JADX INFO: renamed from: a */
    public static final C0585c f1865a = new C0585c();

    /* JADX INFO: renamed from: b */
    public static Boolean f1866b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p198m0.InterfaceC2586q
    /* JADX INFO: renamed from: c */
    public final boolean mo955c() {
        Boolean bool = f1866b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0231b.m396g("canFocus is read before it is written");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p198m0.InterfaceC2586q
    /* JADX INFO: renamed from: d */
    public final void mo956d(boolean z5) {
        f1866b = Boolean.valueOf(z5);
    }
}
