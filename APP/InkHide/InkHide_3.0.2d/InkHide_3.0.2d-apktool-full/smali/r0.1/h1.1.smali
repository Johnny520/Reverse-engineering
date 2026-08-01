.class public final synthetic Lr0/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;
.implements LM0/l;


# instance fields
.field public final synthetic a:Lr0/l1;


# direct methods
.method public synthetic constructor <init>(Lr0/l1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr0/h1;->a:Lr0/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/h1;->a:Lr0/l1;

    .line 2
    .line 3
    iget-object v1, v0, Lr0/l1;->k:LA0/Z;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lr0/l1;->j:Landroid/content/Context;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, LA0/l;->n(Landroid/content/Context;)LA0/Z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    move-object v1, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    iget-object v0, v1, LA0/Z;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-object v0, v1, LA0/Z;->b:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, v1, LA0/Z;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    :goto_2
    const/4 v0, 0x0

    .line 49
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "appContext"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, LA0/k;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v0, v1

    .line 26
    :goto_0
    if-eqz v0, :cond_5

    .line 27
    .line 28
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    :try_start_0
    new-instance v2, LA0/h;

    .line 36
    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    invoke-direct {v2, p1, v3}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, LA0/Z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    new-instance v2, LE0/d;

    .line 51
    .line 52
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v2

    .line 56
    :goto_1
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    const-string v3, "storage dexkit resolve fail"

    .line 63
    .line 64
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    instance-of v2, v0, LE0/d;

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v1, v0

    .line 77
    :goto_2
    check-cast v1, LA0/Z;

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    :goto_3
    const-string v0, "storage dexkit apk path empty"

    .line 81
    .line 82
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_4
    const/4 v0, 0x1

    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    invoke-static {p1, v1}, LA0/l;->y(Landroid/content/Context;LA0/Z;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lr0/h1;->a:Lr0/l1;

    .line 96
    .line 97
    iput-object v1, p1, Lr0/l1;->k:LA0/Z;

    .line 98
    .line 99
    new-instance p1, LA0/t;

    .line 100
    .line 101
    const-string v1, "\u5df2\u8865\u5168\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55 Hook \u70b9\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 102
    .line 103
    invoke-direct {p1, v0, v1, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    new-instance p1, LA0/t;

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    const-string v2, "\u672a\u627e\u5230\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55 Hook \u70b9"

    .line 111
    .line 112
    invoke-direct {p1, v1, v2, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    :goto_5
    return-object p1
.end method
