.class public Ltop/linl/dexparser/util/ByteReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private position:I

.field private final srcData:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 6
    .line 7
    iput-object p1, p0, Ltop/linl/dexparser/util/ByteReader;->srcData:[B

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public getPosition()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 2
    .line 3
    return p0
.end method

.method public read(I)[B
    .locals 2

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/util/ByteReader;->srcData:[B

    .line 2
    .line 3
    iget v1, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ltop/linl/dexparser/util/Utils;->copyArrays([BII)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 10
    .line 11
    add-int/2addr v1, p1

    .line 12
    iput v1, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 13
    .line 14
    return-object v0
.end method

.method public readUnsignedLeb128()I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget-object v2, p0, Ltop/linl/dexparser/util/ByteReader;->srcData:[B

    .line 4
    .line 5
    iget v3, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 6
    .line 7
    aget-byte v2, v2, v3

    .line 8
    .line 9
    and-int/lit8 v4, v2, 0x7f

    .line 10
    .line 11
    mul-int/lit8 v5, v1, 0x7

    .line 12
    .line 13
    shl-int/2addr v4, v5

    .line 14
    or-int/2addr v0, v4

    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    iput v3, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 20
    .line 21
    const/16 v3, 0x80

    .line 22
    .line 23
    and-int/2addr v2, v3

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    if-lt v1, v2, :cond_0

    .line 28
    .line 29
    :cond_1
    return v0
.end method

.method public setStartPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltop/linl/dexparser/util/ByteReader;->position:I

    .line 2
    .line 3
    return-void
.end method
