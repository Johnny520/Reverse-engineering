package Yue;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.RegionEntity;
import com.yuexin.panel.utils.entity.RegionInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3826 {

    /* JADX INFO: renamed from: ۥ */
    public static final Map<String, RegionInfo> f527;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f528;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧ$ۥ */
    public class C0265 extends TypeToken<List<RegionEntity>> {
    }

    static {
        NativeUtil.classesInit0(683);
        f527 = new HashMap();
        m10565(C3270.m6705());
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m876(List<RegionEntity> list, String str, String str2);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native RegionInfo m877(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m10565(Context context);
}
