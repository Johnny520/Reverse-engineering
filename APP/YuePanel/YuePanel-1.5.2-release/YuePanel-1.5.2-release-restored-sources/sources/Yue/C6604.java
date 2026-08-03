package Yue;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@InterfaceC4772
public final class C6604 implements ParameterizedType, InterfaceC8011 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Class<?> f2169;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final Type f2170;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Type[] f16971;

    /* JADX INFO: renamed from: Yue.ۥۣۡۦۥ$ۥ */
    public /* synthetic */ class C1027 extends C5153 implements InterfaceC5124<Type, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1027 f16972 = new C1027();

        public C1027() {
            super(1, C8038.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 Type type) {
            C5499.m17103(type, "p0");
            return C8038.m25420(type);
        }
    }

    public C6604(@InterfaceC6399 Class<?> cls, @InterfaceC6489 Type type, @InterfaceC6399 List<? extends Type> list) {
        C5499.m17103(cls, "rawType");
        C5499.m17103(list, "typeArguments");
        this.f2169 = cls;
        this.f2170 = type;
        this.f16971 = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (C5499.m17094(this.f2169, parameterizedType.getRawType()) && C5499.m17094(this.f2170, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC6399
    public Type[] getActualTypeArguments() {
        return this.f16971;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC6489
    public Type getOwnerType() {
        return this.f2170;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC6399
    public Type getRawType() {
        return this.f2169;
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC8011
    @InterfaceC6399
    public String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.f2170;
        if (type != null) {
            sb.append(C8038.m25420(type));
            sb.append("$");
            sb.append(this.f2169.getSimpleName());
        } else {
            sb.append(C8038.m25420(this.f2169));
        }
        Type[] typeArr = this.f16971;
        if (!(typeArr.length == 0)) {
            C3411.m7994(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : C1027.f16972);
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f2169.hashCode();
        Type type = this.f2170;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @InterfaceC6399
    public String toString() {
        return getTypeName();
    }
}
