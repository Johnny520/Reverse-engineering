.class public final Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
.super Ljava/util/ArrayList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB\u0017\u0008\u0016\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
        "Lkotlin/collections/ArrayList;",
        "",
        "<init>",
        "()V",
        "",
        "initialCapacity",
        "(I)V",
        "",
        "elements",
        "(Ljava/util/Collection;)V",
        "Lkotlin/Function1;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "init",
        "add",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;)Lorg/luckypray/dexkit/query/UsingFieldMatcherList;",
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

    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final synthetic add(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/UsingFieldMatcherList;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->contains(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge getSize()I
    .locals 0

    .line 1
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->indexOf(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    move-result-object p0

    return-object p0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->remove(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;)Z
    .locals 0

    .line 15
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    return-object p0
.end method

.method public final bridge size()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/UsingFieldMatcherList;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
