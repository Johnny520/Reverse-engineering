package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderListFuncImpl<T, V> extends FieldReaderList<T, V> {
    final ObjectReader<V> itemObjectReader;
    final Supplier<List<V>> listCreator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderListFuncImpl(Supplier<List<V>> supplier, ObjectReader<V> objectReader, BiConsumer<T, List<V>> biConsumer, Type type, String str) {
        super(str, List.class, List.class, type, TypeUtils.getClass(type), 0, 0L, null, null, null, null, null, biConsumer);
        this.listCreator = supplier;
        this.itemObjectReader = objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        this.function.accept(t9, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderList
    public Collection<V> createList(JSONReader.Context context) {
        return this.listCreator.get();
    }
}
