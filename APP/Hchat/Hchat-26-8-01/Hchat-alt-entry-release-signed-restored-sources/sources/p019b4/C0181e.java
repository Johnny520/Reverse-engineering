package p019b4;

import android.os.Build;
import p000a.AbstractC0000a;
import p031c4.C0393c;
import p031c4.C0396f;
import p031c4.InterfaceC0395e;

/* JADX INFO: renamed from: b4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0181e implements InterfaceC0180d {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0395e f464b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0181e() {
        this.f464b = Build.VERSION.SDK_INT >= 34 ? C0396f.f1094b : C0393c.f1089f;
        AbstractC0000a.m72k(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
