.class public final LYue/ۥۡۢۦۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۡ;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۧ;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;,
        LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;,
        LYue/ۥۡۢۦۤ$ۥ;,
        LYue/ۥۡۢۦۤ$ۥ۟;,
        LYue/ۥۡۢۦۤ$ۥ۟۟;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟۟;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟۠;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۥ;,
        LYue/ۥۡۢۦۤ$ۥ۟۟۟ۢ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/String; = "NotifManCompat"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "checkOpNoThrow"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "OP_POST_NOTIFICATION"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "android.support.useSideChannel"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

.field public static final ۥ۟۟۟ۢ:I = 0x13

.field public static final ۥۣ۟۟۟:I = 0x3e8

.field public static final ۥ۟۟۟ۤ:I = 0x6

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "enabled_notification_listeners"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/Object;

.field public static ۥ۟۟۟ۧ:Ljava/lang/String; = null
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sEnabledNotificationListenersLock"
    .end annotation
.end field

.field public static ۥ۟۟۟ۨ:Ljava/util/Set; = null
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sEnabledNotificationListenersLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۠:Ljava/lang/Object;

.field public static ۥ۟۟۠۟:LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ; = null
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sLock"
    .end annotation
.end field

.field public static final ۥ۟۟۠۠:I = 0x1

.field public static final ۥ۟۟۠ۡ:I = 0x2

.field public static final ۥ۟۟۠ۢ:I = 0x3

.field public static final ۥۣ۟۟۠:I = 0x4

.field public static final ۥ۟۟۠ۤ:I = 0x0

.field public static final ۥ۟۟۠ۥ:I = -0x3e8

.field public static final ۥ۟۟۠ۦ:I = 0x0

.field public static final ۥ۟۟۠ۧ:I = 0x1

.field public static final ۥ۟۟۠ۨ:I = 0x2

.field public static final ۥ۟۟ۡ:I = 0x3

.field public static final ۥ۟۟ۡ۟:I = 0x4

