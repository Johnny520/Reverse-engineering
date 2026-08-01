package p203;

import androidx.appcompat.app.C0108;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2154;
import androidx.constraintlayout.core.widgets.analyzer.C2146;
import androidx.constraintlayout.core.widgets.analyzer.C2148;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p193.C7828;
import p199.C7866;
import p206.C7911;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7878 extends C7879 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public boolean f21669;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public boolean f21670;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public C7882[] f21671;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public int f21672;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public int f21673;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public C7882[] f21674;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f21675;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public C7866 f21676;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public int f21677;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public int f21678;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final C7911 f21679;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public int f21680;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public WeakReference f21681;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public WeakReference f21682;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final C2149 f21683;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final HashSet f21684;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public WeakReference f21685;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public WeakReference f21686;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public int f21689;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final C2146 f21690;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public ArrayList f21688 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C0108 f21687 = new C0108(this);

    public C7878() {
        C2146 c2146 = new C2146();
        c2146.f6337 = true;
        c2146.f6336 = true;
        c2146.f6334 = new ArrayList();
        new ArrayList();
        c2146.f6333 = null;
        c2146.f6340 = new C2149();
        c2146.f6339 = new ArrayList();
        c2146.f6338 = this;
        c2146.f6335 = this;
        this.f21690 = c2146;
        this.f21676 = null;
        this.f21675 = false;
        this.f21679 = new C7911();
        this.f21678 = 0;
        this.f21672 = 0;
        this.f21671 = new C7882[4];
        this.f21674 = new C7882[4];
        this.f21673 = 257;
        this.f21669 = false;
        this.f21670 = false;
        this.f21685 = null;
        this.f21686 = null;
        this.f21682 = null;
        this.f21681 = null;
        this.f21684 = new HashSet();
        this.f21683 = new C2149();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m13234(C7879 c7879, C7866 c7866, C2149 c2149) {
        int i;
        int i2;
        if (c7866 == null) {
            return;
        }
        int i3 = c7879.f21739;
        int[] iArr = c7879.f21721;
        if (i3 == 8 || (c7879 instanceof C7889) || (c7879 instanceof C7883)) {
            c2149.f6344 = 0;
            c2149.f6343 = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
        c2149.f6348 = constraintWidget$DimensionBehaviourArr[0];
        c2149.f6347 = constraintWidget$DimensionBehaviourArr[1];
        c2149.f6346 = c7879.m13275();
        c2149.f6345 = c7879.m13279();
        c2149.f6351 = false;
        c2149.f6352 = 0;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2149.f6348;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = c2149.f6347 == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && c7879.f21753 > 0.0f;
        boolean z4 = z2 && c7879.f21753 > 0.0f;
        if (z && c7879.m13268(0) && c7879.f21730 == 0 && !z3) {
            c2149.f6348 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z2 && c7879.f21722 == 0) {
                c2149.f6348 = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && c7879.m13268(1) && c7879.f21722 == 0 && !z4) {
            c2149.f6347 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z && c7879.f21730 == 0) {
                c2149.f6347 = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (c7879.mo13256()) {
            c2149.f6348 = ConstraintWidget$DimensionBehaviour.FIXED;
            z = false;
        }
        if (c7879.mo13255()) {
            c2149.f6347 = ConstraintWidget$DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c2149.f6348 = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c2149.f6347;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                    i2 = c2149.f6345;
                } else {
                    c2149.f6348 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    c7866.m13224(c7879, c2149);
                    i2 = c2149.f6343;
                }
                c2149.f6348 = constraintWidget$DimensionBehaviour4;
                c2149.f6346 = (int) (c7879.f21753 * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c2149.f6347 = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c2149.f6348;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6) {
                    i = c2149.f6346;
                } else {
                    c2149.f6347 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    c7866.m13224(c7879, c2149);
                    i = c2149.f6344;
                }
                c2149.f6347 = constraintWidget$DimensionBehaviour6;
                int i4 = c7879.f21757;
                float f = c7879.f21753;
                if (i4 == -1) {
                    c2149.f6345 = (int) (i / f);
                } else {
                    c2149.f6345 = (int) (f * i);
                }
            }
        }
        c7866.m13224(c7879, c2149);
        c7879.m13249(c2149.f6344);
        c7879.m13250(c2149.f6343);
        c7879.f21714 = c2149.f6349;
        c7879.m13260(c2149.f6350);
        c2149.f6352 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0838 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0915 A[PHI: r13 r14
  0x0915: PHI (r13v6 ??) = (r13v5 ??), (r13v8 ??), (r13v8 ??), (r13v8 ??) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]
  0x0915: PHI (r14v10 boolean) = (r14v9 boolean), (r14v14 boolean), (r14v14 boolean), (r14v14 boolean) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x091a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13235() {
        /*
            Method dump skipped, instruction units count: 2359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203.C7878.m13235():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13236(C7879 c7879, int i) {
        if (i == 0) {
            int i2 = this.f21678 + 1;
            C7882[] c7882Arr = this.f21674;
            if (i2 >= c7882Arr.length) {
                this.f21674 = (C7882[]) Arrays.copyOf(c7882Arr, c7882Arr.length * 2);
            }
            C7882[] c7882Arr2 = this.f21674;
            int i3 = this.f21678;
            c7882Arr2[i3] = new C7882(c7879, 0, this.f21675);
            this.f21678 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f21672 + 1;
            C7882[] c7882Arr3 = this.f21671;
            if (i4 >= c7882Arr3.length) {
                this.f21671 = (C7882[]) Arrays.copyOf(c7882Arr3, c7882Arr3.length * 2);
            }
            C7882[] c7882Arr4 = this.f21671;
            int i5 = this.f21672;
            c7882Arr4[i5] = new C7882(c7879, 1, this.f21675);
            this.f21672 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m13237(int i, boolean z) {
        boolean z2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        C2146 c2146 = this.f21690;
        ArrayList<AbstractC2154> arrayList = c2146.f6334;
        C7878 c7878 = c2146.f6338;
        boolean z3 = false;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM13282 = c7878.m13282(0);
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM132822 = c7878.m13282(1);
        int iM13276 = c7878.m13276();
        int iM13269 = c7878.m13269();
        if (z && (constraintWidget$DimensionBehaviourM13282 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || constraintWidget$DimensionBehaviourM132822 == constraintWidget$DimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2154 abstractC2154 = (AbstractC2154) it.next();
                if (abstractC2154.f6357 == i && !abstractC2154.mo3894()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && constraintWidget$DimensionBehaviourM13282 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                    c7878.m13253(ConstraintWidget$DimensionBehaviour.FIXED);
                    c7878.m13249(c2146.m3884(c7878, 0));
                    c7878.f21717.f6358.mo3878(c7878.m13275());
                }
            } else if (z && constraintWidget$DimensionBehaviourM132822 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                c7878.m13252(ConstraintWidget$DimensionBehaviour.FIXED);
                c7878.m13250(c2146.m3884(c7878, 1));
                c7878.f21716.f6358.mo3878(c7878.m13279());
            }
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21695;
        if (i == 0) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
            if (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM13275 = c7878.m13275() + iM13276;
                c7878.f21717.f6365.mo3878(iM13275);
                c7878.f21717.f6358.mo3878(iM13275 - iM13276);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[1];
            if (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM13279 = c7878.m13279() + iM13269;
                c7878.f21716.f6365.mo3878(iM13279);
                c7878.f21716.f6358.mo3878(iM13279 - iM13269);
                z2 = true;
            }
            z2 = false;
        }
        c2146.m3888();
        for (AbstractC2154 abstractC21542 : arrayList) {
            if (abstractC21542.f6357 == i && (abstractC21542.f6361 != c7878 || abstractC21542.f6364)) {
                abstractC21542.mo3890();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC2154 abstractC21543 = (AbstractC2154) it2.next();
            if (abstractC21543.f6357 == i && (z2 || abstractC21543.f6361 != c7878)) {
                if (!abstractC21543.f6363.f6332 || !abstractC21543.f6365.f6332 || (!(abstractC21543 instanceof C2148) && !abstractC21543.f6358.f6332)) {
                    break;
                }
            }
        }
        c7878.m13253(constraintWidget$DimensionBehaviourM13282);
        c7878.m13252(constraintWidget$DimensionBehaviourM132822);
        return z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m13238(C7911 c7911) {
        C7878 c7878;
        C7911 c79112;
        boolean zM13243 = m13243(64);
        mo13266(c7911, zM13243);
        int size = this.f21688.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C7879 c7879 = (C7879) this.f21688.get(i);
            boolean[] zArr = c7879.f21696;
            zArr[0] = false;
            zArr[1] = false;
            if (c7879 instanceof C7883) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C7879 c78792 = (C7879) this.f21688.get(i2);
                if (c78792 instanceof C7883) {
                    C7883 c7883 = (C7883) c78792;
                    for (int i3 = 0; i3 < c7883.f21844; i3++) {
                        C7879 c78793 = c7883.f21845[i3];
                        if (c7883.f21788 || c78793.mo13265()) {
                            int i4 = c7883.f21789;
                            if (i4 == 0 || i4 == 1) {
                                c78793.f21696[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c78793.f21696[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f21684;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C7879 c78794 = (C7879) this.f21688.get(i5);
            c78794.getClass();
            boolean z2 = c78794 instanceof C7884;
            if (z2 || (c78794 instanceof C7889)) {
                if (z2) {
                    hashSet.add(c78794);
                } else {
                    c78794.mo13266(c7911, zM13243);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7884 c7884 = (C7884) ((C7879) it.next());
                for (int i6 = 0; i6 < c7884.f21844; i6++) {
                    if (hashSet.contains(c7884.f21845[i6])) {
                        c7884.mo13266(c7911, zM13243);
                        hashSet.remove(c7884);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C7879) it2.next()).mo13266(c7911, zM13243);
                }
                hashSet.clear();
            }
        }
        if (C7911.f21897) {
            HashSet<C7879> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C7879 c78795 = (C7879) this.f21688.get(i7);
                c78795.getClass();
                if (!(c78795 instanceof C7884) && !(c78795 instanceof C7889)) {
                    hashSet2.add(c78795);
                }
            }
            c7878 = this;
            c79112 = c7911;
            c7878.m13267(this, c79112, hashSet2, this.f21695[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (C7879 c78796 : hashSet2) {
                AbstractC7887.m13309(c7878, c79112, c78796);
                c78796.mo13266(c79112, zM13243);
            }
        } else {
            c7878 = this;
            c79112 = c7911;
            for (int i8 = 0; i8 < size; i8++) {
                C7879 c78797 = (C7879) c7878.f21688.get(i8);
                if (c78797 instanceof C7878) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c78797.f21695;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        c78797.m13253(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        c78797.m13252(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    c78797.mo13266(c79112, zM13243);
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        c78797.m13253(constraintWidget$DimensionBehaviour);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        c78797.m13252(constraintWidget$DimensionBehaviour2);
                    }
                } else {
                    AbstractC7887.m13309(c7878, c79112, c78797);
                    if (!(c78797 instanceof C7884) && !(c78797 instanceof C7889)) {
                        c78797.mo13266(c79112, zM13243);
                    }
                }
            }
        }
        if (c7878.f21678 > 0) {
            AbstractC7887.m13310(c7878, c79112, null, 0);
        }
        if (c7878.f21672 > 0) {
            AbstractC7887.m13310(c7878, c79112, null, 1);
        }
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void mo13239(boolean z, boolean z2) {
        super.mo13239(z, z2);
        int size = this.f21688.size();
        for (int i = 0; i < size; i++) {
            ((C7879) this.f21688.get(i)).mo13239(z, z2);
        }
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo13240() {
        this.f21679.m13382();
        this.f21680 = 0;
        this.f21677 = 0;
        this.f21688.clear();
        super.mo13240();
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo13241(C7828 c7828) {
        super.mo13241(c7828);
        int size = this.f21688.size();
        for (int i = 0; i < size; i++) {
            ((C7879) this.f21688.get(i)).mo13241(c7828);
        }
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13242(StringBuilder sb) {
        sb.append(this.f21738 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f21692);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f21754);
        sb.append("\n");
        Iterator it = this.f21688.iterator();
        while (it.hasNext()) {
            ((C7879) it.next()).mo13242(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m13243(int i) {
        return (this.f21673 & i) == i;
    }
}
