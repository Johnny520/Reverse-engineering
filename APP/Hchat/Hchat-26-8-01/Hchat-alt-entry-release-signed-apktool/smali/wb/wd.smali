.class public final synthetic Lwb/wd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lh/Hchat/hooks/api/model/ContactLabelBean;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lh/Hchat/hooks/api/model/ContactLabelBean;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/wd;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/wd;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/wd;->i:Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/wd;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/wd;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp/u;

    .line 7
    .line 8
    move-object v4, p2

    .line 9
    check-cast v4, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

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
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, Lwb/wd;->i:Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 38
    .line 39
    iget-object p1, p1, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const-string p2, " \u4eba"

    .line 46
    .line 47
    invoke-static {p1, p2}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object p1, p0, Lwb/wd;->j:Li0/a1;

    .line 52
    .line 53
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/util/Set;

    .line 58
    .line 59
    iget-object v0, p0, Lwb/wd;->h:Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {v4, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-nez p2, :cond_1

    .line 74
    .line 75
    sget-object p2, Li0/l;->a:Li0/e;

    .line 76
    .line 77
    if-ne p3, p2, :cond_2

    .line 78
    .line 79
    :cond_1
    new-instance p3, Lwb/bh;

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-direct {p3, v0, p1, p2}, Lwb/bh;-><init>(Ljava/lang/String;Li0/a1;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    move-object v3, p3

    .line 89
    check-cast v3, Lfg/a;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-static/range {v0 .. v5}, Lwb/ho;->y(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_0
    check-cast p1, Lr/d;

    .line 103
    .line 104
    check-cast p2, Li0/h0;

    .line 105
    .line 106
    check-cast p3, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    and-int/lit8 p1, p3, 0x11

    .line 116
    .line 117
    const/16 v0, 0x10

    .line 118
    .line 119
    const/4 v1, 0x1

    .line 120
    if-eq p1, v0, :cond_4

    .line 121
    .line 122
    move p1, v1

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    const/4 p1, 0x0

    .line 125
    :goto_2
    and-int/2addr p3, v1

    .line 126
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 133
    .line 134
    const/high16 p3, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-static {p1, p3}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/16 p3, 0xc

    .line 141
    .line 142
    int-to-float p3, p3

    .line 143
    const/4 v0, 0x3

    .line 144
    int-to-float v0, v0

    .line 145
    invoke-static {p1, p3, v0}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const/16 p3, 0xe

    .line 150
    .line 151
    int-to-float p3, p3

    .line 152
    new-instance v0, Lwb/wd;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    iget-object v2, p0, Lwb/wd;->h:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v3, p0, Lwb/wd;->i:Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 158
    .line 159
    iget-object v4, p0, Lwb/wd;->j:Li0/a1;

    .line 160
    .line 161
    invoke-direct {v0, v2, v3, v4, v1}, Lwb/wd;-><init>(Ljava/lang/String;Lh/Hchat/hooks/api/model/ContactLabelBean;Li0/a1;I)V

    .line 162
    .line 163
    .line 164
    const v1, -0x481a9b7d

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v0, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/16 v1, 0x6036

    .line 172
    .line 173
    invoke-static {p1, p3, v0, p2, v1}, Lsh/s;->c(Ly0/o;FLs0/d;Li0/h0;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 178
    .line 179
    .line 180
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 181
    .line 182
    return-object p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
