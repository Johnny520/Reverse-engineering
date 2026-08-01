.class public final Lfk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:Ljava/io/File;

.field public final c:Ljava/util/ArrayDeque;

.field public final synthetic d:Lgg;


# direct methods
.method public constructor <init>(Lgg;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfk;->d:Lgg;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lfk;->c:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    iget-object p1, p1, Lgg;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lfk;->a(Ljava/io/File;)Lbk;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v1, Ldk;

    .line 38
    .line 39
    invoke-direct {v1, p1}, Lgk;-><init>(Ljava/io/File;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    const/4 p1, 0x2

    .line 47
    iput p1, p0, Lfk;->a:I

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Lbk;
    .locals 2

    .line 1
    iget-object v0, p0, Lfk;->d:Lgg;

    .line 2
    .line 3
    iget-object v0, v0, Lgg;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lhk;

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
    new-instance v0, Lck;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lgk;-><init>(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance p1, Lpb;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance v0, Lek;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lgk;-><init>(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lfk;->a:I

    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Lfk;->c:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lgk;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {v1}, Lgk;->a()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v1, v1, Lgk;->a:Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const v3, 0x7fffffff

    .line 45
    .line 46
    .line 47
    if-lt v1, v3, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p0, v2}, Lfk;->a(Ljava/io/File;)Lbk;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    move-object v0, v2

    .line 59
    :goto_2
    const/4 v1, 0x1

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iput-object v0, p0, Lfk;->b:Ljava/io/File;

    .line 63
    .line 64
    iput v1, p0, Lfk;->a:I

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/4 v0, 0x2

    .line 68
    iput v0, p0, Lfk;->a:I

    .line 69
    .line 70
    :goto_3
    iget v0, p0, Lfk;->a:I

    .line 71
    .line 72
    if-ne v0, v1, :cond_5

    .line 73
    .line 74
    return v1

    .line 75
    :cond_5
    const/4 v0, 0x0

    .line 76
    return v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lfk;->a:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string v1, "hasNext called when the iterator is in the FAILED state."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    return v1

    .line 22
    :cond_2
    invoke-virtual {p0}, Lfk;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lfk;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iput v2, p0, Lfk;->a:I

    .line 8
    .line 9
    iget-object v0, p0, Lfk;->b:Ljava/io/File;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lfk;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput v2, p0, Lfk;->a:I

    .line 22
    .line 23
    iget-object v0, p0, Lfk;->b:Ljava/io/File;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
