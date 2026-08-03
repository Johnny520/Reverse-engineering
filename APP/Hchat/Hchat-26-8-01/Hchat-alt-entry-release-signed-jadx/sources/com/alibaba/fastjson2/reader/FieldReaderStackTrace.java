package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderStackTrace extends FieldReaderObject {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderStackTrace(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, biConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(Object obj, Object obj2) {
        if (obj2 != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj2 instanceof Collection) {
                Collection collection = (Collection) obj2;
                Iterator it = collection.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    if (it.next() == null) {
                        i9++;
                    }
                }
                if (i9 == collection.size()) {
                    obj2 = new StackTraceElement[0];
                } else {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[collection.size()];
                    collection.toArray(stackTraceElementArr);
                    obj2 = stackTraceElementArr;
                }
            }
            this.function.accept(obj, obj2);
        }
    }
}
