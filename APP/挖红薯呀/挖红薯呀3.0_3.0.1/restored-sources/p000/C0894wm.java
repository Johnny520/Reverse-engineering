package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: wm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0894wm implements p01 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f7147a;

    /* JADX INFO: renamed from: b */
    public final int f7148b;

    /* JADX INFO: renamed from: c */
    public final C0956ya f7149c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0894wm(CharSequence charSequence, int i, C0956ya c0956ya) {
        charSequence.getClass();
        this.f7147a = charSequence;
        this.f7148b = i;
        this.f7149c = c0956ya;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.p01
    public final Iterator iterator() {
        return new C0857vm(this);
    }
}
