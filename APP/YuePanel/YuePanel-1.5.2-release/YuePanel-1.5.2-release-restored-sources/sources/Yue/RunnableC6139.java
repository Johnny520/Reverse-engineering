package Yue;

import Yue.C6144;
import android.content.Context;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6139 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ List f14906;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ C4464 f14907;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ C6144.EnumC6148 f14908;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ Context f14909;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ C6144.EnumC0915 f14910;

    static {
        NativeUtil.classesInit0(111);
    }

    public /* synthetic */ RunnableC6139(List list, C4464 c4464, C6144.EnumC6148 enumC6148, Context context, C6144.EnumC0915 enumC0915) {
        this.f14906 = list;
        this.f14907 = c4464;
        this.f14908 = enumC6148;
        this.f14909 = context;
        this.f14910 = enumC0915;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
