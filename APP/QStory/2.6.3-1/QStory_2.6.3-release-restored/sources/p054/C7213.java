package p054;

import android.os.Bundle;
import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedBridge;
import java.util.HashMap;
import java.util.List;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C7213 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f17892 = new HashMap();

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12413 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        XposedBridge.hookMethod(c7164M12413.m12414(), new C7209(this));
    }
}
