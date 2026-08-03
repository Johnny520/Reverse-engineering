package Yue;

import Yue.C4152;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C5440 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1510 = "InputConnectionCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1511 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f13354 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f13355 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f13356 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f13357 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f13358 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f13359 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f13360 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f13361 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f13362 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f13363 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f13364 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f13365 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f13366 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f13367 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f13368 = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ */
    public class C0761 extends InputConnectionWrapper {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5442 f1512;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0761(InputConnection inputConnection, boolean z, InterfaceC5442 interfaceC5442) {
            super(inputConnection, z);
            this.f1512 = interfaceC5442;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f1512.mo2210(C5443.m16938(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟ */
    public class C0762 extends InputConnectionWrapper {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5442 f1513;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0762(InputConnection inputConnection, boolean z, InterfaceC5442 interfaceC5442) {
            super(inputConnection, z);
            this.f1513 = interfaceC5442;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C5440.m16936(str, bundle, this.f1513)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(25)
    public static class C5441 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2213(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC5442 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo2210(@InterfaceC6391 C5443 c5443, int i, @InterfaceC6490 Bundle bundle);
    }

    @Deprecated
    public C5440() {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2212(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo, @InterfaceC6391 C5443 c5443, int i, @InterfaceC6490 Bundle bundle) {
        return C5441.m2213(inputConnection, (InputContentInfo) c5443.m16942(), i, bundle);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static InterfaceC5442 m16933(@InterfaceC6391 final View view) {
        C6740.m21415(view);
        return new InterfaceC5442() { // from class: Yue.ۥ۠ۥۢۤ
            @Override // Yue.C5440.InterfaceC5442
            /* JADX INFO: renamed from: ۥ */
            public final boolean mo2210(C5443 c5443, int i, Bundle bundle) {
                return C5440.m16937(view, c5443, i, bundle);
            }
        };
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InputConnection m16934(@InterfaceC6391 View view, @InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
        return m16935(inputConnection, editorInfo, m16933(view));
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static InputConnection m16935(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo, @InterfaceC6391 InterfaceC5442 interfaceC5442) {
        C6499.m20593(inputConnection, "inputConnection must be non-null");
        C6499.m20593(editorInfo, "editorInfo must be non-null");
        C6499.m20593(interfaceC5442, "onCommitContentListener must be non-null");
        return new C0761(inputConnection, false, interfaceC5442);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: android.os.ResultReceiver */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m16936(@InterfaceC6490 String str, @InterfaceC6490 Bundle bundle, @InterfaceC6391 InterfaceC5442 interfaceC5442) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        ?? Mo2210 = 0;
        Mo2210 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f1511, str)) {
            z = false;
        } else {
            if (!TextUtils.equals(f13354, str)) {
                return false;
            }
            z = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z ? f13366 : f13365);
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? f13356 : f13355);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? f13358 : f13357);
                Uri uri2 = (Uri) bundle.getParcelable(z ? f13360 : f13359);
                int i = bundle.getInt(z ? f13364 : f13363);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? f13362 : f13361);
                if (uri != null && clipDescription != null) {
                    Mo2210 = interfaceC5442.mo2210(new C5443(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(Mo2210, null);
                }
                return Mo2210;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m16937(View view, C5443 c5443, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                c5443.m16941();
                Parcelable parcelable = (Parcelable) c5443.m16942();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f13368, parcelable);
            } catch (Exception e) {
                Log.w(f1510, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return C8273.m27424(view, new C4152.C0343(new ClipData(c5443.m2215(), new ClipData.Item(c5443.m2214())), 2).m12035(c5443.m16939()).m12033(bundle).m1113()) == null;
    }
}
