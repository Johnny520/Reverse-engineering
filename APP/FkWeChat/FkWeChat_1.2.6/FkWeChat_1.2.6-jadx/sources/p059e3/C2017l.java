package p059e3;

import android.text.style.ClickableSpan;
import android.view.View;
import p319w2.AbstractC9083j;
import p319w2.InterfaceC9088k;

/* JADX INFO: renamed from: e3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2017l extends ClickableSpan {

    /* JADX INFO: renamed from: q */
    public final AbstractC9083j f5607q;

    public C2017l(AbstractC9083j abstractC9083j) {
        this.f5607q = abstractC9083j;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        InterfaceC9088k interfaceC9088kMo35303a = this.f5607q.mo35303a();
        if (interfaceC9088kMo35303a != null) {
            interfaceC9088kMo35303a.mo35308a(this.f5607q);
        }
    }
}
