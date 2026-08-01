package p038;

import de.robv.android.xposed.XposedHelpers;
import p026.AbstractC6316;
import p033.AbstractC6337;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5915;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6376 extends AbstractC6316 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC8405.m13972(313), classLoader, AbstractC8405.m13972(314), new Object[]{AbstractC6337.m11866(AbstractC8405.m13972(315)), new C5915(29)});
    }
}
