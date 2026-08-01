.class final Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;
.super Lkotlin/jvm/internal/Lambda;
.source "OpCodeUtil.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/util/OpCodeUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOpCodeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13601#2,3:321\n*S KotlinDebug\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n*L\n288#1:321,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 286
    invoke-virtual {p0}, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 287
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    move-object v1, v0

    .local v1, "$this$invoke_u24lambda_u241":Ljava/util/Map;
    const/4 v2, 0x0

    .line 288
    .local v2, "$i$a$-apply-OpCodeUtil$opFormatMap$2$1":I
    invoke-static {}, Lorg/luckypray/dexkit/util/OpCodeUtil;->access$getOpFormat$p()[Ljava/lang/String;

    move-result-object v3

    .local v3, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 321
    .local v4, "$i$f$forEachIndexed":I
    const/4 v5, 0x0

    .line 322
    .local v5, "index$iv":I
    array-length v6, v3

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v3, v7

    .local v8, "item$iv":Ljava/lang/Object;
    add-int/lit8 v9, v5, 0x1

    .local v5, "index":I
    .local v9, "index$iv":I
    move-object v10, v8

    .local v10, "s":Ljava/lang/String;
    const/4 v11, 0x0

    .local v11, "$i$a$-forEachIndexed-OpCodeUtil$opFormatMap$2$1$1":I
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 288
    invoke-interface {v1, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .end local v5    # "index":I
    .end local v10    # "s":Ljava/lang/String;
    .end local v11    # "$i$a$-forEachIndexed-OpCodeUtil$opFormatMap$2$1$1":I
    nop

    .end local v8    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move v5, v9

    goto :goto_0

    .line 323
    .end local v9    # "index$iv":I
    .local v5, "index$iv":I
    :cond_0
    nop

    .line 289
    .end local v3    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "index$iv":I
    nop

    .line 287
    .end local v1    # "$this$invoke_u24lambda_u241":Ljava/util/Map;
    .end local v2    # "$i$a$-apply-OpCodeUtil$opFormatMap$2$1":I
    return-object v0
.end method
