.class public final LYue/ۥۡۦۦۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۦۢ$ۥ۟۟۟ۡ;,
        LYue/ۥۡۦۦۢ$ۥ۟۟۟۟;,
        LYue/ۥۡۦۦۢ$ۥ۟;,
        LYue/ۥۡۦۦۢ$ۥ;,
        LYue/ۥۡۦۦۢ$ۥ۟۟۟;,
        LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;,
        LYue/ۥۡۦۦۢ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "ResourceManagerInternal"

.field public static final ۥۣ۟۟۟:Z = false

.field public static final ۥ۟۟۟ۤ:Landroid/graphics/PorterDuff$Mode;

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "appcompat_skip_skip"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "android.graphics.drawable.VectorDrawable"

.field public static ۥ۟۟۟ۧ:LYue/ۥۡۦۦۢ;

.field public static final ۥ۟۟۟ۨ:LYue/ۥۡۦۦۢ$ۥ۟۟;


# instance fields
.field public ۥ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/content/Context;",
            "LYue/\u06e5\u06e2\u06df\u06e6\u06e0<",
            "Landroid/content/res/ColorStateList;",
            ">;>;"
        }
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06e2$\u06e5\u06df\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥۢ۟ۦ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e6\u06e0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/content/Context;",
            "LYue/\u06e5\u06e0\u06e8\u06e3\u06e2<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Landroid/util/TypedValue;

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۤ:Landroid/graphics/PorterDuff$Mode;

    new-instance v0, LYue/ۥۡۦۦۢ$ۥ۟۟;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, LYue/ۥۡۦۦۢ$ۥ۟۟;-><init>(I)V

    sput-object v0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۨ:LYue/ۥۡۦۦۢ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/util/TypedValue;)J
    .locals 4

    iget v0, p0, Landroid/util/TypedValue;->assetCookie:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget p0, p0, Landroid/util/TypedValue;->data:I

    int-to-long v2, p0

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;[I)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    invoke-static {p0, p1}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۦ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static declared-synchronized ۥ۟۟۟ۢ()LYue/ۥۡۦۦۢ;
    .locals 2

    const-class v0, LYue/ۥۡۦۦۢ;

    monitor-enter v0

    :try_start_0
    sget-object v1, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۧ:LYue/ۥۡۦۦۢ;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۡۦۦۢ;

    invoke-direct {v1}, LYue/ۥۡۦۦۢ;-><init>()V

    sput-object v1, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۧ:LYue/ۥۡۦۦۢ;

    invoke-static {v1}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠۟(LYue/ۥۡۦۦۢ;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۧ:LYue/ۥۡۦۦۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ۥ۟۟۟ۦ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 3

    const-class v0, LYue/ۥۡۦۦۢ;

    monitor-enter v0

    :try_start_0
    sget-object v1, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۨ:LYue/ۥۡۦۦۢ$ۥ۟۟;

    invoke-virtual {v1, p0, p1}, LYue/ۥۡۦۦۢ$ۥ۟۟;->ۥۣ۟۟۠(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, p0, p1, v2}, LYue/ۥۡۦۦۢ$ۥ۟۟;->ۥ۟۟۠ۤ(ILandroid/graphics/PorterDuff$Mode;Landroid/graphics/PorterDuffColorFilter;)Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۠۟(LYue/ۥۡۦۦۢ;)V
    .locals 0
    .param p0    # LYue/ۥۡۦۦۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p0, LYue/ۥۣۢۥۣ;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "android.graphics.drawable.VectorDrawable"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static ۥ۟۟۠ۦ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;[I)V
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v1, p0, :cond_5

    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    iget-boolean v0, p1, LYue/ۥۢۡۥۤ;->ۥ۟۟۟:Z

    if-nez v0, :cond_2

    iget-boolean v1, p1, LYue/ۥۢۡۥۤ;->ۥ۟۟:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    goto :goto_3

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p1, LYue/ۥۢۡۥۤ;->ۥ:Landroid/content/res/ColorStateList;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-boolean v1, p1, LYue/ۥۢۡۥۤ;->ۥ۟۟:Z

    if-eqz v1, :cond_4

    iget-object p1, p1, LYue/ۥۢۡۥۤ;->ۥ۟:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    :cond_4
    sget-object p1, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۤ:Landroid/graphics/PorterDuff$Mode;

    :goto_2
    invoke-static {v0, p1, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;[I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :goto_3
    return-void

    :cond_5
    const-string p0, "ResourceManagerInternal"

    const-string p1, "Mutated drawable is not the same instance as the input."

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;LYue/ۥۡۦۦۢ$ۥ۟۟۟۟;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۦۢ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final declared-synchronized ۥ۟(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p4

    if-eqz p4, :cond_1

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۠ۨۢ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۣ۠ۨۢ;

    invoke-direct {v0}, LYue/ۥۣ۠ۨۢ;-><init>()V

    iget-object v1, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2, p3, p1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠۠(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ:Ljava/util/WeakHashMap;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟ۦ۠;

    if-nez v0, :cond_1

    new-instance v0, LYue/ۥۢ۟ۦ۠;

    invoke-direct {v0}, LYue/ۥۢ۟ۦ۠;-><init>()V

    iget-object v1, p0, LYue/ۥۡۦۦۢ;->ۥ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0, p2, p3}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟۟(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۠:Z

    sget v0, LYue/ۥۡۥۧۢ$ۥ;->ۥ:I

    invoke-virtual {p0, p1, v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۤ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠۠(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۠:Z

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟۠(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    invoke-static {v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟(Landroid/util/TypedValue;)J

    move-result-wide v1

    invoke-virtual {p0, p1, v1, v2}, LYue/ۥۡۦۦۢ;->ۥۣ۟۟۟(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    iget-object v3, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;

    if-nez v3, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {v3, p0, p1, p2}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۟۟(LYue/ۥۡۦۦۢ;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_3

    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    invoke-virtual {p0, p1, v1, v2, p2}, LYue/ۥۡۦۦۢ;->ۥ۟(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z

    :cond_3
    return-object p2
.end method

.method public final declared-synchronized ۥۣ۟۟۟(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۠ۨۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    invoke-virtual {v0, p2, p3}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۤ(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-virtual {v0, p2, p3}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠ۤ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    monitor-exit p0

    return-object v1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟۟ۤ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۥ(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟۟ۥ(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠ۡ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۠(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    invoke-static {p1, p2}, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۟ۦ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠ۥ(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-static {v0}, LYue/ۥ۠۠ۡۥ;->ۥ۟(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟۟ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۨ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1, p2}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟(Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۟ۨ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ:Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۢ۟ۦ۠;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟ۤ(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/content/res/ColorStateList;

    :cond_0
    return-object v1
.end method

.method public ۥ۟۟۠(I)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;->ۥ۟(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۠ۡ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟:LYue/ۥۢ۟ۦ۠;

    const-string v2, "appcompat_skip_skip"

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟۟ۤ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v0, :cond_2

    iget-object v3, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v3, v0}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, LYue/ۥۢ۟ۦ۠;

    invoke-direct {v0}, LYue/ۥۢ۟ۦ۠;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟:LYue/ۥۢ۟ۦ۠;

    :cond_2
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    if-nez v0, :cond_3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    :cond_3
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟:Landroid/util/TypedValue;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, p2, v0, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    invoke-static {v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟۟(Landroid/util/TypedValue;)J

    move-result-wide v4

    invoke-virtual {p0, p1, v4, v5}, LYue/ۥۡۦۦۢ;->ۥۣ۟۟۟(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v6, :cond_4

    return-object v6

    :cond_4
    iget-object v7, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v7, :cond_8

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".xml"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    :try_start_0
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_5

    if-eq v8, v3, :cond_5

    goto :goto_0

    :cond_5
    if-ne v8, v9, :cond_7

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v8, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {v8, p2, v3}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟(ILjava/lang/Object;)V

    iget-object v8, p0, LYue/ۥۡۦۦۢ;->ۥ۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v8, v3}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۦۦۢ$ۥ۟۟۟۟;

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-interface {v3, p1, v1, v7, v8}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۟;->ۥ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    if-eqz v6, :cond_8

    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    invoke-virtual {p0, p1, v4, v5, v6}, LYue/ۥۡۦۦۢ;->ۥ۟(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v0, "No start tag found"

    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    const-string v0, "ResourceManagerInternal"

    const-string v1, "Exception while inflating drawable"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    :goto_3
    if-nez v6, :cond_9

    iget-object p1, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟:LYue/ۥۢ۟ۦ۠;

    invoke-virtual {p1, p2, v2}, LYue/ۥۢ۟ۦ۠;->ۥ۟۟(ILjava/lang/Object;)V

    :cond_9
    return-object v6

    :cond_a
    return-object v1
.end method

.method public declared-synchronized ۥ۟۟۠ۢ(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۠ۨۢ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥۣ۟۟۠(Landroid/content/Context;LYue/ۥۣۢۥۤ;I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۢۥۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p3}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠ۡ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p2, p3}, LYue/ۥۡۦۦۨ;->ۥ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p3, p2, v0}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠ۥ(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟۠ۤ(LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۠ۥ(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠۠۠ۥ;->ۥ۟۟۠ۡ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    invoke-static {p4, v0}, LYue/ۥ۠۠۠ۥ;->ۥ۟۟۠(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0, p2}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p4, p1}, LYue/ۥ۠۠۠ۥ;->ۥ۟۟۠۟(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p4}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۟(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p4}, LYue/ۥۡۦۦۢ;->ۥ۟۟۠ۧ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p4, 0x0

    :cond_2
    :goto_0
    return-object p4
.end method

.method public ۥ۟۟۠ۧ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۡۦۦۢ$ۥ۟۟۟۠;->ۥ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
