package com.typesafe.config.impl;

import com.alibaba.fastjson2.C3775;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Stack;
import p025.AbstractC7012;
import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4670 f12429 = C4670.m8765("path parameter");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C4690 m8790(C4668 c4668, InterfaceC8990 interfaceC8990, String str) {
        String strTransformToString;
        ConfigSyntax configSyntax = ConfigSyntax.JSON;
        ArrayList<C4687> arrayList = new ArrayList();
        arrayList.add(new C4687());
        if (!c4668.hasNext()) {
            throw new ConfigException.BadPath(interfaceC8990, str, "Expecting a field name or path here, but got nothing");
        }
        while (true) {
            C4690 c4690 = null;
            if (!c4668.hasNext()) {
                Stack stack = new Stack();
                for (C4687 c4687 : arrayList) {
                    if (c4687.f12428.length() == 0 && !c4687.f12427) {
                        throw new ConfigException.BadPath(interfaceC8990, str, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)");
                    }
                    stack.push(c4687.f12428.toString());
                }
                while (!stack.isEmpty()) {
                    c4690 = new C4690((String) stack.pop(), c4690);
                }
                return c4690;
            }
            C4669 c4669 = (C4669) c4668.next();
            C4669 c46692 = AbstractC4654.f12364;
            if (!(c4669 instanceof C4658)) {
                ConfigValueType configValueType = ConfigValueType.STRING;
                boolean z = c4669 instanceof C4656;
                if (z && AbstractC4654.m8755(c4669).valueType() == configValueType) {
                    m8792(arrayList, true, AbstractC4654.m8755(c4669).transformToString());
                } else if (c4669 != AbstractC4654.f12363) {
                    if (z) {
                        strTransformToString = AbstractC4654.m8755(c4669).transformToString();
                    } else {
                        boolean z2 = c4669 instanceof C4655;
                        if (!z2) {
                            throw new ConfigException.BadPath(interfaceC8990, str, "Token not allowed in path expression: " + c4669 + " (you can double-quote this token if you really want it here)");
                        }
                        if (!z2) {
                            C3775.m6955(c4669, "tried to get unquoted text from ");
                            return null;
                        }
                        strTransformToString = ((C4655) c4669).f12369;
                    }
                    m8792(arrayList, false, strTransformToString);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C4690 m8791(C4690 c4690, String str, int i) {
        int iLastIndexOf = str.lastIndexOf(46, i - 1);
        C4690 c46902 = new C4690(str.substring(iLastIndexOf + 1, i), c4690);
        return iLastIndexOf < 0 ? c46902 : m8791(c46902, str, iLastIndexOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8792(ArrayList arrayList, boolean z, String str) {
        int iIndexOf = z ? -1 : str.indexOf(46);
        C4687 c4687 = (C4687) AbstractC7012.m12145(1, arrayList);
        if (iIndexOf >= 0) {
            c4687.f12428.append(str.substring(0, iIndexOf));
            arrayList.add(new C4687());
            m8792(arrayList, false, str.substring(iIndexOf + 1));
        } else {
            c4687.f12428.append(str);
            if (z && c4687.f12428.length() == 0) {
                c4687.f12427 = true;
            }
        }
    }
}
