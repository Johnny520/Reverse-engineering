package p000;

import android.view.View;
import android.view.ViewGroup;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Locale;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0558z1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f1124a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558z1(ClassLoader classLoader) {
        super(35);
        this.f1124a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        View view = null;
        Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
        if ((obj instanceof ViewGroup) && HookEntry.runtimeBool(Prefs.KEY_CLOUD_STICKER_PANEL)) {
            ViewGroup viewGroup = (ViewGroup) obj;
            if ("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout".equals(viewGroup.getClass().getName())) {
                int i = 0;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    String lowerCase = AbstractC0225g2.m419e(childAt, 0).toLowerCase(Locale.US);
                    if (lowerCase.contains("表情") || lowerCase.contains("emoji") || lowerCase.contains("emoticon") || lowerCase.contains("emotion")) {
                        view = childAt;
                        break;
                    }
                }
                if (view == null || !AbstractC0225g2.f292b.add(view)) {
                    return;
                }
                view.setOnLongClickListener(new ViewOnLongClickListenerC0003a2(this.f1124a, viewGroup, i));
            }
        }
    }
}
