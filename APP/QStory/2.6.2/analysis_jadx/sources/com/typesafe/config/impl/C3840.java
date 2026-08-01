package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p250.C8167;
import p250.InterfaceC8160;
import p250.InterfaceC8162;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3840 extends AbstractC3842 implements InterfaceC3820, InterfaceC3847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12058;

    public C3840(InterfaceC8160 interfaceC8160, List list) {
        super(interfaceC8160);
        this.f12058 = list;
        if (list.isEmpty()) {
            C2941.m6350("creating empty delayed merge value");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3842 abstractC3842 = (AbstractC3842) it.next();
            if ((abstractC3842 instanceof C3840) || (abstractC3842 instanceof C3859)) {
                C2941.m6350("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8225(List list, StringBuilder sb, int i, boolean z, String str, C8167 c8167) {
        boolean z2 = c8167.f22504;
        boolean z3 = c8167.f22503;
        if (z2) {
            sb.append("# unresolved merge of " + list.size() + " values follows (\n");
            if (str == null) {
                AbstractC3842.indent(sb, i, c8167);
                sb.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
                AbstractC3842.indent(sb, i, c8167);
                sb.append("# the HOCON format has no way to list multiple root objects in a single file\n");
            }
        }
        ArrayList<AbstractC3842> arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        int i2 = 0;
        for (AbstractC3842 abstractC3842 : arrayList) {
            if (z2) {
                AbstractC3842.indent(sb, i, c8167);
                if (str != null) {
                    StringBuilder sbM148 = AbstractC0053.m148(i2, "#     unmerged value ", " for key ");
                    sbM148.append(AbstractC3863.m8259(str));
                    sbM148.append(" from ");
                    sb.append(sbM148.toString());
                } else {
                    sb.append("#     unmerged value " + i2 + " from ");
                }
                i2++;
                sb.append(abstractC3842.origin().m8223());
                sb.append("\n");
                List list2 = abstractC3842.origin().f12055;
                for (String str2 : list2 != null ? Collections.unmodifiableList(list2) : Collections.EMPTY_LIST) {
                    AbstractC3842.indent(sb, i, c8167);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            AbstractC3842.indent(sb, i, c8167);
            if (str != null) {
                sb.append(AbstractC3863.m8259(str));
                if (z3) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            }
            abstractC3842.render(sb, i, z, c8167);
            sb.append(",");
            if (z3) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (z3) {
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        if (z2) {
            AbstractC3842.indent(sb, i, c8167);
            sb.append("# ) end of unresolved merge\n");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3842 m8226(C3846 c3846, List list, int i) {
        List<AbstractC3842> listSubList = list.subList(i, list.size());
        AbstractC3842 abstractC3842 = null;
        if (listSubList.isEmpty()) {
            if (AbstractC3862.m8253()) {
                AbstractC3862.m8255(c3846.m8239(), "Nothing else in the merge stack, replacing with null");
            }
            return null;
        }
        for (AbstractC3842 abstractC3842WithFallback : listSubList) {
            if (abstractC3842 != null) {
                abstractC3842WithFallback = abstractC3842.mo8233withFallback((InterfaceC8162) abstractC3842WithFallback);
            }
            abstractC3842 = abstractC3842WithFallback;
        }
        return abstractC3842;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m8227(List list) {
        return ((AbstractC3842) list.get(list.size() - 1)).ignoresFallbacks();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.typesafe.config.impl.C3851 m8228(com.typesafe.config.impl.InterfaceC3847 r18, java.util.List r19, com.typesafe.config.impl.C3846 r20, com.typesafe.config.impl.C3848 r21) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.impl.C3840.m8228(com.typesafe.config.impl.飘花落叶言子楪兰世苏哲, java.util.List, com.typesafe.config.impl.飘花落叶言子楪兰世哲苏, com.typesafe.config.impl.飘花落叶言子楪兰哲世苏):com.typesafe.config.impl.飘花落叶言子楪兰苏哲世");
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean canEqual(Object obj) {
        return obj instanceof C3840;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3840)) {
            return false;
        }
        Object obj2 = ((C3840) obj).f12058;
        List list = this.f12058;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public final boolean hasDescendant(AbstractC3842 abstractC3842) {
        return AbstractC3842.hasDescendantInList(this.f12058, abstractC3842);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final int hashCode() {
        return this.f12058.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean ignoresFallbacks() {
        return m8227(this.f12058);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithNonObject(AbstractC3842 abstractC3842) {
        return (C3840) mergedWithNonObject(this.f12058, abstractC3842);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithObject(AbstractC3845 abstractC3845) {
        return (C3840) mergedWithObject(this.f12058, abstractC3845);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithTheUnmergeable(InterfaceC3820 interfaceC3820) {
        return (C3840) mergedWithTheUnmergeable(this.f12058, interfaceC3820);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 newCopy(InterfaceC8160 interfaceC8160) {
        return new C3840(interfaceC8160, this.f12058);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 relativized(C3857 c3857) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12058.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC3842) it.next()).relativized(c3857));
        }
        return new C3840(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        render(sb, i, z, null, c8167);
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public final AbstractC3842 replaceChild(AbstractC3842 abstractC3842, AbstractC3842 abstractC38422) {
        List<AbstractC3842> listReplaceChildInList = AbstractC3842.replaceChildInList(this.f12058, abstractC3842, abstractC38422);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C3840(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final C3851 resolveSubstitutions(C3846 c3846, C3848 c3848) {
        return m8228(this, this.f12058, c3846, c3848);
    }

    @Override // p250.InterfaceC8166
    public final Object unwrapped() {
        throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // p250.InterfaceC8166
    public final ConfigValueType valueType() {
        throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // com.typesafe.config.impl.InterfaceC3847
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3842 mo8229(C3846 c3846, int i) {
        return m8226(c3846, this.f12058, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3820
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8208() {
        return this.f12058;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final void render(StringBuilder sb, int i, boolean z, String str, C8167 c8167) {
        m8225(this.f12058, sb, i, z, str, c8167);
    }
}
