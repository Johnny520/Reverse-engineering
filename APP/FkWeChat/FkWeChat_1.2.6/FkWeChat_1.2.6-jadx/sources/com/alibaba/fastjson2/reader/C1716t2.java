package com.alibaba.fastjson2.reader;

import java.util.Collections;
import java.util.SortedSet;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.t2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1716t2 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Collections.unmodifiableSortedSet((SortedSet) obj);
    }
}
