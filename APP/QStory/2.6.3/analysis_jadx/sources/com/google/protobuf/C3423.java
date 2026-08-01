package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3423 implements InterfaceC3424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f11087 = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m7536(Object obj, long j, int i) {
        List list = (List) AbstractC3726.f11548.m8018(obj, j);
        if (list.isEmpty()) {
            List c3384 = list instanceof InterfaceC3425 ? new C3384(i) : ((list instanceof InterfaceC3371) && (list instanceof InterfaceC3403)) ? ((InterfaceC3403) list).mo7486(i) : new ArrayList(i);
            AbstractC3726.m7994(j, obj, c3384);
            return c3384;
        }
        if (f11087.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC3726.m7994(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C3735) {
            C3735 c3735 = (C3735) list;
            C3384 c33842 = new C3384(c3735.size() + i);
            c33842.addAll(c3735);
            AbstractC3726.m7994(j, obj, c33842);
            return c33842;
        }
        if ((list instanceof InterfaceC3371) && (list instanceof InterfaceC3403)) {
            InterfaceC3403 interfaceC3403 = (InterfaceC3403) list;
            if (!((AbstractC3548) interfaceC3403).f11199) {
                InterfaceC3403 interfaceC3403Mo7486 = interfaceC3403.mo7486(list.size() + i);
                AbstractC3726.m7994(j, obj, interfaceC3403Mo7486);
                return interfaceC3403Mo7486;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final List mo7533(Object obj, long j) {
        return m7536(obj, j, 10);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7534(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC3726.f11548.m8018(obj, j);
        if (list instanceof InterfaceC3425) {
            objUnmodifiableList = ((InterfaceC3425) list).mo7491();
        } else {
            if (f11087.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC3371) && (list instanceof InterfaceC3403)) {
                AbstractC3548 abstractC3548 = (AbstractC3548) ((InterfaceC3403) list);
                if (abstractC3548.f11199) {
                    abstractC3548.m7787();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC3726.m7994(j, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7535(long j, Object obj, Object obj2) {
        List list = (List) AbstractC3726.f11548.m8018(obj2, j);
        List listM7536 = m7536(obj, j, list.size());
        int size = listM7536.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM7536.addAll(list);
        }
        if (size > 0) {
            list = listM7536;
        }
        AbstractC3726.m7994(j, obj, list);
    }
}
