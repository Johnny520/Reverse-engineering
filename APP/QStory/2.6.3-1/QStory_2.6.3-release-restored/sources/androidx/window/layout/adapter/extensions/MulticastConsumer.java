package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC3021;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C3431;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class MulticastConsumer implements InterfaceC3021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f8077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f8078;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3431 f8079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f8080;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.f8080 = context;
        this.f8078 = new ReentrantLock();
        this.f8077 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC3021
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.f8078;
        reentrantLock.lock();
        try {
            C3431 c3431M5664 = AbstractC3412.m5664(this.f8080, value);
            this.f8079 = c3431M5664;
            Iterator it = this.f8077.iterator();
            while (it.hasNext()) {
                ((InterfaceC3021) it.next()).accept(c3431M5664);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5662(InterfaceC3021 interfaceC3021) {
        ReentrantLock reentrantLock = this.f8078;
        reentrantLock.lock();
        try {
            C3431 c3431 = this.f8079;
            if (c3431 != null) {
                interfaceC3021.accept(c3431);
            }
            this.f8077.add(interfaceC3021);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
