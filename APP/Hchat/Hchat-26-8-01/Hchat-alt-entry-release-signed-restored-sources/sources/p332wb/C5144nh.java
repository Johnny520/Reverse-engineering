package p332wb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p010aa.C0033a;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p211o9.C3104q;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p243q9.C3471g;
import p259r9.AbstractC3754e0;
import p261rb.C3785a;
import p261rb.C3793i;
import p261rb.C3795k;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: wb.nh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5144nh implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19209g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f19210h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5144nh(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f19209g = i9;
        this.f19210h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C3785a c3785a;
        Object c3959f;
        Object c3959f2;
        C3785a c3785a2;
        switch (this.f19209g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f19210h;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) interfaceC1809a1.getValue(), c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = this.f19210h;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a12);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4749bf(interfaceC1809a12, 29);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("新增回复", "添加一条按顺序发送的回复", (InterfaceC1220a) objM4514P, c1836h02, 54);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC1809a1 interfaceC1809a13 = this.f19210h;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) interfaceC1809a13.getValue(), c1836h03, 0);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                InterfaceC1809a1 interfaceC1809a14 = this.f19210h;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str = (String) interfaceC1809a14.getValue();
                    Object objM4514P2 = c1836h04.m4514P();
                    if (objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C5343ti(interfaceC1809a14, 28);
                        c1836h04.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9304C1("搜索", "输入模型名过滤", str, 0, (InterfaceC1231l) objM4514P2, c1836h04, 24630, 8);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                InterfaceC1809a1 interfaceC1809a15 = this.f19210h;
                int iIntValue5 = ((Integer) obj).intValue();
                C3471g c3471g = (C3471g) obj2;
                c3471g.getClass();
                interfaceC1809a15.setValue(new C5032k4(iIntValue5, c3471g, true));
                return C3967n.f12976a;
            case 5:
                InterfaceC1809a1 interfaceC1809a16 = this.f19210h;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                interfaceC1809a16.setValue(new C4999j4(str2, str3));
                return C3967n.f12976a;
            case 6:
                InterfaceC1809a1 interfaceC1809a17 = this.f19210h;
                int iIntValue6 = ((Integer) obj).intValue();
                C0040h c0040h = (C0040h) obj2;
                c0040h.getClass();
                interfaceC1809a17.setValue(new C4806d6(iIntValue6, c0040h, true));
                return C3967n.f12976a;
            case 7:
                InterfaceC1809a1 interfaceC1809a18 = this.f19210h;
                int iIntValue7 = ((Integer) obj).intValue();
                C0033a c0033a = (C0033a) obj2;
                c0033a.getClass();
                interfaceC1809a18.setValue(new C4969i5(iIntValue7, c0033a, true));
                return C3967n.f12976a;
            case 8:
                InterfaceC1809a1 interfaceC1809a19 = this.f19210h;
                int iIntValue8 = ((Integer) obj).intValue();
                C4297h c4297h = (C4297h) obj2;
                c4297h.getClass();
                interfaceC1809a19.setValue(new C5124mu(iIntValue8, c4297h, true));
                return C3967n.f12976a;
            case 9:
                InterfaceC1809a1 interfaceC1809a110 = this.f19210h;
                int iIntValue9 = ((Integer) obj).intValue();
                C4298i c4298i = (C4298i) obj2;
                c4298i.getClass();
                interfaceC1809a110.setValue(new C5157nu(iIntValue9, c4298i, true));
                return C3967n.f12976a;
            case 10:
                InterfaceC1809a1 interfaceC1809a111 = this.f19210h;
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final int iIntValue10 = ((Integer) obj2).intValue();
                List list = (List) interfaceC1809a111.getValue();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5323sv) it.next()).f20728a);
                }
                final C3795k c3795k = AbstractC1184v0.f3987a;
                if (c3795k == null) {
                    c3785a = new C3785a(false, "检测运行时尚未就绪");
                } else if (!c3795k.f12452l || c3795k.f12451k == null) {
                    c3785a = new C3785a(false, "删除好友接口尚未就绪");
                } else {
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC2091b.m5171r((String) it2.next(), arrayList2);
                    }
                    List<String> listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
                    if (listM8407P1.isEmpty()) {
                        c3785a = new C3785a(false, "请选择要删除的好友");
                    } else if (listM8407P1.isEmpty()) {
                        synchronized (c3795k.f12444d) {
                            if (c3795k.f12453m) {
                                c3785a = new C3785a(false, "请先暂停好友检测");
                            } else if (c3795k.f12459s) {
                                c3785a = new C3785a(false, "批量删除正在运行");
                            } else {
                                try {
                                    C1368i c1368iContacts = WeChatApis.contacts();
                                    c3959f = c1368iContacts != null ? c1368iContacts.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'", null) : null;
                                    if (c3959f == null) {
                                        c3959f = C4173t.f13710g;
                                    }
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b == null) {
                                    List list2 = (List) c3959f;
                                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list2));
                                    if (iM8438a0 < 16) {
                                        iM8438a0 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                                    for (Object obj3 : list2) {
                                        linkedHashMap.put(((WeChatContact) obj3).wxId, obj3);
                                    }
                                    if (listM8407P1.isEmpty()) {
                                        final ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM8407P1));
                                        for (String str4 : listM8407P1) {
                                            String strDisplayName = ((WeChatContact) AbstractC4178y.m8436Y(str4, linkedHashMap)).displayName();
                                            if (AbstractC3149m.m6721t0(strDisplayName)) {
                                                strDisplayName = str4;
                                            }
                                            arrayList3.add(new C3793i(str4, strDisplayName));
                                        }
                                        synchronized (c3795k.f12444d) {
                                            if (c3795k.f12453m) {
                                                c3785a2 = new C3785a(false, "请先暂停好友检测");
                                            } else if (c3795k.f12459s) {
                                                c3785a2 = new C3785a(false, "批量删除正在运行");
                                            } else {
                                                c3795k.f12458r++;
                                                c3795k.f12459s = true;
                                                c3795k.f12460t = arrayList3.size();
                                                c3795k.f12461u = 0;
                                                c3795k.f12462v = 0;
                                                c3795k.f12463w = 0;
                                                c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                                c3795k.f12454n = "准备批量删除 " + arrayList3.size() + " 位好友";
                                                c3795k.m7976b("开始批量删除 " + arrayList3.size() + " 位好友");
                                                final long j3 = c3795k.f12458r;
                                                try {
                                                    c3795k.f12446f.execute(new Runnable() { // from class: rb.f
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean zM7977c;
                                                            C3795k c3795k2 = c3795k;
                                                            ArrayList arrayList4 = arrayList3;
                                                            boolean z9 = zBooleanValue;
                                                            int i9 = iIntValue10;
                                                            long j4 = j3;
                                                            int iM7909r = AbstractC3754e0.m7909r(i9, 0, 300);
                                                            c3795k2.getClass();
                                                            int i10 = 0;
                                                            for (Object obj4 : arrayList4) {
                                                                int i11 = i10 + 1;
                                                                if (i10 < 0) {
                                                                    AbstractC0000a.m32Q0();
                                                                    throw null;
                                                                }
                                                                C3793i c3793i = (C3793i) obj4;
                                                                if (!c3795k2.m7977c(j4)) {
                                                                    return;
                                                                }
                                                                synchronized (c3795k2.f12444d) {
                                                                    String str5 = c3793i.f12438b;
                                                                    c3795k2.f12455o = str5;
                                                                    c3795k2.f12454n = "正在删除 " + str5 + " (" + i11 + "/" + arrayList4.size() + ")";
                                                                }
                                                                C3787c c3787c = c3795k2.f12451k;
                                                                boolean z10 = c3787c != null && c3787c.m7968b(c3793i.f12437a, z9);
                                                                synchronized (c3795k2.f12444d) {
                                                                    try {
                                                                        if (!c3795k2.m7978d(j4)) {
                                                                            return;
                                                                        }
                                                                        c3795k2.f12461u++;
                                                                        if (z10) {
                                                                            c3795k2.f12462v++;
                                                                        } else {
                                                                            c3795k2.f12463w++;
                                                                        }
                                                                        c3795k2.m7976b(c3793i.f12438b + ": " + (z10 ? "已提交删除好友" : "删除好友失败"));
                                                                        if (i10 < arrayList4.size() - 1) {
                                                                            int i12 = iM7909r * 10;
                                                                            while (true) {
                                                                                if (i12 <= 0) {
                                                                                    zM7977c = c3795k2.m7977c(j4);
                                                                                    break;
                                                                                } else if (!c3795k2.m7977c(j4)) {
                                                                                    zM7977c = false;
                                                                                    break;
                                                                                } else {
                                                                                    try {
                                                                                        Thread.sleep(100L);
                                                                                    } catch (Throwable unused) {
                                                                                    }
                                                                                    i12--;
                                                                                }
                                                                            }
                                                                            if (!zM7977c) {
                                                                                return;
                                                                            }
                                                                        }
                                                                        i10 = i11;
                                                                    } catch (Throwable th3) {
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            synchronized (c3795k2.f12444d) {
                                                                if (c3795k2.m7978d(j4)) {
                                                                    c3795k2.f12459s = false;
                                                                    c3795k2.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    c3795k2.f12454n = "批量删除完成";
                                                                    c3795k2.m7976b("批量删除完成，已提交 " + c3795k2.f12462v + " 位，失败 " + c3795k2.f12463w + " 位");
                                                                }
                                                            }
                                                        }
                                                    });
                                                    c3959f2 = C3967n.f12976a;
                                                } catch (Throwable th3) {
                                                    c3959f2 = new C3959f(th3);
                                                }
                                                if (c3959f2 instanceof C3959f) {
                                                    synchronized (c3795k.f12444d) {
                                                        if (c3795k.m7978d(j3)) {
                                                            c3795k.f12459s = false;
                                                            c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                                            c3795k.f12454n = "批量删除启动失败";
                                                            c3795k.m7976b("批量删除任务提交失败");
                                                        }
                                                        break;
                                                    }
                                                    c3785a = new C3785a(false, "批量删除任务启动失败");
                                                } else {
                                                    c3785a = new C3785a(true, AbstractC0921a.m2250m(arrayList3.size(), "已开始批量删除 ", " 位好友"));
                                                }
                                            }
                                            c3785a = c3785a2;
                                            break;
                                        }
                                    } else {
                                        Iterator it3 = listM8407P1.iterator();
                                        while (it3.hasNext()) {
                                            if (!linkedHashMap.containsKey((String) it3.next())) {
                                                c3785a = new C3785a(false, "部分好友已不在联系人列表，请重新选择");
                                            }
                                        }
                                        final ArrayList arrayList32 = new ArrayList(AbstractC4167n.m8429e1(listM8407P1));
                                        while (r14.hasNext()) {
                                        }
                                        synchronized (c3795k.f12444d) {
                                        }
                                    }
                                } else {
                                    c3795k.f12441a.invoke("批量删除前读取好友列表失败", thM8182b);
                                    c3785a = new C3785a(false, "读取好友列表失败");
                                }
                            }
                            break;
                        }
                    } else {
                        Iterator it4 = listM8407P1.iterator();
                        while (it4.hasNext()) {
                            if (!C3795k.m7974g((String) it4.next())) {
                                c3785a = new C3785a(false, "选择中包含无效联系人，请重新选择");
                            }
                        }
                        synchronized (c3795k.f12444d) {
                        }
                    }
                }
                interfaceC1809a111.setValue(C4173t.f13710g);
                return c3785a;
            case 11:
                InterfaceC1809a1 interfaceC1809a112 = this.f19210h;
                int iIntValue11 = ((Integer) obj).intValue();
                C3104q c3104q = (C3104q) obj2;
                c3104q.getClass();
                interfaceC1809a112.setValue(new C4771c4(iIntValue11, c3104q, true));
                return C3967n.f12976a;
            case 12:
                InterfaceC1809a1 interfaceC1809a113 = this.f19210h;
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                interfaceC1809a113.setValue(new C3958e(str5, str6));
                return C3967n.f12976a;
            case 13:
                InterfaceC1809a1 interfaceC1809a114 = this.f19210h;
                int iIntValue12 = ((Integer) obj).intValue();
                C2921i c2921i = (C2921i) obj2;
                c2921i.getClass();
                interfaceC1809a114.setValue(new C4957hq(iIntValue12, c2921i, true));
                return C3967n.f12976a;
            case 14:
                InterfaceC1809a1 interfaceC1809a115 = this.f19210h;
                int iIntValue13 = ((Integer) obj).intValue();
                C2922j c2922j = (C2922j) obj2;
                c2922j.getClass();
                interfaceC1809a115.setValue(new C5384uq(iIntValue13, c2922j, true));
                return C3967n.f12976a;
            case 15:
                C3147k c3147k = AbstractC4955ho.f17686a;
                this.f19210h.setValue((List) obj);
                return C3967n.f12976a;
            default:
                InterfaceC1809a1 interfaceC1809a116 = this.f19210h;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC4955ho.m9657s0(AbstractC3149m.m6721t0((String) interfaceC1809a116.getValue()) ? "暂无在线插件" : "没有匹配的在线插件", c1836h05, 0);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
