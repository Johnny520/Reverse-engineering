package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes.dex */
public final class C2122k extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7452a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f7452a) {
            case 0:
                AbstractC0295Gu.m625r(-816954319304757L);
                AbstractC0295Gu.m625r(-816975794141237L);
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 1:
                AbstractC0295Gu.m625r(-817607154333749L);
                AbstractC0295Gu.m625r(-817628629170229L);
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 2:
                AbstractC0295Gu.m625r(-817662988908597L);
                AbstractC0295Gu.m625r(-817684463745077L);
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 3:
                AbstractC0295Gu.m625r(-813110323574837L);
                AbstractC0295Gu.m625r(-813131798411317L);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC0295Gu.m616i(12));
                break;
            default:
                AbstractC0295Gu.m625r(-492529669634101L);
                AbstractC0295Gu.m625r(-492551144470581L);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC0295Gu.m616i(12));
                break;
        }
    }
}
