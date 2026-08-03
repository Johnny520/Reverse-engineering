package Yue;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6842 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C1096 f2343 = C1096.f2345;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC6842 f2344 = new C1096.C6843();

    /* JADX INFO: renamed from: Yue.ۥۡۥۣۤ$ۥ */
    public static final class C1096 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C1096 f2345 = new C1096();

        /* JADX INFO: renamed from: Yue.ۥۡۥۣۤ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C6843 implements InterfaceC6842 {
            @Override // Yue.InterfaceC6842
            /* JADX INFO: renamed from: ۥ */
            public boolean mo3288(int i, @InterfaceC6399 List<C5255> list) {
                C5499.m17103(list, "requestHeaders");
                return true;
            }

            @Override // Yue.InterfaceC6842
            /* JADX INFO: renamed from: ۥ۟ */
            public boolean mo3289(int i, @InterfaceC6399 InterfaceC3604 interfaceC3604, int i2, boolean z) throws IOException {
                C5499.m17103(interfaceC3604, "source");
                interfaceC3604.skip(i2);
                return true;
            }

            @Override // Yue.InterfaceC6842
            /* JADX INFO: renamed from: ۥ۟۟ */
            public boolean mo21585(int i, @InterfaceC6399 List<C5255> list, boolean z) {
                C5499.m17103(list, "responseHeaders");
                return true;
            }

            @Override // Yue.InterfaceC6842
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public void mo21586(int i, @InterfaceC6399 EnumC4660 enumC4660) {
                C5499.m17103(enumC4660, "errorCode");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    boolean mo3288(int i, @InterfaceC6399 List<C5255> list);

    /* JADX INFO: renamed from: ۥ۟ */
    boolean mo3289(int i, @InterfaceC6399 InterfaceC3604 interfaceC3604, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo21585(int i, @InterfaceC6399 List<C5255> list, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo21586(int i, @InterfaceC6399 EnumC4660 enumC4660);
}
