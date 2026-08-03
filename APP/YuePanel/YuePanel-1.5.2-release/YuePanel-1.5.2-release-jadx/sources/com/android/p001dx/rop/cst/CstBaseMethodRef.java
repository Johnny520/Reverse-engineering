package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.Prototype;
import com.android.p001dx.rop.type.Type;
import com.google.flatbuffers.reflection.BaseType;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstBaseMethodRef extends CstMemberRef {
    private Prototype instancePrototype;
    private final Prototype prototype;

    public CstBaseMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
        String string = getNat().getDescriptor().getString();
        if (isSignaturePolymorphic()) {
            this.prototype = Prototype.fromDescriptor(string);
        } else {
            this.prototype = Prototype.intern(string);
        }
        this.instancePrototype = null;
    }

    @Override // com.android.p001dx.rop.cst.CstMemberRef, com.android.p001dx.rop.cst.Constant
    public final int compareTo0(Constant constant) {
        int iCompareTo0 = super.compareTo0(constant);
        return iCompareTo0 != 0 ? iCompareTo0 : this.prototype.compareTo(((CstBaseMethodRef) constant).prototype);
    }

    public final int getParameterWordCount(boolean z) {
        return getPrototype(z).getParameterTypes().getWordCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Prototype getPrototype() {
        return this.prototype;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final Type getType() {
        return this.prototype.getReturnType();
    }

    public final boolean isClassInit() {
        return getNat().isClassInit();
    }

    public final boolean isInstanceInit() {
        return getNat().isInstanceInit();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean isSignaturePolymorphic() {
        CstType definingClass = getDefiningClass();
        if (definingClass.equals(CstType.METHOD_HANDLE)) {
            String string = getNat().getName().getString();
            string.hashCode();
            if (string.equals("invoke") || string.equals("invokeExact")) {
                return true;
            }
        } else if (definingClass.equals(CstType.VAR_HANDLE)) {
            String string2 = getNat().getName().getString();
            string2.hashCode();
            byte b = -1;
            switch (string2.hashCode()) {
                case -1946504908:
                    if (string2.equals("getAndBitwiseOrRelease")) {
                        b = 0;
                    }
                    break;
                case -1686727776:
                    if (string2.equals("getAndBitwiseAndRelease")) {
                        b = 1;
                    }
                    break;
                case -1671098288:
                    if (string2.equals("compareAndSet")) {
                        b = 2;
                    }
                    break;
                case -1292078254:
                    if (string2.equals("compareAndExchangeRelease")) {
                        b = 3;
                    }
                    break;
                case -1117944904:
                    if (string2.equals("weakCompareAndSet")) {
                        b = 4;
                    }
                    break;
                case -1103072857:
                    if (string2.equals("getAndAddRelease")) {
                        b = 5;
                    }
                    break;
                case -1032914329:
                    if (string2.equals("getAndBitwiseAnd")) {
                        b = 6;
                    }
                    break;
                case -1032892181:
                    if (string2.equals("getAndBitwiseXor")) {
                        b = 7;
                    }
                    break;
                case -794517348:
                    if (string2.equals("getAndBitwiseXorRelease")) {
                        b = 8;
                    }
                    break;
                case -567150350:
                    if (string2.equals("weakCompareAndSetPlain")) {
                        b = 9;
                    }
                    break;
                case -240822786:
                    if (string2.equals("weakCompareAndSetAcquire")) {
                        b = 10;
                    }
                    break;
                case -230706875:
                    if (string2.equals("setRelease")) {
                        b = 11;
                    }
                    break;
                case -127361888:
                    if (string2.equals("getAcquire")) {
                        b = 12;
                    }
                    break;
                case -37641530:
                    if (string2.equals("getAndSetRelease")) {
                        b = 13;
                    }
                    break;
                case 102230:
                    if (string2.equals("get")) {
                        b = 14;
                    }
                    break;
                case 113762:
                    if (string2.equals("set")) {
                        b = 15;
                    }
                    break;
                case 93645315:
                    if (string2.equals("getAndBitwiseOrAcquire")) {
                        b = BaseType.Union;
                    }
                    break;
                case 101293086:
                    if (string2.equals("setVolatile")) {
                        b = BaseType.Array;
                    }
                    break;
                case 189872914:
                    if (string2.equals("getVolatile")) {
                        b = BaseType.Vector64;
                    }
                    break;
                case 282707520:
                    if (string2.equals("getAndAdd")) {
                        b = BaseType.MaxBaseType;
                    }
                    break;
                case 282724865:
                    if (string2.equals("getAndSet")) {
                        b = 20;
                    }
                    break;
                case 353422447:
                    if (string2.equals("getAndBitwiseAndAcquire")) {
                        b = 21;
                    }
                    break;
                case 470702883:
                    if (string2.equals("setOpaque")) {
                        b = 22;
                    }
                    break;
                case 685319959:
                    if (string2.equals("getOpaque")) {
                        b = 23;
                    }
                    break;
                case 748071969:
                    if (string2.equals("compareAndExchangeAcquire")) {
                        b = 24;
                    }
                    break;
                case 937077366:
                    if (string2.equals("getAndAddAcquire")) {
                        b = 25;
                    }
                    break;
                case 1245632875:
                    if (string2.equals("getAndBitwiseXorAcquire")) {
                        b = 26;
                    }
                    break;
                case 1352153939:
                    if (string2.equals("getAndBitwiseOr")) {
                        b = 27;
                    }
                    break;
                case 1483964149:
                    if (string2.equals("compareAndExchange")) {
                        b = 28;
                    }
                    break;
                case 2002508693:
                    if (string2.equals("getAndSetAcquire")) {
                        b = 29;
                    }
                    break;
                case 2013994287:
                    if (string2.equals("weakCompareAndSetRelease")) {
                        b = 30;
                    }
                    break;
            }
            switch (b) {
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final Prototype getPrototype(boolean z) {
        if (z) {
            return this.prototype;
        }
        if (this.instancePrototype == null) {
            this.instancePrototype = this.prototype.withFirstParameter(getDefiningClass().getClassType());
        }
        return this.instancePrototype;
    }
}
