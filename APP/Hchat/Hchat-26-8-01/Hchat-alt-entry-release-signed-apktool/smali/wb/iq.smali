.class public final Lwb/iq;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lwb/iq;

.field public static final b:Ljava/util/HashSet;

.field public static c:Lfg/l;

.field public static d:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwb/iq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/iq;->a:Lwb/iq;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lwb/iq;->b:Ljava/util/HashSet;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Class;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lwb/iq;->b:Ljava/util/HashSet;

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
    const/4 v3, 0x1

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

.method public final declared-synchronized b(Landroid/app/Activity;ILfg/l;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sput-object p3, Lwb/iq;->c:Lfg/l;

    .line 3
    .line 4
    sput-object p1, Lwb/iq;->d:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-virtual {p0, p3}, Lwb/iq;->a(Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const-class p3, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Lwb/iq;->a(Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    new-instance p3, Landroid/content/Intent;

    .line 19
    .line 20
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 21
    .line 22
    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "android.intent.category.OPENABLE"

    .line 26
    .line 27
    invoke-virtual {p3, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v0, "*/*"

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v0, "android.intent.extra.ALLOW_MULTIPLE"

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x40

    .line 45
    .line 46
    invoke-virtual {p3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p3}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    const v0, 0x48435256    # 200009.34f

    .line 53
    .line 54
    .line 55
    :try_start_1
    invoke-virtual {p1, p3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    :try_start_2
    new-instance p3, Landroid/content/Intent;

    .line 60
    .line 61
    const-string v2, "android.intent.action.GET_CONTENT"

    .line 62
    .line 63
    invoke-direct {p3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v2, "android.intent.category.OPENABLE"

    .line 67
    .line 68
    invoke-virtual {p3, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    const-string v2, "*/*"

    .line 72
    .line 73
    invoke-virtual {p3, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 77
    .line 78
    invoke-virtual {p3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lwb/ho;->J6(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {p3, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    .line 94
    .line 95
    :goto_0
    monitor-exit p0

    .line 96
    return-void

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    throw p1
.end method
