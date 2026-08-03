.class public Lcom/google/flatbuffers/FlexBuffers$Vector;
.super Lcom/google/flatbuffers/FlexBuffers$Sized;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Vector"
.end annotation


# static fields
.field private static final EMPTY_VECTOR:Lcom/google/flatbuffers/FlexBuffers$Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Vector;

    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers;->access$000()Lcom/google/flatbuffers/ReadBuf;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/flatbuffers/FlexBuffers$Vector;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    sput-object v0, Lcom/google/flatbuffers/FlexBuffers$Vector;->EMPTY_VECTOR:Lcom/google/flatbuffers/FlexBuffers$Vector;

    return-void
.end method

.method public constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Sized;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    return-void
.end method

.method public static empty()Lcom/google/flatbuffers/FlexBuffers$Vector;
    .locals 1

    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Vector;->EMPTY_VECTOR:Lcom/google/flatbuffers/FlexBuffers$Vector;

    return-object v0
.end method


# virtual methods
.method public get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;
    .locals 9

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p1

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Reference;->access$600()Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    int-to-long v5, v5

    iget v7, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    int-to-long v7, v7

    mul-long/2addr v0, v7

    add-long/2addr v5, v0

    add-long/2addr v5, v2

    long-to-int v0, v5

    invoke-interface {v4, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->byteToUnsignedInt(B)I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    mul-int/2addr p1, v2

    add-int/2addr v1, p1

    new-instance p1, Lcom/google/flatbuffers/FlexBuffers$Reference;

    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    invoke-direct {p1, v2, v1, v3, v0}, Lcom/google/flatbuffers/FlexBuffers$Reference;-><init>(Lcom/google/flatbuffers/ReadBuf;III)V

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Vector;->EMPTY_VECTOR:Lcom/google/flatbuffers/FlexBuffers$Vector;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic size()I
    .locals 1

    invoke-super {p0}, Lcom/google/flatbuffers/FlexBuffers$Sized;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/flatbuffers/FlexBuffers$Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 2
    const-string v0, "[ "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlexBuffers$Vector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/flatbuffers/FlexBuffers$Reference;->toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, -0x1

    if-eq v1, v2, :cond_0

    .line 5
    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    const-string v0, " ]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1
.end method
