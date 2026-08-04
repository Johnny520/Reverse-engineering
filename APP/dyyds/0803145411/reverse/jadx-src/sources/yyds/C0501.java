package yyds;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛲᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0501 extends WeakReference {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1410 f2439;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f2440;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public InterfaceC2162 f2441;

    public C0501(InterfaceC1410 interfaceC1410, C2061 c2061, ReferenceQueue referenceQueue) {
        super(c2061, referenceQueue);
        AbstractC0319.m992(interfaceC1410, "Argument must not be null");
        this.f2439 = interfaceC1410;
        boolean z = c2061.f10207;
        this.f2441 = null;
        this.f2440 = z;
    }
}
