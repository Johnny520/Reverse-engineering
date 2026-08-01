package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f13015 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f13016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f13017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5754 f13018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5024 f13019;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5028(C5024 c5024, AbstractC5754 abstractC5754) {
        c5024.getClass();
        ArrayList arrayList = f13015;
        arrayList.getClass();
        this(c5024, abstractC5754, AbstractC5220.m9450(arrayList));
        if (arrayList.isEmpty()) {
            return;
        }
        C6755.m11870("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.f13019.f13007 + "`, " + this.f13017.size() + " handlers";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9141(List list) {
        list.getClass();
        List list2 = this.f13017;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(list2.size() + arrayList.size());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list.add(list2.get(i));
        }
    }

    public C5028(C5024 c5024, AbstractC5754 abstractC5754, List list) {
        c5024.getClass();
        abstractC5754.getClass();
        list.getClass();
        this.f13019 = c5024;
        this.f13018 = abstractC5754;
        this.f13017 = list;
        this.f13016 = true;
    }
}
