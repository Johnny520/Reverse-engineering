package p001;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p001.AbstractC0204f;
import p001.C0384s1;

/* JADX INFO: renamed from: ۟.z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0481z7 {

    /* JADX INFO: renamed from: ۥ۠ */
    public static final a f1228 = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static volatile C0481z7 f1906 = null;

    /* JADX INFO: renamed from: ۥ */
    public final f f1229;

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<AbstractC0469y8> f1230;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Context f1907;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final C0384s1 f1908;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final InterfaceC0191e0 f1909;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final C0215fa f1910;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final WeakHashMap f1911;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final WeakHashMap f1912;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final ReferenceQueue<Object> f1913;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final Bitmap.Config f1914 = null;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f1915;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public volatile boolean f1916;

    /* JADX INFO: renamed from: ۟.z7$a */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bitmap bitmapM866;
            int i = message.what;
            if (i == 3) {
                AbstractC0204f abstractC0204f = (AbstractC0204f) message.obj;
                if (abstractC0204f.f773.f1916) {
                    abstractC0204f.f774.m958();
                    StringBuilder sb = C0259ic.f866;
                }
                abstractC0204f.f773.m976(abstractC0204f.m1061());
                return;
            }
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    RunnableC0163c0 runnableC0163c0 = (RunnableC0163c0) list.get(i2);
                    C0481z7 c0481z7 = runnableC0163c0.f717;
                    c0481z7.getClass();
                    AbstractC0204f abstractC0204f2 = runnableC0163c0.f1353;
                    ArrayList arrayList = runnableC0163c0.f1354;
                    boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (abstractC0204f2 != null || z) {
                        Uri uri = runnableC0163c0.f1349.f1842;
                        Exception exc = runnableC0163c0.f1357;
                        Bitmap bitmap = runnableC0163c0.f718;
                        e eVar = runnableC0163c0.f1356;
                        if (abstractC0204f2 != null) {
                            c0481z7.m977(bitmap, eVar, abstractC0204f2);
                        }
                        if (z) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                c0481z7.m977(bitmap, eVar, (AbstractC0204f) arrayList.get(i3));
                            }
                        }
                        c0481z7.getClass();
                    }
                }
                return;
            }
            if (i != 13) {
                StringBuilder sbM1039 = C0167c4.m1039("Unknown handler message received: ");
                sbM1039.append(message.what);
                throw new AssertionError(sbM1039.toString());
            }
            List list2 = (List) message.obj;
            int size3 = list2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0204f abstractC0204f3 = (AbstractC0204f) list2.get(i4);
                C0481z7 c0481z72 = abstractC0204f3.f773;
                c0481z72.getClass();
                if ((abstractC0204f3.f1428 & 1) == 0) {
                    bitmapM866 = ((C0238h5) c0481z72.f1909).m866(abstractC0204f3.f1432);
                    C0215fa c0215fa = c0481z72.f1910;
                    if (bitmapM866 != null) {
                        c0215fa.f795.sendEmptyMessage(0);
                    } else {
                        c0215fa.f795.sendEmptyMessage(1);
                    }
                } else {
                    bitmapM866 = null;
                }
                if (bitmapM866 != null) {
                    e eVar2 = e.MEMORY;
                    c0481z72.m977(bitmapM866, eVar2, abstractC0204f3);
                    if (c0481z72.f1916) {
                        abstractC0204f3.f774.m958();
                        eVar2.toString();
                        StringBuilder sb2 = C0259ic.f866;
                    }
                } else {
                    c0481z72.m1287(abstractC0204f3);
                    if (c0481z72.f1916) {
                        abstractC0204f3.f774.m958();
                        StringBuilder sb22 = C0259ic.f866;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.z7$b */
    public static class b {

        /* JADX INFO: renamed from: ۥ */
        public final Context f1231;

        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC0449x1 f1232;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C0157b8 f1917;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public C0238h5 f1918;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public f.a f1919;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f1231 = context.getApplicationContext();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public final C0481z7 m978() {
            InterfaceC0449x1 c0459xb;
            Context context = this.f1231;
            if (this.f1232 == null) {
                StringBuilder sb = C0259ic.f866;
                try {
                    Class.forName("com.squareup.okhttp.OkHttpClient");
                    File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    c0459xb = new C0454x6(file, C0259ic.m872(file));
                } catch (ClassNotFoundException unused) {
                    c0459xb = new C0459xb(context);
                }
                this.f1232 = c0459xb;
            }
            if (this.f1918 == null) {
                this.f1918 = new C0238h5(context);
            }
            if (this.f1917 == null) {
                this.f1917 = new C0157b8();
            }
            if (this.f1919 == null) {
                this.f1919 = f.f1238;
            }
            C0215fa c0215fa = new C0215fa(this.f1918);
            return new C0481z7(context, new C0384s1(context, this.f1917, C0481z7.f1228, this.f1232, this.f1918, c0215fa), this.f1918, this.f1919, c0215fa);
        }
    }

    /* JADX INFO: renamed from: ۟.z7$c */
    public static class c extends Thread {

        /* JADX INFO: renamed from: ۥ */
        public final ReferenceQueue<Object> f1233;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Handler f1234;

        /* JADX INFO: renamed from: ۟.z7$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ Exception f1235;

            public a(Exception exc) {
                this.f1235 = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f1235);
            }
        }

        public c(ReferenceQueue referenceQueue, a aVar) {
            this.f1233 = referenceQueue;
            this.f1234 = aVar;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC0204f.a aVar = (AbstractC0204f.a) this.f1233.remove(1000L);
                    Message messageObtainMessage = this.f1234.obtainMessage();
                    if (aVar != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = aVar.f775;
                        this.f1234.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f1234.post(new a(e));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.z7$d */
    public interface d {
        /* JADX INFO: renamed from: ۥ */
        void m979();
    }

    /* JADX INFO: renamed from: ۟.z7$e */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* JADX INFO: renamed from: ۥ */
        public final int f1237;

        e(int i) {
            this.f1237 = i;
        }
    }

    /* JADX INFO: renamed from: ۟.z7$f */
    public interface f {

        /* JADX INFO: renamed from: ۥ */
        public static final a f1238 = new a();

        /* JADX INFO: renamed from: ۟.z7$f$a */
        public static class a implements f {
        }
    }

    public C0481z7(Context context, C0384s1 c0384s1, InterfaceC0191e0 interfaceC0191e0, f fVar, C0215fa c0215fa) {
        this.f1907 = context;
        this.f1908 = c0384s1;
        this.f1909 = interfaceC0191e0;
        this.f1229 = fVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C0482z8(context));
        arrayList.add(new C0357q0(context));
        arrayList.add(new C0388s5(context));
        arrayList.add(new C0370r0(context));
        arrayList.add(new C0421v(context));
        arrayList.add(new C0411u2(context));
        arrayList.add(new C0428v6(c0384s1.f1769, c0215fa));
        this.f1230 = Collections.unmodifiableList(arrayList);
        this.f1910 = c0215fa;
        this.f1911 = new WeakHashMap();
        this.f1912 = new WeakHashMap();
        this.f1915 = false;
        this.f1916 = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f1913 = referenceQueue;
        new c(referenceQueue, f1228).start();
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1286(C0481z7 c0481z7) {
        synchronized (C0481z7.class) {
            if (f1906 != null) {
                throw new IllegalStateException("Singleton instance already exists.");
            }
            f1906 = c0481z7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final void m976(Object obj) {
        StringBuilder sb = C0259ic.f866;
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        AbstractC0204f abstractC0204f = (AbstractC0204f) this.f1911.remove(obj);
        if (abstractC0204f != null) {
            abstractC0204f.mo819();
            C0384s1.a aVar = this.f1908.f1774;
            aVar.sendMessage(aVar.obtainMessage(2, abstractC0204f));
        }
        if (obj instanceof ImageView) {
            ViewTreeObserverOnPreDrawListenerC0248i1 viewTreeObserverOnPreDrawListenerC0248i1 = (ViewTreeObserverOnPreDrawListenerC0248i1) this.f1912.remove((ImageView) obj);
            if (viewTreeObserverOnPreDrawListenerC0248i1 == null) {
                return;
            }
            viewTreeObserverOnPreDrawListenerC0248i1.getClass();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m977(Bitmap bitmap, e eVar, AbstractC0204f abstractC0204f) {
        if (abstractC0204f.f1435) {
            return;
        }
        if (!abstractC0204f.f1434) {
            this.f1911.remove(abstractC0204f.m1061());
        }
        if (bitmap == null) {
            abstractC0204f.mo1011();
            if (!this.f1916) {
                return;
            } else {
                abstractC0204f.f774.m958();
            }
        } else {
            if (eVar == null) {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            abstractC0204f.mo820(bitmap, eVar);
            if (!this.f1916) {
                return;
            }
            abstractC0204f.f774.m958();
            eVar.toString();
        }
        StringBuilder sb = C0259ic.f866;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1287(AbstractC0204f abstractC0204f) {
        Object objM1061 = abstractC0204f.m1061();
        if (objM1061 != null && this.f1911.get(objM1061) != abstractC0204f) {
            m976(objM1061);
            this.f1911.put(objM1061, abstractC0204f);
        }
        C0384s1.a aVar = this.f1908.f1774;
        aVar.sendMessage(aVar.obtainMessage(1, abstractC0204f));
    }
}
