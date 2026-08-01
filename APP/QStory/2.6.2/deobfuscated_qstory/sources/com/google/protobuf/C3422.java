package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3422 implements InterfaceC3423 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f11082 = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m7549(Object obj, long j, int i) {
        List list = (List) AbstractC3725.f11543.m8031(obj, j);
        if (list.isEmpty()) {
            List c3383 = list instanceof InterfaceC3424 ? new C3383(i) : ((list instanceof InterfaceC3370) && (list instanceof InterfaceC3402)) ? ((InterfaceC3402) list).mo7499(i) : new ArrayList(i);
            AbstractC3725.m8007(j, obj, c3383);
            return c3383;
        }
        if (f11082.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC3725.m8007(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C3734) {
            C3734 c3734 = (C3734) list;
            C3383 c33832 = new C3383(c3734.size() + i);
            c33832.addAll(c3734);
            AbstractC3725.m8007(j, obj, c33832);
            return c33832;
        }
        if ((list instanceof InterfaceC3370) && (list instanceof InterfaceC3402)) {
            InterfaceC3402 interfaceC3402 = (InterfaceC3402) list;
            if (!((AbstractC3547) interfaceC3402).f11194) {
                InterfaceC3402 interfaceC3402Mo7499 = interfaceC3402.mo7499(list.size() + i);
                AbstractC3725.m8007(j, obj, interfaceC3402Mo7499);
                return interfaceC3402Mo7499;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo7546(Object obj, long j) {
        return m7549(obj, j, 10);
    }

    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7547(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC3725.f11543.m8031(obj, j);
        if (list instanceof InterfaceC3424) {
            objUnmodifiableList = ((InterfaceC3424) list).mo7504();
        } else {
            if (f11082.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC3370) && (list instanceof InterfaceC3402)) {
                AbstractC3547 abstractC3547 = (AbstractC3547) ((InterfaceC3402) list);
                if (abstractC3547.f11194) {
                    abstractC3547.m7800();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC3725.m8007(j, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7548(long j, Object obj, Object obj2) {
        List list = (List) AbstractC3725.f11543.m8031(obj2, j);
        List listM7549 = m7549(obj, j, list.size());
        int size = listM7549.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM7549.addAll(list);
        }
        if (size > 0) {
            list = listM7549;
        }
        AbstractC3725.m8007(j, obj, list);
    }
}
