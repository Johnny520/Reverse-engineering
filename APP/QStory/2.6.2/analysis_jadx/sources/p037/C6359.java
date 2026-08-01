package p037;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import p026.AbstractC6298;
import p032.AbstractC6318;
import top.suzhelan.qstory.hook.item.C5909;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6359 extends AbstractC6298 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC3056.m6668(-3937595509905294759L), classLoader, AbstractC3056.m6668(-3937595488430458279L), new Object[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937595393941177767L)), new C5909(29)});
    }
}
