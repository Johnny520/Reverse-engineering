.class public Landroidx/emoji2/text/ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۟۠ۧۦ;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۟;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ;,
        Landroidx/emoji2/text/ۥ۟۟$ۥۣ۟۟۟;,
        Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۦ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠:Ljava/lang/String; = "android.support.text.emoji.emojiCompat_metadataVersion"

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "android.support.text.emoji.emojiCompat_replaceAll"

.field public static final ۥ۟۟۠۠:I = 0x3

.field public static final ۥ۟۟۠ۡ:I = 0x0

.field public static final ۥ۟۟۠ۢ:I = 0x1

.field public static final ۥۣ۟۟۠:I = 0x2

.field public static final ۥ۟۟۠ۤ:I = 0x0

.field public static final ۥ۟۟۠ۥ:I = 0x1

.field public static final ۥ۟۟۠ۦ:I = 0x2

.field public static final ۥ۟۟۠ۧ:I = 0x0

.field public static final ۥ۟۟۠ۨ:I = 0x1

.field public static final ۥ۟۟ۡ:I = 0x0

.field public static final ۥ۟۟ۡ۟:I = 0x1

.field public static final ۥ۟۟ۡ۠:I = 0x2

.field public static final ۥ۟۟ۡۡ:I = 0x7fffffff
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟ۡۢ:Ljava/lang/Object;

.field public static final ۥۣ۟۟ۡ:Ljava/lang/Object;

.field public static volatile ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟; = null
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "INSTANCE_LOCK"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public static volatile ۥ۟۟ۡۥ:Z = false
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "CONFIG_LOCK"
    .end annotation
.end field

.field public static final ۥ۟۟ۡۦ:Ljava/lang/String; = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."


# instance fields
.field public final ۥ:Ljava/util/concurrent/locks/ReadWriteLock;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/Set;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mInitLock"
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public volatile ۥ۟۟:I
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mInitLock"
    .end annotation
.end field

.field public final ۥ۟۟۟:Landroid/os/Handler;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:Z

.field public final ۥۣ۟۟۟:Z

