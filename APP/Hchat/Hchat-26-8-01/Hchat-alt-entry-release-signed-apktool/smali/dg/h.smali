.class public final Ldg/h;
.super Ltf/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:Ljava/util/ArrayDeque;

.field public final synthetic j:Ldg/j;


# direct methods
.method public constructor <init>(Ldg/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg/h;->j:Ldg/j;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldg/h;->i:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    iget-object p1, p1, Ldg/j;->c:Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Ldg/h;->c(Ljava/io/File;)Ldg/d;

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
    new-instance v1, Ldg/f;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p1}, Ldg/i;-><init>(Ljava/io/File;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const/4 p1, 0x2

    .line 50
    iput p1, p0, Ltf/b;->g:I

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, Ldg/h;->i:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ldg/i;

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
    invoke-virtual {v1}, Ldg/i;->a()Ljava/io/File;

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
    iget-object v1, v1, Ldg/i;->a:Ljava/io/File;

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
    const v3, 0x7fffffff

    .line 42
    .line 43
    .line 44
    if-lt v1, v3, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p0, v2}, Ldg/h;->c(Ljava/io/File;)Ldg/d;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_1
    move-object v0, v2

    .line 56
    :goto_2
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iput-object v0, p0, Ltf/b;->h:Ljava/lang/Object;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput v0, p0, Ltf/b;->g:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    const/4 v0, 0x2

    .line 65
    iput v0, p0, Ltf/b;->g:I

    .line 66
    .line 67
    return-void
.end method

.method public final c(Ljava/io/File;)Ldg/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/h;->j:Ldg/j;

    .line 2
    .line 3
    iget-object v0, v0, Ldg/j;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldg/k;

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
    new-instance v0, Ldg/e;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Ldg/e;-><init>(Ldg/h;Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    new-instance v0, Ldg/g;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Ldg/g;-><init>(Ldg/h;Ljava/io/File;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
