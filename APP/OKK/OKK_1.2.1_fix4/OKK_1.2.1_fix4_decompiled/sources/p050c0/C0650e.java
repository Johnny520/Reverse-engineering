package p050c0;

import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0650e extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0656g f2019b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f2021d;

    public C0650e(C0656g c0656g, String str, boolean z2) {
        this.f2019b = c0656g;
        this.f2020c = str;
        this.f2021d = z2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        Object objM116u;
        C0656g c0656g = this.f2019b;
        c0656g.getClass();
        if (C0656g.m1649j()) {
            try {
                C0656g.m1641a(c0656g, c0760b, this.f2021d);
                objM116u = C0146l.f339a;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            String str = this.f2020c;
            if (thM465a != null) {
                C0656g.m1657r("markAndBlockDelete fail " + str + ": " + thM465a.getMessage());
            }
            c0760b.m1946c(Boolean.TRUE);
            C0656g.m1657r("BLOCKED " + str + " + marked");
            ModuleLog.INSTANCE.m1813i("拦截朋友圈评论删除并标记[已删除](" + str + ")");
        }
    }
}
