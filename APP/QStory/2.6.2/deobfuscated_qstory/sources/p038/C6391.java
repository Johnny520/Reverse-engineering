package p038;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import p022.C6267;
import p026.AbstractC6293;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6391 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        m11803(XposedHelpers.findMethodBestMatch(classLoader.loadClass("com.tencent.mobileqq.widget.navbar.NavBarAIO"), "setEarIconVisible", new Class[]{Boolean.TYPE}), new C6267(16));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5f53\u524d\u529f\u80fd\u672a\u5728QQNT\u4fee\u590d \u53ef\u7528\u72b6\u6001 : ".concat(AbstractC3056.m6668(AbstractC6560.m12011() ? -3937572196822812071L : -3937572179642942887L));
    }
}
