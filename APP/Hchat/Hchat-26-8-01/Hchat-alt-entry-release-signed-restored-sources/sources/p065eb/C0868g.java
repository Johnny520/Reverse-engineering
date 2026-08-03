package p065eb;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p025bc.C0262l;
import p025bc.C0264n;
import p025bc.InterfaceC0254d;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p110hc.InterfaceC1704a;
import p128ic.C2037b;
import p136j8.C2104o;
import p136j8.C2105p;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p281t3.AbstractC4106c;
import p302ud.C4309e;
import p302ud.C4322r;

/* JADX INFO: renamed from: eb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0868g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2665g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2666h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2667i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0868g(int i9, String str, String str2) {
        this.f2665g = i9;
        this.f2666h = str;
        this.f2667i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[LOOP:1: B:28:0x0090->B:102:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[PHI: r0
  0x0059: PHI (r0v22 bc.n) = (r0v21 bc.n), (r0v33 bc.n) binds: [B:13:0x002b, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7 A[SYNTHETIC] */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z9;
        Integer num;
        int iIntValue;
        Object next;
        switch (this.f2665g) {
            case 0:
                C0874j c0874j = (C0874j) obj;
                c0874j.getClass();
                if (c0874j.f2680a.equals(this.f2666h)) {
                    String str = this.f2667i;
                    z9 = AbstractC3149m.m6721t0(str) || AbstractC1416l.m3825a(c0874j.f2682c, str);
                }
                return Boolean.valueOf(z9);
            case 1:
                return Boolean.valueOf(ScriptWaBridge.sendVoice$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 2:
                return Boolean.valueOf(ScriptWaBridge.sendOriginalImage$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 3:
                return Boolean.valueOf(ScriptWaBridge.sendImage$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 4:
                return Boolean.valueOf(ScriptWaBridge.sendVideo$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 5:
                return Boolean.valueOf(ScriptWaBridge.sendEmoji$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 6:
                return Boolean.valueOf(ScriptWaBridge.sendFile$lambda$0(this.f2666h, this.f2667i, (C2105p) obj));
            case 7:
                return Boolean.valueOf(ScriptWaBridge.sendFavorite$lambda$1(this.f2666h, this.f2667i, (C2105p) obj));
            case 8:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                String strM6678c = ((C3145i) interfaceC3142f).m6678c();
                return AbstractC0255e.m1033v(strM6678c.substring(0, AbstractC3149m.m6718q0(strM6678c, '>', 0, 6) + 1), AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(this.f2666h, "&", "&amp;", false), "<", "&lt;", false), ">", "&gt;", false), "</", this.f2667i, ">");
            default:
                C0262l c0262l = (C0262l) obj;
                c0262l.getClass();
                C4309e c4309e = c0262l.f777b;
                if (c0262l.m1044b() == null) {
                    c4309e.m8651V();
                }
                String str2 = this.f2666h;
                C4322r c4322rM8667m0 = c4309e.m8667m0(str2);
                C0264n c0264nM1040c = c4322rM8667m0 == null ? null : c0262l.m1043a().m1040c(c4322rM8667m0);
                String str3 = this.f2667i;
                if (c0264nM1040c != null) {
                    C4322r c4322r = c0264nM1040c.f782a;
                    C4309e c4309e2 = c4322r.f14411l;
                    InterfaceC0254d interfaceC0254dM8651V = c4309e2.m8656a0().m8651V();
                    if (interfaceC0254dM8651V.mo1009a()) {
                        Iterator it = ((NavigableMap) interfaceC0254dM8651V.mo1011c().f333i).headMap(Integer.valueOf(c4322r.f9753j + 1), true).descendingMap().entrySet().iterator();
                        int i9 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                num = (Integer) entry.getKey();
                                InterfaceC1704a interfaceC1704a = (InterfaceC1704a) entry.getValue();
                                int iM8279b = AbstractC4106c.m8279b(interfaceC1704a.mo4336j());
                                if (iM8279b == 6) {
                                    int iM8279b2 = AbstractC4106c.m8279b(((C2037b) interfaceC1704a).f6872g.mo4336j());
                                    if (iM8279b2 == 0 || iM8279b2 == 2) {
                                        i9++;
                                    }
                                } else if (iM8279b == 8) {
                                    if (i9 != 0) {
                                        i9--;
                                    } else if (num == null) {
                                    }
                                }
                                num = null;
                                if (num == null) {
                                }
                            } else {
                                num = null;
                            }
                        }
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                        if (iIntValue != -1) {
                        }
                    } else {
                        iIntValue = -1;
                        if (iIntValue != -1) {
                            int length = c4322r.f9753j;
                            String str4 = c4309e2.f14371k.f14435a.f720F;
                            String strM1020i = AbstractC0255e.m1020i(str4, str4);
                            int iLastIndexOf = interfaceC0254dM8651V.mo1010b().lastIndexOf(strM1020i, length);
                            if (iLastIndexOf != -1) {
                                length = strM1020i.length() + iLastIndexOf;
                            }
                            String strSubstring = iIntValue < length ? HttpUrl.FRAGMENT_ENCODE_SET : interfaceC0254dM8651V.mo1010b().substring(length, iIntValue);
                            String str5 = AbstractC3149m.m6721t0(strSubstring) ? null : strSubstring;
                            if (str5 != null) {
                                return str5;
                            }
                            C2104o.m5276A("方法没有可导出的 Java 代码: ".concat(str3));
                        }
                    }
                } else {
                    c0262l.m1044b();
                    List list = c0262l.f779d;
                    list.getClass();
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (AbstractC1416l.m3825a(((C0264n) next).f782a.f14410k.f10154k, str2)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    c0264nM1040c = (C0264n) next;
                    if (c0264nM1040c == null) {
                        C2104o.m5294t("没有找到方法: ".concat(str3));
                    }
                }
                return null;
        }
    }
}
