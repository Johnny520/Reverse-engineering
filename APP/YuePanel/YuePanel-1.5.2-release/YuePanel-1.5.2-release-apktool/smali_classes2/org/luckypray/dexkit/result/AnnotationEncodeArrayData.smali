.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
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

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1858#2,3:111\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n*L\n101#1:111,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1858#2,3:111\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n*L\n101#1:111,3\n*E\n"
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private final values:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

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

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
            ">;)V"
        }
    .end annotation

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILYue/ۥ۟ۨۥۢ;)V

    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getValues()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟۟()V

    :cond_0
    check-cast v3, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    if-eqz v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_2
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
