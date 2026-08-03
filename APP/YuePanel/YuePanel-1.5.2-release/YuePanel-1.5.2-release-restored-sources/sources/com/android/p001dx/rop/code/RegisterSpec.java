package com.android.p001dx.rop.code;

import com.android.dex.DexFormat;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.rop.type.TypeBearer;
import com.android.p001dx.util.ToHuman;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class RegisterSpec implements TypeBearer, ToHuman, Comparable<RegisterSpec> {
    public static final String PREFIX = "v";
    private final LocalItem local;
    private final int reg;
    private final TypeBearer type;
    private static final ConcurrentHashMap<Object, RegisterSpec> theInterns = new ConcurrentHashMap<>(DexFormat.API_SPACES_IN_SIMPLE_NAME, 0.75f);
    private static final ThreadLocal<ForComparison> theInterningItem = new ThreadLocal<ForComparison>() { // from class: com.android.dx.rop.code.RegisterSpec.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public ForComparison initialValue() {
            return new ForComparison();
        }
    };

    public static class ForComparison {
        private LocalItem local;
        private int reg;
        private TypeBearer type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private ForComparison() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof RegisterSpec) {
                return ((RegisterSpec) obj).equals(this.reg, this.type, this.local);
            }
            return false;
        }

        public int hashCode() {
            return RegisterSpec.hashCodeOf(this.reg, this.type, this.local);
        }

        public void set(int i, TypeBearer typeBearer, LocalItem localItem) {
            this.reg = i;
            this.type = typeBearer;
            this.local = localItem;
        }

        public RegisterSpec toRegisterSpec() {
            return new RegisterSpec(this.reg, this.type, this.local);
        }
    }

    public static void clearInternTable() {
        theInterns.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hashCodeOf(int i, TypeBearer typeBearer, LocalItem localItem) {
        return ((((localItem != null ? localItem.hashCode() : 0) * 31) + typeBearer.hashCode()) * 31) + i;
    }

    private static RegisterSpec intern(int i, TypeBearer typeBearer, LocalItem localItem) {
        RegisterSpec registerSpecPutIfAbsent;
        ForComparison forComparison = theInterningItem.get();
        forComparison.set(i, typeBearer, localItem);
        ConcurrentHashMap<Object, RegisterSpec> concurrentHashMap = theInterns;
        RegisterSpec registerSpec = concurrentHashMap.get(forComparison);
        return (registerSpec != null || (registerSpecPutIfAbsent = concurrentHashMap.putIfAbsent((registerSpec = forComparison.toRegisterSpec()), registerSpec)) == null) ? registerSpec : registerSpecPutIfAbsent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RegisterSpec make(int i, TypeBearer typeBearer) {
        return intern(i, typeBearer, null);
    }

    public static RegisterSpec makeLocalOptional(int i, TypeBearer typeBearer, LocalItem localItem) {
        return intern(i, typeBearer, localItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String regString(int i) {
        return PREFIX + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String toString0(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(regString());
        sb.append(":");
        LocalItem localItem = this.local;
        if (localItem != null) {
            sb.append(localItem.toString());
        }
        Type type = this.type.getType();
        sb.append(type);
        if (type != this.type) {
            sb.append("=");
            if (z) {
                TypeBearer typeBearer = this.type;
                if (typeBearer instanceof CstString) {
                    sb.append(((CstString) typeBearer).toQuoted());
                } else if (z) {
                    TypeBearer typeBearer2 = this.type;
                    if (typeBearer2 instanceof Constant) {
                        sb.append(typeBearer2.toHuman());
                    } else {
                        sb.append(this.type);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSpec) {
            RegisterSpec registerSpec = (RegisterSpec) obj;
            return equals(registerSpec.reg, registerSpec.type, registerSpec.local);
        }
        if (!(obj instanceof ForComparison)) {
            return false;
        }
        ForComparison forComparison = (ForComparison) obj;
        return equals(forComparison.reg, forComparison.type, forComparison.local);
    }

    public boolean equalsUsingSimpleType(RegisterSpec registerSpec) {
        return matchesVariable(registerSpec) && this.reg == registerSpec.reg;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
        return this.type.getBasicFrameType();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final int getBasicType() {
        return this.type.getBasicType();
    }

    public int getCategory() {
        return this.type.getType().getCategory();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public TypeBearer getFrameType() {
        return this.type.getFrameType();
    }

    public LocalItem getLocalItem() {
        return this.local;
    }

    public int getNextReg() {
        return this.reg + getCategory();
    }

    public int getReg() {
        return this.reg;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return this.type.getType();
    }

    public TypeBearer getTypeBearer() {
        return this.type;
    }

    public int hashCode() {
        return hashCodeOf(this.reg, this.type, this.local);
    }

    public RegisterSpec intersect(RegisterSpec registerSpec, boolean z) {
        TypeBearer type;
        if (this == registerSpec) {
            return this;
        }
        if (registerSpec == null || this.reg != registerSpec.getReg()) {
            return null;
        }
        LocalItem localItem = this.local;
        LocalItem localItem2 = (localItem == null || !localItem.equals(registerSpec.getLocalItem())) ? null : this.local;
        boolean z2 = localItem2 == this.local;
        if ((z && !z2) || (type = getType()) != registerSpec.getType()) {
            return null;
        }
        if (this.type.equals(registerSpec.getTypeBearer())) {
            type = this.type;
        }
        if (type == this.type && z2) {
            return this;
        }
        int i = this.reg;
        return localItem2 == null ? make(i, type) : make(i, type, localItem2);
    }

    public boolean isCategory1() {
        return this.type.getType().isCategory1();
    }

    public boolean isCategory2() {
        return this.type.getType().isCategory2();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final boolean isConstant() {
        return false;
    }

    public boolean isEvenRegister() {
        return (getReg() & 1) == 0;
    }

    public boolean matchesVariable(RegisterSpec registerSpec) {
        if (registerSpec == null || !this.type.getType().equals(registerSpec.type.getType())) {
            return false;
        }
        LocalItem localItem = this.local;
        LocalItem localItem2 = registerSpec.local;
        return localItem == localItem2 || (localItem != null && localItem.equals(localItem2));
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return toString0(true);
    }

    public String toString() {
        return toString0(false);
    }

    public RegisterSpec withLocalItem(LocalItem localItem) {
        LocalItem localItem2 = this.local;
        return (localItem2 == localItem || (localItem2 != null && localItem2.equals(localItem))) ? this : makeLocalOptional(this.reg, this.type, localItem);
    }

    public RegisterSpec withOffset(int i) {
        return i == 0 ? this : withReg(this.reg + i);
    }

    public RegisterSpec withReg(int i) {
        return this.reg == i ? this : makeLocalOptional(i, this.type, this.local);
    }

    public RegisterSpec withSimpleType() {
        TypeBearer typeBearer = this.type;
        Type type = typeBearer instanceof Type ? (Type) typeBearer : typeBearer.getType();
        if (type.isUninitialized()) {
            type = type.getInitializedType();
        }
        return type == typeBearer ? this : makeLocalOptional(this.reg, type, this.local);
    }

    public RegisterSpec withType(TypeBearer typeBearer) {
        return makeLocalOptional(this.reg, typeBearer, this.local);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private RegisterSpec(int i, TypeBearer typeBearer, LocalItem localItem) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (typeBearer == null) {
            throw new NullPointerException("type == null");
        }
        this.reg = i;
        this.type = typeBearer;
        this.local = localItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static RegisterSpec make(int i, TypeBearer typeBearer, LocalItem localItem) {
        if (localItem != null) {
            return intern(i, typeBearer, localItem);
        }
        throw new NullPointerException("local  == null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(RegisterSpec registerSpec) {
        int i = this.reg;
        int i2 = registerSpec.reg;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (this == registerSpec) {
            return 0;
        }
        int iCompareTo = this.type.getType().compareTo(registerSpec.type.getType());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        LocalItem localItem = this.local;
        if (localItem == null) {
            return registerSpec.local == null ? 0 : -1;
        }
        LocalItem localItem2 = registerSpec.local;
        if (localItem2 == null) {
            return 1;
        }
        return localItem.compareTo(localItem2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String regString() {
        return regString(this.reg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean equals(int i, TypeBearer typeBearer, LocalItem localItem) {
        LocalItem localItem2;
        return this.reg == i && this.type.equals(typeBearer) && ((localItem2 = this.local) == localItem || (localItem2 != null && localItem2.equals(localItem)));
    }
}
