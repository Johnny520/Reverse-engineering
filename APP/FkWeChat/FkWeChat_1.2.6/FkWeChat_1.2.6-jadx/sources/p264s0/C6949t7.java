package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import p024b9.AbstractC1043k;
import p148k.AbstractC3877g0;
import p265s1.C7128q1;
import p317w0.EnumC9032w;

/* JADX INFO: renamed from: s0.t7 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6949t7 {

    /* JADX INFO: renamed from: a */
    public final long f22880a;

    /* JADX INFO: renamed from: b */
    public final long f22881b;

    /* JADX INFO: renamed from: c */
    public final long f22882c;

    /* JADX INFO: renamed from: d */
    public final long f22883d;

    public C6949t7(long j10, long j11, long j12, long j13) {
        this.f22880a = j10;
        this.f22881b = j11;
        this.f22882c = j12;
        this.f22883d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final C6949t7 m27540a(long j10, long j11, long j12, long j13) {
        return new C6949t7(j10 != 16 ? j10 : this.f22880a, j11 != 16 ? j11 : this.f22881b, j12 != 16 ? j12 : this.f22882c, j13 != 16 ? j13 : this.f22883d, null);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0564p5 m27541b(boolean z10, boolean z11, InterfaceC0572r interfaceC0572r, int i10) {
        InterfaceC0564p5 interfaceC0564p5M1577p;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1840145292, i10, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:223)");
        }
        long j10 = (z10 && z11) ? this.f22880a : (!z10 || z11) ? (z10 || !z11) ? this.f22883d : this.f22882c : this.f22881b;
        if (z10) {
            interfaceC0572r.mo2163V(1194696477);
            interfaceC0564p5M1577p = AbstractC3877g0.m15379a(j10, AbstractC6822l6.m27054b(EnumC9032w.f30867t, interfaceC0572r, 6), null, null, interfaceC0572r, 0, 12);
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(1194874138);
            interfaceC0564p5M1577p = AbstractC0473c5.m1577p(C7128q1.m28125k(j10), interfaceC0572r, 0);
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M1577p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6949t7)) {
            return false;
        }
        C6949t7 c6949t7 = (C6949t7) obj;
        return C7128q1.m28131q(this.f22880a, c6949t7.f22880a) && C7128q1.m28131q(this.f22881b, c6949t7.f22881b) && C7128q1.m28131q(this.f22882c, c6949t7.f22882c) && C7128q1.m28131q(this.f22883d, c6949t7.f22883d);
    }

    public int hashCode() {
        return (((((C7128q1.m28137w(this.f22880a) * 31) + C7128q1.m28137w(this.f22881b)) * 31) + C7128q1.m28137w(this.f22882c)) * 31) + C7128q1.m28137w(this.f22883d);
    }

    public /* synthetic */ C6949t7(long j10, long j11, long j12, long j13, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13);
    }
}
