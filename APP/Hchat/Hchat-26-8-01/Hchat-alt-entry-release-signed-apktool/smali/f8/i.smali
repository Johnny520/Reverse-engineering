.class public abstract Lf8/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static a:Lm1/f;


# direct methods
.method public static final A0(JFLu2/c;)F
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lu2/o;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x100000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lu2/p;->a(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {p3}, Lu2/c;->q0()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    float-to-double v0, v0

    .line 21
    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmpl-double v0, v0, v2

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p3, p2}, Lu2/c;->e0(F)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p0, p1}, Lu2/o;->c(J)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v0, v1}, Lu2/o;->c(J)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    div-float/2addr p0, p1

    .line 43
    :goto_0
    mul-float/2addr p0, p2

    .line 44
    return p0

    .line 45
    :cond_0
    invoke-interface {p3, p0, p1}, Lu2/c;->O0(J)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_1
    const-wide v2, 0x200000000L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Lu2/p;->a(JJ)Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    invoke-static {p0, p1}, Lu2/o;->c(J)F

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 67
    .line 68
    return p0
.end method

.method public static final B(J)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/high16 v2, 0x40000000    # 2.0f

    .line 11
    .line 12
    div-float/2addr v1, v2

    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v3

    .line 19
    long-to-int p0, p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    div-float/2addr p0, v2

    .line 25
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long v1, p1

    .line 30
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-long p0, p0

    .line 35
    shl-long v0, v1, v0

    .line 36
    .line 37
    and-long/2addr p0, v3

    .line 38
    or-long/2addr p0, v0

    .line 39
    return-wide p0
.end method

