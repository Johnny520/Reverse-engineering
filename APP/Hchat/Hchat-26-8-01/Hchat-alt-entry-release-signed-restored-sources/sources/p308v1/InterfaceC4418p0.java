package p308v1;

import java.util.Map;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: v1.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4418p0 extends InterfaceC4414o {
    /* JADX INFO: renamed from: D0 */
    InterfaceC4415o0 mo8008D0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    default InterfaceC4415o0 mo8010z(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l) {
        return mo8008D0(i9, i10, map, null, interfaceC1231l);
    }
}
