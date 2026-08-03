package p107h9;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import java.util.concurrent.ExecutorService;
import p085fg.InterfaceC1220a;
import p218og.AbstractC3155s;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4955ho;
import p345x8.C5724q;

/* JADX INFO: renamed from: h9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1628c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5332g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f5333h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1628c(Context context, int i9) {
        this.f5332g = i9;
        this.f5333h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        double dDoubleValue;
        Double dM6731U;
        double dDoubleValue2;
        Double dM6731U2;
        Object c3959f;
        int i9 = this.f5332g;
        Double d10 = null;
        C3967n c3967n = C3967n.f12976a;
        Context context = this.f5333h;
        switch (i9) {
            case 0:
                String string = AbstractC4302b.m8640c(context, "Hchat_fake_location_config").getString("fake_location_latitude", "31.224361");
                if (string == null || (dM6731U = AbstractC3155s.m6731U(string)) == null) {
                    dDoubleValue = Double.parseDouble("31.224361");
                } else {
                    double dDoubleValue3 = dM6731U.doubleValue();
                    if (-90.0d <= dDoubleValue3 && dDoubleValue3 <= 90.0d) {
                        d10 = dM6731U;
                    }
                    if (d10 != null) {
                        dDoubleValue = d10.doubleValue();
                    }
                }
                break;
            case 1:
                String string2 = AbstractC4302b.m8640c(context, "Hchat_fake_location_config").getString("fake_location_longitude", "121.469170");
                if (string2 == null || (dM6731U2 = AbstractC3155s.m6731U(string2)) == null) {
                    dDoubleValue2 = Double.parseDouble("121.469170");
                } else {
                    double dDoubleValue4 = dM6731U2.doubleValue();
                    if (-180.0d <= dDoubleValue4 && dDoubleValue4 <= 180.0d) {
                        d10 = dM6731U2;
                    }
                    if (d10 != null) {
                        dDoubleValue2 = d10.doubleValue();
                    }
                }
                break;
            case 2:
                AbstractC4955ho.m9690v6(context, "https://github.com/HighCapable/KavaRef");
                break;
            case 3:
                AbstractC4955ho.m9690v6(context, "https://github.com/LuckyPray/DexKit");
                break;
            case 4:
                AbstractC4955ho.m9690v6(context, "https://github.com/BillyWei01/FastKV");
                break;
            case 5:
                AbstractC4955ho.m9690v6(context, "https://github.com/Xposed-Modules-Repo/top.hookvip.wxtablet");
                break;
            case 6:
                AbstractC4955ho.m9690v6(context, "https://github.com/LSPosed/LSPosed");
                break;
            case 7:
                AbstractC4955ho.m9690v6(context, "https://github.com/compose-miuix-ui/miuix");
                break;
            case 8:
                AbstractC4955ho.m9690v6(context, "https://github.com/CopyLibs/BeanShell-Android");
                break;
            case 9:
                AbstractC4955ho.m9690v6(context, "https://github.com/YunJavaPro/Silk-Codec-Android");
                break;
            case 10:
                AbstractC4955ho.m9690v6(context, "https://t.me/Hchat_ci");
                break;
            case 11:
                AbstractC4955ho.m9690v6(context, "https://t.me/Hchat_Group");
                break;
            case 12:
                Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                intent.addFlags(268435456);
                try {
                    context.startActivity(intent);
                    c3959f = c3967n;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    Toast.makeText(context, "无法打开电池优化设置", 0).show();
                }
                break;
            case 13:
                ExecutorService executorService = C5724q.f23297a;
                C5724q.m10363i();
                Toast.makeText(context, "AI 上下文已清空", 0).show();
                break;
            default:
                ExecutorService executorService2 = C5724q.f23297a;
                C5724q.m10363i();
                Toast.makeText(context, "小智上下文已清空", 0).show();
                break;
        }
        return c3967n;
    }
}
