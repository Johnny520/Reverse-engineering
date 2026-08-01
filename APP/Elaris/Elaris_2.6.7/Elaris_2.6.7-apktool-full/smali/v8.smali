.class public final synthetic Lv8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx2;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Ljava/lang/Throwable;

.field public final synthetic f:Ljava/lang/ClassLoader;

.field public final synthetic g:Lpd;

.field public final synthetic h:Lb9;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lx2;Ljava/util/concurrent/atomic/AtomicBoolean;ZLandroid/app/Activity;Ljava/lang/Throwable;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv8;->a:Lx2;

    .line 5
    .line 6
    iput-object p2, p0, Lv8;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    iput-boolean p3, p0, Lv8;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lv8;->d:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lv8;->e:Ljava/lang/Throwable;

    .line 13
    .line 14
    iput-object p6, p0, Lv8;->f:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    iput-object p7, p0, Lv8;->g:Lpd;

    .line 17
    .line 18
    iput-object p8, p0, Lv8;->h:Lb9;

    .line 19
    .line 20
    iput-object p9, p0, Lv8;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv8;->a:Lx2;

    .line 2
    .line 3
    iget-object v0, v0, Lx2;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Dialog;

    .line 6
    .line 7
    iget-object v1, p0, Lv8;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-static {v0, v1}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lv8;->c:Z

    .line 13
    .line 14
    if-nez v0, :cond_8

    .line 15
    .line 16
    iget-object v0, p0, Lv8;->d:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-static {v0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_8

    .line 23
    .line 24
    iget-object v1, p0, Lv8;->e:Ljava/lang/Throwable;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v2, 0xa

    .line 36
    .line 37
    const/16 v3, 0x20

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v2, 0xd

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/16 v3, 0xa0

    .line 54
    .line 55
    if-le v2, v3, :cond_1

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    :goto_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "codec"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    const-string v2, "decode"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_7

    .line 83
    .line 84
    const-string v2, "encode"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    const-string v2, "track"

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const-string v2, "script silk"

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    const-string v1, "\u8bed\u97f3\u8f6c\u6362\u670d\u52a1\u6682\u4e0d\u53ef\u7528"

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    const-string v2, "http 429"

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_6

    .line 119
    .line 120
    const-string v2, "http 5"

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    const-string v2, "timeout"

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_6

    .line 135
    .line 136
    const-string v2, "connect"

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_6

    .line 143
    .line 144
    const-string v2, "route to host"

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_6

    .line 151
    .line 152
    const-string v2, "unknownhost"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_4

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    const-string v2, "too large"

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    const-string v1, "\u751f\u6210\u7684\u8bed\u97f3\u8fc7\u5927"

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    const-string v1, "\u8bed\u97f3\u751f\u6210\u5931\u8d25"

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    :goto_1
    const-string v1, "\u7f51\u7edc\u6216\u8bed\u97f3\u670d\u52a1\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    :goto_2
    const-string v1, "\u5f53\u524d\u8bbe\u5907\u65e0\u6cd5\u8f6c\u6362\u8be5\u97f3\u9891"

    .line 179
    .line 180
    :goto_3
    invoke-static {v0, v1}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, Lv8;->f:Ljava/lang/ClassLoader;

    .line 184
    .line 185
    iget-object v2, p0, Lv8;->g:Lpd;

    .line 186
    .line 187
    iget-object v3, p0, Lv8;->h:Lb9;

    .line 188
    .line 189
    iget-object p0, p0, Lv8;->i:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v0, v1, v2, v3, p0}, Li5;->Q1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    return-void
.end method
