package p001A0;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Process;
import java.lang.reflect.Method;
import p022L.AbstractC0174d;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1121d;
import p102z0.C1120c;

/* JADX INFO: renamed from: A0.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0046s implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f278b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i.q1.a(i.q1, int):void] */
    public /* synthetic */ DialogInterfaceOnClickListenerC0046s(int i2) {
        this.f278b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final void m95a(DialogInterface dialogInterface, int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f278b) {
            case 0:
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable th) {
                    AbstractC0731a.m1387d("统一扫描重启失败", th);
                    return;
                }
                break;
            case 1:
                C0052y.f294d.set(false);
                break;
            case 2:
                break;
            default:
                C1120c c1120c = AbstractC1121d.f3779a;
                SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
                try {
                    Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(sharedPreferencesM350f, null);
                    break;
                } catch (Throwable unused) {
                }
                sharedPreferencesM350f.edit().putBoolean("check_app_update_on_enter", false).apply();
                break;
        }
    }
}
