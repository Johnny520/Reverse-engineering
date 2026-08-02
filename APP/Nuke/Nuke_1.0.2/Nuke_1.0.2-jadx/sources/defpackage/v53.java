package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v53 {
    public static final l53 A;
    public static final ag0 B;
    public static final l53 a;
    public static final l53 b;
    public static final p53 c;
    public static final n53 d;
    public static final n53 e;
    public static final n53 f;
    public static final n53 g;
    public static final l53 h;
    public static final l53 i;
    public static final l53 j;
    public static final t43 k;
    public static final n53 l;
    public static final y43 m;
    public static final z43 n;
    public static final a53 o;
    public static final l53 p;
    public static final l53 q;
    public static final l53 r;
    public static final l53 s;
    public static final l53 t;
    public static final l53 u;
    public static final l53 v;
    public static final l53 w;
    public static final bs1 x;
    public static final l53 y;
    public static final q31 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 0;
        a = new l53(Class.class, new c53().a(), i2);
        b = new l53(BitSet.class, new m53().a(), i2);
        o53 o53Var = new o53();
        c = new p53();
        d = new n53(Boolean.TYPE, Boolean.class, o53Var);
        e = new n53(Byte.TYPE, Byte.class, new q53());
        f = new n53(Short.TYPE, Short.class, new r53());
        g = new n53(Integer.TYPE, Integer.class, new s53());
        h = new l53(AtomicInteger.class, new t53().a(), i2);
        i = new l53(AtomicBoolean.class, new u53().a(), i2);
        j = new l53(AtomicIntegerArray.class, new s43().a(), i2);
        k = new t43();
        new u43();
        new v43();
        l = new n53(Character.TYPE, Character.class, new w43());
        x43 x43Var = new x43();
        m = new y43();
        n = new z43();
        o = new a53();
        p = new l53(String.class, x43Var, i2);
        q = new l53(StringBuilder.class, new b53(), i2);
        r = new l53(StringBuffer.class, new d53(), i2);
        s = new l53(URL.class, new e53(), i2);
        t = new l53(URI.class, new f53(), i2);
        int i3 = 1;
        u = new l53(InetAddress.class, new g53(), i3);
        v = new l53(UUID.class, new h53(), i2);
        w = new l53(Currency.class, new i53().a(), i2);
        x = new bs1(new j53(), i3);
        y = new l53(Locale.class, new k53(), i2);
        q31 q31Var = q31.a;
        z = q31Var;
        A = new l53(k31.class, q31Var, i3);
        B = bg0.d;
    }
}
