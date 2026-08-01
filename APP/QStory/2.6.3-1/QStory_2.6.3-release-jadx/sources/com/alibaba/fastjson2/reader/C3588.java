package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3588 extends AbstractC3595 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8747;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3588(String str, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer biConsumer, int i2) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, null);
        this.f8748 = i2;
        this.f8747 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        int i = this.f8748;
        BiConsumer biConsumer = this.f8747;
        JSONSchema jSONSchema = this.f8758;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM6474 = AbstractC3700.m6474(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalM6474);
                }
                try {
                    biConsumer.accept(obj, bigDecimalM6474);
                } catch (Exception e) {
                    C3775.m6951(this, e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM6472 = AbstractC3700.m6472(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigIntegerM6472);
                }
                try {
                    biConsumer.accept(obj, bigIntegerM6472);
                } catch (Exception e2) {
                    C3775.m6951(this, e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM6471 = AbstractC3700.m6471(obj2);
                if (jSONSchema != null) {
                    jSONSchema.mo6208(boolM6471);
                }
                biConsumer.accept(obj, boolM6471);
                break;
            case 3:
                Double dM6478 = AbstractC3700.m6478(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6202(dM6478);
                }
                biConsumer.accept(obj, dM6478);
                break;
            case 4:
                Float fM6476 = AbstractC3700.m6476(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6201(fM6476);
                }
                biConsumer.accept(obj, fM6476);
                break;
            case 5:
                Short shM6461 = AbstractC3700.m6461(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(shM6461);
                }
                biConsumer.accept(obj, shM6461);
                break;
            case 6:
                Integer numM6468 = AbstractC3700.m6468(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6215(numM6468);
                }
                biConsumer.accept(obj, numM6468);
                break;
            case 7:
                Long lM6464 = AbstractC3700.m6464(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6214(lM6464);
                }
                biConsumer.accept(obj, lM6464);
                break;
            case 8:
                Byte bM6481 = AbstractC3700.m6481(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bM6481);
                }
                biConsumer.accept(obj, bM6481);
                break;
            default:
                if (jSONSchema != null) {
                    jSONSchema.m6216(obj2);
                }
                if (obj2 instanceof Boolean) {
                    obj2 = Integer.valueOf(((Boolean) obj2).booleanValue() ? 1 : 0);
                }
                biConsumer.accept(obj, obj2);
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) throws Exception {
        int i = this.f8748;
        BiConsumer biConsumer = this.f8747;
        JSONSchema jSONSchema = this.f8758;
        Byte bValueOf = null;
        Number numberMo6752 = null;
        Integer numMo6773 = null;
        BigDecimal bigDecimalMo6671 = null;
        Double dM6691 = null;
        Long lMo6770 = null;
        BigInteger bigIntegerMo6670 = null;
        Float fMo6677 = null;
        bValueOf = null;
        Boolean boolMo6672 = null;
        shValueOf = null;
        Short shValueOf = null;
        long j = this.f8767;
        switch (i) {
            case 0:
                try {
                    bigDecimalMo6671 = abstractC3732.mo6671();
                    break;
                } catch (Exception e) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalMo6671);
                }
                biConsumer.accept(obj, bigDecimalMo6671);
                return;
            case 1:
                try {
                    bigIntegerMo6670 = abstractC3732.mo6670();
                    break;
                } catch (Exception e2) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e2;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigIntegerMo6670);
                }
                biConsumer.accept(obj, bigIntegerMo6670);
                return;
            case 2:
                try {
                    boolMo6672 = abstractC3732.mo6672();
                    break;
                } catch (Exception e3) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e3;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.mo6208(boolMo6672);
                }
                biConsumer.accept(obj, boolMo6672);
                return;
            case 3:
                try {
                    dM6691 = abstractC3732.m6691();
                    break;
                } catch (Exception e4) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e4;
                    }
                }
                if (dM6691 != null || this.f8760 == null) {
                    if (jSONSchema != null) {
                        jSONSchema.m6202(dM6691);
                    }
                    biConsumer.accept(obj, dM6691);
                    return;
                }
                return;
            case 4:
                try {
                    fMo6677 = abstractC3732.mo6677();
                    break;
                } catch (Exception e5) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e5;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6201(fMo6677);
                }
                biConsumer.accept(obj, fMo6677);
                return;
            case 5:
                try {
                    Integer numMo67732 = abstractC3732.mo6773();
                    if (numMo67732 != null) {
                        shValueOf = Short.valueOf(numMo67732.shortValue());
                        break;
                    }
                } catch (Exception e6) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e6;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6216(shValueOf);
                }
                biConsumer.accept(obj, shValueOf);
                return;
            case 6:
                try {
                    numMo6773 = abstractC3732.mo6773();
                    break;
                } catch (Exception e7) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e7;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo6773);
                }
                biConsumer.accept(obj, numMo6773);
                return;
            case 7:
                try {
                    lMo6770 = abstractC3732.mo6770();
                    break;
                } catch (Exception e8) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e8;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6214(lMo6770);
                }
                biConsumer.accept(obj, lMo6770);
                return;
            case 8:
                try {
                    Integer numMo67733 = abstractC3732.mo6773();
                    if (numMo67733 != null) {
                        bValueOf = Byte.valueOf(numMo67733.byteValue());
                        break;
                    }
                } catch (Exception e9) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e9;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6216(bValueOf);
                }
                biConsumer.accept(obj, bValueOf);
                return;
            default:
                try {
                    numberMo6752 = abstractC3732.mo6752();
                    break;
                } catch (Exception e10) {
                    if ((abstractC3732.m6717(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e10;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m6216(numberMo6752);
                }
                biConsumer.accept(obj, numberMo6752);
                return;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        switch (this.f8748) {
            case 0:
                return abstractC3732.mo6671();
            case 1:
                return abstractC3732.mo6670();
            case 2:
                return abstractC3732.mo6672();
            case 3:
                return abstractC3732.m6691();
            case 4:
                return abstractC3732.mo6677();
            case 5:
                return Short.valueOf((short) abstractC3732.mo6772());
            case 6:
                return abstractC3732.mo6773();
            case 7:
                return abstractC3732.mo6770();
            case 8:
                return abstractC3732.mo6773();
            default:
                return abstractC3732.mo6752();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo6034() {
        switch (this.f8748) {
        }
        return this.f8747;
    }
}
