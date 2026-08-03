package net.bytebuddy.implementation.bytecode.collection;

/* JADX INFO: loaded from: classes2.dex */
public interface CollectionFactory {
    net.bytebuddy.description.type.TypeDescription.Generic getComponentType();

    net.bytebuddy.implementation.bytecode.StackManipulation withValues(java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r1);
}
