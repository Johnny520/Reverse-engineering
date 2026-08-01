.class Lcom/android/dx/merge/DexMerger$1;
.super Lcom/android/dx/merge/DexMerger$IdMerger;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/merge/DexMerger;->mergeStringIds()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$1;->this$0:Lcom/android/dx/merge/DexMerger;

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
    iget-object p0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/merge/DexMerger$1;->read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public read(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public updateIndex(ILcom/android/dx/merge/IndexMap;II)V
    .locals 0

    .line 1
    iget-object p0, p2, Lcom/android/dx/merge/IndexMap;->stringIds:[I

    .line 2
    .line 3
    aput p4, p0, p3

    .line 4
    .line 5
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Comparable;)V
    .locals 0

    .line 68
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$1;->write(Ljava/lang/String;)V

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$1;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    iget v1, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$1;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger$1;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/android/dx/merge/DexMerger;->access$1600(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$1;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 37
    .line 38
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1600(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p0, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)[B

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->writeByte(I)V
    :try_end_0
    .catch Ljava/io/UTFDataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 65
    .line 66
    .line 67
    return-void
.end method
