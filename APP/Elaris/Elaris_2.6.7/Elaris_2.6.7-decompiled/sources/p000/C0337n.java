package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: n */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337n extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View view;
        CharSequence contentDescription;
        Object[] objArr;
        if (HookEntry.runtimeBool(Prefs.KEY_ALBUM_VIDEO_BUBBLE)) {
            if (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length <= 0) {
                view = null;
            } else {
                Object obj = objArr[0];
                if (obj instanceof View) {
                    view = (View) obj;
                }
            }
            if (view == null || (contentDescription = view.getContentDescription()) == null) {
                return;
            }
            String strTrim = contentDescription.toString().trim();
            if (strTrim.contains("泡泡消息") || strTrim.contains("视频泡泡") || strTrim.equals("泡泡")) {
                Activity activityM594b = AbstractC0260i5.m594b(view.getContext());
                if (activityM594b == null) {
                    activityM594b = HookEntry.topActivity();
                }
                if (activityM594b == null) {
                    AbstractC0444s.m880i(null, "未找到当前聊天页面");
                    methodHookParam.setResult(null);
                    return;
                }
                AbstractC0444s.m873b(view, "bubble-click");
                WeakReference weakReference = AbstractC0444s.f809c;
                Object obj2 = weakReference == null ? null : weakReference.get();
                if (obj2 == null) {
                    AbstractC0444s.m880i(activityM594b, "视频泡泡入口未就绪，请重新进入聊天");
                    methodHookParam.setResult(null);
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!AbstractC0444s.f814h || jCurrentTimeMillis - AbstractC0444s.f815i >= 120000) {
                    AbstractC0444s.f814h = true;
                    AbstractC0444s.f815i = jCurrentTimeMillis;
                    AbstractC0444s.f810d = new WeakReference(obj2);
                    try {
                        try {
                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("video/*");
                            intent.addFlags(65);
                            activityM594b.startActivityForResult(intent, 8220);
                            HookEntry.log("album video bubble document video picker opened");
                        } catch (Throwable unused) {
                            Intent intent2 = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                            intent2.setType("video/*");
                            intent2.addFlags(1);
                            activityM594b.startActivityForResult(intent2, 8220);
                            HookEntry.log("album video bubble gallery picker opened");
                        }
                    } catch (Throwable unused2) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            try {
                                Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
                                intent3.setType("video/*");
                                intent3.addFlags(1);
                                activityM594b.startActivityForResult(intent3, 8220);
                                HookEntry.log("album video bubble system video picker opened");
                            } catch (Throwable unused3) {
                                try {
                                    Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
                                    intent4.addCategory("android.intent.category.OPENABLE");
                                    intent4.setType("video/*");
                                    intent4.addFlags(1);
                                    activityM594b.startActivityForResult(intent4, 8220);
                                    HookEntry.log("album video bubble fallback picker opened");
                                } catch (Throwable th) {
                                    AbstractC0444s.f814h = false;
                                    AbstractC0444s.f810d = new WeakReference(null);
                                    AbstractC0198e7.m343a("album-video-bubble", "open-picker", th);
                                    AbstractC0444s.m880i(activityM594b, "无法打开视频选择器");
                                    return;
                                }
                            }
                        } else {
                            Intent intent42 = new Intent("android.intent.action.GET_CONTENT");
                            intent42.addCategory("android.intent.category.OPENABLE");
                            intent42.setType("video/*");
                            intent42.addFlags(1);
                            activityM594b.startActivityForResult(intent42, 8220);
                            HookEntry.log("album video bubble fallback picker opened");
                        }
                    }
                } else {
                    AbstractC0444s.m880i(activityM594b, "视频选择器已打开");
                }
                methodHookParam.setResult(null);
            }
        }
    }
}
