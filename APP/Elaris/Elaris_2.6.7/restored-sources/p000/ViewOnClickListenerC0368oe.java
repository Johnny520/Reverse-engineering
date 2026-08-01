package p000;

import android.view.View;
import com.p001mr.elaris.AbstractC0169w;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0368oe implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0502v9 f665c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0368oe(Object obj, ClassLoader classLoader, C0502v9 c0502v9) {
        this.f663a = obj;
        this.f664b = classLoader;
        this.f665c = c0502v9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = AbstractC0169w.f161a;
        Object obj = this.f663a;
        if (obj != null) {
            Class<?> superclass = obj.getClass();
            while (superclass != null && superclass != Object.class) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod("dismiss", null);
                    if (declaredMethod.getParameterTypes().length == 0) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(obj, null);
                        break;
                    }
                    continue;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                } catch (Throwable unused2) {
                }
            }
        }
        AbstractC0169w.m286b(this.f664b, this.f665c);
    }
}
