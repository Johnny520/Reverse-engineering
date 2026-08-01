package top.suzhelan.qstory.hook.item;

import android.widget.FrameLayout;
import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5892 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5891 f16069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16070;

    public /* synthetic */ C5892(C5891 c5891, int i) {
        this.f16070 = i;
        this.f16069 = c5891;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16070) {
            case 3:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (this.f16069.f17425.booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        if (top.suzhelan.qstory.hook.item.C5891.m11288() == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5892.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }
}
