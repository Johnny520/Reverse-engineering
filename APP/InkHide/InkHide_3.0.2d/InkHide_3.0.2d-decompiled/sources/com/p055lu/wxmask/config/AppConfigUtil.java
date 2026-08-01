package com.p055lu.wxmask.config;

import android.net.Uri;
import com.p055lu.wxmask.config.AppConfigUtil;
import com.p055lu.wxmask272.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;
import p001A0.C0026a;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p007D0.C0095c;
import p009E0.C0106f;
import p009E0.C0109i;
import p009E0.InterfaceC0101a;
import p021K0.C0162a;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0208p;
import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;
import p037T.C0261l;
import p040U0.AbstractC0291a;
import p041V.AbstractC0311d;
import p049a0.C0367a;
import p052b1.AbstractC0503h;
import p067g0.AbstractC0575a;
import p070i0.AbstractC0731a;
import p081o0.C0780a;
import p081o0.C0781b;
import p102z0.C1141x;

/* JADX INFO: loaded from: classes.dex */
public final class AppConfigUtil {
    public static final Companion Companion = new Companion(null);
    private static final String configFilePath = "res/raw/app_config.json";
    private static final String githubMainUrl = "https://raw.githubusercontent.com/Mingyueyixi/MaskWechat/main";
    private static final String cdnMainUrl = "https://cdn.jsdelivr.net/gh/Mingyueyixi/MaskWechat@main";
    private static AppConfig config = new AppConfig();
    private static final InterfaceC0101a releaseNoteExpiredSetting$delegate = new C0106f(new C0026a(25));

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.lu.wxmask.config.AppConfigUtil.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0221e abstractC0221e) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final File getLocalFile(String str) {
            return new File(AbstractC0503h.m991x().getFilesDir(), str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final C0109i getReleaseNoteWebUrl$lambda$6(File file, String str, String str2, C0095c c0095c) throws IOException {
            AbstractC0223g.m418e(c0095c, "github");
            if (c0095c.f380d == null) {
                byte[] bArr = c0095c.f379c;
                if (bArr.length == 0) {
                    AbstractC0731a.m1386c("get fail: ", str, c0095c);
                    ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
                    AbstractC0079h.m191o(str2, new C0781b(file, str2, 0));
                } else {
                    Companion companion = AppConfigUtil.Companion;
                    companion.saveLocalFile(file, bArr);
                    companion.getReleaseNoteExpiredSetting().f3867a = System.currentTimeMillis();
                }
            }
            return C0109i.f404a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final C0109i getReleaseNoteWebUrl$lambda$6$lambda$5(File file, String str, C0095c c0095c) throws IOException {
            AbstractC0223g.m418e(c0095c, "cdn");
            if (c0095c.f380d == null) {
                byte[] bArr = c0095c.f379c;
                if (bArr.length == 0) {
                    AbstractC0731a.m1386c("get fail: ", str, c0095c);
                } else {
                    Companion companion = AppConfigUtil.Companion;
                    companion.saveLocalFile(file, bArr);
                    companion.getReleaseNoteExpiredSetting().f3867a = System.currentTimeMillis();
                }
            }
            return C0109i.f404a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ void load$default(Companion companion, InterfaceC0208p interfaceC0208p, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                interfaceC0208p = null;
            }
            companion.load(interfaceC0208p);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final C0109i load$lambda$1(String str, String str2, File file, InterfaceC0208p interfaceC0208p, C0095c c0095c) throws IOException {
            AbstractC0223g.m418e(c0095c, "raw");
            if (c0095c.f380d == null && c0095c.f377a == 200) {
                Companion companion = AppConfigUtil.Companion;
                companion.parseConfig(c0095c.f379c);
                companion.saveLocalFile(file, c0095c.f379c);
                if (interfaceC0208p != null) {
                    interfaceC0208p.mo248a(companion.getConfig(), Boolean.TRUE);
                }
            } else {
                AbstractC0731a.m1384a(AbstractC0174d.m352h("request raw fail, ", str), c0095c);
                AbstractC0079h.m192p(str2, AbstractC0096d.f382b, new C0780a(file, interfaceC0208p, str2, 0));
            }
            return C0109i.f404a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final C0109i load$lambda$1$lambda$0(File file, InterfaceC0208p interfaceC0208p, String str, C0095c c0095c) throws IOException {
            AbstractC0223g.m418e(c0095c, "cdn");
            if (c0095c.f380d == null && c0095c.f377a == 200) {
                Companion companion = AppConfigUtil.Companion;
                companion.parseConfig(c0095c.f379c);
                companion.saveLocalFile(file, c0095c.f379c);
                if (interfaceC0208p != null) {
                    interfaceC0208p.mo248a(companion.getConfig(), Boolean.TRUE);
                }
            } else {
                AbstractC0731a.m1384a(AbstractC0174d.m352h("request cdn fail, ", str), c0095c);
                Companion companion2 = AppConfigUtil.Companion;
                companion2.parseLocalConfig(file);
                if (interfaceC0208p != null) {
                    interfaceC0208p.mo248a(companion2.getConfig(), Boolean.FALSE);
                }
            }
            return C0109i.f404a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void parseConfig(byte[] bArr) {
            AppConfig appConfig;
            String str = new String(bArr, AbstractC0291a.f663a);
            try {
                C0261l c0261l = AbstractC0575a.f1940a;
                c0261l.getClass();
                appConfig = (AppConfig) AbstractC0311d.m549k(AppConfig.class).cast(c0261l.m480c(str, new C0367a(AppConfig.class)));
            } catch (Throwable th) {
                AbstractC0731a.m1387d(th);
                appConfig = null;
            }
            if (appConfig != null) {
                setConfig(appConfig);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private final void parseLocalConfig(File file) throws IOException {
            AbstractC0223g.m418e(file, "<this>");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                }
                int i2 = (int) length;
                byte[] bArrCopyOf = new byte[i2];
                int i3 = i2;
                int i4 = 0;
                while (i3 > 0) {
                    int i5 = fileInputStream.read(bArrCopyOf, i4, i3);
                    if (i5 < 0) {
                        break;
                    }
                    i3 -= i5;
                    i4 += i5;
                }
                if (i3 > 0) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
                    AbstractC0223g.m417d(bArrCopyOf, "copyOf(...)");
                } else {
                    int i6 = fileInputStream.read();
                    if (i6 != -1) {
                        C0162a c0162a = new C0162a(8193);
                        c0162a.write(i6);
                        AbstractC0079h.m185i(fileInputStream, c0162a);
                        int size = c0162a.size() + i2;
                        if (size < 0) {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                        byte[] bArrM340a = c0162a.m340a();
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                        AbstractC0223g.m417d(bArrCopyOf, "copyOf(...)");
                        System.arraycopy(bArrM340a, 0, bArrCopyOf, i2, c0162a.size());
                    }
                }
                fileInputStream.close();
                AppConfigUtil.Companion.parseConfig(bArrCopyOf);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0079h.m182f(fileInputStream, th);
                    throw th2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private final void saveLocalFile(File file, byte[] bArr) throws IOException {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getCdnMainUrl() {
            return AppConfigUtil.cdnMainUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AppConfig getConfig() {
            return AppConfigUtil.config;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getGithubMainUrl() {
            return AppConfigUtil.githubMainUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final C1141x getReleaseNoteExpiredSetting() {
            return (C1141x) ((C0106f) AppConfigUtil.releaseNoteExpiredSetting$delegate).m247a();
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final String getReleaseNoteWebUrl() {
            String str = getCdnMainUrl() + "/res/html/releases_note.html";
            String str2 = getGithubMainUrl() + "/res/html/releases_note.html";
            File localFile = getLocalFile("res/html/releases_note.html");
            if (!localFile.exists()) {
                try {
                    localFile.getParentFile().mkdirs();
                    InputStream inputStreamOpenRawResource = AbstractC0503h.m991x().getResources().openRawResource(R.raw.releases_note);
                    try {
                        Companion companion = AppConfigUtil.Companion;
                        AbstractC0223g.m415b(inputStreamOpenRawResource);
                        companion.saveLocalFile(localFile, AbstractC0079h.m171N(inputStreamOpenRawResource));
                        inputStreamOpenRawResource.close();
                    } finally {
                    }
                } catch (Exception unused) {
                }
                getReleaseNoteExpiredSetting().f3867a = 0L;
            }
            C1141x releaseNoteExpiredSetting = getReleaseNoteExpiredSetting();
            releaseNoteExpiredSetting.getClass();
            if (System.currentTimeMillis() - releaseNoteExpiredSetting.f3867a > 300000) {
                ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
                AbstractC0079h.m191o(str2, new C0780a(localFile, str2, str));
            }
            String string = Uri.fromFile(localFile).toString();
            AbstractC0223g.m417d(string, "toString(...)");
            return string;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void load(final InterfaceC0208p interfaceC0208p) {
            final String str = getGithubMainUrl() + "/" + AppConfigUtil.configFilePath;
            final String str2 = getCdnMainUrl() + "/" + AppConfigUtil.configFilePath;
            final File file = new File(AbstractC0503h.m991x().getFilesDir(), AppConfigUtil.configFilePath);
            if (!file.exists()) {
                try {
                    file.getParentFile().mkdirs();
                } catch (Exception unused) {
                }
            }
            AbstractC0079h.m192p(str, AbstractC0096d.f382b, new InterfaceC0204l() { // from class: o0.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p025M0.InterfaceC0204l
                /* JADX INFO: renamed from: c */
                public final Object mo8c(Object obj) {
                    File file2 = file;
                    return AppConfigUtil.Companion.load$lambda$1(str, str2, file2, interfaceC0208p, (C0095c) obj);
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setConfig(AppConfig appConfig) {
            AbstractC0223g.m418e(appConfig, "<set-?>");
            AppConfigUtil.config = appConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C1141x releaseNoteExpiredSetting_delegate$lambda$0() {
        return new C1141x();
    }
}
