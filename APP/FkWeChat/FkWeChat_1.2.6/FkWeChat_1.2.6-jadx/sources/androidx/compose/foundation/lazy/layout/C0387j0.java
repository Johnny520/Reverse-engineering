package androidx.compose.foundation.lazy.layout;

import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p117i.AbstractC3077p;
import p117i.C3058h0;
import p121i3.EnumC3191u;
import p135j2.InterfaceC3510c2;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0387j0 implements InterfaceC0383i0, InterfaceC3561q0 {

    /* JADX INFO: renamed from: q */
    public final C0428v f1113q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3510c2 f1114r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0437y f1115s;

    /* JADX INFO: renamed from: t */
    public final C3058h0 f1116t = AbstractC3077p.m11480c();

    /* JADX INFO: renamed from: u */
    public final C3058h0 f1117u = AbstractC3077p.m11480c();

    public C0387j0(C0428v c0428v, InterfaceC3510c2 interfaceC3510c2) {
        this.f1113q = c0428v;
        this.f1114r = interfaceC3510c2;
        this.f1115s = (InterfaceC0437y) c0428v.m1426d().invoke();
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J0 */
    public long mo1223J0(float f10) {
        return this.f1114r.mo1223J0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J1 */
    public long mo1224J1(long j10) {
        return this.f1114r.mo1224J1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O0 */
    public float mo1225O0(int i10) {
        return this.f1114r.mo1225O0(i10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O1 */
    public float mo1226O1(long j10) {
        return this.f1114r.mo1226O1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: R0 */
    public float mo1227R0(float f10) {
        return this.f1114r.mo1227R0(f10);
    }

    @Override // p135j2.InterfaceC3561q0
    /* JADX INFO: renamed from: U1 */
    public InterfaceC3558p0 mo1228U1(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        return this.f1114r.mo1228U1(i10, i11, map, interfaceC0184l, interfaceC0184l2);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: a0 */
    public long mo1229a0(float f10) {
        return this.f1114r.mo1229a0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: c0 */
    public long mo1230c0(long j10) {
        return this.f1114r.mo1230c0(j10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f1114r.mo1231c1();
    }

    @Override // p135j2.InterfaceC3566s
    /* JADX INFO: renamed from: g1 */
    public boolean mo1232g1() {
        return this.f1114r.mo1232g1();
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f1114r.getDensity();
    }

    @Override // p135j2.InterfaceC3566s
    public EnumC3191u getLayoutDirection() {
        return this.f1114r.getLayoutDirection();
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: i1 */
    public float mo1233i1(float f10) {
        return this.f1114r.mo1233i1(f10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: m0 */
    public float mo1234m0(long j10) {
        return this.f1114r.mo1234m0(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0383i0
    /* JADX INFO: renamed from: u1 */
    public List mo1214u1(int i10) {
        List list = (List) this.f1117u.m11449b(i10);
        if (list != null) {
            return list;
        }
        Object objMo1452b = this.f1115s.mo1452b(i10);
        List listMo13072z1 = this.f1114r.mo13072z1(objMo1452b, this.f1113q.m1424b(i10, objMo1452b, this.f1115s.mo1454f(i10)));
        this.f1117u.m11326r(i10, listMo13072z1);
        return listMo13072z1;
    }

    @Override // p135j2.InterfaceC3561q0
    /* JADX INFO: renamed from: x0 */
    public InterfaceC3558p0 mo1235x0(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l) {
        return this.f1114r.mo1235x0(i10, i11, map, interfaceC0184l);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: x1 */
    public int mo1236x1(float f10) {
        return this.f1114r.mo1236x1(f10);
    }
}
