package p257;

import androidx.appcompat.app.RunnableC0062;
import androidx.compose.animation.core.C0325;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C2492;
import com.kongzue.dialogx.interfaces.AbstractC3746;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Timer;
import p033.AbstractC6325;
import p251.AbstractC8174;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8235 extends AbstractC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f22733;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f22734;

    public /* synthetic */ C8235(Object obj, int i) {
        this.f22734 = i;
        this.f22733 = obj;
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo13626() {
        int i = this.f22734;
        Object obj = this.f22733;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                C8239 c8239 = ((C8238) obj).f22746;
                c8239.f11579 = true;
                c8239.f11581 = false;
                c8239.m8059(Lifecycle$State.CREATED);
                AbstractC3746 c8220 = c8239.f22768;
                if (c8220 == null) {
                    c8220 = new C8220(i2);
                }
                c8220.mo8079(c8239.f22767);
                c8239.mo8056();
                c8239.m13746();
                break;
            case 1:
                C0325 c0325 = (C0325) obj;
                C8232 c8232 = (C8232) c0325.f1093;
                c8232.f11579 = true;
                c8232.f11581 = false;
                c8232.m8059(Lifecycle$State.CREATED);
                new C8220(i3).mo8079(c8232.f22720);
                c8232.mo8056();
                ((MaxRelativeLayout) c0325.f1096).setVisibility(8);
                break;
            case 2:
                C8226 c8226 = ((C8222) obj).f22692;
                c8226.f11579 = true;
                c8226.f11581 = false;
                c8226.m8059(Lifecycle$State.CREATED);
                c8226.mo8056();
                AbstractC3746 c82202 = c8226.f22701;
                if (c82202 == null) {
                    c82202 = new C8220(2);
                }
                c82202.mo8079(c8226.f22702);
                break;
            case 3:
                C8208 c8208 = (C8208) obj;
                C8207 c8207 = c8208.f22641;
                c8207.f11579 = true;
                c8207.f11581 = false;
                c8207.m8059(Lifecycle$State.CREATED);
                c8207.mo8056();
                C8220 c82203 = c8207.f22614;
                int i4 = 3;
                if (c82203 == null) {
                    c82203 = new C8220(i4);
                }
                c82203.mo8079(c8207.f22616);
                C8207 c82072 = c8207.f22616;
                if (c8207.f22618 == null) {
                    c8207.f22618 = new C8216(c8208, i4);
                }
                c8207.f22618.m13725(c82072);
                c8207.f11578.getClass();
                if (c8207.f11576) {
                    c8208.f22646.postDelayed(new RunnableC0062(this, 21), 300L);
                }
                break;
            case 4:
                C2492 c2492 = (C2492) obj;
                C8211 c8211 = (C8211) c2492.f7462;
                c8211.f11579 = true;
                c8211.f11581 = false;
                c8211.m8059(Lifecycle$State.CREATED);
                ((DialogXBaseRelativeLayout) c2492.f7461).setAlpha(0.0f);
                c8211.mo8056();
                new C8220(4).mo8079(c8211.f22657);
                break;
            default:
                C8199 c8199 = (C8199) obj;
                C8197 c8197 = c8199.f22593;
                c8197.f11579 = true;
                c8197.f11581 = false;
                c8197.m8059(Lifecycle$State.CREATED);
                c8199.f22588.setAlpha(0.0f);
                c8199.f22587.post(new RunnableC0062(this, 25));
                break;
        }
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo13627() {
        int i = this.f22734;
        int i2 = 0;
        Object obj = this.f22733;
        switch (i) {
            case 0:
                C8238 c8238 = (C8238) obj;
                C8239 c8239 = c8238.f22746;
                c8239.f11579 = false;
                AbstractC3746 c8220 = c8239.f22768;
                if (c8220 == null) {
                    c8220 = new C8220(i2);
                }
                c8220.mo8080(c8239.f22767);
                c8239.m8059(Lifecycle$State.DESTROYED);
                c8239.f22766 = null;
                c8238.f22743 = null;
                c8239.f22768 = null;
                AbstractC6325 abstractC6325 = AbstractC8247.f22824;
                break;
            case 1:
                C8232 c8232 = (C8232) ((C0325) obj).f1093;
                c8232.f11579 = false;
                new C8220(1).mo8080(c8232.f22720);
                c8232.m8059(Lifecycle$State.DESTROYED);
                c8232.f22719 = null;
                AbstractC6325 abstractC63252 = AbstractC8247.f22824;
                break;
            case 2:
                C8222 c8222 = (C8222) obj;
                C8226 c8226 = c8222.f22692;
                c8226.f11579 = false;
                AbstractC3746 c82202 = c8226.f22701;
                if (c82202 == null) {
                    c82202 = new C8220(2);
                }
                c82202.mo8080(c8226.f22702);
                c8226.m8059(Lifecycle$State.DESTROYED);
                c8222.f22688 = null;
                c8226.f22709 = null;
                c8226.f22701 = null;
                AbstractC6325 abstractC63253 = AbstractC8247.f22824;
                break;
            case 3:
                C8207 c8207 = ((C8208) obj).f22641;
                c8207.f11579 = false;
                C8220 c82203 = c8207.f22614;
                if (c82203 == null) {
                    c82203 = new C8220(3);
                }
                c82203.mo8080(c8207.f22616);
                C8207 c82072 = c8207.f22616;
                c8207.m8059(Lifecycle$State.DESTROYED);
                c8207.f22614 = null;
                AbstractC6325 abstractC63254 = AbstractC8247.f22824;
                break;
            case 4:
                C8211 c8211 = (C8211) ((C2492) obj).f7462;
                ArrayList arrayList = C8211.f22650;
                if (arrayList != null) {
                    arrayList.remove(c8211);
                    if (C8211.f22650.isEmpty()) {
                        C8211.f22650 = null;
                    }
                }
                c8211.f11579 = false;
                Timer timer = c8211.f22661;
                if (timer != null) {
                    timer.cancel();
                }
                new C8220(4).mo8080(c8211.f22657);
                c8211.m8059(Lifecycle$State.DESTROYED);
                c8211.f22654 = null;
                AbstractC6325 abstractC63255 = AbstractC8247.f22824;
                break;
            default:
                ((C8199) obj).f22593.m13697();
                break;
        }
    }
}
