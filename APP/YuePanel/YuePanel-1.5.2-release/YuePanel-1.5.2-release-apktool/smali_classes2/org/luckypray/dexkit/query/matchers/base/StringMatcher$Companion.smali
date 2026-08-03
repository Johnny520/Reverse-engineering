.class public final Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "value",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
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
    value = Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>()V

    return-object v0
.end method

.method public final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create$default(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
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

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;->create$default(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
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

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    return-object v0
.end method
