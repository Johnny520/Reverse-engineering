package com.alibaba.fastjson2.reader;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2769 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8438;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8438) {
            case 0:
                return ZoneOffset.of((String) obj);
            case 1:
                return ZoneId.of((String) obj);
            case 2:
                return TimeZone.getTimeZone((String) obj);
            case 3:
                return new AtomicIntegerArray((int[]) obj);
            case 4:
                return ((List) obj).stream();
            case 5:
                return new ArrayList();
            case 6:
                return new ArrayList();
            case 7:
                return new ArrayList();
            case 8:
                return new ArrayList();
            case 9:
                return Collections.unmodifiableSet((Set) obj);
            case 10:
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            case 11:
                return Collections.unmodifiableNavigableSet((NavigableSet) obj);
            case 12:
                return Collections.synchronizedList((List) obj);
            case 13:
                return Collections.unmodifiableCollection((Collection) obj);
            case 14:
                return Collections.unmodifiableList((List) obj);
            case 15:
                return Collections.unmodifiableSet((Set) obj);
            case 16:
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            case 17:
                return Collections.unmodifiableNavigableSet((NavigableSet) obj);
            case 18:
                return Collections.singleton(((Collection) obj).iterator().next());
            case 19:
                return Collections.synchronizedCollection((Collection) obj);
            case 20:
                return Collections.singletonList(((List) obj).get(0));
            case 21:
                return Collections.singletonList(((Collection) obj).iterator().next());
            case 22:
                return Collections.synchronizedSet((Set) obj);
            case 23:
                return Collections.synchronizedSortedSet((SortedSet) obj);
            case 24:
                return Collections.synchronizedNavigableSet((NavigableSet) obj);
            case 25:
                return Collections.singleton(((List) obj).get(0));
            case 26:
                return Collections.singletonList(((List) obj).get(0));
            case 27:
                return Arrays.asList(((List) obj).toArray());
            case 28:
                return Collections.unmodifiableCollection((Collection) obj);
            default:
                return Collections.unmodifiableList((List) obj);
        }
    }
}
