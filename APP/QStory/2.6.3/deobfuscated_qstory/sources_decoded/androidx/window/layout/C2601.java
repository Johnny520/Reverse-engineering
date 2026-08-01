package androidx.window.layout;

import android.content.Context;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C5304;
import kotlinx.coroutines.flow.InterfaceC5319;
import kotlinx.coroutines.flow.internal.InterfaceC5230;
import kotlinx.coroutines.internal.AbstractC5365;
import lin.xposed.hook.javaplugin.C5554;
import p075.C6958;
import p093.C7201;
import p095.C7207;
import p135.InterfaceC7515;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2601 implements InterfaceC2597 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7515 f7786;

    public C2601(C2594 c2594, InterfaceC7515 interfaceC7515, C6958 c6958) {
        this.f7786 = interfaceC7515;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5319 m5114(Context context) {
        context.getClass();
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C5304 c5304 = new C5304(windowInfoTrackerImpl$windowLayoutInfo$1, emptyCoroutineContext, -2, BufferOverflow.SUSPEND);
        C7207 c7207 = AbstractC5395.f15030;
        C7201 c7201 = AbstractC5365.f14960;
        c7201.getClass();
        if (AbstractC8190.m13702(c7201, C5453.f15105) == null) {
            return c7201.equals(emptyCoroutineContext) ? c5304 : InterfaceC5230.m10307(c5304, c7201, 0, null, 6);
        }
        C5554.m10872(c7201, "Flow context cannot contain job in it. Had ");
        return null;
    }
}
