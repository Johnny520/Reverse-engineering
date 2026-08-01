package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p250.InterfaceC8160;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8166;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3845 extends AbstractC3842 implements InterfaceC8161, InterfaceC3860 {
    private final SimpleConfig config;

    public AbstractC3845(InterfaceC8160 interfaceC8160) {
        super(interfaceC8160);
        this.config = new SimpleConfig(this);
    }

    public static InterfaceC8160 mergeOrigins(Collection<? extends AbstractC3842> collection) {
        C3837 c3837Origin = null;
        if (collection.isEmpty()) {
            C2941.m6350("can't merge origins on empty list");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InterfaceC8166 interfaceC8166 : collection) {
            if (c3837Origin == null) {
                c3837Origin = interfaceC8166.origin();
            }
            if (!(interfaceC8166 instanceof AbstractC3845) || ((AbstractC3845) interfaceC8166).resolveStatus() != ResolveStatus.RESOLVED || !((InterfaceC8161) interfaceC8166).isEmpty()) {
                arrayList.add(interfaceC8166.origin());
                i++;
            }
        }
        if (i == 0) {
            arrayList.add(c3837Origin);
        }
        return C3837.m8221(arrayList);
    }

    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map.".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3842 m8235(AbstractC3845 abstractC3845, C3857 c3857) {
        try {
            C3857 c38572 = c3857.f12080;
            AbstractC3842 abstractC3842AttemptPeekWithPartialResolve = abstractC3845.attemptPeekWithPartialResolve(c3857.f12081);
            if (c38572 == null) {
                return abstractC3842AttemptPeekWithPartialResolve;
            }
            if (abstractC3842AttemptPeekWithPartialResolve instanceof AbstractC3845) {
                return m8235((AbstractC3845) abstractC3842AttemptPeekWithPartialResolve, c38572);
            }
            return null;
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3862.m8256(c3857, e);
        }
    }

    public abstract AbstractC3842 attemptPeekWithPartialResolve(String str);

    @Override // java.util.Map
    public void clear() {
        throw weAreImmutable("clear");
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public AbstractC3845 constructDelayedMerge(InterfaceC8160 interfaceC8160, List<AbstractC3842> list) {
        return new C3859(interfaceC8160, list);
    }

    public abstract AbstractC3842 get(Object obj);

    public abstract AbstractC3845 newCopy(ResolveStatus resolveStatus, InterfaceC8160 interfaceC8160);

    @Override // com.typesafe.config.impl.AbstractC3842
    public AbstractC3845 newCopy(InterfaceC8160 interfaceC8160) {
        return newCopy(resolveStatus(), interfaceC8160);
    }

    public final AbstractC3842 peekAssumingResolved(String str, C3857 c3857) {
        try {
            return attemptPeekWithPartialResolve(str);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3862.m8256(c3857, e);
        }
    }

    public AbstractC3842 peekPath(C3857 c3857) {
        return m8235(this, c3857);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends InterfaceC8166> map) {
        throw weAreImmutable("putAll");
    }

    @Override // java.util.Map
    public InterfaceC8166 remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.OBJECT;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC3845 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (AbstractC3845) super.mo8233withFallback(interfaceC8162);
    }

    public abstract AbstractC3845 withOnlyPath(C3857 c3857);

    public abstract AbstractC3845 withOnlyPathOrNull(C3857 c3857);

    @Override // com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withOrigin, reason: merged with bridge method [inline-methods] */
    public AbstractC3845 mo8234withOrigin(InterfaceC8160 interfaceC8160) {
        return (AbstractC3845) super.mo8234withOrigin(interfaceC8160);
    }

    public abstract AbstractC3845 withValue(C3857 c3857, InterfaceC8166 interfaceC8166);

    public abstract AbstractC3845 withoutPath(C3857 c3857);

    @Override // p250.InterfaceC8161
    public SimpleConfig toConfig() {
        return this.config;
    }

    @Override // com.typesafe.config.impl.AbstractC3842, com.typesafe.config.impl.InterfaceC3856
    public AbstractC3845 toFallbackValue() {
        return this;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public /* bridge */ /* synthetic */ AbstractC3842 constructDelayedMerge(InterfaceC8160 interfaceC8160, List list) {
        return constructDelayedMerge(interfaceC8160, (List<AbstractC3842>) list);
    }

    @Override // java.util.Map
    public InterfaceC8166 put(String str, InterfaceC8166 interfaceC8166) {
        throw weAreImmutable("put");
    }

    public static InterfaceC8160 mergeOrigins(AbstractC3845... abstractC3845Arr) {
        return mergeOrigins(Arrays.asList(abstractC3845Arr));
    }
}
