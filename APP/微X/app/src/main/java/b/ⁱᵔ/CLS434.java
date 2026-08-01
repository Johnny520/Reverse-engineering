// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʾᵢ.CLS27;
import java.util.HashMap;
import java.util.Map.Entry;

public final class CLS434 {
    public static HashMap MTH6191(String s) {
        if(s != null && s.startsWith("~SEMI_XML~")) {
            String s1 = s.substring(10);
            HashMap hashMap0 = new HashMap();
            int v = s1.length();
            int v1 = 0;
            while(v1 < v - 4) {
                try {
                    int v2 = v1 + 2;
                    int v3 = (s1.charAt(v1) << 16) + s1.charAt(v1 + 1) + v2;
                    v1 = (s1.charAt(v3) << 16) + s1.charAt(v3 + 1) + (v3 + 2);
                    hashMap0.put(s1.substring(v2, v3), s1.substring(v3 + 2, v1));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            return hashMap0;
        }
        return null;
    }

    public static String MTH6192(HashMap hashMap0) {
        StringBuilder stringBuilder0 = new StringBuilder("~SEMI_XML~");
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            if(s1 != null) {
                int v = s.length();
                int v1 = s1.length();
                stringBuilder0.append(((char)(v >> 16)));
                stringBuilder0.append(((char)v));
                stringBuilder0.append(s);
                stringBuilder0.append(((char)(v1 >> 16)));
                stringBuilder0.append(((char)v1));
                stringBuilder0.append(s1);
            }
        }
        return stringBuilder0.toString();
    }
}

