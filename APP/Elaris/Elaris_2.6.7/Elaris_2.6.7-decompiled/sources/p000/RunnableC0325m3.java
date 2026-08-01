package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0325m3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f554c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0325m3(int i, ClassLoader classLoader, String str) {
        this.f552a = i;
        this.f553b = classLoader;
        this.f554c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (HookEntry.isCurrentHotReloadGeneration(this.f552a)) {
            if (!HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO)) {
                synchronized (AbstractC0432r3.class) {
                    try {
                        if (HookEntry.isCurrentHotReloadGeneration(this.f552a)) {
                            AbstractC0432r3.f786d = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                int iM844b = AbstractC0432r3.m844b(this.f553b, new C0400p3(this.f554c));
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                synchronized (AbstractC0432r3.class) {
                    try {
                        if (HookEntry.isCurrentHotReloadGeneration(this.f552a)) {
                            AbstractC0432r3.f786d = false;
                            if (iM844b > 0) {
                                AbstractC0432r3.f785c = true;
                                AbstractC0432r3.m857o("[Elaris:NoticeGate] precise group-todo scan hook cost=" + jCurrentTimeMillis2 + "ms");
                            } else {
                                AbstractC0432r3.m857o("[Elaris:NoticeGate] precise group-todo hook unavailable cost=" + jCurrentTimeMillis2 + "ms");
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                synchronized (AbstractC0432r3.class) {
                    try {
                        if (HookEntry.isCurrentHotReloadGeneration(this.f552a)) {
                            AbstractC0432r3.f786d = false;
                            AbstractC0432r3.m857o("[Elaris:NoticeGate] precise group-todo hook unavailable cost=" + jCurrentTimeMillis3 + "ms");
                            throw th;
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
