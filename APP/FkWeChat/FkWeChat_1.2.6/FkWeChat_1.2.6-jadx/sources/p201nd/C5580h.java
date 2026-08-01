package p201nd;

import android.content.ContentValues;
import bsh.C1168e1;
import bsh.RunnableC1205k2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p053dd.AbstractC1949a;
import p053dd.C1950b;
import p053dd.C1951c;
import p216od.AbstractC5736e;
import p216od.C5732a;
import p216od.C5733b;

/* JADX INFO: renamed from: nd.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5580h {
    private final RunnableC1205k2 interpreter;
    private final C5733b pluginInfo;
    private static final List<C5580h> activeCallbacks = new CopyOnWriteArrayList();
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors() * 2));

    public C5580h(C5732a c5732a) {
        this.pluginInfo = c5732a.f18071a;
        this.interpreter = c5732a.f18072b;
    }

    public static void dispatchCdnDownload(final AbstractC1949a.a aVar) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || aVar == null) {
            return;
        }
        for (final C5580h c5580h : list) {
            EXECUTOR.execute(new Runnable() { // from class: nd.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17460q.invokeMethodIfExists("onCdnDownload", 1, new Object[]{aVar});
                }
            });
        }
    }

    public static void dispatchCdnUpload(final AbstractC1949a.b bVar) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || bVar == null) {
            return;
        }
        for (final C5580h c5580h : list) {
            EXECUTOR.execute(new Runnable() { // from class: nd.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17451q.invokeMethodIfExists("onCdnUpload", 1, new Object[]{bVar});
                }
            });
        }
    }

    public static void dispatchCgiRequ(final C1950b c1950b) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || c1950b == null) {
            return;
        }
        for (final C5580h c5580h : list) {
            EXECUTOR.execute(new Runnable() { // from class: nd.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17465q.invokeMethodIfExists("onCgiRequ", 1, new Object[]{c1950b});
                }
            });
        }
    }

    public static void dispatchCgiResp(final C1950b c1950b) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || c1950b == null) {
            return;
        }
        for (final C5580h c5580h : list) {
            EXECUTOR.execute(new Runnable() { // from class: nd.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17456q.invokeMethodIfExists("onCgiResp", 1, new Object[]{c1950b});
                }
            });
        }
    }

    public static void dispatchMemberJoined(final String str, final List<String> list) {
        for (final C5580h c5580h : activeCallbacks) {
            EXECUTOR.execute(new Runnable() { // from class: nd.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17453q.invokeMethodIfExists("onMemberJoined", 2, new Object[]{str, list});
                }
            });
        }
    }

    public static void dispatchMemberLeft(final String str, final List<String> list) {
        for (final C5580h c5580h : activeCallbacks) {
            EXECUTOR.execute(new Runnable() { // from class: nd.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17462q.invokeMethodIfExists("onMemberLeft", 2, new Object[]{str, list});
                }
            });
        }
    }

    public static void dispatchMsg(ContentValues contentValues) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || contentValues == null) {
            return;
        }
        final C1951c c1951c = new C1951c(contentValues);
        for (final C5580h c5580h : list) {
            EXECUTOR.execute(new Runnable() { // from class: nd.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17458q.invokeMethodIfExists("onMsg", 1, new Object[]{c1951c});
                }
            });
        }
    }

    public static void dispatchMsgMenuEvent(C1951c c1951c) {
        List<C5580h> list = activeCallbacks;
        if (list.isEmpty() || c1951c == null) {
            return;
        }
        Iterator<C5580h> it = list.iterator();
        while (it.hasNext()) {
            it.next().invokeMethodIfExists("onMsgMenu", 1, new Object[]{c1951c});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeMethodIfExists(String str, int i10, Object[] objArr) {
        RunnableC1205k2 runnableC1205k2 = this.interpreter;
        if (runnableC1205k2 == null || runnableC1205k2.m4496q() == null) {
            return;
        }
        try {
            for (C1168e1 c1168e1 : this.interpreter.m4496q().m4344F()) {
                if (str.equals(c1168e1.getName()) && c1168e1.mo4123k().length == i10) {
                    c1168e1.m4290n(objArr, this.interpreter);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC5736e.m23198c(this.pluginInfo, str + " Callback error", th);
        }
    }

    public static void register(C5580h c5580h) {
        if (c5580h != null) {
            List<C5580h> list = activeCallbacks;
            if (list.contains(c5580h)) {
                return;
            }
            list.add(c5580h);
        }
    }

    public static void unregister(C5580h c5580h) {
        if (c5580h != null) {
            activeCallbacks.remove(c5580h);
        }
    }

    public void invokeOnLoad() {
        invokeMethodIfExists("onLoad", 0, new Object[0]);
    }

    public void invokeOnUnload() {
        invokeMethodIfExists("onUnload", 0, new Object[0]);
    }
}
