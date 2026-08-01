.class public final Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;
.super Ljava/io/Reader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lorg/apache/commons/lang3/text/StrBuilder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    return-void
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final read()I
    .locals 2

    .line 66
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->ready()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 67
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    iget-object p0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/text/StrBuilder;->charAt(I)C

    move-result p0

    return p0
.end method

.method public final read([CII)I
    .locals 3

    .line 1
    if-ltz p2, :cond_3

    .line 2
    .line 3
    if-ltz p3, :cond_3

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    if-gt p2, v0, :cond_3

    .line 7
    .line 8
    add-int v0, p2, p3

    .line 9
    .line 10
    array-length v1, p1

    .line 11
    if-gt v0, v1, :cond_3

    .line 12
    .line 13
    if-ltz v0, :cond_3

    .line 14
    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 20
    .line 21
    iget-object v1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lt v0, v2, :cond_1

    .line 28
    .line 29
    const/4 p0, -0x1

    .line 30
    return p0

    .line 31
    :cond_1
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 32
    .line 33
    add-int/2addr v0, p3

    .line 34
    invoke-virtual {v1}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-le v0, v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 45
    .line 46
    sub-int/2addr p3, v0

    .line 47
    :cond_2
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 48
    .line 49
    add-int v2, v0, p3

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2, p1, p2}, Lorg/apache/commons/lang3/text/StrBuilder;->getChars(II[CI)V

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 55
    .line 56
    add-int/2addr p1, p3

    .line 57
    iput p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 58
    .line 59
    return p3

    .line 60
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p0
.end method

.method public final ready()Z
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    iput v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    return-void
.end method

.method public final skip(J)J
    .locals 5

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    add-long/2addr v0, p1

    .line 5
    iget-object v2, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/lang3/text/StrBuilder;

    .line 6
    .line 7
    invoke-virtual {v2}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    int-to-long v3, v3

    .line 12
    cmp-long v0, v0, v3

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget p2, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 21
    .line 22
    sub-int/2addr p1, p2

    .line 23
    int-to-long p1, p1

    .line 24
    :cond_0
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    cmp-long v2, p1, v0

    .line 27
    .line 28
    if-gez v2, :cond_1

    .line 29
    .line 30
    return-wide v0

    .line 31
    :cond_1
    iget v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 32
    .line 33
    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->addExact(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 42
    .line 43
    return-wide p1
.end method
