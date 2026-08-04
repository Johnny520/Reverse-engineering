package yyds;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.NativeUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᲀᛴᛱᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1985 implements InterfaceC1826, InterfaceC2768, InterfaceC0594, InterfaceC0966, InterfaceC2440, InterfaceC0535, InterfaceC0396, InterfaceC1454 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean f9936 = true;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean f9937;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static WeakReference f9938;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C1985 f9939;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1985 f9940;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1985 f9941;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1985 f9942;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9943;

    static {
        NativeUtil.classesInit0(24);
        f9942 = new C1985(0);
        f9941 = new C1985(2);
        f9939 = new C1985(4);
        f9940 = new C1985(5);
    }

    public C1985() {
        this.f9943 = 26;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static final native void m3828(C0172 c0172, EditText editText, Context context, C1417 c1417, C1417 c14172, C0947 c0947, C0172 c01722, C0172 c01723, TextView textView, TextView textView2, C0172 c01724, TextView textView3, C0172 c01725, C1417 c14173, C0172 c01726, C1213 c1213, View view, TextView textView4, C0172 c01727, C0172 c01728, TextView textView5, TextView textView6, Handler handler, C1417 c14174, Dialog dialog, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, TextView textView7, TextView textView8, boolean z);

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final native void m3829(C1417 c1417, C0947 c0947, C0172 c0172, C0172 c01722, TextView textView, TextView textView2, C1417 c14172, C0172 c01723, TextView textView3, Context context, C0172 c01724, C0172 c01725, C1417 c14173, C0172 c01726, C1213 c1213, View view, TextView textView4, C0172 c01727, C0172 c01728, TextView textView5, TextView textView6, Handler handler, C1417 c14174, Dialog dialog, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, TextView textView7, TextView textView8, boolean z);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static native ByteArrayInputStream m3830(String str);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static native void m3831();

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static native EnumC1841 m3832(Class cls);

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static native void m3833(C0172 c0172, C0947 c0947, C0172 c01722, C0947 c09472, C1417 c1417, C0172 c01723, C0172 c01724, TextView textView, TextView textView2, C1417 c14172, C0172 c01725, TextView textView3, Context context, C0172 c01726, C0172 c01727, C1417 c14173, C0172 c01728, C1213 c1213, View view, TextView textView4, C0172 c01729, TextView textView5, TextView textView6, Handler handler, C1417 c14174, Dialog dialog, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, TextView textView7, TextView textView8, int i, int i2, int i3);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static native Font m3834(FontFamily fontFamily, int i);

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static native int m3835(FontStyle fontStyle, FontStyle fontStyle2);

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static native Dialog m3836(Context context, String str, ArrayList arrayList, String str2, C1129 c1129, C1129 c11292);

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final native void m3837(C0172 c0172, TextView textView, TextView textView2, C1417 c1417, C0172 c01722, TextView textView3, Context context, C0172 c01723, C0172 c01724, C1417 c14172, C1417 c14173, C0172 c01725, C0172 c01726, C1213 c1213, View view, TextView textView4, C0172 c01727, C0172 c01728, TextView textView5, TextView textView6, boolean z);

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static native void m3838(Context context, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, C1258 c1258, TextView textView, TextView textView2);

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final native void m3839(C0172 c0172, EditText editText, Context context, C1417 c1417, C1417 c14172, C0947 c0947, C0172 c01722, C0172 c01723, TextView textView, TextView textView2, C0172 c01724, TextView textView3, C0172 c01725, C1417 c14173, C0172 c01726, C1213 c1213, View view, TextView textView4, C0172 c01727, C0172 c01728, TextView textView5, TextView textView6, Handler handler, C1417 c14174, Dialog dialog, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, TextView textView7, TextView textView8, EnumC2606 enumC2606);

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final native void m3840(Context context, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, C0172 c0172, TextView textView, TextView textView2, List list);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static native void m3841(Context context, TextView textView, boolean z);

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static native void m3842(Context context, String str, C2089 c2089, EnumC2606 enumC2606, InterfaceC1549 interfaceC1549, int i);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static native int m3843(Context context, int i);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static native void m3844(boolean z, InterfaceC2266 interfaceC2266);

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static native void m3845();

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static native void m3846(Context context, String str, String str2, InterfaceC0477 interfaceC0477);

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public native void mo603(MediaMetadataRetriever mediaMetadataRetriever, Object obj);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public native Typeface m3847(Context context, List list, int i);

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public native InterfaceC0894 mo382(C0644 c0644);

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public native synchronized boolean m3848();

    @Override // yyds.InterfaceC0594
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public native void mo948(InterfaceC1410 interfaceC1410, C0644 c0644);

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public native Font mo2235(C2685 c2685);

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public native void mo606(MediaExtractor mediaExtractor, Object obj);

    @Override // yyds.InterfaceC0594
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public native File mo949(InterfaceC1410 interfaceC1410);

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public native Object m3849(C0837 c0837);

    @Override // yyds.InterfaceC0966
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public native void mo1273(String str, StringBuilder sb);

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public native C2133 m3850(Context context);

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public native void mo1274(int i, Object obj);

    @Override // yyds.InterfaceC0396
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public native boolean mo561(Object obj);

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public native void mo1275();

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public native FontFamily m3851(C2685[] c2685Arr, ContentResolver contentResolver);

    @Override // yyds.InterfaceC1826
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public native InterfaceC2162 mo1277(InterfaceC2162 interfaceC2162, C0822 c0822);

    public /* synthetic */ C1985(int i) {
        this.f9943 = i;
    }
}
