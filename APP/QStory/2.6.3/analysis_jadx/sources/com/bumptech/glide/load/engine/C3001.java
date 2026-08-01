package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.load.data.InterfaceC2960;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p222.AbstractC7989;
import p286.C8397;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f9519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2186 f9521;

    public C3001(Class cls, Class cls2, Class cls3, List list, InterfaceC2186 interfaceC2186) {
        this.f9521 = interfaceC2186;
        if (list.isEmpty()) {
            C5925.m11310("Must not be empty.");
            throw null;
        }
        this.f9520 = list;
        this.f9519 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9520.toArray()) + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2989 m6483(int i, int i2, InterfaceC2960 interfaceC2960, C2985 c2985, C8397 c8397) {
        InterfaceC2186 interfaceC2186 = this.f9521;
        List list = (List) interfaceC2186.acquire();
        AbstractC7989.m13469(list, "Argument must not be null");
        try {
            List list2 = this.f9520;
            int size = list2.size();
            InterfaceC2989 interfaceC2989M6509 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2989M6509 = ((C3012) list2.get(i3)).m6509(i, i2, interfaceC2960, c2985, c8397);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (interfaceC2989M6509 != null) {
                    break;
                }
            }
            if (interfaceC2989M6509 != null) {
                return interfaceC2989M6509;
            }
            throw new GlideException(this.f9519, new ArrayList(list));
        } finally {
            interfaceC2186.mo3989(list);
        }
    }
}
