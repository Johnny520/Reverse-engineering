package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7243 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7243 f2761 = new C7243();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7075 f2762;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f2762 = new C7075("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
