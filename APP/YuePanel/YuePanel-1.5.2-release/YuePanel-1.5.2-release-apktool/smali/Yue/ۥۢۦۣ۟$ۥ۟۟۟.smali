.class public final LYue/ۥۢۦۣ۟$ۥ۟۟۟;
.super LYue/ۥۢۦۣ۟$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۦۣ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ۟۟۠ۧ:C


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۢۦۣ۟$ۥ۟;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public read([CII)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-gtz p3, :cond_0

    return v0

    :cond_0
    add-int v1, p2, p3

    array-length v2, p1

    if-gt v1, v2, :cond_12

    if-ltz p2, :cond_12

    iget-char v1, p0, LYue/ۥۢۦۣ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:C

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    aput-char v1, p1, p2

    iput-char v0, p0, LYue/ۥۢۦۣ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:C

    move v3, v0

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    move v3, v1

    :goto_0
    const/4 v4, -0x1

    if-ge v1, p3, :cond_f

    iget v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    if-gt v3, v5, :cond_3

    iget-object v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    if-nez v3, :cond_2

    :goto_1
    move v3, v4

    goto/16 :goto_7

    :cond_2
    iput v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    iget-object v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    array-length v6, v5

    invoke-virtual {v3, v5, v0, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    iput v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    if-gtz v3, :cond_3

    invoke-virtual {p0}, LYue/ۥۢۦۣ۟$ۥ۟;->close()V

    goto :goto_1

    :cond_3
    iget-object v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    iget v4, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    aget-byte v5, v3, v4

    and-int/lit16 v6, v5, 0xff

    and-int/lit16 v7, v5, 0x80

    if-nez v7, :cond_4

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    add-int/lit8 v3, v1, 0x1

    add-int/2addr v1, p2

    int-to-char v4, v6

    aput-char v4, p1, v1

    move v1, v3

    move v3, v6

    goto :goto_0

    :cond_4
    and-int/lit16 v6, v5, 0xe0

    const/16 v7, 0xc0

    if-ne v6, v7, :cond_5

    add-int/lit8 v6, v4, 0x1

    and-int/lit8 v5, v5, 0x1f

    shl-int/lit8 v5, v5, 0x6

    add-int/lit8 v4, v4, 0x2

    :try_start_0
    aget-byte v3, v3, v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2

    :goto_2
    and-int/lit8 v3, v3, 0x3f

    add-int/2addr v5, v3

    goto :goto_3

    :cond_5
    and-int/lit16 v6, v5, 0xf0

    const/16 v8, 0xe0

    if-ne v6, v8, :cond_6

    add-int/lit8 v6, v4, 0x1

    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0xc

    add-int/lit8 v8, v4, 0x2

    :try_start_1
    aget-byte v6, v3, v6
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    and-int/lit8 v6, v6, 0x3f

    shl-int/lit8 v6, v6, 0x6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x3

    :try_start_2
    aget-byte v3, v3, v8
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_0
    move v4, v8

    goto/16 :goto_4

    :cond_6
    and-int/lit16 v6, v5, 0xf8

    const/16 v8, 0xf0

    if-ne v6, v8, :cond_9

    add-int/lit8 v6, v4, 0x1

    and-int/lit8 v5, v5, 0x7

    shl-int/lit8 v5, v5, 0x12

    add-int/lit8 v8, v4, 0x2

    :try_start_3
    aget-byte v6, v3, v6
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    and-int/lit8 v6, v6, 0x3f

    shl-int/lit8 v6, v6, 0xc

    add-int/2addr v5, v6

    add-int/lit8 v6, v4, 0x3

    :try_start_4
    aget-byte v8, v3, v8
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1

    and-int/lit8 v8, v8, 0x3f

    shl-int/lit8 v8, v8, 0x6

    add-int/2addr v5, v8

    add-int/lit8 v4, v4, 0x4

    :try_start_5
    aget-byte v3, v3, v6

    and-int/lit8 v3, v3, 0x3f

    add-int/2addr v5, v3

    const v3, 0x10ffff

    if-gt v5, v3, :cond_8

    const v3, 0xffff

    if-le v5, v3, :cond_7

    const/high16 v3, 0x10000

    sub-int/2addr v5, v3

    and-int/lit16 v3, v5, 0x3ff

    const v6, 0xdc00

    add-int/2addr v3, v6

    int-to-char v3, v3

    iput-char v3, p0, LYue/ۥۢۦۣ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:C

    shr-int/lit8 v3, v5, 0xa

    const v5, 0xd800

    add-int/2addr v5, v3

    :cond_7
    :goto_3
    move v3, v5

    goto :goto_5

    :cond_8
    new-instance v3, Ljava/io/CharConversionException;

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    const-string v8, "UTF-8 encoding of character 0x00"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, " can\'t be converted to Unicode."

    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_1
    move v4, v6

    goto :goto_4

    :cond_9
    new-instance v3, Ljava/io/CharConversionException;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "Unconvertible UTF-8 character beginning with 0x"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v6, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    iget v8, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    aget-byte v6, v6, v8

    and-int/lit16 v6, v6, 0xff

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    :goto_4
    move v3, v0

    :goto_5
    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    if-le v4, v5, :cond_b

    iget-object v4, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    iget v6, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    sub-int/2addr v5, v6

    invoke-static {v4, v6, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    sub-int/2addr v4, v5

    iput v4, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iput v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    iget-object v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    iget-object v6, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    array-length v7, v6

    sub-int/2addr v7, v4

    invoke-virtual {v5, v6, v4, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-ltz v4, :cond_a

    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    add-int/2addr v5, v4

    iput v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p0}, LYue/ۥۢۦۣ۟$ۥ۟;->close()V

    new-instance p1, Ljava/io/CharConversionException;

    const-string p2, "Partial UTF-8 char"

    invoke-direct {p1, p2}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    add-int/2addr v5, v2

    :goto_6
    iput v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    iget v5, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    if-ge v5, v4, :cond_d

    iget-object v6, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    aget-byte v6, v6, v5

    and-int/2addr v6, v7

    const/16 v8, 0x80

    if-ne v6, v8, :cond_c

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, LYue/ۥۢۦۣ۟$ۥ۟;->close()V

    new-instance p1, Ljava/io/CharConversionException;

    const-string p2, "Malformed UTF-8 char -- is an XML encoding declaration missing?"

    invoke-direct {p1, p2}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    add-int/lit8 v4, v1, 0x1

    add-int v5, p2, v1

    int-to-char v6, v3

    aput-char v6, p1, v5

    iget-char v5, p0, LYue/ۥۢۦۣ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:C

    if-eqz v5, :cond_e

    if-ge v4, p3, :cond_e

    add-int/lit8 v1, v1, 0x2

    add-int/2addr v4, p2

    aput-char v5, p1, v4

    iput-char v0, p0, LYue/ۥۢۦۣ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:C

    goto/16 :goto_0

    :cond_e
    move v1, v4

    goto/16 :goto_0

    :cond_f
    :goto_7
    if-lez v1, :cond_10

    return v1

    :cond_10
    if-ne v3, v4, :cond_11

    move v0, v4

    :cond_11
    return v0

    :cond_12
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    const-string v0, "UTF-8"

    return-object v0
.end method
