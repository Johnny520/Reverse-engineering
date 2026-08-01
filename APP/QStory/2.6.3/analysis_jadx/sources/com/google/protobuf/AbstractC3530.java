package com.google.protobuf;

import android.R;
import bsh.C2633;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3530 implements InterfaceC3450 {
    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = AbstractC3402.f11059;
        iterable.getClass();
        if (iterable instanceof InterfaceC3425) {
            List listMo7494 = ((InterfaceC3425) iterable).mo7494();
            InterfaceC3425 interfaceC3425 = (InterfaceC3425) list;
            int size = list.size();
            for (Object obj : listMo7494) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC3425.size() - size) + " is null.";
                    for (int size2 = interfaceC3425.size() - 1; size2 >= size; size2--) {
                        interfaceC3425.remove(size2);
                    }
                    C2633.m5343(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    interfaceC3425.mo7495((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC3425.mo7495(ByteString.copyFrom((byte[]) obj));
                } else {
                    interfaceC3425.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC3371) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof C3380) {
                C3380 c3380 = (C3380) list;
                c3380.m7484(c3380.f11030 + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m7756(size4, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            R.bool boolVar = (Object) list2.get(i);
            if (boolVar == null) {
                m7756(size4, list);
                throw null;
            }
            list.add(boolVar);
        }
    }

    public static UninitializedMessageException newUninitializedMessageException(InterfaceC3441 interfaceC3441) {
        return new UninitializedMessageException(interfaceC3441);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7756(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public abstract AbstractC3530 internalMergeFrom(AbstractC3529 abstractC3529);

    public boolean mergeDelimitedFrom(InputStream inputStream, C3697 c3697) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom(new C3531(inputStream, AbstractC3474.m7690(inputStream, i), 0), c3697);
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3450
    public AbstractC3530 mergeFrom(InterfaceC3441 interfaceC3441) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC3441)) {
            return internalMergeFrom((AbstractC3529) interfaceC3441);
        }
        C5925.m11310("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public abstract AbstractC3530 mergeFrom(InputStream inputStream, C3697 c3697);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m7757(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C3697.m7947());
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
