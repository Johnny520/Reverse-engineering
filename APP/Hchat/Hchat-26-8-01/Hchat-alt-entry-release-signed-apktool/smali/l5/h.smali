.class public final Ll5/h;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/h;
.implements Lt5/d;


# virtual methods
.method public final a()Lv5/b;
    .locals 4

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x2

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :try_start_0
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroidx/lifecycle/x;->O(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    ushr-int/lit8 v2, v2, 0x6

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    if-ltz v2, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    if-gt v2, v3, :cond_0

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, Loh/h;->N(Lk5/u;II)La/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lf5/h;

    .line 38
    .line 39
    invoke-direct {v0, v2}, Lf5/h;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0
    :try_end_0
    .catch Lf5/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    new-instance v2, La5/a;

    .line 44
    .line 45
    const/4 v3, 0x6

    .line 46
    invoke-direct {v2, v1, v3, v0}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object v2
.end method
