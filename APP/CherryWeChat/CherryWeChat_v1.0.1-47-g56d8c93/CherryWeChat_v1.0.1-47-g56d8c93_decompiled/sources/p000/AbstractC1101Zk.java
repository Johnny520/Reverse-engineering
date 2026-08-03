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

    public AbstractC1101Zk(C1116Zz c1116Zz) {
        AbstractC0295Gu.m625r(-47828755806261L);
        this.f3491a = c1116Zz;
    }

    /* JADX INFO: renamed from: c */
    public final String m2023c() {
        C2648vx c2648vx = this.f3491a.f3523f;
        if (c2648vx == null) {
            return null;
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1173b((String) c2648vx.f9162a, (String) c2648vx.f9163b);
    }

    /* JADX INFO: renamed from: d */
    public ArrayList mo1096d(Context context) {
        AbstractC0295Gu.m625r(-47309064763445L);
        ArrayList arrayList = new ArrayList();
        C1128aA c1128aA = new C1128aA(context);
        C1116Zz c1116Zz = this.f3491a;
        c1128aA.setKey(c1116Zz.f3519b);
        c1128aA.setTitle(c1116Zz.f3521d);
        String str = c1116Zz.f3522e;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                c1128aA.setSummary(str);
            }
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        c1128aA.setChecked(AbstractC0599Nx.m1172a(c1116Zz.f3519b, c1116Zz.f3520c));
        arrayList.add(c1128aA);
        C2648vx c2648vx = c1116Zz.f3523f;
        if (c2648vx != null) {
            C2748yA c2748yA = new C2748yA(context);
            c2748yA.setTitle((String) c2648vx.f9164c);
            String str2 = (String) c2648vx.f9165d;
            if (str2 != null) {
                String str3 = str2.length() > 0 ? str2 : null;
                if (str3 != null) {
                    c2748yA.setSummary(str3);
                }
            }
            if (c1116Zz.f3524g) {
                c2748yA.m5330a();
            } else {
                c2748yA.setValue(AbstractC0599Nx.m1173b((String) c2648vx.f9162a, (String) c2648vx.f9163b));
            }
            View.OnClickListener viewOnClickListenerC2343p0 = (View.OnClickListener) c2648vx.f9166e;
            if (viewOnClickListenerC2343p0 == null) {
                viewOnClickListenerC2343p0 = new ViewOnClickListenerC2343p0(2, c2648vx);
            }
            c2748yA.setOnClickListener(viewOnClickListenerC2343p0);
            arrayList.add(c2748yA);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2024e() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        C1116Zz c1116Zz = this.f3491a;
        return AbstractC0599Nx.m1172a(c1116Zz.f3519b, c1116Zz.f3520c);
    }
}
