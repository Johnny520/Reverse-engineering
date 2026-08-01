package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4196 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f12670 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f12671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f12672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4922 f12673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4192 f12674;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4196(C4192 c4192, AbstractC4922 abstractC4922) {
        c4192.getClass();
        ArrayList arrayList = f12670;
        arrayList.getClass();
        this(c4192, abstractC4922, AbstractC4388.m8891(arrayList));
        if (arrayList.isEmpty()) {
            return;
        }
        C5925.m11311("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.f12674.f12662 + "`, " + this.f12672.size() + " handlers";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8582(List list) {
        list.getClass();
        List list2 = this.f12672;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(list2.size() + arrayList.size());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list.add(list2.get(i));
        }
    }

    public C4196(C4192 c4192, AbstractC4922 abstractC4922, List list) {
        c4192.getClass();
        abstractC4922.getClass();
        list.getClass();
        this.f12674 = c4192;
        this.f12673 = abstractC4922;
        this.f12672 = list;
        this.f12671 = true;
    }
}
