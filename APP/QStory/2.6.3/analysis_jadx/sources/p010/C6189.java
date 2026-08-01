package p010;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C2700;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.AbstractC3462;
import com.google.protobuf.AbstractC3474;
import com.google.protobuf.AbstractC3477;
import com.google.protobuf.C3466;
import com.google.protobuf.CodedInputStream$VarintExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f17017 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static byte[] m11608(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (bArr.length >= 4 && bArr[0] == 0) ? Arrays.copyOfRange(bArr, 4, bArr.length) : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11609(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵喵喵~喵喵呜呜喵喵喵喵"), Integer.valueOf(b & DefaultClassResolver.NAME)));
        }
        return sb.toString();
    }

    public final String toString() {
        try {
            return m11614().toJSONString(JSONWriter$Feature.PrettyFormat);
        } catch (Exception unused) {
            return AbstractC8405.m13972(820);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m11610() {
        HashMap map = this.f17017;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = AbstractC3462.f11129;
        C3466 c3466 = new C3466(byteArrayOutputStream, 4096);
        try {
            for (Integer num : map.keySet()) {
                for (Object obj : (List) map.get(num)) {
                    if (obj instanceof Long) {
                        c3466.mo7648(num.intValue(), ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        int iIntValue = num.intValue();
                        byte[] bytes = ((String) obj).getBytes();
                        int length = bytes.length;
                        c3466.mo7655(iIntValue, 2);
                        c3466.mo7662(bytes, length);
                    } else if (obj instanceof C6189) {
                        byte[] bArrM11610 = ((C6189) obj).m11610();
                        int iIntValue2 = num.intValue();
                        int length2 = bArrM11610.length;
                        c3466.mo7655(iIntValue2, 2);
                        c3466.mo7662(bArrM11610, length2);
                    } else if (obj instanceof Integer) {
                        c3466.mo7651(num.intValue(), ((Integer) obj).intValue());
                    } else {
                        AbstractC6188.m11605(AbstractC8405.m13972(817), AbstractC8405.m13972(818) + obj.getClass().getName(), new RuntimeException(), true);
                    }
                }
            }
            if (c3466.f11138 > 0) {
                c3466.m7682();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(819);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11611(int i, Object obj) {
        ((List) this.f17017.computeIfAbsent(Integer.valueOf(i), new C2700(14))).add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11612(JSONObject jSONObject) {
        try {
            for (String str : jSONObject.keySet()) {
                int i = Integer.parseInt(str);
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONObject) {
                    C6189 c6189 = new C6189();
                    c6189.m11612((JSONObject) obj);
                    m11611(i, c6189);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        Object obj2 = jSONArray.get(i2);
                        if (obj2 instanceof JSONObject) {
                            C6189 c61892 = new C6189();
                            c61892.m11612((JSONObject) obj2);
                            m11611(i, c61892);
                        } else {
                            m11611(i, obj2);
                        }
                    }
                } else {
                    m11611(i, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11613(byte[] bArr) {
        CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC3474.f11152;
        AbstractC3477 abstractC3477M7694 = AbstractC3474.m7694(bArr, 0, bArr.length, false);
        while (abstractC3477M7694.mo7710() > 0) {
            int iMo7705 = abstractC3477M7694.mo7705();
            int i = iMo7705 >>> 3;
            int i2 = iMo7705 & 7;
            if (i2 == 4 || i2 == 3 || i2 > 5) {
                throw new IOException(AbstractC8405.m13972(815) + i2);
            }
            if (i2 == 0) {
                m11611(i, Long.valueOf(abstractC3477M7694.m7741()));
            } else if (i2 == 1) {
                m11611(i, Long.valueOf(abstractC3477M7694.m7741()));
            } else if (i2 == 2) {
                byte[] bArrM7748 = abstractC3477M7694.m7748(abstractC3477M7694.mo7739());
                try {
                    try {
                        C6189 c6189 = new C6189();
                        c6189.m11613(bArrM7748);
                        m11611(i, c6189);
                    } catch (Exception unused) {
                        Charset charset = StandardCharsets.UTF_8;
                        String str = new String(bArrM7748, charset);
                        byte[] bytes = str.getBytes(charset);
                        if (bArrM7748.length == bytes.length) {
                            for (int i3 = 0; i3 < bArrM7748.length; i3++) {
                                if (bArrM7748[i3] == bytes[i3]) {
                                }
                            }
                            m11611(i, str);
                        }
                        m11611(i, AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜喵呜呜") + m11609(bArrM7748));
                        break;
                    }
                } catch (Exception unused2) {
                    m11611(i, AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜喵呜呜").concat(m11609(bArrM7748)));
                }
            } else if (i2 != 5) {
                m11611(i, AbstractC8405.m13972(816) + i2);
            } else {
                m11611(i, Integer.valueOf(abstractC3477M7694.m7747()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONObject m11614() {
        JSONObject jSONObject = new JSONObject();
        HashMap map = this.f17017;
        for (Integer num : map.keySet()) {
            List list = (List) map.get(num);
            if (list.size() > 1) {
                JSONArray jSONArray = new JSONArray();
                for (Object objM11614 : list) {
                    if (objM11614 instanceof C6189) {
                        objM11614 = ((C6189) objM11614).m11614();
                    }
                    jSONArray.add(objM11614);
                }
                jSONObject.put(String.valueOf(num), jSONArray);
            } else {
                for (Object objM116142 : list) {
                    String strValueOf = String.valueOf(num);
                    if (objM116142 instanceof C6189) {
                        objM116142 = ((C6189) objM116142).m11614();
                    }
                    jSONObject.put(strValueOf, objM116142);
                }
            }
        }
        return jSONObject;
    }
}
