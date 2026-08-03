package p056f0;

import android.app.Activity;
import android.widget.EditText;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0403f;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;
import p050c0.C0570A;
import p050c0.C0605L1;

/* JADX INFO: renamed from: f0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0845x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EditText f3052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f3053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f3054c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3055d;

    public /* synthetic */ RunnableC0845x(EditText editText, EditText editText2, Activity activity, int i2) {
        this.f3052a = editText;
        this.f3053b = editText2;
        this.f3054c = activity;
        this.f3055d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? M116u;
        String str;
        Double dM1024y0;
        Double dM1024y02;
        EditText editText = this.f3052a;
        AbstractC0307g.m703e(editText, "$latIn");
        EditText editText2 = this.f3053b;
        AbstractC0307g.m703e(editText2, "$lonIn");
        Activity activity = this.f3054c;
        AbstractC0307g.m703e(activity, "$host");
        C0605L1 c0605l1 = C0605L1.f1854a;
        File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result");
        C0139e c0139e = null;
        if (file.isFile()) {
            try {
                C0402e c0402e = new C0402e(new C0403f(AbstractC0425j.m1014S0(AbstractC0270k.m692i0(file, AbstractC0416a.f921a)), new C0570A(26)), true, new C0570A(27));
                M116u = new LinkedHashMap();
                C0401d c0401d = new C0401d(c0402e);
                while (c0401d.hasNext()) {
                    String str2 = (String) c0401d.next();
                    int iM1010O0 = AbstractC0425j.m1010O0(str2, '=', 0, false, 6);
                    String strSubstring = str2.substring(0, iM1010O0);
                    AbstractC0307g.m702d(strSubstring, "substring(...)");
                    String strSubstring2 = str2.substring(iM1010O0 + 1);
                    AbstractC0307g.m702d(strSubstring2, "substring(...)");
                    M116u.put(strSubstring, strSubstring2);
                }
            } catch (Throwable th) {
                M116u = AbstractC0040p.m116u(th);
            }
            boolean z2 = M116u instanceof C0140f;
            ?? r6 = M116u;
            if (z2) {
                r6 = 0;
            }
            Map map = (Map) r6;
            if (map != null && (str = (String) map.get("lat")) != null && (dM1024y0 = AbstractC0431p.m1024y0(str)) != null) {
                double dDoubleValue = dM1024y0.doubleValue();
                String str3 = (String) map.get("lon");
                if (str3 != null && (dM1024y02 = AbstractC0431p.m1024y0(str3)) != null) {
                    double dDoubleValue2 = dM1024y02.doubleValue();
                    if (-90.0d <= dDoubleValue && dDoubleValue <= 90.0d && -180.0d <= dDoubleValue2 && dDoubleValue2 <= 180.0d) {
                        try {
                            file.delete();
                        } catch (Throwable th2) {
                            AbstractC0040p.m116u(th2);
                        }
                        c0139e = new C0139e(dM1024y0, dM1024y02);
                    }
                }
            }
        }
        C0810V c0810v = C0810V.f2933a;
        if (c0139e == null) {
            int i2 = this.f3055d + 1;
            if (i2 > 40 || activity.isFinishing()) {
                return;
            }
            activity.getWindow().getDecorView().postDelayed(new RunnableC0845x(editText, editText2, activity, i2), 500L);
            return;
        }
        double dDoubleValue3 = ((Number) c0139e.f328a).doubleValue();
        double dDoubleValue4 = ((Number) c0139e.f329b).doubleValue();
        C0605L1 c0605l12 = C0605L1.f1854a;
        editText.setText(C0605L1.m1488c(dDoubleValue3));
        editText2.setText(C0605L1.m1488c(dDoubleValue4));
        C0605L1.m1494i(true, dDoubleValue3, dDoubleValue4, activity, false);
        C0810V.m2105z(activity, "选点成功");
    }
}
