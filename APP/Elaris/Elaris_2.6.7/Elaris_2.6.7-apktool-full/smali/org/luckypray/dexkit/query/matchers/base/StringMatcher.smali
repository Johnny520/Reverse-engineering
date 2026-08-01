.class public final Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;


# instance fields
.field private ignoreCase:Z

.field private matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

.field private value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 21
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILr2;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)V
    .locals 6

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILr2;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 11
    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 15
    .line 16
    iput-boolean p3, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILr2;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 22
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getIgnoreCase()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ignoreCase(Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lc5;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 18
    .line 19
    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lorg/luckypray/dexkit/schema/-StringMatcher;->Companion:Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;

    .line 26
    .line 27
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lc5;->j(Ljava/lang/CharSequence;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 37
    .line 38
    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;->getValue()B

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1, v2, p0}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->createStringMatcher(Lc5;IBZ)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {p1, p0}, Lc5;->n(I)V

    .line 49
    .line 50
    .line 51
    return p0

    .line 52
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string p1, "value must be specified"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic setIgnoreCase(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/StringMatchType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final value(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-object p0
.end method
