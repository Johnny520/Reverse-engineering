package Yue;

import Yue.C4483;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: renamed from: Yue.ۥۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6386 {
    /* JADX INFO: renamed from: ۥ */
    public static C4483.C0414 m2837(AbstractC6381 abstractC6381) {
        C4483 c4483M19918 = abstractC6381.m19918();
        if (c4483M19918 == null) {
            c4483M19918 = new C4483("");
        }
        return c4483M19918.m13001();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C6617 m2838(AbstractC6381 abstractC6381) {
        C4483 c4483M19918 = abstractC6381.m19918();
        return (c4483M19918 == null || c4483M19918.m13004() == null) ? new C6617(new C5321()) : c4483M19918.m13004();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T extends AbstractC6381> List<T> m19941(String str, C4605 c4605, Class<T> cls) {
        C8159.m26907(str);
        C8159.m26910(c4605);
        C8159.m26910(cls);
        C8403 c8403M28000 = new C8403().m28000(false);
        return c8403M28000.m28004(c8403M28000.m28003(str, c8403M28000.m27995(c8403M28000.m27999(c4605))), cls);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends AbstractC6381> Spliterator<T> m19942(Iterator<T> it) {
        return Spliterators.spliteratorUnknownSize(it, 273);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends AbstractC6381> Stream<T> m19943(AbstractC6381 abstractC6381, Class<T> cls) {
        return StreamSupport.stream(m19942(new C6383(abstractC6381, cls)), false);
    }
}
