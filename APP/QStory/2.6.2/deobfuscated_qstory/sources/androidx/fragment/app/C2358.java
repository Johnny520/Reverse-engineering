package androidx.fragment.app;

import android.view.View;
import androidx.appcompat.app.RunnableC0099;
import androidx.collection.C0276;
import androidx.core.os.InterfaceC2170;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.InterfaceC2205;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3058;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3151;
import com.google.android.material.textfield.C3185;
import com.google.gson.internal.InterfaceC3237;
import com.kongzue.dialogx.interfaces.InterfaceC3742;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import p010.AbstractC6154;
import p010.InterfaceC6159;
import p026.InterfaceC6294;
import p151.C7584;
import p151.C7586;
import p164.C7664;
import p175.AbstractC7738;
import p222.InterfaceC7986;
import p257.C8204;
import p269.AbstractC8267;
import p305.InterfaceC8653;
import p320.C8708;
import p320.C8710;
import p320.C8712;
import p352.InterfaceC8880;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2358 implements InterfaceC2170, InterfaceC7986, InterfaceC8653, InterfaceC3151, InterfaceC3237, InterfaceC3742, InterfaceC6294, InterfaceC2205, InterfaceC8880, InterfaceC6159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6986;

    public /* synthetic */ C2358(Object obj, int i) {
        this.f6986 = i;
        this.f6985 = obj;
    }

    @Override // p222.InterfaceC7986
    public Object get() {
        return new C3058();
    }

    @Override // androidx.core.os.InterfaceC2170
    public void onCancel() {
        ((C2357) this.f6985).m4471();
    }

    @Override // com.google.gson.internal.InterfaceC3237
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object mo4472() {
        Constructor constructor = (Constructor) this.f6985;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            AbstractC7738 abstractC7738 = AbstractC8267.f22885;
            C0276.m847("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC8267.m13818(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            C0276.m847("Failed to invoke constructor '" + AbstractC8267.m13818(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3151
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4473() {
        CheckableImageButton checkableImageButton = ((C3185) this.f6985).f10718;
        AbstractC3054.m6578(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // p352.InterfaceC8880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo4474(List list) {
        int i = this.f6986;
        Object obj = this.f6985;
        switch (i) {
            case 23:
                C8712 c8712 = (C8712) obj;
                c8712.f24575.m14640(list, "TroopUinList");
                AbstractC6154.m11561("\u5df2\u4fdd\u5b58 " + list.size() + " \u4e2a\u7fa4\u804a");
                c8712.f24574.execute(new RunnableC0099(c8712, 24, list));
                break;
            case 24:
                C8710 c8710 = (C8710) obj;
                c8710.f24569.m14640(list, "TroopUinList");
                AbstractC6154.m11561("\u5df2\u4fdd\u5b58 " + list.size() + " \u4e2a\u7fa4\u804a");
                new Thread(new RunnableC0099(c8710, 25, list)).start();
                break;
            default:
                C8708 c8708 = (C8708) obj;
                c8708.f24565.m14640(list, "TroopUinList");
                AbstractC6154.m11561("\u5df2\u4fdd\u5b58 " + list.size() + " \u4e2a\u7fa4\u804a");
                new Thread(new RunnableC0099(c8708, 26, list)).start();
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo4475(CharSequence charSequence, Object obj, int i) {
        return ((PluginItemView) this.f6985).lambda$onLongClick$11((C8204) obj, charSequence, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x05df  */
    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1469(de.robv.android.xposed.XC_MethodHook.MethodHookParam r27) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2358.mo1469(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        C7584 c7584 = (C7584) this.f6985;
        ArrayList arrayList = c7584.f20557;
        C2238 c2238 = c2225.f6520;
        C7664 c7664M12911 = C7664.m12911(c2238.mo4042(519), c2238.mo4042(64));
        C7664 c7664M129112 = C7664.m12911(c2238.mo4043(519), c2238.mo4043(64));
        if (!c7664M12911.equals(c7584.f20556) || !c7664M129112.equals(c7584.f20555)) {
            c7584.f20556 = c7664M12911;
            c7584.f20555 = c7664M129112;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C7586 c7586 = (C7586) arrayList.get(size);
                c7586.f20564 = c7664M12911;
                c7586.f20563 = c7664M129112;
                c7586.m12787();
            }
        }
        return c2225;
    }
}
