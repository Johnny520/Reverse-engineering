.class public final Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
        "types",
        "",
        "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
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

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;->create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/MatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V

    return-object v0
.end method
