package p041V;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import p037T.C0265p;

/* JADX INFO: renamed from: V.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0313f implements InterfaceC0323p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Type f688c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0313f(Type type, int i2) {
        this.f687b = i2;
        this.f688c = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.InterfaceC0323p
    /* JADX INFO: renamed from: n */
    public final Object mo143n() {
        switch (this.f687b) {
            case 0:
                Type type = this.f688c;
                if (!(type instanceof ParameterizedType)) {
                    throw new C0265p("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0265p("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f688c;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new C0265p("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new C0265p("Invalid EnumMap type: " + type3.toString());
        }
    }
}
