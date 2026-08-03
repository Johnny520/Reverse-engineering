.class public final Lc5/c;
.super Lc5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic i:I

.field public final j:Lb5/k;

.field public final k:Lx5/a;


# direct methods
.method public synthetic constructor <init>(ILb5/k;Lx5/a;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc5/c;->i:I

    .line 2
    .line 3
    const/4 p4, -0x1

    .line 4
    invoke-direct {p0, p1, p4}, Lc5/b;-><init>(II)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lc5/c;->k:Lx5/a;

    .line 8
    .line 9
    iput-object p2, p0, Lc5/c;->j:Lb5/k;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 4

    .line 1
    iget v0, p0, Lc5/c;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, ".local "

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc5/c;->k:Lx5/a;

    .line 12
    .line 13
    check-cast v0, Lx5/g;

    .line 14
    .line 15
    iget v1, v0, Lx5/g;->h:I

    .line 16
    .line 17
    iget-object v2, p0, Lc5/c;->j:Lb5/k;

    .line 18
    .line 19
    invoke-virtual {v2, p1, v1}, Lb5/k;->o(Le5/a;I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lx5/g;->i:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, v0, Lx5/g;->j:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, v0, Lx5/g;->k:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    :cond_0
    const-string v3, ", "

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1, v2, v0}, Lr9/e0;->s0(Le5/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :pswitch_0
    const-string v0, ".restart local "

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lc5/c;->k:Lx5/a;

    .line 50
    .line 51
    check-cast v0, Lx5/e;

    .line 52
    .line 53
    iget v1, v0, Lx5/e;->h:I

    .line 54
    .line 55
    iget-object v2, p0, Lc5/c;->j:Lb5/k;

    .line 56
    .line 57
    invoke-virtual {v2, p1, v1}, Lb5/k;->o(Le5/a;I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lx5/e;->i:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v2, v0, Lx5/e;->j:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v0, v0, Lx5/e;->k:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    :cond_2
    const-string v3, "    # "

    .line 73
    .line 74
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1, v2, v0}, Lr9/e0;->s0(Le5/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    const/4 p1, 0x1

    .line 81
    return p1

    .line 82
    :pswitch_1
    const-string v0, ".end local "

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lc5/c;->k:Lx5/a;

    .line 88
    .line 89
    check-cast v0, Lx5/b;

    .line 90
    .line 91
    iget v1, v0, Lx5/b;->h:I

    .line 92
    .line 93
    iget-object v2, p0, Lc5/c;->j:Lb5/k;

    .line 94
    .line 95
    invoke-virtual {v2, p1, v1}, Lb5/k;->o(Le5/a;I)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lx5/b;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, v0, Lx5/b;->j:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v0, v0, Lx5/b;->k:Ljava/lang/String;

    .line 103
    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    :cond_4
    const-string v3, "    # "

    .line 111
    .line 112
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1, v1, v2, v0}, Lr9/e0;->s0(Le5/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    const/4 p1, 0x1

    .line 119
    return p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
