package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Stack;
import p009.AbstractC6183;
import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3838 f12084 = C3838.m8206("path parameter");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3858 m8231(C3836 c3836, InterfaceC8161 interfaceC8161, String str) {
        String strTransformToString;
        ConfigSyntax configSyntax = ConfigSyntax.JSON;
        ArrayList<C3855> arrayList = new ArrayList();
        arrayList.add(new C3855());
        if (!c3836.hasNext()) {
            throw new ConfigException.BadPath(interfaceC8161, str, "Expecting a field name or path here, but got nothing");
        }
        while (true) {
            C3858 c3858 = null;
            if (!c3836.hasNext()) {
                Stack stack = new Stack();
                for (C3855 c3855 : arrayList) {
                    if (c3855.f12083.length() == 0 && !c3855.f12082) {
                        throw new ConfigException.BadPath(interfaceC8161, str, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)");
                    }
                    stack.push(c3855.f12083.toString());
                }
                while (!stack.isEmpty()) {
                    c3858 = new C3858((String) stack.pop(), c3858);
                }
                return c3858;
            }
            C3837 c3837 = (C3837) c3836.next();
            C3837 c38372 = AbstractC3822.f12019;
            if (!(c3837 instanceof C3826)) {
                ConfigValueType configValueType = ConfigValueType.STRING;
                boolean z = c3837 instanceof C3824;
                if (z && AbstractC3822.m8196(c3837).valueType() == configValueType) {
                    m8233(arrayList, true, AbstractC3822.m8196(c3837).transformToString());
                } else if (c3837 != AbstractC3822.f12018) {
                    if (z) {
                        strTransformToString = AbstractC3822.m8196(c3837).transformToString();
                    } else {
                        boolean z2 = c3837 instanceof C3823;
                        if (!z2) {
                            throw new ConfigException.BadPath(interfaceC8161, str, "Token not allowed in path expression: " + c3837 + " (you can double-quote this token if you really want it here)");
                        }
                        if (!z2) {
                            C2942.m6395(c3837, "tried to get unquoted text from ");
                            return null;
                        }
                        strTransformToString = ((C3823) c3837).f12024;
                    }
                    m8233(arrayList, false, strTransformToString);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3858 m8232(C3858 c3858, String str, int i) {
        int iLastIndexOf = str.lastIndexOf(46, i - 1);
        C3858 c38582 = new C3858(str.substring(iLastIndexOf + 1, i), c3858);
        return iLastIndexOf < 0 ? c38582 : m8232(c38582, str, iLastIndexOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8233(ArrayList arrayList, boolean z, String str) {
        int iIndexOf = z ? -1 : str.indexOf(46);
        C3855 c3855 = (C3855) AbstractC6183.m11586(1, arrayList);
        if (iIndexOf >= 0) {
            c3855.f12083.append(str.substring(0, iIndexOf));
            arrayList.add(new C3855());
            m8233(arrayList, false, str.substring(iIndexOf + 1));
        } else {
            c3855.f12083.append(str);
            if (z && c3855.f12083.length() == 0) {
                c3855.f12082 = true;
            }
        }
    }
}
