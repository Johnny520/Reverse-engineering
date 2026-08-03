package Yue;

import Yue.C8336;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4067 implements C8336.InterfaceC8348 {

    /* JADX INFO: renamed from: ۥ */
    public final List<C8336.InterfaceC8348> f645 = new ArrayList();

    @Override // Yue.C8336.InterfaceC8348
    /* JADX INFO: renamed from: ۥ */
    public void mo1019(@InterfaceC6391 View view, float f) {
        Iterator<C8336.InterfaceC8348> it = this.f645.iterator();
        while (it.hasNext()) {
            it.next().mo1019(view, f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1020(@InterfaceC6391 C8336.InterfaceC8348 interfaceC8348) {
        this.f645.add(interfaceC8348);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m11500(@InterfaceC6391 C8336.InterfaceC8348 interfaceC8348) {
        this.f645.remove(interfaceC8348);
    }
}
