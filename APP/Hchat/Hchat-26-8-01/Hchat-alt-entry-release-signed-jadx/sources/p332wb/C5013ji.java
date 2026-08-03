package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ji */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5013ji implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18133g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f18134h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f18135i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f18136j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f18137k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18138l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5013ji(boolean z9, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f18133g = i9;
        this.f18134h = z9;
        this.f18135i = obj;
        this.f18136j = obj2;
        this.f18137k = obj3;
        this.f18138l = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object c3959f;
        View decorView;
        switch (this.f18133g) {
            case 0:
                Context context = (Context) this.f18135i;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18136j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f18137k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f18138l;
                String string = AbstractC3149m.m6703R0((String) interfaceC1809a1.getValue()).toString();
                if (AbstractC3149m.m6721t0(string)) {
                    string = "yyyy-MM-dd HH:mm:ss";
                }
                try {
                    c3959f = new SimpleDateFormat(string, Locale.getDefault()).format(new Date());
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                boolean z9 = c3959f instanceof C3959f;
                if (this.f18134h && z9) {
                    Toast.makeText(context, "时间格式无效", 0).show();
                } else {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    String str = (String) interfaceC1809a12.getValue();
                    if (AbstractC3149m.m6721t0(str)) {
                        str = "{name}撤回了上一条消息 {content}";
                    }
                    editorEdit.putString("anti_recall_notice_text", str).putString("anti_recall_notice_time_format", z9 ? "yyyy-MM-dd HH:mm:ss" : string).apply();
                    Toast.makeText(context, "设置已保存", 0).show();
                }
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f18135i;
                Integer num = (Integer) this.f18136j;
                Integer num2 = (Integer) this.f18137k;
                Integer num3 = (Integer) this.f18138l;
                if (this.f18134h) {
                    Locale locale = Locale.US;
                    num.intValue();
                    num2.intValue();
                    num3.intValue();
                    interfaceC1231l.invoke(String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{num, num2, num3}, 3)));
                }
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18135i;
                Activity activity = (Activity) this.f18136j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f18137k;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f18138l;
                if (!((Set) interfaceC1809a13.getValue()).isEmpty() || this.f18134h) {
                    Set set = (Set) interfaceC1809a13.getValue();
                    interfaceC1220a.invoke();
                    C5475xi c5475xi = new C5475xi(interfaceC1231l2, 21, set);
                    Window window = activity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.postOnAnimation(new RunnableC5421vu(activity, c5475xi));
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}