.method public static B0(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Le8/b;->a:Le8/b;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1, p2, p3}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p3, "cache.key"

    .line 14
    .line 15
    :try_start_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, ""

    .line 20
    .line 21
    invoke-interface {p0, p3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    return-void
.end method

.method public static C(Lud/j;)I
    .locals 2

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p0, Lud/h;

    .line 7
    .line 8
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_9

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lud/p;

    .line 27
    .line 28
    iget v0, v0, Lnd/r;->i:I

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    instance-of v0, p0, Lyd/a;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    check-cast p0, Lyd/a;

    .line 38
    .line 39
    invoke-virtual {p0}, Lyd/a;->H()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_2
    instance-of v0, p0, Lud/i;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    check-cast p0, Lud/i;

    .line 49
    .line 50
    invoke-interface {p0}, Lud/i;->i()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lud/j;

    .line 76
    .line 77
    invoke-static {v0}, Lf8/i;->C(Lud/j;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    return v0

    .line 84
    :cond_5
    :goto_0
    return v1

    .line 85
    :cond_6
    instance-of v0, p0, Lud/n;

    .line 86
    .line 87
    if-eqz v0, :cond_9

    .line 88
    .line 89
    check-cast p0, Lud/n;

    .line 90
    .line 91
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_7
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_9

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lud/j;

    .line 117
    .line 118
    invoke-static {v0}, Lf8/i;->C(Lud/j;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    return v0

    .line 125
    :cond_9
    :goto_1
    return v1
.end method

.method public static final C0(Landroid/text/Spannable;JII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x10

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 8
    .line 9
    invoke-static {p1, p2}, Lf1/c0;->w(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/16 p1, 0x21

    .line 17
    .line 18
    invoke-interface {p0, v0, p3, p4, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static D(Lud/j;)Lud/h;
    .locals 2

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Lud/i;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    instance-of v0, p0, Lud/n;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    check-cast p0, Lud/n;

    .line 19
    .line 20
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lud/j;

    .line 42
    .line 43
    invoke-static {p0}, Lf8/i;->D(Lud/j;)Lud/h;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_3
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static final D0(Landroid/text/Spannable;JLu2/c;II)V
    .locals 6

    .line 1
    invoke-static {p1, p2}, Lu2/o;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x100000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lu2/p;->a(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v3, 0x21

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    .line 19
    .line 20
    invoke-interface {p3, p1, p2}, Lu2/c;->O0(J)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Lig/a;->X(F)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-wide v4, 0x200000000L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v4, v5}, Lu2/p;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lu2/o;->c(J)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, p3, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public static E(Lud/j;)Lud/p;
    .locals 2

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p0, Lud/h;

    .line 7
    .line 8
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lud/p;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Lud/i;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    instance-of v0, p0, Lud/n;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    check-cast p0, Lud/n;

    .line 42
    .line 43
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    :goto_0
    return-object v1

    .line 54
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lud/j;

    .line 65
    .line 66
    invoke-static {p0}, Lf8/i;->E(Lud/j;)Lud/p;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_4
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0
.end method

.method public static final E0(Landroid/text/Spannable;Lp2/b;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lp2/b;->g:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lp2/a;

    .line 29
    .line 30
    iget-object v1, v1, Lp2/a;->a:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    new-array p1, p1, [Ljava/util/Locale;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, [Ljava/util/Locale;

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [Ljava/util/Locale;

    .line 51
    .line 52
    new-instance v0, Landroid/os/LocaleList;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroid/text/style/LocaleSpan;

    .line 58
    .line 59
    invoke-direct {p1, v0}, Landroid/text/style/LocaleSpan;-><init>(Landroid/os/LocaleList;)V

    .line 60
    .line 61
    .line 62
    const/16 v0, 0x21

    .line 63
    .line 64
    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public static F(Lud/j;)Lxe/b;
    .locals 4

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lud/p;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lxe/b;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, Lxe/b;-><init>(Lud/h;Lud/p;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    instance-of v0, p0, Lud/i;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    check-cast p0, Lud/i;

    .line 31
    .line 32
    invoke-interface {p0}, Lud/i;->i()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lud/b;

    .line 41
    .line 42
    const/4 v2, 0x7

    .line 43
    invoke-direct {v1, v2}, Lud/b;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/stream/Stream;->count()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    const-wide/16 v2, 0x1

    .line 55
    .line 56
    cmp-long v0, v0, v2

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lud/j;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-static {v0}, Lf8/i;->F(Lud/j;)Lxe/b;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_3
    instance-of v0, p0, Lud/n;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    check-cast p0, Lud/n;

    .line 88
    .line 89
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 100
    return-object p0

    .line 101
    :cond_5
    invoke-static {p0}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lud/j;

    .line 106
    .line 107
    invoke-static {p0}, Lf8/i;->F(Lud/j;)Lxe/b;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_6
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x0

    .line 120
    return-object p0
.end method

.method public static final F0(Lm0/l0;ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/l0;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lm0/l0;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lm0/l0;->c:[Lm0/j0;

    .line 6
    .line 7
    iget p0, p0, Lm0/l0;->d:I

    .line 8
    .line 9
    add-int/lit8 p0, p0, -0x1

    .line 10
    .line 11
    aget-object p0, v2, p0

    .line 12
    .line 13
    iget p0, p0, Lm0/j0;->b:I

    .line 14
    .line 15
    sub-int/2addr v1, p0

    .line 16
    add-int/2addr v1, p1

    .line 17
    aput-object p2, v0, v1

    .line 18
    .line 19
    return-void
.end method

.method public static G(II)I
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    if-ge p1, v0, :cond_2

    .line 4
    .line 5
    sget v0, Lac/o;->A:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    :goto_0
    if-ge p0, p1, :cond_1

    .line 11
    .line 12
    shl-int/lit8 p0, p0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    const-string p0, "data size out of limit"

    .line 17
    .line 18
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static final G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lm0/l0;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lm0/l0;->c:[Lm0/j0;

    .line 4
    .line 5
    iget v2, p0, Lm0/l0;->d:I

    .line 6
    .line 7
    add-int/lit8 v2, v2, -0x1

    .line 8
    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget v1, v1, Lm0/j0;->b:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    iget-object p0, p0, Lm0/l0;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    aput-object p2, p0, p1

    .line 18
    .line 19
    add-int/2addr v0, p3

    .line 20
    aput-object p4, p0, v0

    .line 21
    .line 22
    return-void
.end method

.method public static H(Lac/o;Lac/h;)Ljava/util/LinkedHashSet;
    .locals 6

    .line 1
    iget-object v0, p0, Lac/o;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "FastKV"

    .line 4
    .line 5
    const-string v2, "No encoder for tag:"

    .line 6
    .line 7
    iget-object p1, p1, Lac/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 12
    .line 13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v5, p0, Lac/o;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v3, v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lig/a;->u(Ljava/io/File;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    aget-byte v3, p1, v3

    .line 41
    .line 42
    and-int/lit16 v3, v3, 0xff

    .line 43
    .line 44
    iget-object v4, p0, Lac/o;->h:Lac/k;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-virtual {v4, p1, v5, v3}, Lac/k;->h([BII)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object p0, p0, Lac/o;->c:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lac/s;

    .line 58
    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    add-int/2addr v3, v5

    .line 62
    array-length p0, p1

    .line 63
    sub-int/2addr p0, v3

    .line 64
    invoke-static {p1, v3, p0}, Lac/s;->a([BII)Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance p0, Ljava/lang/Exception;

    .line 72
    .line 73
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 85
    .line 86
    const-string p1, "Read object data failed"

    .line 87
    .line 88
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :goto_0
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    :goto_1
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static H0(IJ)J
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x3

    .line 4
    .line 5
    shl-long v0, p1, p0

    .line 6
    .line 7
    rsub-int/lit8 p0, p0, 0x40

    .line 8
    .line 9
    ushr-long p0, p1, p0

    .line 10
    .line 11
    or-long/2addr p0, v0

    .line 12
    return-wide p0
.end method

.method public static final I0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lsf/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lsf/f;

    .line 7
    .line 8
    iget-object p0, p0, Lsf/f;->g:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static J(Lac/o;Lac/i;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lac/o;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lac/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lac/o;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v2, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lig/a;->u(Ljava/io/File;)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    new-instance p1, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    invoke-direct {p1, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :catch_0
    move-exception p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v1

    .line 47
    :goto_0
    const-string p1, "FastKV"

    .line 48
    .line 49
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static J0(Lac/o;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lac/o;->w:I

    .line 3
    .line 4
    iget-object v0, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 5
    .line 6
    invoke-static {v0}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    invoke-static {v0}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    iput-object v0, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 18
    .line 19
    iput-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 20
    .line 21
    iput-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 22
    .line 23
    return-void
.end method

.method public static K(Lud/j;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    sget-object v0, Lpd/k;->T:Lpd/k;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/a;->v(Lud/h;Lpd/k;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    instance-of v0, p0, Lud/n;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p0, Lud/n;

    .line 19
    .line 20
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    sub-int/2addr v0, v1

    .line 36
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lud/j;

    .line 41
    .line 42
    invoke-static {p0}, Lf8/i;->K(Lud/j;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    return v1

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v0, "Unknown container type: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static final K0(JLjava/lang/String;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lj2/b;->h(JLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static L(Lud/j;Lud/j;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lud/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lud/a;

    .line 9
    .line 10
    iget-object v0, v0, Lud/a;->n:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ne v3, v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lud/a;

    .line 31
    .line 32
    iget-object v0, v0, Lud/a;->n:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    check-cast p1, Lud/h;

    .line 42
    .line 43
    invoke-static {p1, p0}, Lf8/i;->U(Lud/h;Lud/j;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_3
    instance-of v0, p1, Lud/i;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    check-cast p1, Lud/i;

    .line 53
    .line 54
    invoke-interface {p1}, Lud/i;->i()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, Lud/b;

    .line 59
    .line 60
    const/4 v0, 0x6

    .line 61
    invoke-direct {p1, v0}, Lud/b;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1}, Lbe/h;->g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_4
    instance-of v0, p1, Lud/h;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    check-cast p1, Lud/h;

    .line 74
    .line 75
    invoke-static {p1, p0}, Lf8/i;->U(Lud/h;Lud/j;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    :cond_5
    instance-of v0, p1, Lud/n;

    .line 81
    .line 82
    if-eqz v0, :cond_7

    .line 83
    .line 84
    check-cast p1, Lud/n;

    .line 85
    .line 86
    invoke-interface {p1}, Lud/n;->u()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-int/2addr v0, v2

    .line 101
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lud/j;

    .line 106
    .line 107
    invoke-static {p0, p1}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_6

    .line 112
    .line 113
    :goto_1
    return v2

    .line 114
    :cond_6
    return v1

    .line 115
    :cond_7
    invoke-static {p1}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    return p0
.end method

.method public static L0(Lac/o;Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    const-string v0, "FastKV"

    .line 2
    .line 3
    iget-object v1, p0, Lac/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1}, Lf8/i;->h0(Lac/o;Ljava/io/File;)Z

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0}, Lf8/i;->z0(Lac/o;)V

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-static {p0, p2}, Lf8/i;->h0(Lac/o;Ljava/io/File;)Z

    .line 20
    .line 21
    .line 22
    move-result p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :catch_1
    move-exception p1

    .line 27
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p0}, Lf8/i;->z0(Lac/o;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static M(Lud/j;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    invoke-static {p0}, La/a;->A(Lud/h;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p0, Lud/i;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p0, Lud/i;

    .line 17
    .line 18
    invoke-interface {p0}, Lud/i;->i()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lud/j;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-static {v0}, Lf8/i;->M(Lud/j;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    instance-of v0, p0, Lud/n;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    check-cast p0, Lud/n;

    .line 52
    .line 53
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lxe/s;->i(Ljava/util/List;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lud/j;

    .line 62
    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    invoke-static {p0}, Lf8/i;->M(Lud/j;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    :cond_3
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 74
    return p0

    .line 75
    :cond_5
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return p0
.end method

.method public static M0(Lud/j;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "Null container variable"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "Unknown container type: "

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final N(Li2/g;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Li2/g;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Li2/g;->g:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Li2/e;

    .line 24
    .line 25
    iget-object v5, v4, Li2/e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v5, v5, Li2/m;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    iget v5, v4, Li2/e;->b:I

    .line 32
    .line 33
    iget v4, v4, Li2/e;->c:I

    .line 34
    .line 35
    invoke-static {v1, v0, v5, v4}, Li2/h;->b(IIII)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return v1
.end method

.method public static N0(I)Z
    .locals 1

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static O(Lud/a;Lud/j;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lud/a;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lud/a;

    .line 9
    .line 10
    invoke-static {p0, p1}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_1
    instance-of v0, p1, Lud/h;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    return v1

    .line 21
    :cond_2
    instance-of v0, p1, Lud/n;

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    check-cast p1, Lud/n;

    .line 26
    .line 27
    invoke-interface {p1}, Lud/n;->u()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lud/j;

    .line 46
    .line 47
    invoke-static {p0, v0}, Lf8/i;->O(Lud/a;Lud/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_4
    return v1

    .line 56
    :cond_5
    invoke-static {p1}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static O0(I)Z
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static P0(I)Z
    .locals 1

    .line 1
    const v0, 0xffff

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static final Q0(JJ)J
    .locals 7

    .line 1
    invoke-static {p0, p1}, Li2/m0;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1}, Li2/m0;->e(J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p0, p1}, Li2/m0;->e(J)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    if-ge v2, v3, :cond_0

    .line 20
    .line 21
    move v2, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v4

    .line 24
    :goto_0
    invoke-static {p0, p1}, Li2/m0;->f(J)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-ge v3, v6, :cond_1

    .line 33
    .line 34
    move v3, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v3, v4

    .line 37
    :goto_1
    and-int/2addr v2, v3

    .line 38
    if-eqz v2, :cond_9

    .line 39
    .line 40
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {p0, p1}, Li2/m0;->f(J)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-gt v2, v3, :cond_2

    .line 49
    .line 50
    move v2, v5

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v2, v4

    .line 53
    :goto_2
    invoke-static {p0, p1}, Li2/m0;->e(J)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-gt v3, v6, :cond_3

    .line 62
    .line 63
    move v3, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    move v3, v4

    .line 66
    :goto_3
    and-int/2addr v2, v3

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    move v1, v0

    .line 74
    goto :goto_6

    .line 75
    :cond_4
    invoke-static {p0, p1}, Li2/m0;->f(J)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-gt v2, v3, :cond_5

    .line 84
    .line 85
    move v2, v5

    .line 86
    goto :goto_4

    .line 87
    :cond_5
    move v2, v4

    .line 88
    :goto_4
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-static {p0, p1}, Li2/m0;->e(J)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-gt v3, p0, :cond_6

    .line 97
    .line 98
    move v4, v5

    .line 99
    :cond_6
    and-int p0, v2, v4

    .line 100
    .line 101
    if-eqz p0, :cond_7

    .line 102
    .line 103
    invoke-static {p2, p3}, Li2/m0;->d(J)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    :goto_5
    sub-int/2addr v1, p0

    .line 108
    goto :goto_6

    .line 109
    :cond_7
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p2, p3}, Li2/m0;->e(J)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-ge v0, p1, :cond_8

    .line 118
    .line 119
    if-gt p0, v0, :cond_8

    .line 120
    .line 121
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {p2, p3}, Li2/m0;->d(J)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    goto :goto_6

    .line 135
    :cond_9
    invoke-static {p2, p3}, Li2/m0;->f(J)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-le v1, p0, :cond_a

    .line 140
    .line 141
    invoke-static {p2, p3}, Li2/m0;->d(J)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    sub-int/2addr v0, p0

    .line 146
    invoke-static {p2, p3}, Li2/m0;->d(J)I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    goto :goto_5

    .line 151
    :cond_a
    :goto_6
    invoke-static {v0, v1}, Li2/e0;->b(II)J

    .line 152
    .line 153
    .line 154
    move-result-wide p0

    .line 155
    return-wide p0
.end method

.method public static R(Lud/j;)I
    .locals 3

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p0, Lud/h;

    .line 7
    .line 8
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lud/p;

    .line 27
    .line 28
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 29
    .line 30
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return v1

    .line 43
    :cond_2
    instance-of v0, p0, Lud/n;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    check-cast p0, Lud/n;

    .line 48
    .line 49
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lud/j;

    .line 68
    .line 69
    invoke-static {v0}, Lf8/i;->R(Lud/j;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/2addr v1, v0

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    return v1

    .line 76
    :cond_4
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return p0
.end method

.method public static S0(Lac/o;Lac/k;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lac/o;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v1, Lac/o;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "rw"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    :try_start_0
    iget-object v7, v0, Lac/k;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v7, [B

    .line 16
    .line 17
    array-length v7, v7

    .line 18
    new-instance v8, Ljava/io/File;

    .line 19
    .line 20
    new-instance v9, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v10, ".kva"

    .line 29
    .line 30
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v9, Ljava/io/File;

    .line 41
    .line 42
    new-instance v10, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v11, ".kvb"

    .line 51
    .line 52
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-direct {v9, v3, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v8}, Lig/a;->L(Ljava/io/File;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    invoke-static {v9}, Lig/a;->L(Ljava/io/File;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 75
    .line 76
    invoke-direct {v3, v8, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 77
    .line 78
    .line 79
    int-to-long v14, v7

    .line 80
    :try_start_1
    invoke-virtual {v3, v14, v15}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    iput-object v10, v1, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 88
    .line 89
    sget-object v11, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 90
    .line 91
    const-wide/16 v12, 0x0

    .line 92
    .line 93
    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iput-object v7, v1, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 98
    .line 99
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    iget-object v7, v1, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 105
    .line 106
    iget-object v10, v0, Lac/k;->j:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v10, [B

    .line 109
    .line 110
    iget v12, v1, Lac/o;->d:I

    .line 111
    .line 112
    invoke-virtual {v7, v10, v5, v12}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    .line 115
    new-instance v7, Ljava/io/RandomAccessFile;

    .line 116
    .line 117
    invoke-direct {v7, v9, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    .line 119
    .line 120
    :try_start_2
    invoke-virtual {v7, v14, v15}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    iput-object v10, v1, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 128
    .line 129
    const-wide/16 v12, 0x0

    .line 130
    .line 131
    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iput-object v4, v1, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    iget-object v4, v1, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 141
    .line 142
    iget-object v0, v0, Lac/k;->j:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, [B

    .line 145
    .line 146
    iget v8, v1, Lac/o;->d:I

    .line 147
    .line 148
    invoke-virtual {v4, v0, v5, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 149
    .line 150
    .line 151
    const/4 v0, 0x1

    .line 152
    return v0

    .line 153
    :catch_0
    move-exception v0

    .line 154
    goto :goto_0

    .line 155
    :catch_1
    move-exception v0

    .line 156
    move-object v7, v6

    .line 157
    goto :goto_0

    .line 158
    :catch_2
    move-exception v0

    .line 159
    move-object v3, v6

    .line 160
    move-object v7, v3

    .line 161
    goto :goto_0

    .line 162
    :cond_0
    :try_start_3
    new-instance v0, Ljava/lang/Exception;

    .line 163
    .line 164
    const-string v3, "open file failed"

    .line 165
    .line 166
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 170
    :goto_0
    invoke-static {v3}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v7}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 174
    .line 175
    .line 176
    iput-object v6, v1, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 177
    .line 178
    iput-object v6, v1, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 179
    .line 180
    iput-object v6, v1, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 181
    .line 182
    iput-object v6, v1, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 183
    .line 184
    const-string v1, "FastKV"

    .line 185
    .line 186
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 187
    .line 188
    .line 189
    return v5
.end method

.method public static final T(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "Hchat_quick_terminate_config"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "quick_terminate_enable"

    .line 12
    .line 13
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static T0(Lac/o;)Z
    .locals 10

    .line 1
    const-string v0, "FastKV"

    .line 2
    .line 3
    iget-object v1, p0, Lac/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lac/o;->a:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 9
    .line 10
    new-instance v5, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v6, ".tmp"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v4}, Lig/a;->L(Ljava/io/File;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_6

    .line 35
    .line 36
    new-instance v5, Ljava/io/RandomAccessFile;

    .line 37
    .line 38
    const-string v6, "rw"

    .line 39
    .line 40
    invoke-direct {v5, v4, v6}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget v6, p0, Lac/o;->d:I

    .line 44
    .line 45
    int-to-long v6, v6

    .line 46
    invoke-virtual {v5, v6, v7}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 47
    .line 48
    .line 49
    iget-object v6, p0, Lac/o;->h:Lac/k;

    .line 50
    .line 51
    iget-object v6, v6, Lac/k;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, [B

    .line 54
    .line 55
    iget v7, p0, Lac/o;->d:I

    .line 56
    .line 57
    invoke-virtual {v5, v6, v3, v7}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    :try_start_2
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V

    .line 68
    .line 69
    .line 70
    new-instance v5, Ljava/io/File;

    .line 71
    .line 72
    new-instance v6, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v7, ".kvc"

    .line 81
    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-direct {v5, v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v6, 0x1

    .line 97
    if-eqz v2, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    :cond_1
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    :goto_0
    move v2, v6

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move v2, v3

    .line 121
    :goto_1
    if-eqz v2, :cond_5

    .line 122
    .line 123
    iget-object v2, p0, Lac/o;->k:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_4

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {}, Lac/p;->w()Ljava/util/concurrent/Executor;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    new-instance v8, La1/d;

    .line 152
    .line 153
    const/4 v9, 0x1

    .line 154
    invoke-direct {v8, p0, v9, v5}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 162
    .line 163
    .line 164
    :cond_4
    return v6

    .line 165
    :cond_5
    new-instance p0, Ljava/lang/Exception;

    .line 166
    .line 167
    const-string v2, "rename failed"

    .line 168
    .line 169
    invoke-direct {p0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 173
    .line 174
    .line 175
    return v3

    .line 176
    :catch_0
    move-exception p0

    .line 177
    goto :goto_4

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    :try_start_3
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :catchall_1
    move-exception v2

    .line 184
    :try_start_4
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :goto_3
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 188
    :cond_6
    return v3

    .line 189
    :goto_4
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    .line 191
    .line 192
    return v3
.end method

.method public static U(Lud/h;Lud/j;)Z
    .locals 2

    .line 1
    invoke-static {p0}, La/a;->c0(Lud/h;)Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 10
    .line 11
    sget-object v1, Lpd/k;->p:Lpd/k;

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    sget-object v1, Lpd/k;->r:Lpd/k;

    .line 17
    .line 18
    if-ne v0, v1, :cond_3

    .line 19
    .line 20
    sget-object v0, Lmd/b;->F:Lmd/b;

    .line 21
    .line 22
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lae/b;

    .line 29
    .line 30
    if-eqz p0, :cond_6

    .line 31
    .line 32
    iget-object p0, p0, Lae/b;->g:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lae/f;

    .line 49
    .line 50
    iget-object v0, v0, Lae/f;->c:Lud/a;

    .line 51
    .line 52
    invoke-static {v0, p1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object v1, Lpd/k;->T:Lpd/k;

    .line 60
    .line 61
    if-ne v0, v1, :cond_7

    .line 62
    .line 63
    sget-object v0, Lmd/b;->z:Lmd/b;

    .line 64
    .line 65
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lmd/c;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget-object v0, v0, Lmd/c;->h:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lnd/t;

    .line 92
    .line 93
    iget-object v1, v1, Lnd/t;->a:Lud/a;

    .line 94
    .line 95
    invoke-static {v1, p1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    sget-object v0, Lmd/b;->G:Lmd/b;

    .line 103
    .line 104
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Lnd/u;

    .line 111
    .line 112
    if-eqz p0, :cond_7

    .line 113
    .line 114
    iget-object p0, p0, Lnd/u;->g:Lnd/t;

    .line 115
    .line 116
    iget-object p0, p0, Lnd/t;->a:Lud/a;

    .line 117
    .line 118
    invoke-static {p0, p1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_7

    .line 123
    .line 124
    :cond_6
    :goto_0
    const/4 p0, 0x1

    .line 125
    return p0

    .line 126
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 127
    return p0
.end method

.method public static V(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    const/4 v3, 0x2

    .line 50
    if-ne v1, v3, :cond_0

    .line 51
    .line 52
    const-class v1, Landroid/view/MenuItem;

    .line 53
    .line 54
    aget-object v3, v0, v2

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    aget-object v0, v0, v1

    .line 64
    .line 65
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    const-string v0, "com.tencent.mm.ui.chatting.viewitems."

    .line 74
    .line 75
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_0

    .line 80
    .line 81
    return v1

    .line 82
    :cond_0
    return v2
.end method

.method public static W(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    const/4 v3, 0x3

    .line 50
    if-ne v1, v3, :cond_0

    .line 51
    .line 52
    const-class v1, Landroid/view/MenuItem;

    .line 53
    .line 54
    aget-object v3, v0, v2

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    const-class v1, Landroid/view/View;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    aget-object v4, v0, v3

    .line 66
    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    aget-object v0, v0, v1

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "android.view.ContextMenu$ContextMenuInfo"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    const-string v0, "com.tencent.mm.ui.chatting.viewitems."

    .line 89
    .line 90
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    return v3

    .line 97
    :cond_0
    return v2
.end method

.method public static Y(Lu4/p;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x2

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lu4/o;

    .line 14
    .line 15
    iget v2, v2, Lu4/o;->g:I

    .line 16
    .line 17
    move v3, v1

    .line 18
    :goto_0
    if-ge v3, v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lu4/o;

    .line 25
    .line 26
    iget v5, v4, Lu4/o;->g:I

    .line 27
    .line 28
    if-eq v5, v2, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    invoke-virtual {v4}, Lu4/o;->j()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    add-int/2addr v2, v4

    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public static Z(Lud/a;Lud/j;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-ne p1, p0, :cond_2

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p1, Lud/n;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    check-cast p1, Lud/n;

    .line 13
    .line 14
    invoke-interface {p1}, Lud/n;->u()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lud/j;

    .line 33
    .line 34
    invoke-static {p0, v0}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_3
    invoke-static {p1}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static final a(ZLt2/j;Lh0/d1;Li0/h0;I)V
    .locals 17

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    move/from16 v11, p4

    .line 8
    .line 9
    const v0, -0x50245748

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v11, 0x6

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v8, v1}, Li0/h0;->g(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x2

    .line 29
    :goto_0
    or-int/2addr v0, v11

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v0, v11

    .line 32
    :goto_1
    and-int/lit8 v3, v11, 0x30

    .line 33
    .line 34
    const/16 v4, 0x20

    .line 35
    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v8, v3}, Li0/h0;->d(I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    move v3, v4

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v3

    .line 53
    :cond_3
    and-int/lit16 v3, v11, 0x180

    .line 54
    .line 55
    if-nez v3, :cond_5

    .line 56
    .line 57
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const/16 v3, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v3, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v0, v3

    .line 69
    :cond_5
    and-int/lit16 v3, v0, 0x93

    .line 70
    .line 71
    const/16 v5, 0x92

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x1

    .line 75
    if-eq v3, v5, :cond_6

    .line 76
    .line 77
    move v3, v7

    .line 78
    goto :goto_4

    .line 79
    :cond_6
    move v3, v6

    .line 80
    :goto_4
    and-int/lit8 v5, v0, 0x1

    .line 81
    .line 82
    invoke-virtual {v8, v5, v3}, Li0/h0;->S(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_13

    .line 87
    .line 88
    and-int/lit8 v3, v0, 0xe

    .line 89
    .line 90
    if-ne v3, v2, :cond_7

    .line 91
    .line 92
    move v5, v7

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move v5, v6

    .line 95
    :goto_5
    invoke-virtual {v8, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    or-int/2addr v5, v9

    .line 100
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    sget-object v12, Li0/l;->a:Li0/e;

    .line 105
    .line 106
    if-nez v5, :cond_8

    .line 107
    .line 108
    if-ne v9, v12, :cond_9

    .line 109
    .line 110
    :cond_8
    new-instance v9, Lh0/z0;

    .line 111
    .line 112
    invoke-direct {v9, v10, v1}, Lh0/z0;-><init>(Lh0/d1;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    check-cast v9, Lw/y0;

    .line 119
    .line 120
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-ne v3, v2, :cond_a

    .line 125
    .line 126
    move v2, v7

    .line 127
    goto :goto_6

    .line 128
    :cond_a
    move v2, v6

    .line 129
    :goto_6
    or-int/2addr v2, v5

    .line 130
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    if-nez v2, :cond_b

    .line 135
    .line 136
    if-ne v3, v12, :cond_c

    .line 137
    .line 138
    :cond_b
    new-instance v3, Lh0/e1;

    .line 139
    .line 140
    invoke-direct {v3, v10, v1}, Lh0/e1;-><init>(Lh0/d1;Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_c
    check-cast v3, Lh0/l;

    .line 147
    .line 148
    invoke-virtual {v10}, Lh0/d1;->n()Ln2/s;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-wide v13, v2, Ln2/s;->b:J

    .line 153
    .line 154
    invoke-static {v13, v14}, Li2/m0;->g(J)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v1, :cond_d

    .line 159
    .line 160
    invoke-virtual {v10}, Lh0/d1;->n()Ln2/s;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iget-wide v13, v5, Ln2/s;->b:J

    .line 165
    .line 166
    shr-long v4, v13, v4

    .line 167
    .line 168
    :goto_7
    long-to-int v4, v4

    .line 169
    goto :goto_8

    .line 170
    :cond_d
    invoke-virtual {v10}, Lh0/d1;->n()Ln2/s;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    iget-wide v4, v4, Ln2/s;->b:J

    .line 175
    .line 176
    const-wide v13, 0xffffffffL

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    and-long/2addr v4, v13

    .line 182
    goto :goto_7

    .line 183
    :goto_8
    iget-object v5, v10, Lh0/d1;->d:Lw/q0;

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    if-eqz v5, :cond_10

    .line 187
    .line 188
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    if-eqz v5, :cond_10

    .line 193
    .line 194
    iget-object v5, v5, Lw/m1;->a:Li2/k0;

    .line 195
    .line 196
    if-ltz v4, :cond_10

    .line 197
    .line 198
    iget-object v14, v5, Li2/k0;->a:Li2/j0;

    .line 199
    .line 200
    iget-object v5, v5, Li2/k0;->b:Li2/o;

    .line 201
    .line 202
    iget-object v14, v14, Li2/j0;->a:Li2/g;

    .line 203
    .line 204
    iget-object v14, v14, Li2/g;->h:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    if-nez v14, :cond_e

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_e
    invoke-virtual {v5, v4}, Li2/o;->d(I)I

    .line 214
    .line 215
    .line 216
    move-result v14

    .line 217
    iget v15, v5, Li2/o;->b:I

    .line 218
    .line 219
    sub-int/2addr v15, v7

    .line 220
    move/from16 v16, v7

    .line 221
    .line 222
    iget v7, v5, Li2/o;->f:I

    .line 223
    .line 224
    add-int/lit8 v7, v7, -0x1

    .line 225
    .line 226
    invoke-static {v15, v7}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    invoke-static {v14, v7}, Ljava/lang/Math;->min(II)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-virtual {v5, v7, v6}, Li2/o;->c(IZ)I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-le v4, v6, :cond_f

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_f
    invoke-virtual {v5, v7}, Li2/o;->m(I)V

    .line 242
    .line 243
    .line 244
    iget-object v4, v5, Li2/o;->h:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v7, v4}, Li2/e0;->e(ILjava/util/List;)I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, Li2/r;

    .line 255
    .line 256
    iget-object v5, v4, Li2/r;->a:Li2/a;

    .line 257
    .line 258
    iget v4, v4, Li2/r;->d:I

    .line 259
    .line 260
    sub-int/2addr v7, v4

    .line 261
    iget-object v4, v5, Li2/a;->d:Lj2/k;

    .line 262
    .line 263
    invoke-virtual {v4, v7}, Lj2/k;->e(I)F

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    invoke-virtual {v4, v7}, Lj2/k;->g(I)F

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    sub-float v13, v5, v4

    .line 272
    .line 273
    :cond_10
    :goto_9
    move v6, v13

    .line 274
    invoke-virtual {v8, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    if-nez v4, :cond_11

    .line 283
    .line 284
    if-ne v5, v12, :cond_12

    .line 285
    .line 286
    :cond_11
    new-instance v5, Lc0/g;

    .line 287
    .line 288
    const/4 v4, 0x4

    .line 289
    invoke-direct {v5, v9, v4}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_12
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 296
    .line 297
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 298
    .line 299
    invoke-static {v4, v9, v5}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    shl-int/lit8 v0, v0, 0x3

    .line 304
    .line 305
    and-int/lit16 v9, v0, 0x3f0

    .line 306
    .line 307
    const-wide/16 v4, 0x0

    .line 308
    .line 309
    move-object v0, v3

    .line 310
    move v3, v2

    .line 311
    move-object/from16 v2, p1

    .line 312
    .line 313
    invoke-static/range {v0 .. v9}, Loh/h;->b(Lh0/l;ZLt2/j;ZJFLy0/o;Li0/h0;I)V

    .line 314
    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_13
    invoke-virtual/range {p3 .. p3}, Li0/h0;->V()V

    .line 318
    .line 319
    .line 320
    :goto_a
    invoke-virtual/range {p3 .. p3}, Li0/h0;->t()Li0/r1;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v0, :cond_14

    .line 325
    .line 326
    new-instance v2, Lh0/e;

    .line 327
    .line 328
    move-object/from16 v3, p1

    .line 329
    .line 330
    invoke-direct {v2, v1, v3, v10, v11}, Lh0/e;-><init>(ZLt2/j;Lh0/d1;I)V

    .line 331
    .line 332
    .line 333
    iput-object v2, v0, Li0/r1;->d:Lfg/p;

    .line 334
    .line 335
    :cond_14
    return-void
.end method

.method public static a0(Lud/j;Lud/n;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_1
    move-object v0, p1

    .line 10
    check-cast v0, Lxd/a;

    .line 11
    .line 12
    iget-object v0, v0, Lxd/a;->i:Lud/n;

    .line 13
    .line 14
    :goto_0
    move-object v3, v0

    .line 15
    move-object v0, p1

    .line 16
    move-object p1, v3

    .line 17
    if-eq p0, p1, :cond_8

    .line 18
    .line 19
    if-nez p1, :cond_7

    .line 20
    .line 21
    move-object p1, v0

    .line 22
    check-cast p1, Lmd/e;

    .line 23
    .line 24
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 25
    .line 26
    sget-object v1, Lmd/b;->E:Lmd/b;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lmd/f;->b(Loc/a;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_6

    .line 33
    .line 34
    if-ne p0, v0, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    instance-of p1, p0, Lud/n;

    .line 38
    .line 39
    if-eqz p1, :cond_6

    .line 40
    .line 41
    check-cast p0, Lud/n;

    .line 42
    .line 43
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lud/j;

    .line 62
    .line 63
    move-object v1, p1

    .line 64
    check-cast v1, Lmd/e;

    .line 65
    .line 66
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 67
    .line 68
    sget-object v2, Lmd/b;->D:Lmd/b;

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lae/h;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    instance-of v2, p1, Lud/n;

    .line 79
    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    iget-object v1, v1, Lae/h;->h:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lae/f;

    .line 99
    .line 100
    iget-object v2, v2, Lae/f;->e:Lxd/b;

    .line 101
    .line 102
    invoke-static {v2, v0}, Lf8/i;->a0(Lud/j;Lud/n;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    invoke-static {p1, v0}, Lf8/i;->a0(Lud/j;Lud/n;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_7
    move-object v0, p1

    .line 119
    check-cast v0, Lxd/a;

    .line 120
    .line 121
    iget-object v0, v0, Lxd/a;->i:Lud/n;

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    const/4 p0, 0x1

    .line 125
    return p0
.end method

.method public static final b(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aget-object p0, p0, v1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "com.tencent.mm.plugin.appbrand."

    .line 32
    .line 33
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    return v1
.end method

.method public static b0(IZ)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lkd/d;->b(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    :cond_0
    const/16 p1, 0x370

    .line 10
    .line 11
    const/16 v0, 0x2e

    .line 12
    .line 13
    if-ge p0, p1, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Character;->isUnicodeIdentifierPart(I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Character;->isIdentifierIgnorable(I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 p1, 0x2d

    .line 31
    .line 32
    if-ne p0, p1, :cond_3

    .line 33
    .line 34
    :cond_2
    :goto_0
    sget-object p1, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_5

    .line 41
    .line 42
    :cond_3
    if-ne p0, v0, :cond_4

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_4
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public static final c(Lf/k0;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lf/k0;->f(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    iget-object v2, p0, Lf/k0;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v2, v2, v0

    .line 17
    .line 18
    :goto_1
    if-nez v2, :cond_2

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_2
    instance-of v3, v2, Lf/l0;

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lf/l0;

    .line 27
    .line 28
    invoke-virtual {v3, p2}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    if-eq v2, p2, :cond_4

    .line 33
    .line 34
    new-instance v3, Lf/l0;

    .line 35
    .line 36
    invoke-direct {v3}, Lf/l0;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p2}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-object p2, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_2
    move-object p2, v2

    .line 48
    :goto_3
    if-eqz v1, :cond_5

    .line 49
    .line 50
    not-int v0, v0

    .line 51
    iget-object v1, p0, Lf/k0;->b:[Ljava/lang/Object;

    .line 52
    .line 53
    aput-object p1, v1, v0

    .line 54
    .line 55
    iget-object p0, p0, Lf/k0;->c:[Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p2, p0, v0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    iget-object p0, p0, Lf/k0;->c:[Ljava/lang/Object;

    .line 61
    .line 62
    aput-object p2, p0, v0

    .line 63
    .line 64
    return-void
.end method

.method public static c0(Ljava/lang/StringBuilder;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x12c

    .line 6
    .line 7
    if-lt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static d(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;Lb8/j;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_b

    .line 8
    .line 9
    :cond_0
    instance-of v0, p2, Lb8/e;

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    check-cast p2, Lb8/e;

    .line 14
    .line 15
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_4

    .line 22
    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const-string v1, ""

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-le v0, v2, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    if-le v0, v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move-object v3, v1

    .line 47
    :goto_0
    const/16 v4, 0xa

    .line 48
    .line 49
    if-ge v0, v4, :cond_4

    .line 50
    .line 51
    const/16 v0, 0x20

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_4
    :goto_1
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_5
    iget-object v0, p2, Lb8/e;->k:La2/a;

    .line 60
    .line 61
    new-instance v0, Lz7/l;

    .line 62
    .line 63
    invoke-direct {v0, p2}, Lz7/l;-><init>(Lz7/s;)V

    .line 64
    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    :goto_2
    invoke-virtual {v0}, Lz7/l;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_6

    .line 72
    .line 73
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v0}, Lz7/l;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Lb8/j;

    .line 84
    .line 85
    invoke-static {p0, p1, p2}, Lf8/i;->d(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;Lb8/j;)V

    .line 86
    .line 87
    .line 88
    move p2, v2

    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    if-le v0, v2, :cond_8

    .line 98
    .line 99
    sub-int/2addr v0, v2

    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :cond_8
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_3
    if-eqz p2, :cond_9

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_9
    :goto_4
    return-void

    .line 113
    :cond_a
    instance-of v0, p2, Lb8/f;

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    if-eqz v0, :cond_19

    .line 117
    .line 118
    check-cast p2, Lb8/f;

    .line 119
    .line 120
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_b

    .line 125
    .line 126
    goto/16 :goto_b

    .line 127
    .line 128
    :cond_b
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const/16 v2, 0x20

    .line 133
    .line 134
    const-string v3, ""

    .line 135
    .line 136
    const/4 v4, 0x1

    .line 137
    if-nez v0, :cond_c

    .line 138
    .line 139
    move-object v5, v3

    .line 140
    goto :goto_6

    .line 141
    :cond_c
    if-le v0, v4, :cond_d

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    goto :goto_5

    .line 148
    :cond_d
    move-object v5, v3

    .line 149
    :goto_5
    const/16 v6, 0xa

    .line 150
    .line 151
    if-ge v0, v6, :cond_e

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    :cond_e
    :goto_6
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const/16 v0, 0x3c

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-object v0, p2, Lb8/f;->l:Ljava/lang/String;

    .line 165
    .line 166
    if-nez v0, :cond_f

    .line 167
    .line 168
    const-string v0, "null"

    .line 169
    .line 170
    :cond_f
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    new-instance v5, Lz7/l;

    .line 174
    .line 175
    new-instance v6, Landroidx/lifecycle/x;

    .line 176
    .line 177
    const/4 v7, 0x3

    .line 178
    invoke-direct {v6, p2, v7}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v5, v6}, Lz7/l;-><init>(Lz7/s;)V

    .line 182
    .line 183
    .line 184
    :goto_7
    invoke-virtual {v5}, Lz7/l;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_10

    .line 189
    .line 190
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-nez v6, :cond_10

    .line 195
    .line 196
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, Lz7/l;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_10
    new-instance v2, Lz7/l;

    .line 208
    .line 209
    invoke-direct {v2, p2}, Lz7/l;-><init>(Lz7/s;)V

    .line 210
    .line 211
    .line 212
    move p2, v1

    .line 213
    :goto_8
    invoke-virtual {v2}, Lz7/l;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    const/16 v6, 0x3e

    .line 218
    .line 219
    if-eqz v5, :cond_14

    .line 220
    .line 221
    invoke-virtual {v2}, Lz7/l;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Lb8/j;

    .line 226
    .line 227
    if-nez v1, :cond_11

    .line 228
    .line 229
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    move p2, v4

    .line 233
    move v1, p2

    .line 234
    :cond_11
    if-eqz p2, :cond_12

    .line 235
    .line 236
    instance-of p2, v5, Lb8/h;

    .line 237
    .line 238
    :cond_12
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_13

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_13
    invoke-static {p0, p1, v5}, Lf8/i;->d(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;Lb8/j;)V

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_14
    :goto_9
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-nez v2, :cond_15

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_15
    if-le v2, v4, :cond_16

    .line 257
    .line 258
    sub-int/2addr v2, v4

    .line 259
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    :cond_16
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    :goto_a
    if-eqz v1, :cond_18

    .line 267
    .line 268
    if-nez p2, :cond_17

    .line 269
    .line 270
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    :cond_17
    const-string p0, "</"

    .line 274
    .line 275
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_18
    const-string p0, "/>"

    .line 286
    .line 287
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_19
    instance-of p0, p2, Lb8/h;

    .line 292
    .line 293
    if-eqz p0, :cond_1d

    .line 294
    .line 295
    check-cast p2, Lb8/h;

    .line 296
    .line 297
    invoke-static {p1}, Lf8/i;->c0(Ljava/lang/StringBuilder;)Z

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    if-eqz p0, :cond_1a

    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_1a
    iget-object p0, p2, Lb8/h;->h:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 307
    .line 308
    .line 309
    move-result p2

    .line 310
    rsub-int p2, p2, 0x12c

    .line 311
    .line 312
    if-gtz p2, :cond_1b

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_1b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-ge p2, v0, :cond_1c

    .line 320
    .line 321
    invoke-virtual {p0, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    const-string p2, " ..."

    .line 326
    .line 327
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    :cond_1c
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_1d
    if-eqz p2, :cond_1e

    .line 336
    .line 337
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    :cond_1e
    :goto_b
    return-void
.end method

.method public static d0(Lv4/u;I)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "#"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    instance-of v1, p0, Lv4/t;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Lv4/t;

    .line 18
    .line 19
    iget-wide v1, p0, Lv4/t;->g:J

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lv4/u;->l()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long v1, p0

    .line 27
    :goto_0
    const/4 p0, 0x4

    .line 28
    const/16 v3, 0x10

    .line 29
    .line 30
    if-eq p1, p0, :cond_5

    .line 31
    .line 32
    const/16 p0, 0x8

    .line 33
    .line 34
    if-eq p1, p0, :cond_4

    .line 35
    .line 36
    if-eq p1, v3, :cond_3

    .line 37
    .line 38
    const/16 p0, 0x20

    .line 39
    .line 40
    if-eq p1, p0, :cond_2

    .line 41
    .line 42
    const/16 p0, 0x40

    .line 43
    .line 44
    if-ne p1, p0, :cond_1

    .line 45
    .line 46
    invoke-static {v1, v2}, La/a;->Z0(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string p0, "shouldn\'t happen"

    .line 55
    .line 56
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    long-to-int p0, v1

    .line 62
    invoke-static {p0}, La/a;->Y0(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    long-to-int p0, v1

    .line 71
    invoke-static {p0}, La/a;->X0(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    long-to-int p0, v1

    .line 80
    invoke-static {p0}, La/a;->W0(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    long-to-int p0, v1

    .line 89
    and-int/lit8 p0, p0, 0xf

    .line 90
    .line 91
    invoke-static {p0, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    const/4 p1, 0x1

    .line 96
    new-array p1, p1, [C

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    aput-char p0, p1, v1

    .line 100
    .line 101
    new-instance p0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
.end method

.method public static e(Lp4/l;)Ljava/lang/String;
    .locals 6

    .line 1
    check-cast p0, Lp4/b0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp4/b0;->m()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-short v0, p0

    .line 8
    if-ne p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x2d

    .line 17
    .line 18
    aput-char v2, v0, v1

    .line 19
    .line 20
    neg-int p0, p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v2, 0x2b

    .line 23
    .line 24
    aput-char v2, v0, v1

    .line 25
    .line 26
    :goto_0
    const/4 v2, 0x4

    .line 27
    if-ge v1, v2, :cond_1

    .line 28
    .line 29
    rsub-int/lit8 v3, v1, 0x4

    .line 30
    .line 31
    and-int/lit8 v4, p0, 0xf

    .line 32
    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    aput-char v4, v0, v3

    .line 40
    .line 41
    shr-int/2addr p0, v2

    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p0}, La/a;->L0(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static e0(Lv4/u;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    instance-of v1, p0, Lv4/r;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string p0, "null"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lv4/a;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Lz4/k;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static f0(Lac/o;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "rw"

    .line 4
    .line 5
    const-string v2, "FastKV"

    .line 6
    .line 7
    new-instance v3, Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, v1, Lac/o;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v1, Lac/o;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v7, ".kva"

    .line 19
    .line 20
    invoke-static {v5, v6, v7}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Ljava/io/File;

    .line 28
    .line 29
    const-string v7, ".kvb"

    .line 30
    .line 31
    invoke-static {v6, v7}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-direct {v5, v4, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v3}, Lig/a;->L(Ljava/io/File;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    invoke-static {v5}, Lig/a;->L(Ljava/io/File;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_0
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 53
    .line 54
    invoke-direct {v4, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v7, Ljava/io/RandomAccessFile;

    .line 58
    .line 59
    invoke-direct {v7, v5, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->length()J

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, v1, Lac/o;->s:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    :try_start_1
    iget-object v12, v1, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 83
    .line 84
    sget-object v13, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    cmp-long v0, v8, v18

    .line 89
    .line 90
    if-lez v0, :cond_1

    .line 91
    .line 92
    move-wide/from16 v16, v8

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    sget v4, Lac/o;->A:I

    .line 96
    .line 97
    int-to-long v14, v4

    .line 98
    move-wide/from16 v16, v14

    .line 99
    .line 100
    :goto_0
    const-wide/16 v14, 0x0

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v17}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iput-object v4, v1, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 107
    .line 108
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 109
    .line 110
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    move-object v14, v13

    .line 114
    iget-object v13, v1, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 115
    .line 116
    cmp-long v4, v10, v18

    .line 117
    .line 118
    if-lez v4, :cond_2

    .line 119
    .line 120
    move-wide/from16 v17, v10

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    sget v12, Lac/o;->A:I

    .line 124
    .line 125
    move-object v15, v13

    .line 126
    int-to-long v12, v12

    .line 127
    move-wide/from16 v17, v12

    .line 128
    .line 129
    move-object v13, v15

    .line 130
    :goto_1
    const-wide/16 v15, 0x0

    .line 131
    .line 132
    invoke-virtual/range {v13 .. v18}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    iput-object v12, v1, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 137
    .line 138
    invoke-virtual {v12, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 139
    .line 140
    .line 141
    :try_start_2
    new-instance v3, Lac/k;

    .line 142
    .line 143
    iget-object v5, v1, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-direct {v3, v5}, Lac/k;-><init>(I)V

    .line 150
    .line 151
    .line 152
    iput-object v3, v1, Lac/o;->h:Lac/k;

    .line 153
    .line 154
    if-nez v0, :cond_3

    .line 155
    .line 156
    if-nez v4, :cond_3

    .line 157
    .line 158
    const/16 v0, 0xc

    .line 159
    .line 160
    iput v0, v1, Lac/o;->d:I

    .line 161
    .line 162
    return-void

    .line 163
    :catch_0
    move-exception v0

    .line 164
    goto :goto_3

    .line 165
    :cond_3
    invoke-static {v1, v8, v9, v10, v11}, Lf8/i;->r0(Lac/o;JJ)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catch_1
    move-exception v0

    .line 170
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, Lf8/i;->J0(Lac/o;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v3, v5}, Lf8/i;->L0(Lac/o;Ljava/io/File;Ljava/io/File;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_4
    :goto_2
    new-instance v0, Ljava/lang/Exception;

    .line 181
    .line 182
    const-string v3, "open file failed"

    .line 183
    .line 184
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 188
    .line 189
    .line 190
    invoke-static {v1}, Lf8/i;->J0(Lac/o;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :goto_3
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 195
    .line 196
    .line 197
    invoke-static {v1}, Lf8/i;->z0(Lac/o;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1}, Lf8/i;->J0(Lac/o;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public static g(Lp4/l;)Ljava/lang/String;
    .locals 1

    .line 1
    check-cast p0, Lp4/b0;

    .line 2
    .line 3
    iget-object p0, p0, Lp4/b0;->f:Lp4/f;

    .line 4
    .line 5
    invoke-virtual {p0}, Lp4/h;->e()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-char v0, p0

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, La/a;->X0(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {p0}, La/a;->Y0(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static g0(Lac/o;)Z
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lac/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lac/o;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v4, ".kvc"

    .line 13
    .line 14
    invoke-static {v2, v3, v4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/io/File;

    .line 22
    .line 23
    const-string v4, ".tmp"

    .line 24
    .line 25
    invoke-static {v3, v4}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-static {p0, v0}, Lf8/i;->h0(Lac/o;Ljava/io/File;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget v0, p0, Lac/o;->w:I

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 62
    .line 63
    invoke-static {p0, v0}, Lf8/i;->S0(Lac/o;Lac/k;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x1

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    const-string v0, "recover from c file"

    .line 71
    .line 72
    invoke-static {p0, v0}, Lg4/a;->y(Lac/o;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 73
    .line 74
    .line 75
    :try_start_1
    invoke-static {p0}, Lf8/i;->r(Lac/o;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    return v1

    .line 79
    :catch_0
    move-exception p0

    .line 80
    move v4, v1

    .line 81
    goto :goto_1

    .line 82
    :catch_1
    move-exception p0

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    :try_start_2
    iput v1, p0, Lac/o;->w:I

    .line 85
    .line 86
    return v4

    .line 87
    :cond_3
    invoke-static {p0}, Lf8/i;->z0(Lac/o;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lf8/i;->r(Lac/o;)V

    .line 91
    .line 92
    .line 93
    return v4

    .line 94
    :cond_4
    iget v0, p0, Lac/o;->w:I

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    new-instance v0, Ljava/io/File;

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v5, ".kva"

    .line 109
    .line 110
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Ljava/io/File;

    .line 121
    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v6, ".kvb"

    .line 131
    .line 132
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-direct {v2, v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    invoke-static {p0, v0, v2}, Lf8/i;->L0(Lac/o;Ljava/io/File;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 155
    .line 156
    .line 157
    :cond_5
    return v4

    .line 158
    :goto_1
    const-string v0, "FastKV"

    .line 159
    .line 160
    invoke-static {v0, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 161
    .line 162
    .line 163
    return v4
.end method

.method public static h(Ljava/util/ArrayList;Ljava/util/function/Function;)[Lud/a;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [Lud/a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Lud/a;

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    move v4, v3

    .line 18
    :cond_0
    if-eqz v4, :cond_b

    .line 19
    .line 20
    move v4, v2

    .line 21
    move v5, v3

    .line 22
    :goto_0
    if-ge v5, v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Lud/a;

    .line 29
    .line 30
    invoke-interface {p1, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_2

    .line 45
    .line 46
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    check-cast v9, Lud/a;

    .line 51
    .line 52
    iget v10, v9, Lud/a;->j:I

    .line 53
    .line 54
    aget-object v11, v1, v10

    .line 55
    .line 56
    if-eqz v11, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v10, -0x1

    .line 60
    const/4 v9, 0x0

    .line 61
    :goto_1
    if-eqz v9, :cond_a

    .line 62
    .line 63
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    :cond_3
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_8

    .line 72
    .line 73
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Lud/a;

    .line 78
    .line 79
    iget v7, v7, Lud/a;->j:I

    .line 80
    .line 81
    if-ne v7, v10, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    aget-object v8, v1, v7

    .line 85
    .line 86
    if-eqz v8, :cond_3

    .line 87
    .line 88
    iget v8, v9, Lud/a;->j:I

    .line 89
    .line 90
    :cond_5
    if-eq v7, v8, :cond_7

    .line 91
    .line 92
    :goto_3
    if-le v7, v8, :cond_6

    .line 93
    .line 94
    aget-object v7, v1, v7

    .line 95
    .line 96
    iget v7, v7, Lud/a;->j:I

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    :goto_4
    if-le v8, v7, :cond_5

    .line 100
    .line 101
    aget-object v8, v1, v8

    .line 102
    .line 103
    iget v8, v8, Lud/a;->j:I

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Lud/a;

    .line 111
    .line 112
    move-object v9, v7

    .line 113
    goto :goto_2

    .line 114
    :cond_8
    aget-object v6, v1, v5

    .line 115
    .line 116
    if-eq v6, v9, :cond_9

    .line 117
    .line 118
    aput-object v9, v1, v5

    .line 119
    .line 120
    move v4, v3

    .line 121
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_a
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const-string p1, "No immediate dominator for block: "

    .line 129
    .line 130
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 p0, 0x0

    .line 138
    return-object p0

    .line 139
    :cond_b
    return-object v1
.end method

.method public static h0(Lac/o;Ljava/io/File;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_4

    .line 11
    .line 12
    const-wide/32 v4, 0x10000000

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v4

    .line 16
    .line 17
    if-ltz v2, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    long-to-int v0, v0

    .line 21
    sget v1, Lac/o;->A:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lf8/i;->G(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v4, v2, Lac/k;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, [B

    .line 34
    .line 35
    array-length v4, v4

    .line 36
    if-ne v4, v1, :cond_1

    .line 37
    .line 38
    iput v3, v2, Lac/k;->h:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v2, Lac/k;

    .line 42
    .line 43
    new-array v1, v1, [B

    .line 44
    .line 45
    invoke-direct {v2, v1, v3}, Lac/k;-><init>([BI)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lac/o;->h:Lac/k;

    .line 49
    .line 50
    :goto_0
    iget-object v1, v2, Lac/k;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [B

    .line 53
    .line 54
    invoke-static {p1, v1, v0}, Lig/a;->U(Ljava/io/File;[BI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lac/k;->q()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-gez p1, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const v1, -0x40000001    # -1.9999999f

    .line 65
    .line 66
    .line 67
    and-int/2addr v1, p1

    .line 68
    const/high16 v4, 0x40000000    # 2.0f

    .line 69
    .line 70
    and-int/2addr p1, v4

    .line 71
    const/4 v4, 0x1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    move p1, v4

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move p1, v3

    .line 77
    :goto_1
    iget v5, v2, Lac/k;->h:I

    .line 78
    .line 79
    invoke-virtual {v2, v5}, Lac/k;->r(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    iget v7, v2, Lac/k;->h:I

    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x8

    .line 86
    .line 87
    iput v7, v2, Lac/k;->h:I

    .line 88
    .line 89
    add-int/lit8 v7, v1, 0xc

    .line 90
    .line 91
    iput v7, p0, Lac/o;->d:I

    .line 92
    .line 93
    if-ltz v1, :cond_4

    .line 94
    .line 95
    const/16 v7, 0xc

    .line 96
    .line 97
    sub-int/2addr v0, v7

    .line 98
    if-gt v1, v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v2, v7, v1}, Lac/k;->m(II)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    cmp-long v0, v5, v0

    .line 105
    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    invoke-static {p0, p1}, Lbe/h;->O(Lac/o;Z)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    iput-wide v5, p0, Lac/o;->e:J

    .line 115
    .line 116
    return v4

    .line 117
    :cond_4
    :goto_2
    return v3
.end method

.method public static i(Lac/o;)V
    .locals 3

    .line 1
    iget v0, p0, Lac/o;->w:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lf8/i;->y0(Lac/o;Ljava/nio/MappedByteBuffer;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lf8/i;->y0(Lac/o;Ljava/nio/MappedByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    invoke-static {p0}, Lf8/i;->J0(Lac/o;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-static {p0}, Lf8/i;->z0(Lac/o;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/io/File;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lac/o;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lac/o;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lig/a;->n(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static i0(II)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne v0, p0, :cond_1

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0xf

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x4

    .line 10
    .line 11
    or-int/2addr p0, p1

    .line 12
    return p0

    .line 13
    :cond_0
    const-string p0, "high out of range 0..15"

    .line 14
    .line 15
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const-string p0, "low out of range 0..15"

    .line 21
    .line 22
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static final j0(Lr8/g;Lfg/p;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "Hchat_single_message_menu_method_cache"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v3, "menu_click_v1"

    .line 22
    .line 23
    invoke-static {v1, v0, v2, v3}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-object v7, v6

    .line 47
    check-cast v7, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v7}, Lf8/i;->V(Ljava/lang/reflect/Method;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v4, Ljava/util/HashSet;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v6, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    move-object v8, v7

    .line 84
    check-cast v8, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_2

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_4

    .line 105
    .line 106
    return-object v6

    .line 107
    :cond_4
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    new-instance v4, Lch/e;

    .line 110
    .line 111
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v5, Lfh/k;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v6, "com.tencent.mm.ui.chatting.viewitems."

    .line 120
    .line 121
    const/4 v7, 0x1

    .line 122
    invoke-virtual {v5, v7, v6}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v6, "void"

    .line 126
    .line 127
    invoke-static {v5, v6}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v6, "android.view.MenuItem"

    .line 131
    .line 132
    const-string v7, "int"

    .line 133
    .line 134
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v5, v6}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string v6, "MicroMsg.ChattingItem"

    .line 142
    .line 143
    const-string v7, "context item select failed, null dataTag"

    .line 144
    .line 145
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v5, v6}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iput-object v5, v4, Lch/e;->h:Lfh/k;

    .line 153
    .line 154
    invoke-virtual {p0, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance v4, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_7

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 178
    .line 179
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v5, v2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 187
    .line 188
    .line 189
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    goto :goto_3

    .line 191
    :catchall_0
    move-exception v5

    .line 192
    :try_start_2
    new-instance v6, Lsf/f;

    .line 193
    .line 194
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    move-object v5, v6

    .line 198
    :goto_3
    nop

    .line 199
    instance-of v6, v5, Lsf/f;

    .line 200
    .line 201
    if-eqz v6, :cond_6

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    :cond_6
    check-cast v5, Ljava/lang/reflect/Method;

    .line 205
    .line 206
    if-eqz v5, :cond_5

    .line 207
    .line 208
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :catchall_1
    move-exception p0

    .line 213
    goto :goto_6

    .line 214
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_9

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    move-object v5, v4

    .line 234
    check-cast v5, Ljava/lang/reflect/Method;

    .line 235
    .line 236
    invoke-static {v5}, Lf8/i;->V(Ljava/lang/reflect/Method;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_8

    .line 241
    .line 242
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_9
    new-instance v2, Ljava/util/HashSet;

    .line 247
    .line 248
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 249
    .line 250
    .line 251
    new-instance v4, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    :cond_a
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-eqz v5, :cond_b

    .line 265
    .line 266
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    move-object v6, v5

    .line 271
    check-cast v6, Ljava/lang/reflect/Method;

    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eqz v6, :cond_a

    .line 282
    .line 283
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :goto_6
    new-instance v4, Lsf/f;

    .line 288
    .line 289
    invoke-direct {v4, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    :cond_b
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    if-eqz p0, :cond_c

    .line 297
    .line 298
    const-string v2, "\u5b9a\u4f4d\u5355\u6d88\u606f\u83dc\u5355\u70b9\u51fb\u65b9\u6cd5\u5931\u8d25"

    .line 299
    .line 300
    invoke-interface {p1, v2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    :cond_c
    instance-of p0, v4, Lsf/f;

    .line 304
    .line 305
    if-eqz p0, :cond_d

    .line 306
    .line 307
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 308
    .line 309
    :cond_d
    check-cast v4, Ljava/util/List;

    .line 310
    .line 311
    invoke-static {v1, v0, v3, v4}, Lf8/i;->B0(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 312
    .line 313
    .line 314
    return-object v4
.end method

.method public static k(II)S
    .locals 1

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    if-ne v0, p0, :cond_1

    .line 4
    .line 5
    and-int/lit16 v0, p1, 0xff

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x8

    .line 10
    .line 11
    or-int/2addr p0, p1

    .line 12
    int-to-short p0, p0

    .line 13
    return p0

    .line 14
    :cond_0
    const-string p0, "high out of range 0..255"

    .line 15
    .line 16
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    const-string p0, "low out of range 0..255"

    .line 22
    .line 23
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static final k0(Lr8/g;Lfg/p;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "Hchat_single_message_menu_method_cache"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v3, "menu_create_v1"

    .line 22
    .line 23
    invoke-static {v1, v0, v2, v3}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-object v7, v6

    .line 47
    check-cast v7, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v7}, Lf8/i;->W(Ljava/lang/reflect/Method;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v4, Ljava/util/HashSet;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v6, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    move-object v8, v7

    .line 84
    check-cast v8, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_2

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_4

    .line 105
    .line 106
    return-object v6

    .line 107
    :cond_4
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    new-instance v4, Lch/e;

    .line 110
    .line 111
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v5, Lfh/k;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v6, "com.tencent.mm.ui.chatting.viewitems."

    .line 120
    .line 121
    const/4 v7, 0x1

    .line 122
    invoke-virtual {v5, v7, v6}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v6, "void"

    .line 126
    .line 127
    invoke-static {v5, v6}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 v6, 0x3

    .line 131
    invoke-virtual {v5, v6}, Lfh/k;->m0(I)V

    .line 132
    .line 133
    .line 134
    const-string v6, "MicroMsg.ChattingItem"

    .line 135
    .line 136
    const-string v7, "msg is null!"

    .line 137
    .line 138
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v5, v6}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iput-object v5, v4, Lch/e;->h:Lfh/k;

    .line 146
    .line 147
    invoke-virtual {p0, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    new-instance v4, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_7

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 171
    .line 172
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-virtual {v5, v2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    goto :goto_3

    .line 184
    :catchall_0
    move-exception v5

    .line 185
    :try_start_2
    new-instance v6, Lsf/f;

    .line 186
    .line 187
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v5, v6

    .line 191
    :goto_3
    nop

    .line 192
    instance-of v6, v5, Lsf/f;

    .line 193
    .line 194
    if-eqz v6, :cond_6

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    :cond_6
    check-cast v5, Ljava/lang/reflect/Method;

    .line 198
    .line 199
    if-eqz v5, :cond_5

    .line 200
    .line 201
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :catchall_1
    move-exception p0

    .line 206
    goto :goto_6

    .line 207
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object v5, v4

    .line 227
    check-cast v5, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    invoke-static {v5}, Lf8/i;->W(Ljava/lang/reflect/Method;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_8

    .line 234
    .line 235
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    new-instance v2, Ljava/util/HashSet;

    .line 240
    .line 241
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 242
    .line 243
    .line 244
    new-instance v4, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :cond_a
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_b

    .line 258
    .line 259
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    move-object v6, v5

    .line 264
    check-cast v6, Ljava/lang/reflect/Method;

    .line 265
    .line 266
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_a

    .line 275
    .line 276
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :goto_6
    new-instance v4, Lsf/f;

    .line 281
    .line 282
    invoke-direct {v4, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    :cond_b
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    if-eqz p0, :cond_c

    .line 290
    .line 291
    const-string v2, "\u5b9a\u4f4d\u5355\u6d88\u606f\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 292
    .line 293
    invoke-interface {p1, v2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    :cond_c
    instance-of p0, v4, Lsf/f;

    .line 297
    .line 298
    if-eqz p0, :cond_d

    .line 299
    .line 300
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 301
    .line 302
    :cond_d
    check-cast v4, Ljava/util/List;

    .line 303
    .line 304
    invoke-static {v1, v0, v3, v4}, Lf8/i;->B0(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    return-object v4
.end method

.method public static l(IIII)S
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne v0, p0, :cond_3

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0xf

    .line 6
    .line 7
    if-ne v0, p1, :cond_2

    .line 8
    .line 9
    and-int/lit8 v0, p2, 0xf

    .line 10
    .line 11
    if-ne v0, p2, :cond_1

    .line 12
    .line 13
    and-int/lit8 v0, p3, 0xf

    .line 14
    .line 15
    if-ne v0, p3, :cond_0

    .line 16
    .line 17
    shl-int/lit8 p1, p1, 0x4

    .line 18
    .line 19
    or-int/2addr p0, p1

    .line 20
    shl-int/lit8 p1, p2, 0x8

    .line 21
    .line 22
    or-int/2addr p0, p1

    .line 23
    shl-int/lit8 p1, p3, 0xc

    .line 24
    .line 25
    or-int/2addr p0, p1

    .line 26
    int-to-short p0, p0

    .line 27
    return p0

    .line 28
    :cond_0
    const-string p0, "n3 out of range 0..15"

    .line 29
    .line 30
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    const-string p0, "n2 out of range 0..15"

    .line 36
    .line 37
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_2
    const-string p0, "n1 out of range 0..15"

    .line 43
    .line 44
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_3
    const-string p0, "n0 out of range 0..15"

    .line 50
    .line 51
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static l0(Lwf/e;Lwf/f;)Lwf/g;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lwf/e;->getKey()Lwf/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p0, Lwf/h;->g:Lwf/h;

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public static m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "="

    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-eqz p0, :cond_4

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/16 v0, 0x3f

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {p0, v0, v2, v1}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ltz v0, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v2

    .line 36
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge v0, v1, :cond_4

    .line 41
    .line 42
    const/16 v1, 0x26

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    invoke-static {p0, v1, v0, v3}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-gez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :cond_2
    invoke-static {p0, p1, v0, v2}, Log/t;->c0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    add-int/2addr v0, p1

    .line 66
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    return-object p0

    .line 71
    :cond_3
    add-int/lit8 v0, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    :cond_4
    :goto_1
    const-string p0, ""

    .line 75
    .line 76
    return-object p0
.end method

.method public static n(Lud/r;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/a;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v1, Lud/a;->r:Ljava/util/BitSet;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lud/a;

    .line 42
    .line 43
    iget-object v3, v2, Lud/a;->m:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x2

    .line 50
    if-lt v4, v5, :cond_1

    .line 51
    .line 52
    iget-object v4, v2, Lud/a;->s:Lud/a;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lud/a;

    .line 69
    .line 70
    :goto_1
    if-eq v5, v4, :cond_2

    .line 71
    .line 72
    iget-object v6, v5, Lud/a;->r:Ljava/util/BitSet;

    .line 73
    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    new-instance v6, Ljava/util/BitSet;

    .line 77
    .line 78
    invoke-direct {v6, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object v6, v5, Lud/a;->r:Ljava/util/BitSet;

    .line 82
    .line 83
    :cond_3
    iget v7, v2, Lud/a;->j:I

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->set(I)V

    .line 86
    .line 87
    .line 88
    iget-object v5, v5, Lud/a;->s:Lud/a;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lud/a;

    .line 106
    .line 107
    iget-object v1, v0, Lud/a;->r:Ljava/util/BitSet;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    :cond_6
    sget-object v1, Lxe/g;->g:Lxe/g;

    .line 118
    .line 119
    iput-object v1, v0, Lud/a;->r:Ljava/util/BitSet;

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    return-void
.end method

.method public static n0(Lud/j;)Z
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p0, Lud/h;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    check-cast p0, Lud/h;

    .line 10
    .line 11
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lud/p;

    .line 30
    .line 31
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 32
    .line 33
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v0, p0, Lzd/c;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    instance-of v0, p0, Lud/n;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    check-cast p0, Lud/n;

    .line 52
    .line 53
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lud/j;

    .line 72
    .line 73
    invoke-static {v0}, Lf8/i;->n0(Lud/j;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    :goto_0
    return v1

    .line 80
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_6
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    return p0
.end method

.method public static o()Lf/k0;
    .locals 1

    .line 1
    sget-object v0, Lf/r0;->a:[J

    .line 2
    .line 3
    new-instance v0, Lf/k0;

    .line 4
    .line 5
    invoke-direct {v0}, Lf/k0;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static o0(I)Ljava/lang/String;
    .locals 1

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    invoke-static {p0}, La/a;->W0(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "unknown-"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_1
    const-string p0, "invoke-custom"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_2
    const-string p0, "invoke-polymorphic"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_3
    const-string p0, "fill-array-data"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_4
    const-string p0, "move-result-pseudo"

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_5
    const-string p0, "move-result"

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_6
    const-string p0, "invoke-interface"

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_7
    const-string p0, "invoke-direct"

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_8
    const-string p0, "invoke-super"

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_9
    const-string p0, "invoke-virtual"

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_a
    const-string p0, "invoke-static"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_b
    const-string p0, "put-static"

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_c
    const-string p0, "put-field"

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_d
    const-string p0, "get-static"

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_e
    const-string p0, "get-field"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_f
    const-string p0, "instance-of"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_10
    const-string p0, "check-cast"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_11
    const-string p0, "filled-new-array"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_12
    const-string p0, "new-array"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_13
    const-string p0, "new-instance"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_14
    const-string p0, "aput"

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_15
    const-string p0, "aget"

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_16
    const-string p0, "monitor-exit"

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_17
    const-string p0, "monitor-enter"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_18
    const-string p0, "throw"

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_19
    const-string p0, "array-length"

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1a
    const-string p0, "return"

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1b
    const-string p0, "to-short"

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_1c
    const-string p0, "to-char"

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1d
    const-string p0, "to-byte"

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1e
    const-string p0, "conv"

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_1f
    const-string p0, "cmpg"

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_20
    const-string p0, "cmpl"

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_21
    const-string p0, "not"

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_22
    const-string p0, "ushr"

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_23
    const-string p0, "shr"

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_24
    const-string p0, "shl"

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_25
    const-string p0, "xor"

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_26
    const-string p0, "or"

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_27
    const-string p0, "and"

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_28
    const-string p0, "neg"

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_29
    const-string p0, "rem"

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_2a
    const-string p0, "div"

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_2b
    const-string p0, "mul"

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_2c
    const-string p0, "sub"

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_2d
    const-string p0, "add"

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_2e
    const-string p0, "switch"

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_2f
    const-string p0, "if-gt"

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_30
    const-string p0, "if-le"

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_31
    const-string p0, "if-ge"

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_32
    const-string p0, "if-lt"

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_33
    const-string p0, "if-ne"

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_34
    const-string p0, "if-eq"

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_35
    const-string p0, "goto"

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_36
    const-string p0, "const"

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_37
    const-string p0, "move-exception"

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_38
    const-string p0, "move-param"

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_39
    const-string p0, "move"

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_3a
    const-string p0, "nop"

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static p(Lac/o;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0, v1}, Lf8/i;->v0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Exception;

    .line 31
    .line 32
    const-string p2, "map failed"

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string p2, "FastKV"

    .line 38
    .line 39
    iget-object p3, p0, Lac/o;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lf8/i;->J0(Lac/o;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object v1, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 49
    .line 50
    if-ne p2, v1, :cond_2

    .line 51
    .line 52
    iput-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    iput-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 56
    .line 57
    :goto_1
    move-object p2, v0

    .line 58
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p3}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {p1, p0}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static p0(Lp4/h;I)S
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lp4/h;->b:Lp4/j;

    .line 6
    .line 7
    iget p0, p0, Lp4/j;->a:I

    .line 8
    .line 9
    and-int/lit16 v0, p0, 0xff

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x8

    .line 14
    .line 15
    or-int/2addr p0, p1

    .line 16
    int-to-short p0, p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-string p0, "opcode out of range 0..255"

    .line 19
    .line 20
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    const-string p0, "arg out of range 0..255"

    .line 26
    .line 27
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public static final q(Ljava/lang/Throwable;)Lsf/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsf/f;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static q0(Lwf/e;Lwf/g;)Lwf/g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lwb/m0;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0, p0}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lwf/g;

    .line 21
    .line 22
    return-object p0
.end method

.method public static r(Lac/o;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lac/o;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lac/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v3, ".kvc"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lig/a;->n(Ljava/io/File;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/io/File;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, ".tmp"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lig/a;->n(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string v1, "FastKV"

    .line 58
    .line 59
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static r0(Lac/o;JJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 4
    .line 5
    iget-object v2, v0, Lac/o;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v3, -0x40000001    # -1.9999999f

    .line 12
    .line 13
    .line 14
    and-int v4, v1, v3

    .line 15
    .line 16
    const/high16 v5, 0x40000000    # 2.0f

    .line 17
    .line 18
    and-int/2addr v1, v5

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v7

    .line 26
    :goto_0
    iget-object v8, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    iget-object v10, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    and-int/2addr v3, v10

    .line 39
    and-int/2addr v5, v10

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v7

    .line 44
    :goto_1
    iget-object v5, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getLong()J

    .line 47
    .line 48
    .line 49
    move-result-wide v10

    .line 50
    const-string v5, "FastKV"

    .line 51
    .line 52
    const/16 v14, 0xc

    .line 53
    .line 54
    if-ltz v4, :cond_6

    .line 55
    .line 56
    const-wide/16 v15, 0xc

    .line 57
    .line 58
    int-to-long v12, v4

    .line 59
    sub-long v17, p1, v15

    .line 60
    .line 61
    cmp-long v12, v12, v17

    .line 62
    .line 63
    if-gtz v12, :cond_5

    .line 64
    .line 65
    add-int/lit8 v12, v4, 0xc

    .line 66
    .line 67
    iput v12, v0, Lac/o;->d:I

    .line 68
    .line 69
    iget-object v12, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v12}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 72
    .line 73
    .line 74
    iget-object v12, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 75
    .line 76
    iget-object v13, v0, Lac/o;->h:Lac/k;

    .line 77
    .line 78
    iget-object v13, v13, Lac/k;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v13, [B

    .line 81
    .line 82
    move-wide/from16 v17, v15

    .line 83
    .line 84
    iget v15, v0, Lac/o;->d:I

    .line 85
    .line 86
    invoke-virtual {v12, v13, v7, v15}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    iget-object v12, v0, Lac/o;->h:Lac/k;

    .line 90
    .line 91
    invoke-virtual {v12, v14, v4}, Lac/k;->m(II)J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    cmp-long v4, v8, v12

    .line 96
    .line 97
    if-nez v4, :cond_7

    .line 98
    .line 99
    invoke-static {v0, v1}, Lbe/h;->O(Lac/o;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    iput-wide v8, v0, Lac/o;->e:J

    .line 106
    .line 107
    cmp-long v1, p1, p3

    .line 108
    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    iget v1, v0, Lac/o;->d:I

    .line 112
    .line 113
    new-array v1, v1, [B

    .line 114
    .line 115
    iget-object v3, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    iget-object v3, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 121
    .line 122
    iget v4, v0, Lac/o;->d:I

    .line 123
    .line 124
    invoke-virtual {v3, v1, v7, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    iget-object v3, v0, Lac/o;->h:Lac/k;

    .line 128
    .line 129
    iget-object v3, v3, Lac/k;->j:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, [B

    .line 132
    .line 133
    :goto_2
    iget v4, v0, Lac/o;->d:I

    .line 134
    .line 135
    if-ge v7, v4, :cond_3

    .line 136
    .line 137
    aget-byte v4, v3, v7

    .line 138
    .line 139
    aget-byte v6, v1, v7

    .line 140
    .line 141
    if-eq v4, v6, :cond_2

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    return-void

    .line 148
    :cond_4
    :goto_3
    new-instance v1, Ljava/lang/Exception;

    .line 149
    .line 150
    const-string v3, "B file error"

    .line 151
    .line 152
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 159
    .line 160
    iget-object v2, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 161
    .line 162
    iget v3, v0, Lac/o;->d:I

    .line 163
    .line 164
    invoke-static {v0, v1, v2, v3}, Lf8/i;->p(Lac/o;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    move-wide/from16 v17, v15

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    const-wide/16 v17, 0xc

    .line 172
    .line 173
    :cond_7
    :goto_4
    if-ltz v3, :cond_9

    .line 174
    .line 175
    int-to-long v8, v3

    .line 176
    sub-long v12, p3, v17

    .line 177
    .line 178
    cmp-long v1, v8, v12

    .line 179
    .line 180
    if-gtz v1, :cond_9

    .line 181
    .line 182
    iget-object v1, v0, Lac/o;->f:Ljava/util/HashMap;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 185
    .line 186
    .line 187
    iput v7, v0, Lac/o;->n:I

    .line 188
    .line 189
    iget-object v1, v0, Lac/o;->o:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v1, v3, 0xc

    .line 195
    .line 196
    iput v1, v0, Lac/o;->d:I

    .line 197
    .line 198
    iget-object v1, v0, Lac/o;->h:Lac/k;

    .line 199
    .line 200
    iget-object v1, v1, Lac/k;->j:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, [B

    .line 203
    .line 204
    array-length v1, v1

    .line 205
    iget-object v4, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 206
    .line 207
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eq v1, v4, :cond_8

    .line 212
    .line 213
    new-instance v1, Lac/k;

    .line 214
    .line 215
    iget-object v4, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    invoke-direct {v1, v4}, Lac/k;-><init>(I)V

    .line 222
    .line 223
    .line 224
    iput-object v1, v0, Lac/o;->h:Lac/k;

    .line 225
    .line 226
    :cond_8
    iget-object v1, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 229
    .line 230
    .line 231
    iget-object v1, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 232
    .line 233
    iget-object v4, v0, Lac/o;->h:Lac/k;

    .line 234
    .line 235
    iget-object v4, v4, Lac/k;->j:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v4, [B

    .line 238
    .line 239
    iget v8, v0, Lac/o;->d:I

    .line 240
    .line 241
    invoke-virtual {v1, v4, v7, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 242
    .line 243
    .line 244
    iget-object v1, v0, Lac/o;->h:Lac/k;

    .line 245
    .line 246
    invoke-virtual {v1, v14, v3}, Lac/k;->m(II)J

    .line 247
    .line 248
    .line 249
    move-result-wide v3

    .line 250
    cmp-long v1, v10, v3

    .line 251
    .line 252
    if-nez v1, :cond_9

    .line 253
    .line 254
    invoke-static {v0, v6}, Lbe/h;->O(Lac/o;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_9

    .line 259
    .line 260
    new-instance v1, Ljava/lang/Exception;

    .line 261
    .line 262
    const-string v3, "A file error"

    .line 263
    .line 264
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v5, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 268
    .line 269
    .line 270
    iget-object v1, v0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 271
    .line 272
    iget-object v2, v0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 273
    .line 274
    iget v3, v0, Lac/o;->d:I

    .line 275
    .line 276
    invoke-static {v0, v1, v2, v3}, Lf8/i;->p(Lac/o;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 277
    .line 278
    .line 279
    iput-wide v10, v0, Lac/o;->e:J

    .line 280
    .line 281
    return-void

    .line 282
    :cond_9
    const-string v1, "both files error"

    .line 283
    .line 284
    invoke-static {v0, v1}, Lg4/a;->m(Lac/o;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0}, Lf8/i;->i(Lac/o;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_4

    .line 19
    .line 20
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v5, "\\u"

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v5, "0"

    .line 36
    .line 37
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/4 v8, 0x4

    .line 53
    if-gt v6, v8, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    new-instance v9, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    move v10, v1

    .line 65
    :goto_1
    rsub-int/lit8 v11, v6, 0x4

    .line 66
    .line 67
    if-ge v10, v11, :cond_1

    .line 68
    .line 69
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    add-int/lit8 v10, v10, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    :cond_3
    add-int/2addr v2, v7

    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static s0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "sendid"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lf8/i;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v0, "sendId"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lf8/i;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    return-object v0
.end method

.method public static t(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p3, v1, :cond_0

    .line 12
    .line 13
    move p3, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    :goto_0
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    move v2, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p3

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p1, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0, v1, p2, p3}, Lu2/b;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Lu2/b;->k(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lokio/a;->c()V

    .line 72
    .line 73
    .line 74
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    return-wide p0
.end method

.method public static t0(Lu4/p;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    mul-int/lit8 v2, v0, 0x5

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x2

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x7b

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-string v3, ", "

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lu4/o;

    .line 33
    .line 34
    invoke-virtual {v3}, Lu4/o;->m()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/16 p0, 0x7d

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static u(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    move p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    :goto_0
    if-ne p1, v1, :cond_1

    .line 20
    .line 21
    move v2, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p1

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p3, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p0, p1, p2, v1}, Lu2/b;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Lu2/b;->k(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lokio/a;->c()V

    .line 72
    .line 73
    .line 74
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    return-wide p0
.end method

.method public static u0(Lu4/p;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/16 v2, 0x1e

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v2, "{"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v0, v3, :cond_1

    .line 21
    .line 22
    sub-int/2addr v0, v3

    .line 23
    invoke-virtual {p0, v0}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lu4/o;

    .line 28
    .line 29
    invoke-virtual {v0}, Lu4/o;->j()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x2

    .line 34
    if-ne v4, v5, :cond_0

    .line 35
    .line 36
    iget v4, v0, Lu4/o;->g:I

    .line 37
    .line 38
    add-int/2addr v4, v3

    .line 39
    invoke-virtual {v0, v4}, Lu4/o;->o(I)Lu4/o;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_0
    invoke-virtual {p0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lu4/o;

    .line 48
    .line 49
    invoke-virtual {p0}, Lu4/o;->m()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, ".."

    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lu4/o;->m()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lu4/o;

    .line 74
    .line 75
    invoke-virtual {p0}, Lu4/o;->m()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_0
    const-string p0, "}"

    .line 83
    .line 84
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v3, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    iget v4, v0, Lg6/c;->a:I

    .line 17
    .line 18
    add-int/2addr v1, v4

    .line 19
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    move v5, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v5, v2

    .line 26
    :goto_0
    const/4 v1, 0x6

    .line 27
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v3, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    iget v4, v0, Lg6/c;->a:I

    .line 36
    .line 37
    add-int/2addr v1, v4

    .line 38
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move v6, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v6, v2

    .line 45
    :goto_1
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v3, 0x0

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget v4, v0, Lg6/c;->a:I

    .line 55
    .line 56
    add-int/2addr v1, v4

    .line 57
    invoke-virtual {v0, v1}, Lg6/c;->d(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v1, v3

    .line 63
    :goto_2
    const-string v4, ""

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    move-object v7, v4

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    move-object v7, v1

    .line 70
    :goto_3
    const/16 v1, 0xa

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v8, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    iget v9, v0, Lg6/c;->a:I

    .line 81
    .line 82
    add-int/2addr v1, v9

    .line 83
    invoke-virtual {v8, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    move v8, v1

    .line 88
    goto :goto_4

    .line 89
    :cond_4
    move v8, v2

    .line 90
    :goto_4
    const/16 v1, 0xc

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    iget v9, v0, Lg6/c;->a:I

    .line 99
    .line 100
    add-int/2addr v1, v9

    .line 101
    invoke-virtual {v0, v1}, Lg6/c;->d(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_5

    .line 106
    :cond_5
    move-object v1, v3

    .line 107
    :goto_5
    if-nez v1, :cond_6

    .line 108
    .line 109
    move-object v9, v4

    .line 110
    goto :goto_6

    .line 111
    :cond_6
    move-object v9, v1

    .line 112
    :goto_6
    const/16 v1, 0xe

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    iget-object v4, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    iget v10, v0, Lg6/c;->a:I

    .line 123
    .line 124
    add-int/2addr v1, v10

    .line 125
    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    goto :goto_7

    .line 130
    :cond_7
    move v1, v2

    .line 131
    :goto_7
    const/4 v4, -0x1

    .line 132
    if-ne v1, v4, :cond_8

    .line 133
    .line 134
    :goto_8
    move-object v10, v3

    .line 135
    goto :goto_9

    .line 136
    :cond_8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_8

    .line 141
    :goto_9
    new-instance v11, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    const/16 v1, 0x10

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_9

    .line 153
    .line 154
    invoke-virtual {v0, v3}, Lg6/c;->f(I)I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    goto :goto_a

    .line 159
    :cond_9
    move v3, v2

    .line 160
    :goto_a
    move v4, v2

    .line 161
    :goto_b
    if-ge v4, v3, :cond_b

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_a

    .line 168
    .line 169
    iget-object v13, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    invoke-virtual {v0, v12}, Lg6/c;->e(I)I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    mul-int/lit8 v14, v4, 0x4

    .line 176
    .line 177
    add-int/2addr v14, v12

    .line 178
    invoke-virtual {v13, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    goto :goto_c

    .line 183
    :cond_a
    move v12, v2

    .line 184
    :goto_c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    add-int/lit8 v4, v4, 0x1

    .line 192
    .line 193
    goto :goto_b

    .line 194
    :cond_b
    new-instance v12, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    const/16 v1, 0x12

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_c

    .line 206
    .line 207
    invoke-virtual {v0, v3}, Lg6/c;->f(I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    goto :goto_d

    .line 212
    :cond_c
    move v3, v2

    .line 213
    :goto_d
    move v4, v2

    .line 214
    :goto_e
    if-ge v4, v3, :cond_e

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-eqz v13, :cond_d

    .line 221
    .line 222
    iget-object v14, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 223
    .line 224
    invoke-virtual {v0, v13}, Lg6/c;->e(I)I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    mul-int/lit8 v15, v4, 0x4

    .line 229
    .line 230
    add-int/2addr v15, v13

    .line 231
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    goto :goto_f

    .line 236
    :cond_d
    move v13, v2

    .line 237
    :goto_f
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v13

    .line 241
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    add-int/lit8 v4, v4, 0x1

    .line 245
    .line 246
    goto :goto_e

    .line 247
    :cond_e
    new-instance v13, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    const/16 v1, 0x14

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_f

    .line 259
    .line 260
    invoke-virtual {v0, v3}, Lg6/c;->f(I)I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    goto :goto_10

    .line 265
    :cond_f
    move v3, v2

    .line 266
    :goto_10
    move v4, v2

    .line 267
    :goto_11
    if-ge v4, v3, :cond_11

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 270
    .line 271
    .line 272
    move-result v14

    .line 273
    if-eqz v14, :cond_10

    .line 274
    .line 275
    iget-object v15, v0, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    invoke-virtual {v0, v14}, Lg6/c;->e(I)I

    .line 278
    .line 279
    .line 280
    move-result v14

    .line 281
    mul-int/lit8 v16, v4, 0x4

    .line 282
    .line 283
    add-int v14, v16, v14

    .line 284
    .line 285
    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v14

    .line 289
    goto :goto_12

    .line 290
    :cond_10
    move v14, v2

    .line 291
    :goto_12
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    goto :goto_11

    .line 301
    :cond_11
    new-instance v3, Lhh/i;

    .line 302
    .line 303
    move-object/from16 v4, p0

    .line 304
    .line 305
    invoke-direct/range {v3 .. v13}, Lhh/i;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 306
    .line 307
    .line 308
    return-object v3
.end method

.method public static v0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;
    .locals 6

    .line 1
    :try_start_0
    sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    int-to-long v4, p1

    .line 6
    move-object v0, p0

    .line 7
    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :catch_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static w(Lwf/e;Lwf/f;)Lwf/e;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lwf/e;->getKey()Lwf/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static final w0(Lf/k0;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    instance-of v2, v0, Lf/l0;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    check-cast v0, Lf/l0;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lf/l0;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_1
    return p2

    .line 31
    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_3
    return v1
.end method

.method public static final x0(Lf/k0;Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lf/k0;->a:[J

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x2

    .line 5
    .line 6
    if-ltz v1, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    aget-wide v4, v0, v3

    .line 11
    .line 12
    not-long v6, v4

    .line 13
    const/4 v8, 0x7

    .line 14
    shl-long/2addr v6, v8

    .line 15
    and-long/2addr v6, v4

    .line 16
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v6, v8

    .line 22
    cmp-long v6, v6, v8

    .line 23
    .line 24
    if-eqz v6, :cond_4

    .line 25
    .line 26
    sub-int v6, v3, v1

    .line 27
    .line 28
    not-int v6, v6

    .line 29
    ushr-int/lit8 v6, v6, 0x1f

    .line 30
    .line 31
    const/16 v7, 0x8

    .line 32
    .line 33
    rsub-int/lit8 v6, v6, 0x8

    .line 34
    .line 35
    move v8, v2

    .line 36
    :goto_1
    if-ge v8, v6, :cond_3

    .line 37
    .line 38
    const-wide/16 v9, 0xff

    .line 39
    .line 40
    and-long/2addr v9, v4

    .line 41
    const-wide/16 v11, 0x80

    .line 42
    .line 43
    cmp-long v9, v9, v11

    .line 44
    .line 45
    if-gez v9, :cond_2

    .line 46
    .line 47
    shl-int/lit8 v9, v3, 0x3

    .line 48
    .line 49
    add-int/2addr v9, v8

    .line 50
    iget-object v10, p0, Lf/k0;->b:[Ljava/lang/Object;

    .line 51
    .line 52
    aget-object v10, v10, v9

    .line 53
    .line 54
    iget-object v10, p0, Lf/k0;->c:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v10, v10, v9

    .line 57
    .line 58
    instance-of v11, v10, Lf/l0;

    .line 59
    .line 60
    if-eqz v11, :cond_0

    .line 61
    .line 62
    check-cast v10, Lf/l0;

    .line 63
    .line 64
    invoke-virtual {v10, p1}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10}, Lf/l0;->g()Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    if-ne v10, p1, :cond_1

    .line 73
    .line 74
    const/4 v10, 0x1

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    move v10, v2

    .line 77
    :goto_2
    if-eqz v10, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lf/k0;->l(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_2
    shr-long/2addr v4, v7

    .line 83
    add-int/lit8 v8, v8, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-ne v6, v7, :cond_5

    .line 87
    .line 88
    :cond_4
    if-eq v3, v1, :cond_5

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return-void
.end method

.method public static y(Lud/j;Ljava/util/HashSet;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, Lud/n;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    check-cast p0, Lud/n;

    .line 16
    .line 17
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lud/j;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lf8/i;->y(Lud/j;Ljava/util/HashSet;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void

    .line 42
    :cond_2
    invoke-static {p0}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static y0(Lac/o;Ljava/nio/MappedByteBuffer;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lac/o;->A:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    :goto_0
    int-to-long v2, v1

    .line 19
    :try_start_0
    invoke-virtual {v0, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lf8/i;->v0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    :goto_1
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 31
    .line 32
    if-ne p1, v1, :cond_1

    .line 33
    .line 34
    iput-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iput-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 38
    .line 39
    :goto_2
    move-object p1, v0

    .line 40
    goto :goto_3

    .line 41
    :cond_2
    const-string p0, "Failed to truncate and remap buffer"

    .line 42
    .line 43
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :goto_3
    const/4 p0, 0x0

    .line 48
    invoke-virtual {p1, p0, p0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x4

    .line 52
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    invoke-virtual {p1, p0, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static z(Lud/h;Lud/j;)Lud/j;
    .locals 2

    .line 1
    instance-of v0, p1, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-ne p1, p0, :cond_3

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    instance-of v0, p1, Lud/n;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    check-cast p1, Lud/n;

    .line 13
    .line 14
    invoke-interface {p1}, Lud/n;->u()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lud/j;

    .line 33
    .line 34
    invoke-static {p0, v1}, Lf8/i;->z(Lud/h;Lud/j;)Lud/j;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    instance-of p0, v1, Lud/h;

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    return-object v1

    .line 46
    :cond_3
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_4
    invoke-static {p1}, Lf8/i;->M0(Lud/j;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static z0(Lac/o;)V
    .locals 6

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Lac/o;->d:I

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lac/o;->e:J

    .line 8
    .line 9
    iget-object v2, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput v2, p0, Lac/o;->n:I

    .line 16
    .line 17
    iget-object v3, p0, Lac/o;->o:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lac/o;->h:Lac/k;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    iget-object v4, v3, Lac/k;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, [B

    .line 29
    .line 30
    array-length v4, v4

    .line 31
    sget v5, Lac/o;->A:I

    .line 32
    .line 33
    if-eq v4, v5, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x4

    .line 37
    invoke-virtual {v3, v4, v0, v1}, Lac/k;->F(IJ)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    new-instance v0, Lac/k;

    .line 42
    .line 43
    sget v1, Lac/o;->A:I

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lac/k;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lac/o;->h:Lac/k;

    .line 49
    .line 50
    :goto_1
    iget-object p0, p0, Lac/o;->h:Lac/k;

    .line 51
    .line 52
    invoke-virtual {p0, v2, v2}, Lac/k;->E(II)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public abstract A(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
.end method

.method public abstract I(Ljava/lang/Class;)[Ljava/lang/String;
.end method

.method public abstract P(Lp4/l;)Ljava/lang/String;
.end method

.method public abstract Q(Lp4/l;)Ljava/lang/String;
.end method

.method public abstract R0(Lz4/d;Lp4/l;)V
.end method

.method public abstract S(Lp4/h;)Z
.end method

.method public abstract X(Ljava/lang/Class;)Z
.end method

.method public f(Lp4/b0;)Z
    .locals 0

    .line 1
    instance-of p1, p0, Lq4/b;

    .line 2
    .line 3
    return p1
.end method

.method public abstract j()I
.end method

.method public m(Lp4/h;)Ljava/util/BitSet;
    .locals 0

    .line 1
    new-instance p1, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public abstract x(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;
.end method
