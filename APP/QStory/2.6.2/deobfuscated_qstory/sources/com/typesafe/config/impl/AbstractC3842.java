package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p250.C8167;
import p250.InterfaceC8160;
import p250.InterfaceC8162;
import p250.InterfaceC8166;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3842 implements InterfaceC8166, InterfaceC3856 {
    private final C3837 origin;

    public AbstractC3842(InterfaceC8160 interfaceC8160) {
        this.origin = (C3837) interfaceC8160;
    }

    public static boolean hasDescendantInList(List<AbstractC3842> list, AbstractC3842 abstractC3842) {
        Iterator<AbstractC3842> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC3842) {
                return true;
            }
        }
        for (InterfaceC8162 interfaceC8162 : list) {
            if ((interfaceC8162 instanceof InterfaceC3860) && ((InterfaceC3860) interfaceC8162).hasDescendant(abstractC3842)) {
                return true;
            }
        }
        return false;
    }

    public static void indent(StringBuilder sb, int i, C8167 c8167) {
        if (c8167.f22503) {
            while (i > 0) {
                sb.append("    ");
                i--;
            }
        }
    }

    public static List<AbstractC3842> replaceChildInList(List<AbstractC3842> list, AbstractC3842 abstractC3842, AbstractC3842 abstractC38422) {
        int i = 0;
        while (i < list.size() && list.get(i) != abstractC3842) {
            i++;
        }
        if (i == list.size()) {
            C2941.m6341("tried to replace ", abstractC3842, " which is not in ", list);
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (abstractC38422 != null) {
            arrayList.set(i, abstractC38422);
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
    public SimpleConfig m8230atKey(String str) {
        return atKey(C3837.m8219("atKey(" + str + ")"), str);
    }

    public SimpleConfig atPath(InterfaceC8160 interfaceC8160, C3857 c3857) {
        while (true) {
            C3857 c38572 = c3857.f12080;
            if (c38572 == null) {
                break;
            }
            c3857 = c38572;
        }
        SimpleConfig simpleConfigAtKey = atKey(interfaceC8160, c3857.f12081);
        for (C3857 c3857M8250 = c3857.m8250(); c3857M8250 != null; c3857M8250 = c3857M8250.m8250()) {
            C3857 c38573 = c3857M8250;
            while (true) {
                C3857 c38574 = c38573.f12080;
                if (c38574 != null) {
                    c38573 = c38574;
                }
            }
            simpleConfigAtKey = simpleConfigAtKey.atKey(interfaceC8160, c38573.f12081);
        }
        return simpleConfigAtKey;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8166;
    }

    public AbstractC3842 constructDelayedMerge(InterfaceC8160 interfaceC8160, List<AbstractC3842> list) {
        return new C3840(interfaceC8160, list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8166) || !canEqual(obj)) {
            return false;
        }
        InterfaceC8166 interfaceC8166 = (InterfaceC8166) obj;
        return valueType() == interfaceC8166.valueType() && AbstractC3863.m8262(unwrapped(), interfaceC8166.unwrapped());
    }

    public int hashCode() {
        Object objUnwrapped = unwrapped();
        if (objUnwrapped == null) {
            return 0;
        }
        return objUnwrapped.hashCode();
    }

    public boolean hideEnvVariableValue(C8167 c8167) {
        c8167.getClass();
        return false;
    }

    public boolean ignoresFallbacks() {
        return resolveStatus() == ResolveStatus.RESOLVED;
    }

    public final AbstractC3842 mergedWithNonObject(Collection<AbstractC3842> collection, AbstractC3842 abstractC3842) {
        requireNotIgnoringFallbacks();
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return withFallbacksIgnored();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(abstractC3842);
        return constructDelayedMerge(AbstractC3845.mergeOrigins(arrayList), arrayList);
    }

    public final AbstractC3842 mergedWithObject(Collection<AbstractC3842> collection, AbstractC3845 abstractC3845) {
        requireNotIgnoringFallbacks();
        if (!(this instanceof AbstractC3845)) {
            return mergedWithNonObject(collection, abstractC3845);
        }
        C2941.m6350("Objects must reimplement mergedWithObject");
        return null;
    }

    public final AbstractC3842 mergedWithTheUnmergeable(Collection<AbstractC3842> collection, InterfaceC3820 interfaceC3820) {
        requireNotIgnoringFallbacks();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(interfaceC3820.mo8208());
        return constructDelayedMerge(AbstractC3845.mergeOrigins(arrayList), arrayList);
    }

    public abstract AbstractC3842 newCopy(InterfaceC8160 interfaceC8160);

    public void render(StringBuilder sb, int i, boolean z, String str, C8167 c8167) {
        if (str != null) {
            c8167.getClass();
            sb.append(AbstractC3863.m8259(str));
            if (c8167.f22503) {
                sb.append(" : ");
            } else {
                sb.append(":");
            }
        }
        render(sb, i, z, c8167);
    }

    public final void requireNotIgnoringFallbacks() {
        if (ignoresFallbacks()) {
            C2941.m6350("method should not have been called with ignoresFallbacks=true ".concat(getClass().getSimpleName()));
        }
    }

    public ResolveStatus resolveStatus() {
        return ResolveStatus.RESOLVED;
    }

    public C3851 resolveSubstitutions(C3846 c3846, C3848 c3848) {
        return new C3851(c3846, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, new C8167(false, false, false));
        return getClass().getSimpleName() + "(" + sb.toString() + ")";
    }

    public String transformToString() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] */
    public AbstractC3842 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        if (ignoresFallbacks()) {
            return this;
        }
        InterfaceC8166 fallbackValue = ((InterfaceC3856) interfaceC8162).toFallbackValue();
        return fallbackValue instanceof InterfaceC3820 ? mergedWithTheUnmergeable((InterfaceC3820) fallbackValue) : fallbackValue instanceof AbstractC3845 ? mergedWithObject((AbstractC3845) fallbackValue) : mergedWithNonObject((AbstractC3842) fallbackValue);
    }

    public AbstractC3842 withFallbacksIgnored() {
        if (ignoresFallbacks()) {
            return this;
        }
        C2941.m6337(this, "value class doesn't implement forced fallback-ignoring ");
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: withOrigin */
    public AbstractC3842 mo8234withOrigin(InterfaceC8160 interfaceC8160) {
        return this.origin == interfaceC8160 ? this : newCopy(interfaceC8160);
    }

    @Override // p250.InterfaceC8166
    public C3837 origin() {
        return this.origin;
    }

    @Override // com.typesafe.config.impl.InterfaceC3856
    public AbstractC3842 toFallbackValue() {
        return this;
    }

    public AbstractC3842 mergedWithObject(AbstractC3845 abstractC3845) {
        requireNotIgnoringFallbacks();
        return mergedWithObject(Collections.singletonList(this), abstractC3845);
    }

    public AbstractC3842 relativized(C3857 c3857) {
        return this;
    }

    public AbstractC3842 mergedWithTheUnmergeable(InterfaceC3820 interfaceC3820) {
        requireNotIgnoringFallbacks();
        return mergedWithTheUnmergeable(Collections.singletonList(this), interfaceC3820);
    }

    public SimpleConfig atKey(InterfaceC8160 interfaceC8160, String str) {
        return new SimpleConfigObject(interfaceC8160, Collections.singletonMap(str, this)).toConfig();
    }

    public final String render() {
        return render(new C8167(true, true, true));
    }

    public void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        if (hideEnvVariableValue(c8167)) {
            sb.append("<env variable>");
        } else {
            sb.append(unwrapped().toString());
        }
    }

    public AbstractC3842 mergedWithNonObject(AbstractC3842 abstractC3842) {
        requireNotIgnoringFallbacks();
        return mergedWithNonObject(Collections.singletonList(this), abstractC3842);
    }

    public final String render(C8167 c8167) {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, c8167);
        return sb.toString();
    }

    /* JADX INFO: renamed from: atPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8231atPath(String str) {
        return atPath(C3837.m8219("atPath(" + str + ")"), C3857.m8247(str));
    }
}
