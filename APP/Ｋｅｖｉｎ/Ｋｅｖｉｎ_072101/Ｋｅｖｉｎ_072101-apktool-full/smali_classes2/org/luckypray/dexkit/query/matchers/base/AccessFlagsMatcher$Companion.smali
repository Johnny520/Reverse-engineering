.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
.super Ljava/lang/Object;
.source "AccessFlagsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "modifiers",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 0

    .line 81
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 83
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 81
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;->create(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(I)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;->create$default(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final create(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 1
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    return-object v0
.end method
