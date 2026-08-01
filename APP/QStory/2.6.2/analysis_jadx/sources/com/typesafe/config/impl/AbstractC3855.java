package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2941;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Stack;
import p007.AbstractC6136;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3855 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3837 f12079 = C3837.m8219("path parameter");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3857 m8244(C3835 c3835, InterfaceC8160 interfaceC8160, String str) {
        String strTransformToString;
        ConfigSyntax configSyntax = ConfigSyntax.JSON;
        ArrayList<C3854> arrayList = new ArrayList();
        arrayList.add(new C3854());
        if (!c3835.hasNext()) {
            throw new ConfigException.BadPath(interfaceC8160, str, "Expecting a field name or path here, but got nothing");
        }
        while (true) {
            C3857 c3857 = null;
            if (!c3835.hasNext()) {
                Stack stack = new Stack();
                for (C3854 c3854 : arrayList) {
                    if (c3854.f12078.length() == 0 && !c3854.f12077) {
                        throw new ConfigException.BadPath(interfaceC8160, str, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)");
                    }
                    stack.push(c3854.f12078.toString());
                }
                while (!stack.isEmpty()) {
                    c3857 = new C3857((String) stack.pop(), c3857);
                }
                return c3857;
            }
            C3836 c3836 = (C3836) c3835.next();
            C3836 c38362 = AbstractC3821.f12014;
            if (!(c3836 instanceof C3825)) {
                ConfigValueType configValueType = ConfigValueType.STRING;
                boolean z = c3836 instanceof C3823;
                if (z && AbstractC3821.m8209(c3836).valueType() == configValueType) {
                    m8246(arrayList, true, AbstractC3821.m8209(c3836).transformToString());
                } else if (c3836 != AbstractC3821.f12013) {
                    if (z) {
                        strTransformToString = AbstractC3821.m8209(c3836).transformToString();
                    } else {
                        boolean z2 = c3836 instanceof C3822;
                        if (!z2) {
                            throw new ConfigException.BadPath(interfaceC8160, str, "Token not allowed in path expression: " + c3836 + " (you can double-quote this token if you really want it here)");
                        }
                        if (!z2) {
                            C2941.m6337(c3836, "tried to get unquoted text from ");
                            return null;
                        }
                        strTransformToString = ((C3822) c3836).f12019;
                    }
                    m8246(arrayList, false, strTransformToString);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3857 m8245(C3857 c3857, String str, int i) {
        int iLastIndexOf = str.lastIndexOf(46, i - 1);
        C3857 c38572 = new C3857(str.substring(iLastIndexOf + 1, i), c3857);
        return iLastIndexOf < 0 ? c38572 : m8245(c38572, str, iLastIndexOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8246(ArrayList arrayList, boolean z, String str) {
        int iIndexOf = z ? -1 : str.indexOf(46);
        C3854 c3854 = (C3854) AbstractC6136.m11555(1, arrayList);
        if (iIndexOf >= 0) {
            c3854.f12078.append(str.substring(0, iIndexOf));
            arrayList.add(new C3854());
            m8246(arrayList, false, str.substring(iIndexOf + 1));
        } else {
            c3854.f12078.append(str);
            if (z && c3854.f12078.length() == 0) {
                c3854.f12077 = true;
            }
        }
    }
}
