.class public final Lbsh/飘花落叶言子世楪哲兰苏;
.super Ljava/io/FilterReader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lbsh/飘花落叶言子世苏哲兰楪;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterReader;-><init>(Ljava/io/Reader;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 5

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    if-ne v0, v3, :cond_0

    .line 8
    .line 9
    iput v2, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    :goto_0
    iget-object v0, p0, Ljava/io/FilterReader;->in:Ljava/io/Reader;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v4, 0xd

    .line 19
    .line 20
    if-ne v0, v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-ne v0, v1, :cond_3

    .line 24
    .line 25
    iget v1, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 26
    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iput v3, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 30
    .line 31
    const/16 p0, 0x3b

    .line 32
    .line 33
    return p0

    .line 34
    :cond_2
    iput v2, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 35
    .line 36
    return v0

    .line 37
    :cond_3
    const/4 v1, 0x0

    .line 38
    iput v1, p0, Lbsh/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 39
    .line 40
    return v0
.end method

.method public final read([CII)I
    .locals 0

    .line 41
    invoke-virtual {p0}, Lbsh/飘花落叶言子世楪哲兰苏;->read()I

    move-result p0

    const/4 p3, -0x1

    if-ne p0, p3, :cond_0

    return p3

    :cond_0
    int-to-char p0, p0

    .line 42
    aput-char p0, p1, p2

    const/4 p0, 0x1

    return p0
.end method
