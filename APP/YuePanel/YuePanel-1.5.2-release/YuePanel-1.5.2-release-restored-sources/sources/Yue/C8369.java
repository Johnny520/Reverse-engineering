package Yue;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8369 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۧ$ۥ */
    public class C1506 implements RequestListener<Bitmap> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Context f24969;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ View f24970;

        static {
            NativeUtil.classesInit0(1114);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C1506(Context context, View view) {
            this.f24969 = context;
            this.f24970 = view;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public native boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.bumptech.glide.request.target.Target, com.bumptech.glide.load.DataSource, boolean] */
        @Override // com.bumptech.glide.request.RequestListener
        public native /* bridge */ /* synthetic */ boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z);

        /* JADX INFO: renamed from: ۥ */
        public native boolean m4342(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z);
    }

    static {
        NativeUtil.classesInit0(692);
    }

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4340(TextView textView, ValueAnimator valueAnimator);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4341(View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m27911(TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m27912(View view, List<FrameLayout> list);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native FrameLayout m27913(List<FrameLayout> list);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native List<Integer> m27914(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native List<View> m27915(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native List<View> m27916(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native <T extends View> T m27917(View view, Class<T> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native List<View> m27918(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native View m27919(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native boolean m27920(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m27921(View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m27922(TextView textView, ValueAnimator valueAnimator);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m27923(Context context, ImageView imageView, Object obj, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native void m27924(View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native void m27925(TextView textView, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native void m27926(View view, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native void m27927(ViewGroup viewGroup, List<View> list);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m27928(View view, List<View> list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m27929(View view, List<View> list);
}
