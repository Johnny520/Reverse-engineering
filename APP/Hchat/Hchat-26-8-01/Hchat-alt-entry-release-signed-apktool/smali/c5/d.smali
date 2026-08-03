.class public final Lc5/d;
.super Lc5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:I


# direct methods
.method public constructor <init>(ILx5/d;)V
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    invoke-direct {p0, p1, v0}, Lc5/b;-><init>(II)V

    .line 3
    .line 4
    .line 5
    iget p1, p2, Lx5/d;->h:I

    .line 6
    .line 7
    iput p1, p0, Lc5/d;->i:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 13

    .line 1
    const-string v0, ".line "

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lc5/d;->i:I

    .line 7
    .line 8
    if-gez v0, :cond_2

    .line 9
    .line 10
    int-to-long v0, v0

    .line 11
    const-wide v2, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-gez v4, :cond_0

    .line 22
    .line 23
    const/16 v4, 0x2d

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Lq5/a;->write(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/16 v4, 0x17

    .line 29
    .line 30
    :goto_0
    const-wide/16 v5, 0xa

    .line 31
    .line 32
    rem-long v7, v0, v5

    .line 33
    .line 34
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v7

    .line 38
    iget-object v9, p1, Le5/a;->i:[C

    .line 39
    .line 40
    add-int/lit8 v10, v4, -0x1

    .line 41
    .line 42
    const-wide/16 v11, 0x30

    .line 43
    .line 44
    add-long/2addr v7, v11

    .line 45
    long-to-int v7, v7

    .line 46
    int-to-char v7, v7

    .line 47
    aput-char v7, v9, v4

    .line 48
    .line 49
    div-long/2addr v0, v5

    .line 50
    cmp-long v5, v0, v2

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    rsub-int/lit8 v0, v4, 0x18

    .line 55
    .line 56
    invoke-virtual {p1, v9, v4, v0}, Lq5/a;->write([CII)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v4, v10

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {p1, v0}, Le5/a;->z(I)V

    .line 63
    .line 64
    .line 65
    :goto_1
    const/4 p1, 0x1

    .line 66
    return p1
.end method
