package io.ktor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4212 implements InterfaceC4213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f12699;

    public AbstractC4212(Map map) {
        map.getClass();
        C4205 c4205 = new C4205();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            c4205.put(str, arrayList);
        }
        this.f12699 = c4205;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4213)) {
            return false;
        }
        InterfaceC4213 interfaceC4213 = (InterfaceC4213) obj;
        if (true != interfaceC4213.mo8362()) {
            return false;
        }
        return mo8363().equals(interfaceC4213.mo8363());
    }

    public final int hashCode() {
        Set setMo8363 = mo8363();
        return setMo8363.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC4213
    public final boolean isEmpty() {
        return this.f12699.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC4213
    public final Set names() {
        Set setKeySet = this.f12699.keySet();
        setKeySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8362() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8363() {
        Set setEntrySet = this.f12699.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8364(String str) {
        str.getClass();
        return (List) this.f12699.get(str);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8365(InterfaceC6553 interfaceC6553) {
        for (Map.Entry entry : this.f12699.entrySet()) {
            interfaceC6553.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8366(String str) {
        List list = (List) this.f12699.get(str);
        if (list != null) {
            return (String) AbstractC4343.m8830(list);
        }
        return null;
    }
}
