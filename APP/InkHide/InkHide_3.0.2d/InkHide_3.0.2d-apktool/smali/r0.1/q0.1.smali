.class public final synthetic Lr0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;Lcom/lu/wxmask/ui/MainActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lr0/q0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr0/q0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput p3, p0, Lr0/q0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr0/q0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lr0/q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/q0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "it"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/16 v4, 0xe

    .line 9
    .line 10
    iget v5, p0, Lr0/q0;->a:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getAppLink()Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->getLinks()[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x0

    .line 32
    :goto_0
    check-cast v0, Lcom/lu/wxmask/ui/MainActivity;

    .line 33
    .line 34
    const-string v6, "link is null"

    .line 35
    .line 36
    if-eqz v2, :cond_6

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->getPriority()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ltz v2, :cond_6

    .line 43
    .line 44
    if-eqz v5, :cond_6

    .line 45
    .line 46
    array-length v2, v5

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-static {v5}, LN0/o;->d([Ljava/lang/Object;)LF0/c;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v7, 0x0

    .line 55
    :cond_2
    invoke-virtual {v2}, LF0/c;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    invoke-virtual {v2}, LF0/c;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v8, :cond_3

    .line 68
    .line 69
    :try_start_0
    new-instance v9, Lr0/n1;

    .line 70
    .line 71
    invoke-direct {v9, v4}, Lr0/n1;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v8, v9}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :catchall_0
    move-exception v8

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    new-instance v8, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    invoke-direct {v8, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :goto_1
    add-int/2addr v7, v3

    .line 87
    const-string v9, "open link faild"

    .line 88
    .line 89
    filled-new-array {v9, v8}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v8}, Li0/a;->d([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    if-nez v7, :cond_2

    .line 97
    .line 98
    :cond_4
    array-length v2, v5

    .line 99
    if-ne v7, v2, :cond_8

    .line 100
    .line 101
    const-string v2, "open appLink with all error"

    .line 102
    .line 103
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :try_start_1
    invoke-virtual {v1}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getLink()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    new-instance v1, Lr0/n1;

    .line 117
    .line 118
    invoke-direct {v1, v4}, Lr0/n1;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0, p1, v1}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 126
    .line 127
    invoke-direct {p1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    :catchall_1
    move-exception p1

    .line 132
    const-string v0, "try open link also error"

    .line 133
    .line 134
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    :goto_3
    :try_start_2
    invoke-virtual {v1}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getLink()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    new-instance v1, Lr0/n1;

    .line 149
    .line 150
    invoke-direct {v1, v4}, Lr0/n1;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0, p1, v1}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    invoke-direct {p1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 163
    :catchall_2
    move-exception p1

    .line 164
    const-string v0, "open link error"

    .line 165
    .line 166
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    :goto_4
    return v3

    .line 174
    :pswitch_0
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    check-cast v1, Lr0/H0;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    sget-boolean p1, Lz0/i;->a:Z

    .line 183
    .line 184
    invoke-static {}, Lz0/g;->F()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    check-cast v0, Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :goto_5
    return v3

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
