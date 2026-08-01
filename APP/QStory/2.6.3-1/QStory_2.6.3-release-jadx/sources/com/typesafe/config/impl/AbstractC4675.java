package com.typesafe.config.impl;

import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p266.C8997;
import p266.InterfaceC8990;
import p266.InterfaceC8992;
import p266.InterfaceC8996;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4675 implements InterfaceC8996, InterfaceC4689 {
    private final C4670 origin;

    public AbstractC4675(InterfaceC8990 interfaceC8990) {
        this.origin = (C4670) interfaceC8990;
    }

    public static boolean hasDescendantInList(List<AbstractC4675> list, AbstractC4675 abstractC4675) {
        Iterator<AbstractC4675> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC4675) {
                return true;
            }
        }
        for (InterfaceC8992 interfaceC8992 : list) {
            if ((interfaceC8992 instanceof InterfaceC4693) && ((InterfaceC4693) interfaceC8992).hasDescendant(abstractC4675)) {
                return true;
            }
        }
        return false;
    }

    public static void indent(StringBuilder sb, int i, C8997 c8997) {
        if (c8997.f22846) {
            while (i > 0) {
                sb.append("    ");
                i--;
            }
        }
    }

    public static List<AbstractC4675> replaceChildInList(List<AbstractC4675> list, AbstractC4675 abstractC4675, AbstractC4675 abstractC46752) {
        int i = 0;
        while (i < list.size() && list.get(i) != abstractC4675) {
            i++;
        }
        if (i == list.size()) {
            C3775.m6959("tried to replace ", abstractC4675, " which is not in ", list);
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (abstractC46752 != null) {
            arrayList.set(i, abstractC46752);
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
    public SimpleConfig m8776atKey(String str) {
        return atKey(C4670.m8765("atKey(" + str + ")"), str);
    }

    public SimpleConfig atPath(InterfaceC8990 interfaceC8990, C4690 c4690) {
        while (true) {
            C4690 c46902 = c4690.f12430;
            if (c46902 == null) {
                break;
            }
            c4690 = c46902;
        }
        SimpleConfig simpleConfigAtKey = atKey(interfaceC8990, c4690.f12431);
        for (C4690 c4690M8796 = c4690.m8796(); c4690M8796 != null; c4690M8796 = c4690M8796.m8796()) {
            C4690 c46903 = c4690M8796;
            while (true) {
                C4690 c46904 = c46903.f12430;
                if (c46904 != null) {
                    c46903 = c46904;
                }
            }
            simpleConfigAtKey = simpleConfigAtKey.atKey(interfaceC8990, c46903.f12431);
        }
        return simpleConfigAtKey;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8996;
    }

    public AbstractC4675 constructDelayedMerge(InterfaceC8990 interfaceC8990, List<AbstractC4675> list) {
        return new C4673(interfaceC8990, list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8996) || !canEqual(obj)) {
            return false;
        }
        InterfaceC8996 interfaceC8996 = (InterfaceC8996) obj;
        return valueType() == interfaceC8996.valueType() && AbstractC4696.m8808(unwrapped(), interfaceC8996.unwrapped());
    }

    public int hashCode() {
        Object objUnwrapped = unwrapped();
        if (objUnwrapped == null) {
            return 0;
        }
        return objUnwrapped.hashCode();
    }

    public boolean hideEnvVariableValue(C8997 c8997) {
        c8997.getClass();
        return false;
    }

    public boolean ignoresFallbacks() {
        return resolveStatus() == ResolveStatus.RESOLVED;
    }

    public final AbstractC4675 mergedWithNonObject(Collection<AbstractC4675> collection, AbstractC4675 abstractC4675) {
        requireNotIgnoringFallbacks();
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return withFallbacksIgnored();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(abstractC4675);
        return constructDelayedMerge(AbstractC4678.mergeOrigins(arrayList), arrayList);
    }

    public final AbstractC4675 mergedWithObject(Collection<AbstractC4675> collection, AbstractC4678 abstractC4678) {
        requireNotIgnoringFallbacks();
        if (!(this instanceof AbstractC4678)) {
            return mergedWithNonObject(collection, abstractC4678);
        }
        C3775.m6968("Objects must reimplement mergedWithObject");
        return null;
    }

    public final AbstractC4675 mergedWithTheUnmergeable(Collection<AbstractC4675> collection, InterfaceC4653 interfaceC4653) {
        requireNotIgnoringFallbacks();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(interfaceC4653.mo8754());
        return constructDelayedMerge(AbstractC4678.mergeOrigins(arrayList), arrayList);
    }

    public abstract AbstractC4675 newCopy(InterfaceC8990 interfaceC8990);

    public void render(StringBuilder sb, int i, boolean z, String str, C8997 c8997) {
        if (str != null) {
            c8997.getClass();
            sb.append(AbstractC4696.m8805(str));
            if (c8997.f22846) {
                sb.append(" : ");
            } else {
                sb.append(":");
            }
        }
        render(sb, i, z, c8997);
    }

    public final void requireNotIgnoringFallbacks() {
        if (ignoresFallbacks()) {
            C3775.m6968("method should not have been called with ignoresFallbacks=true ".concat(getClass().getSimpleName()));
        }
    }

    public ResolveStatus resolveStatus() {
        return ResolveStatus.RESOLVED;
    }

    public C4684 resolveSubstitutions(C4679 c4679, C4681 c4681) {
        return new C4684(c4679, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, new C8997(false, false, false));
        return getClass().getSimpleName() + "(" + sb.toString() + ")";
    }

    public String transformToString() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC4675 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        if (ignoresFallbacks()) {
            return this;
        }
        InterfaceC8996 fallbackValue = ((InterfaceC4689) interfaceC8992).toFallbackValue();
        return fallbackValue instanceof InterfaceC4653 ? mergedWithTheUnmergeable((InterfaceC4653) fallbackValue) : fallbackValue instanceof AbstractC4678 ? mergedWithObject((AbstractC4678) fallbackValue) : mergedWithNonObject((AbstractC4675) fallbackValue);
    }

    public AbstractC4675 withFallbacksIgnored() {
        if (ignoresFallbacks()) {
            return this;
        }
        C3775.m6955(this, "value class doesn't implement forced fallback-ignoring ");
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withOrigin, reason: merged with bridge method [inline-methods] */
    public AbstractC4675 mo8780withOrigin(InterfaceC8990 interfaceC8990) {
        return this.origin == interfaceC8990 ? this : newCopy(interfaceC8990);
    }

    @Override // p266.InterfaceC8996
    public C4670 origin() {
        return this.origin;
    }

    @Override // com.typesafe.config.impl.InterfaceC4689
    public AbstractC4675 toFallbackValue() {
        return this;
    }

    public AbstractC4675 mergedWithObject(AbstractC4678 abstractC4678) {
        requireNotIgnoringFallbacks();
        return mergedWithObject(Collections.singletonList(this), abstractC4678);
    }

    public AbstractC4675 relativized(C4690 c4690) {
        return this;
    }

    public AbstractC4675 mergedWithTheUnmergeable(InterfaceC4653 interfaceC4653) {
        requireNotIgnoringFallbacks();
        return mergedWithTheUnmergeable(Collections.singletonList(this), interfaceC4653);
    }

    public SimpleConfig atKey(InterfaceC8990 interfaceC8990, String str) {
        return new SimpleConfigObject(interfaceC8990, Collections.singletonMap(str, this)).toConfig();
    }

    public final String render() {
        return render(new C8997(true, true, true));
    }

    public void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        if (hideEnvVariableValue(c8997)) {
            sb.append("<env variable>");
        } else {
            sb.append(unwrapped().toString());
        }
    }

    public AbstractC4675 mergedWithNonObject(AbstractC4675 abstractC4675) {
        requireNotIgnoringFallbacks();
        return mergedWithNonObject(Collections.singletonList(this), abstractC4675);
    }

    public final String render(C8997 c8997) {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, c8997);
        return sb.toString();
    }

    /* JADX INFO: renamed from: atPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8777atPath(String str) {
        return atPath(C4670.m8765("atPath(" + str + ")"), C4690.m8793(str));
    }
}
