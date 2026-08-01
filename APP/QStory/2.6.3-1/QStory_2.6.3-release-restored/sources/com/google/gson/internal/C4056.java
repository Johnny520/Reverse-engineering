package com.google.gson.internal;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import p026.AbstractC7017;
import p042.InterfaceC7141;
import p049.AbstractC7165;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4056 implements InterfaceC4070, InterfaceC7141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f11226;

    public /* synthetic */ C4056(Class cls) {
        this.f11226 = cls;
    }

    @Override // com.google.gson.internal.InterfaceC4070
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo5042() {
        Class cls = this.f11226;
        try {
            return AbstractC4059.f11231.mo7883(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
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
            if (obj != null && obj.getClass() == this.f11226) {
                break;
            } else {
                i++;
            }
        }
        if (obj != null) {
            try {
                String strM14531 = "chatType";
                Class cls = Integer.TYPE;
                int iIntValue = ((Integer) AbstractC7165.m12418(cls, strM14531, obj)).intValue();
                int iIntValue2 = ((Integer) AbstractC7165.m12418(cls, "atType", obj)).intValue();
                if (iIntValue == 2 && iIntValue2 == 1) {
                    AbstractC7017.m12163("chatType=2 atType=1", "艾特全体");
                    methodHookParam.setResult((Object) null);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        String strValueOf = String.valueOf(methodHookParam.args[1]);
        if (strValueOf.contains("content=[@全体成员]")) {
            AbstractC7017.m12163(strValueOf, "艾特全体");
            methodHookParam.setResult((Object) null);
            return;
        }
        if (obj == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "abstractContent", obj);
            if (arrayList == null) {
                return;
            }
            for (Object obj2 : arrayList) {
                if (obj2 != null && (str = (String) AbstractC7165.m12418(String.class, "content", obj2)) != null && str.contains("@全体成员")) {
                    AbstractC7017.m12163("abstractContent=@全体成员", "艾特全体");
                    methodHookParam.setResult((Object) null);
                    return;
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
