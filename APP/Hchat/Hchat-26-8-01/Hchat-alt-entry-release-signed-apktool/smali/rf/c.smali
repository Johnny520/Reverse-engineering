.class public final Lrf/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lrf/b;


# static fields
.field public static final a:Lmh/b;

.field public static final b:Ljava/nio/file/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lrf/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lrf/c;->a:Lmh/b;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "."

    .line 13
    .line 14
    invoke-static {v1, v0}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/nio/file/Path;->normalize()Ljava/nio/file/Path;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lrf/c;->b:Ljava/nio/file/Path;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lnf/a;)Z
    .locals 9

    .line 1
    invoke-interface {p1}, Lnf/a;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lrf/c;->c(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    invoke-interface {p1}, Lnf/a;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-interface {p1}, Lnf/a;->c()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x0

    .line 21
    .line 22
    cmp-long v0, v2, v6

    .line 23
    .line 24
    const/4 v8, 0x1

    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    cmp-long v0, v4, v6

    .line 28
    .line 29
    if-gez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v0, v8

    .line 35
    :goto_1
    const/high16 v6, 0x1900000

    .line 36
    .line 37
    int-to-long v6, v6

    .line 38
    cmp-long v6, v4, v6

    .line 39
    .line 40
    if-ltz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x64

    .line 43
    .line 44
    int-to-long v6, v6

    .line 45
    mul-long/2addr v6, v2

    .line 46
    cmp-long v6, v6, v4

    .line 47
    .line 48
    if-gez v6, :cond_2

    .line 49
    .line 50
    move v6, v8

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v6, v1

    .line 53
    :goto_2
    if-nez v0, :cond_4

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    return v8

    .line 59
    :cond_4
    :goto_3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {p1}, Lnf/a;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    filled-new-array {v0, v2, p1}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object v0, Lrf/c;->a:Lmh/b;

    .line 76
    .line 77
    invoke-interface {v0, p1}, Lmh/b;->q([Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    return v1
.end method

.method public final b()I
    .locals 1

    .line 1
    const v0, 0x186a0

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, ".."

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    sget-object v2, Lrf/c;->a:Lmh/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, "../"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string v0, "..\\"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    const-string v0, "Path traversal attack detected in entry: \'{}\'"

    .line 29
    .line 30
    invoke-interface {v2, p1, v0}, Lmh/b;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    :try_start_0
    sget-object v0, Lrf/c;->b:Ljava/nio/file/Path;

    .line 35
    .line 36
    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Ljava/nio/file/Path;->normalize()Ljava/nio/file/Path;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3, v0}, Ljava/nio/file/Path;->startsWith(Ljava/nio/file/Path;)Z

    .line 45
    .line 46
    .line 47
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_2
    const-string v0, "Invalid file name or path traversal attack detected: {}"

    .line 53
    .line 54
    invoke-interface {v2, p1, v0}, Lmh/b;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return v1

    .line 58
    :catch_0
    move-exception v0

    .line 59
    const-string v3, "Invalid file name or path traversal attack detected: {} - error: {}"

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v2, p1, v3, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return v1
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
