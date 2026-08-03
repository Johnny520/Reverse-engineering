package Yue;

import com.nmmedit.protect.NativeUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥۢۤ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8224 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ String[] f24512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f24513;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ List f24514;

    static {
        NativeUtil.classesInit0(296);
    }

    public /* synthetic */ RunnableC8224(String[] strArr, AtomicReference atomicReference, List list) {
        this.f24512 = strArr;
        this.f24513 = atomicReference;
        this.f24514 = list;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
