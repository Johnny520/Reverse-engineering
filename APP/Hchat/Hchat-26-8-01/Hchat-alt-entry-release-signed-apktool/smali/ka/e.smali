.class public final synthetic Lka/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Leb/i0;
.implements Lgg/h;


# instance fields
.field public final synthetic a:Lka/f;


# direct methods
.method public constructor <init>(Lka/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lka/e;->a:Lka/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lgg/j;
    .locals 8

    .line 1
    new-instance v0, Lgg/j;

    .line 2
    .line 3
    const-class v1, Lka/f;

    .line 4
    .line 5
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    iget-object v2, p0, Lka/e;->a:Lka/f;

    .line 13
    .line 14
    const-string v4, "onSendButton"

    .line 15
    .line 16
    const-string v5, "onSendButton(Ljava/lang/String;)Z"

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lka/e;->a:Lka/f;

    .line 5
    .line 6
    iget-object v0, v1, Lka/f;->c:Lka/g;

    .line 7
    .line 8
    const-string v2, "qq_music_order_enable"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, v2, v3}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->b()Lq8/m;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Lq8/m;->a()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v4

    .line 39
    :goto_0
    const-string v5, ""

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    move-object v2, v5

    .line 44
    :cond_2
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v7, "\u5f00\u542f\u70b9\u6b4c"

    .line 60
    .line 61
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const/4 v8, 0x1

    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    invoke-virtual {v1, v2, v8}, Lka/f;->f(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    return v8

    .line 72
    :cond_4
    const-string v7, "\u5173\u95ed\u70b9\u6b4c"

    .line 73
    .line 74
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_5

    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Lka/f;->f(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    return v8

    .line 84
    :cond_5
    const-string v6, "qq_music_order_intercept_own_command"

    .line 85
    .line 86
    invoke-virtual {v0, v6, v3}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    invoke-virtual {v1, p1}, Lka/f;->c(Ljava/lang/String;)Lka/d;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-eqz v6, :cond_9

    .line 98
    .line 99
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    invoke-virtual {p1}, Lg8/a;->c()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    :cond_7
    if-nez v4, :cond_8

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_8
    move-object v5, v4

    .line 120
    :goto_1
    iget-object p1, v1, Lka/f;->e:Ljava/util/concurrent/ExecutorService;

    .line 121
    .line 122
    new-instance v0, Lka/c;

    .line 123
    .line 124
    const-wide/16 v3, 0x0

    .line 125
    .line 126
    invoke-direct/range {v0 .. v6}, Lka/c;-><init>(Lka/f;Ljava/lang/String;JLjava/lang/String;Lka/d;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    return v8

    .line 133
    :cond_9
    :goto_2
    return v3
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Leb/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lgg/h;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lka/e;->a()Lgg/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast p1, Lgg/h;

    .line 14
    .line 15
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lka/e;->a()Lgg/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
