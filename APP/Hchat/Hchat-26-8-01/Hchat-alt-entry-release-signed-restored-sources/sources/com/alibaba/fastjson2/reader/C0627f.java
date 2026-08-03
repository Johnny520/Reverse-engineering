package com.alibaba.fastjson2.reader;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0627f implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1962a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.alibaba.fastjson2.reader.ObjectReaderImplList.of(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.ObjectReader, com.alibaba.fastjson2.reader.ObjectReaderImplList.readJSONBObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object, com.alibaba.fastjson2.reader.ObjectReaderImplListStr.readJSONBObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object, com.alibaba.fastjson2.reader.ObjectReaderImplMap.<clinit>():void, com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.ObjectReader, com.alibaba.fastjson2.reader.ObjectReaderProvider.getObjectReaderModule(java.lang.reflect.Type):com.alibaba.fastjson2.reader.ObjectReader] */
    public /* synthetic */ C0627f(int i9) {
        this.f1962a = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.reader.ObjectReaderImplList.h(java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.reader.ObjectReaderImplListStr.b(java.util.Collection):java.util.Collection */
    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.reader.ObjectReaderImplMap.a(java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.reader.ObjectReaderProvider.p(java.lang.String):java.net.InetAddress */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1962a) {
            case 0:
                return Collections.synchronizedSet((Set) obj);
            case 1:
                return Collections.unmodifiableCollection((Collection) obj);
            case 2:
                return Collections.unmodifiableList((List) obj);
            case 3:
                return Collections.unmodifiableSet((Set) obj);
            case 4:
                return ObjectReaderImplList.lambda$readJSONBObject$7((Collection) obj);
            case 5:
                return ObjectReaderImplList.lambda$readJSONBObject$8((List) obj);
            case 6:
                return ObjectReaderImplList.lambda$readJSONBObject$9((Collection) obj);
            case 7:
                return Collections.unmodifiableList((List) obj);
            case 8:
                return Collections.synchronizedSortedSet((SortedSet) obj);
            case 9:
                return ObjectReaderImplList.lambda$of$1(obj);
            case 10:
                return ObjectReaderImplList.lambda$of$2(obj);
            case 11:
                return ObjectReaderImplList.lambda$of$3(obj);
            case 12:
                return ObjectReaderImplList.lambda$of$4(obj);
            case 13:
                return ObjectReaderImplList.lambda$of$5(obj);
            case 14:
                return ObjectReaderImplList.lambda$of$6(obj);
            case 15:
                return Collections.synchronizedList((List) obj);
            case 16:
                return Collections.synchronizedCollection((Collection) obj);
            case 17:
                return ObjectReaderImplListStr.lambda$readJSONBObject$0((Collection) obj);
            case 18:
                return ObjectReaderImplListStr.lambda$readJSONBObject$1((Collection) obj);
            case 19:
                return Collections.synchronizedMap((Map) obj);
            case 20:
                return Collections.synchronizedSortedMap((SortedMap) obj);
            case 21:
                return Collections.unmodifiableMap((Map) obj);
            case 22:
                return ObjectReaderImplMap.lambda$static$0(obj);
            case 23:
                return Duration.parse((String) obj);
            case 24:
                return ZoneId.of((String) obj);
            case 25:
                return TimeZone.getTimeZone((String) obj);
            case 26:
                return new AtomicIntegerArray((int[]) obj);
            case 27:
                return new AtomicLongArray((long[]) obj);
            case 28:
                return ObjectReaderProvider.lambda$getObjectReaderModule$20((String) obj);
            default:
                return new SimpleDateFormat((String) obj);
        }
    }
}
