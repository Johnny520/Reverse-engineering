.class public final Lcom/lu/wxmask/config/AppConfigUtil$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/config/AppConfigUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LN0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;LD0/c;)LE0/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->load$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;LD0/c;)LE0/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;LM0/p;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->load$lambda$1$lambda$0(Ljava/io/File;LM0/p;Ljava/lang/String;LD0/c;)LE0/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/io/File;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteWebUrl$lambda$6$lambda$5(Ljava/io/File;Ljava/lang/String;LD0/c;)LE0/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteWebUrl$lambda$6(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LD0/c;)LE0/i;

    move-result-object p0

    return-object p0
.end method

.method private final getLocalFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static final getReleaseNoteWebUrl$lambda$6(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 2

    .line 1
    const-string v0, "github"

    .line 2
    .line 3
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p3, LD0/c;->d:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p3, LD0/c;->c:[B

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 17
    .line 18
    invoke-direct {p1, p0, v0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->saveLocalFile(Ljava/io/File;[B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteExpiredSetting()Lz0/x;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iput-wide p1, p0, Lz0/x;->a:J

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const-string v0, "get fail: "

    .line 33
    .line 34
    filled-new-array {v0, p1, p3}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 42
    .line 43
    new-instance p1, Lo0/b;

    .line 44
    .line 45
    const/4 p3, 0x0

    .line 46
    invoke-direct {p1, p0, p2, p3}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2, p1}, LD/h;->o(Ljava/lang/String;LM0/l;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p0, LE0/i;->a:LE0/i;

    .line 53
    .line 54
    return-object p0
.end method

.method private static final getReleaseNoteWebUrl$lambda$6$lambda$5(Ljava/io/File;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 2

    .line 1
    const-string v0, "cdn"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, LD0/c;->d:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p2, LD0/c;->c:[B

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 17
    .line 18
    invoke-direct {p1, p0, v0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->saveLocalFile(Ljava/io/File;[B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteExpiredSetting()Lz0/x;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iput-wide p1, p0, Lz0/x;->a:J

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const-string p0, "get fail: "

    .line 33
    .line 34
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    sget-object p0, LE0/i;->a:LE0/i;

    .line 42
    .line 43
    return-object p0
.end method

.method public static synthetic load$default(Lcom/lu/wxmask/config/AppConfigUtil$Companion;LM0/p;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->load(LM0/p;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final load$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;LD0/c;)LE0/i;
    .locals 2

    .line 1
    const-string v0, "raw"

    .line 2
    .line 3
    invoke-static {p4, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p4, LD0/c;->d:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget v0, p4, LD0/c;->a:I

    .line 11
    .line 12
    const/16 v1, 0xc8

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p0, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 18
    .line 19
    iget-object p1, p4, LD0/c;->c:[B

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->parseConfig([B)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p4, LD0/c;->c:[B

    .line 25
    .line 26
    invoke-direct {p0, p2, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->saveLocalFile(Ljava/io/File;[B)V

    .line 27
    .line 28
    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getConfig()Lcom/lu/wxmask/config/AppConfig;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-interface {p3, p0, p1}, LM0/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const-string v0, "request raw fail, "

    .line 42
    .line 43
    invoke-static {v0, p0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    filled-new-array {p0, p4}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, LD0/d;->b:Ljava/util/Map;

    .line 55
    .line 56
    new-instance p4, Lo0/a;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {p4, p2, p3, p1, v0}, Lo0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p0, p4}, LD/h;->p(Ljava/lang/String;Ljava/util/Map;LM0/l;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    sget-object p0, LE0/i;->a:LE0/i;

    .line 66
    .line 67
    return-object p0
.end method

.method private static final load$lambda$1$lambda$0(Ljava/io/File;LM0/p;Ljava/lang/String;LD0/c;)LE0/i;
    .locals 2

    .line 1
    const-string v0, "cdn"

    .line 2
    .line 3
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p3, LD0/c;->d:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p3, LD0/c;->a:I

    .line 11
    .line 12
    const/16 v1, 0xc8

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    sget-object p2, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 17
    .line 18
    iget-object v0, p3, LD0/c;->c:[B

    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->parseConfig([B)V

    .line 21
    .line 22
    .line 23
    iget-object p3, p3, LD0/c;->c:[B

    .line 24
    .line 25
    invoke-direct {p2, p0, p3}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->saveLocalFile(Ljava/io/File;[B)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getConfig()Lcom/lu/wxmask/config/AppConfig;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-interface {p1, p0, p2}, LM0/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "request cdn fail, "

    .line 41
    .line 42
    invoke-static {v0, p2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p2, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 54
    .line 55
    invoke-direct {p2, p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->parseLocalConfig(Ljava/io/File;)V

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getConfig()Lcom/lu/wxmask/config/AppConfig;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-interface {p1, p0, p2}, LM0/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    sget-object p0, LE0/i;->a:LE0/i;

    .line 70
    .line 71
    return-object p0
.end method

.method private final parseConfig([B)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-class p1, Lcom/lu/wxmask/config/AppConfig;

    .line 9
    .line 10
    sget-object v1, Lg0/a;->a:LT/l;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, La0/a;

    .line 16
    .line 17
    invoke-direct {v2, p1}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, LT/l;->c(Ljava/lang/String;La0/a;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1}, LV/d;->k(Ljava/lang/Class;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/lu/wxmask/config/AppConfig;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    :goto_0
    if-eqz p1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->setConfig(Lcom/lu/wxmask/config/AppConfig;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method private final parseLocalConfig(Ljava/io/File;)V
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/FileInputStream;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const-wide/32 v3, 0x7fffffff

    .line 16
    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    const-string v4, "File "

    .line 21
    .line 22
    if-gtz v3, :cond_4

    .line 23
    .line 24
    long-to-int v1, v1

    .line 25
    :try_start_1
    new-array v2, v1, [B

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    move v5, v1

    .line 29
    move v6, v3

    .line 30
    :goto_0
    if-lez v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2, v6, v5}, Ljava/io/FileInputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-ltz v7, :cond_0

    .line 37
    .line 38
    sub-int/2addr v5, v7

    .line 39
    add-int/2addr v6, v7

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    const-string v7, "copyOf(...)"

    .line 45
    .line 46
    if-lez v5, :cond_1

    .line 47
    .line 48
    :try_start_2
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->read()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const/4 v6, -0x1

    .line 61
    if-ne v5, v6, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance v6, LK0/a;

    .line 65
    .line 66
    const/16 v8, 0x2001

    .line 67
    .line 68
    invoke-direct {v6, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v6}, LD/h;->i(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    add-int/2addr v5, v1

    .line 82
    if-ltz v5, :cond_3

    .line 83
    .line 84
    invoke-virtual {v6}, LK0/a;->a()[B

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v2, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {p1, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 103
    .line 104
    .line 105
    sget-object p1, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 106
    .line 107
    invoke-direct {p1, v2}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->parseConfig([B)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    :try_start_3
    new-instance v1, Ljava/lang/OutOfMemoryError;

    .line 112
    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p1, " is too big to fit in memory."

    .line 125
    .line 126
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {v1, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :cond_4
    new-instance v3, Ljava/lang/OutOfMemoryError;

    .line 138
    .line 139
    new-instance v5, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string p1, " is too big ("

    .line 148
    .line 149
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p1, " bytes) to fit in memory."

    .line 156
    .line 157
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-direct {v3, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 168
    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 169
    :catchall_1
    move-exception v1

    .line 170
    invoke-static {v0, p1}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v1
.end method

.method private final saveLocalFile(Ljava/io/File;[B)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    :catchall_1
    move-exception p2

    .line 16
    invoke-static {v0, p1}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2
.end method


# virtual methods
.method public final getCdnMainUrl()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getCdnMainUrl$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getConfig()Lcom/lu/wxmask/config/AppConfig;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getConfig$cp()Lcom/lu/wxmask/config/AppConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getGithubMainUrl()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getGithubMainUrl$cp()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getReleaseNoteExpiredSetting()Lz0/x;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getReleaseNoteExpiredSetting$delegate$cp()LE0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LE0/f;

    .line 6
    .line 7
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lz0/x;

    .line 12
    .line 13
    return-object v0
.end method

.method public final getReleaseNoteWebUrl()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getCdnMainUrl()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, "/res/html/releases_note.html"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getGithubMainUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "res/html/releases_note.html"

    .line 42
    .line 43
    invoke-direct {p0, v2}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getLocalFile(Ljava/lang/String;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v4, 0x7f0e0001

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 72
    .line 73
    .line 74
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :try_start_1
    sget-object v4, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 76
    .line 77
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, LD/h;->N(Ljava/io/InputStream;)[B

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-direct {v4, v2, v5}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->saveLocalFile(Ljava/io/File;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v4

    .line 92
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :catchall_1
    move-exception v5

    .line 94
    :try_start_4
    invoke-static {v3, v4}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    throw v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 98
    :catch_0
    :goto_0
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteExpiredSetting()Lz0/x;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const-wide/16 v4, 0x0

    .line 103
    .line 104
    iput-wide v4, v3, Lz0/x;->a:J

    .line 105
    .line 106
    :cond_0
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteExpiredSetting()Lz0/x;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    iget-wide v6, v3, Lz0/x;->a:J

    .line 118
    .line 119
    sub-long/2addr v4, v6

    .line 120
    const-wide/32 v6, 0x493e0

    .line 121
    .line 122
    .line 123
    cmp-long v3, v4, v6

    .line 124
    .line 125
    if-lez v3, :cond_1

    .line 126
    .line 127
    sget-object v3, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 128
    .line 129
    new-instance v3, Lo0/a;

    .line 130
    .line 131
    invoke-direct {v3, v2, v0, v1}, Lo0/a;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v3}, LD/h;->o(Ljava/lang/String;LM0/l;)V

    .line 135
    .line 136
    .line 137
    :cond_1
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v1, "toString(...)"

    .line 146
    .line 147
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v0
.end method

.method public final load(LM0/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM0/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getGithubMainUrl()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getConfigFilePath$cp()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, "/"

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getCdnMainUrl()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getConfigFilePath$cp()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v2, Ljava/io/File;

    .line 56
    .line 57
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->access$getConfigFilePath$cp()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_0

    .line 77
    .line 78
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    :catch_0
    :cond_0
    sget-object v3, LD0/d;->b:Ljava/util/Map;

    .line 86
    .line 87
    new-instance v4, Lo0/c;

    .line 88
    .line 89
    invoke-direct {v4, v1, v0, v2, p1}, Lo0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;LM0/p;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v3, v4}, LD/h;->p(Ljava/lang/String;Ljava/util/Map;LM0/l;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final setConfig(Lcom/lu/wxmask/config/AppConfig;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/lu/wxmask/config/AppConfigUtil;->access$setConfig$cp(Lcom/lu/wxmask/config/AppConfig;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
