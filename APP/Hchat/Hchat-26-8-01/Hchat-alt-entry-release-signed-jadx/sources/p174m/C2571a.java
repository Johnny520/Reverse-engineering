package p174m;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import nf.C3001c;
import nf.EnumC3002d;
import nf.InterfaceC3000b;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p014b.C0126e;
import p020b5.C0184c;
import p039d.ThreadFactoryC0643b;
import p057e1.C0807b;
import p065eb.C0898v;
import p069f.AbstractC0954q;
import p069f.C0952p;
import p069f.C0967y;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p087g.AbstractC1256a;
import p089g1.C1275d;
import p100h0.C1545q0;
import p116i.C1785r0;
import p116i.C1793u;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.InterfaceC1854l2;
import p136j8.C2095f;
import p136j8.C2104o;
import p150k5.C2275z;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p162l3.C2455i;
import p162l3.C2469w;
import p162l3.RunnableC2453g;
import p166l7.C2518f;
import p166l7.C2524l;
import p182m7.C2790c;
import p182m7.C2807t;
import p195n7.AbstractC2908g;
import p207o5.C3053h;
import p211o9.C3092e;
import p217of.C3136b;
import p218og.C3157u;
import p227p4.C3315t;
import p229p7.C3342l;
import p229p7.C3343m;
import p237q2.C3433g;
import p237q2.C3437k;
import p248qf.C3545b;
import p251r.C3631p;
import p251r.C3641z;
import p253r1.InterfaceC3644a;
import p255r4.AbstractC3706z;
import p255r4.C3671g;
import p255r4.C3674h0;
import p255r4.C3678j0;
import p255r4.C3689p;
import p255r4.C3703w;
import p256r6.C3709c;
import p256r6.EnumC3708b;
import p257r7.C3727q;
import p257r7.InterfaceC3717g;
import p265s.C3823d1;
import p265s.C3833h;
import p265s.C3844m0;
import p265s.C3870z0;
import p265s.InterfaceC3814a1;
import p265s.InterfaceC3842l0;
import p265s.ViewOnAttachStateChangeListenerC3815b;
import p267s1.C3914t;
import p267s1.C3915u;
import p267s1.C3916v;
import p271s5.InterfaceC3929a;
import p276sf.C3967n;
import p279t1.C4082b;
import p281t3.InterfaceC4108e;
import p285t7.C4135b;
import p292u1.AbstractC4229a;
import p293u2.C4231a;
import p293u2.C4247q;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4454e;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4460i;
import p311v4.C4463l;
import p311v4.C4464m;
import p311v4.C4475x;
import p314v7.AbstractC4497g0;
import p314v7.AbstractC4504k;
import p314v7.C4490d;
import p314v7.C4493e0;
import p314v7.EnumC4486b;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p339x1.AbstractC5618k;
import p339x1.C5584a2;
import p339x1.C5602f0;
import p352xf.EnumC5799a;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p363y7.AbstractC5999a;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import pa.C3377c;
import sh.AbstractC4045s;
import sh.C4005e2;
import sh.C4057w;
import sh.C4060x;
import tf.AbstractC4165l;
import tf.C4173t;
import tg.C4180a;
import tg.InterfaceC4186d;
import tg.InterfaceC4187e;
import ug.C4346k;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2571a implements InterfaceC2336f, InterfaceC3717g, InterfaceC3929a, InterfaceC3644a, InterfaceC4108e, InterfaceC4186d, CookieJar {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8338g;

    /* JADX INFO: renamed from: h */
    public Object f8339h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2571a(int i9) {
        this.f8338g = i9;
        switch (i9) {
            case 15:
                this.f8339h = new C0952p();
                break;
            case 17:
                this.f8339h = new C4082b();
                break;
            case 21:
                this.f8339h = new IdentityHashMap();
                Executors.newSingleThreadExecutor(new ThreadFactoryC0643b(1));
                break;
            case 28:
                this.f8339h = new C5584a2(AbstractC5618k.f22894a);
                break;
            case 29:
                this.f8339h = new ConcurrentHashMap();
                break;
            default:
                this.f8339h = Build.VERSION.SDK_INT >= 28 ? new C2469w(6) : new C2469w(7);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static InterfaceC3842l0 m6024v(C2571a c2571a, int i9) {
        C3641z c3641z = (C3641z) c2571a.f8339h;
        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
        try {
            C3631p c3631p = (C3631p) c3641z.f11802f.getValue();
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            C3844m0 c3844m0 = c3641z.f11813q;
            long j3 = c3631p.f11745j;
            boolean z9 = c3641z.f11800d;
            C3092e c3092e = new C3092e(i9, c3631p);
            C2095f c2095f = c3844m0.f12580c;
            if (c2095f == null) {
                return C3833h.f12554a;
            }
            C0184c c0184c = c3844m0.f12579b;
            InterfaceC3814a1 interfaceC3814a1 = (InterfaceC3814a1) c2095f.f7003d;
            boolean z10 = interfaceC3814a1 instanceof ViewOnAttachStateChangeListenerC3815b;
            C3870z0 c3870z0 = new C3870z0(c2095f, i9, c0184c, c3092e);
            c3870z0.f12698d = new C4231a(j3);
            if (!z10) {
                interfaceC3814a1.mo8002a(c3870z0);
            } else if (z9) {
                ViewOnAttachStateChangeListenerC3815b viewOnAttachStateChangeListenerC3815b = (ViewOnAttachStateChangeListenerC3815b) interfaceC3814a1;
                viewOnAttachStateChangeListenerC3815b.f12511h.add(new C3823d1(1, c3870z0));
                if (!viewOnAttachStateChangeListenerC3815b.f12512i) {
                    viewOnAttachStateChangeListenerC3815b.f12512i = true;
                    viewOnAttachStateChangeListenerC3815b.f12510g.post(viewOnAttachStateChangeListenerC3815b);
                }
            } else {
                ViewOnAttachStateChangeListenerC3815b viewOnAttachStateChangeListenerC3815b2 = (ViewOnAttachStateChangeListenerC3815b) interfaceC3814a1;
                viewOnAttachStateChangeListenerC3815b2.f12511h.add(new C3823d1(0, c3870z0));
                if (!viewOnAttachStateChangeListenerC3815b2.f12512i) {
                    viewOnAttachStateChangeListenerC3815b2.f12512i = true;
                    viewOnAttachStateChangeListenerC3815b2.f12510g.post(viewOnAttachStateChangeListenerC3815b2);
                }
            }
            AbstractC1089i.m2736K0(i9, "compose:lazy:schedule_prefetch:index");
            return c3870z0;
        } catch (Throwable th2) {
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M0 */
    public long mo1581M0(long j3, long j4, int i9) {
        C4060x c4060x = (C4060x) this.f8339h;
        C4005e2 c4005e2 = c4060x.f13436a;
        if (!((Boolean) c4060x.f13439d.invoke()).booleanValue()) {
            return 0L;
        }
        int i10 = (int) (j3 & 4294967295L);
        c4005e2.f13116b.m4489h(Float.intBitsToFloat(i10) + c4005e2.f13116b.m4488g());
        int i11 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i11) < 0.0f || Float.intBitsToFloat(i10) < 0.0f) {
            float fM4488g = c4005e2.f13117c.m4488g();
            c4005e2.m8229b(Float.intBitsToFloat(i10) + c4005e2.f13117c.m4488g());
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c4005e2.f13117c.m4488g() - fM4488g)) & 4294967295L);
        }
        if (Float.intBitsToFloat(i11) <= 0.0f) {
            return 0L;
        }
        float fM4488g2 = c4005e2.f13117c.m4488g();
        c4005e2.m8229b(Float.intBitsToFloat(i11) + c4005e2.f13117c.m4488g());
        return (((long) Float.floatToRawIntBits(c4005e2.f13117c.m4488g() - fM4488g2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p281t3.InterfaceC4108e
    /* JADX INFO: renamed from: a */
    public void mo5870a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [fg.p, yf.i] */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) throws Throwable {
        C4180a c4180a;
        Throwable th2;
        C4346k c4346k;
        if (interfaceC5557c instanceof C4180a) {
            c4180a = (C4180a) interfaceC5557c;
            int i9 = c4180a.f13721j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4180a.f13721j = i9 - Integer.MIN_VALUE;
            } else {
                c4180a = new C4180a(this, interfaceC5557c);
            }
        }
        Object obj = c4180a.f13719h;
        int i10 = c4180a.f13721j;
        C3967n c3967n = C3967n.f12976a;
        if (i10 != 0) {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4346k = c4180a.f13718g;
            try {
                AbstractC1089i.m2732I0(obj);
                c4346k.releaseIntercepted();
                return c3967n;
            } catch (Throwable th3) {
                th2 = th3;
                c4346k.releaseIntercepted();
                throw th2;
            }
        }
        AbstractC1089i.m2732I0(obj);
        C4346k c4346k2 = new C4346k(interfaceC4187e, c4180a.getContext());
        try {
            c4180a.f13718g = c4346k2;
            c4180a.f13721j = 1;
            Object objInvoke = ((AbstractC6044i) this.f8339h).invoke(c4346k2, c4180a);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objInvoke != enumC5799a) {
                objInvoke = c3967n;
            }
            if (objInvoke == enumC5799a) {
                return enumC5799a;
            }
            c4346k = c4346k2;
            c4346k.releaseIntercepted();
            return c3967n;
        } catch (Throwable th4) {
            th2 = th4;
            c4346k = c4346k2;
            c4346k.releaseIntercepted();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p281t3.InterfaceC4108e
    /* JADX INFO: renamed from: c */
    public void mo5871c(int i9, Object obj) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 == 6 || i9 == 7 || i9 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f8339h).setResultCode(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    /* JADX INFO: renamed from: e */
    public String mo5873e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m6026f(C5602f0 c5602f0) {
        if (!c5602f0.m10010G()) {
            AbstractC4229a.m8494b("DepthSortedSet.add called on an unattached node");
        }
        ((C5584a2) this.f8339h).add(c5602f0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: f0 */
    public long mo1582f0(int i9, long j3) {
        C4060x c4060x = (C4060x) this.f8339h;
        C4005e2 c4005e2 = c4060x.f13436a;
        if (!((Boolean) c4060x.f13439d.invoke()).booleanValue()) {
            return 0L;
        }
        int i10 = (int) (4294967295L & j3);
        if (Float.intBitsToFloat(i10) > 0.0f) {
            return 0L;
        }
        float fM4488g = c4005e2.f13117c.m4488g();
        c4005e2.m8229b(Float.intBitsToFloat(i10) + c4005e2.f13117c.m4488g());
        if (fM4488g == c4005e2.f13117c.m4488g()) {
            return 0L;
        }
        return C0807b.m2038a(j3, 0.0f, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m6027g(int i9, String str) {
        if (i9 == 0) {
            return;
        }
        StringBuilder sb2 = (StringBuilder) this.f8339h;
        sb2.append('-');
        sb2.append(str);
        sb2.append(i9);
        sb2.append("dp");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public int get() {
        switch (this.f8338g) {
            case 3:
                C2807t c2807t = (C2807t) this.f8339h;
                return ((C3343m) c2807t.f8138m).f10722n.f12074o + c2807t.f9065q.f12074o;
            default:
                C3342l c3342l = (C3342l) this.f8339h;
                return (c3342l.f10723o.f12083n - c3342l.f10722n.f12074o) / 4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    public String getName() {
        return "this";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    public String getType() {
        return ((C2275z) ((C3053h) this.f8339h).f9887i.f178j).f7571k.getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m6028h(AbstractC4504k abstractC4504k) {
        if (abstractC4504k == null) {
            return;
        }
        StringBuilder sb2 = (StringBuilder) this.f8339h;
        sb2.append('-');
        sb2.append(abstractC4504k.f14859g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m6029i(int i9, String str) {
        if (i9 == 0) {
            return;
        }
        StringBuilder sb2 = (StringBuilder) this.f8339h;
        sb2.append('-');
        sb2.append(str);
        sb2.append(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public long m6030j(long j3) {
        C4082b c4082b = (C4082b) this.f8339h;
        c4082b.getClass();
        if (C4247q.m8544b(j3) <= 0.0f || C4247q.m8545c(j3) <= 0.0f) {
            AbstractC4229a.m8494b("maximumVelocity should be a positive value. You specified=" + ((Object) C4247q.m8549g(j3)));
        }
        return AbstractC0000a.m59d(c4082b.f13523a.m8266b(C4247q.m8544b(j3)), c4082b.f13524b.m8266b(C4247q.m8545c(j3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public void mo633k(int i9) {
        switch (this.f8338g) {
            case 3:
                C2807t c2807t = (C2807t) this.f8339h;
                c2807t.f9065q.mo633k(i9 - ((C3343m) c2807t.f8138m).mo5551p());
                break;
            default:
                C3342l c3342l = (C3342l) this.f8339h;
                c3342l.f10723o.mo633k((i9 * 4) + c3342l.f10722n.f12074o);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public Bundle m6031l(String str) {
        C3377c c3377c = (C3377c) this.f8339h;
        if (!c3377c.f10906b) {
            C2104o.m5276A("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) c3377c.f10911g;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM260x = bundle.containsKey(str) ? AbstractC0018a.m260x(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c3377c.f10911g = null;
        }
        return bundleM260x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.CookieJar
    public List loadForRequest(HttpUrl httpUrl) {
        httpUrl.getClass();
        Iterable iterable = (List) ((ConcurrentHashMap) this.f8339h).get(httpUrl.host());
        if (iterable == null) {
            iterable = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (Boolean.valueOf(((Cookie) obj).expiresAt() > System.currentTimeMillis()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public InterfaceC3000b m6032m(File file, C3545b c3545b) {
        C0126e c0126e = (C0126e) this.f8339h;
        Set set = (Set) c0126e.f333i;
        if (file.getName().endsWith(".apk") || set.contains(EnumC3002d.f9784j)) {
            return c3545b;
        }
        try {
            c3545b.m7462c();
            int iM7465h = c3545b.m7465h();
            ByteBuffer byteBuffer = c3545b.f11545o;
            if ((byteBuffer.getShort() & 65535) != 65535) {
                return set.contains(EnumC3002d.f9783i) ? new C3136b(file, c0126e) : c3545b;
            }
        } catch (Exception e6) {
            C3545b.f11536r.mo6265s(c3545b.f11537g, "Jadx parser can't open zip file: {}", e6);
        }
        return new C3136b(file, c0126e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1583m0(long j3, long j4, AbstractC6038c abstractC6038c) {
        C4057w c4057w;
        long j5;
        long j10;
        long j11;
        C4060x c4060x = (C4060x) this.f8339h;
        C4005e2 c4005e2 = c4060x.f13436a;
        if (abstractC6038c instanceof C4057w) {
            c4057w = (C4057w) abstractC6038c;
            int i9 = c4057w.f13421l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4057w.f13421l = i9 - Integer.MIN_VALUE;
            } else {
                c4057w = new C4057w(this, abstractC6038c);
            }
        }
        C4057w c4057w2 = c4057w;
        Object objMo1583m0 = c4057w2.f13419j;
        int i10 = c4057w2.f13421l;
        Object obj = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objMo1583m0);
            if (C4247q.m8545c(j4) > 0.0f) {
                c4005e2.f13116b.m4489h(0.0f);
            }
            c4057w2.f13416g = j3;
            c4057w2.f13417h = j4;
            c4057w2.f13421l = 1;
            objMo1583m0 = super.mo1583m0(j3, j4, c4057w2);
            if (objMo1583m0 != obj) {
                j5 = j3;
                j10 = j4;
            }
            return obj;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j11 = c4057w2.f13418i;
            AbstractC1089i.m2732I0(objMo1583m0);
            return new C4247q(C4247q.m8547e(j11, ((C4247q) objMo1583m0).f13927a));
        }
        j10 = c4057w2.f13417h;
        j5 = c4057w2.f13416g;
        AbstractC1089i.m2732I0(objMo1583m0);
        long j12 = ((C4247q) objMo1583m0).f13927a;
        float fM8545c = C4247q.m8545c(j10);
        C1793u c1793u = c4060x.f13438c;
        C1785r0 c1785r0 = c4060x.f13437b;
        c4057w2.f13416g = j5;
        c4057w2.f13417h = j10;
        c4057w2.f13418i = j12;
        c4057w2.f13421l = 2;
        objMo1583m0 = AbstractC4045s.m8254r(c4005e2, fM8545c, c1793u, c1785r0, c4057w2);
        if (objMo1583m0 != obj) {
            j11 = j12;
            return new C4247q(C4247q.m8547e(j11, ((C4247q) objMo1583m0).f13927a));
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public AbstractC2331a mo1892n() {
        C2790c c2790c = new C2790c(20, 12);
        byte[] bArr = c2790c.f12076k;
        AbstractC2331a.m5534D(bArr, 0, -1);
        AbstractC2331a.m5534D(bArr, 4, -1);
        AbstractC2331a.m5534D(bArr, 8, -1);
        c2790c.m7715M(((C0126e) this.f8339h).get(), false);
        AbstractC2331a.m5536F(c2790c.f12076k, 12, (short) (c2790c.mo5551p() - 12));
        return c2790c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public InterfaceC1854l2 m6033o() {
        C2455i c2455iM5846a = C2455i.m5846a();
        if (c2455iM5846a.m5849c() == 1) {
            return new C3437k(true);
        }
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(Boolean.FALSE);
        C3433g c3433g = new C3433g(c1845j1M4639u, this);
        c2455iM5846a.f8062a.writeLock().lock();
        try {
            if (c2455iM5846a.f8064c == 1 || c2455iM5846a.f8064c == 2) {
                c2455iM5846a.f8065d.post(new RunnableC2453g(Arrays.asList(c3433g), c2455iM5846a.f8064c, null));
            } else {
                c2455iM5846a.f8063b.add(c3433g);
            }
            c2455iM5846a.f8062a.writeLock().unlock();
            return c1845j1M4639u;
        } catch (Throwable th2) {
            c2455iM5846a.f8062a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public C2571a m6034p() {
        C2571a c2571a;
        EnumC4486b enumC4486b = EnumC4486b.FORMATS;
        C2571a[] c2571aArr = (C2571a[]) this.f8339h;
        int length = c2571aArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                c2571a = null;
                break;
            }
            c2571a = c2571aArr[i9];
            if (((C4493e0) c2571a.f8339h).m8933a0() == enumC4486b) {
                break;
            }
            i9++;
        }
        return c2571a == null ? c2571aArr[0] : c2571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public int m6035q(AbstractC4446a abstractC4446a) {
        AbstractC3706z abstractC3706zM7708m;
        C3689p c3689p = (C3689p) this.f8339h;
        C3703w c3703w = c3689p.f12007i;
        if (abstractC4446a instanceof C4451c0) {
            C3674h0 c3674h0 = c3689p.f12004f;
            c3674h0.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) ((TreeMap) c3674h0.f11932g).get((C4451c0) abstractC4446a);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else if (abstractC4446a instanceof C4453d0) {
            C3674h0 c3674h02 = c3689p.f12005g;
            c3674h02.m7698f();
            AbstractC3706z abstractC3706z = (AbstractC3706z) ((TreeMap) c3674h02.f11932g).get(((C4453d0) abstractC4446a).f14784g);
            if (abstractC3706z == null) {
                C1275d.m3412f(abstractC4446a, "not found: ");
                return 0;
            }
            abstractC3706zM7708m = abstractC3706z;
        } else if (abstractC4446a instanceof AbstractC4454e) {
            C3678j0 c3678j0 = c3689p.f12008j;
            c3678j0.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) c3678j0.f11946f.get((AbstractC4454e) abstractC4446a);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else if (abstractC4446a instanceof C4464m) {
            c3703w.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) c3703w.f12037f.get((C4464m) abstractC4446a);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else if (abstractC4446a instanceof C4463l) {
            abstractC3706zM7708m = c3703w.m7708m(((C4463l) abstractC4446a).m8908k());
        } else if (abstractC4446a instanceof C4447a0) {
            C3674h0 c3674h03 = c3689p.f12006h;
            c3674h03.getClass();
            c3674h03.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) ((TreeMap) c3674h03.f11932g).get(((C4447a0) abstractC4446a).f14757g);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else if (abstractC4446a instanceof C4475x) {
            C3674h0 c3674h04 = c3689p.f12012n;
            c3674h04.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) ((TreeMap) c3674h04.f11932g).get((C4475x) abstractC4446a);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else if (abstractC4446a instanceof C4460i) {
            C3671g c3671g = c3689p.f12011m;
            c3671g.m7698f();
            abstractC3706zM7708m = (AbstractC3706z) c3671g.f11926g.get((C4460i) abstractC4446a);
            if (abstractC3706zM7708m == null) {
                C2104o.m5294t("not found");
                return 0;
            }
        } else {
            abstractC3706zM7708m = null;
        }
        if (abstractC3706zM7708m == null) {
            return -1;
        }
        return abstractC3706zM7708m.m7709e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public C3001c m6036r(File file) {
        C0126e c0126e = (C0126e) this.f8339h;
        try {
            C3545b c3545b = new C3545b(file, c0126e);
            InterfaceC3000b interfaceC3000bM6032m = m6032m(file, c3545b);
            if (interfaceC3000bM6032m != c3545b) {
                c3545b.close();
            }
            return interfaceC3000bM6032m.mo6401d();
        } catch (Exception e6) {
            if (((Set) c0126e.f333i).contains(EnumC3002d.f9784j)) {
                throw new IOException("Failed to open zip: ".concat(String.valueOf(file)), e6);
            }
            return new C3136b(file, c0126e).mo6401d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m6037s() {
        ((C3709c) this.f8339h).f12065b = EnumC3708b.f12062i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List list) {
        httpUrl.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        ((ConcurrentHashMap) this.f8339h).compute(httpUrl.host(), new C0898v(3, new C3157u(1, list)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public C1545q0 m6038t(C3315t c3315t, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        Object obj;
        int i9;
        long jM10651J;
        long j3;
        boolean z9;
        C0952p c0952p = (C0952p) this.f8339h;
        List list = (List) c3315t.f10677h;
        C0952p c0952p2 = new C0952p(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C3916v c3916v = (C3916v) list.get(i10);
            long j4 = c3916v.f12854a;
            int iM3380b = AbstractC1256a.m3380b(c0952p.f2999h, c0952p.f3001j, j4);
            if (iM3380b < 0 || (obj = c0952p.f3000i[iM3380b]) == AbstractC0954q.f3004a) {
                obj = null;
            }
            C3915u c3915u = (C3915u) obj;
            if (c3915u == null) {
                i9 = i10;
                j3 = c3916v.f12855b;
                jM10651J = c3916v.f12857d;
                z9 = false;
            } else {
                long j5 = c3915u.f12851a;
                boolean z10 = c3915u.f12853c;
                i9 = i10;
                jM10651J = viewTreeObserverOnGlobalLayoutListenerC5934t.m10651J(c3915u.f12852b);
                j3 = j5;
                z9 = z10;
            }
            long j10 = c3916v.f12854a;
            List list2 = list;
            int i11 = size;
            c0952p2.m2343b(new C3914t(j10, c3916v.f12855b, c3916v.f12857d, c3916v.f12858e, c3916v.f12859f, j3, jM10651J, z9, c3916v.f12860g, c3916v.f12862i, c3916v.f12863j, c3916v.f12864k, c3916v.f12865l, c3916v.f12866m), j10);
            boolean z11 = c3916v.f12858e;
            if (z11) {
                c0952p.m2343b(new C3915u(c3916v.f12855b, c3916v.f12856c, z11), j4);
            } else {
                c0952p.m2344c(j4);
            }
            i10 = i9 + 1;
            list = list2;
            size = i11;
        }
        return new C1545q0(c0952p2, c3315t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        C2518f c2518f;
        C2524l c2524lMo5915Y;
        C3727q c3727q = null;
        strM10753p = null;
        String strM10753p = null;
        c3727q = null;
        switch (this.f8338g) {
            case 3:
                return Integer.toString(get());
            case 11:
                return Integer.toString(get());
            case 25:
                C2571a[] c2571aArr = (C2571a[]) this.f8339h;
                StringBuilder sb2 = new StringBuilder();
                C4490d c4490d = (C4490d) ((C4493e0) m6034p().f8339h).m5553u(C4490d.class);
                if (c4490d != null) {
                    AbstractC4497g0 abstractC4497g0 = c4490d.f14846k;
                    int iM8934N = abstractC4497g0 != null ? abstractC4497g0.f14849k.m8934N() : -1;
                    if (iM8934N >= 0 && (c2518f = (C2518f) c4490d.m5553u(C2518f.class)) != null) {
                        c3727q = (C3727q) c2518f.f8146p.m8600V(iM8934N);
                    }
                    sb2.append(c3727q);
                }
                int length = c2571aArr.length;
                sb2.append(", childes=");
                sb2.append(length);
                int i9 = 0;
                while (i9 < length) {
                    C2571a c2571a = c2571aArr[i9];
                    sb2.append("\n    [");
                    i9++;
                    sb2.append(i9);
                    sb2.append("]  ");
                    sb2.append(c2571a.toString());
                }
                return sb2.toString();
            case 26:
                StringBuilder sb3 = new StringBuilder();
                C4493e0 c4493e0 = (C4493e0) this.f8339h;
                if (c4493e0.m8933a0() == null) {
                    int iMo6174Z = c4493e0.mo6174Z();
                    C2518f c2518fM8939i = c4493e0.m8939i();
                    C4135b c4135bM5928X = (c2518fM8939i == null || (c2524lMo5915Y = c2518fM8939i.mo5915Y()) == null) ? null : c2524lMo5915Y.m5928X(c2518fM8939i, iMo6174Z);
                    if (c4135bM5928X != null) {
                        strM10753p = c4135bM5928X.m8322b();
                    }
                }
                if (strM10753p == null) {
                    int iMo6174Z2 = c4493e0.mo6174Z();
                    HashMap map = AbstractC2908g.f9388a;
                    strM10753p = AbstractC5999a.m10753p(iMo6174Z2, "r0x");
                }
                sb3.append(strM10753p);
                sb3.append("=");
                sb3.append(AbstractC5999a.m10748k(c4493e0.mo8928O(), 8));
                return sb3.toString();
            case 28:
                return ((C5584a2) this.f8339h).toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public boolean m6039u(C5602f0 c5602f0) {
        if (!c5602f0.m10010G()) {
            AbstractC4229a.m8494b("DepthSortedSet.remove called on an unattached node");
        }
        return ((C5584a2) this.f8339h).remove(c5602f0);
    }

    public /* synthetic */ C2571a(Object obj, int i9) {
        this.f8338g = i9;
        this.f8339h = obj;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [q2.i.<clinit>():void] */
    public /* synthetic */ C2571a(int i9, boolean z9) {
        this.f8338g = i9;
    }

    public C2571a(long[] jArr) {
        C0967y c0967y;
        this.f8338g = 24;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c0967y = new C0967y(jArrCopyOf.length);
            int i9 = c0967y.f3044b;
            if (i9 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i9;
                    long[] jArr2 = c0967y.f3043a;
                    if (jArr2.length < length) {
                        c0967y.f3043a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = c0967y.f3043a;
                    int i10 = c0967y.f3044b;
                    if (i9 != i10) {
                        AbstractC4165l.m8382q0(jArr3, jArr3, jArrCopyOf.length + i9, i9, i10);
                    }
                    AbstractC4165l.m8382q0(jArrCopyOf, jArr3, i9, 0, jArrCopyOf.length);
                    c0967y.f3044b += jArrCopyOf.length;
                }
            } else {
                C3193a.m6820i(HttpUrl.FRAGMENT_ENCODE_SET);
                throw null;
            }
        } else {
            c0967y = new C0967y();
        }
        this.f8339h = c0967y;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C2571a(InterfaceC1235p interfaceC1235p) {
        this.f8338g = 19;
        this.f8339h = (AbstractC6044i) interfaceC1235p;
    }
}
