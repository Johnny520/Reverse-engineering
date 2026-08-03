.class public final Ll5/v;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/i;
.implements Lt5/h;


# virtual methods
.method public final a()Lv5/b;
    .locals 4

    .line 1
    iget-object v0, p0, Ll5/a0;->b:Lf5/f;

    .line 2
    .line 3
    iget v0, v0, Lf5/f;->j:I

    .line 4
    .line 5
    iget-object v1, p0, Ll5/a0;->a:Lk5/u;

    .line 6
    .line 7
    iget-object v2, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v3, p0, Ll5/a0;->c:I

    .line 10
    .line 11
    add-int/lit8 v3, v3, 0x2

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v1, v0, v2}, Loh/h;->N(Lk5/u;II)La/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->O(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final n()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
