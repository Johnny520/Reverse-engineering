package p000;

import android.view.View;
import android.view.ViewGroup;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0424qb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final View f764a;

    /* JADX INFO: renamed from: b */
    public int f765b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0424qb(View view) {
        this.f764a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m818a() {
        synchronized (AbstractC0440rb.f803a) {
            try {
                WeakHashMap weakHashMap = AbstractC0440rb.f805c;
                if (weakHashMap.get(this.f764a) == this) {
                    weakHashMap.remove(this.f764a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object tag;
        Object parent;
        synchronized (AbstractC0440rb.f803a) {
            try {
                if (AbstractC0440rb.f805c.get(this.f764a) != this) {
                    return;
                }
                if (!HookEntry.runtimeBool(Prefs.KEY_BLOCK_QQ_SHOW)) {
                    m818a();
                    return;
                }
                View view = this.f764a;
                if (view != null) {
                    View view2 = view;
                    int i = 0;
                    while (true) {
                        if (view2 == null || i >= 12) {
                            try {
                                if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_QQ_SHOW)) {
                                    AbstractC0440rb.m863b(view, 0, new int[]{0});
                                }
                                if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
                                    try {
                                        if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
                                            AbstractC0486u9.m1059l(view, 0, new int[]{0});
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_QQ_SHOW)) {
                                    View viewM1095n = AbstractC0497v4.m1095n(view, 0, new int[]{0});
                                    if (viewM1095n != null) {
                                        try {
                                            int[] iArr = new int[2];
                                            viewM1095n.getLocationOnScreen(iArr);
                                            AbstractC0486u9.m1060m(view, iArr[0], iArr[1], Math.max(1, viewM1095n.getWidth()), Math.max(1, viewM1095n.getHeight()), 0, new int[]{0});
                                        } catch (Throwable unused2) {
                                        }
                                        try {
                                            if (viewM1095n instanceof ViewGroup) {
                                                int[] iArr2 = new int[2];
                                                viewM1095n.getLocationOnScreen(iArr2);
                                                AbstractC0486u9.m1060m(viewM1095n, iArr2[0], iArr2[1], Math.max(1, viewM1095n.getWidth()), Math.max(1, viewM1095n.getHeight()), 0, new int[]{0});
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                AbstractC0000a.m2c("cleanupQQShowAround failed: ", th);
                            }
                        } else {
                            try {
                                tag = view2.getTag();
                            } catch (Throwable unused4) {
                                tag = null;
                            }
                            if ("ELARIS_FULL_PAGE".equals(tag) || "ELARIS_SETTINGS_VIEW".equals(tag)) {
                                break;
                            }
                            try {
                                parent = view2.getParent();
                            } catch (Throwable unused5) {
                                parent = null;
                            }
                            view2 = parent instanceof View ? (View) parent : null;
                            i++;
                        }
                    }
                }
                synchronized (AbstractC0440rb.f803a) {
                    try {
                        WeakHashMap weakHashMap = AbstractC0440rb.f805c;
                        if (weakHashMap.get(this.f764a) != this) {
                            return;
                        }
                        int i2 = this.f765b;
                        int i3 = i2 + 1;
                        this.f765b = i3;
                        long[] jArr = AbstractC0440rb.f804b;
                        if (i3 >= 3) {
                            weakHashMap.remove(this.f764a);
                            return;
                        }
                        try {
                            if (this.f764a.postDelayed(this, jArr[i3] - jArr[i2])) {
                                return;
                            }
                            m818a();
                        } catch (Throwable th2) {
                            m818a();
                            AbstractC0198e7.m343a("qqshow-sidebar", "cleanup-stage", th2);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }
}
