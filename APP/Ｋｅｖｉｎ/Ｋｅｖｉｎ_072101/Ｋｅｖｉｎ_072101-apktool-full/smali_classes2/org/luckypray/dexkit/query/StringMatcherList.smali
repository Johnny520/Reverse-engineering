.class public final Lorg/luckypray/dexkit/query/StringMatcherList;
.super Ljava/util/ArrayList;
.source "MatcherCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "Lkotlin/collections/ArrayList;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "initialCapacity",
        "",
        "(I)V",
        "elements",
        "",
        "(Ljava/util/Collection;)V",
        "add",
        "usingString",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 37
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 0

    .line 53
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 55
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 53
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 56
    const/4 p3, 0x0

    .line 53
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/StringMatcherList;->add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add(Ljava/lang/String;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/StringMatcherList;->add$default(Lorg/luckypray/dexkit/query/StringMatcherList;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatcherList;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatcherList;
    .locals 3
    .param p1, "usingString"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/StringMatcherList;
    const/4 v1, 0x0

    .line 58
    .local v1, "$i$a$-also-StringMatcherList$add$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/StringMatcherList;->add(Ljava/lang/Object;)Z

    .line 59
    nop

    .line 57
    .end local v0    # "it":Lorg/luckypray/dexkit/query/StringMatcherList;
    .end local v1    # "$i$a$-also-StringMatcherList$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatcherList;

    .line 59
    return-object v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 35
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 35
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 35
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 35
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 35
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 35
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 35
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p1, "index"    # I

    .line 35
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 35
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 35
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1
    .param p1, "p0"    # I

    .line 35
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    .line 35
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/StringMatcherList;->getSize()I

    move-result v0

    return v0
.end method
