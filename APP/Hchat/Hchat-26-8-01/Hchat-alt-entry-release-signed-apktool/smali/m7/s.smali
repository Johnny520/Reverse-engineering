.class public final Lm7/s;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lm7/t;


# direct methods
.method public constructor <init>(Lm7/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lm7/s;->m:Lm7/t;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm7/s;->m:Lm7/t;

    .line 2
    .line 3
    iget-object v1, v0, Lm7/t;->s:Lr7/a;

    .line 4
    .line 5
    iget v1, v1, Lr7/a;->o:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, v0, Lm7/t;->y:Lm/a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lm/a;->get()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p1, Lq7/b;->k:I

    .line 19
    .line 20
    sub-int/2addr v0, v1

    .line 21
    :goto_0
    invoke-virtual {p0, v0, v2}, Lr7/b;->M(IZ)V

    .line 22
    .line 23
    .line 24
    invoke-super {p0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final r()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "size = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
