package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import ca.RunnableC0537x;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.id */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4977id implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17869g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f17870h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f17871i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17872j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17873k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17874l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4977id(int i9, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f17869g = i9;
        this.f17870h = context;
        this.f17871i = sharedPreferences;
        this.f17872j = interfaceC1809a1;
        this.f17873k = interfaceC1809a12;
        this.f17874l = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object c3959f;
        switch (this.f17869g) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC0537x(this.f17870h, this.f17871i, this.f17872j, this.f17873k, this.f17874l, 14));
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = this.f17872j;
                boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                Context context = this.f17870h;
                InterfaceC1809a1 interfaceC1809a12 = this.f17873k;
                if (zBooleanValue) {
                    String str = (String) interfaceC1809a12.getValue();
                    str.getClass();
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        int iM6719r0 = AbstractC3149m.m6719r0(str, "${sendText}", i9, false, 4);
                        if (iM6719r0 >= 0) {
                            i10++;
                            i9 = iM6719r0 + 11;
                        } else if (i10 != 1) {
                            Toast.makeText(context, "文本格式必须且只能包含一个原消息变量", 0).show();
                        } else {
                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                            InterfaceC1809a1 interfaceC1809a13 = this.f17874l;
                            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (zBooleanValue2) {
                                String str3 = (String) interfaceC1809a13.getValue();
                                try {
                                    if (str3 == null) {
                                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    String string = AbstractC3149m.m6703R0(str3).toString();
                                    if (AbstractC3149m.m6721t0(string)) {
                                        string = "HH:mm:ss";
                                    }
                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                if (c3959f instanceof C3959f) {
                                    Toast.makeText(context, "时间格式无效", 0).show();
                                } else {
                                    String str4 = (String) interfaceC1809a12.getValue();
                                    if (str4 == null) {
                                        str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    interfaceC1809a12.setValue(AbstractC3149m.m6721t0(str4) ? "${sendText}" : str4);
                                    String str5 = (String) interfaceC1809a13.getValue();
                                    if (str5 != null) {
                                        str2 = str5;
                                    }
                                    String string2 = AbstractC3149m.m6703R0(str2).toString();
                                    interfaceC1809a13.setValue(AbstractC3149m.m6721t0(string2) ? "HH:mm:ss" : string2);
                                    this.f17871i.edit().putBoolean("message_affix_enable", ((Boolean) interfaceC1809a1.getValue()).booleanValue()).putString("message_affix_text_format", (String) interfaceC1809a12.getValue()).putString("message_affix_time_format", (String) interfaceC1809a13.getValue()).apply();
                                    Toast.makeText(context, "设置已保存", 0).show();
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}
