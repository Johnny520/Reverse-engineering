.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;->create(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final create(I)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 2

    .line 10
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;->create$default(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final create(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method
