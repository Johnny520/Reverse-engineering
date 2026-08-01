package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.loader.config.HookItemConfig;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.apache.commons.lang3.tuple.Pair;
import p250.C8164;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2700 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8200;

    public /* synthetic */ C2700(int i) {
        this.f8200 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8200) {
            case 0:
                return Collections.singleton(((Collection) obj).iterator().next());
            case 1:
                return Collections.singletonList(((Collection) obj).iterator().next());
            case 2:
                return Collections.synchronizedMap((Map) obj);
            case 3:
                return Collections.synchronizedNavigableMap((NavigableMap) obj);
            case 4:
                return Collections.synchronizedSortedMap((SortedMap) obj);
            case 5:
                return Collections.unmodifiableMap((Map) obj);
            case 6:
                return Collections.unmodifiableSortedMap((SortedMap) obj);
            case 7:
                return Collections.unmodifiableNavigableMap((NavigableMap) obj);
            case 8:
                Map.Entry entry = (Map.Entry) ((Map) obj).entrySet().iterator().next();
                return Collections.singletonMap(entry.getKey(), entry.getValue());
            case 9:
                return new EnumMap((Map) obj);
            case 10:
                return C8164.m13616((BigInteger) obj);
            case 11:
                return ((PluginInfo) obj).getDate();
            case 12:
                return new HookItemConfig((String) obj);
            case 13:
                return Integer.valueOf(((ZipMethod) obj).getCode());
            case 14:
                return new ArrayList();
            case 15:
                return JSONSchema.m5640((JSONObject) obj, null);
            case 16:
                return ((ByteBuffer) obj).array();
            case 17:
                return ((Method) obj).getParameterTypes();
            case 18:
                return ((Field) obj).getDeclaringClass();
            case 19:
                return ((Field) obj).getName();
            case 20:
                return ((ParameterizedType) obj).getActualTypeArguments();
            case 21:
                return ((ParameterizedType) obj).getOwnerType();
            case 22:
                return ((ParameterizedType) obj).getRawType();
            case 23:
                return ((StackTraceElement) obj).getFileName();
            case 24:
                return ((StackTraceElement) obj).getClassName();
            case 25:
                return ((StackTraceElement) obj).getMethodName();
            case 26:
                return ((Method) obj).getDeclaringClass();
            case 27:
                return ((Method) obj).getName();
            case 28:
                return Objects.toString((Path) obj);
            default:
                return ((Pair) obj).getValue();
        }
    }
}
