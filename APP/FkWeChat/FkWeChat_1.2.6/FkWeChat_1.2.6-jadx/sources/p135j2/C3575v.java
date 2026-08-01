package p135j2;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p120i2.AbstractC3167a;
import p121i3.EnumC3191u;

/* JADX INFO: renamed from: j2.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3575v implements InterfaceC3561q0, InterfaceC3566s {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC3566s f9936q;

    /* JADX INFO: renamed from: r */
    public final EnumC3191u f9937r;

    public C3575v(InterfaceC3566s interfaceC3566s, EnumC3191u enumC3191u) {
        this.f9936q = interfaceC3566s;
        this.f9937r = enumC3191u;
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J0 */
    public long mo1223J0(float f10) {
        return this.f9936q.mo1223J0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J1 */
    public long mo1224J1(long j10) {
        return this.f9936q.mo1224J1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O0 */
    public float mo1225O0(int i10) {
        return this.f9936q.mo1225O0(i10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O1 */
    public float mo1226O1(long j10) {
        return this.f9936q.mo1226O1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: R0 */
    public float mo1227R0(float f10) {
        return this.f9936q.mo1227R0(f10);
    }

    @Override // p135j2.InterfaceC3561q0
    /* JADX INFO: renamed from: U1 */
    public InterfaceC3558p0 mo1228U1(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            AbstractC3167a.m11956b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, interfaceC0184l);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: a0 */
    public long mo1229a0(float f10) {
        return this.f9936q.mo1229a0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: c0 */
    public long mo1230c0(long j10) {
        return this.f9936q.mo1230c0(j10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f9936q.mo1231c1();
    }

    @Override // p135j2.InterfaceC3566s
    /* JADX INFO: renamed from: g1 */
    public boolean mo1232g1() {
        return this.f9936q.mo1232g1();
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f9936q.getDensity();
    }

    @Override // p135j2.InterfaceC3566s
    public EnumC3191u getLayoutDirection() {
        return this.f9937r;
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: i1 */
    public float mo1233i1(float f10) {
        return this.f9936q.mo1233i1(f10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: m0 */
    public float mo1234m0(long j10) {
        return this.f9936q.mo1234m0(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: x1 */
    public int mo1236x1(float f10) {
        return this.f9936q.mo1236x1(f10);
    }

    /* JADX INFO: renamed from: j2.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3558p0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9938a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f9939b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f9940c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0184l f9941d;

        public a(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l) {
            this.f9938a = i10;
            this.f9939b = i11;
            this.f9940c = map;
            this.f9941d = interfaceC0184l;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: a */
        public int mo13077a() {
            return this.f9939b;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: e */
        public int mo13078e() {
            return this.f9938a;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: l */
        public Map mo13079l() {
            return this.f9940c;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: p */
        public InterfaceC0184l mo13081p() {
            return this.f9941d;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: m */
        public void mo13080m() {
        }
    }
}