.field public final ۥ۟۟۟ۤ:[I
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟ۥ:Z

.field public final ۥ۟۟۟ۦ:I

.field public final ۥ۟۟۟ۧ:I

.field public final ۥ۟۟۟ۨ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)V
    .locals 2
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    const/4 v0, 0x3

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    iget-boolean v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟:Z

    iput-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۢ:Z

    iget-boolean v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟:Z

    iput-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟۟:Z

    iget-object v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟:[I

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۤ:[I

    iget-boolean v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۡ:Z

    iput-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۥ:Z

    iget v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۢ:I

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۦ:I

    iget-object v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۠:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    iget v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥۣ۟۟۟:I

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۧ:I

    iget-object v0, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟ۤ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۨ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟:Landroid/os/Handler;

    new-instance v0, LYue/ۥ۟ۡۨۦ;

    invoke-direct {v0}, LYue/ۥ۟ۡۨۦ;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    iget-object v1, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۟;

    invoke-direct {v1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۟;-><init>()V

    :goto_0
    iput-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۡ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    iget-object v1, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    new-instance p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;

    invoke-direct {p1, p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;-><init>(Landroidx/emoji2/text/ۥ۟۟;)V

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۤ()V

    return-void
.end method

.method public static synthetic ۥ(Landroidx/emoji2/text/ۥ۟۟;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;
    .locals 0

    iget-object p0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۡ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    return-object p0
.end method

.method public static synthetic ۥ۟(Landroidx/emoji2/text/ۥ۟۟;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;
    .locals 0

    iget-object p0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۨ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    return-object p0
.end method

.method public static ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    invoke-static {v2, v3}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z
    .locals 0
    .param p0    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/text/Editable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟۠(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 0
    .param p0    # Landroid/text/Editable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/KeyEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟ۡ(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/content/Context;)Landroidx/emoji2/text/ۥ۟۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠(Landroid/content/Context;Landroidx/emoji2/text/ۥ$ۥ;)Landroidx/emoji2/text/ۥ۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠(Landroid/content/Context;Landroidx/emoji2/text/ۥ$ۥ;)Landroidx/emoji2/text/ۥ۟۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroidx/emoji2/text/ۥ$ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۥ:Z

    if-eqz v0, :cond_0

    sget-object p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/emoji2/text/ۥ$ۥ;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Landroidx/emoji2/text/ۥ$ۥ;-><init>(Landroidx/emoji2/text/ۥ$ۥ۟;)V

    :goto_0
    invoke-virtual {p1, p0}, Landroidx/emoji2/text/ۥ$ۥ;->ۥ۟۟(Landroid/content/Context;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;

    move-result-object p0

    sget-object p1, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-boolean v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۥ:Z

    if-nez v0, :cond_3

    if-eqz p0, :cond_2

    invoke-static {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)Landroidx/emoji2/text/ۥ۟۟;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p0, 0x1

    sput-boolean p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۥ:Z

    :cond_3
    sget-object p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    monitor-exit p1

    return-object p0

    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۠۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)Landroidx/emoji2/text/ۥ۟۟;
    .locals 2
    .param p0    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    if-nez v0, :cond_1

    sget-object v1, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟;

    invoke-direct {v0, p0}, Landroidx/emoji2/text/ۥ۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)V

    sput-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    return-object v0
.end method

.method public static ۥ۟۟۠۠()Z
    .locals 1

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static ۥ۟۟ۡۡ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)Landroidx/emoji2/text/ۥ۟۟;
    .locals 2
    .param p0    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroidx/emoji2/text/ۥ۟۟;

    invoke-direct {v1, p0}, Landroidx/emoji2/text/ۥ۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)V

    sput-object v1, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟ۡۢ(Landroidx/emoji2/text/ۥ۟۟;)Landroidx/emoji2/text/ۥ۟۟;
    .locals 1
    .param p0    # Landroidx/emoji2/text/ۥ۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    sget-object p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۤ:Landroidx/emoji2/text/ۥ۟۟;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥۣ۟۟ۡ(Z)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-object v0, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-boolean p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡۥ:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    const-string v1, "Not initialized yet"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/CharSequence;I)I
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    const-string v1, "Not initialized yet"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    const-string v0, "sequence cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1
    .annotation build LYue/ۥ۟ۥۢۧ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۦ:I

    return v0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥۣ۟۟۟()I
    .locals 2

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/CharSequence;)Z
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    const-string v1, "Not initialized yet"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    const-string v0, "sequence cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/CharSequence;I)Z
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    const-string v1, "Not initialized yet"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    const-string v0, "sequence cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۠ۢ()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟۟()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥۣ۟۟۠()V
    .locals 3

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۧ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v0, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    invoke-static {v2, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_2
    :try_start_1
    iput v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟ۡ()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final ۥ۟۟۠ۤ()V
    .locals 2

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۧ:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟۟()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟ۡ()V

    :cond_1
    return-void

    :goto_1
    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public ۥ۟۟۠ۥ(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x2

    :try_start_0
    iput v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟:Landroid/os/Handler;

    new-instance v2, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;

    iget v3, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    invoke-direct {v2, v0, v3, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;-><init>(Ljava/util/Collection;ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟۠ۦ()V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    iput v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟:Landroid/os/Handler;

    new-instance v2, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;

    iget v3, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    invoke-direct {v2, v0, v3}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;-><init>(Ljava/util/Collection;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public ۥ۟۟۠ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟ۤۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۨ(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۟ۤۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const v0, 0x7fffffff

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡ(Ljava/lang/CharSequence;III)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ(Ljava/lang/CharSequence;III)Ljava/lang/CharSequence;
    .locals 6
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۟ۤۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡ۟(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;
    .locals 7
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۟ۤۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    const-string v1, "Not initialized yet"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    const-string v0, "start cannot be negative"

    invoke-static {p2, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۤ(ILjava/lang/String;)I

    const-string v0, "end cannot be negative"

    invoke-static {p3, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۤ(ILjava/lang/String;)I

    const-string v0, "maxEmojiCount cannot be negative"

    invoke-static {p4, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۤ(ILjava/lang/String;)I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gt p2, p3, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "start should be <= than end"

    invoke-static {v2, v3}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-gt p2, v2, :cond_2

    move v2, v1

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    const-string v3, "start should be < than charSequence length"

    invoke-static {v2, v3}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-gt p3, v2, :cond_3

    move v2, v1

    goto :goto_2

    :cond_3
    move v2, v0

    :goto_2
    const-string v3, "end should be < than charSequence length"

    invoke-static {v2, v3}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz v2, :cond_7

    if-ne p2, p3, :cond_4

    goto :goto_4

    :cond_4
    if-eq p5, v1, :cond_6

    const/4 v1, 0x2

    if-eq p5, v1, :cond_5

    iget-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۢ:Z

    :cond_5
    move v6, v0

    goto :goto_3

    :cond_6
    move v6, v1

    :goto_3
    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ۟۟۟ۢ(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_7
    :goto_4
    return-object p1
.end method

.method public ۥ۟۟ۡ۠(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;)V
    .locals 3
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "initCallback cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟:Landroid/os/Handler;

    new-instance v1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;

    iget v2, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟:I

    invoke-direct {v1, p1, v2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_2
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟ۡۤ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "initCallback cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟ۡۥ(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۢ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    :cond_1
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥۣ۟۟۟(Landroid/view/inputmethod/EditorInfo;)V

    :cond_2
    :goto_0
    return-void
.end method
