package yyds;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: yyds.ᛸᲈᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1908 implements InterfaceC2050, InterfaceC0251, InterfaceC1564 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9646;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f9647;

    public /* synthetic */ C1908(int i, Object obj) {
        this.f9646 = i;
        this.f9647 = obj;
    }

    @Override // yyds.InterfaceC1564
    public Object get() {
        return new C2508();
    }

    @Override // yyds.InterfaceC0251
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo901(AbstractC0041 abstractC0041) {
        AbstractC1917.m3711((C2454) this.f9647);
    }

    @Override // yyds.InterfaceC2050
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public Object mo807() {
        int i = this.f9646;
        Object obj = this.f9647;
        switch (i) {
            case 0:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    AbstractC1741 abstractC1741 = AbstractC1301.f5958;
                    C1693.m3442("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC1301.m2586(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    C1693.m3442("Failed to invoke constructor '" + AbstractC1301.m2586(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return AbstractC1982.f9929.mo522(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3689(MotionEvent motionEvent) {
        C1402 c1402 = (C1402) this.f9647;
        View view = c1402.f6633;
        if (!c1402.f6632) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rectM2845 = c1402.m2845();
        int action = motionEvent.getAction();
        if (action == 0) {
            c1402.f6618 = x;
            c1402.f6625 = y;
            if (view.getAlpha() > 0.0f && c1402.m2850(view, x, y)) {
                c1402.f6628 = y;
                c1402.f6626 = c1402.f6620;
                c1402.m2842(true);
            }
        } else if (action == 1) {
            c1402.m2842(false);
        } else if (action == 2) {
            if (!c1402.f6634 && c1402.m2850(c1402.f6621, c1402.f6618, c1402.f6625) && Math.abs(y - c1402.f6625) > c1402.f6627) {
                if (c1402.m2850(view, c1402.f6618, c1402.f6625)) {
                    c1402.f6628 = c1402.f6636;
                    c1402.f6626 = c1402.f6620;
                } else {
                    c1402.f6628 = y;
                    int i = (int) ((y - rectM2845.top) - (c1402.f6619 / 2.0f));
                    c1402.f6626 = i;
                    c1402.m2847(i);
                }
                c1402.m2842(true);
            }
            if (c1402.f6634) {
                c1402.m2847(c1402.f6626 + ((int) (y - c1402.f6628)));
            }
        } else if (action == 3) {
        }
        c1402.f6636 = y;
        return c1402.f6634;
    }
}
