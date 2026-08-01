package p222p2;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;
import p191n1.InterfaceC5486o;

/* JADX INFO: renamed from: p2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5943c implements InterfaceC5486o {

    /* JADX INFO: renamed from: a */
    public final Object f18859a;

    /* JADX INFO: renamed from: b */
    public final View f18860b;

    /* JADX INFO: renamed from: p2.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static AutofillId m23892a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        /* JADX INFO: renamed from: b */
        public static ViewStructure m23893b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        /* JADX INFO: renamed from: c */
        public static void m23894c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        /* JADX INFO: renamed from: d */
        public static void m23895d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        /* JADX INFO: renamed from: e */
        public static void m23896e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        /* JADX INFO: renamed from: f */
        public static void m23897f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public C5943c(ContentCaptureSession contentCaptureSession, View view) {
        this.f18859a = contentCaptureSession;
        this.f18860b = view;
    }

    /* JADX INFO: renamed from: f */
    public static C5943c m23891f(ContentCaptureSession contentCaptureSession, View view) {
        return new C5943c(contentCaptureSession, view);
    }

    @Override // p191n1.InterfaceC5486o
    /* JADX INFO: renamed from: a */
    public C5945e mo22299a(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C5945e.m23904i(a.m23893b(AbstractC5942b.m23890a(this.f18859a), autofillId, j10));
        }
        return null;
    }

    @Override // p191n1.InterfaceC5486o
    /* JADX INFO: renamed from: b */
    public void mo22300b(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m23894c(AbstractC5942b.m23890a(this.f18859a), viewStructure);
        }
    }

    @Override // p191n1.InterfaceC5486o
    /* JADX INFO: renamed from: c */
    public AutofillId mo22301c(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM23890a = AbstractC5942b.m23890a(this.f18859a);
        C5941a c5941aM23898a = AbstractC5944d.m23898a(this.f18860b);
        Objects.requireNonNull(c5941aM23898a);
        return a.m23892a(contentCaptureSessionM23890a, c5941aM23898a.m23889a(), j10);
    }

    @Override // p191n1.InterfaceC5486o
    /* JADX INFO: renamed from: d */
    public void mo22302d(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m23895d(AbstractC5942b.m23890a(this.f18859a), autofillId);
        }
    }

    @Override // p191n1.InterfaceC5486o
    /* JADX INFO: renamed from: e */
    public void mo22303e(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m23896e(AbstractC5942b.m23890a(this.f18859a), autofillId, charSequence);
        }
    }

    @Override // p191n1.InterfaceC5486o
    public void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionM23890a = AbstractC5942b.m23890a(this.f18859a);
            C5941a c5941aM23898a = AbstractC5944d.m23898a(this.f18860b);
            Objects.requireNonNull(c5941aM23898a);
            a.m23897f(contentCaptureSessionM23890a, c5941aM23898a.m23889a(), new long[]{Long.MIN_VALUE});
        }
    }
}
