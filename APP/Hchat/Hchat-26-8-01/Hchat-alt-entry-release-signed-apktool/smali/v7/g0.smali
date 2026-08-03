.class public abstract Lv7/g0;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv7/i0;

.field public final l:Lk7/a;


# direct methods
.method public constructor <init>(Lk7/a;Lv7/i0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv7/g0;->k:Lv7/i0;

    .line 5
    .line 6
    iput-object p1, p0, Lv7/g0;->l:Lk7/a;

    .line 7
    .line 8
    invoke-virtual {p2, p0}, Lk7/a;->J(Lk7/a;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, v0}, Lk7/a;->H(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {p1, p2}, Lk7/a;->H(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Lv7/g0;->M(Lk7/a;Lv7/i0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lk7/a;->G(Lq7/b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

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

.method public abstract L(Lu7/b;)V
.end method

.method public M(Lk7/a;Lv7/i0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract N()V
.end method

.method public final p()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lk7/a;->p()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    return v1
.end method

.method public final r()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/b;->r()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lk7/a;->r()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lk7/a;->o([B[B)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv7/g0;->k:Lv7/i0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", value={"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "}"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
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
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lr7/b;->z(Lf6/b;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lk7/a;->z(Lf6/b;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
