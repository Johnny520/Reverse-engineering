package p080fb;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p153k8.C2343g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: fb.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1117e1 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3665g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f3666h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [fb.g1.o(android.content.Context, fb.d1):void] */
    public /* synthetic */ RunnableC1117e1(String str) {
        this.f3666h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C3958e c3958e;
        boolean zContainsKey;
        Object c3959f;
        int i9 = this.f3665g;
        String str = this.f3666h;
        switch (i9) {
            case 0:
                ConcurrentHashMap.KeySetView keySetView = C1125g1.f3682g;
                ConcurrentHashMap concurrentHashMap = C1125g1.f3681f;
                C1125g1 c1125g1 = C1125g1.f3676a;
                while (true) {
                    try {
                        C3958e c3958e2 = (C3958e) concurrentHashMap.remove(str);
                        if (c3958e2 == null) {
                            if (zContainsKey) {
                                if (c3958e != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        try {
                            C1125g1.m2870n((Context) c3958e2.f12961g, (C1113d1) c3958e2.f12962h);
                            c3959f = C3967n.f12976a;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 异步保存会话失败: " + str, thM8182b);
                        }
                    } finally {
                        keySetView.remove(str);
                        if (concurrentHashMap.containsKey(str) && (c3958e = (C3958e) concurrentHashMap.get(str)) != null) {
                            C1125g1.m2871o((Context) c3958e.f12961g, (C1113d1) c3958e.f12962h);
                        }
                    }
                    break;
                }
                break;
            default:
                ConcurrentHashMap.KeySetView keySetView2 = C2343g.f7682q;
                try {
                    byte[] bArrM5581f = C2343g.m5581f(str);
                    if (bArrM5581f != null && bArrM5581f.length != 0) {
                        ConcurrentHashMap concurrentHashMap2 = C2343g.f7681p;
                        if (concurrentHashMap2.size() >= 64) {
                            Iterator it = concurrentHashMap2.keySet().iterator();
                            String str2 = it.hasNext() ? (String) it.next() : null;
                            if (str2 != null) {
                                concurrentHashMap2.remove(str2);
                            }
                        }
                        concurrentHashMap2.put(str, bArrM5581f);
                        break;
                    }
                    return;
                } finally {
                    keySetView2.remove(str);
                }
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [k8.g.c(java.lang.reflect.Method, java.lang.Object, java.lang.String, java.lang.String, java.lang.String):java.lang.Object[]] */
    public /* synthetic */ RunnableC1117e1(C2343g c2343g, String str) {
        this.f3666h = str;
    }
}
