package p257;

import android.app.Activity;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import java.lang.ref.WeakReference;
import p033.AbstractC6325;
import p144.C7546;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8197 extends AbstractC3737 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C8216 f22573;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f22575;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C7546 f22576;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public WeakReference f22578;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f22580;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public WaitDialog$TYPE f22581;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f22577 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final float f22574 = AbstractC8247.f22828;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f22571 = 1500;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22572 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f22579 = -1;

    public C8197() {
        this.f11595 = new WeakReference(AbstractC3737.m8045());
        this.f11580 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C8197 m13690(String str) {
        C8197 c8197M13692 = m13692();
        if (c8197M13692 == null) {
            return new C8197();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.NONE;
        c8197M13692.f22575 = str;
        if (c8197M13692.f22581 != waitDialog$TYPE) {
            c8197M13692.f22579 = waitDialog$TYPE.ordinal();
            c8197M13692.f22581 = waitDialog$TYPE;
            if (c8197M13692.m13696() != null) {
                C8199 c8199M13696 = c8197M13692.m13696();
                c8199M13696.getClass();
                AbstractC3737.m8043(new RunnableC3741(c8199M13696, 17, waitDialog$TYPE));
            }
        }
        c8197M13692.m13694();
        if (c8197M13692.m13696() == null) {
            c8197M13692.m13695();
        }
        return c8197M13692;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C8197 m13691(String str, float f) {
        C8197 c8197M13692 = m13692();
        if (c8197M13692 == null) {
            return new C8197();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.PROGRESSING;
        c8197M13692.f22575 = str;
        if (c8197M13692.f22581 != waitDialog$TYPE) {
            c8197M13692.f22579 = waitDialog$TYPE.ordinal();
            c8197M13692.f22581 = waitDialog$TYPE;
            if (c8197M13692.m13696() != null) {
                C8199 c8199M13696 = c8197M13692.m13696();
                c8199M13696.getClass();
                AbstractC3737.m8043(new RunnableC3741(c8199M13696, 17, waitDialog$TYPE));
            }
        }
        c8197M13692.m13694();
        c8197M13692.f22572 = f;
        c8197M13692.m13694();
        if (c8197M13692.m13696() == null) {
            c8197M13692.m13695();
        }
        return c8197M13692;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C8197 m13692() {
        Activity activityM8045 = AbstractC3737.m8045();
        if (activityM8045 == 0 || activityM8045.isFinishing() || activityM8045.isDestroyed()) {
            return null;
        }
        if ((activityM8045 instanceof InterfaceC2388) && ((C2386) ((InterfaceC2388) activityM8045).getLifecycle()).f7018 == Lifecycle$State.DESTROYED) {
            return null;
        }
        for (AbstractC3737 abstractC3737 : AbstractC3737.m8046()) {
            if ((abstractC3737 instanceof C8197) && abstractC3737.f11579 && abstractC3737.m8071() == activityM8045) {
                return (C8197) abstractC3737;
            }
        }
        return new C8197();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m13693() {
        C8197 c8197M13692 = m13692();
        if (c8197M13692 != null) {
            c8197M13692.f11579 = false;
            AbstractC3737.m8043(new RunnableC8201(c8197M13692, 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13694() {
        if (m13696() == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC8201(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m13695() {
        m8066();
        AbstractC3737.m8043(new RunnableC8201(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C8199 m13696() {
        WeakReference weakReference = this.f22580;
        if (weakReference == null) {
            return null;
        }
        return (C8199) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13697() {
        this.f11579 = false;
        new C8220(5).mo8080(this);
        m8059(Lifecycle$State.DESTROYED);
        WeakReference weakReference = this.f22580;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22580 = null;
        WeakReference weakReference2 = this.f22578;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f22578 = null;
        WeakReference weakReference3 = this.f11595;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo8057() {
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        return super.mo8057();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8061() {
        m13694();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3737
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8063() {
        return C8197.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
