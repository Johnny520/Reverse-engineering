package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p063e9.C0846q;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.li */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5079li implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18745g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f18746h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f18747i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f18748j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18749k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5079li(Context context, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a1) {
        this.f18746h = context;
        this.f18747i = sharedPreferences;
        this.f18748j = str;
        this.f18749k = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18745g) {
            case 0:
                final Context context = this.f18746h;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    Toast.makeText(context, "当前页面无法打开铃声选择器", 0).show();
                } else {
                    C5417vq c5417vq = C5417vq.f21502a;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f18749k;
                    String str = (String) interfaceC1809a1.getValue();
                    final int i9 = 1;
                    final SharedPreferences sharedPreferences = this.f18747i;
                    final String str2 = this.f18748j;
                    c5417vq.m9756d(activity, str, new InterfaceC1231l() { // from class: wb.oi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj) {
                            int i10 = i9;
                            C3967n c3967n = C3967n.f12976a;
                            InterfaceC1809a1 interfaceC1809a12 = interfaceC1809a1;
                            String str3 = str2;
                            SharedPreferences sharedPreferences2 = sharedPreferences;
                            Context context2 = context;
                            String str4 = (String) obj;
                            switch (i10) {
                                case 0:
                                    str4.getClass();
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    interfaceC1809a12.setValue(C0846q.m2123h(context2, str4));
                                    sharedPreferences2.edit().putString(str3, (String) interfaceC1809a12.getValue()).apply();
                                    Toast.makeText(context2, "铃声已保存", 0).show();
                                    break;
                                default:
                                    str4.getClass();
                                    AtomicBoolean atomicBoolean2 = C0846q.f2580a;
                                    interfaceC1809a12.setValue(C0846q.m2123h(context2, str4));
                                    sharedPreferences2.edit().putString(str3, (String) interfaceC1809a12.getValue()).apply();
                                    Toast.makeText(context2, "铃声已保存", 0).show();
                                    break;
                            }
                            return c3967n;
                        }
                    });
                }
                break;
            case 1:
                final Context context2 = this.f18746h;
                Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity2 == null) {
                    Toast.makeText(context2, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C5417vq c5417vq2 = C5417vq.f21502a;
                    final int i10 = 0;
                    final SharedPreferences sharedPreferences2 = this.f18747i;
                    final String str3 = this.f18748j;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f18749k;
                    c5417vq2.m9755c(activity2, new InterfaceC1231l() { // from class: wb.oi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj) {
                            int i102 = i10;
                            C3967n c3967n = C3967n.f12976a;
                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a12;
                            String str32 = str3;
                            SharedPreferences sharedPreferences22 = sharedPreferences2;
                            Context context22 = context2;
                            String str4 = (String) obj;
                            switch (i102) {
                                case 0:
                                    str4.getClass();
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    interfaceC1809a122.setValue(C0846q.m2123h(context22, str4));
                                    sharedPreferences22.edit().putString(str32, (String) interfaceC1809a122.getValue()).apply();
                                    Toast.makeText(context22, "铃声已保存", 0).show();
                                    break;
                                default:
                                    str4.getClass();
                                    AtomicBoolean atomicBoolean2 = C0846q.f2580a;
                                    interfaceC1809a122.setValue(C0846q.m2123h(context22, str4));
                                    sharedPreferences22.edit().putString(str32, (String) interfaceC1809a122.getValue()).apply();
                                    Toast.makeText(context22, "铃声已保存", 0).show();
                                    break;
                            }
                            return c3967n;
                        }
                    });
                }
                break;
            default:
                this.f18749k.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f18747i.edit().putString(this.f18748j, HttpUrl.FRAGMENT_ENCODE_SET).apply();
                Toast.makeText(this.f18746h, "铃声已清空", 0).show();
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5079li(Context context, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str) {
        this.f18746h = context;
        this.f18749k = interfaceC1809a1;
        this.f18747i = sharedPreferences;
        this.f18748j = str;
    }

    public /* synthetic */ C5079li(SharedPreferences sharedPreferences, String str, Context context, InterfaceC1809a1 interfaceC1809a1) {
        this.f18747i = sharedPreferences;
        this.f18748j = str;
        this.f18746h = context;
        this.f18749k = interfaceC1809a1;
    }
}
