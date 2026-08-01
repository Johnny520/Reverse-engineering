.class public final synthetic Lr0/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;
.implements LM0/l;


# instance fields
.field public final synthetic a:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr0/G;->a:Lr0/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/G;->a:Lr0/d0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    array-length v2, v0

    .line 42
    const/4 v3, 0x2

    .line 43
    if-lt v2, v3, :cond_4

    .line 44
    .line 45
    aget-object v2, v0, v1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v4, "androidx.recyclerview.widget.k3"

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v4, v0, v2

    .line 61
    .line 62
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "onBindViewHolder"

    .line 76
    .line 77
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-static {p1, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    array-length p1, v0

    .line 97
    if-eq p1, v3, :cond_3

    .line 98
    .line 99
    array-length p1, v0

    .line 100
    const/4 v4, 0x3

    .line 101
    if-ne p1, v4, :cond_4

    .line 102
    .line 103
    const-class p1, Ljava/util/List;

    .line 104
    .line 105
    aget-object v0, v0, v3

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    :cond_3
    :goto_0
    return v2

    .line 114
    :cond_4
    :goto_1
    return v1
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
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, p1, v3}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LA0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    new-instance v2, LE0/d;

    .line 50
    .line 51
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object v0, v2

    .line 55
    :goto_1
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    const-string v3, "contact dexkit resolve fail"

    .line 62
    .line 63
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    instance-of v2, v0, LE0/d;

    .line 71
    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move-object v1, v0

    .line 76
    :goto_2
    check-cast v1, LA0/i;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    :goto_3
    const-string v0, "contact dexkit apk path empty"

    .line 80
    .line 81
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :goto_4
    const-string v0, "contact_scan_status_v2"

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    iget-object v3, p0, Lr0/G;->a:Lr0/d0;

    .line 94
    .line 95
    iput-object v1, v3, Lr0/d0;->z:LA0/i;

    .line 96
    .line 97
    invoke-static {p1, v1}, LA0/l;->w(Landroid/content/Context;LA0/i;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v2}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    new-instance p1, LA0/t;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v3, v1, LA0/i;->d:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v3, "/"

    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object v1, v1, LA0/i;->e:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p1, v2, v0, v2}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    const/4 p1, 0x0

    .line 134
    invoke-static {v0, p1}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    new-instance v0, LA0/t;

    .line 138
    .line 139
    const-string v1, "\u672a\u627e\u5230\u53ef\u7528 Hook \u70b9"

    .line 140
    .line 141
    invoke-direct {v0, p1, v1, v2}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    move-object p1, v0

    .line 145
    :goto_5
    return-object p1
.end method
