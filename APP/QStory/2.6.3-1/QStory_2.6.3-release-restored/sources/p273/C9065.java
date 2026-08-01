package p273;

import androidx.appcompat.app.RunnableC0909;
import androidx.compose.animation.core.C1171;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C3325;
import com.kongzue.dialogx.interfaces.AbstractC4579;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Timer;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p050.AbstractC7176;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9065 extends AbstractC7176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f23077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f23078;

    public /* synthetic */ C9065(Object obj, int i) {
        this.f23078 = i;
        this.f23077 = obj;
    }

    @Override // p050.AbstractC7176
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo12492() {
        int i = this.f23078;
        int i2 = 0;
        Object obj = this.f23077;
        switch (i) {
            case 0:
                C9068 c9068 = (C9068) obj;
                C9069 c9069 = c9068.f23090;
                c9069.f11929 = false;
                AbstractC4579 c9050 = c9069.f23112;
                if (c9050 == null) {
                    c9050 = new C9050(i2);
                }
                c9050.mo8626(c9069.f23111);
                c9069.m8605(Lifecycle$State.DESTROYED);
                c9069.f23110 = null;
                c9068.f23087 = null;
                c9069.f23112 = null;
                AbstractC5754 abstractC5754 = AbstractC9077.f23168;
                break;
            case 1:
                C9062 c9062 = (C9062) ((C1171) obj).f1438;
                c9062.f11929 = false;
                new C9050(1).mo8626(c9062.f23064);
                c9062.m8605(Lifecycle$State.DESTROYED);
                c9062.f23063 = null;
                AbstractC5754 abstractC57542 = AbstractC9077.f23168;
                break;
            case 2:
                C9052 c9052 = (C9052) obj;
                C9056 c9056 = c9052.f23036;
                c9056.f11929 = false;
                AbstractC4579 c90502 = c9056.f23045;
                if (c90502 == null) {
                    c90502 = new C9050(2);
                }
                c90502.mo8626(c9056.f23046);
                C9056 c90562 = c9056.f23046;
                c9056.m8605(Lifecycle$State.DESTROYED);
                c9052.f23032 = null;
                c9056.f23053 = null;
                c9056.f23045 = null;
                AbstractC5754 abstractC57543 = AbstractC9077.f23168;
                break;
            case 3:
                C9037 c9037 = ((C9038) obj).f22985;
                c9037.f11929 = false;
                C9050 c90503 = c9037.f22958;
                if (c90503 == null) {
                    c90503 = new C9050(3);
                }
                c90503.mo8626(c9037.f22960);
                C9037 c90372 = c9037.f22960;
                c9037.m8605(Lifecycle$State.DESTROYED);
                c9037.f22958 = null;
                AbstractC5754 abstractC57544 = AbstractC9077.f23168;
                break;
            case 4:
                C9041 c9041 = (C9041) ((C3325) obj).f7808;
                ArrayList arrayList = C9041.f22994;
                if (arrayList != null) {
                    arrayList.remove(c9041);
                    if (C9041.f22994.isEmpty()) {
                        C9041.f22994 = null;
                    }
                }
                c9041.f11929 = false;
                Timer timer = c9041.f23005;
                if (timer != null) {
                    timer.cancel();
                }
                new C9050(4).mo8626(c9041.f23001);
                c9041.m8605(Lifecycle$State.DESTROYED);
                c9041.f22998 = null;
                AbstractC5754 abstractC57545 = AbstractC9077.f23168;
                break;
            default:
                ((C9029) obj).f22937.m14273();
                break;
        }
    }

    @Override // p050.AbstractC7176
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo12493() {
        int i = this.f23078;
        Object obj = this.f23077;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                C9069 c9069 = ((C9068) obj).f23090;
                c9069.f11929 = true;
                c9069.f11931 = false;
                c9069.m8605(Lifecycle$State.CREATED);
                AbstractC4579 c9050 = c9069.f23112;
                if (c9050 == null) {
                    c9050 = new C9050(i2);
                }
                c9050.mo8625(c9069.f23111);
                c9069.mo8602();
                c9069.m14322();
                break;
            case 1:
                C1171 c1171 = (C1171) obj;
                C9062 c9062 = (C9062) c1171.f1438;
                c9062.f11929 = true;
                c9062.f11931 = false;
                c9062.m8605(Lifecycle$State.CREATED);
                new C9050(i3).mo8625(c9062.f23064);
                c9062.mo8602();
                ((MaxRelativeLayout) c1171.f1441).setVisibility(8);
                break;
            case 2:
                C9056 c9056 = ((C9052) obj).f23036;
                c9056.f11929 = true;
                c9056.f11931 = false;
                c9056.m8605(Lifecycle$State.CREATED);
                c9056.mo8602();
                AbstractC4579 c90502 = c9056.f23045;
                if (c90502 == null) {
                    c90502 = new C9050(2);
                }
                c90502.mo8625(c9056.f23046);
                C9056 c90562 = c9056.f23046;
                break;
            case 3:
                C9038 c9038 = (C9038) obj;
                C9037 c9037 = c9038.f22985;
                c9037.f11929 = true;
                c9037.f11931 = false;
                c9037.m8605(Lifecycle$State.CREATED);
                c9037.mo8602();
                C9050 c90503 = c9037.f22958;
                int i4 = 3;
                if (c90503 == null) {
                    c90503 = new C9050(i4);
                }
                c90503.mo8625(c9037.f22960);
                C9037 c90372 = c9037.f22960;
                if (c9037.f22962 == null) {
                    c9037.f22962 = new C9046(c9038, i4);
                }
                c9037.f22962.m14301(c90372);
                c9037.f11928.getClass();
                if (c9037.f11926) {
                    c9038.f22990.postDelayed(new RunnableC0909(this, 21), 300L);
                }
                break;
            case 4:
                C3325 c3325 = (C3325) obj;
                C9041 c9041 = (C9041) c3325.f7808;
                c9041.f11929 = true;
                c9041.f11931 = false;
                c9041.m8605(Lifecycle$State.CREATED);
                ((DialogXBaseRelativeLayout) c3325.f7807).setAlpha(0.0f);
                c9041.mo8602();
                new C9050(4).mo8625(c9041.f23001);
                break;
            default:
                C9029 c9029 = (C9029) obj;
                C9027 c9027 = c9029.f22937;
                c9027.f11929 = true;
                c9027.f11931 = false;
                c9027.m8605(Lifecycle$State.CREATED);
                c9029.f22932.setAlpha(0.0f);
                c9029.f22931.post(new RunnableC0909(this, 25));
                break;
        }
    }
}
