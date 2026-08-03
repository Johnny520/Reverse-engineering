package Yue;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4148 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f8481 = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f8482 = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: ۥ */
    public final Object f714;

    /* JADX INFO: renamed from: ۥ۟ */
    public final View f715;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ */
    @InterfaceC7113(23)
    public static class C0340 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Bundle m1105(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0341 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static AutofillId m1106(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ViewStructure m1107(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ViewStructure m12018(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m12019(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m12020(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m12021(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C4149 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1108(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @InterfaceC7113(29)
    public C4148(@InterfaceC6391 ContentCaptureSession contentCaptureSession, @InterfaceC6391 View view) {
        this.f714 = contentCaptureSession;
        this.f715 = view;
    }

    @InterfaceC6391
    @InterfaceC7113(29)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4148 m12013(@InterfaceC6391 ContentCaptureSession contentCaptureSession, @InterfaceC6391 View view) {
        return new C4148(contentCaptureSession, view);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public AutofillId m1103(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM1102 = C4147.m1102(this.f714);
        C3502 c3502M27340 = C8273.m27340(this.f715);
        Objects.requireNonNull(c3502M27340);
        return C0341.m1106(contentCaptureSessionM1102, c3502M27340.m560(), j);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public C8362 m1104(@InterfaceC6391 AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C8362.m27902(C0341.m12018(C4147.m1102(this.f714), autofillId, j));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12014(@InterfaceC6391 AutofillId autofillId, @InterfaceC6490 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0341.m12020(C4147.m1102(this.f714), autofillId, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12015(@InterfaceC6391 List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C4149.m1108(C4147.m1102(this.f714), list);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM1107 = C0341.m1107(C4147.m1102(this.f714), this.f715);
            C0340.m1105(viewStructureM1107).putBoolean(f8481, true);
            C0341.m12019(C4147.m1102(this.f714), viewStructureM1107);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C0341.m12019(C4147.m1102(this.f714), list.get(i2));
            }
            ViewStructure viewStructureM11072 = C0341.m1107(C4147.m1102(this.f714), this.f715);
            C0340.m1105(viewStructureM11072).putBoolean(f8482, true);
            C0341.m12019(C4147.m1102(this.f714), viewStructureM11072);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12016(@InterfaceC6391 long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession contentCaptureSessionM1102 = C4147.m1102(this.f714);
            C3502 c3502M27340 = C8273.m27340(this.f715);
            Objects.requireNonNull(c3502M27340);
            C0341.m12021(contentCaptureSessionM1102, c3502M27340.m560(), jArr);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM1107 = C0341.m1107(C4147.m1102(this.f714), this.f715);
            C0340.m1105(viewStructureM1107).putBoolean(f8481, true);
            C0341.m12019(C4147.m1102(this.f714), viewStructureM1107);
            ContentCaptureSession contentCaptureSessionM11022 = C4147.m1102(this.f714);
            C3502 c3502M273402 = C8273.m27340(this.f715);
            Objects.requireNonNull(c3502M273402);
            C0341.m12021(contentCaptureSessionM11022, c3502M273402.m560(), jArr);
            ViewStructure viewStructureM11072 = C0341.m1107(C4147.m1102(this.f714), this.f715);
            C0340.m1105(viewStructureM11072).putBoolean(f8482, true);
            C0341.m12019(C4147.m1102(this.f714), viewStructureM11072);
        }
    }

    @InterfaceC6391
    @InterfaceC7113(29)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public ContentCaptureSession m12017() {
        return C4147.m1102(this.f714);
    }
}
