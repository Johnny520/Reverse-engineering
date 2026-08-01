package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p10 implements defpackage.t10 {
    public final defpackage.a3 a;
    public boolean b;
    public android.os.Bundle c;
    public final defpackage.o50 d;

    public p10(defpackage.a3 r2, androidx.activity.ComponentActivity r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            defpackage.ip.o(r0, r2)
            r1.<init>()
            r1.a = r2
            sw r2 = new sw
            r0 = 3
            r2.<init>(r0, r3)
            o50 r3 = new o50
            r3.<init>(r2)
            r1.d = r3
            return
    }

    @Override // defpackage.t10
    public final android.os.Bundle a() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r3.c
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            o50 r1 = r3.d
            java.lang.Object r1 = r1.a()
            q10 r1 = (defpackage.q10) r1
            java.util.LinkedHashMap r1 = r1.c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L28
            r1 = 0
            r3.b = r1
            return r0
        L28:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }
}
