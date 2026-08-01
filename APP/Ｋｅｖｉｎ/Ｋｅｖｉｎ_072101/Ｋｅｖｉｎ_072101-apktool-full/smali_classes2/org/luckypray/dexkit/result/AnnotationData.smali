.class public final Lorg/luckypray/dexkit/result/AnnotationData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "AnnotationData.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1858#2,3:80\n*S KotlinDebug\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n*L\n70#1:80,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u0000  2\u00020\u0001:\u0001 B?\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010\u001f\u001a\u00020\u0008H\u0016R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationData;",
        "Lorg/luckypray/dexkit/result/base/BaseData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "dexId",
        "",
        "typeId",
        "typeDescriptor",
        "",
        "visibility",
        "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
        "elements",
        "",
        "Lorg/luckypray/dexkit/result/AnnotationElementData;",
        "(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V",
        "dexClass",
        "Lorg/luckypray/dexkit/wrap/DexClass;",
        "getDexClass",
        "()Lorg/luckypray/dexkit/wrap/DexClass;",
        "dexClass$delegate",
        "Lkotlin/Lazy;",
        "getElements",
        "()Ljava/util/List;",
        "getTypeDescriptor",
        "()Ljava/lang/String;",
        "getTypeId",
        "()I",
        "typeName",
        "getTypeName",
        "getVisibility",
        "()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
        "toString",
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
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;


# instance fields
.field private final dexClass$delegate:Lkotlin/Lazy;

.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;"
        }
    .end annotation
.end field

.field private final typeDescriptor:Ljava/lang/String;

.field private final typeId:I

.field private final visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V
    .locals 6
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "dexId"    # I
    .param p3, "typeId"    # I
    .param p4, "typeDescriptor"    # Ljava/lang/String;
    .param p5, "visibility"    # Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .param p6, "elements"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "II",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;)V"
        }
    .end annotation

    .line 40
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    iput p3, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    .line 37
    iput-object p4, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    .line 38
    iput-object p5, p0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 39
    iput-object p6, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    .line 60
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;-><init>(Lorg/luckypray/dexkit/result/AnnotationData;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:Lkotlin/Lazy;

    .line 33
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V

    return-void
.end method

.method private final getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 60
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/wrap/DexClass;

    return-object v0
.end method


# virtual methods
.method public final getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    return-object v0
.end method

.method public final getTypeDescriptor()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeId()I
    .locals 1

    .line 36
    iget v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    return v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    .line 64
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getVisibility()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    .line 38
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toString_u24lambda_u241":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$a$-buildString-AnnotationData$toString$1":I
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    invoke-static {v3}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "@"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    const-string v3, "("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 80
    .local v4, "$i$f$forEachIndexed":I
    const/4 v5, 0x0

    .line 81
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

    check-cast v9, Lorg/luckypray/dexkit/result/AnnotationElementData;

    .local v5, "index":I
    .local v9, "element":Lorg/luckypray/dexkit/result/AnnotationElementData;
    const/4 v10, 0x0

    .line 71
    .local v10, "$i$a$-forEachIndexed-AnnotationData$toString$1$1":I
    if-eqz v5, :cond_1

    .line 72
    const-string v11, ", "

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_1
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    nop

    .line 81
    .end local v5    # "index":I
    .end local v9    # "element":Lorg/luckypray/dexkit/result/AnnotationElementData;
    .end local v10    # "$i$a$-forEachIndexed-AnnotationData$toString$1$1":I
    move v5, v8

    .end local v7    # "item$iv":Ljava/lang/Object;
    goto :goto_0

    .line 82
    .end local v8    # "index$iv":I
    .local v5, "index$iv":I
    :cond_2
    nop

    .line 76
    .end local v3    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "index$iv":I
    const-string v3, ")"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    nop

    .line 67
    .end local v1    # "$this$toString_u24lambda_u241":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-AnnotationData$toString$1":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
