package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2754 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8400;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8401;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2754(String str, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer biConsumer, int i2) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, null);
        this.f8401 = i2;
        this.f8400 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        int i = this.f8401;
        BiConsumer biConsumer = this.f8400;
        JSONSchema jSONSchema = this.f8411;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM5869 = AbstractC2866.m5869(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalM5869);
                }
                try {
                    biConsumer.accept(obj, bigDecimalM5869);
                } catch (Exception e) {
                    C2941.m6333(this, e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM5867 = AbstractC2866.m5867(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigIntegerM5867);
                }
                try {
                    biConsumer.accept(obj, bigIntegerM5867);
                } catch (Exception e2) {
                    C2941.m6333(this, e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM5866 = AbstractC2866.m5866(obj2);
                if (jSONSchema != null) {
                    jSONSchema.mo5603(boolM5866);
                }
                biConsumer.accept(obj, boolM5866);
                break;
            case 3:
                Double dM5873 = AbstractC2866.m5873(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5597(dM5873);
                }
                biConsumer.accept(obj, dM5873);
                break;
            case 4:
                Float fM5871 = AbstractC2866.m5871(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5596(fM5871);
                }
                biConsumer.accept(obj, fM5871);
                break;
            case 5:
                Short shM5856 = AbstractC2866.m5856(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(shM5856);
                }
                biConsumer.accept(obj, shM5856);
                break;
            case 6:
                Integer numM5863 = AbstractC2866.m5863(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5610(numM5863);
                }
                biConsumer.accept(obj, numM5863);
                break;
            case 7:
                Long lM5859 = AbstractC2866.m5859(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5609(lM5859);
                }
                biConsumer.accept(obj, lM5859);
                break;
            case 8:
                Byte bM5876 = AbstractC2866.m5876(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bM5876);
                }
                biConsumer.accept(obj, bM5876);
                break;
            default:
                if (jSONSchema != null) {
                    jSONSchema.m5611(obj2);
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
    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) throws Exception {
        int i = this.f8401;
        BiConsumer biConsumer = this.f8400;
        JSONSchema jSONSchema = this.f8411;
        Byte bValueOf = null;
        Number numberMo6147 = null;
        Integer numMo6168 = null;
        BigDecimal bigDecimalMo6065 = null;
        Double dM6085 = null;
        Long lMo6165 = null;
        BigInteger bigIntegerMo6064 = null;
        Float fMo6071 = null;
        bValueOf = null;
        Boolean boolMo6066 = null;
        shValueOf = null;
        Short shValueOf = null;
        long j = this.f8420;
        switch (i) {
            case 0:
                try {
                    bigDecimalMo6065 = abstractC2898.mo6065();
                    break;
                } catch (Exception e) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalMo6065);
                }
                biConsumer.accept(obj, bigDecimalMo6065);
                return;
            case 1:
                try {
                    bigIntegerMo6064 = abstractC2898.mo6064();
                    break;
                } catch (Exception e2) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e2;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigIntegerMo6064);
                }
                biConsumer.accept(obj, bigIntegerMo6064);
                return;
            case 2:
                try {
                    boolMo6066 = abstractC2898.mo6066();
                    break;
                } catch (Exception e3) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e3;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.mo5603(boolMo6066);
                }
                biConsumer.accept(obj, boolMo6066);
                return;
            case 3:
                try {
                    dM6085 = abstractC2898.m6085();
                    break;
                } catch (Exception e4) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e4;
                    }
                }
                if (dM6085 != null || this.f8413 == null) {
                    if (jSONSchema != null) {
                        jSONSchema.m5597(dM6085);
                    }
                    biConsumer.accept(obj, dM6085);
                    return;
                }
                return;
            case 4:
                try {
                    fMo6071 = abstractC2898.mo6071();
                    break;
                } catch (Exception e5) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e5;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5596(fMo6071);
                }
                biConsumer.accept(obj, fMo6071);
                return;
            case 5:
                try {
                    Integer numMo61682 = abstractC2898.mo6168();
                    if (numMo61682 != null) {
                        shValueOf = Short.valueOf(numMo61682.shortValue());
                        break;
                    }
                } catch (Exception e6) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e6;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5611(shValueOf);
                }
                biConsumer.accept(obj, shValueOf);
                return;
            case 6:
                try {
                    numMo6168 = abstractC2898.mo6168();
                    break;
                } catch (Exception e7) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e7;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo6168);
                }
                biConsumer.accept(obj, numMo6168);
                return;
            case 7:
                try {
                    lMo6165 = abstractC2898.mo6165();
                    break;
                } catch (Exception e8) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e8;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5609(lMo6165);
                }
                biConsumer.accept(obj, lMo6165);
                return;
            case 8:
                try {
                    Integer numMo61683 = abstractC2898.mo6168();
                    if (numMo61683 != null) {
                        bValueOf = Byte.valueOf(numMo61683.byteValue());
                        break;
                    }
                } catch (Exception e9) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e9;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5611(bValueOf);
                }
                biConsumer.accept(obj, bValueOf);
                return;
            default:
                try {
                    numberMo6147 = abstractC2898.mo6147();
                    break;
                } catch (Exception e10) {
                    if ((abstractC2898.m6110(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e10;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5611(numberMo6147);
                }
                biConsumer.accept(obj, numberMo6147);
                return;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        switch (this.f8401) {
            case 0:
                return abstractC2898.mo6065();
            case 1:
                return abstractC2898.mo6064();
            case 2:
                return abstractC2898.mo6066();
            case 3:
                return abstractC2898.m6085();
            case 4:
                return abstractC2898.mo6071();
            case 5:
                return Short.valueOf((short) abstractC2898.mo6167());
            case 6:
                return abstractC2898.mo6168();
            case 7:
                return abstractC2898.mo6165();
            case 8:
                return abstractC2898.mo6168();
            default:
                return abstractC2898.mo6147();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo5429() {
        switch (this.f8401) {
        }
        return this.f8400;
    }
}
