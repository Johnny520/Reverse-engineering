package p000;

import io.github.cherrywechat.lua.loader.ScriptLoader;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: px */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2390px implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8392a;

    public /* synthetic */ C2390px(int i) {
        this.f8392a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f8392a) {
            case 0:
                return ScriptLoader.listScripts$lambda$2(file);
            default:
                return file.isDirectory();
        }
    }
}
