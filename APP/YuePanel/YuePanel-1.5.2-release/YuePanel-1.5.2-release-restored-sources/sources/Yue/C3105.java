package Yue;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3105 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f74 = "android.activity.usage_time";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f75 = "android.usage_time_packages";

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ */
    public static class C0050 extends C3105 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ActivityOptions f4620;

        public C0050(ActivityOptions activityOptions) {
            this.f4620 = activityOptions;
        }

        @Override // Yue.C3105
        /* JADX INFO: renamed from: ۥ */
        public Rect mo201() {
            return C3107.m206(this.f4620);
        }

        @Override // Yue.C3105
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo6336(@InterfaceC6391 PendingIntent pendingIntent) {
            C3106.m6342(this.f4620, pendingIntent);
        }

        @Override // Yue.C3105
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public C3105 mo6337(@InterfaceC6490 Rect rect) {
            return new C0050(C3107.m207(this.f4620, rect));
        }

        @Override // Yue.C3105
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public C3105 mo6338(boolean z) {
            return Build.VERSION.SDK_INT < 34 ? this : new C0050(C3108.m208(this.f4620, z));
        }

        @Override // Yue.C3105
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public Bundle mo6339() {
            return this.f4620.toBundle();
        }

        @Override // Yue.C3105
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo6340(@InterfaceC6391 C3105 c3105) {
            if (c3105 instanceof C0050) {
                this.f4620.update(((C0050) c3105).f4620);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0051 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ActivityOptions m202(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ActivityOptions m203(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ActivityOptions m6341() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static class C3106 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ActivityOptions m204() {
            return ActivityOptions.makeBasic();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ActivityOptions m205(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m6342(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C3107 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Rect m206(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ActivityOptions m207(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C3108 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ActivityOptions m208(ActivityOptions activityOptions, boolean z) {
            return activityOptions.setShareIdentityEnabled(z);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C3105 m200() {
        return new C0050(C3106.m204());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C3105 m6329(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        return new C0050(C3106.m205(view, i, i2, i3, i4));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C3105 m6330(@InterfaceC6391 Context context, int i, int i2) {
        return new C0050(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3105 m6331(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        return new C0050(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C3105 m6332(@InterfaceC6391 Activity activity, @InterfaceC6391 View view, @InterfaceC6391 String str) {
        return new C0050(C0051.m202(activity, view, str));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C3105 m6333(@InterfaceC6391 Activity activity, @InterfaceC6490 C6600<View, String>... c6600Arr) {
        Pair[] pairArr;
        if (c6600Arr != null) {
            pairArr = new Pair[c6600Arr.length];
            for (int i = 0; i < c6600Arr.length; i++) {
                C6600<View, String> c6600 = c6600Arr[i];
                pairArr[i] = Pair.create(c6600.f2165, c6600.f2166);
            }
        } else {
            pairArr = null;
        }
        return new C0050(C0051.m203(activity, pairArr));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C3105 m6334() {
        return new C0050(C0051.m6341());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C3105 m6335(@InterfaceC6391 View view, @InterfaceC6391 Bitmap bitmap, int i, int i2) {
        return new C0050(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public Rect mo201() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo6336(@InterfaceC6391 PendingIntent pendingIntent) {
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C3105 mo6337(@InterfaceC6490 Rect rect) {
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C3105 mo6338(boolean z) {
        return this;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Bundle mo6339() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo6340(@InterfaceC6391 C3105 c3105) {
    }
}