.field public static final ۥ۟۟ۡ۠:I = 0x5


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۦ:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۨ:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥۡۢۦۤ;->ۥ۟۟۠:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/NotificationManager;Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/app/NotificationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p2, p0, LYue/ۥۡۢۦۤ;->ۥ:Landroid/content/Context;

    .line 6
    iput-object p1, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۡۢۦۤ;->ۥ:Landroid/content/Context;

    .line 3
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/content/Context;)LYue/ۥۡۢۦۤ;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۢۦۤ;

    invoke-direct {v0, p0}, LYue/ۥۡۢۦۤ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static ۥۣ۟۟۠(Landroid/content/Context;)Ljava/util/Set;
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "enabled_notification_listeners"

    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۦ:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p0, :cond_2

    :try_start_0
    sget-object v1, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ":"

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-static {v5}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۨ:Ljava/util/Set;

    sput-object p0, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    :cond_2
    sget-object p0, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۨ:Ljava/util/Set;

    monitor-exit v0

    return-object p0

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟ۡۨ(Landroid/app/Notification;)Z
    .locals 1

    invoke-static {p0}, LYue/ۥۡۢۦ;->ۥ۟۟۟ۨ(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "android.support.useSideChannel"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public ۥ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟;->ۥ(Landroid/app/NotificationManager;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x22

    if-ge v0, v1, :cond_2

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ:Landroid/content/Context;

    const-string v1, "android.permission.USE_FULL_SCREEN_INTENT"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_2
    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟۟۟۠;->ۥ(Landroid/app/NotificationManager;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟۟(Ljava/lang/String;I)V

    return-void
.end method

.method public ۥ۟۟۟(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥۡۢۥۦ;)V
    .locals 0
    .param p1    # LYue/ۥۡۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ()Landroid/app/NotificationChannel;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)V
    .locals 1
    .param p1    # Landroid/app/NotificationChannel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۡۢۥۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۠()Landroid/app/NotificationChannelGroup;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥۣ۟۟۟(Landroid/app/NotificationChannelGroup;)V

    return-void
.end method

.method public ۥۣ۟۟۟(Landroid/app/NotificationChannelGroup;)V
    .locals 1
    .param p1    # Landroid/app/NotificationChannelGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟(Landroid/app/NotificationManager;Landroid/app/NotificationChannelGroup;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟(Landroid/app/NotificationManager;Ljava/util/List;)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e7;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۥۧ;

    invoke-virtual {v1}, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۠()Landroid/app/NotificationChannelGroup;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {p1, v0}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟(Landroid/app/NotificationManager;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۦ(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟(Landroid/app/NotificationManager;Ljava/util/List;)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e6;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۥۦ;

    invoke-virtual {v1}, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ()Landroid/app/NotificationChannel;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {p1, v0}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟(Landroid/app/NotificationManager;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟۟(Landroid/app/NotificationManager;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟۠(Landroid/app/NotificationManager;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠۟(Ljava/util/Collection;)V
    .locals 4
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۥ(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationChannel;

    invoke-static {v1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_1

    invoke-static {v1}, LYue/ۥۡۢۦۤ$ۥ۟۟۟۟;->ۥ۟(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟۟(Landroid/app/NotificationManager;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public ۥ۟۟۠ۡ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/service/notification/StatusBarNotification;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ;->ۥ(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۢ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ;->ۥ۟(Landroid/app/NotificationManager;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۤ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟;->ۥ۟(Landroid/app/NotificationManager;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۥ(Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥۣ۟۟۟(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۦ(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1, p2}, LYue/ۥۡۢۦۤ$ۥ۟۟۟۟;->ۥ(Landroid/app/NotificationManager;Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟۠ۥ(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۧ(Ljava/lang/String;)LYue/ۥۡۢۥۦ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟۠ۥ(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LYue/ۥۡۢۥۦ;

    invoke-direct {v0, p1}, LYue/ۥۡۢۥۦ;-><init>(Landroid/app/NotificationChannel;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۢۥۦ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۢۦۤ;->ۥ۟۟۠ۦ(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, LYue/ۥۡۢۥۦ;

    invoke-direct {p2, p1}, LYue/ۥۡۢۥۦ;-><init>(Landroid/app/NotificationChannel;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۡ(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟۟;->ۥ(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡ۠()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationChannelGroup;

    invoke-static {v1}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۢ(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/String;)LYue/ۥۡۢۥۧ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡ(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, LYue/ۥۡۢۥۧ;

    invoke-direct {v0, p1}, LYue/ۥۡۢۥۧ;-><init>(Landroid/app/NotificationChannelGroup;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡ(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, LYue/ۥۡۢۥۧ;

    invoke-virtual {p0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۢ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LYue/ۥۡۢۥۧ;-><init>(Landroid/app/NotificationChannelGroup;Ljava/util/List;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۡ۠()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۤ(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۡ()Ljava/util/List;
    .locals 6
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e7;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡ۠()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۢ()Ljava/util/List;

    move-result-object v0

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/NotificationChannelGroup;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v2, :cond_1

    new-instance v5, LYue/ۥۡۢۥۧ;

    invoke-direct {v5, v4}, LYue/ۥۡۢۥۧ;-><init>(Landroid/app/NotificationChannelGroup;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v5, LYue/ۥۡۢۥۧ;

    invoke-direct {v5, v4, v0}, LYue/ۥۡۢۥۧ;-><init>(Landroid/app/NotificationChannelGroup;Ljava/util/List;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v3

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۢ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-static {v0}, LYue/ۥۡۢۦۤ$ۥ۟۟;->ۥ۟۟۟ۥ(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۡ()Ljava/util/List;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e6;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۢ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationChannel;

    new-instance v3, LYue/ۥۡۢۥۦ;

    invoke-direct {v3, v2}, LYue/ۥۡۢۥۦ;-><init>(Landroid/app/NotificationChannel;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۤ(ILandroid/app/Notification;)V
    .locals 1
    .param p2    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.POST_NOTIFICATIONS"
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۥ(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public ۥ۟۟ۡۥ(Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.POST_NOTIFICATIONS"
    .end annotation

    invoke-static {p3}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۨ(Landroid/app/Notification;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;

    iget-object v1, p0, LYue/ۥۡۢۦۤ;->ۥ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p1, p3}, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    invoke-virtual {p0, v0}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۧ(LYue/ۥۡۢۦۤ$ۥ۟۟۟ۧ;)V

    iget-object p3, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-virtual {p3, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦۤ;->ۥ۟:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۡۦ(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.POST_NOTIFICATIONS"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6\u06e4$\u06e5\u06df\u06df\u06df\u06e3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;

    iget-object v3, v2, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ:Ljava/lang/String;

    iget v4, v2, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ۟:I

    iget-object v2, v2, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ۟۟:Landroid/app/Notification;

    invoke-virtual {p0, v3, v4, v2}, LYue/ۥۡۢۦۤ;->ۥ۟۟ۡۥ(Ljava/lang/String;ILandroid/app/Notification;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۡۧ(LYue/ۥۡۢۦۤ$ۥ۟۟۟ۧ;)V
    .locals 3

    sget-object v0, LYue/ۥۡۢۦۤ;->ۥ۟۟۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LYue/ۥۡۢۦۤ;->ۥ۟۟۠۟:LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;

    iget-object v2, p0, LYue/ۥۡۢۦۤ;->ۥ:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;-><init>(Landroid/content/Context;)V

    sput-object v1, LYue/ۥۡۢۦۤ;->ۥ۟۟۠۟:LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۡۢۦۤ;->ۥ۟۟۠۟:LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;

    invoke-virtual {v1, p1}, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(LYue/ۥۡۢۦۤ$ۥ۟۟۟ۧ;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
