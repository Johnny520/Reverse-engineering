package p004C;

import android.animation.Animator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.InterfaceC0395j;
import androidx.emoji2.text.ThreadFactoryC0386a;
import androidx.fragment.app.C0420K;
import androidx.fragment.app.C0437o;
import androidx.lifecycle.AbstractC0460L;
import androidx.lifecycle.C0457I;
import androidx.lifecycle.InterfaceC0463O;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.RunnableC0045r;
import p006D.AbstractC0079h;
import p007D0.C0094b;
import p007D0.C0095c;
import p014H.C0142a;
import p014H.C0143b;
import p014H.C0149h;
import p014H.C0151j;
import p018J.C0158c;
import p018J.C0159d;
import p022L.InterfaceC0176f;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p041V.AbstractC0328u;
import p041V.InterfaceC0323p;
import p045Y.AbstractC0357c;
import p068h.C0587f;
import p068h.C0596o;
import p068h.InterfaceC0592k;
import p068h.InterfaceC0606y;
import p068h.MenuC0594m;
import p068h.RunnableC0586e;
import p068h.SubMenuC0581F;
import p068h.ViewOnKeyListenerC0588g;
import p069i.C0689k;
import p069i.InterfaceC0621G0;
import p069i.InterfaceC0698n;
import p074k0.AbstractC0742b;
import p074k0.ExecutorC0741a;
import p091u.InterfaceC1012b;
import p094v0.DialogC1029d;
import p099y.AbstractC1066c;
import p099y.C1074g;
import p099y.InterfaceC1068d;
import p099y.InterfaceC1072f;
import p100y0.InterfaceC1099e;

