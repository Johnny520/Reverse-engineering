.class public abstract Landroidx/appcompat/app/ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/ۥ۟۟۟$ۥ;,
        Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟;,
        Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;,
        Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟۟;,
        Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:Z = false

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "AppCompatDelegate"

.field public static ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟; = null

.field public static final ۥ۟۟۠ۦ:Ljava/lang/String; = "androidx.appcompat.app.AppLocalesMetadataHolderService"

.field public static final ۥ۟۟۠ۧ:I = -0x1

.field public static final ۥ۟۟۠ۨ:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟ۡ:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟ۡ۟:I = 0x1

.field public static final ۥ۟۟ۡ۠:I = 0x2

.field public static final ۥ۟۟ۡۡ:I = 0x3

.field public static final ۥ۟۟ۡۢ:I = -0x64

.field public static ۥۣ۟۟ۡ:I = 0x0

.field public static ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ; = null

.field public static ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ; = null

.field public static ۥ۟۟ۡۦ:Ljava/lang/Boolean; = null

.field public static ۥ۟۟ۡۧ:Z = false

.field public static final ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e1\u06e8\u06e6<",
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/appcompat/app/\u06e5\u06df\u06df\u06df;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟ۢ:Ljava/lang/Object;

.field public static final ۥ۟۟ۢ۟:Ljava/lang/Object;

.field public static final ۥ۟۟ۢ۠:I = 0x6c

.field public static final ۥ۟۟ۢۡ:I = 0x6d

