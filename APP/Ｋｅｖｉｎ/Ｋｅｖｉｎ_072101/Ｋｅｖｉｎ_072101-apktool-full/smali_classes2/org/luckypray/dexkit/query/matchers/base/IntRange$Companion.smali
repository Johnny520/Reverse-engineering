.class public final Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
.super Ljava/lang/Object;
.source "IntRange.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/IntRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "value",
        "",
        "min",
        "max",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 55
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;->create(II)Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(I)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1
    .param p1, "value"    # I

    .line 54
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    return-object v0
.end method

.method public final create(II)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 55
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    return-object v0
.end method
