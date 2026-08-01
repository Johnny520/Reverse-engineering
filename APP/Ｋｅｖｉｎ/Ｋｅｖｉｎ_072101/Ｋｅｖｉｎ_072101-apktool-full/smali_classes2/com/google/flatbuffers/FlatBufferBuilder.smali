.class public Lcom/google/flatbuffers/FlatBufferBuilder;
.super Ljava/lang/Object;
.source "FlatBufferBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferBackedInputStream;,
        Lcom/google/flatbuffers/FlatBufferBuilder$HeapByteBufferFactory;,
        Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final DEFAULT_BUFFER_SIZE:I = 0x400

.field private static final MAX_BUFFER_SIZE:I = 0x7ffffff7


# instance fields
.field bb:Ljava/nio/ByteBuffer;

.field bb_factory:Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

.field finished:Z

.field force_defaults:Z

.field minalign:I

.field nested:Z

.field num_vtables:I

.field object_start:I

.field space:I

.field string_pool:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final utf8:Lcom/google/flatbuffers/Utf8;

.field vector_num_elems:I

.field vtable:[I

.field vtable_in_use:I

.field vtables:[I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 117
    const/16 v0, 0x400

    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>(I)V

    .line 118
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3
    .param p1, "initial_size"    # I

    .line 110
    sget-object v0, Lcom/google/flatbuffers/FlatBufferBuilder$HeapByteBufferFactory;->INSTANCE:Lcom/google/flatbuffers/FlatBufferBuilder$HeapByteBufferFactory;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/flatbuffers/Utf8;->getDefault()Lcom/google/flatbuffers/Utf8;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>(ILcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/Utf8;)V

    .line 111
    return-void
.end method

.method public constructor <init>(ILcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)V
    .locals 2
    .param p1, "initial_size"    # I
    .param p2, "bb_factory"    # Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 76
    const/4 v0, 0x0

    invoke-static {}, Lcom/google/flatbuffers/Utf8;->getDefault()Lcom/google/flatbuffers/Utf8;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>(ILcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/Utf8;)V

    .line 77
    return-void
.end method

.method public constructor <init>(ILcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/Utf8;)V
    .locals 2
    .param p1, "initial_size"    # I
    .param p2, "bb_factory"    # Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;
    .param p3, "existing_bb"    # Ljava/nio/ByteBuffer;
    .param p4, "utf8"    # Lcom/google/flatbuffers/Utf8;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 44
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 45
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->finished:Z

    .line 47
    const/16 v1, 0x10

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    .line 48
    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 49
    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 50
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    .line 89
    if-gtz p1, :cond_0

    .line 90
    const/16 p1, 0x400

    .line 92
    :cond_0
    iput-object p2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb_factory:Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 93
    if-eqz p3, :cond_1

    .line 94
    iput-object p3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 95
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 96
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {p2, p1}, Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;->newByteBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 100
    :goto_0
    iput-object p4, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->utf8:Lcom/google/flatbuffers/Utf8;

    .line 101
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "existing_bb"    # Ljava/nio/ByteBuffer;

    .line 141
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder$HeapByteBufferFactory;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder$HeapByteBufferFactory;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)V

    .line 142
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)V
    .locals 2
    .param p1, "existing_bb"    # Ljava/nio/ByteBuffer;
    .param p2, "bb_factory"    # Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 130
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    invoke-static {}, Lcom/google/flatbuffers/Utf8;->getDefault()Lcom/google/flatbuffers/Utf8;

    move-result-object v1

    invoke-direct {p0, v0, p2, p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>(ILcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/Utf8;)V

    .line 131
    return-void
.end method

.method private dataStart()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1054
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 1055
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    return v0
.end method

.method static growByteBuffer(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)Ljava/nio/ByteBuffer;
    .locals 4
    .param p0, "bb"    # Ljava/nio/ByteBuffer;
    .param p1, "bb_factory"    # Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 262
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    .line 266
    .local v0, "old_buf_size":I
    if-nez v0, :cond_0

    .line 267
    const/16 v1, 0x400

    .local v1, "new_buf_size":I
    goto :goto_0

    .line 270
    .end local v1    # "new_buf_size":I
    :cond_0
    const v1, 0x7ffffff7

    if-eq v0, v1, :cond_2

    .line 273
    const/high16 v2, -0x40000000    # -2.0f

    and-int/2addr v2, v0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    shl-int/lit8 v1, v0, 0x1

    .line 276
    .restart local v1    # "new_buf_size":I
    :goto_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 277
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;->newByteBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 278
    .local v2, "nbb":Ljava/nio/ByteBuffer;
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    .line 279
    sub-int v3, v1, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 280
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 281
    return-object v2

    .line 271
    .end local v1    # "new_buf_size":I
    .end local v2    # "nbb":Ljava/nio/ByteBuffer;
    :cond_2
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public static isFieldPresent(Lcom/google/flatbuffers/Table;I)Z
    .locals 1
    .param p0, "table"    # Lcom/google/flatbuffers/Table;
    .param p1, "offset"    # I

    .line 230
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public Nested(I)V
    .locals 2
    .param p1, "obj"    # I

    .line 699
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 701
    return-void

    .line 700
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: struct must be serialized inline."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public addBoolean(IZZ)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # Z
    .param p3, "d"    # Z

    .line 761
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(Z)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addBoolean(Z)V
    .locals 2
    .param p1, "x"    # Z

    .line 393
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->putBoolean(Z)V

    return-void
.end method

.method public addByte(B)V
    .locals 2
    .param p1, "x"    # B

    .line 400
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->putByte(B)V

    return-void
.end method

.method public addByte(IBI)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # B
    .param p3, "d"    # I

    .line 772
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addDouble(D)V
    .locals 2
    .param p1, "x"    # D

    .line 435
    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->putDouble(D)V

    return-void
.end method

.method public addDouble(IDD)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # D
    .param p4, "d"    # D

    .line 827
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    cmpl-double v0, p2, p4

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/flatbuffers/FlatBufferBuilder;->addDouble(D)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addFloat(F)V
    .locals 2
    .param p1, "x"    # F

    .line 428
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->putFloat(F)V

    return-void
.end method

.method public addFloat(IFD)V
    .locals 2
    .param p1, "o"    # I
    .param p2, "x"    # F
    .param p3, "d"    # D

    .line 816
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    float-to-double v0, p2

    cmpl-double v0, v0, p3

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addFloat(F)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addInt(I)V
    .locals 2
    .param p1, "x"    # I

    .line 414
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    return-void
.end method

.method public addInt(III)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # I
    .param p3, "d"    # I

    .line 794
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(I)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addLong(IJJ)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # J
    .param p4, "d"    # J

    .line 805
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    cmp-long v0, p2, p4

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/flatbuffers/FlatBufferBuilder;->addLong(J)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addLong(J)V
    .locals 2
    .param p1, "x"    # J

    .line 421
    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->putLong(J)V

    return-void
.end method

.method public addOffset(I)V
    .locals 2
    .param p1, "off"    # I

    .line 443
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 444
    nop

    .line 445
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    sub-int/2addr v0, p1

    add-int/2addr v0, v1

    .line 446
    .end local p1    # "off":I
    .local v0, "off":I
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    .line 447
    return-void
.end method

.method public addOffset(III)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # I
    .param p3, "d"    # I

    .line 838
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addShort(ISI)V
    .locals 1
    .param p1, "o"    # I
    .param p2, "x"    # S
    .param p3, "d"    # I

    .line 783
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    if-nez v0, :cond_0

    if-eq p2, p3, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    :cond_1
    return-void
.end method

.method public addShort(S)V
    .locals 2
    .param p1, "x"    # S

    .line 407
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->putShort(S)V

    return-void
.end method

.method public addStruct(III)V
    .locals 0
    .param p1, "voffset"    # I
    .param p2, "x"    # I
    .param p3, "d"    # I

    .line 848
    if-eq p2, p3, :cond_0

    .line 849
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->Nested(I)V

    .line 850
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->slot(I)V

    .line 852
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 4

    .line 237
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 238
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 239
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 240
    :goto_0
    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    iget v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    sub-int/2addr v3, v0

    iput v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    aput v2, v1, v3

    goto :goto_0

    .line 241
    :cond_0
    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 242
    iput-boolean v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 243
    iput-boolean v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->finished:Z

    .line 244
    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->object_start:I

    .line 245
    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 246
    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 247
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 250
    :cond_1
    return-void
.end method

.method public createByteVector(Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "byteBuffer"    # Ljava/nio/ByteBuffer;

    .line 664
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 665
    .local v0, "length":I
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 666
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 667
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 668
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v1

    return v1
.end method

.method public createByteVector([B)I
    .locals 3
    .param p1, "arr"    # [B

    .line 632
    array-length v0, p1

    .line 633
    .local v0, "length":I
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 634
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 635
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 636
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v1

    return v1
.end method

.method public createByteVector([BII)I
    .locals 2
    .param p1, "arr"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I

    .line 648
    const/4 v0, 0x1

    invoke-virtual {p0, v0, p3, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 649
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v1, p3

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 650
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 651
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v0

    return v0
.end method

.method public createSharedString(Ljava/lang/String;)I
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .line 577
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 578
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    .line 579
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v0

    .line 580
    .local v0, "offset":I
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    return v0

    .line 585
    .end local v0    # "offset":I
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 587
    .local v0, "offset":Ljava/lang/Integer;
    if-nez v0, :cond_1

    .line 588
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 589
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1
.end method

.method public createSortedVectorOfTables(Lcom/google/flatbuffers/Table;[I)I
    .locals 1
    .param p2, "offsets"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/flatbuffers/Table;",
            ">(TT;[I)I"
        }
    .end annotation

    .line 559
    .local p1, "obj":Lcom/google/flatbuffers/Table;, "TT;"
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v0}, Lcom/google/flatbuffers/Table;->sortTables([ILjava/nio/ByteBuffer;)V

    .line 560
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v0

    return v0
.end method

.method public createString(Ljava/lang/CharSequence;)I
    .locals 3
    .param p1, "s"    # Ljava/lang/CharSequence;

    .line 602
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->utf8:Lcom/google/flatbuffers/Utf8;

    invoke-virtual {v0, p1}, Lcom/google/flatbuffers/Utf8;->encodedLength(Ljava/lang/CharSequence;)I

    move-result v0

    .line 603
    .local v0, "length":I
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    .line 604
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 605
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 606
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->utf8:Lcom/google/flatbuffers/Utf8;

    iget-object v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1, v2}, Lcom/google/flatbuffers/Utf8;->encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    .line 607
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v1

    return v1
.end method

.method public createString(Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "s"    # Ljava/nio/ByteBuffer;

    .line 617
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 618
    .local v0, "length":I
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    .line 619
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 620
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 621
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 622
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v1

    return v1
.end method

.method public createUnintializedVector(III)Ljava/nio/ByteBuffer;
    .locals 3
    .param p1, "elem_size"    # I
    .param p2, "num_elems"    # I
    .param p3, "alignment"    # I

    .line 527
    mul-int v0, p1, p2

    .line 528
    .local v0, "length":I
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 530
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 533
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 534
    .local v1, "copy":Ljava/nio/ByteBuffer;
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 535
    return-object v1
.end method

.method public createVectorOfTables([I)I
    .locals 2
    .param p1, "offsets"    # [I

    .line 545
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 546
    const/4 v0, 0x4

    array-length v1, p1

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startVector(III)V

    .line 547
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 548
    .end local v0    # "i":I
    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->endVector()I

    move-result v0

    return v0
.end method

.method public dataBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1040
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 1041
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public endTable()I
    .locals 13

    .line 871
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-eqz v0, :cond_9

    .line 873
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(I)V

    .line 874
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v1

    .line 876
    .local v1, "vtableloc":I
    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    add-int/lit8 v2, v2, -0x1

    .line 878
    .local v2, "i":I
    :goto_0
    if-ltz v2, :cond_0

    iget-object v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    aget v3, v3, v2

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 879
    :cond_0
    add-int/lit8 v3, v2, 0x1

    .line 880
    .local v3, "trimmed_size":I
    :goto_1
    if-ltz v2, :cond_2

    .line 882
    iget-object v4, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    aget v4, v4, v2

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    aget v4, v4, v2

    sub-int v4, v1, v4

    goto :goto_2

    :cond_1
    move v4, v0

    :goto_2
    int-to-short v4, v4

    .line 883
    .local v4, "off":S
    invoke-virtual {p0, v4}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    .line 880
    .end local v4    # "off":S
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 886
    :cond_2
    const/4 v4, 0x2

    .line 887
    .local v4, "standard_fields":I
    iget v5, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->object_start:I

    sub-int v5, v1, v5

    int-to-short v5, v5

    invoke-virtual {p0, v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    .line 888
    add-int/lit8 v5, v3, 0x2

    mul-int/lit8 v5, v5, 0x2

    int-to-short v5, v5

    invoke-virtual {p0, v5}, Lcom/google/flatbuffers/FlatBufferBuilder;->addShort(S)V

    .line 891
    const/4 v5, 0x0

    .line 893
    .local v5, "existing_vtable":I
    const/4 v2, 0x0

    :goto_3
    iget v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    if-ge v2, v6, :cond_6

    .line 894
    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    iget-object v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    aget v7, v7, v2

    sub-int/2addr v6, v7

    .line 895
    .local v6, "vt1":I
    iget v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 896
    .local v7, "vt2":I
    iget-object v8, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v8

    .line 897
    .local v8, "len":S
    iget-object v9, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    if-ne v8, v9, :cond_5

    .line 898
    const/4 v9, 0x2

    .local v9, "j":I
    :goto_4
    if-ge v9, v8, :cond_4

    .line 899
    iget-object v10, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int v11, v6, v9

    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v10

    iget-object v11, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int v12, v7, v9

    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v11

    if-eq v10, v11, :cond_3

    .line 900
    goto :goto_5

    .line 898
    :cond_3
    add-int/lit8 v9, v9, 0x2

    goto :goto_4

    .line 903
    .end local v9    # "j":I
    :cond_4
    iget-object v9, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    aget v5, v9, v2

    .line 904
    goto :goto_6

    .line 893
    .end local v6    # "vt1":I
    .end local v7    # "vt2":I
    .end local v8    # "len":S
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 908
    :cond_6
    :goto_6
    if-eqz v5, :cond_7

    .line 911
    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    sub-int/2addr v6, v1

    iput v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 913
    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int v8, v5, v1

    invoke-virtual {v6, v7, v8}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_7

    .line 917
    :cond_7
    iget v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    iget-object v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    array-length v7, v7

    if-ne v6, v7, :cond_8

    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    iget v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    mul-int/lit8 v7, v7, 0x2

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    iput-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    .line 918
    :cond_8
    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtables:[I

    iget v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    add-int/lit8 v8, v7, 0x1

    iput v8, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v8

    aput v8, v6, v7

    .line 920
    iget-object v6, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget-object v7, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v8

    sub-int/2addr v8, v1

    invoke-virtual {v6, v7, v8}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 923
    :goto_7
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 924
    return v1

    .line 872
    .end local v1    # "vtableloc":I
    .end local v2    # "i":I
    .end local v3    # "trimmed_size":I
    .end local v4    # "standard_fields":I
    .end local v5    # "existing_vtable":I
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endTable called without startTable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public endVector()I
    .locals 2

    .line 508
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-eqz v0, :cond_0

    .line 510
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 511
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->putInt(I)V

    .line 512
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    return v0

    .line 509
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endVector called without startVector"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public finish(I)V
    .locals 1
    .param p1, "root_table"    # I

    .line 966
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(IZ)V

    .line 967
    return-void
.end method

.method public finish(ILjava/lang/String;)V
    .locals 1
    .param p1, "root_table"    # I
    .param p2, "file_identifier"    # Ljava/lang/String;

    .line 1005
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(ILjava/lang/String;Z)V

    .line 1006
    return-void
.end method

.method protected finish(ILjava/lang/String;Z)V
    .locals 3
    .param p1, "root_table"    # I
    .param p2, "file_identifier"    # Ljava/lang/String;
    .param p3, "size_prefix"    # Z

    .line 987
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/4 v1, 0x4

    if-eqz p3, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v2, v2, 0x8

    invoke-virtual {p0, v0, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 988
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 991
    const/4 v0, 0x3

    .local v0, "i":I
    :goto_1
    if-ltz v0, :cond_1

    .line 992
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(B)V

    .line 991
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 994
    .end local v0    # "i":I
    :cond_1
    invoke-virtual {p0, p1, p3}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(IZ)V

    .line 995
    return-void

    .line 989
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: file identifier must be length 4"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method protected finish(IZ)V
    .locals 3
    .param p1, "root_table"    # I
    .param p2, "size_prefix"    # Z

    .line 951
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    const/4 v1, 0x4

    if-eqz p2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v2, v1

    invoke-virtual {p0, v0, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 952
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(I)V

    .line 953
    if-eqz p2, :cond_1

    .line 954
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addInt(I)V

    .line 956
    :cond_1
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 957
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->finished:Z

    .line 958
    return-void
.end method

.method public finishSizePrefixed(I)V
    .locals 1
    .param p1, "root_table"    # I

    .line 975
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(IZ)V

    .line 976
    return-void
.end method

.method public finishSizePrefixed(ILjava/lang/String;)V
    .locals 1
    .param p1, "root_table"    # I
    .param p2, "file_identifier"    # Ljava/lang/String;

    .line 1016
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(ILjava/lang/String;Z)V

    .line 1017
    return-void
.end method

.method public finished()V
    .locals 2

    .line 676
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->finished:Z

    if-eqz v0, :cond_0

    .line 680
    return-void

    .line 677
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public forceDefaults(Z)Lcom/google/flatbuffers/FlatBufferBuilder;
    .locals 0
    .param p1, "forceDefaults"    # Z

    .line 1028
    iput-boolean p1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->force_defaults:Z

    .line 1029
    return-object p0
.end method

.method public init(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)Lcom/google/flatbuffers/FlatBufferBuilder;
    .locals 2
    .param p1, "existing_bb"    # Ljava/nio/ByteBuffer;
    .param p2, "bb_factory"    # Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 155
    iput-object p2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb_factory:Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    .line 156
    iput-object p1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 157
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 158
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 159
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 160
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 161
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 162
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 163
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->finished:Z

    .line 164
    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->object_start:I

    .line 165
    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->num_vtables:I

    .line 166
    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 167
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->string_pool:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 170
    :cond_0
    return-object p0
.end method

.method public notNested()V
    .locals 2

    .line 687
    iget-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    if-nez v0, :cond_0

    .line 689
    return-void

    .line 688
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: object serialization must not be nested."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public offset()I
    .locals 2

    .line 290
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public pad(I)V
    .locals 4
    .param p1, "byte_size"    # I

    .line 299
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 300
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public prep(II)V
    .locals 5
    .param p1, "size"    # I
    .param p2, "additional_bytes"    # I

    .line 314
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->minalign:I

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v0, v1

    add-int/2addr v0, p2

    not-int v0, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    .line 319
    .local v0, "align_size":I
    :goto_0
    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int v2, v0, p1

    add-int/2addr v2, p2

    if-ge v1, v2, :cond_2

    .line 320
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    .line 321
    .local v1, "old_buf_size":I
    iget-object v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 322
    .local v2, "old":Ljava/nio/ByteBuffer;
    iget-object v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb_factory:Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    invoke-static {v2, v3}, Lcom/google/flatbuffers/FlatBufferBuilder;->growByteBuffer(Ljava/nio/ByteBuffer;Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    .line 323
    iget-object v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    if-eq v2, v3, :cond_1

    .line 324
    iget-object v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb_factory:Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;

    invoke-virtual {v3, v2}, Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferFactory;->releaseByteBuffer(Ljava/nio/ByteBuffer;)V

    .line 326
    :cond_1
    iget v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    iget-object v4, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    sub-int/2addr v4, v1

    add-int/2addr v3, v4

    iput v3, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    .line 327
    .end local v1    # "old_buf_size":I
    .end local v2    # "old":Ljava/nio/ByteBuffer;
    goto :goto_0

    .line 328
    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->pad(I)V

    .line 329
    return-void
.end method

.method public putBoolean(Z)V
    .locals 3
    .param p1, "x"    # Z

    .line 337
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    int-to-byte v2, p1

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putByte(B)V
    .locals 2
    .param p1, "x"    # B

    .line 345
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putDouble(D)V
    .locals 2
    .param p1, "x"    # D

    .line 385
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x8

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1, p2}, Ljava/nio/ByteBuffer;->putDouble(ID)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putFloat(F)V
    .locals 2
    .param p1, "x"    # F

    .line 377
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x4

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putInt(I)V
    .locals 2
    .param p1, "x"    # I

    .line 361
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x4

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putLong(J)V
    .locals 2
    .param p1, "x"    # J

    .line 369
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x8

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public putShort(S)V
    .locals 2
    .param p1, "x"    # S

    .line 353
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    add-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public required(II)V
    .locals 6
    .param p1, "table"    # I
    .param p2, "field"    # I

    .line 935
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    sub-int/2addr v0, p1

    .line 936
    .local v0, "table_start":I
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    sub-int v1, v0, v1

    .line 937
    .local v1, "vtable_start":I
    iget-object v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    add-int v3, v1, p2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 939
    .local v2, "ok":Z
    :goto_0
    if-eqz v2, :cond_1

    .line 941
    return-void

    .line 940
    :cond_1
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "FlatBuffers: field "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " must be set"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
.end method

.method public sizedByteArray()[B
    .locals 3

    .line 1081
    iget v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    iget v2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray(II)[B

    move-result-object v0

    return-object v0
.end method

.method public sizedByteArray(II)[B
    .locals 2
    .param p1, "start"    # I
    .param p2, "length"    # I

    .line 1068
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 1069
    new-array v0, p2, [B

    .line 1070
    .local v0, "array":[B
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1071
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 1072
    return-object v0
.end method

.method public sizedInputStream()Ljava/io/InputStream;
    .locals 2

    .line 1091
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finished()V

    .line 1092
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 1093
    .local v0, "duplicate":Ljava/nio/ByteBuffer;
    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->space:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1094
    iget-object v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 1095
    new-instance v1, Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferBackedInputStream;

    invoke-direct {v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder$ByteBufferBackedInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v1
.end method

.method public slot(I)V
    .locals 2
    .param p1, "voffset"    # I

    .line 861
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v1

    aput v1, v0, p1

    .line 862
    return-void
.end method

.method public startTable(I)V
    .locals 3
    .param p1, "numfields"    # I

    .line 744
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 745
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    .line 746
    :cond_1
    iput p1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    .line 747
    iget-object v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable:[I

    iget v1, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vtable_in_use:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 748
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 749
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->offset()I

    move-result v0

    iput v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->object_start:I

    .line 750
    return-void
.end method

.method public startVector(III)V
    .locals 2
    .param p1, "elem_size"    # I
    .param p2, "num_elems"    # I
    .param p3, "alignment"    # I

    .line 493
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlatBufferBuilder;->notNested()V

    .line 494
    iput p2, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->vector_num_elems:I

    .line 495
    const/4 v0, 0x4

    mul-int v1, p1, p2

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 496
    mul-int v0, p1, p2

    invoke-virtual {p0, p3, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->prep(II)V

    .line 497
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/flatbuffers/FlatBufferBuilder;->nested:Z

    .line 498
    return-void
.end method
