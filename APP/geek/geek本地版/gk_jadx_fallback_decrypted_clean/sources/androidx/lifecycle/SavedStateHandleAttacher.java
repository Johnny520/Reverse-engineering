package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements defpackage.mq {
    public final defpackage.p10 a;

    public SavedStateHandleAttacher(defpackage.p10 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.mq
    public final void b(defpackage.oq r2, defpackage.iq r3) {
            r1 = this;
            iq r0 = defpackage.iq.ON_CREATE
            if (r3 != r0) goto L27
            androidx.lifecycle.a r2 = r2.e()
            r2.f(r1)
            p10 r2 = r1.a
            boolean r3 = r2.b
            if (r3 != 0) goto L26
            a3 r3 = r2.a
            java.lang.String r0 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r3 = r3.c(r0)
            r2.c = r3
            r3 = 1
            r2.b = r3
            o50 r2 = r2.d
            java.lang.Object r2 = r2.a()
            q10 r2 = (defpackage.q10) r2
        L26:
            return
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Next event must be ON_CREATE, it was "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
