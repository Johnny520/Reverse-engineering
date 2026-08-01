.class public final Lr0/D1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final a:Ljava/util/WeakHashMap;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/WeakHashMap;

.field public final h:Ljava/util/WeakHashMap;

.field public i:Z

.field public j:I

.field public k:I

.field public l:Landroid/content/Context;

.field public m:LA0/b0;

.field public final n:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/D1;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lr0/D1;->b:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lr0/D1;->c:Ljava/util/Set;

    .line 32
    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lr0/D1;->d:Ljava/util/Set;

    .line 43
    .line 44
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lr0/D1;->e:Ljava/util/Set;

    .line 54
    .line 55
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lr0/D1;->f:Ljava/util/Set;

    .line 65
    .line 66
    new-instance v0, Ljava/util/WeakHashMap;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    new-instance v0, Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lr0/D1;->h:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lr0/D1;->n:Ljava/util/Set;

    .line 90
    .line 91
    return-void
.end method

.method public static C(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "wxid_"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "@chatroom"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "gh_"

    .line 20
    .line 21
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "@openim"

    .line 28
    .line 29
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return v1

    .line 37
    :cond_1
    :goto_0
    return v2
.end method

.method public static E(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    if-gez p0, :cond_1

    .line 6
    .line 7
    :goto_0
    return-object v0

    .line 8
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_6

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/reflect/Field;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 v3, 0x1

    .line 44
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    instance-of v3, v2, Ljava/util/List;

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    move-object v3, v2

    .line 56
    check-cast v3, Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ge p0, v3, :cond_4

    .line 63
    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_3

    .line 71
    :catchall_0
    move-exception v2

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, v0

    .line 74
    goto :goto_3

    .line 75
    :goto_2
    new-instance v3, LE0/d;

    .line 76
    .line 77
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v2, v3

    .line 81
    :goto_3
    nop

    .line 82
    instance-of v3, v2, LE0/d;

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    move-object v2, v0

    .line 87
    :cond_5
    if-eqz v2, :cond_2

    .line 88
    .line 89
    move-object v0, v2

    .line 90
    :cond_6
    return-object v0
.end method

.method public static F(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/reflect/Field;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    new-instance v3, LE0/d;

    .line 40
    .line 41
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_1
    nop

    .line 46
    instance-of v3, v2, LE0/d;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    move-object v2, v0

    .line 51
    :cond_2
    if-nez v2, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    instance-of v3, v2, Landroid/view/View;

    .line 55
    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    const-string v3, "android."

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static {v2, v3, v4}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 69
    .line 70
    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v2, v4, v3}, Lr0/D1;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static K()Z
    .locals 4

    .line 1
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v1, v0

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sput-object v1, Lz0/r;->f:Ljava/lang/String;

    .line 48
    .line 49
    :cond_1
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 50
    .line 51
    const-string v1, "8.0.65"

    .line 52
    .line 53
    invoke-static {v0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    const-string v1, "8.0.66"

    .line 60
    .line 61
    invoke-static {v0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    return v2

    .line 69
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 70
    return v0
.end method

.method public static L(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, LU0/i;->u0(Ljava/lang/String;[C)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v2, v1

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2}, Lr0/D1;->C(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {p0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :array_0
    .array-data 2
        0x2cs
        0x3bs
        0x7cs
        0x20s
        0xas
        0x9s
        0x3as
        0x3ds
        0x28s
        0x29s
        0x5bs
        0x5ds
    .end array-data
.end method

.method public static final a(Lr0/D1;Landroid/app/Activity;)V
    .locals 8

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-array v2, v0, [J

    .line 19
    .line 20
    fill-array-data v2, :array_0

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v0, :cond_1

    .line 25
    .line 26
    aget-wide v4, v2, v3

    .line 27
    .line 28
    new-instance v6, LA0/m;

    .line 29
    .line 30
    const/16 v7, 0x9

    .line 31
    .line 32
    invoke-direct {v6, p0, p1, v7}, LA0/m;-><init>(Le0/a;Landroid/app/Activity;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v6, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    return-void

    .line 42
    nop

    .line 43
    :array_0
    .array-data 8
        0x0
        0x50
        0xc8
        0x1f4
        0x3e8
    .end array-data
.end method

.method public static b(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredFields(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static c(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static d()Ljava/util/Set;
    .locals 5

    .line 1
    const-class v0, Lq0/h;

    .line 2
    .line 3
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lq0/h;

    .line 8
    .line 9
    invoke-virtual {v1}, Lq0/h;->c()V

    .line 10
    .line 11
    .line 12
    sget-boolean v1, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->s()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v0, LF0/s;->a:LF0/s;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lq0/h;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 v2, 0x0

    .line 70
    :goto_2
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v3, v2

    .line 96
    check-cast v3, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    sget-boolean v4, Lz0/i;->a:Z

    .line 105
    .line 106
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public static h(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;
    .locals 6

    .line 1
    sget-object v0, LF0/u;->a:LF0/u;

    .line 2
    .line 3
    if-eqz p0, :cond_9

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of v1, p0, Ljava/util/Collection;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Iterable;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    add-int/lit8 v3, p1, 0x1

    .line 48
    .line 49
    invoke-static {v1, v3, p2}, Lr0/D1;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_3
    instance-of v1, p0, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    check-cast p0, [Ljava/lang/Object;

    .line 68
    .line 69
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    array-length v1, p0

    .line 75
    :goto_1
    if-ge v3, v1, :cond_4

    .line 76
    .line 77
    aget-object v4, p0, v3

    .line 78
    .line 79
    add-int/lit8 v5, p1, 0x1

    .line 80
    .line 81
    invoke-static {v4, v5, p2}, Lr0/D1;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_6

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "java."

    .line 112
    .line 113
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_9

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const-string v5, "android."

    .line 124
    .line 125
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :catchall_0
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_9

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Ljava/lang/reflect/Field;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_8

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    add-int/lit8 v4, p1, 0x1

    .line 176
    .line 177
    invoke-static {v3, v4, p2}, Lr0/D1;->h(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v3, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    :goto_3
    return-object v0
.end method

.method public static k(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0xa

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v1, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroid/view/View;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move-object p0, v2

    .line 19
    :goto_1
    if-nez p0, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    const-string v1, "om7"

    .line 23
    .line 24
    invoke-static {p0, v1}, Lr0/D1;->n(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    const-string v1, "iib"

    .line 31
    .line 32
    invoke-static {p0, v1}, Lr0/D1;->n(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_2
    return-object v2
.end method

.method public static final m(Ljava/util/Set;Lr0/D1;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p3, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p3, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-ge v1, v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "getChildAt(...)"

    .line 40
    .line 41
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1, p2, v2}, Lr0/D1;->m(Ljava/util/Set;Lr0/D1;Ljava/util/ArrayList;Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method public static n(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-static {p0}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "getChildAt(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, p1}, Lr0/D1;->n(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static o(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    const/4 v4, 0x0

    .line 18
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    aget-object v5, v0, v3

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v7, "getChildViewHolder"

    .line 27
    .line 28
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    array-length v6, v6

    .line 39
    const/4 v7, 0x1

    .line 40
    if-ne v6, v7, :cond_0

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aget-object v6, v6, v2

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v5, v4

    .line 63
    :goto_1
    if-eqz v5, :cond_3

    .line 64
    .line 65
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v5, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_2

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    new-instance p1, LE0/d;

    .line 76
    .line 77
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object p0, p1

    .line 81
    :goto_2
    nop

    .line 82
    instance-of p1, p0, LE0/d;

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    move-object v4, p0

    .line 88
    :cond_3
    :goto_3
    return-object v4
.end method

.method public static p(Ljava/lang/Object;)I
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_4

    .line 4
    :cond_0
    const-string v0, "getAdapterPosition"

    .line 5
    .line 6
    const-string v1, "getLayoutPosition"

    .line 7
    .line 8
    const-string v2, "getBindingAdapterPosition"

    .line 9
    .line 10
    const-string v3, "getAbsoluteAdapterPosition"

    .line 11
    .line 12
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    const/4 v3, 0x4

    .line 19
    if-ge v2, v3, :cond_4

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :try_start_0
    new-array v5, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 27
    .line 28
    invoke-interface {v6, p0, v3, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v5, v3, Ljava/lang/Number;

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Number;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :catchall_0
    move-exception v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v3, v4

    .line 42
    goto :goto_2

    .line 43
    :goto_1
    new-instance v5, LE0/d;

    .line 44
    .line 45
    invoke-direct {v5, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v3, v5

    .line 49
    :goto_2
    nop

    .line 50
    instance-of v5, v3, LE0/d;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    move-object v4, v3

    .line 56
    :goto_3
    check-cast v4, Ljava/lang/Number;

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    :goto_4
    const/4 p0, -0x1

    .line 69
    return p0
.end method

.method public static q(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "getAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v2, p0, v0, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, LE0/d;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v0, p0, LE0/d;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static r(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    if-ne v1, v0, :cond_1

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_1
    if-eqz p0, :cond_2

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    new-instance v0, LE0/d;

    .line 29
    .line 30
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object p0, v2

    .line 35
    :goto_1
    move-object v0, p0

    .line 36
    :goto_2
    nop

    .line 37
    instance-of p0, v0, LE0/d;

    .line 38
    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move-object v2, v0

    .line 43
    :goto_3
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    return-object v2
.end method

.method public static u(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "android.support.v7.widget.RecyclerView"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, ".RecyclerView"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, ".WxRecyclerView"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_2
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static v(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-static {p0, v0, v1, v2}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x2

    .line 10
    if-gt v2, v0, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    if-ge v0, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "substring(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    add-int/2addr v0, v4

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    sub-int/2addr v0, v4

    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-ne v0, v4, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne v0, v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    const/16 v0, 0x61

    .line 77
    .line 78
    if-gt v0, p0, :cond_1

    .line 79
    .line 80
    const/16 v0, 0x69

    .line 81
    .line 82
    if-ge p0, v0, :cond_1

    .line 83
    .line 84
    return v4

    .line 85
    :cond_1
    return v1
.end method

.method public static y(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "mc4."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "qf4."

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "ah4."

    .line 19
    .line 20
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {p0}, Lr0/D1;->v(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, LA0/b0;->e:Ljava/util/List;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v0, LF0/s;->a:LF0/s;

    .line 24
    .line 25
    :cond_1
    const-string v1, "kf4.d"

    .line 26
    .line 27
    invoke-static {v0, v1}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    const-string v0, "mc4.d"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    const-string v0, "qf4.d"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    const-string v0, "ah4.d"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    invoke-static {p1}, Lr0/D1;->v(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    const-string v0, ".d"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    :cond_2
    const/4 p1, 0x1

    .line 80
    return p1

    .line 81
    :cond_3
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method public final B(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;Z)V
    .locals 6

    .line 1
    iget v0, p0, Lr0/D1;->k:I

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lr0/D1;->k:I

    .line 11
    .line 12
    if-eqz p4, :cond_1

    .line 13
    .line 14
    const-string p4, "\u72b6\u6001\u9875\u5206\u7ec4\u547d\u4e2d"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string p4, "\u72b6\u6001\u9875\u5206\u7ec4\u626b\u63cf"

    .line 18
    .line 19
    :goto_0
    const-string v0, "title="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/4 p2, 0x0

    .line 37
    :goto_1
    if-nez p2, :cond_3

    .line 38
    .line 39
    const-string p2, ""

    .line 40
    .line 41
    :cond_3
    const-string v0, "item="

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const-string v1, ","

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/16 v5, 0x3e

    .line 53
    .line 54
    move-object v0, p3

    .line 55
    invoke-static/range {v0 .. v5}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    const-string v0, "users="

    .line 60
    .line 61
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    filled-new-array {p4, p1, p2, p3}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final D(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lr0/D1;->e:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lr0/D1;->c:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "getMethods(...)"

    .line 25
    .line 26
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    array-length v4, v1

    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    if-ge v6, v4, :cond_2

    .line 38
    .line 39
    aget-object v7, v1, v6

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const-string v9, "getName(...)"

    .line 46
    .line 47
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v9, "notify"

    .line 51
    .line 52
    invoke-static {v8, v5, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_1

    .line 67
    .line 68
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    new-instance v4, Lr0/C1;

    .line 91
    .line 92
    const/4 v6, 0x2

    .line 93
    invoke-direct {v4, p0, v6}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    array-length v2, v0

    .line 113
    :goto_2
    if-ge v5, v2, :cond_5

    .line 114
    .line 115
    aget-object v3, v0, v5

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const-string v6, "onBindViewHolder"

    .line 122
    .line 123
    invoke-static {v4, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    array-length v4, v4

    .line 134
    const/4 v6, 0x2

    .line 135
    if-lt v4, v6, :cond_4

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    const/4 v6, 0x1

    .line 142
    aget-object v4, v4, v6

    .line 143
    .line 144
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    invoke-static {v4, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    new-instance v2, Lr0/C1;

    .line 175
    .line 176
    const/4 v3, 0x3

    .line 177
    invoke-direct {v2, p0, v3}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 178
    .line 179
    .line 180
    invoke-static {v1, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_6
    :goto_4
    invoke-virtual {p0, p1}, Lr0/D1;->i(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final G(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/D1;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/B1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget v1, v0, Lr0/B1;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, v0, Lr0/B1;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 34
    .line 35
    if-eq v5, v4, :cond_1

    .line 36
    .line 37
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 38
    .line 39
    move v3, v2

    .line 40
    :cond_1
    iget-object v0, v0, Lr0/B1;->c:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 49
    .line 50
    if-eq v4, v0, :cond_2

    .line 51
    .line 52
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v2, v3

    .line 56
    :goto_0
    move v3, v2

    .line 57
    :cond_3
    if-eqz v3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_1
    return-void
.end method

.method public final H(Landroid/view/View;Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lr0/D1;->b:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->s(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-boolean v4, Lz0/i;->a:Z

    .line 20
    .line 21
    invoke-static {}, Lz0/g;->E()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->G(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lr0/D1;->d()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->G(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v0, v5, v2}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iget v5, v0, Lr0/D1;->j:I

    .line 51
    .line 52
    const/16 v7, 0x14

    .line 53
    .line 54
    const-string v12, ""

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    if-ge v5, v7, :cond_6

    .line 58
    .line 59
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget v5, v0, Lr0/D1;->j:I

    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    iput v5, v0, Lr0/D1;->j:I

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move-object v5, v13

    .line 86
    :goto_0
    if-nez v5, :cond_5

    .line 87
    .line 88
    move-object v5, v12

    .line 89
    :cond_5
    const-string v7, "item="

    .line 90
    .line 91
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const/4 v9, 0x0

    .line 96
    const/16 v11, 0x3e

    .line 97
    .line 98
    const-string v7, ","

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    invoke-static/range {v6 .. v11}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    const-string v8, "users="

    .line 107
    .line 108
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    const-string v9, "hidden="

    .line 117
    .line 118
    invoke-static {v8, v9}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    const-string v9, "\u72b6\u6001\u9875\u6837\u672c"

    .line 123
    .line 124
    filled-new-array {v9, v5, v7, v8}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-static {v5}, Li0/a;->a([Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_1
    new-instance v14, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_8

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    move-object v8, v7

    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_7

    .line 158
    .line 159
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_9

    .line 168
    .line 169
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->G(Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_9
    invoke-static {v1}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    const-string v7, "m97"

    .line 178
    .line 179
    invoke-static {v5, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    const-string v7, "\u72b6\u6001\u9875\u9690\u85cf\u6574\u5217"

    .line 184
    .line 185
    if-eqz v5, :cond_b

    .line 186
    .line 187
    invoke-static {v14}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 188
    .line 189
    .line 190
    move-result-object v15

    .line 191
    invoke-static {v1}, Lr0/D1;->k(Landroid/view/View;)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->s(Landroid/view/View;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const/16 v20, 0x3e

    .line 206
    .line 207
    const-string v16, ","

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    invoke-static/range {v15 .. v20}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const-string v2, "\u72b6\u6001\u9875\u9690\u85cf\u5934\u50cf\u5217\u8868"

    .line 218
    .line 219
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_a
    invoke-virtual {v0, v2}, Lr0/D1;->s(Landroid/view/View;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    const/16 v18, 0x0

    .line 234
    .line 235
    const/16 v20, 0x3e

    .line 236
    .line 237
    const-string v16, ","

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    invoke-static/range {v15 .. v20}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    filled-new-array {v7, v1}, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_b
    invoke-static {v6, v4}, LF0/w;->Y(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-nez v5, :cond_f

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const/16 v18, 0x0

    .line 268
    .line 269
    const-string v15, ","

    .line 270
    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v19, 0x3e

    .line 274
    .line 275
    invoke-static/range {v14 .. v19}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    move-object v6, v14

    .line 280
    const-string v8, "hit="

    .line 281
    .line 282
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    const-string v15, ","

    .line 287
    .line 288
    move-object v14, v4

    .line 289
    invoke-static/range {v14 .. v19}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    const-string v8, "remain="

    .line 294
    .line 295
    invoke-virtual {v8, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    if-eqz v2, :cond_c

    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    :cond_c
    if-nez v13, :cond_d

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_d
    move-object v12, v13

    .line 313
    :goto_3
    const-string v2, "\u72b6\u6001\u9875\u9690\u85cf\u6df7\u5408\u5206\u7ec4"

    .line 314
    .line 315
    filled-new-array {v2, v5, v4, v12}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v6}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    invoke-static {v1}, Lr0/D1;->k(Landroid/view/View;)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    if-eqz v2, :cond_e

    .line 331
    .line 332
    invoke-virtual {v0, v2}, Lr0/D1;->s(Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    const/4 v11, 0x0

    .line 339
    const/16 v13, 0x3e

    .line 340
    .line 341
    const-string v9, ","

    .line 342
    .line 343
    const/4 v10, 0x0

    .line 344
    const/4 v12, 0x0

    .line 345
    invoke-static/range {v8 .. v13}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    filled-new-array {v7, v1}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :cond_e
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->t(Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    const/4 v11, 0x0

    .line 361
    const/16 v13, 0x3e

    .line 362
    .line 363
    const-string v9, ","

    .line 364
    .line 365
    const/4 v10, 0x0

    .line 366
    const/4 v12, 0x0

    .line 367
    invoke-static/range {v8 .. v13}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v2, "\u72b6\u6001\u9875\u9690\u85cf\u884c"

    .line 372
    .line 373
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_f
    move-object v6, v14

    .line 382
    const/16 v17, 0x0

    .line 383
    .line 384
    const/16 v18, 0x0

    .line 385
    .line 386
    const-string v15, ","

    .line 387
    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    const/16 v19, 0x3e

    .line 391
    .line 392
    invoke-static/range {v14 .. v19}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    if-eqz v2, :cond_10

    .line 397
    .line 398
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v13

    .line 406
    :cond_10
    if-nez v13, :cond_11

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_11
    move-object v12, v13

    .line 410
    :goto_4
    const-string v2, "\u72b6\u6001\u9875\u9690\u85cf\u547d\u4e2d"

    .line 411
    .line 412
    filled-new-array {v2, v3, v12}, [Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {p0 .. p1}, Lr0/D1;->t(Landroid/view/View;)V

    .line 420
    .line 421
    .line 422
    return-void
.end method

.method public final I(Landroid/view/View;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lr0/D1;->x(Landroid/view/View;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lr0/D1;->d:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lr0/D1;->q(Landroid/view/View;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lr0/D1;->K()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "m97"

    .line 37
    .line 38
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lr0/D1;->f:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0, v0}, Lr0/D1;->D(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Lr0/D1;->J(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    check-cast p1, Landroid/view/ViewGroup;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    :goto_0
    if-ge v1, v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {p0, v2}, Lr0/D1;->I(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_1
    return-void
.end method

.method public final J(Landroid/view/View;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    goto/16 :goto_12

    .line 11
    .line 12
    :cond_0
    move-object v3, v1

    .line 13
    check-cast v3, Landroid/view/ViewGroup;

    .line 14
    .line 15
    sget-boolean v4, Lz0/i;->a:Z

    .line 16
    .line 17
    invoke-static {}, Lz0/g;->E()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x0

    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    goto/16 :goto_e

    .line 25
    .line 26
    :cond_1
    invoke-static {}, Lr0/D1;->d()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_2

    .line 35
    .line 36
    goto/16 :goto_e

    .line 37
    .line 38
    :cond_2
    invoke-static {v3}, Lr0/D1;->q(Landroid/view/View;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    goto/16 :goto_e

    .line 45
    .line 46
    :cond_3
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    move v9, v5

    .line 51
    :goto_0
    if-ge v9, v8, :cond_16

    .line 52
    .line 53
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-static {v10}, LN0/g;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v10}, Lr0/D1;->l(Landroid/view/View;)Landroid/widget/TextView;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    if-nez v11, :cond_4

    .line 65
    .line 66
    move/from16 v24, v2

    .line 67
    .line 68
    goto/16 :goto_d

    .line 69
    .line 70
    :cond_4
    invoke-static {v3, v10}, Lr0/D1;->o(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-static {v12}, Lr0/D1;->p(Ljava/lang/Object;)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    if-ltz v13, :cond_5

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const/4 v14, 0x0

    .line 86
    :goto_1
    if-eqz v14, :cond_6

    .line 87
    .line 88
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move v13, v9

    .line 94
    :goto_2
    invoke-virtual {v0, v3, v9}, Lr0/D1;->j(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    if-eqz v14, :cond_7

    .line 99
    .line 100
    invoke-static {v3, v14}, Lr0/D1;->o(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    goto :goto_3

    .line 105
    :cond_7
    const/4 v15, 0x0

    .line 106
    :goto_3
    invoke-static {v15}, Lr0/D1;->p(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v16

    .line 110
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v17

    .line 114
    if-ltz v16, :cond_8

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    const/16 v17, 0x0

    .line 118
    .line 119
    :goto_4
    if-eqz v17, :cond_9

    .line 120
    .line 121
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    :goto_5
    move/from16 v6, v16

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_9
    add-int/lit8 v16, v13, 0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :goto_6
    invoke-static {v15}, Lr0/D1;->F(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    if-nez v15, :cond_a

    .line 136
    .line 137
    invoke-static {v6, v7}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    if-nez v15, :cond_a

    .line 142
    .line 143
    invoke-static {v12}, Lr0/D1;->F(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    if-nez v15, :cond_a

    .line 148
    .line 149
    invoke-static {v13, v7}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    :cond_a
    invoke-virtual {v0, v5, v15}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v11}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    if-eqz v12, :cond_b

    .line 162
    .line 163
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    goto :goto_7

    .line 168
    :cond_b
    const/4 v12, 0x0

    .line 169
    :goto_7
    const-string v13, ""

    .line 170
    .line 171
    if-nez v12, :cond_c

    .line 172
    .line 173
    move-object v12, v13

    .line 174
    :cond_c
    invoke-virtual {v0, v12, v15, v6, v5}, Lr0/D1;->B(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;Z)V

    .line 175
    .line 176
    .line 177
    new-instance v12, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v16

    .line 190
    if-eqz v16, :cond_e

    .line 191
    .line 192
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    move-object v2, v5

    .line 197
    check-cast v2, Ljava/lang/String;

    .line 198
    .line 199
    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_d

    .line 204
    .line 205
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_d
    const/4 v2, 0x1

    .line 209
    const/4 v5, 0x0

    .line 210
    goto :goto_8

    .line 211
    :cond_e
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_f

    .line 216
    .line 217
    :goto_9
    const/16 v24, 0x1

    .line 218
    .line 219
    goto :goto_d

    .line 220
    :cond_f
    invoke-virtual {v11}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-eqz v2, :cond_10

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_a

    .line 231
    :cond_10
    const/4 v2, 0x0

    .line 232
    :goto_a
    if-nez v2, :cond_11

    .line 233
    .line 234
    move-object v2, v13

    .line 235
    :cond_11
    invoke-static {v12}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    const/4 v6, 0x1

    .line 240
    invoke-virtual {v0, v2, v15, v5, v6}, Lr0/D1;->B(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;Z)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v10}, Lr0/D1;->s(Landroid/view/View;)V

    .line 244
    .line 245
    .line 246
    iget-object v2, v0, Lr0/D1;->b:Ljava/util/Set;

    .line 247
    .line 248
    invoke-interface {v2, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    if-eqz v14, :cond_12

    .line 252
    .line 253
    invoke-virtual {v0, v14}, Lr0/D1;->s(Landroid/view/View;)V

    .line 254
    .line 255
    .line 256
    :cond_12
    if-eqz v14, :cond_13

    .line 257
    .line 258
    invoke-interface {v2, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_13
    const/16 v21, 0x0

    .line 262
    .line 263
    const/16 v23, 0x3e

    .line 264
    .line 265
    const-string v19, ","

    .line 266
    .line 267
    const/16 v20, 0x0

    .line 268
    .line 269
    const/16 v22, 0x0

    .line 270
    .line 271
    move-object/from16 v18, v12

    .line 272
    .line 273
    invoke-static/range {v18 .. v23}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    if-eqz v15, :cond_14

    .line 278
    .line 279
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    goto :goto_b

    .line 288
    :cond_14
    const/4 v5, 0x0

    .line 289
    :goto_b
    if-nez v5, :cond_15

    .line 290
    .line 291
    goto :goto_c

    .line 292
    :cond_15
    move-object v13, v5

    .line 293
    :goto_c
    const-string v5, "\u72b6\u6001\u9875\u9690\u85cf\u5206\u7ec4"

    .line 294
    .line 295
    filled-new-array {v5, v2, v13}, [Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :goto_d
    add-int/lit8 v9, v9, 0x1

    .line 304
    .line 305
    const/4 v2, 0x1

    .line 306
    const/4 v5, 0x0

    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_16
    :goto_e
    invoke-static {v1}, Lr0/D1;->q(Landroid/view/View;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    const/4 v5, 0x0

    .line 318
    :goto_f
    if-ge v5, v4, :cond_1a

    .line 319
    .line 320
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-static {v6}, LN0/g;->b(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v1, v6}, Lr0/D1;->o(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    invoke-static {v7}, Lr0/D1;->F(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    if-nez v8, :cond_19

    .line 336
    .line 337
    if-eqz v2, :cond_17

    .line 338
    .line 339
    invoke-static {v7}, Lr0/D1;->p(Ljava/lang/Object;)I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    invoke-static {v7, v2}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    move-object v8, v7

    .line 348
    goto :goto_10

    .line 349
    :cond_17
    const/4 v8, 0x0

    .line 350
    :goto_10
    if-nez v8, :cond_19

    .line 351
    .line 352
    if-eqz v2, :cond_18

    .line 353
    .line 354
    invoke-static {v5, v2}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    goto :goto_11

    .line 359
    :cond_18
    const/4 v8, 0x0

    .line 360
    :cond_19
    :goto_11
    invoke-virtual {v0, v6, v8}, Lr0/D1;->H(Landroid/view/View;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    const/16 v24, 0x1

    .line 364
    .line 365
    add-int/lit8 v5, v5, 0x1

    .line 366
    .line 367
    goto :goto_f

    .line 368
    :cond_1a
    :goto_12
    return-void
.end method

.method public final M()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LA0/b0;->c:Ljava/util/List;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, LF0/s;->a:LF0/s;

    .line 14
    .line 15
    :cond_1
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final N()LA0/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lr0/D1;->m:LA0/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lr0/D1;->l:Landroid/content/Context;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-static {v0}, LA0/l;->p(Landroid/content/Context;)LA0/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iput-object v0, p0, Lr0/D1;->m:LA0/b0;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final e(ILjava/lang/Object;)Ljava/util/Set;
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    sget-object v5, LF0/u;->a:LF0/u;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    if-le v2, v6, :cond_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    move-object v14, v1

    .line 15
    move-object/from16 v19, v5

    .line 16
    .line 17
    goto/16 :goto_3b

    .line 18
    .line 19
    :cond_1
    invoke-virtual {v1, v3}, Lr0/D1;->A(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    instance-of v0, v3, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    move-object v0, v3

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    const-string v8, "mj4.k"

    .line 47
    .line 48
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v9, v1, Lr0/D1;->n:Ljava/util/Set;

    .line 53
    .line 54
    const-string v11, "android."

    .line 55
    .line 56
    const-string v12, "java."

    .line 57
    .line 58
    const-class v13, Ljava/lang/String;

    .line 59
    .line 60
    const-string v14, "getParameterTypes(...)"

    .line 61
    .line 62
    const-string v15, ""

    .line 63
    .line 64
    const-string v6, "pj4."

    .line 65
    .line 66
    const-string v4, ".k"

    .line 67
    .line 68
    const-string v10, "b74."

    .line 69
    .line 70
    move-object/from16 v19, v5

    .line 71
    .line 72
    const-string v5, "getName(...)"

    .line 73
    .line 74
    move-object/from16 v20, v15

    .line 75
    .line 76
    const-string v15, "b"

    .line 77
    .line 78
    const-string v2, "textstatus"

    .line 79
    .line 80
    move-object/from16 v21, v8

    .line 81
    .line 82
    const-string v8, "status"

    .line 83
    .line 84
    move-object/from16 v22, v2

    .line 85
    .line 86
    const-string v2, "l"

    .line 87
    .line 88
    move-object/from16 v23, v11

    .line 89
    .line 90
    const-string v11, "o"

    .line 91
    .line 92
    move-object/from16 v24, v12

    .line 93
    .line 94
    const-string v12, "mj4."

    .line 95
    .line 96
    move-object/from16 v25, v13

    .line 97
    .line 98
    const-string v13, "lc3.t0"

    .line 99
    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {v7, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    move-object/from16 v27, v4

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-static {v7, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_5

    .line 116
    .line 117
    invoke-static {v7}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_5

    .line 122
    .line 123
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_5

    .line 128
    .line 129
    invoke-interface {v9, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    move-object/from16 v29, v2

    .line 136
    .line 137
    move-object/from16 v30, v11

    .line 138
    .line 139
    move-object/from16 v7, v22

    .line 140
    .line 141
    move-object/from16 v11, v25

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    :goto_1
    move-object/from16 v25, v24

    .line 145
    .line 146
    goto/16 :goto_1b

    .line 147
    .line 148
    :cond_4
    move-object/from16 v27, v4

    .line 149
    .line 150
    :cond_5
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 151
    .line 152
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_6

    .line 160
    .line 161
    invoke-interface {v9, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    :cond_6
    move-object/from16 v29, v2

    .line 168
    .line 169
    move-object/from16 v30, v11

    .line 170
    .line 171
    goto/16 :goto_10

    .line 172
    .line 173
    :cond_7
    const/4 v9, 0x0

    .line 174
    :try_start_0
    new-array v0, v9, [Ljava/lang/Object;

    .line 175
    .line 176
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 177
    .line 178
    invoke-interface {v9, v3, v11, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    instance-of v9, v0, Ljava/lang/String;

    .line 183
    .line 184
    if-eqz v9, :cond_8

    .line 185
    .line 186
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    goto :goto_2

    .line 191
    :cond_8
    const/4 v0, 0x0

    .line 192
    goto :goto_3

    .line 193
    :goto_2
    new-instance v9, LE0/d;

    .line 194
    .line 195
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v0, v9

    .line 199
    :goto_3
    nop

    .line 200
    instance-of v9, v0, LE0/d;

    .line 201
    .line 202
    if-eqz v9, :cond_9

    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    :cond_9
    move-object v9, v0

    .line 206
    check-cast v9, Ljava/lang/String;

    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    :try_start_1
    new-array v0, v13, [Ljava/lang/Object;

    .line 210
    .line 211
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 212
    .line 213
    invoke-interface {v13, v3, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    instance-of v13, v0, Ljava/lang/String;

    .line 218
    .line 219
    if-eqz v13, :cond_a

    .line 220
    .line 221
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :catchall_1
    move-exception v0

    .line 225
    goto :goto_5

    .line 226
    :cond_a
    const/4 v0, 0x0

    .line 227
    :goto_4
    move-object v13, v0

    .line 228
    goto :goto_6

    .line 229
    :goto_5
    new-instance v13, LE0/d;

    .line 230
    .line 231
    invoke-direct {v13, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    :goto_6
    instance-of v0, v13, LE0/d;

    .line 235
    .line 236
    if-eqz v0, :cond_b

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    :cond_b
    check-cast v13, Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v9, :cond_c

    .line 242
    .line 243
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 248
    .line 249
    .line 250
    :cond_c
    if-eqz v13, :cond_d

    .line 251
    .line 252
    invoke-static {v13}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    :try_start_2
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 260
    .line 261
    invoke-interface {v0, v3, v15}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_e

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    goto :goto_7

    .line 276
    :cond_e
    const/4 v9, 0x0

    .line 277
    :goto_7
    if-nez v9, :cond_f

    .line 278
    .line 279
    move-object/from16 v9, v20

    .line 280
    .line 281
    :cond_f
    if-eqz v0, :cond_10

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    invoke-static {v9, v13, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v18

    .line 288
    if-nez v18, :cond_11

    .line 289
    .line 290
    invoke-static {v9, v13, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_10

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_10
    move-object/from16 v29, v2

    .line 298
    .line 299
    move-object/from16 v30, v11

    .line 300
    .line 301
    :goto_8
    const/4 v13, 0x0

    .line 302
    goto/16 :goto_c

    .line 303
    .line 304
    :cond_11
    :goto_9
    invoke-virtual {v1, v0}, Lr0/D1;->g(Ljava/lang/Object;)Ljava/util/Set;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    invoke-static {v9, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-static {v9}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v13

    .line 327
    if-eqz v13, :cond_15

    .line 328
    .line 329
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    check-cast v13, Ljava/lang/reflect/Field;

    .line 334
    .line 335
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 336
    .line 337
    .line 338
    move-result v28

    .line 339
    invoke-static/range {v28 .. v28}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 340
    .line 341
    .line 342
    move-result v28

    .line 343
    if-eqz v28, :cond_12

    .line 344
    .line 345
    move-object/from16 v29, v2

    .line 346
    .line 347
    move-object/from16 v28, v9

    .line 348
    .line 349
    move-object/from16 v30, v11

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :cond_12
    move-object/from16 v28, v9

    .line 353
    .line 354
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    invoke-static {v9, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 359
    .line 360
    .line 361
    move-object/from16 v29, v2

    .line 362
    .line 363
    :try_start_3
    const-string v2, "PrivateInfo"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 364
    .line 365
    move-object/from16 v30, v11

    .line 366
    .line 367
    const/4 v11, 0x1

    .line 368
    :try_start_4
    invoke-static {v9, v2, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-nez v2, :cond_14

    .line 373
    .line 374
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-static {v2, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const-string v9, "User"

    .line 382
    .line 383
    invoke-static {v2, v9, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-nez v2, :cond_14

    .line 388
    .line 389
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-static {v2, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v2, v8, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-nez v2, :cond_13

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_13
    const/4 v11, 0x1

    .line 404
    :cond_14
    invoke-virtual {v13, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v1, v11, v2}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-static {v2, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 416
    .line 417
    .line 418
    :goto_b
    move-object/from16 v9, v28

    .line 419
    .line 420
    move-object/from16 v2, v29

    .line 421
    .line 422
    move-object/from16 v11, v30

    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_15
    move-object/from16 v29, v2

    .line 426
    .line 427
    move-object/from16 v30, v11

    .line 428
    .line 429
    const/4 v11, 0x1

    .line 430
    invoke-virtual {v1, v11, v0}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_8

    .line 438
    .line 439
    :goto_c
    invoke-static {v7, v13, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-nez v0, :cond_16

    .line 444
    .line 445
    invoke-static {v7}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-eqz v0, :cond_17

    .line 450
    .line 451
    :cond_16
    invoke-virtual {v1, v3}, Lr0/D1;->f(Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 456
    .line 457
    .line 458
    :cond_17
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_1c

    .line 463
    .line 464
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v0}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    :cond_18
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_1c

    .line 481
    .line 482
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    check-cast v0, Ljava/lang/reflect/Field;

    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 493
    .line 494
    .line 495
    move-result v7

    .line 496
    if-eqz v7, :cond_19

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_19
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    const-string v9, "d"

    .line 504
    .line 505
    invoke-static {v7, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    if-nez v7, :cond_1a

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    invoke-static {v7, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 519
    if-nez v7, :cond_1a

    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_1a
    const/4 v11, 0x1

    .line 523
    :try_start_5
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 530
    goto :goto_e

    .line 531
    :catchall_2
    move-exception v0

    .line 532
    :try_start_6
    new-instance v7, LE0/d;

    .line 533
    .line 534
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 535
    .line 536
    .line 537
    move-object v0, v7

    .line 538
    :goto_e
    nop

    .line 539
    instance-of v7, v0, LE0/d;

    .line 540
    .line 541
    if-eqz v7, :cond_1b

    .line 542
    .line 543
    const/4 v0, 0x0

    .line 544
    :cond_1b
    if-eqz v0, :cond_18

    .line 545
    .line 546
    const/4 v11, 0x1

    .line 547
    invoke-virtual {v1, v11, v0}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 552
    .line 553
    .line 554
    goto :goto_d

    .line 555
    :catchall_3
    move-object/from16 v29, v2

    .line 556
    .line 557
    :catchall_4
    move-object/from16 v30, v11

    .line 558
    .line 559
    :catchall_5
    :cond_1c
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-nez v0, :cond_1d

    .line 564
    .line 565
    goto :goto_f

    .line 566
    :cond_1d
    const/4 v4, 0x0

    .line 567
    :goto_f
    move-object/from16 v7, v22

    .line 568
    .line 569
    move-object/from16 v11, v25

    .line 570
    .line 571
    goto/16 :goto_1

    .line 572
    .line 573
    :goto_10
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 574
    .line 575
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0}, Lr0/D1;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-eqz v0, :cond_23

    .line 595
    .line 596
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    check-cast v0, Ljava/lang/reflect/Method;

    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 603
    .line 604
    .line 605
    move-result v9

    .line 606
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 607
    .line 608
    .line 609
    move-result v9

    .line 610
    if-nez v9, :cond_21

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    move-result-object v9

    .line 616
    invoke-static {v9, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    array-length v9, v9

    .line 620
    if-nez v9, :cond_21

    .line 621
    .line 622
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    move-object/from16 v11, v25

    .line 627
    .line 628
    invoke-static {v9, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v9

    .line 632
    if-nez v9, :cond_1e

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :cond_1e
    const/4 v9, 0x1

    .line 636
    :try_start_7
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 637
    .line 638
    .line 639
    const/4 v9, 0x0

    .line 640
    invoke-virtual {v0, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    instance-of v9, v0, Ljava/lang/String;

    .line 645
    .line 646
    if-eqz v9, :cond_1f

    .line 647
    .line 648
    move-object v9, v0

    .line 649
    check-cast v9, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 650
    .line 651
    goto :goto_13

    .line 652
    :catchall_6
    move-exception v0

    .line 653
    goto :goto_12

    .line 654
    :cond_1f
    const/4 v9, 0x0

    .line 655
    goto :goto_13

    .line 656
    :goto_12
    new-instance v9, LE0/d;

    .line 657
    .line 658
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 659
    .line 660
    .line 661
    :goto_13
    instance-of v0, v9, LE0/d;

    .line 662
    .line 663
    if-eqz v0, :cond_20

    .line 664
    .line 665
    const/4 v9, 0x0

    .line 666
    :cond_20
    check-cast v9, Ljava/lang/String;

    .line 667
    .line 668
    if-eqz v9, :cond_22

    .line 669
    .line 670
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 675
    .line 676
    .line 677
    goto :goto_14

    .line 678
    :cond_21
    move-object/from16 v11, v25

    .line 679
    .line 680
    :cond_22
    :goto_14
    move-object/from16 v25, v11

    .line 681
    .line 682
    goto :goto_11

    .line 683
    :cond_23
    move-object/from16 v11, v25

    .line 684
    .line 685
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v0}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_2e

    .line 702
    .line 703
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    check-cast v0, Ljava/lang/reflect/Field;

    .line 708
    .line 709
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 710
    .line 711
    .line 712
    move-result v9

    .line 713
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    if-eqz v9, :cond_25

    .line 718
    .line 719
    :cond_24
    :goto_16
    move-object/from16 v25, v24

    .line 720
    .line 721
    move-object/from16 v24, v7

    .line 722
    .line 723
    move-object/from16 v7, v22

    .line 724
    .line 725
    goto/16 :goto_1a

    .line 726
    .line 727
    :cond_25
    const/4 v9, 0x1

    .line 728
    :try_start_8
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 735
    move-object v9, v0

    .line 736
    goto :goto_17

    .line 737
    :catchall_7
    move-exception v0

    .line 738
    new-instance v9, LE0/d;

    .line 739
    .line 740
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    :goto_17
    instance-of v0, v9, LE0/d;

    .line 744
    .line 745
    if-eqz v0, :cond_26

    .line 746
    .line 747
    const/4 v9, 0x0

    .line 748
    :cond_26
    if-eqz v9, :cond_24

    .line 749
    .line 750
    instance-of v0, v9, Ljava/lang/String;

    .line 751
    .line 752
    if-eqz v0, :cond_27

    .line 753
    .line 754
    check-cast v9, Ljava/lang/String;

    .line 755
    .line 756
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 761
    .line 762
    .line 763
    goto :goto_16

    .line 764
    :cond_27
    instance-of v0, v9, Ljava/util/Collection;

    .line 765
    .line 766
    if-nez v0, :cond_28

    .line 767
    .line 768
    instance-of v0, v9, [Ljava/lang/Object;

    .line 769
    .line 770
    if-eqz v0, :cond_29

    .line 771
    .line 772
    :cond_28
    move-object/from16 v25, v24

    .line 773
    .line 774
    const/4 v13, 0x1

    .line 775
    move-object/from16 v24, v7

    .line 776
    .line 777
    move-object/from16 v7, v22

    .line 778
    .line 779
    goto :goto_19

    .line 780
    :cond_29
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    move-object/from16 v13, v24

    .line 789
    .line 790
    move-object/from16 v24, v7

    .line 791
    .line 792
    move-object v7, v13

    .line 793
    const/4 v13, 0x0

    .line 794
    invoke-static {v0, v13, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 795
    .line 796
    .line 797
    move-result v18

    .line 798
    move-object/from16 v25, v7

    .line 799
    .line 800
    if-nez v18, :cond_2a

    .line 801
    .line 802
    move-object/from16 v7, v23

    .line 803
    .line 804
    invoke-static {v0, v13, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 805
    .line 806
    .line 807
    move-result v18

    .line 808
    if-eqz v18, :cond_2b

    .line 809
    .line 810
    move-object/from16 v23, v7

    .line 811
    .line 812
    :cond_2a
    move-object/from16 v7, v22

    .line 813
    .line 814
    const/4 v13, 0x1

    .line 815
    goto :goto_1a

    .line 816
    :cond_2b
    move-object/from16 v23, v7

    .line 817
    .line 818
    const-string v7, "lc3."

    .line 819
    .line 820
    invoke-static {v0, v13, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    if-nez v7, :cond_2c

    .line 825
    .line 826
    invoke-static {v0, v13, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 827
    .line 828
    .line 829
    move-result v7

    .line 830
    if-nez v7, :cond_2c

    .line 831
    .line 832
    invoke-static {v0, v13, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 833
    .line 834
    .line 835
    move-result v7

    .line 836
    if-nez v7, :cond_2c

    .line 837
    .line 838
    move-object/from16 v7, v22

    .line 839
    .line 840
    const/4 v13, 0x1

    .line 841
    invoke-static {v0, v7, v13}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-eqz v0, :cond_2d

    .line 846
    .line 847
    goto :goto_18

    .line 848
    :cond_2c
    move-object/from16 v7, v22

    .line 849
    .line 850
    const/4 v13, 0x1

    .line 851
    :goto_18
    invoke-virtual {v1, v13, v9}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 856
    .line 857
    .line 858
    goto :goto_1a

    .line 859
    :goto_19
    invoke-virtual {v1, v13, v9}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 864
    .line 865
    .line 866
    :cond_2d
    :goto_1a
    move-object/from16 v22, v7

    .line 867
    .line 868
    move-object/from16 v7, v24

    .line 869
    .line 870
    move-object/from16 v24, v25

    .line 871
    .line 872
    goto/16 :goto_15

    .line 873
    .line 874
    :cond_2e
    move-object/from16 v7, v22

    .line 875
    .line 876
    move-object/from16 v25, v24

    .line 877
    .line 878
    invoke-static {v2, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 879
    .line 880
    .line 881
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-nez v0, :cond_2f

    .line 886
    .line 887
    goto :goto_1b

    .line 888
    :cond_2f
    const/4 v4, 0x0

    .line 889
    :goto_1b
    if-eqz v4, :cond_31

    .line 890
    .line 891
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    if-nez v0, :cond_30

    .line 896
    .line 897
    move-object v9, v4

    .line 898
    goto :goto_1c

    .line 899
    :cond_30
    const/4 v9, 0x0

    .line 900
    :goto_1c
    if-eqz v9, :cond_31

    .line 901
    .line 902
    return-object v9

    .line 903
    :cond_31
    instance-of v0, v3, Ljava/util/Collection;

    .line 904
    .line 905
    if-eqz v0, :cond_33

    .line 906
    .line 907
    move-object v0, v3

    .line 908
    check-cast v0, Ljava/lang/Iterable;

    .line 909
    .line 910
    new-instance v2, Ljava/util/ArrayList;

    .line 911
    .line 912
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 913
    .line 914
    .line 915
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 920
    .line 921
    .line 922
    move-result v3

    .line 923
    if-eqz v3, :cond_32

    .line 924
    .line 925
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    const/16 v17, 0x1

    .line 930
    .line 931
    add-int/lit8 v4, p1, 0x1

    .line 932
    .line 933
    invoke-virtual {v1, v4, v3}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-static {v3, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 938
    .line 939
    .line 940
    goto :goto_1d

    .line 941
    :cond_32
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    return-object v0

    .line 946
    :cond_33
    instance-of v0, v3, [Ljava/lang/Object;

    .line 947
    .line 948
    if-eqz v0, :cond_35

    .line 949
    .line 950
    move-object v0, v3

    .line 951
    check-cast v0, [Ljava/lang/Object;

    .line 952
    .line 953
    new-instance v2, Ljava/util/ArrayList;

    .line 954
    .line 955
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 956
    .line 957
    .line 958
    array-length v3, v0

    .line 959
    const/4 v10, 0x0

    .line 960
    :goto_1e
    if-ge v10, v3, :cond_34

    .line 961
    .line 962
    aget-object v4, v0, v10

    .line 963
    .line 964
    const/16 v17, 0x1

    .line 965
    .line 966
    add-int/lit8 v5, p1, 0x1

    .line 967
    .line 968
    invoke-virtual {v1, v5, v4}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 969
    .line 970
    .line 971
    move-result-object v4

    .line 972
    invoke-static {v4, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 973
    .line 974
    .line 975
    add-int/lit8 v10, v10, 0x1

    .line 976
    .line 977
    goto :goto_1e

    .line 978
    :cond_34
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    return-object v0

    .line 983
    :cond_35
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 984
    .line 985
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    move-object/from16 v4, v21

    .line 997
    .line 998
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    move-result v4

    .line 1002
    if-nez v4, :cond_36

    .line 1003
    .line 1004
    move-object/from16 v4, v27

    .line 1005
    .line 1006
    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-nez v0, :cond_36

    .line 1011
    .line 1012
    move-object/from16 v21, v6

    .line 1013
    .line 1014
    move-object/from16 v4, v19

    .line 1015
    .line 1016
    move-object/from16 v6, v29

    .line 1017
    .line 1018
    move-object/from16 v13, v30

    .line 1019
    .line 1020
    goto/16 :goto_23

    .line 1021
    .line 1022
    :cond_36
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1023
    .line 1024
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    const/4 v13, 0x0

    .line 1028
    :try_start_9
    new-array v0, v13, [Ljava/lang/Object;

    .line 1029
    .line 1030
    sget-object v9, Lc0/f;->b:Ld0/b;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1031
    .line 1032
    move-object/from16 v13, v30

    .line 1033
    .line 1034
    :try_start_a
    invoke-interface {v9, v3, v13, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    instance-of v9, v0, Ljava/lang/String;

    .line 1039
    .line 1040
    if-eqz v9, :cond_37

    .line 1041
    .line 1042
    move-object v9, v0

    .line 1043
    check-cast v9, Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1044
    .line 1045
    goto :goto_20

    .line 1046
    :catchall_8
    move-exception v0

    .line 1047
    goto :goto_1f

    .line 1048
    :cond_37
    const/4 v9, 0x0

    .line 1049
    goto :goto_20

    .line 1050
    :catchall_9
    move-exception v0

    .line 1051
    move-object/from16 v13, v30

    .line 1052
    .line 1053
    :goto_1f
    new-instance v9, LE0/d;

    .line 1054
    .line 1055
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1056
    .line 1057
    .line 1058
    :goto_20
    instance-of v0, v9, LE0/d;

    .line 1059
    .line 1060
    if-eqz v0, :cond_38

    .line 1061
    .line 1062
    const/4 v9, 0x0

    .line 1063
    :cond_38
    check-cast v9, Ljava/lang/String;

    .line 1064
    .line 1065
    if-eqz v9, :cond_39

    .line 1066
    .line 1067
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1072
    .line 1073
    .line 1074
    :cond_39
    const/4 v9, 0x0

    .line 1075
    :try_start_b
    new-array v0, v9, [Ljava/lang/Object;

    .line 1076
    .line 1077
    sget-object v9, Lc0/f;->b:Ld0/b;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1078
    .line 1079
    move-object/from16 v21, v6

    .line 1080
    .line 1081
    move-object/from16 v6, v29

    .line 1082
    .line 1083
    :try_start_c
    invoke-interface {v9, v3, v6, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    instance-of v9, v0, Ljava/lang/String;

    .line 1088
    .line 1089
    if-eqz v9, :cond_3a

    .line 1090
    .line 1091
    move-object v9, v0

    .line 1092
    check-cast v9, Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 1093
    .line 1094
    goto :goto_22

    .line 1095
    :catchall_a
    move-exception v0

    .line 1096
    goto :goto_21

    .line 1097
    :cond_3a
    const/4 v9, 0x0

    .line 1098
    goto :goto_22

    .line 1099
    :catchall_b
    move-exception v0

    .line 1100
    move-object/from16 v21, v6

    .line 1101
    .line 1102
    move-object/from16 v6, v29

    .line 1103
    .line 1104
    :goto_21
    new-instance v9, LE0/d;

    .line 1105
    .line 1106
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1107
    .line 1108
    .line 1109
    :goto_22
    instance-of v0, v9, LE0/d;

    .line 1110
    .line 1111
    if-eqz v0, :cond_3b

    .line 1112
    .line 1113
    const/4 v9, 0x0

    .line 1114
    :cond_3b
    check-cast v9, Ljava/lang/String;

    .line 1115
    .line 1116
    if-eqz v9, :cond_3c

    .line 1117
    .line 1118
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1123
    .line 1124
    .line 1125
    :cond_3c
    :try_start_d
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 1126
    .line 1127
    invoke-interface {v0, v3, v15}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-virtual {v1, v0}, Lr0/D1;->g(Ljava/lang/Object;)Ljava/util/Set;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 1136
    .line 1137
    .line 1138
    :catchall_c
    :goto_23
    invoke-static {v4, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    const/4 v9, 0x0

    .line 1150
    invoke-static {v0, v9, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v4

    .line 1154
    if-nez v4, :cond_3d

    .line 1155
    .line 1156
    const/4 v9, 0x1

    .line 1157
    invoke-static {v0, v7, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    if-nez v0, :cond_3d

    .line 1162
    .line 1163
    :goto_24
    move-object/from16 v0, v19

    .line 1164
    .line 1165
    goto :goto_27

    .line 1166
    :cond_3d
    :try_start_e
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 1170
    move-object v9, v0

    .line 1171
    goto :goto_25

    .line 1172
    :catchall_d
    move-exception v0

    .line 1173
    new-instance v4, LE0/d;

    .line 1174
    .line 1175
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1176
    .line 1177
    .line 1178
    move-object v9, v4

    .line 1179
    :goto_25
    instance-of v0, v9, LE0/d;

    .line 1180
    .line 1181
    if-eqz v0, :cond_3e

    .line 1182
    .line 1183
    const/4 v9, 0x0

    .line 1184
    :cond_3e
    check-cast v9, Ljava/lang/String;

    .line 1185
    .line 1186
    if-nez v9, :cond_3f

    .line 1187
    .line 1188
    move-object/from16 v15, v20

    .line 1189
    .line 1190
    goto :goto_26

    .line 1191
    :cond_3f
    move-object v15, v9

    .line 1192
    :goto_26
    invoke-static {v15}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v0

    .line 1196
    if-eqz v0, :cond_40

    .line 1197
    .line 1198
    goto :goto_24

    .line 1199
    :cond_40
    invoke-static {v15}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    :goto_27
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1204
    .line 1205
    .line 1206
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1207
    .line 1208
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v1}, Lr0/D1;->M()Ljava/util/Set;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v9

    .line 1215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v15

    .line 1223
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    invoke-static {v0}, Lr0/D1;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v19

    .line 1235
    :goto_28
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v0

    .line 1239
    if-eqz v0, :cond_49

    .line 1240
    .line 1241
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1246
    .line 1247
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1248
    .line 1249
    .line 1250
    move-result v20

    .line 1251
    invoke-static/range {v20 .. v20}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v20

    .line 1255
    if-nez v20, :cond_41

    .line 1256
    .line 1257
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    invoke-static {v1, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1262
    .line 1263
    .line 1264
    array-length v1, v1

    .line 1265
    if-nez v1, :cond_41

    .line 1266
    .line 1267
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v1

    .line 1271
    invoke-static {v1, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v1

    .line 1275
    if-nez v1, :cond_42

    .line 1276
    .line 1277
    :cond_41
    move-object/from16 v20, v5

    .line 1278
    .line 1279
    goto/16 :goto_29

    .line 1280
    .line 1281
    :cond_42
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    invoke-static {v1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v1, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v20

    .line 1292
    if-nez v20, :cond_45

    .line 1293
    .line 1294
    move-object/from16 v20, v5

    .line 1295
    .line 1296
    const-string v5, "getUserName"

    .line 1297
    .line 1298
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v5

    .line 1302
    if-nez v5, :cond_44

    .line 1303
    .line 1304
    const-string v5, "getUsername"

    .line 1305
    .line 1306
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1307
    .line 1308
    .line 1309
    move-result v5

    .line 1310
    if-nez v5, :cond_44

    .line 1311
    .line 1312
    const-string v5, "username"

    .line 1313
    .line 1314
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v5

    .line 1318
    if-nez v5, :cond_44

    .line 1319
    .line 1320
    const-string v5, "getTalkerUserName"

    .line 1321
    .line 1322
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v5

    .line 1326
    if-nez v5, :cond_44

    .line 1327
    .line 1328
    const-string v5, "field_UserName"

    .line 1329
    .line 1330
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v5

    .line 1334
    if-nez v5, :cond_44

    .line 1335
    .line 1336
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v5

    .line 1340
    if-nez v5, :cond_44

    .line 1341
    .line 1342
    const-string v5, "v"

    .line 1343
    .line 1344
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1345
    .line 1346
    .line 1347
    move-result v5

    .line 1348
    if-nez v5, :cond_44

    .line 1349
    .line 1350
    const-string v5, "getStatusID"

    .line 1351
    .line 1352
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v5

    .line 1356
    if-nez v5, :cond_44

    .line 1357
    .line 1358
    const-string v5, "getStatusId"

    .line 1359
    .line 1360
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    if-eqz v1, :cond_43

    .line 1365
    .line 1366
    goto :goto_2a

    .line 1367
    :cond_43
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v1

    .line 1371
    invoke-interface {v9, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v1

    .line 1375
    if-nez v1, :cond_44

    .line 1376
    .line 1377
    const/4 v1, 0x0

    .line 1378
    invoke-static {v15, v1, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1379
    .line 1380
    .line 1381
    move-result v5

    .line 1382
    if-nez v5, :cond_44

    .line 1383
    .line 1384
    invoke-static {v15}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v1

    .line 1388
    if-nez v1, :cond_44

    .line 1389
    .line 1390
    :goto_29
    const/4 v1, 0x0

    .line 1391
    goto :goto_2e

    .line 1392
    :cond_44
    :goto_2a
    const/4 v1, 0x1

    .line 1393
    goto :goto_2b

    .line 1394
    :cond_45
    move-object/from16 v20, v5

    .line 1395
    .line 1396
    goto :goto_2a

    .line 1397
    :goto_2b
    :try_start_f
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1398
    .line 1399
    .line 1400
    const/4 v1, 0x0

    .line 1401
    :try_start_10
    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    instance-of v5, v0, Ljava/lang/String;

    .line 1406
    .line 1407
    if-eqz v5, :cond_46

    .line 1408
    .line 1409
    check-cast v0, Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    .line 1410
    .line 1411
    goto :goto_2d

    .line 1412
    :catchall_e
    move-exception v0

    .line 1413
    goto :goto_2c

    .line 1414
    :cond_46
    move-object v0, v1

    .line 1415
    goto :goto_2d

    .line 1416
    :catchall_f
    move-exception v0

    .line 1417
    const/4 v1, 0x0

    .line 1418
    :goto_2c
    new-instance v5, LE0/d;

    .line 1419
    .line 1420
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1421
    .line 1422
    .line 1423
    move-object v0, v5

    .line 1424
    :goto_2d
    nop

    .line 1425
    instance-of v5, v0, LE0/d;

    .line 1426
    .line 1427
    if-eqz v5, :cond_47

    .line 1428
    .line 1429
    move-object v0, v1

    .line 1430
    :cond_47
    check-cast v0, Ljava/lang/String;

    .line 1431
    .line 1432
    if-eqz v0, :cond_48

    .line 1433
    .line 1434
    invoke-static {v0}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-static {v0, v4}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1439
    .line 1440
    .line 1441
    :cond_48
    :goto_2e
    move-object/from16 v1, p0

    .line 1442
    .line 1443
    move-object/from16 v5, v20

    .line 1444
    .line 1445
    goto/16 :goto_28

    .line 1446
    .line 1447
    :cond_49
    const/4 v1, 0x0

    .line 1448
    invoke-static {v4, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    invoke-static {v0}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v4

    .line 1463
    :goto_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1464
    .line 1465
    .line 1466
    move-result v0

    .line 1467
    if-eqz v0, :cond_60

    .line 1468
    .line 1469
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    move-object v5, v0

    .line 1474
    check-cast v5, Ljava/lang/reflect/Field;

    .line 1475
    .line 1476
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1477
    .line 1478
    .line 1479
    move-result v0

    .line 1480
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1481
    .line 1482
    .line 1483
    move-result v0

    .line 1484
    if-eqz v0, :cond_4b

    .line 1485
    .line 1486
    :cond_4a
    :goto_30
    const/4 v5, 0x1

    .line 1487
    const/4 v10, 0x2

    .line 1488
    const/4 v13, 0x0

    .line 1489
    move-object/from16 v14, p0

    .line 1490
    .line 1491
    move/from16 v6, p1

    .line 1492
    .line 1493
    move-object/from16 v1, v21

    .line 1494
    .line 1495
    move-object/from16 v15, v23

    .line 1496
    .line 1497
    move-object/from16 v11, v25

    .line 1498
    .line 1499
    goto/16 :goto_3a

    .line 1500
    .line 1501
    :cond_4b
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v6

    .line 1505
    invoke-static {v6}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual/range {p0 .. p0}, Lr0/D1;->M()Ljava/util/Set;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v9

    .line 1520
    invoke-interface {v9, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    move-result v9

    .line 1524
    const-string v10, "info"

    .line 1525
    .line 1526
    const-string v11, "topic"

    .line 1527
    .line 1528
    const-string v13, "user"

    .line 1529
    .line 1530
    const-string v14, "rj4."

    .line 1531
    .line 1532
    if-eqz v9, :cond_4d

    .line 1533
    .line 1534
    :cond_4c
    :goto_31
    const/4 v9, 0x1

    .line 1535
    goto :goto_33

    .line 1536
    :cond_4d
    const/4 v9, 0x0

    .line 1537
    invoke-static {v0, v9, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result v15

    .line 1541
    if-nez v15, :cond_4f

    .line 1542
    .line 1543
    invoke-static {v0, v9, v14}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v15

    .line 1547
    if-nez v15, :cond_4f

    .line 1548
    .line 1549
    invoke-static {v0}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v0

    .line 1553
    if-eqz v0, :cond_4e

    .line 1554
    .line 1555
    goto :goto_32

    .line 1556
    :cond_4e
    const/4 v9, 0x1

    .line 1557
    invoke-static {v6, v13, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v0

    .line 1561
    if-nez v0, :cond_4c

    .line 1562
    .line 1563
    invoke-static {v6, v8, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    if-nez v0, :cond_4c

    .line 1568
    .line 1569
    invoke-static {v6, v11, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v0

    .line 1573
    if-nez v0, :cond_4c

    .line 1574
    .line 1575
    invoke-static {v6, v10, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1576
    .line 1577
    .line 1578
    move-result v0

    .line 1579
    if-eqz v0, :cond_4a

    .line 1580
    .line 1581
    goto :goto_31

    .line 1582
    :cond_4f
    :goto_32
    const-string v0, "field_"

    .line 1583
    .line 1584
    const/4 v9, 0x0

    .line 1585
    invoke-static {v6, v9, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1586
    .line 1587
    .line 1588
    move-result v0

    .line 1589
    if-nez v0, :cond_4c

    .line 1590
    .line 1591
    const-string v33, "i"

    .line 1592
    .line 1593
    const-string v34, "j"

    .line 1594
    .line 1595
    const-string v26, "b"

    .line 1596
    .line 1597
    const-string v27, "c"

    .line 1598
    .line 1599
    const-string v28, "d"

    .line 1600
    .line 1601
    const-string v29, "e"

    .line 1602
    .line 1603
    const-string v30, "f"

    .line 1604
    .line 1605
    const-string v31, "g"

    .line 1606
    .line 1607
    const-string v32, "h"

    .line 1608
    .line 1609
    filled-new-array/range {v26 .. v34}, [Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1618
    .line 1619
    .line 1620
    move-result v0

    .line 1621
    if-eqz v0, :cond_4a

    .line 1622
    .line 1623
    goto :goto_31

    .line 1624
    :goto_33
    :try_start_11
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 1631
    move-object v9, v0

    .line 1632
    goto :goto_34

    .line 1633
    :catchall_10
    move-exception v0

    .line 1634
    new-instance v9, LE0/d;

    .line 1635
    .line 1636
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1637
    .line 1638
    .line 1639
    :goto_34
    instance-of v0, v9, LE0/d;

    .line 1640
    .line 1641
    if-eqz v0, :cond_50

    .line 1642
    .line 1643
    move-object v9, v1

    .line 1644
    :cond_50
    if-eqz v9, :cond_4a

    .line 1645
    .line 1646
    instance-of v0, v9, Ljava/lang/String;

    .line 1647
    .line 1648
    if-eqz v0, :cond_57

    .line 1649
    .line 1650
    check-cast v9, Ljava/lang/String;

    .line 1651
    .line 1652
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1653
    .line 1654
    .line 1655
    move-result v0

    .line 1656
    if-eqz v0, :cond_51

    .line 1657
    .line 1658
    goto/16 :goto_30

    .line 1659
    .line 1660
    :cond_51
    invoke-static {v9}, Lr0/D1;->C(Ljava/lang/String;)Z

    .line 1661
    .line 1662
    .line 1663
    move-result v0

    .line 1664
    if-eqz v0, :cond_52

    .line 1665
    .line 1666
    goto :goto_36

    .line 1667
    :cond_52
    if-nez p1, :cond_55

    .line 1668
    .line 1669
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1670
    .line 1671
    .line 1672
    move-result v0

    .line 1673
    const/16 v5, 0x78

    .line 1674
    .line 1675
    if-gt v0, v5, :cond_55

    .line 1676
    .line 1677
    const/4 v0, 0x6

    .line 1678
    new-array v0, v0, [C

    .line 1679
    .line 1680
    fill-array-data v0, :array_0

    .line 1681
    .line 1682
    .line 1683
    invoke-static {v9, v0}, LU0/i;->u0(Ljava/lang/String;[C)Ljava/util/List;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0

    .line 1687
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1688
    .line 1689
    .line 1690
    move-result v5

    .line 1691
    if-eqz v5, :cond_53

    .line 1692
    .line 1693
    goto :goto_35

    .line 1694
    :cond_53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    :cond_54
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1699
    .line 1700
    .line 1701
    move-result v5

    .line 1702
    if-eqz v5, :cond_55

    .line 1703
    .line 1704
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v5

    .line 1708
    check-cast v5, Ljava/lang/String;

    .line 1709
    .line 1710
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v5

    .line 1714
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v5

    .line 1718
    invoke-static {v5}, Lr0/D1;->C(Ljava/lang/String;)Z

    .line 1719
    .line 1720
    .line 1721
    move-result v5

    .line 1722
    if-eqz v5, :cond_54

    .line 1723
    .line 1724
    goto :goto_36

    .line 1725
    :cond_55
    :goto_35
    invoke-virtual/range {p0 .. p0}, Lr0/D1;->M()Ljava/util/Set;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v0

    .line 1729
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v0

    .line 1733
    if-nez v0, :cond_56

    .line 1734
    .line 1735
    const/4 v5, 0x1

    .line 1736
    invoke-static {v6, v13, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v0

    .line 1740
    if-nez v0, :cond_56

    .line 1741
    .line 1742
    invoke-static {v6, v8, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1743
    .line 1744
    .line 1745
    move-result v0

    .line 1746
    if-nez v0, :cond_56

    .line 1747
    .line 1748
    invoke-static {v6, v11, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v0

    .line 1752
    if-nez v0, :cond_56

    .line 1753
    .line 1754
    invoke-static {v6, v10, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    if-eqz v0, :cond_4a

    .line 1759
    .line 1760
    :cond_56
    :goto_36
    invoke-static {v9}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1765
    .line 1766
    .line 1767
    goto/16 :goto_30

    .line 1768
    .line 1769
    :cond_57
    move/from16 v6, p1

    .line 1770
    .line 1771
    const/4 v10, 0x2

    .line 1772
    if-lt v6, v10, :cond_58

    .line 1773
    .line 1774
    move-object/from16 v1, v21

    .line 1775
    .line 1776
    move-object/from16 v15, v23

    .line 1777
    .line 1778
    move-object/from16 v11, v25

    .line 1779
    .line 1780
    goto :goto_37

    .line 1781
    :cond_58
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v0

    .line 1785
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v0

    .line 1789
    move-object/from16 v11, v25

    .line 1790
    .line 1791
    const/4 v13, 0x0

    .line 1792
    invoke-static {v0, v13, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1793
    .line 1794
    .line 1795
    move-result v15

    .line 1796
    if-nez v15, :cond_5f

    .line 1797
    .line 1798
    move-object/from16 v15, v23

    .line 1799
    .line 1800
    invoke-static {v0, v13, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1801
    .line 1802
    .line 1803
    move-result v16

    .line 1804
    if-nez v16, :cond_5e

    .line 1805
    .line 1806
    const-string v1, "kotlin."

    .line 1807
    .line 1808
    invoke-static {v0, v13, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1809
    .line 1810
    .line 1811
    move-result v1

    .line 1812
    if-eqz v1, :cond_5a

    .line 1813
    .line 1814
    move-object/from16 v1, v21

    .line 1815
    .line 1816
    :goto_37
    const/4 v5, 0x1

    .line 1817
    const/4 v13, 0x0

    .line 1818
    :cond_59
    move-object/from16 v14, p0

    .line 1819
    .line 1820
    goto/16 :goto_3a

    .line 1821
    .line 1822
    :cond_5a
    const-string v38, "userInfo"

    .line 1823
    .line 1824
    const-string v39, "topic"

    .line 1825
    .line 1826
    const-string v27, "b"

    .line 1827
    .line 1828
    const-string v28, "a"

    .line 1829
    .line 1830
    const-string v29, "c"

    .line 1831
    .line 1832
    const-string v30, "item"

    .line 1833
    .line 1834
    const-string v31, "data"

    .line 1835
    .line 1836
    const-string v32, "info"

    .line 1837
    .line 1838
    const-string v33, "baseData"

    .line 1839
    .line 1840
    const-string v34, "detail"

    .line 1841
    .line 1842
    const-string v35, "status"

    .line 1843
    .line 1844
    const-string v36, "statusInfo"

    .line 1845
    .line 1846
    const-string v37, "user"

    .line 1847
    .line 1848
    filled-new-array/range {v27 .. v39}, [Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v1

    .line 1852
    invoke-static {v1}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v1

    .line 1856
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v5

    .line 1860
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v1

    .line 1864
    if-eqz v1, :cond_5b

    .line 1865
    .line 1866
    move-object/from16 v1, v21

    .line 1867
    .line 1868
    const/4 v5, 0x1

    .line 1869
    const/4 v13, 0x0

    .line 1870
    goto :goto_39

    .line 1871
    :cond_5b
    const/4 v13, 0x0

    .line 1872
    invoke-static {v0, v13, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v1

    .line 1876
    if-nez v1, :cond_5d

    .line 1877
    .line 1878
    invoke-static {v0, v13, v14}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1879
    .line 1880
    .line 1881
    move-result v1

    .line 1882
    if-nez v1, :cond_5d

    .line 1883
    .line 1884
    invoke-static {v0}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v1

    .line 1888
    if-nez v1, :cond_5d

    .line 1889
    .line 1890
    move-object/from16 v1, v21

    .line 1891
    .line 1892
    invoke-static {v0, v13, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1893
    .line 1894
    .line 1895
    move-result v5

    .line 1896
    if-nez v5, :cond_5c

    .line 1897
    .line 1898
    const/4 v5, 0x1

    .line 1899
    invoke-static {v0, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1900
    .line 1901
    .line 1902
    move-result v0

    .line 1903
    if-eqz v0, :cond_59

    .line 1904
    .line 1905
    goto :goto_39

    .line 1906
    :cond_5c
    :goto_38
    const/4 v5, 0x1

    .line 1907
    goto :goto_39

    .line 1908
    :cond_5d
    move-object/from16 v1, v21

    .line 1909
    .line 1910
    goto :goto_38

    .line 1911
    :goto_39
    add-int/lit8 v0, v6, 0x1

    .line 1912
    .line 1913
    move-object/from16 v14, p0

    .line 1914
    .line 1915
    invoke-virtual {v14, v0, v9}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1920
    .line 1921
    .line 1922
    goto :goto_3a

    .line 1923
    :cond_5e
    const/4 v5, 0x1

    .line 1924
    move-object/from16 v14, p0

    .line 1925
    .line 1926
    move-object/from16 v1, v21

    .line 1927
    .line 1928
    goto :goto_3a

    .line 1929
    :cond_5f
    const/4 v5, 0x1

    .line 1930
    move-object/from16 v14, p0

    .line 1931
    .line 1932
    move-object/from16 v1, v21

    .line 1933
    .line 1934
    move-object/from16 v15, v23

    .line 1935
    .line 1936
    :goto_3a
    move-object/from16 v21, v1

    .line 1937
    .line 1938
    move-object/from16 v25, v11

    .line 1939
    .line 1940
    move-object/from16 v23, v15

    .line 1941
    .line 1942
    const/4 v1, 0x0

    .line 1943
    goto/16 :goto_2f

    .line 1944
    .line 1945
    :cond_60
    move-object/from16 v14, p0

    .line 1946
    .line 1947
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1948
    .line 1949
    .line 1950
    return-object v2

    .line 1951
    :goto_3b
    return-object v19

    .line 1952
    nop

    .line 1953
    :array_0
    .array-data 2
        0x2cs
        0x3bs
        0x7cs
        0x20s
        0xas
        0x9s
    .end array-data
.end method

.method public final f(Ljava/lang/Object;)Ljava/util/LinkedHashSet;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_8

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/reflect/Field;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x1

    .line 42
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v2

    .line 51
    new-instance v4, LE0/d;

    .line 52
    .line 53
    invoke-direct {v4, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object v2, v4

    .line 57
    :goto_1
    nop

    .line 58
    instance-of v4, v2, LE0/d;

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    :cond_2
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    instance-of v5, v2, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v2}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    const-string v5, "java."

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-static {v4, v6, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_0

    .line 95
    .line 96
    const-string v5, "android."

    .line 97
    .line 98
    invoke-static {v4, v6, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    instance-of v5, v2, Ljava/util/Collection;

    .line 106
    .line 107
    if-nez v5, :cond_7

    .line 108
    .line 109
    instance-of v5, v2, [Ljava/lang/Object;

    .line 110
    .line 111
    if-eqz v5, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    const-string v5, "text"

    .line 115
    .line 116
    invoke-static {v4, v5, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_6

    .line 121
    .line 122
    const-string v5, "b74."

    .line 123
    .line 124
    invoke-static {v4, v6, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_6

    .line 129
    .line 130
    invoke-static {v4}, Lr0/D1;->y(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_6

    .line 135
    .line 136
    const-string v5, "mj4."

    .line 137
    .line 138
    invoke-static {v4, v6, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-nez v5, :cond_6

    .line 143
    .line 144
    const-string v5, "pj4."

    .line 145
    .line 146
    invoke-static {v4, v6, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_0

    .line 151
    .line 152
    :cond_6
    invoke-virtual {p0, v3, v2}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_7
    :goto_2
    invoke-virtual {p0, v3, v2}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_8
    return-object v0
.end method

.method public final g(Ljava/lang/Object;)Ljava/util/Set;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v0, LF0/u;->a:LF0/u;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "mj4."

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    const-string v3, "pj4."

    .line 26
    .line 27
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    :goto_0
    return-object v0

    .line 34
    :cond_1
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lr0/D1;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v4, 0x0

    .line 56
    const-class v5, Ljava/lang/String;

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    if-eqz v0, :cond_7

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const-string v8, "getParameterTypes(...)"

    .line 82
    .line 83
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    array-length v7, v7

    .line 87
    if-nez v7, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v7, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const-string v12, "d"

    .line 101
    .line 102
    const-string v13, "e"

    .line 103
    .line 104
    const-string v7, "o"

    .line 105
    .line 106
    const-string v8, "l"

    .line 107
    .line 108
    const-string v9, "a"

    .line 109
    .line 110
    const-string v10, "b"

    .line 111
    .line 112
    const-string v11, "c"

    .line 113
    .line 114
    const-string v14, "f"

    .line 115
    .line 116
    const-string v15, "g"

    .line 117
    .line 118
    filled-new-array/range {v7 .. v15}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v5}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    :try_start_0
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    instance-of v5, v0, Ljava/lang/String;

    .line 145
    .line 146
    if-eqz v5, :cond_5

    .line 147
    .line 148
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    move-object v0, v4

    .line 154
    goto :goto_3

    .line 155
    :goto_2
    new-instance v5, LE0/d;

    .line 156
    .line 157
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v5

    .line 161
    :goto_3
    nop

    .line 162
    instance-of v5, v0, LE0/d;

    .line 163
    .line 164
    if-eqz v5, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    move-object v4, v0

    .line 168
    :goto_4
    check-cast v4, Ljava/lang/String;

    .line 169
    .line 170
    if-eqz v4, :cond_2

    .line 171
    .line 172
    invoke-static {v4}, Lr0/D1;->L(Ljava/lang/String;)Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_d

    .line 198
    .line 199
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Ljava/lang/reflect/Field;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-eqz v7, :cond_8

    .line 214
    .line 215
    goto/16 :goto_7

    .line 216
    .line 217
    :cond_8
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-static {v7, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-nez v7, :cond_9

    .line 226
    .line 227
    const-class v7, Ljava/util/Collection;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-nez v7, :cond_9

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_9
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    const-string v8, "getName(...)"

    .line 245
    .line 246
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const-string v9, "PrivateInfo"

    .line 250
    .line 251
    invoke-static {v7, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-nez v7, :cond_a

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const-string v9, "User"

    .line 265
    .line 266
    invoke-static {v7, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-nez v7, :cond_a

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const-string v8, "status"

    .line 280
    .line 281
    invoke-static {v7, v8, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    if-nez v7, :cond_a

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    const-string v8, "b"

    .line 292
    .line 293
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-nez v7, :cond_a

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_a
    :try_start_1
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    goto :goto_6

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    new-instance v7, LE0/d;

    .line 310
    .line 311
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move-object v0, v7

    .line 315
    :goto_6
    nop

    .line 316
    instance-of v7, v0, LE0/d;

    .line 317
    .line 318
    if-eqz v7, :cond_b

    .line 319
    .line 320
    move-object v0, v4

    .line 321
    :cond_b
    if-eqz v0, :cond_c

    .line 322
    .line 323
    move-object/from16 v7, p0

    .line 324
    .line 325
    invoke-virtual {v7, v6, v0}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_5

    .line 333
    .line 334
    :cond_c
    :goto_7
    move-object/from16 v7, p0

    .line 335
    .line 336
    goto/16 :goto_5

    .line 337
    .line 338
    :cond_d
    move-object/from16 v7, p0

    .line 339
    .line 340
    return-object v2
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object p1, p0, Lr0/D1;->l:Landroid/content/Context;

    .line 3
    .line 4
    invoke-static {p1}, LA0/l;->p(Landroid/content/Context;)LA0/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, p0, Lr0/D1;->m:LA0/b0;

    .line 9
    .line 10
    sget-object v1, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    new-instance v2, LA0/u;

    .line 13
    .line 14
    new-instance v5, Lr0/n1;

    .line 15
    .line 16
    const/16 v1, 0x9

    .line 17
    .line 18
    invoke-direct {v5, v1}, Lr0/n1;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v6, LA0/h;

    .line 22
    .line 23
    const/16 v1, 0x14

    .line 24
    .line 25
    invoke-direct {v6, p1, v1}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 26
    .line 27
    .line 28
    new-instance v7, LC/d;

    .line 29
    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    invoke-direct {v7, v1, p0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v8, Lr0/n1;

    .line 36
    .line 37
    const/16 v1, 0xa

    .line 38
    .line 39
    invoke-direct {v8, v1}, Lr0/n1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const-string v3, "text_status"

    .line 43
    .line 44
    const-string v4, "\u72b6\u6001\u9875\u5bc6\u53cb\u9690\u85cf"

    .line 45
    .line 46
    invoke-direct/range {v2 .. v8}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v2}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 53
    .line 54
    const-string v1, "classLoader"

    .line 55
    .line 56
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 60
    .line 61
    const-string v3, "androidx.recyclerview.widget.RecyclerView"

    .line 62
    .line 63
    invoke-interface {v2, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v2, "android.support.v7.widget.RecyclerView"

    .line 68
    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 72
    .line 73
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 77
    .line 78
    invoke-interface {v4, p1, v2}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-nez p1, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v4, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 86
    .line 87
    invoke-static {v4, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 91
    .line 92
    const-string v6, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 93
    .line 94
    invoke-interface {v5, v4, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-nez v4, :cond_1

    .line 99
    .line 100
    iget-object v4, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    invoke-static {v4, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 106
    .line 107
    const-string v6, "android.support.v7.widget.RecyclerView$Adapter"

    .line 108
    .line 109
    invoke-interface {v5, v4, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-nez v4, :cond_1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 121
    .line 122
    const-string v6, "setAdapter"

    .line 123
    .line 124
    invoke-interface {v5, p1, v6, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_2

    .line 129
    .line 130
    new-instance v4, Lr0/C1;

    .line 131
    .line 132
    const/4 v5, 0x5

    .line 133
    invoke-direct {v4, p0, v5}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    :goto_0
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 140
    .line 141
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 145
    .line 146
    invoke-interface {v4, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 151
    .line 152
    if-nez p1, :cond_3

    .line 153
    .line 154
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 155
    .line 156
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 160
    .line 161
    invoke-interface {p2, p1, v2}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-nez p1, :cond_3

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    new-instance p2, Lr0/C1;

    .line 169
    .line 170
    const/4 v1, 0x4

    .line 171
    invoke-direct {p2, p0, v1}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 172
    .line 173
    .line 174
    new-array v1, v0, [Ljava/lang/Object;

    .line 175
    .line 176
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 177
    .line 178
    const-string v4, "onAttachedToWindow"

    .line 179
    .line 180
    invoke-interface {v2, p1, v4, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-eqz v1, :cond_4

    .line 185
    .line 186
    invoke-static {v1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 187
    .line 188
    .line 189
    :cond_4
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 190
    .line 191
    filled-new-array {v3, v1, v1, v1, v1}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 196
    .line 197
    const-string v4, "onLayout"

    .line 198
    .line 199
    invoke-interface {v2, p1, v4, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-eqz v1, :cond_5

    .line 204
    .line 205
    invoke-static {v1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 206
    .line 207
    .line 208
    :cond_5
    const-class v1, Landroid/graphics/Canvas;

    .line 209
    .line 210
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 215
    .line 216
    const-string v4, "dispatchDraw"

    .line 217
    .line 218
    invoke-interface {v2, p1, v4, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-eqz p1, :cond_6

    .line 223
    .line 224
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 225
    .line 226
    .line 227
    :cond_6
    :goto_1
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 232
    .line 233
    const-class v1, Landroid/app/Activity;

    .line 234
    .line 235
    const-string v2, "onWindowFocusChanged"

    .line 236
    .line 237
    invoke-interface {p2, v1, v2, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-eqz p1, :cond_7

    .line 242
    .line 243
    new-instance p2, Lr0/C1;

    .line 244
    .line 245
    invoke-direct {p2, p0, v0}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 246
    .line 247
    .line 248
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 249
    .line 250
    .line 251
    :cond_7
    new-array p1, v0, [Ljava/lang/Object;

    .line 252
    .line 253
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 254
    .line 255
    const-string v0, "onResume"

    .line 256
    .line 257
    invoke-interface {p2, v1, v0, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    if-eqz p1, :cond_8

    .line 262
    .line 263
    new-instance p2, Lr0/C1;

    .line 264
    .line 265
    const/4 v0, 0x1

    .line 266
    invoke-direct {p2, p0, v0}, Lr0/C1;-><init>(Lr0/D1;I)V

    .line 267
    .line 268
    .line 269
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 270
    .line 271
    .line 272
    :cond_8
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    sget-boolean v0, Lz0/i;->a:Z

    .line 7
    .line 8
    invoke-static {}, Lz0/g;->E()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v4, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lr0/D1;->d()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :goto_0
    return v4

    .line 27
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    move v7, v4

    .line 40
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1a

    .line 45
    .line 46
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/reflect/Field;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_2

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_2
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_3

    .line 75
    .line 76
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const/4 v0, 0x0

    .line 82
    goto :goto_3

    .line 83
    :goto_2
    new-instance v9, LE0/d;

    .line 84
    .line 85
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v0, v9

    .line 89
    :goto_3
    nop

    .line 90
    instance-of v9, v0, LE0/d;

    .line 91
    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    :cond_4
    check-cast v0, Ljava/util/List;

    .line 96
    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    :goto_4
    move/from16 v21, v3

    .line 100
    .line 101
    goto/16 :goto_e

    .line 102
    .line 103
    :cond_5
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    move v11, v4

    .line 113
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_e

    .line 118
    .line 119
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    add-int/lit8 v13, v11, 0x1

    .line 124
    .line 125
    if-ltz v11, :cond_d

    .line 126
    .line 127
    if-nez v12, :cond_6

    .line 128
    .line 129
    :goto_6
    move/from16 v21, v3

    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_6
    invoke-virtual {v1, v12}, Lr0/D1;->w(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-nez v14, :cond_7

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_7
    invoke-virtual {v1, v4, v12}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    new-instance v15, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v16

    .line 159
    if-eqz v16, :cond_9

    .line 160
    .line 161
    move/from16 v21, v3

    .line 162
    .line 163
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    move-object v8, v3

    .line 170
    check-cast v8, Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {v5, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_8

    .line 177
    .line 178
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_8
    move/from16 v3, v21

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_9
    move/from16 v21, v3

    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_a

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v9, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    add-int/lit8 v11, v11, -0x1

    .line 203
    .line 204
    if-ltz v11, :cond_b

    .line 205
    .line 206
    invoke-static {v0, v11}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v1, v3}, Lr0/D1;->A(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_b

    .line 215
    .line 216
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v9, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    :cond_b
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-ge v13, v3, :cond_c

    .line 228
    .line 229
    invoke-static {v0, v13}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v1, v3}, Lr0/D1;->A(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_c

    .line 238
    .line 239
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v9, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    :cond_c
    const/16 v18, 0x0

    .line 247
    .line 248
    const/16 v20, 0x3e

    .line 249
    .line 250
    const-string v16, ","

    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    invoke-static/range {v15 .. v20}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const-string v11, "\u72b6\u6001\u9875\u79fb\u9664\u5206\u7ec4\u9879"

    .line 269
    .line 270
    filled-new-array {v11, v3, v8}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_8
    move v11, v13

    .line 278
    move/from16 v3, v21

    .line 279
    .line 280
    goto/16 :goto_5

    .line 281
    .line 282
    :cond_d
    const/16 v22, 0x0

    .line 283
    .line 284
    invoke-static {}, LF0/l;->b0()V

    .line 285
    .line 286
    .line 287
    throw v22

    .line 288
    :cond_e
    move/from16 v21, v3

    .line 289
    .line 290
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-nez v3, :cond_11

    .line 295
    .line 296
    sget-object v3, LG0/a;->c:LG0/a;

    .line 297
    .line 298
    invoke-static {v9, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    :cond_f
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    if-eqz v8, :cond_10

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    check-cast v8, Ljava/lang/Number;

    .line 317
    .line 318
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    if-ltz v8, :cond_f

    .line 323
    .line 324
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-ge v8, v9, :cond_f

    .line 329
    .line 330
    invoke-interface {v0, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_10
    move/from16 v3, v21

    .line 335
    .line 336
    goto/16 :goto_c

    .line 337
    .line 338
    :cond_11
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    move v3, v4

    .line 343
    :goto_a
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    if-eqz v8, :cond_17

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    if-nez v8, :cond_12

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :cond_12
    invoke-virtual {v1, v4, v8}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    new-instance v10, Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    :cond_13
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    if-eqz v12, :cond_14

    .line 374
    .line 375
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    move-object v13, v12

    .line 380
    check-cast v13, Ljava/lang/String;

    .line 381
    .line 382
    invoke-interface {v5, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    if-eqz v13, :cond_13

    .line 387
    .line 388
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_14
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    if-eqz v11, :cond_15

    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_15
    invoke-static {v9, v5}, LF0/w;->Y(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-interface {v9}, Ljava/util/Set;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    if-eqz v11, :cond_16

    .line 408
    .line 409
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 410
    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const/16 v15, 0x3e

    .line 414
    .line 415
    const-string v11, ","

    .line 416
    .line 417
    const/4 v12, 0x0

    .line 418
    const/4 v14, 0x0

    .line 419
    invoke-static/range {v10 .. v15}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    const-string v9, "\u72b6\u6001\u9875\u79fb\u9664\u9879"

    .line 432
    .line 433
    filled-new-array {v9, v3, v8}, [Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    move/from16 v3, v21

    .line 441
    .line 442
    goto :goto_a

    .line 443
    :cond_16
    const/4 v13, 0x0

    .line 444
    const/16 v15, 0x3e

    .line 445
    .line 446
    const-string v11, ","

    .line 447
    .line 448
    const/4 v12, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    invoke-static/range {v10 .. v15}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    const-string v11, "hit="

    .line 455
    .line 456
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    const/4 v15, 0x0

    .line 461
    const/16 v17, 0x3e

    .line 462
    .line 463
    const-string v13, ","

    .line 464
    .line 465
    const/16 v16, 0x0

    .line 466
    .line 467
    move-object v12, v9

    .line 468
    invoke-static/range {v12 .. v17}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    const-string v11, "remain="

    .line 473
    .line 474
    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    const-string v11, "\u72b6\u6001\u9875\u4fdd\u7559\u6df7\u5408\u9879"

    .line 487
    .line 488
    filled-new-array {v11, v10, v9, v8}, [Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    invoke-static {v8}, Li0/a;->a([Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_a

    .line 496
    .line 497
    :cond_17
    :goto_c
    if-nez v3, :cond_19

    .line 498
    .line 499
    if-eqz v7, :cond_18

    .line 500
    .line 501
    goto :goto_d

    .line 502
    :cond_18
    move v7, v4

    .line 503
    goto :goto_e

    .line 504
    :cond_19
    :goto_d
    move/from16 v7, v21

    .line 505
    .line 506
    :goto_e
    move/from16 v3, v21

    .line 507
    .line 508
    goto/16 :goto_1

    .line 509
    .line 510
    :cond_1a
    if-eqz v7, :cond_1b

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const-string v3, "\u72b6\u6001\u9875\u6570\u636e\u5df2\u8fc7\u6ee4"

    .line 521
    .line 522
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iget-object v0, v1, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 530
    .line 531
    invoke-virtual {v0, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    check-cast v0, Landroid/view/View;

    .line 536
    .line 537
    if-eqz v0, :cond_1b

    .line 538
    .line 539
    new-instance v3, LA0/r;

    .line 540
    .line 541
    const/16 v4, 0xb

    .line 542
    .line 543
    invoke-direct {v3, v1, v0, v2, v4}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 547
    .line 548
    .line 549
    :cond_1b
    return v7
.end method

.method public final j(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, LA0/b0;->h:Ljava/util/List;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, LF0/s;->a:LF0/s;

    .line 15
    .line 16
    :cond_1
    const-string v2, "iib"

    .line 17
    .line 18
    invoke-static {v0, v2}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "l06"

    .line 23
    .line 24
    invoke-static {v0, v2}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    add-int/lit8 p2, p2, 0x1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_1
    if-ge p2, v2, :cond_6

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v5}, Lr0/D1;->n(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_4
    :goto_2
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v3}, Lr0/D1;->l(Landroid/view/View;)Landroid/widget/TextView;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    :goto_3
    return-object v1
.end method

.method public final l(Landroid/view/View;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, LA0/b0;->g:Ljava/util/List;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, LF0/s;->a:LF0/s;

    .line 19
    .line 20
    :cond_1
    const-string v2, "om7"

    .line 21
    .line 22
    invoke-static {v1, v2}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "spk"

    .line 27
    .line 28
    invoke-static {v1, v2}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1, p0, v0, p1}, Lr0/D1;->m(Ljava/util/Set;Lr0/D1;Ljava/util/ArrayList;Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroid/widget/TextView;

    .line 44
    .line 45
    return-object p1
.end method

.method public final s(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/D1;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    new-instance v1, Lr0/B1;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v4

    .line 30
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 37
    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_1
    invoke-direct {v1, v2, v3, v4}, Lr0/B1;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    const/16 v0, 0x8

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 61
    .line 62
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public final t(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lr0/D1;->s(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr0/D1;->b:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v3

    .line 22
    :goto_0
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_1
    invoke-virtual {p0, v1}, Lr0/D1;->x(Landroid/view/View;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v2, v4}, LD/h;->U(II)LR0/c;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :cond_3
    move-object v4, v2

    .line 46
    check-cast v4, LR0/b;

    .line 47
    .line 48
    iget-boolean v5, v4, LR0/b;->c:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    invoke-virtual {v4}, LR0/b;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    move-object v5, v4

    .line 57
    check-cast v5, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    if-ne v5, p1, :cond_3

    .line 68
    .line 69
    move-object v3, v4

    .line 70
    :cond_4
    check-cast v3, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v3, :cond_7

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    add-int/lit8 v2, p1, -0x1

    .line 79
    .line 80
    :goto_1
    const/4 v3, -0x1

    .line 81
    if-ge v3, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v3}, Lr0/D1;->l(Landroid/view/View;)Landroid/widget/TextView;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lr0/D1;->s(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    add-int/lit8 v2, v2, -0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    :goto_2
    invoke-virtual {p0, v1, p1}, Lr0/D1;->j(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lr0/D1;->s(Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_7
    :goto_3
    return-void
.end method

.method public final w(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, LA0/b0;->d:Ljava/util/List;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget-object v0, LF0/s;->a:LF0/s;

    .line 22
    .line 23
    :cond_1
    const-string v1, "kf4.c"

    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    const-string v0, "mj4."

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {p1, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    const-string v0, "mc4.c"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    const-string v0, "qf4.c"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    const-string v0, "ah4.c"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    invoke-static {p1}, Lr0/D1;->v(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    const-string v0, ".c"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const-string v0, ".k"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    return v1

    .line 97
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 98
    return p1
.end method

.method public final x(Landroid/view/View;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-static {p1}, Lr0/D1;->u(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_1
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v1, v1, LA0/b0;->f:Ljava/util/List;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-object v1, v2

    .line 23
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    sget-object v1, LF0/s;->a:LF0/s;

    .line 26
    .line 27
    :cond_3
    const-string v3, "m91"

    .line 28
    .line 29
    invoke-static {v1, v3}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {}, Lr0/D1;->K()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const-string v4, "pmd"

    .line 38
    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    const-string v3, "m97"

    .line 42
    .line 43
    invoke-static {v1, v3}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v4}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-static {v1, v4}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_1
    invoke-static {p1}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    :goto_2
    return v0

    .line 75
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_3
    const/16 v1, 0x8

    .line 80
    .line 81
    if-ge v0, v1, :cond_d

    .line 82
    .line 83
    instance-of v1, p1, Landroid/app/Activity;

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    move-object v2, p1

    .line 88
    check-cast v2, Landroid/app/Activity;

    .line 89
    .line 90
    goto :goto_8

    .line 91
    :cond_6
    if-eqz p1, :cond_7

    .line 92
    .line 93
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v3, "mBase"

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_4

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto :goto_6

    .line 106
    :cond_7
    move-object v1, v2

    .line 107
    :goto_4
    if-eqz v1, :cond_8

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    :cond_8
    if-eqz v1, :cond_9

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move-object p1, v2

    .line 121
    :goto_5
    instance-of v1, p1, Landroid/content/Context;

    .line 122
    .line 123
    if-eqz v1, :cond_a

    .line 124
    .line 125
    check-cast p1, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    move-object p1, v2

    .line 129
    goto :goto_7

    .line 130
    :goto_6
    new-instance v1, LE0/d;

    .line 131
    .line 132
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object p1, v1

    .line 136
    :goto_7
    nop

    .line 137
    instance-of v1, p1, LE0/d;

    .line 138
    .line 139
    if-eqz v1, :cond_b

    .line 140
    .line 141
    move-object p1, v2

    .line 142
    :cond_b
    check-cast p1, Landroid/content/Context;

    .line 143
    .line 144
    if-nez p1, :cond_c

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_d
    :goto_8
    invoke-virtual {p0, v2}, Lr0/D1;->z(Landroid/app/Activity;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    return p1
.end method

.method public final z(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lr0/D1;->N()LA0/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, LA0/b0;->a:Ljava/util/List;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v0, LF0/s;->a:LF0/s;

    .line 24
    .line 25
    :cond_1
    const-string v1, "com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity"

    .line 26
    .line 27
    invoke-static {v0, v1}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    return p1
.end method
