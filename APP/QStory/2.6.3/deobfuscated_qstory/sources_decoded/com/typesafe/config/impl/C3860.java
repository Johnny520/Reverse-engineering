package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p009.AbstractC6183;
import p250.C8168;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8163;
import p250.InterfaceC8165;
import p250.InterfaceC8167;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3860 extends AbstractC3846 implements InterfaceC3821, InterfaceC3848 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12088;

    public C3860(InterfaceC8161 interfaceC8161, List list) {
        super(interfaceC8161);
        this.f12088 = list;
        if (list.isEmpty()) {
            C2942.m6408("creating empty delayed merge object");
            throw null;
        }
        if (!(list.get(0) instanceof AbstractC3846)) {
            C2942.m6408("created a delayed merge object not guaranteed to be an object");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3843 abstractC3843 = (AbstractC3843) it.next();
            if ((abstractC3843 instanceof C3841) || (abstractC3843 instanceof C3860)) {
                C2942.m6408("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ConfigException.NotResolved m8239() {
        return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3843 attemptPeekWithPartialResolve(String str) {
        for (AbstractC3843 abstractC3843 : this.f12088) {
            if (!(abstractC3843 instanceof AbstractC3846)) {
                if (abstractC3843 instanceof InterfaceC3821) {
                    StringBuilder sbM11585 = AbstractC6183.m11585("Key '", str, "' is not available at '");
                    sbM11585.append(origin().m8210());
                    sbM11585.append("' because value at '");
                    sbM11585.append(abstractC3843.origin().m8210());
                    sbM11585.append("' has not been resolved and may turn out to contain or hide '");
                    throw new ConfigException.NotResolved(AbstractC0053.m151(sbM11585, str, "'. Be sure to Config#resolve() before using a config object."));
                }
                if (abstractC3843.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    if (abstractC3843 instanceof InterfaceC8165) {
                        return null;
                    }
                    C2942.m6395(abstractC3843, "Expecting a list here, not ");
                    return null;
                }
                if (abstractC3843.ignoresFallbacks()) {
                    return null;
                }
                C2942.m6408("resolved non-object should ignore fallbacks");
                return null;
            }
            AbstractC3843 abstractC3843AttemptPeekWithPartialResolve = ((AbstractC3846) abstractC3843).attemptPeekWithPartialResolve(str);
            if (abstractC3843AttemptPeekWithPartialResolve != null) {
                if (abstractC3843AttemptPeekWithPartialResolve.ignoresFallbacks()) {
                    return abstractC3843AttemptPeekWithPartialResolve;
                }
            } else if (abstractC3843 instanceof InterfaceC3821) {
                C2942.m6408("should not be reached: unmergeable object returned null value");
                return null;
            }
        }
        C2942.m6408("Delayed merge stack does not contain any unmergeable values");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean canEqual(Object obj) {
        return obj instanceof C3860;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        throw m8239();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw m8239();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3860)) {
            return false;
        }
        Object obj2 = ((C3860) obj).f12088;
        List list = this.f12088;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.AbstractC3846, java.util.Map
    public final AbstractC3843 get(Object obj) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public final boolean hasDescendant(AbstractC3843 abstractC3843) {
        return AbstractC3843.hasDescendantInList(this.f12088, abstractC3843);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final int hashCode() {
        return this.f12088.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final boolean ignoresFallbacks() {
        return C3841.m8214(this.f12088);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw m8239();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithNonObject(AbstractC3843 abstractC3843) {
        requireNotIgnoringFallbacks();
        return (C3860) mergedWithNonObject(this.f12088, abstractC3843);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithObject(AbstractC3846 abstractC3846) {
        requireNotIgnoringFallbacks();
        return (C3860) mergedWithNonObject(this.f12088, abstractC3846);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 mergedWithTheUnmergeable(InterfaceC3821 interfaceC3821) {
        requireNotIgnoringFallbacks();
        return (C3860) mergedWithTheUnmergeable(this.f12088, interfaceC3821);
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3846 newCopy(ResolveStatus resolveStatus, InterfaceC8161 interfaceC8161) {
        if (resolveStatus == ResolveStatus.UNRESOLVED) {
            return new C3860(interfaceC8161, this.f12088);
        }
        C2942.m6408("attempt to create resolved ConfigDelayedMergeObject");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final AbstractC3843 relativized(C3858 c3858) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12088.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC3843) it.next()).relativized(c3858));
        }
        return new C3860(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        render(sb, i, z, null, c8168);
    }

    @Override // com.typesafe.config.impl.InterfaceC3861
    public final AbstractC3843 replaceChild(AbstractC3843 abstractC3843, AbstractC3843 abstractC38432) {
        List<AbstractC3843> listReplaceChildInList = AbstractC3843.replaceChildInList(this.f12088, abstractC3843, abstractC38432);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C3860(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final C3852 resolveSubstitutions(C3847 c3847, C3849 c3849) {
        C3852 c3852M8215 = C3841.m8215(this, this.f12088, c3847, c3849);
        AbstractC3843 abstractC3843 = c3852M8215.f12078;
        if (abstractC3843 instanceof AbstractC3846) {
            return c3852M8215;
        }
        C2942.m6395(abstractC3843, "Expecting a resolve result to be an object, but it was ");
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        throw m8239();
    }

    @Override // p250.InterfaceC8167
    public final Object unwrapped() {
        throw m8239();
    }

    @Override // java.util.Map
    public final Collection values() {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3846, com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC3846 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (C3860) super.mo8220withFallback(interfaceC8163);
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3846 withOnlyPath(C3858 c3858) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3846 withOnlyPathOrNull(C3858 c3858) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3846 withValue(C3858 c3858, InterfaceC8167 interfaceC8167) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3846
    public final AbstractC3846 withoutPath(C3858 c3858) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.InterfaceC3848
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC3843 mo8216(C3847 c3847, int i) {
        return C3841.m8213(c3847, this.f12088, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8195() {
        return this.f12088;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        throw m8239();
    }

    @Override // com.typesafe.config.impl.AbstractC3846, com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC3843 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (C3860) super.mo8220withFallback(interfaceC8163);
    }

    @Override // com.typesafe.config.impl.AbstractC3846, com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8163 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (C3860) super.mo8220withFallback(interfaceC8163);
    }

    @Override // com.typesafe.config.impl.AbstractC3846, com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8162 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (C3860) super.mo8220withFallback(interfaceC8163);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final void render(StringBuilder sb, int i, boolean z, String str, C8168 c8168) {
        C3841.m8212(this.f12088, sb, i, z, str, c8168);
    }

    @Override // com.typesafe.config.impl.AbstractC3846, com.typesafe.config.impl.AbstractC3843
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8167 mo8220withFallback(InterfaceC8163 interfaceC8163) {
        return (C3860) super.mo8220withFallback(interfaceC8163);
    }
}
