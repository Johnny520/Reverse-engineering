.class public final Leb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Leb/k;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Leb/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leb/k;->a:Leb/k;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Leb/k;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Leb/k;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Leb/k;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, "|"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static b(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "\\b"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, "\\s*=\\s*([\'\"])(.*?)\\1"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-static {v0}, Ll3/w;->f(I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {p1, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-static {p1, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 p0, 0x0

    .line 72
    :goto_0
    if-nez p0, :cond_2

    .line 73
    .line 74
    :goto_1
    const-string p0, ""

    .line 75
    .line 76
    :cond_2
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "&lt;"

    .line 10
    .line 11
    const-string v1, "<"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&gt;"

    .line 19
    .line 20
    const-string v1, ">"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&quot;"

    .line 27
    .line 28
    const-string v1, "\""

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&apos;"

    .line 35
    .line 36
    const-string v1, "\'"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "&amp;"

    .line 43
    .line 44
    const-string v1, "&"

    .line 45
    .line 46
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const/4 v0, 0x6

    .line 59
    new-array v0, v0, [C

    .line 60
    .line 61
    fill-array-data v0, :array_0

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :array_0
    .array-data 2
        0x22s
        0x27s
        0x20s
        0xas
        0xds
        0x9s
    .end array-data
.end method

.method public static e(J)V
    .locals 4

    .line 1
    sget-object v0, Leb/k;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x40

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lca/c;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-direct {v1, p0, p1, v2}, Lca/c;-><init>(JI)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lbe/i;

    .line 22
    .line 23
    const/16 v3, 0xb

    .line 24
    .line 25
    invoke-direct {v2, v1, v3}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object v0, Leb/k;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lca/c;

    .line 44
    .line 45
    const/4 v2, 0x6

    .line 46
    invoke-direct {v1, p0, p1, v2}, Lca/c;-><init>(JI)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lbe/i;

    .line 50
    .line 51
    const/16 p1, 0xc

    .line 52
    .line 53
    invoke-direct {p0, v1, p1}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, p0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public static f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    move-object v0, v1

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    new-instance v2, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v2

    .line 25
    :cond_1
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 p0, 0x0

    .line 44
    :goto_1
    if-nez p0, :cond_4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_4
    move-object v1, p0

    .line 48
    :goto_2
    move-object v0, v1

    .line 49
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    return-object v0
.end method

.method public static g(Leb/i;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Leb/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Leb/i;->a:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Leb/i;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget p0, p0, Leb/i;->d:I

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, "|"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static varargs h([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    :goto_1
    if-nez v2, :cond_2

    .line 19
    .line 20
    const-string p0, ""

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_2
    return-object v2
.end method

.method public static i(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getXml()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSource()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const/4 v4, 0x0

    .line 76
    const-string v5, ""

    .line 77
    .line 78
    move-object v6, v5

    .line 79
    move-object v7, v5

    .line 80
    invoke-static/range {v1 .. v7}, Leb/k;->m(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leb/i;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_5

    .line 85
    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    invoke-static {v0, v1}, Leb/k;->e(J)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v0, v1}, Leb/k;->o(Leb/i;J)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Leb/k;->g(Leb/i;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v3, Leb/k;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Ljava/lang/Long;

    .line 107
    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v4

    .line 114
    sub-long v4, v0, v4

    .line 115
    .line 116
    const-wide/16 v6, 0xbb8

    .line 117
    .line 118
    cmp-long v4, v4, v6

    .line 119
    .line 120
    if-gez v4, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    sget-object v0, Leb/k;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_4

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Lfg/l;

    .line 147
    .line 148
    :try_start_0
    invoke-interface {v1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 153
    .line 154
    iget-object v1, p0, Leb/i;->a:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v2, p0, Leb/i;->c:Ljava/lang/String;

    .line 157
    .line 158
    iget p0, p0, Leb/i;->d:I

    .line 159
    .line 160
    invoke-virtual {v0, v1, v2, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnNewFriend(Ljava/lang/String;Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    :cond_5
    :goto_1
    return-void
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const-string v0, "fmessage"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-string v0, "@chatroom"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_5

    .line 25
    .line 26
    const-string v0, "@openim"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_5

    .line 33
    .line 34
    const-string v0, "@im.chatroom"

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const-string v0, "gh_"

    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move v0, v1

    .line 53
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ge v0, v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    :goto_1
    return v1
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "@stranger"

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "v1_"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, "v2_"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "v3_"

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_1
    :goto_0
    return v1
.end method

.method public static m(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leb/i;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static/range {p4 .. p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static/range {p5 .. p5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_d

    .line 23
    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    if-nez p3, :cond_6

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v3, v1

    .line 35
    :goto_0
    if-gtz v3, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    and-int/lit16 v4, v3, 0xff

    .line 39
    .line 40
    const v5, 0xffff

    .line 41
    .line 42
    .line 43
    and-int/2addr v5, v3

    .line 44
    ushr-int/lit8 v6, v3, 0x10

    .line 45
    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/16 v6, 0x2710

    .line 50
    .line 51
    if-eq v5, v6, :cond_4

    .line 52
    .line 53
    const/16 v6, 0x2712

    .line 54
    .line 55
    if-eq v5, v6, :cond_4

    .line 56
    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    if-ne v5, v4, :cond_5

    .line 60
    .line 61
    move v3, v4

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move v3, v5

    .line 64
    :cond_5
    :goto_1
    const/16 v4, 0x25

    .line 65
    .line 66
    if-eq v3, v4, :cond_6

    .line 67
    .line 68
    goto/16 :goto_d

    .line 69
    .line 70
    :cond_6
    const-string v3, "encryptusername"

    .line 71
    .line 72
    invoke-static {v0, v3}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v5, "encryptuser"

    .line 77
    .line 78
    invoke-static {v0, v5}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v0, v3}, Leb/k;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v0, v3}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static/range {p4 .. p4}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, Leb/k;->l(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    move-object/from16 v3, p4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move-object v3, v2

    .line 104
    :goto_2
    const-string v10, ""

    .line 105
    .line 106
    if-nez v3, :cond_8

    .line 107
    .line 108
    move-object v8, v10

    .line 109
    goto :goto_3

    .line 110
    :cond_8
    move-object v8, v3

    .line 111
    :goto_3
    invoke-static/range {p2 .. p2}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Leb/k;->l(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    move-object/from16 v3, p2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_9
    move-object v3, v2

    .line 125
    :goto_4
    if-nez v3, :cond_a

    .line 126
    .line 127
    move-object v9, v10

    .line 128
    goto :goto_5

    .line 129
    :cond_a
    move-object v9, v3

    .line 130
    :goto_5
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v3}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v3}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, Leb/k;->k(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_b

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_b
    move-object v3, v2

    .line 150
    :goto_6
    if-nez v3, :cond_c

    .line 151
    .line 152
    move-object v3, v10

    .line 153
    :cond_c
    const-string v4, "fromusername"

    .line 154
    .line 155
    invoke-static {v0, v4}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    const-string v5, "username"

    .line 160
    .line 161
    invoke-static {v0, v5}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    invoke-static {v0, v4}, Leb/k;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-static {v0, v4}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    invoke-static/range {p4 .. p4}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-static {v4}, Leb/k;->l(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_d

    .line 182
    .line 183
    move-object/from16 v4, p4

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_d
    move-object v4, v2

    .line 187
    :goto_7
    if-nez v4, :cond_e

    .line 188
    .line 189
    move-object v15, v10

    .line 190
    goto :goto_8

    .line 191
    :cond_e
    move-object v15, v4

    .line 192
    :goto_8
    invoke-static/range {p2 .. p2}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-static {v4}, Leb/k;->l(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-nez v4, :cond_f

    .line 201
    .line 202
    move-object/from16 v4, p2

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_f
    move-object v4, v2

    .line 206
    :goto_9
    if-nez v4, :cond_10

    .line 207
    .line 208
    move-object/from16 v16, v10

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_10
    move-object/from16 v16, v4

    .line 212
    .line 213
    :goto_a
    filled-new-array/range {v11 .. v16}, [Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v4}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v4}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-static {v4}, Leb/k;->k(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_11

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_11
    move-object v4, v2

    .line 233
    :goto_b
    if-nez v4, :cond_12

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :cond_12
    move-object v10, v4

    .line 237
    :goto_c
    filled-new-array {v10, v3}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-static {v4}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-static {v3}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    const-string v5, "ticket"

    .line 254
    .line 255
    invoke-static {v0, v5}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    const-string v7, "antispamticket"

    .line 260
    .line 261
    invoke-static {v0, v7}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    const-string v9, "antispam_ticket"

    .line 266
    .line 267
    invoke-static {v0, v9}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    const-string v10, "verifyticket"

    .line 272
    .line 273
    invoke-static {v0, v10}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    const-string v11, "verify_ticket"

    .line 278
    .line 279
    invoke-static {v0, v11}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    move-object v12, v8

    .line 284
    move-object v8, v9

    .line 285
    move-object v9, v10

    .line 286
    move-object v10, v11

    .line 287
    invoke-static {v0, v5}, Leb/k;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    move-object v13, v12

    .line 292
    invoke-static {v0, v7}, Leb/k;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    invoke-static {v0, v5}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-static {v0, v7}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    move-object/from16 v15, p5

    .line 305
    .line 306
    move-object v7, v13

    .line 307
    move-object v13, v5

    .line 308
    filled-new-array/range {v6 .. v15}, [Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-static {v5}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-static {v5}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-nez v6, :cond_15

    .line 325
    .line 326
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_13

    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_13
    const-string v2, "scene"

    .line 334
    .line 335
    invoke-static {v0, v2}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    const-string v7, "scence"

    .line 340
    .line 341
    invoke-static {v0, v7}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    const-string v8, "sceneid"

    .line 346
    .line 347
    invoke-static {v0, v8}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    const-string v10, "scene_id"

    .line 352
    .line 353
    move-object v11, v9

    .line 354
    invoke-static {v0, v10}, Leb/k;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    invoke-static {v0, v2}, Leb/k;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    invoke-static {v0, v2}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v0, v8}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    invoke-static {v0, v10}, Leb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v13

    .line 374
    move-object/from16 v14, p6

    .line 375
    .line 376
    move-object v10, v12

    .line 377
    move-object v12, v8

    .line 378
    move-object v8, v11

    .line 379
    move-object v11, v2

    .line 380
    filled-new-array/range {v6 .. v14}, [Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {v0}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Leb/k;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    if-eqz v0, :cond_14

    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    :cond_14
    new-instance v0, Leb/i;

    .line 403
    .line 404
    invoke-direct {v0, v1, v4, v3, v5}, Leb/i;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    return-object v0

    .line 408
    :cond_15
    :goto_d
    return-object v2
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "(?:[?&]|&amp;)"

    .line 20
    .line 21
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "=([^&\\s<\"\']+)"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-static {v0}, Ll3/w;->f(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-static {p1, v0, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const/4 p1, 0x1

    .line 67
    invoke-static {p1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    :try_start_0
    const-string p1, "UTF-8"

    .line 76
    .line 77
    invoke-static {p0, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    new-instance v0, Lsf/f;

    .line 84
    .line 85
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object p1, v0

    .line 89
    :goto_0
    nop

    .line 90
    instance-of v0, p1, Lsf/f;

    .line 91
    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object p0, p1

    .line 96
    :goto_1
    check-cast p0, Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    const/4 p0, 0x0

    .line 100
    :goto_2
    if-nez p0, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    move-object v1, p0

    .line 104
    :goto_3
    return-object v1
.end method

.method public static o(Leb/i;J)V
    .locals 7

    .line 1
    iget-object v1, p0, Leb/i;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Leb/i;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Leb/j;

    .line 26
    .line 27
    iget-object v3, p0, Leb/i;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget v4, p0, Leb/i;->d:I

    .line 30
    .line 31
    move-wide v5, p1

    .line 32
    invoke-direct/range {v0 .. v6}, Leb/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Leb/i;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget p0, p0, Leb/i;->d:I

    .line 38
    .line 39
    invoke-static {p0, v1, p1}, Leb/k;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Leb/k;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public static p(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :cond_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_b

    .line 24
    .line 25
    invoke-static {p1}, Leb/k;->l(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-static {v2, v3}, Leb/k;->e(J)V

    .line 38
    .line 39
    .line 40
    if-nez p2, :cond_3

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move-object v2, p2

    .line 45
    :goto_1
    invoke-static {p0, p1, v2}, Leb/k;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object v2, Leb/k;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Leb/j;

    .line 56
    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    iget-object p0, p0, Leb/j;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    if-nez p2, :cond_5

    .line 69
    .line 70
    move-object p2, v1

    .line 71
    :cond_5
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast p0, Ljava/lang/Iterable;

    .line 79
    .line 80
    new-instance v1, Ldg/n;

    .line 81
    .line 82
    const/4 v2, 0x6

    .line 83
    invoke-direct {v1, p0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    new-instance p0, Leb/g;

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-direct {p0, v2, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance p2, Lng/i;

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-direct {p2, v1, v2, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 96
    .line 97
    .line 98
    new-instance p0, Lng/h;

    .line 99
    .line 100
    invoke-direct {p0, p2}, Lng/h;-><init>(Lng/i;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lng/h;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_6

    .line 108
    .line 109
    move-object p2, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_6
    invoke-virtual {p0}, Lng/h;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p0}, Lng/h;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_7

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    move-object v1, p2

    .line 123
    check-cast v1, Leb/j;

    .line 124
    .line 125
    iget-wide v1, v1, Leb/j;->e:J

    .line 126
    .line 127
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_8
    invoke-virtual {p0}, Lng/h;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    move-object v3, v2

    .line 136
    check-cast v3, Leb/j;

    .line 137
    .line 138
    iget-wide v3, v3, Leb/j;->e:J

    .line 139
    .line 140
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v1, v3}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-gez v4, :cond_9

    .line 149
    .line 150
    move-object p2, v2

    .line 151
    move-object v1, v3

    .line 152
    :cond_9
    invoke-virtual {p0}, Lng/h;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_8

    .line 157
    .line 158
    :goto_2
    check-cast p2, Leb/j;

    .line 159
    .line 160
    if-eqz p2, :cond_b

    .line 161
    .line 162
    iget-object p0, p2, Leb/j;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-nez p2, :cond_a

    .line 169
    .line 170
    move-object v0, p0

    .line 171
    :cond_a
    if-eqz v0, :cond_b

    .line 172
    .line 173
    return-object v0

    .line 174
    :cond_b
    :goto_3
    return-object p1
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized j(Lr8/g;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sget-boolean v0, Leb/k;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->g()Lo8/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_2
    new-instance v1, Lsf/f;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :goto_0
    nop

    .line 31
    instance-of v1, v0, Lsf/f;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move-object v0, v2

    .line 37
    :cond_1
    check-cast v0, Lo8/d;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0}, Lo8/d;->f()Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Lo8/d;->e()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    .line 50
    .line 51
    :catchall_1
    :try_start_4
    new-instance v1, Leb/h;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lo8/d;->g(Lo8/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    :try_start_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserve()Lk8/p;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 63
    goto :goto_2

    .line 64
    :catchall_2
    move-exception v0

    .line 65
    :try_start_6
    new-instance v1, Lsf/f;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v1

    .line 71
    :goto_2
    nop

    .line 72
    instance-of v1, v0, Lsf/f;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-object v2, v0

    .line 78
    :goto_3
    check-cast v2, Lk8/p;

    .line 79
    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {v2}, Lk8/p;->c()Z

    .line 83
    .line 84
    .line 85
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    :try_start_7
    invoke-virtual {v2}, Lk8/p;->b()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 89
    .line 90
    .line 91
    :catchall_3
    :try_start_8
    new-instance p1, Leb/b;

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    invoke-direct {p1, v0}, Leb/b;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :catchall_4
    move-exception p1

    .line 102
    goto :goto_5

    .line 103
    :cond_5
    iget-object p1, p1, Lr8/g;->f:Lf8/c;

    .line 104
    .line 105
    const-class v0, Lf8/g;

    .line 106
    .line 107
    new-instance v1, Lah/a;

    .line 108
    .line 109
    const/16 v2, 0x18

    .line 110
    .line 111
    invoke-direct {v1, v2}, Lah/a;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Lf8/c;->c(Ljava/lang/Class;Lf8/d;)Lf8/b;

    .line 115
    .line 116
    .line 117
    :goto_4
    const/4 p1, 0x1

    .line 118
    sput-boolean p1, Leb/k;->e:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 119
    .line 120
    monitor-exit p0

    .line 121
    return-void

    .line 122
    :goto_5
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 123
    throw p1
.end method
