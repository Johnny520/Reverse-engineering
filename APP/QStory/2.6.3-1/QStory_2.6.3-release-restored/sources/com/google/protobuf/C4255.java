package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4255 implements InterfaceC4256 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f11432 = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m8095(Object obj, long j, int i) {
        List list = (List) AbstractC4558.f11893.m8577(obj, j);
        if (list.isEmpty()) {
            List c4216 = list instanceof InterfaceC4257 ? new C4216(i) : ((list instanceof InterfaceC4203) && (list instanceof InterfaceC4235)) ? ((InterfaceC4235) list).mo8045(i) : new ArrayList(i);
            AbstractC4558.m8553(j, obj, c4216);
            return c4216;
        }
        if (f11432.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC4558.m8553(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C4567) {
            C4567 c4567 = (C4567) list;
            C4216 c42162 = new C4216(c4567.size() + i);
            c42162.addAll(c4567);
            AbstractC4558.m8553(j, obj, c42162);
            return c42162;
        }
        if ((list instanceof InterfaceC4203) && (list instanceof InterfaceC4235)) {
            InterfaceC4235 interfaceC4235 = (InterfaceC4235) list;
            if (!((AbstractC4380) interfaceC4235).f11544) {
                InterfaceC4235 interfaceC4235Mo8045 = interfaceC4235.mo8045(list.size() + i);
                AbstractC4558.m8553(j, obj, interfaceC4235Mo8045);
                return interfaceC4235Mo8045;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo8092(Object obj, long j) {
        return m8095(obj, j, 10);
    }

    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8093(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC4558.f11893.m8577(obj, j);
        if (list instanceof InterfaceC4257) {
            objUnmodifiableList = ((InterfaceC4257) list).mo8050();
        } else {
            if (f11432.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC4203) && (list instanceof InterfaceC4235)) {
                AbstractC4380 abstractC4380 = (AbstractC4380) ((InterfaceC4235) list);
                if (abstractC4380.f11544) {
                    abstractC4380.m8346();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC4558.m8553(j, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8094(long j, Object obj, Object obj2) {
        List list = (List) AbstractC4558.f11893.m8577(obj2, j);
        List listM8095 = m8095(obj, j, list.size());
        int size = listM8095.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM8095.addAll(list);
        }
        if (size > 0) {
            list = listM8095;
        }
        AbstractC4558.m8553(j, obj, list);
    }
}
