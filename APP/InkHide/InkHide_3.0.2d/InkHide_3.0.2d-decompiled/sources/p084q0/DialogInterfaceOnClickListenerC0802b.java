package p084q0;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Editable;
import android.util.LruCache;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p086r0.C0864P0;
import p086r0.C0881Y0;
import p088s0.C0976J;
import p088s0.C0987i;
import p088s0.C0990l;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0802b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2671c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2672d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnClickListenerC0802b(Object obj, Object obj2, int i2) {
        this.f2670b = i2;
        this.f2672d = obj;
        this.f2671c = obj2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x00d6 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r15v16, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r15v17, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        boolean zCommit;
        Object string;
        Object c0104d;
        Object obj;
        boolean zM2456f = false;
        str = "";
        switch (this.f2670b) {
            case 0:
                ((C0806f) this.f2672d).m1471b((Activity) this.f2671c);
                return;
            case 1:
                Intent intent = (Intent) this.f2672d;
                Activity activity = (Activity) this.f2671c;
                try {
                    Intent uri = Intent.parseUri("maskwechat://com.lu.wxmask/page/webView?&url=https://github.com/Mingyueyixi/MaskWechat", 4);
                    intent.addFlags(268435456);
                    activity.startActivity(uri);
                    return;
                } catch (Throwable unused) {
                    AbstractC0503h.m978P("打开糊脸主页失败");
                    return;
                }
            case 2:
                C0881Y0 c0881y0 = (C0881Y0) this.f2672d;
                C0864P0 c0864p0 = (C0864P0) this.f2671c;
                View view = c0864p0.f2976e;
                LinkedHashSet linkedHashSet = c0864p0.f2974c;
                c0881y0.getClass();
                String str2 = str;
                if (view != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    str2 = str;
                    str2 = str;
                    if (width > 0 && height > 0) {
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, Math.min(height, 900), Bitmap.Config.ARGB_8888);
                            AbstractC0223g.m417d(bitmapCreateBitmap, "createBitmap(...)");
                            view.draw(new Canvas(bitmapCreateBitmap));
                            String str3 = "self_sns_" + AbstractC0307q.m537g0(String.valueOf(AbstractC0123k.m271m0(linkedHashSet, "_", null, null, null, 62).hashCode()), "-", "n") + ".png";
                            boolean z2 = AbstractC1126i.f3786a;
                            File file = new File(AbstractC0503h.m991x().getFilesDir(), "hidden_self_sns_posts");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            File file2 = new File(file, str3);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                                fileOutputStream.close();
                                bitmapCreateBitmap.recycle();
                                c0104d = file2.getAbsolutePath();
                            } finally {
                            }
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a == null) {
                            obj = c0104d;
                        } else {
                            AbstractC0731a.m1387d("save self sns preview image fail", thM246a);
                            obj = str;
                        }
                        str2 = (String) obj;
                    }
                }
                boolean z3 = AbstractC1126i.f3786a;
                LinkedHashSet linkedHashSet2 = c0864p0.f2974c;
                String str4 = c0864p0.f2975d;
                AbstractC0223g.m418e(str2, "imagePath");
                ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(linkedHashSet2));
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC0299i.m507C0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!AbstractC0307q.m534d0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    zCommit = false;
                } else {
                    Set<String> setM2432h = C1124g.m2432h();
                    Iterator it2 = arrayList2.iterator();
                    boolean z4 = false;
                    while (true) {
                        zCommit = true;
                        if (it2.hasNext()) {
                            if (setM2432h.add((String) it2.next())) {
                                z4 = true;
                            }
                        } else if (z4) {
                            SharedPreferences.Editor editorEdit = C1124g.m2438n().edit();
                            boolean z5 = AbstractC1126i.f3786a;
                            zCommit = editorEdit.putStringSet("hidden_self_sns_posts", setM2432h).commit();
                            if (zCommit) {
                                C1124g.m2422M(arrayList2, str4);
                                C1124g.m2421L(arrayList2, str2);
                                C1124g.m2418I();
                            } else {
                                AbstractC0731a.m1387d("addHiddenSelfSnsPost fail");
                            }
                        } else {
                            C1124g.m2422M(arrayList2, str4);
                            C1124g.m2421L(arrayList2, str2);
                        }
                    }
                }
                if (!zCommit) {
                    Toast.makeText(c0864p0.f2972a, "隐藏失败", 0).show();
                    return;
                }
                ListAdapter listAdapter = c0864p0.f2973b;
                if (listAdapter != null) {
                    c0881y0.m1793G(listAdapter);
                }
                Object obj3 = c0881y0.f3047k;
                if (obj3 != null) {
                    string = obj3 != c0864p0.f2973b ? obj3 : null;
                    if (string != null) {
                        c0881y0.m1793G(string);
                    }
                }
                Toast.makeText(c0864p0.f2972a, "已隐藏此条朋友圈", 0).show();
                c0864p0.f2972a.finish();
                return;
            case 3:
                LruCache lruCache = AbstractC1129l.f3803a;
                String string2 = AbstractC0299i.m507C0(((C0987i) this.f2672d).f3531a).toString();
                if (string2 == null) {
                    string2 = "";
                }
                if (!AbstractC0307q.m534d0(string2)) {
                    LinkedHashMap linkedHashMapM299d0 = AbstractC0134v.m299d0(AbstractC1129l.m2453c());
                    String str5 = (String) linkedHashMapM299d0.remove(string2);
                    if (str5 != null) {
                        try {
                            new File(str5).delete();
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    zM2456f = AbstractC1129l.m2456f(linkedHashMapM299d0);
                }
                if (!zM2456f) {
                    AbstractC0503h.m978P("清除失败");
                    return;
                }
                C0990l c0990l = (C0990l) this.f2671c;
                c0990l.f3554g.evictAll();
                AbstractC0503h.m978P("已清除本地头像");
                EditText editText = c0990l.f3558k;
                if (editText == null) {
                    AbstractC0223g.m420g("searchEditText");
                    throw null;
                }
                Editable text = editText.getText();
                string = text != null ? text.toString() : null;
                c0990l.m2196c(string != null ? string : "");
                return;
            default:
                boolean z6 = AbstractC1126i.f3786a;
                try {
                    boolean zCommit2 = C1124g.m2438n().edit().clear().commit();
                    if (zCommit2) {
                        C1124g.m2441q(null);
                        C1124g.m2418I();
                    } else {
                        AbstractC0731a.m1387d("clear sp data fail" + zCommit2);
                    }
                    break;
                } catch (Exception e2) {
                    AbstractC0731a.m1387d("clear sp data fail", e2);
                }
                FrameLayout frameLayout = (FrameLayout) this.f2672d;
                AbstractC0503h.m978P("配置已清空，请杀掉" + frameLayout.getContext().getResources().getString(frameLayout.getContext().getApplicationInfo().labelRes) + "并重启");
                Activity activity2 = ((C0976J) this.f2671c).getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DialogInterfaceOnClickListenerC0802b(C0806f c0806f, Activity activity, Intent intent) {
        this.f2670b = 0;
        this.f2672d = c0806f;
        this.f2671c = activity;
    }
}
