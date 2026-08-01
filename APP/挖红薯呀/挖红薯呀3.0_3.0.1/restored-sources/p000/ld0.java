package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements g30 {

    /* JADX INFO: renamed from: a */
    public final long f3419a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f3420b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final C0111d f3421c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ld0(xg0 xg0Var, long j) {
        this.f3419a = j;
        this.f3421c = new C0111d(9, xg0Var.f7344a, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.g30
    /* JADX INFO: renamed from: a */
    public final InterfaceC0296hu mo1196a() {
        return this.f3421c;
    }
}
