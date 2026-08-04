package yyds;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.NativeUtil;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᲁᛳᛸᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC2204 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f10867;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10868;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f10869;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10870;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final /* synthetic */ Handler f10871;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f10872;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f10873;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10874;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f10875;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10876;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f10877;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10878;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10879;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10880;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ EditText f10881;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10882;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f10883;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10884;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10885;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10886;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f10887;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f10888;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f10889;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final /* synthetic */ EnumC2529 f10890;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10891;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0508 f10892;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10893;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10894;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f10895;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0508 f10896;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10897;

    static {
        NativeUtil.classesInit0(164);
    }

    public /* synthetic */ ViewOnTouchListenerC2204(C0508 c0508, C0508 c05082, Context context, C0172 c0172, EditText editText, C1417 c1417, C1417 c14172, C0947 c0947, C0172 c01722, C0172 c01723, TextView textView, TextView textView2, C0172 c01724, TextView textView3, C0172 c01725, C1417 c14173, C0172 c01726, C1213 c1213, View view, TextView textView4, C0172 c01727, C0172 c01728, TextView textView5, TextView textView6, Handler handler, C1417 c14174, Dialog dialog, LinkedHashMap linkedHashMap, EnumC2529 enumC2529, TextView textView7, TextView textView8) {
        this.f10892 = c0508;
        this.f10896 = c05082;
        this.f10873 = context;
        this.f10895 = c0172;
        this.f10881 = editText;
        this.f10869 = c1417;
        this.f10872 = c14172;
        this.f10888 = c0947;
        this.f10884 = c01722;
        this.f10885 = c01723;
        this.f10870 = textView;
        this.f10868 = textView2;
        this.f10876 = c01724;
        this.f10894 = textView3;
        this.f10880 = c01725;
        this.f10877 = c14173;
        this.f10891 = c01726;
        this.f10875 = c1213;
        this.f10883 = view;
        this.f10882 = textView4;
        this.f10879 = c01727;
        this.f10874 = c01728;
        this.f10897 = textView5;
        this.f10878 = textView6;
        this.f10871 = handler;
        this.f10887 = c14174;
        this.f10867 = dialog;
        this.f10889 = linkedHashMap;
        this.f10890 = enumC2529;
        this.f10893 = textView7;
        this.f10886 = textView8;
    }

    @Override // android.view.View.OnTouchListener
    public final native boolean onTouch(View view, MotionEvent motionEvent);
}
