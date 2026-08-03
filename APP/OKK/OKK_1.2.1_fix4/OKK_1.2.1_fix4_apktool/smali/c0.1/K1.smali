.class public final synthetic Lc0/K1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc0/K1;->a:I

    iput-object p2, p0, Lc0/K1;->b:Ljava/util/List;

    iput-boolean p3, p0, Lc0/K1;->c:Z

    iput-object p4, p0, Lc0/K1;->d:Ljava/lang/String;

    iput-object p5, p0, Lc0/K1;->e:Ljava/lang/String;

    iput-wide p6, p0, Lc0/K1;->f:J

    iput-object p8, p0, Lc0/K1;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget-boolean v0, p0, Lc0/K1;->c:Z

    iget-wide v1, p0, Lc0/K1;->f:J

    iget-object v3, p0, Lc0/K1;->b:Ljava/util/List;

    const-string v4, "$targets"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lc0/K1;->d:Ljava/lang/String;

    const-string v5, "$latText"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lc0/K1;->e:Ljava/lang/String;

    const-string v6, "$lonText"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lc0/K1;->g:Ljava/lang/String;

    const-string v7, "$body"

    invoke-static {v6, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lc0/L1;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v7

    iget v8, p0, Lc0/K1;->a:I

    if-eq v8, v7, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/io/File;

    sget-object v8, Lc0/L1;->a:Lc0/L1;

    :try_start_0
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    goto :goto_1

    :catchall_0
    move-exception v7

    goto :goto_2

    :cond_1
    :goto_1
    const-string v8, "virtual_location_enabled"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v9

    new-instance v10, LD0/e;

    invoke-direct {v10, v8, v9}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "virtual_location_latitude"

    new-instance v9, LD0/e;

    invoke-direct {v9, v8, v4}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "virtual_location_longitude"

    new-instance v11, LD0/e;

    invoke-direct {v11, v8, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "virtual_location_updated"

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    new-instance v13, LD0/e;

    invoke-direct {v13, v8, v12}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v9, v11, v13}, [LD0/e;

    move-result-object v8

    invoke-static {v8}, LE0/x;->h0([LD0/e;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v7, v8}, Lc0/L1;->f(Ljava/io/File;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    invoke-static {v7}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_0

    :cond_2
    :try_start_1
    new-instance v0, Ljava/io/File;

    const-string v1, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v2, "virtual_location.properties"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v1, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v0, v6, v1}, LN0/k;->j0(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :goto_4
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_5
    return-void
.end method
