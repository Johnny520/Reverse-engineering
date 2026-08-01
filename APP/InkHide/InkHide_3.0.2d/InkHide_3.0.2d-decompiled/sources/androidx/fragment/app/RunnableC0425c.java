package androidx.fragment.app;

import android.os.Handler;
import java.util.ArrayList;
import p080o.RunnableC0775a;
import p093v.C1020e;
import p093v.CallableC1019d;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0425c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1313a = 1;

    /* JADX INFO: renamed from: b */
    public Object f1314b;

    /* JADX INFO: renamed from: c */
    public Object f1315c;

    /* JADX INFO: renamed from: d */
    public Object f1316d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0425c() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f1313a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1314b;
                C0420K c0420k = (C0420K) this.f1315c;
                if (arrayList.contains(c0420k)) {
                    arrayList.remove(c0420k);
                    ((C0431i) this.f1316d).getClass();
                    AbstractC0421L.m813a(c0420k.f1276c.f1353F, c0420k.f1274a);
                }
                break;
            default:
                try {
                    objCall = ((CallableC1019d) this.f1314b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f1316d).post(new RunnableC0775a((C1020e) this.f1315c, objCall, 4));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0425c(C0431i c0431i, ArrayList arrayList, C0420K c0420k) {
        this.f1316d = c0431i;
        this.f1314b = arrayList;
        this.f1315c = c0420k;
    }
}
