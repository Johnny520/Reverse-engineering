package p000A;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p016C3.C0245b;
import p018D.InterfaceC0258g;
import p021D3.C0274k;
import p027E4.C0330q;
import p027E4.RunnableC0338y;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p030F1.C0438c;
import p038G3.AbstractC0517c;
import p041H0.C0566K;
import p044H3.AbstractC0648c;
import p047I0.C0685N;
import p047I0.C0755p0;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0887m;
import p056K2.C0891q;
import p058L.C0904F;
import p062L3.C0990d;
import p071O.C1028g;
import p082Q0.C1170d;
import p090R3.C1228a;
import p095T.C1397y;
import p095T.C1400z0;
import p095T.EnumC1392v0;
import p095T.InterfaceC1347Y;
import p108V3.AbstractC1550c;
import p108V3.C1535H;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p135b.C1809A;
import p135b.C1810B;
import p135b.C1833u;
import p135b.C1834v;
import p136b0.C1843e;
import p139c.C1882e;
import p145d.C1949b;
import p152e0.C1997d;
import p152e0.InterfaceC1999f;
import p160f3.AbstractC2162v;
import p160f3.C2122Z;
import p160f3.C2145l;
import p160f3.InterfaceC2160t;
import p166g3.C2187d;
import p178i3.C2318C;
import p179i4.AbstractC2352g;
import p186k.C2409F;
import p203n.C2620C;
import p203n.C2636T;
import p203n.C2641Y;
import p203n.C2642Z;
import p204n0.C2683b;
import p211o0.AbstractC2758q;
import p211o0.C2731F;
import p211o0.C2750i;
import p222q0.InterfaceC2903d;
import p227r.C2940A0;
import p227r.C2962L0;
import p227r.C2976a;
import p227r.C2988g;
import p227r.C3014t;
import p227r.C3025y0;
import p227r.EnumC2983d0;
import p232s.C3162i;
import p232s.C3163j;
import p232s.InterfaceC3161h;
import p244u.C3247P;
import p244u.C3249S;
import p244u.C3278k0;
import p255w.C3375f;
import p260x.C3408N;
import p260x.C3421d;
import p260x.C3422e;
import p264x3.C3450b;
import p264x3.EnumC3451c;

