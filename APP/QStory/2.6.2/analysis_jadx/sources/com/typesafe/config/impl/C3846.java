package com.typesafe.config.impl;

import androidx.compose.ui.graphics.C1609;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.C3864;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3846 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set f12063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3857 f12065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3864 f12066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3850 f12067;

    public C3846(C3850 c3850, C3864 c3864, C3857 c3857, ArrayList arrayList, Set set) {
        this.f12067 = c3850;
        this.f12066 = c3864;
        this.f12065 = c3857;
        this.f12064 = arrayList;
        this.f12063 = set;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3846 m8236(C3857 c3857) {
        if (c3857 == this.f12065) {
            return this;
        }
        return new C3846(this.f12067, this.f12066, c3857, this.f12064, this.f12063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3851 m8237(AbstractC3842 abstractC3842, C3848 c3848) {
        C3852 c3852;
        C3846 c3846M8238;
        C3851 c3851;
        if (AbstractC3862.m8253()) {
            AbstractC3862.m8255(m8239(), "resolving " + abstractC3842 + " restrictToChild=" + this.f12065 + " in " + c3848);
        }
        if (AbstractC3862.m8253()) {
            AbstractC3862.m8255(m8239(), "pushing trace " + abstractC3842);
        }
        ArrayList arrayList = new ArrayList(this.f12064);
        arrayList.add(abstractC3842);
        C3850 c3850 = this.f12067;
        C3864 c3864 = this.f12066;
        C3857 c3857 = this.f12065;
        Set set = this.f12063;
        final C3846 c3846 = new C3846(c3850, c3864, c3857, arrayList, set);
        C3852 c38522 = new C3852(abstractC3842, null);
        AbstractC3842 abstractC3842M8242 = c3850.m8242(c38522);
        if (abstractC3842M8242 != null || c3857 == null) {
            c3852 = null;
        } else {
            C3852 c38523 = new C3852(abstractC3842, c3857);
            AbstractC3842 abstractC3842M82422 = c3850.m8242(c38523);
            c3852 = c38523;
            abstractC3842M8242 = abstractC3842M82422;
        }
        if (abstractC3842M8242 != null) {
            if (AbstractC3862.m8253()) {
                AbstractC3862.m8255(c3846.m8239(), "using cached resolution " + abstractC3842M8242 + " for " + abstractC3842 + " restrictToChild " + c3857);
            }
            c3851 = new C3851(c3846, abstractC3842M8242);
        } else {
            if (AbstractC3862.m8253()) {
                AbstractC3862.m8255(c3846.m8239(), "not found in cache, resolving " + abstractC3842 + "@" + System.identityHashCode(abstractC3842));
            }
            if (set.contains(abstractC3842)) {
                if (AbstractC3862.m8253()) {
                    AbstractC3862.m8255(c3846.m8239(), "Cycle detected, can't resolve; " + abstractC3842 + "@" + System.identityHashCode(abstractC3842));
                }
                throw new Exception(c3846) { // from class: com.typesafe.config.impl.AbstractConfigValue$NotPossibleToResolve
                    private static final long serialVersionUID = 1;
                    private final String traceString;

                    {
                        super("was not possible to resolve");
                        StringBuilder sb = new StringBuilder();
                        for (AbstractC3842 abstractC38422 : c3846.f12064) {
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
            C3851 c3851ResolveSubstitutions = abstractC3842.resolveSubstitutions(c3846, c3848);
            AbstractC3842 abstractC38422 = c3851ResolveSubstitutions.f12073;
            if (AbstractC3862.m8253()) {
                AbstractC3862.m8255(c3846.m8239(), "resolved to " + abstractC38422 + "@" + System.identityHashCode(abstractC38422) + " from " + abstractC3842 + "@" + System.identityHashCode(abstractC38422));
            }
            C3846 c38462 = c3851ResolveSubstitutions.f12074;
            if (abstractC38422 == null || abstractC38422.resolveStatus() == ResolveStatus.RESOLVED) {
                if (AbstractC3862.m8253()) {
                    AbstractC3862.m8255(c3846.m8239(), "caching " + c38522 + " result " + abstractC38422);
                }
                c3846M8238 = c38462.m8238(c38522, abstractC38422);
            } else {
                if (c3857 == null) {
                    c3864.getClass();
                    C2941.m6350("resolveSubstitutions() did not give us a resolved object");
                    return null;
                }
                if (c3852 == null) {
                    C2941.m6350("restrictedKey should not be null here");
                    return null;
                }
                if (AbstractC3862.m8253()) {
                    AbstractC3862.m8255(c3846.m8239(), "caching " + c3852 + " result " + abstractC38422);
                }
                c3846M8238 = c38462.m8238(c3852, abstractC38422);
            }
            c3851 = new C3851(c3846M8238, abstractC38422);
        }
        C3846 c38463 = c3851.f12074;
        c38463.getClass();
        ArrayList arrayList2 = new ArrayList(c38463.f12064);
        AbstractC3842 abstractC38423 = (AbstractC3842) arrayList2.remove(r13.size() - 1);
        if (AbstractC3862.m8253()) {
            AbstractC3862.m8255(c38463.m8239() - 1, "popped trace " + abstractC38423);
        }
        return new C3851(new C3846(c38463.f12067, c38463.f12066, c38463.f12065, arrayList2, c38463.f12063), c3851.f12073);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3846 m8238(C3852 c3852, AbstractC3842 abstractC3842) {
        C1609[] c1609Arr;
        int i;
        C3841 c3841 = this.f12067.f12072;
        int i2 = c3841.f12062 + 1;
        C1609[] c1609Arr2 = c3841.f12061;
        if (i2 > c1609Arr2.length) {
            int i3 = (i2 * 2) - 1;
            int i4 = 0;
            while (true) {
                int[] iArr = C3841.f12059;
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
                    C1609 c16092 = (C1609) c1609.f4713;
                    int i5 = c1609.f4716;
                    int length = i5 % c1609Arr.length;
                    C1609 c16093 = c1609Arr[length];
                    if (c16093 == null && c16092 == null) {
                        c1609Arr[length] = c1609;
                    } else {
                        c1609Arr[length] = new C1609(i5, (C3852) c1609.f4715, c1609.f4714, c16093);
                    }
                    c1609 = c16092;
                }
            }
        }
        int iAbs = Math.abs(c3852.hashCode());
        int length2 = iAbs % c1609Arr.length;
        c1609Arr[length2] = new C1609(iAbs, c3852, abstractC3842, c1609Arr[length2]);
        return new C3846(new C3850(new C3841(i2, c1609Arr)), this.f12066, this.f12065, this.f12064, this.f12063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8239() {
        ArrayList arrayList = this.f12064;
        if (arrayList.size() <= 30) {
            return arrayList.size();
        }
        C2941.m6350("resolve getting too deep");
        return 0;
    }
}
