package Yue;

import Yue.C5058;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.android.dex.DexFormat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5048 {

    /* JADX INFO: renamed from: ۥ */
    public static final C5891<String, Typeface> f1226 = new C5891<>(16);

    /* JADX INFO: renamed from: ۥ۟ */
    public static final ExecutorService f1227 = C7107.m3399("fonts-androidx", 10, DexFormat.API_SPACES_IN_SIMPLE_NAME);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object f11963 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("LOCK")
    public static final C7467<String, ArrayList<InterfaceC4144<C5051>>> f11964 = new C7467<>();

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟$ۥ */
    public class CallableC0623 implements Callable<C5051> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f1228;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ Context f1229;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5045 f11965;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f11966;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public CallableC0623(String str, Context context, C5045 c5045, int i) {
            this.f1228 = str;
            this.f1229 = context;
            this.f11965 = c5045;
            this.f11966 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C5051 call() {
            return C5048.m15560(this.f1228, this.f1229, this.f11965, this.f11966);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟$ۥ۟ */
    public class C0624 implements InterfaceC4144<C5051> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3654 f11967;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0624(C3654 c3654) {
            this.f11967 = c3654;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // Yue.InterfaceC4144
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public void accept(C5051 c5051) {
            if (c5051 == null) {
                c5051 = new C5051(-3);
            }
            this.f11967.m725(c5051);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟$ۥ۟۟, reason: contains not printable characters */
    public class CallableC5049 implements Callable<C5051> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f1230;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ Context f1231;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5045 f11968;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f11969;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public CallableC5049(String str, Context context, C5045 c5045, int i) {
            this.f1230 = str;
            this.f1231 = context;
            this.f11968 = c5045;
            this.f11969 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C5051 call() {
            try {
                return C5048.m15560(this.f1230, this.f1231, this.f11968, this.f11969);
            } catch (Throwable unused) {
                return new C5051(-3);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C5050 implements InterfaceC4144<C5051> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f11970;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5050(String str) {
            this.f11970 = str;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // Yue.InterfaceC4144
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public void accept(C5051 c5051) {
            synchronized (C5048.f11963) {
                try {
                    C7467<String, ArrayList<InterfaceC4144<C5051>>> c7467 = C5048.f11964;
                    ArrayList<InterfaceC4144<C5051>> arrayList = c7467.get(this.f11970);
                    if (arrayList == null) {
                        return;
                    }
                    c7467.remove(this.f11970);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(c5051);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m1861(@InterfaceC6391 C5045 c5045, int i) {
        return c5045.m15555() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m1862(@InterfaceC6391 C5058.C0628 c0628) {
        int i = 1;
        if (c0628.m15583() != 0) {
            return c0628.m15583() != 1 ? -3 : -2;
        }
        C5058.C5059[] c5059ArrM1879 = c0628.m1879();
        if (c5059ArrM1879 != null && c5059ArrM1879.length != 0) {
            i = 0;
            for (C5058.C5059 c5059 : c5059ArrM1879) {
                int iM1881 = c5059.m1881();
                if (iM1881 != 0) {
                    if (iM1881 < 0) {
                        return -3;
                    }
                    return iM1881;
                }
            }
        }
        return i;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C5051 m15560(@InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, int i) {
        C5891<String, Typeface> c5891 = f1226;
        Typeface typefaceM18256 = c5891.m18256(str);
        if (typefaceM18256 != null) {
            return new C5051(typefaceM18256);
        }
        try {
            C5058.C0628 c0628M15550 = C5043.m15550(context, c5045, null);
            int iM1862 = m1862(c0628M15550);
            if (iM1862 != 0) {
                return new C5051(iM1862);
            }
            Typeface typefaceM25337 = C8023.m25337(context, null, c0628M15550.m1879(), i);
            if (typefaceM25337 == null) {
                return new C5051(-3);
            }
            c5891.m18260(str, typefaceM25337);
            return new C5051(typefaceM25337);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C5051(-1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Typeface m15561(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, int i, @InterfaceC6490 Executor executor, @InterfaceC6391 C3654 c3654) {
        String strM1861 = m1861(c5045, i);
        Typeface typefaceM18256 = f1226.m18256(strM1861);
        if (typefaceM18256 != null) {
            c3654.m725(new C5051(typefaceM18256));
            return typefaceM18256;
        }
        C0624 c0624 = new C0624(c3654);
        synchronized (f11963) {
            try {
                C7467<String, ArrayList<InterfaceC4144<C5051>>> c7467 = f11964;
                ArrayList<InterfaceC4144<C5051>> arrayList = c7467.get(strM1861);
                if (arrayList != null) {
                    arrayList.add(c0624);
                    return null;
                }
                ArrayList<InterfaceC4144<C5051>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0624);
                c7467.put(strM1861, arrayList2);
                CallableC5049 callableC5049 = new CallableC5049(strM1861, context, c5045, i);
                if (executor == null) {
                    executor = f1227;
                }
                C7107.m22224(executor, callableC5049, new C5050(strM1861));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Typeface m15562(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, @InterfaceC6391 C3654 c3654, int i, int i2) {
        String strM1861 = m1861(c5045, i);
        Typeface typefaceM18256 = f1226.m18256(strM1861);
        if (typefaceM18256 != null) {
            c3654.m725(new C5051(typefaceM18256));
            return typefaceM18256;
        }
        if (i2 == -1) {
            C5051 c5051M15560 = m15560(strM1861, context, c5045, i);
            c3654.m725(c5051M15560);
            return c5051M15560.f1232;
        }
        try {
            C5051 c5051 = (C5051) C7107.m22225(f1227, new CallableC0623(strM1861, context, c5045, i), i2);
            c3654.m725(c5051);
            return c5051.f1232;
        } catch (InterruptedException unused) {
            c3654.m725(new C5051(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m15563() {
        f1226.m18254();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5051 {

        /* JADX INFO: renamed from: ۥ */
        public final Typeface f1232;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1233;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C5051(int i) {
            this.f1232 = null;
            this.f1233 = i;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ */
        public boolean m1867() {
            return this.f1233 == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C5051(@InterfaceC6391 Typeface typeface) {
            this.f1232 = typeface;
            this.f1233 = 0;
        }
    }
}
