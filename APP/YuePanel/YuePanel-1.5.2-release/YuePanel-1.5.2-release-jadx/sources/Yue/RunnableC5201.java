package Yue;

import Yue.C5208;
import android.content.Context;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5201 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Context f12306;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12307;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ C5208.InterfaceC5212 f12308;

    static {
        NativeUtil.classesInit0(884);
    }

    public /* synthetic */ RunnableC5201(Context context, GridGestureConfig gridGestureConfig, C5208.InterfaceC5212 interfaceC5212) {
        this.f12306 = context;
        this.f12307 = gridGestureConfig;
        this.f12308 = interfaceC5212;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
