package Yue;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7691 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3021;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۟$ۥ */
    public class ViewOnTouchListenerC1326 implements View.OnTouchListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public float f23176;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public float f23177;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public float f23178;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f23179;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public View f23180;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ ViewGroup f23181;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ View f23182;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ float f23183;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ int f23184;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC1327 f23185;

        static {
            NativeUtil.classesInit0(782);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewOnTouchListenerC1326(ViewGroup viewGroup, View view, float f, int i, InterfaceC1327 interfaceC1327) {
            this.f23181 = viewGroup;
            this.f23182 = view;
            this.f23183 = f;
            this.f23184 = i;
            this.f23185 = interfaceC1327;
        }

        @Override // android.view.View.OnTouchListener
        public native boolean onTouch(View view, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۟$ۥ۟ */
    public interface InterfaceC1327 {
        /* JADX INFO: renamed from: ۥ */
        void mo2677();
    }

    static {
        NativeUtil.classesInit0(738);
        f3021 = View.generateViewId();
    }

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ View m3785(ViewGroup viewGroup, float f, float f2, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3786(View view, MotionEvent motionEvent, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m24460(View view, InterfaceC1327 interfaceC1327);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m24461(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m24462(View view, InterfaceC1327 interfaceC1327);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m24463(ViewGroup viewGroup, View view, InterfaceC1327 interfaceC1327);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m24464(View view, MotionEvent motionEvent, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native float m24465(View view, float f);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native View m24466(ViewGroup viewGroup, float f, float f2, View view);
}
