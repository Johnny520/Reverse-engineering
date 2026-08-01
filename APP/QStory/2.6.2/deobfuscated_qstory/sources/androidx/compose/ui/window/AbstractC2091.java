package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.C1358;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2091 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1358 f6197 = new C1358(new InterfaceC6542() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // p052.InterfaceC6542
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1358 f6196 = new C1358(new InterfaceC6542() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalIsInPopupLayout$1
        @Override // p052.InterfaceC6542
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3824(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3825(androidx.compose.ui.window.InterfaceC2100 r23, p052.InterfaceC6542 r24, androidx.compose.ui.window.C2090 r25, final p052.InterfaceC6553 r26, androidx.compose.runtime.InterfaceC1373 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AbstractC2091.m3825(androidx.compose.ui.window.飘花落叶言子楪兰哲苏世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰, androidx.compose.ui.window.飘花落叶言子世楪苏哲兰, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }
}
