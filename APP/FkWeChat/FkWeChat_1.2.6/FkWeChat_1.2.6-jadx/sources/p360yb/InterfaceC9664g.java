package p360yb;

import java.util.Map;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: yb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9664g extends InterfaceC9661d {

    /* JADX INFO: renamed from: yb.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a extends Map, InterfaceC1404e {
        InterfaceC9664g build();
    }

    a builder();

    InterfaceC9664g put(Object obj, Object obj2);

    InterfaceC9664g remove(Object obj);
}
