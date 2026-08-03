package p170le;

import af.C0083f;
import java.util.ArrayDeque;
import mh.AbstractC2846d;
import p302ud.C4305a;
import p350xd.AbstractC5774a;

/* JADX INFO: renamed from: le.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2555c {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f8286a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public C2554b f8287b = new C2554b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2555c.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6011a(C4305a c4305a) {
        if (c4305a != null) {
            this.f8287b.f8284a.add(c4305a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6012b() {
        this.f8287b = (C2554b) this.f8286a.pop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6013c(AbstractC5774a abstractC5774a) {
        C2554b c2554b = this.f8287b;
        ArrayDeque arrayDeque = this.f8286a;
        arrayDeque.push(c2554b);
        if (arrayDeque.size() > 1000) {
            throw new C0083f("Regions stack size limit reached");
        }
        C2554b c2554b2 = this.f8287b;
        c2554b2.getClass();
        this.f8287b = new C2554b(c2554b2, abstractC5774a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Region stack size: " + this.f8286a.size() + ", last: " + String.valueOf(this.f8287b);
    }
}
