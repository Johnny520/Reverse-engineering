package com.typesafe.config.impl;

import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p266.InterfaceC8990;
import p266.InterfaceC8991;
import p266.InterfaceC8992;
import p266.InterfaceC8996;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4678 extends AbstractC4675 implements InterfaceC8991, InterfaceC4693 {
    private final SimpleConfig config;

    public AbstractC4678(InterfaceC8990 interfaceC8990) {
        super(interfaceC8990);
        this.config = new SimpleConfig(this);
    }

    public static InterfaceC8990 mergeOrigins(Collection<? extends AbstractC4675> collection) {
        C4670 c4670Origin = null;
        if (collection.isEmpty()) {
            C3775.m6968("can't merge origins on empty list");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InterfaceC8996 interfaceC8996 : collection) {
            if (c4670Origin == null) {
                c4670Origin = interfaceC8996.origin();
            }
            if (!(interfaceC8996 instanceof AbstractC4678) || ((AbstractC4678) interfaceC8996).resolveStatus() != ResolveStatus.RESOLVED || !((InterfaceC8991) interfaceC8996).isEmpty()) {
                arrayList.add(interfaceC8996.origin());
                i++;
            }
        }
        if (i == 0) {
            arrayList.add(c4670Origin);
        }
        return C4670.m8767(arrayList);
    }

    public static UnsupportedOperationException weAreImmutable(String str) {
        return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map.".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC4675 m8781(AbstractC4678 abstractC4678, C4690 c4690) {
        try {
            C4690 c46902 = c4690.f12430;
            AbstractC4675 abstractC4675AttemptPeekWithPartialResolve = abstractC4678.attemptPeekWithPartialResolve(c4690.f12431);
            if (c46902 == null) {
                return abstractC4675AttemptPeekWithPartialResolve;
            }
            if (abstractC4675AttemptPeekWithPartialResolve instanceof AbstractC4678) {
                return m8781((AbstractC4678) abstractC4675AttemptPeekWithPartialResolve, c46902);
            }
            return null;
        } catch (ConfigException.NotResolved e) {
            throw AbstractC4695.m8802(c4690, e);
        }
    }

    public abstract AbstractC4675 attemptPeekWithPartialResolve(String str);

    @Override // java.util.Map
    public void clear() {
        throw weAreImmutable("clear");
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public AbstractC4678 constructDelayedMerge(InterfaceC8990 interfaceC8990, List<AbstractC4675> list) {
        return new C4692(interfaceC8990, list);
    }

    public abstract AbstractC4675 get(Object obj);

    public abstract AbstractC4678 newCopy(ResolveStatus resolveStatus, InterfaceC8990 interfaceC8990);

    @Override // com.typesafe.config.impl.AbstractC4675
    public AbstractC4678 newCopy(InterfaceC8990 interfaceC8990) {
        return newCopy(resolveStatus(), interfaceC8990);
    }

    public final AbstractC4675 peekAssumingResolved(String str, C4690 c4690) {
        try {
            return attemptPeekWithPartialResolve(str);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC4695.m8802(c4690, e);
        }
    }

    public AbstractC4675 peekPath(C4690 c4690) {
        return m8781(this, c4690);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends InterfaceC8996> map) {
        throw weAreImmutable("putAll");
    }

    @Override // java.util.Map
    public InterfaceC8996 remove(Object obj) {
        throw weAreImmutable("remove");
    }

    @Override // p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.OBJECT;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] */
    public AbstractC4678 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (AbstractC4678) super.mo8779withFallback(interfaceC8992);
    }

    public abstract AbstractC4678 withOnlyPath(C4690 c4690);

    public abstract AbstractC4678 withOnlyPathOrNull(C4690 c4690);

    @Override // com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withOrigin */
    public AbstractC4678 mo8780withOrigin(InterfaceC8990 interfaceC8990) {
        return (AbstractC4678) super.mo8780withOrigin(interfaceC8990);
    }

    public abstract AbstractC4678 withValue(C4690 c4690, InterfaceC8996 interfaceC8996);

    public abstract AbstractC4678 withoutPath(C4690 c4690);

    @Override // p266.InterfaceC8991
    public SimpleConfig toConfig() {
        return this.config;
    }

    @Override // com.typesafe.config.impl.AbstractC4675, com.typesafe.config.impl.InterfaceC4689
    public AbstractC4678 toFallbackValue() {
        return this;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public /* bridge */ /* synthetic */ AbstractC4675 constructDelayedMerge(InterfaceC8990 interfaceC8990, List list) {
        return constructDelayedMerge(interfaceC8990, (List<AbstractC4675>) list);
    }

    @Override // java.util.Map
    public InterfaceC8996 put(String str, InterfaceC8996 interfaceC8996) {
        throw weAreImmutable("put");
    }

    public static InterfaceC8990 mergeOrigins(AbstractC4678... abstractC4678Arr) {
        return mergeOrigins(Arrays.asList(abstractC4678Arr));
    }
}
