package p000A;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.bumptech.glide.AbstractC1925g;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p018D.C0254c;
import p018D.InterfaceC0258g;
import p021D3.C0274k;
import p034G.AbstractC0464i;
import p034G.C0467l;
import p040H.InterfaceC0546d;
import p041H0.AbstractC0601k;
import p044H3.AbstractC0648c;
import p048I1.C0777b;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p050I3.AbstractC0808h;
import p051J.C0822n;
import p051J.C0829u;
import p054K.C0873h;
import p056K2.C0882h;
import p056K2.C0887m;
import p056K2.C0891q;
import p071O.C1022a;
import p095T.AbstractC1385s;
import p095T.C1358e0;
import p095T.C1366i0;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p135b.C1809A;
import p135b.C1837y;
import p141c1.C1889b;
import p152e0.C1995b;
import p152e0.C2002i;
import p152e0.InterfaceC2003j;
import p156e4.C2054q;
import p156e4.EnumC2039b;
import p158f0.C2087s;
import p158f0.C2088t;
import p172h3.C2249i;
import p172h3.InterfaceC2247g;
import p186k.C2409F;
import p204n0.C2684c;
import p204n0.C2686e;
import p216p.AbstractC2831Y;
import p216p.C2847h;
import p216p.C2849i;
import p216p.C2852j0;
import p227r.C2973X;
import p227r.EnumC2983d0;
import p255w.C3385p;

