package com.google.protobuf;

import android.R;
import bsh.C3466;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4362 implements InterfaceC4282 {
    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = AbstractC4234.f11404;
        iterable.getClass();
        if (iterable instanceof InterfaceC4257) {
            List listMo8053 = ((InterfaceC4257) iterable).mo8053();
            InterfaceC4257 interfaceC4257 = (InterfaceC4257) list;
            int size = list.size();
            for (Object obj : listMo8053) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC4257.size() - size) + " is null.";
                    for (int size2 = interfaceC4257.size() - 1; size2 >= size; size2--) {
                        interfaceC4257.remove(size2);
                    }
                    C3466.m5903(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    interfaceC4257.mo8054((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC4257.mo8054(ByteString.copyFrom((byte[]) obj));
                } else {
                    interfaceC4257.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC4203) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof C4212) {
                C4212 c4212 = (C4212) list;
                c4212.m8043(c4212.f11375 + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m8315(size4, list);
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
                m8315(size4, list);
                throw null;
            }
            list.add(boolVar);
        }
    }

    public static UninitializedMessageException newUninitializedMessageException(InterfaceC4273 interfaceC4273) {
        return new UninitializedMessageException(interfaceC4273);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8315(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public abstract AbstractC4362 internalMergeFrom(AbstractC4361 abstractC4361);

    public boolean mergeDelimitedFrom(InputStream inputStream, C4529 c4529) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom(new C4363(inputStream, AbstractC4306.m8249(inputStream, i), 0), c4529);
        return true;
    }

    @Override // com.google.protobuf.InterfaceC4282
    public AbstractC4362 mergeFrom(InterfaceC4273 interfaceC4273) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC4273)) {
            return internalMergeFrom((AbstractC4361) interfaceC4273);
        }
        C6755.m11869("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public abstract AbstractC4362 mergeFrom(InputStream inputStream, C4529 c4529);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8316(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C4529.m8506());
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
