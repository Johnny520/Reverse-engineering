package androidx.window.layout;

import android.content.Context;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C6136;
import kotlinx.coroutines.flow.InterfaceC6151;
import kotlinx.coroutines.flow.internal.InterfaceC6062;
import kotlinx.coroutines.internal.AbstractC6197;
import lin.xposed.hook.javaplugin.C6385;
import p091.C7787;
import p109.C8030;
import p111.C8036;
import p151.InterfaceC8344;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3434 implements InterfaceC3430 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8344 f8131;

    public C3434(C3427 c3427, InterfaceC8344 interfaceC8344, C7787 c7787) {
        this.f8131 = interfaceC8344;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6151 m5674(Context context) {
        context.getClass();
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C6136 c6136 = new C6136(windowInfoTrackerImpl$windowLayoutInfo$1, emptyCoroutineContext, -2, BufferOverflow.SUSPEND);
        C8036 c8036 = AbstractC6227.f15375;
        C8030 c8030 = AbstractC6197.f15305;
        c8030.getClass();
        if (AbstractC9019.m14261(c8030, C6285.f15450) == null) {
            return c8030.equals(emptyCoroutineContext) ? c6136 : InterfaceC6062.m10866(c6136, c8030, 0, null, 6);
        }
        C6385.m11431(c8030, "Flow context cannot contain job in it. Had ");
        return null;
    }
}
