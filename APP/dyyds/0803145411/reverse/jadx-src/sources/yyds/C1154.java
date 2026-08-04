package yyds;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛵᛸᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1154 implements InterfaceC2494, InterfaceC1643 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f5303;

    public /* synthetic */ C1154(Toolbar toolbar) {
        this.f5303 = toolbar;
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public boolean mo381(MenuC0836 menuC0836, MenuItem menuItem) {
        return false;
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo407(MenuC0836 menuC0836) {
        Toolbar toolbar = this.f5303;
        C1313 c1313 = toolbar.f234.f139;
        if (c1313 == null || !c1313.m2603()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f240.f10074).iterator();
            if (it.hasNext()) {
                ((AbstractC0624) it.next()).getClass();
                throw null;
            }
        }
    }
}
