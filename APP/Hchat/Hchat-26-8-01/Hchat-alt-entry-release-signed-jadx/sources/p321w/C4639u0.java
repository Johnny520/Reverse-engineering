package p321w;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import gb.AbstractC1378b;
import gb.AbstractC1387k;
import gb.AbstractC1393q;
import gb.C1379c;
import gb.C1380d;
import gb.C1384h;
import gb.C1390n;
import gb.C1391o;
import gb.C1395s;
import gb.EnumC1377a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p036c9.C0414a;
import p071f1.C1003g;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p117i0.C1829f1;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p267s1.InterfaceC3918x;
import p269s3.C3927e;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p304uf.C4329c;
import p332wb.AbstractC4955ho;
import p332wb.C4734b0;
import p332wb.C4933h2;
import p332wb.C5132n5;
import p332wb.EnumC5033k5;
import p345x8.AbstractC5731x;
import p370yf.AbstractC6044i;
import tf.AbstractC4166m;
import tf.AbstractC4178y;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4639u0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f15405h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f15406i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f15407j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f15408k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4639u0(Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f15405h = i9;
        this.f15406i = obj;
        this.f15407j = obj2;
        this.f15408k = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f15405h) {
            case 0:
                C4639u0 c4639u0 = new C4639u0((InterfaceC3918x) this.f15407j, (InterfaceC4647y0) this.f15408k, interfaceC5557c, 0);
                c4639u0.f15406i = obj;
                return c4639u0;
            case 1:
                C4639u0 c4639u02 = new C4639u0((List) this.f15407j, (C0414a) this.f15408k, interfaceC5557c, 1);
                c4639u02.f15406i = obj;
                return c4639u02;
            case 2:
                C4639u0 c4639u03 = new C4639u0((InterfaceC1809a1) this.f15407j, (InterfaceC1809a1) this.f15408k, interfaceC5557c, 2);
                c4639u03.f15406i = obj;
                return c4639u03;
            case 3:
                return new C4639u0((C5132n5) this.f15406i, (InterfaceC1809a1) this.f15407j, (InterfaceC1809a1) this.f15408k, interfaceC5557c, 3);
            case 4:
                return new C4639u0((String) this.f15406i, (String) this.f15407j, (String) this.f15408k, interfaceC5557c, 4);
            case 5:
                return new C4639u0((Context) this.f15406i, (InterfaceC1809a1) this.f15407j, (InterfaceC1809a1) this.f15408k, interfaceC5557c, 5);
            case 6:
                return new C4639u0((Context) this.f15406i, (C1391o) this.f15407j, (C1379c) this.f15408k, interfaceC5557c, 6);
            case 7:
                return new C4639u0((Context) this.f15406i, (C1391o) this.f15407j, (C1384h) this.f15408k, interfaceC5557c, 7);
            case 8:
                return new C4639u0((Context) this.f15406i, (C1391o) this.f15407j, (String) this.f15408k, interfaceC5557c, 8);
            default:
                return new C4639u0((C3927e) this.f15406i, (C1739c) this.f15407j, (C1829f1) this.f15408k, interfaceC5557c, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f15405h) {
            case 0:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 2:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 3:
                C4639u0 c4639u0 = (C4639u0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c4639u0.invokeSuspend(c3967n);
                return c3967n;
            case 4:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 5:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 6:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 7:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 8:
                return ((C4639u0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            default:
                C4639u0 c4639u02 = (C4639u0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c4639u02.invokeSuspend(c3967n2);
                return c3967n2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        Object c3959f2;
        C3958e c3958e;
        Bitmap bitmapDecodeStream;
        Object c3959f3;
        Object c3959f4;
        Object c3959f5;
        Object c3959f6;
        String string;
        int i9 = 1;
        boolean z9 = false;
        boolean z10 = false;
        switch (this.f15405h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f15406i;
                InterfaceC3918x interfaceC3918x = (InterfaceC3918x) this.f15407j;
                InterfaceC4647y0 interfaceC4647y0 = (InterfaceC4647y0) this.f15408k;
                AbstractC3603v.m7563q(interfaceC3599t, null, new C4590d0(interfaceC3918x, interfaceC4647y0, z10 ? 1 : 0, i9), 1);
                return AbstractC3603v.m7563q(interfaceC3599t, null, new C4590d0(interfaceC3918x, interfaceC4647y0, z9 ? 1 : 0, 2), 1);
            case 1:
                AbstractC1089i.m2732I0(obj);
                List list = (List) this.f15407j;
                C0414a c0414a = (C0414a) this.f15408k;
                try {
                    C4933h2 c4933h2 = C4933h2.f17518a;
                    c3959f = C4933h2.m9278f(c0414a.f1179a, list);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
            case 2:
                AbstractC1089i.m2732I0(obj);
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f15407j;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f15408k;
                try {
                    OkHttpClient okHttpClient = AbstractC5731x.f23348a;
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    c3959f2 = AbstractC5731x.m10405f((String) interfaceC1809a1.getValue(), (String) interfaceC1809a12.getValue());
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return new C3960g(c3959f2);
            case 3:
                AbstractC1089i.m2732I0(obj);
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f15407j;
                C3147k c3147k2 = AbstractC4955ho.f17686a;
                if (((EnumC5033k5) interfaceC1809a13.getValue()) != EnumC5033k5.f18308l) {
                    ((InterfaceC1809a1) this.f15408k).setValue(null);
                }
                if (((EnumC5033k5) interfaceC1809a13.getValue()) == EnumC5033k5.f18307k) {
                    interfaceC1809a13.setValue(EnumC5033k5.f18309m);
                }
                return C3967n.f12976a;
            case 4:
                AbstractC1089i.m2732I0(obj);
                String str = (String) this.f15406i;
                String str2 = (String) this.f15407j;
                String str3 = (String) this.f15408k;
                C3147k c3147k3 = AbstractC4955ho.f17686a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!AbstractC3149m.m6721t0(str2)) {
                    linkedHashSet.add(str2);
                }
                if (!AbstractC3149m.m6721t0(str3)) {
                    linkedHashSet.add(str3);
                }
                String strM9459V4 = AbstractC4955ho.m9459V4(str, false);
                if (strM9459V4 != null && !AbstractC3149m.m6721t0(strM9459V4)) {
                    linkedHashSet.add(strM9459V4);
                }
                String strM9459V42 = AbstractC4955ho.m9459V4(str, true);
                if (strM9459V42 != null && !AbstractC3149m.m6721t0(strM9459V42)) {
                    linkedHashSet.add(strM9459V42);
                }
                List<String> listM8407P1 = AbstractC4166m.m8407P1(linkedHashSet);
                if (listM8407P1.isEmpty()) {
                    return null;
                }
                String strM8392A1 = AbstractC4166m.m8392A1(listM8407P1, "|", null, null, null, 62);
                synchronized (C4734b0.f15954a) {
                    try {
                        LinkedHashMap linkedHashMap = C4734b0.f15955b;
                        c3958e = linkedHashMap.containsKey(strM8392A1) ? new C3958e(Boolean.TRUE, linkedHashMap.get(strM8392A1)) : new C3958e(Boolean.FALSE, null);
                    } finally {
                    }
                }
                if (((Boolean) c3958e.f12961g).booleanValue()) {
                    return (C1003g) c3958e.f12962h;
                }
                C1003g c1003g = null;
                for (String str4 : listM8407P1) {
                    if (AbstractC3156t.m6740d0(str4, "http://", false) || AbstractC3156t.m6740d0(str4, "https://", false)) {
                        URLConnection uRLConnectionOpenConnection = new URL(str4).openConnection();
                        uRLConnectionOpenConnection.setConnectTimeout(3000);
                        uRLConnectionOpenConnection.setReadTimeout(3000);
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                            AbstractC2043a.m5035i(inputStream, null);
                        } finally {
                        }
                    } else {
                        File file = new File(str4);
                        bitmapDecodeStream = file.exists() ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null;
                    }
                    c1003g = bitmapDecodeStream != null ? new C1003g(bitmapDecodeStream) : null;
                    if (c1003g != null) {
                        if (c1003g != null) {
                            return null;
                        }
                        synchronized (C4734b0.f15954a) {
                            C4734b0.f15955b.put(strM8392A1, c1003g);
                        }
                        return c1003g;
                    }
                }
                if (c1003g != null) {
                }
                break;
            case 5:
                AbstractC1089i.m2732I0(obj);
                Context context = (Context) this.f15406i;
                String string2 = AbstractC3149m.m6703R0((String) ((InterfaceC1809a1) this.f15407j).getValue()).toString();
                String str5 = (String) ((InterfaceC1809a1) this.f15408k).getValue();
                string2.getClass();
                str5.getClass();
                MediaType mediaType = AbstractC1378b.f4576a;
                try {
                    EnumC1377a enumC1377a = EnumC1377a.f4572g;
                    List listM101y0 = AbstractC0000a.m101y0("v1", "plugins");
                    C3958e c3958e2 = new C3958e("q", AbstractC3149m.m6703R0(string2).toString());
                    if (!str5.equals("latest") && !str5.equals("downloads")) {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6721t0(str5)) {
                        str5 = "latest";
                    }
                    JSONObject jSONObjectM3760l = AbstractC1378b.m3760l(context, enumC1377a, listM101y0, null, null, AbstractC4178y.m8439b0(c3958e2, new C3958e("sort", str5), new C3958e("limit", String.valueOf(AbstractC3754e0.m7909r(100, 1, 100)))));
                    JSONObject jSONObjectOptJSONObject = jSONObjectM3760l.optJSONObject("data");
                    JSONArray jSONArrayOptJSONArray = jSONObjectM3760l.optJSONArray("data");
                    if (jSONArrayOptJSONArray == null) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("items") : null;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2 : new JSONArray();
                    }
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject2 != null) {
                            c4329cM7E.add(AbstractC1393q.m3791c(jSONObjectOptJSONObject2));
                        }
                    }
                    C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                    c3959f3 = new C1390n(c4329cM90t, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("count", c4329cM90t.mo6457a()) : c4329cM90t.mo6457a(), jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("limit", 100) : 100);
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                return new C3960g(c3959f3);
            case 6:
                AbstractC1089i.m2732I0(obj);
                Context context2 = (Context) this.f15406i;
                String str6 = ((C1391o) this.f15407j).f4617a;
                C1379c c1379c = (C1379c) this.f15408k;
                c1379c.getClass();
                String str7 = c1379c.f4579b;
                String str8 = c1379c.f4578a;
                try {
                } catch (Throwable th5) {
                    c3959f4 = new C3959f(th5);
                }
                if (AbstractC3149m.m6721t0(str6)) {
                    throw new IllegalArgumentException("远程插件 ID 不能为空");
                }
                if (AbstractC3149m.m6721t0(str8)) {
                    throw new IllegalArgumentException("评论 ID 不能为空");
                }
                if (!AbstractC3149m.m6721t0(str7) && !str7.equals(str6)) {
                    throw new IllegalArgumentException("评论不属于当前插件");
                }
                if (!c1379c.f4583f) {
                    throw new IllegalArgumentException("只能删除自己的评论");
                }
                Object objM3789a = AbstractC1393q.m3789a(context2);
                AbstractC1089i.m2732I0(objM3789a);
                Object objM3753e = AbstractC1378b.m3753e(context2, (C1395s) objM3789a, str6, str8);
                AbstractC1089i.m2732I0(objM3753e);
                c3959f4 = (C1380d) objM3753e;
                return new C3960g(c3959f4);
            case 7:
                AbstractC1089i.m2732I0(obj);
                try {
                    Object objM3756h = AbstractC1378b.m3756h((Context) this.f15406i, ((C1391o) this.f15407j).f4617a, ((C1384h) this.f15408k).f4595a);
                    AbstractC1089i.m2732I0(objM3756h);
                    C1391o c1391o = (C1391o) objM3756h;
                    AbstractC1089i.m2732I0(AbstractC1387k.m3784u(c1391o));
                    c3959f5 = c1391o;
                    break;
                } catch (Throwable th6) {
                    c3959f5 = new C3959f(th6);
                }
                return new C3960g(c3959f5);
            case 8:
                AbstractC1089i.m2732I0(obj);
                Context context3 = (Context) this.f15406i;
                String str9 = ((C1391o) this.f15407j).f4617a;
                String str10 = (String) this.f15408k;
                str10.getClass();
                try {
                    string = AbstractC3149m.m6703R0(str10).toString();
                } catch (Throwable th7) {
                    c3959f6 = new C3959f(th7);
                }
                if (AbstractC3149m.m6721t0(string)) {
                    throw new IllegalArgumentException("评论内容不能为空");
                }
                if (string.length() > 1000) {
                    throw new IllegalArgumentException("评论内容不能超过 1000 个字符");
                }
                Object objM3789a2 = AbstractC1393q.m3789a(context3);
                AbstractC1089i.m2732I0(objM3789a2);
                Object objM3749a = AbstractC1378b.m3749a(context3, (C1395s) objM3789a2, str9, string);
                AbstractC1089i.m2732I0(objM3749a);
                c3959f6 = (C1380d) objM3749a;
                return new C3960g(c3959f6);
            default:
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4639u0(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f15405h = i9;
        this.f15407j = obj;
        this.f15408k = obj2;
    }
}
