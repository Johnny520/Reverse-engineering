.class public final synthetic Ls0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ls0/y;->b:I

    iput-object p2, p0, Ls0/y;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget-object p1, p0, Ls0/y;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p2, p0, Ls0/y;->b:I

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-boolean p2, Lz0/i;->a:Z

    .line 9
    .line 10
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v0, "hidden_self_sns_posts"

    .line 15
    .line 16
    invoke-interface {p2, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v1, 0x1

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string v2, "hidden_self_sns_post_summaries"

    .line 38
    .line 39
    invoke-interface {p2, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v2, "hidden_self_sns_post_images"

    .line 44
    .line 45
    invoke-interface {p2, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    const-string v0, "clearHiddenSelfSnsPosts fail"

    .line 56
    .line 57
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    move v1, p2

    .line 65
    goto :goto_3

    .line 66
    :cond_1
    new-instance v2, Ljava/io/File;

    .line 67
    .line 68
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 86
    .line 87
    .line 88
    :cond_2
    new-instance v0, LK0/h;

    .line 89
    .line 90
    invoke-direct {v0, v2}, LK0/h;-><init>(Ljava/io/File;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, LK0/f;

    .line 94
    .line 95
    invoke-direct {v2, v0}, LK0/f;-><init>(LK0/h;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    move v0, v1

    .line 99
    :goto_2
    invoke-virtual {v2}, LF0/b;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2}, LF0/b;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/io/File;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_3

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    :cond_3
    if-eqz v0, :cond_4

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const/4 v0, 0x0

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-static {}, Lz0/g;->I()V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :goto_3
    if-eqz v1, :cond_8

    .line 133
    .line 134
    check-cast p1, Li/t;

    .line 135
    .line 136
    iget-object p2, p1, Li/t;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p2, Ls0/g;

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    const-string v1, "listAdapter"

    .line 142
    .line 143
    if-eqz p2, :cond_7

    .line 144
    .line 145
    sget-object v2, LF0/s;->a:LF0/s;

    .line 146
    .line 147
    iget-object p2, p2, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 153
    .line 154
    .line 155
    iget-object p2, p1, Li/t;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Ls0/g;

    .line 158
    .line 159
    if-eqz p2, :cond_6

    .line 160
    .line 161
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Li/t;->n()V

    .line 165
    .line 166
    .line 167
    const-string p1, "\u5df2\u6e05\u7a7a"

    .line 168
    .line 169
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_7
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_8
    const-string p1, "\u6e05\u7a7a\u5931\u8d25"

    .line 182
    .line 183
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_4
    return-void

    .line 187
    :pswitch_0
    sget-boolean p2, Lz0/i;->a:Z

    .line 188
    .line 189
    check-cast p1, Ls0/J;

    .line 190
    .line 191
    iget-object p2, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 192
    .line 193
    invoke-static {p2}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ls0/J;->G()V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_1
    check-cast p1, Ls0/J;

    .line 201
    .line 202
    invoke-virtual {p1}, Ls0/J;->G()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
