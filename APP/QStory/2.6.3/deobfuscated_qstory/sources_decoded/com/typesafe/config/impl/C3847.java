package com.typesafe.config.impl;

import androidx.compose.ui.graphics.C1609;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.C3865;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f12068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3858 f12070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3865 f12071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3851 f12072;

    public C3847(C3851 c3851, C3865 c3865, C3858 c3858, ArrayList arrayList, Set set) {
        this.f12072 = c3851;
        this.f12071 = c3865;
        this.f12070 = c3858;
        this.f12069 = arrayList;
        this.f12068 = set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3847 m8223(C3858 c3858) {
        if (c3858 == this.f12070) {
            return this;
        }
        return new C3847(this.f12072, this.f12071, c3858, this.f12069, this.f12068);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3852 m8224(AbstractC3843 abstractC3843, C3849 c3849) {
        C3853 c3853;
        C3847 c3847M8225;
        C3852 c3852;
        if (AbstractC3863.m8240()) {
            AbstractC3863.m8242(m8226(), "resolving " + abstractC3843 + " restrictToChild=" + this.f12070 + " in " + c3849);
        }
        if (AbstractC3863.m8240()) {
            AbstractC3863.m8242(m8226(), "pushing trace " + abstractC3843);
        }
        ArrayList arrayList = new ArrayList(this.f12069);
        arrayList.add(abstractC3843);
        C3851 c3851 = this.f12072;
        C3865 c3865 = this.f12071;
        C3858 c3858 = this.f12070;
        Set set = this.f12068;
        final C3847 c3847 = new C3847(c3851, c3865, c3858, arrayList, set);
        C3853 c38532 = new C3853(abstractC3843, null);
        AbstractC3843 abstractC3843M8229 = c3851.m8229(c38532);
        if (abstractC3843M8229 != null || c3858 == null) {
            c3853 = null;
        } else {
            C3853 c38533 = new C3853(abstractC3843, c3858);
            AbstractC3843 abstractC3843M82292 = c3851.m8229(c38533);
            c3853 = c38533;
            abstractC3843M8229 = abstractC3843M82292;
        }
        if (abstractC3843M8229 != null) {
            if (AbstractC3863.m8240()) {
                AbstractC3863.m8242(c3847.m8226(), "using cached resolution " + abstractC3843M8229 + " for " + abstractC3843 + " restrictToChild " + c3858);
            }
            c3852 = new C3852(c3847, abstractC3843M8229);
        } else {
            if (AbstractC3863.m8240()) {
                AbstractC3863.m8242(c3847.m8226(), "not found in cache, resolving " + abstractC3843 + "@" + System.identityHashCode(abstractC3843));
            }
            if (set.contains(abstractC3843)) {
                if (AbstractC3863.m8240()) {
                    AbstractC3863.m8242(c3847.m8226(), "Cycle detected, can't resolve; " + abstractC3843 + "@" + System.identityHashCode(abstractC3843));
                }
                throw new Exception(c3847) { // from class: com.typesafe.config.impl.AbstractConfigValue$NotPossibleToResolve
                    private static final long serialVersionUID = 1;
                    private final String traceString;

                    {
                        super("was not possible to resolve");
                        StringBuilder sb = new StringBuilder();
                        for (AbstractC3843 abstractC38432 : c3847.f12069) {
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
            C3852 c3852ResolveSubstitutions = abstractC3843.resolveSubstitutions(c3847, c3849);
            AbstractC3843 abstractC38432 = c3852ResolveSubstitutions.f12078;
            if (AbstractC3863.m8240()) {
                AbstractC3863.m8242(c3847.m8226(), "resolved to " + abstractC38432 + "@" + System.identityHashCode(abstractC38432) + " from " + abstractC3843 + "@" + System.identityHashCode(abstractC38432));
            }
            C3847 c38472 = c3852ResolveSubstitutions.f12079;
            if (abstractC38432 == null || abstractC38432.resolveStatus() == ResolveStatus.RESOLVED) {
                if (AbstractC3863.m8240()) {
                    AbstractC3863.m8242(c3847.m8226(), "caching " + c38532 + " result " + abstractC38432);
                }
                c3847M8225 = c38472.m8225(c38532, abstractC38432);
            } else {
                if (c3858 == null) {
                    c3865.getClass();
                    C2942.m6408("resolveSubstitutions() did not give us a resolved object");
                    return null;
                }
                if (c3853 == null) {
                    C2942.m6408("restrictedKey should not be null here");
                    return null;
                }
                if (AbstractC3863.m8240()) {
                    AbstractC3863.m8242(c3847.m8226(), "caching " + c3853 + " result " + abstractC38432);
                }
                c3847M8225 = c38472.m8225(c3853, abstractC38432);
            }
            c3852 = new C3852(c3847M8225, abstractC38432);
        }
        C3847 c38473 = c3852.f12079;
        c38473.getClass();
        ArrayList arrayList2 = new ArrayList(c38473.f12069);
        AbstractC3843 abstractC38433 = (AbstractC3843) arrayList2.remove(r13.size() - 1);
        if (AbstractC3863.m8240()) {
            AbstractC3863.m8242(c38473.m8226() - 1, "popped trace " + abstractC38433);
        }
        return new C3852(new C3847(c38473.f12072, c38473.f12071, c38473.f12070, arrayList2, c38473.f12068), c3852.f12078);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3847 m8225(C3853 c3853, AbstractC3843 abstractC3843) {
        C1609[] c1609Arr;
        int i;
        C3842 c3842 = this.f12072.f12077;
        int i2 = c3842.f12067 + 1;
        C1609[] c1609Arr2 = c3842.f12066;
        if (i2 > c1609Arr2.length) {
            int i3 = (i2 * 2) - 1;
            int i4 = 0;
            while (true) {
                int[] iArr = C3842.f12064;
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
            c1609Arr = new C1609[i];
        } else {
            c1609Arr = new C1609[c1609Arr2.length];
        }
        if (c1609Arr.length == c1609Arr2.length) {
            System.arraycopy(c1609Arr2, 0, c1609Arr, 0, c1609Arr2.length);
        } else {
            for (C1609 c1609 : c1609Arr2) {
                while (c1609 != null) {
                    C1609 c16092 = (C1609) c1609.f4714;
                    int i5 = c1609.f4717;
                    int length = i5 % c1609Arr.length;
                    C1609 c16093 = c1609Arr[length];
                    if (c16093 == null && c16092 == null) {
                        c1609Arr[length] = c1609;
                    } else {
                        c1609Arr[length] = new C1609(i5, (C3853) c1609.f4716, c1609.f4715, c16093);
                    }
                    c1609 = c16092;
                }
            }
        }
        int iAbs = Math.abs(c3853.hashCode());
        int length2 = iAbs % c1609Arr.length;
        c1609Arr[length2] = new C1609(iAbs, c3853, abstractC3843, c1609Arr[length2]);
        return new C3847(new C3851(new C3842(i2, c1609Arr)), this.f12071, this.f12070, this.f12069, this.f12068);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8226() {
        ArrayList arrayList = this.f12069;
        if (arrayList.size() <= 30) {
            return arrayList.size();
        }
        C2942.m6408("resolve getting too deep");
        return 0;
    }
}
