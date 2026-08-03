package p332wb;

import android.content.Context;
import gb.C1381e;
import gb.C1382f;
import gb.C1388l;
import gb.C1391o;
import gb.C1395s;
import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3960g;
import p276sf.C3963j;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.vp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5416vp extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f21487h;

    /* JADX INFO: renamed from: i */
    public C1391o f21488i;

    /* JADX INFO: renamed from: j */
    public int f21489j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21490k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21491l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21492m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21493n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21494o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21495p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21496q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21497r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21498s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Context f21499t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f21500u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f21501v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5416vp(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, Context context, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f21487h = i9;
        this.f21490k = interfaceC1809a1;
        this.f21491l = interfaceC1809a12;
        this.f21492m = interfaceC1809a13;
        this.f21493n = interfaceC1809a14;
        this.f21494o = interfaceC1809a15;
        this.f21495p = interfaceC1809a16;
        this.f21496q = interfaceC1809a17;
        this.f21497r = interfaceC1809a18;
        this.f21498s = interfaceC1809a19;
        this.f21499t = context;
        this.f21500u = interfaceC1809a110;
        this.f21501v = interfaceC1809a111;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f21487h) {
            case 0:
                return new C5416vp(this.f21490k, this.f21491l, this.f21492m, this.f21493n, this.f21494o, this.f21495p, this.f21496q, this.f21497r, this.f21498s, this.f21499t, this.f21500u, this.f21501v, interfaceC5557c, 0);
            default:
                return new C5416vp(this.f21490k, this.f21491l, this.f21492m, this.f21493n, this.f21494o, this.f21495p, this.f21496q, this.f21497r, this.f21498s, this.f21499t, this.f21500u, this.f21501v, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f21487h) {
        }
        return ((C5416vp) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v15, resolved type: gb.o */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: gb.o */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: gb.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0264  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1391o c1391o;
        InterfaceC1809a1 interfaceC1809a1;
        String str;
        Object objM7570x;
        String string;
        String simpleName;
        C1391o c1391o2;
        InterfaceC1809a1 interfaceC1809a12;
        Object objM7570x2;
        String string2;
        String string3;
        String simpleName2;
        int i9 = this.f21487h;
        Context context = this.f21499t;
        C4173t c4173t = C4173t.f13710g;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        InterfaceC1809a1 interfaceC1809a13 = this.f21493n;
        InterfaceC1809a1 interfaceC1809a14 = this.f21491l;
        InterfaceC1809a1 interfaceC1809a15 = this.f21492m;
        InterfaceC1809a1 interfaceC1809a16 = this.f21494o;
        InterfaceC1809a1 interfaceC1809a17 = this.f21495p;
        InterfaceC1809a1 interfaceC1809a18 = this.f21496q;
        InterfaceC1809a1 interfaceC1809a19 = this.f21497r;
        InterfaceC1809a1 interfaceC1809a110 = this.f21498s;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                int i10 = this.f21489j;
                InterfaceC1809a1 interfaceC1809a111 = this.f21490k;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c1391o = (C1391o) interfaceC1809a111.getValue();
                    if (c1391o != null) {
                        Boolean bool = Boolean.TRUE;
                        interfaceC1809a14.setValue(bool);
                        interfaceC1809a15.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        interfaceC1809a1 = interfaceC1809a14;
                        str = null;
                        interfaceC1809a13.setValue(null);
                        interfaceC1809a16.setValue(bool);
                        interfaceC1809a17.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        interfaceC1809a18.setValue(c4173t);
                        interfaceC1809a19.setValue(Boolean.FALSE);
                        interfaceC1809a110.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        C5808e c5808e = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                        C5383up c5383up = new C5383up(context, c1391o, null, 0);
                        this.f21488i = c1391o;
                        this.f21489j = 1;
                        objM7570x = AbstractC3603v.m7570x(executorC5807d, c5383up, this);
                        if (objM7570x == enumC5799a) {
                        }
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C1391o c1391o3 = this.f21488i;
                    AbstractC1089i.m2732I0(obj);
                    c1391o = c1391o3;
                    interfaceC1809a1 = interfaceC1809a14;
                    str = null;
                    objM7570x = obj;
                }
                C3958e c3958e = (C3958e) objM7570x;
                Object obj2 = ((C3960g) c3958e.f12961g).f12964g;
                Object obj3 = ((C3960g) c3958e.f12962h).f12964g;
                Throwable thM8182b = C3960g.m8182b(obj2);
                if (thM8182b == null) {
                    C3958e c3958e2 = (C3958e) obj2;
                    C1391o c1391o4 = (C1391o) c3958e2.f12961g;
                    Boolean bool2 = (Boolean) c3958e2.f12962h;
                    bool2.booleanValue();
                    C1391o c1391o5 = (C1391o) interfaceC1809a111.getValue();
                    if (c1391o5 != null) {
                        boolean zEquals = c1391o5.f4617a.equals(c1391o.f4617a);
                        C1391o c1391o6 = c1391o5;
                        if (!zEquals) {
                            c1391o6 = str;
                        }
                        long j3 = (!((Boolean) this.f21500u.getValue()).booleanValue() || c1391o6 == 0) ? c1391o4.f4625i : c1391o6.f4625i;
                        long j4 = j3;
                        long j5 = (!((Boolean) this.f21501v.getValue()).booleanValue() || c1391o6 == 0) ? c1391o4.f4626j : c1391o6.f4626j;
                        interfaceC1809a13.setValue(C1391o.m3788a(c1391o4, 0L, j4, j5, 3327));
                        interfaceC1809a19.setValue(bool2);
                    }
                } else {
                    if ((thM8182b instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b).f4589g, "UPLOADER_BLACKLISTED")) {
                        string = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message = thM8182b.getMessage();
                        string = message != null ? AbstractC3149m.m6703R0(message).toString() : str;
                        if (string == null || AbstractC3149m.m6721t0(string)) {
                            string = str;
                        }
                        if (string == null) {
                            string = thM8182b.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a15.setValue(string);
                    interfaceC1809a19.setValue(Boolean.FALSE);
                }
                Throwable thM8182b2 = C3960g.m8182b(obj3);
                if (thM8182b2 == null) {
                    interfaceC1809a18.setValue((List) obj3);
                } else {
                    if ((thM8182b2 instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b2).f4589g, "UPLOADER_BLACKLISTED")) {
                        simpleName = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message2 = thM8182b2.getMessage();
                        String string4 = message2 != null ? AbstractC3149m.m6703R0(message2).toString() : str;
                        simpleName = (string4 == null || AbstractC3149m.m6721t0(string4)) ? str : string4;
                        if (simpleName == null) {
                            simpleName = thM8182b2.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a17.setValue(simpleName);
                }
                Boolean bool3 = Boolean.FALSE;
                interfaceC1809a1.setValue(bool3);
                interfaceC1809a16.setValue(bool3);
                break;
            default:
                int i11 = this.f21489j;
                InterfaceC1809a1 interfaceC1809a112 = this.f21490k;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c1391o2 = (C1391o) interfaceC1809a112.getValue();
                    if (c1391o2 != null) {
                        interfaceC1809a14.setValue(Boolean.TRUE);
                        interfaceC1809a15.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                        interfaceC1809a16.setValue(c4173t);
                        interfaceC1809a17.setValue(null);
                        Boolean bool4 = Boolean.FALSE;
                        interfaceC1809a18.setValue(bool4);
                        interfaceC1809a19.setValue(bool4);
                        interfaceC1809a110.setValue(bool4);
                        C5808e c5808e2 = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                        interfaceC1809a12 = interfaceC1809a14;
                        C5383up c5383up2 = new C5383up(context, c1391o2, null, 1);
                        this.f21488i = c1391o2;
                        this.f21489j = 1;
                        objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c5383up2, this);
                        if (objM7570x2 == enumC5799a) {
                        }
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C1391o c1391o7 = this.f21488i;
                    AbstractC1089i.m2732I0(obj);
                    c1391o2 = c1391o7;
                    interfaceC1809a12 = interfaceC1809a14;
                    objM7570x2 = obj;
                }
                C3963j c3963j = (C3963j) objM7570x2;
                Object obj4 = ((C3960g) c3963j.f12971g).f12964g;
                Object obj5 = ((C3960g) c3963j.f12972h).f12964g;
                Object obj6 = ((C3960g) c3963j.f12973i).f12964g;
                Throwable thM8182b3 = C3960g.m8182b(obj4);
                if (thM8182b3 == null) {
                    interfaceC1809a17.setValue((C1395s) obj4);
                } else {
                    if ((thM8182b3 instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b3).f4589g, "UPLOADER_BLACKLISTED")) {
                        string2 = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message3 = thM8182b3.getMessage();
                        string2 = message3 != null ? AbstractC3149m.m6703R0(message3).toString() : null;
                        if (string2 == null || AbstractC3149m.m6721t0(string2)) {
                            string2 = null;
                        }
                        if (string2 == null) {
                            string2 = thM8182b3.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a13.setValue(string2);
                }
                Throwable thM8182b4 = C3960g.m8182b(obj5);
                if (thM8182b4 == null) {
                    C1381e c1381e = (C1381e) obj5;
                    interfaceC1809a16.setValue(c1381e.f4586a);
                    interfaceC1809a110.setValue(Boolean.TRUE);
                    C5491y2.m9767A1(this.f21500u, interfaceC1809a112, this.f21501v, c1391o2.f4617a, null, new Long(c1381e.f4587b), 16);
                } else {
                    if ((thM8182b4 instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b4).f4589g, "UPLOADER_BLACKLISTED")) {
                        string3 = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message4 = thM8182b4.getMessage();
                        string3 = message4 != null ? AbstractC3149m.m6703R0(message4).toString() : null;
                        if (string3 == null || AbstractC3149m.m6721t0(string3)) {
                            string3 = null;
                        }
                        if (string3 == null) {
                            string3 = thM8182b4.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a15.setValue(string3);
                }
                Throwable thM8182b5 = C3960g.m8182b(obj6);
                if (thM8182b5 == null) {
                    C1388l c1388l = (C1388l) obj6;
                    interfaceC1809a18.setValue(Boolean.valueOf(c1388l.f4609a));
                    interfaceC1809a19.setValue(Boolean.TRUE);
                    C5491y2.m9767A1(this.f21500u, interfaceC1809a112, this.f21501v, c1391o2.f4617a, new Long(c1388l.f4610b), null, 32);
                } else if (AbstractC3149m.m6721t0((String) interfaceC1809a13.getValue())) {
                    if ((thM8182b5 instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b5).f4589g, "UPLOADER_BLACKLISTED")) {
                        simpleName2 = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message5 = thM8182b5.getMessage();
                        String string5 = message5 != null ? AbstractC3149m.m6703R0(message5).toString() : null;
                        simpleName2 = (string5 == null || AbstractC3149m.m6721t0(string5)) ? null : string5;
                        if (simpleName2 == null) {
                            simpleName2 = thM8182b5.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a13.setValue(simpleName2);
                }
                interfaceC1809a12.setValue(Boolean.FALSE);
                break;
        }
        return c3967n;
    }
}
