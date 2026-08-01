package p257;

import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3746;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.InterfaceC3750;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8226 extends AbstractC3737 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public AbstractC3746 f22701;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C8226 f22702;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f22703;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float f22704;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C8216 f22705;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f22706;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public AbstractC3748 f22707;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public Integer f22708;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8222 f22709;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13733() {
        m8066();
        if (m8068() != null) {
            AbstractC3737.m8041(m8068());
            return;
        }
        View viewM8064 = m8064(m8072(mo8057()) != 0 ? m8072(mo8057()) : mo8057() ? R.layout.layout_dialogx_fullscreen : R.layout.layout_dialogx_fullscreen_dark);
        this.f22709 = new C8222(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22702);
        }
        AbstractC3737.m8041(viewM8064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final int m13734() {
        C8226 c8226 = this.f22702;
        if (this.f22708 == null) {
            this.f22708 = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowInsets rootWindowInsets = m8070() == null ? null : m8070().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                    if (roundedCorner != null && roundedCorner2 != null) {
                        this.f22708 = Integer.valueOf(Math.max(roundedCorner.getRadius(), roundedCorner2.getRadius()));
                    }
                }
            }
            if (this.f22708.intValue() == 0 && "xiaomi".equals(Build.MANUFACTURER.toLowerCase())) {
                try {
                    Integer num = (Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.miui.notch.radius", 0);
                    num.getClass();
                    this.f22708 = num;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f22708.intValue() == 0) {
                try {
                    int identifier = c8226.m8069().getIdentifier("rounded_corner_radius", "dimen", "android");
                    if (identifier > 0) {
                        this.f22708 = Integer.valueOf(c8226.m8069().getDimensionPixelSize(identifier));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return this.f22708.intValue();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        if (m8068() != null) {
            AbstractC3737.m8044(m8068());
            this.f11579 = false;
        }
        RelativeLayout relativeLayout = this.f22709.f22683;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        this.f11575 = 0L;
        View viewM8064 = m8064(m8072(mo8057()) != 0 ? m8072(mo8057()) : mo8057() ? R.layout.layout_dialogx_fullscreen : R.layout.layout_dialogx_fullscreen_dark);
        this.f22709 = new C8222(this, viewM8064);
        if (viewM8064 != null) {
            viewM8064.setTag(this.f22702);
        }
        AbstractC3737.m8041(viewM8064);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8226.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
