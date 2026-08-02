.class public abstract Lag1;
.super Lgx0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Lm30;


# direct methods
.method public constructor <init>(Lm30;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lm30;->h:Lr30;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lgx0;-><init>(Lr30;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lag1;->j:Lm30;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public final d(Lz70;Lyn;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p1, Lz70;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lb42;

    .line 8
    .line 9
    iget-object v2, p0, Lag1;->j:Lm30;

    .line 10
    .line 11
    iget-object v3, v2, Lm30;->i:Lo30;

    .line 12
    .line 13
    iget-object v4, p0, Lgx0;->i:Lr30;

    .line 14
    .line 15
    invoke-virtual {v0, v4}, Lb42;->m(Lr30;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v3, v3, Lo30;->h:Lq30;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Lb42;->l(Lq30;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, p1}, Lag1;->h(Lz70;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p2}, Lyn;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Liy0;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v4, 0x20

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lm30;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {p2, v2, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lpp0;->J(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "  class_idx: "

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/4 v3, 0x2

    .line 78
    invoke-virtual {p2, v2, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lag1;->i()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v2, ":"

    .line 86
    .line 87
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p1}, Lpp0;->J(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    filled-new-array {p0, v2}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string v2, "  %-10s %s"

    .line 100
    .line 101
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p2, p0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string v2, "  name_idx:  "

    .line 113
    .line 114
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const/4 v2, 0x4

    .line 119
    invoke-virtual {p2, p0, v2}, Lyn;->c(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    :cond_0
    invoke-virtual {p2, v0}, Lyn;->k(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p1}, Lyn;->k(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public abstract h(Lz70;)I
.end method

.method public abstract i()Ljava/lang/String;
.end method
