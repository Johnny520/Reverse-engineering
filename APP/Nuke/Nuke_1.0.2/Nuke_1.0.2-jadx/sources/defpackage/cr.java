package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cr {
    public static final br Companion = new br();
    public static final j71[] b = {p7.B(i91.h, new c0(18))};
    public final List a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cr(int i, List list) {
        if ((i & 1) == 0) {
            this.a = be0.h;
        } else {
            this.a = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr) && t11.l(this.a, ((cr) obj).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ChatAutoReplyConf(tasks=" + this.a + ")";
    }

    public cr(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (wrap:be0:0x0000: SGET  A[WRAPPED] (LINE:18) be0.h be0) A[MD:(java.util.List):void (m)] (LINE:19) call: cr.<init>(java.util.List):void type: THIS */
    public /* synthetic */ cr() {
        this(be0.h);
    }
}
