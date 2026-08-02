package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ir {
    public static final hr Companion;
    public static final j71 h;
    public static final ir i;
    public static final ir j;
    public static final /* synthetic */ ir[] k;
    public static final /* synthetic */ yf0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ir irVar = new ir("TEXT", 0);
        i = irVar;
        ir irVar2 = new ir("IMAGE", 1);
        ir irVar3 = new ir("VOICE", 2);
        j = irVar3;
        ir[] irVarArr = {irVar, irVar2, irVar3};
        k = irVarArr;
        l = new yf0(irVarArr);
        Companion = new hr();
        h = p7.B(i91.h, new c0(21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ir valueOf(String str) {
        return (ir) Enum.valueOf(ir.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ir[] values() {
        return (ir[]) k.clone();
    }
}
