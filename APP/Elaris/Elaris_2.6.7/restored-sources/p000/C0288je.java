package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Locale;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0288je extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
            Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                try {
                    if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS) && "com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout".equals(viewGroup.getClass().getName())) {
                        View viewFindViewWithTag = viewGroup.findViewWithTag("ELARIS_LOCAL_VOICE_BAR_BUTTON");
                        Context context = viewGroup.getContext();
                        Activity activityM292e = AbstractC0169w.m292e(viewGroup);
                        if (activityM292e != null) {
                            String name = activityM292e.getClass().getName();
                            String lowerCase = name.toLowerCase(Locale.US);
                            if ("com.tencent.mobileqq.activity.ForwardRecentActivity".equals(name)) {
                                return;
                            }
                            if (lowerCase.contains("forwardrecent")) {
                                return;
                            }
                            if (lowerCase.contains("directforward")) {
                                return;
                            }
                        }
                        if (viewFindViewWithTag instanceof ImageView) {
                            AbstractC0169w.m333y0(viewGroup, (ImageView) viewFindViewWithTag);
                            return;
                        }
                        ImageView imageView = new ImageView(context);
                        imageView.setTag("ELARIS_LOCAL_VOICE_BAR_BUTTON");
                        imageView.setContentDescription("本地语音");
                        try {
                            imageView.setImageDrawable(new C0331m9(1.32f));
                        } catch (Throwable unused) {
                        }
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView.setBackground(AbstractC0169w.m305k0(context));
                        imageView.setPadding(AbstractC0169w.m322t(context, 1.0f), AbstractC0169w.m322t(context, 1.0f), AbstractC0169w.m322t(context, 1.0f), AbstractC0169w.m322t(context, 1.0f));
                        try {
                            imageView.setClipToOutline(true);
                        } catch (Throwable unused2) {
                        }
                        imageView.setOnClickListener(new ViewOnClickListenerC0443re());
                        AbstractC0169w.m333y0(viewGroup, imageView);
                        if (AbstractC0169w.f173m) {
                            return;
                        }
                        AbstractC0169w.f173m = true;
                        StringBuilder sb = new StringBuilder("local voice entry added host=");
                        sb.append(viewGroup.getClass().getName());
                        sb.append(" mode=shortcut_bar activity=");
                        sb.append(activityM292e == null ? "null" : activityM292e.getClass().getName());
                        HookEntry.logAlways(sb.toString());
                    }
                } catch (Throwable th) {
                    HookEntry.log("local voice shortcut bar button failed: " + th.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th.getMessage()));
                }
            }
        }
    }
}
