.class public Lcom/google/flatbuffers/FlexBuffers$Map;
.super Lcom/google/flatbuffers/FlexBuffers$Vector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Map"
.end annotation


# static fields
.field private static final EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;


# instance fields
.field private final comparisonBuffer:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Map;

    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers;->access$000()Lcom/google/flatbuffers/ReadBuf;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/flatbuffers/FlexBuffers$Map;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    sput-object v0, Lcom/google/flatbuffers/FlexBuffers$Map;->EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;

    return-void
.end method

.method public constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Vector;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    const/4 p1, 0x4

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    return-void
.end method

.method private binarySearch(Ljava/lang/CharSequence;)I
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    add-int/lit8 v0, v0, -0x1

    .line 2
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    mul-int/lit8 v3, v2, 0x3

    sub-int/2addr v1, v3

    .line 3
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-static {v3, v1, v2}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v4, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    add-int/2addr v1, v4

    invoke-static {v3, v1, v4}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v0, :cond_2

    add-int v4, v3, v0

    ushr-int/lit8 v4, v4, 0x1

    .line 5
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    mul-int v6, v4, v1

    add-int/2addr v6, v2

    invoke-static {v5, v6, v1}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v5

    .line 6
    invoke-direct {p0, v5, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->compareCharSequence(ILjava/lang/CharSequence;)I

    move-result v5

    if-gez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    move v3, v4

    goto :goto_0

    :cond_0
    if-lez v5, :cond_1

    add-int/lit8 v4, v4, -0x1

    move v0, v4

    goto :goto_0

    :cond_1
    return v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    neg-int p1, v3

    return p1
.end method

.method private binarySearch([B)I
    .locals 7

    .line 7
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    add-int/lit8 v0, v0, -0x1

    .line 8
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    mul-int/lit8 v3, v2, 0x3

    sub-int/2addr v1, v3

    .line 9
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-static {v3, v1, v2}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v2

    .line 10
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v4, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    add-int/2addr v1, v4

    invoke-static {v3, v1, v4}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v0, :cond_2

    add-int v4, v3, v0

    ushr-int/lit8 v4, v4, 0x1

    .line 11
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    mul-int v6, v4, v1

    add-int/2addr v6, v2

    invoke-static {v5, v6, v1}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v5

    .line 12
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-direct {p0, v6, v5, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->compareBytes(Lcom/google/flatbuffers/ReadBuf;I[B)I

    move-result v5

    if-gez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    move v3, v4

    goto :goto_0

    :cond_0
    if-lez v5, :cond_1

    add-int/lit8 v4, v4, -0x1

    move v0, v4

    goto :goto_0

    :cond_1
    return v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    neg-int p1, v3

    return p1
.end method

.method private compareBytes(Lcom/google/flatbuffers/ReadBuf;I[B)I
    .locals 4

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1, p2}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v1

    aget-byte v2, p3, v0

    if-nez v1, :cond_1

    sub-int/2addr v1, v2

    return v1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v0, v0, 0x1

    array-length v3, p3

    if-ne v0, v3, :cond_4

    sub-int/2addr v1, v2

    if-nez v1, :cond_3

    invoke-interface {p1, p2}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v1

    :cond_4
    if-eq v1, v2, :cond_0

    sub-int/2addr v1, v2

    return v1
.end method

.method private compareCharSequence(ILjava/lang/CharSequence;)I
    .locals 7

    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v0}, Lcom/google/flatbuffers/ReadBuf;->limit()I

    move-result v0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x80

    if-lt v4, v5, :cond_0

    goto :goto_1

    :cond_0
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v5, p1}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v5

    if-nez v5, :cond_1

    neg-int p1, v4

    return p1

    :cond_1
    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    int-to-char v6, v5

    if-eq v6, v4, :cond_3

    sub-int/2addr v5, v4

    return v5

    :cond_3
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    if-ge p1, v0, :cond_a

    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    invoke-static {p2, v3, v1}, Lcom/google/flatbuffers/Utf8;->encodeUtf8CodePoint(Ljava/lang/CharSequence;I[B)I

    move-result v1

    if-nez v1, :cond_5

    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {p2, p1}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result p1

    return p1

    :cond_5
    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_8

    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    add-int/lit8 v6, p1, 0x1

    invoke-interface {v5, p1}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result p1

    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    aget-byte v5, v5, v4

    if-nez p1, :cond_6

    neg-int p1, v5

    return p1

    :cond_6
    if-eq p1, v5, :cond_7

    sub-int/2addr p1, v5

    return p1

    :cond_7
    add-int/lit8 v4, v4, 0x1

    move p1, v6

    goto :goto_2

    :cond_8
    const/4 v4, 0x4

    if-ne v1, v4, :cond_9

    const/4 v1, 0x2

    goto :goto_3

    :cond_9
    const/4 v1, 0x1

    :goto_3
    add-int/2addr v3, v1

    goto :goto_1

    :cond_a
    return v2
.end method

.method public static empty()Lcom/google/flatbuffers/FlexBuffers$Map;
    .locals 1

    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Map;->EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;

    return-object v0
.end method


# virtual methods
.method public get(Ljava/lang/String;)Lcom/google/flatbuffers/FlexBuffers$Reference;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->binarySearch(Ljava/lang/CharSequence;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    if-ge p1, v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Vector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Reference;->access$600()Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object p1

    return-object p1
.end method

.method public get([B)Lcom/google/flatbuffers/FlexBuffers$Reference;
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->binarySearch([B)I

    move-result p1

    if-ltz p1, :cond_0

    .line 6
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    if-ge p1, v0, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Vector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object p1

    return-object p1

    .line 8
    :cond_0
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Reference;->access$600()Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object p1

    return-object p1
.end method

.method public keys()Lcom/google/flatbuffers/FlexBuffers$KeyVector;
    .locals 7

    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    mul-int/lit8 v1, v1, 0x3

    sub-int/2addr v0, v1

    new-instance v1, Lcom/google/flatbuffers/FlexBuffers$KeyVector;

    new-instance v2, Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v4, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    invoke-static {v3, v0, v4}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v4

    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v6, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    add-int/2addr v0, v6

    invoke-static {v5, v0, v6}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v0

    const/4 v5, 0x4

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/google/flatbuffers/FlexBuffers$TypedVector;-><init>(Lcom/google/flatbuffers/ReadBuf;III)V

    invoke-direct {v1, v2}, Lcom/google/flatbuffers/FlexBuffers$KeyVector;-><init>(Lcom/google/flatbuffers/FlexBuffers$TypedVector;)V

    return-object v1
.end method

.method public toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 5

    const-string v0, "{ "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Map;->keys()Lcom/google/flatbuffers/FlexBuffers$KeyVector;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Map;->values()Lcom/google/flatbuffers/FlexBuffers$Vector;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    const/16 v4, 0x22

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Key;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/flatbuffers/FlexBuffers$Key;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" : "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Lcom/google/flatbuffers/FlexBuffers$Vector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/flatbuffers/FlexBuffers$Reference;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v1, -0x1

    if-eq v3, v4, :cond_0

    const-string v4, ", "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v0, " }"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public values()Lcom/google/flatbuffers/FlexBuffers$Vector;
    .locals 4

    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Vector;

    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    iget v3, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    invoke-direct {v0, v1, v2, v3}, Lcom/google/flatbuffers/FlexBuffers$Vector;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    return-object v0
.end method
