.class final Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
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

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nOpCodeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13601#2,3:321\n*S KotlinDebug\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n*L\n288#1:321,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/util/OpCodeUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOpCodeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13601#2,3:321\n*S KotlinDebug\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n*L\n288#1:321,3\n*E\n"
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

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3
    invoke-static {}, Lorg/luckypray/dexkit/util/OpCodeUtil;->access$getOpFormat$p()[Ljava/lang/String;

    move-result-object v1

    .line 4
    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v5, v1, v3

    add-int/lit8 v6, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 5
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_0
    return-object v0
.end method
