package yyds;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᲀᛵᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 implements InterfaceC0740, InterfaceC0017, InterfaceC2605, InterfaceC1181, InterfaceC0535, InterfaceC0396, InterfaceC1028, InterfaceC1081, InterfaceC0498 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10073;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f10074;

    public C2014(int i, byte b) {
        this.f10073 = i;
        switch (i) {
            case 14:
                this.f10074 = new LinkedHashSet();
                break;
            case 21:
                break;
            case 23:
                this.f10074 = new WeakHashMap();
                break;
            default:
                this.f10074 = new C2499(500L);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static void m3888(C2014 c2014) {
        ((C0903) c2014.f10074).f4118 = 2;
    }

    @Override // yyds.InterfaceC2605
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public void mo380() {
        switch (this.f10073) {
            case 7:
                C1188 c1188 = (C1188) ((C2283) this.f10074).f11233;
                if (!c1188.mo960() && c1188.mo957()) {
                    c1188.m2387();
                }
                break;
            default:
                C1908 c1908 = ((C2458) this.f10074).f12153.f8265;
                if (c1908 == null) {
                    WeakReference weakReference = AbstractC1655.f8450;
                } else {
                    ((AtomicBoolean) c1908.f9647).set(true);
                    C1624.m3320();
                }
                break;
        }
    }

    @Override // yyds.InterfaceC1081
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public boolean mo443(Object obj, File file, C0822 c0822) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C2267 c2267 = (C2267) this.f10074;
        byte[] bArr = (byte[]) c2267.m4272(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c2267.m4271(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c2267.m4271(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c2267.m4271(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public float mo2375() {
        return -((NestedScrollView) this.f10074).getVerticalScrollFactorCompat();
    }

    @Override // yyds.InterfaceC0498
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public boolean mo1347() {
        return true;
    }

    @Override // yyds.InterfaceC1028
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public C1864 mo2232() {
        return (C1864) this.f10074;
    }

    @Override // yyds.InterfaceC0498
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public InterfaceC0124 mo1348(String str) {
        InterfaceC1997 interfaceC1997 = (InterfaceC1997) this.f10074;
        String databaseName = interfaceC1997.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                C0188.m806(AbstractC2104.m4014("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !AbstractC0473.m1303(databaseName, '/').equals(AbstractC0473.m1303(str, '/'))) {
            C1693.m3435("This driver is configured to open a database named '", interfaceC1997.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new C1519(interfaceC1997.mo3773());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3889(Set set) {
        int[] iArr;
        Unsafe unsafe;
        long j;
        Object objectVolatile;
        int i;
        int i2;
        C0415 c0415 = C2810.f13699;
        if (set.isEmpty()) {
            return;
        }
        C0510 c0510 = (C0510) this.f10074;
        while (true) {
            Object objectVolatile2 = AbstractC2112.f10448.getObjectVolatile(c0510, C0510.f2459);
            if (objectVolatile2 == c0415) {
                objectVolatile2 = null;
            }
            int[] iArr2 = (int[]) objectVolatile2;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
            }
            if (objectVolatile2 == null) {
                objectVolatile2 = c0415;
            }
            synchronized (c0510) {
                unsafe = AbstractC2112.f10448;
                j = C0510.f2459;
                objectVolatile = unsafe.getObjectVolatile(c0510, j);
                if (AbstractC1544.m3188(objectVolatile, objectVolatile2)) {
                    break;
                }
            }
            while (true) {
                synchronized (c0510) {
                    i2 = c0510.f2460;
                    if (i2 == i) {
                        c0510.f2460 = i + 1;
                        return;
                    }
                }
                i = i2;
            }
        }
        if (AbstractC1544.m3188(objectVolatile, iArr)) {
            return;
        }
        unsafe.putObjectVolatile(c0510, j, iArr);
        int i4 = c0510.f2460;
        if ((i4 & 1) != 0) {
            c0510.f2460 = i4 + 2;
            return;
        }
        i = i4 + 1;
        c0510.f2460 = i;
        while (true) {
            synchronized (c0510) {
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean m3890(AssetManager assetManager, C2661 c2661) {
        boolean zBooleanValue;
        AbstractC2328.m4341(-562842152108910L);
        AbstractC2328.m4341(-562859331978094L);
        synchronized (((WeakHashMap) this.f10074)) {
            try {
                if (((WeakHashMap) this.f10074).containsKey(assetManager)) {
                    zBooleanValue = true;
                } else {
                    c2661.mo731();
                    Boolean bool = Boolean.TRUE;
                    if (bool.booleanValue()) {
                        ((WeakHashMap) this.f10074).put(assetManager, bool);
                    }
                    zBooleanValue = bool.booleanValue();
                }
            } finally {
            }
        }
        return zBooleanValue;
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo244() {
        ((C0839) this.f10074).m1921();
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public void m3891(AbstractC2026 abstractC2026) {
        C2771 c2771 = (C2771) this.f10074;
        AbstractC2026 abstractC20262 = c2771.f13520;
        abstractC20262.f10102 = abstractC2026;
        abstractC2026.f10101 = abstractC20262;
        c2771.f13520 = abstractC2026;
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public Object mo245() {
        C0839 c0839 = (C0839) this.f10074;
        c0839.reset();
        return c0839;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C1189 m3892() {
        C1189 c1189 = new C1189();
        c1189.f12002 = (C0903) this.f10074;
        return c1189;
    }

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public void mo1274(int i, Object obj) {
        String str;
        switch (i) {
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f10074).setResultCode(i);
    }

    @Override // yyds.InterfaceC0396
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public boolean mo561(Object obj) {
        ((C1762) this.f10074).f8846.f4503.getClass();
        return obj instanceof List;
    }

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public void mo1275() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public C0802 m3893() {
        C0802 c0802 = new C0802();
        c0802.f12002 = (C0903) this.f10074;
        return c0802;
    }

    @Override // yyds.InterfaceC1028
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public C2723 mo2233() throws Throwable {
        InterfaceC2144 interfaceC2144M3641;
        IOException iOException = null;
        while (!((C1864) this.f10074).f9357.f13422) {
            try {
                interfaceC2144M3641 = ((C1864) this.f10074).m3641();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC1579.m3235(iOException, e);
                }
                if (!((C1864) this.f10074).m3640(null)) {
                    throw iOException;
                }
            }
            if (!interfaceC2144M3641.mo2227()) {
                C2695 c2695Mo2230 = interfaceC2144M3641.mo2230();
                if (c2695Mo2230.f13245 == null && c2695Mo2230.f13246 == null) {
                    c2695Mo2230 = interfaceC2144M3641.mo2229();
                }
                InterfaceC2144 interfaceC2144 = c2695Mo2230.f13245;
                Throwable th = c2695Mo2230.f13246;
                if (th != null) {
                    throw th;
                }
                if (interfaceC2144 != null) {
                    ((C1864) this.f10074).f9361.addFirst(interfaceC2144);
                }
            }
            return interfaceC2144M3641.mo2231();
        }
        C0188.m804("Canceled");
        return null;
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public void mo2376() {
        ((NestedScrollView) this.f10074).f300.abortAnimation();
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public boolean mo2377(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo2376();
        ((NestedScrollView) this.f10074).m113((int) f);
        return true;
    }

    @Override // yyds.InterfaceC0017
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo611(ArrayList arrayList) {
        AbstractC2328.m4341(-380108473533294L);
        AbstractC2328.m4341(-380160013140846L);
        MainActivity mainActivity = (MainActivity) this.f10074;
        if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
            return;
        }
        if (arrayList.isEmpty()) {
            mainActivity.m339();
        } else {
            mainActivity.f475.m704(new C2471(AbstractC2328.m4341(-267524495803246L), AbstractC2328.m4341(-267550265607022L), AbstractC2328.m4341(-267687704560494L), new C0685(mainActivity, 0)));
        }
    }

    public C2014(InputStream inputStream, C2267 c2267) {
        this.f10073 = 0;
        C0839 c0839 = new C0839(inputStream, c2267);
        this.f10074 = c0839;
        c0839.mark(5242880);
    }

    public C2014(Context context) {
        this.f10073 = 1;
        this.f10074 = new C1483(context, 4);
    }

    public /* synthetic */ C2014(int i, Object obj) {
        this.f10073 = i;
        this.f10074 = obj;
    }

    public C2014(RunnableC2652 runnableC2652) {
        this.f10073 = 5;
        this.f10074 = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C2014(ThreadFactoryC1763 threadFactoryC1763) {
        this.f10073 = 20;
        this.f10074 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC1763);
    }

    public C2014(int i) {
        this.f10073 = 10;
        this.f10074 = new C0510(new int[i]);
    }
}
