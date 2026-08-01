.class public final Lorg/luckypray/dexkit/wrap/DexField;
.super Ljava/lang/Object;
.source "DexField.kt"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/DexField$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u0008\u0010\u001c\u001a\u00020\u0003H\u0002J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\nR\u001b\u0010\u0011\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0012\u0010\n\u00a8\u0006!"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/DexField;",
        "Lorg/luckypray/dexkit/wrap/ISerializable;",
        "descriptor",
        "",
        "(Ljava/lang/String;)V",
        "field",
        "Ljava/lang/reflect/Field;",
        "(Ljava/lang/reflect/Field;)V",
        "className",
        "getClassName",
        "()Ljava/lang/String;",
        "declaredClassName",
        "getDeclaredClassName",
        "name",
        "getName",
        "typeName",
        "getTypeName",
        "typeSign",
        "getTypeSign",
        "typeSign$delegate",
        "Lkotlin/Lazy;",
        "equals",
        "",
        "other",
        "",
        "getFieldInstance",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "getSign",
        "hashCode",
        "",
        "toString",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;


# instance fields
.field private final className:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final typeName:Ljava/lang/String;

.field private final typeSign$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:Lkotlin/Lazy;

    .line 66
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "->"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    .line 67
    .local v0, "idx1":I
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    add-int/lit8 v3, v0, 0x1

    const/4 v5, 0x4

    const-string v2, ":"

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    .line 68
    .local v1, "idx2":I
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    .line 71
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    .line 72
    add-int/lit8 v2, v0, 0x2

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    .line 73
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    .line 74
    return-void

    .line 69
    :cond_0
    new-instance v2, Ljava/lang/IllegalAccessError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "not field descriptor: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 2
    .param p1, "field"    # Ljava/lang/reflect/Field;

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:Lkotlin/Lazy;

    .line 84
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "field.declaringClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "field.name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    .line 86
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "field.type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public static final synthetic access$getSign(Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lorg/luckypray/dexkit/wrap/DexField;

    .line 31
    invoke-direct {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getSign()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    return-object v0
.end method

.method private final getSign()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "other"    # Ljava/lang/Object;

    .line 113
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 114
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/wrap/DexField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 115
    :cond_1
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v3, v3, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 116
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v3, v3, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 117
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v3, v3, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    .line 115
    :goto_0
    return v0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 1
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeSign()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 121
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 122
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    .line 121
    add-int/2addr v0, v1

    .line 123
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 121
    add-int/2addr v0, v1

    return v0
.end method

.method public serialize()Ljava/lang/String;
    .locals 1

    .line 31
    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toString_u24lambda_u240":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 104
    .local v2, "$i$a$-buildString-DexField$toString$1":I
    iget-object v3, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-static {v3}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    const-string v3, "->"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    iget-object v3, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    nop

    .line 103
    .end local v1    # "$this$toString_u24lambda_u240":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-DexField$toString$1":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
