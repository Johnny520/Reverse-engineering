package p152;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.p001ui.platform.ViewOnAttachStateChangeListenerC2676;
import androidx.core.util.InterfaceC3021;
import androidx.window.layout.C3431;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import p151.InterfaceC8344;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8354 implements InterfaceC8344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ReentrantLock f20741 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static volatile C8354 f20742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f20743 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8350 f20744;

    public C8354(C8356 c8356) {
        this.f20744 = c8356;
        if (c8356 != null) {
            c8356.m13308(new C6686(this, 12));
        }
    }

    @Override // p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5666(Context context, Executor executor, InterfaceC3021 interfaceC3021) {
        Object next;
        WindowManager.LayoutParams attributes;
        context.getClass();
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            interfaceC3021.accept(new C3431(EmptyList.INSTANCE));
            return;
        }
        ReentrantLock reentrantLock = f20741;
        reentrantLock.lock();
        try {
            InterfaceC8350 interfaceC8350 = this.f20744;
            if (interfaceC8350 == null) {
                interfaceC3021.accept(new C3431(EmptyList.INSTANCE));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f20743;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C8353) it.next()).f20740.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            C8353 c8353 = new C8353(activity, executor, interfaceC3021);
            copyOnWriteArrayList.add(c8353);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity.equals(((C8353) next).f20740)) {
                            break;
                        }
                    }
                }
                C8353 c83532 = (C8353) next;
                C3431 c3431 = c83532 != null ? c83532.f20737 : null;
                if (c3431 != null) {
                    c8353.f20737 = c3431;
                    c8353.f20739.execute(new RunnableC0946(c8353, 19, c3431));
                }
            } else {
                C8356 c8356 = (C8356) interfaceC8350;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    c8356.m13309(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(c8356, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5667(InterfaceC3021 interfaceC3021) {
        interfaceC3021.getClass();
        synchronized (f20741) {
            try {
                if (this.f20744 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f20743.iterator();
                it.getClass();
                while (it.hasNext()) {
                    C8353 c8353 = (C8353) it.next();
                    if (c8353.f20738 == interfaceC3021) {
                        arrayList.add(c8353);
                    }
                }
                this.f20743.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C8353) it2.next()).f20740;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f20743;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C8353) it3.next()).f20740.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC8350 interfaceC8350 = this.f20744;
                    if (interfaceC8350 != null) {
                        ((C8356) interfaceC8350).m13310(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