.field public static final ۥ۟۟ۢۢ:I = 0xa


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;

    new-instance v1, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟۟;

    invoke-direct {v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟۟;-><init>()V

    invoke-direct {v0, v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;

    const/16 v0, -0x64

    sput v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ:I

    const/4 v0, 0x0

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۧ:Z

    new-instance v0, LYue/ۥ۟ۡۨۦ;

    invoke-direct {v0}, LYue/ۥ۟ۡۨۦ;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ۟:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۧ(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic ۥ۟(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ(Landroid/content/Context;)V

    return-void
.end method

.method public static ۥ۟۟(Landroidx/appcompat/app/ۥ۟۟۟;)V
    .locals 3
    .param p0    # Landroidx/appcompat/app/ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ۟۟۟;)V

    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, LYue/ۥ۟ۡۨۦ;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۟ۡ()V
    .locals 3

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v1}, LYue/ۥ۟ۡۨۦ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/ۥ۟۟۟;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟۠()Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ۥ۟۟۟ۢ()V
    .locals 2

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۡۨۦ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/app/ۥ۟۟۟;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟۟()Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟ۦ(Landroid/app/Activity;LYue/ۥ۟ۡ۟ۦ;)Landroidx/appcompat/app/ۥ۟۟۟;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۡ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;-><init>(Landroid/app/Activity;LYue/ۥ۟ۡ۟ۦ;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/app/Dialog;LYue/ۥ۟ۡ۟ۦ;)Landroidx/appcompat/app/ۥ۟۟۟;
    .locals 1
    .param p0    # Landroid/app/Dialog;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۡ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;-><init>(Landroid/app/Dialog;LYue/ۥ۟ۡ۟ۦ;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/content/Context;Landroid/app/Activity;LYue/ۥ۟ۡ۟ۦ;)Landroidx/appcompat/app/ۥ۟۟۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/app/Activity;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۡ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۟;-><init>(Landroid/content/Context;Landroid/app/Activity;LYue/ۥ۟ۡ۟ۦ;)V

    return-object v0
.end method

.method public static ۥ۟۟۠(Landroid/content/Context;Landroid/view/Window;LYue/ۥ۟ۡ۟ۦ;)Landroidx/appcompat/app/ۥ۟۟۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/Window;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۡ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۟;-><init>(Landroid/content/Context;Landroid/view/Window;LYue/ۥ۟ۡ۟ۦ;)V

    return-object v0
.end method

.method public static ۥ۟۟۠ۡ()LYue/ۥ۠ۧۦۥ;
    .locals 2
    .annotation build LYue/ۥ۟۠ۧۦ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۦ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟;->ۥ(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۠(Landroid/os/LocaleList;)LYue/ۥ۠ۧۦۥ;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۡ()LYue/ۥ۠ۧۦۥ;

    move-result-object v0

    return-object v0
.end method

.method public static ۥۣ۟۟۠()I
    .locals 1

    sget v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ:I

    return v0
.end method

.method public static ۥ۟۟۠ۦ()Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x21
    .end annotation

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۡۨۦ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/app/ۥ۟۟۟;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۢ()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "locale"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ۥ۟۟۠ۨ()LYue/ۥ۠ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    return-object v0
.end method

.method public static ۥ۟۟ۡ()LYue/ۥ۠ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    return-object v0
.end method

.method public static ۥۣ۟۟ۡ(Landroid/content/Context;)Z
    .locals 1

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p0}, LYue/ۥ۟ۡۥۤ;->ۥ(Landroid/content/Context;)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "AppCompatDelegate"

    const-string v0, "Checking for metadata for AppLocalesMetadataHolderService : Service not found"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۡۤ()Z
    .locals 1

    invoke-static {}, LYue/ۥۣۢۥۤ;->ۥ۟۟۟ۤ()Z

    move-result v0

    return v0
.end method

.method public static synthetic ۥ۟۟ۡۦ(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۤۢ(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic ۥ۟۟ۡۧ(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۤۡ(Landroid/content/Context;)V

    const/4 p0, 0x1

    sput-boolean p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۧ:Z

    return-void
.end method

.method public static ۥ۟۟ۢۥ(Landroidx/appcompat/app/ۥ۟۟۟;)V
    .locals 1
    .param p0    # Landroidx/appcompat/app/ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ۟۟۟;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ۟۟۟;)V
    .locals 3
    .param p0    # Landroidx/appcompat/app/ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v1}, LYue/ۥ۟ۡۨۦ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/ۥ۟۟۟;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟ۢۨ()V
    .locals 1
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const/4 v0, 0x0

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    return-void
.end method

.method public static ۥۣ۟۟(LYue/ۥ۠ۧۦۥ;)V
    .locals 2
    .param p0    # LYue/ۥ۠ۧۦۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۦ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ;->ۥ(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟;->ۥ۟(Ljava/lang/Object;Landroid/os/LocaleList;)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧۦۥ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    invoke-static {}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟ۢ()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥۣ۟۟۟(Z)V
    .locals 0

    invoke-static {p0}, LYue/ۥۣۢۥۤ;->ۥ۟۟۟ۥ(Z)V

    return-void
.end method

.method public static ۥۣۣ۟۟(I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "AppCompatDelegate"

    const-string v0, "setDefaultNightMode() called with an unknown mode"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ:I

    if-eq v0, p0, :cond_1

    sput p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ:I

    invoke-static {}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟ۡ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥۣ۟۟ۥ(Z)V
    .locals 0
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۦ:Ljava/lang/Boolean;

    return-void
.end method

.method public static ۥ۟۟ۤۡ(Landroid/content/Context;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    invoke-static {}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۡ()LYue/ۥ۠ۧۦۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۡۥۥ;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "locale"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ;->ۥ(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟;->ۥ۟(Ljava/lang/Object;Landroid/os/LocaleList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v0, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    :cond_1
    return-void
.end method

.method public static ۥ۟۟ۤۢ(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    sget-boolean v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۧ:Z

    if-nez v0, :cond_6

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;

    new-instance v1, LYue/ۥ۟ۡ۠ۢ;

    invoke-direct {v1, p0}, LYue/ۥ۟ۡ۠ۢ;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_1
    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    if-nez v1, :cond_4

    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    if-nez v1, :cond_2

    invoke-static {p0}, LYue/ۥ۟ۡۥۥ;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    :goto_0
    sget-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۤ()Z

    move-result p0

    if-eqz p0, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    sget-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    sput-object p0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    goto :goto_1

    :cond_4
    sget-object v2, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    invoke-virtual {v1, v2}, LYue/ۥ۠ۧۦۥ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۤ:LYue/ۥ۠ۧۦۥ;

    sput-object v1, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۥ:LYue/ۥ۠ۧۦۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, LYue/ۥ۟ۡۥۥ;->ۥ(Landroid/content/Context;Ljava/lang/String;)V

    :cond_5
    :goto_1
    monitor-exit v0

    :cond_6
    :goto_2
    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public abstract ۥ۟۟۟(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۥ۟۟۟۠()Z
.end method

.method public ۥۣ۟۟۟(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;

    new-instance v1, LYue/ۥۣ۟ۡ۠;

    invoke-direct {v1, p1}, LYue/ۥۣ۟ۡ۠;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroid/content/Context;)Landroid/content/Context;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟ۤ(Landroid/content/Context;)V

    return-object p1
.end method

.method public abstract ۥ۟۟۠۟(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۠۠(I)Landroid/view/View;
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public ۥ۟۟۠ۢ()Landroid/content/Context;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ۥ۟۟۠ۤ()Landroidx/appcompat/app/ۥ۟$ۥ۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public ۥ۟۟۠ۥ()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public abstract ۥ۟۟۠ۧ()Landroid/view/MenuInflater;
.end method

.method public abstract ۥ۟۟ۡ۟()Landroidx/appcompat/app/ۥ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟ۡ۠(I)Z
.end method

.method public abstract ۥ۟۟ۡۡ()V
.end method

.method public abstract ۥ۟۟ۡۢ()V
.end method

.method public abstract ۥ۟۟ۡۥ()Z
.end method

.method public abstract ۥ۟۟ۡۨ(Landroid/content/res/Configuration;)V
.end method

.method public abstract ۥ۟۟ۢ(Landroid/os/Bundle;)V
.end method

.method public abstract ۥ۟۟ۢ۟()V
.end method

.method public abstract ۥ۟۟ۢ۠(Landroid/os/Bundle;)V
.end method

.method public abstract ۥ۟۟ۢۡ()V
.end method

.method public abstract ۥ۟۟ۢۢ(Landroid/os/Bundle;)V
.end method

.method public abstract ۥۣ۟۟ۢ()V
.end method

.method public abstract ۥ۟۟ۢۤ()V
.end method

.method public abstract ۥ۟۟ۢۧ(I)Z
.end method

.method public abstract ۥۣ۟۟۠(I)V
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param
.end method

.method public abstract ۥۣ۟۟ۡ(Landroid/view/View;)V
.end method

.method public abstract ۥۣ۟۟ۢ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract ۥۣ۟۟ۤ(Z)V
.end method

.method public abstract ۥۣ۟۟ۦ(I)V
.end method

.method public ۥۣ۟۟ۧ(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 0
    .param p1    # Landroid/window/OnBackInvokedDispatcher;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x21
    .end annotation

    return-void
.end method

.method public abstract ۥۣ۟۟ۨ(Landroidx/appcompat/widget/Toolbar;)V
    .param p1    # Landroidx/appcompat/widget/Toolbar;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
.end method

.method public ۥ۟۟ۤ(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param

    return-void
.end method

.method public abstract ۥ۟۟ۤ۟(Ljava/lang/CharSequence;)V
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟ۤ۠(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
    .param p1    # LYue/ۥ۟۟ۧ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method
