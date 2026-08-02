.class public final Lkw;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;
.implements Lnn0;
.implements Lon0;
.implements Lpn0;
.implements Lqn0;
.implements Lrn0;
.implements Lsn0;
.implements Ltn0;
.implements Lym0;
.implements Lzm0;
.implements Lbn0;
.implements Lcn0;
.implements Ldn0;
.implements Len0;
.implements Lfn0;
.implements Lgn0;
.implements Lhn0;
.implements Ljn0;
.implements Lkn0;


# instance fields
.field public final h:I

.field public final i:Z

.field public j:Lun0;

.field public k:Lb62;

.field public l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IZLun0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkw;->h:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lkw;->i:Z

    .line 7
    .line 8
    iput-object p3, p0, Lkw;->j:Lun0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lgo0;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p7

    .line 5
    invoke-virtual/range {p0 .. p7}, Lkw;->i(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d(ILpx;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    iget v0, p0, Lkw;->h:I

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lkw;->m(Lpx;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {v1, v2}, Lxe1;->g(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x1

    .line 25
    invoke-static {v0, v2}, Lxe1;->g(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    or-int/2addr p1, v0

    .line 30
    iget-object v0, p0, Lkw;->j:Lun0;

    .line 31
    .line 32
    invoke-static {v1, v0}, Lxe1;->f(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v0, Lmn0;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {v0, p2, p1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    new-instance v0, Ljw;

    .line 52
    .line 53
    const/16 v6, 0x8

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v1, 0x2

    .line 57
    const-class v3, Lkw;

    .line 58
    .line 59
    const-string v4, "invoke"

    .line 60
    .line 61
    const-string v5, "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"

    .line 62
    .line 63
    move-object v2, p0

    .line 64
    invoke-direct/range {v0 .. v7}, Ljw;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 68
    .line 69
    :cond_1
    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lpx;

    .line 2
    .line 3
    check-cast p3, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lkw;->h(Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final f(Lfk;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p4

    .line 2
    check-cast v6, Lgo0;

    .line 3
    .line 4
    iget v0, p0, Lkw;->h:I

    .line 5
    .line 6
    invoke-virtual {v6, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v6}, Lkw;->m(Lpx;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x3

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0, v2}, Lxe1;->g(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    invoke-static {v0, v2}, Lxe1;->g(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :goto_0
    or-int/2addr v0, p5

    .line 31
    iget-object v2, p0, Lkw;->j:Lun0;

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    invoke-static {v3, v2}, Lxe1;->f(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v2, Lpn0;

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    move-object v3, p1

    .line 44
    move-object v4, p2

    .line 45
    move-object v5, p3

    .line 46
    invoke-interface/range {v2 .. v7}, Lpn0;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v6}, Lgo0;->r()Lb62;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    new-instance v0, Lhw;

    .line 57
    .line 58
    move-object v1, p0

    .line 59
    move-object v2, p1

    .line 60
    move-object v3, p2

    .line 61
    move-object v4, p3

    .line 62
    move v5, p5

    .line 63
    invoke-direct/range {v0 .. v5}, Lhw;-><init>(Lkw;Lfk;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 67
    .line 68
    :cond_1
    return-object v7
.end method

.method public final bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p2, p1}, Lkw;->d(ILpx;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final h(Ljava/lang/Object;Lpx;I)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    iget v0, p0, Lkw;->h:I

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lkw;->m(Lpx;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-static {v0, v1}, Lxe1;->g(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1, v1}, Lxe1;->g(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    or-int/2addr v0, p3

    .line 29
    iget-object v2, p0, Lkw;->j:Lun0;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    invoke-static {v3, v2}, Lxe1;->f(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v2, Lnn0;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v2, p1, p2, v0}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    new-instance v2, Lup;

    .line 52
    .line 53
    invoke-direct {v2, p3, v1, p0, p1}, Lup;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p2, Lb62;->d:Lmn0;

    .line 57
    .line 58
    :cond_1
    return-object v0
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object/from16 v8, p6

    .line 2
    .line 3
    check-cast v8, Lgo0;

    .line 4
    .line 5
    iget v0, p0, Lkw;->h:I

    .line 6
    .line 7
    invoke-virtual {v8, v0}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v8}, Lkw;->m(Lpx;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v8, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x6

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-static {v0, v2}, Lxe1;->g(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    invoke-static {v0, v2}, Lxe1;->g(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_0
    or-int v0, p7, v0

    .line 32
    .line 33
    iget-object v2, p0, Lkw;->j:Lun0;

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    invoke-static {v3, v2}, Lxe1;->f(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast v2, Lsn0;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    move-object v3, p1

    .line 47
    move-object v4, p2

    .line 48
    move-object v5, p3

    .line 49
    move-object v6, p4

    .line 50
    move-object v7, p5

    .line 51
    invoke-interface/range {v2 .. v9}, Lsn0;->b(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lgo0;Ljava/lang/Integer;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v8}, Lgo0;->r()Lb62;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    new-instance v0, Liw;

    .line 62
    .line 63
    move-object v1, p0

    .line 64
    move-object v2, p1

    .line 65
    move-object v3, p2

    .line 66
    move-object v4, p3

    .line 67
    move-object v5, p4

    .line 68
    move-object v6, p5

    .line 69
    move/from16 v7, p7

    .line 70
    .line 71
    invoke-direct/range {v0 .. v7}, Liw;-><init>(Lkw;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    iput-object v0, v8, Lb62;->d:Lmn0;

    .line 75
    .line 76
    :cond_1
    return-object v9
.end method

.method public final bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p4, Lpx;

    .line 2
    .line 3
    check-cast p5, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p5

    .line 9
    check-cast p1, Lfk;

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p5}, Lkw;->f(Lfk;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final l(Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    iget v0, p0, Lkw;->h:I

    .line 4
    .line 5
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lkw;->m(Lpx;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1, v1}, Lxe1;->g(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-static {v0, v1}, Lxe1;->g(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    or-int/2addr v0, p4

    .line 29
    iget-object v1, p0, Lkw;->j:Lun0;

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    invoke-static {v2, v1}, Lxe1;->f(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v1, Lon0;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v1, p1, p2, p3, v0}, Lon0;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    new-instance v1, Lva;

    .line 52
    .line 53
    invoke-direct {v1, p0, p1, p2, p4}, Lva;-><init>(Lkw;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p3, Lb62;->d:Lmn0;

    .line 57
    .line 58
    :cond_1
    return-object v0
.end method

.method public final m(Lpx;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lkw;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    check-cast p1, Lgo0;

    .line 6
    .line 7
    invoke-virtual {p1}, Lgo0;->x()Lb62;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    iget v0, p1, Lb62;->b:I

    .line 14
    .line 15
    or-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    iput v0, p1, Lb62;->b:I

    .line 18
    .line 19
    iget-object v0, p0, Lkw;->k:Lb62;

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    invoke-virtual {v0}, Lb62;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_5

    .line 28
    .line 29
    if-eq v0, p1, :cond_5

    .line 30
    .line 31
    iget-object v0, v0, Lb62;->c:Lao0;

    .line 32
    .line 33
    iget-object v1, p1, Lb62;->c:Lao0;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    iget-object v0, p0, Lkw;->l:Ljava/util/ArrayList;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lkw;->l:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_0
    if-ge v1, p0, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lb62;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2}, Lb62;->a()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    if-eq v2, p1, :cond_3

    .line 79
    .line 80
    iget-object v2, v2, Lb62;->c:Lao0;

    .line 81
    .line 82
    iget-object v3, p1, Lb62;->c:Lao0;

    .line 83
    .line 84
    invoke-static {v2, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    :goto_1
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    :goto_2
    iput-object p1, p0, Lkw;->k:Lb62;

    .line 103
    .line 104
    :cond_6
    return-void
.end method

.method public final bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p3, Lpx;

    .line 2
    .line 3
    check-cast p4, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Lkw;->l(Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
