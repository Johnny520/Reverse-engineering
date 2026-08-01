package p273;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.C3325;
import com.google.android.material.chip.Chip;
import p317.C9434;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9049 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f23022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23023;

    public /* synthetic */ C9049(Object obj, int i) {
        this.f23023 = i;
        this.f23022 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f23023;
        Object obj = this.f23022;
        switch (i) {
            case 0:
                int width = view.getWidth();
                float height = view.getHeight();
                float f = ((C9068) obj).f23090.f23119;
                outline.setRoundRect(0, 0, width, (int) (height + f), f);
                break;
            case 1:
                int width2 = view.getWidth();
                float height2 = view.getHeight();
                float f2 = ((C9052) obj).f23036.f23048;
                outline.setRoundRect(0, 0, width2, (int) (height2 + f2), f2);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C9038) obj).f22985.f22973);
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C9041) ((C3325) obj).f7808).f22996);
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C9029) obj).f22937.f22918);
                break;
            default:
                C9434 c9434 = ((Chip) obj).f10574;
                if (c9434 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c9434.getOutline(outline);
                }
                break;
        }
    }
}
