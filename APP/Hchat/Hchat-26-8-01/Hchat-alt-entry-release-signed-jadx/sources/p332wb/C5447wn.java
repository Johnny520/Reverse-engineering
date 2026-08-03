package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.HttpUrl;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.C3147k;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.wn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5447wn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f21749h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f21750i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f21751j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21752k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21753l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21754m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5447wn(Context context, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f21749h = i9;
        this.f21750i = context;
        this.f21751j = list;
        this.f21752k = interfaceC1809a1;
        this.f21753l = interfaceC1809a12;
        this.f21754m = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f21749h) {
            case 0:
                return new C5447wn(this.f21750i, this.f21751j, this.f21752k, this.f21753l, this.f21754m, interfaceC5557c, 0);
            case 1:
                return new C5447wn(this.f21750i, this.f21751j, this.f21752k, this.f21753l, this.f21754m, interfaceC5557c, 1);
            case 2:
                return new C5447wn(this.f21750i, this.f21751j, this.f21752k, this.f21753l, this.f21754m, interfaceC5557c, 2);
            default:
                return new C5447wn(this.f21750i, this.f21751j, this.f21752k, this.f21753l, this.f21754m, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f21749h) {
            case 0:
                C5447wn c5447wn = (C5447wn) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c5447wn.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C5447wn c5447wn2 = (C5447wn) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c5447wn2.invokeSuspend(c3967n2);
                return c3967n2;
            case 2:
                C5447wn c5447wn3 = (C5447wn) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c5447wn3.invokeSuspend(c3967n3);
                return c3967n3;
            default:
                C5447wn c5447wn4 = (C5447wn) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c5447wn4.invokeSuspend(c3967n4);
                return c3967n4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21749h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                final int i9 = 0;
                final List list = this.f21751j;
                final InterfaceC1809a1 interfaceC1809a1 = this.f21752k;
                final InterfaceC1809a1 interfaceC1809a12 = this.f21753l;
                final InterfaceC1809a1 interfaceC1809a13 = this.f21754m;
                AbstractC4955ho.m9501a6(EnumC5358u0.f20979h, false, new InterfaceC1235p() { // from class: wb.vn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj2, Object obj3) {
                        int i10 = i9;
                        C3967n c3967n = C3967n.f12976a;
                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a13;
                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a12;
                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a1;
                        List<String> list2 = list;
                        switch (i10) {
                            case 0:
                                List list3 = (List) obj2;
                                Throwable th2 = (Throwable) obj3;
                                C3147k c3147k = AbstractC4955ho.f17686a;
                                interfaceC1809a16.setValue(Boolean.FALSE);
                                if (th2 != null) {
                                    String message = th2.getMessage();
                                    interfaceC1809a15.setValue(message != null ? message : "读取群聊失败");
                                } else {
                                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list3));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0 >= 16 ? iM8438a0 : 16);
                                    for (Object obj4 : list3) {
                                        linkedHashMap.put(((C5292s0) obj4).f20550a, obj4);
                                    }
                                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                    for (String str : list2) {
                                        C5292s0 c5292s0 = (C5292s0) linkedHashMap.get(str);
                                        if (c5292s0 == null) {
                                            c5292s0 = new C5292s0(str, str, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList.add(c5292s0);
                                    }
                                    interfaceC1809a14.setValue(arrayList);
                                }
                                break;
                            case 1:
                                List list4 = (List) obj2;
                                Throwable th3 = (Throwable) obj3;
                                C3147k c3147k2 = AbstractC4955ho.f17686a;
                                interfaceC1809a16.setValue(Boolean.FALSE);
                                if (th3 != null) {
                                    String message2 = th3.getMessage();
                                    interfaceC1809a15.setValue(message2 != null ? message2 : "读取群聊失败");
                                } else {
                                    int iM8438a02 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list4));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a02 >= 16 ? iM8438a02 : 16);
                                    for (Object obj5 : list4) {
                                        linkedHashMap2.put(((C5292s0) obj5).f20550a, obj5);
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
                                    for (String str2 : list2) {
                                        C5292s0 c5292s02 = (C5292s0) linkedHashMap2.get(str2);
                                        if (c5292s02 == null) {
                                            c5292s02 = new C5292s0(str2, str2, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList2.add(c5292s02);
                                    }
                                    interfaceC1809a14.setValue(arrayList2);
                                }
                                break;
                            case 2:
                                List list5 = (List) obj2;
                                Throwable th4 = (Throwable) obj3;
                                C3147k c3147k3 = AbstractC4955ho.f17686a;
                                interfaceC1809a16.setValue(Boolean.FALSE);
                                if (th4 != null) {
                                    String message3 = th4.getMessage();
                                    interfaceC1809a15.setValue(message3 != null ? message3 : "读取群聊失败");
                                } else {
                                    int iM8438a03 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list5));
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8438a03 >= 16 ? iM8438a03 : 16);
                                    for (Object obj6 : list5) {
                                        linkedHashMap3.put(((C5292s0) obj6).f20550a, obj6);
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list2));
                                    for (String str3 : list2) {
                                        C5292s0 c5292s03 = (C5292s0) linkedHashMap3.get(str3);
                                        if (c5292s03 == null) {
                                            c5292s03 = new C5292s0(str3, str3, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList3.add(c5292s03);
                                    }
                                    interfaceC1809a14.setValue(arrayList3);
                                }
                                break;
                            default:
                                List list6 = (List) obj2;
                                Throwable th5 = (Throwable) obj3;
                                C3147k c3147k4 = AbstractC4955ho.f17686a;
                                interfaceC1809a16.setValue(Boolean.FALSE);
                                if (th5 != null) {
                                    String message4 = th5.getMessage();
                                    interfaceC1809a15.setValue(message4 != null ? message4 : "读取群聊失败");
                                } else {
                                    int iM8438a04 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list6));
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a04 >= 16 ? iM8438a04 : 16);
                                    for (Object obj7 : list6) {
                                        linkedHashMap4.put(((C5292s0) obj7).f20550a, obj7);
                                    }
                                    ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list2));
                                    for (String str4 : list2) {
                                        C5292s0 c5292s04 = (C5292s0) linkedHashMap4.get(str4);
                                        if (c5292s04 == null) {
                                            c5292s04 = new C5292s0(str4, str4, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList4.add(c5292s04);
                                    }
                                    interfaceC1809a14.setValue(arrayList4);
                                }
                                break;
                        }
                        return c3967n;
                    }
                });
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                final int i10 = 1;
                final List list2 = this.f21751j;
                final InterfaceC1809a1 interfaceC1809a14 = this.f21752k;
                final InterfaceC1809a1 interfaceC1809a15 = this.f21753l;
                final InterfaceC1809a1 interfaceC1809a16 = this.f21754m;
                AbstractC4955ho.m9501a6(EnumC5358u0.f20979h, false, new InterfaceC1235p() { // from class: wb.vn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj2, Object obj3) {
                        int i102 = i10;
                        C3967n c3967n = C3967n.f12976a;
                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a16;
                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a15;
                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a14;
                        List<String> list22 = list2;
                        switch (i102) {
                            case 0:
                                List list3 = (List) obj2;
                                Throwable th2 = (Throwable) obj3;
                                C3147k c3147k = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th2 != null) {
                                    String message = th2.getMessage();
                                    interfaceC1809a152.setValue(message != null ? message : "读取群聊失败");
                                } else {
                                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list3));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0 >= 16 ? iM8438a0 : 16);
                                    for (Object obj4 : list3) {
                                        linkedHashMap.put(((C5292s0) obj4).f20550a, obj4);
                                    }
                                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str : list22) {
                                        C5292s0 c5292s0 = (C5292s0) linkedHashMap.get(str);
                                        if (c5292s0 == null) {
                                            c5292s0 = new C5292s0(str, str, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList.add(c5292s0);
                                    }
                                    interfaceC1809a142.setValue(arrayList);
                                }
                                break;
                            case 1:
                                List list4 = (List) obj2;
                                Throwable th3 = (Throwable) obj3;
                                C3147k c3147k2 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th3 != null) {
                                    String message2 = th3.getMessage();
                                    interfaceC1809a152.setValue(message2 != null ? message2 : "读取群聊失败");
                                } else {
                                    int iM8438a02 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list4));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a02 >= 16 ? iM8438a02 : 16);
                                    for (Object obj5 : list4) {
                                        linkedHashMap2.put(((C5292s0) obj5).f20550a, obj5);
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str2 : list22) {
                                        C5292s0 c5292s02 = (C5292s0) linkedHashMap2.get(str2);
                                        if (c5292s02 == null) {
                                            c5292s02 = new C5292s0(str2, str2, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList2.add(c5292s02);
                                    }
                                    interfaceC1809a142.setValue(arrayList2);
                                }
                                break;
                            case 2:
                                List list5 = (List) obj2;
                                Throwable th4 = (Throwable) obj3;
                                C3147k c3147k3 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th4 != null) {
                                    String message3 = th4.getMessage();
                                    interfaceC1809a152.setValue(message3 != null ? message3 : "读取群聊失败");
                                } else {
                                    int iM8438a03 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list5));
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8438a03 >= 16 ? iM8438a03 : 16);
                                    for (Object obj6 : list5) {
                                        linkedHashMap3.put(((C5292s0) obj6).f20550a, obj6);
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str3 : list22) {
                                        C5292s0 c5292s03 = (C5292s0) linkedHashMap3.get(str3);
                                        if (c5292s03 == null) {
                                            c5292s03 = new C5292s0(str3, str3, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList3.add(c5292s03);
                                    }
                                    interfaceC1809a142.setValue(arrayList3);
                                }
                                break;
                            default:
                                List list6 = (List) obj2;
                                Throwable th5 = (Throwable) obj3;
                                C3147k c3147k4 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th5 != null) {
                                    String message4 = th5.getMessage();
                                    interfaceC1809a152.setValue(message4 != null ? message4 : "读取群聊失败");
                                } else {
                                    int iM8438a04 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list6));
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a04 >= 16 ? iM8438a04 : 16);
                                    for (Object obj7 : list6) {
                                        linkedHashMap4.put(((C5292s0) obj7).f20550a, obj7);
                                    }
                                    ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str4 : list22) {
                                        C5292s0 c5292s04 = (C5292s0) linkedHashMap4.get(str4);
                                        if (c5292s04 == null) {
                                            c5292s04 = new C5292s0(str4, str4, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList4.add(c5292s04);
                                    }
                                    interfaceC1809a142.setValue(arrayList4);
                                }
                                break;
                        }
                        return c3967n;
                    }
                });
                break;
            case 2:
                AbstractC1089i.m2732I0(obj);
                final int i11 = 2;
                final List list3 = this.f21751j;
                final InterfaceC1809a1 interfaceC1809a17 = this.f21752k;
                final InterfaceC1809a1 interfaceC1809a18 = this.f21753l;
                final InterfaceC1809a1 interfaceC1809a19 = this.f21754m;
                AbstractC4955ho.m9501a6(EnumC5358u0.f20979h, false, new InterfaceC1235p() { // from class: wb.vn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj2, Object obj3) {
                        int i102 = i11;
                        C3967n c3967n = C3967n.f12976a;
                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a19;
                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a18;
                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a17;
                        List<String> list22 = list3;
                        switch (i102) {
                            case 0:
                                List list32 = (List) obj2;
                                Throwable th2 = (Throwable) obj3;
                                C3147k c3147k = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th2 != null) {
                                    String message = th2.getMessage();
                                    interfaceC1809a152.setValue(message != null ? message : "读取群聊失败");
                                } else {
                                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list32));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0 >= 16 ? iM8438a0 : 16);
                                    for (Object obj4 : list32) {
                                        linkedHashMap.put(((C5292s0) obj4).f20550a, obj4);
                                    }
                                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str : list22) {
                                        C5292s0 c5292s0 = (C5292s0) linkedHashMap.get(str);
                                        if (c5292s0 == null) {
                                            c5292s0 = new C5292s0(str, str, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList.add(c5292s0);
                                    }
                                    interfaceC1809a142.setValue(arrayList);
                                }
                                break;
                            case 1:
                                List list4 = (List) obj2;
                                Throwable th3 = (Throwable) obj3;
                                C3147k c3147k2 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th3 != null) {
                                    String message2 = th3.getMessage();
                                    interfaceC1809a152.setValue(message2 != null ? message2 : "读取群聊失败");
                                } else {
                                    int iM8438a02 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list4));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a02 >= 16 ? iM8438a02 : 16);
                                    for (Object obj5 : list4) {
                                        linkedHashMap2.put(((C5292s0) obj5).f20550a, obj5);
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str2 : list22) {
                                        C5292s0 c5292s02 = (C5292s0) linkedHashMap2.get(str2);
                                        if (c5292s02 == null) {
                                            c5292s02 = new C5292s0(str2, str2, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList2.add(c5292s02);
                                    }
                                    interfaceC1809a142.setValue(arrayList2);
                                }
                                break;
                            case 2:
                                List list5 = (List) obj2;
                                Throwable th4 = (Throwable) obj3;
                                C3147k c3147k3 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th4 != null) {
                                    String message3 = th4.getMessage();
                                    interfaceC1809a152.setValue(message3 != null ? message3 : "读取群聊失败");
                                } else {
                                    int iM8438a03 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list5));
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8438a03 >= 16 ? iM8438a03 : 16);
                                    for (Object obj6 : list5) {
                                        linkedHashMap3.put(((C5292s0) obj6).f20550a, obj6);
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str3 : list22) {
                                        C5292s0 c5292s03 = (C5292s0) linkedHashMap3.get(str3);
                                        if (c5292s03 == null) {
                                            c5292s03 = new C5292s0(str3, str3, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList3.add(c5292s03);
                                    }
                                    interfaceC1809a142.setValue(arrayList3);
                                }
                                break;
                            default:
                                List list6 = (List) obj2;
                                Throwable th5 = (Throwable) obj3;
                                C3147k c3147k4 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th5 != null) {
                                    String message4 = th5.getMessage();
                                    interfaceC1809a152.setValue(message4 != null ? message4 : "读取群聊失败");
                                } else {
                                    int iM8438a04 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list6));
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a04 >= 16 ? iM8438a04 : 16);
                                    for (Object obj7 : list6) {
                                        linkedHashMap4.put(((C5292s0) obj7).f20550a, obj7);
                                    }
                                    ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str4 : list22) {
                                        C5292s0 c5292s04 = (C5292s0) linkedHashMap4.get(str4);
                                        if (c5292s04 == null) {
                                            c5292s04 = new C5292s0(str4, str4, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList4.add(c5292s04);
                                    }
                                    interfaceC1809a142.setValue(arrayList4);
                                }
                                break;
                        }
                        return c3967n;
                    }
                });
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                final int i12 = 3;
                final List list4 = this.f21751j;
                final InterfaceC1809a1 interfaceC1809a110 = this.f21752k;
                final InterfaceC1809a1 interfaceC1809a111 = this.f21753l;
                final InterfaceC1809a1 interfaceC1809a112 = this.f21754m;
                AbstractC4955ho.m9501a6(EnumC5358u0.f20979h, false, new InterfaceC1235p() { // from class: wb.vn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj2, Object obj3) {
                        int i102 = i12;
                        C3967n c3967n = C3967n.f12976a;
                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a112;
                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a111;
                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a110;
                        List<String> list22 = list4;
                        switch (i102) {
                            case 0:
                                List list32 = (List) obj2;
                                Throwable th2 = (Throwable) obj3;
                                C3147k c3147k = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th2 != null) {
                                    String message = th2.getMessage();
                                    interfaceC1809a152.setValue(message != null ? message : "读取群聊失败");
                                } else {
                                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list32));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0 >= 16 ? iM8438a0 : 16);
                                    for (Object obj4 : list32) {
                                        linkedHashMap.put(((C5292s0) obj4).f20550a, obj4);
                                    }
                                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str : list22) {
                                        C5292s0 c5292s0 = (C5292s0) linkedHashMap.get(str);
                                        if (c5292s0 == null) {
                                            c5292s0 = new C5292s0(str, str, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList.add(c5292s0);
                                    }
                                    interfaceC1809a142.setValue(arrayList);
                                }
                                break;
                            case 1:
                                List list42 = (List) obj2;
                                Throwable th3 = (Throwable) obj3;
                                C3147k c3147k2 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th3 != null) {
                                    String message2 = th3.getMessage();
                                    interfaceC1809a152.setValue(message2 != null ? message2 : "读取群聊失败");
                                } else {
                                    int iM8438a02 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list42));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a02 >= 16 ? iM8438a02 : 16);
                                    for (Object obj5 : list42) {
                                        linkedHashMap2.put(((C5292s0) obj5).f20550a, obj5);
                                    }
                                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str2 : list22) {
                                        C5292s0 c5292s02 = (C5292s0) linkedHashMap2.get(str2);
                                        if (c5292s02 == null) {
                                            c5292s02 = new C5292s0(str2, str2, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList2.add(c5292s02);
                                    }
                                    interfaceC1809a142.setValue(arrayList2);
                                }
                                break;
                            case 2:
                                List list5 = (List) obj2;
                                Throwable th4 = (Throwable) obj3;
                                C3147k c3147k3 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th4 != null) {
                                    String message3 = th4.getMessage();
                                    interfaceC1809a152.setValue(message3 != null ? message3 : "读取群聊失败");
                                } else {
                                    int iM8438a03 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list5));
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8438a03 >= 16 ? iM8438a03 : 16);
                                    for (Object obj6 : list5) {
                                        linkedHashMap3.put(((C5292s0) obj6).f20550a, obj6);
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str3 : list22) {
                                        C5292s0 c5292s03 = (C5292s0) linkedHashMap3.get(str3);
                                        if (c5292s03 == null) {
                                            c5292s03 = new C5292s0(str3, str3, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList3.add(c5292s03);
                                    }
                                    interfaceC1809a142.setValue(arrayList3);
                                }
                                break;
                            default:
                                List list6 = (List) obj2;
                                Throwable th5 = (Throwable) obj3;
                                C3147k c3147k4 = AbstractC4955ho.f17686a;
                                interfaceC1809a162.setValue(Boolean.FALSE);
                                if (th5 != null) {
                                    String message4 = th5.getMessage();
                                    interfaceC1809a152.setValue(message4 != null ? message4 : "读取群聊失败");
                                } else {
                                    int iM8438a04 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list6));
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a04 >= 16 ? iM8438a04 : 16);
                                    for (Object obj7 : list6) {
                                        linkedHashMap4.put(((C5292s0) obj7).f20550a, obj7);
                                    }
                                    ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list22));
                                    for (String str4 : list22) {
                                        C5292s0 c5292s04 = (C5292s0) linkedHashMap4.get(str4);
                                        if (c5292s04 == null) {
                                            c5292s04 = new C5292s0(str4, str4, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, (List) null, false, (List) null, 480);
                                        }
                                        arrayList4.add(c5292s04);
                                    }
                                    interfaceC1809a142.setValue(arrayList4);
                                }
                                break;
                        }
                        return c3967n;
                    }
                });
                break;
        }
        return C3967n.f12976a;
    }
}
