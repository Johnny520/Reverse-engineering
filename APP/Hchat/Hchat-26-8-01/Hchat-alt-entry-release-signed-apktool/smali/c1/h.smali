.class public abstract Lc1/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(Ly0/o;F)Ly0/o;
    .locals 8

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v6, 0x0

    .line 9
    const v7, 0x7effb

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    move-object v1, p0

    .line 16
    move v2, p1

    .line 17
    invoke-static/range {v1 .. v7}, Lf1/c0;->n(Ly0/o;FFLf1/r0;ZLf1/n;I)Ly0/o;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final b(Ly0/o;Lf1/r0;)Ly0/o;
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const v6, 0x7e7ff

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    move-object v0, p0

    .line 9
    move-object v3, p1

    .line 10
    invoke-static/range {v0 .. v6}, Lf1/c0;->n(Ly0/o;FFLf1/r0;ZLf1/n;I)Ly0/o;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final c(Ly0/o;)Ly0/o;
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const v6, 0x7efff

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    move-object v0, p0

    .line 10
    invoke-static/range {v0 .. v6}, Lf1/c0;->n(Ly0/o;FFLf1/r0;ZLf1/n;I)Ly0/o;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final d(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lc1/f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lc1/f;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final e(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lc1/i;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lc1/i;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final f(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lc1/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lc1/j;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static g(Ly0/o;Lk1/b;Lv1/s0;Lf1/n;I)Ly0/o;
    .locals 6

    .line 1
    sget-object v2, Ly0/b;->k:Ly0/g;

    .line 2
    .line 3
    new-instance v0, Lc1/m;

    .line 4
    .line 5
    const/high16 v4, 0x3f800000    # 1.0f

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Lc1/m;-><init>(Lk1/b;Ly0/c;Lv1/s0;FLf1/n;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
