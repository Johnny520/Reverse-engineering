.class public Lcom/google/flatbuffers/FlexBuffers$Key;
.super Lcom/google/flatbuffers/FlexBuffers$Object;
.source "FlexBuffers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Key"
.end annotation


# static fields
.field private static final EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 743
    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Key;

    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers;->access$000()Lcom/google/flatbuffers/ReadBuf;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/flatbuffers/FlexBuffers$Key;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    sput-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

    return-void
.end method

.method constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 0
    .param p1, "buff"    # Lcom/google/flatbuffers/ReadBuf;
    .param p2, "end"    # I
    .param p3, "byteWidth"    # I

    .line 746
    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Object;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    .line 747
    return-void
.end method

.method static synthetic access$700()Lcom/google/flatbuffers/FlexBuffers$Key;
    .locals 1

    .line 741
    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

    return-object v0
.end method

.method public static empty()Lcom/google/flatbuffers/FlexBuffers$Key;
    .locals 1

    .line 754
    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

    return-object v0
.end method


# virtual methods
.method compareTo([B)I
    .locals 6
    .param p1, "other"    # [B

    .line 778
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    .line 779
    .local v0, "ia":I
    const/4 v1, 0x0

    .line 782
    .local v1, "io":I
    :cond_0
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v2, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v2

    .line 783
    .local v2, "c1":B
    aget-byte v3, p1, v1

    .line 784
    .local v3, "c2":B
    if-nez v2, :cond_1

    .line 785
    sub-int v4, v2, v3

    return v4

    .line 786
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 787
    add-int/lit8 v1, v1, 0x1

    .line 788
    array-length v4, p1

    if-ne v1, v4, :cond_4

    .line 791
    sub-int v4, v2, v3

    .line 792
    .local v4, "cmp":I
    if-nez v4, :cond_3

    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v5, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 795
    :cond_2
    const/4 v5, 0x1

    return v5

    .line 793
    :cond_3
    :goto_0
    return v4

    .line 799
    .end local v4    # "cmp":I
    :cond_4
    if-eq v2, v3, :cond_0

    .line 800
    sub-int v4, v2, v3

    return v4
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "obj"    # Ljava/lang/Object;

    .line 810
    instance-of v0, p1, Lcom/google/flatbuffers/FlexBuffers$Key;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 811
    return v1

    .line 813
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/flatbuffers/FlexBuffers$Key;

    iget v0, v0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    if-ne v0, v2, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/flatbuffers/FlexBuffers$Key;

    iget v0, v0, Lcom/google/flatbuffers/FlexBuffers$Key;->byteWidth:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->byteWidth:I

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 817
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->byteWidth:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 768
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    .line 769
    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v1, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    .line 770
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    sub-int v1, v0, v1

    .line 771
    .local v1, "size":I
    nop

    .line 774
    .end local v0    # "i":I
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Key;->end:I

    invoke-interface {v0, v2, v1}, Lcom/google/flatbuffers/ReadBuf;->getString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 768
    .end local v1    # "size":I
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1
    .param p1, "sb"    # Ljava/lang/StringBuilder;

    .line 762
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Key;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    return-object v0
.end method
