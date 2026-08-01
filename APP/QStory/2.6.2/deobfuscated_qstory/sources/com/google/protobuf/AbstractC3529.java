package com.google.protobuf;

import android.R;
import bsh.C2632;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3529 implements InterfaceC3449 {
    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = AbstractC3401.f11054;
        iterable.getClass();
        if (iterable instanceof InterfaceC3424) {
            List listMo7507 = ((InterfaceC3424) iterable).mo7507();
            InterfaceC3424 interfaceC3424 = (InterfaceC3424) list;
            int size = list.size();
            for (Object obj : listMo7507) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC3424.size() - size) + " is null.";
                    for (int size2 = interfaceC3424.size() - 1; size2 >= size; size2--) {
                        interfaceC3424.remove(size2);
                    }
                    C2632.m5298(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    interfaceC3424.mo7508((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC3424.mo7508(ByteString.copyFrom((byte[]) obj));
                } else {
                    interfaceC3424.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC3370) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof C3379) {
                C3379 c3379 = (C3379) list;
                c3379.m7497(c3379.f11025 + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m7769(size4, list);
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
                m7769(size4, list);
                throw null;
            }
            list.add(boolVar);
        }
    }

    public static UninitializedMessageException newUninitializedMessageException(InterfaceC3440 interfaceC3440) {
        return new UninitializedMessageException(interfaceC3440);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7769(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public abstract AbstractC3529 internalMergeFrom(AbstractC3528 abstractC3528);

    public boolean mergeDelimitedFrom(InputStream inputStream, C3696 c3696) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom(new C3530(inputStream, AbstractC3473.m7703(inputStream, i), 0), c3696);
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3449
    public AbstractC3529 mergeFrom(InterfaceC3440 interfaceC3440) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC3440)) {
            return internalMergeFrom((AbstractC3528) interfaceC3440);
        }
        C5919.m11249("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public abstract AbstractC3529 mergeFrom(InputStream inputStream, C3696 c3696);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m7770(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C3696.m7960());
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
