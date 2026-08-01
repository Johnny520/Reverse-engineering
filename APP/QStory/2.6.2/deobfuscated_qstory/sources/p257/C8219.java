package p257;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.C2492;
import com.google.android.material.chip.Chip;
import p301.C8613;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8219 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f22678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22679;

    public /* synthetic */ C8219(Object obj, int i) {
        this.f22679 = i;
        this.f22678 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f22679;
        Object obj = this.f22678;
        switch (i) {
            case 0:
                int width = view.getWidth();
                float height = view.getHeight();
                float f = ((C8238) obj).f22746.f22775;
                outline.setRoundRect(0, 0, width, (int) (height + f), f);
                break;
            case 1:
                int width2 = view.getWidth();
                float height2 = view.getHeight();
                float f2 = ((C8222) obj).f22692.f22704;
                outline.setRoundRect(0, 0, width2, (int) (height2 + f2), f2);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8208) obj).f22641.f22629);
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8211) ((C2492) obj).f7462).f22652);
                break;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C8199) obj).f22593.f22574);
                break;
            default:
                C8613 c8613 = ((Chip) obj).f10224;
                if (c8613 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c8613.getOutline(outline);
                }
                break;
        }
    }
}
