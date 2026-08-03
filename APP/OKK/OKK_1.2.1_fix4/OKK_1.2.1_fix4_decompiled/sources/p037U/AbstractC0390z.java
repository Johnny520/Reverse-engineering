package p037U;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p018J0.C0234d;

/* JADX INFO: renamed from: U.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0390z {

    /* JADX INFO: renamed from: a */
    public C0386v f876a;

    /* JADX INFO: renamed from: b */
    public ArrayList f877b;

    /* JADX INFO: renamed from: c */
    public long f878c;

    /* JADX INFO: renamed from: d */
    public long f879d;

    /* JADX INFO: renamed from: e */
    public long f880e;

    /* JADX INFO: renamed from: f */
    public long f881f;

    /* JADX INFO: renamed from: a */
    public void m979a(AbstractC0355O abstractC0355O) {
        m980b(abstractC0355O);
    }

    /* JADX INFO: renamed from: b */
    public final void m980b(AbstractC0355O abstractC0355O) {
        C0386v c0386v = this.f876a;
        if (c0386v != null) {
            boolean z2 = true;
            abstractC0355O.m848n(true);
            abstractC0355O.getClass();
            abstractC0355O.getClass();
            if ((abstractC0355O.f711b & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0386v.f875a;
            recyclerView.m1310I();
            C0234d c0234d = recyclerView.f1568d;
            C0386v c0386v2 = (C0386v) c0234d.f474b;
            RecyclerView recyclerView2 = c0386v2.f875a;
            abstractC0355O.getClass();
            int iIndexOfChild = recyclerView2.indexOfChild(null);
            if (iIndexOfChild == -1) {
                c0234d.m660x(null);
            } else {
                C0366b c0366b = (C0366b) c0234d.f475c;
                if (c0366b.m940d(iIndexOfChild)) {
                    c0366b.m942f(iIndexOfChild);
                    c0234d.m660x(null);
                    c0386v2.m977a(iIndexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(null);
                C0349I c0349i = recyclerView.f1562a;
                c0349i.m830j(abstractC0355OM1301u);
                c0349i.m827g(abstractC0355OM1301u);
            }
            recyclerView.m1311J(!z2);
            if (z2 || !abstractC0355O.m845k()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo946c(AbstractC0355O abstractC0355O);

    /* JADX INFO: renamed from: d */
    public abstract void mo947d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo948e();
}
