package com.google.gson.internal;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import p010.AbstractC6188;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p287.AbstractC8405;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3224 implements InterfaceC3238, InterfaceC6312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f10881;

    public /* synthetic */ C3224(Class cls) {
        this.f10881 = cls;
    }

    @Override // com.google.gson.internal.InterfaceC3238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo4482() {
        Class cls = this.f10881;
        try {
            return AbstractC3227.f10886.mo7324(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
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
            if (obj != null && obj.getClass() == this.f10881) {
                break;
            } else {
                i++;
            }
        }
        if (obj != null) {
            try {
                String strM13972 = AbstractC8405.m13972(125);
                Class cls = Integer.TYPE;
                int iIntValue = ((Integer) AbstractC6336.m11859(cls, strM13972, obj)).intValue();
                int iIntValue2 = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), obj)).intValue();
                if (iIntValue == 2 && iIntValue2 == 1) {
                    AbstractC6188.m11604(AbstractC8405.m13972(129), AbstractC8405.m13972(128));
                    methodHookParam.setResult((Object) null);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        String strValueOf = String.valueOf(methodHookParam.args[1]);
        if (strValueOf.contains(AbstractC8405.m13972(130))) {
            AbstractC6188.m11604(strValueOf, AbstractC8405.m13972(128));
            methodHookParam.setResult((Object) null);
            return;
        }
        if (obj == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(126), obj);
            if (arrayList == null) {
                return;
            }
            for (Object obj2 : arrayList) {
                if (obj2 != null && (str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜"), obj2)) != null && str.contains(AbstractC8405.m13972(127))) {
                    AbstractC6188.m11604(AbstractC8405.m13972(131), AbstractC8405.m13972(128));
                    methodHookParam.setResult((Object) null);
                    return;
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
