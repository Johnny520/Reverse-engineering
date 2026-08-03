package p000a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.pa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0765pa implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0803ra f3028b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0765pa(C0803ra c0803ra, int i) {
        this.f3027a = i;
        this.f3028b = c0803ra;
    }

    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        boolean z;
        SharedPreferences sharedPreferences;
        LinkedHashMap linkedHashMap;
        switch (this.f3027a) {
            case 0:
                this.f3028b.m1874m();
                break;
            case 1:
                C0186K3.f638a.getClass();
                try {
                    C0186K3.a.m509j().edit().remove("version_initial_snapshot").remove("version_latest_snapshot").apply();
                    break;
                } catch (Throwable unused) {
                }
                Toast.makeText(this.f3028b.f3168a, "快照已重置，点击刷新重新采集", 0).show();
                break;
            case 2:
                C0803ra c0803ra = this.f3028b;
                EditText editText = new EditText(c0803ra.f3168a);
                editText.setHint("输入朋友圈 snsId");
                editText.setTextColor(c0803ra.f3169b.f3182d);
                AlertDialog alertDialogCreate = new AlertDialog.Builder(c0803ra.f3168a).setTitle("添加要隐藏的朋友圈").setView(editText).setPositiveButton("添加", new DialogInterfaceOnClickListenerC0264O9(2, editText)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate != null) {
                    alertDialogCreate.show();
                    c0803ra.m1876o(alertDialogCreate);
                }
                break;
            case 3:
                C0637if.f2311a.getClass();
                C0186K3.f638a.getClass();
                try {
                    new File(C0601gh.m1440b(), "hotupdate_intercept_events.log").delete();
                    break;
                } catch (Throwable unused2) {
                }
                Toast.makeText(this.f3028b.f3168a, "拦截记录已清零", 0).show();
                break;
            case 4:
                this.f3028b.m1871h();
                break;
            case 5:
                C0803ra c0803ra2 = this.f3028b;
                C0186K3.f638a.getClass();
                try {
                    boolean zCommit = C0186K3.a.m509j().edit().clear().commit();
                    boolean zCommit2 = C0186K3.a.m507h().edit().clear().commit();
                    z = zCommit && zCommit2;
                    if (!z) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"clear sp data fail sp=" + zCommit + " optSp=" + zCommit2}, 1));
                    }
                } catch (Exception e) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"clear sp data fail", e}, 2));
                    z = false;
                }
                try {
                    new File(C0601gh.m1440b(), "hotupdate_intercept_events.log").delete();
                    break;
                } catch (Throwable unused3) {
                }
                try {
                    Context context = C0889w1.f3488p;
                    if (context != null && (sharedPreferences = context.getSharedPreferences("dexkit_scan_cache", 0)) != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        for (String str : sharedPreferences.getAll().keySet()) {
                            if (!C0631i9.m1478a(str, "tinker_symbols_v1")) {
                                editorEdit.remove(str);
                            }
                        }
                        editorEdit.apply();
                        ?? r11 = C0475a5.f1753a;
                        if (r11 != 0) {
                            linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : r11.entrySet()) {
                                if (C0631i9.m1478a((String) entry.getKey(), "tinker_symbols_v1")) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        C0475a5.f1753a = linkedHashMap;
                        C0908x1.m2194b("DexKitCache: clear done, keepTinkerSymbols=true");
                    }
                } catch (Throwable th) {
                    C0908x1.m2197e("DexKitCache: clear failed", th);
                }
                Context context2 = C0889w1.f3488p;
                if (context2 != null) {
                    try {
                        context2.getSharedPreferences("fc_startup_state", 0).edit().remove("startup_snapshot").apply();
                        C0908x1.m2194b("StartupSnapshot", "INVALIDATED manually");
                    } catch (Exception e2) {
                        C0908x1.m2197e("StartupSnapshot", C0944z.m2231k("invalidate failed: ", e2.getMessage()));
                    }
                }
                Context context3 = C0889w1.f3488p;
                if (context3 != null) {
                    for (String str2 : C0739o3.m1757d0("mask_wechat_config", "mask_wechat_options")) {
                        C0186K3.a aVar = C0186K3.f638a;
                        try {
                            File file = new File(context3.getDataDir(), "shared_prefs/" + str2 + ".xml");
                            if (file.exists()) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ConfigUtil: delete legacy SP " + str2 + ".xml ok=" + file.delete()}, 1));
                            }
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                    }
                }
                Context context4 = C0889w1.f3488p;
                if (context4 != null) {
                    C0186K3.a aVar2 = C0186K3.f638a;
                    try {
                        C0889w1.m2145d(context4);
                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                    } catch (Throwable th3) {
                        C0920xd.m2206a(th3);
                    }
                }
                C0186K3.f647j = null;
                C0186K3.f648k = null;
                C0186K3.f649l = null;
                C0186K3.a.m512m();
                try {
                    C0186K3.a.m509j().edit().putBoolean(C0186K3.f644g, true).apply();
                    break;
                } catch (Throwable unused4) {
                }
                AlertDialog alertDialog = c0803ra2.f3171d;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                if (z) {
                    c0803ra2.m1871h();
                } else {
                    Toast.makeText(c0803ra2.f3168a, "配置清理未完全成功，已取消重启，请重试", 1).show();
                }
                break;
            default:
                C0186K3.f638a.getClass();
                try {
                    C0186K3.a.m509j().edit().putBoolean(C0186K3.f643f, true).apply();
                    break;
                } catch (Throwable unused5) {
                }
                C0653jc c0653jcM508i = C0186K3.a.m508i();
                c0653jcM508i.f2421M = false;
                C0803ra c0803ra3 = this.f3028b;
                c0803ra3.getClass();
                C0803ra.m1863i(c0653jcM508i);
                AlertDialog alertDialog2 = c0803ra3.f3171d;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                c0803ra3.m1873l();
                break;
        }
    }
}
