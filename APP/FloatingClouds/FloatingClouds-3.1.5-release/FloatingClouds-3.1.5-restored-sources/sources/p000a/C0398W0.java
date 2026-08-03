package p000a;

import android.view.KeyEvent;
import androidx.appcompat.app.DialogInterfaceC0989b;

/* JADX INFO: renamed from: a.W0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0398W0 implements InterfaceC0840t9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceC0989b f1525a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.X0.<init>(android.view.ContextThemeWrapper, int):void] */
    public /* synthetic */ C0398W0(DialogInterfaceC0989b dialogInterfaceC0989b) {
        this.f1525a = dialogInterfaceC0989b;
    }

    @Override // p000a.InterfaceC0840t9
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1525a.m1060e(keyEvent);
    }
}
