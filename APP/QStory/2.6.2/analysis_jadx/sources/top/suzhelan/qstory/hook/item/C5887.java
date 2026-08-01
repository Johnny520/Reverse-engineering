package top.suzhelan.qstory.hook.item;

import android.widget.FrameLayout;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5887 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5886 f16060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16061;

    public /* synthetic */ C5887(C5886 c5886, int i) {
        this.f16061 = i;
        this.f16060 = c5886;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16061) {
            case 3:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                if (this.f16060.f17376.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    FrameLayout frameLayout = obj instanceof FrameLayout ? (FrameLayout) obj : null;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                        break;
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fa, code lost:
    
        if (top.suzhelan.qstory.hook.item.C5886.m11227() == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5887.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }
}
