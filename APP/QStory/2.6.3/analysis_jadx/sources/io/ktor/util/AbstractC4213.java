package io.ktor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4213 implements InterfaceC4214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f12703;

    public AbstractC4213(Map map) {
        map.getClass();
        C4206 c4206 = new C4206();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            c4206.put(str, arrayList);
        }
        this.f12703 = c4206;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4214)) {
            return false;
        }
        InterfaceC4214 interfaceC4214 = (InterfaceC4214) obj;
        if (true != interfaceC4214.mo8352()) {
            return false;
        }
        return mo8353().equals(interfaceC4214.mo8353());
    }

    public final int hashCode() {
        Set setMo8353 = mo8353();
        return setMo8353.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC4214
    public final boolean isEmpty() {
        return this.f12703.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC4214
    public final Set names() {
        Set setKeySet = this.f12703.keySet();
        setKeySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8352() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8353() {
        Set setEntrySet = this.f12703.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8354(String str) {
        str.getClass();
        return (List) this.f12703.get(str);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8355(InterfaceC6554 interfaceC6554) {
        for (Map.Entry entry : this.f12703.entrySet()) {
            interfaceC6554.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8356(String str) {
        List list = (List) this.f12703.get(str);
        if (list != null) {
            return (String) AbstractC4344.m8815(list);
        }
        return null;
    }
}
