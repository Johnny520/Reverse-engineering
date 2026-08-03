package Yue;

import com.android.p001dx.p004io.Opcodes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkData;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;
import java.io.File;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۢۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8218 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8218 f24490;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f24491;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f24492;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f24493;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f24494;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f24495;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f24496;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24497;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24498;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24499;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24500;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24501;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24502;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24503;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24504;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24505;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24506;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24507;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24508;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24509;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24510;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24511;

    /* JADX INFO: renamed from: ۥ */
    public final Gson f3328 = new Gson();

    /* JADX INFO: renamed from: ۥ۟ */
    public final File f3329;

    /* JADX INFO: renamed from: Yue.ۥۢۤ۟ۧ$ۥ */
    public class C1463 extends TypeToken<List<VideoMarkList>> {
        public C1463() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤ۟ۧ$ۥ۟ */
    public class C1464 extends TypeToken<List<VideoMarkData>> {
        public C1464() {
        }
    }

    static {
        NativeUtil.classesInit0(Opcodes.SHR_INT_LIT8);
        f24491 = yue_xin_awa(0);
        f24492 = yue_xin_awa(1);
        f24493 = yue_xin_awa(2);
        f24494 = yue_xin_awa(3);
        f24495 = yue_xin_awa(4);
        f24496 = yue_xin_awa(5);
    }

    public C8218() {
        File file = new File(C3270.m6708() + yue_xin_awa(6));
        this.f3329 = file;
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m4228(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m4229(String str, String str2, String str3, String str4, String str5, String str6, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ int m27182(VideoMarkList videoMarkList, VideoMarkList videoMarkList2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27183(String str, VideoMarkList videoMarkList);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27184(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ int m27185(VideoMarkData videoMarkData, VideoMarkData videoMarkData2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27186(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native C8218 m27187();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27188(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27189(String str, VideoMarkList videoMarkList);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native /* synthetic */ int m27190(VideoMarkList videoMarkList, VideoMarkList videoMarkList2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ int m27191(VideoMarkData videoMarkData, VideoMarkData videoMarkData2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27192(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27193(String str, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27194(String str, String str2, String str3, String str4, String str5, String str6, VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native boolean m27195(VideoMarkData videoMarkData);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m27196(String str, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final native List<VideoMarkData> m27197(List<VideoMarkData> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native void m27198(String str, String str2, String str3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native void m27199(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public native void m27200(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public native List<VideoMarkList> m27201();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public native List<VideoMarkData> m27202();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public native List<VideoMarkData> m27203();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public native int m27204(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public native void m27205();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public native boolean m27206(String str, String str2, String str3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final native String m27207(Set<String> set);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public native List<VideoMarkData> m27208(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public native List<VideoMarkData> m27209(String str, String str2, String str3, String str4, String str5, String str6);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final native void m27210(List<VideoMarkData> list);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final native void m27211(List<VideoMarkList> list);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public native boolean m27212(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public native boolean m27213(String str, String str2, String str3, String str4);
}
