package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import p119i1.C3128g0;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: androidx.compose.runtime.j5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0522j5 {
    /* JADX INFO: renamed from: a */
    public static final SnapshotStateList m1769a() {
        return new SnapshotStateList();
    }

    /* JADX INFO: renamed from: b */
    public static final SnapshotStateList m1770b(Object... objArr) {
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(AbstractC5106t.m20713V0(objArr));
        return snapshotStateList;
    }

    /* JADX INFO: renamed from: c */
    public static final C3128g0 m1771c() {
        return new C3128g0();
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0512i2 m1772d(Object obj, InterfaceC0466b5 interfaceC0466b5) {
        return AbstractC0529k5.m1834a(obj, interfaceC0466b5);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC0512i2 m1773e(Object obj, InterfaceC0466b5 interfaceC0466b5, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC0466b5 = AbstractC0473c5.m1579r();
        }
        return AbstractC0473c5.m1570i(obj, interfaceC0466b5);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0564p5 m1774f(Object obj, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = m1773e(obj, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        interfaceC0512i2.setValue(obj);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }
}
