package androidx.compose.runtime.snapshots;

import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.compose.foundation.text.C1833;
import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.collection.C2057;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2106 extends AbstractC2121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int[] f4038 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7387 f4039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f4040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4041;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1082 f4042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f4043;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int[] f4044;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f4045;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ArrayList f4046;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2122 f4047;

    public C2106(long j, C2122 c2122, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        super(j, c2122);
        this.f4040 = interfaceC7387;
        this.f4039 = interfaceC73872;
        this.f4047 = C2122.f4109;
        this.f4044 = f4038;
        this.f4045 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public C2106 mo2775(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        C2105 c2105;
        if (this.f4106) {
            AbstractC2227.m3098("Cannot use a disposed snapshot");
        }
        if (this.f4041 && this.f4105 < 0) {
            AbstractC2227.m3097("Unsupported operation on a disposed or applied snapshot");
        }
        m2786(mo2770());
        Object obj = AbstractC2115.f4090;
        synchronized (obj) {
            long j = AbstractC2115.f4088;
            AbstractC2115.f4088 = j + 1;
            AbstractC2115.f4089 = AbstractC2115.f4089.m2852(j);
            C2122 c2122Mo2764 = mo2764();
            mo2782(c2122Mo2764.m2852(j));
            c2105 = new C2105(j, AbstractC2115.m2820(c2122Mo2764, mo2770() + 1, j), AbstractC2115.m2837(interfaceC7387, mo2763(), true), AbstractC2115.m2838(interfaceC73872, mo2773()), this);
        }
        if (this.f4041 || this.f4106) {
            return c2105;
        }
        long jMo2770 = mo2770();
        synchronized (obj) {
            long j2 = AbstractC2115.f4088;
            AbstractC2115.f4088 = j2 + 1;
            mo2779(j2);
            AbstractC2115.f4089 = AbstractC2115.f4089.m2852(mo2770());
        }
        mo2782(AbstractC2115.m2820(mo2764(), jMo2770 + 1, mo2770()));
        return c2105;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo2776(C1082 c1082) {
        this.f4042 = c1082;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2786(long j) {
        synchronized (AbstractC2115.f4090) {
            this.f4047 = this.f4047.m2852(j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2109 m2787(long j, C1082 c1082, HashMap map, C2122 c2122) {
        ArrayList arrayList;
        ArrayList arrayListM9352;
        ArrayList arrayList2;
        C2122 c21222;
        Object[] objArr;
        long[] jArr;
        C2122 c21223;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        AbstractC2090 abstractC2090Mo2760;
        C2122 c2122M2848 = mo2764().m2852(mo2770()).m2848(this.f4047);
        Object[] objArr3 = c1082.f1345;
        long[] jArr3 = c1082.f1346;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListM9352 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            AbstractC2090 abstractC2090Mo2753 = interfaceC2092.mo2753();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC2090 abstractC2090M2825 = AbstractC2115.m2825(abstractC2090Mo2753, j, c2122);
                            if (abstractC2090M2825 == null) {
                                arrayList3 = arrayListM9352;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListM9352;
                                j2 = j3;
                                AbstractC2090 abstractC2090M28252 = AbstractC2115.m2825(abstractC2090Mo2753, mo2770(), c2122M2848);
                                if (abstractC2090M28252 != null && abstractC2090M28252.f3992 != 1 && !abstractC2090M2825.equals(abstractC2090M28252)) {
                                    c21223 = c2122M2848;
                                    AbstractC2090 abstractC2090M28253 = AbstractC2115.m2825(abstractC2090Mo2753, mo2770(), mo2764());
                                    if (abstractC2090M28253 == null) {
                                        AbstractC2115.m2832();
                                        throw null;
                                    }
                                    if (map == null || (abstractC2090Mo2760 = (AbstractC2090) map.get(abstractC2090M2825)) == null) {
                                        abstractC2090Mo2760 = interfaceC2092.mo2760(abstractC2090M28252, abstractC2090M2825, abstractC2090M28253);
                                    }
                                    if (abstractC2090Mo2760 == null) {
                                        return new C2120(this);
                                    }
                                    if (!abstractC2090Mo2760.equals(abstractC2090M28253)) {
                                        if (abstractC2090Mo2760.equals(abstractC2090M2825)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new Pair(interfaceC2092, abstractC2090M2825.mo2756(mo2770())));
                                            arrayListM9352 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListM9352.add(interfaceC2092);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!abstractC2090Mo2760.equals(abstractC2090M28252) ? new Pair(interfaceC2092, abstractC2090Mo2760) : new Pair(interfaceC2092, abstractC2090M28252.mo2756(mo2770())));
                                        }
                                    }
                                    arrayListM9352 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListM9352 = arrayList3;
                            }
                            c21223 = c2122M2848;
                            arrayList2 = arrayList4;
                            arrayListM9352 = arrayList3;
                        } else {
                            c21223 = c2122M2848;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c2122M2848 = c21223;
                    }
                    c21222 = c2122M2848;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    c21222 = c2122M2848;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                c2122M2848 = c21222;
            }
        } else {
            arrayList = null;
            arrayListM9352 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m2789();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                InterfaceC2092 interfaceC20922 = (InterfaceC2092) pair.component1();
                AbstractC2090 abstractC2090 = (AbstractC2090) pair.component2();
                abstractC2090.f3992 = j;
                synchronized (AbstractC2115.f4090) {
                    abstractC2090.f3991 = interfaceC20922.mo2753();
                    interfaceC20922.mo2754(abstractC2090);
                }
            }
        }
        if (arrayListM9352 != null) {
            int size2 = arrayListM9352.size();
            for (int i6 = 0; i6 < size2; i6++) {
                c1082.m1306((InterfaceC2092) arrayListM9352.get(i6));
            }
            ArrayList arrayList6 = this.f4046;
            if (arrayList6 != null) {
                arrayListM9352 = AbstractC5176.m9352(arrayListM9352, arrayList6);
            }
            this.f4046 = arrayListM9352;
        }
        return C2124.f4117;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: merged with bridge method [inline-methods] */
    public InterfaceC7387 mo2763() {
        return this.f4040;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo2762() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo2765() {
        if (this.f4106) {
            return;
        }
        this.f4106 = true;
        synchronized (AbstractC2115.f4090) {
            m2846();
        }
        mo2772();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2788() {
        AbstractC2115.f4089 = AbstractC2115.f4089.m2850(mo2770()).m2851(this.f4047);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2778(int i) {
        this.f4043 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2109 mo2780() {
        HashMap mapM2822;
        List list;
        C1082 c1082;
        long j;
        long j2;
        C1082 c1082Mo2781 = mo2781();
        if (c1082Mo2781 != null) {
            long j3 = AbstractC2115.f4097.f4107;
            mapM2822 = AbstractC2115.m2822(j3, this, AbstractC2115.f4089.m2850(j3));
        } else {
            mapM2822 = null;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        synchronized (AbstractC2115.f4090) {
            try {
                AbstractC2115.m2821(this);
                if (c1082Mo2781 == null || c1082Mo2781.f1343 == 0) {
                    mo2788();
                    C2107 c2107 = AbstractC2115.f4097;
                    C1082 c10822 = c2107.f4042;
                    AbstractC2115.m2828(c2107, AbstractC2115.f4092);
                    if (c10822 == null || !c10822.m1432()) {
                        list = emptyList;
                        c1082 = null;
                    } else {
                        list = AbstractC2115.f4093;
                        c1082 = c10822;
                    }
                } else {
                    C2107 c21072 = AbstractC2115.f4097;
                    AbstractC2109 abstractC2109M2787 = m2787(AbstractC2115.f4088, c1082Mo2781, mapM2822, AbstractC2115.f4089.m2850(c21072.f4107));
                    if (!abstractC2109M2787.equals(C2124.f4117)) {
                        return abstractC2109M2787;
                    }
                    mo2788();
                    c1082 = c21072.f4042;
                    AbstractC2115.m2828(c21072, AbstractC2115.f4092);
                    mo2776(null);
                    c21072.f4042 = null;
                    list = AbstractC2115.f4093;
                }
                this.f4041 = true;
                if (c1082 != null) {
                    C2057 c2057 = new C2057(c1082);
                    if (!c1082.m1433()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC7383) list.get(i)).invoke(c2057, this);
                        }
                    }
                }
                if (c1082Mo2781 != null && c1082Mo2781.m1432()) {
                    C2057 c20572 = new C2057(c1082Mo2781);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC7383) list.get(i2)).invoke(c20572, this);
                    }
                }
                synchronized (AbstractC2115.f4090) {
                    try {
                        mo2790();
                        AbstractC2115.m2818();
                        if (c1082 != null) {
                            Object[] objArr = c1082.f1345;
                            long[] jArr = c1082.f1346;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                AbstractC2115.m2831((InterfaceC2092) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (c1082Mo2781 != null) {
                            Object[] objArr2 = c1082Mo2781.f1345;
                            long[] jArr2 = c1082Mo2781.f1346;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                AbstractC2115.m2831((InterfaceC2092) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f4046;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                AbstractC2115.m2831((InterfaceC2092) arrayList.get(i9));
                            }
                        }
                        this.f4046 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C2124.f4117;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C1082 mo2781() {
        return this.f4042;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public AbstractC2121 mo2766(InterfaceC7387 interfaceC7387) {
        C2104 c2104;
        if (this.f4106) {
            AbstractC2227.m3098("Cannot use a disposed snapshot");
        }
        if (this.f4041 && this.f4105 < 0) {
            AbstractC2227.m3097("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo2770 = mo2770();
        m2786(mo2770());
        Object obj = AbstractC2115.f4090;
        synchronized (obj) {
            long j = AbstractC2115.f4088;
            AbstractC2115.f4088 = j + 1;
            AbstractC2115.f4089 = AbstractC2115.f4089.m2852(j);
            c2104 = new C2104(j, AbstractC2115.m2820(mo2764(), jMo2770 + 1, j), AbstractC2115.m2837(interfaceC7387, mo2763(), true), this);
        }
        if (this.f4041 || this.f4106) {
            return c2104;
        }
        long jMo27702 = mo2770();
        synchronized (obj) {
            long j2 = AbstractC2115.f4088;
            AbstractC2115.f4088 = j2 + 1;
            mo2779(j2);
            AbstractC2115.f4089 = AbstractC2115.f4089.m2852(mo2770());
        }
        mo2782(AbstractC2115.m2820(mo2764(), jMo27702 + 1, mo2770()));
        return c2104;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2789() {
        m2786(mo2770());
        if (this.f4041 || this.f4106) {
            return;
        }
        long jMo2770 = mo2770();
        synchronized (AbstractC2115.f4090) {
            long j = AbstractC2115.f4088;
            AbstractC2115.f4088 = j + 1;
            mo2779(j);
            AbstractC2115.f4089 = AbstractC2115.f4089.m2852(mo2770());
        }
        mo2782(AbstractC2115.m2820(mo2764(), jMo2770 + 1, mo2770()));
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo2768(InterfaceC2092 interfaceC2092) {
        C1082 c1082Mo2781 = mo2781();
        if (c1082Mo2781 == null) {
            C1082 c1082 = AbstractC1132.f1342;
            c1082Mo2781 = new C1082();
            mo2776(c1082Mo2781);
        }
        c1082Mo2781.m1301(interfaceC2092);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo2769() {
        if (this.f4041 || this.f4106) {
            return;
        }
        m2789();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo2790() {
        int length = this.f4044.length;
        for (int i = 0; i < length; i++) {
            AbstractC2115.m2827(this.f4044[i]);
        }
        m2846();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2783() {
        return this.f4043;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2771() {
        this.f4045++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2772() {
        if (this.f4045 <= 0) {
            AbstractC2227.m3098("no pending nested snapshots");
        }
        int i = this.f4045 - 1;
        this.f4045 = i;
        if (i != 0 || this.f4041) {
            return;
        }
        C1082 c1082Mo2781 = mo2781();
        if (c1082Mo2781 != null) {
            if (this.f4041) {
                AbstractC2227.m3097("Unsupported operation on a snapshot that has been applied");
            }
            mo2776(null);
            long jMo2770 = mo2770();
            Object[] objArr = c1082Mo2781.f1345;
            long[] jArr = c1082Mo2781.f1346;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (AbstractC2090 abstractC2090Mo2753 = ((InterfaceC2092) objArr[(i2 << 3) + i4]).mo2753(); abstractC2090Mo2753 != null; abstractC2090Mo2753 = abstractC2090Mo2753.f3991) {
                                    long j2 = abstractC2090Mo2753.f3992;
                                    if (j2 == jMo2770 || AbstractC5176.m9365(this.f4047, Long.valueOf(j2))) {
                                        C1833 c1833 = AbstractC2115.f4092;
                                        abstractC2090Mo2753.f3992 = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m2845();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC7387 mo2773() {
        return this.f4039;
    }
}
