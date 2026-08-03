package p080fb;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;
import java.util.Set;
import p054dg.AbstractC0793l;
import p345x8.C5724q;

/* JADX INFO: renamed from: fb.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1129h1 implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3695a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f3695a) {
            case 0:
                if (!file.isFile() || !AbstractC0793l.m2023c0(file).equals("json")) {
                }
                break;
            default:
                if (file.isFile()) {
                    Set set = C5724q.f23308l;
                    String lowerCase = AbstractC0793l.m2023c0(file).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (set.contains(lowerCase)) {
                    }
                }
                break;
        }
        return false;
    }
}