/* JADX INFO: renamed from: C.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0066j implements InterfaceC0463O, InterfaceC0176f, InterfaceC0323p, InterfaceC0395j, InterfaceC1012b, InterfaceC0621G0, InterfaceC0606y, InterfaceC0592k, InterfaceC0698n, InterfaceC1099e, InterfaceC1068d, InterfaceC1072f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f311b;

    /* JADX INFO: renamed from: c */
    public Object f312c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.m.run():void, A0.r.run():void, r.f.a(android.content.Context, q.e, android.content.res.Resources, int, java.lang.String, int, int, i.W):android.graphics.Typeface] */
    public /* synthetic */ C0066j(int i2) {
        this.f311b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: a */
    public void mo131a(Bundle bundle) {
        ((ContentInfo.Builder) this.f312c).setExtras(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: b */
    public void mo132b(MenuC0594m menuC0594m, boolean z2) {
        if (menuC0594m instanceof SubMenuC0581F) {
            ((SubMenuC0581F) menuC0594m).f1962z.mo1164k().m1184c(false);
        }
        InterfaceC0606y interfaceC0606y = ((C0689k) this.f312c).f2306f;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo132b(menuC0594m, z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: c */
    public void mo133c(Uri uri) {
        ((ContentInfo.Builder) this.f312c).setLinkUri(uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: d */
    public int mo134d() {
        return ((ContentInfo) this.f312c).getSource();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: g */
    public boolean mo136g(MenuC0594m menuC0594m, MenuItem menuItem) {
        InterfaceC0698n interfaceC0698n = ((ActionMenuView) this.f312c).f1011z;
        if (interfaceC0698n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C0066j) interfaceC0698n).f312c).f1076H.f444c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: h */
    public AbstractC0460L mo137h(Class cls, C0158c c0158c) {
        C0457I c0457i = null;
        for (C0159d c0159d : (C0159d[]) this.f312c) {
            if (c0159d.f471a.equals(cls)) {
                c0457i = new C0457I();
            }
        }
        if (c0457i != null) {
            return c0457i;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: i */
    public ClipData mo138i() {
        return ((ContentInfo) this.f312c).getClip();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100y0.InterfaceC1099e
    /* JADX INFO: renamed from: j */
    public void mo139j(String str) {
        DialogC1029d dialogC1029d = (DialogC1029d) this.f312c;
        String str2 = dialogC1029d.f3643f;
        if ((str2 != null && !AbstractC0307q.m534d0(str2)) || str == null || AbstractC0307q.m534d0(str)) {
            return;
        }
        dialogC1029d.setTitle(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: k */
    public C1074g mo140k() {
        return new C1074g(new C0066j(((ContentInfo.Builder) this.f312c).build()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p022L.InterfaceC0176f
    /* JADX INFO: renamed from: l */
    public void mo141l(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f312c).setResultCode(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: m */
    public boolean mo142m(MenuC0594m menuC0594m) {
        C0689k c0689k = (C0689k) this.f312c;
        if (menuC0594m == c0689k.f2304d) {
            return false;
        }
        ((SubMenuC0581F) menuC0594m).f1961A.getClass();
        c0689k.getClass();
        InterfaceC0606y interfaceC0606y = c0689k.f2306f;
        if (interfaceC0606y != null) {
            return interfaceC0606y.mo142m(menuC0594m);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.InterfaceC0323p
    /* JADX INFO: renamed from: n */
    public Object mo143n() {
        switch (this.f311b) {
            case 7:
                Class cls = (Class) this.f312c;
                try {
                    return AbstractC0328u.f731a.mo560a(cls);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                }
            default:
                Constructor constructor = (Constructor) this.f312c;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e3) {
                    AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                } catch (InstantiationException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0357c.m613b(constructor) + "' with no args", e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0357c.m613b(constructor) + "' with no args", e5.getCause());
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091u.InterfaceC1012b
    /* JADX INFO: renamed from: o */
    public void mo125o() {
        switch (this.f311b) {
            case 10:
                ((Animator) this.f312c).end();
                break;
            default:
                ((C0420K) this.f312c).m809a();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: p */
    public int mo144p() {
        return ((ContentInfo) this.f312c).getFlags();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.emoji2.text.InterfaceC0395j
    /* JADX INFO: renamed from: q */
    public void mo145q(AbstractC0079h abstractC0079h) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0386a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0045r(this, abstractC0079h, threadPoolExecutor, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p022L.InterfaceC0176f
    /* JADX INFO: renamed from: r */
    public void mo146r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0621G0
    /* JADX INFO: renamed from: s */
    public void mo147s(MenuC0594m menuC0594m, C0596o c0596o) {
        ViewOnKeyListenerC0588g viewOnKeyListenerC0588g = (ViewOnKeyListenerC0588g) this.f312c;
        viewOnKeyListenerC0588g.f1995g.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0588g.f1997i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0594m == ((C0587f) arrayList.get(i2)).f1988b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0588g.f1995g.postAtTime(new RunnableC0586e(this, i3 < arrayList.size() ? (C0587f) arrayList.get(i3) : null, c0596o, menuC0594m), menuC0594m, SystemClock.uptimeMillis() + 200);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: t */
    public ContentInfo mo148t() {
        return (ContentInfo) this.f312c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f311b) {
            case 24:
                return "ContentInfoCompat{" + ((ContentInfo) this.f312c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0621G0
    /* JADX INFO: renamed from: u */
    public void mo149u(MenuC0594m menuC0594m, C0596o c0596o) {
        ((ViewOnKeyListenerC0588g) this.f312c).f1995g.removeCallbacksAndMessages(menuC0594m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: v */
    public void mo150v(int i2) {
        ((ContentInfo.Builder) this.f312c).setFlags(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public C0095c m151w() {
        InputStream inputStream;
        OutputStream outputStream;
        C0094b c0094b = (C0094b) this.f312c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0095c c0095c = new C0095c();
        c0095c.f377a = -1;
        c0095c.f378b = linkedHashMap;
        c0095c.f379c = new byte[0];
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream2 = null;
        c0095c.f380d = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(c0094b.f371a).openConnection();
                AbstractC0223g.m416c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection2.setRequestMethod(c0094b.f372b);
                    httpURLConnection2.setConnectTimeout(c0094b.f375e);
                    httpURLConnection2.setReadTimeout(c0094b.f376f);
                    for (Map.Entry entry : c0094b.f373c.entrySet()) {
                        httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    byte[] bArr = c0094b.f374d;
                    if (bArr != null) {
                        httpURLConnection2.setDoOutput(true);
                        outputStream = httpURLConnection2.getOutputStream();
                        try {
                            outputStream.write(bArr);
                            outputStream.flush();
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            httpURLConnection = httpURLConnection2;
                            try {
                                c0095c.f380d = th;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th2) {
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e2) {
                                        c0095c.f380d = e2;
                                        throw th2;
                                    }
                                }
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th2;
                            }
                        }
                    } else {
                        outputStream = null;
                    }
                    c0095c.f377a = httpURLConnection2.getResponseCode();
                    Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                    AbstractC0223g.m418e(headerFields, "<set-?>");
                    c0095c.f378b = headerFields;
                    inputStream2 = httpURLConnection2.getInputStream();
                    AbstractC0223g.m415b(inputStream2);
                    c0095c.f379c = AbstractC0079h.m171N(inputStream2);
                    httpURLConnection2.disconnect();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    inputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                    httpURLConnection = httpURLConnection2;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                outputStream = null;
            }
        } catch (Exception e3) {
            c0095c.f380d = e3;
        }
        return c0095c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void m152x() {
        ((C0437o) this.f312c).f1397g.m866J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0066j(int i2, Object obj) {
        this.f311b = i2;
        this.f312c = obj;
    }

    public C0066j() {
        this.f311b = 20;
        Executors.newSingleThreadExecutor();
        ExecutorC0741a executorC0741a = new ExecutorC0741a();
        executorC0741a.f2505a = new Handler(Looper.getMainLooper());
        this.f312c = executorC0741a;
        Executors.newSingleThreadExecutor();
        new ThreadPoolExecutor(AbstractC0742b.f2506a, AbstractC0742b.f2507b, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), AbstractC0742b.f2508c);
    }

    public C0066j(C0159d[] c0159dArr) {
        this.f311b = 5;
        AbstractC0223g.m418e(c0159dArr, "initializers");
        this.f312c = c0159dArr;
    }

    public C0066j(TextView textView) {
        this.f311b = 4;
        this.f312c = new C0149h(textView);
    }

    public C0066j(EditText editText) {
        this.f311b = 3;
        C0142a c0142a = new C0142a();
        c0142a.f443b = editText;
        C0151j c0151j = new C0151j(editText);
        c0142a.f444c = c0151j;
        editText.addTextChangedListener(c0151j);
        if (C0143b.f446b == null) {
            synchronized (C0143b.f445a) {
                try {
                    if (C0143b.f446b == null) {
                        C0143b c0143b = new C0143b();
                        try {
                            C0143b.f447c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0143b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0143b.f446b = c0143b;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0143b.f446b);
        this.f312c = c0142a;
    }

    public C0066j(Context context) {
        this.f311b = 9;
        this.f312c = context.getApplicationContext();
    }

    public C0066j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f311b = 0;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f312c = new C0063g(uri, clipDescription, uri2);
            return;
        }
        C0064h c0064h = new C0064h();
        c0064h.f308b = uri;
        c0064h.f310d = clipDescription;
        c0064h.f309c = uri2;
        this.f312c = c0064h;
    }

    public C0066j(ContentInfo contentInfo) {
        this.f311b = 24;
        contentInfo.getClass();
        this.f312c = AbstractC1066c.m2333e(contentInfo);
    }

    public C0066j(ClipData clipData, int i2) {
        this.f311b = 23;
        this.f312c = AbstractC1066c.m2331c(clipData, i2);
    }

    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: f */
    public void mo135f(MenuC0594m menuC0594m) {
    }
}
