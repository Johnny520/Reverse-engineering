.class Lcom/android/dx/merge/DexMerger$2;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeTypeIds()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$2;->this$0:Lcom/android/dx/merge/DexMerger;

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
    iget-object p0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$2;->read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Integer;
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
    invoke-virtual {p2, p0}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
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
    iget-object p0, p2, Lcom/android/dx/merge/IndexMap;->typeIds:[S

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
    const-string p1, "type ID not in [0, 0xffff]: "

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

    .line 15
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$2;->write(Ljava/lang/Integer;)V

    return-void
.end method

.method public write(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$2;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
