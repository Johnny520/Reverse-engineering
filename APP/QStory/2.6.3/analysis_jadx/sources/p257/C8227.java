package p257;

import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3751;
import p323.C8707;
import p323.C8708;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8227 extends AbstractC3738 implements InterfaceC3751 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C8708 f22700;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C8227 f22701;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f22702;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float f22703;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C8217 f22704;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f22705;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C8707 f22706;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public Integer f22707;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8223 f22708;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final int m13750() {
        C8227 c8227 = this.f22701;
        if (this.f22707 == null) {
            this.f22707 = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowInsets rootWindowInsets = m8057() == null ? null : m8057().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                    if (roundedCorner != null && roundedCorner2 != null) {
                        this.f22707 = Integer.valueOf(Math.max(roundedCorner.getRadius(), roundedCorner2.getRadius()));
                    }
                }
            }
            if (this.f22707.intValue() == 0 && "xiaomi".equals(Build.MANUFACTURER.toLowerCase())) {
                try {
                    Integer num = (Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.miui.notch.radius", 0);
                    num.getClass();
                    this.f22707 = num;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f22707.intValue() == 0) {
                try {
                    int identifier = c8227.m8056().getIdentifier("rounded_corner_radius", "dimen", "android");
                    if (identifier > 0) {
                        this.f22707 = Integer.valueOf(c8227.m8056().getDimensionPixelSize(identifier));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return this.f22707.intValue();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        if (m8055() != null) {
            AbstractC3738.m8031(m8055());
            this.f11584 = false;
        }
        RelativeLayout relativeLayout = this.f22708.f22682;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        this.f11580 = 0L;
        View viewM8051 = m8051(m8059(mo8044()) != 0 ? m8059(mo8044()) : mo8044() ? R.layout.layout_dialogx_fullscreen : R.layout.layout_dialogx_fullscreen_dark);
        this.f22708 = new C8223(this, viewM8051);
        if (viewM8051 != null) {
            viewM8051.setTag(this.f22701);
        }
        AbstractC3738.m8028(viewM8051);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8227.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
