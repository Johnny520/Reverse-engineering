package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1327;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1202;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0299 f1203;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f1204;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC1327 f1205;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f1206;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f1207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC1395 f1208;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractC0343 f1209;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC1397 f1210;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f1211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1395 f1212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f1213;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0358 f1214;

    public C0351(C0364 c0364, Object obj, AbstractC0343 abstractC0343, InterfaceC0358 interfaceC0358) {
        this.f1202 = c0364;
        this.f1214 = interfaceC0358;
        InterfaceC1395 interfaceC1395M2474 = AbstractC1367.m2474(obj);
        this.f1212 = interfaceC1395M2474;
        Object objInvoke = null;
        this.f1213 = AbstractC1367.m2474(AbstractC0330.m1014(0.0f, 0.0f, null, 7));
        this.f1207 = AbstractC1367.m2474(new C0374(m1051(), interfaceC0358, obj, ((AbstractC1347) interfaceC1395M2474).getValue(), abstractC0343));
        this.f1206 = AbstractC1367.m2474(Boolean.TRUE);
        this.f1210 = AbstractC1367.m2478(-1.0f);
        this.f1208 = AbstractC1367.m2474(obj);
        this.f1209 = abstractC0343;
        this.f1205 = AbstractC1367.m2476(m1052().mo1003());
        Float f = (Float) AbstractC0320.f1086.get(interfaceC0358);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC0343 abstractC03432 = (AbstractC0343) interfaceC0358.mo1062().invoke(obj);
            int iMo1040 = abstractC03432.mo1040();
            for (int i = 0; i < iMo1040; i++) {
                abstractC03432.mo1037(fFloatValue, i);
            }
            objInvoke = this.f1214.mo1061().invoke(abstractC03432);
        }
        this.f1203 = AbstractC0330.m1014(0.0f, 0.0f, objInvoke, 3);
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return ((AbstractC1347) this.f1208).getValue();
    }

    public final String toString() {
        return "current value: " + ((AbstractC1347) this.f1208).getValue() + ", target: " + ((AbstractC1347) this.f1212).getValue() + ", spec: " + m1051();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1048(Object obj) {
        this.f1208.setValue(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1049() {
        if (m1050() == -1.0f) {
            this.f1204 = true;
            if (AbstractC4395.m8907(m1052().f1277, m1052().f1276)) {
                m1048(m1052().f1277);
            } else {
                m1048(m1052().mo999(0L));
                this.f1209 = m1052().mo1001(0L);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m1050() {
        return ((AbstractC1349) this.f1210).m2434();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0311 m1051() {
        return (InterfaceC0311) ((AbstractC1347) this.f1213).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0374 m1052() {
        return (C0374) ((AbstractC1347) this.f1207).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1053(Object obj, Object obj2, InterfaceC0311 interfaceC0311) {
        ((AbstractC1347) this.f1212).setValue(obj2);
        ((AbstractC1347) this.f1213).setValue(interfaceC0311);
        if (AbstractC4395.m8907(m1052().f1276, obj) && AbstractC4395.m8907(m1052().f1277, obj2)) {
            return;
        }
        m1054(obj, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1054(Object obj, boolean z) {
        AbstractC1347 abstractC1347 = (AbstractC1347) this.f1212;
        boolean zM8907 = AbstractC4395.m8907(null, abstractC1347.getValue());
        AbstractC1327 abstractC1327 = this.f1205;
        InterfaceC1395 interfaceC1395 = this.f1207;
        if (zM8907) {
            ((AbstractC1347) interfaceC1395).setValue(new C0374(this.f1203, this.f1214, obj, obj, this.f1209.mo1039()));
            this.f1211 = true;
            abstractC1327.m2398(m1052().mo1003());
            return;
        }
        InterfaceC0311 interfaceC0311M1051 = (!z || this.f1204 || (m1051() instanceof C0299)) ? m1051() : this.f1203;
        C0364 c0364 = this.f1202;
        long jM1064 = c0364.m1064();
        InterfaceC1395 interfaceC13952 = c0364.f1245;
        long jMax = 0;
        ((AbstractC1347) interfaceC1395).setValue(new C0374(jM1064 <= 0 ? interfaceC0311M1051 : new C0298(interfaceC0311M1051, c0364.m1064()), this.f1214, obj, abstractC1347.getValue(), this.f1209));
        abstractC1327.m2398(m1052().mo1003());
        this.f1211 = false;
        ((AbstractC1347) interfaceC13952).setValue(Boolean.TRUE);
        if (c0364.m1070()) {
            SnapshotStateList snapshotStateList = c0364.f1248;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                C0351 c0351 = (C0351) snapshotStateList.get(i);
                jMax = Math.max(jMax, c0351.f1205.m2397());
                c0351.m1049();
            }
            ((AbstractC1347) interfaceC13952).setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1055(Object obj, InterfaceC0311 interfaceC0311) {
        if (this.f1211 && AbstractC4395.m8907(obj, null)) {
            return;
        }
        InterfaceC1395 interfaceC1395 = this.f1212;
        if (AbstractC4395.m8907(((AbstractC1347) interfaceC1395).getValue(), obj) && m1050() == -1.0f) {
            return;
        }
        ((AbstractC1347) interfaceC1395).setValue(obj);
        ((AbstractC1347) this.f1213).setValue(interfaceC0311);
        Object value = m1050() == -3.0f ? obj : ((AbstractC1347) this.f1208).getValue();
        InterfaceC1395 interfaceC13952 = this.f1206;
        m1054(value, !((Boolean) ((AbstractC1347) interfaceC13952).getValue()).booleanValue());
        ((AbstractC1347) interfaceC13952).setValue(Boolean.valueOf(m1050() == -3.0f));
        if (m1050() >= 0.0f) {
            m1048(m1052().mo999((long) (m1050() * m1052().mo1003())));
        } else if (m1050() == -3.0f) {
            m1048(obj);
        }
        this.f1211 = false;
        ((AbstractC1349) this.f1210).m2435(-1.0f);
    }
}
