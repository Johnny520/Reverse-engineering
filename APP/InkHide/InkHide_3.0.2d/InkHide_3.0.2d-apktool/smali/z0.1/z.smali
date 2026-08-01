.class public final Lz0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz0/z;

.field public static volatile b:Ljava/lang/Object;

.field public static volatile c:Ljava/lang/reflect/Method;

.field public static volatile d:J

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final f:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz0/z;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz0/z;->a:Lz0/z;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lz0/z;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lz0/z;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Ljava/lang/String;Lz0/y;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lz0/y;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lz0/y;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p1, Lz0/y;->a:Ljava/lang/String;

    .line 6
    .line 7
    filled-new-array {p0, v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    :cond_1
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    sget-object v1, Lz0/z;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-void
.end method

.method public static b(Ljava/lang/String;)Lz0/y;
    .locals 2

    .line 1
    const-string v0, "identifier"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Lz0/z;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lz0/y;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    const-string v0, "select r.username,r.alias,r.encryptUsername,r.conRemark,r.nickname,r.pyInitial,r.quanPin,i.reserved2 as avatarUrl\nfrom rcontact r\nleft join img_flag i on r.username=i.username\nwhere r.username=? or r.alias=? or r.encryptUsername=?\nlimit 1"

    .line 33
    .line 34
    filled-new-array {p0, p0, p0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v0, v1}, Lz0/z;->f(Ljava/lang/String;[Ljava/lang/Object;)Lz0/y;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {p0, v0}, Lz0/z;->a(Ljava/lang/String;Lz0/y;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    const-string v0, "select username,alias,conRemark,nickname from rcontact where username=? or alias=? limit 1"

    .line 49
    .line 50
    filled-new-array {p0, p0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v0, v1}, Lz0/z;->f(Ljava/lang/String;[Ljava/lang/Object;)Lz0/y;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-static {p0, v0}, Lz0/z;->a(Ljava/lang/String;Lz0/y;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    const-string v0, "rawQuery"

    .line 2
    .line 3
    :try_start_0
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const-class v2, [Ljava/lang/Object;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    new-instance v2, LE0/d;

    .line 18
    .line 19
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v1, v2

    .line 23
    :goto_0
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_5

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v2, "getMethods(...)"

    .line 36
    .line 37
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    array-length v2, p0

    .line 41
    const/4 v3, 0x0

    .line 42
    :goto_1
    if-ge v3, v2, :cond_2

    .line 43
    .line 44
    aget-object v4, p0, v3

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    array-length v5, v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    const/4 v6, 0x2

    .line 62
    if-ne v5, v6, :cond_1

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object v4, v1

    .line 71
    goto :goto_3

    .line 72
    :goto_2
    new-instance v4, LE0/d;

    .line 73
    .line 74
    invoke-direct {v4, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    instance-of p0, v4, LE0/d;

    .line 78
    .line 79
    if-eqz p0, :cond_3

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    move-object v1, v4

    .line 83
    :goto_4
    check-cast v1, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    return-object v1
.end method

.method public static d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "sql"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "args"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lz0/z;->g(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    sget-object p0, LF0/s;->a:LF0/s;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnCount()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_1
    if-ge v2, v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {p0, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :goto_2
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    .line 74
    :catchall_1
    return-object p1

    .line 75
    :goto_3
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    .line 77
    .line 78
    :catchall_2
    throw p1
.end method

.method public static f(Ljava/lang/String;[Ljava/lang/Object;)Lz0/y;
    .locals 10

    .line 1
    invoke-static {p0, p1}, Lz0/z;->g(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    new-instance v1, Lz0/y;

    .line 17
    .line 18
    const-string p1, "username"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string p1, "alias"

    .line 25
    .line 26
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string p1, "encryptUsername"

    .line 31
    .line 32
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string p1, "conRemark"

    .line 37
    .line 38
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string p1, "nickname"

    .line 43
    .line 44
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string p1, "pyInitial"

    .line 49
    .line 50
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-string p1, "quanPin"

    .line 55
    .line 56
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    const-string p1, "avatarUrl"

    .line 61
    .line 62
    invoke-static {p0, p1}, Lz0/z;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-direct/range {v1 .. v9}, Lz0/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    .line 68
    .line 69
    move-object p1, v1

    .line 70
    :goto_0
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    :catchall_0
    return-object p1

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 77
    .line 78
    .line 79
    :catchall_2
    throw p1
.end method

.method public static g(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 3

    .line 1
    sget-object v0, Lz0/z;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    :try_start_0
    sget-object v2, Lz0/z;->c:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Lz0/z;->c(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    sput-object v2, Lz0/z;->c:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    move-object v2, v1

    .line 27
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 28
    .line 29
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v2, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object p0, v1

    .line 39
    :goto_1
    instance-of p1, p0, Landroid/database/Cursor;

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    check-cast p0, Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    move-object p0, v1

    .line 47
    goto :goto_3

    .line 48
    :goto_2
    new-instance p1, LE0/d;

    .line 49
    .line 50
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object p0, p1

    .line 54
    :goto_3
    nop

    .line 55
    instance-of p1, p0, LE0/d;

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_5
    move-object v1, p0

    .line 61
    :goto_4
    check-cast v1, Landroid/database/Cursor;

    .line 62
    .line 63
    return-object v1
.end method


# virtual methods
.method public final declared-synchronized h(Ljava/lang/Object;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    sget-object v0, Lz0/z;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    sput-object p1, Lz0/z;->b:Ljava/lang/Object;

    .line 12
    .line 13
    sput-object v1, Lz0/z;->c:Ljava/lang/reflect/Method;

    .line 14
    .line 15
    sget-wide v2, Lz0/z;->d:J

    .line 16
    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    add-long/2addr v2, v4

    .line 20
    sput-wide v2, Lz0/z;->d:J

    .line 21
    .line 22
    sget-object v0, Lz0/z;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lz0/z;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    sget-object v0, Lz0/z;->c:Ljava/lang/reflect/Method;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    sget-object v0, Lz0/z;->c:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lz0/z;->c(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sput-object p1, Lz0/z;->c:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    :cond_4
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
.end method
