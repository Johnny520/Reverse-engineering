.class public Lr7/f;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/m;


# instance fields
.field public final m:Z

.field public n:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lr7/f;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr7/f;->k(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x4

    .line 9
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 10
    iput-boolean p1, p0, Lr7/f;->m:Z

    return-void
.end method


# virtual methods
.method public final L()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget-boolean v1, p0, Lr7/f;->m:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    array-length v3, v0

    .line 10
    if-le v1, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x3

    .line 14
    aget-byte v1, v0, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aget-byte v3, v0, v3

    .line 20
    .line 21
    and-int/lit16 v3, v3, 0xff

    .line 22
    .line 23
    shl-int/lit8 v3, v3, 0x8

    .line 24
    .line 25
    or-int/2addr v1, v3

    .line 26
    const/4 v3, 0x1

    .line 27
    aget-byte v3, v0, v3

    .line 28
    .line 29
    and-int/lit16 v3, v3, 0xff

    .line 30
    .line 31
    shl-int/lit8 v3, v3, 0x10

    .line 32
    .line 33
    or-int/2addr v1, v3

    .line 34
    aget-byte v0, v0, v2

    .line 35
    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    shl-int/lit8 v0, v0, 0x18

    .line 39
    .line 40
    or-int v2, v1, v0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0, v2}, Lk7/a;->s([BI)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_0
    iput v2, p0, Lr7/f;->n:I

    .line 48
    .line 49
    return-void
.end method

.method public final get()I
    .locals 1

    .line 1
    iget v0, p0, Lr7/f;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(I)V
    .locals 4

    .line 1
    iget v0, p0, Lr7/f;->n:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lr7/f;->n:I

    .line 7
    .line 8
    iget-object v0, p0, Lr7/b;->k:[B

    .line 9
    .line 10
    iget-boolean v1, p0, Lr7/f;->m:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    array-length v3, v0

    .line 17
    if-le v1, v3, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    ushr-int/lit8 v1, p1, 0x18

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    int-to-byte v1, v1

    .line 25
    aput-byte v1, v0, v2

    .line 26
    .line 27
    ushr-int/lit8 v1, p1, 0x10

    .line 28
    .line 29
    and-int/lit16 v1, v1, 0xff

    .line 30
    .line 31
    int-to-byte v1, v1

    .line 32
    const/4 v2, 0x1

    .line 33
    aput-byte v1, v0, v2

    .line 34
    .line 35
    ushr-int/lit8 v1, p1, 0x8

    .line 36
    .line 37
    and-int/lit16 v1, v1, 0xff

    .line 38
    .line 39
    int-to-byte v1, v1

    .line 40
    const/4 v2, 0x2

    .line 41
    aput-byte v1, v0, v2

    .line 42
    .line 43
    and-int/lit16 p1, p1, 0xff

    .line 44
    .line 45
    int-to-byte p1, p1

    .line 46
    const/4 v1, 0x3

    .line 47
    aput-byte p1, v0, v1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {v0, v2, p1}, Lk7/a;->D([BII)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lr7/f;->n:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
