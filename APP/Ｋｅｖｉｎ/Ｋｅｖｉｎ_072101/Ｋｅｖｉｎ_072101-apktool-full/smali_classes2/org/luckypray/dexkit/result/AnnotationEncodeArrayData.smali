.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "AnnotationEncodeArrayData.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1858#2,3:111\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n*L\n101#1:111,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u001d\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;",
        "Lorg/luckypray/dexkit/result/base/BaseData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "values",
        "",
        "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
        "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V",
        "getValues",
        "()Ljava/util/List;",
        "toString",
        "",
        "-Companion",
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
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;


# instance fields
.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V
    .locals 6
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "values"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
            ">;)V"
        }
    .end annotation

    .line 50
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    iput-object p2, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    .line 47
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toString_u24lambda_u241":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 100
    .local v2, "$i$a$-buildString-AnnotationEncodeArrayData$toString$1":I
    const-string v3, "{"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 111
    .local v4, "$i$f$forEachIndexed":I
    const/4 v5, 0x0

    .line 112
    .local v5, "index$iv":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v5, 0x1

    .end local v5    # "index$iv":I
    .local v8, "index$iv":I
    if-gez v5, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    move-object v9, v7

    check-cast v9, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .local v5, "index":I
    .local v9, "value":Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    const/4 v10, 0x0

    .line 102
    .local v10, "$i$a$-forEachIndexed-AnnotationEncodeArrayData$toString$1$1":I
    if-eqz v5, :cond_1

    .line 103
    const-string v11, ", "

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    :cond_1
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    nop

    .line 112
    .end local v5    # "index":I
    .end local v9    # "value":Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .end local v10    # "$i$a$-forEachIndexed-AnnotationEncodeArrayData$toString$1$1":I
    move v5, v8

    .end local v7    # "item$iv":Ljava/lang/Object;
    goto :goto_0

    .line 113
    .end local v8    # "index$iv":I
    .local v5, "index$iv":I
    :cond_2
    nop

    .line 107
    .end local v3    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "index$iv":I
    const-string v3, "}"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    nop

    .line 99
    .end local v1    # "$this$toString_u24lambda_u241":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-AnnotationEncodeArrayData$toString$1":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
