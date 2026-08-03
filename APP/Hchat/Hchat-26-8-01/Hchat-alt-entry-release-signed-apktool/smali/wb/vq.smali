.class public final Lwb/vq;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lwb/vq;

.field public static final b:Ljava/util/HashSet;

.field public static c:Lfg/l;

.field public static d:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwb/vq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/vq;->a:Lwb/vq;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lwb/vq;->b:Ljava/util/HashSet;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Landroid/net/Uri;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_6

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    instance-of v3, v2, Landroid/net/Uri;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    check-cast v2, Landroid/net/Uri;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    instance-of v3, v2, Landroid/content/Intent;

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Landroid/content/Intent;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    move-object v2, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    check-cast v2, Landroid/content/Intent;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Lwb/vq;->a(Landroid/os/Bundle;)Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    instance-of v3, v2, Landroid/os/Bundle;

    .line 68
    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    check-cast v2, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-static {v2}, Lwb/vq;->a(Landroid/os/Bundle;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    goto :goto_0

    .line 78
    :cond_5
    move-object v2, v0

    .line 79
    :goto_0
    if-eqz v2, :cond_1

    .line 80
    .line 81
    return-object v2

    .line 82
    :catchall_0
    :cond_6
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final declared-synchronized b(Ljava/lang/Class;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lwb/vq;->b:Ljava/util/HashSet;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    const-string v1, "onActivityResult"

    .line 13
    .line 14
    new-instance v2, Lwb/q0;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v2, v3}, Lwb/q0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    throw p1
.end method

.method public final declared-synchronized c(Landroid/app/Activity;Lfg/l;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sput-object p2, Lwb/vq;->c:Lfg/l;

    .line 3
    .line 4
    sput-object p1, Lwb/vq;->d:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p2}, Lwb/vq;->b(Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const-class p2, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lwb/vq;->b(Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Landroid/content/Intent;

    .line 19
    .line 20
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 21
    .line 22
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "android.intent.category.OPENABLE"

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v0, "*/*"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x40

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    .line 46
    .line 47
    const v1, 0x48435255    # 200009.33f

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-virtual {p1, p2, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    :try_start_2
    new-instance p2, Landroid/content/Intent;

    .line 55
    .line 56
    const-string v2, "android.intent.action.GET_CONTENT"

    .line 57
    .line 58
    invoke-direct {p2, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v2, "android.intent.category.OPENABLE"

    .line 62
    .line 63
    invoke-virtual {p2, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const-string v2, "*/*"

    .line 67
    .line 68
    invoke-virtual {p2, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    const-string v0, "\u9009\u62e9\u94c3\u58f0\u6587\u4ef6"

    .line 75
    .line 76
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    .line 82
    .line 83
    :goto_0
    monitor-exit p0

    .line 84
    return-void

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    throw p1
.end method

.method public final declared-synchronized d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sput-object p3, Lwb/vq;->c:Lfg/l;

    .line 6
    .line 7
    sput-object p1, Lwb/vq;->d:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p0, p3}, Lwb/vq;->b(Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    const-class p3, Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lwb/vq;->b(Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    new-instance p3, Landroid/content/Intent;

    .line 22
    .line 23
    const-string v0, "android.intent.action.RINGTONE_PICKER"

    .line 24
    .line 25
    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "android.intent.extra.ringtone.TYPE"

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const-string v0, "android.intent.extra.ringtone.TITLE"

    .line 35
    .line 36
    const-string v1, "\u9009\u62e9\u901a\u77e5\u94c3\u58f0"

    .line 37
    .line 38
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    const-string v0, "android.intent.extra.ringtone.SHOW_DEFAULT"

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    const-string v0, "android.intent.extra.ringtone.SHOW_SILENT"

    .line 48
    .line 49
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    const-string v0, "android.intent.extra.ringtone.EXISTING_URI"

    .line 62
    .line 63
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    :goto_0
    const p2, 0x48435254    # 200009.31f

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p3, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p1
.end method
