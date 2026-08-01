.class public final Lr0/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;
.implements Lz0/h;


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:LA0/S;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr0/x1;->a:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "&"

    .line 2
    .line 3
    const-string v1, "&amp;"

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "<"

    .line 10
    .line 11
    const-string v1, "&lt;"

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, ">"

    .line 18
    .line 19
    const-string v1, "&gt;"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "\""

    .line 26
    .line 27
    const-string v1, "&quot;"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "\'"

    .line 34
    .line 35
    const-string v1, "&apos;"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [C

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v0, v2, v3

    .line 8
    .line 9
    invoke-static {p0, v2}, LU0/i;->E0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v2, v1, [C

    .line 14
    .line 15
    aput-char v0, v2, v3

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v4, v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    move v6, v3

    .line 29
    :goto_1
    if-ge v6, v1, :cond_1

    .line 30
    .line 31
    aget-char v7, v2, v6

    .line 32
    .line 33
    if-ne v5, v7, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    add-int/2addr v6, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v6, -0x1

    .line 39
    :goto_2
    if-ltz v6, :cond_2

    .line 40
    .line 41
    move v5, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    move v5, v3

    .line 44
    :goto_3
    if-nez v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_4

    .line 55
    :cond_3
    add-int/2addr v4, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const-string p1, ""

    .line 58
    .line 59
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, "/"

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static f(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2f

    .line 6
    .line 7
    const/16 v2, 0x2e

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string p0, "V"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string p0, "Z"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const-string p0, "B"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    const-string p0, "C"

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    const-string p0, "S"

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    const-string p0, "I"

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_6
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    const-string p0, "J"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_7
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    const-string p0, "F"

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_8
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    const-string p0, "D"

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string v0, "L"

    .line 128
    .line 129
    const-string v1, ";"

    .line 130
    .line 131
    invoke-static {v0, p0, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/x1;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-boolean v1, Lz0/i;->a:Z

    .line 15
    .line 16
    invoke-static {}, Lz0/g;->G()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {v1}, Lz0/q;->g(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, LC0/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    const-string v2, "read-trace-send-hooks"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, LC0/a;

    .line 53
    .line 54
    :try_start_0
    iget-object v4, v3, LC0/a;->b:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 55
    .line 56
    invoke-virtual {v4}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 57
    .line 58
    .line 59
    sget-object v4, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v4

    .line 63
    new-instance v5, LE0/d;

    .line 64
    .line 65
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object v4, v5

    .line 69
    :goto_1
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    const-string v5, "hook lifecycle unhook fail"

    .line 76
    .line 77
    filled-new-array {v5, v2, v4}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v3, v3, LC0/a;->a:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {p0, v0}, Lr0/x1;->b(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    :goto_2
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 13

    .line 1
    const/4 v1, 0x1

    .line 2
    sget-boolean v0, Lz0/i;->a:Z

    .line 3
    .line 4
    invoke-static {}, Lz0/g;->G()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lr0/x1;->b:LA0/S;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    invoke-static {p1}, LA0/l;->j(Landroid/content/Context;)LA0/S;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v0, p0, Lr0/x1;->b:LA0/S;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v0, v2

    .line 26
    :goto_0
    if-nez v0, :cond_3

    .line 27
    .line 28
    :cond_2
    move-object v6, p0

    .line 29
    move-object v7, p1

    .line 30
    goto/16 :goto_d

    .line 31
    .line 32
    :cond_3
    iget-object v3, v0, LA0/S;->d:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    new-instance v3, LA0/T;

    .line 41
    .line 42
    iget-object v4, v0, LA0/S;->c:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v0, LA0/S;->a:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, v0, LA0/S;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v3, v5, v0, v4}, LA0/T;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v5, v0

    .line 70
    check-cast v5, LA0/T;

    .line 71
    .line 72
    iget-object v10, v5, LA0/T;->a:Ljava/lang/String;

    .line 73
    .line 74
    const-string v0, "read-trace-send-click:"

    .line 75
    .line 76
    const-string v4, "#"

    .line 77
    .line 78
    invoke-static {v0, v10, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v11, v5, LA0/T;->b:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v4, v5, LA0/T;->c:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 97
    .line 98
    invoke-virtual {v0, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    :goto_2
    goto :goto_6

    .line 105
    :cond_5
    const/4 v6, 0x0

    .line 106
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v10, v6, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    goto :goto_3

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    new-instance v7, LE0/d;

    .line 117
    .line 118
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v7

    .line 122
    :goto_3
    nop

    .line 123
    instance-of v7, v0, LE0/d;

    .line 124
    .line 125
    if-eqz v7, :cond_6

    .line 126
    .line 127
    move-object v0, v2

    .line 128
    :cond_6
    check-cast v0, Ljava/lang/Class;

    .line 129
    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v7, "getDeclaredMethods(...)"

    .line 138
    .line 139
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    array-length v7, v0

    .line 143
    :goto_4
    if-ge v6, v7, :cond_9

    .line 144
    .line 145
    aget-object v8, v0, v6

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-static {v9, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-eqz v9, :cond_8

    .line 156
    .line 157
    invoke-virtual {p0, v8}, Lr0/x1;->e(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-static {v9, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_8

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    add-int/2addr v6, v1

    .line 169
    goto :goto_4

    .line 170
    :cond_9
    move-object v8, v2

    .line 171
    :goto_5
    if-nez v8, :cond_a

    .line 172
    .line 173
    const-string v0, "read trace send hook method not found"

    .line 174
    .line 175
    filled-new-array {v0, v10, v11, v4}, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 183
    .line 184
    invoke-virtual {v0, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :goto_6
    move-object v6, p0

    .line 188
    move-object v7, p1

    .line 189
    goto/16 :goto_c

    .line 190
    .line 191
    :cond_a
    :try_start_1
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 192
    .line 193
    .line 194
    new-instance v4, Lr0/e1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 195
    .line 196
    const/4 v9, 0x1

    .line 197
    move-object v6, p0

    .line 198
    move-object v7, p1

    .line 199
    :try_start_2
    invoke-direct/range {v4 .. v9}, Lr0/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/GenericDeclaration;I)V

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    sget-object v0, LC0/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 207
    .line 208
    const-string v0, "read-trace-send-hooks"

    .line 209
    .line 210
    if-nez p1, :cond_b

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_b
    sget-object v4, LC0/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 214
    .line 215
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-nez v5, :cond_d

    .line 220
    .line 221
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 222
    .line 223
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-nez v0, :cond_c

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_c
    move-object v5, v0

    .line 234
    :cond_d
    :goto_7
    check-cast v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 235
    .line 236
    new-instance v0, LC0/a;

    .line 237
    .line 238
    invoke-direct {v0, v12, p1}, LC0/a;-><init>(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    :goto_8
    const-string p1, "read trace send hook installed"

    .line 245
    .line 246
    invoke-virtual {p0, v8}, Lr0/x1;->e(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    filled-new-array {p1, v10, v11, v0}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object p1, LE0/i;->a:LE0/i;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    :goto_9
    move-object p1, v0

    .line 262
    goto :goto_a

    .line 263
    :catchall_2
    move-exception v0

    .line 264
    move-object v6, p0

    .line 265
    move-object v7, p1

    .line 266
    goto :goto_9

    .line 267
    :goto_a
    new-instance v0, LE0/d;

    .line 268
    .line 269
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    move-object p1, v0

    .line 273
    :goto_b
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_e

    .line 278
    .line 279
    const-string v0, "read trace send hook install fail"

    .line 280
    .line 281
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_e
    :goto_c
    move-object p1, v7

    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :goto_d
    invoke-static {v7}, Lz0/r;->y(Landroid/content/Context;)Z

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public final e(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getParameterTypes(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lr0/u1;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Lr0/u1;-><init>(Lr0/x1;I)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x18

    .line 17
    .line 18
    const-string v3, ""

    .line 19
    .line 20
    invoke-static {v0, v3, v1, v2}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "getReturnType(...)"

    .line 29
    .line 30
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lr0/x1;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 9

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    :cond_0
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lr0/x1;->c:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    iget-boolean v0, p0, Lr0/x1;->d:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-boolean v0, Lz0/i;->a:Z

    .line 23
    .line 24
    sget-object v0, Lz0/i;->j:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    iput-boolean v1, p0, Lr0/x1;->d:Z

    .line 42
    .line 43
    :goto_0
    invoke-static {p1}, LA0/l;->j(Landroid/content/Context;)LA0/S;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lr0/x1;->b:LA0/S;

    .line 48
    .line 49
    sget-boolean v0, Lz0/i;->a:Z

    .line 50
    .line 51
    invoke-static {}, Lz0/g;->G()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, LA0/l;->j(Landroid/content/Context;)LA0/S;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    const-string v0, "unified_dexkit_scan_status_v16"

    .line 64
    .line 65
    invoke-static {v0, p2}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    :cond_3
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    new-instance v2, LA0/u;

    .line 71
    .line 72
    new-instance v5, Lr0/n1;

    .line 73
    .line 74
    const/4 v0, 0x5

    .line 75
    invoke-direct {v5, v0}, Lr0/n1;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v6, LA0/h;

    .line 79
    .line 80
    const/16 v0, 0x12

    .line 81
    .line 82
    invoke-direct {v6, p1, v0}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 83
    .line 84
    .line 85
    new-instance v7, Lr0/u1;

    .line 86
    .line 87
    invoke-direct {v7, p0, p2}, Lr0/u1;-><init>(Lr0/x1;I)V

    .line 88
    .line 89
    .line 90
    const-string v3, "read-trace"

    .line 91
    .line 92
    const-string v4, "\u5df2\u8bfb\u8ffd\u8e2a\u6d88\u606f\u53d1\u9001"

    .line 93
    .line 94
    new-instance v8, LA0/a;

    .line 95
    .line 96
    const/16 v0, 0x10

    .line 97
    .line 98
    invoke-direct {v8, v0}, LA0/a;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-direct/range {v2 .. v8}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v2}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, LC0/c;->a:LC0/c;

    .line 108
    .line 109
    sget-boolean v0, LC0/c;->e:Z

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    goto/16 :goto_7

    .line 114
    .line 115
    :cond_4
    monitor-enter v2

    .line 116
    :try_start_0
    sget-boolean v0, LC0/c;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    monitor-exit v2

    .line 121
    goto/16 :goto_7

    .line 122
    .line 123
    :cond_5
    :try_start_1
    const-string v0, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v0, p2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    goto :goto_1

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    :try_start_2
    new-instance v3, LE0/d;

    .line 136
    .line 137
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    move-object v0, v3

    .line 141
    :goto_1
    nop

    .line 142
    instance-of v3, v0, LE0/d;

    .line 143
    .line 144
    if-eqz v3, :cond_6

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    :cond_6
    check-cast v0, Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    .line 149
    if-nez v0, :cond_7

    .line 150
    .line 151
    monitor-exit v2

    .line 152
    goto/16 :goto_7

    .line 153
    .line 154
    :cond_7
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v3, "getDeclaredMethods(...)"

    .line 159
    .line 160
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    array-length v4, v0

    .line 169
    move v5, p2

    .line 170
    :goto_2
    if-ge v5, v4, :cond_9

    .line 171
    .line 172
    aget-object v6, v0, v5

    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    const-string v8, "setUserName"

    .line 179
    .line 180
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_8

    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    const-class v8, Ljava/lang/String;

    .line 191
    .line 192
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-static {v7, v8}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eqz v7, :cond_8

    .line 201
    .line 202
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    move-object p1, v0

    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_8
    :goto_3
    add-int/2addr v5, v1

    .line 211
    goto :goto_2

    .line 212
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    move v4, p2

    .line 217
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_c

    .line 222
    .line 223
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    move-object v5, v0

    .line 228
    check-cast v5, Ljava/lang/reflect/Method;

    .line 229
    .line 230
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    new-instance v7, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v8, "wechat-chat-session:"

    .line 248
    .line 249
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v0, "#"

    .line 256
    .line 257
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 268
    .line 269
    invoke-virtual {v0, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_a

    .line 274
    .line 275
    add-int/2addr v4, v1

    .line 276
    goto :goto_4

    .line 277
    :cond_a
    sget-object v0, LC0/c;->a:LC0/c;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 278
    .line 279
    :try_start_4
    new-instance v0, LA0/x;

    .line 280
    .line 281
    invoke-direct {v0, v1}, LA0/x;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-static {v5, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 285
    .line 286
    .line 287
    add-int/lit8 v7, v4, 0x1

    .line 288
    .line 289
    :try_start_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 293
    goto :goto_6

    .line 294
    :catchall_2
    move-exception v0

    .line 295
    move v4, v7

    .line 296
    goto :goto_5

    .line 297
    :catchall_3
    move-exception v0

    .line 298
    :goto_5
    :try_start_6
    new-instance v7, LE0/d;

    .line 299
    .line 300
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    move-object v0, v7

    .line 304
    move v7, v4

    .line 305
    :goto_6
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_b

    .line 310
    .line 311
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 312
    .line 313
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    const-string v4, "chat session hook install fail"

    .line 317
    .line 318
    filled-new-array {v4, v5, v0}, [Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_b
    move v4, v7

    .line 326
    goto :goto_4

    .line 327
    :cond_c
    if-lez v4, :cond_d

    .line 328
    .line 329
    move p2, v1

    .line 330
    :cond_d
    sput-boolean p2, LC0/c;->e:Z

    .line 331
    .line 332
    sget-boolean p2, LC0/c;->e:Z

    .line 333
    .line 334
    if-eqz p2, :cond_e

    .line 335
    .line 336
    const-string p2, "wechat chat session hub installed"

    .line 337
    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const-string v1, "methods="

    .line 344
    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    filled-new-array {p2, v0}, [Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p2

    .line 359
    invoke-static {p2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_e
    sget-object p2, LC0/c;->a:LC0/c;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 363
    .line 364
    monitor-exit v2

    .line 365
    :goto_7
    invoke-virtual {p0, p1}, Lr0/x1;->b(Landroid/content/Context;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :goto_8
    monitor-exit v2

    .line 370
    throw p1
.end method
