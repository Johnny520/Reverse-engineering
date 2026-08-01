package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qa0 implements p01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5099a;

    /* JADX INFO: renamed from: b */
    public final Object f5100b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qa0(int i, Object obj) {
        this.f5099a = i;
        this.f5100b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.p01
    public final Iterator iterator() {
        switch (this.f5099a) {
            case 0:
                return new pa0(this);
            default:
                return (Iterator) this.f5100b;
        }
    }
}