/* JADX INFO: renamed from: A.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0010F implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f47d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f48e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f49f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0010F(int i5, Object obj, Object obj2) {
        this.f47d = i5;
        this.f48e = obj;
        this.f49f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02dc  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        Object objM3229o;
        Object objM3229o2;
        boolean zM3521D;
        int i5 = 5;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        switch (this.f47d) {
            case 0:
                C0078o0 c0078o0 = (C0078o0) this.f48e;
                AbstractC2758q abstractC2758q = (AbstractC2758q) this.f49f;
                C0566K c0566k = (C0566K) obj;
                c0566k.m857a();
                if (((Boolean) c0078o0.f355s.getValue()).booleanValue() || ((Boolean) c0078o0.f356t.getValue()).booleanValue()) {
                    InterfaceC2903d.m5101N(c0566k, abstractC2758q, 0L, 0L, 0.0f, null, 126);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f48e;
                C2620C c2620c = (C2620C) this.f49f;
                interfaceC1601c.mo1h(obj);
                c2620c.f8330c.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            case 2:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f48e;
                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) this.f49f;
                InterfaceC0258g interfaceC0258g = (InterfaceC0258g) obj;
                interfaceC1599a.mo6a();
                if (interfaceC1599a2 != null ? ((Boolean) interfaceC1599a2.mo6a()).booleanValue() : true) {
                    interfaceC0258g.close();
                }
                return C0891q.f2780a;
            case 3:
                C1675t c1675t = (C1675t) this.f48e;
                ViewGroup viewGroup = (ViewGroup) this.f49f;
                long jLongValue = ((Long) obj).longValue();
                C0887m c0887m = C0274k.f881a;
                C0274k.m467j().m450d("ChatAvatarRotator/config", new C0990d(jLongValue), C0990d.Companion.serializer());
                C0755p0 c0755p0 = (C0755p0) c1675t.f5710e;
                if (c0755p0 != null && c0755p0.getParent() == viewGroup) {
                    viewGroup.removeView(c0755p0);
                }
                return C0891q.f2780a;
            case 4:
                C1397y c1397y = (C1397y) this.f48e;
                C2409F c2409f = (C2409F) this.f49f;
                c1397y.m2645A(obj);
                if (c2409f != null) {
                    c2409f.m4279a(obj);
                }
                return C0891q.f2780a;
            case 5:
                C1400z0 c1400z0 = (C1400z0) this.f48e;
                Throwable th = (Throwable) this.f49f;
                Throwable th2 = (Throwable) obj;
                synchronized (c1400z0.f4997c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC2352g.m4193f(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c1400z0.f4999e = th;
                    C2318C c2318c = c1400z0.f5015u;
                    EnumC1392v0 enumC1392v0 = EnumC1392v0.f4934d;
                    c2318c.getClass();
                    c2318c.m4147g(null, enumC1392v0);
                }
                return C0891q.f2780a;
            case 6:
                List list = (List) this.f48e;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f49f;
                C3375f c3375f = (C3375f) obj;
                AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                C3375f.m5608a(c3375f, "hooker_debug_actions", AbstractC1550c.f5397d, 2);
                C3375f.m5608a(c3375f, "hooker_debug_summary", new C1843e(-1083928641, true, new C1535H(i8, list)), 2);
                C3375f.m5608a(c3375f, "hooker_debug_list", new C1843e(975993856, true, new C0904F(i8, list, interfaceC1347Y)), 2);
                return C0891q.f2780a;
            case 7:
                AbstractC0648c abstractC0648c = (AbstractC0648c) this.f48e;
                InterfaceC1347Y interfaceC1347Y2 = (InterfaceC1347Y) this.f49f;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                C0891q c0891q = C0891q.f2780a;
                if (((Boolean) interfaceC1347Y2.getValue()).booleanValue() != zBooleanValue) {
                    interfaceC1347Y2.setValue(bool);
                    C0887m c0887m2 = C0274k.f881a;
                    C0245b c0245bM467j = C0274k.m467j();
                    String strMo1118c = abstractC0648c.mo1118c();
                    c0245bM467j.getClass();
                    AbstractC1665j.m2985e(strMo1118c, "key");
                    c0245bM467j.m451e(strMo1118c, String.valueOf(zBooleanValue));
                    try {
                        if (zBooleanValue) {
                            AbstractC0517c.m773a(abstractC0648c);
                        } else {
                            ArrayList arrayList = AbstractC0517c.f1652a;
                            ArrayList arrayList2 = AbstractC0517c.f1652a;
                            if (arrayList2.contains(abstractC0648c)) {
                                abstractC0648c.mo1120e();
                                arrayList2.remove(abstractC0648c);
                            }
                        }
                        objM3229o = c0891q;
                    } catch (Throwable th4) {
                        objM3229o = AbstractC1784a.m3229o(th4);
                    }
                    Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
                    if (thM1902a != null) {
                        C0887m c0887m3 = C0274k.f881a;
                        C0274k.m476s(abstractC0648c, zBooleanValue ? "install" : "uninstall", thM1902a, zBooleanValue ? "Hooker switch install failed" : "Hooker switch uninstall failed");
                    }
                    break;
                }
                return c0891q;
            case 8:
                Context context = (Context) this.f48e;
                InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f49f;
                C1228a c1228a = (C1228a) obj;
                Object obj2 = C0891q.f2780a;
                AbstractC1665j.m2985e(c1228a, "preference");
                if (c1228a.f4095a == R.string.home_settings_reward_us) {
                    try {
                        Intent intent = new Intent(context, (Class<?>) AbstractC1924f.m3512z("com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI"));
                        intent.putExtra("key_web_url", "");
                        intent.putExtra("key_scene", 2);
                        intent.putExtra("key_send_type", 2);
                        intent.putExtra("KEY_HOME_PAGE_CLS", "com.tencent.mm.ui.LauncherUI");
                        intent.putExtra("key_chat_type", 3);
                        intent.putExtra("key_channel", 13);
                        intent.putExtra("key_qrcode_url", "m0x1'W:GZO0Tv5_f;1W0Op");
                        context.startActivity(intent);
                        objM3229o2 = obj2;
                    } catch (Throwable th5) {
                        objM3229o2 = AbstractC1784a.m3229o(th5);
                    }
                    if (objM3229o2 instanceof C0884j) {
                        interfaceC1601c2.mo1h(c1228a);
                    }
                }
                return obj2;
            case 9:
                C1949b c1949b = (C1949b) this.f48e;
                C1882e c1882e = (C1882e) this.f49f;
                C0438c c0438c = c1949b.f6617a;
                if (c0438c != null) {
                    C0438c.m699a(c0438c, c1882e.f6403b);
                } else {
                    C1809A c1809a = c1949b.f6618b;
                    if (c1809a == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    C1810B c1810b = c1882e.f6402a;
                    AbstractC1665j.m2985e(c1810b, "onBackPressedCallback");
                    C1833u c1833u = new C1833u(c1810b, new C1834v(c1810b, null));
                    c1810b.f6193a.add(c1833u);
                    C0438c.m699a(c1809a.m3285a().f6237c, c1833u);
                }
                return new C0685N(i8, c1949b, c1882e);
            case 10:
                ((C2187d) this.f48e).f7150f.removeCallbacks((RunnableC0338y) this.f49f);
                return C0891q.f2780a;
            case 11:
                AbstractC2162v.m3994p((InterfaceC2160t) this.f48e, null, new C1028g((C2642Z) this.f49f, null), 1);
                return new C2641Y();
            case 12:
                C2642Z c2642z = (C2642Z) this.f48e;
                C2642Z c2642z2 = (C2642Z) this.f49f;
                c2642z.f8410j.add(c2642z2);
                return new C0685N(i7, c2642z, c2642z2);
            case 13:
                return new C0685N(i6, (C2642Z) this.f48e, (C2636T) this.f49f);
            case 14:
                ((C3162i) this.f48e).m5430b((C3163j) this.f49f);
                return C0891q.f2780a;
            case 15:
                C2750i c2750i = (C2750i) this.f48e;
                AbstractC2758q abstractC2758q2 = (AbstractC2758q) this.f49f;
                C0566K c0566k2 = (C0566K) obj;
                c0566k2.m857a();
                InterfaceC2903d.m5103g(c0566k2, c2750i, abstractC2758q2, 0.0f, null, 60);
                return C0891q.f2780a;
            case 16:
                C2731F c2731f = (C2731F) this.f48e;
                AbstractC2758q abstractC2758q3 = (AbstractC2758q) this.f49f;
                C0566K c0566k3 = (C0566K) obj;
                c0566k3.m857a();
                InterfaceC2903d.m5103g(c0566k3, c2731f.f8676f, abstractC2758q3, 0.0f, null, 60);
                return C0891q.f2780a;
            case 17:
                ((C3162i) this.f48e).m5430b((InterfaceC3161h) this.f49f);
                return C0891q.f2780a;
            case 18:
                ((C2976a) this.f48e).f9424a.m2761j((C2988g) this.f49f);
                return C0891q.f2780a;
            case 19:
                C3025y0 c3025y0 = (C3025y0) this.f48e;
                C2940A0 c2940a0 = (C2940A0) this.f49f;
                C3014t c3014t = (C3014t) obj;
                float f2 = c3014t.f9535b ? -1.0f : 1.0f;
                long j5 = c3014t.f9534a;
                c3025y0.m5224a(C2683b.m4648f(f2, c2940a0.f9273d == EnumC2983d0.f9448e ? C2683b.m4643a(j5, 0.0f, 1) : C2683b.m4643a(j5, 0.0f, 2)), 1);
                return C0891q.f2780a;
            case 20:
                C2962L0 c2962l0 = (C2962L0) this.f48e;
                InterfaceC1601c interfaceC1601c3 = (InterfaceC1601c) this.f49f;
                ((Long) obj).longValue();
                float f5 = c2962l0.f9380e;
                c2962l0.f9380e = 0.0f;
                interfaceC1601c3.mo1h(Float.valueOf(f5));
                return C0891q.f2780a;
            case 21:
                C3247P c3247p = (C3247P) this.f48e;
                AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) this.f49f;
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                if (c3247p.f10052t) {
                    AbstractC0389a0.m660k(abstractC0389a0, abstractC0391b0, abstractC0389a0.mo270S(c3247p.f10050r), abstractC0389a0.mo270S(c3247p.f10051s));
                } else {
                    AbstractC0389a0.m658i(abstractC0389a0, abstractC0391b0, abstractC0389a0.mo270S(c3247p.f10050r), abstractC0389a0.mo270S(c3247p.f10051s));
                }
                return C0891q.f2780a;
            case 22:
                C3249S c3249s = (C3249S) this.f48e;
                AbstractC0391b0 abstractC0391b02 = (AbstractC0391b0) this.f49f;
                AbstractC0389a0 abstractC0389a02 = (AbstractC0389a0) obj;
                if (c3249s.f10061v) {
                    AbstractC0389a0.m660k(abstractC0389a02, abstractC0391b02, abstractC0389a02.mo270S(c3249s.f10057r), abstractC0389a02.mo270S(c3249s.f10058s));
                } else {
                    AbstractC0389a0.m658i(abstractC0389a02, abstractC0391b02, abstractC0389a02.mo270S(c3249s.f10057r), abstractC0389a02.mo270S(c3249s.f10058s));
                }
                return C0891q.f2780a;
            case 23:
                C3278k0 c3278k0 = (C3278k0) this.f48e;
                View view = (View) this.f49f;
                c3278k0.m5557a(view);
                return new C0685N(i5, c3278k0, view);
            case 24:
                C3421d c3421d = (C3421d) this.f48e;
                C3422e c3422e = (C3422e) this.f49f;
                C0891q c0891q2 = C0891q.f2780a;
                C1170d c1170d = c3421d.f10700r;
                if (c1170d != null) {
                    c1170d.m2215b();
                }
                c3421d.f10700r = null;
                C2145l c2145l = c3422e.f10703b;
                if (c2145l != null) {
                    c2145l.getClass();
                    while (true) {
                        Object objM3943b0 = c2145l.m3943b0(C2122Z.f7062d.get(c2145l), c0891q2);
                        if (objM3943b0 != AbstractC2162v.f7113d && objM3943b0 != AbstractC2162v.f7114e) {
                            if (objM3943b0 != AbstractC2162v.f7115f) {
                                c2145l.mo3875q(objM3943b0);
                            }
                        }
                    }
                }
                c3422e.f10703b = null;
                return c0891q2;
            case 25:
                C3408N c3408n = (C3408N) this.f48e;
                Object obj3 = this.f49f;
                c3408n.f10657f.m4287i(obj3);
                return new C0685N(6, c3408n, obj3);
            case 26:
                return new C3408N((InterfaceC1999f) this.f48e, (Map) obj, (C1997d) this.f49f);
            default:
                Context context2 = (Context) this.f48e;
                InterfaceC1347Y interfaceC1347Y3 = (InterfaceC1347Y) this.f49f;
                C3450b c3450b = (C3450b) obj;
                AbstractC1665j.m2985e(c3450b, "item");
                EnumC3451c enumC3451c = c3450b.f10766b;
                AbstractC1665j.m2985e(context2, "act");
                int iOrdinal = enumC3451c.ordinal();
                if (iOrdinal == 0) {
                    zM3521D = AbstractC1925g.m3521D(context2, "https://github.com/dartcv/NewMiko/discussions");
                } else if (iOrdinal == 1) {
                    zM3521D = AbstractC1925g.m3520C(context2, "902327702");
                } else if (iOrdinal == 2) {
                    zM3521D = AbstractC1925g.m3520C(context2, "1058720185");
                } else if (iOrdinal == 3) {
                    zM3521D = AbstractC1925g.m3520C(context2, "1080462993");
                } else if (iOrdinal == 4) {
                    zM3521D = AbstractC1925g.m3521D(context2, "https://t.me/MikoChatGroup");
                } else {
                    if (iOrdinal != 5) {
                        throw new C0330q();
                    }
                    zM3521D = AbstractC1925g.m3521D(context2, "https://t.me/MikoCIBuilds");
                }
                if (zM3521D) {
                    interfaceC1347Y3.setValue(Boolean.FALSE);
                }
                return C0891q.f2780a;
        }
    }
}
