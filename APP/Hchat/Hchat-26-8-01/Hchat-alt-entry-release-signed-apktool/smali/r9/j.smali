.class public final synthetic Lr9/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lgg/q;

.field public final synthetic b:Lgg/u;

.field public final synthetic c:Lr9/d0;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Lr9/f0;

.field public final synthetic f:Landroid/widget/EditText;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lgg/q;Lgg/u;Lr9/d0;Landroid/content/Context;Lr9/f0;Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/j;->a:Lgg/q;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/j;->b:Lgg/u;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/j;->c:Lr9/d0;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/j;->d:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lr9/j;->e:Lr9/f0;

    .line 13
    .line 14
    iput-object p6, p0, Lr9/j;->f:Landroid/widget/EditText;

    .line 15
    .line 16
    iput-object p7, p0, Lr9/j;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lr9/j;->h:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lr9/j;->a:Lgg/q;

    .line 2
    .line 3
    iget-boolean p1, p1, Lgg/q;->g:Z

    .line 4
    .line 5
    iget-object v0, p0, Lr9/j;->b:Lgg/u;

    .line 6
    .line 7
    const-string v1, "dialog"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    iget-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroid/app/AlertDialog;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v2

    .line 26
    :cond_1
    iget-object p1, p0, Lr9/j;->f:Landroid/widget/EditText;

    .line 27
    .line 28
    iget-object v3, p0, Lr9/j;->g:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v4, p0, Lr9/j;->h:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v5, p0, Lr9/j;->c:Lr9/d0;

    .line 33
    .line 34
    invoke-static {p1, v3, v4, v5}, Lr9/d0;->G0(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Lr9/d0;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v3, p0, Lr9/j;->e:Lr9/f0;

    .line 47
    .line 48
    iget-object v3, v3, Lr9/f0;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {v3}, Lq8/m;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v3, v2

    .line 68
    :goto_0
    if-nez v3, :cond_3

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    :cond_3
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const/4 v5, 0x0

    .line 77
    iget-object v6, p0, Lr9/j;->d:Landroid/content/Context;

    .line 78
    .line 79
    if-nez v4, :cond_b

    .line 80
    .line 81
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_4
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 90
    .line 91
    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string v7, "<img"

    .line 99
    .line 100
    invoke-static {v4, v7, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    const-string v8, "</appmsg>"

    .line 105
    .line 106
    const-string v9, "<appmsg"

    .line 107
    .line 108
    if-eqz v7, :cond_6

    .line 109
    .line 110
    invoke-static {v4, v9, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    invoke-static {v4, v8, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    const-string p1, "\u56fe\u7247 XML \u4e0d\u80fd\u76f4\u63a5\u53d1\u9001\uff0c\u8bf7\u4e0b\u8f7d\u540e\u8d70\u56fe\u7247\u53d1\u9001"

    .line 124
    .line 125
    invoke-static {v6, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    :goto_1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v4, v9, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    const/4 v10, 0x1

    .line 142
    if-eqz v9, :cond_7

    .line 143
    .line 144
    invoke-static {v4, v8, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_7

    .line 149
    .line 150
    if-eqz v7, :cond_9

    .line 151
    .line 152
    invoke-virtual {v7, v3, p1}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-ne p1, v10, :cond_9

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    invoke-static {p1}, Lr9/d0;->U(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_8

    .line 164
    .line 165
    const-string p1, "\u5f53\u524d\u53ea\u652f\u6301 AppMsg \u5361\u7247 XML \u53d1\u9001"

    .line 166
    .line 167
    invoke-static {v6, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    if-eqz v7, :cond_9

    .line 176
    .line 177
    invoke-virtual {v7, v3, p1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-ne p1, v10, :cond_9

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_9
    move v10, v5

    .line 185
    :goto_2
    if-eqz v10, :cond_a

    .line 186
    .line 187
    const-string p1, "\u5df2\u53d1\u9001"

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_a
    const-string p1, "\u53d1\u9001\u5931\u8d25"

    .line 191
    .line 192
    :goto_3
    invoke-static {v6, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 197
    .line 198
    .line 199
    move v5, v10

    .line 200
    goto :goto_5

    .line 201
    :cond_b
    :goto_4
    const-string p1, "\u53d1\u9001\u5931\u8d25\uff1a\u4f1a\u8bdd\u6216\u5185\u5bb9\u4e3a\u7a7a"

    .line 202
    .line 203
    invoke-static {v6, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 208
    .line 209
    .line 210
    :goto_5
    if-eqz v5, :cond_d

    .line 211
    .line 212
    iget-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 213
    .line 214
    if-eqz p1, :cond_c

    .line 215
    .line 216
    check-cast p1, Landroid/app/AlertDialog;

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_c
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v2

    .line 226
    :cond_d
    return-void
.end method
