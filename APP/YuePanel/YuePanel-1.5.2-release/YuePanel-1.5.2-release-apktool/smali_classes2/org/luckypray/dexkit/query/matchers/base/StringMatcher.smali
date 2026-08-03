.class public final Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B#\u0008\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R$\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "value",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V",
        "<set-?>",
        "getIgnoreCase",
        "()Z",
        "setIgnoreCase",
        "(Z)V",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/StringMatchType;)V",
        "getValue",
        "()Ljava/lang/String;",
        "setValue",
        "(Ljava/lang/String;)V",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "Companion",
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private ignoreCase:Z

.field private matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private value:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .line 2
    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 9
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 11
    iput-boolean p3, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getIgnoreCase()Z
    .locals 1

    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    return v0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final ignoreCase(Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    return-object p0
.end method

.method public innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 4
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    sget-object v0, Lorg/luckypray/dexkit/schema/-StringMatcher;->Companion:Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;

    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v1

    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/StringMatchType;->getValue()B

    move-result v2

    iget-boolean v3, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    invoke-virtual {v0, p1, v1, v2, v3}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->createStringMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBZ)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "value must be specified"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "matchType"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-object p0
.end method

.method public final synthetic setIgnoreCase(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->ignoreCase:Z

    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/StringMatchType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    return-void
.end method

.method public final synthetic setValue(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    return-void
.end method

.method public final value(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;->value:Ljava/lang/String;

    return-object p0
.end method
