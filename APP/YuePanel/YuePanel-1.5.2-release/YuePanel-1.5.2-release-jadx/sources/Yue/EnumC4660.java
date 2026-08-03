package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4660 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0465 f9988 = new C0465(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f10004;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۢ$ۥ */
    @InterfaceC7507({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class C0465 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۡ۠ۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0465(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final EnumC4660 m1615(int i) {
            for (EnumC4660 enumC4660 : EnumC4660.values()) {
                if (enumC4660.m14003() == i) {
                    return enumC4660;
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0465() {
        }
    }

    EnumC4660(int i) {
        this.f10004 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m14003() {
        return this.f10004;
    }
}
