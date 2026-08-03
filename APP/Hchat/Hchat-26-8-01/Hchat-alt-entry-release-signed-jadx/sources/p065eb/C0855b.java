package p065eb;

import ca.C0532s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ng.AbstractC3015m;
import ng.C3011i;
import p054dg.C0795n;
import p063e9.C0837h;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p153k8.C2351o;
import p153k8.InterfaceC2350n;
import p218og.AbstractC3149m;
import p276sf.C3958e;

/* JADX INFO: renamed from: eb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0855b implements InterfaceC2350n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2620a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.f.invoke():java.lang.Object, eb.k.j(r8.g):void] */
    public /* synthetic */ C0855b(int i9) {
        this.f2620a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    @Override // p153k8.InterfaceC2350n
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo973a(C2351o c2351o) {
        List list;
        List listM6418b0;
        List list2;
        switch (this.f2620a) {
            case 0:
                C0861d c0861d = C0861d.f2640a;
                ScriptMessageBean scriptMessageBean = new ScriptMessageBean(c2351o);
                if (scriptMessageBean.isSystem() && scriptMessageBean.isGroupChat()) {
                    String string = AbstractC3149m.m6703R0(scriptMessageBean.getTalker()).toString();
                    if (string.length() != 0) {
                        String xml = scriptMessageBean.getXml();
                        String content = scriptMessageBean.getContent();
                        StringBuilder sb2 = new StringBuilder();
                        if (!AbstractC3149m.m6721t0(content)) {
                            sb2.append(content);
                        }
                        if (!AbstractC3149m.m6721t0(xml)) {
                            sb2.append('\n');
                            sb2.append(xml);
                        }
                        String string2 = sb2.toString();
                        C0858c c0858c = null;
                        if (!AbstractC3149m.m6721t0(string2) && ((list = C0861d.f2645f) == null || !list.isEmpty())) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (AbstractC3149m.m6709h0(string2, (String) it.next(), true)) {
                                        if (!AbstractC3149m.m6721t0(string2) && ((list2 = C0861d.f2646g) == null || !list2.isEmpty())) {
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                if (AbstractC3149m.m6709h0(string2, (String) it2.next(), true)) {
                                                }
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            C0861d.m2165c(xml, linkedHashMap);
                                            C0861d.m2165c(content, linkedHashMap);
                                            Set setEntrySet = linkedHashMap.entrySet();
                                            setEntrySet.getClass();
                                            listM6418b0 = AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6413W(new C0795n(setEntrySet, 6), new C0837h(6)), true, new C0532s(string, 1)));
                                            if (!listM6418b0.isEmpty()) {
                                                c0858c = new C0858c(string, listM6418b0);
                                            }
                                        } else {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            C0861d.m2165c(xml, linkedHashMap2);
                                            C0861d.m2165c(content, linkedHashMap2);
                                            Set setEntrySet2 = linkedHashMap2.entrySet();
                                            setEntrySet2.getClass();
                                            listM6418b0 = AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6413W(new C0795n(setEntrySet2, 6), new C0837h(6)), true, new C0532s(string, 1)));
                                            if (!listM6418b0.isEmpty()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (c0858c != null) {
                            for (C3958e c3958e : c0858c.f2625b) {
                                String str = (String) c3958e.f12961g;
                                String str2 = (String) c3958e.f12962h;
                                if (!AbstractC3149m.m6721t0(str)) {
                                    if (!AbstractC3149m.m6721t0(str2) && !str2.equals(str)) {
                                        C0861d.f2643d.put(C0861d.m2163a(string, str), str2);
                                    }
                                    C0861d.m2167e("join", string, str, C0861d.m2168f(string, str));
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                C0876k c0876k = C0876k.f2687a;
                C0876k.m2183i(new ScriptMessageBean(c2351o));
                break;
        }
    }
}
