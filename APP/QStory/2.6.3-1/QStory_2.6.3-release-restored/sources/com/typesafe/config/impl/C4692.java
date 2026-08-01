package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p025.AbstractC7012;
import p266.C8997;
import p266.InterfaceC8990;
import p266.InterfaceC8991;
import p266.InterfaceC8992;
import p266.InterfaceC8994;
import p266.InterfaceC8996;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4692 extends AbstractC4678 implements InterfaceC4653, InterfaceC4680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12433;

    public C4692(InterfaceC8990 interfaceC8990, List list) {
        super(interfaceC8990);
        this.f12433 = list;
        if (list.isEmpty()) {
            C3775.m6968("creating empty delayed merge object");
            throw null;
        }
        if (!(list.get(0) instanceof AbstractC4678)) {
            C3775.m6968("created a delayed merge object not guaranteed to be an object");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4675 abstractC4675 = (AbstractC4675) it.next();
            if ((abstractC4675 instanceof C4673) || (abstractC4675 instanceof C4692)) {
                C3775.m6968("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ConfigException.NotResolved m8798() {
        return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4675 attemptPeekWithPartialResolve(String str) {
        for (AbstractC4675 abstractC4675 : this.f12433) {
            if (!(abstractC4675 instanceof AbstractC4678)) {
                if (abstractC4675 instanceof InterfaceC4653) {
                    StringBuilder sbM12144 = AbstractC7012.m12144("Key '", str, "' is not available at '");
                    sbM12144.append(origin().m8769());
                    sbM12144.append("' because value at '");
                    sbM12144.append(abstractC4675.origin().m8769());
                    sbM12144.append("' has not been resolved and may turn out to contain or hide '");
                    throw new ConfigException.NotResolved(AbstractC0900.m711(sbM12144, str, "'. Be sure to Config#resolve() before using a config object."));
                }
                if (abstractC4675.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    if (abstractC4675 instanceof InterfaceC8994) {
                        return null;
                    }
                    C3775.m6955(abstractC4675, "Expecting a list here, not ");
                    return null;
                }
                if (abstractC4675.ignoresFallbacks()) {
                    return null;
                }
                C3775.m6968("resolved non-object should ignore fallbacks");
                return null;
            }
            AbstractC4675 abstractC4675AttemptPeekWithPartialResolve = ((AbstractC4678) abstractC4675).attemptPeekWithPartialResolve(str);
            if (abstractC4675AttemptPeekWithPartialResolve != null) {
                if (abstractC4675AttemptPeekWithPartialResolve.ignoresFallbacks()) {
                    return abstractC4675AttemptPeekWithPartialResolve;
                }
            } else if (abstractC4675 instanceof InterfaceC4653) {
                C3775.m6968("should not be reached: unmergeable object returned null value");
                return null;
            }
        }
        C3775.m6968("Delayed merge stack does not contain any unmergeable values");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean canEqual(Object obj) {
        return obj instanceof C4692;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        throw m8798();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw m8798();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4692)) {
            return false;
        }
        Object obj2 = ((C4692) obj).f12433;
        List list = this.f12433;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.AbstractC4678, java.util.Map
    public final AbstractC4675 get(Object obj) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public final boolean hasDescendant(AbstractC4675 abstractC4675) {
        return AbstractC4675.hasDescendantInList(this.f12433, abstractC4675);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final int hashCode() {
        return this.f12433.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final boolean ignoresFallbacks() {
        return C4673.m8773(this.f12433);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw m8798();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithNonObject(AbstractC4675 abstractC4675) {
        requireNotIgnoringFallbacks();
        return (C4692) mergedWithNonObject(this.f12433, abstractC4675);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithObject(AbstractC4678 abstractC4678) {
        requireNotIgnoringFallbacks();
        return (C4692) mergedWithNonObject(this.f12433, abstractC4678);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 mergedWithTheUnmergeable(InterfaceC4653 interfaceC4653) {
        requireNotIgnoringFallbacks();
        return (C4692) mergedWithTheUnmergeable(this.f12433, interfaceC4653);
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4678 newCopy(ResolveStatus resolveStatus, InterfaceC8990 interfaceC8990) {
        if (resolveStatus == ResolveStatus.UNRESOLVED) {
            return new C4692(interfaceC8990, this.f12433);
        }
        C3775.m6968("attempt to create resolved ConfigDelayedMergeObject");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final AbstractC4675 relativized(C4690 c4690) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12433.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4675) it.next()).relativized(c4690));
        }
        return new C4692(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        render(sb, i, z, null, c8997);
    }

    @Override // com.typesafe.config.impl.InterfaceC4693
    public final AbstractC4675 replaceChild(AbstractC4675 abstractC4675, AbstractC4675 abstractC46752) {
        List<AbstractC4675> listReplaceChildInList = AbstractC4675.replaceChildInList(this.f12433, abstractC4675, abstractC46752);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C4692(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final C4684 resolveSubstitutions(C4679 c4679, C4681 c4681) {
        C4684 c4684M8774 = C4673.m8774(this, this.f12433, c4679, c4681);
        AbstractC4675 abstractC4675 = c4684M8774.f12423;
        if (abstractC4675 instanceof AbstractC4678) {
            return c4684M8774;
        }
        C3775.m6955(abstractC4675, "Expecting a resolve result to be an object, but it was ");
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        throw m8798();
    }

    @Override // p266.InterfaceC8996
    public final Object unwrapped() {
        throw m8798();
    }

    @Override // java.util.Map
    public final Collection values() {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4678, com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC4678 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (C4692) super.mo8779withFallback(interfaceC8992);
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4678 withOnlyPath(C4690 c4690) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4678 withOnlyPathOrNull(C4690 c4690) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4678 withValue(C4690 c4690, InterfaceC8996 interfaceC8996) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4678
    public final AbstractC4678 withoutPath(C4690 c4690) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.InterfaceC4680
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC4675 mo8775(C4679 c4679, int i) {
        return C4673.m8772(c4679, this.f12433, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC4653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8754() {
        return this.f12433;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        throw m8798();
    }

    @Override // com.typesafe.config.impl.AbstractC4678, com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC4675 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (C4692) super.mo8779withFallback(interfaceC8992);
    }

    @Override // com.typesafe.config.impl.AbstractC4678, com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8992 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (C4692) super.mo8779withFallback(interfaceC8992);
    }

    @Override // com.typesafe.config.impl.AbstractC4678, com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8991 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (C4692) super.mo8779withFallback(interfaceC8992);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public final void render(StringBuilder sb, int i, boolean z, String str, C8997 c8997) {
        C4673.m8771(this.f12433, sb, i, z, str, c8997);
    }

    @Override // com.typesafe.config.impl.AbstractC4678, com.typesafe.config.impl.AbstractC4675
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8996 mo8779withFallback(InterfaceC8992 interfaceC8992) {
        return (C4692) super.mo8779withFallback(interfaceC8992);
    }
}
