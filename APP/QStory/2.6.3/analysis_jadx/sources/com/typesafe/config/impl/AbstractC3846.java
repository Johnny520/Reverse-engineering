package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8163;
import p250.InterfaceC8167;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3846 extends AbstractC3843 implements InterfaceC8162, InterfaceC3861 {
    private final SimpleConfig config;

    public AbstractC3846(InterfaceC8161 interfaceC8161) {
        super(interfaceC8161);
        this.config = new SimpleConfig(this);
    }

    public static InterfaceC8161 mergeOrigins(Collection<? extends AbstractC3843> collection) {
        C3838 c3838Origin = null;
        if (collection.isEmpty()) {
            C2942.m6408("can't merge origins on empty list");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InterfaceC8167 interfaceC8167 : collection) {
            if (c3838Origin == null) {
                c3838Origin = interfaceC8167.origin();
            }
            if (!(interfaceC8167 instanceof AbstractC3846) || ((AbstractC3846) interfaceC8167).resolveStatus() != ResolveStatus.RESOLVED || !((InterfaceC8162) interfaceC8167).isEmpty()) {
                arrayList.add(interfaceC8167.origin());
                i++;
            }
        }
        if (i == 0) {
            arrayList.add(c3838Origin);
        }
        return C3838.m8208(arrayList);
    }

    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map.".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3843 m8222(AbstractC3846 abstractC3846, C3858 c3858) {
        try {
            C3858 c38582 = c3858.f12085;
            AbstractC3843 abstractC3843AttemptPeekWithPartialResolve = abstractC3846.attemptPeekWithPartialResolve(c3858.f12086);
            if (c38582 == null) {
                return abstractC3843AttemptPeekWithPartialResolve;
            }
            if (abstractC3843AttemptPeekWithPartialResolve instanceof AbstractC3846) {
                return m8222((AbstractC3846) abstractC3843AttemptPeekWithPartialResolve, c38582);
            }
            return null;
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3863.m8243(c3858, e);
        }
    }

    public abstract AbstractC3843 attemptPeekWithPartialResolve(String str);

    @Override // java.util.Map
    public void clear() {
        throw weAreImmutable("clear");
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public AbstractC3846 constructDelayedMerge(InterfaceC8161 interfaceC8161, List<AbstractC3843> list) {
        return new C3860(interfaceC8161, list);
    }

    public abstract AbstractC3843 get(Object obj);

    public abstract AbstractC3846 newCopy(ResolveStatus resolveStatus, InterfaceC8161 interfaceC8161);

    @Override // com.typesafe.config.impl.AbstractC3843
    public AbstractC3846 newCopy(InterfaceC8161 interfaceC8161) {
        return newCopy(resolveStatus(), interfaceC8161);
    }

    public final AbstractC3843 peekAssumingResolved(String str, C3858 c3858) {
        try {
            return attemptPeekWithPartialResolve(str);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3863.m8243(c3858, e);
        }
    }

    public AbstractC3843 peekPath(C3858 c3858) {
        return m8222(this, c3858);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends InterfaceC8167> map) {
        throw weAreImmutable("putAll");
    }

    @Override // java.util.Map
    public InterfaceC8167 remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.OBJECT;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC3846 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (AbstractC3846) super.mo8220withFallback(interfaceC8163);
    }

    public abstract AbstractC3846 withOnlyPath(C3858 c3858);

    public abstract AbstractC3846 withOnlyPathOrNull(C3858 c3858);

    @Override // com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withOrigin, reason: merged with bridge method [inline-methods] */
    public AbstractC3846 mo8221withOrigin(InterfaceC8161 interfaceC8161) {
        return (AbstractC3846) super.mo8221withOrigin(interfaceC8161);
    }

    public abstract AbstractC3846 withValue(C3858 c3858, InterfaceC8167 interfaceC8167);

    public abstract AbstractC3846 withoutPath(C3858 c3858);

    @Override // p250.InterfaceC8162
    public SimpleConfig toConfig() {
        return this.config;
    }

    @Override // com.typesafe.config.impl.AbstractC3843, com.typesafe.config.impl.InterfaceC3857
    public AbstractC3846 toFallbackValue() {
        return this;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public /* bridge */ /* synthetic */ AbstractC3843 constructDelayedMerge(InterfaceC8161 interfaceC8161, List list) {
        return constructDelayedMerge(interfaceC8161, (List<AbstractC3843>) list);
    }

    @Override // java.util.Map
    public InterfaceC8167 put(String str, InterfaceC8167 interfaceC8167) {
        throw weAreImmutable("put");
    }

    public static InterfaceC8161 mergeOrigins(AbstractC3846... abstractC3846Arr) {
        return mergeOrigins(Arrays.asList(abstractC3846Arr));
    }
}
