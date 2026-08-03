package p000;

import io.github.cherrywechat.lua.loader.ScriptLoader;
import io.github.cherrywechat.lua.loader.ScriptPackageManager;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: px */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2390px implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8392a;

    public /* synthetic */ C2390px(int r1) {
        this.f8392a = r1;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File r2) {
        switch(this.f8392a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ScriptPackageManager.m3536a(r2);
    L7:
        return ScriptLoader.m3531a(r2);
    }
}
