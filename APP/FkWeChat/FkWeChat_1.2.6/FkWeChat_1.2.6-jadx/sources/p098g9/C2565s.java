package p098g9;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1055q;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: g9.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565s implements ParameterizedType, Type {

    /* JADX INFO: renamed from: q */
    public final Class f6829q;

    /* JADX INFO: renamed from: r */
    public final Type f6830r;

    /* JADX INFO: renamed from: s */
    public final Type[] f6831s;

    /* JADX INFO: renamed from: g9.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f6832y = new a();

        public a() {
            super(1, AbstractC2567u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final String mo27m(Type type) {
            type.getClass();
            return AbstractC2567u.m9100h(type);
        }
    }

    public C2565s(Class cls, Type type, List list) {
        cls.getClass();
        list.getClass();
        this.f6829q = cls;
        this.f6830r = type;
        this.f6831s = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC1061t.m3842c(this.f6829q, parameterizedType.getRawType()) && AbstractC1061t.m3842c(this.f6830r, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f6831s;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f6830r;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f6829q;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f6830r;
        if (type != null) {
            sb2.append(AbstractC2567u.m9100h(type));
            sb2.append("$");
            sb2.append(this.f6829q.getSimpleName());
        } else {
            sb2.append(AbstractC2567u.m9100h(this.f6829q));
        }
        Type[] typeArr = this.f6831s;
        if (!(typeArr.length == 0)) {
            AbstractC5106t.m20750q0(typeArr, sb2, null, "<", ">", 0, null, a.f6832y, 50, null);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.f6829q.hashCode();
        Type type = this.f6830r;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
