package Yue;

import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "-InflaterSourceExtensions")
public final class C2958 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final C5432 m19(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Inflater inflater) {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(inflater, "inflater");
        return new C5432(interfaceC7506, inflater);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ C5432 m20(InterfaceC7506 interfaceC7506, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(inflater, "inflater");
        return new C5432(interfaceC7506, inflater);
    }
}
