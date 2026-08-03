.class public abstract Ljd/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\R"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ljd/c;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lfc/f;Lnd/b0;Lmd/i;)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    sget-object v0, Lbc/a;->h:Lbc/a;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lnd/b0;->N(Lbc/a;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    instance-of p1, p2, Lnd/b0;

    .line 13
    .line 14
    check-cast p2, Lmd/e;

    .line 15
    .line 16
    iget-object p2, p2, Lmd/e;->g:Lmd/f;

    .line 17
    .line 18
    sget-object v0, Lmd/b;->a:Lmd/b;

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljd/a;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/16 v1, 0x20

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lfc/f;->d(C)Lfc/f;

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0}, Lbc/e;->c(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, ""

    .line 60
    .line 61
    invoke-static {p0, v2, v1}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lbc/e;->b(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-static {p0, v1, v3}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lbc/e;->a(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p0, v2, v0}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    :goto_2
    return-void
.end method

.method public static b(Lfc/f;Lnd/b0;)V
    .locals 4

    .line 1
    sget-object v0, Lmd/b;->d:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnd/o;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p1}, Lud/k;->n()Lud/u;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, Lud/u;->a:Lbc/g;

    .line 18
    .line 19
    iget-object v1, v1, Lbc/g;->H:Lbc/a;

    .line 20
    .line 21
    sget-object v2, Lbc/a;->g:Lbc/a;

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    sget-object v2, Lbc/a;->h:Lbc/a;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, v0, Lnd/o;->g:Ljava/util/EnumMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Lbe/i;

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    invoke-direct {v2, v1, v3}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lme/a;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/util/List;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :goto_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 77
    .line 78
    :goto_1
    new-instance v1, Ljd/b;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {v1, p0, v2}, Ljd/b;-><init>(Lfc/f;I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-static {p0, p1, p1}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static c(Lfc/f;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "/*  JADX ERROR: "

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lfc/f;->o()V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lxe/s;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lxe/r;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lxe/r;-><init>(Lfc/f;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/io/PrintWriter;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p1, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-static {p2}, Lxe/s;->e(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lfc/f;->n()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    :try_start_1
    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    throw p0

    .line 56
    :cond_0
    :goto_1
    const-string p1, "*/"

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static d(Lfc/f;Lnd/b0;)V
    .locals 2

    .line 1
    sget-object v0, Lbc/a;->i:Lbc/a;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnd/b0;->N(Lbc/a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 11
    .line 12
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/stream/Stream;->distinct()Ljava/util/stream/Stream;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Ljd/b;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p0, v1}, Ljd/b;-><init>(Lfc/f;I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Lfc/f;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 2
    .line 3
    .line 4
    const-string v0, "JADX INFO: "

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-static {v0}, Lbc/e;->c(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-static {p0, v2, v1}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lbc/e;->b(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {p0, v1, p1}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lbc/e;->a(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p0, v2, p1}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static f(Lfc/f;Lnd/b0;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lbc/a;->k:Lbc/a;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnd/b0;->N(Lbc/a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 10
    .line 11
    .line 12
    const-string v0, "/* "

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    invoke-static {p0, v1, v0}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "JADX "

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "INFO"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, ": "

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 34
    .line 35
    .line 36
    const-string v0, "renamed from: "

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 43
    .line 44
    .line 45
    sget-object p2, Lmd/b;->b:Lmd/b;

    .line 46
    .line 47
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lnd/f0;

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const-string p2, ", reason: "

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget-object p1, p1, Lnd/f0;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 66
    .line 67
    .line 68
    :cond_0
    const-string p1, " */"

    .line 69
    .line 70
    invoke-static {p0, v1, p1}, Ljd/c;->g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public static g(Lfc/f;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ljd/c;->a:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    array-length v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    aget-object v1, p2, v1

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    :goto_0
    if-ge v1, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lfc/f;->r(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    aget-object v2, p2, v1

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    return-void
.end method
