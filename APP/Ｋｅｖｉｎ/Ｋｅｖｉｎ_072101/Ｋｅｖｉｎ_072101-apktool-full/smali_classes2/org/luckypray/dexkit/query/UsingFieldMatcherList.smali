.class public final Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
.super Ljava/util/ArrayList;
.source "MatcherCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u000c\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
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
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
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

    .line 133
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 134
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
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;

    .local v0, "it":Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
    const/4 v1, 0x0

    .line 144
    .local v1, "$i$a$-also-UsingFieldMatcherList$add$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->add(Ljava/lang/Object;)Z

    .line 145
    nop

    .line 143
    .end local v0    # "it":Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
    .end local v1    # "$i$a$-also-UsingFieldMatcherList$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;

    .line 145
    return-object v0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 132
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 132
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 132
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 132
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 132
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 132
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 132
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1, "index"    # I

    .line 132
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 132
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    .line 132
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;
    .locals 1
    .param p1, "p0"    # I

    .line 132
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    .line 132
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->getSize()I

    move-result v0

    return v0
.end method
