package p257;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.C2492;
import com.google.android.material.chip.Chip;
import p301.C8605;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8220 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f22677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22678;

    public /* synthetic */ C8220(Object obj, int i) {
        this.f22678 = i;
        this.f22677 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f22678;
        Object obj = this.f22677;
        switch (i) {
            case 0:
                int width = view.getWidth();
                float height = view.getHeight();
                float f = ((C8239) obj).f22745.f22774;
                outline.setRoundRect(0, 0, width, (int) (height + f), f);
                break;
            case 1:
                int width2 = view.getWidth();
                float height2 = view.getHeight();
                float f2 = ((C8223) obj).f22691.f22703;
                outline.setRoundRect(0, 0, width2, (int) (height2 + f2), f2);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8209) obj).f22640.f22628);
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8212) ((C2492) obj).f7463).f22651);
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8200) obj).f22592.f22573);
                break;
            default:
                C8605 c8605 = ((Chip) obj).f10229;
                if (c8605 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c8605.getOutline(outline);
                }
                break;
        }
    }
}
