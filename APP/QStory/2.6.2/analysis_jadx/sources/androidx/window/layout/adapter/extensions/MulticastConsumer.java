package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2597;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MulticastConsumer implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f7730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f7731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2597 f7732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f7733;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.f7733 = context;
        this.f7731 = new ReentrantLock();
        this.f7730 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC2188
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.f7731;
        reentrantLock.lock();
        try {
            C2597 c2597M5059 = AbstractC2578.m5059(this.f7733, value);
            this.f7732 = c2597M5059;
            Iterator it = this.f7730.iterator();
            while (it.hasNext()) {
                ((InterfaceC2188) it.next()).accept(c2597M5059);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5057(InterfaceC2188 interfaceC2188) {
        ReentrantLock reentrantLock = this.f7731;
        reentrantLock.lock();
        try {
            C2597 c2597 = this.f7732;
            if (c2597 != null) {
                interfaceC2188.accept(c2597);
            }
            this.f7730.add(interfaceC2188);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
