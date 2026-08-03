package p332wb;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;
import gb.C1382f;
import gb.C1390n;
import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p069f.C0943k0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p321w.C4639u0;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p357y1.AbstractC5945v2;
import p357y1.C5941u2;
import p370yf.AbstractC6044i;
import sg.C3970b;
import sg.C3971c;
import tg.InterfaceC4187e;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.on */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5183on extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f19471h = 2;

    /* JADX INFO: renamed from: i */
    public int f19472i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19473j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19474k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f19475l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f19476m;

    /* JADX INFO: renamed from: n */
    public Object f19477n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f19478o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f19479p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183on(Context context, String str, String str2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a13, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f19475l = context;
        this.f19477n = str;
        this.f19478o = str2;
        this.f19473j = interfaceC1809a1;
        this.f19474k = interfaceC1809a12;
        this.f19479p = interfaceC3599t;
        this.f19476m = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f19471h) {
            case 0:
                return new C5183on(this.f19475l, (String) this.f19477n, (String) this.f19478o, (InterfaceC1809a1) this.f19473j, (InterfaceC1809a1) this.f19474k, (InterfaceC3599t) this.f19479p, (InterfaceC1809a1) this.f19476m, interfaceC5557c);
            case 1:
                return new C5183on((InterfaceC1809a1) this.f19473j, (InterfaceC1809a1) this.f19474k, this.f19475l, (InterfaceC1809a1) this.f19476m, (InterfaceC1809a1) this.f19477n, (InterfaceC1809a1) this.f19478o, (InterfaceC1809a1) this.f19479p, interfaceC5557c);
            default:
                C5183on c5183on = new C5183on((ContentResolver) this.f19473j, (Uri) this.f19474k, (C5941u2) this.f19476m, (C3971c) this.f19479p, this.f19475l, interfaceC5557c);
                c5183on.f19478o = obj;
                return c5183on;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19471h) {
            case 0:
                return ((C5183on) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C5183on) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C5183on) create((InterfaceC4187e) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0146 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r2.mo1602e(r7, r22) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r0 == r10) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:9:0x0031, B:19:0x0062, B:23:0x0074, B:25:0x007c, B:15:0x0049, B:18:0x005b), top: B:86:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r19v0, types: [wf.c] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i0.a1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:10:0x0034). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7570x;
        Object objM7570x2;
        ?? simpleName;
        InterfaceC4187e interfaceC4187e;
        C3970b c3970b;
        Object objM8185b;
        InterfaceC4187e interfaceC4187e2;
        C3970b c3970b2;
        int i9 = this.f19471h;
        Context context = this.f19475l;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f19479p;
        Object obj3 = this.f19474k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        Object obj4 = this.f19473j;
        Object obj5 = this.f19476m;
        switch (i9) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj5;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj2;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj4;
                int i10 = this.f19472i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C5084ln c5084ln = new C5084ln((String) this.f19477n, (String) this.f19478o, null, 1);
                    this.f19472i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c5084ln, this);
                    if (objM7570x == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i10 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                }
                Object obj6 = ((C3960g) objM7570x).f12964g;
                if (!(obj6 instanceof C3959f)) {
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    interfaceC1809a13.setValue((String) obj6);
                    interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    AbstractC4955ho.m9656s(interfaceC3599t, interfaceC1809a13, interfaceC1809a1, interfaceC1809a12, false);
                }
                Throwable thM8182b = C3960g.m8182b(obj6);
                if (thM8182b != null) {
                    String strM9263g = AbstractC4855en.m9263g("发送短信验证码失败: ", thM8182b.getMessage());
                    C3147k c3147k2 = AbstractC4955ho.f17686a;
                    interfaceC1809a13.setValue(strM9263g);
                    interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    AbstractC4955ho.m9656s(interfaceC3599t, interfaceC1809a13, interfaceC1809a1, interfaceC1809a12, false);
                }
                C3147k c3147k3 = AbstractC4955ho.f17686a;
                Toast.makeText(context, (String) interfaceC1809a13.getValue(), 0).show();
                return c3967n;
            case 1:
                ?? r82 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj4;
                int i11 = this.f19472i;
                ?? r19 = 0;
                r19 = 0;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f19472i = 1;
                    if (AbstractC3603v.m7552f(250L, this) != enumC5799a) {
                    }
                    return enumC5799a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x2 = obj;
                    Object obj7 = ((C3960g) objM7570x2).f12964g;
                    InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f19478o;
                    InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj2;
                    Throwable thM8182b2 = C3960g.m8182b(obj7);
                    if (thM8182b2 == null) {
                        C1390n c1390n = (C1390n) obj7;
                        interfaceC1809a15.setValue(c1390n.f4614a);
                        interfaceC1809a16.setValue(Integer.valueOf(c1390n.f4615b));
                    } else {
                        if ((thM8182b2 instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b2).f4589g, "UPLOADER_BLACKLISTED")) {
                            simpleName = "当前微信账号已被禁止上传在线插件";
                        } else {
                            String message = thM8182b2.getMessage();
                            String string = message != null ? AbstractC3149m.m6703R0(message).toString() : null;
                            if (string != null && !AbstractC3149m.m6721t0(string)) {
                                r19 = string;
                            }
                            simpleName = r19 != 0 ? r19 : thM8182b2.getClass().getSimpleName();
                        }
                        r82.setValue(simpleName);
                        if (((List) interfaceC1809a15.getValue()).isEmpty()) {
                            interfaceC1809a16.setValue(0);
                        }
                    }
                    interfaceC1809a14.setValue(Boolean.FALSE);
                    return c3967n;
                }
                AbstractC1089i.m2732I0(obj);
                interfaceC1809a14.setValue(Boolean.TRUE);
                r82.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                C5808e c5808e2 = AbstractC3553c0.f11555a;
                ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                C4639u0 c4639u0 = new C4639u0(this.f19475l, (InterfaceC1809a1) obj5, (InterfaceC1809a1) this.f19477n, r19, 5);
                this.f19472i = 2;
                objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c4639u0, this);
                break;
            default:
                C5941u2 c5941u2 = (C5941u2) obj5;
                ContentResolver contentResolver = (ContentResolver) obj4;
                int i12 = this.f19472i;
                try {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c3970b2 = (C3970b) this.f19477n;
                            interfaceC4187e2 = (InterfaceC4187e) this.f19478o;
                            AbstractC1089i.m2732I0(obj);
                            InterfaceC4187e interfaceC4187e3 = interfaceC4187e2;
                            c3970b = c3970b2;
                            interfaceC4187e = interfaceC4187e3;
                            this.f19478o = interfaceC4187e;
                            this.f19477n = c3970b;
                            this.f19472i = 1;
                            objM8185b = c3970b.m8185b(this);
                            if (objM8185b != enumC5799a) {
                                return enumC5799a;
                            }
                            C3970b c3970b3 = c3970b;
                            interfaceC4187e2 = interfaceC4187e;
                            c3970b2 = c3970b3;
                            if (((Boolean) objM8185b).booleanValue()) {
                                return c3967n;
                            }
                            c3970b2.m8186c();
                            C0943k0 c0943k0 = AbstractC5945v2.f24167a;
                            Float f3 = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                            this.f19478o = interfaceC4187e2;
                            this.f19477n = c3970b2;
                            this.f19472i = 2;
                            break;
                        } else {
                            c3970b2 = (C3970b) this.f19477n;
                            interfaceC4187e2 = (InterfaceC4187e) this.f19478o;
                            AbstractC1089i.m2732I0(obj);
                            objM8185b = obj;
                            if (((Boolean) objM8185b).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC1089i.m2732I0(obj);
                        interfaceC4187e = (InterfaceC4187e) this.f19478o;
                        contentResolver.registerContentObserver((Uri) obj3, false, c5941u2);
                        c3970b = new C3970b((C3971c) obj2);
                        this.f19478o = interfaceC4187e;
                        this.f19477n = c3970b;
                        this.f19472i = 1;
                        objM8185b = c3970b.m8185b(this);
                        if (objM8185b != enumC5799a) {
                        }
                    }
                } finally {
                    contentResolver.unregisterContentObserver(c5941u2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183on(ContentResolver contentResolver, Uri uri, C5941u2 c5941u2, C3971c c3971c, Context context, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f19473j = contentResolver;
        this.f19474k = uri;
        this.f19476m = c5941u2;
        this.f19479p = c3971c;
        this.f19475l = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183on(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f19473j = interfaceC1809a1;
        this.f19474k = interfaceC1809a12;
        this.f19475l = context;
        this.f19476m = interfaceC1809a13;
        this.f19477n = interfaceC1809a14;
        this.f19478o = interfaceC1809a15;
        this.f19479p = interfaceC1809a16;
    }
}
