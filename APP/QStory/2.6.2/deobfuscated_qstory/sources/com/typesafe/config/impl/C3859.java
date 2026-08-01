package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p007.AbstractC6136;
import p250.C8167;
import p250.InterfaceC8160;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8164;
import p250.InterfaceC8166;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3859 extends AbstractC3845 implements InterfaceC3820, InterfaceC3847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f12083;

    public C3859(InterfaceC8160 interfaceC8160, List list) {
        super(interfaceC8160);
        this.f12083 = list;
        if (list.isEmpty()) {
            C2941.m6350("creating empty delayed merge object");
            throw null;
        }
        if (!(list.get(0) instanceof AbstractC3845)) {
            C2941.m6350("created a delayed merge object not guaranteed to be an object");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3842 abstractC3842 = (AbstractC3842) it.next();
            if ((abstractC3842 instanceof C3840) || (abstractC3842 instanceof C3859)) {
                C2941.m6350("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ConfigException.NotResolved m8252() {
        return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3842 attemptPeekWithPartialResolve(String str) {
        for (AbstractC3842 abstractC3842 : this.f12083) {
            if (!(abstractC3842 instanceof AbstractC3845)) {
                if (abstractC3842 instanceof InterfaceC3820) {
                    StringBuilder sbM11550 = AbstractC6136.m11550("Key '", str, "' is not available at '");
                    sbM11550.append(origin().m8223());
                    sbM11550.append("' because value at '");
                    sbM11550.append(abstractC3842.origin().m8223());
                    sbM11550.append("' has not been resolved and may turn out to contain or hide '");
                    throw new ConfigException.NotResolved(AbstractC0053.m146(sbM11550, str, "'. Be sure to Config#resolve() before using a config object."));
                }
                if (abstractC3842.resolveStatus() == ResolveStatus.UNRESOLVED) {
                    if (abstractC3842 instanceof InterfaceC8164) {
                        return null;
                    }
                    C2941.m6337(abstractC3842, "Expecting a list here, not ");
                    return null;
                }
                if (abstractC3842.ignoresFallbacks()) {
                    return null;
                }
                C2941.m6350("resolved non-object should ignore fallbacks");
                return null;
            }
            AbstractC3842 abstractC3842AttemptPeekWithPartialResolve = ((AbstractC3845) abstractC3842).attemptPeekWithPartialResolve(str);
            if (abstractC3842AttemptPeekWithPartialResolve != null) {
                if (abstractC3842AttemptPeekWithPartialResolve.ignoresFallbacks()) {
                    return abstractC3842AttemptPeekWithPartialResolve;
                }
            } else if (abstractC3842 instanceof InterfaceC3820) {
                C2941.m6350("should not be reached: unmergeable object returned null value");
                return null;
            }
        }
        C2941.m6350("Delayed merge stack does not contain any unmergeable values");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean canEqual(Object obj) {
        return obj instanceof C3859;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        throw m8252();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw m8252();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3859)) {
            return false;
        }
        Object obj2 = ((C3859) obj).f12083;
        List list = this.f12083;
        return list == obj2 || list.equals(obj2);
    }

    @Override // com.typesafe.config.impl.AbstractC3845, java.util.Map
    public final AbstractC3842 get(Object obj) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public final boolean hasDescendant(AbstractC3842 abstractC3842) {
        return AbstractC3842.hasDescendantInList(this.f12083, abstractC3842);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final int hashCode() {
        return this.f12083.hashCode();
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final boolean ignoresFallbacks() {
        return C3840.m8227(this.f12083);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw m8252();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithNonObject(AbstractC3842 abstractC3842) {
        requireNotIgnoringFallbacks();
        return (C3859) mergedWithNonObject(this.f12083, abstractC3842);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithObject(AbstractC3845 abstractC3845) {
        requireNotIgnoringFallbacks();
        return (C3859) mergedWithNonObject(this.f12083, abstractC3845);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 mergedWithTheUnmergeable(InterfaceC3820 interfaceC3820) {
        requireNotIgnoringFallbacks();
        return (C3859) mergedWithTheUnmergeable(this.f12083, interfaceC3820);
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3845 newCopy(ResolveStatus resolveStatus, InterfaceC8160 interfaceC8160) {
        if (resolveStatus == ResolveStatus.UNRESOLVED) {
            return new C3859(interfaceC8160, this.f12083);
        }
        C2941.m6350("attempt to create resolved ConfigDelayedMergeObject");
        return null;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final AbstractC3842 relativized(C3857 c3857) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12083.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC3842) it.next()).relativized(c3857));
        }
        return new C3859(origin(), arrayList);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        render(sb, i, z, null, c8167);
    }

    @Override // com.typesafe.config.impl.InterfaceC3860
    public final AbstractC3842 replaceChild(AbstractC3842 abstractC3842, AbstractC3842 abstractC38422) {
        List<AbstractC3842> listReplaceChildInList = AbstractC3842.replaceChildInList(this.f12083, abstractC3842, abstractC38422);
        if (listReplaceChildInList == null) {
            return null;
        }
        return new C3859(origin(), listReplaceChildInList);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final ResolveStatus resolveStatus() {
        return ResolveStatus.UNRESOLVED;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final C3851 resolveSubstitutions(C3846 c3846, C3848 c3848) {
        C3851 c3851M8228 = C3840.m8228(this, this.f12083, c3846, c3848);
        AbstractC3842 abstractC3842 = c3851M8228.f12073;
        if (abstractC3842 instanceof AbstractC3845) {
            return c3851M8228;
        }
        C2941.m6337(abstractC3842, "Expecting a resolve result to be an object, but it was ");
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        throw m8252();
    }

    @Override // p250.InterfaceC8166
    public final Object unwrapped() {
        throw m8252();
    }

    @Override // java.util.Map
    public final Collection values() {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3845, com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC3845 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (C3859) super.mo8233withFallback(interfaceC8162);
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3845 withOnlyPath(C3857 c3857) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3845 withOnlyPathOrNull(C3857 c3857) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3845 withValue(C3857 c3857, InterfaceC8166 interfaceC8166) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3845
    public final AbstractC3845 withoutPath(C3857 c3857) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.InterfaceC3847
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC3842 mo8229(C3846 c3846, int i) {
        return C3840.m8226(c3846, this.f12083, i);
    }

    @Override // com.typesafe.config.impl.InterfaceC3820
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8208() {
        return this.f12083;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        throw m8252();
    }

    @Override // com.typesafe.config.impl.AbstractC3845, com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback */
    public final AbstractC3842 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (C3859) super.mo8233withFallback(interfaceC8162);
    }

    @Override // com.typesafe.config.impl.AbstractC3845, com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8162 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (C3859) super.mo8233withFallback(interfaceC8162);
    }

    @Override // com.typesafe.config.impl.AbstractC3845, com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8161 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (C3859) super.mo8233withFallback(interfaceC8162);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public final void render(StringBuilder sb, int i, boolean z, String str, C8167 c8167) {
        C3840.m8225(this.f12083, sb, i, z, str, c8167);
    }

    @Override // com.typesafe.config.impl.AbstractC3845, com.typesafe.config.impl.AbstractC3842
    /* JADX INFO: renamed from: withFallback */
    public final InterfaceC8166 mo8233withFallback(InterfaceC8162 interfaceC8162) {
        return (C3859) super.mo8233withFallback(interfaceC8162);
    }
}
