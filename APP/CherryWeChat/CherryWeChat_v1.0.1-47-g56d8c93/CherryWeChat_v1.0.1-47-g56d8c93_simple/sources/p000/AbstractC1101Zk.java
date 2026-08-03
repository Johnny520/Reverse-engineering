package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: Zk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1101Zk extends AbstractC2700x5 {

    /* JADX INFO: renamed from: a */
    public final C1116Zz f3491a;

    public AbstractC1101Zk(C1116Zz r3) {
        AbstractC0295Gu.m625r(-47828755806261L);
        this.f3491a = r3;
    }

    /* JADX INFO: renamed from: c */
    public final String m2023c() {
        C2648vx r0 = this.f3491a.f3523f;
        if (r0 == null) goto L6;
        SharedPreferences r1 = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1173b((String) r0.f9162a, (String) r0.f9163b);
    L6:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList mo1096d(Context r7) {
        AbstractC0295Gu.m625r(-47309064763445L);
        ArrayList r0 = new ArrayList();
        C1128aA r1 = new C1128aA(r7);
        C1116Zz r2 = this.f3491a;
        r1.setKey(r2.f3519b);
        r1.setTitle(r2.f3521d);
        String r3 = r2.f3522e;
        String r4 = null;
        if (r3 != null) goto L5;
    L10:
        SharedPreferences r32 = AbstractC0599Nx.f1939a;
        r1.setChecked(AbstractC0599Nx.m1172a(r2.f3519b, r2.f3520c));
        r0.add(r1);
        C2648vx r12 = r2.f3523f;
        if (r12 == null) goto L27;
        C2748yA r33 = new C2748yA(r7);
        r33.setTitle((String) r12.f9164c);
        String r72 = (String) r12.f9165d;
        if (r72 == null) goto L20;
        if (r72.length() <= 0) goto L17;
        r4 = r72;
    L17:
        if (r4 == null) goto L20;
        r33.setSummary(r4);
    L20:
        if (r2.f3524g == false) goto L22;
        r33.m5330a();
    L23:
        View.OnClickListener r73 = (View.OnClickListener) r12.f9166e;
        if (r73 != null) goto L26;
        r73 = new ViewOnClickListenerC2343p0(2, r12);
    L26:
        r33.setOnClickListener(r73);
        r0.add(r33);
        goto L27
    L22:
        r33.setValue(AbstractC0599Nx.m1173b((String) r12.f9162a, (String) r12.f9163b));
    L27:
        return r0;
    L5:
        if (r3.length() > 0) goto L8;
        r3 = null;
    L8:
        if (r3 == null) goto L10;
        r1.setSummary(r3);
        goto L10
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2024e() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        C1116Zz r02 = this.f3491a;
        return AbstractC0599Nx.m1172a(r02.f3519b, r02.f3520c);
    }
}
