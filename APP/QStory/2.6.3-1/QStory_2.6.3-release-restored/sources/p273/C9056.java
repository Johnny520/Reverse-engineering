package p273;

import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4583;
import p339.C9536;
import p339.C9537;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9056 extends AbstractC4570 implements InterfaceC4583 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C9537 f23045;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C9056 f23046;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float f23047;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float f23048;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C9046 f23049;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f23050;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C9536 f23051;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public Integer f23052;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C9052 f23053;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final int m14309() {
        C9056 c9056 = this.f23046;
        if (this.f23052 == null) {
            this.f23052 = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowInsets rootWindowInsets = m8616() == null ? null : m8616().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                    if (roundedCorner != null && roundedCorner2 != null) {
                        this.f23052 = Integer.valueOf(Math.max(roundedCorner.getRadius(), roundedCorner2.getRadius()));
                    }
                }
            }
            if (this.f23052.intValue() == 0 && "xiaomi".equals(Build.MANUFACTURER.toLowerCase())) {
                try {
                    Integer num = (Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.miui.notch.radius", 0);
                    num.getClass();
                    this.f23052 = num;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f23052.intValue() == 0) {
                try {
                    int identifier = c9056.m8615().getIdentifier("rounded_corner_radius", "dimen", "android");
                    if (identifier > 0) {
                        this.f23052 = Integer.valueOf(c9056.m8615().getDimensionPixelSize(identifier));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return this.f23052.intValue();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        if (m8614() != null) {
            AbstractC4570.m8590(m8614());
            this.f11929 = false;
        }
        RelativeLayout relativeLayout = this.f23053.f23027;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        this.f11925 = 0L;
        View viewM8610 = m8610(m8618(mo8603()) != 0 ? m8618(mo8603()) : mo8603() ? C0328R.layout.layout_dialogx_fullscreen : C0328R.layout.layout_dialogx_fullscreen_dark);
        this.f23053 = new C9052(this, viewM8610);
        if (viewM8610 != null) {
            viewM8610.setTag(this.f23046);
        }
        AbstractC4570.m8587(viewM8610);
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9056.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
