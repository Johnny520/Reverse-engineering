.class public final Lcb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final b:Lr8/g;

.field public volatile c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcb/f;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcb/f;->b:Lr8/g;

    .line 11
    .line 12
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 13
    .line 14
    const-string v0, "Hchat_round_avatar_method_cache"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcb/f;->f:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcb/f;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcb/f;->b:Lr8/g;

    .line 55
    iput-object p2, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 56
    new-instance p2, Ldb/g;

    .line 57
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 58
    invoke-direct {p2, p1}, Ldb/g;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 59
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcb/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcb/f;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcb/f;->b:Lr8/g;

    .line 37
    iput-object p2, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 38
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 39
    const-string p2, "Hchat_disable_pat_config"

    .line 40
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p2

    iput-object p2, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 41
    const-string p2, "Hchat_disable_pat_method_cache"

    .line 42
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 43
    iput-object p1, p0, Lcb/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;B)V
    .locals 0

    const/4 p3, 0x3

    iput p3, p0, Lcb/f;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcb/f;->b:Lr8/g;

    .line 46
    iput-object p2, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 47
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 48
    const-string p2, "Hchat_block_typing_report_config"

    .line 49
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p2

    iput-object p2, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 50
    const-string p2, "Hchat_block_typing_report_method_cache"

    .line 51
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 52
    iput-object p1, p0, Lcb/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ldb/c;)I
    .locals 2

    .line 1
    iget v0, p0, Ldb/c;->r:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p0, p0, Ldb/c;->f:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ge p0, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return v1

    .line 16
    :cond_1
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
    const/4 v1, 0x0

    .line 6
    const-string v2, "com.tencent.mm.ui.chatting."

    .line 7
    .line 8
    invoke-static {p0, v1, v2}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    array-length v2, v0

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    const-class v2, Landroid/view/View;

    .line 33
    .line 34
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_0

    .line 59
    .line 60
    return v3

    .line 61
    :cond_0
    return v1
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
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v2, Landroid/widget/ImageView;

    .line 32
    .line 33
    const-class v3, Ljava/lang/String;

    .line 34
    .line 35
    filled-new-array {v2, v3, p0, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {v0, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public static j(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "com.tencent.mm.ui.chatting.component."

    .line 7
    .line 8
    invoke-static {p0, v1, v2}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    array-length v2, v0

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_0

    .line 59
    .line 60
    return v3

    .line 61
    :cond_0
    return v1
.end method

.method public static k(Ljava/lang/reflect/Constructor;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x7

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    aget-object v0, p0, v2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "com.tencent.mm.sdk.coroutines.LifecycleScope"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aget-object v1, p0, v0

    .line 26
    .line 27
    const-class v3, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    aget-object v1, p0, v1

    .line 37
    .line 38
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    array-length v1, p0

    .line 47
    move v3, v2

    .line 48
    :goto_0
    if-ge v3, v1, :cond_1

    .line 49
    .line 50
    aget-object v4, p0, v3

    .line 51
    .line 52
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    return v0

    .line 61
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return v2
.end method

.method public static l(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    array-length p1, v0

    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    if-ne p1, v1, :cond_1

    .line 42
    .line 43
    aget-object p1, v0, v2

    .line 44
    .line 45
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    aget-object p1, v0, p0

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v1, "com.tencent.mm.sdk.coroutines.LifecycleScope"

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    const/4 p1, 0x2

    .line 67
    aget-object p1, v0, p1

    .line 68
    .line 69
    const-class v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    const/4 p1, 0x3

    .line 78
    aget-object p1, v0, p1

    .line 79
    .line 80
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    array-length p1, v0

    .line 89
    move v1, v2

    .line 90
    :goto_0
    if-ge v1, p1, :cond_1

    .line 91
    .line 92
    aget-object v3, v0, v1

    .line 93
    .line 94
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    return p0

    .line 103
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    return v2
.end method

.method public static m([Ljava/lang/Class;)I
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    add-int/2addr v0, v1

    .line 4
    if-ltz v0, :cond_4

    .line 5
    .line 6
    :goto_0
    add-int/lit8 v2, v0, -0x1

    .line 7
    .line 8
    aget-object v3, p0, v0

    .line 9
    .line 10
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-nez v5, :cond_1

    .line 17
    .line 18
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v3, 0x0

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    :goto_1
    const/4 v3, 0x1

    .line 28
    :goto_2
    if-eqz v3, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    if-gez v2, :cond_3

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_3
    move v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_4
    :goto_3
    return v1
.end method

.method public static u()Lo8/j;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static v(Ldb/c;Ljava/util/List;)Ldb/c;
    .locals 30

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v5, v2

    .line 23
    check-cast v5, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    cmp-long v3, v5, v3

    .line 30
    .line 31
    if-lez v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_1
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v28

    .line 54
    invoke-static/range {v28 .. v28}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Long;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    :cond_3
    move-wide v11, v3

    .line 67
    const/16 v27, 0x0

    .line 68
    .line 69
    const v29, 0x1fffbf

    .line 70
    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v13, 0x0

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const-wide/16 v19, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    const/16 v25, 0x0

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    move-object/from16 v5, p0

    .line 101
    .line 102
    invoke-static/range {v5 .. v29}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0
.end method


# virtual methods
.method public a(IILfg/l;)Lsf/e;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez p1, :cond_3

    .line 8
    .line 9
    if-gtz p2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    invoke-direct {v3, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ldb/f;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v2, v5, v3}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lhb/s;

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    const-wide/16 v5, 0x1e

    .line 39
    .line 40
    invoke-virtual {v3, v5, v6, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 41
    .line 42
    .line 43
    move-result v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 50
    .line 51
    .line 52
    move v3, v0

    .line 53
    :goto_0
    if-nez v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {p3}, Lhb/s;->a()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lab/b;

    .line 61
    .line 62
    const-string p3, "\u5b9a\u65f6\u4efb\u52a1\u7b49\u5f85\u53d1\u9001\u901a\u9053\u5b8c\u6210\u8d85\u65f6"

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, p3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Lsf/e;

    .line 73
    .line 74
    invoke-direct {p2, v1, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    div-int/2addr p3, p1

    .line 83
    invoke-static {p3, v0, p2}, Lr9/e0;->r(III)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    sub-int/2addr p2, p1

    .line 92
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Lsf/e;

    .line 97
    .line 98
    invoke-direct {p2, p3, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object p2

    .line 102
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p2, Lsf/e;

    .line 107
    .line 108
    invoke-direct {p2, v1, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :cond_3
    :goto_1
    if-ge p2, v2, :cond_4

    .line 113
    .line 114
    move p2, v2

    .line 115
    :cond_4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance p2, Lsf/e;

    .line 120
    .line 121
    invoke-direct {p2, v1, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object p2
.end method

.method public varargs c([Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lcb/f;->b:Lr8/g;

    .line 2
    .line 3
    :try_start_0
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
    array-length v4, p1

    .line 16
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v2}, Lhh/o;->t()Z

    .line 53
    .line 54
    .line 55
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v4}, Llh/d;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v2, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v2

    .line 78
    :try_start_3
    new-instance v3, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v3

    .line 84
    :goto_1
    nop

    .line 85
    instance-of v3, v2, Lsf/f;

    .line 86
    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    :cond_2
    check-cast v2, Ljava/lang/reflect/Executable;

    .line 91
    .line 92
    if-eqz v2, :cond_0

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    new-instance v1, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-nez p1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "[Hchat:RoundAvatar] \u5b9a\u4f4d\u5934\u50cf\u5165\u53e3\u5f02\u5e38: "

    .line 116
    .line 117
    invoke-static {v1, v0, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 121
    .line 122
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 123
    .line 124
    return-object v1
.end method

.method public declared-synchronized d(Ldb/c;II)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ldb/g;

    .line 9
    .line 10
    iget-object v3, v0, Ldb/c;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ldb/g;->b(Ljava/lang/String;)Ldb/c;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    if-eqz v4, :cond_a

    .line 17
    .line 18
    invoke-static {v4}, La2/a;->v(Ldb/c;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-wide v5, v0, Ldb/c;->g:J

    .line 23
    .line 24
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    iget-object v0, v4, Ldb/c;->m:Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "running"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ldb/g;

    .line 47
    .line 48
    const-string v17, "pending"

    .line 49
    .line 50
    const/16 v27, 0x0

    .line 51
    .line 52
    const v28, 0x3fefff

    .line 53
    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const-wide/16 v10, 0x0

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const-wide/16 v18, 0x0

    .line 69
    .line 70
    const/16 v20, 0x0

    .line 71
    .line 72
    const/16 v21, 0x0

    .line 73
    .line 74
    const/16 v22, 0x0

    .line 75
    .line 76
    const/16 v23, 0x0

    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const/16 v25, 0x0

    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    invoke-static/range {v4 .. v28}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, Ldb/g;->d(Ldb/c;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcb/f;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    monitor-exit p0

    .line 99
    return-void

    .line 100
    :cond_1
    :try_start_1
    iget v7, v4, Ldb/c;->h:I

    .line 101
    .line 102
    if-nez v7, :cond_6

    .line 103
    .line 104
    new-instance v3, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    move-object v6, v5

    .line 124
    check-cast v6, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    iget-wide v8, v0, Ldb/c;->g:J

    .line 131
    .line 132
    cmp-long v6, v6, v8

    .line 133
    .line 134
    if-nez v6, :cond_3

    .line 135
    .line 136
    const/4 v6, 0x1

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    const/4 v6, 0x0

    .line 139
    :goto_2
    if-nez v6, :cond_2

    .line 140
    .line 141
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    iget-object v5, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, Ldb/g;

    .line 152
    .line 153
    if-eqz v2, :cond_5

    .line 154
    .line 155
    :try_start_2
    iget-object v0, v0, Ldb/c;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v5, v0}, Ldb/g;->a(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    invoke-static {v4, v3}, Lcb/f;->v(Ldb/c;Ljava/util/List;)Ldb/c;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    const-string v19, "pending"

    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 168
    .line 169
    .line 170
    move-result-wide v20

    .line 171
    const/16 v29, 0x0

    .line 172
    .line 173
    const v30, 0x3f0fff

    .line 174
    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v9, 0x0

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v11, 0x0

    .line 181
    const-wide/16 v12, 0x0

    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    const/16 v25, 0x0

    .line 194
    .line 195
    const/16 v26, 0x0

    .line 196
    .line 197
    const/16 v27, 0x0

    .line 198
    .line 199
    const/16 v28, 0x0

    .line 200
    .line 201
    move/from16 v22, p2

    .line 202
    .line 203
    move/from16 v23, p3

    .line 204
    .line 205
    invoke-static/range {v6 .. v30}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v5, v0}, Ldb/g;->d(Ldb/c;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lcb/f;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 213
    .line 214
    .line 215
    :goto_3
    monitor-exit p0

    .line 216
    return-void

    .line 217
    :cond_6
    :try_start_3
    iget-wide v5, v0, Ldb/c;->g:J

    .line 218
    .line 219
    iget-object v8, v4, Ldb/c;->i:Ljava/util/Set;

    .line 220
    .line 221
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 222
    .line 223
    .line 224
    move-result-wide v9

    .line 225
    invoke-static/range {v5 .. v10}, La2/a;->F(JILjava/util/Set;J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v5

    .line 229
    const-wide/16 v7, 0x0

    .line 230
    .line 231
    cmp-long v3, v5, v7

    .line 232
    .line 233
    if-gtz v3, :cond_7

    .line 234
    .line 235
    iget-object v2, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, Ldb/g;

    .line 238
    .line 239
    iget-object v0, v0, Ldb/c;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ldb/g;->a(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 242
    .line 243
    .line 244
    monitor-exit p0

    .line 245
    return-void

    .line 246
    :cond_7
    :try_start_4
    new-instance v3, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-eqz v7, :cond_9

    .line 264
    .line 265
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, Ljava/lang/Number;

    .line 270
    .line 271
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide v7

    .line 275
    iget-wide v9, v0, Ldb/c;->g:J

    .line 276
    .line 277
    cmp-long v9, v7, v9

    .line 278
    .line 279
    if-nez v9, :cond_8

    .line 280
    .line 281
    move-wide v7, v5

    .line 282
    :cond_8
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_9
    invoke-static {v4, v3}, Lcb/f;->v(Ldb/c;Ljava/util/List;)Ldb/c;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v15, "pending"

    .line 295
    .line 296
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 297
    .line 298
    .line 299
    move-result-wide v16

    .line 300
    const/16 v25, 0x0

    .line 301
    .line 302
    const v26, 0x3f0fff

    .line 303
    .line 304
    .line 305
    const/4 v3, 0x0

    .line 306
    const/4 v4, 0x0

    .line 307
    const/4 v5, 0x0

    .line 308
    const/4 v6, 0x0

    .line 309
    const/4 v7, 0x0

    .line 310
    const-wide/16 v8, 0x0

    .line 311
    .line 312
    const/4 v10, 0x0

    .line 313
    const/4 v11, 0x0

    .line 314
    const/4 v12, 0x0

    .line 315
    const/4 v13, 0x0

    .line 316
    const/4 v14, 0x0

    .line 317
    const/16 v20, 0x0

    .line 318
    .line 319
    const/16 v21, 0x0

    .line 320
    .line 321
    const/16 v22, 0x0

    .line 322
    .line 323
    const/16 v23, 0x0

    .line 324
    .line 325
    const/16 v24, 0x0

    .line 326
    .line 327
    move/from16 v18, p2

    .line 328
    .line 329
    move/from16 v19, p3

    .line 330
    .line 331
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v0}, La2/a;->r(Ldb/c;)Ldb/c;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iget-object v2, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v2, Ldb/g;

    .line 342
    .line 343
    invoke-virtual {v2, v0}, Ldb/g;->d(Ldb/c;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1}, Lcb/f;->r()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 347
    .line 348
    .line 349
    monitor-exit p0

    .line 350
    return-void

    .line 351
    :cond_a
    monitor-exit p0

    .line 352
    return-void

    .line 353
    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 354
    throw v0
.end method

.method public e(Ljava/lang/reflect/Method;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcb/f;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 15
    .line 16
    new-instance v2, Lcb/d;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-direct {v2, p0, v3}, Lcb/d;-><init>(Lcb/f;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 23
    .line 24
    .line 25
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    new-instance v2, Lsf/f;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v2

    .line 34
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "[Hchat:RoundAvatar] \u5b89\u88c5\u901a\u77e5\u63d0\u4ea4\u5934\u50cf Hook \u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {v0, p1, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_1
    return-void
.end method

.method public f(Ljava/lang/reflect/Executable;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 14
    .line 15
    new-instance v2, Lcb/e;

    .line 16
    .line 17
    invoke-direct {v2, p0, p2, p3}, Lcb/e;-><init>(Lcb/f;II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p2

    .line 30
    new-instance p3, Lsf/f;

    .line 31
    .line 32
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object p2, p3

    .line 36
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "[Hchat:RoundAvatar] \u5b89\u88c5\u5934\u50cf\u5f27\u5ea6 Hook \u5931\u8d25: "

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ", error="

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, p3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1
.end method

.method public declared-synchronized g(Z)Z
    .locals 5

    .line 1
    iget v0, p0, Lcb/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "\u6b63\u5728\u8f93\u5165\u4e0a\u62a5 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-boolean v1, p0, Lcb/f;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcb/f;->p(Z)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :try_start_2
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 23
    .line 24
    new-instance v3, Lb9/e;

    .line 25
    .line 26
    const/16 v4, 0x16

    .line 27
    .line 28
    invoke-direct {v3, p0, v4}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 32
    .line 33
    .line 34
    iput-boolean v2, p0, Lcb/f;->c:Z

    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    :try_start_3
    new-instance v2, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v1, v2

    .line 46
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v1, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lia/t;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, p1, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    monitor-exit p0

    .line 85
    goto :goto_2

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    monitor-exit p0

    .line 89
    const/4 v2, 0x0

    .line 90
    :goto_2
    return v2

    .line 91
    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 92
    throw p1

    .line 93
    :pswitch_0
    const-string v0, "\u7981\u6b62\u62cd\u4e00\u62cd Hook \u5b89\u88c5\u5931\u8d25: "

    .line 94
    .line 95
    monitor-enter p0

    .line 96
    :try_start_5
    iget-boolean v1, p0, Lcb/f;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    monitor-exit p0

    .line 102
    goto :goto_6

    .line 103
    :cond_3
    :try_start_6
    invoke-virtual {p0, p1}, Lcb/f;->n(Z)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    :try_start_7
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 110
    .line 111
    new-instance v3, Lb9/e;

    .line 112
    .line 113
    const/16 v4, 0x11

    .line 114
    .line 115
    invoke-direct {v3, p0, v4}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p1, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 119
    .line 120
    .line 121
    iput-boolean v2, p0, Lcb/f;->c:Z

    .line 122
    .line 123
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :catchall_2
    move-exception v1

    .line 127
    :try_start_8
    new-instance v2, Lsf/f;

    .line 128
    .line 129
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object v1, v2

    .line 133
    :goto_4
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-nez v2, :cond_4

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_4
    iget-object v1, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lia/t;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {v1, p1, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    :goto_5
    check-cast v1, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 171
    monitor-exit p0

    .line 172
    goto :goto_6

    .line 173
    :catchall_3
    move-exception p1

    .line 174
    goto :goto_7

    .line 175
    :cond_5
    monitor-exit p0

    .line 176
    const/4 v2, 0x0

    .line 177
    :goto_6
    return v2

    .line 178
    :goto_7
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 179
    throw p1

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public n(Z)Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    iget-object v0, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lia/t;

    .line 5
    .line 6
    iget-object v0, p0, Lcb/f;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iget-object v0, p0, Lcb/f;->b:Lr8/g;

    .line 12
    .line 13
    iget-object v3, v0, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v4}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v3, v3, Ll8/i;->h:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v3, v6

    .line 35
    :goto_0
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const-string v5, "|disable_pat_v1_avatar_double_click"

    .line 38
    .line 39
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v3, v6

    .line 45
    :goto_1
    const-string v5, ""

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    :cond_2
    const-string v7, "avatar_double_click_method"

    .line 51
    .line 52
    invoke-static {v2, v3, v4, v7}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    invoke-static {v8}, Lcb/f;->h(Ljava/lang/reflect/Method;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    return-object v8

    .line 65
    :cond_3
    invoke-static {v2, v3, v7}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    if-nez p1, :cond_5

    .line 69
    .line 70
    return-object v6

    .line 71
    :cond_5
    :try_start_0
    iget-object p1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 72
    .line 73
    new-instance v0, Lch/e;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v8, Lfh/k;

    .line 79
    .line 80
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v9, "MicroMsg.AvatarDoubleClickListener"

    .line 84
    .line 85
    const-string v10, "onDoubleClick tag null"

    .line 86
    .line 87
    const-string v11, "onDoubleClick: %s"

    .line 88
    .line 89
    filled-new-array {v9, v10, v11}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-virtual {v8, v9}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iput-object v8, v0, Lch/e;->h:Lfh/k;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v8, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 122
    .line 123
    :try_start_1
    invoke-virtual {v0, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    goto :goto_3

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    :try_start_2
    new-instance v9, Lsf/f;

    .line 130
    .line 131
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    move-object v0, v9

    .line 135
    :goto_3
    nop

    .line 136
    instance-of v9, v0, Lsf/f;

    .line 137
    .line 138
    if-eqz v9, :cond_7

    .line 139
    .line 140
    move-object v0, v6

    .line 141
    :cond_7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    move-object p1, v0

    .line 151
    goto :goto_6

    .line 152
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_a

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    move-object v8, v4

    .line 172
    check-cast v8, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-static {v8}, Lcb/f;->h(Ljava/lang/reflect/Method;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_9

    .line 179
    .line 180
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_a
    new-instance v0, Ljava/util/HashSet;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 187
    .line 188
    .line 189
    new-instance v4, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_c

    .line 203
    .line 204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    move-object v9, v8

    .line 209
    check-cast v9, Ljava/lang/reflect/Method;

    .line 210
    .line 211
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-eqz v9, :cond_b

    .line 220
    .line 221
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :goto_6
    new-instance v4, Lsf/f;

    .line 226
    .line 227
    invoke-direct {v4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-nez p1, :cond_d

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_d
    const-string v0, "\u5b9a\u4f4d\u804a\u5929\u5934\u50cf\u53cc\u51fb\u5165\u53e3\u5931\u8d25"

    .line 238
    .line 239
    invoke-virtual {v1, v0, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 243
    .line 244
    :goto_7
    move-object v8, v4

    .line 245
    check-cast v8, Ljava/util/List;

    .line 246
    .line 247
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    if-eqz p1, :cond_e

    .line 254
    .line 255
    invoke-static {v2, v3, v7, p1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 256
    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_e
    const-string v0, "cache.key"

    .line 260
    .line 261
    :try_start_3
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-interface {v2, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-nez v2, :cond_f

    .line 274
    .line 275
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 280
    .line 281
    .line 282
    :cond_f
    invoke-interface {v4, v7}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 287
    .line 288
    .line 289
    :catchall_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    const/4 v2, 0x1

    .line 294
    if-le v0, v2, :cond_10

    .line 295
    .line 296
    new-instance v12, Li2/z;

    .line 297
    .line 298
    const/16 v0, 0x19

    .line 299
    .line 300
    invoke-direct {v12, v0}, Li2/z;-><init>(I)V

    .line 301
    .line 302
    .line 303
    const/16 v13, 0x1f

    .line 304
    .line 305
    const/4 v9, 0x0

    .line 306
    const/4 v10, 0x0

    .line 307
    const/4 v11, 0x0

    .line 308
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const-string v2, "\u804a\u5929\u5934\u50cf\u53cc\u51fb\u5165\u53e3\u5b9a\u4f4d\u7ed3\u679c\u4e0d\u552f\u4e00: "

    .line 313
    .line 314
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v1, v0, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :cond_10
    :goto_8
    return-object p1
.end method

.method public o()Lcb/c;
    .locals 15

    .line 1
    iget-object v0, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v1, p0, Lcb/f;->b:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v1}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, Ll8/i;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v4

    .line 29
    :goto_0
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const-string v3, "|round_avatar_v1"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v2, v4

    .line 39
    :goto_1
    const-string v3, ""

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    move-object v2, v3

    .line 44
    :cond_2
    const-string v5, "legacy_load"

    .line 45
    .line 46
    invoke-static {v0, v2, v1, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    invoke-static {v6}, Lcb/f;->i(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object v6, v4

    .line 60
    :goto_2
    const-string v7, "worker_constructor"

    .line 61
    .line 62
    invoke-static {v0, v2, v1, v7}, Le8/b;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    invoke-static {v8}, Lcb/f;->k(Ljava/lang/reflect/Constructor;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object v8, v4

    .line 76
    :goto_3
    const-string v9, "worker_modify"

    .line 77
    .line 78
    invoke-static {v0, v2, v1, v9}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    if-eqz v8, :cond_6

    .line 85
    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lcb/f;->l(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    move-object v4, v1

    .line 102
    :cond_5
    new-instance v0, Lcb/c;

    .line 103
    .line 104
    invoke-direct {v0, v6, v8, v4}, Lcb/c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;)V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_6
    const-string v1, "MicroMsg.AvatarDrawable"

    .line 109
    .line 110
    filled-new-array {v1}, [Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p0, v1}, Lcb/f;->c([Ljava/lang/String;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v6, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_8

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    instance-of v10, v8, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    if-eqz v10, :cond_7

    .line 140
    .line 141
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    :cond_9
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_a

    .line 159
    .line 160
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    move-object v10, v8

    .line 165
    check-cast v10, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-static {v10}, Lcb/f;->i(Ljava/lang/reflect/Method;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_9

    .line 172
    .line 173
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    new-instance v6, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v8, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_c

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    move-object v11, v10

    .line 202
    check-cast v11, Ljava/lang/reflect/Method;

    .line 203
    .line 204
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_b

    .line 213
    .line 214
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_c
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Ljava/lang/reflect/Method;

    .line 223
    .line 224
    const/4 v6, 0x1

    .line 225
    const-string v10, "cache.key"

    .line 226
    .line 227
    if-eqz v1, :cond_d

    .line 228
    .line 229
    invoke-static {v0, v2, v5, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_d
    :try_start_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-interface {v0, v10, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    invoke-static {v12, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    if-nez v12, :cond_e

    .line 246
    .line 247
    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-interface {v12, v10, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 252
    .line 253
    .line 254
    :cond_e
    invoke-interface {v11, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    .line 260
    .line 261
    :catchall_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-le v5, v6, :cond_f

    .line 266
    .line 267
    const-string v5, "[Hchat:RoundAvatar] \u65e7\u5f0f\u5934\u50cf\u5165\u53e3\u5019\u9009\u4e0d\u552f\u4e00"

    .line 268
    .line 269
    invoke-static {v5}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_f
    :goto_7
    if-eqz v1, :cond_21

    .line 273
    .line 274
    const-string v5, "workerScope"

    .line 275
    .line 276
    const-string v8, "username"

    .line 277
    .line 278
    filled-new-array {v5, v8}, [Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-virtual {p0, v5}, Lcb/f;->c([Ljava/lang/String;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    new-instance v8, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    :cond_10
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    if-eqz v12, :cond_11

    .line 300
    .line 301
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    instance-of v13, v12, Ljava/lang/reflect/Constructor;

    .line 306
    .line 307
    if-eqz v13, :cond_10

    .line 308
    .line 309
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_11
    new-instance v11, Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    :cond_12
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_13

    .line 327
    .line 328
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    move-object v13, v12

    .line 333
    check-cast v13, Ljava/lang/reflect/Constructor;

    .line 334
    .line 335
    invoke-static {v13}, Lcb/f;->k(Ljava/lang/reflect/Constructor;)Z

    .line 336
    .line 337
    .line 338
    move-result v13

    .line 339
    if-eqz v13, :cond_12

    .line 340
    .line 341
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_13
    new-instance v8, Ljava/util/HashSet;

    .line 346
    .line 347
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 348
    .line 349
    .line 350
    new-instance v12, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    :cond_14
    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    if-eqz v13, :cond_15

    .line 364
    .line 365
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    move-object v14, v13

    .line 370
    check-cast v14, Ljava/lang/reflect/Constructor;

    .line 371
    .line 372
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v14

    .line 376
    invoke-virtual {v8, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    if-eqz v14, :cond_14

    .line 381
    .line 382
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_15
    invoke-static {v12}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    check-cast v8, Ljava/lang/reflect/Constructor;

    .line 391
    .line 392
    if-eqz v8, :cond_1e

    .line 393
    .line 394
    new-instance v3, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    :cond_16
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v10

    .line 407
    if-eqz v10, :cond_17

    .line 408
    .line 409
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    instance-of v11, v10, Ljava/lang/reflect/Method;

    .line 414
    .line 415
    if-eqz v11, :cond_16

    .line 416
    .line 417
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_17
    new-instance v5, Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    :cond_18
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    if-eqz v10, :cond_19

    .line 435
    .line 436
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    move-object v11, v10

    .line 441
    check-cast v11, Ljava/lang/reflect/Method;

    .line 442
    .line 443
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move-result-object v12

    .line 447
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-static {v12, v11}, Lcb/f;->l(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 451
    .line 452
    .line 453
    move-result v11

    .line 454
    if-eqz v11, :cond_18

    .line 455
    .line 456
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_c

    .line 460
    :cond_19
    new-instance v3, Ljava/util/HashSet;

    .line 461
    .line 462
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 463
    .line 464
    .line 465
    new-instance v10, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    :cond_1a
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v11

    .line 478
    if-eqz v11, :cond_1b

    .line 479
    .line 480
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    move-object v12, v11

    .line 485
    check-cast v12, Ljava/lang/reflect/Method;

    .line 486
    .line 487
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v12

    .line 491
    invoke-virtual {v3, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v12

    .line 495
    if-eqz v12, :cond_1a

    .line 496
    .line 497
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_1b
    invoke-static {v10}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    check-cast v3, Ljava/lang/reflect/Method;

    .line 506
    .line 507
    invoke-static {v0, v2, v7, v8}, Le8/b;->i(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    .line 508
    .line 509
    .line 510
    if-eqz v3, :cond_1c

    .line 511
    .line 512
    invoke-static {v0, v2, v9, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 513
    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_1c
    invoke-static {v0, v2, v9}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-le v0, v6, :cond_1d

    .line 524
    .line 525
    const-string v0, "[Hchat:RoundAvatar] \u65b0\u5f0f\u5934\u50cf\u66f4\u65b0\u5165\u53e3\u5019\u9009\u4e0d\u552f\u4e00"

    .line 526
    .line 527
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :cond_1d
    :goto_e
    new-instance v0, Lsf/e;

    .line 531
    .line 532
    invoke-direct {v0, v8, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_1e
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-interface {v0, v10, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-nez v0, :cond_1f

    .line 549
    .line 550
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-interface {v0, v10, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 555
    .line 556
    .line 557
    :cond_1f
    invoke-interface {v5, v7}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 562
    .line 563
    .line 564
    :catchall_1
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-le v0, v6, :cond_20

    .line 569
    .line 570
    const-string v0, "[Hchat:RoundAvatar] \u65b0\u5f0f\u5934\u50cf\u6784\u9020\u5165\u53e3\u5019\u9009\u4e0d\u552f\u4e00"

    .line 571
    .line 572
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    :cond_20
    move-object v0, v4

    .line 576
    :goto_f
    if-eqz v0, :cond_21

    .line 577
    .line 578
    new-instance v2, Lcb/c;

    .line 579
    .line 580
    iget-object v3, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 583
    .line 584
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Ljava/lang/reflect/Method;

    .line 587
    .line 588
    invoke-direct {v2, v1, v3, v0}, Lcb/c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;)V

    .line 589
    .line 590
    .line 591
    return-object v2

    .line 592
    :cond_21
    return-object v4
.end method

.method public p(Z)Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    iget-object v0, p0, Lcb/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lia/t;

    .line 5
    .line 6
    iget-object v0, p0, Lcb/f;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iget-object v0, p0, Lcb/f;->b:Lr8/g;

    .line 12
    .line 13
    iget-object v3, v0, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v4}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v3, v3, Ll8/i;->h:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v3, v6

    .line 35
    :goto_0
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const-string v5, "|block_typing_report_v1_direct_send"

    .line 38
    .line 39
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v3, v6

    .line 45
    :goto_1
    const-string v5, ""

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    :cond_2
    const-string v7, "send_typing_method"

    .line 51
    .line 52
    invoke-static {v2, v3, v4, v7}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    invoke-static {v8}, Lcb/f;->j(Ljava/lang/reflect/Method;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    return-object v8

    .line 65
    :cond_3
    invoke-static {v2, v3, v7}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    if-nez p1, :cond_5

    .line 69
    .line 70
    return-object v6

    .line 71
    :cond_5
    :try_start_0
    iget-object p1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 72
    .line 73
    new-instance v0, Lch/e;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v8, Lfh/k;

    .line 79
    .line 80
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v9, "MicroMsg.SignallingComponent"

    .line 84
    .line 85
    const-string v10, "[doDirectSend] mChattingContext is null!"

    .line 86
    .line 87
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v8, v9}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v8, v0, Lch/e;->h:Lfh/k;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v8, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 120
    .line 121
    :try_start_1
    invoke-virtual {v0, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    goto :goto_3

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    :try_start_2
    new-instance v9, Lsf/f;

    .line 128
    .line 129
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object v0, v9

    .line 133
    :goto_3
    nop

    .line 134
    instance-of v9, v0, Lsf/f;

    .line 135
    .line 136
    if-eqz v9, :cond_7

    .line 137
    .line 138
    move-object v0, v6

    .line 139
    :cond_7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catchall_1
    move-exception v0

    .line 148
    move-object p1, v0

    .line 149
    goto :goto_6

    .line 150
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_a

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    move-object v8, v4

    .line 170
    check-cast v8, Ljava/lang/reflect/Method;

    .line 171
    .line 172
    invoke-static {v8}, Lcb/f;->j(Ljava/lang/reflect/Method;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    new-instance v0, Ljava/util/HashSet;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 185
    .line 186
    .line 187
    new-instance v4, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-eqz v8, :cond_c

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    move-object v9, v8

    .line 207
    check-cast v9, Ljava/lang/reflect/Method;

    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eqz v9, :cond_b

    .line 218
    .line 219
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :goto_6
    new-instance v4, Lsf/f;

    .line 224
    .line 225
    invoke-direct {v4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    :cond_c
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    if-nez p1, :cond_d

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_d
    const-string v0, "\u5b9a\u4f4d\u6b63\u5728\u8f93\u5165\u4e0a\u62a5\u65b9\u6cd5\u5931\u8d25"

    .line 236
    .line 237
    invoke-virtual {v1, v0, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 241
    .line 242
    :goto_7
    move-object v8, v4

    .line 243
    check-cast v8, Ljava/util/List;

    .line 244
    .line 245
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Ljava/lang/reflect/Method;

    .line 250
    .line 251
    if-eqz p1, :cond_e

    .line 252
    .line 253
    invoke-static {v2, v3, v7, p1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 254
    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_e
    const-string v0, "cache.key"

    .line 258
    .line 259
    :try_start_3
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-interface {v2, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_f

    .line 272
    .line 273
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    :cond_f
    invoke-interface {v4, v7}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 285
    .line 286
    .line 287
    :catchall_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const/4 v2, 0x1

    .line 292
    if-le v0, v2, :cond_10

    .line 293
    .line 294
    new-instance v12, Lo9/e;

    .line 295
    .line 296
    const/16 v0, 0x10

    .line 297
    .line 298
    invoke-direct {v12, v0}, Lo9/e;-><init>(I)V

    .line 299
    .line 300
    .line 301
    const/16 v13, 0x1f

    .line 302
    .line 303
    const/4 v9, 0x0

    .line 304
    const/4 v10, 0x0

    .line 305
    const/4 v11, 0x0

    .line 306
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v2, "\u6b63\u5728\u8f93\u5165\u4e0a\u62a5\u65b9\u6cd5\u5b9a\u4f4d\u7ed3\u679c\u4e0d\u552f\u4e00: "

    .line 311
    .line 312
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v1, v0, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    :cond_10
    :goto_8
    return-object p1
.end method

.method public q(Landroid/os/PowerManager$WakeLock;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :goto_1
    new-instance v0, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lcb/f;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lab/b;

    .line 34
    .line 35
    const-string v1, "\u5b9a\u65f6\u4efb\u52a1 WakeLock \u91ca\u653e\u5931\u8d25"

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_3
    return-void
.end method

.method public declared-synchronized r()V
    .locals 61

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v0, v1, Lcb/f;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v0, v1, Lcb/f;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v3, v1, Lcb/f;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3, v2}, Lo8/j;->a(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object v0, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ldb/g;

    .line 66
    .line 67
    invoke-virtual {v0}, Ldb/g;->c()Z

    .line 68
    .line 69
    .line 70
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :cond_3
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ldb/g;

    .line 87
    .line 88
    invoke-virtual {v2}, Ldb/g;->f()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const/4 v9, 0x0

    .line 97
    move v2, v9

    .line 98
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_16

    .line 103
    .line 104
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ldb/c;

    .line 109
    .line 110
    invoke-static {v3}, La2/a;->v(Ldb/c;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v3, v4}, Lcb/f;->v(Ldb/c;Ljava/util/List;)Ldb/c;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v10, v3}, Ldb/c;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/16 v35, 0x1

    .line 123
    .line 124
    if-nez v3, :cond_4

    .line 125
    .line 126
    move/from16 v2, v35

    .line 127
    .line 128
    :cond_4
    iget-object v3, v10, Ldb/c;->m:Ljava/lang/String;

    .line 129
    .line 130
    const-string v4, "running"

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    const-string v23, "pending"

    .line 139
    .line 140
    const/16 v33, 0x0

    .line 141
    .line 142
    const v34, 0x3fefff

    .line 143
    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    const/4 v12, 0x0

    .line 147
    const/4 v13, 0x0

    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    const-wide/16 v16, 0x0

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const/16 v21, 0x0

    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const-wide/16 v24, 0x0

    .line 163
    .line 164
    const/16 v26, 0x0

    .line 165
    .line 166
    const/16 v27, 0x0

    .line 167
    .line 168
    const/16 v28, 0x0

    .line 169
    .line 170
    const/16 v29, 0x0

    .line 171
    .line 172
    const/16 v30, 0x0

    .line 173
    .line 174
    const/16 v31, 0x0

    .line 175
    .line 176
    const/16 v32, 0x0

    .line 177
    .line 178
    invoke-static/range {v10 .. v34}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    move/from16 v2, v35

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto/16 :goto_b

    .line 187
    .line 188
    :cond_5
    :goto_2
    iget-wide v3, v10, Ldb/c;->g:J

    .line 189
    .line 190
    const-wide/16 v11, 0x0

    .line 191
    .line 192
    cmp-long v5, v3, v11

    .line 193
    .line 194
    if-gtz v5, :cond_6

    .line 195
    .line 196
    goto/16 :goto_a

    .line 197
    .line 198
    :cond_6
    iget v5, v10, Ldb/c;->h:I

    .line 199
    .line 200
    const-wide/16 v11, 0x3e8

    .line 201
    .line 202
    if-nez v5, :cond_e

    .line 203
    .line 204
    iget-object v3, v10, Ldb/c;->v:Ljava/util/List;

    .line 205
    .line 206
    new-instance v4, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_a

    .line 220
    .line 221
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    move-object v13, v5

    .line 226
    check-cast v13, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v13

    .line 232
    cmp-long v15, v13, v6

    .line 233
    .line 234
    if-gtz v15, :cond_9

    .line 235
    .line 236
    iget-boolean v15, v10, Ldb/c;->l:Z

    .line 237
    .line 238
    if-eqz v15, :cond_8

    .line 239
    .line 240
    sub-long v13, v6, v13

    .line 241
    .line 242
    const-wide/32 v15, 0x927c0

    .line 243
    .line 244
    .line 245
    cmp-long v13, v13, v15

    .line 246
    .line 247
    if-gez v13, :cond_8

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    move v13, v9

    .line 251
    goto :goto_5

    .line 252
    :cond_9
    :goto_4
    move/from16 v13, v35

    .line 253
    .line 254
    :goto_5
    if-eqz v13, :cond_7

    .line 255
    .line 256
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_a
    iget-object v3, v10, Ldb/c;->v:Ljava/util/List;

    .line 261
    .line 262
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-nez v3, :cond_c

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_b

    .line 273
    .line 274
    goto/16 :goto_a

    .line 275
    .line 276
    :cond_b
    invoke-static {v10, v4}, Lcb/f;->v(Ldb/c;Ljava/util/List;)Ldb/c;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    goto :goto_6

    .line 281
    :cond_c
    move/from16 v35, v2

    .line 282
    .line 283
    :goto_6
    iget-wide v2, v10, Ldb/c;->g:J

    .line 284
    .line 285
    cmp-long v2, v6, v2

    .line 286
    .line 287
    if-ltz v2, :cond_d

    .line 288
    .line 289
    iget-boolean v2, v10, Ldb/c;->l:Z

    .line 290
    .line 291
    if-eqz v2, :cond_14

    .line 292
    .line 293
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v10, v11, v12}, Lcb/f;->s(Ldb/c;J)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_a

    .line 300
    .line 301
    :cond_d
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    iget-wide v2, v10, Ldb/c;->g:J

    .line 305
    .line 306
    sub-long/2addr v2, v6

    .line 307
    invoke-virtual {v1, v10, v2, v3}, Lcb/f;->s(Ldb/c;J)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_a

    .line 311
    .line 312
    :cond_e
    cmp-long v3, v6, v3

    .line 313
    .line 314
    if-ltz v3, :cond_15

    .line 315
    .line 316
    iget-boolean v3, v10, Ldb/c;->l:Z

    .line 317
    .line 318
    if-eqz v3, :cond_f

    .line 319
    .line 320
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v10, v11, v12}, Lcb/f;->s(Ldb/c;J)V

    .line 324
    .line 325
    .line 326
    move/from16 v35, v2

    .line 327
    .line 328
    goto/16 :goto_a

    .line 329
    .line 330
    :cond_f
    iget-object v2, v10, Ldb/c;->v:Ljava/util/List;

    .line 331
    .line 332
    new-instance v11, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v12

    .line 345
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_10

    .line 350
    .line 351
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 358
    .line 359
    .line 360
    move-result-wide v2

    .line 361
    iget v4, v10, Ldb/c;->h:I

    .line 362
    .line 363
    iget-object v5, v10, Ldb/c;->i:Ljava/util/Set;

    .line 364
    .line 365
    invoke-static/range {v2 .. v7}, La2/a;->F(JILjava/util/Set;J)J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    :cond_11
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_13

    .line 391
    .line 392
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    move-object v5, v4

    .line 397
    check-cast v5, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 400
    .line 401
    .line 402
    move-result-wide v11

    .line 403
    cmp-long v5, v11, v6

    .line 404
    .line 405
    if-lez v5, :cond_12

    .line 406
    .line 407
    move/from16 v5, v35

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_12
    move v5, v9

    .line 411
    :goto_9
    if-eqz v5, :cond_11

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-nez v3, :cond_14

    .line 422
    .line 423
    invoke-static {v10, v2}, Lcb/f;->v(Ldb/c;Ljava/util/List;)Ldb/c;

    .line 424
    .line 425
    .line 426
    move-result-object v36

    .line 427
    const-string v49, "pending"

    .line 428
    .line 429
    const/16 v59, 0x0

    .line 430
    .line 431
    const v60, 0x3fefff

    .line 432
    .line 433
    .line 434
    const/16 v37, 0x0

    .line 435
    .line 436
    const/16 v38, 0x0

    .line 437
    .line 438
    const/16 v39, 0x0

    .line 439
    .line 440
    const/16 v40, 0x0

    .line 441
    .line 442
    const/16 v41, 0x0

    .line 443
    .line 444
    const-wide/16 v42, 0x0

    .line 445
    .line 446
    const/16 v44, 0x0

    .line 447
    .line 448
    const/16 v45, 0x0

    .line 449
    .line 450
    const/16 v46, 0x0

    .line 451
    .line 452
    const/16 v47, 0x0

    .line 453
    .line 454
    const/16 v48, 0x0

    .line 455
    .line 456
    const-wide/16 v50, 0x0

    .line 457
    .line 458
    const/16 v52, 0x0

    .line 459
    .line 460
    const/16 v53, 0x0

    .line 461
    .line 462
    const/16 v54, 0x0

    .line 463
    .line 464
    const/16 v55, 0x0

    .line 465
    .line 466
    const/16 v56, 0x0

    .line 467
    .line 468
    const/16 v57, 0x0

    .line 469
    .line 470
    const/16 v58, 0x0

    .line 471
    .line 472
    invoke-static/range {v36 .. v60}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    iget-wide v3, v2, Ldb/c;->g:J

    .line 480
    .line 481
    sub-long/2addr v3, v6

    .line 482
    invoke-virtual {v1, v2, v3, v4}, Lcb/f;->s(Ldb/c;J)V

    .line 483
    .line 484
    .line 485
    :cond_14
    :goto_a
    move/from16 v2, v35

    .line 486
    .line 487
    goto/16 :goto_1

    .line 488
    .line 489
    :cond_15
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    iget-wide v3, v10, Ldb/c;->g:J

    .line 493
    .line 494
    sub-long/2addr v3, v6

    .line 495
    invoke-virtual {v1, v10, v3, v4}, Lcb/f;->s(Ldb/c;J)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_1

    .line 499
    .line 500
    :cond_16
    if-eqz v2, :cond_17

    .line 501
    .line 502
    iget-object v2, v1, Lcb/f;->e:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, Ldb/g;

    .line 505
    .line 506
    invoke-virtual {v2, v0}, Ldb/g;->e(Ljava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 507
    .line 508
    .line 509
    :cond_17
    monitor-exit p0

    .line 510
    return-void

    .line 511
    :goto_b
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 512
    throw v0
.end method

.method public s(Ldb/c;J)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcb/f;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    iget-object v3, v0, Ldb/c;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v5, :cond_c

    .line 17
    .line 18
    const-string v6, "scheduled_task:"

    .line 19
    .line 20
    invoke-static {v6, v3}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    new-instance v8, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    invoke-virtual {v6, v3}, Lo8/j;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v2, v7, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    iget-wide v8, v0, Ldb/c;->g:J

    .line 58
    .line 59
    cmp-long v6, v8, v2

    .line 60
    .line 61
    const-wide/16 v10, 0x0

    .line 62
    .line 63
    if-lez v6, :cond_1

    .line 64
    .line 65
    :goto_0
    move-wide v2, v8

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    cmp-long v6, p2, v10

    .line 68
    .line 69
    if-gez v6, :cond_2

    .line 70
    .line 71
    move-wide v8, v10

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-wide/from16 v8, p2

    .line 74
    .line 75
    :goto_1
    add-long/2addr v8, v2

    .line 76
    goto :goto_0

    .line 77
    :goto_2
    new-instance v12, Ldb/d;

    .line 78
    .line 79
    const/4 v6, 0x1

    .line 80
    invoke-direct {v12, v1, v0, v6}, Ldb/d;-><init>(Lcb/f;Ldb/c;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-lez v0, :cond_3

    .line 88
    .line 89
    move-object v6, v7

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    move-object v6, v4

    .line 92
    :goto_3
    if-nez v6, :cond_4

    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    sub-long/2addr v2, v6

    .line 99
    invoke-virtual {v5, v4, v2, v3, v12}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    invoke-virtual {v5, v6}, Lo8/j;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v5, Lo8/j;->h:Ljava/util/concurrent/atomic/AtomicLong;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 109
    .line 110
    .line 111
    move-result-wide v13

    .line 112
    iget-object v0, v5, Lo8/j;->f:Landroid/content/Context;

    .line 113
    .line 114
    const/4 v15, 0x0

    .line 115
    :try_start_0
    new-instance v7, Landroid/content/Intent;

    .line 116
    .line 117
    const-string v8, "h.Hchat.action.EXACT_TASK"

    .line 118
    .line 119
    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v7, v8}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    new-instance v8, Landroid/net/Uri$Builder;

    .line 130
    .line 131
    invoke-direct {v8}, Landroid/net/Uri$Builder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v9, "hchat-scheduled-task"

    .line 135
    .line 136
    invoke-virtual {v8, v9}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const-string v9, "runtime"

    .line 141
    .line 142
    invoke-virtual {v8, v9}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v8, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v8}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v7, v8}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 155
    .line 156
    .line 157
    const-string v8, "h.Hchat.extra.EXACT_TASK_KEY"

    .line 158
    .line 159
    invoke-virtual {v7, v8, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    .line 161
    .line 162
    const-string v8, "h.Hchat.extra.EXACT_TASK_TOKEN"

    .line 163
    .line 164
    invoke-virtual {v7, v8, v13, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 165
    .line 166
    .line 167
    const/high16 v8, 0xc000000

    .line 168
    .line 169
    invoke-static {v0, v15, v7, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    goto :goto_4

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    new-instance v7, Lsf/f;

    .line 176
    .line 177
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v0, v7

    .line 181
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    if-nez v7, :cond_5

    .line 186
    .line 187
    move-object v4, v0

    .line 188
    goto :goto_5

    .line 189
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v7, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v8, "\u7cbe\u786e\u5b9a\u65f6 PendingIntent \u521b\u5efa\u5931\u8d25: "

    .line 196
    .line 197
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v5, v0}, Lo8/j;->c(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :goto_5
    move-object/from16 v16, v4

    .line 211
    .line 212
    check-cast v16, Landroid/app/PendingIntent;

    .line 213
    .line 214
    if-nez v16, :cond_6

    .line 215
    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 217
    .line 218
    .line 219
    move-result-wide v7

    .line 220
    sub-long/2addr v2, v7

    .line 221
    invoke-virtual {v5, v6, v2, v3, v12}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_6
    new-instance v4, Lca/r;

    .line 227
    .line 228
    const/4 v9, 0x4

    .line 229
    move-wide v7, v13

    .line 230
    invoke-direct/range {v4 .. v9}, Lca/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 231
    .line 232
    .line 233
    move-object/from16 v17, v12

    .line 234
    .line 235
    new-instance v12, Lo8/i;

    .line 236
    .line 237
    move-object/from16 v18, v16

    .line 238
    .line 239
    move-object/from16 v16, v4

    .line 240
    .line 241
    move v4, v15

    .line 242
    move-object/from16 v15, v18

    .line 243
    .line 244
    invoke-direct/range {v12 .. v17}, Lo8/i;-><init>(JLandroid/app/PendingIntent;Lca/r;Ldb/d;)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v0, v16

    .line 248
    .line 249
    iget-object v7, v5, Lo8/j;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 250
    .line 251
    invoke-virtual {v7, v6, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    iget-object v6, v5, Lo8/j;->a:Landroid/os/Handler;

    .line 255
    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    sub-long v7, v2, v7

    .line 261
    .line 262
    cmp-long v9, v7, v10

    .line 263
    .line 264
    if-gez v9, :cond_7

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_7
    move-wide v10, v7

    .line 268
    :goto_6
    invoke-virtual {v6, v0, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 269
    .line 270
    .line 271
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 272
    .line 273
    iget-object v7, v5, Lo8/j;->g:Landroid/app/AlarmManager;

    .line 274
    .line 275
    if-eqz v7, :cond_a

    .line 276
    .line 277
    iget-boolean v0, v5, Lo8/j;->i:Z

    .line 278
    .line 279
    if-nez v0, :cond_8

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    cmp-long v0, v2, v8

    .line 287
    .line 288
    if-gez v0, :cond_9

    .line 289
    .line 290
    move-wide v2, v8

    .line 291
    :cond_9
    :try_start_1
    invoke-virtual {v7, v4, v2, v3, v15}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 292
    .line 293
    .line 294
    move-object v8, v6

    .line 295
    goto :goto_7

    .line 296
    :catchall_1
    move-exception v0

    .line 297
    new-instance v8, Lsf/f;

    .line 298
    .line 299
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    :goto_7
    invoke-static {v8}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    if-eqz v8, :cond_b

    .line 307
    .line 308
    :try_start_2
    invoke-virtual {v7, v4, v2, v3, v15}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :catchall_2
    move-exception v0

    .line 313
    new-instance v6, Lsf/f;

    .line 314
    .line 315
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    :goto_8
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-eqz v0, :cond_b

    .line 323
    .line 324
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v3, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v4, "\u7cbe\u786e\u5b9a\u65f6\u5b89\u88c5\u5931\u8d25: exact="

    .line 335
    .line 336
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    const-string v2, ", fallback="

    .line 343
    .line 344
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v5, v0}, Lo8/j;->c(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_a
    :goto_9
    const-string v0, "\u7cbe\u786e\u5b9a\u65f6\u4e0d\u53ef\u7528\uff0c\u5df2\u56de\u9000\u8fdb\u7a0b\u5185\u8c03\u5ea6"

    .line 359
    .line 360
    invoke-virtual {v5, v0}, Lo8/j;->c(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :cond_b
    :goto_a
    return-void

    .line 364
    :cond_c
    iget-object v0, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, Lab/b;

    .line 367
    .line 368
    const-string v2, "\u5b9a\u65f6\u4efb\u52a1\u516c\u5171\u8c03\u5ea6\u4e0d\u53ef\u7528"

    .line 369
    .line 370
    invoke-virtual {v0, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    return-void
.end method

.method public t(Ldb/c;)Lsf/e;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v4, v2, Ldb/c;->r:I

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v7, 0x4

    .line 18
    const/4 v8, 0x3

    .line 19
    const-string v9, ""

    .line 20
    .line 21
    const/4 v10, 0x2

    .line 22
    const/4 v11, 0x0

    .line 23
    if-ne v4, v5, :cond_13

    .line 24
    .line 25
    iget-object v4, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lab/b;

    .line 28
    .line 29
    invoke-static {v2}, La2/a;->o(Ldb/c;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v12

    .line 33
    if-eqz v12, :cond_0

    .line 34
    .line 35
    const-string v2, "\u670b\u53cb\u5708\u5b9a\u65f6\u4efb\u52a1\u914d\u7f6e\u65e0\u6548: "

    .line 36
    .line 37
    invoke-virtual {v2, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v4, v2, v11}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    if-eqz v12, :cond_11

    .line 51
    .line 52
    iget-object v13, v12, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 53
    .line 54
    invoke-virtual {v13}, Lh/Hchat/dexkit/DexFinder;->hasSnsUploadApi()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-ne v13, v5, :cond_11

    .line 59
    .line 60
    invoke-static {v2}, La2/a;->u(Ldb/c;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    :cond_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    if-eqz v14, :cond_2

    .line 73
    .line 74
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    move-object v15, v14

    .line 79
    check-cast v15, Ldb/a;

    .line 80
    .line 81
    iget v15, v15, Ldb/a;->a:I

    .line 82
    .line 83
    if-nez v15, :cond_1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move-object v14, v11

    .line 87
    :goto_0
    check-cast v14, Ldb/a;

    .line 88
    .line 89
    if-eqz v14, :cond_3

    .line 90
    .line 91
    iget-object v13, v14, Ldb/a;->b:Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move-object v13, v11

    .line 95
    :goto_1
    if-nez v13, :cond_4

    .line 96
    .line 97
    move-object v13, v9

    .line 98
    :cond_4
    new-instance v14, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v16

    .line 111
    if-eqz v16, :cond_6

    .line 112
    .line 113
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    move-object v11, v3

    .line 118
    check-cast v11, Ldb/a;

    .line 119
    .line 120
    iget v11, v11, Ldb/a;->a:I

    .line 121
    .line 122
    if-ne v11, v5, :cond_5

    .line 123
    .line 124
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_5
    const/4 v3, 0x0

    .line 128
    const/4 v11, 0x0

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-static {v14}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_7

    .line 148
    .line 149
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Ldb/a;

    .line 154
    .line 155
    iget-object v14, v14, Ldb/a;->b:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_9

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    move-object v14, v11

    .line 176
    check-cast v14, Ldb/a;

    .line 177
    .line 178
    iget v14, v14, Ldb/a;->a:I

    .line 179
    .line 180
    if-ne v14, v10, :cond_8

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_9
    const/4 v11, 0x0

    .line 184
    :goto_4
    check-cast v11, Ldb/a;

    .line 185
    .line 186
    if-eqz v11, :cond_a

    .line 187
    .line 188
    iget-object v11, v11, Ldb/a;->b:Ljava/lang/String;

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_a
    const/4 v11, 0x0

    .line 192
    :goto_5
    if-nez v11, :cond_b

    .line 193
    .line 194
    move-object v11, v9

    .line 195
    :cond_b
    iget v2, v2, Ldb/c;->s:I

    .line 196
    .line 197
    if-eqz v2, :cond_10

    .line 198
    .line 199
    if-eq v2, v5, :cond_f

    .line 200
    .line 201
    if-eq v2, v10, :cond_e

    .line 202
    .line 203
    if-eq v2, v8, :cond_d

    .line 204
    .line 205
    if-eq v2, v7, :cond_c

    .line 206
    .line 207
    :goto_6
    const/4 v3, 0x0

    .line 208
    goto :goto_7

    .line 209
    :cond_c
    invoke-virtual {v12, v9, v11, v9, v9}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    goto :goto_7

    .line 214
    :cond_d
    invoke-virtual {v12, v9, v3, v9, v9}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    goto :goto_7

    .line 219
    :cond_e
    invoke-virtual {v12, v13, v11, v9, v9}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    goto :goto_7

    .line 224
    :cond_f
    invoke-virtual {v12, v13, v3, v9, v9}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    goto :goto_7

    .line 229
    :cond_10
    invoke-virtual {v12, v13, v9, v9}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    goto :goto_7

    .line 234
    :cond_11
    const-string v2, "\u670b\u53cb\u5708\u5b9a\u65f6\u4efb\u52a1\u516c\u5171 API \u4e0d\u53ef\u7528"

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    invoke-virtual {v4, v2, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    goto :goto_6

    .line 241
    :goto_7
    if-eqz v3, :cond_12

    .line 242
    .line 243
    new-instance v2, Lsf/e;

    .line 244
    .line 245
    invoke-direct {v2, v6, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-object v2

    .line 249
    :cond_12
    new-instance v2, Lsf/e;

    .line 250
    .line 251
    invoke-direct {v2, v0, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-object v2

    .line 255
    :cond_13
    invoke-static {v2}, La2/a;->t(Ldb/c;)Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    const/16 v6, 0x8

    .line 264
    .line 265
    if-eqz v4, :cond_15

    .line 266
    .line 267
    :cond_14
    const/4 v4, 0x0

    .line 268
    goto :goto_9

    .line 269
    :cond_15
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    :cond_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-eqz v11, :cond_14

    .line 278
    .line 279
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    check-cast v11, Ldb/a;

    .line 284
    .line 285
    iget v11, v11, Ldb/a;->a:I

    .line 286
    .line 287
    if-ne v11, v6, :cond_17

    .line 288
    .line 289
    move v11, v5

    .line 290
    goto :goto_8

    .line 291
    :cond_17
    const/4 v11, 0x0

    .line 292
    :goto_8
    if-eqz v11, :cond_16

    .line 293
    .line 294
    move v4, v5

    .line 295
    :goto_9
    if-eqz v4, :cond_27

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_19

    .line 302
    .line 303
    :cond_18
    const/16 v16, 0x0

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-eqz v7, :cond_18

    .line 315
    .line 316
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    check-cast v7, Ldb/a;

    .line 321
    .line 322
    iget v7, v7, Ldb/a;->a:I

    .line 323
    .line 324
    if-eq v7, v6, :cond_1b

    .line 325
    .line 326
    move v7, v5

    .line 327
    goto :goto_a

    .line 328
    :cond_1b
    const/4 v7, 0x0

    .line 329
    :goto_a
    if-eqz v7, :cond_1a

    .line 330
    .line 331
    move/from16 v16, v5

    .line 332
    .line 333
    :goto_b
    if-eqz v16, :cond_1c

    .line 334
    .line 335
    iget-object v3, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v3, Lab/b;

    .line 338
    .line 339
    const-string v4, "\u81ea\u9009\u804a\u5929\u8bb0\u5f55\u5b9a\u65f6\u4efb\u52a1\u4e0d\u80fd\u4e0e\u666e\u901a\u5185\u5bb9\u6df7\u5408"

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-virtual {v3, v4, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    invoke-static {v2}, Lcb/f;->b(Ldb/c;)I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    new-instance v3, Lsf/e;

    .line 354
    .line 355
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    return-object v3

    .line 359
    :cond_1c
    new-instance v4, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    :cond_1d
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-eqz v7, :cond_1e

    .line 373
    .line 374
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    check-cast v7, Ldb/a;

    .line 379
    .line 380
    iget-object v7, v7, Ldb/a;->b:Ljava/lang/String;

    .line 381
    .line 382
    invoke-static {v7}, Lx6/d;->s(Ljava/lang/String;)Lhb/t;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    if-eqz v7, :cond_1d

    .line 387
    .line 388
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_1e
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-ne v6, v3, :cond_26

    .line 401
    .line 402
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_1f

    .line 407
    .line 408
    goto/16 :goto_e

    .line 409
    .line 410
    :cond_1f
    iget v3, v2, Ldb/c;->u:I

    .line 411
    .line 412
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    if-eqz v6, :cond_20

    .line 417
    .line 418
    const-string v3, "\u8bf7\u9009\u62e9\u53d1\u9001\u5185\u5bb9"

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_20
    sget-object v6, La/a;->g:Lhb/k0;

    .line 422
    .line 423
    if-eqz v6, :cond_24

    .line 424
    .line 425
    if-eq v3, v5, :cond_21

    .line 426
    .line 427
    const/4 v3, 0x0

    .line 428
    goto :goto_d

    .line 429
    :cond_21
    iget-object v3, v6, Lhb/k0;->c:Lhb/k;

    .line 430
    .line 431
    invoke-virtual {v3}, Lhb/k;->g()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-nez v3, :cond_22

    .line 436
    .line 437
    const-string v3, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u4e0d\u53ef\u7528"

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_22
    iget-object v3, v6, Lhb/k0;->c:Lhb/k;

    .line 441
    .line 442
    invoke-virtual {v3, v4}, Lhb/k;->o(Ljava/util/List;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-nez v3, :cond_23

    .line 451
    .line 452
    const/4 v11, 0x0

    .line 453
    const/16 v12, 0x3e

    .line 454
    .line 455
    const-string v8, "\u3001"

    .line 456
    .line 457
    const/4 v9, 0x0

    .line 458
    const/4 v10, 0x0

    .line 459
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    const-string v5, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301: "

    .line 464
    .line 465
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    goto :goto_d

    .line 470
    :cond_23
    iget-object v3, v6, Lhb/k0;->c:Lhb/k;

    .line 471
    .line 472
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-static {v4}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    goto :goto_d

    .line 480
    :cond_24
    const-string v3, "\u7fa4\u53d1\u52a9\u624b\u5c1a\u672a\u5c31\u7eea"

    .line 481
    .line 482
    :goto_d
    if-eqz v3, :cond_25

    .line 483
    .line 484
    iget-object v4, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v4, Lab/b;

    .line 487
    .line 488
    const-string v5, "\u5b9a\u65f6\u8f6c\u53d1\u914d\u7f6e\u65e0\u6548: "

    .line 489
    .line 490
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    const/4 v5, 0x0

    .line 495
    invoke-virtual {v4, v3, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    invoke-static {v2}, Lcb/f;->b(Ldb/c;)I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    new-instance v3, Lsf/e;

    .line 507
    .line 508
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v3

    .line 512
    :cond_25
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    iget-object v3, v2, Ldb/c;->f:Ljava/util/List;

    .line 517
    .line 518
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    new-instance v5, Ldb/e;

    .line 523
    .line 524
    invoke-direct {v5, v2, v4}, Ldb/e;-><init>(Ldb/c;Ljava/util/ArrayList;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v0, v3, v5}, Lcb/f;->a(IILfg/l;)Lsf/e;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    return-object v0

    .line 532
    :cond_26
    :goto_e
    iget-object v3, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v3, Lab/b;

    .line 535
    .line 536
    const-string v4, "\u81ea\u9009\u804a\u5929\u8bb0\u5f55\u5b9a\u65f6\u4efb\u52a1\u5feb\u7167\u65e0\u6548"

    .line 537
    .line 538
    const/4 v5, 0x0

    .line 539
    invoke-virtual {v3, v4, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    invoke-static {v2}, Lcb/f;->b(Ldb/c;)I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    new-instance v3, Lsf/e;

    .line 551
    .line 552
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return-object v3

    .line 556
    :cond_27
    iget v4, v2, Ldb/c;->u:I

    .line 557
    .line 558
    if-ne v4, v5, :cond_29

    .line 559
    .line 560
    invoke-static {v5, v3}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    if-eqz v4, :cond_28

    .line 565
    .line 566
    iget-object v3, v1, Lcb/f;->d:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v3, Lab/b;

    .line 569
    .line 570
    const-string v5, "\u5fae\u4fe1\u539f\u751f\u5b9a\u65f6\u4efb\u52a1\u914d\u7f6e\u65e0\u6548: "

    .line 571
    .line 572
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    const/4 v5, 0x0

    .line 577
    invoke-virtual {v3, v4, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    invoke-static {v2}, Lcb/f;->b(Ldb/c;)I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    new-instance v3, Lsf/e;

    .line 589
    .line 590
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    return-object v3

    .line 594
    :cond_28
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    iget-object v4, v2, Ldb/c;->f:Ljava/util/List;

    .line 599
    .line 600
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    new-instance v5, Ldb/e;

    .line 605
    .line 606
    invoke-direct {v5, v3, v2}, Ldb/e;-><init>(Ljava/util/ArrayList;Ldb/c;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v0, v4, v5}, Lcb/f;->a(IILfg/l;)Lsf/e;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    return-object v0

    .line 614
    :cond_29
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    if-eqz v0, :cond_2a

    .line 619
    .line 620
    :goto_f
    move-object v3, v0

    .line 621
    goto :goto_10

    .line 622
    :cond_2a
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    goto :goto_f

    .line 627
    :goto_10
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    iget-object v0, v2, Ldb/c;->f:Ljava/util/List;

    .line 632
    .line 633
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    const/4 v11, 0x0

    .line 638
    const/4 v12, 0x0

    .line 639
    const/4 v13, 0x0

    .line 640
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-eqz v0, :cond_45

    .line 645
    .line 646
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    add-int/lit8 v14, v11, 0x1

    .line 651
    .line 652
    if-ltz v11, :cond_44

    .line 653
    .line 654
    move-object v15, v0

    .line 655
    check-cast v15, Ljava/lang/String;

    .line 656
    .line 657
    invoke-static {v2}, La2/a;->t(Ldb/c;)Ljava/util/ArrayList;

    .line 658
    .line 659
    .line 660
    move-result-object v18

    .line 661
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    const-wide/16 v20, 0x0

    .line 666
    .line 667
    const-wide/16 v22, 0x3e8

    .line 668
    .line 669
    if-eqz v0, :cond_2b

    .line 670
    .line 671
    move-object/from16 v26, v6

    .line 672
    .line 673
    move-object v1, v9

    .line 674
    move/from16 v19, v10

    .line 675
    .line 676
    const/4 v5, 0x0

    .line 677
    const/4 v10, 0x0

    .line 678
    goto/16 :goto_1d

    .line 679
    .line 680
    :cond_2b
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    if-eqz v0, :cond_2c

    .line 692
    .line 693
    invoke-virtual {v0, v15}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 697
    goto :goto_13

    .line 698
    :catchall_0
    move-exception v0

    .line 699
    goto :goto_12

    .line 700
    :cond_2c
    const/4 v0, 0x0

    .line 701
    goto :goto_13

    .line 702
    :goto_12
    new-instance v7, Lsf/f;

    .line 703
    .line 704
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 705
    .line 706
    .line 707
    move-object v0, v7

    .line 708
    :goto_13
    nop

    .line 709
    instance-of v7, v0, Lsf/f;

    .line 710
    .line 711
    if-eqz v7, :cond_2d

    .line 712
    .line 713
    const/4 v0, 0x0

    .line 714
    :cond_2d
    check-cast v0, Ljava/lang/String;

    .line 715
    .line 716
    if-nez v0, :cond_2e

    .line 717
    .line 718
    move-object v0, v9

    .line 719
    :cond_2e
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 720
    .line 721
    .line 722
    move-result v7

    .line 723
    if-eqz v7, :cond_2f

    .line 724
    .line 725
    move-object v0, v15

    .line 726
    :cond_2f
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 727
    .line 728
    .line 729
    move-result-object v7

    .line 730
    const/4 v8, 0x0

    .line 731
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v24

    .line 735
    if-eqz v24, :cond_40

    .line 736
    .line 737
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v24

    .line 741
    add-int/lit8 v25, v8, 0x1

    .line 742
    .line 743
    if-ltz v8, :cond_3f

    .line 744
    .line 745
    move-object/from16 v10, v24

    .line 746
    .line 747
    check-cast v10, Ldb/a;

    .line 748
    .line 749
    iget v5, v10, Ldb/a;->a:I

    .line 750
    .line 751
    iget-object v1, v10, Ldb/a;->b:Ljava/lang/String;

    .line 752
    .line 753
    move/from16 v27, v5

    .line 754
    .line 755
    const-string v5, "%friendName%"

    .line 756
    .line 757
    packed-switch v27, :pswitch_data_0

    .line 758
    .line 759
    .line 760
    :cond_30
    :goto_15
    move-object/from16 v26, v6

    .line 761
    .line 762
    const/4 v6, 0x4

    .line 763
    :goto_16
    const/4 v10, 0x0

    .line 764
    const/16 v16, 0x0

    .line 765
    .line 766
    :goto_17
    const/16 v19, 0x2

    .line 767
    .line 768
    goto/16 :goto_1a

    .line 769
    .line 770
    :pswitch_0
    if-eqz v4, :cond_30

    .line 771
    .line 772
    iget-object v5, v4, Lj8/p;->f:Lj8/h;

    .line 773
    .line 774
    if-eqz v5, :cond_30

    .line 775
    .line 776
    invoke-virtual {v5, v15, v1}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    const/4 v5, 0x1

    .line 781
    if-ne v1, v5, :cond_30

    .line 782
    .line 783
    move-object/from16 v26, v6

    .line 784
    .line 785
    const/4 v6, 0x4

    .line 786
    const/4 v10, 0x0

    .line 787
    const/16 v16, 0x1

    .line 788
    .line 789
    goto :goto_17

    .line 790
    :pswitch_1
    if-nez v3, :cond_31

    .line 791
    .line 792
    goto :goto_15

    .line 793
    :cond_31
    const/4 v10, 0x0

    .line 794
    invoke-static {v1, v5, v0, v10}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 799
    .line 800
    .line 801
    move-result v5

    .line 802
    if-eqz v5, :cond_32

    .line 803
    .line 804
    goto :goto_15

    .line 805
    :cond_32
    invoke-virtual {v3, v15, v1}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    move/from16 v16, v1

    .line 810
    .line 811
    move-object/from16 v26, v6

    .line 812
    .line 813
    const/4 v6, 0x4

    .line 814
    :goto_18
    const/4 v10, 0x0

    .line 815
    goto :goto_17

    .line 816
    :pswitch_2
    if-nez v4, :cond_33

    .line 817
    .line 818
    goto :goto_15

    .line 819
    :cond_33
    new-instance v5, Ljava/io/File;

    .line 820
    .line 821
    invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 825
    .line 826
    .line 827
    move-result v27

    .line 828
    if-nez v27, :cond_34

    .line 829
    .line 830
    goto :goto_15

    .line 831
    :cond_34
    iget v10, v10, Ldb/a;->a:I

    .line 832
    .line 833
    move-object/from16 v27, v5

    .line 834
    .line 835
    const/4 v5, 0x1

    .line 836
    if-eq v10, v5, :cond_39

    .line 837
    .line 838
    const/4 v5, 0x2

    .line 839
    if-eq v10, v5, :cond_38

    .line 840
    .line 841
    move-object/from16 v26, v6

    .line 842
    .line 843
    const/4 v6, 0x3

    .line 844
    if-eq v10, v6, :cond_37

    .line 845
    .line 846
    const/4 v6, 0x4

    .line 847
    if-eq v10, v6, :cond_36

    .line 848
    .line 849
    const/4 v5, 0x5

    .line 850
    if-eq v10, v5, :cond_35

    .line 851
    .line 852
    goto :goto_16

    .line 853
    :cond_35
    iget-object v5, v4, Lj8/p;->b:Lj8/y;

    .line 854
    .line 855
    invoke-virtual {v5, v15, v1}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    :goto_19
    move/from16 v16, v1

    .line 860
    .line 861
    goto :goto_18

    .line 862
    :cond_36
    iget-object v5, v4, Lj8/p;->d:Lj8/f;

    .line 863
    .line 864
    invoke-virtual {v5, v15, v1}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 865
    .line 866
    .line 867
    move-result v1

    .line 868
    goto :goto_19

    .line 869
    :cond_37
    const/4 v6, 0x4

    .line 870
    invoke-virtual/range {v27 .. v27}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v5

    .line 874
    iget-object v10, v4, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 875
    .line 876
    invoke-virtual {v10, v15, v1, v5}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 877
    .line 878
    .line 879
    move-result v1

    .line 880
    goto :goto_19

    .line 881
    :cond_38
    move-object/from16 v26, v6

    .line 882
    .line 883
    const/4 v6, 0x4

    .line 884
    iget-object v5, v4, Lj8/p;->c:Lbb/b;

    .line 885
    .line 886
    invoke-virtual {v5, v15, v1}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    goto :goto_19

    .line 891
    :cond_39
    move-object/from16 v26, v6

    .line 892
    .line 893
    const/4 v6, 0x4

    .line 894
    invoke-virtual {v4, v15, v1}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    goto :goto_19

    .line 899
    :pswitch_3
    move-object/from16 v26, v6

    .line 900
    .line 901
    const/4 v6, 0x4

    .line 902
    const/16 v19, 0x2

    .line 903
    .line 904
    if-nez v3, :cond_3a

    .line 905
    .line 906
    const/4 v10, 0x0

    .line 907
    const/16 v16, 0x0

    .line 908
    .line 909
    goto :goto_1a

    .line 910
    :cond_3a
    const/4 v10, 0x0

    .line 911
    invoke-static {v1, v5, v0, v10}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 916
    .line 917
    .line 918
    move-result v5

    .line 919
    if-eqz v5, :cond_3b

    .line 920
    .line 921
    move/from16 v16, v10

    .line 922
    .line 923
    goto :goto_1a

    .line 924
    :cond_3b
    invoke-virtual {v3, v15, v1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    move/from16 v16, v1

    .line 929
    .line 930
    :goto_1a
    if-nez v16, :cond_3c

    .line 931
    .line 932
    move-object v1, v9

    .line 933
    move v5, v10

    .line 934
    goto :goto_1d

    .line 935
    :cond_3c
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    .line 936
    .line 937
    .line 938
    move-result v1

    .line 939
    const/16 v24, 0x1

    .line 940
    .line 941
    add-int/lit8 v1, v1, -0x1

    .line 942
    .line 943
    if-ge v8, v1, :cond_3e

    .line 944
    .line 945
    iget v1, v2, Ldb/c;->k:I

    .line 946
    .line 947
    move-object v5, v7

    .line 948
    int-to-long v6, v1

    .line 949
    mul-long v6, v6, v22

    .line 950
    .line 951
    cmp-long v1, v6, v20

    .line 952
    .line 953
    if-gtz v1, :cond_3d

    .line 954
    .line 955
    goto :goto_1b

    .line 956
    :cond_3d
    move-object v1, v9

    .line 957
    const-wide/32 v8, 0x36ee80

    .line 958
    .line 959
    .line 960
    :try_start_1
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 961
    .line 962
    .line 963
    move-result-wide v6

    .line 964
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 965
    .line 966
    .line 967
    goto :goto_1c

    .line 968
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 969
    .line 970
    .line 971
    move-result-object v6

    .line 972
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 973
    .line 974
    .line 975
    goto :goto_1c

    .line 976
    :cond_3e
    move-object v5, v7

    .line 977
    :goto_1b
    move-object v1, v9

    .line 978
    :goto_1c
    move-object v9, v1

    .line 979
    move-object v7, v5

    .line 980
    move/from16 v10, v19

    .line 981
    .line 982
    move/from16 v8, v25

    .line 983
    .line 984
    move-object/from16 v6, v26

    .line 985
    .line 986
    const/4 v5, 0x1

    .line 987
    move-object/from16 v1, p0

    .line 988
    .line 989
    goto/16 :goto_14

    .line 990
    .line 991
    :cond_3f
    invoke-static {}, La/a;->Q0()V

    .line 992
    .line 993
    .line 994
    const/16 v17, 0x0

    .line 995
    .line 996
    throw v17

    .line 997
    :cond_40
    move-object/from16 v26, v6

    .line 998
    .line 999
    move-object v1, v9

    .line 1000
    move/from16 v19, v10

    .line 1001
    .line 1002
    const/4 v10, 0x0

    .line 1003
    const/4 v5, 0x1

    .line 1004
    :goto_1d
    if-eqz v5, :cond_41

    .line 1005
    .line 1006
    add-int/lit8 v12, v12, 0x1

    .line 1007
    .line 1008
    goto :goto_1e

    .line 1009
    :cond_41
    add-int/lit8 v13, v13, 0x1

    .line 1010
    .line 1011
    :goto_1e
    iget-object v0, v2, Ldb/c;->f:Ljava/util/List;

    .line 1012
    .line 1013
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    const/16 v24, 0x1

    .line 1018
    .line 1019
    add-int/lit8 v0, v0, -0x1

    .line 1020
    .line 1021
    if-ge v11, v0, :cond_43

    .line 1022
    .line 1023
    iget v0, v2, Ldb/c;->j:I

    .line 1024
    .line 1025
    int-to-long v5, v0

    .line 1026
    mul-long v5, v5, v22

    .line 1027
    .line 1028
    cmp-long v0, v5, v20

    .line 1029
    .line 1030
    if-gtz v0, :cond_42

    .line 1031
    .line 1032
    goto :goto_1f

    .line 1033
    :cond_42
    const-wide/32 v8, 0x36ee80

    .line 1034
    .line 1035
    .line 1036
    :try_start_2
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 1037
    .line 1038
    .line 1039
    move-result-wide v5

    .line 1040
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1041
    .line 1042
    .line 1043
    goto :goto_1f

    .line 1044
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1049
    .line 1050
    .line 1051
    :cond_43
    :goto_1f
    move-object v9, v1

    .line 1052
    move v11, v14

    .line 1053
    move/from16 v10, v19

    .line 1054
    .line 1055
    move/from16 v5, v24

    .line 1056
    .line 1057
    move-object/from16 v6, v26

    .line 1058
    .line 1059
    const/4 v7, 0x4

    .line 1060
    const/4 v8, 0x3

    .line 1061
    move-object/from16 v1, p0

    .line 1062
    .line 1063
    goto/16 :goto_11

    .line 1064
    .line 1065
    :cond_44
    invoke-static {}, La/a;->Q0()V

    .line 1066
    .line 1067
    .line 1068
    const/16 v17, 0x0

    .line 1069
    .line 1070
    throw v17

    .line 1071
    :cond_45
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    new-instance v2, Lsf/e;

    .line 1080
    .line 1081
    invoke-direct {v2, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1082
    .line 1083
    .line 1084
    return-object v2

    .line 1085
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
