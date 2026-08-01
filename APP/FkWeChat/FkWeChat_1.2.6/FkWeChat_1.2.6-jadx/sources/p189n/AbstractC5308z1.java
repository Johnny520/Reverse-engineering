package p189n;

import android.os.Build;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p121i3.C3182l;
import p165l1.InterfaceC4507m;
import p277t2.C8072g0;

/* JADX INFO: renamed from: n.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5308z1 {

    /* JADX INFO: renamed from: a */
    public static final C8072g0 f16310a = new C8072g0("MagnifierPositionInRoot", (InterfaceC0188p) null, 2, (AbstractC1043k) null);

    /* JADX INFO: renamed from: a */
    public static final boolean m21637a(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    /* JADX INFO: renamed from: b */
    public static final C8072g0 m21638b() {
        return f16310a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21639c(int i10) {
        return i10 >= 28;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m21640d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return m21639c(i10);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4507m m21641e(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC5250m2 interfaceC5250m2) {
        if (m21640d(0, 1, null)) {
            return interfaceC4507m.mo17445i(new C5284t1(interfaceC0184l, interfaceC0184l2, interfaceC0184l3, f10, z10, j10, f11, f12, z11, interfaceC5250m2 == null ? InterfaceC5250m2.f16151a.m21487a() : interfaceC5250m2, null));
        }
        return interfaceC4507m;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC4507m m21642f(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC5250m2 interfaceC5250m2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC0184l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC0184l3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = C3182l.f8467b.m12037a();
        }
        if ((i10 & 64) != 0) {
            f11 = C3179i.f8458r.m12012c();
        }
        if ((i10 & 128) != 0) {
            f12 = C3179i.f8458r.m12012c();
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            interfaceC5250m2 = null;
        }
        return m21641e(interfaceC4507m, interfaceC0184l, interfaceC0184l2, interfaceC0184l3, f10, z10, j10, f11, f12, z11, interfaceC5250m2);
    }
}
