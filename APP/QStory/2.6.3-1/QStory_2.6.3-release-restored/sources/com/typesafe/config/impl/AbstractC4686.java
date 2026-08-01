package com.typesafe.config.impl;

import androidx.compose.animation.C1272;
import com.typesafe.config.ConfigValueType;
import com.typesafe.config.impl.ConfigString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4686 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4675 m8789(ConfigValueType configValueType, AbstractC4675 abstractC4675) {
        ConfigValueType configValueTypeValueType = abstractC4675.valueType();
        ConfigValueType configValueType2 = ConfigValueType.STRING;
        if (configValueTypeValueType == configValueType2) {
            String str = (String) abstractC4675.unwrapped();
            int i = AbstractC4694.f12434[configValueType.ordinal()];
            if (i == 1) {
                try {
                    try {
                        return new ConfigLong(abstractC4675.origin(), Long.parseLong(str), str);
                    } catch (NumberFormatException unused) {
                        return new ConfigDouble(abstractC4675.origin(), Double.parseDouble(str), str);
                    }
                } catch (NumberFormatException unused2) {
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (str.equals("true") || str.equals("yes") || str.equals("on")) {
                        return new ConfigBoolean(abstractC4675.origin(), true);
                    }
                    if (str.equals("false") || str.equals("no") || str.equals("off")) {
                        return new ConfigBoolean(abstractC4675.origin(), false);
                    }
                }
            } else if (str.equals("null")) {
                return new ConfigNull(abstractC4675.origin());
            }
        } else if (configValueType == configValueType2) {
            int i2 = AbstractC4694.f12434[abstractC4675.valueType().ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new ConfigString.Quoted(abstractC4675.origin(), abstractC4675.transformToString());
            }
        } else if (configValueType == ConfigValueType.LIST && abstractC4675.valueType() == ConfigValueType.OBJECT) {
            AbstractC4678 abstractC4678 = (AbstractC4678) abstractC4675;
            HashMap map = new HashMap();
            for (String str2 : abstractC4678.keySet()) {
                try {
                    int i3 = Integer.parseInt(str2, 10);
                    if (i3 >= 0) {
                        map.put(Integer.valueOf(i3), abstractC4678.get((Object) str2));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, new C1272(3));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Map.Entry) it.next()).getValue());
                }
                return new SimpleConfigList(abstractC4675.origin(), arrayList2);
            }
        }
        return abstractC4675;
    }
}
