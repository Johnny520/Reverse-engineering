package com.typesafe.config.impl;

import androidx.appcompat.app.C0108;
import com.alibaba.fastjson2.C2941;
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
import p250.C8167;
import p250.InterfaceC8160;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8166;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfigObject extends AbstractC3845 implements Serializable {
    private static final String EMPTY_NAME = "empty config";
    private static final SimpleConfigObject emptyInstance = empty(C3837.m8219(EMPTY_NAME));
    private static final long serialVersionUID = 2;
    private final boolean ignoresFallbacks;
    private final boolean resolved;
    private final Map<String, AbstractC3842> value;

    public SimpleConfigObject(InterfaceC8160 interfaceC8160, Map<String, AbstractC3842> map, ResolveStatus resolveStatus, boolean z) {
        super(interfaceC8160);
        if (map == null) {
            C2941.m6350("creating config object with null map");
            throw null;
        }
        this.value = map;
        this.resolved = resolveStatus == ResolveStatus.RESOLVED;
        this.ignoresFallbacks = z;
        if (resolveStatus == ResolveStatus.fromValues(map.values())) {
            return;
        }
        C2941.m6337(this, "Wrong resolved status on ");
        throw null;
    }

    public static final SimpleConfigObject empty(InterfaceC8160 interfaceC8160) {
        return interfaceC8160 == null ? empty() : new SimpleConfigObject(interfaceC8160, Collections.EMPTY_MAP);
    }

    public static final SimpleConfigObject emptyMissing(InterfaceC8160 interfaceC8160) {
        return new SimpleConfigObject(C3837.m8219(((C3837) interfaceC8160).m8223() + " (not found)"), Collections.EMPTY_MAP);
    }

    private static boolean mapEquals(Map<String, InterfaceC8166> map, Map<String, InterfaceC8166> map2) {
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

    private static int mapHash(Map<String, InterfaceC8166> map) {
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

    private SimpleConfigObject modify(AbstractC3843 abstractC3843) {
        try {
            return modifyMayThrow(abstractC3843);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    private SimpleConfigObject modifyMayThrow(InterfaceC3844 interfaceC3844) {
        HashMap map = null;
        for (String str : keySet()) {
            AbstractC3842 abstractC3842 = this.value.get(str);
            AbstractC3842 abstractC3842Mo291 = interfaceC3844.mo291(abstractC3842, str);
            if (abstractC3842Mo291 != abstractC3842) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, abstractC3842Mo291);
            }
        }
        if (map == null) {
            return this;
        }
        HashMap map2 = new HashMap();
        boolean z = false;
        for (String str2 : keySet()) {
            if (map.containsKey(str2)) {
                AbstractC3842 abstractC38422 = (AbstractC3842) map.get(str2);
                if (abstractC38422 != null) {
                    map2.put(str2, abstractC38422);
                    if (abstractC38422.resolveStatus() == ResolveStatus.UNRESOLVED) {
                        z = true;
                    }
                }
            } else {
                AbstractC3842 abstractC38423 = this.value.get(str2);
                map2.put(str2, abstractC38423);
                if (abstractC38423.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    z = true;
                }
            }
        }
        return new SimpleConfigObject(origin(), map2, z ? ResolveStatus.UNRESOLVED : ResolveStatus.RESOLVED, ignoresFallbacks());
    }

    private SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8160 interfaceC8160, boolean z) {
        return new SimpleConfigObject(interfaceC8160, this.value, resolveStatus, z);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public AbstractC3842 attemptPeekWithPartialResolve(String str) {
        return this.value.get(str);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public boolean canEqual(Object obj) {
        return obj instanceof InterfaceC8161;
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
    public Set<Map.Entry<String, InterfaceC8166>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, AbstractC3842> entry : this.value.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue()));
        }
        return hashSet;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC8161) && canEqual(obj) && mapEquals(this, (InterfaceC8161) obj);
    }

    @Override // java.util.Map
    public AbstractC3842 get(Object obj) {
        return this.value.get(obj);
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public boolean hasDescendant(AbstractC3842 abstractC3842) {
        Iterator<AbstractC3842> it = this.value.values().iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC3842) {
                return true;
            }
        }
        for (InterfaceC8162 interfaceC8162 : this.value.values()) {
            if ((interfaceC8162 instanceof InterfaceC3860) && ((InterfaceC3860) interfaceC8162).hasDescendant(abstractC3842)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public int hashCode() {
        return mapHash(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
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

    @Override // com.typesafe.config.impl.AbstractC3842
    public SimpleConfigObject mergedWithObject(AbstractC3845 abstractC3845) {
        requireNotIgnoringFallbacks();
        if (!(abstractC3845 instanceof SimpleConfigObject)) {
            C2941.m6350("should not be reached (merging non-SimpleConfigObject)");
            return null;
        }
        SimpleConfigObject simpleConfigObject = (SimpleConfigObject) abstractC3845;
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet());
        hashSet.addAll(simpleConfigObject.keySet());
        boolean z = true;
        boolean z2 = false;
        for (String str : hashSet) {
            AbstractC3842 abstractC3842 = this.value.get(str);
            AbstractC3842 abstractC3842WithFallback = simpleConfigObject.value.get(str);
            if (abstractC3842 != null) {
                abstractC3842WithFallback = abstractC3842WithFallback == null ? abstractC3842 : abstractC3842.mo8233withFallback((InterfaceC8162) abstractC3842WithFallback);
            }
            map.put(str, abstractC3842WithFallback);
            if (abstractC3842 != abstractC3842WithFallback) {
                z2 = true;
            }
            if (abstractC3842WithFallback.resolveStatus() == ResolveStatus.UNRESOLVED) {
                z = false;
            }
        }
        ResolveStatus resolveStatusFromBoolean = ResolveStatus.fromBoolean(z);
        boolean zIgnoresFallbacks = simpleConfigObject.ignoresFallbacks();
        return z2 ? new SimpleConfigObject(AbstractC3845.mergeOrigins(this, simpleConfigObject), map, resolveStatusFromBoolean, zIgnoresFallbacks) : (resolveStatusFromBoolean == resolveStatus() && zIgnoresFallbacks == ignoresFallbacks()) ? this : newCopy(resolveStatusFromBoolean, origin(), zIgnoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public SimpleConfigObject relativized(C3857 c3857) {
        return modify(new C3839(c3857));
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        char c;
        if (isEmpty()) {
            sb.append("{}");
            c = '\n';
        } else {
            c8167.getClass();
            boolean z2 = c8167.f22503;
            int i2 = i + 1;
            sb.append("{");
            if (z2) {
                sb.append('\n');
            }
            String[] strArr = (String[]) keySet().toArray(new String[size()]);
            Arrays.sort(strArr, new RenderComparator(null));
            int i3 = 0;
            for (String str : strArr) {
                AbstractC3842 abstractC3842 = this.value.get(str);
                if (c8167.f22505) {
                    String[] strArrSplit = abstractC3842.origin().m8223().split("\n");
                    int length = strArrSplit.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str2 = strArrSplit[i4];
                        AbstractC3842.indent(sb, i2, c8167);
                        AbstractC3842 abstractC38422 = abstractC3842;
                        sb.append('#');
                        if (!str2.isEmpty()) {
                            sb.append(' ');
                        }
                        sb.append(str2);
                        sb.append("\n");
                        i4++;
                        abstractC3842 = abstractC38422;
                    }
                }
                AbstractC3842 abstractC38423 = abstractC3842;
                if (c8167.f22504) {
                    List list = abstractC38423.origin().f12055;
                    for (String str3 : list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST) {
                        AbstractC3842.indent(sb, i2, c8167);
                        sb.append("#");
                        if (!str3.startsWith(" ")) {
                            sb.append(' ');
                        }
                        sb.append(str3);
                        sb.append("\n");
                    }
                }
                AbstractC3842.indent(sb, i2, c8167);
                abstractC38423.render(sb, i2, false, str, c8167);
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
                AbstractC3842.indent(sb, i, c8167);
            }
            sb.append("}");
        }
        if (z && c8167.f22503) {
            sb.append(c);
        }
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public SimpleConfigObject replaceChild(AbstractC3842 abstractC3842, AbstractC3842 abstractC38422) {
        HashMap map = new HashMap(this.value);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == abstractC3842) {
                if (abstractC38422 != null) {
                    entry.setValue(abstractC38422);
                } else {
                    map.remove(entry.getKey());
                }
                return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
            }
        }
        C2941.m6341("SimpleConfigObject.replaceChild did not find ", abstractC3842, " in ", this);
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public ResolveStatus resolveStatus() {
        return ResolveStatus.fromBoolean(this.resolved);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public C3851 resolveSubstitutions(C3846 c3846, C3848 c3848) throws AbstractConfigValue$NotPossibleToResolve {
        if (resolveStatus() == ResolveStatus.RESOLVED) {
            return new C3851(c3846, this);
        }
        try {
            C0108 c0108 = new C0108(c3846, c3848.m8241(this));
            SimpleConfigObject simpleConfigObjectModifyMayThrow = modifyMayThrow(c0108);
            C3851 c3851 = new C3851((C3846) c0108.f320, simpleConfigObjectModifyMayThrow);
            if (simpleConfigObjectModifyMayThrow instanceof AbstractC3845) {
                return c3851;
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

    @Override // p250.InterfaceC8166
    public Map<String, Object> unwrapped() {
        HashMap map = new HashMap();
        for (Map.Entry<String, AbstractC3842> entry : this.value.entrySet()) {
            map.put(entry.getKey(), entry.getValue().unwrapped());
        }
        return map;
    }

    @Override // java.util.Map
    public Collection<InterfaceC8166> values() {
        return new HashSet(this.value.values());
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public SimpleConfigObject withFallbacksIgnored() {
        return this.ignoresFallbacks ? this : newCopy(resolveStatus(), origin(), true);
    }

    /* JADX INFO: renamed from: withOnlyKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8203withOnlyKey(String str) {
        return withOnlyPath(new C3857(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public SimpleConfigObject withOnlyPath(C3857 c3857) {
        SimpleConfigObject simpleConfigObjectWithOnlyPathOrNull = withOnlyPathOrNull(c3857);
        return simpleConfigObjectWithOnlyPathOrNull == null ? new SimpleConfigObject(origin(), Collections.EMPTY_MAP, ResolveStatus.RESOLVED, this.ignoresFallbacks) : simpleConfigObjectWithOnlyPathOrNull;
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public SimpleConfigObject withOnlyPathOrNull(C3857 c3857) {
        String str = c3857.f12081;
        C3857 c38572 = c3857.f12080;
        AbstractC3842 abstractC3842WithOnlyPathOrNull = this.value.get(str);
        if (c38572 != null) {
            abstractC3842WithOnlyPathOrNull = (abstractC3842WithOnlyPathOrNull == null || !(abstractC3842WithOnlyPathOrNull instanceof AbstractC3845)) ? null : ((AbstractC3845) abstractC3842WithOnlyPathOrNull).withOnlyPathOrNull(c38572);
        }
        if (abstractC3842WithOnlyPathOrNull == null) {
            return null;
        }
        return new SimpleConfigObject(origin(), Collections.singletonMap(str, abstractC3842WithOnlyPathOrNull), abstractC3842WithOnlyPathOrNull.resolveStatus(), this.ignoresFallbacks);
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public SimpleConfigObject withValue(C3857 c3857, InterfaceC8166 interfaceC8166) {
        String str = c3857.f12081;
        C3857 c38572 = c3857.f12080;
        if (c38572 == null) {
            return m8205withValue(str, interfaceC8166);
        }
        AbstractC3842 abstractC3842 = this.value.get(str);
        if (abstractC3842 != null && (abstractC3842 instanceof AbstractC3845)) {
            return m8205withValue(str, (InterfaceC8166) ((AbstractC3845) abstractC3842).withValue(c38572, interfaceC8166));
        }
        return m8205withValue(str, (InterfaceC8166) ((AbstractC3842) interfaceC8166).atPath(C3837.m8219("withValue(" + c38572.m8249() + ")"), c38572).root());
    }

    /* JADX INFO: renamed from: withoutKey, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8207withoutKey(String str) {
        return withoutPath(new C3857(str, null));
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public SimpleConfigObject withoutPath(C3857 c3857) {
        String str = c3857.f12081;
        C3857 c38572 = c3857.f12080;
        AbstractC3842 abstractC3842 = this.value.get(str);
        if (abstractC3842 != null && c38572 != null && (abstractC3842 instanceof AbstractC3845)) {
            AbstractC3845 abstractC3845WithoutPath = ((AbstractC3845) abstractC3842).withoutPath(c38572);
            HashMap map = new HashMap(this.value);
            map.put(str, abstractC3845WithoutPath);
            return new SimpleConfigObject(origin(), map, ResolveStatus.fromValues(map.values()), this.ignoresFallbacks);
        }
        if (c38572 != null || abstractC3842 == null) {
            return this;
        }
        HashMap map2 = new HashMap(this.value.size() - 1);
        for (Map.Entry<String, AbstractC3842> entry : this.value.entrySet()) {
            if (!entry.getKey().equals(str)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return new SimpleConfigObject(origin(), map2, ResolveStatus.fromValues(map2.values()), this.ignoresFallbacks);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

        public /* synthetic */ RenderComparator(C3839 c3839) {
            this();
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public SimpleConfigObject newCopy(ResolveStatus resolveStatus, InterfaceC8160 interfaceC8160) {
        return newCopy(resolveStatus, interfaceC8160, this.ignoresFallbacks);
    }

    public static final SimpleConfigObject empty() {
        return emptyInstance;
    }

    public SimpleConfigObject(InterfaceC8160 interfaceC8160, Map<String, AbstractC3842> map) {
        this(interfaceC8160, map, ResolveStatus.fromValues(map.values()), false);
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfigObject m8205withValue(String str, InterfaceC8166 interfaceC8166) {
        Map mapSingletonMap;
        if (interfaceC8166 != null) {
            if (this.value.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(str, (AbstractC3842) interfaceC8166);
            } else {
                HashMap map = new HashMap(this.value);
                map.put(str, (AbstractC3842) interfaceC8166);
                mapSingletonMap = map;
            }
            return new SimpleConfigObject(origin(), mapSingletonMap, ResolveStatus.fromValues(mapSingletonMap.values()), this.ignoresFallbacks);
        }
        C2941.m6350("Trying to store null ConfigValue in a ConfigObject");
        return null;
    }
}
