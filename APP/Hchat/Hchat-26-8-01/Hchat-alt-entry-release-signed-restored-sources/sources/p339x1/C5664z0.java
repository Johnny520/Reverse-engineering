package p339x1;

import gg.AbstractC1416l;
import p131j0.C2046b;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5851m;

/* JADX INFO: renamed from: x1.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5664z0 {

    /* JADX INFO: renamed from: a */
    public AbstractC5852n f23051a;

    /* JADX INFO: renamed from: b */
    public int f23052b;

    /* JADX INFO: renamed from: c */
    public C2046b f23053c;

    /* JADX INFO: renamed from: d */
    public C2046b f23054d;

    /* JADX INFO: renamed from: e */
    public boolean f23055e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5587b1 f23056f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5664z0(C5587b1 c5587b1, AbstractC5852n abstractC5852n, int i9, C2046b c2046b, C2046b c2046b2, boolean z9) {
        this.f23056f = c5587b1;
        this.f23051a = abstractC5852n;
        this.f23052b = i9;
        this.f23053c = c2046b;
        this.f23054d = c2046b2;
        this.f23055e = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m10229a(int i9, int i10) {
        C2046b c2046b = this.f23053c;
        int i11 = this.f23052b;
        InterfaceC5851m interfaceC5851m = (InterfaceC5851m) c2046b.f6891g[i9 + i11];
        InterfaceC5851m interfaceC5851m2 = (InterfaceC5851m) this.f23054d.f6891g[i11 + i10];
        return AbstractC1416l.m3825a(interfaceC5851m, interfaceC5851m2) || interfaceC5851m.getClass() == interfaceC5851m2.getClass();
    }
}
