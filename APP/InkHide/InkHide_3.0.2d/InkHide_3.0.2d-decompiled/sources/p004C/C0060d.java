package p004C;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.LruCache;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import com.p055lu.wxmask.p057ui.WebViewActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0020U;
import p001A0.C0022W;
import p001A0.C0024Y;
import p001A0.C0027a0;
import p001A0.C0029b0;
import p001A0.C0035h;
import p001A0.C0053z;
import p001A0.RunnableC0040m;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p027N0.C0227k;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p069i.C0721v;
import p070i0.AbstractC0731a;
import p074k0.AbstractC0742b;
import p074k0.ExecutorC0741a;
import p086r0.C0831D1;
import p086r0.C0854L0;
import p086r0.C0881Y0;
import p086r0.C0901f1;
import p086r0.C0903g0;
import p086r0.C0912j0;
import p088s0.C0973G;
import p088s0.C0990l;
import p090t0.AbstractC1008c;
import p099y.AbstractC1048L;
import p099y.C1070e;
import p099y.InterfaceC1068d;
import p100y0.C1098d;
import p102z0.AbstractC1129l;
import p102z0.AbstractC1140w;
import p102z0.C1119b;

/* JADX INFO: renamed from: C.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0060d implements InterfaceC0204l, InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f303b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0060d(int i2, Object obj) {
        this.f302a = i2;
        this.f303b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m108a(C0066j c0066j, int i2, Bundle bundle) {
        InterfaceC1068d c0066j2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 25 && (i2 & 1) != 0) {
            try {
                ((InterfaceC0065i) c0066j.f312c).mo110b();
                Parcelable parcelable = (Parcelable) ((InterfaceC0065i) c0066j.f312c).mo112d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipDescription clipDescriptionMo109a = ((InterfaceC0065i) c0066j.f312c).mo109a();
        InterfaceC0065i interfaceC0065i = (InterfaceC0065i) c0066j.f312c;
        ClipData clipData = new ClipData(clipDescriptionMo109a, new ClipData.Item(interfaceC0065i.mo113e()));
        if (i3 >= 31) {
            c0066j2 = new C0066j(clipData, 2);
        } else {
            C1070e c1070e = new C1070e();
            c1070e.f3695c = clipData;
            c1070e.f3696d = 2;
            c0066j2 = c1070e;
        }
        c0066j2.mo133c(interfaceC0065i.mo111c());
        c0066j2.mo131a(bundle);
        return AbstractC1048L.m2287f((C0721v) this.f303b, c0066j2.mo140k()) == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        int i2 = WebViewActivity.f1631x;
        return new C1098d((WebViewActivity) this.f303b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        Object c0104d6;
        C0027a0 c0027a0 = null;
        c0029b0 = null;
        C0029b0 c0029b0 = null;
        c0022w = null;
        C0022W c0022w = null;
        c0020u = null;
        C0020U c0020u = null;
        c0053z = null;
        C0053z c0053z = null;
        c0027a0 = null;
        switch (this.f302a) {
            case 1:
                Context context = (Context) obj;
                AbstractC0223g.m418e(context, "appContext");
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                    if (str == null || AbstractC0307q.m534d0(str)) {
                        AbstractC0731a.m1387d("tag contact dexkit apk path empty");
                    } else {
                        try {
                            c0104d = (C0027a0) AbstractC0039l.m62B(str, new C0035h(context, 9));
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("tag contact dexkit resolve fail", thM246a);
                        }
                        c0027a0 = (C0027a0) (c0104d instanceof C0104d ? null : c0104d);
                    }
                }
                if (c0027a0 != null) {
                    JSONObject jSONObjectPut = new JSONObject().put("activityClassNames", AbstractC0039l.m88z(c0027a0.f204a)).put("adapterClassNames", AbstractC0039l.m88z(c0027a0.f205b)).put("recyclerEntryNames", AbstractC0039l.m88z(c0027a0.f206c));
                    AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                    JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut, 1);
                    SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                    sharedPreferences.edit().putString("tag_contact_v1", jSONObjectM84v.toString()).apply();
                    ((C0903g0) this.f303b).f3192h = c0027a0;
                }
                break;
            case 2:
                Context context2 = (Context) obj;
                AbstractC0223g.m418e(context2, "appContext");
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo2 = context2.getApplicationInfo();
                    String str2 = applicationInfo2 != null ? applicationInfo2.sourceDir : null;
                    if (str2 == null || AbstractC0307q.m534d0(str2)) {
                        AbstractC0731a.m1387d("group create contact dexkit apk path empty");
                    } else {
                        try {
                            c0104d2 = (C0053z) AbstractC0039l.m62B(str2, new C0035h(context2, 3));
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
                        if (thM246a2 != null) {
                            AbstractC0731a.m1387d("group create contact dexkit resolve fail", thM246a2);
                        }
                        c0053z = (C0053z) (c0104d2 instanceof C0104d ? null : c0104d2);
                    }
                }
                if (c0053z != null) {
                    JSONObject jSONObjectPut2 = new JSONObject().put("activityClassNames", AbstractC0039l.m88z(c0053z.f295a)).put("adapterClassNames", AbstractC0039l.m88z(c0053z.f296b)).put("listEntryNames", AbstractC0039l.m88z(c0053z.f297c));
                    AbstractC0223g.m417d(jSONObjectPut2, "put(...)");
                    JSONObject jSONObjectM84v2 = AbstractC0039l.m84v(jSONObjectPut2, 1);
                    SharedPreferences sharedPreferences2 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences2, "getSharedPreferences(...)");
                    sharedPreferences2.edit().putString("group_create_contact_v1", jSONObjectM84v2.toString()).apply();
                    ((C0912j0) this.f303b).f3230l = c0053z;
                }
                break;
            case 3:
                WeakReference weakReference = (WeakReference) obj;
                AbstractC0223g.m418e(weakReference, "ref");
                PopupWindow popupWindow = (PopupWindow) weakReference.get();
                break;
            case 4:
                Context context3 = (Context) obj;
                AbstractC0223g.m418e(context3, "appContext");
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo3 = context3.getApplicationInfo();
                    String str3 = applicationInfo3 != null ? applicationInfo3.sourceDir : null;
                    if (str3 == null || AbstractC0307q.m534d0(str3)) {
                        AbstractC0731a.m1387d("recent forward dexkit apk path empty");
                    } else {
                        try {
                            c0104d3 = (C0020U) AbstractC0039l.m62B(str3, new C0035h(context3, 5));
                        } catch (Throwable th3) {
                            c0104d3 = new C0104d(th3);
                        }
                        Throwable thM246a3 = AbstractC0105e.m246a(c0104d3);
                        if (thM246a3 != null) {
                            AbstractC0731a.m1387d("recent forward dexkit resolve fail", thM246a3);
                        }
                        c0020u = (C0020U) (c0104d3 instanceof C0104d ? null : c0104d3);
                    }
                }
                if (c0020u != null) {
                    JSONObject jSONObjectPut3 = new JSONObject().put("activityClassNames", AbstractC0039l.m88z(c0020u.f157a)).put("adapterClassNames", AbstractC0039l.m88z(c0020u.f158b)).put("dataFieldNames", AbstractC0039l.m88z(c0020u.f159c)).put("recyclerEntryNames", AbstractC0039l.m88z(c0020u.f160d));
                    AbstractC0223g.m417d(jSONObjectPut3, "put(...)");
                    JSONObject jSONObjectM84v3 = AbstractC0039l.m84v(jSONObjectPut3, 2);
                    SharedPreferences sharedPreferences3 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences3, "getSharedPreferences(...)");
                    sharedPreferences3.edit().putString("recent_forward_v1", jSONObjectM84v3.toString()).apply();
                    ((C0854L0) this.f303b).f2937o = c0020u;
                }
                break;
            case 5:
                Class cls = (Class) obj;
                AbstractC0223g.m415b(cls);
                ((C0881Y0) this.f303b).getClass();
                break;
            case 6:
                C0901f1 c0901f1 = (C0901f1) this.f303b;
                Context context4 = (Context) obj;
                AbstractC0223g.m418e(context4, "appContext");
                List list = C0024Y.f183a;
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo4 = context4.getApplicationInfo();
                    String str4 = applicationInfo4 != null ? applicationInfo4.sourceDir : null;
                    if (str4 == null || AbstractC0307q.m534d0(str4)) {
                        AbstractC0731a.m1387d("sns dexkit apk path empty");
                    } else {
                        try {
                            c0104d4 = (C0022W) AbstractC0039l.m62B(str4, new C0035h(context4));
                        } catch (Throwable th4) {
                            c0104d4 = new C0104d(th4);
                        }
                        Throwable thM246a4 = AbstractC0105e.m246a(c0104d4);
                        if (thM246a4 != null) {
                            AbstractC0731a.m1387d("sns dexkit resolve fail", thM246a4);
                        }
                        c0022w = (C0022W) (c0104d4 instanceof C0104d ? null : c0104d4);
                    }
                }
                if (c0022w != null) {
                    JSONObject jSONObjectPut4 = new JSONObject().put("timelineClassNames", AbstractC0039l.m88z(c0022w.f163a)).put("snsObjectProviderClassNames", AbstractC0039l.m88z(c0022w.f164b)).put("detailActivityClassNames", AbstractC0039l.m88z(c0022w.f165c)).put("selfAlbumAdapterClassNames", AbstractC0039l.m88z(c0022w.f166d)).put("snsInfoUserFieldNames", AbstractC0039l.m88z(c0022w.f167e)).put("snsInfoSnsIdFieldNames", AbstractC0039l.m88z(c0022w.f168f)).put("snsInfoLocalIdFieldNames", AbstractC0039l.m88z(c0022w.f169g)).put("timeLineObjectUserFieldNames", AbstractC0039l.m88z(c0022w.f170h)).put("snsObjectExtFlagFieldNames", AbstractC0039l.m88z(c0022w.f171i)).put("snsObjectLikeListFieldNames", AbstractC0039l.m88z(c0022w.f172j)).put("snsObjectLikeCountFieldNames", AbstractC0039l.m88z(c0022w.f173k)).put("snsObjectLikeListCountFieldNames", AbstractC0039l.m88z(c0022w.f174l)).put("snsObjectCommentListFieldNames", AbstractC0039l.m88z(c0022w.f175m)).put("snsObjectCommentCountFieldNames", AbstractC0039l.m88z(c0022w.f176n)).put("snsObjectCommentListCountFieldNames", AbstractC0039l.m88z(c0022w.f177o)).put("contextMenuCreateMethods", AbstractC0039l.m61A(c0022w.f178p)).put("contextMenuSelectMethods", AbstractC0039l.m61A(c0022w.f179q));
                    AbstractC0223g.m417d(jSONObjectPut4, "put(...)");
                    JSONObject jSONObjectM84v4 = AbstractC0039l.m84v(jSONObjectPut4, 2);
                    SharedPreferences sharedPreferences4 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences4, "getSharedPreferences(...)");
                    sharedPreferences4.edit().putString("sns_moment_v2", jSONObjectM84v4.toString()).apply();
                    c0901f1.f3182i = c0022w;
                    ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
                    AbstractC1140w.f3852g = c0022w;
                }
                break;
            case 7:
                TextView textView = (TextView) obj;
                AbstractC0223g.m418e(textView, "textView");
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                String str5 = string != null ? string : "";
                if (AbstractC0299i.m511i0(str5, "鑱婂ぉ璁板綍绌洪棿绠＄悊", false) || AbstractC0299i.m511i0(str5, "绠＄悊鑱婂ぉ璁板綍", false)) {
                    ((C0227k) this.f303b).f567a = true;
                }
                break;
            case 8:
                Context context5 = (Context) obj;
                AbstractC0223g.m418e(context5, "appContext");
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo5 = context5.getApplicationInfo();
                    String str6 = applicationInfo5 != null ? applicationInfo5.sourceDir : null;
                    if (str6 == null || AbstractC0307q.m534d0(str6)) {
                        AbstractC0731a.m1387d("text status dexkit apk path empty");
                    } else {
                        try {
                            c0104d5 = (C0029b0) AbstractC0039l.m62B(str6, new C0035h(context5, 10));
                        } catch (Throwable th5) {
                            c0104d5 = new C0104d(th5);
                        }
                        Throwable thM246a5 = AbstractC0105e.m246a(c0104d5);
                        if (thM246a5 != null) {
                            AbstractC0731a.m1387d("text status dexkit resolve fail", thM246a5);
                        }
                        c0029b0 = (C0029b0) (c0104d5 instanceof C0104d ? null : c0104d5);
                    }
                }
                if (c0029b0 != null) {
                    JSONObject jSONObjectPut5 = new JSONObject().put("activityClassNames", AbstractC0039l.m88z(c0029b0.f210a)).put("adapterClassNames", AbstractC0039l.m88z(c0029b0.f211b)).put("dataFieldNames", AbstractC0039l.m88z(c0029b0.f212c)).put("groupItemClassNames", AbstractC0039l.m88z(c0029b0.f213d)).put("titleItemClassNames", AbstractC0039l.m88z(c0029b0.f214e)).put("mainRecyclerEntryNames", AbstractC0039l.m88z(c0029b0.f215f)).put("titleEntryNames", AbstractC0039l.m88z(c0029b0.f216g)).put("avatarContainerEntryNames", AbstractC0039l.m88z(c0029b0.f217h));
                    AbstractC0223g.m417d(jSONObjectPut5, "put(...)");
                    JSONObject jSONObjectM84v5 = AbstractC0039l.m84v(jSONObjectPut5, 2);
                    SharedPreferences sharedPreferences5 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                    AbstractC0223g.m417d(sharedPreferences5, "getSharedPreferences(...)");
                    sharedPreferences5.edit().putString("text_status_v1", jSONObjectM84v5.toString()).apply();
                    ((C0831D1) this.f303b).f2771m = c0029b0;
                    AbstractC0039l.m81s("text_status_scan_status_v1", true);
                }
                break;
            case 9:
                String str7 = (String) obj;
                String string2 = str7 != null ? AbstractC0299i.m507C0(str7).toString() : null;
                if (string2 != null && !AbstractC0307q.m534d0(string2) && !AbstractC0223g.m414a(string2, ((MaskItemBean) this.f303b).getMaskId())) {
                    z = true;
                }
                break;
            case 10:
                AbstractC0223g.m418e((AbstractC1008c) obj, "it");
                ((C0990l) this.f303b).m2197d();
                break;
            case 11:
                MaskItemBean maskItemBean = (MaskItemBean) obj;
                AbstractC0223g.m418e(maskItemBean, "item");
                LruCache lruCache = AbstractC1129l.f3803a;
                String maskId = maskItemBean.getMaskId();
                Activity activity = (Activity) this.f303b;
                String string3 = maskId != null ? AbstractC0299i.m507C0(maskId).toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                boolean zM534d0 = AbstractC0307q.m534d0(string3);
                C0109i c0109i = C0109i.f404a;
                if (!zM534d0) {
                    AbstractC1129l.m2457g(string3);
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("image/*");
                    intent.addFlags(1);
                    intent.addFlags(64);
                    try {
                        activity.startActivityForResult(intent, 22305);
                        c0104d6 = c0109i;
                    } catch (Throwable th6) {
                        c0104d6 = new C0104d(th6);
                    }
                    Throwable thM246a6 = AbstractC0105e.m246a(c0104d6);
                    if (thM246a6 != null) {
                        AbstractC1129l.m2457g("");
                        AbstractC0731a.m1387d("launch custom avatar picker fail", thM246a6);
                        AbstractC0503h.m978P("打开图片选择失败");
                    }
                } else {
                    AbstractC0503h.m978P("微信ID为空");
                }
                break;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((C0973G) this.f303b).f3485e.mo8c(bool);
                break;
            default:
                C1119b c1119b = (C1119b) obj;
                AbstractC0223g.m418e(c1119b, "result");
                ((ExecutorC0741a) AbstractC0742b.f2509d.f312c).execute(new RunnableC0040m((InterfaceC0204l) this.f303b, c1119b, 15));
                break;
        }
        return C0109i.f404a;
    }
}
