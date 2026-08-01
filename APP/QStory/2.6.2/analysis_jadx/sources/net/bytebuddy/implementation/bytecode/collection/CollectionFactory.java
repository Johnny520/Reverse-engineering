package net.bytebuddy.implementation.bytecode.collection;

import java.util.List;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface CollectionFactory {
    TypeDescription.Generic getComponentType();

    StackManipulation withValues(List<? extends StackManipulation> list);
}
