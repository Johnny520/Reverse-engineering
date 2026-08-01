package com.esotericsoftware.kryo.util;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface Generics {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class GenericType {
        GenericType[] arguments;
        Type type;

        public GenericType(Class cls, Class cls2, Type type) {
            initialize(cls, cls2, type);
        }

        private void initialize(Class cls, Class cls2, Type type) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                this.type = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                this.arguments = new GenericType[length];
                for (int i = 0; i < length; i++) {
                    this.arguments[i] = new GenericType(cls, cls2, actualTypeArguments[i]);
                }
                return;
            }
            if (!(type instanceof GenericArrayType)) {
                this.type = GenericsUtil.resolveType(cls, cls2, type);
                return;
            }
            int i2 = 1;
            while (true) {
                type = ((GenericArrayType) type).getGenericComponentType();
                if (!(type instanceof GenericArrayType)) {
                    break;
                } else {
                    i2++;
                }
            }
            initialize(cls, cls2, type);
            Type typeResolveType = GenericsUtil.resolveType(cls, cls2, type);
            if (typeResolveType instanceof Class) {
                if (i2 == 1) {
                    this.type = Array.newInstance((Class<?>) typeResolveType, 0).getClass();
                } else {
                    this.type = Array.newInstance((Class<?>) typeResolveType, new int[i2]).getClass();
                }
            }
        }

        public Type getType() {
            return this.type;
        }

        public GenericType[] getTypeParameters() {
            return this.arguments;
        }

        public Class resolve(Generics generics) {
            Type type = this.type;
            return type instanceof Class ? (Class) type : generics.resolveTypeVariable((TypeVariable) type);
        }

        public String toString() {
            boolean zIsArray;
            StringBuilder sb = new StringBuilder(32);
            Type type = this.type;
            if (type instanceof Class) {
                Class elementClass = (Class) type;
                zIsArray = elementClass.isArray();
                if (zIsArray) {
                    elementClass = Util.getElementClass(elementClass);
                }
                sb.append(elementClass.getSimpleName());
                if (this.arguments != null) {
                    sb.append('<');
                    int length = this.arguments.length;
                    for (int i = 0; i < length; i++) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(this.arguments[i].toString());
                    }
                    sb.append('>');
                }
            } else {
                sb.append(type.toString());
                zIsArray = false;
            }
            if (zIsArray) {
                int dimensionCount = Util.getDimensionCount((Class) this.type);
                for (int i2 = 0; i2 < dimensionCount; i2++) {
                    sb.append("[]");
                }
            }
            return sb.toString();
        }
    }

    GenericsHierarchy buildHierarchy(Class cls);

    int getGenericTypesSize();

    Class nextGenericClass();

    GenericType[] nextGenericTypes();

    void popGenericType();

    void popTypeVariables(int i);

    void pushGenericType(GenericType genericType);

    int pushTypeVariables(GenericsHierarchy genericsHierarchy, GenericType[] genericTypeArr);

    Class resolveTypeVariable(TypeVariable typeVariable);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class GenericsHierarchy {
        static final GenericsHierarchy EMPTY = new GenericsHierarchy(0, 0, new int[0], new TypeVariable[0]);
        final int[] counts;
        final TypeVariable[] parameters;
        final int rootTotal;
        final int total;

        public GenericsHierarchy(Class cls) {
            IntArray intArray = new IntArray();
            ArrayList arrayList = new ArrayList();
            Class superclass = cls;
            int iPeek = 0;
            do {
                for (TypeVariable typeVariable : superclass.getTypeParameters()) {
                    arrayList.add(typeVariable);
                    intArray.add(1);
                    Class superclass2 = superclass;
                    while (true) {
                        Type genericSuperclass = superclass2.getGenericSuperclass();
                        superclass2 = superclass2.getSuperclass();
                        if (!(genericSuperclass instanceof ParameterizedType)) {
                            break;
                        }
                        TypeVariable[] typeParameters = superclass2.getTypeParameters();
                        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            if (actualTypeArguments[i] == typeVariable) {
                                typeVariable = typeParameters[i];
                                arrayList.add(typeVariable);
                                intArray.incr(intArray.size - 1, 1);
                            }
                        }
                    }
                    iPeek += intArray.peek();
                }
                superclass = superclass.getSuperclass();
            } while (superclass != null);
            this.total = iPeek;
            this.rootTotal = cls.getTypeParameters().length;
            this.counts = intArray.toArray();
            this.parameters = (TypeVariable[]) arrayList.toArray(new TypeVariable[arrayList.size()]);
        }

        public String toString() {
            StringBuilder sbM700 = AbstractC0900.m700("[");
            int[] iArr = this.counts;
            TypeVariable[] typeVariableArr = this.parameters;
            int i = 0;
            for (int i2 : iArr) {
                int i3 = i2 + i;
                while (i < i3) {
                    if (sbM700.length() > 1) {
                        sbM700.append(", ");
                    }
                    GenericDeclaration genericDeclaration = typeVariableArr[i].getGenericDeclaration();
                    if (genericDeclaration instanceof Class) {
                        sbM700.append(((Class) genericDeclaration).getSimpleName());
                    } else {
                        sbM700.append(genericDeclaration);
                    }
                    sbM700.append('<');
                    sbM700.append(typeVariableArr[i].getName());
                    sbM700.append('>');
                    i++;
                }
            }
            sbM700.append("]");
            return sbM700.toString();
        }

        public GenericsHierarchy(int i, int i2, int[] iArr, TypeVariable[] typeVariableArr) {
            this.total = i;
            this.rootTotal = i2;
            this.counts = iArr;
            this.parameters = typeVariableArr;
        }
    }
}
