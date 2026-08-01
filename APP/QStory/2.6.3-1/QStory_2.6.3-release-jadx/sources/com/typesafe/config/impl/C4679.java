package com.typesafe.config.impl;

import androidx.compose.p001ui.graphics.C2444;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.C4697;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4679 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f12413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4690 f12415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4697 f12416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4683 f12417;

    public C4679(C4683 c4683, C4697 c4697, C4690 c4690, ArrayList arrayList, Set set) {
        this.f12417 = c4683;
        this.f12416 = c4697;
        this.f12415 = c4690;
        this.f12414 = arrayList;
        this.f12413 = set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4679 m8782(C4690 c4690) {
        if (c4690 == this.f12415) {
            return this;
        }
        return new C4679(this.f12417, this.f12416, c4690, this.f12414, this.f12413);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4684 m8783(AbstractC4675 abstractC4675, C4681 c4681) {
        C4685 c4685;
        C4679 c4679M8784;
        C4684 c4684;
        if (AbstractC4695.m8799()) {
            AbstractC4695.m8801(m8785(), "resolving " + abstractC4675 + " restrictToChild=" + this.f12415 + " in " + c4681);
        }
        if (AbstractC4695.m8799()) {
            AbstractC4695.m8801(m8785(), "pushing trace " + abstractC4675);
        }
        ArrayList arrayList = new ArrayList(this.f12414);
        arrayList.add(abstractC4675);
        C4683 c4683 = this.f12417;
        C4697 c4697 = this.f12416;
        C4690 c4690 = this.f12415;
        Set set = this.f12413;
        final C4679 c4679 = new C4679(c4683, c4697, c4690, arrayList, set);
        C4685 c46852 = new C4685(abstractC4675, null);
        AbstractC4675 abstractC4675M8788 = c4683.m8788(c46852);
        if (abstractC4675M8788 != null || c4690 == null) {
            c4685 = null;
        } else {
            C4685 c46853 = new C4685(abstractC4675, c4690);
            AbstractC4675 abstractC4675M87882 = c4683.m8788(c46853);
            c4685 = c46853;
            abstractC4675M8788 = abstractC4675M87882;
        }
        if (abstractC4675M8788 != null) {
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c4679.m8785(), "using cached resolution " + abstractC4675M8788 + " for " + abstractC4675 + " restrictToChild " + c4690);
            }
            c4684 = new C4684(c4679, abstractC4675M8788);
        } else {
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c4679.m8785(), "not found in cache, resolving " + abstractC4675 + "@" + System.identityHashCode(abstractC4675));
            }
            if (set.contains(abstractC4675)) {
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c4679.m8785(), "Cycle detected, can't resolve; " + abstractC4675 + "@" + System.identityHashCode(abstractC4675));
                }
                throw new Exception(c4679) { // from class: com.typesafe.config.impl.AbstractConfigValue$NotPossibleToResolve
                    private static final long serialVersionUID = 1;
                    private final String traceString;

                    {
                        super("was not possible to resolve");
                        StringBuilder sb = new StringBuilder();
                        for (AbstractC4675 abstractC46752 : c4679.f12414) {
                        }
                        if (sb.length() > 0) {
                            sb.setLength(sb.length() - 2);
                        }
                        this.traceString = sb.toString();
                    }

                    public String traceString() {
                        return this.traceString;
                    }
                };
            }
            C4684 c4684ResolveSubstitutions = abstractC4675.resolveSubstitutions(c4679, c4681);
            AbstractC4675 abstractC46752 = c4684ResolveSubstitutions.f12423;
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c4679.m8785(), "resolved to " + abstractC46752 + "@" + System.identityHashCode(abstractC46752) + " from " + abstractC4675 + "@" + System.identityHashCode(abstractC46752));
            }
            C4679 c46792 = c4684ResolveSubstitutions.f12424;
            if (abstractC46752 == null || abstractC46752.resolveStatus() == ResolveStatus.RESOLVED) {
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c4679.m8785(), "caching " + c46852 + " result " + abstractC46752);
                }
                c4679M8784 = c46792.m8784(c46852, abstractC46752);
            } else {
                if (c4690 == null) {
                    c4697.getClass();
                    C3775.m6968("resolveSubstitutions() did not give us a resolved object");
                    return null;
                }
                if (c4685 == null) {
                    C3775.m6968("restrictedKey should not be null here");
                    return null;
                }
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c4679.m8785(), "caching " + c4685 + " result " + abstractC46752);
                }
                c4679M8784 = c46792.m8784(c4685, abstractC46752);
            }
            c4684 = new C4684(c4679M8784, abstractC46752);
        }
        C4679 c46793 = c4684.f12424;
        c46793.getClass();
        ArrayList arrayList2 = new ArrayList(c46793.f12414);
        AbstractC4675 abstractC46753 = (AbstractC4675) arrayList2.remove(r13.size() - 1);
        if (AbstractC4695.m8799()) {
            AbstractC4695.m8801(c46793.m8785() - 1, "popped trace " + abstractC46753);
        }
        return new C4684(new C4679(c46793.f12417, c46793.f12416, c46793.f12415, arrayList2, c46793.f12413), c4684.f12423);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4679 m8784(C4685 c4685, AbstractC4675 abstractC4675) {
        C2444[] c2444Arr;
        int i;
        C4674 c4674 = this.f12417.f12422;
        int i2 = c4674.f12412 + 1;
        C2444[] c2444Arr2 = c4674.f12411;
        if (i2 > c2444Arr2.length) {
            int i3 = (i2 * 2) - 1;
            int i4 = 0;
            while (true) {
                int[] iArr = C4674.f12409;
                if (i4 >= 174) {
                    i = iArr[173];
                    break;
                }
                i = iArr[i4];
                if (i > i3) {
                    break;
                }
                i4++;
            }
            c2444Arr = new C2444[i];
        } else {
            c2444Arr = new C2444[c2444Arr2.length];
        }
        if (c2444Arr.length == c2444Arr2.length) {
            System.arraycopy(c2444Arr2, 0, c2444Arr, 0, c2444Arr2.length);
        } else {
            for (C2444 c2444 : c2444Arr2) {
                while (c2444 != null) {
                    C2444 c24442 = (C2444) c2444.f5059;
                    int i5 = c2444.f5062;
                    int length = i5 % c2444Arr.length;
                    C2444 c24443 = c2444Arr[length];
                    if (c24443 == null && c24442 == null) {
                        c2444Arr[length] = c2444;
                    } else {
                        c2444Arr[length] = new C2444(i5, (C4685) c2444.f5061, c2444.f5060, c24443);
                    }
                    c2444 = c24442;
                }
            }
        }
        int iAbs = Math.abs(c4685.hashCode());
        int length2 = iAbs % c2444Arr.length;
        c2444Arr[length2] = new C2444(iAbs, c4685, abstractC4675, c2444Arr[length2]);
        return new C4679(new C4683(new C4674(i2, c2444Arr)), this.f12416, this.f12415, this.f12414, this.f12413);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8785() {
        ArrayList arrayList = this.f12414;
        if (arrayList.size() <= 30) {
            return arrayList.size();
        }
        C3775.m6968("resolve getting too deep");
        return 0;
    }
}
