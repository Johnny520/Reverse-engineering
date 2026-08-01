package p264s0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p166l2.InterfaceC4553j;
import p189n.InterfaceC5279s1;
import p248r.InterfaceC6432h;
import p265s1.C7128q1;
import p265s1.InterfaceC7143t1;

/* JADX INFO: renamed from: s0.g8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6744g8 implements InterfaceC5279s1 {

    /* JADX INFO: renamed from: a */
    public final boolean f21380a;

    /* JADX INFO: renamed from: b */
    public final float f21381b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7143t1 f21382c;

    /* JADX INFO: renamed from: d */
    public final long f21383d;

    /* JADX INFO: renamed from: s0.g8$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7143t1 {
        public a() {
        }

        @Override // p265s1.InterfaceC7143t1
        /* JADX INFO: renamed from: a */
        public final long mo3692a() {
            return C6744g8.this.f21383d;
        }
    }

    public C6744g8(boolean z10, float f10, InterfaceC7143t1 interfaceC7143t1, long j10) {
        this.f21380a = z10;
        this.f21381b = f10;
        this.f21382c = interfaceC7143t1;
        this.f21383d = j10;
    }

    @Override // p189n.InterfaceC5279s1
    /* JADX INFO: renamed from: a */
    public InterfaceC4553j mo21520a(InterfaceC6432h interfaceC6432h) {
        InterfaceC7143t1 aVar = this.f21382c;
        if (aVar == null) {
            aVar = new a();
        }
        return new C6991w4(interfaceC6432h, this.f21380a, this.f21381b, aVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6744g8)) {
            return false;
        }
        C6744g8 c6744g8 = (C6744g8) obj;
        if (this.f21380a == c6744g8.f21380a && C3179i.m12005m(this.f21381b, c6744g8.f21381b) && AbstractC1061t.m3842c(this.f21382c, c6744g8.f21382c)) {
            return C7128q1.m28131q(this.f21383d, c6744g8.f21383d);
        }
        return false;
    }

    @Override // p189n.InterfaceC5279s1
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f21380a) * 31) + C3179i.m12006n(this.f21381b)) * 31;
        InterfaceC7143t1 interfaceC7143t1 = this.f21382c;
        return ((iHashCode + (interfaceC7143t1 != null ? interfaceC7143t1.hashCode() : 0)) * 31) + C7128q1.m28137w(this.f21383d);
    }

    public /* synthetic */ C6744g8(boolean z10, float f10, long j10, AbstractC1043k abstractC1043k) {
        this(z10, f10, j10);
    }

    public C6744g8(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC7143t1) null, j10);
    }
}
