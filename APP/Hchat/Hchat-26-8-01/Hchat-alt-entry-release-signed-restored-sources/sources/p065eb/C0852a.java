package p065eb;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p054dg.C0795n;
import p063e9.C0837h;
import p096g8.C1363d;
import p096g8.InterfaceC1365f;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0852a implements InterfaceC1365f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p096g8.InterfaceC1365f
    /* JADX INFO: renamed from: a */
    public final void mo2162a(C0126e c0126e) {
        List<String> list;
        List<String> listM99x0;
        C0861d c0861d = C0861d.f2640a;
        boolean zM645w = c0126e.m645w();
        WeChatChatroom weChatChatroom = (WeChatChatroom) c0126e.f333i;
        if (zM645w) {
            String strM636n = c0126e.m636n();
            strM636n.getClass();
            String string = AbstractC3149m.m6703R0(strM636n).toString();
            if (string.length() == 0) {
                return;
            }
            List<String> list2 = C4173t.f13710g;
            if (weChatChatroom != null) {
                List<String> list3 = weChatChatroom.memberIds;
                String str = weChatChatroom.rawDisplayNames;
                int size = list3.size();
                if (!AbstractC3149m.m6721t0(str)) {
                    Iterator it = AbstractC0000a.m101y0("\u0001", "\u0002", "\n", ";").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            listM99x0 = AbstractC0000a.m99x0(str);
                            break;
                        }
                        listM99x0 = AbstractC3149m.m6692G0(str, new String[]{(String) it.next()});
                        if (size <= 0 || listM99x0.size() == size) {
                            break;
                        }
                    }
                } else {
                    listM99x0 = list2;
                }
                if (!list3.isEmpty() && listM99x0.size() == list3.size()) {
                    int i9 = 0;
                    for (Object obj : list3) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        String str2 = (String) obj;
                        String str3 = (String) AbstractC4166m.m8425w1(i9, listM99x0);
                        String string2 = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
                        if (string2 == null) {
                            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        ConcurrentHashMap concurrentHashMap = C0861d.f2643d;
                        concurrentHashMap.remove(C0861d.m2163a(string, str2));
                        if (!AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(string2) && !string2.equals(str2)) {
                            concurrentHashMap.put(C0861d.m2163a(string, str2), string2);
                        }
                        i9 = i10;
                    }
                }
            }
            if (weChatChatroom == null || (list = weChatChatroom.memberIds) == null) {
                C1363d c1363dM5159f = AbstractC2091b.m5159f();
                List<String> listM3677i = c1363dM5159f != null ? c1363dM5159f.m3677i(c0126e.m636n()) : null;
                if (listM3677i != null) {
                    list2 = listM3677i;
                }
            } else {
                list2 = list;
            }
            C3011i c3011i = new C3011i(AbstractC3015m.m6413W(new C0795n(list2, 6), new C0837h(7)), true, new C0837h(8));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC3015m.m6417a0(c3011i, linkedHashSet);
            if (linkedHashSet.isEmpty()) {
                return;
            }
            C0861d.m2170h(string, linkedHashSet);
            Set set = (Set) C0861d.f2642c.put(string, linkedHashSet);
            if (set != null) {
                Set<String> setM8352T = AbstractC4156d0.m8352T(linkedHashSet, set);
                Set<String> setM8352T2 = AbstractC4156d0.m8352T(set, linkedHashSet);
                if (setM8352T.isEmpty() && setM8352T2.isEmpty()) {
                    return;
                }
                for (String str4 : setM8352T) {
                    C0861d.m2167e("join", string, str4, C0861d.m2168f(string, str4));
                }
                for (String str5 : setM8352T2) {
                    C0861d.m2167e("left", string, str5, C0861d.m2168f(string, str5));
                }
            }
        }
    }
}
