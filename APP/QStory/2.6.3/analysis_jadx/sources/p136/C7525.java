package p136;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.util.InterfaceC2188;
import androidx.window.layout.C2598;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import p135.InterfaceC7515;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7525 implements InterfaceC7515 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ReentrantLock f20396 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static volatile C7525 f20397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f20398 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7521 f20399;

    public C7525(C7527 c7527) {
        this.f20399 = c7527;
        if (c7527 != null) {
            c7527.m12749(new C5856(this, 12));
        }
    }

    @Override // p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5106(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        Object next;
        WindowManager.LayoutParams attributes;
        context.getClass();
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            interfaceC2188.accept(new C2598(EmptyList.INSTANCE));
            return;
        }
        ReentrantLock reentrantLock = f20396;
        reentrantLock.lock();
        try {
            InterfaceC7521 interfaceC7521 = this.f20399;
            if (interfaceC7521 == null) {
                interfaceC2188.accept(new C2598(EmptyList.INSTANCE));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f20398;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C7524) it.next()).f20395.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            C7524 c7524 = new C7524(activity, executor, interfaceC2188);
            copyOnWriteArrayList.add(c7524);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity.equals(((C7524) next).f20395)) {
                            break;
                        }
                    }
                }
                C7524 c75242 = (C7524) next;
                C2598 c2598 = c75242 != null ? c75242.f20392 : null;
                if (c2598 != null) {
                    c7524.f20392 = c2598;
                    c7524.f20394.execute(new RunnableC0099(c7524, 19, c2598));
                }
            } else {
                C7527 c7527 = (C7527) interfaceC7521;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    c7527.m12750(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(c7527, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5107(InterfaceC2188 interfaceC2188) {
        interfaceC2188.getClass();
        synchronized (f20396) {
            try {
                if (this.f20399 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f20398.iterator();
                it.getClass();
                while (it.hasNext()) {
                    C7524 c7524 = (C7524) it.next();
                    if (c7524.f20393 == interfaceC2188) {
                        arrayList.add(c7524);
                    }
                }
                this.f20398.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C7524) it2.next()).f20395;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f20398;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C7524) it3.next()).f20395.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC7521 interfaceC7521 = this.f20399;
                    if (interfaceC7521 != null) {
                        ((C7527) interfaceC7521).m12751(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
