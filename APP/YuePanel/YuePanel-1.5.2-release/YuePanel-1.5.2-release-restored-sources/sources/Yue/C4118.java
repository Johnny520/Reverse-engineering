package Yue;

import com.nmmedit.protect.NativeUtil;
import com.shoujiduoduo.util.NativeDES;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4118 {

    /* JADX INFO: renamed from: ۥ */
    public static List<String> f687;

    /* JADX INFO: renamed from: ۥ۟ */
    public static C5753 f688;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f8238;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static NativeDES f8239;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C7255 f8240;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8241;

    static {
        NativeUtil.classesInit0(1069);
        f687 = new ArrayList();
        f8238 = C4093.m11561(yue_xin_awa(0));
        if (new File(f8238).exists()) {
            return;
        }
        new File(f8238).mkdirs();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);
}
