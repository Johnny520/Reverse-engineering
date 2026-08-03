.class public final synthetic Lwb/ij;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lna/h;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lna/h;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/ij;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ij;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ij;->i:Lna/h;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/ij;->g:I

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
    move-result v6

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    const/16 v7, 0xf

    .line 15
    .line 16
    iget-object v0, p0, Lwb/ij;->i:Lna/h;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static/range {v0 .. v7}, Lna/h;->a(Lna/h;Ljava/lang/String;ILjava/lang/String;JZI)Lna/h;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lwb/ij;->h:Lfg/l;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    const-wide/32 v4, 0x927c0

    .line 51
    .line 52
    .line 53
    invoke-static/range {v0 .. v5}, Lr9/e0;->s(JJJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    :goto_1
    move-wide v6, v0

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    const-wide/16 v0, 0x0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    const/4 v8, 0x0

    .line 63
    const/16 v9, 0x17

    .line 64
    .line 65
    iget-object v2, p0, Lwb/ij;->i:Lna/h;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-static/range {v2 .. v9}, Lna/h;->a(Lna/h;Ljava/lang/String;ILjava/lang/String;JZI)Lna/h;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, Lwb/ij;->h:Lfg/l;

    .line 75
    .line 76
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_1
    move-object v3, p1

    .line 81
    check-cast v3, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    const/16 v7, 0x1b

    .line 88
    .line 89
    iget-object v0, p0, Lwb/ij;->i:Lna/h;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    const/4 v2, 0x0

    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    invoke-static/range {v0 .. v7}, Lna/h;->a(Lna/h;Ljava/lang/String;ILjava/lang/String;JZI)Lna/h;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object v0, p0, Lwb/ij;->h:Lfg/l;

    .line 100
    .line 101
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    iget-object v0, p0, Lwb/ij;->i:Lna/h;

    .line 112
    .line 113
    iget p1, v0, Lna/h;->b:I

    .line 114
    .line 115
    if-ne v2, p1, :cond_1

    .line 116
    .line 117
    iget-object p1, v0, Lna/h;->c:Ljava/lang/String;

    .line 118
    .line 119
    :goto_3
    move-object v3, p1

    .line 120
    goto :goto_4

    .line 121
    :cond_1
    invoke-static {v2}, Lwb/ho;->K6(I)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_2

    .line 126
    .line 127
    const-string p1, "\u8c22\u8c22\u8001\u677f"

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_2
    const/16 p1, 0x8

    .line 131
    .line 132
    if-ne v2, p1, :cond_3

    .line 133
    .line 134
    const-string p1, "<msg><appmsg appid=\"\" sdkver=\"0\"><title>\u8c22\u8c22\u8001\u677f</title></appmsg></msg>"

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    const-string p1, ""

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :goto_4
    const/4 v6, 0x0

    .line 141
    const/16 v7, 0x19

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    invoke-static/range {v0 .. v7}, Lna/h;->a(Lna/h;Ljava/lang/String;ILjava/lang/String;JZI)Lna/h;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v0, p0, Lwb/ij;->h:Lfg/l;

    .line 151
    .line 152
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
