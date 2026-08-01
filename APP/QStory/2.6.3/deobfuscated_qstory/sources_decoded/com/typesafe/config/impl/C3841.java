package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p250.C8168;
import p250.InterfaceC8161;
import p250.InterfaceC8163;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3841 extends AbstractC3843 implements InterfaceC3821, InterfaceC3848 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12063;

    public C3841(InterfaceC8161 interfaceC8161, List list) {
        super(interfaceC8161);
        this.f12063 = list;
        if (list.isEmpty()) {
            C2942.m6408("creating empty delayed merge value");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3843 abstractC3843 = (AbstractC3843) it.next();
            if ((abstractC3843 instanceof C3841) || (abstractC3843 instanceof C3860)) {
                C2942.m6408("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8212(List list, StringBuilder sb, int i, boolean z, String str, C8168 c8168) {
        boolean z2 = c8168.f22502;
        boolean z3 = c8168.f22501;
        if (z2) {
            sb.append("# unresolved merge of " + list.size() + " values follows (\n");
            if (str == null) {
                AbstractC3843.indent(sb, i, c8168);
                sb.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
                AbstractC3843.indent(sb, i, c8168);
                sb.append("# the HOCON format has no way to list multiple root objects in a single file\n");
            }
        }
        ArrayList<AbstractC3843> arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        int i2 = 0;
        for (AbstractC3843 abstractC3843 : arrayList) {
            if (z2) {
                AbstractC3843.indent(sb, i, c8168);
                if (str != null) {
                    StringBuilder sbM150 = AbstractC0053.m150(i2, "#     unmerged value ", " for key ");
                    sbM150.append(AbstractC3864.m8246(str));
                    sbM150.append(" from ");
                    sb.append(sbM150.toString());
                } else {
                    sb.append("#     unmerged value " + i2 + " from ");
                }
                i2++;
                sb.append(abstractC3843.origin().m8210());
                sb.append("\n");
                List list2 = abstractC3843.origin().f12060;
                for (String str2 : list2 != null ? Collections.unmodifiableList(list2) : Collections.EMPTY_LIST) {
                    AbstractC3843.indent(sb, i, c8168);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            AbstractC3843.indent(sb, i, c8168);
            if (str != null) {
                sb.append(AbstractC3864.m8246(str));
                if (z3) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            }
            abstractC3843.render(sb, i, z, c8168);
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
            AbstractC3843.indent(sb, i, c8168);
            sb.append("# ) end of unresolved merge\n");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3843 m8213(C3847 c3847, List list, int i) {
        List<AbstractC3843> listSubList = list.subList(i, list.size());
        AbstractC3843 abstractC3843 = null;
        if (listSubList.isEmpty()) {
            if (AbstractC3863.m8240()) {
                AbstractC3863.m8242(c3847.m8226(), "Nothing else in the merge stack, replacing with null");
            }
            return null;
        }
        for (AbstractC3843 abstractC3843WithFallback : listSubList) {
            if (abstractC3843 != null) {
                abstractC3843WithFallback = abstractC3843.mo8220withFallback((InterfaceC8163) abstractC3843WithFallback);
            }
            abstractC3843 = abstractC3843WithFallback;
        }
        return abstractC3843;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m8214(List list) {
        return ((AbstractC3843) list.get(list.size() - 1)).ignoresFallbacks();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.typesafe.config.impl.C3852 m8215(com.typesafe.config.impl.InterfaceC3848 r18, java.util.List r19, com.typesafe.config.impl.C3847 r20, com.typesafe.config.impl.C3849 r21) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.typesafe.config.impl.C3841.m8215(com.typesafe.config.impl.飘花落叶言子楪兰世苏哲, java.util.List, com.typesafe.config.impl.飘花落叶言子楪兰世哲苏, com.typesafe.config.impl.飘花落叶言子楪兰哲世苏):com.typesafe.config.impl.飘花落叶言子楪兰苏哲世");
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean canEqual(Object obj) {
        return obj instanceof C3841;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3841)) {
            return false;
        }
        Object obj2 = ((C3841) obj).f12063;
        List list = this.f12063;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public final boolean hasDescendant(AbstractC3843 abstractC3843) {
        return AbstractC3843.hasDescendantInList(this.f12063, abstractC3843);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final int hashCode() {
        return this.f12063.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean ignoresFallbacks() {
        return m8214(this.f12063);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithNonObject(AbstractC3843 abstractC3843) {
        return (C3841) mergedWithNonObject(this.f12063, abstractC3843);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithObject(AbstractC3846 abstractC3846) {
        return (C3841) mergedWithObject(this.f12063, abstractC3846);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithTheUnmergeable(InterfaceC3821 interfaceC3821) {
        return (C3841) mergedWithTheUnmergeable(this.f12063, interfaceC3821);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 newCopy(InterfaceC8161 interfaceC8161) {
        return new C3841(interfaceC8161, this.f12063);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 relativized(C3858 c3858) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12063.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC3843) it.next()).relativized(c3858));
        }
        return new C3841(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        render(sb, i, z, null, c8168);
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public final AbstractC3843 replaceChild(AbstractC3843 abstractC3843, AbstractC3843 abstractC38432) {
        List<AbstractC3843> listReplaceChildInList = AbstractC3843.replaceChildInList(this.f12063, abstractC3843, abstractC38432);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C3841(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final C3852 resolveSubstitutions(C3847 c3847, C3849 c3849) {
        return m8215(this, this.f12063, c3847, c3849);
    }

    @Override // p250.InterfaceC8167
    public final Object unwrapped() {
        throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // p250.InterfaceC8167
    public final ConfigValueType valueType() {
        throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // com.typesafe.config.impl.InterfaceC3848
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3843 mo8216(C3847 c3847, int i) {
        return m8213(c3847, this.f12063, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8195() {
        return this.f12063;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final void render(StringBuilder sb, int i, boolean z, String str, C8168 c8168) {
        m8212(this.f12063, sb, i, z, str, c8168);
    }
}
