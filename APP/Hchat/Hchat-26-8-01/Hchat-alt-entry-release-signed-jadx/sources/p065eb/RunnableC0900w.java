package p065eb;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;
import java.io.File;
import p054dg.AbstractC0793l;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1157o1;
import p080fb.C1125g1;
import p080fb.C1149m1;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: eb.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0900w implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2796g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2797h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f2798i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0900w(Context context, String str, int i9) {
        this.f2796g = i9;
        this.f2798i = context;
        this.f2797h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i9 = this.f2796g;
        Object c3959f = C3967n.f12976a;
        String str = this.f2797h;
        Context context = this.f2798i;
        switch (i9) {
            case 0:
                ScriptPluginRuntime.reloadPluginAsync$lambda$0(context, str);
                break;
            case 1:
                ScriptPluginRuntime.schedulePluginReload$lambda$0(str, context);
                break;
            case 2:
                ScriptPluginRuntime.reloadPluginFromFileChange$lambda$0(context, str);
                break;
            case 3:
                AbstractC1157o1.f3844d = str;
                if (AbstractC1157o1.f3843c) {
                    AbstractC1157o1.m2978a(str);
                    break;
                } else if (AbstractC1157o1.f3842b == null) {
                    AbstractC1157o1.f3842b = new TextToSpeech(context.getApplicationContext(), new C1149m1());
                    break;
                }
                break;
            case 4:
                Toast.makeText(context, str, 0).show();
                break;
            case 5:
                Toast.makeText(context, str.concat("已完成，但会话保存失败"), 1).show();
                break;
            case 6:
                try {
                    C1125g1 c1125g1 = C1125g1.f3676a;
                    context.getClass();
                    str.getClass();
                    C1125g1.m2861e(context, str);
                    AbstractC0793l.m2022b0(new File(C1125g1.m2858a(context), C1125g1.m2869m(str)));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:ScriptAgent] 清理空会话失败: ", str, thM8182b);
                }
                break;
            case 7:
                try {
                    Toast.makeText(context, str, 0).show();
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:KeywordNotification] Toast失败: ", thM8182b2.getMessage(), thM8182b2);
                }
                break;
            default:
                Toast.makeText(context, str, 0).show();
                break;
        }
    }

    public /* synthetic */ RunnableC0900w(String str, Context context, int i9) {
        this.f2796g = i9;
        this.f2797h = str;
        this.f2798i = context;
    }
}
