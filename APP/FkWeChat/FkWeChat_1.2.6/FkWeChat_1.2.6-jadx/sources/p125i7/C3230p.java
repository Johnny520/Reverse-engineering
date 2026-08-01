package p125i7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: i7.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3230p extends ClassLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3230p(ClassLoader classLoader) {
        super(classLoader);
        classLoader.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final List m12279a() {
        Package[] packages = getPackages();
        packages.getClass();
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r02 : packages) {
            arrayList.add(r02.getName());
        }
        return arrayList;
    }
}
