package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.load.data.InterfaceC2959;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p222.AbstractC7988;
import p286.C8396;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3000 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f9517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2186 f9519;

    public C3000(Class cls, Class cls2, Class cls3, List list, InterfaceC2186 interfaceC2186) {
        this.f9519 = interfaceC2186;
        if (list.isEmpty()) {
            C5919.m11249("Must not be empty.");
            throw null;
        }
        this.f9518 = list;
        this.f9517 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9518.toArray()) + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2988 m6425(int i, int i2, InterfaceC2959 interfaceC2959, C2984 c2984, C8396 c8396) {
        InterfaceC2186 interfaceC2186 = this.f9519;
        List list = (List) interfaceC2186.acquire();
        AbstractC7988.m13441(list, "Argument must not be null");
        try {
            List list2 = this.f9518;
            int size = list2.size();
            InterfaceC2988 interfaceC2988M6449 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2988M6449 = ((C3011) list2.get(i3)).m6449(i, i2, interfaceC2959, c2984, c8396);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (interfaceC2988M6449 != null) {
                    break;
                }
            }
            if (interfaceC2988M6449 != null) {
                return interfaceC2988M6449;
            }
            throw new GlideException(this.f9517, new ArrayList(list));
        } finally {
            interfaceC2186.mo3979(list);
        }
    }
}
