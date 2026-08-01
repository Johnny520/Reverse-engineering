package com.google.gson.internal;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import p010.AbstractC6157;
import p026.InterfaceC6294;
import p032.AbstractC6317;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3223 implements InterfaceC3237, InterfaceC6294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f10876;

    public /* synthetic */ C3223(Class cls) {
        this.f10876 = cls;
    }

    @Override // com.google.gson.internal.InterfaceC3237
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo4472() {
        Class cls = this.f10876;
        try {
            return AbstractC3226.f10881.mo7337(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        String str;
        Object[] objArr = methodHookParam.args;
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = objArr[i];
            if (obj != null && obj.getClass() == this.f10876) {
                break;
            } else {
                i++;
            }
        }
        if (obj != null) {
            try {
                String strM6668 = AbstractC3056.m6668(-3937565801616508327L);
                Class cls = Integer.TYPE;
                int iIntValue = ((Integer) AbstractC6317.m11831(cls, strM6668, obj)).intValue();
                int iIntValue2 = ((Integer) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937565702832260519L), obj)).intValue();
                if (iIntValue == 2 && iIntValue2 == 1) {
                    AbstractC6157.m11573(AbstractC3056.m6668(-3937565488083895719L), AbstractC3056.m6668(-3937565500968797607L));
                    methodHookParam.setResult((Object) null);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        String strValueOf = String.valueOf(methodHookParam.args[1]);
        if (strValueOf.contains(AbstractC3056.m6668(-3937565470904026535L))) {
            AbstractC6157.m11573(strValueOf, AbstractC3056.m6668(-3937565500968797607L));
            methodHookParam.setResult((Object) null);
            return;
        }
        if (obj == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937565732897031591L), obj);
            if (arrayList == null) {
                return;
            }
            for (Object obj2 : arrayList) {
                if (obj2 != null && (str = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937565664177554855L), obj2)) != null && str.contains(AbstractC3056.m6668(-3937565561098339751L))) {
                    AbstractC6157.m11573(AbstractC3056.m6668(-3937565402184549799L), AbstractC3056.m6668(-3937565500968797607L));
                    methodHookParam.setResult((Object) null);
                    return;
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
