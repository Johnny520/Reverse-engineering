.class public final Lv7/g;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lr7/f;

.field public final l:Lr7/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr7/f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lr7/f;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 11
    .line 12
    new-instance v2, Lr7/d;

    .line 13
    .line 14
    const/16 v3, 0x100

    .line 15
    .line 16
    invoke-direct {v2, v3}, Lr7/d;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lv7/g;->l:Lr7/d;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lk7/a;->H(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lk7/a;->J(Lk7/a;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {v2, v0}, Lk7/a;->H(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p0}, Lk7/a;->J(Lk7/a;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/g;->l:Lr7/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv7/g;->l:Lr7/d;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/2addr p1, v0

    .line 14
    return p1
.end method

.method public final p()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lv7/g;->l:Lr7/d;

    .line 14
    .line 15
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    return v1
.end method

.method public final r()[B
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr7/b;->r()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lv7/g;->l:Lr7/d;

    .line 14
    .line 15
    invoke-virtual {v1}, Lr7/b;->r()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lk7/a;->o([B[B)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LIBRARY{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lv7/g;->k:Lr7/f;

    .line 9
    .line 10
    iget v1, v1, Lr7/f;->n:I

    .line 11
    .line 12
    int-to-byte v1, v1

    .line 13
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x3a

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lv7/g;->l:Lr7/d;

    .line 26
    .line 27
    iget-object v1, v1, Lr7/r;->m:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const-string v1, "NULL"

    .line 32
    .line 33
    :cond_0
    const/16 v2, 0x7d

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final z(Lf6/b;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk7/a;

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lv7/g;->k:Lr7/f;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lr7/b;->z(Lf6/b;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lv7/g;->l:Lr7/d;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lr7/b;->z(Lf6/b;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
