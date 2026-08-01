.class final Lkotlin/random/PlatformRandom;
.super Lkotlin/random/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u0000 \u000b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000cB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlin/random/PlatformRandom;",
        "Lkotlin/random/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "Ljava/util/Random;",
        "impl",
        "<init>",
        "(Ljava/util/Random;)V",
        "Ljava/util/Random;",
        "getImpl",
        "()Ljava/util/Random;",
        "Companion",
        "kotlin/random/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lkotlin/random/飘花落叶言子楪世哲兰苏;

.field private static final serialVersionUID:J


# instance fields
.field private final impl:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/random/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/random/PlatformRandom;->Companion:Lkotlin/random/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkotlin/random/PlatformRandom;->impl:Ljava/util/Random;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public getImpl()Ljava/util/Random;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/random/PlatformRandom;->impl:Ljava/util/Random;

    .line 2
    .line 3
    return-object p0
.end method
