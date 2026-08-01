.class Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
.super Ljava/lang/Object;
.source "FlexBuffersBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffersBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Value"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final dValue:D

.field iValue:J

.field key:I

.field final minBitWidth:I

.field final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 664
    const-class v0, Lcom/google/flatbuffers/FlexBuffersBuilder;

    return-void
.end method

.method constructor <init>(IIID)V
    .locals 2
    .param p1, "key"    # I
    .param p2, "type"    # I
    .param p3, "bitWidth"    # I
    .param p4, "dValue"    # D

    .line 685
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 686
    iput p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 687
    iput p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    .line 688
    iput p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    .line 689
    iput-wide p4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->dValue:D

    .line 690
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 691
    return-void
.end method

.method constructor <init>(IIIJ)V
    .locals 2
    .param p1, "key"    # I
    .param p2, "type"    # I
    .param p3, "bitWidth"    # I
    .param p4, "iValue"    # J

    .line 677
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 678
    iput p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 679
    iput p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    .line 680
    iput p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    .line 681
    iput-wide p4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 682
    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->dValue:D

    .line 683
    return-void
.end method

.method static synthetic access$100(II)I
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # I

    .line 664
    invoke-static {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->paddingBytes(II)I

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I
    .locals 1
    .param p0, "x0"    # Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .param p1, "x1"    # I
    .param p2, "x2"    # I

    .line 664
    invoke-direct {p0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->elemWidth(II)I

    move-result v0

    return v0
.end method

.method static synthetic access$300(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;)B
    .locals 1
    .param p0, "x0"    # Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 664
    invoke-direct {p0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->storedPackedType()B

    move-result v0

    return v0
.end method

.method static synthetic access$400(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)B
    .locals 1
    .param p0, "x0"    # Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .param p1, "x1"    # I

    .line 664
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->storedPackedType(I)B

    move-result v0

    return v0
.end method

.method static synthetic access$500(IIJII)I
    .locals 1
    .param p0, "x0"    # I
    .param p1, "x1"    # I
    .param p2, "x2"    # J
    .param p4, "x3"    # I
    .param p5, "x4"    # I

    .line 664
    invoke-static/range {p0 .. p5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->elemWidth(IIJII)I

    move-result v0

    return v0
.end method

.method static blob(IIII)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "position"    # I
    .param p2, "type"    # I
    .param p3, "bitWidth"    # I

    .line 702
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    int-to-long v4, p1

    move-object v0, v6

    move v1, p0

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static bool(IZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "b"    # Z

    .line 698
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    move-wide v4, v0

    const/16 v2, 0x1a

    const/4 v3, 0x0

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method private elemWidth(II)I
    .locals 6
    .param p1, "bufSize"    # I
    .param p2, "elemIndex"    # I

    .line 766
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    iget-wide v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    move v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->elemWidth(IIJII)I

    move-result v0

    return v0
.end method

.method private static elemWidth(IIJII)I
    .locals 9
    .param p0, "type"    # I
    .param p1, "minBitWidth"    # I
    .param p2, "iValue"    # J
    .param p4, "bufSize"    # I
    .param p5, "elemIndex"    # I

    .line 770
    invoke-static {p0}, Lcom/google/flatbuffers/FlexBuffers;->isTypeInline(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 771
    return p1

    .line 781
    :cond_0
    const/4 v0, 0x1

    .local v0, "byteWidth":I
    :goto_0
    const/16 v1, 0x20

    if-gt v0, v1, :cond_2

    .line 783
    invoke-static {p4, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->paddingBytes(II)I

    move-result v1

    add-int/2addr v1, p4

    mul-int v2, p5, v0

    add-int/2addr v1, v2

    .line 785
    .local v1, "offsetLoc":I
    int-to-long v2, v1

    sub-long/2addr v2, p2

    .line 787
    .local v2, "offset":J
    invoke-static {v2, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v4

    .line 788
    .local v4, "bitWidth":I
    const-wide/16 v5, 0x1

    shl-long/2addr v5, v4

    int-to-long v7, v0

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    .line 789
    return v4

    .line 781
    .end local v1    # "offsetLoc":I
    .end local v2    # "offset":J
    .end local v4    # "bitWidth":I
    :cond_1
    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 791
    .end local v0    # "byteWidth":I
    :cond_2
    nop

    .line 792
    const/4 v0, 0x3

    return v0
.end method

.method static float32(IF)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # F

    .line 738
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x2

    float-to-double v4, p1

    const/4 v2, 0x3

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIID)V

    return-object v6
.end method

.method static float64(ID)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # D

    .line 742
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v2, 0x3

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIID)V

    return-object v6
.end method

.method static int16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 710
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x1

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static int32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 714
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x2

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static int64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # J

    .line 718
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v2, 0x1

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static int8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 706
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x0

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static nullValue(I)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I

    .line 694
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method private static packedType(II)B
    .locals 1
    .param p0, "bitWidth"    # I
    .param p1, "type"    # I

    .line 754
    shl-int/lit8 v0, p1, 0x2

    or-int/2addr v0, p0

    int-to-byte v0, v0

    return v0
.end method

.method private static paddingBytes(II)I
    .locals 2
    .param p0, "bufSize"    # I
    .param p1, "scalarSize"    # I

    .line 797
    not-int v0, p0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    return v0
.end method

.method private storedPackedType()B
    .locals 1

    .line 746
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->storedPackedType(I)B

    move-result v0

    return v0
.end method

.method private storedPackedType(I)B
    .locals 2
    .param p1, "parentBitWidth"    # I

    .line 750
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->storedWidth(I)I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    invoke-static {v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->packedType(II)B

    move-result v0

    return v0
.end method

.method private storedWidth(I)I
    .locals 1
    .param p1, "parentBitWidth"    # I

    .line 758
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers;->isTypeInline(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 759
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    .line 761
    :cond_0
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    return v0
.end method

.method static uInt16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 726
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x1

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static uInt32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 730
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x2

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static uInt64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # J

    .line 734
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v2, 0x2

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method

.method static uInt8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 7
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 722
    new-instance v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v3, 0x0

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v6
.end method
