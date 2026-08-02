.class public final synthetic Loz2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lt91;

.field public final synthetic i:Lgl0;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lb03;

.field public final synthetic m:Lus1;


# direct methods
.method public synthetic constructor <init>(Lt91;Lgl0;ZZLb03;Lus1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loz2;->h:Lt91;

    .line 5
    .line 6
    iput-object p2, p0, Loz2;->i:Lgl0;

    .line 7
    .line 8
    iput-boolean p3, p0, Loz2;->j:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Loz2;->k:Z

    .line 11
    .line 12
    iput-object p5, p0, Loz2;->l:Lb03;

    .line 13
    .line 14
    iput-object p6, p0, Loz2;->m:Lus1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lrs1;

    .line 2
    .line 3
    iget-object v0, p0, Loz2;->h:Lt91;

    .line 4
    .line 5
    invoke-virtual {v0}, Lt91;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Loz2;->i:Lgl0;

    .line 12
    .line 13
    invoke-static {v1}, Lgl0;->a(Lgl0;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v1, p0, Loz2;->j:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Lt91;->c:Lbt2;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast v1, Lv60;

    .line 26
    .line 27
    invoke-virtual {v1}, Lv60;->b()V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lt91;->b()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    iget-boolean v1, p0, Loz2;->k:Z

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Lt91;->a()Ltr0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, Ltr0;->i:Ltr0;

    .line 45
    .line 46
    if-eq v1, v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lt91;->d()Lz03;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-wide v2, p1, Lrs1;->a:J

    .line 55
    .line 56
    iget-object p1, v0, Lt91;->d:Lsz0;

    .line 57
    .line 58
    iget-object v4, v0, Lt91;->v:Ln10;

    .line 59
    .line 60
    const/4 v5, 0x1

    .line 61
    invoke-virtual {v1, v2, v3, v5}, Lz03;->b(JZ)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iget-object p0, p0, Loz2;->m:Lus1;

    .line 66
    .line 67
    invoke-interface {p0, v1}, Lus1;->n(I)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    iget-object p1, p1, Lsz0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lk03;

    .line 74
    .line 75
    invoke-static {p0, p0}, Lfg1;->i(II)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    const/4 p0, 0x5

    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-static {p1, v3, v1, v2, p0}, Lk03;->a(Lk03;Lsd;JI)Lk03;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v4, p0}, Ln10;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-object p0, v0, Lt91;->a:Liz2;

    .line 89
    .line 90
    iget-object p0, p0, Liz2;->a:Lsd;

    .line 91
    .line 92
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-lez p0, :cond_3

    .line 99
    .line 100
    sget-object p0, Ltr0;->j:Ltr0;

    .line 101
    .line 102
    iget-object p1, v0, Lt91;->k:Lnx1;

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    iget-object p0, p0, Loz2;->l:Lb03;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lb03;->g(Lrs1;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 114
    .line 115
    return-object p0
.end method
