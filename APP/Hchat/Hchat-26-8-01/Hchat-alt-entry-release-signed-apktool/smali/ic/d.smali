.class public final Lic/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lhc/c;


# instance fields
.field public final g:Lud/r;

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public k:I

.field public final l:Lic/e;


# direct methods
.method public constructor <init>(Lud/r;Lqd/s;)V
    .locals 3

    .line 1
    iget v0, p2, Lqd/s;->g:I

    .line 2
    .line 3
    iget v1, p2, Lqd/s;->h:I

    .line 4
    .line 5
    invoke-virtual {p2}, Lqd/s;->b()Lqd/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v2, v2, Lqd/k;->b:Lqd/j;

    .line 10
    .line 11
    invoke-virtual {p2}, Lqd/s;->b()Lqd/k;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object p2, p2, Lqd/k;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lic/d;->g:Lud/r;

    .line 21
    .line 22
    iput v0, p0, Lic/d;->h:I

    .line 23
    .line 24
    iput v1, p0, Lic/d;->i:I

    .line 25
    .line 26
    iput-object p2, p0, Lic/d;->j:Ljava/lang/String;

    .line 27
    .line 28
    new-instance p1, Lic/e;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lic/e;-><init>(Lic/d;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lic/d;->l:Lic/e;

    .line 34
    .line 35
    return-void
.end method

.method public static a(Lud/r;Lqd/s;)Lic/d;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, v0, Lqd/k;->e:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object v1, v0, Lqd/k;->g:Lic/d;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    new-instance v1, Lic/d;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lic/d;-><init>(Lud/r;Lqd/s;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lqd/k;->g:Lic/d;

    .line 22
    .line 23
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lic/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lic/d;

    .line 12
    .line 13
    iget v1, p0, Lic/d;->h:I

    .line 14
    .line 15
    iget v3, p1, Lic/d;->h:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget v1, p0, Lic/d;->i:I

    .line 20
    .line 21
    iget v3, p1, Lic/d;->i:I

    .line 22
    .line 23
    if-ne v1, v3, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lic/d;->g:Lud/r;

    .line 26
    .line 27
    iget-object p1, p1, Lic/d;->g:Lud/r;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lud/r;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lic/d;->h:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lic/d;->i:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lic/d;->g:Lud/r;

    .line 11
    .line 12
    iget-object v1, v1, Lud/r;->k:Lod/d;

    .line 13
    .line 14
    iget v1, v1, Lod/d;->m:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
.end method

.method public final t(I)V
    .locals 0

    .line 1
    iput p1, p0, Lic/d;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    const-string v1, "}"

    .line 4
    .line 5
    iget v2, p0, Lic/d;->h:I

    .line 6
    .line 7
    iget v3, p0, Lic/d;->i:I

    .line 8
    .line 9
    const-string v4, "VarNode{r"

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
