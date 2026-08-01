.class public final Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/IntRange;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const p2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;->create(II)Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final create(I)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 1
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final create(II)Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 7
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    return-object p0
.end method
