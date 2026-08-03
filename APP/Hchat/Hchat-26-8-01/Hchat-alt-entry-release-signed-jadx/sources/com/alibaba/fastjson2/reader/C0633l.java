package com.alibaba.fastjson2.reader;

import java.net.URI;
import java.nio.charset.Charset;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0633l implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1973a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.alibaba.fastjson2.reader.ObjectReaderProvider.buildInitTypeConverts():java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.util.Map<java.lang.reflect.Type, java.util.function.Function>>, com.alibaba.fastjson2.reader.ObjectReaderProvider.getObjectReaderModule(java.lang.reflect.Type):com.alibaba.fastjson2.reader.ObjectReader] */
    public /* synthetic */ C0633l(int i9) {
        this.f1973a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1973a) {
            case 0:
                return Period.parse((String) obj);
            case 1:
                return new AtomicBoolean(((Boolean) obj).booleanValue());
            case 2:
                return URI.create((String) obj);
            case 3:
                return Charset.forName((String) obj);
            case 4:
                return ObjectReaderProvider.lambda$getObjectReaderModule$16((String) obj);
            case 5:
                return ObjectReaderProvider.lambda$getObjectReaderModule$17((String) obj);
            case 6:
                return Pattern.compile((String) obj);
            case 7:
                return ZoneOffset.of((String) obj);
            case 8:
                return ObjectReaderProvider.lambda$buildInitTypeConverts$0(obj);
            case 9:
                return ObjectReaderProvider.lambda$buildInitTypeConverts$1(obj);
            default:
                return ObjectReaderProvider.lambda$buildInitTypeConverts$2(obj);
        }
    }
}
