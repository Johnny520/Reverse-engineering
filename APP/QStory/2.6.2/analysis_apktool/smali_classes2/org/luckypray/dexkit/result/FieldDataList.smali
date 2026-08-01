.class public final Lorg/luckypray/dexkit/result/FieldDataList;
.super Lorg/luckypray/dexkit/result/BaseDataList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/luckypray/dexkit/result/BaseDataList<",
        "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0003\u0010\u0007B\u0017\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008\u00a2\u0006\u0004\u0008\u0003\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u000c\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u000c\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/FieldDataList;",
        "Lorg/luckypray/dexkit/result/BaseDataList;",
        "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "<init>",
        "()V",
        "",
        "initialCapacity",
        "(I)V",
        "",
        "elements",
        "(Ljava/util/Collection;)V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u5170\u696a\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "findField",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u5170\u696a\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;)Lorg/luckypray/dexkit/result/FieldDataList;",
        "Lkotlin/Function1;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "init",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;)Lorg/luckypray/dexkit/result/FieldDataList;",
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

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
    check-cast p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/FieldDataList;->contains(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final findField(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    new-instance v0, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;

    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-interface {p1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/FieldDataList;->findField(L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p0

    return-object p0
.end method

.method public final findField(L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 11
    .line 12
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 21
    .line 22
    iget-object v0, v0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    iput-object p0, p1, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Lorg/luckypray/dexkit/result/FieldDataList;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子苏世兰楪哲(L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

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
    check-cast p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/FieldDataList;->indexOf(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/AbstractList;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

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
    check-cast p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/FieldDataList;->lastIndexOf(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)I
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/AbstractList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/FieldDataList;->removeAt(I)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    move-result-object p0

    return-object p0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

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
    check-cast p1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/FieldDataList;->remove(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;)Z
    .locals 0

    .line 15
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    return-object p0
.end method
