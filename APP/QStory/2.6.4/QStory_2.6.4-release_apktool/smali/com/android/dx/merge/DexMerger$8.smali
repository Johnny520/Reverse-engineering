.class Lcom/android/dx/merge/DexMerger$8;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeMethodIds()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$8;->this$0:Lcom/android/dx/merge/DexMerger;

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
    iget-object p0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$8;->read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;
    .locals 2

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-instance v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;

    .line 16
    .line 17
    iget-object p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    invoke-direct {v1, p1, p0, p3, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;III)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1}, Lcom/android/dx/merge/IndexMap;->adjust(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    if-ltz p4, :cond_0

    .line 2
    .line 3
    const p0, 0xffff

    .line 4
    .line 5
    .line 6
    if-gt p4, p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p2, Lcom/android/dx/merge/IndexMap;->methodIds:[S

    .line 9
    .line 10
    int-to-short p1, p4

    .line 11
    aput-short p1, p0, p3

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Lcom/android/dex/DexIndexOverflowException;

    .line 15
    .line 16
    const-string p1, "method ID not in [0, 0xffff]: "

    .line 17
    .line 18
    invoke-static {p4, p1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Lcom/android/dex/DexIndexOverflowException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 23
    check-cast p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$8;->write(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;)V

    return-void
.end method

.method public write(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$8;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 15
    .line 16
    .line 17
    iget p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
