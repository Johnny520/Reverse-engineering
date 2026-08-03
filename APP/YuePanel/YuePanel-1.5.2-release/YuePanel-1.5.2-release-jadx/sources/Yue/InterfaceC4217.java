package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4217 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0354 f744 = C0354.f746;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC4217 f745 = new C0354.C4218();

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦ$ۥ */
    public static final class C0354 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C0354 f746 = new C0354();

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4218 implements InterfaceC4217 {
            @Override // Yue.InterfaceC4217
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public List<C4216> mo1180(@InterfaceC6399 C5385 c5385) {
                C5499.m17103(c5385, "url");
                return C3880.m10735();
            }

            @Override // Yue.InterfaceC4217
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo1181(@InterfaceC6399 C5385 c5385, @InterfaceC6399 List<C4216> list) {
                C5499.m17103(c5385, "url");
                C5499.m17103(list, "cookies");
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    List<C4216> mo1180(@InterfaceC6399 C5385 c5385);

    /* JADX INFO: renamed from: ۥ۟ */
    void mo1181(@InterfaceC6399 C5385 c5385, @InterfaceC6399 List<C4216> list);
}
