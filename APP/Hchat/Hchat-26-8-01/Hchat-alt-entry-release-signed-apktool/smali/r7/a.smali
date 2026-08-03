.class public Lr7/a;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/g;


# instance fields
.field public final synthetic m:I

.field public final n:Z

.field public o:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lr7/a;->m:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x4

    .line 11
    iput p1, p0, Lr7/a;->o:I

    .line 12
    .line 13
    iput-boolean p2, p0, Lr7/a;->n:Z

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-boolean p2, p0, Lr7/a;->n:Z

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(S)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lr7/a;->m:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0, v1, v0}, Lr7/a;-><init>(IZ)V

    const v0, 0xffff

    and-int/2addr p1, v0

    .line 24
    invoke-virtual {p0, p1}, Lr7/a;->k(I)V

    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 2

    .line 1
    iget v0, p0, Lr7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-boolean v0, p0, Lr7/a;->n:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, p1, Lq7/b;->k:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lr7/a;->N(I)I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    if-lt v1, v0, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lr7/b;->k:[B

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Lq7/b;->e([BI)I

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-super {p0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public L()V
    .locals 4

    .line 1
    iget v0, p0, Lr7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    iget-boolean v1, p0, Lr7/a;->n:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    array-length v3, v0

    .line 16
    if-le v1, v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    aget-byte v1, v0, v2

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    shl-int/lit8 v1, v1, 0x8

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    aget-byte v0, v0, v2

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0xff

    .line 29
    .line 30
    or-int v2, v1, v0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v0, v2}, Lk7/a;->x([BI)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_0
    iput v2, p0, Lr7/a;->o:I

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public N(I)I
    .locals 2

    .line 1
    iget v0, p0, Lr7/a;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    rem-int/2addr p1, v0

    .line 9
    sub-int p1, v0, p1

    .line 10
    .line 11
    rem-int/2addr p1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p1}, Lr7/a;->O(I)V

    .line 13
    .line 14
    .line 15
    return p1
.end method

.method public O(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lr7/b;->M(IZ)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lr7/b;->k:[B

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    move v2, v0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aput-byte v0, p1, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public get()I
    .locals 1

    .line 1
    iget v0, p0, Lr7/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public k(I)V
    .locals 3

    .line 1
    iget v0, p0, Lr7/a;->o:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lr7/a;->o:I

    .line 7
    .line 8
    iget-object v0, p0, Lr7/b;->k:[B

    .line 9
    .line 10
    iget-boolean v1, p0, Lr7/a;->n:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    ushr-int/lit8 v1, p1, 0x8

    .line 16
    .line 17
    and-int/lit16 v1, v1, 0xff

    .line 18
    .line 19
    int-to-byte v1, v1

    .line 20
    aput-byte v1, v0, v2

    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    int-to-byte p1, p1

    .line 25
    const/4 v1, 0x1

    .line 26
    aput-byte p1, v0, v1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {v0, v2, p1}, Lk7/a;->E([BII)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lr7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lr7/a;->o:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget v0, p0, Lr7/a;->o:I

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "OFF"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x4

    .line 30
    if-eq v0, v3, :cond_1

    .line 31
    .line 32
    const-string v3, "alignment="

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", "

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    :cond_1
    const-string v0, "align="

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
