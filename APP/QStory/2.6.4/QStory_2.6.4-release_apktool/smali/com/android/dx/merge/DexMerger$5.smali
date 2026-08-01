.class Lcom/android/dx/merge/DexMerger$5;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeCallSiteIds()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$5;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/android/dx/merge/DexMerger$IdMerger;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$5;->read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    new-instance p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iget-object p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    invoke-direct {p3, p1, p0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3}, Lcom/android/dx/merge/IndexMap;->adjust(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    iget-object p0, p2, Lcom/android/dx/merge/IndexMap;->callSiteIds:[I

    .line 2
    .line 3
    aput p4, p0, p3

    .line 4
    .line 5
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 13
    check-cast p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$5;->write(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method public write(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$5;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
