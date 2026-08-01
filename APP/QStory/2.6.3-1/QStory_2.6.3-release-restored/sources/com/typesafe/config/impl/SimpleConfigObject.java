package com.typesafe.config.impl;

import androidx.appcompat.app.C0955;
import com.alibaba.fastjson2.C3775;
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
import p266.C8997;
import p266.InterfaceC8990;
import p266.InterfaceC8991;
import p266.InterfaceC8992;
import p266.InterfaceC8996;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigObject extends AbstractC4678 implements Serializable {
    private static final String EMPTY_NAME = "empty config";
    private static final SimpleConfigObject emptyInstance = empty(C4670.m8765(EMPTY_NAME));
    private static final long serialVersionUID = 2;
    private final boolean ignoresFallbacks;
    private final boolean resolved;
    private final Map<String, AbstractC4675> value;

    public SimpleConfigObject(InterfaceC8990 interfaceC8990, Map<String, AbstractC4675> map, ResolveStatus resolveStatus, boolean z) {
        super(interfaceC8990);
        if (map == null) {
            C3775.m6968("creating config object with null map");
            throw null;
        }
        this.value = map;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        this.ignoresFallbacks = z;
        if (resolveStatus == ResolveStatus.fromValues(map.values())) {
            return;
        }
        C3775.m6955(this, "Wrong resolved status on ");
        throw null;
    }

    public static final SimpleConfigObject empty(InterfaceC8990 interfaceC8990) {
        return interfaceC8990 == null ? empty() : new SimpleConfigObject(interfaceC8990, Collections.EMPTY_MAP);
    }

    public static final SimpleConfigObject emptyMissing(InterfaceC8990 interfaceC8990) {
        return new SimpleConfigObject(C4670.m8765(((C4670) interfaceC8990).m8769() + " (not found)"), Collections.EMPTY_MAP);
    }

    private static boolean mapEquals(Map<String, InterfaceC8996> map, Map<String, InterfaceC8996> map2) {
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

    private static int mapHash(Map<String, InterfaceC8996> map) {
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

    private SimpleConfigObject modify(AbstractC4676 abstractC4676) {
        try {
            return modifyMayThrow(abstractC4676);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigObject modifyMayThrow(InterfaceC4677 interfaceC4677) {
        HashMap map = null;
        for (String str : keySet()) {
            AbstractC4675 abstractC4675 = this.value.get(str);
            AbstractC4675 abstractC4675Mo860 = interfaceC4677.mo860(abstractC4675, str);
            if (abstractC4675Mo860 != abstractC4675) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, abstractC4675Mo860);
            }
        }
        if (map == null) {
            return this;
        }
        HashMap map2 = new HashMap();
        boolean z = false;
        for (String str2 : keySet()) {
            if (map.containsKey(str2)) {
                AbstractC4675 abstractC46752 = (AbstractC4675) map.get(str2);
                if (abstractC46752 != null) {
                    map2.put(str2, abstractC46752);
                    if (abstractC46752.resolveStatus() == ResolveStatus.UNRESOLVED) {
                        z = true;
                    }
                }
            } else {
                AbstractC4675 abstractC46753 = this.value.get(str2);
                map2.put(str2, abstractC46753);
                if (abstractC46753.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    z = true;
                }
            }
        }
        return new SimpleConfigObject(origin(), map2, z ? ResolveStatus.UNRESOLVED : ResolveStatus.RESOLVED, ignoresFallbacks());
    }

    private SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8990 interfaceC8990, boolean z) {
        return new SimpleConfigObject(interfaceC8990, this.value, resolveStatus, z);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public AbstractC4675 attemptPeekWithPartialResolve(String str) {
        return this.value.get(str);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8991;
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
    public Set<Map.Entry<String, InterfaceC8996>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, AbstractC4675> entry : this.value.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue()));
        }
        return hashSet;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC8991) && canEqual(obj) && mapEquals(this, (InterfaceC8991) obj);
    }

    @Override // java.util.Map
    public AbstractC4675 get(Object obj) {
        return this.value.get(obj);
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public boolean hasDescendant(AbstractC4675 abstractC4675) {
        Iterator<AbstractC4675> it = this.value.values().iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC4675) {
                return true;
            }
        }
        for (InterfaceC8992 interfaceC8992 : this.value.values()) {
            if ((interfaceC8992 instanceof InterfaceC4693) && ((InterfaceC4693) interfaceC8992).hasDescendant(abstractC4675)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public int hashCode() {
        return mapHash(this);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
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

    @Override // com.typesafe.config.impl.AbstractC4675
    public SimpleConfigObject mergedWithObject(AbstractC4678 abstractC4678) {
        requireNotIgnoringFallbacks();
        if (!(abstractC4678 instanceof SimpleConfigObject)) {
            C3775.m6968("should not be reached (merging non-SimpleConfigObject)");
            return null;
        }
        SimpleConfigObject simpleConfigObject = (SimpleConfigObject) abstractC4678;
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet());
        hashSet.addAll(simpleConfigObject.keySet());
        boolean z = true;
        boolean z2 = false;
        for (String str : hashSet) {
            AbstractC4675 abstractC4675 = this.value.get(str);
            AbstractC4675 abstractC4675Mo8778withFallback = simpleConfigObject.value.get(str);
            if (abstractC4675 != null) {
                abstractC4675Mo8778withFallback = abstractC4675Mo8778withFallback == null ? abstractC4675 : abstractC4675.mo8779withFallback((InterfaceC8992) abstractC4675Mo8778withFallback);
            }
            map.put(str, abstractC4675Mo8778withFallback);
            if (abstractC4675 != abstractC4675Mo8778withFallback) {
                z2 = true;
            }
            if (abstractC4675Mo8778withFallback.resolveStatus() == ResolveStatus.UNRESOLVED) {
                z = false;
            }
        }
        ResolveStatus resolveStatusFromBoolean = ResolveStatus.fromBoolean(z);
        boolean zIgnoresFallbacks = simpleConfigObject.ignoresFallbacks();
        return z2 ? new SimpleConfigObject(AbstractC4678.mergeOrigins(this, simpleConfigObject), map, resolveStatusFromBoolean, zIgnoresFallbacks) : (resolveStatusFromBoolean == resolveStatus() && zIgnoresFallbacks == ignoresFallbacks()) ? this : newCopy(resolveStatusFromBoolean, origin(), zIgnoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public SimpleConfigObject relativized(C4690 c4690) {
        return modify(new C4672(c4690));
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        char c;
        if (isEmpty()) {
            sb.append("{}");
            c = '\n';
        } else {
            c8997.getClass();
            boolean z2 = c8997.f22846;
            int i2 = i + 1;
            sb.append("{");
            if (z2) {
                sb.append('\n');
            }
            String[] strArr = (String[]) keySet().toArray(new String[size()]);
            Arrays.sort(strArr, new RenderComparator(null));
            int i3 = 0;
            for (String str : strArr) {
                AbstractC4675 abstractC4675 = this.value.get(str);
                if (c8997.f22848) {
                    String[] strArrSplit = abstractC4675.origin().m8769().split("\n");
                    int length = strArrSplit.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str2 = strArrSplit[i4];
                        AbstractC4675.indent(sb, i2, c8997);
                        AbstractC4675 abstractC46752 = abstractC4675;
                        sb.append('#');
                        if (!str2.isEmpty()) {
                            sb.append(' ');
                        }
                        sb.append(str2);
                        sb.append("\n");
                        i4++;
                        abstractC4675 = abstractC46752;
                    }
                }
                AbstractC4675 abstractC46753 = abstractC4675;
                if (c8997.f22847) {
                    List list = abstractC46753.origin().f12405;
                    for (String str3 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                        AbstractC4675.indent(sb, i2, c8997);
                        sb.append("#");
                        if (!str3.startsWith(" ")) {
                            sb.append(' ');
                        }
                        sb.append(str3);
                        sb.append("\n");
                    }
                }
                AbstractC4675.indent(sb, i2, c8997);
                abstractC46753.render(sb, i2, false, str, c8997);
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
                AbstractC4675.indent(sb, i, c8997);
            }
            sb.append("}");
        }
        if (z && c8997.f22846) {
            sb.append(c);
        }
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public SimpleConfigObject replaceChild(AbstractC4675 abstractC4675, AbstractC4675 abstractC46752) {
        HashMap map = new HashMap(this.value);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == abstractC4675) {
                if (abstractC46752 != null) {
                    entry.setValue(abstractC46752);
                } else {
                    map.remove(entry.getKey());
                }
                return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
            }
        }
        C3775.m6959("SimpleConfigObject.replaceChild did not find ", abstractC4675, " in ", this);
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public C4684 resolveSubstitutions(C4679 c4679, C4681 c4681) throws AbstractConfigValue$NotPossibleToResolve {
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return new C4684(c4679, this);
        }
        try {
            C0955 c0955 = new C0955(c4679, c4681.m8787(this));
            SimpleConfigObject simpleConfigObjectModifyMayThrow = modifyMayThrow(c0955);
            C4684 c4684 = new C4684((C4679) c0955.f665, simpleConfigObjectModifyMayThrow);
            if (simpleConfigObjectModifyMayThrow instanceof AbstractC4678) {
                return c4684;
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

    @Override // p266.InterfaceC8996
    public Map<String, Object> unwrapped() {
        HashMap map = new HashMap();
        for (Map.Entry<String, AbstractC4675> entry : this.value.entrySet()) {
            map.put(entry.getKey(), entry.getValue().unwrapped());
        }
        return map;
    }

    @Override // java.util.Map
    public Collection<InterfaceC8996> values() {
        return new HashSet(this.value.values());
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public SimpleConfigObject withFallbacksIgnored() {
        return this.ignoresFallbacks ? this : newCopy(resolveStatus(), origin(), true);
    }

    /* JADX INFO: renamed from: withOnlyKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8749withOnlyKey(String str) {
        return withOnlyPath(new C4690(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public SimpleConfigObject withOnlyPath(C4690 c4690) {
        SimpleConfigObject simpleConfigObjectWithOnlyPathOrNull = withOnlyPathOrNull(c4690);
        return simpleConfigObjectWithOnlyPathOrNull == null ? new SimpleConfigObject(origin(), Collections.EMPTY_MAP, ResolveStatus.RESOLVED, this.ignoresFallbacks) : simpleConfigObjectWithOnlyPathOrNull;
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public SimpleConfigObject withOnlyPathOrNull(C4690 c4690) {
        String str = c4690.f12431;
        C4690 c46902 = c4690.f12430;
        AbstractC4675 abstractC4675WithOnlyPathOrNull = this.value.get(str);
        if (c46902 != null) {
            abstractC4675WithOnlyPathOrNull = (abstractC4675WithOnlyPathOrNull == null || !(abstractC4675WithOnlyPathOrNull instanceof AbstractC4678)) ? null : ((AbstractC4678) abstractC4675WithOnlyPathOrNull).withOnlyPathOrNull(c46902);
        }
        if (abstractC4675WithOnlyPathOrNull == null) {
            return null;
        }
        return new SimpleConfigObject(origin(), Collections.singletonMap(str, abstractC4675WithOnlyPathOrNull), abstractC4675WithOnlyPathOrNull.resolveStatus(), this.ignoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public SimpleConfigObject withValue(C4690 c4690, InterfaceC8996 interfaceC8996) {
        String str = c4690.f12431;
        C4690 c46902 = c4690.f12430;
        if (c46902 == null) {
            return m8751withValue(str, interfaceC8996);
        }
        AbstractC4675 abstractC4675 = this.value.get(str);
        if (abstractC4675 != null && (abstractC4675 instanceof AbstractC4678)) {
            return m8751withValue(str, (InterfaceC8996) ((AbstractC4678) abstractC4675).withValue(c46902, interfaceC8996));
        }
        return m8751withValue(str, (InterfaceC8996) ((AbstractC4675) interfaceC8996).atPath(C4670.m8765("withValue(" + c46902.m8795() + ")"), c46902).root());
    }

    /* JADX INFO: renamed from: withoutKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8753withoutKey(String str) {
        return withoutPath(new C4690(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public SimpleConfigObject withoutPath(C4690 c4690) {
        String str = c4690.f12431;
        C4690 c46902 = c4690.f12430;
        AbstractC4675 abstractC4675 = this.value.get(str);
        if (abstractC4675 != null && c46902 != null && (abstractC4675 instanceof AbstractC4678)) {
            AbstractC4678 abstractC4678WithoutPath = ((AbstractC4678) abstractC4675).withoutPath(c46902);
            HashMap map = new HashMap(this.value);
            map.put(str, abstractC4678WithoutPath);
            return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
        }
        if (c46902 != null || abstractC4675 == null) {
            return this;
        }
        HashMap map2 = new HashMap(this.value.size() - 1);
        for (Map.Entry<String, AbstractC4675> entry : this.value.entrySet()) {
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

        public /* synthetic */ RenderComparator(C4672 c4672) {
            this();
        }
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8990 interfaceC8990) {
        return newCopy(resolveStatus, interfaceC8990, this.ignoresFallbacks);
    }

    public static final SimpleConfigObject empty() {
        return emptyInstance;
    }

    public SimpleConfigObject(InterfaceC8990 interfaceC8990, Map<String, AbstractC4675> map) {
        this(interfaceC8990, map, ResolveStatus.fromValues(map.values()), false);
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8751withValue(String str, InterfaceC8996 interfaceC8996) {
        Map mapSingletonMap;
        if (interfaceC8996 != null) {
            if (this.value.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(str, (AbstractC4675) interfaceC8996);
            } else {
                HashMap map = new HashMap(this.value);
                map.put(str, (AbstractC4675) interfaceC8996);
                mapSingletonMap = map;
            }
            return new SimpleConfigObject(origin(), mapSingletonMap, ResolveStatus.fromValues(mapSingletonMap.values()), this.ignoresFallbacks);
        }
        C3775.m6968("Trying to store null ConfigValue in a ConfigObject");
        return null;
    }
}
