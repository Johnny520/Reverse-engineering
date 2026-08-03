package p023b8;

import java.io.StringWriter;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: b8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210h extends AbstractC0212j {

    /* JADX INFO: renamed from: h */
    public String f517h = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: a */
    public final int mo881a() {
        return this.f517h.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: c */
    public final AbstractC0212j mo873c() {
        return (AbstractC0213k) this.f518g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: g */
    public final int mo888g() {
        return this.f517h.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    /* JADX INFO: renamed from: k */
    public final void mo874k(StringWriter stringWriter, boolean z9) {
        stringWriter.append((CharSequence) this.f517h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j
    public final String toString() {
        return this.f517h;
    }
}
