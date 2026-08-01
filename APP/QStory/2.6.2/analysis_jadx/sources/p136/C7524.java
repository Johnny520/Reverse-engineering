package p136;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.util.InterfaceC2188;
import androidx.window.layout.C2597;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import p135.InterfaceC7514;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7524 implements InterfaceC7514 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ReentrantLock f20401 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static volatile C7524 f20402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f20403 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7520 f20404;

    public C7524(C7526 c7526) {
        this.f20404 = c7526;
        if (c7526 != null) {
            c7526.m12720(new C5851(this, 12));
        }
    }

    @Override // p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5061(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        Object next;
        WindowManager.LayoutParams attributes;
        context.getClass();
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            interfaceC2188.accept(new C2597(EmptyList.INSTANCE));
            return;
        }
        ReentrantLock reentrantLock = f20401;
        reentrantLock.lock();
        try {
            InterfaceC7520 interfaceC7520 = this.f20404;
            if (interfaceC7520 == null) {
                interfaceC2188.accept(new C2597(EmptyList.INSTANCE));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f20403;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C7523) it.next()).f20400.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            C7523 c7523 = new C7523(activity, executor, interfaceC2188);
            copyOnWriteArrayList.add(c7523);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity.equals(((C7523) next).f20400)) {
                            break;
                        }
                    }
                }
                C7523 c75232 = (C7523) next;
                C2597 c2597 = c75232 != null ? c75232.f20397 : null;
                if (c2597 != null) {
                    c7523.f20397 = c2597;
                    c7523.f20399.execute(new RunnableC0099(c7523, 19, c2597));
                }
            } else {
                C7526 c7526 = (C7526) interfaceC7520;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    c7526.m12721(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(c7526, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5062(InterfaceC2188 interfaceC2188) {
        interfaceC2188.getClass();
        synchronized (f20401) {
            try {
                if (this.f20404 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f20403.iterator();
                it.getClass();
                while (it.hasNext()) {
                    C7523 c7523 = (C7523) it.next();
                    if (c7523.f20398 == interfaceC2188) {
                        arrayList.add(c7523);
                    }
                }
                this.f20403.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C7523) it2.next()).f20400;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f20403;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C7523) it3.next()).f20400.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC7520 interfaceC7520 = this.f20404;
                    if (interfaceC7520 != null) {
                        ((C7526) interfaceC7520).m12722(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
