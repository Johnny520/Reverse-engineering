.class public final synthetic Lwb/ib;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Lfg/a;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/ib;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ib;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ib;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ib;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ib;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ib;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/ib;->g:I

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
    iget-object v3, p0, Lwb/ib;->h:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    invoke-virtual {v6, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget-object v2, p0, Lwb/ib;->i:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v6, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    or-int/2addr p1, p2

    .line 50
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    sget-object p1, Li0/l;->a:Li0/e;

    .line 57
    .line 58
    if-ne p2, p1, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v0, Lwb/xb;

    .line 61
    .line 62
    const/4 v1, 0x3

    .line 63
    iget-object v4, p0, Lwb/ib;->k:Li0/a1;

    .line 64
    .line 65
    iget-object v5, p0, Lwb/ib;->l:Li0/a1;

    .line 66
    .line 67
    invoke-direct/range {v0 .. v5}, Lwb/xb;-><init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object p2, v0

    .line 74
    :cond_2
    move-object v1, p2

    .line 75
    check-cast v1, Lfg/a;

    .line 76
    .line 77
    const/16 v7, 0x186

    .line 78
    .line 79
    const/16 v8, 0x30

    .line 80
    .line 81
    const-string v0, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 82
    .line 83
    const-string v2, "\u8fd4\u56de"

    .line 84
    .line 85
    iget-object v3, p0, Lwb/ib;->j:Lfg/a;

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
    iget-object v3, p0, Lwb/ib;->h:Landroid/content/SharedPreferences;

    .line 120
    .line 121
    invoke-virtual {v6, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    iget-object v2, p0, Lwb/ib;->i:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {v6, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    or-int/2addr p1, p2

    .line 132
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-nez p1, :cond_5

    .line 137
    .line 138
    sget-object p1, Li0/l;->a:Li0/e;

    .line 139
    .line 140
    if-ne p2, p1, :cond_6

    .line 141
    .line 142
    :cond_5
    new-instance v0, Lwb/xb;

    .line 143
    .line 144
    const/4 v1, 0x2

    .line 145
    iget-object v4, p0, Lwb/ib;->k:Li0/a1;

    .line 146
    .line 147
    iget-object v5, p0, Lwb/ib;->l:Li0/a1;

    .line 148
    .line 149
    invoke-direct/range {v0 .. v5}, Lwb/xb;-><init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object p2, v0

    .line 156
    :cond_6
    move-object v1, p2

    .line 157
    check-cast v1, Lfg/a;

    .line 158
    .line 159
    const/16 v7, 0x186

    .line 160
    .line 161
    const/16 v8, 0x30

    .line 162
    .line 163
    const-string v0, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 164
    .line 165
    const-string v2, "\u8fd4\u56de"

    .line 166
    .line 167
    iget-object v3, p0, Lwb/ib;->j:Lfg/a;

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
