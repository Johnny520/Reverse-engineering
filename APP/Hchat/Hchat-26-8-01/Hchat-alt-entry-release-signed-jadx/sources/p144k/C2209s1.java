package p144k;

import android.app.Activity;
import java.util.LinkedHashMap;
import me.yun.silk.SilkCodec;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p071f1.AbstractC0996c0;
import p071f1.C1030t0;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.AbstractC1874r;
import p117i0.C1858m2;
import p117i0.C1883u;
import p154k9.C2374r;
import p174m.AbstractC2615j0;
import p218og.C3147k;
import p242q8.C3460o;
import p251r.C3641z;
import p269s3.AbstractC3924b;
import p276sf.C3967n;
import p278t0.AbstractC4078b;
import p278t0.C4077a;
import p293u2.C4240j;
import p307v0.AbstractC4368h;
import p307v0.C4364d;
import p321w.AbstractC4619n;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5163o3;
import sh.AbstractC4013h0;
import sh.C4005e2;
import th.C4222n;

/* JADX INFO: renamed from: k.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2209s1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7323g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ab.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object, b0.t.invoke(java.lang.Object, java.lang.Object):java.lang.Object, b9.c.run():void, c9.u.invoke(java.lang.Object):java.lang.Object, ca.x.run():void, hb.w.invoke(java.lang.Object):java.lang.Object, k.s1.invoke():java.lang.Object, k9.k.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void, sh.h0.<clinit>():void, tb.c.<init>(b0.d0):void, w.s.m(java.util.List, fg.a):java.util.ArrayList, wb.ho.G3(android.content.Context, java.util.List, fg.a, fg.p, fg.l, i0.h0, int):void, wb.ho.N0(android.content.Context, wb.f6, fg.a, i0.h0, int):void, wb.ho.f(android.content.Context, vb.a, fg.a, i0.h0, int):void, x6.d.d(s3.e, boolean, fg.a, fg.a, i0.h0, int, int):void, xa.m.g(android.app.Activity, java.lang.String, fg.a):void, xa.m.i(xa.i):void] */
    public /* synthetic */ C2209s1(int i9) {
        this.f7323g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Activity activityM7263a;
        boolean z9 = false;
        switch (this.f7323g) {
            case 0:
                return new C2221w1(0);
            case 1:
                C2374r c2374r = C2374r.f7799a;
                C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                if (c3460oCurrentActivity == null || (activityM7263a = c3460oCurrentActivity.m7263a()) == null) {
                    activityM7263a = (Activity) C2374r.f7805g.get();
                }
                if (activityM7263a != null && C2374r.f7802d && C2374r.m5688q(activityM7263a)) {
                    z9 = true;
                }
                Activity activity = (Activity) C2374r.f7805g.get();
                if (activity != null && (!z9 || activity != activityM7263a)) {
                    AbstractC0018a.m248l(activity);
                }
                C2374r.m5676e(null);
                if (z9 && activityM7263a != null) {
                    C2374r.m5674c(activityM7263a);
                }
                return C3967n.f12976a;
            case 2:
                float f3 = AbstractC2615j0.f8497a;
                return Boolean.TRUE;
            case 3:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 4:
                return new SilkCodec();
            case 5:
                return new C3641z(0, 0);
            case 6:
                C1883u c1883u = AbstractC3924b.f12884a;
                return null;
            case 7:
                return C3967n.f12976a;
            case 8:
                C1883u c1883u2 = AbstractC4013h0.f13138a;
                return null;
            case 9:
                return Boolean.TRUE;
            case 10:
                return new C4005e2(-3.4028235E38f, 0.0f, 0.0f);
            case 11:
                C1858m2 c1858m2 = AbstractC4078b.f13516a;
                return C4077a.f13515a;
            case 12:
                return new SilkCodec();
            case 13:
                return new C4222n();
            case 14:
                return new C4364d(new LinkedHashMap());
            case 15:
                C1858m2 c1858m22 = AbstractC4368h.f14575a;
                return null;
            case 16:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 17:
                return new C1030t0(AbstractC0996c0.m2507c(1308617531));
            case 18:
                C1858m2 c1858m23 = AbstractC4619n.f15296a;
                return null;
            case 19:
                return new C4240j(0L);
            case 20:
                return new C4240j(0L);
            case 21:
                C1858m2 c1858m24 = AbstractC5163o3.f19312a;
                return C3967n.f12976a;
            case 22:
                return new C2209s1(23);
            case 23:
                C1858m2 c1858m25 = AbstractC5163o3.f19312a;
                return Float.valueOf(1.0f);
            case 24:
                return AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
            case 25:
                C3147k c3147k = AbstractC4955ho.f17686a;
                return C3967n.f12976a;
            case 26:
                return AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
            case 27:
                return AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
            case 28:
                return AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
            default:
                return AbstractC1874r.m4639u("latest");
        }
    }
}
