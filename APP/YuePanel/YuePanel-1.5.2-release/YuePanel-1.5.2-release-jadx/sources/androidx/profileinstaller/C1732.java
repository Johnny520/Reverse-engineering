package androidx.profileinstaller;

import Yue.C4384;
import Yue.C4639;
import Yue.C6817;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C8896;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public class C1732 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final AssetManager f3856;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final Executor f3857;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final C8896.InterfaceC8898 f29849;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final File f29851;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final String f29852;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6391
    public final String f29853;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6391
    public final String f29854;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6490
    public C4384[] f29856;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6490
    public byte[] f29857;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f29855 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public final byte[] f29850 = m30117();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C1732(@InterfaceC6391 AssetManager assetManager, @InterfaceC6391 Executor executor, @InterfaceC6391 C8896.InterfaceC8898 interfaceC8898, @InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 String str3, @InterfaceC6391 File file) {
        this.f3856 = assetManager;
        this.f3857 = executor;
        this.f29849 = interfaceC8898;
        this.f29852 = str;
        this.f29853 = str2;
        this.f29854 = str3;
        this.f29851 = file;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static byte[] m30117() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m30118() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return false;
        }
        switch (i) {
        }
        return false;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public final C1732 m4886(C4384[] c4384Arr, byte[] bArr) {
        InputStream inputStreamM30123;
        try {
            inputStreamM30123 = m30123(this.f3856, this.f29854);
        } catch (FileNotFoundException e) {
            this.f29849.mo4875(9, e);
        } catch (IOException e2) {
            this.f29849.mo4875(7, e2);
        } catch (IllegalStateException e3) {
            this.f29856 = null;
            this.f29849.mo4875(8, e3);
        }
        if (inputStreamM30123 == null) {
            if (inputStreamM30123 != null) {
                inputStreamM30123.close();
            }
            return null;
        }
        try {
            this.f29856 = C6817.m21545(inputStreamM30123, C6817.m21543(inputStreamM30123, C6817.f17707), bArr, c4384Arr);
            inputStreamM30123.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamM30123.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30119() {
        if (!this.f29855) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m30120() {
        if (this.f29850 == null) {
            m30126(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f29851.exists()) {
            try {
                this.f29851.createNewFile();
            } catch (IOException unused) {
                m30126(4, null);
                return false;
            }
        } else if (!this.f29851.canWrite()) {
            m30126(4, null);
            return false;
        }
        this.f29855 = true;
        return true;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final InputStream m30121(AssetManager assetManager) {
        try {
            return m30123(assetManager, this.f29853);
        } catch (FileNotFoundException e) {
            this.f29849.mo4875(6, e);
            return null;
        } catch (IOException e2) {
            this.f29849.mo4875(7, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m30122(int i, Object obj) {
        this.f29849.mo4875(i, obj);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final InputStream m30123(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f29849.mo4874(5, null);
            }
            return null;
        }
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C1732 m30124() {
        C1732 c1732M4886;
        m30119();
        if (this.f29850 == null) {
            return this;
        }
        InputStream inputStreamM30121 = m30121(this.f3856);
        if (inputStreamM30121 != null) {
            this.f29856 = m30125(inputStreamM30121);
        }
        C4384[] c4384Arr = this.f29856;
        return (c4384Arr == null || !m30118() || (c1732M4886 = m4886(c4384Arr, this.f29850)) == null) ? this : c1732M4886;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C4384[] m30125(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C4384[] c4384ArrM21551 = C6817.m21551(inputStream, C6817.m21543(inputStream, C6817.f17706), this.f29852);
                        try {
                            inputStream.close();
                            return c4384ArrM21551;
                        } catch (IOException e) {
                            this.f29849.mo4875(7, e);
                            return c4384ArrM21551;
                        }
                    } catch (IOException e2) {
                        this.f29849.mo4875(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.f29849.mo4875(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.f29849.mo4875(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f29849.mo4875(7, e5);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30126(final int i, @InterfaceC6490 final Object obj) {
        this.f3857.execute(new Runnable() { // from class: Yue.ۥ۠۟۟
            @Override // java.lang.Runnable
            public final void run() {
                this.f8983.m30122(i, obj);
            }
        });
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C1732 m30127() {
        ByteArrayOutputStream byteArrayOutputStream;
        C4384[] c4384Arr = this.f29856;
        byte[] bArr = this.f29850;
        if (c4384Arr != null && bArr != null) {
            m30119();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C6817.m21559(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f29849.mo4875(7, e);
            } catch (IllegalStateException e2) {
                this.f29849.mo4875(8, e2);
            }
            if (!C6817.m21556(byteArrayOutputStream, bArr, c4384Arr)) {
                this.f29849.mo4875(5, null);
                this.f29856 = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f29857 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f29856 = null;
        }
        return this;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m30128() {
        byte[] bArr = this.f29857;
        if (bArr == null) {
            return false;
        }
        m30119();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f29851);
                    try {
                        C4639.m13954(byteArrayInputStream, fileOutputStream);
                        m30126(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
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
            } finally {
                this.f29857 = null;
                this.f29856 = null;
            }
        } catch (FileNotFoundException e) {
            m30126(6, e);
            return false;
        } catch (IOException e2) {
            m30126(7, e2);
            return false;
        }
    }
}
