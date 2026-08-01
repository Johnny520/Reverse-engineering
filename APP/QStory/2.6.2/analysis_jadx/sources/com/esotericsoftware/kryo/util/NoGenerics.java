package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.util.Generics;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class NoGenerics implements Generics {
    public static final Generics INSTANCE = new NoGenerics();

    private NoGenerics() {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Generics.GenericsHierarchy buildHierarchy(Class cls) {
        return Generics.GenericsHierarchy.EMPTY;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int getGenericTypesSize() {
        return 0;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class nextGenericClass() {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Generics.GenericType[] nextGenericTypes() {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int pushTypeVariables(Generics.GenericsHierarchy genericsHierarchy, Generics.GenericType[] genericTypeArr) {
        return 0;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class resolveTypeVariable(TypeVariable typeVariable) {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popGenericType() {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popTypeVariables(int i) {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void pushGenericType(Generics.GenericType genericType) {
    }
}
