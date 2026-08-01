.class public final Lcom/android/dx/io/instructions/ShortArrayCodeInput;
.super Lcom/android/dx/io/instructions/BaseCodeCursor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/io/instructions/CodeInput;


# instance fields
.field private final array:[S


# direct methods
.method public constructor <init>([S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/io/instructions/BaseCodeCursor;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->array:[S

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "array == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public hasMore()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->array:[S

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    if-ge v0, p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public read()I
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->array:[S

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-short v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, v1}, Lcom/android/dx/io/instructions/BaseCodeCursor;->advance(I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    const p0, 0xffff

    .line 14
    .line 15
    .line 16
    and-int/2addr p0, v0

    .line 17
    return p0

    .line 18
    :catch_0
    new-instance p0, Ljava/io/EOFException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public readInt()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    shl-int/lit8 p0, p0, 0x10

    .line 10
    .line 11
    or-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public readLong()J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-long v2, v2

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    int-to-long v4, v4

    .line 16
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->read()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long v6, p0

    .line 21
    const/16 p0, 0x10

    .line 22
    .line 23
    shl-long/2addr v2, p0

    .line 24
    or-long/2addr v0, v2

    .line 25
    const/16 p0, 0x20

    .line 26
    .line 27
    shl-long v2, v4, p0

    .line 28
    .line 29
    or-long/2addr v0, v2

    .line 30
    const/16 p0, 0x30

    .line 31
    .line 32
    shl-long v2, v6, p0

    .line 33
    .line 34
    or-long/2addr v0, v2

    .line 35
    return-wide v0
.end method
