.class public final Lee;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lee;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Lo72;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lee;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lee;->d:Lee;

    .line 8
    .line 9
    const v0, 0x790b003f

    .line 10
    .line 11
    .line 12
    sput v0, Lee;->e:I

    .line 13
    .line 14
    const v0, 0x790b0042

    .line 15
    .line 16
    .line 17
    sput v0, Lee;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lee;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "AntiRevoke"

    .line 24
    .line 25
    sput-object v0, Lee;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lee;->i:Z

    .line 29
    .line 30
    new-instance v0, Lo72;

    .line 31
    .line 32
    const-string v1, "([\\\"\u300c])(.*?)([\u300d\\\"])"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lo72;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lee;->j:Lo72;

    .line 38
    .line 39
    const-string v0, "^wxid_[^:]+:\\n(.*)$"

    .line 40
    .line 41
    const/16 v1, 0x20

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static q(Lde;Ljava/lang/String;Lyi1;J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    iget-object v1, p0, Lde;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lde;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "$sender"

    .line 19
    .line 20
    invoke-static {p0, v1, p1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, Ljava/util/Date;

    .line 25
    .line 26
    iget-wide v1, p2, Lyi1;->i:J

    .line 27
    .line 28
    invoke-direct {p1, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v1, "$sendTime"

    .line 39
    .line 40
    invoke-static {p0, v1, p1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p1, Ljava/util/Date;

    .line 45
    .line 46
    invoke-direct {p1, p3, p4}, Ljava/util/Date;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string p3, "$recallTime"

    .line 57
    .line 58
    invoke-static {p0, p3, p1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p1, "$content"

    .line 63
    .line 64
    iget-object p2, p2, Lyi1;->h:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p0, p1, p2}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static r(Landroid/content/Context;)Lde;
    .locals 3

    .line 1
    new-instance v0, Lde;

    .line 2
    .line 3
    const v1, 0x790b0041

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_3

    .line 13
    .line 14
    :cond_0
    :try_start_0
    sget-object p0, Lup0;->i:Landroid/content/Context;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string p0, "hostContext"

    .line 26
    .line 27
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :goto_0
    new-instance v1, Lx92;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v1

    .line 38
    :goto_1
    nop

    .line 39
    instance-of v1, p0, Lx92;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const-string p0, "\"$sender\"\u5c1d\u8bd5\u64a4\u56de\u4e00\u6761\u6d88\u606f"

    .line 44
    .line 45
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    :cond_3
    const-string v1, "yyyy/MM/dd HH:mm:ss"

    .line 48
    .line 49
    invoke-direct {v0, p0, v1}, Lde;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lpp1;->a:Lpp1;

    .line 53
    .line 54
    invoke-static {}, Lpp1;->c()Lop1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v1, Lde;->Companion:Lce;

    .line 59
    .line 60
    invoke-virtual {v1}, Lce;->serializer()Lw41;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lse;->D(Lw41;)Lw41;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "AntiRevoke/config"

    .line 69
    .line 70
    invoke-virtual {p0, v1, v0, v2}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lde;

    .line 75
    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v0, p0

    .line 80
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lee;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lvb1;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lee;->r(Landroid/content/Context;)Lde;

    .line 3
    .line 4
    .line 5
    sget-object v0, Lnd3;->e:Lnd3;

    .line 6
    .line 7
    new-instance v1, Le2;

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x1

    .line 11
    const/4 v2, 0x1

    .line 12
    const-class v4, Lee;

    .line 13
    .line 14
    const-string v5, "handleXmlParse"

    .line 15
    .line 16
    const-string v6, "handleXmlParse(Lnuke/module/wechat/listener/WeXmlParseListener$Event;)V"

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    move-object v3, p0

    .line 20
    invoke-direct/range {v1 .. v9}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lvb1;->a(Ltb1;Lin0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lee;->r(Landroid/content/Context;)Lde;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lde;->b:Ljava/lang/String;

    .line 9
    .line 10
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lee;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Lee;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lee;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lee;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {p0}, Lee;->r(Landroid/content/Context;)Lde;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lx;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkw;

    .line 50
    .line 51
    const p2, 0x1113370b

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p1, p2, v1, v0}, Lkw;-><init>(IZLun0;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lt7;

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    invoke-direct {p2, v0, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
