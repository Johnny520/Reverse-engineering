package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5387
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
@Yue.InterfaceC5792(version = "1.7")
public abstract class AbstractC1766<T, R> {
    public AbstractC1766() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ AbstractC1766(Yue.C1769 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract <U, S> java.lang.Object mo8429(@Yue.InterfaceC4418 Yue.C1764<U, S> r1, U r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super S> r3);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract java.lang.Object mo8430(T r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super R> r2);

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @Yue.InterfaceC5313(expression = "this.callRecursive(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.Void m8431(@Yue.InterfaceC4418 Yue.C1764<?, ?> r1, @Yue.InterfaceC4543 java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r1, r2)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called from DeepRecursiveScope"
            r1.<init>(r2)
            throw r1
    }
}
