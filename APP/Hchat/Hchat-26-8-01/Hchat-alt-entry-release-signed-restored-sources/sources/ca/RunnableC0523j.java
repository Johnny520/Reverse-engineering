package ca;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import bsh.Interpreter;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import okhttp3.WebSocket;
import okio.ByteString;
import org.json.JSONException;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p109hb.C1684i0;
import p109hb.C1701x;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p126ia.RunnableC2018l;
import p136j8.C2105p;
import p136j8.C2114y;
import p230p8.C3351d0;
import p230p8.C3370v;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.C5518yt;
import p332wb.InterfaceC5059kv;
import p345x8.C5724q;
import p345x8.C5727t;
import tf.C4173t;

/* JADX INFO: renamed from: ca.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0523j implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1614g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1615h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1616i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1617j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1618k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1619l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1620m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1621n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0523j(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Context context, String str, WebSocket webSocket, String str2, C5727t c5727t) {
        this.f1614g = 7;
        this.f1615h = atomicBoolean;
        this.f1616i = atomicBoolean2;
        this.f1619l = context;
        this.f1620m = str;
        this.f1617j = webSocket;
        this.f1618k = str2;
        this.f1621n = c5727t;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[MOVE_EXCEPTION, INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException, IOException {
        Object c3959f;
        View decorView;
        Object c3959f2;
        C2114y c2114y;
        Object c3959f3;
        Object c3959f4;
        int i9 = this.f1614g;
        boolean z9 = false;
        Object obj = this.f1620m;
        Object obj2 = this.f1619l;
        Object obj3 = this.f1621n;
        Object obj4 = this.f1618k;
        Object obj5 = this.f1617j;
        Object obj6 = this.f1616i;
        Object obj7 = this.f1615h;
        switch (i9) {
            case 0:
                C0517e0 c0517e0 = (C0517e0) obj2;
                C3370v c3370v = (C3370v) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj7;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj6;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) obj5;
                Activity activity = (Activity) obj4;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj3;
                try {
                    c3959f = c0517e0.f1580b.m7135q(c3370v, atomicBoolean);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                c0517e0.f1582d.post(new RunnableC0527n(atomicBoolean, atomicBoolean2, interfaceC5059kv, activity, c3959f, interfaceC1231l, c0517e0, c3370v, 0));
                return;
            case 1:
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) obj7;
                AtomicBoolean atomicBoolean4 = (AtomicBoolean) obj6;
                InterfaceC5059kv interfaceC5059kv2 = (InterfaceC5059kv) obj5;
                Activity activity2 = (Activity) obj4;
                C0525l c0525l = (C0525l) obj3;
                C0517e0 c0517e02 = (C0517e0) obj2;
                if (atomicBoolean3.get()) {
                    return;
                }
                atomicBoolean4.set(true);
                interfaceC5059kv2.close();
                Window window = activity2.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.postOnAnimation(new RunnableC0537x(atomicBoolean3, activity2, this.f1620m, c0525l, c0517e02, 0));
                return;
            case 2:
                ScriptPluginRuntime.prepareSnsPostMedia$lambda$0((C3351d0) obj2, (String) obj, (AtomicBoolean) obj7, (String) obj6, (Interpreter) obj5, (String) obj4, (Consumer) obj3);
                return;
            case 3:
                AtomicBoolean atomicBoolean5 = (AtomicBoolean) obj7;
                AtomicBoolean atomicBoolean6 = (AtomicBoolean) obj6;
                InterfaceC5059kv interfaceC5059kv3 = (InterfaceC5059kv) obj5;
                Activity activity3 = (Activity) obj4;
                C1701x c1701x = (C1701x) obj;
                C1684i0 c1684i0 = (C1684i0) obj3;
                if (atomicBoolean5.get()) {
                    return;
                }
                atomicBoolean6.set(true);
                interfaceC5059kv3.close();
                Window window2 = activity3.getWindow();
                View decorView2 = window2 != null ? window2.getDecorView() : null;
                if (activity3.isFinishing() || activity3.isDestroyed() || decorView2 == null) {
                    return;
                }
                decorView2.postOnAnimation(new RunnableC0537x(atomicBoolean5, activity3, this.f1619l, c1701x, c1684i0, 6));
                return;
            case 4:
                Handler handler = (Handler) obj2;
                String str = (String) obj;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj5;
                Context context = (Context) obj4;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                try {
                    C2105p c2105pMedia = WeChatApis.media();
                    if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null && c2114y.m5324t(str, str2)) {
                        z9 = true;
                    }
                    c3959f2 = Boolean.valueOf(z9);
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Object obj8 = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj8;
                }
                handler.post(new RunnableC2018l(((Boolean) c3959f2).booleanValue(), str3, interfaceC1809a1, context, interfaceC1809a12, 2));
                return;
            case 5:
                C5518yt c5518yt = (C5518yt) obj2;
                List list = (List) obj;
                Context context2 = (Context) obj7;
                Serializable serializable = (Serializable) obj6;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj3;
                String str4 = (String) obj5;
                List list2 = (List) obj4;
                C1845j1 c1845j1 = c5518yt.f22274d;
                C1845j1 c1845j12 = c5518yt.f22257A;
                if (c1845j1.getValue() != list) {
                    c1845j12.setValue(Boolean.FALSE);
                    Toast.makeText(context2, "会话内容已变化，请重试", 0).show();
                    return;
                }
                Throwable thM8182b = C3960g.m8182b(serializable);
                if (thM8182b != null) {
                    c1845j12.setValue(Boolean.FALSE);
                    AbstractC1184v0.m3204n("[Hchat:ScriptAgent] " + str4 + "重建历史失败", thM8182b);
                    Toast.makeText(context2, str4.concat("失败，请重试"), 0).show();
                    return;
                }
                String str5 = (String) serializable;
                c1845j12.setValue(Boolean.FALSE);
                try {
                    c3959f3 = (Boolean) interfaceC1231l2.invoke(str5);
                    c3959f3.getClass();
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                if (thM8182b2 != null) {
                    AbstractC1184v0.m3204n("[Hchat:ScriptAgent] " + str4 + "失败", thM8182b2);
                    Toast.makeText(context2, str4.concat("失败，请重试"), 0).show();
                }
                Boolean bool = Boolean.FALSE;
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = bool;
                }
                if (((Boolean) c3959f3).booleanValue()) {
                    new Thread(new RunnableC0537x(C5518yt.m9924N(c5518yt), c5518yt.f22271a, context2, list2, str4, 19), "Hchat-Agent-History-Save").start();
                    return;
                }
                return;
            case 6:
                Context context3 = (Context) obj;
                C5518yt c5518yt2 = (C5518yt) obj7;
                List list3 = (List) obj6;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj3;
                String str6 = (String) obj5;
                List list4 = (List) obj4;
                try {
                    c3959f4 = AbstractC3754e0.m7889f0(context3, (List) obj2);
                } catch (Throwable th5) {
                    c3959f4 = new C3959f(th5);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0523j(c5518yt2, list3, context3, c3959f4, interfaceC1231l3, str6, list4, 5));
                return;
            default:
                AtomicBoolean atomicBoolean7 = (AtomicBoolean) obj6;
                Context context4 = (Context) obj2;
                String str7 = (String) obj;
                WebSocket webSocket = (WebSocket) obj5;
                String str8 = (String) obj4;
                C5727t c5727t = (C5727t) obj3;
                ExecutorService executorService = C5724q.f23297a;
                if (((AtomicBoolean) obj7).get() || atomicBoolean7.get()) {
                    return;
                }
                List<byte[]> listM10364j = C4173t.f13710g;
                File file = new File(context4.getCacheDir(), "hchat_xiaozhi_question");
                file.mkdirs();
                File fileCreateTempFile = File.createTempFile("question_", ".wav", file);
                try {
                    Context applicationContext = context4.getApplicationContext();
                    applicationContext.getClass();
                    fileCreateTempFile.getClass();
                    if (C5724q.m10345Q(applicationContext, str7, fileCreateTempFile)) {
                        byte[] bArrM10347S = C5724q.m10347S(fileCreateTempFile);
                        if (bArrM10347S.length == 0) {
                            AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智AI输入PCM为空: wavLen=" + fileCreateTempFile.length() + " questionLen=" + str7.length());
                        } else {
                            listM10364j = C5724q.m10364j(bArrM10347S);
                        }
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智AI文本转WAV失败: questionLen=" + str7.length());
                    }
                    break;
                } finally {
                    try {
                    } finally {
                        try {
                            fileCreateTempFile.delete();
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    break;
                }
                try {
                    break;
                } catch (Throwable unused2) {
                }
                if (listM10364j.isEmpty()) {
                    AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智AI长文本输入音频为空: questionLen=" + str7.length());
                    return;
                }
                String string = C5724q.m10353Y(str8, "start", c5727t).toString();
                string.getClass();
                webSocket.send(string);
                for (byte[] bArr : listM10364j) {
                    webSocket.send(ByteString.Companion.m6810of(Arrays.copyOf(bArr, bArr.length)));
                }
                String string2 = C5724q.m10353Y(str8, "stop", c5727t).toString();
                string2.getClass();
                webSocket.send(string2);
                return;
        }
    }

    public /* synthetic */ RunnableC0523j(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1231l interfaceC1231l, String str, List list, int i9) {
        this.f1614g = i9;
        this.f1619l = obj;
        this.f1620m = obj2;
        this.f1615h = obj3;
        this.f1616i = obj4;
        this.f1621n = interfaceC1231l;
        this.f1617j = str;
        this.f1618k = list;
    }

    public /* synthetic */ RunnableC0523j(Object obj, Object obj2, Serializable serializable, Serializable serializable2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1614g = i9;
        this.f1619l = obj;
        this.f1620m = obj2;
        this.f1615h = serializable;
        this.f1616i = serializable2;
        this.f1617j = obj3;
        this.f1618k = obj4;
        this.f1621n = obj5;
    }

    public /* synthetic */ RunnableC0523j(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, InterfaceC5059kv interfaceC5059kv, Activity activity, Object obj, C0525l c0525l, C0517e0 c0517e0) {
        this.f1614g = 1;
        this.f1615h = atomicBoolean;
        this.f1616i = atomicBoolean2;
        this.f1617j = interfaceC5059kv;
        this.f1618k = activity;
        this.f1620m = obj;
        this.f1621n = c0525l;
        this.f1619l = c0517e0;
    }

    public /* synthetic */ RunnableC0523j(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, InterfaceC5059kv interfaceC5059kv, Activity activity, Object obj, C1701x c1701x, C1684i0 c1684i0) {
        this.f1614g = 3;
        this.f1615h = atomicBoolean;
        this.f1616i = atomicBoolean2;
        this.f1617j = interfaceC5059kv;
        this.f1618k = activity;
        this.f1619l = obj;
        this.f1620m = c1701x;
        this.f1621n = c1684i0;
    }
}
