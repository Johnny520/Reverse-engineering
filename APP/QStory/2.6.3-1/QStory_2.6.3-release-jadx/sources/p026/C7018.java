package p026;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C3533;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.AbstractC4294;
import com.google.protobuf.AbstractC4306;
import com.google.protobuf.AbstractC4309;
import com.google.protobuf.C4298;
import com.google.protobuf.CodedInputStream$VarintExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f17362 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static byte[] m12167(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (bArr.length >= 4 && bArr[0] == 0) ? Arrays.copyOfRange(bArr, 4, bArr.length) : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12168(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵喵喵~喵喵呜呜喵喵喵喵"), Integer.valueOf(b & DefaultClassResolver.NAME)));
        }
        return sb.toString();
    }

    public final String toString() {
        try {
            return m12173().toJSONString(JSONWriter$Feature.PrettyFormat);
        } catch (Exception unused) {
            return AbstractC9234.m14531(820);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m12169() {
        HashMap map = this.f17362;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = AbstractC4294.f11474;
        C4298 c4298 = new C4298(byteArrayOutputStream, 4096);
        try {
            for (Integer num : map.keySet()) {
                for (Object obj : (List) map.get(num)) {
                    if (obj instanceof Long) {
                        c4298.mo8207(num.intValue(), ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        int iIntValue = num.intValue();
                        byte[] bytes = ((String) obj).getBytes();
                        int length = bytes.length;
                        c4298.mo8214(iIntValue, 2);
                        c4298.mo8221(bytes, length);
                    } else if (obj instanceof C7018) {
                        byte[] bArrM12169 = ((C7018) obj).m12169();
                        int iIntValue2 = num.intValue();
                        int length2 = bArrM12169.length;
                        c4298.mo8214(iIntValue2, 2);
                        c4298.mo8221(bArrM12169, length2);
                    } else if (obj instanceof Integer) {
                        c4298.mo8210(num.intValue(), ((Integer) obj).intValue());
                    } else {
                        AbstractC7017.m12164(AbstractC9234.m14531(817), AbstractC9234.m14531(818) + obj.getClass().getName(), new RuntimeException(), true);
                    }
                }
            }
            if (c4298.f11483 > 0) {
                c4298.m8241();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(819);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12170(int i, Object obj) {
        ((List) this.f17362.computeIfAbsent(Integer.valueOf(i), new C3533(14))).add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12171(JSONObject jSONObject) {
        try {
            for (String str : jSONObject.keySet()) {
                int i = Integer.parseInt(str);
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONObject) {
                    C7018 c7018 = new C7018();
                    c7018.m12171((JSONObject) obj);
                    m12170(i, c7018);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        Object obj2 = jSONArray.get(i2);
                        if (obj2 instanceof JSONObject) {
                            C7018 c70182 = new C7018();
                            c70182.m12171((JSONObject) obj2);
                            m12170(i, c70182);
                        } else {
                            m12170(i, obj2);
                        }
                    }
                } else {
                    m12170(i, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12172(byte[] bArr) {
        CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC4306.f11497;
        AbstractC4309 abstractC4309M8253 = AbstractC4306.m8253(bArr, 0, bArr.length, false);
        while (abstractC4309M8253.mo8269() > 0) {
            int iMo8264 = abstractC4309M8253.mo8264();
            int i = iMo8264 >>> 3;
            int i2 = iMo8264 & 7;
            if (i2 == 4 || i2 == 3 || i2 > 5) {
                throw new IOException(AbstractC9234.m14531(815) + i2);
            }
            if (i2 == 0) {
                m12170(i, Long.valueOf(abstractC4309M8253.m8300()));
            } else if (i2 == 1) {
                m12170(i, Long.valueOf(abstractC4309M8253.m8300()));
            } else if (i2 == 2) {
                byte[] bArrM8307 = abstractC4309M8253.m8307(abstractC4309M8253.mo8298());
                try {
                    try {
                        C7018 c7018 = new C7018();
                        c7018.m12172(bArrM8307);
                        m12170(i, c7018);
                    } catch (Exception unused) {
                        Charset charset = StandardCharsets.UTF_8;
                        String str = new String(bArrM8307, charset);
                        byte[] bytes = str.getBytes(charset);
                        if (bArrM8307.length == bytes.length) {
                            for (int i3 = 0; i3 < bArrM8307.length; i3++) {
                                if (bArrM8307[i3] == bytes[i3]) {
                                }
                            }
                            m12170(i, str);
                        }
                        m12170(i, AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜喵呜呜") + m12168(bArrM8307));
                        break;
                    }
                } catch (Exception unused2) {
                    m12170(i, AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜喵呜呜").concat(m12168(bArrM8307)));
                }
            } else if (i2 != 5) {
                m12170(i, AbstractC9234.m14531(816) + i2);
            } else {
                m12170(i, Integer.valueOf(abstractC4309M8253.m8306()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONObject m12173() {
        JSONObject jSONObject = new JSONObject();
        HashMap map = this.f17362;
        for (Integer num : map.keySet()) {
            List list = (List) map.get(num);
            if (list.size() > 1) {
                JSONArray jSONArray = new JSONArray();
                for (Object objM12173 : list) {
                    if (objM12173 instanceof C7018) {
                        objM12173 = ((C7018) objM12173).m12173();
                    }
                    jSONArray.add(objM12173);
                }
                jSONObject.put(String.valueOf(num), jSONArray);
            } else {
                for (Object objM121732 : list) {
                    String strValueOf = String.valueOf(num);
                    if (objM121732 instanceof C7018) {
                        objM121732 = ((C7018) objM121732).m12173();
                    }
                    jSONObject.put(strValueOf, objM121732);
                }
            }
        }
        return jSONObject;
    }
}
