package p242q8;

import android.app.Activity;
import java.util.concurrent.CopyOnWriteArrayList;
import p025bc.AbstractC0255e;
import p036c9.C0425c2;
import p089g1.C1275d;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2005i;
import p258r8.C3744i;

/* JADX INFO: renamed from: q8.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3462q {

    /* JADX INFO: renamed from: a */
    public final C1275d f11228a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f11229b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public volatile boolean f11230c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3462q(C1275d c1275d) {
        this.f11228a = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m7264a(String str, String str2) {
        try {
            C3744i.f12154b.m7763b(KavaReflector.findDeclaredMethod(Activity.class, str, new Class[0]), new C0425c2(12, this, str2, false));
            return 1;
        } catch (Throwable th2) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("生命周期Hook失败: ", str, " ");
            sbM1026o.append(th2.getMessage());
            m7265b(sbM1026o.toString());
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7265b(String str) {
        if (this.f11228a != null) {
            C2005i.m4939f("[WeChatLifecycleApi] ".concat(str));
        }
    }
}
