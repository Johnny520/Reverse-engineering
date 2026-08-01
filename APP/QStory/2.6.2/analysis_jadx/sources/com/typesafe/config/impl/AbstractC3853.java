package com.typesafe.config.impl;

import androidx.compose.animation.C0426;
import com.typesafe.config.ConfigValueType;
import com.typesafe.config.impl.ConfigString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3853 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC3842 m8243(ConfigValueType configValueType, AbstractC3842 abstractC3842) {
        ConfigValueType configValueTypeValueType = abstractC3842.valueType();
        ConfigValueType configValueType2 = ConfigValueType.STRING;
        if (configValueTypeValueType == configValueType2) {
            String str = (String) abstractC3842.unwrapped();
            int i = AbstractC3861.f12084[configValueType.ordinal()];
            if (i == 1) {
                try {
                    try {
                        return new ConfigLong(abstractC3842.origin(), Long.parseLong(str), str);
                    } catch (NumberFormatException unused) {
                        return new ConfigDouble(abstractC3842.origin(), Double.parseDouble(str), str);
                    }
                } catch (NumberFormatException unused2) {
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (str.equals("true") || str.equals("yes") || str.equals("on")) {
                        return new ConfigBoolean(abstractC3842.origin(), true);
                    }
                    if (str.equals("false") || str.equals("no") || str.equals("off")) {
                        return new ConfigBoolean(abstractC3842.origin(), false);
                    }
                }
            } else if (str.equals("null")) {
                return new ConfigNull(abstractC3842.origin());
            }
        } else if (configValueType == configValueType2) {
            int i2 = AbstractC3861.f12084[abstractC3842.valueType().ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new ConfigString.Quoted(abstractC3842.origin(), abstractC3842.transformToString());
            }
        } else if (configValueType == ConfigValueType.LIST && abstractC3842.valueType() == ConfigValueType.OBJECT) {
            AbstractC3845 abstractC3845 = (AbstractC3845) abstractC3842;
            HashMap map = new HashMap();
            for (String str2 : abstractC3845.keySet()) {
                try {
                    int i3 = Integer.parseInt(str2, 10);
                    if (i3 >= 0) {
                        map.put(Integer.valueOf(i3), abstractC3845.get((Object) str2));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, new C0426(3));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Map.Entry) it.next()).getValue());
                }
                return new SimpleConfigList(abstractC3842.origin(), arrayList2);
            }
        }
        return abstractC3842;
    }
}
