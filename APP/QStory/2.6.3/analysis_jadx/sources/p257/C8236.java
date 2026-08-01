package p257;

import androidx.appcompat.app.RunnableC0062;
import androidx.compose.animation.core.C0325;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C2492;
import com.kongzue.dialogx.interfaces.AbstractC3747;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Timer;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p034.AbstractC6347;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8236 extends AbstractC6347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f22732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f22733;

    public /* synthetic */ C8236(Object obj, int i) {
        this.f22733 = i;
        this.f22732 = obj;
    }

    @Override // p034.AbstractC6347
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo11933() {
        int i = this.f22733;
        int i2 = 0;
        Object obj = this.f22732;
        switch (i) {
            case 0:
                C8239 c8239 = (C8239) obj;
                C8240 c8240 = c8239.f22745;
                c8240.f11584 = false;
                AbstractC3747 c8221 = c8240.f22767;
                if (c8221 == null) {
                    c8221 = new C8221(i2);
                }
                c8221.mo8067(c8240.f22766);
                c8240.m8046(Lifecycle$State.DESTROYED);
                c8240.f22765 = null;
                c8239.f22742 = null;
                c8240.f22767 = null;
                AbstractC4922 abstractC4922 = AbstractC8248.f22823;
                break;
            case 1:
                C8233 c8233 = (C8233) ((C0325) obj).f1093;
                c8233.f11584 = false;
                new C8221(1).mo8067(c8233.f22719);
                c8233.m8046(Lifecycle$State.DESTROYED);
                c8233.f22718 = null;
                AbstractC4922 abstractC49222 = AbstractC8248.f22823;
                break;
            case 2:
                C8223 c8223 = (C8223) obj;
                C8227 c8227 = c8223.f22691;
                c8227.f11584 = false;
                AbstractC3747 c82212 = c8227.f22700;
                if (c82212 == null) {
                    c82212 = new C8221(2);
                }
                c82212.mo8067(c8227.f22701);
                C8227 c82272 = c8227.f22701;
                c8227.m8046(Lifecycle$State.DESTROYED);
                c8223.f22687 = null;
                c8227.f22708 = null;
                c8227.f22700 = null;
                AbstractC4922 abstractC49223 = AbstractC8248.f22823;
                break;
            case 3:
                C8208 c8208 = ((C8209) obj).f22640;
                c8208.f11584 = false;
                C8221 c82213 = c8208.f22613;
                if (c82213 == null) {
                    c82213 = new C8221(3);
                }
                c82213.mo8067(c8208.f22615);
                C8208 c82082 = c8208.f22615;
                c8208.m8046(Lifecycle$State.DESTROYED);
                c8208.f22613 = null;
                AbstractC4922 abstractC49224 = AbstractC8248.f22823;
                break;
            case 4:
                C8212 c8212 = (C8212) ((C2492) obj).f7463;
                ArrayList arrayList = C8212.f22649;
                if (arrayList != null) {
                    arrayList.remove(c8212);
                    if (C8212.f22649.isEmpty()) {
                        C8212.f22649 = null;
                    }
                }
                c8212.f11584 = false;
                Timer timer = c8212.f22660;
                if (timer != null) {
                    timer.cancel();
                }
                new C8221(4).mo8067(c8212.f22656);
                c8212.m8046(Lifecycle$State.DESTROYED);
                c8212.f22653 = null;
                AbstractC4922 abstractC49225 = AbstractC8248.f22823;
                break;
            default:
                ((C8200) obj).f22592.m13714();
                break;
        }
    }

    @Override // p034.AbstractC6347
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo11934() {
        int i = this.f22733;
        Object obj = this.f22732;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                C8240 c8240 = ((C8239) obj).f22745;
                c8240.f11584 = true;
                c8240.f11586 = false;
                c8240.m8046(Lifecycle$State.CREATED);
                AbstractC3747 c8221 = c8240.f22767;
                if (c8221 == null) {
                    c8221 = new C8221(i2);
                }
                c8221.mo8066(c8240.f22766);
                c8240.mo8043();
                c8240.m13763();
                break;
            case 1:
                C0325 c0325 = (C0325) obj;
                C8233 c8233 = (C8233) c0325.f1093;
                c8233.f11584 = true;
                c8233.f11586 = false;
                c8233.m8046(Lifecycle$State.CREATED);
                new C8221(i3).mo8066(c8233.f22719);
                c8233.mo8043();
                ((MaxRelativeLayout) c0325.f1096).setVisibility(8);
                break;
            case 2:
                C8227 c8227 = ((C8223) obj).f22691;
                c8227.f11584 = true;
                c8227.f11586 = false;
                c8227.m8046(Lifecycle$State.CREATED);
                c8227.mo8043();
                AbstractC3747 c82212 = c8227.f22700;
                if (c82212 == null) {
                    c82212 = new C8221(2);
                }
                c82212.mo8066(c8227.f22701);
                C8227 c82272 = c8227.f22701;
                break;
            case 3:
                C8209 c8209 = (C8209) obj;
                C8208 c8208 = c8209.f22640;
                c8208.f11584 = true;
                c8208.f11586 = false;
                c8208.m8046(Lifecycle$State.CREATED);
                c8208.mo8043();
                C8221 c82213 = c8208.f22613;
                int i4 = 3;
                if (c82213 == null) {
                    c82213 = new C8221(i4);
                }
                c82213.mo8066(c8208.f22615);
                C8208 c82082 = c8208.f22615;
                if (c8208.f22617 == null) {
                    c8208.f22617 = new C8217(c8209, i4);
                }
                c8208.f22617.m13742(c82082);
                c8208.f11583.getClass();
                if (c8208.f11581) {
                    c8209.f22645.postDelayed(new RunnableC0062(this, 21), 300L);
                }
                break;
            case 4:
                C2492 c2492 = (C2492) obj;
                C8212 c8212 = (C8212) c2492.f7463;
                c8212.f11584 = true;
                c8212.f11586 = false;
                c8212.m8046(Lifecycle$State.CREATED);
                ((DialogXBaseRelativeLayout) c2492.f7462).setAlpha(0.0f);
                c8212.mo8043();
                new C8221(4).mo8066(c8212.f22656);
                break;
            default:
                C8200 c8200 = (C8200) obj;
                C8198 c8198 = c8200.f22592;
                c8198.f11584 = true;
                c8198.f11586 = false;
                c8198.m8046(Lifecycle$State.CREATED);
                c8200.f22587.setAlpha(0.0f);
                c8200.f22586.post(new RunnableC0062(this, 25));
                break;
        }
    }
}
