package bsh.classpath;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2878;
import com.alibaba.fastjson2.C2872;
import com.alibaba.fastjson2.C2921;
import java.io.File;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Function;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2604 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7796;

    public /* synthetic */ C2604(int i) {
        this.f7796 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object next = null;
        switch (this.f7796) {
            case 0:
                return ((Path) obj).toString();
            case 1:
                return C2610.m5148((String) obj);
            case 2:
                return Boolean.valueOf(((AbstractC2878) obj).f9101);
            case 3:
                return C2872.m5950(obj);
            case 4:
                if (obj == null) {
                    return null;
                }
                if (obj instanceof C2921) {
                    obj = ((C2921) obj).f9260;
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return null;
                    }
                    return list.get(0);
                }
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    if (collection.isEmpty()) {
                        return null;
                    }
                    return collection.iterator().next();
                }
                if (!obj.getClass().isArray()) {
                    return obj;
                }
                if (Array.getLength(obj) == 0) {
                    return null;
                }
                return Array.get(obj, 0);
            case 5:
                if (obj == null) {
                    return null;
                }
                if (obj instanceof C2921) {
                    obj = ((C2921) obj).f9260;
                }
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    int size = list2.size();
                    if (size == 0) {
                        return null;
                    }
                    return list2.get(size - 1);
                }
                if (!(obj instanceof Collection)) {
                    if (!obj.getClass().isArray()) {
                        return obj;
                    }
                    int length = Array.getLength(obj);
                    if (length == 0) {
                        return null;
                    }
                    return Array.get(obj, length - 1);
                }
                Collection collection2 = (Collection) obj;
                if (collection2.isEmpty()) {
                    return null;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    next = it.next();
                }
                return next;
            case 6:
                if (obj instanceof Double) {
                    return Double.valueOf(Math.floor(((Double) obj).doubleValue()));
                }
                if (obj instanceof Float) {
                    return Double.valueOf(Math.floor(((Float) obj).floatValue()));
                }
                if (obj instanceof BigDecimal) {
                    return ((BigDecimal) obj).setScale(0, RoundingMode.FLOOR);
                }
                if (!(obj instanceof List)) {
                    return obj;
                }
                List list3 = (List) obj;
                int size2 = list3.size();
                for (int i = 0; i < size2; i++) {
                    Object obj2 = list3.get(i);
                    if (obj2 instanceof Double) {
                        list3.set(i, Double.valueOf(Math.floor(((Double) obj2).doubleValue())));
                    } else if (obj2 instanceof Float) {
                        list3.set(i, Double.valueOf(Math.floor(((Float) obj2).floatValue())));
                    } else if (obj2 instanceof BigDecimal) {
                        list3.set(i, ((BigDecimal) obj2).setScale(0, RoundingMode.FLOOR));
                    }
                }
                return obj;
            case 7:
                if (obj instanceof Double) {
                    return Double.valueOf(Math.ceil(((Double) obj).doubleValue()));
                }
                if (obj instanceof Float) {
                    return Double.valueOf(Math.ceil(((Float) obj).floatValue()));
                }
                if (obj instanceof BigDecimal) {
                    return ((BigDecimal) obj).setScale(0, RoundingMode.CEILING);
                }
                if (!(obj instanceof List)) {
                    return obj;
                }
                List list4 = (List) obj;
                int size3 = list4.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Object obj3 = list4.get(i2);
                    if (obj3 instanceof Double) {
                        list4.set(i2, Double.valueOf(Math.ceil(((Double) obj3).doubleValue())));
                    } else if (obj3 instanceof Float) {
                        list4.set(i2, Double.valueOf(Math.ceil(((Float) obj3).floatValue())));
                    } else if (obj3 instanceof BigDecimal) {
                        list4.set(i2, ((BigDecimal) obj3).setScale(0, RoundingMode.CEILING));
                    }
                }
                return obj;
            case 8:
                return C2872.m5952(obj);
            case 9:
                return C2872.m5951(obj);
            case 10:
                return Boolean.valueOf(obj != null);
            case 11:
                if (obj == null) {
                    return null;
                }
                return (obj instanceof String ? (String) obj : obj.toString()).toLowerCase();
            case 12:
                if (obj == null) {
                    return null;
                }
                return (obj instanceof String ? (String) obj : obj.toString()).toUpperCase();
            case 13:
                if (obj == null) {
                    return null;
                }
                return (obj instanceof String ? (String) obj : obj.toString()).trim();
            case 14:
                return obj;
            case 15:
                return new AtomicLongArray((long[]) obj);
            case 16:
                try {
                    return InetAddress.getByName((String) obj);
                } catch (UnknownHostException e) {
                    C0276.m843("create address error", e);
                    return null;
                }
            case 17:
                return Period.parse((String) obj);
            case 18:
                return new SimpleDateFormat((String) obj);
            case 19:
                return ByteBuffer.wrap((byte[]) obj);
            case 20:
                return new AtomicBoolean(((Boolean) obj).booleanValue());
            case 21:
                return URI.create((String) obj);
            case 22:
                return Charset.forName((String) obj);
            case 23:
                return new File((String) obj);
            case 24:
                return Paths.get((String) obj, new String[0]);
            case 25:
                if (obj == null || "null".equals(obj) || obj.equals(0L)) {
                    return null;
                }
                return LocalDateTime.ofInstant(Instant.ofEpochMilli(((Long) obj).longValue()), ZoneId.systemDefault());
            case 26:
                try {
                    return new URL((String) obj);
                } catch (MalformedURLException e2) {
                    C0276.m843("read URL error", e2);
                    return null;
                }
            case 27:
                return Pattern.compile((String) obj);
            default:
                if (obj == null || "null".equals(obj) || "".equals(obj)) {
                    return null;
                }
                return UUID.fromString((String) obj);
        }
    }
}
