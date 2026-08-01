package p257;

import android.app.Activity;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import java.lang.ref.WeakReference;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p144.C7547;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8198 extends AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C8217 f22572;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f22574;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C7547 f22575;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public WeakReference f22577;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f22579;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public WaitDialog$TYPE f22580;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f22576 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final float f22573 = AbstractC8248.f22827;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f22570 = 1500;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22571 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f22578 = -1;

    public C8198() {
        this.f11600 = new WeakReference(AbstractC3738.m8032());
        this.f11585 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C8198 m13707(String str) {
        C8198 c8198M13709 = m13709();
        if (c8198M13709 == null) {
            return new C8198();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.NONE;
        c8198M13709.f22574 = str;
        if (c8198M13709.f22580 != waitDialog$TYPE) {
            c8198M13709.f22578 = waitDialog$TYPE.ordinal();
            c8198M13709.f22580 = waitDialog$TYPE;
            if (c8198M13709.m13713() != null) {
                C8200 c8200M13713 = c8198M13709.m13713();
                c8200M13713.getClass();
                AbstractC3738.m8030(new RunnableC3742(c8200M13713, 17, waitDialog$TYPE));
            }
        }
        c8198M13709.m13711();
        if (c8198M13709.m13713() == null) {
            c8198M13709.m13712();
        }
        return c8198M13709;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C8198 m13708(String str, float f) {
        C8198 c8198M13709 = m13709();
        if (c8198M13709 == null) {
            return new C8198();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.PROGRESSING;
        c8198M13709.f22574 = str;
        if (c8198M13709.f22580 != waitDialog$TYPE) {
            c8198M13709.f22578 = waitDialog$TYPE.ordinal();
            c8198M13709.f22580 = waitDialog$TYPE;
            if (c8198M13709.m13713() != null) {
                C8200 c8200M13713 = c8198M13709.m13713();
                c8200M13713.getClass();
                AbstractC3738.m8030(new RunnableC3742(c8200M13713, 17, waitDialog$TYPE));
            }
        }
        c8198M13709.m13711();
        c8198M13709.f22571 = f;
        c8198M13709.m13711();
        if (c8198M13709.m13713() == null) {
            c8198M13709.m13712();
        }
        return c8198M13709;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C8198 m13709() {
        Activity activityM8032 = AbstractC3738.m8032();
        if (activityM8032 == 0 || activityM8032.isFinishing() || activityM8032.isDestroyed()) {
            return null;
        }
        if ((activityM8032 instanceof InterfaceC2388) && ((C2386) ((InterfaceC2388) activityM8032).getLifecycle()).f7019 == Lifecycle$State.DESTROYED) {
            return null;
        }
        for (AbstractC3738 abstractC3738 : AbstractC3738.m8033()) {
            if ((abstractC3738 instanceof C8198) && abstractC3738.f11584 && abstractC3738.m8058() == activityM8032) {
                return (C8198) abstractC3738;
            }
        }
        return new C8198();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m13710() {
        C8198 c8198M13709 = m13709();
        if (c8198M13709 != null) {
            c8198M13709.f11584 = false;
            AbstractC3738.m8030(new RunnableC8202(c8198M13709, 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13711() {
        if (m13713() == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC8202(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m13712() {
        m8053();
        AbstractC3738.m8030(new RunnableC8202(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C8200 m13713() {
        WeakReference weakReference = this.f22579;
        if (weakReference == null) {
            return null;
        }
        return (C8200) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13714() {
        this.f11584 = false;
        new C8221(5).mo8067(this);
        m8046(Lifecycle$State.DESTROYED);
        WeakReference weakReference = this.f22579;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22579 = null;
        WeakReference weakReference2 = this.f22577;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f22577 = null;
        WeakReference weakReference3 = this.f11600;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo8044() {
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        return super.mo8044();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8048() {
        m13711();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3738
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8050() {
        return C8198.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
