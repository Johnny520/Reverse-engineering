.class public final Lq00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:J

.field public final g:I

.field public final h:Ljava/util/ArrayList;

.field public final i:Lp00;

.field public j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-wide v0, Lff;->g:J

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lq00;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/high16 p1, 0x41c00000    # 24.0f

    .line 9
    .line 10
    iput p1, p0, Lq00;->b:F

    .line 11
    .line 12
    iput p1, p0, Lq00;->c:F

    .line 13
    .line 14
    iput p1, p0, Lq00;->d:F

    .line 15
    .line 16
    iput p1, p0, Lq00;->e:F

    .line 17
    .line 18
    iput-wide v0, p0, Lq00;->f:J

    .line 19
    .line 20
    const/4 p1, 0x5

    .line 21
    iput p1, p0, Lq00;->g:I

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lq00;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Lp00;

    .line 31
    .line 32
    sget v1, Lib1;->a:I

    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v2, Lhs;->d:Lhs;

    .line 43
    .line 44
    iput-object v2, v0, Lp00;->a:Ljava/util/List;

    .line 45
    .line 46
    iput-object v1, v0, Lp00;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    iput-object v0, p0, Lq00;->i:Lp00;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static a(Lq00;Ljava/util/ArrayList;Lg31;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq00;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, Lq00;->h:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lp00;

    .line 23
    .line 24
    iget-object p0, p0, Lp00;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Llb1;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2}, Llb1;-><init>(Ljava/util/List;Lg31;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final b()Lr00;
    .locals 15

    .line 1
    iget-boolean v0, p0, Lq00;->j:Z

    .line 2
    .line 3
    const-string v1, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget-object v0, p0, Lq00;->h:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-le v2, v3, :cond_2

    .line 18
    .line 19
    iget-boolean v2, p0, Lq00;->j:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sub-int/2addr v2, v3

    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lp00;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    sub-int/2addr v4, v3

    .line 42
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lp00;

    .line 47
    .line 48
    iget-object v0, v0, Lp00;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v3, Lhb1;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v4, v2, Lp00;->a:Ljava/util/List;

    .line 56
    .line 57
    iget-object v2, v2, Lp00;->b:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v3, v4, v2}, Lhb1;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    new-instance v5, Lr00;

    .line 67
    .line 68
    new-instance v11, Lhb1;

    .line 69
    .line 70
    iget-object v0, p0, Lq00;->i:Lp00;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v1, v0, Lp00;->a:Ljava/util/List;

    .line 76
    .line 77
    iget-object v0, v0, Lp00;->b:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v11, v1, v0}, Lhb1;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    iget-wide v12, p0, Lq00;->f:J

    .line 83
    .line 84
    iget v14, p0, Lq00;->g:I

    .line 85
    .line 86
    iget-object v6, p0, Lq00;->a:Ljava/lang/String;

    .line 87
    .line 88
    iget v7, p0, Lq00;->b:F

    .line 89
    .line 90
    iget v8, p0, Lq00;->c:F

    .line 91
    .line 92
    iget v9, p0, Lq00;->d:F

    .line 93
    .line 94
    iget v10, p0, Lq00;->e:F

    .line 95
    .line 96
    invoke-direct/range {v5 .. v14}, Lr00;-><init>(Ljava/lang/String;FFFFLhb1;JI)V

    .line 97
    .line 98
    .line 99
    iput-boolean v3, p0, Lq00;->j:Z

    .line 100
    .line 101
    return-object v5
.end method
