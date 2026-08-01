package p054;

import de.robv.android.xposed.XposedHelpers;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6745;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7205 extends AbstractC7145 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC9234.m14531(313), classLoader, AbstractC9234.m14531(314), new Object[]{AbstractC7166.m12425(AbstractC9234.m14531(315)), new C6745(29)});
    }
}
