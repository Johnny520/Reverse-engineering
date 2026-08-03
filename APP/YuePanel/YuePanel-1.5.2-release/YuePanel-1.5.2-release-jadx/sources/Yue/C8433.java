package Yue;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
@InterfaceC4772
public final class C8433 implements WildcardType, InterfaceC8011 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1531 f25283 = new C1531(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C8433 f25284 = new C8433(null, null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Type f3499;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final Type f3500;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۡ$ۥ */
    public static final class C1531 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۥۣۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1531(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8433 m4416() {
            return C8433.f25284;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1531() {
        }
    }

    public C8433(@InterfaceC6489 Type type, @InterfaceC6489 Type type2) {
        this.f3499 = type;
        this.f3500 = type2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @InterfaceC6399
    public Type[] getLowerBounds() {
        Type type = this.f3500;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC8011
    @InterfaceC6399
    public String getTypeName() {
        if (this.f3500 != null) {
            return "? super " + C8038.m25420(this.f3500);
        }
        Type type = this.f3499;
        if (type == null || C5499.m17094(type, Object.class)) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + C8038.m25420(this.f3499);
    }

    @Override // java.lang.reflect.WildcardType
    @InterfaceC6399
    public Type[] getUpperBounds() {
        Type type = this.f3499;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @InterfaceC6399
    public String toString() {
        return getTypeName();
    }
}
