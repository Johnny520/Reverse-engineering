package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements Serializable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i00() {
        this.a = 0;
    }

    public static d4 a(i00 r1, String r2) {
        r1.getClass();
        ip.o("input", r2);
        Matcher r12 = ((Pattern) r1.b).matcher(r2);
        ip.n("matcher(...)", r12);
        if (r12.find(0) == true) goto L7;
        return null;
    L7:
        return new d4(r12, r2);
    }

    public final String toString() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        String r0 = ((Pattern) this.b).toString();
        ip.n("toString(...)", r0);
        return r0;
    L7:
        return String.valueOf(this.b);
    }

    public i00(String r2) {
        this.a = 1;
        ip.o("pattern", r2);
        Pattern r22 = Pattern.compile(r2);
        ip.n("compile(...)", r22);
        this.b = r22;
    }
}
