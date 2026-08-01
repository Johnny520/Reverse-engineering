package me.yun.fkwechat.loader.entry;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m16758d2 = {"Lme/yun/fkwechat/loader/entry/Xp82Entry;", "Lde/robv/android/xposed/IXposedHookLoadPackage;", "<init>", "()V", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "lpparam", "Ll8/i0;", "handleLoadPackage", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class Xp82Entry implements IXposedHookLoadPackage {
    public static final int $stable = 0;

    static {
        FkwLoader.registerNativesForClass(37, Xp82Entry.class);
        Hidden0.special_clinit_37_00(Xp82Entry.class);
    }

    public native void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam);
}
