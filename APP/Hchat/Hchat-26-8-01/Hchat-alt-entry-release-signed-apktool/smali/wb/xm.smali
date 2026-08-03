.class public final synthetic Lwb/xm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Li0/a1;Landroid/content/Context;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/xm;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/xm;->j:Lfg/l;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/xm;->h:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/xm;->i:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/xm;->k:Lfg/a;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/Context;Lfg/l;Lfg/a;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwb/xm;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/xm;->h:Li0/a1;

    iput-object p2, p0, Lwb/xm;->i:Landroid/content/Context;

    iput-object p3, p0, Lwb/xm;->j:Lfg/l;

    iput-object p4, p0, Lwb/xm;->k:Lfg/a;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/xm;->g:I

    .line 2
    .line 3
    check-cast p1, Lth/a;

    .line 4
    .line 5
    move-object v6, p2

    .line 6
    check-cast v6, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p1, p2, 0x11

    .line 21
    .line 22
    const/16 p3, 0x10

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    move p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    and-int/2addr p2, v0

    .line 31
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, Lwb/xm;->h:Li0/a1;

    .line 38
    .line 39
    invoke-virtual {v6, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, Lwb/xm;->i:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v6, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    or-int/2addr p2, v0

    .line 50
    iget-object v0, p0, Lwb/xm;->j:Lfg/l;

    .line 51
    .line 52
    invoke-virtual {v6, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    or-int/2addr p2, v1

    .line 57
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez p2, :cond_1

    .line 62
    .line 63
    sget-object p2, Li0/l;->a:Li0/e;

    .line 64
    .line 65
    if-ne v1, p2, :cond_2

    .line 66
    .line 67
    :cond_1
    new-instance v1, Lwb/ba;

    .line 68
    .line 69
    invoke-direct {v1, p3, v0, p1}, Lwb/ba;-><init>(Landroid/content/Context;Lfg/l;Li0/a1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    check-cast v1, Lfg/a;

    .line 76
    .line 77
    const/16 v7, 0x186

    .line 78
    .line 79
    const/16 v8, 0x30

    .line 80
    .line 81
    const-string v0, "\u4f7f\u7528\u6240\u9009\u6a21\u578b"

    .line 82
    .line 83
    const-string v2, "\u8fd4\u56de"

    .line 84
    .line 85
    iget-object v3, p0, Lwb/xm;->k:Lfg/a;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    and-int/lit8 p1, p2, 0x11

    .line 103
    .line 104
    const/16 p3, 0x10

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    if-eq p1, p3, :cond_4

    .line 108
    .line 109
    move p1, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const/4 p1, 0x0

    .line 112
    :goto_2
    and-int/2addr p2, v0

    .line 113
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_7

    .line 118
    .line 119
    iget-object p1, p0, Lwb/xm;->j:Lfg/l;

    .line 120
    .line 121
    invoke-virtual {v6, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    iget-object p3, p0, Lwb/xm;->h:Li0/a1;

    .line 126
    .line 127
    invoke-virtual {v6, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    or-int/2addr p2, v0

    .line 132
    iget-object v0, p0, Lwb/xm;->i:Landroid/content/Context;

    .line 133
    .line 134
    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    or-int/2addr p2, v1

    .line 139
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-nez p2, :cond_5

    .line 144
    .line 145
    sget-object p2, Li0/l;->a:Li0/e;

    .line 146
    .line 147
    if-ne v1, p2, :cond_6

    .line 148
    .line 149
    :cond_5
    new-instance v1, Lwb/ba;

    .line 150
    .line 151
    invoke-direct {v1, p1, v0, p3}, Lwb/ba;-><init>(Lfg/l;Landroid/content/Context;Li0/a1;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    check-cast v1, Lfg/a;

    .line 158
    .line 159
    const/16 v7, 0x186

    .line 160
    .line 161
    const/16 v8, 0x30

    .line 162
    .line 163
    const-string v0, "\u4fdd\u5b58\u6a21\u677f"

    .line 164
    .line 165
    const-string v2, "\u8fd4\u56de"

    .line 166
    .line 167
    iget-object v3, p0, Lwb/xm;->k:Lfg/a;

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v5, 0x0

    .line 171
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 176
    .line 177
    .line 178
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 179
    .line 180
    return-object p1

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
