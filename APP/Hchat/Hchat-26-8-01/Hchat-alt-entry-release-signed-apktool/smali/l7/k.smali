.class public final Ll7/k;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lj7/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lp7/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/h;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lj7/a;

    .line 11
    .line 12
    iget-object v0, v0, Lp7/h;->r:Lr7/f;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, v0, v2}, Lj7/a;-><init>(Lr7/f;I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Ll7/k;->o:Lj7/a;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/h;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/h;->r:Lr7/f;

    .line 6
    .line 7
    iget-object v1, p0, Ll7/k;->o:Lj7/a;

    .line 8
    .line 9
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Lr7/f;->k(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Ll7/k;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": count="

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Ll7/k;->o:Lj7/a;

    .line 21
    .line 22
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 23
    .line 24
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/k;->o:Lj7/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method
