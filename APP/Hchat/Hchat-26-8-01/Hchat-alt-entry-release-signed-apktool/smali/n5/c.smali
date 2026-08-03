.class public final Ln5/c;
.super La/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final j:Lk5/u;

.field public final k:I

.field public final l:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/c;->j:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Ln5/c;->k:I

    .line 7
    .line 8
    iget-object p1, p1, Lk5/u;->y:Lk5/p;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lk5/p;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Ln5/c;->l:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const-string v0, "methodhandle@"

    .line 2
    .line 3
    iget v1, p0, Ln5/c;->k:I

    .line 4
    .line 5
    if-ltz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Ln5/c;->j:Lk5/u;

    .line 8
    .line 9
    iget-object v2, v2, Lk5/u;->y:Lk5/p;

    .line 10
    .line 11
    invoke-virtual {v2}, Lk5/p;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0}, Ln5/c;->f1()Lv5/b;
    :try_end_0
    .catch Ld6/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v2

    .line 22
    new-instance v3, Lv5/a;

    .line 23
    .line 24
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {v3, v0, v2}, Lv5/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v3

    .line 32
    :cond_0
    new-instance v2, Lv5/a;

    .line 33
    .line 34
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {v2, v0}, Lv5/a;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v2
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ln5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln5/c;->e1(Ln5/c;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e1(Ln5/c;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln5/c;->g1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ln5/c;->g1()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ln5/c;->f1()Lv5/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Li5/a;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v1, v1, Li5/a;

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    return p1

    .line 34
    :cond_1
    check-cast v0, Li5/a;

    .line 35
    .line 36
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Li5/a;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Li5/a;->e1(Li5/a;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_2
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v1, v1, Li5/b;

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_3
    check-cast v0, Li5/b;

    .line 58
    .line 59
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Li5/b;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Li5/b;->e1(Li5/b;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p1, Ln5/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ln5/c;

    .line 8
    .line 9
    invoke-virtual {p0}, Ln5/c;->g1()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ln5/c;->g1()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ln5/c;->f1()Lv5/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final f1()Lv5/b;
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/c;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Ln5/c;->l:I

    .line 6
    .line 7
    add-int/lit8 v2, v2, 0x4

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Ln5/c;->g1()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, Ld6/f;

    .line 21
    .line 22
    invoke-virtual {p0}, Ln5/c;->g1()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const-string v3, "Invalid method handle type: %d"

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :pswitch_0
    new-instance v2, Ln5/e;

    .line 42
    .line 43
    invoke-direct {v2, v0, v1}, Ln5/e;-><init>(Lk5/u;I)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_1
    new-instance v2, Ln5/b;

    .line 48
    .line 49
    invoke-direct {v2, v0, v1}, Ln5/b;-><init>(Lk5/u;I)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final g1()I
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/c;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ln5/c;->l:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln5/c;->g1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    invoke-virtual {p0}, Ln5/c;->f1()Lv5/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
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
    invoke-virtual {v1, p0}, Lq5/a;->k(Ln5/c;)V
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
