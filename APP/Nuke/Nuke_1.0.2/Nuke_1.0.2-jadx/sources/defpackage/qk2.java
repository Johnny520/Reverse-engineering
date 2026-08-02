package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk2 extends yn0 implements in0 {
    public static final qk2 o = new qk2(1, pv2.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        String str = (String) obj;
        str.getClass();
        return Boolean.valueOf(str.length() > 0);
    }
}
