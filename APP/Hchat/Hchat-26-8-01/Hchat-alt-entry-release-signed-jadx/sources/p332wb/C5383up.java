package p332wb;

import android.content.Context;
import gb.AbstractC1378b;
import gb.AbstractC1387k;
import gb.AbstractC1393q;
import gb.C1381e;
import gb.C1384h;
import gb.C1388l;
import gb.C1389m;
import gb.C1391o;
import gb.C1395s;
import gb.EnumC1377a;
import java.util.Set;
import okhttp3.MediaType;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p218og.AbstractC3149m;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p276sf.C3967n;
import p304uf.C4329c;
import p370yf.AbstractC6044i;
import tf.C4174u;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.up */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5383up extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f21195h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f21196i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1391o f21197j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5383up(Context context, C1391o c1391o, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f21195h = i9;
        this.f21196i = context;
        this.f21197j = c1391o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f21195h) {
            case 0:
                return new C5383up(this.f21196i, this.f21197j, interfaceC5557c, 0);
            case 1:
                return new C5383up(this.f21196i, this.f21197j, interfaceC5557c, 1);
            case 2:
                return new C5383up(this.f21196i, this.f21197j, interfaceC5557c, 2);
            default:
                return new C5383up(this.f21196i, this.f21197j, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f21195h) {
        }
        return ((C5383up) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        Object c3959f5;
        Object c3959f6;
        C1389m c1389mM3793e;
        int i9 = this.f21195h;
        Context context = this.f21196i;
        C1391o c1391o = this.f21197j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                Context context2 = this.f21196i;
                String str = c1391o.f4617a;
                try {
                    Object objM3754f = AbstractC1378b.m3754f(context2, str);
                    AbstractC1089i.m2732I0(objM3754f);
                    C1391o c1391o2 = (C1391o) objM3754f;
                    AbstractC1089i.m2732I0(AbstractC1387k.m3784u(c1391o2));
                    c3959f = c1391o2;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                boolean z9 = c3959f instanceof C3959f;
                Object c3958e = c3959f;
                if (!z9) {
                    C1391o c1391o3 = (C1391o) c3959f;
                    c3958e = new C3958e(c1391o3, Boolean.valueOf(AbstractC1387k.m3774k(context2, c1391o3) != null));
                }
                C3960g c3960g = new C3960g(c3958e);
                MediaType mediaType = AbstractC1378b.f4576a;
                try {
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                if (AbstractC3149m.m6721t0(str)) {
                    throw new IllegalArgumentException("远程插件 ID 不能为空");
                }
                JSONArray jSONArrayOptJSONArray = AbstractC1378b.m3751c(AbstractC1378b.m3760l(context2, EnumC1377a.f4572g, AbstractC0000a.m101y0("v1", "plugins", str, "snapshots"), null, null, C4174u.f13711g)).optJSONArray("items");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                C4329c c4329cM7E = AbstractC0000a.m7E();
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("versionId");
                        strOptString.getClass();
                        String strOptString2 = jSONObjectOptJSONObject.optString("versionName");
                        strOptString2.getClass();
                        String strOptString3 = jSONObjectOptJSONObject.optString("contentHash");
                        strOptString3.getClass();
                        long jOptLong = jSONObjectOptJSONObject.optLong("totalSize", 0L);
                        if (jOptLong < 0) {
                            jOptLong = 0;
                        }
                        String strOptString4 = jSONObjectOptJSONObject.optString("createdAt");
                        strOptString4.getClass();
                        String strOptString5 = jSONObjectOptJSONObject.optString("releaseNotes");
                        strOptString5.getClass();
                        c4329cM7E.add(new C1384h(jOptLong, strOptString, strOptString2, strOptString3, strOptString4, strOptString5));
                    }
                }
                c3959f2 = AbstractC0000a.m90t(c4329cM7E);
                return new C3958e(c3960g, new C3960g(c3959f2));
            case 1:
                String str2 = c1391o.f4617a;
                AbstractC1089i.m2732I0(obj);
                Object objM3789a = AbstractC1393q.m3789a(context);
                if (!(objM3789a instanceof C3959f)) {
                    try {
                        Object objM3789a2 = AbstractC1393q.m3789a(context);
                        AbstractC1089i.m2732I0(objM3789a2);
                        Object objM3758j = AbstractC1378b.m3758j(context, str2, (C1395s) objM3789a2);
                        AbstractC1089i.m2732I0(objM3758j);
                        c3959f3 = (C1388l) objM3758j;
                    } catch (Throwable th4) {
                        c3959f3 = new C3959f(th4);
                    }
                    c3959f4 = c3959f3;
                    break;
                } else {
                    Throwable thM8182b = C3960g.m8182b(objM3789a);
                    if (thM8182b == null) {
                        thM8182b = new IllegalStateException("当前微信账号资料未就绪");
                    }
                    c3959f4 = new C3959f(thM8182b);
                }
                C3960g c3960g2 = new C3960g(objM3789a);
                try {
                    Object objM3789a3 = AbstractC1393q.m3789a(context);
                    if (objM3789a3 instanceof C3959f) {
                        objM3789a3 = null;
                    }
                    Object objM3750b = AbstractC1378b.m3750b(context, str2, (C1395s) objM3789a3);
                    AbstractC1089i.m2732I0(objM3750b);
                    c3959f5 = (C1381e) objM3750b;
                    break;
                } catch (Throwable th5) {
                    c3959f5 = new C3959f(th5);
                }
                return new C3963j(c3960g2, new C3960g(c3959f5), new C3960g(c3959f4));
            case 2:
                AbstractC1089i.m2732I0(obj);
                String str3 = c1391o.f4617a;
                try {
                    c1389mM3793e = AbstractC1393q.m3793e(context, str3);
                } catch (Throwable th6) {
                    c3959f6 = new C3959f(th6);
                }
                if (c1389mM3793e == null) {
                    throw new IllegalStateException("该插件不是由当前模块安装上传的");
                }
                AbstractC1089i.m2732I0(AbstractC1378b.m3752d(context, c1389mM3793e));
                AbstractC1393q.m3798j(context, str3);
                c3959f6 = C3967n.f12976a;
                return new C3960g(c3959f6);
            default:
                AbstractC1089i.m2732I0(obj);
                Set set = AbstractC1387k.f4608a;
                return Boolean.valueOf(AbstractC1387k.m3774k(context, c1391o) != null);
        }
    }
}
