package p088s0;

import android.content.DialogInterface;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import p011F0.C0131s;
import p021K0.C0167f;
import p021K0.C0169h;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p069i.C0716t;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1003y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3597c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnClickListenerC1003y(int i2, Object obj) {
        this.f3596b = i2;
        this.f3597c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Object obj = this.f3597c;
        switch (this.f3596b) {
            case 0:
                ((C0976J) obj).m2171G();
                return;
            case 1:
                boolean z2 = AbstractC1126i.f3786a;
                C0976J c0976j = (C0976J) obj;
                C1124g.m2424O(c0976j.f3494l);
                c0976j.m2171G();
                return;
            default:
                boolean z3 = AbstractC1126i.f3786a;
                boolean z4 = true;
                if (C1124g.m2438n().contains("hidden_self_sns_posts")) {
                    boolean zCommit = C1124g.m2438n().edit().remove("hidden_self_sns_posts").remove("hidden_self_sns_post_summaries").remove("hidden_self_sns_post_images").commit();
                    if (zCommit) {
                        File file = new File(AbstractC0503h.m991x().getFilesDir(), "hidden_self_sns_posts");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C0167f c0167f = new C0167f(new C0169h(file));
                        while (true) {
                            boolean z5 = true;
                            while (c0167f.hasNext()) {
                                File file2 = (File) c0167f.next();
                                if (!file2.delete() && file2.exists()) {
                                    z5 = false;
                                } else if (!z5) {
                                    z5 = false;
                                }
                                break;
                            }
                            C1124g.m2418I();
                        }
                    } else {
                        AbstractC0731a.m1387d("clearHiddenSelfSnsPosts fail");
                    }
                    z4 = zCommit;
                }
                if (!z4) {
                    AbstractC0503h.m978P("清空失败");
                    return;
                }
                C0716t c0716t = (C0716t) obj;
                C0985g c0985g = (C0985g) c0716t.f2418b;
                if (c0985g == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                C0131s c0131s = C0131s.f426a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0985g.f2596b;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(c0131s);
                C0985g c0985g2 = (C0985g) c0716t.f2418b;
                if (c0985g2 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                c0985g2.notifyDataSetChanged();
                c0716t.m1363n();
                AbstractC0503h.m978P("已清空");
                return;
        }
    }
}
