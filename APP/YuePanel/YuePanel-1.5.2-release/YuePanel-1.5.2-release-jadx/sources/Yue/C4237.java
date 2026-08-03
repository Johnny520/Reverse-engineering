package Yue;

import Yue.InterfaceC4225;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class C4237 extends AbstractC2981 implements InterfaceC7774<String> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0364 f8590 = new C0364(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f8591;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧۡ$ۥ */
    public static final class C0364 implements InterfaceC4225.InterfaceC4228<C4237> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۧۧۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0364(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0364() {
        }
    }

    public C4237(long j) {
        super(f8590);
        this.f8591 = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ C4237 m12177(C4237 c4237, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4237.f8591;
        }
        return c4237.m12181(j);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4237) && this.f8591 == ((C4237) obj).f8591;
    }

    public int hashCode() {
        return Long.hashCode(this.f8591);
    }

    @InterfaceC6399
    public String toString() {
        return "CoroutineId(" + this.f8591 + ')';
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final long m12180() {
        return this.f8591;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final C4237 m12181(long j) {
        return new C4237(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final long m12182() {
        return this.f8591;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۢۨ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V */
    @Override // Yue.InterfaceC7774
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo12179(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 String str) {
        Thread.currentThread().setName(str);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۦ(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC7774
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String mo12178(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        String strM12188;
        C4238 c4238 = (C4238) interfaceC4225.get(C4238.f8592);
        if (c4238 == null || (strM12188 = c4238.m12188()) == null) {
            strM12188 = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iM24071 = C7628.m24071(name, C4230.f749, 0, false, 6, null);
        if (iM24071 < 0) {
            iM24071 = name.length();
        }
        StringBuilder sb = new StringBuilder(strM12188.length() + iM24071 + 10);
        String strSubstring = name.substring(0, iM24071);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(C4230.f749);
        sb.append(strM12188);
        sb.append('#');
        sb.append(this.f8591);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name;
    }
}
