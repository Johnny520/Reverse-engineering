.class public abstract Lv0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/lu/wxmask/ui/MainActivity;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/i;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 v0, 0x7f0e0000

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :try_start_0
    invoke-static {p0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LD/h;->N(Ljava/io/InputStream;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "UTF-8"

    .line 19
    .line 20
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "forName(...)"

    .line 25
    .line 26
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    invoke-static {p0, v0}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public static b(Landroid/content/ContextWrapper;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getGithubMainUrl()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, "/res/raw/menu_ui.json"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v0, 0x1

    .line 29
    sput-boolean v0, Lb1/h;->j:Z

    .line 30
    .line 31
    sget-object v4, LD0/d;->b:Ljava/util/Map;

    .line 32
    .line 33
    new-instance v5, Lv0/a;

    .line 34
    .line 35
    invoke-direct {v5, v3}, Lv0/a;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, LA0/h;

    .line 39
    .line 40
    const/16 v0, 0x15

    .line 41
    .line 42
    invoke-direct {v6, p0, v0}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    const-string p0, "url"

    .line 46
    .line 47
    invoke-static {v3, p0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p0, "header"

    .line 51
    .line 52
    invoke-static {v4, p0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 56
    .line 57
    new-instance v2, LD0/a;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct/range {v2 .. v7}, LD0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v2}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 64
    .line 65
    .line 66
    return-void
.end method
