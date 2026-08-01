package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p266.C8997;
import p266.InterfaceC8990;
import p266.InterfaceC8992;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4673 extends AbstractC4675 implements InterfaceC4653, InterfaceC4680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12408;

    public C4673(InterfaceC8990 interfaceC8990, List list) {
        super(interfaceC8990);
        this.f12408 = list;
        if (list.isEmpty()) {
            C3775.m6968("creating empty delayed merge value");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4675 abstractC4675 = (AbstractC4675) it.next();
            if ((abstractC4675 instanceof C4673) || (abstractC4675 instanceof C4692)) {
                C3775.m6968("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8771(List list, StringBuilder sb, int i, boolean z, String str, C8997 c8997) {
        boolean z2 = c8997.f22847;
        boolean z3 = c8997.f22846;
        if (z2) {
            sb.append("# unresolved merge of " + list.size() + " values follows (\n");
            if (str == null) {
                AbstractC4675.indent(sb, i, c8997);
                sb.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
                AbstractC4675.indent(sb, i, c8997);
                sb.append("# the HOCON format has no way to list multiple root objects in a single file\n");
            }
        }
        ArrayList<AbstractC4675> arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        int i2 = 0;
        for (AbstractC4675 abstractC4675 : arrayList) {
            if (z2) {
                AbstractC4675.indent(sb, i, c8997);
                if (str != null) {
                    StringBuilder sbM710 = AbstractC0900.m710(i2, "#     unmerged value ", " for key ");
                    sbM710.append(AbstractC4696.m8805(str));
                    sbM710.append(" from ");
                    sb.append(sbM710.toString());
                } else {
                    sb.append("#     unmerged value " + i2 + " from ");
                }
                i2++;
                sb.append(abstractC4675.origin().m8769());
                sb.append("\n");
                List list2 = abstractC4675.origin().f12405;
                for (String str2 : list2 != null ? Collections.unmodifiableList(list2) : Collections.EMPTY_LIST) {
                    AbstractC4675.indent(sb, i, c8997);
                    sb.append("# ");
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            AbstractC4675.indent(sb, i, c8997);
            if (str != null) {
                sb.append(AbstractC4696.m8805(str));
                if (z3) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            }
            abstractC4675.render(sb, i, z, c8997);
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
            AbstractC4675.indent(sb, i, c8997);
            sb.append("# ) end of unresolved merge\n");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC4675 m8772(C4679 c4679, List list, int i) {
        List<AbstractC4675> listSubList = list.subList(i, list.size());
        AbstractC4675 abstractC4675 = null;
        if (listSubList.isEmpty()) {
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c4679.m8785(), "Nothing else in the merge stack, replacing with null");
            }
            return null;
        }
        for (AbstractC4675 abstractC4675Mo8778withFallback : listSubList) {
            if (abstractC4675 != null) {
                abstractC4675Mo8778withFallback = abstractC4675.mo8779withFallback((InterfaceC8992) abstractC4675Mo8778withFallback);
            }
            abstractC4675 = abstractC4675Mo8778withFallback;
        }
        return abstractC4675;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m8773(List list) {
        return ((AbstractC4675) list.get(list.size() - 1)).ignoresFallbacks();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4684 m8774(InterfaceC4680 interfaceC4680, List list, C4679 c4679, C4681 c4681) {
        Iterator it;
        boolean z;
        C4681 c4681M8787;
        boolean z2 = true;
        if (AbstractC4695.m8799()) {
            AbstractC4695.m8801(c4679.m8785(), "delayed merge stack has " + list.size() + " items:");
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                AbstractC4675 abstractC4675 = (AbstractC4675) it2.next();
                AbstractC4695.m8801(c4679.m8785() + 1, i + ": " + abstractC4675);
                i++;
            }
        }
        C4679 c46792 = c4679;
        AbstractC4675 abstractC4675Mo8778withFallback = null;
        int i2 = 0;
        for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it) {
            AbstractC4675 abstractC46752 = (AbstractC4675) it3.next();
            if (abstractC46752 instanceof InterfaceC4680) {
                C3775.m6955(interfaceC4680, "A delayed merge should not contain another one: ");
                return null;
            }
            if (abstractC46752 instanceof InterfaceC4653) {
                AbstractC4675 abstractC4675Mo8775 = interfaceC4680.mo8775(c4679, i2 + 1);
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c46792.m8785(), "remainder portion: " + abstractC4675Mo8775);
                }
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c46792.m8785(), "building sourceForEnd");
                }
                AbstractC4675 abstractC46753 = (AbstractC4675) interfaceC4680;
                AbstractC4675 abstractC46754 = c4681.f12419;
                C0923 c0923 = c4681.f12418;
                z = z2;
                if (AbstractC4695.m8799()) {
                    it = it3;
                    AbstractC4695.m8800("replaceWithinCurrentParent old " + abstractC46753 + "@" + System.identityHashCode(abstractC46753) + " replacement " + abstractC4675Mo8775 + "@" + System.identityHashCode(abstractC46753) + " in " + c4681);
                } else {
                    it = it3;
                }
                if (abstractC46753 != abstractC4675Mo8775) {
                    if (c0923 != null) {
                        InterfaceC4693 interfaceC4693 = (InterfaceC4693) c0923.f572;
                        Object objReplaceChild = interfaceC4693.replaceChild(abstractC46753, abstractC4675Mo8775);
                        Object obj = objReplaceChild instanceof InterfaceC4693 ? (InterfaceC4693) objReplaceChild : null;
                        if (AbstractC4695.m8799()) {
                            AbstractC4695.m8800("replaceCurrentParent old " + interfaceC4693 + "@" + System.identityHashCode(interfaceC4693) + " replacement " + obj + "@" + System.identityHashCode(interfaceC4693) + " in " + c4681);
                        }
                        if (interfaceC4693 == obj) {
                            c4681M8787 = c4681;
                        } else {
                            C0923 c0923M8786 = C4681.m8786(c0923, interfaceC4693, (AbstractC4675) obj);
                            if (AbstractC4695.m8799()) {
                                AbstractC4695.m8800("replaced " + interfaceC4693 + " with " + obj + " in " + c4681);
                                StringBuilder sb = new StringBuilder("path was: ");
                                sb.append(c0923);
                                sb.append(" is now ");
                                sb.append(c0923M8786);
                                AbstractC4695.m8800(sb.toString());
                            }
                            if (c0923M8786 != null) {
                                C0923 c09232 = c0923M8786;
                                while (true) {
                                    C0923 c09233 = (C0923) c09232.f573;
                                    if (c09233 == null) {
                                        break;
                                    }
                                    c09232 = c09233;
                                }
                                c4681M8787 = new C4681((AbstractC4678) c09232.f572, c0923M8786);
                            } else {
                                c4681M8787 = new C4681(SimpleConfigObject.empty());
                            }
                        }
                    } else {
                        if (abstractC46753 != abstractC46754 || !(abstractC4675Mo8775 instanceof InterfaceC4693)) {
                            throw new ConfigException.BugOrBroken("replace in parent not possible " + abstractC46753 + " with " + abstractC4675Mo8775 + " in " + c4681);
                        }
                        InterfaceC4693 interfaceC46932 = (InterfaceC4693) abstractC4675Mo8775;
                        c4681M8787 = new C4681(interfaceC46932 instanceof AbstractC4678 ? (AbstractC4678) interfaceC46932 : SimpleConfigObject.empty());
                    }
                    if (AbstractC4695.m8799()) {
                        AbstractC4695.m8801(c46792.m8785(), "  sourceForEnd before reset parents but after replace: " + c4681M8787);
                    }
                    if (c4681M8787.f12418 != null) {
                        c4681M8787 = new C4681(c4681M8787.f12419);
                    }
                }
            } else {
                it = it3;
                z = z2;
                if (AbstractC4695.m8799()) {
                    AbstractC4695.m8801(c46792.m8785(), "will resolve end against the original source with parent pushed");
                }
                c4681M8787 = c4681.m8787(interfaceC4680);
            }
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c46792.m8785(), "sourceForEnd      =" + c4681M8787);
            }
            if (AbstractC4695.m8799()) {
                int iM8785 = c46792.m8785();
                StringBuilder sb2 = new StringBuilder("Resolving highest-priority item in delayed merge ");
                sb2.append(abstractC46752);
                sb2.append(" against ");
                sb2.append(c4681M8787);
                sb2.append(" endWasRemoved=");
                sb2.append(c4681 != c4681M8787 ? z : false);
                AbstractC4695.m8801(iM8785, sb2.toString());
            }
            C4684 c4684M8783 = c46792.m8783(abstractC46752, c4681M8787);
            AbstractC4675 abstractC46755 = c4684M8783.f12423;
            c46792 = c4684M8783.f12424;
            if (abstractC46755 != null) {
                if (abstractC4675Mo8778withFallback == null) {
                    abstractC4675Mo8778withFallback = abstractC46755;
                } else {
                    if (AbstractC4695.m8799()) {
                        AbstractC4695.m8801(c46792.m8785() + 1, "merging " + abstractC4675Mo8778withFallback + " with fallback " + abstractC46755);
                    }
                    abstractC4675Mo8778withFallback = abstractC4675Mo8778withFallback.mo8779withFallback((InterfaceC8992) abstractC46755);
                }
            }
            i2++;
            if (AbstractC4695.m8799()) {
                AbstractC4695.m8801(c46792.m8785(), "stack merged, yielding: " + abstractC4675Mo8778withFallback);
            }
            z2 = z;
        }
        return new C4684(c46792, abstractC4675Mo8778withFallback);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean canEqual(Object obj) {
        return obj instanceof C4673;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4673)) {
            return false;
        }
        Object obj2 = ((C4673) obj).f12408;
        List list = this.f12408;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public final boolean hasDescendant(AbstractC4675 abstractC4675) {
        return AbstractC4675.hasDescendantInList(this.f12408, abstractC4675);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final int hashCode() {
        return this.f12408.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean ignoresFallbacks() {
        return m8773(this.f12408);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithNonObject(AbstractC4675 abstractC4675) {
        return (C4673) mergedWithNonObject(this.f12408, abstractC4675);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithObject(AbstractC4678 abstractC4678) {
        return (C4673) mergedWithObject(this.f12408, abstractC4678);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithTheUnmergeable(InterfaceC4653 interfaceC4653) {
        return (C4673) mergedWithTheUnmergeable(this.f12408, interfaceC4653);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 newCopy(InterfaceC8990 interfaceC8990) {
        return new C4673(interfaceC8990, this.f12408);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 relativized(C4690 c4690) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12408.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4675) it.next()).relativized(c4690));
        }
        return new C4673(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        render(sb, i, z, null, c8997);
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public final AbstractC4675 replaceChild(AbstractC4675 abstractC4675, AbstractC4675 abstractC46752) {
        List<AbstractC4675> listReplaceChildInList = AbstractC4675.replaceChildInList(this.f12408, abstractC4675, abstractC46752);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C4673(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final C4684 resolveSubstitutions(C4679 c4679, C4681 c4681) {
        return m8774(this, this.f12408, c4679, c4681);
    }

    @Override // p266.InterfaceC8996
    public final Object unwrapped() {
        throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // p266.InterfaceC8996
    public final ConfigValueType valueType() {
        throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // com.typesafe.config.impl.InterfaceC4680
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4675 mo8775(C4679 c4679, int i) {
        return m8772(c4679, this.f12408, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC4653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8754() {
        return this.f12408;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final void render(StringBuilder sb, int i, boolean z, String str, C8997 c8997) {
        m8771(this.f12408, sb, i, z, str, c8997);
    }
}
