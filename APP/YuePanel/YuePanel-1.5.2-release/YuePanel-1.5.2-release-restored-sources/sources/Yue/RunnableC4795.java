package Yue;

import android.view.MotionEvent;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4795 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ View f10726;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f10727;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f10728;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f10729;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f10730;

    static {
        NativeUtil.classesInit0(87);
    }

    public /* synthetic */ RunnableC4795(View view, MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, MotionEvent motionEvent4) {
        this.f10726 = view;
        this.f10727 = motionEvent;
        this.f10728 = motionEvent2;
        this.f10729 = motionEvent3;
        this.f10730 = motionEvent4;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
