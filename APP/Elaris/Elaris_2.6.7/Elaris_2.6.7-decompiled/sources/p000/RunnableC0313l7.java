package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.util.HashSet;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0313l7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f526b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f527c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0313l7(String str, ClassLoader classLoader) {
        this.f525a = 1;
        this.f526b = str;
        this.f527c = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        switch (this.f525a) {
            case 0:
                AbstractC0233ga.m446i(this.f527c, this.f526b);
                return;
            case 1:
                try {
                    if (HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
                        C0358o4 c0358o4M635m0 = AbstractC0260i5.m635m0(this.f526b);
                        if (c0358o4M635m0.f631a == null && ((HashSet) c0358o4M635m0.f633c).isEmpty() && !c0358o4M635m0.f632b) {
                            try {
                                str = AbstractC0233ga.f322k;
                            } catch (Throwable unused) {
                            }
                            if (str != null) {
                                if (str.length() <= 0) {
                                    str = "";
                                }
                                c0358o4M635m0 = AbstractC0260i5.m635m0(str);
                            }
                        }
                        if (HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
                            int iM447j = AbstractC0233ga.m447j(this.f527c, c0358o4M635m0);
                            int iM449l = AbstractC0233ga.m449l(this.f527c);
                            if (iM447j > 0 || iM449l > 0) {
                                HookEntry.logAlways("mini pull dex hints installed: header=" + iM447j + ", source=" + iM449l);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    AbstractC0233ga.m461x("mini-dex-hints-async-failed", "mini pull dex hints failed: " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    return;
                }
            default:
                synchronized (AbstractC0233ga.class) {
                    try {
                        if (AbstractC0233ga.f323l == this) {
                            AbstractC0233ga.f323l = null;
                        }
                    } finally {
                    }
                    break;
                }
                if (HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
                    AbstractC0233ga.m446i(this.f527c, this.f526b);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0313l7(int i, ClassLoader classLoader, String str) {
        this.f525a = i;
        this.f527c = classLoader;
        this.f526b = str;
    }
}
