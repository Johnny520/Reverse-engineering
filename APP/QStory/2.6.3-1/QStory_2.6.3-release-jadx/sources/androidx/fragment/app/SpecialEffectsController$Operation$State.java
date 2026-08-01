package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m151d2 = {"androidx/fragment/app/SpecialEffectsController$Operation$State", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Lkotlin/飘花落叶言子楪兰苏哲世;", "applyState", "(Landroid/view/View;)V", "Companion", "androidx/fragment/app/飘花落叶言子苏世楪哲兰", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, m152k = 1, m153mv = {1, 8, 0}, m155xi = 48)
public enum SpecialEffectsController$Operation$State {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final C3187 Companion = new C3187();

    public static final SpecialEffectsController$Operation$State from(int i) {
        Companion.getClass();
        return C3187.m5034(i);
    }

    public final void applyState(View view) {
        view.getClass();
        int i = AbstractC3186.f7307[ordinal()];
        if (i == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (AbstractC3146.m4922(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i != 4) {
            return;
        }
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
