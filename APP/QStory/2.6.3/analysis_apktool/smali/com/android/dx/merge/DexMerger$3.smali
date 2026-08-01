.class Lcom/android/dx/merge/DexMerger$3;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeTypeLists()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$3;->this$0:Lcom/android/dx/merge/DexMerger;

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
    iget-object p0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 10
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$3;->read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏()L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2, p0}, Lcom/android/dx/merge/IndexMap;->adjustTypeList(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$3;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1800(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p2, p1, p0}, Lcom/android/dx/merge/IndexMap;->putTypeListOffset(II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 44
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$3;->write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;)V

    return-void
.end method

.method public write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$3;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1800(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    array-length v0, p1

    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    if-ge v2, v0, :cond_0

    .line 20
    .line 21
    aget-short v3, p1, v2

    .line 22
    .line 23
    invoke-virtual {p0, v3}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    and-int/lit8 p1, p1, 0x3

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return-void
.end method
