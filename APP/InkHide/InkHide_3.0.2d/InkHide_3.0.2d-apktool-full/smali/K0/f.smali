.class public final LK0/f;
.super LF0/b;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/ArrayDeque;

.field public final synthetic d:LK0/h;


# direct methods
.method public constructor <init>(LK0/h;)V
    .locals 2

    .line 1
    iput-object p1, p0, LK0/f;->d:LK0/h;

    .line 2
    .line 3
    invoke-direct {p0}, LF0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LK0/f;->c:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    iget-object v1, p1, LK0/h;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object p1, p1, LK0/h;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ljava/io/File;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, LK0/f;->b(Ljava/io/File;)LK0/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    new-instance v1, LK0/d;

    .line 42
    .line 43
    invoke-direct {v1, p1}, LK0/g;-><init>(Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    sget-object p1, LF0/x;->c:LF0/x;

    .line 51
    .line 52
    iput-object p1, p0, LF0/b;->a:LF0/x;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, LK0/f;->c:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LK0/g;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {v1}, LK0/g;->a()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, v1, LK0/g;->a:Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v3, p0, LK0/f;->d:LK0/h;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const v3, 0x7fffffff

    .line 47
    .line 48
    .line 49
    if-lt v1, v3, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, v2}, LK0/f;->b(Ljava/io/File;)LK0/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    :goto_1
    move-object v0, v2

    .line 61
    :goto_2
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iput-object v0, p0, LF0/b;->b:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object v0, LF0/x;->a:LF0/x;

    .line 66
    .line 67
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    sget-object v0, LF0/x;->c:LF0/x;

    .line 71
    .line 72
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 73
    .line 74
    return-void
.end method

.method public final b(Ljava/io/File;)LK0/b;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/f;->d:LK0/h;

    .line 2
    .line 3
    iget-object v0, v0, LK0/h;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LK0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, LK0/c;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, LK0/c;-><init>(LK0/f;Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance p1, LE0/b;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance v0, LK0/e;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1}, LK0/e;-><init>(LK0/f;Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
