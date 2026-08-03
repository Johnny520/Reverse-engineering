.class public final synthetic Lwb/vh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lwb/vh;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lwb/vh;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lwb/vh;->i:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/vh;->g:I

    iput-object p1, p0, Lwb/vh;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/vh;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/vh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v8

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v7

    .line 25
    :goto_0
    and-int/2addr p1, v8

    .line 26
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 v5, 0x6

    .line 33
    const/4 v6, 0x4

    .line 34
    const-string v1, "\u7248\u672c"

    .line 35
    .line 36
    iget-object v2, p0, Lwb/vh;->h:Ljava/lang/String;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-static {p1, v4, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 44
    .line 45
    .line 46
    const-string v1, "\u5bbf\u4e3b"

    .line 47
    .line 48
    iget-object v2, p0, Lwb/vh;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v4, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 54
    .line 55
    .line 56
    const/16 v5, 0x36

    .line 57
    .line 58
    const-string v1, "\u4f5c\u8005"

    .line 59
    .line 60
    const-string v2, "\u3002\u3002"

    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const/4 p2, 0x1

    .line 80
    invoke-static {p2}, Li0/r;->C(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v0, p0, Lwb/vh;->h:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v1, p0, Lwb/vh;->i:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->v4(Ljava/lang/String;Ljava/lang/String;Li0/h0;I)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 95
    .line 96
    check-cast p2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    and-int/lit8 v0, p2, 0x3

    .line 103
    .line 104
    const/4 v1, 0x2

    .line 105
    const/4 v2, 0x1

    .line 106
    if-eq v0, v1, :cond_2

    .line 107
    .line 108
    move v0, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    const/4 v0, 0x0

    .line 111
    :goto_2
    and-int/2addr p2, v2

    .line 112
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    sget-object v0, Li0/l;->a:Li0/e;

    .line 123
    .line 124
    if-ne p2, v0, :cond_3

    .line 125
    .line 126
    new-instance p2, Lk/s1;

    .line 127
    .line 128
    const/16 v0, 0x19

    .line 129
    .line 130
    invoke-direct {p2, v0}, Lk/s1;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    check-cast p2, Lfg/a;

    .line 137
    .line 138
    const/16 v0, 0x180

    .line 139
    .line 140
    iget-object v1, p0, Lwb/vh;->h:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v2, p0, Lwb/vh;->i:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v1, v2, p2, p1, v0}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 149
    .line 150
    .line 151
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 152
    .line 153
    return-object p1

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
