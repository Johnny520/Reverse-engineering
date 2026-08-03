.class public final Lab/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile e:Ljava/lang/ref/WeakReference;

.field public volatile f:Z

.field public volatile g:Z

.field public volatile h:Z

.field public volatile i:Z

.field public volatile j:Ljava/lang/reflect/Method;

.field public volatile k:Ljava/lang/reflect/Method;

.field public volatile l:Z


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lab/f;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lab/f;->b:Lab/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_quote_delete_clear_method_cache"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lab/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lab/f;->e:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    return-void
.end method

.method public static c(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0xc

    .line 4
    .line 5
    if-ge v0, v2, :cond_3

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    invoke-static {p0}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v2, p0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move-object v1, p0

    .line 25
    check-cast v1, Landroid/view/View;

    .line 26
    .line 27
    :cond_1
    move-object p0, v1

    .line 28
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    return-object v1
.end method

.method public static g(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const-class v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static h(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_4

    .line 33
    .line 34
    array-length p0, v0

    .line 35
    const/4 v1, 0x2

    .line 36
    if-ne p0, v1, :cond_4

    .line 37
    .line 38
    aget-object p0, v0, v2

    .line 39
    .line 40
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return v2

    .line 56
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 57
    aget-object v0, v0, p0

    .line 58
    .line 59
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return v2

    .line 73
    :cond_3
    :goto_1
    return p0

    .line 74
    :cond_4
    return v2
.end method

.method public static i(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "onKey"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    array-length p0, v0

    .line 31
    const/4 v1, 0x3

    .line 32
    if-ne p0, v1, :cond_1

    .line 33
    .line 34
    const-class p0, Landroid/view/View;

    .line 35
    .line 36
    aget-object v1, v0, v2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    aget-object v1, v0, p0

    .line 46
    .line 47
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_0

    .line 54
    .line 55
    aget-object v1, v0, p0

    .line 56
    .line 57
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    :cond_0
    const/4 v1, 0x2

    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    const-class v1, Landroid/view/KeyEvent;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    return p0

    .line 75
    :cond_1
    return v2
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lab/f;->j()Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v1, p1, v3}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v0

    .line 51
    :goto_1
    if-nez v1, :cond_3

    .line 52
    .line 53
    return v0

    .line 54
    :cond_3
    instance-of v1, p1, Landroid/view/View;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    check-cast p1, Landroid/view/View;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object p1, v2

    .line 62
    :goto_2
    const/4 v1, 0x4

    .line 63
    if-ge v0, v1, :cond_6

    .line 64
    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    instance-of v1, p1, Landroid/view/View;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    check-cast p1, Landroid/view/View;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move-object p1, v2

    .line 85
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    const/4 p1, 0x1

    .line 89
    return p1
.end method

.method public final b(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    invoke-static {p2}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lab/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-static {v0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-static {v2}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    if-eqz v0, :cond_8

    .line 54
    .line 55
    const-class v2, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_8

    .line 62
    .line 63
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_7

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-static {v3, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-static {v4}, Lab/f;->g(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_6
    const-string v3, "com.tencent.mm.pluginsdk.ui.chat."

    .line 115
    .line 116
    const/4 v5, 0x0

    .line 117
    invoke-static {v3, v4, v5}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    add-int/lit8 v3, p1, 0x1

    .line 124
    .line 125
    invoke-virtual {p0, v3, v4}, Lab/f;->b(ILjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    return-object v3

    .line 132
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_0

    .line 137
    :cond_8
    :goto_2
    const/4 p1, 0x0

    .line 138
    return-object p1
.end method

.method public final d()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lab/f;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lab/f;->a:Lr8/g;

    .line 8
    .line 9
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    const-string v2, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 12
    .line 13
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    const-string v3, "onAttachedToWindow"

    .line 21
    .line 22
    new-array v4, v2, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {v0, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    const-string v4, "onDetachedFromWindow"

    .line 31
    .line 32
    new-array v2, v2, [Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v0, v4, v2}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :try_start_0
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 39
    .line 40
    new-instance v4, Lab/d;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct {v4, p0, v5}, Lab/d;-><init>(Lab/f;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    new-instance v3, Lab/d;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    invoke-direct {v3, p0, v4}, Lab/d;-><init>(Lab/f;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    iput-boolean v1, p0, Lab/f;->g:Z

    .line 64
    .line 65
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_1
    new-instance v1, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object v0, v1

    .line 74
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    iget-object v0, p0, Lab/f;->b:Lab/b;

    .line 82
    .line 83
    const-string v2, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u8f93\u5165\u680f\u751f\u547d\u5468\u671fHook\u5931\u8d25"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    return v0

    .line 97
    :cond_3
    return v2
.end method

.method public final e()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lab/f;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const-class v0, Landroid/view/inputmethod/EditorInfo;

    .line 8
    .line 9
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v2, Landroid/widget/TextView;

    .line 14
    .line 15
    const-string v3, "onCreateInputConnection"

    .line 16
    .line 17
    invoke-static {v2, v3, v0}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :try_start_0
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 24
    .line 25
    new-instance v3, Lab/d;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v3, p0, v4}, Lab/d;-><init>(Lab/f;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 32
    .line 33
    .line 34
    iput-boolean v1, p0, Lab/f;->h:Z

    .line 35
    .line 36
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    new-instance v1, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v0, p0, Lab/f;->b:Lab/b;

    .line 54
    .line 55
    const-string v2, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u8f93\u5165\u6cd5\u5220\u9664Hook\u5931\u8d25"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    return v0

    .line 69
    :cond_2
    const/4 v0, 0x0

    .line 70
    return v0
.end method

.method public final f()Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lab/f;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lab/f;->j:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Lab/f;->a:Lr8/g;

    .line 15
    .line 16
    iget-object v3, v0, Lr8/g;->a:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    iget-object v4, p0, Lab/f;->a:Lr8/g;

    .line 32
    .line 33
    iget-object v4, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 34
    .line 35
    const-string v5, "support_auto_complete_on_key"

    .line 36
    .line 37
    invoke-static {v3, v0, v4, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    invoke-static {v3}, Lab/f;->i(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v3, v2

    .line 51
    :goto_0
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lab/f;->j:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    iget-object v0, p0, Lab/f;->j:Ljava/lang/reflect/Method;

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_3
    :try_start_0
    iget-object v3, p0, Lab/f;->a:Lr8/g;

    .line 64
    .line 65
    iget-object v3, v3, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 66
    .line 67
    new-instance v4, Lch/e;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v6, Lfh/k;

    .line 73
    .line 74
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v7, "onKey"

    .line 78
    .line 79
    new-instance v8, Lgh/c;

    .line 80
    .line 81
    const/4 v9, 0x5

    .line 82
    invoke-direct {v8, v7, v9}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    iput-object v8, v6, Lfh/k;->g:Lgh/c;

    .line 86
    .line 87
    const-string v7, "ChatFooterKtHelper"

    .line 88
    .line 89
    const-string v8, "supportAutoComplete err"

    .line 90
    .line 91
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-virtual {v6, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object v6, v4, Lch/e;->h:Lfh/k;

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_7

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 119
    .line 120
    :try_start_1
    iget-object v6, p0, Lab/f;->a:Lr8/g;

    .line 121
    .line 122
    iget-object v6, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 123
    .line 124
    invoke-virtual {v4, v6}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception v4

    .line 130
    :try_start_2
    new-instance v6, Lsf/f;

    .line 131
    .line 132
    invoke-direct {v6, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object v4, v6

    .line 136
    :goto_1
    nop

    .line 137
    instance-of v6, v4, Lsf/f;

    .line 138
    .line 139
    if-eqz v6, :cond_5

    .line 140
    .line 141
    move-object v4, v2

    .line 142
    :cond_5
    check-cast v4, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-static {v4}, Lab/f;->i(Ljava/lang/reflect/Method;)Z

    .line 147
    .line 148
    .line 149
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto :goto_5

    .line 155
    :cond_6
    move-object v4, v2

    .line 156
    :goto_2
    if-eqz v4, :cond_4

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    move-object v4, v2

    .line 160
    :goto_3
    if-eqz v4, :cond_8

    .line 161
    .line 162
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iput-object v3, p0, Lab/f;->j:Ljava/lang/reflect/Method;

    .line 167
    .line 168
    iget-object v3, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    invoke-static {v3, v0, v5, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_8
    iget-object v3, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 175
    .line 176
    const-string v4, "cache.key"

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    :try_start_3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    const-string v7, ""

    .line 186
    .line 187
    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_9

    .line 196
    .line 197
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    :cond_9
    invoke-interface {v6, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 209
    .line 210
    .line 211
    :catchall_2
    :goto_4
    iget-object v0, p0, Lab/f;->j:Ljava/lang/reflect/Method;

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :goto_5
    iget-object v3, p0, Lab/f;->b:Lab/b;

    .line 215
    .line 216
    const-string v4, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u5b9a\u4f4d\u6309\u952e\u5165\u53e3\u5f02\u5e38"

    .line 217
    .line 218
    invoke-virtual {v3, v4, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-object v0, v2

    .line 222
    :goto_6
    if-eqz v0, :cond_b

    .line 223
    .line 224
    :try_start_4
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 225
    .line 226
    new-instance v3, Lab/d;

    .line 227
    .line 228
    const/4 v4, 0x3

    .line 229
    invoke-direct {v3, p0, v4}, Lab/d;-><init>(Lab/f;I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 233
    .line 234
    .line 235
    iput-boolean v1, p0, Lab/f;->i:Z

    .line 236
    .line 237
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :catchall_3
    move-exception v0

    .line 241
    new-instance v1, Lsf/f;

    .line 242
    .line 243
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object v0, v1

    .line 247
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    if-nez v1, :cond_a

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_a
    iget-object v0, p0, Lab/f;->b:Lab/b;

    .line 255
    .line 256
    const-string v2, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u6309\u952eHook\u5931\u8d25"

    .line 257
    .line 258
    invoke-virtual {v0, v2, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    return v0

    .line 270
    :cond_b
    iget-object v0, p0, Lab/f;->b:Lab/b;

    .line 271
    .line 272
    const-string v1, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u5b9a\u4f4d\u6309\u952e\u5165\u53e3\u5931\u8d25"

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    const/4 v0, 0x0

    .line 278
    return v0
.end method

.method public final j()Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    iget-object v0, p0, Lab/f;->k:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-boolean v0, p0, Lab/f;->l:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_1
    iget-object v0, p0, Lab/f;->a:Lr8/g;

    .line 13
    .line 14
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    iget-object v3, p0, Lab/f;->a:Lr8/g;

    .line 30
    .line 31
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 32
    .line 33
    const-string v4, "quote_clear_method"

    .line 34
    .line 35
    invoke-static {v2, v0, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-static {v2}, Lab/f;->h(Ljava/lang/reflect/Method;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v2, v1

    .line 50
    :goto_0
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lab/f;->k:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    iput-boolean v3, p0, Lab/f;->l:Z

    .line 59
    .line 60
    iget-object v0, p0, Lab/f;->k:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    :try_start_0
    const-string v2, "handleQuoteMsgFillingFrom"

    .line 64
    .line 65
    filled-new-array {v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p0, v2}, Lab/f;->k([Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    const-string v2, "openim_card_type_name"

    .line 77
    .line 78
    const-string v5, "err_not_started"

    .line 79
    .line 80
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p0, v2}, Lab/f;->k([Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :goto_1
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, p0, Lab/f;->k:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    iput-boolean v3, p0, Lab/f;->l:Z

    .line 97
    .line 98
    iget-object v1, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    invoke-static {v1, v0, v4, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    iput-boolean v3, p0, Lab/f;->l:Z

    .line 105
    .line 106
    iget-object v1, p0, Lab/f;->c:Landroid/content/SharedPreferences;

    .line 107
    .line 108
    invoke-static {v1, v0, v4}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_2
    iget-object v0, p0, Lab/f;->k:Ljava/lang/reflect/Method;

    .line 112
    .line 113
    return-object v0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    iget-object v2, p0, Lab/f;->b:Lab/b;

    .line 116
    .line 117
    const-string v3, "\u5220\u9664\u952e\u6e05\u5f15\u7528\u5b9a\u4f4d\u539f\u751f\u6e05\u7406\u65b9\u6cd5\u5931\u8d25"

    .line 118
    .line 119
    invoke-virtual {v2, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    return-object v1
.end method

.method public final varargs k([Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    iget-object v0, p0, Lab/f;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v4, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 16
    .line 17
    const/4 v5, 0x5

    .line 18
    invoke-virtual {v3, v5, v4}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "void"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v4, "boolean"

    .line 27
    .line 28
    filled-new-array {v4, v4}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    array-length v4, p1

    .line 36
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, [Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, p1}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lhh/o;

    .line 67
    .line 68
    :try_start_0
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v1

    .line 76
    new-instance v3, Lsf/f;

    .line 77
    .line 78
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v1, v3

    .line 82
    :goto_0
    nop

    .line 83
    instance-of v3, v1, Lsf/f;

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    move-object v1, v2

    .line 88
    :cond_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-static {v1}, Lab/f;->h(Ljava/lang/reflect/Method;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    move-object v2, v1

    .line 99
    :cond_2
    if-eqz v2, :cond_0

    .line 100
    .line 101
    :cond_3
    return-object v2
.end method
