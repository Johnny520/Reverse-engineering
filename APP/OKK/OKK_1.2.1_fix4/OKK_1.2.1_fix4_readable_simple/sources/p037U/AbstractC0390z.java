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
    public void m979a(AbstractC0355O r1) {
        m980b(r1);
    }

    /* JADX INFO: renamed from: b */
    public final void m980b(AbstractC0355O r10) {
        C0386v r02 = this.f876a;
        if (r02 == null) goto L22;
        boolean r1 = true;
        r10.m848n(true);
        r10.getClass();
        r10.getClass();
        if ((r10.f711b & 16) != 0) goto L25;
        RecyclerView r03 = r02.f875a;
        r03.m1310I();
        C0234d r2 = r03.f1568d;
        C0386v r3 = (C0386v) r2.f474b;
        RecyclerView r4 = r3.f875a;
        r10.getClass();
        int r42 = r4.indexOfChild(null);
        if (r42 != (-1)) goto L10;
        r2.m660x(null);
    L14:
        if (r1 == false) goto L16;
        AbstractC0355O r22 = RecyclerView.m1301u(null);
        C0349I r32 = r03.f1562a;
        r32.m830j(r22);
        r32.m827g(r22);
    L16:
        r03.m1311J(!r1);
        if (r1 == false) goto L19;
        return;
    L19:
        if (r10.m845k() == false) goto L24;
        r03.removeDetachedView(null, false);
        return;
    L24:
        return;
    L10:
        C0366b r6 = (C0366b) r2.f475c;
        if (r6.m940d(r42) == false) goto L13;
        r6.m942f(r42);
        r2.m660x(null);
        r3.m977a(r42);
        goto L14
    L13:
        r1 = false;
        goto L14
    L25:
        return;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo946c(AbstractC0355O r1);

    /* JADX INFO: renamed from: d */
    public abstract void mo947d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo948e();
}
