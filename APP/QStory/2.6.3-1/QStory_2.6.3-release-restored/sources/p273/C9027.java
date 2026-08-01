package p273;

import android.app.Activity;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import java.lang.ref.WeakReference;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p160.C8376;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9027 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C9046 f22917;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public CharSequence f22919;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C8376 f22920;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public WeakReference f22922;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f22924;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public WaitDialog$TYPE f22925;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final boolean f22921 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final float f22918 = AbstractC9077.f23172;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f22915 = 1500;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f22916 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f22923 = -1;

    public C9027() {
        this.f11945 = new WeakReference(AbstractC4570.m8591());
        this.f11930 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C9027 m14266(String str) {
        C9027 c9027M14268 = m14268();
        if (c9027M14268 == null) {
            return new C9027();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.NONE;
        c9027M14268.f22919 = str;
        if (c9027M14268.f22925 != waitDialog$TYPE) {
            c9027M14268.f22923 = waitDialog$TYPE.ordinal();
            c9027M14268.f22925 = waitDialog$TYPE;
            if (c9027M14268.m14272() != null) {
                C9029 c9029M14272 = c9027M14268.m14272();
                c9029M14272.getClass();
                AbstractC4570.m8589(new RunnableC4574(c9029M14272, 17, waitDialog$TYPE));
            }
        }
        c9027M14268.m14270();
        if (c9027M14268.m14272() == null) {
            c9027M14268.m14271();
        }
        return c9027M14268;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C9027 m14267(String str, float f) {
        C9027 c9027M14268 = m14268();
        if (c9027M14268 == null) {
            return new C9027();
        }
        WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.PROGRESSING;
        c9027M14268.f22919 = str;
        if (c9027M14268.f22925 != waitDialog$TYPE) {
            c9027M14268.f22923 = waitDialog$TYPE.ordinal();
            c9027M14268.f22925 = waitDialog$TYPE;
            if (c9027M14268.m14272() != null) {
                C9029 c9029M14272 = c9027M14268.m14272();
                c9029M14272.getClass();
                AbstractC4570.m8589(new RunnableC4574(c9029M14272, 17, waitDialog$TYPE));
            }
        }
        c9027M14268.m14270();
        c9027M14268.f22916 = f;
        c9027M14268.m14270();
        if (c9027M14268.m14272() == null) {
            c9027M14268.m14271();
        }
        return c9027M14268;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C9027 m14268() {
        Activity activityM8591 = AbstractC4570.m8591();
        if (activityM8591 == 0 || activityM8591.isFinishing() || activityM8591.isDestroyed()) {
            return null;
        }
        if ((activityM8591 instanceof InterfaceC3221) && ((C3219) ((InterfaceC3221) activityM8591).getLifecycle()).f7364 == Lifecycle$State.DESTROYED) {
            return null;
        }
        for (AbstractC4570 abstractC4570 : AbstractC4570.m8592()) {
            if ((abstractC4570 instanceof C9027) && abstractC4570.f11929 && abstractC4570.m8617() == activityM8591) {
                return (C9027) abstractC4570;
            }
        }
        return new C9027();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m14269() {
        C9027 c9027M14268 = m14268();
        if (c9027M14268 != null) {
            c9027M14268.f11929 = false;
            AbstractC4570.m8589(new RunnableC9031(c9027M14268, 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14270() {
        if (m14272() == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC9031(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14271() {
        m8612();
        AbstractC4570.m8589(new RunnableC9031(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C9029 m14272() {
        WeakReference weakReference = this.f22924;
        if (weakReference == null) {
            return null;
        }
        return (C9029) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14273() {
        this.f11929 = false;
        new C9050(5).mo8626(this);
        m8605(Lifecycle$State.DESTROYED);
        WeakReference weakReference = this.f22924;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f22924 = null;
        WeakReference weakReference2 = this.f22922;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f22922 = null;
        WeakReference weakReference3 = this.f11945;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo8603() {
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        return super.mo8603();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo8607() {
        m14270();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4570
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8609() {
        return C9027.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
