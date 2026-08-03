.class public final synthetic Lob/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Leb/i0;


# instance fields
.field public final synthetic a:Lob/n;


# direct methods
.method public synthetic constructor <init>(Lob/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lob/e;->a:Lob/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lob/e;->a:Lob/n;

    .line 5
    .line 6
    iget-object v1, v0, Lob/n;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Lob/n;->i()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Lq8/m;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-nez v2, :cond_2

    .line 28
    .line 29
    const-string v2, ""

    .line 30
    .line 31
    :cond_2
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v4, "#tts"

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const-string v6, "#tts e"

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    if-nez v5, :cond_6

    .line 66
    .line 67
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lob/j;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-virtual {v0, v1}, Lob/n;->j(Lob/j;)Lob/k;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :try_start_0
    iget-object v3, v0, Lob/n;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 94
    .line 95
    new-instance v4, Lb9/c;

    .line 96
    .line 97
    invoke-direct {v4, v0, v1, p1, v2}, Lb9/c;-><init>(Lob/n;Lob/k;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    return v7

    .line 104
    :catch_0
    sget-object v1, Leb/m0;->a:Leb/m0;

    .line 105
    .line 106
    invoke-static {v2, p1}, Leb/m0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string p1, "\u5f85\u5904\u7406\u8bed\u97f3\u8fc7\u591a\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return v7

    .line 115
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 116
    return p1

    .line 117
    :cond_6
    :goto_2
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    const-string p1, "\u5f53\u524d\u804a\u5929\u4e0d\u53ef\u7528"

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return v7

    .line 129
    :cond_7
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    sget-object v5, Lob/j;->h:Lob/j;

    .line 134
    .line 135
    if-eqz p1, :cond_8

    .line 136
    .line 137
    move-object p1, v5

    .line 138
    goto :goto_3

    .line 139
    :cond_8
    sget-object p1, Lob/j;->g:Lob/j;

    .line 140
    .line 141
    :goto_3
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Lob/j;

    .line 146
    .line 147
    if-eq v6, p1, :cond_b

    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_9

    .line 154
    .line 155
    if-eqz v6, :cond_9

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_9
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    if-ne p1, v5, :cond_a

    .line 162
    .line 163
    const-string p1, "\u5f53\u524d\u804a\u5929\u82f1\u6587\u8f6c\u8bed\u97f3\u5df2\u5f00\u542f"

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    const-string p1, "\u5f53\u524d\u804a\u5929\u6587\u5b57\u8f6c\u8bed\u97f3\u5df2\u5f00\u542f"

    .line 167
    .line 168
    :goto_4
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return v7

    .line 172
    :cond_b
    :goto_5
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    const-string p1, "\u5f53\u524d\u804a\u5929\u6587\u5b57\u8f6c\u8bed\u97f3\u5df2\u5173\u95ed"

    .line 176
    .line 177
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return v7
.end method
