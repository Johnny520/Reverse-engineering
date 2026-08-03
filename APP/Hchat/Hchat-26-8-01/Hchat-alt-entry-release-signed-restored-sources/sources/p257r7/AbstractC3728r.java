package p257r7;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: r7.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3728r extends AbstractC3712b {

    /* JADX INFO: renamed from: n */
    public static final CharsetDecoder f12100n = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: m */
    public String f12101m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public final void mo7712L() {
        this.f12101m = mo7721N(this.f12076k);
    }

    /* JADX INFO: renamed from: N */
    public abstract String mo7721N(byte[] bArr);
}
