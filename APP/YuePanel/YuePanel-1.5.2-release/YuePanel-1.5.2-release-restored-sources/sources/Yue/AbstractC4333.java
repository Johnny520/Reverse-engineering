package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7147
@InterfaceC8405(markerClass = {InterfaceC4772.class})
@InterfaceC7470(version = "1.7")
public abstract class AbstractC4333<T, R> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۨۥ۠.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC4333(C4335 c4335) {
        this();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public abstract <U, S> Object mo1301(@InterfaceC6399 C4331<U, S> c4331, U u, @InterfaceC6399 InterfaceC4199<? super S> interfaceC4199);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public abstract Object mo1302(T t, @InterfaceC6399 InterfaceC4199<? super R> interfaceC4199);

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @InterfaceC7097(expression = "this.callRecursive(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Void m12580(@InterfaceC6399 C4331<?, ?> c4331, @InterfaceC6489 Object obj) {
        C5499.m17103(c4331, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC4333() {
    }
}
