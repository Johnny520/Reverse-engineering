.class public final Lr0/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final j:[Ljava/lang/String;

.field public static final k:[J

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:Ljava/util/Set;

.field public static final o:[Ljava/lang/String;

.field public static final p:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile g:Ljava/lang/Object;

.field public volatile h:Z

.field public volatile i:LA0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "\u53ef\u89c1\u8303\u56f4"

    .line 2
    .line 3
    const-string v1, "\u95ae\u3125\u578e\u93c8\u5b2a\u5f38\u9359\ue21d\ue746"

    .line 4
    .line 5
    const-string v2, "\u90e8\u5206\u670b\u53cb\u53ef\u89c1"

    .line 6
    .line 7
    const-string v3, "\u90e8\u5206\u53ef\u89c1"

    .line 8
    .line 9
    const-string v4, "\u670b\u53cb\u53ef\u89c1"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lr0/f1;->j:[Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    new-array v0, v0, [J

    .line 19
    .line 20
    fill-array-data v0, :array_0

    .line 21
    .line 22
    .line 23
    sput-object v0, Lr0/f1;->k:[J

    .line 24
    .line 25
    const-string v0, "com.tencent.mm.plugin.sns.ui.SnsUserUI"

    .line 26
    .line 27
    const-string v1, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lr0/f1;->l:[Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "com.tencent.mm.plugin.sns.ui.improve."

    .line 36
    .line 37
    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.component."

    .line 38
    .line 39
    const-string v2, "com.tencent.mm.plugin.sns.model."

    .line 40
    .line 41
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lr0/f1;->m:[Ljava/lang/String;

    .line 46
    .line 47
    const-string v0, "notifyItemInserted"

    .line 48
    .line 49
    const-string v1, "notifyItemRangeInserted"

    .line 50
    .line 51
    const-string v2, "notifyDataSetChanged"

    .line 52
    .line 53
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lr0/f1;->n:Ljava/util/Set;

    .line 62
    .line 63
    const-string v5, "field_userName"

    .line 64
    .line 65
    const-string v6, "field_username"

    .line 66
    .line 67
    const-string v1, "Username"

    .line 68
    .line 69
    const-string v2, "UserName"

    .line 70
    .line 71
    const-string v3, "userName"

    .line 72
    .line 73
    const-string v4, "username"

    .line 74
    .line 75
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lr0/f1;->o:[Ljava/lang/String;

    .line 80
    .line 81
    const-string v5, "LikeUserList"

    .line 82
    .line 83
    const-string v6, "CommentUserList"

    .line 84
    .line 85
    const-string v1, "field_userName"

    .line 86
    .line 87
    const-string v2, "field_snsId"

    .line 88
    .line 89
    const-string v3, "field_createTime"

    .line 90
    .line 91
    const-string v4, "field_content"

    .line 92
    .line 93
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lr0/f1;->p:[Ljava/lang/String;

    .line 98
    .line 99
    return-void

    .line 100
    nop

    .line 101
    :array_0
    .array-data 8
        0x0
        0x78
        0x168
        0x384
        0x5dc
        0x9c4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/f1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr0/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr0/f1;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lr0/f1;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lr0/f1;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lr0/f1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    return-void
.end method

.method public static c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string p2, "UserName"

    .line 12
    .line 13
    invoke-static {p0, p2}, Lr0/f1;->g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v0

    .line 31
    :goto_0
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1, p1}, Lr0/f1;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    move-object p0, v0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance p1, LE0/d;

    .line 27
    .line 28
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p0, p1

    .line 32
    :cond_1
    :goto_0
    nop

    .line 33
    instance-of p1, p0, LE0/d;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v0, p0

    .line 39
    :goto_1
    return-object v0
.end method

.method public static h()Ljava/util/Set;
    .locals 4

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LF0/s;->a:LF0/s;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v0, Lq0/h;

    .line 13
    .line 14
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lq0/h;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    invoke-static {v0}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v3, v2

    .line 89
    check-cast v3, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_2

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0
.end method

.method public static k(Ljava/lang/Object;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {v4, v3}, Lr0/f1;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v1
.end method

.method public static l(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.component.g2"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v1, "UserName"

    .line 15
    .line 16
    invoke-static {p2, v1}, Lr0/f1;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_0
    const/4 p2, 0x0

    .line 27
    sget-object v1, Lr0/f1;->o:[Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    array-length p1, v1

    .line 38
    move v2, p2

    .line 39
    :goto_0
    if-ge v2, p1, :cond_2

    .line 40
    .line 41
    aget-object v3, v1, v2

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4, v3}, Lr0/f1;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object p1, Lr0/f1;->p:[Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, p1}, Lr0/f1;->k(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    const-string p1, "com.tencent.mm.plugin.sns."

    .line 69
    .line 70
    invoke-static {p0, p1, p2}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    :cond_3
    array-length p1, v1

    .line 77
    :goto_1
    if-ge p2, p1, :cond_5

    .line 78
    .line 79
    aget-object v2, v1, p2

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3, v2}, Lr0/f1;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    return-object v2

    .line 95
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static n(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/LinkedHashSet;)V
    .locals 8

    .line 1
    new-instance v0, Ldalvik/system/DexFile;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldalvik/system/DexFile;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Ldalvik/system/DexFile;->entries()Ljava/util/Enumeration;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    sget-object v2, Lr0/f1;->m:[Ljava/lang/String;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_1
    const/4 v5, 0x3

    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    aget-object v5, v2, v4

    .line 30
    .line 31
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    if-eqz v5, :cond_5

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    :try_start_2
    new-instance v2, LE0/d;

    .line 51
    .line 52
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v1, v2

    .line 56
    :goto_2
    nop

    .line 57
    instance-of v2, v1, LE0/d;

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    :cond_1
    check-cast v1, Ljava/lang/Class;

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v4, "getDeclaredMethods(...)"

    .line 72
    .line 73
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    array-length v4, v2

    .line 77
    :goto_3
    if-ge v3, v4, :cond_0

    .line 78
    .line 79
    aget-object v5, v2, v3

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_4

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    const-string v7, "getParameterTypes(...)"

    .line 96
    .line 97
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    array-length v6, v6

    .line 101
    if-nez v6, :cond_3

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_3
    if-eqz p3, :cond_4

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    filled-new-array {p3}, [Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    :goto_4
    invoke-virtual {p4, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catchall_1
    move-exception p0

    .line 125
    goto :goto_5

    .line 126
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    invoke-virtual {v0}, Ldalvik/system/DexFile;->close()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :goto_5
    invoke-virtual {v0}, Ldalvik/system/DexFile;->close()V

    .line 137
    .line 138
    .line 139
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/f1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object v2, p1

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getDeclaredFields(...)"

    .line 22
    .line 23
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v4, v3

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_1
    if-ge v5, v4, :cond_0

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v5, v5, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object v1, p1

    .line 55
    :cond_3
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    return-object v1
.end method

.method public final b(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_b

    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-nez p3, :cond_1

    .line 14
    .line 15
    const-string p3, "com.tencent.mm.plugin.sns."

    .line 16
    .line 17
    invoke-static {p1, p3, v1}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-nez p3, :cond_1

    .line 22
    .line 23
    goto/16 :goto_b

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    return-object p3

    .line 32
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const-string v2, "getUserName"

    .line 37
    .line 38
    invoke-virtual {p3, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p3

    .line 44
    new-instance v2, LE0/d;

    .line 45
    .line 46
    invoke-direct {v2, p3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p3, v2

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v2, p3, LE0/d;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    move-object p3, v0

    .line 56
    :cond_3
    check-cast p3, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz p3, :cond_8

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {p3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    instance-of v3, p3, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    check-cast p3, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception p3

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move-object p3, v0

    .line 78
    goto :goto_2

    .line 79
    :goto_1
    new-instance v3, LE0/d;

    .line 80
    .line 81
    invoke-direct {v3, p3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object p3, v3

    .line 85
    :goto_2
    nop

    .line 86
    instance-of v3, p3, LE0/d;

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    move-object p3, v0

    .line 91
    :cond_5
    check-cast p3, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz p3, :cond_6

    .line 94
    .line 95
    invoke-static {p3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    goto :goto_3

    .line 104
    :cond_6
    move-object p3, v0

    .line 105
    :goto_3
    if-eqz p3, :cond_8

    .line 106
    .line 107
    invoke-static {p3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_7

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_8

    .line 119
    .line 120
    return-object p3

    .line 121
    :cond_8
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    if-nez p4, :cond_9

    .line 126
    .line 127
    sget-object p3, LF0/s;->a:LF0/s;

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_9
    iget-object v3, p0, Lr0/f1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 131
    .line 132
    invoke-virtual {v3, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-nez v4, :cond_e

    .line 137
    .line 138
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    const-string v5, "getDeclaredMethods(...)"

    .line 143
    .line 144
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v5, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    array-length v6, v4

    .line 153
    :goto_5
    if-ge v1, v6, :cond_b

    .line 154
    .line 155
    aget-object v7, v4, v1

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    const-string v9, "getParameterTypes(...)"

    .line 162
    .line 163
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    array-length v8, v8

    .line 167
    if-nez v8, :cond_a

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v8, p4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_a

    .line 178
    .line 179
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_c

    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_c
    invoke-virtual {v3, p3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    if-nez p3, :cond_d

    .line 210
    .line 211
    move-object v4, v5

    .line 212
    goto :goto_7

    .line 213
    :cond_d
    move-object v4, p3

    .line 214
    :cond_e
    :goto_7
    move-object p3, v4

    .line 215
    check-cast p3, Ljava/util/List;

    .line 216
    .line 217
    :goto_8
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    :cond_f
    :goto_9
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_12

    .line 226
    .line 227
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    check-cast v1, Ljava/lang/reflect/Method;

    .line 232
    .line 233
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 240
    goto :goto_a

    .line 241
    :catchall_2
    move-exception v1

    .line 242
    new-instance v3, LE0/d;

    .line 243
    .line 244
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    move-object v1, v3

    .line 248
    :goto_a
    nop

    .line 249
    instance-of v3, v1, LE0/d;

    .line 250
    .line 251
    if-eqz v3, :cond_10

    .line 252
    .line 253
    move-object v1, v0

    .line 254
    :cond_10
    if-nez v1, :cond_11

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_11
    invoke-static {v1, p2, p4}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-eqz v1, :cond_f

    .line 262
    .line 263
    return-object v1

    .line 264
    :cond_12
    :goto_b
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v7, v1, Lr0/f1;->g:Ljava/lang/Object;

    .line 15
    .line 16
    if-eq v0, v7, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v8, "com.tencent.mm.plugin.sns.ui.improve.component.g2"

    .line 27
    .line 28
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    move/from16 v20, v6

    .line 36
    .line 37
    goto/16 :goto_2b

    .line 38
    .line 39
    :cond_1
    :goto_1
    iget-object v7, v1, Lr0/f1;->g:Ljava/lang/Object;

    .line 40
    .line 41
    if-eq v0, v7, :cond_2

    .line 42
    .line 43
    iput-object v0, v1, Lr0/f1;->g:Ljava/lang/Object;

    .line 44
    .line 45
    :cond_2
    const-string v7, "data"

    .line 46
    .line 47
    invoke-static {v0, v7}, Lr0/f1;->g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v7, v0

    .line 52
    check-cast v7, Ljava/util/List;

    .line 53
    .line 54
    if-nez v7, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    sget-boolean v0, Lz0/i;->a:Z

    .line 58
    .line 59
    invoke-static {}, Lz0/g;->x()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    invoke-static {}, Lz0/g;->s()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_51

    .line 70
    .line 71
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsCloseFriendPosts()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_51

    .line 80
    .line 81
    invoke-static {}, Lr0/f1;->h()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    :cond_4
    move/from16 v18, v5

    .line 92
    .line 93
    goto/16 :goto_2a

    .line 94
    .line 95
    :cond_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sub-int/2addr v0, v5

    .line 100
    move v9, v0

    .line 101
    :goto_2
    if-ge v4, v9, :cond_4

    .line 102
    .line 103
    invoke-static {v7, v9}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    if-nez v10, :cond_6

    .line 108
    .line 109
    move/from16 v16, v4

    .line 110
    .line 111
    goto/16 :goto_29

    .line 112
    .line 113
    :cond_6
    invoke-static {v10, v8, v2, v3}, Lz0/w;->i(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    :goto_3
    move/from16 v16, v4

    .line 120
    .line 121
    goto/16 :goto_28

    .line 122
    .line 123
    :cond_7
    iget-object v11, v1, Lr0/f1;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    .line 125
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v11, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lr0/b1;

    .line 134
    .line 135
    const/4 v12, 0x0

    .line 136
    if-nez v0, :cond_12

    .line 137
    .line 138
    invoke-static {v10, v2, v3}, Lr0/f1;->m(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    new-instance v13, Lr0/b1;

    .line 145
    .line 146
    invoke-direct {v13, v12, v12, v0}, Lr0/b1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_8

    .line 150
    .line 151
    :cond_8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v1, v0}, Lr0/f1;->i(Ljava/lang/Class;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    :cond_9
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_c

    .line 168
    .line 169
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v14, v0

    .line 174
    check-cast v14, Ljava/lang/reflect/Method;

    .line 175
    .line 176
    :try_start_0
    invoke-virtual {v14, v10, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    goto :goto_5

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    new-instance v15, LE0/d;

    .line 183
    .line 184
    invoke-direct {v15, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    move-object v0, v15

    .line 188
    :goto_5
    nop

    .line 189
    instance-of v15, v0, LE0/d;

    .line 190
    .line 191
    if-eqz v15, :cond_a

    .line 192
    .line 193
    move-object v0, v12

    .line 194
    :cond_a
    if-nez v0, :cond_b

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_b
    invoke-static {v0, v2, v3}, Lr0/f1;->m(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-eqz v0, :cond_9

    .line 202
    .line 203
    new-instance v13, Lr0/b1;

    .line 204
    .line 205
    invoke-direct {v13, v14, v12, v0}, Lr0/b1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 206
    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_c
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v1, v0}, Lr0/f1;->a(Ljava/lang/Class;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    :cond_d
    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_10

    .line 226
    .line 227
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v14, v0

    .line 232
    check-cast v14, Ljava/lang/reflect/Field;

    .line 233
    .line 234
    :try_start_1
    invoke-virtual {v14, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 238
    goto :goto_7

    .line 239
    :catchall_1
    move-exception v0

    .line 240
    new-instance v15, LE0/d;

    .line 241
    .line 242
    invoke-direct {v15, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    move-object v0, v15

    .line 246
    :goto_7
    nop

    .line 247
    instance-of v15, v0, LE0/d;

    .line 248
    .line 249
    if-eqz v15, :cond_e

    .line 250
    .line 251
    move-object v0, v12

    .line 252
    :cond_e
    if-nez v0, :cond_f

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_f
    invoke-static {v0, v2, v3}, Lr0/f1;->m(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_d

    .line 260
    .line 261
    new-instance v13, Lr0/b1;

    .line 262
    .line 263
    invoke-direct {v13, v12, v14, v0}, Lr0/b1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_10
    move-object v13, v12

    .line 268
    :goto_8
    if-eqz v13, :cond_11

    .line 269
    .line 270
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v11, v0, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-object v0, v13

    .line 278
    goto :goto_9

    .line 279
    :cond_11
    move-object v0, v12

    .line 280
    :goto_9
    if-nez v0, :cond_12

    .line 281
    .line 282
    move-object v0, v12

    .line 283
    goto :goto_d

    .line 284
    :cond_12
    :try_start_2
    iget-object v11, v0, Lr0/b1;->a:Ljava/lang/reflect/Method;

    .line 285
    .line 286
    if-eqz v11, :cond_13

    .line 287
    .line 288
    invoke-virtual {v11, v10, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    goto :goto_a

    .line 293
    :cond_13
    iget-object v11, v0, Lr0/b1;->b:Ljava/lang/reflect/Field;

    .line 294
    .line 295
    if-eqz v11, :cond_14

    .line 296
    .line 297
    invoke-virtual {v11, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    goto :goto_a

    .line 302
    :cond_14
    move-object v11, v10

    .line 303
    :goto_a
    if-nez v11, :cond_16

    .line 304
    .line 305
    :cond_15
    move-object v0, v12

    .line 306
    goto :goto_c

    .line 307
    :cond_16
    iget-object v0, v0, Lr0/b1;->c:Ljava/lang/reflect/Field;

    .line 308
    .line 309
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    instance-of v11, v0, Ljava/lang/String;

    .line 314
    .line 315
    if-eqz v11, :cond_17

    .line 316
    .line 317
    check-cast v0, Ljava/lang/String;

    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_17
    move-object v0, v12

    .line 321
    :goto_b
    if-eqz v0, :cond_15

    .line 322
    .line 323
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 331
    goto :goto_c

    .line 332
    :catchall_2
    move-exception v0

    .line 333
    new-instance v11, LE0/d;

    .line 334
    .line 335
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    move-object v0, v11

    .line 339
    :goto_c
    nop

    .line 340
    instance-of v11, v0, LE0/d;

    .line 341
    .line 342
    if-eqz v11, :cond_18

    .line 343
    .line 344
    move-object v0, v12

    .line 345
    :cond_18
    check-cast v0, Ljava/lang/String;

    .line 346
    .line 347
    :goto_d
    if-eqz v0, :cond_1b

    .line 348
    .line 349
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    if-eqz v11, :cond_19

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_19
    invoke-interface {v8, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    if-eqz v10, :cond_1a

    .line 361
    .line 362
    goto/16 :goto_3

    .line 363
    .line 364
    :cond_1a
    move-object v0, v12

    .line 365
    goto/16 :goto_3

    .line 366
    .line 367
    :cond_1b
    :goto_e
    const-string v11, "com.tencent.mm.plugin.sns."

    .line 368
    .line 369
    invoke-static {v10, v11, v6}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_1e

    .line 374
    .line 375
    invoke-virtual {v1, v10, v8}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-eqz v0, :cond_1c

    .line 380
    .line 381
    goto/16 :goto_3

    .line 382
    .line 383
    :cond_1c
    invoke-static {v10, v8, v3}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-eqz v0, :cond_1d

    .line 388
    .line 389
    goto/16 :goto_3

    .line 390
    .line 391
    :cond_1d
    invoke-virtual {v1, v10, v8, v2, v3}, Lr0/f1;->b(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-eqz v0, :cond_1e

    .line 396
    .line 397
    goto/16 :goto_3

    .line 398
    .line 399
    :cond_1e
    iget-object v13, v1, Lr0/f1;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 400
    .line 401
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    invoke-virtual {v13, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    sget-object v15, Lr0/f1;->p:[Ljava/lang/String;

    .line 410
    .line 411
    if-nez v0, :cond_2f

    .line 412
    .line 413
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {v1, v0}, Lr0/f1;->i(Ljava/lang/Class;)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    move/from16 v16, v4

    .line 422
    .line 423
    new-instance v4, Ljava/util/ArrayList;

    .line 424
    .line 425
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 426
    .line 427
    .line 428
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v17

    .line 432
    :goto_f
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_2d

    .line 437
    .line 438
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    move-object v0, v5

    .line 443
    check-cast v0, Ljava/lang/reflect/Method;

    .line 444
    .line 445
    :try_start_3
    invoke-virtual {v0, v10, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 449
    goto :goto_10

    .line 450
    :catchall_3
    move-exception v0

    .line 451
    new-instance v12, LE0/d;

    .line 452
    .line 453
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    move-object v0, v12

    .line 457
    :goto_10
    nop

    .line 458
    instance-of v12, v0, LE0/d;

    .line 459
    .line 460
    if-eqz v12, :cond_1f

    .line 461
    .line 462
    const/4 v12, 0x0

    .line 463
    goto :goto_11

    .line 464
    :cond_1f
    move-object v12, v0

    .line 465
    :goto_11
    if-nez v12, :cond_20

    .line 466
    .line 467
    goto/16 :goto_15

    .line 468
    .line 469
    :cond_20
    if-eqz v2, :cond_21

    .line 470
    .line 471
    invoke-virtual {v2, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_21

    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_21
    if-eqz v3, :cond_22

    .line 479
    .line 480
    invoke-virtual {v3, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_22

    .line 485
    .line 486
    goto :goto_14

    .line 487
    :cond_22
    invoke-static {v12, v11, v6}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_23

    .line 492
    .line 493
    goto :goto_14

    .line 494
    :cond_23
    invoke-static {v12, v15}, Lr0/f1;->k(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_24

    .line 499
    .line 500
    goto :goto_14

    .line 501
    :cond_24
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v1, v0}, Lr0/f1;->a(Ljava/lang/Class;)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 510
    .line 511
    .line 512
    move-result v19

    .line 513
    if-eqz v19, :cond_25

    .line 514
    .line 515
    goto :goto_15

    .line 516
    :cond_25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 517
    .line 518
    .line 519
    move-result-object v19

    .line 520
    :goto_12
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_2b

    .line 525
    .line 526
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    check-cast v0, Ljava/lang/reflect/Field;

    .line 531
    .line 532
    :try_start_4
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 536
    goto :goto_13

    .line 537
    :catchall_4
    move-exception v0

    .line 538
    new-instance v6, LE0/d;

    .line 539
    .line 540
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    move-object v0, v6

    .line 544
    :goto_13
    nop

    .line 545
    instance-of v6, v0, LE0/d;

    .line 546
    .line 547
    if-eqz v6, :cond_26

    .line 548
    .line 549
    const/4 v0, 0x0

    .line 550
    :cond_26
    if-nez v0, :cond_27

    .line 551
    .line 552
    goto :goto_16

    .line 553
    :cond_27
    if-eqz v3, :cond_28

    .line 554
    .line 555
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    if-nez v6, :cond_2a

    .line 560
    .line 561
    :cond_28
    if-eqz v2, :cond_29

    .line 562
    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    if-nez v6, :cond_2a

    .line 568
    .line 569
    :cond_29
    invoke-static {v0, v15}, Lr0/f1;->k(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-eqz v0, :cond_2c

    .line 574
    .line 575
    :cond_2a
    :goto_14
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    :cond_2b
    :goto_15
    const/4 v5, 0x1

    .line 579
    const/4 v6, 0x0

    .line 580
    const/4 v12, 0x0

    .line 581
    goto/16 :goto_f

    .line 582
    .line 583
    :cond_2c
    :goto_16
    const/4 v6, 0x0

    .line 584
    goto :goto_12

    .line 585
    :cond_2d
    const/4 v0, 0x2

    .line 586
    invoke-static {v4, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v13, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    if-nez v4, :cond_2e

    .line 595
    .line 596
    goto :goto_17

    .line 597
    :cond_2e
    move-object v0, v4

    .line 598
    goto :goto_17

    .line 599
    :cond_2f
    move/from16 v16, v4

    .line 600
    .line 601
    :goto_17
    check-cast v0, Ljava/util/List;

    .line 602
    .line 603
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    :cond_30
    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_3b

    .line 612
    .line 613
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, Ljava/lang/reflect/Method;

    .line 618
    .line 619
    const/4 v5, 0x0

    .line 620
    :try_start_5
    invoke-virtual {v0, v10, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 624
    move-object v5, v0

    .line 625
    goto :goto_19

    .line 626
    :catchall_5
    move-exception v0

    .line 627
    new-instance v5, LE0/d;

    .line 628
    .line 629
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 630
    .line 631
    .line 632
    :goto_19
    instance-of v0, v5, LE0/d;

    .line 633
    .line 634
    if-eqz v0, :cond_31

    .line 635
    .line 636
    const/4 v5, 0x0

    .line 637
    :cond_31
    if-nez v5, :cond_32

    .line 638
    .line 639
    goto :goto_18

    .line 640
    :cond_32
    invoke-static {v5, v8, v3}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    if-eqz v0, :cond_33

    .line 645
    .line 646
    :goto_1a
    move-object v5, v0

    .line 647
    goto :goto_1d

    .line 648
    :cond_33
    invoke-virtual {v1, v5, v8, v2, v3}, Lr0/f1;->b(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-eqz v0, :cond_34

    .line 653
    .line 654
    goto :goto_1a

    .line 655
    :cond_34
    invoke-static {v5, v15}, Lr0/f1;->k(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-eqz v0, :cond_35

    .line 660
    .line 661
    invoke-virtual {v1, v5, v8}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    if-eqz v0, :cond_35

    .line 666
    .line 667
    goto :goto_1a

    .line 668
    :cond_35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v1, v0}, Lr0/f1;->a(Ljava/lang/Class;)Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    :cond_36
    :goto_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-eqz v0, :cond_3a

    .line 685
    .line 686
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    check-cast v0, Ljava/lang/reflect/Field;

    .line 691
    .line 692
    const/4 v12, 0x1

    .line 693
    :try_start_6
    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 700
    move-object v12, v0

    .line 701
    goto :goto_1c

    .line 702
    :catchall_6
    move-exception v0

    .line 703
    new-instance v12, LE0/d;

    .line 704
    .line 705
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 706
    .line 707
    .line 708
    :goto_1c
    instance-of v0, v12, LE0/d;

    .line 709
    .line 710
    if-eqz v0, :cond_37

    .line 711
    .line 712
    const/4 v12, 0x0

    .line 713
    :cond_37
    if-nez v12, :cond_38

    .line 714
    .line 715
    goto :goto_1b

    .line 716
    :cond_38
    invoke-static {v12, v8, v3}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    if-eqz v0, :cond_39

    .line 721
    .line 722
    goto :goto_1a

    .line 723
    :cond_39
    invoke-static {v12, v15}, Lr0/f1;->k(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-eqz v0, :cond_36

    .line 728
    .line 729
    invoke-virtual {v1, v12, v8}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    if-eqz v0, :cond_36

    .line 734
    .line 735
    goto :goto_1a

    .line 736
    :cond_3a
    const/4 v5, 0x0

    .line 737
    :goto_1d
    if-eqz v5, :cond_30

    .line 738
    .line 739
    move-object v0, v5

    .line 740
    goto :goto_1e

    .line 741
    :cond_3b
    const/4 v0, 0x0

    .line 742
    :goto_1e
    if-eqz v0, :cond_3c

    .line 743
    .line 744
    goto/16 :goto_28

    .line 745
    .line 746
    :cond_3c
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    iget-object v4, v1, Lr0/f1;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 751
    .line 752
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    if-nez v5, :cond_43

    .line 757
    .line 758
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 759
    .line 760
    .line 761
    move-result-object v5

    .line 762
    const-string v6, "getDeclaredMethods(...)"

    .line 763
    .line 764
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    new-instance v6, Ljava/util/ArrayList;

    .line 768
    .line 769
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 770
    .line 771
    .line 772
    array-length v12, v5

    .line 773
    const/4 v13, 0x0

    .line 774
    :goto_1f
    if-ge v13, v12, :cond_40

    .line 775
    .line 776
    aget-object v14, v5, v13

    .line 777
    .line 778
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    move-result-object v15

    .line 782
    move-object/from16 v17, v5

    .line 783
    .line 784
    const-string v5, "getParameterTypes(...)"

    .line 785
    .line 786
    invoke-static {v15, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    array-length v5, v15

    .line 790
    if-nez v5, :cond_3f

    .line 791
    .line 792
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    if-nez v5, :cond_3f

    .line 801
    .line 802
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 807
    .line 808
    invoke-static {v5, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    if-nez v5, :cond_3f

    .line 813
    .line 814
    if-eqz v3, :cond_3d

    .line 815
    .line 816
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    move-result-object v5

    .line 820
    invoke-static {v5, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v5

    .line 824
    if-nez v5, :cond_3e

    .line 825
    .line 826
    :cond_3d
    if-eqz v2, :cond_3f

    .line 827
    .line 828
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    invoke-static {v5, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    if-eqz v5, :cond_3f

    .line 837
    .line 838
    :cond_3e
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    :cond_3f
    const/4 v5, 0x1

    .line 842
    add-int/2addr v13, v5

    .line 843
    move-object/from16 v5, v17

    .line 844
    .line 845
    goto :goto_1f

    .line 846
    :cond_40
    const/4 v5, 0x1

    .line 847
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 848
    .line 849
    .line 850
    move-result-object v12

    .line 851
    :goto_20
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 852
    .line 853
    .line 854
    move-result v13

    .line 855
    if-eqz v13, :cond_41

    .line 856
    .line 857
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v13

    .line 861
    check-cast v13, Ljava/lang/reflect/Method;

    .line 862
    .line 863
    invoke-virtual {v13, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 864
    .line 865
    .line 866
    goto :goto_20

    .line 867
    :cond_41
    invoke-virtual {v4, v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    if-nez v0, :cond_42

    .line 872
    .line 873
    move-object v5, v6

    .line 874
    goto :goto_21

    .line 875
    :cond_42
    move-object v5, v0

    .line 876
    :cond_43
    :goto_21
    check-cast v5, Ljava/util/List;

    .line 877
    .line 878
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 879
    .line 880
    .line 881
    move-result-object v4

    .line 882
    :cond_44
    :goto_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    if-eqz v0, :cond_49

    .line 887
    .line 888
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    check-cast v0, Ljava/lang/reflect/Method;

    .line 893
    .line 894
    const/4 v12, 0x1

    .line 895
    :try_start_7
    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 896
    .line 897
    .line 898
    const/4 v5, 0x0

    .line 899
    :try_start_8
    invoke-virtual {v0, v10, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 903
    goto :goto_24

    .line 904
    :catchall_7
    move-exception v0

    .line 905
    goto :goto_23

    .line 906
    :catchall_8
    move-exception v0

    .line 907
    const/4 v5, 0x0

    .line 908
    :goto_23
    new-instance v6, LE0/d;

    .line 909
    .line 910
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 911
    .line 912
    .line 913
    move-object v0, v6

    .line 914
    :goto_24
    nop

    .line 915
    instance-of v6, v0, LE0/d;

    .line 916
    .line 917
    if-eqz v6, :cond_45

    .line 918
    .line 919
    move-object v0, v5

    .line 920
    :cond_45
    if-nez v0, :cond_46

    .line 921
    .line 922
    goto :goto_22

    .line 923
    :cond_46
    invoke-static {v0, v8, v3}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    if-eqz v6, :cond_47

    .line 928
    .line 929
    :goto_25
    move-object v0, v6

    .line 930
    goto :goto_28

    .line 931
    :cond_47
    invoke-virtual {v1, v0, v8, v2, v3}, Lr0/f1;->b(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    if-eqz v6, :cond_48

    .line 936
    .line 937
    goto :goto_25

    .line 938
    :cond_48
    invoke-virtual {v1, v0, v8}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    if-eqz v0, :cond_44

    .line 943
    .line 944
    goto :goto_28

    .line 945
    :cond_49
    const/4 v5, 0x0

    .line 946
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-virtual {v1, v0}, Lr0/f1;->a(Ljava/lang/Class;)Ljava/util/List;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 955
    .line 956
    .line 957
    move-result-object v4

    .line 958
    :cond_4a
    :goto_26
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    if-eqz v0, :cond_4f

    .line 963
    .line 964
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    check-cast v0, Ljava/lang/reflect/Field;

    .line 969
    .line 970
    const/4 v12, 0x1

    .line 971
    :try_start_9
    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 978
    goto :goto_27

    .line 979
    :catchall_9
    move-exception v0

    .line 980
    new-instance v6, LE0/d;

    .line 981
    .line 982
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 983
    .line 984
    .line 985
    move-object v0, v6

    .line 986
    :goto_27
    nop

    .line 987
    instance-of v6, v0, LE0/d;

    .line 988
    .line 989
    if-eqz v6, :cond_4b

    .line 990
    .line 991
    move-object v0, v5

    .line 992
    :cond_4b
    if-nez v0, :cond_4c

    .line 993
    .line 994
    goto :goto_26

    .line 995
    :cond_4c
    invoke-static {v0, v8, v3}, Lr0/f1;->c(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v6

    .line 999
    if-eqz v6, :cond_4d

    .line 1000
    .line 1001
    goto :goto_25

    .line 1002
    :cond_4d
    invoke-virtual {v1, v0, v8, v2, v3}, Lr0/f1;->b(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v6

    .line 1006
    if-eqz v6, :cond_4e

    .line 1007
    .line 1008
    goto :goto_25

    .line 1009
    :cond_4e
    const/4 v6, 0x0

    .line 1010
    invoke-static {v0, v11, v6}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v12

    .line 1014
    if-eqz v12, :cond_4a

    .line 1015
    .line 1016
    invoke-virtual {v1, v0, v8}, Lr0/f1;->f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    if-eqz v0, :cond_4a

    .line 1021
    .line 1022
    goto :goto_28

    .line 1023
    :cond_4f
    move-object v0, v5

    .line 1024
    :goto_28
    if-nez v0, :cond_50

    .line 1025
    .line 1026
    goto :goto_29

    .line 1027
    :cond_50
    invoke-interface {v7, v9}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    :goto_29
    add-int/lit8 v9, v9, -0x1

    .line 1031
    .line 1032
    move/from16 v4, v16

    .line 1033
    .line 1034
    const/4 v5, 0x1

    .line 1035
    const/4 v6, 0x0

    .line 1036
    goto/16 :goto_2

    .line 1037
    .line 1038
    :goto_2a
    return v18

    .line 1039
    :cond_51
    move/from16 v20, v6

    .line 1040
    .line 1041
    :goto_2b
    return v20
.end method

.method public final f(Ljava/lang/Object;Ljava/util/Set;)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lr0/f1;->o:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    invoke-static {p1, v4}, Lr0/f1;->g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0}, Lr0/f1;->a(Ljava/lang/Class;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_9

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/reflect/Field;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    instance-of v2, v1, Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object v1, v3

    .line 87
    goto :goto_4

    .line 88
    :goto_3
    new-instance v2, LE0/d;

    .line 89
    .line 90
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object v1, v2

    .line 94
    :goto_4
    nop

    .line 95
    instance-of v2, v1, LE0/d;

    .line 96
    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    move-object v1, v3

    .line 100
    :cond_6
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    goto :goto_5

    .line 113
    :cond_7
    move-object v1, v3

    .line 114
    :goto_5
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_9
    return-object v3
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    invoke-static {v6}, LA0/l;->m(Landroid/content/Context;)LA0/W;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 11
    .line 12
    sget-object v0, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    iget-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 15
    .line 16
    sput-object v0, Lz0/w;->g:LA0/W;

    .line 17
    .line 18
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    new-instance v9, LA0/u;

    .line 21
    .line 22
    new-instance v12, Lr0/P;

    .line 23
    .line 24
    const/16 v0, 0x19

    .line 25
    .line 26
    invoke-direct {v12, v0}, Lr0/P;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v13, LA0/h;

    .line 30
    .line 31
    const/16 v0, 0x11

    .line 32
    .line 33
    invoke-direct {v13, v6, v0}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 34
    .line 35
    .line 36
    new-instance v14, LC/d;

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    invoke-direct {v14, v0, v1}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v15, LA0/a;

    .line 43
    .line 44
    const/16 v0, 0x10

    .line 45
    .line 46
    invoke-direct {v15, v0}, LA0/a;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const-string v10, "sns_moment"

    .line 50
    .line 51
    const-string v11, "\u670b\u53cb\u5708\u9690\u85cf"

    .line 52
    .line 53
    invoke-direct/range {v9 .. v15}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v9}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 57
    .line 58
    .line 59
    sget v0, Lz0/r;->e:I

    .line 60
    .line 61
    const/4 v9, -0x1

    .line 62
    if-ne v0, v9, :cond_0

    .line 63
    .line 64
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-exception v0

    .line 88
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move v0, v9

    .line 96
    :goto_0
    sput v0, Lz0/r;->e:I

    .line 97
    .line 98
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 99
    .line 100
    const/16 v10, 0xc30

    .line 101
    .line 102
    const/16 v11, 0xc1c

    .line 103
    .line 104
    const/16 v12, 0xbf4

    .line 105
    .line 106
    if-eq v0, v12, :cond_1

    .line 107
    .line 108
    const/16 v2, 0xc08

    .line 109
    .line 110
    if-eq v0, v2, :cond_1

    .line 111
    .line 112
    if-eq v0, v11, :cond_1

    .line 113
    .line 114
    if-eq v0, v10, :cond_1

    .line 115
    .line 116
    iget-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 117
    .line 118
    if-nez v0, :cond_1

    .line 119
    .line 120
    goto/16 :goto_24

    .line 121
    .line 122
    :cond_1
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 127
    .line 128
    const-string v3, "com.tencent.mm.protocal.protobuf.SnsObject"

    .line 129
    .line 130
    invoke-interface {v2, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    if-nez v13, :cond_2

    .line 135
    .line 136
    const-string v0, "hide sns like SnsObject class missing"

    .line 137
    .line 138
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_2
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 151
    .line 152
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 153
    .line 154
    invoke-interface {v2, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 163
    .line 164
    const-string v4, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    .line 165
    .line 166
    invoke-interface {v2, v0, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 175
    .line 176
    const-string v5, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 177
    .line 178
    invoke-interface {v2, v0, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const-string v15, "#"

    .line 183
    .line 184
    const-string v5, "onResume"

    .line 185
    .line 186
    const-string v10, "getDeclaredMethods(...)"

    .line 187
    .line 188
    const-string v11, "getParameterTypes(...)"

    .line 189
    .line 190
    const-string v14, "-"

    .line 191
    .line 192
    if-nez v2, :cond_4

    .line 193
    .line 194
    const-string v0, "hide sns posts adapter class missing"

    .line 195
    .line 196
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object v12, v5

    .line 204
    :cond_3
    move-object/from16 v19, v11

    .line 205
    .line 206
    goto/16 :goto_11

    .line 207
    .line 208
    :cond_4
    invoke-virtual {v1}, Lr0/f1;->j()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    new-instance v12, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    if-eqz v17, :cond_6

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v17

    .line 231
    move-object/from16 v9, v17

    .line 232
    .line 233
    check-cast v9, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    const/16 v18, 0x1

    .line 240
    .line 241
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 242
    .line 243
    invoke-interface {v8, v7, v9}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    if-eqz v7, :cond_5

    .line 248
    .line 249
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_5
    const/4 v7, 0x0

    .line 253
    const/4 v9, -0x1

    .line 254
    goto :goto_1

    .line 255
    :cond_6
    const/16 v18, 0x1

    .line 256
    .line 257
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_14

    .line 266
    .line 267
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object v8, v0

    .line 272
    check-cast v8, Ljava/lang/Class;

    .line 273
    .line 274
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-instance v9, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 284
    .line 285
    .line 286
    array-length v12, v0

    .line 287
    move-object/from16 v19, v0

    .line 288
    .line 289
    const/4 v0, 0x0

    .line 290
    :goto_3
    if-ge v0, v12, :cond_9

    .line 291
    .line 292
    move/from16 v20, v0

    .line 293
    .line 294
    aget-object v0, v19, v20

    .line 295
    .line 296
    move-object/from16 v21, v7

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v7, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    array-length v7, v7

    .line 306
    if-nez v7, :cond_7

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    move-object/from16 v22, v8

    .line 313
    .line 314
    const-string v8, "getReturnType(...)"

    .line 315
    .line 316
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v7, v2}, Lr0/f1;->l(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-eqz v7, :cond_8

    .line 324
    .line 325
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_7
    move-object/from16 v22, v8

    .line 330
    .line 331
    :cond_8
    :goto_4
    add-int/lit8 v0, v20, 0x1

    .line 332
    .line 333
    move-object/from16 v7, v21

    .line 334
    .line 335
    move-object/from16 v8, v22

    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_9
    move-object/from16 v21, v7

    .line 339
    .line 340
    move-object/from16 v22, v8

    .line 341
    .line 342
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-eqz v7, :cond_b

    .line 351
    .line 352
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    check-cast v7, Ljava/lang/reflect/Method;

    .line 357
    .line 358
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    new-instance v12, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    move-object/from16 v19, v0

    .line 373
    .line 374
    const-string v0, "hide-sns-posts-adapter-provider-"

    .line 375
    .line 376
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 393
    .line 394
    invoke-virtual {v8, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-eqz v8, :cond_a

    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_a
    move/from16 v8, v18

    .line 402
    .line 403
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 404
    .line 405
    .line 406
    new-instance v8, Lr0/d1;

    .line 407
    .line 408
    const/4 v9, 0x0

    .line 409
    invoke-direct {v8, v1, v3, v4, v9}, Lr0/d1;-><init>(Lr0/f1;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 410
    .line 411
    .line 412
    invoke-static {v7, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 413
    .line 414
    .line 415
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 416
    .line 417
    invoke-virtual {v7, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    :goto_6
    move-object/from16 v0, v19

    .line 421
    .line 422
    const/16 v18, 0x1

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_b
    sget v0, Lz0/r;->e:I

    .line 426
    .line 427
    const/4 v7, -0x1

    .line 428
    if-ne v0, v7, :cond_c

    .line 429
    .line 430
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    const/4 v9, 0x0

    .line 447
    invoke-virtual {v0, v7, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget v7, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 452
    .line 453
    goto :goto_7

    .line 454
    :catch_1
    move-exception v0

    .line 455
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    const/4 v7, -0x1

    .line 463
    :goto_7
    sput v7, Lz0/r;->e:I

    .line 464
    .line 465
    :cond_c
    sget v0, Lz0/r;->e:I

    .line 466
    .line 467
    const/16 v7, 0xbf4

    .line 468
    .line 469
    if-ne v0, v7, :cond_d

    .line 470
    .line 471
    :goto_8
    move-object v12, v5

    .line 472
    goto/16 :goto_d

    .line 473
    .line 474
    :cond_d
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    new-instance v8, Ljava/util/ArrayList;

    .line 482
    .line 483
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 484
    .line 485
    .line 486
    array-length v9, v0

    .line 487
    const/4 v12, 0x0

    .line 488
    :goto_9
    if-ge v12, v9, :cond_f

    .line 489
    .line 490
    aget-object v7, v0, v12

    .line 491
    .line 492
    move-object/from16 v19, v0

    .line 493
    .line 494
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    array-length v0, v0

    .line 499
    const/4 v1, 0x1

    .line 500
    if-ne v0, v1, :cond_e

    .line 501
    .line 502
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    const/16 v17, 0x0

    .line 507
    .line 508
    aget-object v0, v0, v17

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    const-string v1, "android.os.Bundle"

    .line 515
    .line 516
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_e

    .line 521
    .line 522
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    const-string v1, "onCreate"

    .line 527
    .line 528
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_e

    .line 533
    .line 534
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    :cond_e
    const/16 v18, 0x1

    .line 538
    .line 539
    add-int/lit8 v12, v12, 0x1

    .line 540
    .line 541
    const/16 v7, 0xbf4

    .line 542
    .line 543
    move-object/from16 v1, p0

    .line 544
    .line 545
    move-object/from16 v0, v19

    .line 546
    .line 547
    goto :goto_9

    .line 548
    :cond_f
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v0, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    new-instance v1, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .line 559
    .line 560
    array-length v7, v0

    .line 561
    const/4 v9, 0x0

    .line 562
    :goto_a
    if-ge v9, v7, :cond_11

    .line 563
    .line 564
    aget-object v12, v0, v9

    .line 565
    .line 566
    move-object/from16 v19, v0

    .line 567
    .line 568
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    array-length v0, v0

    .line 576
    if-nez v0, :cond_10

    .line 577
    .line 578
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_10

    .line 587
    .line 588
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    :cond_10
    const/16 v18, 0x1

    .line 592
    .line 593
    add-int/lit8 v9, v9, 0x1

    .line 594
    .line 595
    move-object/from16 v0, v19

    .line 596
    .line 597
    goto :goto_a

    .line 598
    :cond_11
    invoke-static {v8, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_13

    .line 611
    .line 612
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    move-object v8, v0

    .line 617
    check-cast v8, Ljava/lang/reflect/Method;

    .line 618
    .line 619
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    new-instance v9, Ljava/lang/StringBuilder;

    .line 632
    .line 633
    const-string v12, "hide-sns-posts-lifecycle-capture-"

    .line 634
    .line 635
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 652
    .line 653
    invoke-virtual {v0, v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-eqz v0, :cond_12

    .line 658
    .line 659
    move-object/from16 v1, p0

    .line 660
    .line 661
    move-object v12, v5

    .line 662
    goto :goto_c

    .line 663
    :cond_12
    const/4 v1, 0x1

    .line 664
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 665
    .line 666
    .line 667
    new-instance v0, Lr0/e1;

    .line 668
    .line 669
    move-object v1, v5

    .line 670
    const/4 v5, 0x0

    .line 671
    move-object v12, v1

    .line 672
    move-object/from16 v1, p0

    .line 673
    .line 674
    invoke-direct/range {v0 .. v5}, Lr0/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/GenericDeclaration;I)V

    .line 675
    .line 676
    .line 677
    invoke-static {v8, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 678
    .line 679
    .line 680
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 681
    .line 682
    invoke-virtual {v0, v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    :goto_c
    move-object v5, v12

    .line 686
    goto :goto_b

    .line 687
    :cond_13
    move-object/from16 v1, p0

    .line 688
    .line 689
    goto/16 :goto_8

    .line 690
    .line 691
    :goto_d
    move-object v5, v12

    .line 692
    move-object/from16 v7, v21

    .line 693
    .line 694
    const/16 v18, 0x1

    .line 695
    .line 696
    goto/16 :goto_2

    .line 697
    .line 698
    :cond_14
    move-object v12, v5

    .line 699
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    const-string v2, "getMethods(...)"

    .line 704
    .line 705
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    new-instance v2, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 711
    .line 712
    .line 713
    array-length v5, v0

    .line 714
    const/4 v7, 0x0

    .line 715
    :goto_e
    if-ge v7, v5, :cond_16

    .line 716
    .line 717
    aget-object v8, v0, v7

    .line 718
    .line 719
    sget-object v9, Lr0/f1;->n:Ljava/util/Set;

    .line 720
    .line 721
    move-object/from16 v16, v0

    .line 722
    .line 723
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-eqz v0, :cond_15

    .line 732
    .line 733
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    :cond_15
    const/16 v18, 0x1

    .line 737
    .line 738
    add-int/lit8 v7, v7, 0x1

    .line 739
    .line 740
    move-object/from16 v0, v16

    .line 741
    .line 742
    goto :goto_e

    .line 743
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    if-eqz v2, :cond_3

    .line 752
    .line 753
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    check-cast v2, Ljava/lang/reflect/Method;

    .line 758
    .line 759
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v7

    .line 771
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    move-result-object v8

    .line 775
    invoke-static {v8, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    new-instance v9, Lr0/P;

    .line 779
    .line 780
    move-object/from16 v16, v0

    .line 781
    .line 782
    const/16 v0, 0x1a

    .line 783
    .line 784
    invoke-direct {v9, v0}, Lr0/P;-><init>(I)V

    .line 785
    .line 786
    .line 787
    move-object/from16 v19, v11

    .line 788
    .line 789
    const/16 v11, 0x1e

    .line 790
    .line 791
    invoke-static {v8, v15, v9, v11}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    new-instance v8, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    const-string v9, "hide-sns-posts-"

    .line 798
    .line 799
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 822
    .line 823
    invoke-virtual {v5, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    if-eqz v5, :cond_17

    .line 828
    .line 829
    goto :goto_10

    .line 830
    :cond_17
    const/4 v8, 0x1

    .line 831
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 832
    .line 833
    .line 834
    new-instance v5, Lr0/d1;

    .line 835
    .line 836
    invoke-direct {v5, v1, v3, v4, v8}, Lr0/d1;-><init>(Lr0/f1;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 837
    .line 838
    .line 839
    invoke-static {v2, v5}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 840
    .line 841
    .line 842
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 843
    .line 844
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    :goto_10
    move-object/from16 v0, v16

    .line 848
    .line 849
    move-object/from16 v11, v19

    .line 850
    .line 851
    goto :goto_f

    .line 852
    :goto_11
    iget-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 853
    .line 854
    if-eqz v0, :cond_18

    .line 855
    .line 856
    iget-object v0, v0, LA0/W;->c:Ljava/util/List;

    .line 857
    .line 858
    goto :goto_12

    .line 859
    :cond_18
    const/4 v0, 0x0

    .line 860
    :goto_12
    sget-object v4, LF0/s;->a:LF0/s;

    .line 861
    .line 862
    if-eqz v0, :cond_19

    .line 863
    .line 864
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-eqz v0, :cond_1c

    .line 869
    .line 870
    :cond_19
    sget v0, Lz0/r;->e:I

    .line 871
    .line 872
    const/4 v7, -0x1

    .line 873
    if-ne v0, v7, :cond_1a

    .line 874
    .line 875
    :try_start_2
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 884
    .line 885
    .line 886
    move-result-object v5

    .line 887
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v5

    .line 891
    const/4 v9, 0x0

    .line 892
    invoke-virtual {v0, v5, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    iget v9, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 897
    .line 898
    goto :goto_13

    .line 899
    :catch_2
    move-exception v0

    .line 900
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    move v9, v7

    .line 908
    :goto_13
    sput v9, Lz0/r;->e:I

    .line 909
    .line 910
    :cond_1a
    sget v0, Lz0/r;->e:I

    .line 911
    .line 912
    const/16 v5, 0xc1c

    .line 913
    .line 914
    if-eq v0, v5, :cond_1c

    .line 915
    .line 916
    const/16 v5, 0xc30

    .line 917
    .line 918
    if-eq v0, v5, :cond_1c

    .line 919
    .line 920
    :cond_1b
    const/4 v9, 0x0

    .line 921
    goto/16 :goto_17

    .line 922
    .line 923
    :cond_1c
    iget-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 924
    .line 925
    if-eqz v0, :cond_1d

    .line 926
    .line 927
    iget-object v0, v0, LA0/W;->c:Ljava/util/List;

    .line 928
    .line 929
    goto :goto_14

    .line 930
    :cond_1d
    const/4 v0, 0x0

    .line 931
    :goto_14
    if-nez v0, :cond_1e

    .line 932
    .line 933
    move-object v0, v4

    .line 934
    :cond_1e
    sget-object v5, Lr0/f1;->l:[Ljava/lang/String;

    .line 935
    .line 936
    invoke-static {v0, v5}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    new-instance v5, Ljava/util/ArrayList;

    .line 949
    .line 950
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 951
    .line 952
    .line 953
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    :cond_1f
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 958
    .line 959
    .line 960
    move-result v7

    .line 961
    if-eqz v7, :cond_21

    .line 962
    .line 963
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v7

    .line 967
    check-cast v7, Ljava/lang/String;

    .line 968
    .line 969
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 970
    .line 971
    .line 972
    move-result-object v8

    .line 973
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 974
    .line 975
    invoke-interface {v9, v8, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    move-result-object v8

    .line 979
    if-nez v8, :cond_20

    .line 980
    .line 981
    const-string v9, "hide sns detail group icon activity missing"

    .line 982
    .line 983
    filled-new-array {v9, v7}, [Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v7

    .line 987
    invoke-static {v7}, Li0/a;->d([Ljava/lang/Object;)V

    .line 988
    .line 989
    .line 990
    :cond_20
    if-eqz v8, :cond_1f

    .line 991
    .line 992
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    goto :goto_15

    .line 996
    :cond_21
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v5

    .line 1004
    if-eqz v5, :cond_1b

    .line 1005
    .line 1006
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v5

    .line 1010
    check-cast v5, Ljava/lang/Class;

    .line 1011
    .line 1012
    const/4 v9, 0x0

    .line 1013
    new-array v7, v9, [Ljava/lang/Object;

    .line 1014
    .line 1015
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1016
    .line 1017
    invoke-interface {v8, v5, v12, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1022
    .line 1023
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v8

    .line 1027
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 1028
    .line 1029
    const-string v11, "onWindowFocusChanged"

    .line 1030
    .line 1031
    invoke-interface {v9, v5, v11, v8}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v5

    .line 1035
    filled-new-array {v7, v5}, [Ljava/lang/reflect/Method;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v5

    .line 1039
    invoke-static {v5}, LF0/h;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v5

    .line 1043
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v5

    .line 1047
    :goto_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v7

    .line 1051
    if-eqz v7, :cond_22

    .line 1052
    .line 1053
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v7

    .line 1057
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1058
    .line 1059
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v8

    .line 1063
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v8

    .line 1067
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v9

    .line 1071
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    const-string v2, "hide-sns-detail-group-icon-"

    .line 1074
    .line 1075
    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1092
    .line 1093
    invoke-virtual {v8, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v8

    .line 1097
    if-eqz v8, :cond_23

    .line 1098
    .line 1099
    const/4 v9, 0x0

    .line 1100
    goto :goto_16

    .line 1101
    :cond_23
    new-instance v8, Lr0/c1;

    .line 1102
    .line 1103
    const/4 v9, 0x0

    .line 1104
    invoke-direct {v8, v1, v9}, Lr0/c1;-><init>(Lr0/f1;I)V

    .line 1105
    .line 1106
    .line 1107
    invoke-static {v7, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1108
    .line 1109
    .line 1110
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1111
    .line 1112
    invoke-virtual {v7, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1113
    .line 1114
    .line 1115
    goto :goto_16

    .line 1116
    :goto_17
    invoke-virtual {v1}, Lr0/f1;->j()Ljava/util/List;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    new-instance v2, Ljava/util/ArrayList;

    .line 1121
    .line 1122
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1123
    .line 1124
    .line 1125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    :cond_24
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v5

    .line 1133
    if-eqz v5, :cond_26

    .line 1134
    .line 1135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v5

    .line 1139
    check-cast v5, Ljava/lang/String;

    .line 1140
    .line 1141
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v7

    .line 1145
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1146
    .line 1147
    invoke-interface {v8, v7, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v7

    .line 1151
    if-nez v7, :cond_25

    .line 1152
    .line 1153
    const-string v8, "hide sns like target class missing"

    .line 1154
    .line 1155
    filled-new-array {v8, v5}, [Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v5

    .line 1159
    invoke-static {v5}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1160
    .line 1161
    .line 1162
    :cond_25
    if-eqz v7, :cond_24

    .line 1163
    .line 1164
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    goto :goto_18

    .line 1168
    :cond_26
    iget-object v0, v1, Lr0/f1;->i:LA0/W;

    .line 1169
    .line 1170
    if-eqz v0, :cond_27

    .line 1171
    .line 1172
    iget-object v0, v0, LA0/W;->b:Ljava/util/List;

    .line 1173
    .line 1174
    goto :goto_19

    .line 1175
    :cond_27
    const/4 v0, 0x0

    .line 1176
    :goto_19
    if-nez v0, :cond_28

    .line 1177
    .line 1178
    goto :goto_1a

    .line 1179
    :cond_28
    move-object v4, v0

    .line 1180
    :goto_1a
    new-instance v0, Ljava/util/ArrayList;

    .line 1181
    .line 1182
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1183
    .line 1184
    .line 1185
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v4

    .line 1189
    :cond_29
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v5

    .line 1193
    if-eqz v5, :cond_2a

    .line 1194
    .line 1195
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v5

    .line 1199
    check-cast v5, Ljava/lang/String;

    .line 1200
    .line 1201
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v7

    .line 1205
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1206
    .line 1207
    invoke-interface {v8, v7, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v5

    .line 1211
    if-eqz v5, :cond_29

    .line 1212
    .line 1213
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    goto :goto_1b

    .line 1217
    :cond_2a
    invoke-static {v2, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    new-instance v0, Ljava/util/ArrayList;

    .line 1222
    .line 1223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v6}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v4

    .line 1230
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v4

    .line 1237
    if-eqz v4, :cond_2b

    .line 1238
    .line 1239
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 1240
    .line 1241
    if-eqz v4, :cond_2b

    .line 1242
    .line 1243
    array-length v5, v4

    .line 1244
    move v7, v9

    .line 1245
    :goto_1c
    if-ge v7, v5, :cond_2b

    .line 1246
    .line 1247
    aget-object v8, v4, v7

    .line 1248
    .line 1249
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    const/16 v18, 0x1

    .line 1253
    .line 1254
    add-int/lit8 v7, v7, 0x1

    .line 1255
    .line 1256
    goto :goto_1c

    .line 1257
    :cond_2b
    new-instance v4, Ljava/util/ArrayList;

    .line 1258
    .line 1259
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    :cond_2c
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1267
    .line 1268
    .line 1269
    move-result v5

    .line 1270
    if-eqz v5, :cond_2d

    .line 1271
    .line 1272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v5

    .line 1276
    move-object v7, v5

    .line 1277
    check-cast v7, Ljava/lang/String;

    .line 1278
    .line 1279
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v7

    .line 1283
    if-nez v7, :cond_2c

    .line 1284
    .line 1285
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    goto :goto_1d

    .line 1289
    :cond_2d
    invoke-static {v4}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1298
    .line 1299
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1300
    .line 1301
    .line 1302
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v5

    .line 1306
    :cond_2e
    :goto_1e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v0

    .line 1310
    if-eqz v0, :cond_2f

    .line 1311
    .line 1312
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    move-object v7, v0

    .line 1317
    check-cast v7, Ljava/lang/String;

    .line 1318
    .line 1319
    :try_start_3
    invoke-static {v7, v6, v13, v3, v4}, Lr0/f1;->n(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/LinkedHashSet;)V

    .line 1320
    .line 1321
    .line 1322
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1323
    .line 1324
    goto :goto_1f

    .line 1325
    :catchall_0
    move-exception v0

    .line 1326
    new-instance v8, LE0/d;

    .line 1327
    .line 1328
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1329
    .line 1330
    .line 1331
    move-object v0, v8

    .line 1332
    :goto_1f
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    if-eqz v0, :cond_2e

    .line 1337
    .line 1338
    const-string v8, "hide sns like dex scan fail"

    .line 1339
    .line 1340
    filled-new-array {v8, v7, v0}, [Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_1e

    .line 1348
    :cond_2f
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-static {v2, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    new-instance v2, Ljava/util/HashSet;

    .line 1357
    .line 1358
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1359
    .line 1360
    .line 1361
    new-instance v3, Ljava/util/ArrayList;

    .line 1362
    .line 1363
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v0

    .line 1370
    :cond_30
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    if-eqz v4, :cond_31

    .line 1375
    .line 1376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v4

    .line 1380
    move-object v5, v4

    .line 1381
    check-cast v5, Ljava/lang/Class;

    .line 1382
    .line 1383
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v5

    .line 1387
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1388
    .line 1389
    .line 1390
    move-result v5

    .line 1391
    if-eqz v5, :cond_30

    .line 1392
    .line 1393
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1394
    .line 1395
    .line 1396
    goto :goto_20

    .line 1397
    :cond_31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    :cond_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1402
    .line 1403
    .line 1404
    move-result v2

    .line 1405
    if-eqz v2, :cond_36

    .line 1406
    .line 1407
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    check-cast v2, Ljava/lang/Class;

    .line 1412
    .line 1413
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v2

    .line 1417
    invoke-static {v2, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v3, Ljava/util/ArrayList;

    .line 1421
    .line 1422
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1423
    .line 1424
    .line 1425
    array-length v4, v2

    .line 1426
    move v5, v9

    .line 1427
    :goto_21
    if-ge v5, v4, :cond_34

    .line 1428
    .line 1429
    aget-object v6, v2, v5

    .line 1430
    .line 1431
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v7

    .line 1435
    invoke-static {v7, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1436
    .line 1437
    .line 1438
    move-result v7

    .line 1439
    if-eqz v7, :cond_33

    .line 1440
    .line 1441
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1442
    .line 1443
    .line 1444
    :cond_33
    const/16 v18, 0x1

    .line 1445
    .line 1446
    add-int/lit8 v5, v5, 0x1

    .line 1447
    .line 1448
    goto :goto_21

    .line 1449
    :cond_34
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v2

    .line 1453
    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v3

    .line 1457
    if-eqz v3, :cond_32

    .line 1458
    .line 1459
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v3

    .line 1463
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1464
    .line 1465
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v4

    .line 1469
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v4

    .line 1473
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v5

    .line 1477
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v6

    .line 1481
    move-object/from16 v7, v19

    .line 1482
    .line 1483
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1484
    .line 1485
    .line 1486
    new-instance v8, Lr0/P;

    .line 1487
    .line 1488
    const/16 v11, 0x18

    .line 1489
    .line 1490
    invoke-direct {v8, v11}, Lr0/P;-><init>(I)V

    .line 1491
    .line 1492
    .line 1493
    const/16 v11, 0x1e

    .line 1494
    .line 1495
    invoke-static {v6, v15, v8, v11}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v6

    .line 1499
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1500
    .line 1501
    const-string v12, "hide-sns-like-"

    .line 1502
    .line 1503
    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v4

    .line 1525
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1526
    .line 1527
    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1528
    .line 1529
    .line 1530
    move-result v5

    .line 1531
    if-eqz v5, :cond_35

    .line 1532
    .line 1533
    const/4 v8, 0x1

    .line 1534
    goto :goto_23

    .line 1535
    :cond_35
    const/4 v8, 0x1

    .line 1536
    invoke-virtual {v3, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1537
    .line 1538
    .line 1539
    new-instance v5, Lr0/c1;

    .line 1540
    .line 1541
    invoke-direct {v5, v1, v8}, Lr0/c1;-><init>(Lr0/f1;I)V

    .line 1542
    .line 1543
    .line 1544
    invoke-static {v3, v5}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1545
    .line 1546
    .line 1547
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1548
    .line 1549
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    :goto_23
    move-object/from16 v19, v7

    .line 1553
    .line 1554
    goto :goto_22

    .line 1555
    :cond_36
    :goto_24
    return-void
.end method

.method public final i(Ljava/lang/Class;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getDeclaredMethods(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    array-length v3, v1

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_0
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v1, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const-string v7, "getParameterTypes(...)"

    .line 34
    .line 35
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    array-length v6, v6

    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_0

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-class v7, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_0

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const-string v7, "java.lang.Class"

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_0

    .line 90
    .line 91
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    move-object v1, v2

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    move-object v1, p1

    .line 127
    :cond_4
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    return-object v1
.end method

.method public final j()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/f1;->i:LA0/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/W;->a:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    :cond_1
    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"

    .line 14
    .line 15
    const-string v2, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"

    .line 16
    .line 17
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
