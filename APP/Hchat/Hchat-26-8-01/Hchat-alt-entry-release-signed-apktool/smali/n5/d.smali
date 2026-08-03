.class public final Ln5/d;
.super La/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final j:Lk5/u;

.field public final k:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/d;->j:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Ln5/d;->k:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Ln5/d;->k:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ln5/d;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v1, Lk5/u;->v:Lk5/p;

    .line 8
    .line 9
    iget-object v1, v1, Lk5/p;->h:Lk5/u;

    .line 10
    .line 11
    iget v1, v1, Lk5/u;->h:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, Lv5/a;

    .line 17
    .line 18
    const-string v2, "proto@"

    .line 19
    .line 20
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v1, v0}, Lv5/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Ln5/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln5/d;->f1()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ln5/d;->f1()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ln5/d;->e1()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ln5/d;->e1()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, Ld6/d;->b(Ljava/util/List;Ljava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final e1()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/d;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->v:Lk5/p;

    .line 6
    .line 7
    iget v3, p0, Ln5/d;->k:I

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Lk5/p;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/lit8 v2, v2, 0x8

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lez v1, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v1, v1, 0x4

    .line 28
    .line 29
    new-instance v2, Lk5/y;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v2, p0, v1, v0, v3}, Lk5/y;-><init>(Ljava/lang/Object;III)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    .line 38
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ln5/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ln5/d;

    .line 6
    .line 7
    invoke-virtual {p0}, Ln5/d;->f1()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ln5/d;->f1()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ln5/d;->e1()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Ln5/d;->e1()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0, p1}, Ld6/d;->e(Ljava/util/List;Ljava/util/List;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public final f1()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/d;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->v:Lk5/p;

    .line 8
    .line 9
    iget v3, p0, Ln5/d;->k:I

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v0, v0, 0x4

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln5/d;->f1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    invoke-virtual {p0}, Ln5/d;->e1()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lq5/a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lq5/a;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lq5/a;->l(Ln5/d;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :catch_0
    const-string v0, "Unexpected IOException"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method
