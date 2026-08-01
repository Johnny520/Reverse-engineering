.class public Lcom/google/flatbuffers/FlexBuffersBuilder;
.super Ljava/lang/Object;
.source "FlexBuffersBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final BUILDER_FLAG_NONE:I = 0x0

.field public static final BUILDER_FLAG_SHARE_ALL:I = 0x7

.field public static final BUILDER_FLAG_SHARE_KEYS:I = 0x1

.field public static final BUILDER_FLAG_SHARE_KEYS_AND_STRINGS:I = 0x3

.field public static final BUILDER_FLAG_SHARE_KEY_VECTORS:I = 0x4

.field public static final BUILDER_FLAG_SHARE_STRINGS:I = 0x2

.field private static final WIDTH_16:I = 0x1

.field private static final WIDTH_32:I = 0x2

.field private static final WIDTH_64:I = 0x3

.field private static final WIDTH_8:I


# instance fields
.field private final bb:Lcom/google/flatbuffers/ReadWriteBuf;

.field private finished:Z

.field private final flags:I

.field private keyComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/flatbuffers/FlexBuffersBuilder$Value;",
            ">;"
        }
    .end annotation
.end field

.field private final keyPool:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final stack:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/flatbuffers/FlexBuffersBuilder$Value;",
            ">;"
        }
    .end annotation
.end field

