package com.bumptech.glide.load.engine;

import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.load.data.InterfaceC3792;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p238.AbstractC8818;
import p302.C9226;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3833 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f9864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3019 f9866;

    public C3833(Class cls, Class cls2, Class cls3, List list, InterfaceC3019 interfaceC3019) {
        this.f9866 = interfaceC3019;
        if (list.isEmpty()) {
            C6755.m11869("Must not be empty.");
            throw null;
        }
        this.f9865 = list;
        this.f9864 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9865.toArray()) + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3821 m7043(int i, int i2, InterfaceC3792 interfaceC3792, C3817 c3817, C9226 c9226) {
        InterfaceC3019 interfaceC3019 = this.f9866;
        List list = (List) interfaceC3019.acquire();
        AbstractC8818.m14028(list, "Argument must not be null");
        try {
            List list2 = this.f9865;
            int size = list2.size();
            InterfaceC3821 interfaceC3821M7069 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC3821M7069 = ((C3844) list2.get(i3)).m7069(i, i2, interfaceC3792, c3817, c9226);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (interfaceC3821M7069 != null) {
                    break;
                }
            }
            if (interfaceC3821M7069 != null) {
                return interfaceC3821M7069;
            }
            throw new GlideException(this.f9864, new ArrayList(list));
        } finally {
            interfaceC3019.mo4549(list);
        }
    }
}
