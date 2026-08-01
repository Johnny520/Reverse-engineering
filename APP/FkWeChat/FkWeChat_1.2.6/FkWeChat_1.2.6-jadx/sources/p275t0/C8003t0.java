package p275t0;

import java.util.List;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.AbstractC3188r;
import p121i3.C3181k;
import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p172l8.C4700i0;
import p180m3.InterfaceC4960u;
import p185m8.AbstractC5114x;
import p264s0.AbstractC6742g6;
import p275t0.C7948d1;

/* JADX INFO: renamed from: t0.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8003t0 implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final long f26605a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e f26606b;

    /* JADX INFO: renamed from: c */
    public final int f26607c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p f26608d;

    /* JADX INFO: renamed from: e */
    public final C7948d1.a f26609e;

    /* JADX INFO: renamed from: f */
    public final C7948d1.a f26610f;

    /* JADX INFO: renamed from: g */
    public final C7948d1.a f26611g;

    /* JADX INFO: renamed from: h */
    public final C7948d1.a f26612h;

    /* JADX INFO: renamed from: i */
    public final C7948d1.b f26613i;

    /* JADX INFO: renamed from: j */
    public final C7948d1.b f26614j;

    /* JADX INFO: renamed from: k */
    public final C7948d1.b f26615k;

    /* JADX INFO: renamed from: l */
    public final C7948d1.b f26616l;

    /* JADX INFO: renamed from: m */
    public final C7948d1.b f26617m;

    public C8003t0(long j10, InterfaceC3175e interfaceC3175e, int i10, InterfaceC0188p interfaceC0188p) {
        this.f26605a = j10;
        this.f26606b = interfaceC3175e;
        this.f26607c = i10;
        this.f26608d = interfaceC0188p;
        int iMo1236x1 = interfaceC3175e.mo1236x1(C3181k.m12019e(j10));
        C7948d1 c7948d1 = C7948d1.f26500a;
        this.f26609e = c7948d1.m30685g(iMo1236x1);
        this.f26610f = c7948d1.m30682d(iMo1236x1);
        this.f26611g = c7948d1.m30683e(0);
        this.f26612h = c7948d1.m30684f(0);
        int iMo1236x12 = interfaceC3175e.mo1236x1(C3181k.m12020f(j10));
        this.f26613i = c7948d1.m30686h(iMo1236x12);
        this.f26614j = c7948d1.m30679a(iMo1236x12);
        this.f26615k = c7948d1.m30681c(iMo1236x12);
        this.f26616l = c7948d1.m30687i(i10);
        this.f26617m = c7948d1.m30680b(i10);
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m30774b(C3187q c3187q, C3187q c3187q2) {
        return C4700i0.f13910a;
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        C3187q c3187q2;
        long j12;
        char c10;
        int iMo30688a;
        int i10;
        int i11;
        char c11 = ' ';
        int i12 = (int) (j10 >> 32);
        List listM20803r = AbstractC5114x.m20803r(this.f26609e, this.f26610f, C3185o.m12049i(c3187q.m12066e()) < i12 / 2 ? this.f26611g : this.f26612h);
        int size = listM20803r.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                c3187q2 = c3187q;
                j12 = j10;
                c10 = c11;
                iMo30688a = 0;
                break;
            }
            C7948d1.a aVar = (C7948d1.a) listM20803r.get(i13);
            int i14 = (int) (j11 >> c11);
            int i15 = size;
            c10 = c11;
            j12 = j10;
            int i16 = i13;
            c3187q2 = c3187q;
            iMo30688a = aVar.mo30688a(c3187q2, j12, i14, enumC3191u);
            if (i16 == AbstractC5114x.m20802q(listM20803r) || (iMo30688a >= 0 && i14 + iMo30688a <= i12)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c11 = c10;
        }
        int i17 = (int) (j12 & 4294967295L);
        List listM20803r2 = AbstractC5114x.m20803r(this.f26613i, this.f26614j, this.f26615k, C3185o.m12050j(c3187q2.m12066e()) < i17 / 2 ? this.f26616l : this.f26617m);
        int size2 = listM20803r2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j11 & 4294967295L);
            int iMo30689a = ((C7948d1.b) listM20803r2.get(i18)).mo30689a(c3187q2, j12, i19);
            if (i18 == AbstractC5114x.m20802q(listM20803r2) || (iMo30689a >= (i11 = this.f26607c) && i19 + iMo30689a <= i17 - i11)) {
                i10 = iMo30689a;
                break;
            }
        }
        i10 = 0;
        long jM12044d = C3185o.m12044d((((long) iMo30688a) << c10) | (((long) i10) & 4294967295L));
        this.f26608d.invoke(c3187q2, AbstractC3188r.m12077a(jM12044d, j11));
        return jM12044d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8003t0)) {
            return false;
        }
        C8003t0 c8003t0 = (C8003t0) obj;
        return C3181k.m12018d(this.f26605a, c8003t0.f26605a) && AbstractC1061t.m3842c(this.f26606b, c8003t0.f26606b) && this.f26607c == c8003t0.f26607c && AbstractC1061t.m3842c(this.f26608d, c8003t0.f26608d);
    }

    public int hashCode() {
        return (((((C3181k.m12021g(this.f26605a) * 31) + this.f26606b.hashCode()) * 31) + Integer.hashCode(this.f26607c)) * 31) + this.f26608d.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C3181k.m12022h(this.f26605a)) + ", density=" + this.f26606b + ", verticalMargin=" + this.f26607c + ", onPositionCalculated=" + this.f26608d + ')';
    }

    public /* synthetic */ C8003t0(long j10, InterfaceC3175e interfaceC3175e, int i10, InterfaceC0188p interfaceC0188p, AbstractC1043k abstractC1043k) {
        this(j10, interfaceC3175e, i10, interfaceC0188p);
    }

    public /* synthetic */ C8003t0(long j10, InterfaceC3175e interfaceC3175e, int i10, InterfaceC0188p interfaceC0188p, int i11, AbstractC1043k abstractC1043k) {
        this(j10, interfaceC3175e, (i11 & 4) != 0 ? interfaceC3175e.mo1236x1(AbstractC6742g6.m26722k()) : i10, (i11 & 8) != 0 ? new InterfaceC0188p() { // from class: t0.s0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return C8003t0.m30774b((C3187q) obj, (C3187q) obj2);
            }
        } : interfaceC0188p, null);
    }
}
