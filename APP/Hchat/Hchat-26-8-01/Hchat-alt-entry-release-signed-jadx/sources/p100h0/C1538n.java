package p100h0;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import bsh.org.objectweb.asm.Opcodes;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C3193a;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p015b0.AbstractC0132b0;
import p068eh.AbstractC0921a;
import p071f1.C1003g;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1179u;
import p080fb.C1183v;
import p080fb.C1186w;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p129ig.AbstractC2043a;
import p136j8.C2097h;
import p136j8.C2098i;
import p136j8.C2104o;
import p136j8.C2105p;
import p178m3.AbstractC2777c;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p304uf.C4331e;
import p304uf.C4334h;
import p332wb.AbstractC4955ho;
import p332wb.C5523z2;
import p345x8.C5707a;
import p345x8.C5712e;
import p345x8.C5724q;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1538n extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5128h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5129i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1538n(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f5128h = i9;
        this.f5129i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5128h) {
            case 0:
                return new C1538n((C1542p) this.f5129i, interfaceC5557c, 0);
            case 1:
                return new C1538n((C5707a) this.f5129i, interfaceC5557c, 1);
            case 2:
                return new C1538n((C5523z2) this.f5129i, interfaceC5557c, 2);
            case 3:
                return new C1538n((C2098i) this.f5129i, interfaceC5557c, 3);
            case 4:
                return new C1538n((C2097h) this.f5129i, interfaceC5557c, 4);
            case 5:
                return new C1538n((Context) this.f5129i, interfaceC5557c, 5);
            case 6:
                return new C1538n((C1183v) this.f5129i, interfaceC5557c, 6);
            default:
                return new C1538n((C0035c) this.f5129i, interfaceC5557c, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5128h) {
        }
        return ((C1538n) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:142:0x00fb */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Type inference failed for: r1v10, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        C2097h c2097h;
        ?? c3959f;
        ?? c3959f2;
        int i9 = this.f5128h;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        C1003g c1003gM9554g5 = null;
        Object obj2 = this.f5129i;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                C1542p c1542p = (C1542p) obj2;
                Context context = c1542p.f5143b;
                EnumC1550t enumC1550t = c1542p.f5144c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = enumC1550t.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        C3193a.m6822k();
                        return null;
                    }
                    str = "textview";
                }
                AbstractC0132b0.m684B();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(AbstractC0132b0.m696j(context.getPackageName(), str).build());
                c1542p.f5147f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 1:
                AbstractC1089i.m2732I0(obj);
                ExecutorService executorService = C5724q.f23297a;
                C5707a c5707a = (C5707a) obj2;
                if (AbstractC3149m.m6721t0(c5707a.f23189a) || AbstractC3149m.m6721t0(c5707a.f23190b) || AbstractC3149m.m6721t0(c5707a.f23192d)) {
                    return "请先填写 API Key、API 地址和模型";
                }
                String str3 = c5707a.f23193e;
                if (AbstractC3149m.m6721t0(str3)) {
                    str3 = "你是一个简洁、有帮助的聊天助手";
                }
                List listM101y0 = AbstractC0000a.m101y0(new C5712e("system", str3), new C5712e("user", "请只回复 OK"));
                String strM10360f = C5724q.m10360f(C5707a.m10313a(c5707a, false), listM101y0);
                if (strM10360f == null) {
                    strM10360f = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                boolean zM6721t0 = AbstractC3149m.m6721t0(strM10360f);
                String strM10361g = C5724q.m10361g(C5707a.m10313a(c5707a, true), listM101y0);
                if (strM10361g != null) {
                    str2 = strM10361g;
                }
                boolean zM6721t02 = AbstractC3149m.m6721t0(str2);
                return (zM6721t0 || zM6721t02) ? !zM6721t0 ? "非流式可用，流式不可用" : !zM6721t02 ? "流式可用，非流式不可用" : "流式、非流式都不可用" : "流式、非流式都可用";
            case 2:
                AbstractC1089i.m2732I0(obj);
                return AbstractC4955ho.m9554g5(Opcodes.ACC_STRICT, ((C5523z2) obj2).f22315b);
            case 3:
                C2098i c2098i = (C2098i) obj2;
                AbstractC1089i.m2732I0(obj);
                C2105p c2105pMedia = WeChatApis.media();
                String strM5249v = (c2105pMedia == null || (c2097h = c2105pMedia.f7040f) == null) ? null : c2097h.m5249v(c2098i.f7019a);
                if (strM5249v != null) {
                    str2 = strM5249v;
                }
                String str4 = !AbstractC3149m.m6721t0(str2) ? str2 : null;
                if (str4 != null) {
                    int i10 = c2098i.f7020b;
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    if (AbstractC0921a.m2262y(str4)) {
                        if (i10 == 4) {
                            Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str4, 1);
                            if (bitmapCreateVideoThumbnail != null) {
                                c1003gM9554g5 = new C1003g(bitmapCreateVideoThumbnail);
                            }
                        } else {
                            c1003gM9554g5 = AbstractC4955ho.m9554g5(320, str4);
                        }
                    }
                }
                return new C3958e(str2, c1003gM9554g5);
            case 4:
                AbstractC1089i.m2732I0(obj);
                C2097h c2097h2 = (C2097h) obj2;
                if (c2097h2 != null) {
                    return c2097h2.m5246s();
                }
                C2104o.m5276A("收藏 API 未就绪");
                return null;
            case 5:
                AbstractC1089i.m2732I0(obj);
                return ScriptPluginRuntime.INSTANCE.listPlugins((Context) obj2);
            case 6:
                AbstractC1089i.m2732I0(obj);
                Set set = AbstractC1179u.f3963a;
                C1183v c1183v = (C1183v) obj2;
                String str5 = c1183v.f3976a;
                try {
                    if (AbstractC3149m.m6721t0(str5)) {
                        throw new IllegalArgumentException("请填写 API 地址");
                    }
                    String strM5007M = AbstractC2043a.m5007M(c1183v);
                    Iterator it = (strM5007M != null ? AbstractC0000a.m99x0(strM5007M) : AbstractC1179u.m3147p(C1186w.m3238v(str5, c1183v.f3986k, c1183v.f3979d, false))).iterator();
                    do {
                        boolean zHasNext = it.hasNext();
                        c3959f = C4173t.f13710g;
                        if (zHasNext) {
                            String str6 = (String) it.next();
                            try {
                                OkHttpClient okHttpClient = (OkHttpClient) AbstractC1179u.f3965c.getValue();
                                Request.Builder builderAddHeader = new Request.Builder().url(str6).addHeader("Content-Type", "application/json");
                                Object it2 = ((C4334h) AbstractC2043a.m5001G(c1183v).entrySet()).iterator();
                                while (((AbstractC2777c) it2).hasNext()) {
                                    Map.Entry entry = (Map.Entry) ((C4331e) it2).next();
                                    builderAddHeader.addHeader((String) entry.getKey(), (String) entry.getValue());
                                }
                                Response responseExecute = okHttpClient.newCall(builderAddHeader.get().build()).execute();
                                try {
                                    ResponseBody responseBodyBody = responseExecute.body();
                                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                                    if (strString == null) {
                                        strString = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    ?? M3128f0 = (!responseExecute.isSuccessful() || AbstractC3149m.m6721t0(strString)) ? c3959f : AbstractC1179u.m3128f0(c1183v, strString);
                                    responseExecute.close();
                                    c3959f2 = M3128f0;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        AbstractC2043a.m5035i(responseExecute, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                c3959f2 = new C3959f(th4);
                                c3959f = (List) (!(c3959f2 instanceof C3959f) ? c3959f : c3959f2);
                            }
                            c3959f = (List) (!(c3959f2 instanceof C3959f) ? c3959f : c3959f2);
                        }
                    } while (c3959f.isEmpty());
                } catch (Throwable th5) {
                    c3959f = new C3959f(th5);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:ScriptAgent] 拉取模型列表失败: ", thM8182b.getMessage(), thM8182b);
                }
                return new C3960g(c3959f);
            default:
                AbstractC1089i.m2732I0(obj);
                return ((C0035c) obj2).invoke();
        }
    }
}
