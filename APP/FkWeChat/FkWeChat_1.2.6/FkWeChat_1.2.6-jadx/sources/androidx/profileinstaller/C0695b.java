package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.AbstractC0696c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import p168l4.AbstractC4625c;
import p168l4.AbstractC4632j;
import p168l4.AbstractC4633k;
import p168l4.C4624b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0695b {

    /* JADX INFO: renamed from: a */
    public final AssetManager f2025a;

    /* JADX INFO: renamed from: b */
    public final Executor f2026b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0696c.c f2027c;

    /* JADX INFO: renamed from: e */
    public final File f2029e;

    /* JADX INFO: renamed from: f */
    public final String f2030f;

    /* JADX INFO: renamed from: g */
    public final String f2031g;

    /* JADX INFO: renamed from: h */
    public final String f2032h;

    /* JADX INFO: renamed from: j */
    public C4624b[] f2034j;

    /* JADX INFO: renamed from: k */
    public byte[] f2035k;

    /* JADX INFO: renamed from: i */
    public boolean f2033i = false;

    /* JADX INFO: renamed from: d */
    public final byte[] f2028d = m2731d();

    public C0695b(AssetManager assetManager, Executor executor, AbstractC0696c.c cVar, String str, String str2, String str3, File file) {
        this.f2025a = assetManager;
        this.f2026b = executor;
        this.f2027c = cVar;
        this.f2030f = str;
        this.f2031g = str2;
        this.f2032h = str3;
        this.f2029e = file;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m2731d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return AbstractC4633k.f13793a;
        }
        switch (i10) {
            case 26:
                return AbstractC4633k.f13796d;
            case 27:
                return AbstractC4633k.f13795c;
            case 28:
            case 29:
            case 30:
                return AbstractC4633k.f13794b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2732j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* JADX INFO: renamed from: b */
    public final C0695b m2733b(C4624b[] c4624bArr, byte[] bArr) {
        InputStream inputStreamM2737g;
        try {
            inputStreamM2737g = m2737g(this.f2025a, this.f2032h);
        } catch (FileNotFoundException e10) {
            this.f2027c.mo2718b(9, e10);
        } catch (IOException e11) {
            this.f2027c.mo2718b(7, e11);
        } catch (IllegalStateException e12) {
            this.f2034j = null;
            this.f2027c.mo2718b(8, e12);
        }
        if (inputStreamM2737g == null) {
            if (inputStreamM2737g != null) {
                inputStreamM2737g.close();
            }
            return null;
        }
        try {
            this.f2034j = AbstractC4632j.m18619r(inputStreamM2737g, AbstractC4632j.m18617p(inputStreamM2737g, AbstractC4632j.f13792b), bArr, c4624bArr);
            inputStreamM2737g.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamM2737g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2734c() {
        if (this.f2033i) {
            return;
        }
        C10010p0.m38820a("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    /* JADX INFO: renamed from: e */
    public boolean m2735e() {
        if (this.f2028d == null) {
            m2740k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        boolean zExists = this.f2029e.exists();
        File file = this.f2029e;
        if (!zExists) {
            try {
                if (!file.createNewFile()) {
                    m2740k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m2740k(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            m2740k(4, null);
            return false;
        }
        this.f2033i = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m2736f(AssetManager assetManager) {
        try {
            return m2737g(assetManager, this.f2031g);
        } catch (FileNotFoundException e10) {
            this.f2027c.mo2718b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f2027c.mo2718b(7, e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final InputStream m2737g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2027c.mo2717a(5, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public C0695b m2738h() {
        C0695b c0695bM2733b;
        m2734c();
        if (this.f2028d != null) {
            InputStream inputStreamM2736f = m2736f(this.f2025a);
            if (inputStreamM2736f != null) {
                this.f2034j = m2739i(inputStreamM2736f);
            }
            C4624b[] c4624bArr = this.f2034j;
            if (c4624bArr != null && m2732j() && (c0695bM2733b = m2733b(c4624bArr, this.f2028d)) != null) {
                return c0695bM2733b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C4624b[] m2739i(InputStream inputStream) {
        try {
            try {
                try {
                    C4624b[] c4624bArrM18625x = AbstractC4632j.m18625x(inputStream, AbstractC4632j.m18617p(inputStream, AbstractC4632j.f13791a), this.f2030f);
                    try {
                        inputStream.close();
                        return c4624bArrM18625x;
                    } catch (IOException e10) {
                        this.f2027c.mo2718b(7, e10);
                        return c4624bArrM18625x;
                    }
                } catch (IllegalStateException e11) {
                    this.f2027c.mo2718b(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f2027c.mo2718b(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f2027c.mo2718b(7, e13);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2740k(final int i10, final Object obj) {
        this.f2026b.execute(new Runnable() { // from class: l4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f13765q.f2027c.mo2718b(i10, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C0695b m2741l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C4624b[] c4624bArr = this.f2034j;
        byte[] bArr = this.f2028d;
        if (c4624bArr != null && bArr != null) {
            m2734c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AbstractC4632j.m18590F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f2027c.mo2718b(7, e10);
            } catch (IllegalStateException e11) {
                this.f2027c.mo2718b(8, e11);
            }
            if (!AbstractC4632j.m18587C(byteArrayOutputStream, bArr, c4624bArr)) {
                this.f2027c.mo2718b(5, null);
                this.f2034j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f2035k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f2034j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public boolean m2742m() {
        byte[] bArr = this.f2035k;
        if (bArr == null) {
            return false;
        }
        m2734c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2029e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                AbstractC4625c.m18576l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                m2740k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                m2740k(6, e10);
                return false;
            } catch (IOException e11) {
                m2740k(7, e11);
                return false;
            }
        } finally {
            this.f2035k = null;
            this.f2034j = null;
        }
    }
}
