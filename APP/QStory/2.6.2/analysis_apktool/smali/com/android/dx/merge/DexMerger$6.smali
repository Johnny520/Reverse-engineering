.class Lcom/android/dx/merge/DexMerger$6;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeMethodHandles()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$6;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/android/dx/merge/DexMerger$IdMerger;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getSection(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 33
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$6;->read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;
    .locals 6

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lcom/android/dex/MethodHandle$MethodHandleType;->fromValue(I)Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    .line 22
    .line 23
    iget-object v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v5}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Lcom/android/dex/MethodHandle$MethodHandleType;III)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Lcom/android/dx/merge/IndexMap;->adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    iget-object p0, p2, Lcom/android/dx/merge/IndexMap;->methodHandleIds:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p2, Lcom/android/dx/merge/IndexMap;->methodHandleIds:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 32
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$6;->write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;)V

    return-void
.end method

.method public write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$6;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/android/dex/MethodHandle$MethodHandleType;->access$000(Lcom/android/dex/MethodHandle$MethodHandleType;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 14
    .line 15
    .line 16
    iget v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:I

    .line 17
    .line 18
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 19
    .line 20
    .line 21
    iget v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 24
    .line 25
    .line 26
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:I

    .line 27
    .line 28
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
