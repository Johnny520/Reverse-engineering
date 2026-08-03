.class public final synthetic Lwb/cj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lx8/s;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILx8/s;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/cj;->g:I

    .line 2
    .line 3
    iput p1, p0, Lwb/cj;->h:I

    .line 4
    .line 5
    iput-object p2, p0, Lwb/cj;->i:Lx8/s;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/cj;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/cj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v5

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    const/16 v6, 0xf

    .line 15
    .line 16
    iget-object v0, p0, Lwb/cj;->i:Lx8/s;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static/range {v0 .. v6}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lwb/cj;->j:Li0/a1;

    .line 25
    .line 26
    iget v1, p0, Lwb/cj;->h:I

    .line 27
    .line 28
    invoke-static {v0, v1, p1}, Lwb/ho;->H(Li0/a1;ILx8/s;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    const-wide/32 v4, 0x927c0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v0 .. v5}, Lr9/e0;->s(JJJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    :goto_1
    move-wide v5, v0

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    const/4 v7, 0x0

    .line 64
    const/16 v8, 0x17

    .line 65
    .line 66
    iget-object v2, p0, Lwb/cj;->i:Lx8/s;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static/range {v2 .. v8}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, Lwb/cj;->j:Li0/a1;

    .line 75
    .line 76
    iget v1, p0, Lwb/cj;->h:I

    .line 77
    .line 78
    invoke-static {v0, v1, p1}, Lwb/ho;->H(Li0/a1;ILx8/s;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/16 p1, 0xa

    .line 89
    .line 90
    iget-object v0, p0, Lwb/cj;->i:Lx8/s;

    .line 91
    .line 92
    const-string v2, ""

    .line 93
    .line 94
    if-eq v1, p1, :cond_4

    .line 95
    .line 96
    const/16 p1, 0xb

    .line 97
    .line 98
    if-eq v1, p1, :cond_4

    .line 99
    .line 100
    const/16 p1, 0xc

    .line 101
    .line 102
    if-ne v1, p1, :cond_1

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_1
    iget p1, v0, Lx8/s;->b:I

    .line 106
    .line 107
    iget-object v3, v0, Lx8/s;->c:Ljava/lang/String;

    .line 108
    .line 109
    if-ne v1, p1, :cond_3

    .line 110
    .line 111
    :cond_2
    move-object v2, v3

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    const/16 v4, 0xd

    .line 114
    .line 115
    if-eq v1, v4, :cond_4

    .line 116
    .line 117
    if-ne p1, v4, :cond_2

    .line 118
    .line 119
    :cond_4
    :goto_3
    const/4 v5, 0x0

    .line 120
    const/16 v6, 0x19

    .line 121
    .line 122
    const-wide/16 v3, 0x0

    .line 123
    .line 124
    invoke-static/range {v0 .. v6}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, Lwb/cj;->j:Li0/a1;

    .line 129
    .line 130
    iget v1, p0, Lwb/cj;->h:I

    .line 131
    .line 132
    invoke-static {v0, v1, p1}, Lwb/ho;->H(Li0/a1;ILx8/s;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
