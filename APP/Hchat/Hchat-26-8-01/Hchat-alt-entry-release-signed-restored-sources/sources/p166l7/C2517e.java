package p166l7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p241q7.C3445b;
import p298u7.AbstractC4280c;

/* JADX INFO: renamed from: l7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2517e extends C2518f {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C2524l f8144r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2517e(C2524l c2524l) {
        this.f8144r = c2524l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        throw new IOException("Can't read on empty package");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        throw new IOException("Can't write on empty package");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f
    /* JADX INFO: renamed from: U */
    public final int mo5913U() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f
    /* JADX INFO: renamed from: V */
    public final String mo5914V() {
        return "empty-package";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f
    /* JADX INFO: renamed from: Y */
    public final C2524l mo5915Y() {
        return this.f8144r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f, p166l7.InterfaceC2519g
    /* JADX INFO: renamed from: a */
    public final AbstractC4280c mo5916a() {
        return this.f8146p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f, java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(0, ((C2518f) obj).mo5913U());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f
    public final boolean isEmpty() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        return new byte[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2518f, p166l7.AbstractC2513a
    public final String toString() {
        return "empty-package";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public final boolean mo5555y() {
        return true;
    }
}
