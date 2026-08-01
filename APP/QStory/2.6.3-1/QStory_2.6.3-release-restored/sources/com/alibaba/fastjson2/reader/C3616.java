package com.alibaba.fastjson2.reader;

import androidx.core.view.C3075;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.InterfaceC3774;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import p294.C9194;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3616 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9194 f8860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3075 f8861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8863;

    public /* synthetic */ C3616(C3075 c3075, Annotation annotation, C9194 c9194, int i) {
        this.f8863 = i;
        this.f8861 = c3075;
        this.f8862 = annotation;
        this.f8860 = c9194;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153 A[Catch: all -> 0x022f, TryCatch #1 {all -> 0x022f, blocks: (B:5:0x0014, B:9:0x0024, B:11:0x002c, B:13:0x0031, B:14:0x0038, B:16:0x003b, B:18:0x004d, B:21:0x0057, B:20:0x0053, B:22:0x005e, B:23:0x0069, B:25:0x0071, B:27:0x0076, B:28:0x007a, B:56:0x00f4, B:59:0x00fa, B:61:0x0100, B:31:0x0084, B:33:0x008c, B:35:0x0094, B:36:0x009d, B:38:0x00a5, B:40:0x00aa, B:41:0x00b7, B:43:0x00bf, B:45:0x00c7, B:46:0x00cb, B:48:0x00d1, B:49:0x00d8, B:51:0x00e0, B:53:0x00e8, B:54:0x00ec, B:62:0x0104, B:64:0x010c, B:66:0x0113, B:79:0x014b, B:81:0x0153, B:67:0x0116, B:69:0x011e, B:71:0x0126, B:72:0x012a, B:74:0x0132, B:76:0x013a, B:77:0x0143, B:82:0x0157, B:84:0x015f, B:86:0x016b, B:87:0x016f, B:89:0x0177, B:91:0x017f, B:92:0x0188, B:94:0x0190, B:96:0x0195, B:97:0x0199, B:99:0x01a1, B:100:0x01ab, B:102:0x01b3, B:104:0x01b8, B:105:0x01c2, B:117:0x0202, B:107:0x01c6, B:109:0x01ce, B:110:0x01d8, B:112:0x01e0, B:113:0x01ea, B:115:0x01f2, B:116:0x01fc, B:118:0x0205, B:120:0x020d, B:122:0x0215, B:123:0x021d, B:125:0x0225, B:127:0x022d), top: B:147:0x0014 }] */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        String str;
        Class cls;
        int i = this.f8863;
        C9194 c9194 = this.f8860;
        Annotation annotation = this.f8862;
        C3075 c3075 = this.f8861;
        Method method = (Method) obj;
        switch (i) {
            case 0:
                String name = method.getName();
                try {
                    Object objInvoke = method.invoke(annotation, null);
                    if ("using".equals(name) || "contentUsing".equals(name)) {
                        Class clsM4697 = C3075.m4697((Class) objInvoke);
                        if (clsM4697 != null) {
                            c9194.f23443 = clsM4697;
                        }
                    } else if ("builder".equals(name)) {
                        c3075.m4704((Class) objInvoke, c9194);
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                String name2 = method.getName();
                try {
                    Object objInvoke2 = method.invoke(annotation, null);
                    int i2 = 0;
                    switch (name2.hashCode()) {
                        case -1678076717:
                            if (name2.equals("deserializer")) {
                                Class cls2 = (Class) objInvoke2;
                                if (InterfaceC3621.class.isAssignableFrom(cls2)) {
                                    c9194.f23443 = cls2;
                                }
                            }
                            break;
                        case -1275293551:
                            if (name2.equals("disableAutoType") && Boolean.TRUE.equals(objInvoke2)) {
                                c9194.f23445 |= 576460752303423488L;
                                break;
                            }
                            break;
                        case -1073807344:
                            if (name2.equals("parseFeatures")) {
                                Enum[] enumArr = (Enum[]) objInvoke2;
                                int length = enumArr.length;
                                while (i2 < length) {
                                    String strName = enumArr[i2].name();
                                    switch (strName.hashCode()) {
                                        case -1604251670:
                                            strName.equals("TrimStringFieldValue");
                                            break;
                                        case -894003883:
                                            if (strName.equals("SupportArrayToBean")) {
                                                c9194.f23445 |= JSONReader$Feature.SupportArrayToBean.mask;
                                            }
                                            break;
                                        case -200815016:
                                            if (strName.equals("SupportAutoType")) {
                                                c9194.f23445 |= JSONReader$Feature.SupportAutoType.mask;
                                            }
                                            break;
                                        case 2005790178:
                                            if (strName.equals("InitStringFieldAsEmpty")) {
                                                c9194.f23445 |= JSONReader$Feature.InitStringFieldAsEmpty.mask;
                                            }
                                            break;
                                    }
                                    i2++;
                                }
                            }
                            break;
                        case -1052827512:
                            if (name2.equals("naming")) {
                                c9194.f23449 = ((Enum) objInvoke2).name();
                            }
                            break;
                        case -1008770331:
                            if (name2.equals("orders")) {
                                String[] strArr = (String[]) objInvoke2;
                                if (strArr.length != 0) {
                                    c9194.f23447 = strArr;
                                }
                            }
                            break;
                        case -1006295438:
                            if (name2.equals("disableJSONB") && Boolean.TRUE.equals(objInvoke2)) {
                                c9194.f23445 |= 1152921504606846976L;
                                break;
                            }
                            break;
                        case -907987551:
                            if (name2.equals("schema")) {
                                String strTrim = ((String) objInvoke2).trim();
                                if (!strTrim.isEmpty()) {
                                    c9194.f23441 = strTrim;
                                }
                            }
                            break;
                        case -853109563:
                            if (!name2.equals("typeKey")) {
                            }
                            str = (String) objInvoke2;
                            if (str.isEmpty()) {
                                c9194.f23437 = str;
                            }
                            break;
                        case -682633786:
                            if (name2.equals("disableReferenceDetect") && Boolean.TRUE.equals(objInvoke2)) {
                                c9194.f23445 |= 144115188075855872L;
                                break;
                            }
                            break;
                        case -676507419:
                            if (name2.equals("typeName")) {
                                String str2 = (String) objInvoke2;
                                if (!str2.isEmpty()) {
                                    c9194.f23436 = str2;
                                }
                            }
                            break;
                        case -618447321:
                            if (name2.equals("seeAlsoDefault")) {
                                Class cls3 = (Class) objInvoke2;
                                if (cls3 != Void.class) {
                                    c9194.f23450 = cls3;
                                }
                                str = (String) objInvoke2;
                                if (str.isEmpty()) {
                                }
                            }
                            break;
                        case -432515134:
                            if (!name2.equals("autoTypeBeforeHandler")) {
                            }
                            cls = (Class) objInvoke2;
                            if (cls == InterfaceC3774.class && InterfaceC3774.class.isAssignableFrom(cls)) {
                                c9194.f23428 = cls;
                                break;
                            }
                            break;
                        case -167039347:
                            if (name2.equals("rootName")) {
                                String str3 = (String) objInvoke2;
                                if (!str3.isEmpty()) {
                                    c9194.f23427 = str3;
                                }
                            }
                            break;
                        case 230944667:
                            if (name2.equals("builder")) {
                                c3075.m4704((Class) objInvoke2, c9194);
                            }
                            break;
                        case 1053501509:
                            if (name2.equals("deserializeUsing")) {
                                Class cls4 = (Class) objInvoke2;
                                if (InterfaceC3621.class.isAssignableFrom(cls4)) {
                                    c9194.f23443 = cls4;
                                }
                            }
                            break;
                        case 1401959644:
                            if (name2.equals("deserializeFeatures")) {
                                JSONReader$Feature[] jSONReader$FeatureArr = (JSONReader$Feature[]) objInvoke2;
                                int length2 = jSONReader$FeatureArr.length;
                                while (i2 < length2) {
                                    c9194.f23445 |= jSONReader$FeatureArr[i2].mask;
                                    i2++;
                                }
                            }
                            break;
                        case 1533080381:
                            if (name2.equals("disableArrayMapping") && Boolean.TRUE.equals(objInvoke2)) {
                                c9194.f23445 |= 288230376151711744L;
                                break;
                            }
                            break;
                        case 1706529099:
                            if (name2.equals("autoTypeCheckHandler")) {
                                cls = (Class) objInvoke2;
                                if (cls == InterfaceC3774.class) {
                                }
                            }
                            break;
                        case 1752415457:
                            if (name2.equals("ignores")) {
                                String[] strArr2 = (String[]) objInvoke2;
                                if (strArr2.length > 0) {
                                    c9194.f23446 = strArr2;
                                }
                            }
                            break;
                        case 1970571962:
                            if (name2.equals("seeAlso")) {
                                Class[] clsArr = (Class[]) objInvoke2;
                                if (clsArr.length != 0) {
                                    c9194.f23432 = clsArr;
                                    c9194.f23451 = new String[clsArr.length];
                                    while (i2 < clsArr.length) {
                                        Class cls5 = clsArr[i2];
                                        C9194 c91942 = new C9194(AbstractC3766.m6947());
                                        c3075.m4706(cls5, c91942);
                                        String simpleName = c91942.f23436;
                                        if (simpleName == null || simpleName.isEmpty()) {
                                            simpleName = cls5.getSimpleName();
                                        }
                                        c9194.f23451[i2] = simpleName;
                                        i2++;
                                    }
                                    c9194.f23445 |= JSONReader$Feature.SupportAutoType.mask;
                                }
                            }
                            break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
        }
    }
}
