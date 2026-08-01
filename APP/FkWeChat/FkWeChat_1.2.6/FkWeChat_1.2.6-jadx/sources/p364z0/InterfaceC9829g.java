package p364z0;

import java.util.Collection;
import java.util.Set;
import p036c9.InterfaceC1401b;
import p036c9.InterfaceC1405f;

/* JADX INFO: renamed from: z0.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9829g extends InterfaceC9826d, InterfaceC9824b {

    /* JADX INFO: renamed from: z0.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a extends Set, Collection, InterfaceC1401b, InterfaceC1405f {
        InterfaceC9829g build();
    }

    InterfaceC9829g add(Object obj);

    InterfaceC9829g addAll(Collection collection);

    a builder();

    InterfaceC9829g remove(Object obj);

    InterfaceC9829g removeAll(Collection collection);
}
