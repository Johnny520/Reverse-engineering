package Yue;

import android.content.Context;
import android.net.Uri;
import com.nmmedit.protect.NativeUtil;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥۡۧۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7202 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2737;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2738;

    static {
        NativeUtil.classesInit0(428);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native boolean m3494(Context context, Uri uri, String str, String str2, byte[] bArr);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native boolean m3495(Context context, Uri uri, String str, String str2, InputStream inputStream);
}
