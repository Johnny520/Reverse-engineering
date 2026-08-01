package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1327;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f1242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0364 f1243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0361 f1244;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1245;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1395 f1247;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final SnapshotStateList f1248;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final SnapshotStateList f1249;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1241 = AbstractC1367.m2474(m1066());

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f1240 = AbstractC1367.m2474(new C0352(m1066(), m1066()));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1327 f1239 = AbstractC1367.m2476(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC1327 f1246 = AbstractC1367.m2476(Long.MIN_VALUE);

    public C0364(AbstractC0361 abstractC0361, C0364 c0364, String str) {
        this.f1244 = abstractC0361;
        this.f1243 = c0364;
        this.f1242 = str;
        Boolean bool = Boolean.FALSE;
        this.f1245 = AbstractC1367.m2474(bool);
        this.f1248 = new SnapshotStateList();
        this.f1249 = new SnapshotStateList();
        this.f1247 = AbstractC1367.m2474(bool);
        AbstractC1367.m2496(new C0371(this, 1));
        abstractC0361.getClass();
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.f1248;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C0351) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC0353 m1063() {
        return (InterfaceC0353) ((AbstractC1347) this.f1240).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1064() {
        C0364 c0364 = this.f1243;
        return c0364 != null ? c0364.m1064() : this.f1239.m2397();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1065() {
        SnapshotStateList snapshotStateList = this.f1248;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((C0351) snapshotStateList.get(i)).getClass();
        }
        SnapshotStateList snapshotStateList2 = this.f1249;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C0364) snapshotStateList2.get(i2)).m1065()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1066() {
        return ((AbstractC1347) ((C0302) this.f1244).f1034).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m1067() {
        SnapshotStateList snapshotStateList = this.f1248;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((C0351) snapshotStateList.get(i)).f1205.m2397());
        }
        SnapshotStateList snapshotStateList2 = this.f1249;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((C0364) snapshotStateList2.get(i2)).m1067());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1068(Object obj, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2360(obj) : c1324.m2378(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            c1324.m2339();
        } else if (m1070()) {
            c1324.m2392(467722849);
            c1324.m2377(false);
        } else {
            c1324.m2392(466062241);
            m1071(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (z || objM2345 == c1353) {
                objM2345 = AbstractC1367.m2496(new C0371(this, i3));
                c1324.m2386(objM2345);
            }
            if (((Boolean) ((InterfaceC1333) objM2345).getValue()).booleanValue()) {
                c1324.m2392(466470356);
                Object objM23452 = c1324.m2345();
                if (objM23452 == c1353) {
                    objM23452 = AbstractC1367.m2498(EmptyCoroutineContext.INSTANCE, c1324);
                    c1324.m2386(objM23452);
                }
                InterfaceC5401 interfaceC5401 = (InterfaceC5401) objM23452;
                boolean zM2378 = c1324.m2378(interfaceC5401) | (i4 == 32);
                Object objM23453 = c1324.m2345();
                if (zM2378 || objM23453 == c1353) {
                    objM23453 = new C0372(interfaceC5401, i3, this);
                    c1324.m2386(objM23453);
                }
                AbstractC1367.m2485(interfaceC5401, this, (InterfaceC6558) objM23453, c1324);
                c1324.m2377(false);
            } else {
                c1324.m2392(467712929);
                c1324.m2377(false);
            }
            c1324.m2377(false);
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0356(i, 0, this, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1069(long j, boolean z) {
        AbstractC1327 abstractC1327 = this.f1246;
        long jM2397 = abstractC1327.m2397();
        AbstractC0361 abstractC0361 = this.f1244;
        if (jM2397 == Long.MIN_VALUE) {
            abstractC1327.m2398(j);
            ((AbstractC1347) abstractC0361.f1233).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((AbstractC1347) abstractC0361.f1233).getValue()).booleanValue()) {
            ((AbstractC1347) abstractC0361.f1233).setValue(Boolean.TRUE);
        }
        ((AbstractC1347) this.f1245).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f1248;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            C0351 c0351 = (C0351) snapshotStateList.get(i);
            InterfaceC1395 interfaceC1395 = c0351.f1206;
            InterfaceC1395 interfaceC13952 = c0351.f1206;
            if (!((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
                long jMo1003 = z ? c0351.m1052().mo1003() : j;
                c0351.m1048(c0351.m1052().mo999(jMo1003));
                c0351.f1209 = c0351.m1052().mo1001(jMo1003);
                if (c0351.m1052().m1000(jMo1003)) {
                    ((AbstractC1347) interfaceC13952).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((AbstractC1347) interfaceC13952).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f1249;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0364 c0364 = (C0364) snapshotStateList2.get(i2);
            if (!AbstractC4395.m8907(((AbstractC1347) c0364.f1241).getValue(), c0364.m1066())) {
                c0364.m1069(j, z);
            }
            if (!AbstractC4395.m8907(((AbstractC1347) c0364.f1241).getValue(), c0364.m1066())) {
                z2 = false;
            }
        }
        if (z2) {
            m1072();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1070() {
        return ((Boolean) ((AbstractC1347) this.f1247).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1071(Object obj) {
        InterfaceC1395 interfaceC1395 = this.f1241;
        AbstractC1347 abstractC1347 = (AbstractC1347) interfaceC1395;
        if (AbstractC4395.m8907(abstractC1347.getValue(), obj)) {
            return;
        }
        ((AbstractC1347) this.f1240).setValue(new C0352(abstractC1347.getValue(), obj));
        if (!AbstractC4395.m8907(m1066(), abstractC1347.getValue())) {
            ((AbstractC1347) ((C0302) this.f1244).f1034).setValue(abstractC1347.getValue());
        }
        ((AbstractC1347) interfaceC1395).setValue(obj);
        if (this.f1246.m2397() == Long.MIN_VALUE) {
            ((AbstractC1347) this.f1245).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.f1248;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1349) ((C0351) snapshotStateList.get(i)).f1210).m2435(-2.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1072() {
        this.f1246.m2398(Long.MIN_VALUE);
        AbstractC0361 abstractC0361 = this.f1244;
        if (abstractC0361 instanceof C0302) {
            ((AbstractC1347) ((C0302) abstractC0361).f1034).setValue(((AbstractC1347) this.f1241).getValue());
        }
        if (this.f1243 == null) {
            this.f1239.m2398(0L);
        }
        ((AbstractC1347) abstractC0361.f1233).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f1249;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((C0364) snapshotStateList.get(i)).m1072();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1073(Object obj, Object obj2) {
        this.f1246.m2398(Long.MIN_VALUE);
        AbstractC0361 abstractC0361 = this.f1244;
        ((AbstractC1347) abstractC0361.f1233).setValue(Boolean.FALSE);
        boolean zM1070 = m1070();
        InterfaceC1395 interfaceC1395 = this.f1241;
        if (!zM1070 || !AbstractC4395.m8907(m1066(), obj) || !AbstractC4395.m8907(((AbstractC1347) interfaceC1395).getValue(), obj2)) {
            if (!AbstractC4395.m8907(m1066(), obj) && (abstractC0361 instanceof C0302)) {
                ((AbstractC1347) ((C0302) abstractC0361).f1034).setValue(obj);
            }
            ((AbstractC1347) interfaceC1395).setValue(obj2);
            ((AbstractC1347) this.f1247).setValue(Boolean.TRUE);
            ((AbstractC1347) this.f1240).setValue(new C0352(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f1249;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            C0364 c0364 = (C0364) snapshotStateList.get(i);
            c0364.getClass();
            if (c0364.m1070()) {
                c0364.m1073(c0364.m1066(), ((AbstractC1347) c0364.f1241).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.f1248;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C0351) snapshotStateList2.get(i2)).m1049();
        }
    }
}
