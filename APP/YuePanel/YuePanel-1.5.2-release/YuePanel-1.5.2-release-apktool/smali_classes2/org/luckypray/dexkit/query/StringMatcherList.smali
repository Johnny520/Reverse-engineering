.class public final Lorg/luckypray/dexkit/query/StringMatcherList;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/QueryComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/QueryComponent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB\u0017\u0008\u0016\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J&\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\u0008\u001a\u00a2\u0006\u0004\u0008\u0013\u0010\u001cJ&\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\u0008\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "Lkotlin/collections/ArrayList;",
        "Lorg/luckypray/dexkit/query/base/QueryComponent;",
        "<init>",
        "()V",
        "",
        "initialCapacity",
        "(I)V",
        "",
        "elements",
        "(Ljava/util/Collection;)V",
        "",
        "usingString",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "matchType",
        "",
        "ignoreCase",
        "add",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;",
        "matcher",
        "match",
        "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Lkotlin/Function1;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "LYue/\u06e5\u06e0\u06e1\u06e5\u06e7;",
        "init",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/query/StringMatcherList;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/StringMatcherList;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic match$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/StringMatcherList;->match(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic add(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p1

    return-object p1
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/StringMatcherList;
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

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p1

    return-object p1
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;
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

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z

    move-result p1

    return p1
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge getSize()I
    .locals 1

    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I

    move-result p1

    return p1
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I

    move-result p1

    return p1
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final synthetic match(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final match(Ljava/lang/String;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->match$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p1

    return-object p1
.end method

.method public final match(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/StringMatcherList;
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

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->match$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p1

    return-object p1
.end method

.method public final match(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;
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

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "usingString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final match(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "matcher"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z

    move-result p1

    return p1
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z
    .locals 0

    .line 3
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/StringMatcherList;->getSize()I

    move-result v0

    return v0
.end method
