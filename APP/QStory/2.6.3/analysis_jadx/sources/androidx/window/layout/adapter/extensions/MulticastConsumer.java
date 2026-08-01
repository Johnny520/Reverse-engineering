package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2598;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MulticastConsumer implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f7732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f7733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2598 f7734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f7735;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.f7735 = context;
        this.f7733 = new ReentrantLock();
        this.f7732 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC2188
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.f7733;
        reentrantLock.lock();
        try {
            C2598 c2598M5104 = AbstractC2579.m5104(this.f7735, value);
            this.f7734 = c2598M5104;
            Iterator it = this.f7732.iterator();
            while (it.hasNext()) {
                ((InterfaceC2188) it.next()).accept(c2598M5104);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5102(InterfaceC2188 interfaceC2188) {
        ReentrantLock reentrantLock = this.f7733;
        reentrantLock.lock();
        try {
            C2598 c2598 = this.f7734;
            if (c2598 != null) {
                interfaceC2188.accept(c2598);
            }
            this.f7732.add(interfaceC2188);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
