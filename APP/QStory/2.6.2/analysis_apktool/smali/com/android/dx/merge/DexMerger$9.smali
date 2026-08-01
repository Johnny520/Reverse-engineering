.class Lcom/android/dx/merge/DexMerger$9;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeAnnotations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$9;->this$0:Lcom/android/dx/merge/DexMerger;

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
    iget-object p0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$9;->read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 1
    iget-object p0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    const/16 v1, 0x1d

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰()V

    .line 19
    .line 20
    .line 21
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    iget-object v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    new-instance v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 26
    .line 27
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sub-int/2addr v3, p0

    .line 34
    new-array v3, v3, [B

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;-><init>([B)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, p3, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;BL飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lcom/android/dx/merge/IndexMap;->adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$9;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1900(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

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
    invoke-virtual {p2, p1, p0}, Lcom/android/dx/merge/IndexMap;->putAnnotationOffset(II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 20
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$9;->write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public write(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$9;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1900(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-byte v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:B

    .line 8
    .line 9
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->writeByte(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 13
    .line 14
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 15
    .line 16
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
