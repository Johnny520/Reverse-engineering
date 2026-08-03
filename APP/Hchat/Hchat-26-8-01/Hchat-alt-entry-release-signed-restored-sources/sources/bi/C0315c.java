package bi;

import af.C0081d;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import ca.C0517e0;
import ci.AbstractC0613y;
import ci.C0614z;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p036c9.C0419b0;
import p040d0.AbstractC0649f;
import p049d9.C0752m;
import p080fb.C1130h2;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p100h0.AbstractC1524i;
import p100h0.AbstractC1539n0;
import p117i0.AbstractC1855m;
import p117i0.C1858m2;
import p117i0.C1883u;
import p119i2.C1941n0;
import p144k.AbstractC2217v0;
import p144k.C2166e0;
import p144k.C2179i1;
import p177m2.C2767k;
import p249qg.AbstractC3553c0;
import p276sf.C3967n;
import p322w0.C4665p;
import p343x6.AbstractC5700d;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;

/* JADX INFO: renamed from: bi.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0315c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f943g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ac.l.run():void, b0.t.invoke(java.lang.Object, java.lang.Object):java.lang.Object, c9.u.invoke(java.lang.Object):java.lang.Object, ca.r.run():void, h.Hchat.hooks.items.script.ScriptPluginBridge.showModuleChoiceDialog$lambda$1(java.lang.String, java.lang.String, java.util.List, java.lang.String, h.Hchat.hooks.items.script.ScriptPluginBridge, java.util.function.Consumer, android.app.Activity):sf.n, h.Hchat.hooks.items.script.ScriptPluginBridge.showModuleConfirmDialog$lambda$0(java.lang.String, java.lang.String, java.lang.String, h.Hchat.hooks.items.script.ScriptPluginBridge, java.util.function.Consumer, android.app.Activity):sf.n, h.Hchat.hooks.items.script.ScriptPluginBridge.showModuleDialog$lambda$0(java.lang.String, java.lang.String, java.lang.String, android.app.Activity):sf.n, h.Hchat.hooks.items.script.ScriptPluginBridge.showModuleInputDialog$lambda$0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, h.Hchat.hooks.items.script.ScriptPluginBridge, java.util.function.Consumer, android.app.Activity):sf.n, h.Hchat.hooks.items.script.ScriptPluginBridge.showModuleMultiChoiceDialog$lambda$3(java.lang.String, java.lang.String, java.util.List, java.util.Set, java.lang.String, h.Hchat.hooks.items.script.ScriptPluginBridge, java.util.function.Consumer, android.app.Activity):sf.n, h.Hchat.hooks.items.script.ScriptWaBridge.<init>(h.Hchat.hooks.items.script.ScriptPluginBridge):void, h0.r.<clinit>():void, i0.u.<init>(fg.l):void] */
    public /* synthetic */ C0315c(int i9) {
        this.f943g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int i9 = this.f943g;
        C3967n c3967n = C3967n.f12976a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (i9) {
            case 0:
                return AbstractC0316d.m1247b();
            case 1:
                C1858m2 c1858m2 = AbstractC0319g.f947a;
                return null;
            case 2:
                C1858m2 c1858m22 = AbstractC0323k.f957a;
                return Boolean.TRUE;
            case 3:
                return new C0324l(new C1941n0(0L, AbstractC5700d.m10248D(17), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(17), null, 0L, 0, AbstractC5700d.m10260R(8589934592L, 1.2f), 16646141), new C1941n0(0L, AbstractC5700d.m10248D(16), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(14), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(17), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(13), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(11), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(17), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(16), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(14), C2767k.f9002l, 0L, 0, 0L, 16777209), new C1941n0(0L, AbstractC5700d.m10248D(32), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(24), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(20), null, 0L, 0, 0L, 16777213), new C1941n0(0L, AbstractC5700d.m10248D(18), null, 0L, 0, 0L, 16777213));
            case 4:
                C1858m2 c1858m23 = AbstractC0326n.f973a;
                return null;
            case 5:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                intent.addFlags(1);
                Intent intentCreateChooser = Intent.createChooser(intent, "选择聊天分组文件");
                intentCreateChooser.getClass();
                return intentCreateChooser;
            case 6:
                Handler handler = C0419b0.f1202a;
                return c3967n;
            case 7:
                Set set = C0517e0.f1576q;
                return c3967n;
            case 8:
                return new C4665p();
            case 9:
                return new C4665p();
            case 10:
                C1858m2 c1858m24 = AbstractC0613y.f1923a;
                return null;
            case 11:
                return new C0614z();
            case 12:
                C1883u c1883u = AbstractC0649f.f2014a;
                return null;
            case 13:
                Paint paint = C0752m.f2240j;
                return c3967n;
            case 14:
                return C3967n.f12976a;
            case 15:
                return C3967n.f12976a;
            case 16:
                return C3967n.f12976a;
            case 17:
                return C3967n.f12976a;
            case 18:
                return C3967n.f12976a;
            case 19:
                return ScriptWaBridge.durationCodec_delegate$lambda$0();
            case 20:
                return new OkHttpClient.Builder().connectTimeout(20L, timeUnit).readTimeout(120L, timeUnit).writeTimeout(30L, timeUnit).build();
            case 21:
                return new OkHttpClient.Builder().connectTimeout(8L, timeUnit).readTimeout(8L, timeUnit).dns(C1130h2.f3697b).build();
            case 22:
                return new OkHttpClient.Builder().connectTimeout(15L, timeUnit).readTimeout(30L, timeUnit).dns(C1130h2.f3699d).followRedirects(true).followSslRedirects(true).build();
            case 23:
                C5808e c5808e = AbstractC3553c0.f11555a;
                return ExecutorC5807d.f23583i;
            case 24:
                C1883u c1883u2 = AbstractC1539n0.f5130a;
                return null;
            case 25:
                return AbstractC1524i.f5090a;
            case 26:
                AbstractC1855m.m4574b("Unexpected call to default provider");
                throw new C0081d();
            case 27:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 28:
                C1883u c1883u3 = AbstractC2217v0.f7345a;
                return C2166e0.f7180a;
            default:
                return new C2179i1();
        }
    }
}