.field private final stringPool:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 126
    const/16 v0, 0x100

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(I)V

    .line 127
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .param p1, "bufSize"    # I

    .line 119
    new-instance v0, Lcom/google/flatbuffers/ArrayReadWriteBuf;

    invoke-direct {v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>(I)V

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V

    .line 120
    return-void
.end method

.method public constructor <init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V
    .locals 1
    .param p1, "bb"    # Lcom/google/flatbuffers/ReadWriteBuf;
    .param p2, "flags"    # I

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 88
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    .line 89
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->finished:Z

    .line 94
    new-instance v0, Lcom/google/flatbuffers/FlexBuffersBuilder$1;

    invoke-direct {v0, p0}, Lcom/google/flatbuffers/FlexBuffersBuilder$1;-><init>(Lcom/google/flatbuffers/FlexBuffersBuilder;)V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyComparator:Ljava/util/Comparator;

    .line 141
    iput-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 142
    iput p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    .line 143
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "bb"    # Ljava/nio/ByteBuffer;

    .line 151
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Ljava/nio/ByteBuffer;I)V

    .line 152
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 2
    .param p1, "bb"    # Ljava/nio/ByteBuffer;
    .param p2, "flags"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 137
    new-instance v0, Lcom/google/flatbuffers/ArrayReadWriteBuf;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>([B)V

    invoke-direct {p0, v0, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V

    .line 138
    return-void
.end method

.method static synthetic access$000(Lcom/google/flatbuffers/FlexBuffersBuilder;)Lcom/google/flatbuffers/ReadWriteBuf;
    .locals 1
    .param p0, "x0"    # Lcom/google/flatbuffers/FlexBuffersBuilder;

    .line 51
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    return-object v0
.end method

.method private align(I)I
    .locals 4
    .param p1, "alignment"    # I

    .line 418
    const/4 v0, 0x1

    shl-int/2addr v0, p1

    .line 419
    .local v0, "byteWidth":I
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v1}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v1

    invoke-static {v1, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$100(II)I

    move-result v1

    .line 420
    .local v1, "padBytes":I
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .end local v1    # "padBytes":I
    .local v2, "padBytes":I
    if-eqz v1, :cond_0

    .line 421
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    move v1, v2

    goto :goto_0

    .line 423
    :cond_0
    return v0
.end method

.method private createKeyVector(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 12
    .param p1, "start"    # I
    .param p2, "length"    # I

    .line 642
    int-to-long v0, p2

    invoke-static {v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 643
    .local v0, "bitWidth":I
    const/4 v2, 0x1

    .line 645
    .local v2, "prefixElems":I
    move v3, p1

    .local v3, "i":I
    :goto_0
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 646
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget v4, v4, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    int-to-long v7, v4

    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v4}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v9

    add-int v10, v3, v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v5 .. v10}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$500(IIJII)I

    move-result v4

    .line 647
    .local v4, "elemWidth":I
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 645
    .end local v4    # "elemWidth":I
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 650
    .end local v3    # "i":I
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    move-result v3

    .line 652
    .local v3, "byteWidth":I
    int-to-long v4, p2

    invoke-direct {p0, v4, v5, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 654
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v4}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v10

    .line 655
    .local v10, "vloc":I
    move v4, p1

    .local v4, "i":I
    :goto_1
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 656
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget v5, v5, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 657
    .local v5, "pos":I
    nop

    .line 658
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget v6, v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    int-to-long v6, v6

    invoke-direct {p0, v6, v7, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    .line 655
    .end local v5    # "pos":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 661
    .end local v4    # "i":I
    :cond_1
    new-instance v11, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    const/4 v4, 0x4

    invoke-static {v4, v1}, Lcom/google/flatbuffers/FlexBuffers;->toTypedVector(II)I

    move-result v6

    int-to-long v8, v10

    const/4 v5, -0x1

    move-object v4, v11

    move v7, v0

    invoke-direct/range {v4 .. v9}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    return-object v11
.end method

.method private createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 17
    .param p1, "key"    # I
    .param p2, "start"    # I
    .param p3, "length"    # I
    .param p4, "typed"    # Z
    .param p5, "fixed"    # Z
    .param p6, "keys"    # Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 520
    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p6

    xor-int/lit8 v3, p4, 0x1

    and-int v3, p5, v3

    if-nez v3, :cond_c

    .line 524
    int-to-long v3, v1

    invoke-static {v3, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 525
    .local v3, "bitWidth":I
    const/4 v5, 0x1

    .line 526
    .local v5, "prefixElems":I
    if-eqz v2, :cond_0

    .line 529
    iget-object v6, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v6}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v6

    invoke-static {v2, v6, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 530
    add-int/lit8 v5, v5, 0x2

    .line 532
    :cond_0
    const/4 v6, 0x4

    .line 534
    .local v6, "vectorType":I
    move/from16 v7, p2

    .local v7, "i":I
    :goto_0
    iget-object v8, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v7, v8, :cond_4

    .line 535
    iget-object v8, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v9}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v9

    add-int v10, v7, v5

    invoke-static {v8, v9, v10}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    move-result v8

    .line 536
    .local v8, "elemWidth":I
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 537
    if-eqz p4, :cond_3

    .line 538
    move/from16 v14, p2

    if-ne v7, v14, :cond_2

    .line 539
    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget v6, v9, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    .line 540
    invoke-static {v6}, Lcom/google/flatbuffers/FlexBuffers;->isTypedVectorElementType(I)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    .line 541
    :cond_1
    new-instance v4, Lcom/google/flatbuffers/FlexBuffers$FlexBufferException;

    const-string v9, "TypedVector does not support this element type"

    invoke-direct {v4, v9}, Lcom/google/flatbuffers/FlexBuffers$FlexBufferException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 546
    :cond_2
    goto :goto_1

    .line 537
    :cond_3
    move/from16 v14, p2

    .line 534
    .end local v8    # "elemWidth":I
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    move/from16 v14, p2

    .line 552
    .end local v7    # "i":I
    nop

    .line 554
    invoke-direct {v0, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    move-result v7

    .line 556
    .local v7, "byteWidth":I
    if-eqz v2, :cond_5

    .line 557
    iget-wide v8, v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    invoke-direct {v0, v8, v9, v7}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    .line 558
    const-wide/16 v8, 0x1

    iget v10, v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    shl-long/2addr v8, v10

    invoke-direct {v0, v8, v9, v7}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 560
    :cond_5
    if-nez p5, :cond_6

    .line 561
    int-to-long v8, v1

    invoke-direct {v0, v8, v9, v7}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 564
    :cond_6
    iget-object v8, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v8}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v15

    .line 565
    .local v15, "vloc":I
    move/from16 v8, p2

    .local v8, "i":I
    :goto_2
    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_7

    .line 566
    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    invoke-direct {v0, v9, v7}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V

    .line 565
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 569
    .end local v8    # "i":I
    :cond_7
    if-nez p4, :cond_8

    .line 570
    move/from16 v8, p2

    .restart local v8    # "i":I
    :goto_3
    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_8

    .line 571
    iget-object v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    iget-object v10, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    invoke-static {v10, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$400(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)B

    move-result v10

    invoke-interface {v9, v10}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 570
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 574
    .end local v8    # "i":I
    :cond_8
    new-instance v16, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    if-eqz v2, :cond_9

    const/16 v4, 0x9

    move v10, v4

    goto :goto_4

    .line 575
    :cond_9
    if-eqz p4, :cond_b

    if-eqz p5, :cond_a

    move v4, v1

    :cond_a
    invoke-static {v6, v4}, Lcom/google/flatbuffers/FlexBuffers;->toTypedVector(II)I

    move-result v4

    move v10, v4

    goto :goto_4

    .line 576
    :cond_b
    const/16 v4, 0xa

    move v10, v4

    :goto_4
    int-to-long v12, v15

    move-object/from16 v8, v16

    move/from16 v9, p1

    move v11, v3

    invoke-direct/range {v8 .. v13}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    .line 574
    return-object v16

    .line 521
    .end local v3    # "bitWidth":I
    .end local v5    # "prefixElems":I
    .end local v6    # "vectorType":I
    .end local v7    # "byteWidth":I
    .end local v15    # "vloc":I
    :cond_c
    move/from16 v14, p2

    new-instance v3, Ljava/lang/UnsupportedOperationException;

    const-string v4, "Untyped fixed vector is not supported"

    invoke-direct {v3, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private putKey(Ljava/lang/String;)I
    .locals 6
    .param p1, "key"    # Ljava/lang/String;

    .line 209
    if-nez p1, :cond_0

    .line 210
    const/4 v0, -0x1

    return v0

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v0

    .line 213
    .local v0, "pos":I
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 214
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 215
    .local v1, "keyFromPool":Ljava/lang/Integer;
    if-nez v1, :cond_1

    .line 216
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 217
    .local v3, "keyBytes":[B
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    array-length v5, v3

    invoke-interface {v4, v3, v2, v5}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 218
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v4, v2}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 219
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .end local v3    # "keyBytes":[B
    goto :goto_0

    .line 221
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 223
    .end local v1    # "keyFromPool":Ljava/lang/Integer;
    :goto_0
    goto :goto_1

    .line 224
    :cond_2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 225
    .local v1, "keyBytes":[B
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    array-length v4, v1

    invoke-interface {v3, v1, v2, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 226
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v3, v2}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 227
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .end local v1    # "keyBytes":[B
    :goto_1
    return v0
.end method

.method private putUInt(Ljava/lang/String;J)V
    .locals 4
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # J

    .line 305
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v0

    .line 308
    .local v0, "iKey":I
    invoke-static {p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v1

    .line 310
    .local v1, "width":I
    if-nez v1, :cond_0

    .line 311
    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    .local v2, "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    goto :goto_0

    .line 312
    .end local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 313
    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    .restart local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    goto :goto_0

    .line 314
    .end local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :cond_1
    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    .line 315
    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    .restart local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    goto :goto_0

    .line 317
    .end local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :cond_2
    invoke-static {v0, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    .line 319
    .restart local v2    # "vVal":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :goto_0
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    return-void
.end method

.method private putUInt64(Ljava/lang/String;J)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # J

    .line 301
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    return-void
.end method

.method static widthUInBits(J)I
    .locals 3
    .param p0, "len"    # J

    .line 398
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->byteToUnsignedInt(B)I

    move-result v1

    int-to-long v1, v1

    cmp-long v1, p0, v1

    if-gtz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 399
    :cond_0
    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->shortToUnsignedInt(S)I

    move-result v1

    int-to-long v1, v1

    cmp-long v1, p0, v1

    if-gtz v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 400
    :cond_1
    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->intToUnsignedLong(I)J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_2

    const/4 v0, 0x2

    return v0

    .line 401
    :cond_2
    const/4 v0, 0x3

    return v0
.end method

.method private writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V
    .locals 2
    .param p1, "val"    # Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .param p2, "byteWidth"    # I

    .line 586
    iget v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    sparse-switch v0, :sswitch_data_0

    .line 597
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    goto :goto_0

    .line 594
    :sswitch_0
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->dValue:D

    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeDouble(DI)V

    .line 595
    goto :goto_0

    .line 591
    :sswitch_1
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 592
    nop

    .line 600
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_1
        0x2 -> :sswitch_1
        0x3 -> :sswitch_0
        0x1a -> :sswitch_1
    .end sparse-switch
.end method

.method private writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 6
    .param p1, "key"    # I
    .param p2, "blob"    # [B
    .param p3, "type"    # I
    .param p4, "trailing"    # Z

    .line 405
    array-length v0, p2

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v0

    .line 406
    .local v0, "bitWidth":I
    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    move-result v1

    .line 407
    .local v1, "byteWidth":I
    array-length v2, p2

    int-to-long v2, v2

    invoke-direct {p0, v2, v3, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 408
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v2

    .line 409
    .local v2, "sloc":I
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    array-length v4, p2

    const/4 v5, 0x0

    invoke-interface {v3, p2, v5, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 410
    if-eqz p4, :cond_0

    .line 411
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v3, v5}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 413
    :cond_0
    invoke-static {p1, v2, p3, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->blob(IIII)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v3

    return-object v3
.end method

.method private writeDouble(DI)V
    .locals 2
    .param p1, "val"    # D
    .param p3, "byteWidth"    # I

    .line 603
    const/4 v0, 0x4

    if-ne p3, v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    double-to-float v1, p1

    invoke-interface {v0, v1}, Lcom/google/flatbuffers/ReadWriteBuf;->putFloat(F)V

    goto :goto_0

    .line 605
    :cond_0
    const/16 v0, 0x8

    if-ne p3, v0, :cond_1

    .line 606
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v0, p1, p2}, Lcom/google/flatbuffers/ReadWriteBuf;->putDouble(D)V

    .line 608
    :cond_1
    :goto_0
    return-void
.end method

.method private writeInt(JI)V
    .locals 2
    .param p1, "value"    # J
    .param p3, "byteWidth"    # I

    .line 427
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 431
    :sswitch_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v0, p1, p2}, Lcom/google/flatbuffers/ReadWriteBuf;->putLong(J)V

    goto :goto_0

    .line 430
    :sswitch_1
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    long-to-int v1, p1

    invoke-interface {v0, v1}, Lcom/google/flatbuffers/ReadWriteBuf;->putInt(I)V

    goto :goto_0

    .line 429
    :sswitch_2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    long-to-int v1, p1

    int-to-short v1, v1

    invoke-interface {v0, v1}, Lcom/google/flatbuffers/ReadWriteBuf;->putShort(S)V

    goto :goto_0

    .line 428
    :sswitch_3
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    long-to-int v1, p1

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 433
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0x4 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method private writeOffset(JI)V
    .locals 3
    .param p1, "val"    # J
    .param p3, "byteWidth"    # I

    .line 580
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr v0, p1

    long-to-int v0, v0

    .line 581
    .local v0, "reloff":I
    nop

    .line 582
    int-to-long v1, v0

    invoke-direct {p0, v1, v2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 583
    return-void
.end method

.method private writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 3
    .param p1, "key"    # I
    .param p2, "s"    # Ljava/lang/String;

    .line 393
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->clear()V

    .line 159
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 160
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 161
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->finished:Z

    .line 163
    return-void
.end method

.method public endMap(Ljava/lang/String;I)I
    .locals 9
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "start"    # I

    .line 626
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v7

    .line 628
    .local v7, "iKey":I
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyComparator:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 630
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p2

    invoke-direct {p0, p2, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createKeyVector(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v8

    .line 631
    .local v8, "keys":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int v3, v0, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, v7

    move v2, p2

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v0

    .line 633
    .local v0, "vec":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :goto_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p2, :cond_0

    .line 634
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 636
    :cond_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    iget-wide v1, v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v1, v1

    return v1
.end method

.method public endVector(Ljava/lang/String;IZZ)I
    .locals 8
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "start"    # I
    .param p3, "typed"    # Z
    .param p4, "fixed"    # Z

    .line 475
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v7

    .line 476
    .local v7, "iKey":I
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int v3, v0, p2

    const/4 v6, 0x0

    move-object v0, p0

    move v1, v7

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v0

    .line 478
    .local v0, "vec":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :goto_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p2, :cond_0

    .line 479
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 481
    :cond_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    iget-wide v1, v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v1, v1

    return v1
.end method

.method public finish()Ljava/nio/ByteBuffer;
    .locals 4

    .line 496
    nop

    .line 498
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v2

    invoke-static {v0, v2, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    move-result v0

    .line 499
    .local v0, "byteWidth":I
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    invoke-direct {p0, v2, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V

    .line 501
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    invoke-static {v3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$300(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;)B

    move-result v3

    invoke-interface {v2, v3}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 503
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    int-to-byte v3, v0

    invoke-interface {v2, v3}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 504
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->finished:Z

    .line 505
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->data()[B

    move-result-object v2

    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    invoke-interface {v3}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    move-result v3

    invoke-static {v2, v1, v3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    return-object v1
.end method

.method public getBuffer()Lcom/google/flatbuffers/ReadWriteBuf;
    .locals 1

    .line 172
    nop

    .line 173
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    return-object v0
.end method

.method public putBlob(Ljava/lang/String;[B)I
    .locals 4
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # [B

    .line 451
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v0

    .line 452
    .local v0, "iKey":I
    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-direct {p0, v0, p2, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    .line 453
    .local v1, "value":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    iget-wide v2, v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v2, v2

    return v2
.end method

.method public putBlob([B)I
    .locals 1
    .param p1, "value"    # [B

    .line 441
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putBlob(Ljava/lang/String;[B)I

    move-result v0

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # Z

    .line 205
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->bool(IZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    return-void
.end method

.method public putBoolean(Z)V
    .locals 1
    .param p1, "val"    # Z

    .line 196
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putBoolean(Ljava/lang/String;Z)V

    .line 197
    return-void
.end method

.method public putFloat(D)V
    .locals 1
    .param p1, "value"    # D

    .line 344
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putFloat(Ljava/lang/String;D)V

    .line 345
    return-void
.end method

.method public putFloat(F)V
    .locals 1
    .param p1, "value"    # F

    .line 327
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putFloat(Ljava/lang/String;F)V

    .line 328
    return-void
.end method

.method public putFloat(Ljava/lang/String;D)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # D

    .line 353
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->float64(ID)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    return-void
.end method

.method public putFloat(Ljava/lang/String;F)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # F

    .line 336
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->float32(IF)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    return-void
.end method

.method public putInt(I)V
    .locals 1
    .param p1, "val"    # I

    .line 237
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;I)V

    .line 238
    return-void
.end method

.method public putInt(J)V
    .locals 1
    .param p1, "value"    # J

    .line 272
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;J)V

    .line 273
    return-void
.end method

.method public putInt(Ljava/lang/String;I)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # I

    .line 246
    int-to-long v0, p2

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;J)V

    .line 247
    return-void
.end method

.method public putInt(Ljava/lang/String;J)V
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # J

    .line 255
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v0

    .line 256
    .local v0, "iKey":I
    const-wide/16 v1, -0x80

    cmp-long v1, v1, p2

    if-gtz v1, :cond_0

    const-wide/16 v1, 0x7f

    cmp-long v1, p2, v1

    if-gtz v1, :cond_0

    .line 257
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 258
    :cond_0
    const-wide/16 v1, -0x8000

    cmp-long v1, v1, p2

    if-gtz v1, :cond_1

    const-wide/16 v1, 0x7fff

    cmp-long v1, p2, v1

    if-gtz v1, :cond_1

    .line 259
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 260
    :cond_1
    const-wide/32 v1, -0x80000000

    cmp-long v1, v1, p2

    if-gtz v1, :cond_2

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p2, v1

    if-gtz v1, :cond_2

    .line 261
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int v2, p2

    invoke-static {v0, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 263
    :cond_2
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-static {v0, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    :goto_0
    return-void
.end method

.method public putNull()V
    .locals 1

    .line 180
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putNull(Ljava/lang/String;)V

    .line 181
    return-void
.end method

.method public putNull(Ljava/lang/String;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;

    .line 188
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->nullValue(I)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    return-void
.end method

.method public putString(Ljava/lang/String;)I
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .line 362
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putString(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "val"    # Ljava/lang/String;

    .line 372
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result v0

    .line 373
    .local v0, "iKey":I
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    .line 374
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 375
    .local v1, "i":Ljava/lang/Integer;
    if-nez v1, :cond_0

    .line 376
    invoke-direct {p0, v0, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v2

    .line 377
    .local v2, "value":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    iget-wide v4, v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    iget-wide v3, v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v3, v3

    return v3

    .line 381
    .end local v2    # "value":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v2

    .line 382
    .local v2, "bitWidth":I
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x5

    invoke-static {v0, v4, v5, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->blob(IIII)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    return v3

    .line 386
    .end local v1    # "i":Ljava/lang/Integer;
    .end local v2    # "bitWidth":I
    :cond_1
    invoke-direct {p0, v0, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object v1

    .line 387
    .local v1, "value":Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    iget-wide v2, v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v2, v2

    return v2
.end method

.method public putUInt(I)V
    .locals 3
    .param p1, "value"    # I

    .line 280
    const/4 v0, 0x0

    int-to-long v1, p1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt(Ljava/lang/String;J)V

    .line 281
    return-void
.end method

.method public putUInt(J)V
    .locals 1
    .param p1, "value"    # J

    .line 288
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt(Ljava/lang/String;J)V

    .line 289
    return-void
.end method

.method public putUInt64(Ljava/math/BigInteger;)V
    .locals 3
    .param p1, "value"    # Ljava/math/BigInteger;

    .line 297
    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt64(Ljava/lang/String;J)V

    .line 298
    return-void
.end method

.method public startMap()I
    .locals 1

    .line 616
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public startVector()I
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
