package io.ktor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5045 implements InterfaceC5046 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f13048;

    public AbstractC5045(Map map) {
        map.getClass();
        C5038 c5038 = new C5038();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            c5038.put(str, arrayList);
        }
        this.f13048 = c5038;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5046)) {
            return false;
        }
        InterfaceC5046 interfaceC5046 = (InterfaceC5046) obj;
        if (true != interfaceC5046.mo8911()) {
            return false;
        }
        return mo8912().equals(interfaceC5046.mo8912());
    }

    public final int hashCode() {
        Set setMo8912 = mo8912();
        return setMo8912.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC5046
    public final boolean isEmpty() {
        return this.f13048.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC5046
    public final Set names() {
        Set setKeySet = this.f13048.keySet();
        setKeySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8911() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8912() {
        Set setEntrySet = this.f13048.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8913(String str) {
        str.getClass();
        return (List) this.f13048.get(str);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8914(InterfaceC7383 interfaceC7383) {
        for (Map.Entry entry : this.f13048.entrySet()) {
            interfaceC7383.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8915(String str) {
        List list = (List) this.f13048.get(str);
        if (list != null) {
            return (String) AbstractC5176.m9374(list);
        }
        return null;
    }
}
