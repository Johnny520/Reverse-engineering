.class public final synthetic Ls0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls0/J;

.field public final synthetic d:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Ls0/J;Landroid/widget/FrameLayout;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls0/w;->b:I

    iput-object p1, p0, Ls0/w;->c:Ls0/J;

    iput-object p2, p0, Ls0/w;->d:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget p1, p0, Ls0/w;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls0/G;

    .line 7
    .line 8
    new-instance v3, Ls0/x;

    .line 9
    .line 10
    iget-object p1, p0, Ls0/w;->c:Ls0/J;

    .line 11
    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    invoke-direct {v3, p1, v1}, Ls0/x;-><init>(Ls0/J;I)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ls0/x;

    .line 18
    .line 19
    const/16 v1, 0x16

    .line 20
    .line 21
    invoke-direct {v5, p1, v1}, Ls0/x;-><init>(Ls0/J;I)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const-string v1, "\u9690\u85cf\u5bc6\u53cb\u670b\u53cb\u5708"

    .line 26
    .line 27
    const-string v2, "\u9690\u85cf\u5bc6\u53cb\u53d1\u5e03\u7684\u670b\u53cb\u5708\u5185\u5bb9"

    .line 28
    .line 29
    invoke-direct/range {v0 .. v5}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Ls0/G;

    .line 33
    .line 34
    new-instance v4, Ls0/x;

    .line 35
    .line 36
    const/16 v2, 0x17

    .line 37
    .line 38
    invoke-direct {v4, p1, v2}, Ls0/x;-><init>(Ls0/J;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Ls0/x;

    .line 42
    .line 43
    const/16 v2, 0x18

    .line 44
    .line 45
    invoke-direct {v6, p1, v2}, Ls0/x;-><init>(Ls0/J;I)V

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    const-string v2, "\u9690\u85cf\u670b\u53cb\u5708\u5206\u7ec4\u56fe\u6807"

    .line 50
    .line 51
    const-string v3, "\u9690\u85cf\u670b\u53cb\u5708\u4e2d\u7684\u5206\u7ec4/\u53ef\u89c1\u8303\u56f4\u56fe\u6807"

    .line 52
    .line 53
    invoke-direct/range {v1 .. v6}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Ls0/G;

    .line 57
    .line 58
    new-instance v5, Ls0/x;

    .line 59
    .line 60
    const/16 v3, 0x19

    .line 61
    .line 62
    invoke-direct {v5, p1, v3}, Ls0/x;-><init>(Ls0/J;I)V

    .line 63
    .line 64
    .line 65
    new-instance v7, Ls0/x;

    .line 66
    .line 67
    const/16 v3, 0x1a

    .line 68
    .line 69
    invoke-direct {v7, p1, v3}, Ls0/x;-><init>(Ls0/J;I)V

    .line 70
    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const-string v3, "\u9690\u85cf\u670b\u53cb\u5708\u70b9\u8d5e\u8bc4\u8bba"

    .line 74
    .line 75
    const-string v4, "\u9690\u85cf\u5bc6\u53cb\u5728\u670b\u53cb\u5708\u4e2d\u7684\u70b9\u8d5e\u548c\u8bc4\u8bba"

    .line 76
    .line 77
    invoke-direct/range {v2 .. v7}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Ls0/G;

    .line 81
    .line 82
    new-instance v6, Ls0/x;

    .line 83
    .line 84
    const/16 v4, 0x1b

    .line 85
    .line 86
    invoke-direct {v6, p1, v4}, Ls0/x;-><init>(Ls0/J;I)V

    .line 87
    .line 88
    .line 89
    new-instance v8, Lo0/b;

    .line 90
    .line 91
    iget-object v4, p0, Ls0/w;->d:Landroid/widget/FrameLayout;

    .line 92
    .line 93
    const/4 v5, 0x7

    .line 94
    invoke-direct {v8, p1, v4, v5}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    const-string v4, "\u9690\u85cf\u81ea\u5df1\u670b\u53cb\u5708\u5185\u5bb9"

    .line 99
    .line 100
    const-string v5, "\u6253\u5f00\u540e\u53ef\u5728\u81ea\u5df1\u7684\u670b\u53cb\u5708\u5185\u5bb9\u8be6\u60c5\u9875\u957f\u6309\u9690\u85cf"

    .line 101
    .line 102
    invoke-direct/range {v3 .. v8}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 103
    .line 104
    .line 105
    new-instance v4, Ls0/G;

    .line 106
    .line 107
    new-instance v7, Ls0/x;

    .line 108
    .line 109
    const/16 v5, 0x1c

    .line 110
    .line 111
    invoke-direct {v7, p1, v5}, Ls0/x;-><init>(Ls0/J;I)V

    .line 112
    .line 113
    .line 114
    new-instance v9, Ls0/x;

    .line 115
    .line 116
    const/16 v5, 0x1d

    .line 117
    .line 118
    invoke-direct {v9, p1, v5}, Ls0/x;-><init>(Ls0/J;I)V

    .line 119
    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const-string v5, "\u5173\u95ed\u957f\u6309\u9690\u85cf\u63d0\u793a"

    .line 123
    .line 124
    const-string v6, "\u5173\u95ed\u540e\uff0c\u957f\u6309\u4e0d\u518d\u5f39\u51fa\u9690\u85cf\u6b64\u6761\u670b\u53cb\u5708\u63d0\u793a"

    .line 125
    .line 126
    invoke-direct/range {v4 .. v9}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 127
    .line 128
    .line 129
    filled-new-array {v0, v1, v2, v3, v4}, [Ls0/G;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v1, "\u670b\u53cb\u5708\u9690\u85cf"

    .line 138
    .line 139
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_0
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 144
    .line 145
    iget-object v0, p0, Ls0/w;->d:Landroid/widget/FrameLayout;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-direct {p1, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    const-string v1, "\u8b66\u544a"

    .line 155
    .line 156
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string v1, "\u8be5\u64cd\u4f5c\u4f1a\u6e05\u7a7a\u6240\u6709\u914d\u7f6e\u6570\u636e"

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const-string v1, "\u53d6\u6d88"

    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v1, Lq0/b;

    .line 174
    .line 175
    iget-object v2, p0, Ls0/w;->c:Ls0/J;

    .line 176
    .line 177
    const/4 v3, 0x4

    .line 178
    invoke-direct {v1, v0, v2, v3}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    const-string v0, "\u786e\u5b9a"

    .line 182
    .line 183
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const-string v0, "create(...)"

    .line 192
    .line 193
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    invoke-virtual {v2, p1, v0}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
