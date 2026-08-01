package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4387;
import p053.AbstractC6560;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList f12666 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f12667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f12668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6560 f12669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4191 f12670;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4195(C4191 c4191, AbstractC6560 abstractC6560) {
        c4191.getClass();
        ArrayList arrayList = f12666;
        arrayList.getClass();
        this(c4191, abstractC6560, AbstractC4387.m8901(arrayList));
        if (arrayList.isEmpty()) {
            return;
        }
        C5919.m11250("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.f12670.f12658 + "`, " + this.f12668.size() + " handlers";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8592(List list) {
        list.getClass();
        List list2 = this.f12668;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(list2.size() + arrayList.size());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list.add(list2.get(i));
        }
    }

    public C4195(C4191 c4191, AbstractC6560 abstractC6560, List list) {
        c4191.getClass();
        abstractC6560.getClass();
        list.getClass();
        this.f12670 = c4191;
        this.f12669 = abstractC6560;
        this.f12668 = list;
        this.f12667 = true;
    }
}
