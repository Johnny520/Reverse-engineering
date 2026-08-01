.class public final LT/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:LM/e;

.field public final d:LW/c;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method public constructor <init>(LV/h;LT/h;Ljava/util/HashMap;ZZZZILjava/util/ArrayList;LT/x;LT/x;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LT/l;->a:Ljava/lang/ThreadLocal;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LT/l;->b:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v0, p3

    move-object p3, p2

    .line 4
    new-instance p2, LM/e;

    invoke-direct {p2, v0, p7, p12}, LM/e;-><init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V

    iput-object p2, p0, LT/l;->c:LM/e;

    .line 5
    iput-boolean p4, p0, LT/l;->f:Z

    .line 6
    iput-boolean p5, p0, LT/l;->g:Z

    .line 7
    iput-boolean p6, p0, LT/l;->h:Z

    .line 8
    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    .line 9
    sget-object p4, LW/x;->z:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    sget-object p4, LT/x;->a:LT/t;

    if-ne p10, p4, :cond_0

    .line 11
    sget-object p4, LW/m;->c:LW/l;

    goto :goto_0

    .line 12
    :cond_0
    new-instance p4, LW/l;

    const/4 p5, 0x1

    invoke-direct {p4, p5, p10}, LW/l;-><init>(ILjava/lang/Object;)V

    .line 13
    :goto_0
    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-virtual {p7, p9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 16
    sget-object p4, LW/x;->p:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    sget-object p4, LW/x;->g:LW/u;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    sget-object p4, LW/x;->d:LW/u;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object p4, LW/x;->e:LW/u;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    sget-object p4, LW/x;->f:LW/u;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p4, 0x1

    if-ne p8, p4, :cond_1

    .line 21
    sget-object p4, LW/x;->k:LT/i;

    goto :goto_1

    .line 22
    :cond_1
    new-instance p4, LT/i;

    const/4 p5, 0x2

    .line 23
    invoke-direct {p4, p5}, LT/i;-><init>(I)V

    .line 24
    :goto_1
    new-instance p5, LW/u;

    sget-object p6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p8, Ljava/lang/Long;

    invoke-direct {p5, p6, p8, p4}, LW/u;-><init>(Ljava/lang/Class;Ljava/lang/Class;LT/y;)V

    .line 25
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance p5, LT/i;

    const/4 p6, 0x0

    .line 27
    invoke-direct {p5, p6}, LT/i;-><init>(I)V

    .line 28
    new-instance p6, LW/u;

    sget-object p8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class p9, Ljava/lang/Double;

    invoke-direct {p6, p8, p9, p5}, LW/u;-><init>(Ljava/lang/Class;Ljava/lang/Class;LT/y;)V

    .line 29
    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    new-instance p5, LT/i;

    const/4 p6, 0x1

    .line 31
    invoke-direct {p5, p6}, LT/i;-><init>(I)V

    .line 32
    new-instance p6, LW/u;

    sget-object p8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class p9, Ljava/lang/Float;

    invoke-direct {p6, p8, p9, p5}, LW/u;-><init>(Ljava/lang/Class;Ljava/lang/Class;LT/y;)V

    .line 33
    invoke-virtual {p7, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object p5, LT/x;->b:LT/u;

    if-ne p11, p5, :cond_2

    .line 35
    sget-object p5, LW/d;->d:LW/l;

    goto :goto_2

    .line 36
    :cond_2
    new-instance p5, LW/d;

    invoke-direct {p5, p11}, LW/d;-><init>(LT/x;)V

    .line 37
    new-instance p6, LW/l;

    const/4 p8, 0x0

    invoke-direct {p6, p8, p5}, LW/l;-><init>(ILjava/lang/Object;)V

    move-object p5, p6

    .line 38
    :goto_2
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object p5, LW/x;->h:LW/t;

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object p5, LW/x;->i:LW/t;

    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance p5, LT/j;

    const/4 p6, 0x0

    invoke-direct {p5, p4, p6}, LT/j;-><init>(LT/y;I)V

    .line 42
    new-instance p6, LT/j;

    const/4 p8, 0x2

    invoke-direct {p6, p5, p8}, LT/j;-><init>(LT/y;I)V

    .line 43
    new-instance p5, LW/t;

    const-class p8, Ljava/util/concurrent/atomic/AtomicLong;

    const/4 p9, 0x0

    invoke-direct {p5, p8, p6, p9}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 44
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance p5, LT/j;

    const/4 p6, 0x1

    invoke-direct {p5, p4, p6}, LT/j;-><init>(LT/y;I)V

    .line 46
    new-instance p4, LT/j;

    const/4 p6, 0x2

    invoke-direct {p4, p5, p6}, LT/j;-><init>(LT/y;I)V

    .line 47
    new-instance p5, LW/t;

    const-class p6, Ljava/util/concurrent/atomic/AtomicLongArray;

    const/4 p8, 0x0

    invoke-direct {p5, p6, p4, p8}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 48
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    sget-object p4, LW/x;->j:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    sget-object p4, LW/x;->l:LW/u;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    sget-object p4, LW/x;->q:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object p4, LW/x;->r:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object p4, LW/x;->m:LT/i;

    .line 54
    new-instance p5, LW/t;

    const-class p6, Ljava/math/BigDecimal;

    const/4 p8, 0x0

    invoke-direct {p5, p6, p4, p8}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 55
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object p4, LW/x;->n:LT/i;

    .line 57
    new-instance p5, LW/t;

    const-class p6, Ljava/math/BigInteger;

    const/4 p8, 0x0

    invoke-direct {p5, p6, p4, p8}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 58
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object p4, LW/x;->o:LT/i;

    .line 60
    new-instance p5, LW/t;

    const-class p6, LV/j;

    const/4 p8, 0x0

    invoke-direct {p5, p6, p4, p8}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 61
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object p4, LW/x;->s:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object p4, LW/x;->t:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    sget-object p4, LW/x;->v:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    sget-object p4, LW/x;->w:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object p4, LW/x;->y:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object p4, LW/x;->u:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object p4, LW/x;->b:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object p4, LW/d;->c:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    sget-object p4, LW/x;->x:LW/l;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    sget-boolean p4, LZ/c;->a:Z

    if-eqz p4, :cond_3

    .line 72
    sget-object p4, LZ/c;->e:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object p4, LZ/c;->d:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    sget-object p4, LZ/c;->f:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_3
    sget-object p4, LW/b;->d:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    sget-object p4, LW/x;->a:LW/t;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    new-instance p4, LW/c;

    const/4 p5, 0x0

    invoke-direct {p4, p2, p5}, LW/c;-><init>(LM/e;I)V

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    new-instance p4, LW/c;

    const/4 p5, 0x2

    invoke-direct {p4, p2, p5}, LW/c;-><init>(LM/e;I)V

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance p5, LW/c;

    const/4 p4, 0x1

    invoke-direct {p5, p2, p4}, LW/c;-><init>(LM/e;I)V

    iput-object p5, p0, LT/l;->d:LW/c;

    .line 80
    invoke-virtual {p7, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    sget-object p4, LW/x;->A:LW/a;

    invoke-virtual {p7, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p4, p1

    .line 82
    new-instance p1, LW/r;

    move-object p6, p12

    invoke-direct/range {p1 .. p6}, LW/r;-><init>(LM/e;LT/h;LV/h;LW/c;Ljava/util/ArrayList;)V

    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LT/l;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final b(Lb0/b;La0/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "AssertionError (GSON 2.10.1): "

    .line 2
    .line 3
    iget-boolean v1, p1, Lb0/b;->b:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, p1, Lb0/b;->b:Z

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, p2}, LT/l;->d(La0/a;)LT/y;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    iput-boolean v1, p1, Lb0/b;->b:Z

    .line 21
    .line 22
    return-object p2

    .line 23
    :catchall_0
    move-exception p2

    .line 24
    goto :goto_4

    .line 25
    :catch_0
    move-exception p2

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p2

    .line 28
    goto :goto_1

    .line 29
    :catch_2
    move-exception p2

    .line 30
    goto :goto_2

    .line 31
    :catch_3
    move-exception p2

    .line 32
    goto :goto_3

    .line 33
    :goto_0
    :try_start_1
    new-instance v2, Ljava/lang/AssertionError;

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v2, v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v2

    .line 55
    :goto_1
    new-instance v0, LT/p;

    .line 56
    .line 57
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :goto_2
    new-instance v0, LT/p;

    .line 62
    .line 63
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :goto_3
    if-eqz v2, :cond_0

    .line 68
    .line 69
    iput-boolean v1, p1, Lb0/b;->b:Z

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    return-object p1

    .line 73
    :cond_0
    :try_start_2
    new-instance v0, LT/p;

    .line 74
    .line 75
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    :goto_4
    iput-boolean v1, p1, Lb0/b;->b:Z

    .line 80
    .line 81
    throw p2
.end method

.method public final c(Ljava/lang/String;La0/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lb0/b;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lb0/b;-><init>(Ljava/io/Reader;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p1, Lb0/b;->b:Z

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, LT/l;->b(Lb0/b;La0/a;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    if-ne p1, v0, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    new-instance p1, LT/p;

    .line 34
    .line 35
    const-string p2, "JSON document was not fully consumed."

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
    :try_end_0
    .catch Lb0/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :goto_0
    new-instance p2, LT/p;

    .line 46
    .line 47
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw p2

    .line 51
    :goto_1
    new-instance p2, LT/p;

    .line 52
    .line 53
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw p2

    .line 57
    :cond_2
    :goto_2
    return-object p2
.end method

.method public final d(La0/a;)LT/y;
    .locals 8

    .line 1
    iget-object v0, p0, LT/l;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LT/y;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, LT/l;->a:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/util/Map;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, LT/y;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :goto_0
    :try_start_0
    new-instance v4, LT/k;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    iput-object v5, v4, LT/k;->a:LT/y;

    .line 49
    .line 50
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v6, p0, LT/l;->e:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_5

    .line 64
    .line 65
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, LT/z;

    .line 70
    .line 71
    invoke-interface {v5, p0, p1}, LT/z;->a(LT/l;La0/a;)LT/y;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    iget-object v6, v4, LT/k;->a:LT/y;

    .line 78
    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    iput-object v5, v4, LT/k;->a:LT/y;

    .line 82
    .line 83
    invoke-interface {v2, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 90
    .line 91
    const-string v0, "Delegate is already set"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 100
    .line 101
    .line 102
    :cond_6
    if-eqz v5, :cond_8

    .line 103
    .line 104
    if-eqz v3, :cond_7

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 107
    .line 108
    .line 109
    :cond_7
    return-object v5

    .line 110
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v2, "GSON (2.10.1) cannot handle "

    .line 115
    .line 116
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :goto_2
    if-eqz v3, :cond_9

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 133
    .line 134
    .line 135
    :cond_9
    throw p1
.end method

.method public final e(Ljava/io/Writer;)Lb0/c;
    .locals 1

    .line 1
    new-instance v0, Lb0/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lb0/c;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LT/l;->h:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "  "

    .line 11
    .line 12
    iput-object p1, v0, Lb0/c;->d:Ljava/lang/String;

    .line 13
    .line 14
    const-string p1, ": "

    .line 15
    .line 16
    iput-object p1, v0, Lb0/c;->e:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    iget-boolean p1, p0, LT/l;->g:Z

    .line 19
    .line 20
    iput-boolean p1, v0, Lb0/c;->g:Z

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, v0, Lb0/c;->f:Z

    .line 24
    .line 25
    iget-boolean p1, p0, LT/l;->f:Z

    .line 26
    .line 27
    iput-boolean p1, v0, Lb0/c;->i:Z

    .line 28
    .line 29
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/io/StringWriter;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, LT/l;->e(Ljava/io/Writer;)Lb0/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, LT/l;->g(Lb0/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p1

    .line 21
    new-instance v0, LT/p;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/io/StringWriter;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_1
    invoke-virtual {p0, v1}, LT/l;->e(Ljava/io/Writer;)Lb0/c;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, p1, v0, v2}, LT/l;->h(Ljava/lang/Object;Ljava/lang/Class;Lb0/c;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :catch_1
    move-exception p1

    .line 49
    new-instance v0, LT/p;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final g(Lb0/c;)V
    .locals 7

    .line 1
    sget-object v0, LT/q;->a:LT/q;

    .line 2
    .line 3
    const-string v1, "AssertionError (GSON 2.10.1): "

    .line 4
    .line 5
    iget-boolean v2, p1, Lb0/c;->f:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, p1, Lb0/c;->f:Z

    .line 9
    .line 10
    iget-boolean v3, p1, Lb0/c;->g:Z

    .line 11
    .line 12
    iget-boolean v4, p0, LT/l;->g:Z

    .line 13
    .line 14
    iput-boolean v4, p1, Lb0/c;->g:Z

    .line 15
    .line 16
    iget-boolean v4, p1, Lb0/c;->i:Z

    .line 17
    .line 18
    iget-boolean v5, p0, LT/l;->f:Z

    .line 19
    .line 20
    iput-boolean v5, p1, Lb0/c;->i:Z

    .line 21
    .line 22
    :try_start_0
    sget-object v5, LW/x;->a:LW/t;

    .line 23
    .line 24
    invoke-static {p1, v0}, LT/i;->d(Lb0/c;LT/o;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    iput-boolean v2, p1, Lb0/c;->f:Z

    .line 28
    .line 29
    iput-boolean v3, p1, Lb0/c;->g:Z

    .line 30
    .line 31
    iput-boolean v4, p1, Lb0/c;->i:Z

    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    :try_start_1
    new-instance v5, Ljava/lang/AssertionError;

    .line 36
    .line 37
    new-instance v6, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v5, v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v5

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_0

    .line 59
    :catch_1
    move-exception v0

    .line 60
    new-instance v1, LT/p;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    :goto_0
    iput-boolean v2, p1, Lb0/c;->f:Z

    .line 67
    .line 68
    iput-boolean v3, p1, Lb0/c;->g:Z

    .line 69
    .line 70
    iput-boolean v4, p1, Lb0/c;->i:Z

    .line 71
    .line 72
    throw v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Class;Lb0/c;)V
    .locals 5

    .line 1
    const-string v0, "AssertionError (GSON 2.10.1): "

    .line 2
    .line 3
    new-instance v1, La0/a;

    .line 4
    .line 5
    invoke-direct {v1, p2}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, LT/l;->d(La0/a;)LT/y;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-boolean v1, p3, Lb0/c;->f:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p3, Lb0/c;->f:Z

    .line 16
    .line 17
    iget-boolean v2, p3, Lb0/c;->g:Z

    .line 18
    .line 19
    iget-boolean v3, p0, LT/l;->g:Z

    .line 20
    .line 21
    iput-boolean v3, p3, Lb0/c;->g:Z

    .line 22
    .line 23
    iget-boolean v3, p3, Lb0/c;->i:Z

    .line 24
    .line 25
    iget-boolean v4, p0, LT/l;->f:Z

    .line 26
    .line 27
    iput-boolean v4, p3, Lb0/c;->i:Z

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p2, p3, p1}, LT/y;->b(Lb0/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iput-boolean v1, p3, Lb0/c;->f:Z

    .line 33
    .line 34
    iput-boolean v2, p3, Lb0/c;->g:Z

    .line 35
    .line 36
    iput-boolean v3, p3, Lb0/c;->i:Z

    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 43
    .line 44
    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :catch_1
    move-exception p1

    .line 65
    new-instance p2, LT/p;

    .line 66
    .line 67
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_0
    iput-boolean v1, p3, Lb0/c;->f:Z

    .line 72
    .line 73
    iput-boolean v2, p3, Lb0/c;->g:Z

    .line 74
    .line 75
    iput-boolean v3, p3, Lb0/c;->i:Z

    .line 76
    .line 77
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, LT/l;->f:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",factories:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LT/l;->e:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ",instanceCreators:"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LT/l;->c:LM/e;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "}"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
