.class public final LYue/ۥۢۦۣ۟$ۥ;
.super LYue/ۥۢۦۣ۟$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۦۣ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۢۦۣ۟$ۥ۟;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public read([CII)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    add-int v2, p2, p3

    array-length v3, p1

    if-gt v2, v3, :cond_6

    if-ltz p2, :cond_6

    iget v2, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iget v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v2, v4, :cond_2

    iput v3, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    iget-object v2, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    array-length v4, v2

    invoke-virtual {v0, v2, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    iput v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    if-gtz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۦۣ۟$ۥ۟;->close()V

    return v1

    :cond_1
    if-le p3, v0, :cond_3

    move p3, v0

    goto :goto_0

    :cond_2
    if-le p3, v2, :cond_3

    move p3, v2

    :cond_3
    :goto_0
    if-ge v3, p3, :cond_5

    iget-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    iget v1, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    aget-byte v0, v0, v1

    if-ltz v0, :cond_4

    add-int v1, p2, v3

    int-to-char v0, v0

    aput-char v0, p1, v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/io/CharConversionException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string p3, "Illegal ASCII character, 0x"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    and-int/lit16 p3, v0, 0xff

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return p3

    :cond_6
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    const-string v0, "US-ASCII"

    return-object v0
.end method
