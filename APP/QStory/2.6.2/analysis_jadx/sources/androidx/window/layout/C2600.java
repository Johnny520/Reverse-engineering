package androidx.window.layout;

import android.content.Context;
import com.alibaba.fastjson2.AbstractC2904;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C5303;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.internal.InterfaceC5229;
import kotlinx.coroutines.internal.AbstractC5364;
import lin.xposed.hook.javaplugin.C5553;
import p075.C6957;
import p093.C7200;
import p095.C7206;
import p135.InterfaceC7514;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2600 implements InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7514 f7784;

    public C2600(C2593 c2593, InterfaceC7514 interfaceC7514, C6957 c6957) {
        this.f7784 = interfaceC7514;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5318 m5069(Context context) {
        context.getClass();
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C5303 c5303 = new C5303(windowInfoTrackerImpl$windowLayoutInfo$1, emptyCoroutineContext, -2, BufferOverflow.SUSPEND);
        C7206 c7206 = AbstractC5394.f15030;
        C7200 c7200 = AbstractC5364.f14960;
        c7200.getClass();
        if (AbstractC2904.m6257(c7200, C5452.f15105) == null) {
            return c7200.equals(emptyCoroutineContext) ? c5303 : InterfaceC5229.m10303(c5303, c7200, 0, null, 6);
        }
        C5553.m10815(c7200, "Flow context cannot contain job in it. Had ");
        return null;
    }
}
