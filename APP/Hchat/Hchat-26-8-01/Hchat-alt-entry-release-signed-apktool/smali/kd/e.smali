.class public final Lkd/e;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lkd/e;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lkd/e;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SaveDeobfMapping"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lud/u;->a:Lbc/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Lbc/g;->U:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p1, Lud/u;->a:Lbc/g;

    .line 13
    .line 14
    iget v2, v2, Lbc/g;->S:I

    .line 15
    .line 16
    if-eqz v2, :cond_5

    .line 17
    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    if-ne v2, v3, :cond_3

    .line 22
    .line 23
    :cond_1
    invoke-static {p1}, Lkd/b;->a(Lud/u;)Lkd/b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, v3, Lkd/b;->a:Ljava/nio/file/Path;

    .line 28
    .line 29
    if-ne v2, v1, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    new-array v2, v2, [Ljava/nio/file/LinkOption;

    .line 33
    .line 34
    invoke-static {v4, v2}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :try_start_0
    iget-object v2, v3, Lkd/b;->b:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object v2, v3, Lkd/b;->c:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object v2, v3, Lkd/b;->d:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v3, Lkd/b;->e:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1}, Lkd/b;->b(Lud/u;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lkd/b;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception v2

    .line 69
    const-string v3, "Failed to save deobfuscation map file \'{}\'"

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v5, Lkd/e;->g:Lmh/b;

    .line 76
    .line 77
    invoke-interface {v5, v4, v3, v2}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_0
    if-ne v0, v1, :cond_4

    .line 81
    .line 82
    invoke-static {p1}, Lgd/c;->a(Lud/u;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    return-void

    .line 86
    :cond_5
    const/4 p1, 0x0

    .line 87
    throw p1
.end method
