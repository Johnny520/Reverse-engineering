.class public abstract Lv7/i0;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public m:Lv7/h0;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lr7/b;->k:[B

    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x1

    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    int-to-short v0, v0

    .line 12
    invoke-static {p1, v1, v0}, Lk7/a;->F([BIS)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lr7/b;->k:[B

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const/4 v1, -0x1

    .line 19
    invoke-static {p1, v0, v1}, Lk7/a;->D([BII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 4

    .line 1
    iget v0, p1, Lq7/b;->k:I

    .line 2
    .line 3
    iget-object v1, p0, Lr7/b;->k:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-virtual {p1, v1, v2}, Lq7/b;->e([BI)I

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lr7/b;->k:[B

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-static {v1, v2, v3}, Lk7/a;->q([BII)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 20
    .line 21
    .line 22
    const v0, 0xffff

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lq7/b;->readShort()S

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/2addr v0, v1

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lr7/b;->k:[B

    .line 35
    .line 36
    array-length v1, v0

    .line 37
    invoke-virtual {p1, v0, v1}, Lq7/b;->e([BI)I

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final N()I
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lr7/b;->k:[B

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v1, v0}, Lk7/a;->x([BI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x4

    .line 20
    invoke-static {v1, v0}, Lk7/a;->s([BI)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method
