.class public final synthetic Lwb/ba;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lfg/l;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ba;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ba;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ba;->i:Lfg/l;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ba;->j:Li0/a1;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lfg/l;Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwb/ba;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ba;->i:Lfg/l;

    iput-object p2, p0, Lwb/ba;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/ba;->j:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ba;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ba;->j:Li0/a1;

    .line 9
    .line 10
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const-string v1, "\u8bf7\u5148\u9009\u62e9\u6a21\u578b"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iget-object v3, v0, Lwb/ba;->h:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, v0, Lwb/ba;->i:Lfg/l;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_0
    iget-object v1, v0, Lwb/ba;->j:Li0/a1;

    .line 50
    .line 51
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move-object v3, v2

    .line 56
    check-cast v3, Lua/i;

    .line 57
    .line 58
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lua/i;

    .line 63
    .line 64
    iget-object v2, v2, Lua/i;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    const-string v2, "\u6536\u6b3e\u6a21\u677f"

    .line 73
    .line 74
    :cond_1
    move-object v4, v2

    .line 75
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lua/i;

    .line 80
    .line 81
    iget-object v1, v1, Lua/i;->v:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v1}, Lwb/ho;->X4(Ljava/util/List;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v27

    .line 87
    const v38, -0x200003

    .line 88
    .line 89
    .line 90
    const/16 v39, 0x1

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const-wide/16 v7, 0x0

    .line 95
    .line 96
    const-wide/16 v9, 0x0

    .line 97
    .line 98
    const-wide/16 v11, 0x0

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const/4 v14, 0x0

    .line 102
    const/4 v15, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const/16 v22, 0x0

    .line 116
    .line 117
    const/16 v23, 0x0

    .line 118
    .line 119
    const/16 v24, 0x0

    .line 120
    .line 121
    const/16 v25, 0x0

    .line 122
    .line 123
    const/16 v26, 0x0

    .line 124
    .line 125
    const/16 v28, 0x0

    .line 126
    .line 127
    const/16 v29, 0x0

    .line 128
    .line 129
    const/16 v30, 0x0

    .line 130
    .line 131
    const/16 v31, 0x0

    .line 132
    .line 133
    const/16 v32, 0x0

    .line 134
    .line 135
    const/16 v33, 0x0

    .line 136
    .line 137
    const/16 v34, 0x0

    .line 138
    .line 139
    const/16 v35, 0x0

    .line 140
    .line 141
    const/16 v36, 0x0

    .line 142
    .line 143
    const/16 v37, 0x0

    .line 144
    .line 145
    invoke-static/range {v3 .. v39}, Lua/i;->a(Lua/i;Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)Lua/i;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v2, v0, Lwb/ba;->i:Lfg/l;

    .line 150
    .line 151
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v1, "\u6536\u6b3e\u6a21\u677f\u5df2\u4fdd\u5b58"

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    iget-object v3, v0, Lwb/ba;->h:Landroid/content/Context;

    .line 158
    .line 159
    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 164
    .line 165
    .line 166
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object v1

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
