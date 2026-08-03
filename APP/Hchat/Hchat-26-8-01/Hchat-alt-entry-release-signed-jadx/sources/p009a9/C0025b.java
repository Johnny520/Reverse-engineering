package p009a9;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p085fg.InterfaceC1220a;
import p119i2.AbstractC1938m;

/* JADX INFO: renamed from: a9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025b extends ClickableSpan {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f80g = 0;

    /* JADX INFO: renamed from: h */
    public final Object f81h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0025b(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        this.f81h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f80g) {
            case 0:
                view.getClass();
                ((InterfaceC1220a) this.f81h).invoke();
                break;
            default:
                ((AbstractC1938m) this.f81h).getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f80g) {
            case 0:
                textPaint.getClass();
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C0025b(AbstractC1938m abstractC1938m) {
        this.f81h = abstractC1938m;
    }
}
