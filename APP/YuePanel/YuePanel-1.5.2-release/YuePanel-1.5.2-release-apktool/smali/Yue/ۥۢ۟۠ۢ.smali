.class public LYue/ۥۢ۟۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟۠ۢ$ۥ۟;,
        LYue/ۥۢ۟۠ۢ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x1

.field public static final ۥ۟:I = 0x2

.field public static final ۥ۟۟:I = 0x4

.field public static final ۥ۟۟۟:I = 0x8

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "com.android.launcher.action.INSTALL_SHORTCUT"
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "com.android.launcher.permission.INSTALL_SHORTCUT"
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:I = 0x60

.field public static final ۥ۟۟۟ۢ:I = 0x30

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "android.intent.extra.shortcut.ID"

.field public static volatile ۥ۟۟۟ۤ:LYue/ۥۢ۟۠; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e0<",
            "*>;"
        }
    .end annotation
.end field

.field public static volatile ۥ۟۟۟ۥ:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "androidx.core.content.pm.SHORTCUT_LISTENER"

.field public static final ۥ۟۟۟ۧ:Ljava/lang/String; = "androidx.core.content.pm.shortcut_listener_impl"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/Context;Ljava/util/List;)Z
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۦ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-gt v2, v3, :cond_0

    invoke-static {p0, v1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟(Landroid/content/Context;Ljava/util/List;)V

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢ۟۟ۦ;

    invoke-virtual {v4}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-class v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v3, v2}, Landroid/content/pm/ShortcutManager;->addDynamicShortcuts(Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_2
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v2

    invoke-virtual {v2, v1}, LYue/ۥۢ۟۠;->ۥ(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v1, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    return v0
.end method

.method public static ۥ۟(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;)Z
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢ۟۟ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    iget-object v0, p1, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, v0, Landroidx/core/graphics/drawable/IconCompat;->ۥ:I

    const/4 v3, 0x1

    const/4 v4, 0x6

    if-eq v2, v4, :cond_1

    const/4 v5, 0x4

    if-eq v2, v5, :cond_1

    return v3

    :cond_1
    invoke-virtual {v0, p0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۠ۨ(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object p0

    if-nez p0, :cond_2

    return v1

    :cond_2
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-nez p0, :cond_3

    return v1

    :cond_3
    if-ne v2, v4, :cond_4

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۤ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۧ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    :goto_0
    iput-object p0, p1, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return v3
.end method

.method public static ۥ۟۟(Landroid/content/Context;Ljava/util/List;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۦ;

    invoke-static {p0, v1}, LYue/ۥۢ۟۠ۢ;->ۥ۟(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;)Landroid/content/Intent;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢ۟۟ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/pm/ShortcutManager;->createShortcutResultIntent(Landroid/content/pm/ShortcutInfo;)Landroid/content/Intent;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Landroid/content/Intent;

    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢ۟۟ۦ;->ۥ(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/content/Context;Ljava/util/List;Ljava/lang/CharSequence;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/CharSequence;",
            ")V"
        }
    .end annotation

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0, p1, p2}, Landroid/content/pm/ShortcutManager;->disableShortcuts(Ljava/util/List;Ljava/lang/CharSequence;)V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object p2

    invoke-virtual {p2, p1}, LYue/ۥۢ۟۠;->ۥ۟۟۟(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {p2, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟۟(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۦ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢ۟۟ۦ;

    iget-object v3, v3, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-class v2, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v2, v1}, Landroid/content/pm/ShortcutManager;->enableShortcuts(Ljava/util/List;)V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v1

    invoke-virtual {v1, v0}, LYue/ۥۢ۟۠;->ۥ(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟ۡ(Landroid/content/Context;)Ljava/util/List;
    .locals 4
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
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v0

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

    check-cast v2, Landroid/content/pm/ShortcutInfo;

    new-instance v3, LYue/ۥۢ۟۟ۦ$ۥ۟;

    invoke-direct {v3, p0, v2}, LYue/ۥۢ۟۟ۦ$ۥ۟;-><init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V

    invoke-virtual {v3}, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟()LYue/ۥۢ۟۟ۦ;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static ۥ۟۟۟ۢ(Landroid/content/Context;Z)I
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    const/16 v0, 0x30

    goto :goto_2

    :cond_2
    const/16 v0, 0x60

    :goto_2
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    if-eqz p1, :cond_3

    iget p0, p0, Landroid/util/DisplayMetrics;->xdpi:F

    goto :goto_3

    :cond_3
    iget p0, p0, Landroid/util/DisplayMetrics;->ydpi:F

    :goto_3
    const/high16 p1, 0x43200000    # 160.0f

    div-float/2addr p0, p1

    int-to-float p1, v0

    mul-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method public static ۥۣ۟۟۟(Landroid/content/Context;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->getIconMaxHeight()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/content/Context;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->getIconMaxWidth()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/content/Context;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->getMaxShortcutCountPerActivity()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۦ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .param p0    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۟۟ۦ;

    invoke-virtual {v2}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ()I

    move-result v3

    if-le v3, v0, :cond_0

    invoke-virtual {v2}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ()I

    move-result v1

    move v4, v1

    move-object v1, v0

    move v0, v4

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    const-string v3, "androidx.core.content.pm.SHORTCUT_LISTENER"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "androidx.core.content.pm.shortcut_listener_impl"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    const-class v3, LYue/ۥۢ۟۠ۢ;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getInstance"

    const-class v4, Landroid/content/Context;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۟۟ۡ;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    sget-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    if-nez p0, :cond_4

    sput-object v0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    :cond_4
    sget-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-object p0
.end method

.method public static ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "LYue/\u06e5\u06e2\u06df\u06e0<",
            "*>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;

    if-nez v0, :cond_0

    :try_start_0
    const-class v0, LYue/ۥۢ۟۠ۢ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "androidx.sharetarget.ShortcutInfoCompatSaverImpl"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥۢ۟۠;

    sput-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sget-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;

    if-nez p0, :cond_0

    new-instance p0, LYue/ۥۢ۟۠$ۥ;

    invoke-direct {p0}, LYue/ۥۢ۟۠$ۥ;-><init>()V

    sput-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;

    :cond_0
    sget-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;

    return-object p0
.end method

.method public static ۥ۟۟۠۟(Landroid/content/Context;I)Ljava/util/List;
    .locals 3
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
            "I)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const-class v2, Landroid/content/pm/ShortcutManager;

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-static {v0, p1}, LYue/ۥۢ۟۠ۡ;->ۥ(Landroid/content/pm/ShortcutManager;I)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v2, p1, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getManifestShortcuts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    and-int/lit8 v2, p1, 0x2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getPinnedShortcuts()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    invoke-static {p0, v1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۠(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->isRateLimitingActive()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۡ(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->isRequestPinShortcutSupported()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۢ(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;)Z
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢ۟۟ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v2}, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟ۡ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ(Landroid/content/Context;)I

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    return v3

    :cond_2
    const/16 v4, 0x1d

    if-gt v0, v4, :cond_3

    invoke-static {p0, p1}, LYue/ۥۢ۟۠ۢ;->ۥ۟(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;)Z

    :cond_3
    const/16 v4, 0x1e

    const-class v5, Landroid/content/pm/ShortcutManager;

    if-lt v0, v4, :cond_4

    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    invoke-static {v0, v4}, LYue/ۥۢ۟۠۠;->ۥ(Landroid/content/pm/ShortcutManager;Landroid/content/pm/ShortcutInfo;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->isRateLimitingActive()Z

    move-result v4

    if-eqz v4, :cond_5

    return v3

    :cond_5
    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lt v5, v1, :cond_6

    invoke-static {v4}, LYue/ۥۢ۟۠ۢ$ۥ۟;->ۥ(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    :cond_6
    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    filled-new-array {v4}, [Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/pm/ShortcutManager;->addDynamicShortcuts(Ljava/util/List;)Z

    :goto_1
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, LYue/ۥۢ۟۠;->ۥ۟()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lt v5, v1, :cond_7

    invoke-static {v4}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۧ(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۟۠;->ۥ۟۟۟(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_2
    filled-new-array {p1}, [LYue/ۥۢ۟۟ۦ;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۟۠;->ۥ(Ljava/util/List;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۡ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۧ(Landroid/content/Context;Ljava/lang/String;)V

    return v2

    :goto_4
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۟۟ۡ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۧ(Landroid/content/Context;Ljava/lang/String;)V

    throw v0

    :catch_0
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۡ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_6

    :cond_a
    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۧ(Landroid/content/Context;Ljava/lang/String;)V

    return v3
.end method

.method public static ۥۣ۟۟۠(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->removeAllDynamicShortcuts()V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢ۟۠;->ۥ۟۟()Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v0}, LYue/ۥۢ۟۟ۡ;->ۥ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۠ۤ(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۢ۟۠;->ۥ۟۟۟(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟۟(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۠ۥ(Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۤ(Landroid/content/Context;Ljava/util/List;)V

    return-void

    :cond_0
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-static {v0, p1}, LYue/ۥۢ۟۠۟;->ۥ(Landroid/content/pm/ShortcutManager;Ljava/util/List;)V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۢ۟۠;->ۥ۟۟۟(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟۟(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۠ۦ(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;I)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-le v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۦ;

    invoke-virtual {v1, p1}, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟ۡ(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۥ۟۟۠ۧ(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/ShortcutManager;->reportShortcutUsed(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟۟ۡ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۟۟ۡ;->ۥ۟۟۟۟(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۠ۨ(Landroid/content/Context;LYue/ۥۢ۟۟ۦ;Landroid/content/IntentSender;)Z
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢ۟۟ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/IntentSender;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroid/content/pm/ShortcutManager;->requestPinShortcut(Landroid/content/pm/ShortcutInfo;Landroid/content/IntentSender;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۡ(Landroid/content/Context;Ljava/util/List;)Z
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۦ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢ۟۟ۦ;

    invoke-virtual {v4}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-class v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v3, v2}, Landroid/content/pm/ShortcutManager;->setDynamicShortcuts(Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۢ۟۠;->ۥ۟۟()Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v2

    invoke-virtual {v2, v1}, LYue/ۥۢ۟۠;->ۥ(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v1}, LYue/ۥۢ۟۟ۡ;->ۥ()V

    invoke-virtual {v1, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    return v0
.end method

.method public static ۥ۟۟ۡ۟(Ljava/util/List;)V
    .locals 0
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e1;",
            ">;)V"
        }
    .end annotation

    sput-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-void
.end method

.method public static ۥ۟۟ۡ۠(LYue/ۥۢ۟۠;)V
    .locals 0
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e0<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    sput-object p0, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟۠;

    return-void
.end method

.method public static ۥ۟۟ۡۡ(Landroid/content/Context;Ljava/util/List;)Z
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠ۦ(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-gt v2, v3, :cond_0

    invoke-static {p0, v1}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟(Landroid/content/Context;Ljava/util/List;)V

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢ۟۟ۦ;

    invoke-virtual {v4}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-class v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v3, v2}, Landroid/content/pm/ShortcutManager;->updateShortcuts(Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_2
    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۠(Landroid/content/Context;)LYue/ۥۢ۟۠;

    move-result-object v2

    invoke-virtual {v2, v1}, LYue/ۥۢ۟۠;->ۥ(Ljava/util/List;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢ۟۠ۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۟۟ۡ;

    invoke-virtual {v1, p1}, LYue/ۥۢ۟۟ۡ;->ۥ۟۟۟(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    return v0
.end method
