package com.typesafe.config.impl;

import androidx.appcompat.app.C0108;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p250.C8168;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8163;
import p250.InterfaceC8167;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigObject extends AbstractC3846 implements Serializable {
    private static final String EMPTY_NAME = "empty config";
    private static final SimpleConfigObject emptyInstance = empty(C3838.m8206(EMPTY_NAME));
    private static final long serialVersionUID = 2;
    private final boolean ignoresFallbacks;
    private final boolean resolved;
    private final Map<String, AbstractC3843> value;

    public SimpleConfigObject(InterfaceC8161 interfaceC8161, Map<String, AbstractC3843> map, ResolveStatus resolveStatus, boolean z) {
        super(interfaceC8161);
        if (map == null) {
            C2942.m6408("creating config object with null map");
            throw null;
        }
        this.value = map;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        this.ignoresFallbacks = z;
        if (resolveStatus == ResolveStatus.fromValues(map.values())) {
            return;
        }
        C2942.m6395(this, "Wrong resolved status on ");
        throw null;
    }

    public static final SimpleConfigObject empty(InterfaceC8161 interfaceC8161) {
        return interfaceC8161 == null ? empty() : new SimpleConfigObject(interfaceC8161, Collections.EMPTY_MAP);
    }

    public static final SimpleConfigObject emptyMissing(InterfaceC8161 interfaceC8161) {
        return new SimpleConfigObject(C3838.m8206(((C3838) interfaceC8161).m8210() + " (not found)"), Collections.EMPTY_MAP);
    }

    private static boolean mapEquals(Map<String, InterfaceC8167> map, Map<String, InterfaceC8167> map2) {
        if (map == map2) {
            return true;
        }
        Set<String> setKeySet = map.keySet();
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!map.get(str).equals(map2.get(str))) {
                return false;
            }
        }
        return true;
    }

    private static int mapHash(Map<String, InterfaceC8167> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += map.get((String) it.next()).hashCode();
        }
        return ((arrayList.hashCode() + 41) * 41) + iHashCode;
    }

    private SimpleConfigObject modify(AbstractC3844 abstractC3844) {
        try {
            return modifyMayThrow(abstractC3844);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigObject modifyMayThrow(InterfaceC3845 interfaceC3845) {
        HashMap map = null;
        for (String str : keySet()) {
            AbstractC3843 abstractC3843 = this.value.get(str);
            AbstractC3843 abstractC3843Mo300 = interfaceC3845.mo300(abstractC3843, str);
            if (abstractC3843Mo300 != abstractC3843) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, abstractC3843Mo300);
            }
        }
        if (map == null) {
            return this;
        }
        HashMap map2 = new HashMap();
        boolean z = false;
        for (String str2 : keySet()) {
            if (map.containsKey(str2)) {
                AbstractC3843 abstractC38432 = (AbstractC3843) map.get(str2);
                if (abstractC38432 != null) {
                    map2.put(str2, abstractC38432);
                    if (abstractC38432.resolveStatus() == ResolveStatus.UNRESOLVED) {
                        z = true;
                    }
                }
            } else {
                AbstractC3843 abstractC38433 = this.value.get(str2);
                map2.put(str2, abstractC38433);
                if (abstractC38433.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    z = true;
                }
            }
        }
        return new SimpleConfigObject(origin(), map2, z ? ResolveStatus.UNRESOLVED : ResolveStatus.RESOLVED, ignoresFallbacks());
    }

    private SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8161 interfaceC8161, boolean z) {
        return new SimpleConfigObject(interfaceC8161, this.value, resolveStatus, z);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public AbstractC3843 attemptPeekWithPartialResolve(String str) {
        return this.value.get(str);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8162;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.value.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.value.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, InterfaceC8167>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, AbstractC3843> entry : this.value.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue()));
        }
        return hashSet;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC8162) && canEqual(obj) && mapEquals(this, (InterfaceC8162) obj);
    }

    @Override // java.util.Map
    public AbstractC3843 get(Object obj) {
        return this.value.get(obj);
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public boolean hasDescendant(AbstractC3843 abstractC3843) {
        Iterator<AbstractC3843> it = this.value.values().iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC3843) {
                return true;
            }
        }
        for (InterfaceC8163 interfaceC8163 : this.value.values()) {
            if ((interfaceC8163 instanceof InterfaceC3861) && ((InterfaceC3861) interfaceC8163).hasDescendant(abstractC3843)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public int hashCode() {
        return mapHash(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean ignoresFallbacks() {
        return this.ignoresFallbacks;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.value.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.value.keySet();
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SimpleConfigObject mergedWithObject(AbstractC3846 abstractC3846) {
        requireNotIgnoringFallbacks();
        if (!(abstractC3846 instanceof SimpleConfigObject)) {
            C2942.m6408("should not be reached (merging non-SimpleConfigObject)");
            return null;
        }
        SimpleConfigObject simpleConfigObject = (SimpleConfigObject) abstractC3846;
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet());
        hashSet.addAll(simpleConfigObject.keySet());
        boolean z = true;
        boolean z2 = false;
        for (String str : hashSet) {
            AbstractC3843 abstractC3843 = this.value.get(str);
            AbstractC3843 abstractC3843WithFallback = simpleConfigObject.value.get(str);
            if (abstractC3843 != null) {
                abstractC3843WithFallback = abstractC3843WithFallback == null ? abstractC3843 : abstractC3843.mo8220withFallback((InterfaceC8163) abstractC3843WithFallback);
            }
            map.put(str, abstractC3843WithFallback);
            if (abstractC3843 != abstractC3843WithFallback) {
                z2 = true;
            }
            if (abstractC3843WithFallback.resolveStatus() == ResolveStatus.UNRESOLVED) {
                z = false;
            }
        }
        ResolveStatus resolveStatusFromBoolean = ResolveStatus.fromBoolean(z);
        boolean zIgnoresFallbacks = simpleConfigObject.ignoresFallbacks();
        return z2 ? new SimpleConfigObject(AbstractC3846.mergeOrigins(this, simpleConfigObject), map, resolveStatusFromBoolean, zIgnoresFallbacks) : (resolveStatusFromBoolean == resolveStatus() && zIgnoresFallbacks == ignoresFallbacks()) ? this : newCopy(resolveStatusFromBoolean, origin(), zIgnoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SimpleConfigObject relativized(C3858 c3858) {
        return modify(new C3840(c3858));
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        char c;
        if (isEmpty()) {
            sb.append("{}");
            c = '\n';
        } else {
            c8168.getClass();
            boolean z2 = c8168.f22501;
            int i2 = i + 1;
            sb.append("{");
            if (z2) {
                sb.append('\n');
            }
            String[] strArr = (String[]) keySet().toArray(new String[size()]);
            Arrays.sort(strArr, new RenderComparator(null));
            int i3 = 0;
            for (String str : strArr) {
                AbstractC3843 abstractC3843 = this.value.get(str);
                if (c8168.f22503) {
                    String[] strArrSplit = abstractC3843.origin().m8210().split("\n");
                    int length = strArrSplit.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str2 = strArrSplit[i4];
                        AbstractC3843.indent(sb, i2, c8168);
                        AbstractC3843 abstractC38432 = abstractC3843;
                        sb.append('#');
                        if (!str2.isEmpty()) {
                            sb.append(' ');
                        }
                        sb.append(str2);
                        sb.append("\n");
                        i4++;
                        abstractC3843 = abstractC38432;
                    }
                }
                AbstractC3843 abstractC38433 = abstractC3843;
                if (c8168.f22502) {
                    List list = abstractC38433.origin().f12060;
                    for (String str3 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                        AbstractC3843.indent(sb, i2, c8168);
                        sb.append("#");
                        if (!str3.startsWith(" ")) {
                            sb.append(' ');
                        }
                        sb.append(str3);
                        sb.append("\n");
                    }
                }
                AbstractC3843.indent(sb, i2, c8168);
                abstractC38433.render(sb, i2, false, str, c8168);
                if (z2) {
                    sb.append(",");
                    sb.append('\n');
                    i3 = 2;
                } else {
                    sb.append(",");
                    i3 = 1;
                }
            }
            sb.setLength(sb.length() - i3);
            c = '\n';
            if (z2) {
                sb.append('\n');
                AbstractC3843.indent(sb, i, c8168);
            }
            sb.append("}");
        }
        if (z && c8168.f22501) {
            sb.append(c);
        }
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public SimpleConfigObject replaceChild(AbstractC3843 abstractC3843, AbstractC3843 abstractC38432) {
        HashMap map = new HashMap(this.value);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == abstractC3843) {
                if (abstractC38432 != null) {
                    entry.setValue(abstractC38432);
                } else {
                    map.remove(entry.getKey());
                }
                return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
            }
        }
        C2942.m6399("SimpleConfigObject.replaceChild did not find ", abstractC3843, " in ", this);
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public C3852 resolveSubstitutions(C3847 c3847, C3849 c3849) throws AbstractConfigValue$NotPossibleToResolve {
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return new C3852(c3847, this);
        }
        try {
            C0108 c0108 = new C0108(c3847, c3849.m8228(this));
            SimpleConfigObject simpleConfigObjectModifyMayThrow = modifyMayThrow(c0108);
            C3852 c3852 = new C3852((C3847) c0108.f320, simpleConfigObjectModifyMayThrow);
            if (simpleConfigObjectModifyMayThrow instanceof AbstractC3846) {
                return c3852;
            }
            throw new ConfigException.BugOrBroken("Expecting a resolve result to be an object, but it was " + simpleConfigObjectModifyMayThrow);
        } catch (AbstractConfigValue$NotPossibleToResolve e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e3);
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.value.size();
    }

    @Override // p250.InterfaceC8167
    public Map<String, Object> unwrapped() {
        HashMap map = new HashMap();
        for (Map.Entry<String, AbstractC3843> entry : this.value.entrySet()) {
            map.put(entry.getKey(), entry.getValue().unwrapped());
        }
        return map;
    }

    @Override // java.util.Map
    public Collection<InterfaceC8167> values() {
        return new HashSet(this.value.values());
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SimpleConfigObject withFallbacksIgnored() {
        return this.ignoresFallbacks ? this : newCopy(resolveStatus(), origin(), true);
    }

    /* JADX INFO: renamed from: withOnlyKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8190withOnlyKey(String str) {
        return withOnlyPath(new C3858(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public SimpleConfigObject withOnlyPath(C3858 c3858) {
        SimpleConfigObject simpleConfigObjectWithOnlyPathOrNull = withOnlyPathOrNull(c3858);
        return simpleConfigObjectWithOnlyPathOrNull == null ? new SimpleConfigObject(origin(), Collections.EMPTY_MAP, ResolveStatus.RESOLVED, this.ignoresFallbacks) : simpleConfigObjectWithOnlyPathOrNull;
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public SimpleConfigObject withOnlyPathOrNull(C3858 c3858) {
        String str = c3858.f12086;
        C3858 c38582 = c3858.f12085;
        AbstractC3843 abstractC3843WithOnlyPathOrNull = this.value.get(str);
        if (c38582 != null) {
            abstractC3843WithOnlyPathOrNull = (abstractC3843WithOnlyPathOrNull == null || !(abstractC3843WithOnlyPathOrNull instanceof AbstractC3846)) ? null : ((AbstractC3846) abstractC3843WithOnlyPathOrNull).withOnlyPathOrNull(c38582);
        }
        if (abstractC3843WithOnlyPathOrNull == null) {
            return null;
        }
        return new SimpleConfigObject(origin(), Collections.singletonMap(str, abstractC3843WithOnlyPathOrNull), abstractC3843WithOnlyPathOrNull.resolveStatus(), this.ignoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public SimpleConfigObject withValue(C3858 c3858, InterfaceC8167 interfaceC8167) {
        String str = c3858.f12086;
        C3858 c38582 = c3858.f12085;
        if (c38582 == null) {
            return m8192withValue(str, interfaceC8167);
        }
        AbstractC3843 abstractC3843 = this.value.get(str);
        if (abstractC3843 != null && (abstractC3843 instanceof AbstractC3846)) {
            return m8192withValue(str, (InterfaceC8167) ((AbstractC3846) abstractC3843).withValue(c38582, interfaceC8167));
        }
        return m8192withValue(str, (InterfaceC8167) ((AbstractC3843) interfaceC8167).atPath(C3838.m8206("withValue(" + c38582.m8236() + ")"), c38582).root());
    }

    /* JADX INFO: renamed from: withoutKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8194withoutKey(String str) {
        return withoutPath(new C3858(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public SimpleConfigObject withoutPath(C3858 c3858) {
        String str = c3858.f12086;
        C3858 c38582 = c3858.f12085;
        AbstractC3843 abstractC3843 = this.value.get(str);
        if (abstractC3843 != null && c38582 != null && (abstractC3843 instanceof AbstractC3846)) {
            AbstractC3846 abstractC3846WithoutPath = ((AbstractC3846) abstractC3843).withoutPath(c38582);
            HashMap map = new HashMap(this.value);
            map.put(str, abstractC3846WithoutPath);
            return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
        }
        if (c38582 != null || abstractC3843 == null) {
            return this;
        }
        HashMap map2 = new HashMap(this.value.size() - 1);
        for (Map.Entry<String, AbstractC3843> entry : this.value.entrySet()) {
            if (!entry.getKey().equals(str)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return new SimpleConfigObject(origin(), map2, ResolveStatus.fromValues(map2.values()), this.ignoresFallbacks);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class RenderComparator implements Comparator<String>, Serializable {
        private static final long serialVersionUID = 1;

        private RenderComparator() {
        }

        private static boolean isAllDigits(String str) {
            int length = str.length();
            if (length == 0) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            boolean zIsAllDigits = isAllDigits(str);
            boolean zIsAllDigits2 = isAllDigits(str2);
            if (zIsAllDigits && zIsAllDigits2) {
                return new BigInteger(str).compareTo(new BigInteger(str2));
            }
            if (zIsAllDigits) {
                return -1;
            }
            if (zIsAllDigits2) {
                return 1;
            }
            return str.compareTo(str2);
        }

        public /* synthetic */ RenderComparator(C3840 c3840) {
            this();
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8161 interfaceC8161) {
        return newCopy(resolveStatus, interfaceC8161, this.ignoresFallbacks);
    }

    public static final SimpleConfigObject empty() {
        return emptyInstance;
    }

    public SimpleConfigObject(InterfaceC8161 interfaceC8161, Map<String, AbstractC3843> map) {
        this(interfaceC8161, map, ResolveStatus.fromValues(map.values()), false);
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8192withValue(String str, InterfaceC8167 interfaceC8167) {
        Map mapSingletonMap;
        if (interfaceC8167 != null) {
            if (this.value.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(str, (AbstractC3843) interfaceC8167);
            } else {
                HashMap map = new HashMap(this.value);
                map.put(str, (AbstractC3843) interfaceC8167);
                mapSingletonMap = map;
            }
            return new SimpleConfigObject(origin(), mapSingletonMap, ResolveStatus.fromValues(mapSingletonMap.values()), this.ignoresFallbacks);
        }
        C2942.m6408("Trying to store null ConfigValue in a ConfigObject");
        return null;
    }
}
