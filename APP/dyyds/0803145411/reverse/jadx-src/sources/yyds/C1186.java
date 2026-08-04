package yyds;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.NativeUtil;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛵᲀᛷᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1186 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2590 f5426;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static EnumC1351 f5427;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Object f5428;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Activity f5429;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0763 f5430;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C1624 f5431;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2454 f5432;

    static {
        NativeUtil.classesInit0(252);
        AbstractC2328.m4341(-107416704942958L);
        AbstractC2328.m4341(-107468244550510L);
        f5426 = new C2590();
        f5428 = new Object();
    }

    public C1186(Activity activity) {
        this.f5429 = activity;
        C1206 c1206 = AbstractC0221.f1238;
        C1158 c1158 = AbstractC1353.f6250;
        C1455 c1455M3297 = AbstractC0024.m3297();
        c1158.getClass();
        this.f5432 = AbstractC1917.m3696(AbstractC0879.m1960(c1158, c1455M3297));
        C2701.f13261.getClass();
        C2701.m4807(activity);
        View viewInflate = AbstractC1115.m2309(activity).inflate(R.layout.dialog_backup_restore, (ViewGroup) null);
        C0763 c0763M1709 = C0763.m1709(viewInflate.getContext());
        c0763M1709.f3518 = AbstractC2328.m4341(-104715170513774L);
        c0763M1709.mo1719();
        c0763M1709.f3522 = new C1244(viewInflate, this, 0);
        c0763M1709.mo1719();
        c0763M1709.f3530 = AbstractC2328.m4341(-104749530252142L);
        c0763M1709.mo1719();
        AbstractC2328.m4341(-104762415154030L);
        this.f5430 = c0763M1709;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static native void m2378(OutputStream outputStream, JSONObject jSONObject, long j, String str);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static native C0856 m2379(FilterInputStream filterInputStream, long j, String str);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static native C0391 m2380(BufferedInputStream bufferedInputStream);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final native void m2381(EnumC1947 enumC1947, Context context);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final native void m2382();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final native void m2383(String str);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final native void m2384(EnumC1947 enumC1947);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final native Object m2385(Activity activity, JSONObject jSONObject, AbstractC1320 abstractC1320);
}
