package Yue;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8306 {

    /* JADX INFO: renamed from: ۥ */
    public static final Handler f3392;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3393;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۤ$ۥ */
    public interface InterfaceC1477 {
        /* JADX INFO: renamed from: ۥ */
        void m4283(@InterfaceC6391 C1478 c1478);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۤ$ۥ۟ */
    public static class C1478 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f24783 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f24784 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f24785 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f24786 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f24787 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final C1478 f24788;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final C1478 f24789;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final C1478 f24790;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24791;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24792;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24793;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24794;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24795;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24796;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24797;

        /* JADX INFO: renamed from: ۥ */
        public final int f3394;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public final View f3395;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f24798;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final RecyclerView.AbstractC8938 f24799;

        static {
            NativeUtil.classesInit0(919);
            f24788 = new C1478(4, null, -1, null);
            f24789 = new C1478(3, null, -1, null);
            f24790 = new C1478(3, null, -1, null);
        }

        public C1478(int i, @InterfaceC6490 View view, int i2, @InterfaceC6490 RecyclerView.AbstractC8938 abstractC8938) {
            this.f3394 = i;
            this.f3395 = view;
            this.f24798 = i2;
            this.f24799 = abstractC8938;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native C1478 m27672(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native C1478 m27673(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static native C1478 m27674(View view, int i, RecyclerView.AbstractC8938 abstractC8938);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static native C1478 m27675(int i);

        @InterfaceC6391
        public native String toString();

        /* JADX INFO: renamed from: ۥ */
        public native boolean m4284();

        /* JADX INFO: renamed from: ۥ۟ */
        public native boolean m4285();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native boolean m27676();
    }

    static {
        NativeUtil.classesInit0(365);
        f3392 = new Handler(Looper.getMainLooper());
    }

    public C8306() {
        throw new UnsupportedOperationException(yue_xin_awa(0));
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4281(RecyclerView recyclerView, Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4282(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27653(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native C1478 m27654(GridLayoutManager gridLayoutManager, int i, float f, float f2);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native C1478 m27655(LinearLayoutManager linearLayoutManager, int i, float f, float f2);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native C1478 m27656(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, float f, float f2);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native C1478 m27657(RecyclerView.AbstractC8919 abstractC8919, int i, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native int m27658(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m27659(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native View m27660(RecyclerView recyclerView, float f, float f2);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native View m27661(ViewGroup viewGroup, float f, float f2);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native RecyclerView m27662(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native void m27663(Activity activity, MotionEvent motionEvent, InterfaceC1477 interfaceC1477);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native void m27664(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m27665(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native C1478 m27666(RecyclerView recyclerView, float f, float f2);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native View m27667(Activity activity, float f, float f2);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native View m27668(ViewGroup viewGroup, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m27669(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m27670(RecyclerView recyclerView, Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m27671(Activity activity, float f, float f2, InterfaceC1477 interfaceC1477, int i);
}
