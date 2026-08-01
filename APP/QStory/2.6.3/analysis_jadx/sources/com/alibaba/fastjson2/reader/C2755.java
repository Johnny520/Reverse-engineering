package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2755 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8402;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8403;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2755(String str, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer biConsumer, int i2) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, null);
        this.f8403 = i2;
        this.f8402 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        int i = this.f8403;
        BiConsumer biConsumer = this.f8402;
        JSONSchema jSONSchema = this.f8413;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM5914 = AbstractC2867.m5914(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigDecimalM5914);
                }
                try {
                    biConsumer.accept(obj, bigDecimalM5914);
                } catch (Exception e) {
                    C2942.m6391(this, e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM5912 = AbstractC2867.m5912(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigIntegerM5912);
                }
                try {
                    biConsumer.accept(obj, bigIntegerM5912);
                } catch (Exception e2) {
                    C2942.m6391(this, e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM5911 = AbstractC2867.m5911(obj2);
                if (jSONSchema != null) {
                    jSONSchema.mo5648(boolM5911);
                }
                biConsumer.accept(obj, boolM5911);
                break;
            case 3:
                Double dM5918 = AbstractC2867.m5918(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5642(dM5918);
                }
                biConsumer.accept(obj, dM5918);
                break;
            case 4:
                Float fM5916 = AbstractC2867.m5916(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5641(fM5916);
                }
                biConsumer.accept(obj, fM5916);
                break;
            case 5:
                Short shM5901 = AbstractC2867.m5901(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(shM5901);
                }
                biConsumer.accept(obj, shM5901);
                break;
            case 6:
                Integer numM5908 = AbstractC2867.m5908(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5655(numM5908);
                }
                biConsumer.accept(obj, numM5908);
                break;
            case 7:
                Long lM5904 = AbstractC2867.m5904(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5654(lM5904);
                }
                biConsumer.accept(obj, lM5904);
                break;
            case 8:
                Byte bM5921 = AbstractC2867.m5921(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bM5921);
                }
                biConsumer.accept(obj, bM5921);
                break;
            default:
                if (jSONSchema != null) {
                    jSONSchema.m5656(obj2);
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
    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) throws Exception {
        int i = this.f8403;
        BiConsumer biConsumer = this.f8402;
        JSONSchema jSONSchema = this.f8413;
        Byte bValueOf = null;
        Number numberMo6192 = null;
        Integer numMo6213 = null;
        BigDecimal bigDecimalMo6111 = null;
        Double dM6131 = null;
        Long lMo6210 = null;
        BigInteger bigIntegerMo6110 = null;
        Float fMo6117 = null;
        bValueOf = null;
        Boolean boolMo6112 = null;
        shValueOf = null;
        Short shValueOf = null;
        long j = this.f8422;
        switch (i) {
            case 0:
                try {
                    bigDecimalMo6111 = abstractC2899.mo6111();
                    break;
                } catch (Exception e) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigDecimalMo6111);
                }
                biConsumer.accept(obj, bigDecimalMo6111);
                return;
            case 1:
                try {
                    bigIntegerMo6110 = abstractC2899.mo6110();
                    break;
                } catch (Exception e2) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e2;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigIntegerMo6110);
                }
                biConsumer.accept(obj, bigIntegerMo6110);
                return;
            case 2:
                try {
                    boolMo6112 = abstractC2899.mo6112();
                    break;
                } catch (Exception e3) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e3;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.mo5648(boolMo6112);
                }
                biConsumer.accept(obj, boolMo6112);
                return;
            case 3:
                try {
                    dM6131 = abstractC2899.m6131();
                    break;
                } catch (Exception e4) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e4;
                    }
                }
                if (dM6131 != null || this.f8415 == null) {
                    if (jSONSchema != null) {
                        jSONSchema.m5642(dM6131);
                    }
                    biConsumer.accept(obj, dM6131);
                    return;
                }
                return;
            case 4:
                try {
                    fMo6117 = abstractC2899.mo6117();
                    break;
                } catch (Exception e5) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e5;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5641(fMo6117);
                }
                biConsumer.accept(obj, fMo6117);
                return;
            case 5:
                try {
                    Integer numMo62132 = abstractC2899.mo6213();
                    if (numMo62132 != null) {
                        shValueOf = Short.valueOf(numMo62132.shortValue());
                        break;
                    }
                } catch (Exception e6) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e6;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5656(shValueOf);
                }
                biConsumer.accept(obj, shValueOf);
                return;
            case 6:
                try {
                    numMo6213 = abstractC2899.mo6213();
                    break;
                } catch (Exception e7) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e7;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5655(numMo6213);
                }
                biConsumer.accept(obj, numMo6213);
                return;
            case 7:
                try {
                    lMo6210 = abstractC2899.mo6210();
                    break;
                } catch (Exception e8) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e8;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5654(lMo6210);
                }
                biConsumer.accept(obj, lMo6210);
                return;
            case 8:
                try {
                    Integer numMo62133 = abstractC2899.mo6213();
                    if (numMo62133 != null) {
                        bValueOf = Byte.valueOf(numMo62133.byteValue());
                        break;
                    }
                } catch (Exception e9) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e9;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5656(bValueOf);
                }
                biConsumer.accept(obj, bValueOf);
                return;
            default:
                try {
                    numberMo6192 = abstractC2899.mo6192();
                    break;
                } catch (Exception e10) {
                    if ((abstractC2899.m6157(j) & JSONReader$Feature.NullOnError.mask) == 0) {
                        throw e10;
                    }
                }
                if (jSONSchema != null) {
                    jSONSchema.m5656(numberMo6192);
                }
                biConsumer.accept(obj, numberMo6192);
                return;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        switch (this.f8403) {
            case 0:
                return abstractC2899.mo6111();
            case 1:
                return abstractC2899.mo6110();
            case 2:
                return abstractC2899.mo6112();
            case 3:
                return abstractC2899.m6131();
            case 4:
                return abstractC2899.mo6117();
            case 5:
                return Short.valueOf((short) abstractC2899.mo6212());
            case 6:
                return abstractC2899.mo6213();
            case 7:
                return abstractC2899.mo6210();
            case 8:
                return abstractC2899.mo6213();
            default:
                return abstractC2899.mo6192();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo5474() {
        switch (this.f8403) {
        }
        return this.f8402;
    }
}
