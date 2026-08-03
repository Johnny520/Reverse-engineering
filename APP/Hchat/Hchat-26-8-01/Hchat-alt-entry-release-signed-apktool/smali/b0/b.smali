.class public final synthetic Lb0/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lb0/h;

.field public final synthetic i:Ld0/d;


# direct methods
.method public synthetic constructor <init>(Lb0/h;Ld0/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb0/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/b;->h:Lb0/h;

    .line 4
    .line 5
    iput-object p2, p0, Lb0/b;->i:Ld0/d;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb0/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/b;->h:Lb0/h;

    .line 7
    .line 8
    iget-object v0, v0, Lb0/h;->c:Lfg/a;

    .line 9
    .line 10
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lv1/t;

    .line 16
    .line 17
    invoke-interface {v1}, Lv1/t;->C()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    check-cast v0, Lv1/t;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Le1/c;->e:Le1/c;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v1, p0, Lb0/b;->i:Ld0/d;

    .line 33
    .line 34
    invoke-interface {v1, v0}, Ld0/d;->w0(Lv1/t;)Le1/c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    invoke-interface {v0, v2, v3}, Lv1/t;->m0(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-virtual {v1, v2, v3}, Le1/c;->i(J)Le1/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_1
    return-object v0

    .line 49
    :pswitch_0
    iget-object v0, p0, Lb0/b;->h:Lb0/h;

    .line 50
    .line 51
    iget-object v1, v0, Lb0/h;->g:Lb0/a;

    .line 52
    .line 53
    new-instance v2, Lb0/b;

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    iget-object v4, p0, Lb0/b;->i:Ld0/d;

    .line 57
    .line 58
    invoke-direct {v2, v0, v4, v3}, Lb0/b;-><init>(Lb0/h;Ld0/d;I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lgg/u;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Lb0/h;->e:Lw0/s;

    .line 67
    .line 68
    new-instance v4, Laa/c;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-direct {v4, v3, v5, v2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const-string v2, "positioner"

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1, v4}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    check-cast v0, Le1/c;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_2
    const-string v0, "result"

    .line 87
    .line 88
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    throw v0

    .line 93
    :pswitch_1
    iget-object v0, p0, Lb0/b;->h:Lb0/h;

    .line 94
    .line 95
    iget-object v1, v0, Lb0/h;->f:Lb0/a;

    .line 96
    .line 97
    new-instance v2, Lab/a;

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    iget-object v4, p0, Lb0/b;->i:Ld0/d;

    .line 101
    .line 102
    invoke-direct {v2, v4, v3}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    new-instance v3, Lgg/u;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lb0/h;->e:Lw0/s;

    .line 111
    .line 112
    new-instance v4, Laa/c;

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    invoke-direct {v4, v3, v5, v2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const-string v2, "dataBuilder"

    .line 119
    .line 120
    invoke-virtual {v0, v2, v1, v4}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    check-cast v0, Lz/c;

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_3
    const-string v0, "result"

    .line 131
    .line 132
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    throw v0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
