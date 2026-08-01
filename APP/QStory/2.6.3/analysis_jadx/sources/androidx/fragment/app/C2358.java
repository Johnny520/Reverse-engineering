package androidx.fragment.app;

import android.view.View;
import androidx.appcompat.app.RunnableC0099;
import androidx.collection.C0276;
import androidx.core.os.InterfaceC2170;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.InterfaceC2205;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.C3059;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3152;
import com.google.android.material.textfield.C3186;
import com.google.gson.internal.InterfaceC3238;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import p010.AbstractC6185;
import p010.InterfaceC6190;
import p026.InterfaceC6312;
import p151.C7585;
import p151.C7587;
import p164.C7665;
import p175.AbstractC7739;
import p222.InterfaceC7987;
import p257.C8205;
import p269.AbstractC8268;
import p287.AbstractC8405;
import p305.InterfaceC8645;
import p319.C8675;
import p319.C8677;
import p319.C8679;
import p355.InterfaceC8897;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2358 implements InterfaceC2170, InterfaceC7987, InterfaceC8645, InterfaceC3152, InterfaceC3238, InterfaceC3743, InterfaceC6312, InterfaceC2205, InterfaceC8897, InterfaceC6190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6987;

    public /* synthetic */ C2358(Object obj, int i) {
        this.f6987 = i;
        this.f6986 = obj;
    }

    @Override // p222.InterfaceC7987
    public Object get() {
        return new C3059();
    }

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        ((C2357) this.f6986).m4481();
    }

    @Override // com.google.gson.internal.InterfaceC3238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object mo4482() {
        Constructor constructor = (Constructor) this.f6986;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            AbstractC7739 abstractC7739 = AbstractC8268.f22884;
            C0276.m848("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8268.m13835(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            C0276.m848("Failed to invoke constructor '" + AbstractC8268.m13835(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4483() {
        CheckableImageButton checkableImageButton = ((C3186) this.f6986).f10723;
        AbstractC3057.m6732(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // p355.InterfaceC8897
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo4484(List list) {
        int i = this.f6987;
        Object obj = this.f6986;
        switch (i) {
            case 23:
                C8679 c8679 = (C8679) obj;
                c8679.f24485.m14677(list, AbstractC8405.m13972(1207));
                AbstractC6185.m11592(AbstractC8405.m13972(1208) + list.size() + AbstractC8405.m13972(1209));
                c8679.f24484.execute(new RunnableC0099(c8679, 24, list));
                break;
            case 24:
                C8677 c8677 = (C8677) obj;
                c8677.f24479.m14677(list, AbstractC8405.m13972(1207));
                AbstractC6185.m11592(AbstractC8405.m13972(1208) + list.size() + AbstractC8405.m13972(1209));
                new Thread(new RunnableC0099(c8677, 25, list)).start();
                break;
            default:
                C8675 c8675 = (C8675) obj;
                c8675.f24475.m14677(list, AbstractC8405.m13972(1207));
                AbstractC6185.m11592(AbstractC8405.m13972(1208) + list.size() + AbstractC8405.m13972(1209));
                new Thread(new RunnableC0099(c8675, 26, list)).start();
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3743
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo4485(CharSequence charSequence, Object obj, int i) {
        return ((PluginItemView) this.f6986).lambda$onLongClick$11((C8205) obj, charSequence, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0792 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x078d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:? A[RETURN, SYNTHETIC] */
    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1479(de.robv.android.xposed.XC_MethodHook.MethodHookParam r22) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 2452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2358.mo1479(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        C7585 c7585 = (C7585) this.f6986;
        ArrayList arrayList = c7585.f20552;
        C2238 c2238 = c2225.f6521;
        C7665 c7665M12940 = C7665.m12940(c2238.mo4052(519), c2238.mo4052(64));
        C7665 c7665M129402 = C7665.m12940(c2238.mo4053(519), c2238.mo4053(64));
        if (!c7665M12940.equals(c7585.f20551) || !c7665M129402.equals(c7585.f20550)) {
            c7585.f20551 = c7665M12940;
            c7585.f20550 = c7665M129402;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C7587 c7587 = (C7587) arrayList.get(size);
                c7587.f20559 = c7665M12940;
                c7587.f20558 = c7665M129402;
                c7587.m12816();
            }
        }
        return c2225;
    }
}
