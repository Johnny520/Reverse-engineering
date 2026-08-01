package me.yun.fkwechat.loader.entry;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m16758d2 = {"Lme/yun/fkwechat/loader/entry/Xp102Entry;", "Lio/github/libxposed/api/XposedModule;", "<init>", "()V", "Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;", "param", "Ll8/i0;", "onPackageLoaded", "(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class Xp102Entry extends XposedModule {
    public static final int $stable = 8;

    static {
        FkwLoader.registerNativesForClass(36, Xp102Entry.class);
        Hidden0.special_clinit_36_00(Xp102Entry.class);
    }

    public native void onPackageLoaded(XposedModuleInterface.PackageLoadedParam param);
}