/* JADX INFO: renamed from: A.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0099z implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f459d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f460e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0099z(int i5, Object obj) {
        this.f459d = i5;
        this.f460e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws PendingIntent.CanceledException {
        int i5;
        int i6;
        int i7 = 2;
        switch (this.f459d) {
            case 0:
                return ((C0078o0) this.f460e).m123d();
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0029O0((EnumC2983d0) this.f460e, 0.0f);
            case 2:
                return ((InterfaceC0546d) this.f460e).mo745r0();
            case 3:
                ((InterfaceC0258g) this.f460e).close();
                return C0891q.f2780a;
            case 4:
                PendingIntent actionIntent = ((RemoteAction) this.f460e).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e5) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e5);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return C0891q.f2780a;
            case 5:
                C0467l c0467l = (C0467l) this.f460e;
                return c0467l.f7199q ? AbstractC0464i.m747b(c0467l) : C0254c.f840b;
            case 6:
                InterfaceC0782g interfaceC0782g = (InterfaceC0782g) this.f460e;
                interfaceC0782g.getLifecycle().mo184a(new C0777b(0, interfaceC0782g));
                return C0891q.f2780a;
            case 7:
                C0065i c0065i = (C0065i) this.f460e;
                AbstractC0808h.m1408b();
                if (!((Boolean) AbstractC0808h.m1410d("probe", c0065i)).booleanValue()) {
                    AbstractC1925g.m3537n("NukeNativePerf", "native probe failed");
                }
                return C0891q.f2780a;
            case 8:
                Object systemService = ((C0822n) this.f460e).f2641b.getContext().getSystemService("input_method");
                AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 9:
                return new BaseInputConnection(((C0829u) this.f460e).f2668a, false);
            case 10:
                C0873h c0873h = (C0873h) this.f460e;
                c0873h.f2746B = null;
                AbstractC0601k.m1036l(c0873h);
                AbstractC0601k.m1035k(c0873h);
                AbstractC0601k.m1034j(c0873h);
                return Boolean.TRUE;
            case 11:
                AbstractC0601k.m1034j((C1022a) this.f460e);
                return C0891q.f2780a;
            case 12:
                return Float.valueOf(((C1358e0) ((C0038T0) this.f460e).f170f).m2507g());
            case 13:
                AbstractC0648c abstractC0648c = (AbstractC0648c) this.f460e;
                C0887m c0887m = C0274k.f881a;
                return AbstractC1385s.m2629s(Boolean.valueOf(C0274k.m467j().m447a(abstractC0648c.mo1118c(), abstractC0648c.f2056a)));
            case 14:
                return (List) this.f460e;
            case 15:
                return new C1837y((C1809A) this.f460e);
            case 16:
                C1889b c1889b = (C1889b) this.f460e;
                C1366i0 c1366i0 = c1889b.f6416f;
                if (((C2686e) c1366i0.getValue()).f8570a == 9205357640488583168L || C2686e.m4663c(((C2686e) c1366i0.getValue()).f8570a)) {
                    return null;
                }
                return c1889b.f6414d.mo4781b(((C2686e) c1366i0.getValue()).f8570a);
            case 17:
                return this.f460e;
            case 18:
                C1995b c1995b = (C1995b) this.f460e;
                InterfaceC2003j interfaceC2003j = c1995b.f6706d;
                Object obj = c1995b.f6709g;
                if (obj != null) {
                    return interfaceC2003j.mo35d(c1995b, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 19:
                C0781f c0781f = ((C2002i) this.f460e).f6724f;
                if (c0781f == null) {
                    return null;
                }
                Bundle bundleM3224j = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
                c0781f.m1330b(bundleM3224j);
                if (bundleM3224j.isEmpty()) {
                    return null;
                }
                return bundleM3224j;
            case 20:
                C2054q c2054q = (C2054q) this.f460e;
                c2054q.getClass();
                try {
                    c2054q.f6868z.m3783j(2, 0, false);
                    break;
                } catch (IOException e6) {
                    EnumC2039b enumC2039b = EnumC2039b.f6785g;
                    c2054q.m3752b(enumC2039b, enumC2039b, e6);
                }
                return C0891q.f2780a;
            case 21:
                C2088t c2088t = (C2088t) this.f460e;
                while (true) {
                    synchronized (c2088t.f7002g) {
                        try {
                            if (!c2088t.f6998c) {
                                c2088t.f6998c = true;
                                try {
                                    C1483e c1483e = c2088t.f7001f;
                                    Object[] objArr = c1483e.f5181d;
                                    int i8 = c1483e.f5183f;
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        C2087s c2087s = (C2087s) objArr[i9];
                                        C2409F c2409f = c2087s.f6989g;
                                        InterfaceC1601c interfaceC1601c = c2087s.f6983a;
                                        Object[] objArr2 = c2409f.f7794b;
                                        long[] jArr = c2409f.f7793a;
                                        int length = jArr.length - i7;
                                        if (length >= 0) {
                                            int i10 = 0;
                                            while (true) {
                                                long j5 = jArr[i10];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                                    int i12 = 0;
                                                    while (i12 < i11) {
                                                        if ((j5 & 255) < 128) {
                                                            i6 = i8;
                                                            interfaceC1601c.mo1h(objArr2[(i10 << 3) + i12]);
                                                        } else {
                                                            i6 = i8;
                                                        }
                                                        j5 >>= 8;
                                                        i12++;
                                                        i8 = i6;
                                                    }
                                                    i5 = i8;
                                                    if (i11 == 8) {
                                                    }
                                                } else {
                                                    i5 = i8;
                                                }
                                                if (i10 != length) {
                                                    i10++;
                                                    i8 = i5;
                                                }
                                            }
                                        } else {
                                            i5 = i8;
                                        }
                                        c2409f.m4280b();
                                        i9++;
                                        i8 = i5;
                                        i7 = 2;
                                    }
                                    c2088t.f6998c = false;
                                } catch (Throwable th) {
                                    c2088t.f6998c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!c2088t.m3866b()) {
                        return C0891q.f2780a;
                    }
                    i7 = 2;
                }
                break;
            case 22:
                C2852j0 c2852j0 = (C2852j0) this.f460e;
                C2849i c2849i = (C2849i) AbstractC0601k.m1032h(c2852j0, AbstractC2831Y.f8910a);
                c2852j0.f8975C = c2849i;
                c2852j0.f8976D = c2849i != null ? new C2847h(c2849i.f8961a, c2849i.f8962b, c2849i.f8963c, c2849i.f8964d) : null;
                return C0891q.f2780a;
            case 23:
                Object objMo4082g = ((InterfaceC2247g) this.f460e).mo4082g();
                return (C2973X) (objMo4082g instanceof C2249i ? null : objMo4082g);
            case 24:
                return Integer.valueOf(((C3385p) this.f460e).m5620g().f10531n);
            default:
                return (C2684c) this.f460e;
        }
    }
}
