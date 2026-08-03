package p142jg;

import java.util.Random;

/* JADX INFO: renamed from: jg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2133a extends AbstractC2136d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2136d
    /* JADX INFO: renamed from: a */
    public final int mo5356a(int i9) {
        return ((-i9) >> 31) & (mo5359f().nextInt() >>> (32 - i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2136d
    /* JADX INFO: renamed from: b */
    public final int mo5357b() {
        return mo5359f().nextInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2136d
    /* JADX INFO: renamed from: d */
    public final long mo5358d() {
        return mo5359f().nextLong();
    }

    /* JADX INFO: renamed from: f */
    public abstract Random mo5359f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m5360g(int i9) {
        return mo5359f().nextInt(i9);
    }
}
