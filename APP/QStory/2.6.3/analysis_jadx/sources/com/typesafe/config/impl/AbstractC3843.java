package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p250.C8168;
import p250.InterfaceC8161;
import p250.InterfaceC8163;
import p250.InterfaceC8167;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3843 implements InterfaceC8167, InterfaceC3857 {
    private final C3838 origin;

    public AbstractC3843(InterfaceC8161 interfaceC8161) {
        this.origin = (C3838) interfaceC8161;
    }

    public static boolean hasDescendantInList(List<AbstractC3843> list, AbstractC3843 abstractC3843) {
        Iterator<AbstractC3843> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC3843) {
                return true;
            }
        }
        for (InterfaceC8163 interfaceC8163 : list) {
            if ((interfaceC8163 instanceof InterfaceC3861) && ((InterfaceC3861) interfaceC8163).hasDescendant(abstractC3843)) {
                return true;
            }
        }
        return false;
    }

    public static void indent(StringBuilder sb, int i, C8168 c8168) {
        if (c8168.f22501) {
            while (i > 0) {
                sb.append("    ");
                i--;
            }
        }
    }

    public static List<AbstractC3843> replaceChildInList(List<AbstractC3843> list, AbstractC3843 abstractC3843, AbstractC3843 abstractC38432) {
        int i = 0;
        while (i < list.size() && list.get(i) != abstractC3843) {
            i++;
        }
        if (i == list.size()) {
            C2942.m6399("tried to replace ", abstractC3843, " which is not in ", list);
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (abstractC38432 != null) {
            arrayList.set(i, abstractC38432);
        } else {
            arrayList.remove(i);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public void appendHiddenEnvVariableValue(StringBuilder sb) {
        sb.append("\"<env variable>\"");
    }

    /* JADX INFO: renamed from: atKey, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8217atKey(String str) {
        return atKey(C3838.m8206("atKey(" + str + ")"), str);
    }

    public SimpleConfig atPath(InterfaceC8161 interfaceC8161, C3858 c3858) {
        while (true) {
            C3858 c38582 = c3858.f12085;
            if (c38582 == null) {
                break;
            }
            c3858 = c38582;
        }
        SimpleConfig simpleConfigAtKey = atKey(interfaceC8161, c3858.f12086);
        for (C3858 c3858M8237 = c3858.m8237(); c3858M8237 != null; c3858M8237 = c3858M8237.m8237()) {
            C3858 c38583 = c3858M8237;
            while (true) {
                C3858 c38584 = c38583.f12085;
                if (c38584 != null) {
                    c38583 = c38584;
                }
            }
            simpleConfigAtKey = simpleConfigAtKey.atKey(interfaceC8161, c38583.f12086);
        }
        return simpleConfigAtKey;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8167;
    }

    public AbstractC3843 constructDelayedMerge(InterfaceC8161 interfaceC8161, List<AbstractC3843> list) {
        return new C3841(interfaceC8161, list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8167) || !canEqual(obj)) {
            return false;
        }
        InterfaceC8167 interfaceC8167 = (InterfaceC8167) obj;
        return valueType() == interfaceC8167.valueType() && AbstractC3864.m8249(unwrapped(), interfaceC8167.unwrapped());
    }

    public int hashCode() {
        Object objUnwrapped = unwrapped();
        if (objUnwrapped == null) {
            return 0;
        }
        return objUnwrapped.hashCode();
    }

    public boolean hideEnvVariableValue(C8168 c8168) {
        c8168.getClass();
        return false;
    }

    public boolean ignoresFallbacks() {
        return resolveStatus() == ResolveStatus.RESOLVED;
    }

    public final AbstractC3843 mergedWithNonObject(Collection<AbstractC3843> collection, AbstractC3843 abstractC3843) {
        requireNotIgnoringFallbacks();
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return withFallbacksIgnored();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(abstractC3843);
        return constructDelayedMerge(AbstractC3846.mergeOrigins(arrayList), arrayList);
    }

    public final AbstractC3843 mergedWithObject(Collection<AbstractC3843> collection, AbstractC3846 abstractC3846) {
        requireNotIgnoringFallbacks();
        if (!(this instanceof AbstractC3846)) {
            return mergedWithNonObject(collection, abstractC3846);
        }
        C2942.m6408("Objects must reimplement mergedWithObject");
        return null;
    }

    public final AbstractC3843 mergedWithTheUnmergeable(Collection<AbstractC3843> collection, InterfaceC3821 interfaceC3821) {
        requireNotIgnoringFallbacks();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(interfaceC3821.mo8195());
        return constructDelayedMerge(AbstractC3846.mergeOrigins(arrayList), arrayList);
    }

    public abstract AbstractC3843 newCopy(InterfaceC8161 interfaceC8161);

    public void render(StringBuilder sb, int i, boolean z, String str, C8168 c8168) {
        if (str != null) {
            c8168.getClass();
            sb.append(AbstractC3864.m8246(str));
            if (c8168.f22501) {
                sb.append(" : ");
            } else {
                sb.append(":");
            }
        }
        render(sb, i, z, c8168);
    }

    public final void requireNotIgnoringFallbacks() {
        if (ignoresFallbacks()) {
            C2942.m6408("method should not have been called with ignoresFallbacks=true ".concat(getClass().getSimpleName()));
        }
    }

    public ResolveStatus resolveStatus() {
        return ResolveStatus.RESOLVED;
    }

    public C3852 resolveSubstitutions(C3847 c3847, C3849 c3849) {
        return new C3852(c3847, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, new C8168(false, false, false));
        return getClass().getSimpleName() + "(" + sb.toString() + ")";
    }

    public String transformToString() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] */
    public AbstractC3843 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        if (ignoresFallbacks()) {
            return this;
        }
        InterfaceC8167 fallbackValue = ((InterfaceC3857) interfaceC8163).toFallbackValue();
        return fallbackValue instanceof InterfaceC3821 ? mergedWithTheUnmergeable((InterfaceC3821) fallbackValue) : fallbackValue instanceof AbstractC3846 ? mergedWithObject((AbstractC3846) fallbackValue) : mergedWithNonObject((AbstractC3843) fallbackValue);
    }

    public AbstractC3843 withFallbacksIgnored() {
        if (ignoresFallbacks()) {
            return this;
        }
        C2942.m6395(this, "value class doesn't implement forced fallback-ignoring ");
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withOrigin */
    public AbstractC3843 mo8221withOrigin(InterfaceC8161 interfaceC8161) {
        return this.origin == interfaceC8161 ? this : newCopy(interfaceC8161);
    }

    @Override // p250.InterfaceC8167
    public C3838 origin() {
        return this.origin;
    }

    @Override // com.typesafe.config.impl.InterfaceC3857
    public AbstractC3843 toFallbackValue() {
        return this;
    }

    public AbstractC3843 mergedWithObject(AbstractC3846 abstractC3846) {
        requireNotIgnoringFallbacks();
        return mergedWithObject(Collections.singletonList(this), abstractC3846);
    }

    public AbstractC3843 relativized(C3858 c3858) {
        return this;
    }

    public AbstractC3843 mergedWithTheUnmergeable(InterfaceC3821 interfaceC3821) {
        requireNotIgnoringFallbacks();
        return mergedWithTheUnmergeable(Collections.singletonList(this), interfaceC3821);
    }

    public SimpleConfig atKey(InterfaceC8161 interfaceC8161, String str) {
        return new SimpleConfigObject(interfaceC8161, Collections.singletonMap(str, this)).toConfig();
    }

    public final String render() {
        return render(new C8168(true, true, true));
    }

    public void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        if (hideEnvVariableValue(c8168)) {
            sb.append("<env variable>");
        } else {
            sb.append(unwrapped().toString());
        }
    }

    public AbstractC3843 mergedWithNonObject(AbstractC3843 abstractC3843) {
        requireNotIgnoringFallbacks();
        return mergedWithNonObject(Collections.singletonList(this), abstractC3843);
    }

    public final String render(C8168 c8168) {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, c8168);
        return sb.toString();
    }

    /* JADX INFO: renamed from: atPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8218atPath(String str) {
        return atPath(C3838.m8206("atPath(" + str + ")"), C3858.m8234(str));
    }
}
