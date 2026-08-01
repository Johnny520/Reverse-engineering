.class public final LC/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/O;
.implements LL/f;
.implements LV/p;
.implements Landroidx/emoji2/text/j;
.implements Lu/b;
.implements Li/G0;
.implements Lh/y;
.implements Lh/k;
.implements Li/n;
.implements Ly0/e;
.implements Ly/d;
.implements Ly/f;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 11

    const/16 v0, 0x14

    iput v0, p0, LC/j;->b:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 5
    new-instance v0, Lk0/a;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, Lk0/a;->a:Landroid/os/Handler;

    .line 8
    iput-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 9
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 10
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 11
    sget v4, Lk0/b;->a:I

    .line 12
    sget v5, Lk0/b;->b:I

    .line 13
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x80

    invoke-direct {v9, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 14
    sget-object v10, Lk0/b;->c:Lj/b;

    const-wide/16 v6, 0x1e

    .line 15
    invoke-direct/range {v3 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LC/j;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LC/j;->b:I

    iput-object p2, p0, LC/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, LC/j;->b:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-static {p1, p2}, Ly/c;->c(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LC/j;->b:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LC/j;->b:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 42
    new-instance v0, LC/g;

    invoke-direct {v0, p1, p2, p3}, LC/g;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, LC/j;->c:Ljava/lang/Object;

    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, LC/h;

    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, v0, LC/h;->b:Ljava/lang/Object;

    .line 46
    iput-object p2, v0, LC/h;->d:Ljava/lang/Object;

    .line 47
    iput-object p3, v0, LC/h;->c:Ljava/lang/Object;

    .line 48
    iput-object v0, p0, LC/j;->c:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, LC/j;->b:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-static {p1}, Ly/c;->e(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 6

    const/4 v0, 0x3

    iput v0, p0, LC/j;->b:I

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v1, LH/a;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, v1, LH/a;->b:Ljava/lang/Object;

    .line 24
    new-instance v2, LH/j;

    invoke-direct {v2, p1}, LH/j;-><init>(Landroid/widget/EditText;)V

    iput-object v2, v1, LH/a;->c:Ljava/lang/Object;

    .line 25
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 26
    sget-object v2, LH/b;->b:LH/b;

    if-nez v2, :cond_1

    .line 27
    sget-object v2, LH/b;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 28
    :try_start_0
    sget-object v3, LH/b;->b:LH/b;

    if-nez v3, :cond_0

    .line 29
    new-instance v3, LH/b;

    .line 30
    invoke-direct {v3}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    const-string v4, "android.text.DynamicLayout$ChangeWatcher"

    .line 32
    const-class v5, LH/b;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-static {v4, v0, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LH/b;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :catchall_0
    :try_start_2
    sput-object v3, LH/b;->b:LH/b;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v2

    goto :goto_2

    :goto_1
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 35
    :cond_1
    :goto_2
    sget-object v0, LH/b;->b:LH/b;

    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 37
    iput-object v1, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LC/j;->b:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, LH/h;

    invoke-direct {v0, p1}, LH/h;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([LJ/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LC/j;->b:I

    const-string v0, "initializers"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, LC/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ly/c;->h(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Lh/m;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lh/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lh/F;

    .line 7
    .line 8
    iget-object v0, v0, Lh/F;->z:Lh/m;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/m;->k()Lh/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lh/m;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Li/k;

    .line 21
    .line 22
    iget-object v0, v0, Li/k;->f:Lh/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lh/y;->b(Lh/m;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public c(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ly/c;->g(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Ly/c;->i(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public f(Lh/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Lh/m;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->z:Li/n;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    check-cast p1, LC/j;

    .line 10
    .line 11
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->H:LH/a;

    .line 16
    .line 17
    iget-object p1, p1, LH/a;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/lang/ClassCastException;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public h(Ljava/lang/Class;LJ/c;)Landroidx/lifecycle/L;
    .locals 4

    .line 1
    iget-object p2, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, [LJ/d;

    .line 4
    .line 5
    array-length v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    aget-object v3, p2, v2

    .line 11
    .line 12
    iget-object v3, v3, LJ/d;->a:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v1, Landroidx/lifecycle/I;

    .line 21
    .line 22
    invoke-direct {v1}, Landroidx/lifecycle/I;-><init>()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-eqz v1, :cond_2

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "No initializer set for given class "

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p2
.end method

.method public i()Landroid/content/ClipData;
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Ly/c;->b(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv0/d;

    .line 4
    .line 5
    iget-object v1, v0, Lv0/d;->f:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v0, p1}, Le/w;->setTitle(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void
.end method

.method public k()Ly/g;
    .locals 3

    .line 1
    new-instance v0, Ly/g;

    .line 2
    .line 3
    new-instance v1, LC/j;

    .line 4
    .line 5
    iget-object v2, p0, LC/j;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {v2}, Ly/c;->d(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, LC/j;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ly/g;-><init>(Ly/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public l(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, LC/j;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public m(Lh/m;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/k;

    .line 4
    .line 5
    iget-object v1, v0, Li/k;->d:Lh/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lh/F;

    .line 13
    .line 14
    iget-object v1, v1, Lh/F;->A:Lh/o;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Li/k;->f:Lh/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lh/y;->m(Lh/m;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    return v2
.end method

.method public n()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LC/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "\' with no args"

    .line 7
    .line 8
    const-string v1, "Failed to invoke constructor \'"

    .line 9
    .line 10
    iget-object v2, p0, LC/j;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object v0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    sget-object v1, LY/c;->a:LD/h;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/RuntimeException;

    .line 24
    .line 25
    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :catch_1
    move-exception v3

    .line 32
    new-instance v4, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, LY/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :catch_2
    move-exception v3

    .line 62
    new-instance v4, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, LY/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v4

    .line 87
    :pswitch_0
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Class;

    .line 90
    .line 91
    :try_start_1
    sget-object v1, LV/u;->a:LV/u;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, LV/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 97
    return-object v0

    .line 98
    :catch_3
    move-exception v1

    .line 99
    new-instance v2, Ljava/lang/RuntimeException;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "Unable to create instance of "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 112
    .line 113
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    throw v2

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public o()V
    .locals 1

    .line 1
    iget v0, p0, LC/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/K;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/K;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/animation/Animator;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Ly/c;->a(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public q(LD/h;)V
    .locals 8

    .line 1
    new-instance v7, Landroidx/emoji2/text/a;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, Landroidx/emoji2/text/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 13
    .line 14
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, LA0/r;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {v1, p0, p1, v0, v2}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    const-string v0, "ProfileInstaller"

    .line 2
    .line 3
    const-string v1, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s(Lh/m;Lh/o;)V
    .locals 7

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/g;

    .line 4
    .line 5
    iget-object v1, v0, Lh/g;->g:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lh/g;->i:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lh/f;

    .line 26
    .line 27
    iget-object v6, v6, Lh/f;->b:Lh/m;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Lh/f;

    .line 53
    .line 54
    :cond_3
    new-instance v1, Lh/e;

    .line 55
    .line 56
    invoke-direct {v1, p0, v2, p2, p1}, Lh/e;-><init>(LC/j;Lh/f;Lh/o;Lh/m;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    const-wide/16 v4, 0xc8

    .line 64
    .line 65
    add-long/2addr v2, v4

    .line 66
    iget-object p2, v0, Lh/g;->g:Landroid/os/Handler;

    .line 67
    .line 68
    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public t()Landroid/view/ContentInfo;
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LC/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ContentInfoCompat{"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LC/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroid/view/ContentInfo;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "}"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lh/m;Lh/o;)V
    .locals 0

    .line 1
    iget-object p2, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lh/g;

    .line 4
    .line 5
    iget-object p2, p2, Lh/g;->g:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public v(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ly/c;->f(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w()LD0/c;
    .locals 8

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD0/b;

    .line 4
    .line 5
    new-instance v1, LD0/c;

    .line 6
    .line 7
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    new-array v3, v3, [B

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    iput v4, v1, LD0/c;->a:I

    .line 20
    .line 21
    iput-object v2, v1, LD0/c;->b:Ljava/util/Map;

    .line 22
    .line 23
    iput-object v3, v1, LD0/c;->c:[B

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, v1, LD0/c;->d:Ljava/lang/Throwable;

    .line 27
    .line 28
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 29
    .line 30
    iget-object v4, v0, LD0/b;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 40
    .line 41
    invoke-static {v3, v4}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 45
    .line 46
    :try_start_1
    iget-object v4, v0, LD0/b;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget v4, v0, LD0/b;->e:I

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 54
    .line 55
    .line 56
    iget v4, v0, LD0/b;->f:I

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v0, LD0/b;->c:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_0

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v3, v6, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object v4, v2

    .line 101
    move-object v2, v3

    .line 102
    move-object v3, v4

    .line 103
    goto :goto_4

    .line 104
    :cond_0
    iget-object v0, v0, LD0/b;->d:[B

    .line 105
    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 113
    .line 114
    .line 115
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    :try_start_2
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    move-object v7, v3

    .line 125
    move-object v3, v2

    .line 126
    move-object v2, v7

    .line 127
    goto :goto_4

    .line 128
    :cond_1
    move-object v4, v2

    .line 129
    :goto_1
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iput v0, v1, LD0/c;->a:I

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v5, "<set-?>"

    .line 140
    .line 141
    invoke-static {v0, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, v1, LD0/c;->b:Ljava/util/Map;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v2}, LD/h;->N(Ljava/io/InputStream;)[B

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, v1, LD0/c;->c:[B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    .line 159
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 160
    .line 161
    .line 162
    if-eqz v4, :cond_2

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :catch_0
    move-exception v0

    .line 169
    goto :goto_3

    .line 170
    :cond_2
    :goto_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :goto_3
    iput-object v0, v1, LD0/c;->d:Ljava/lang/Throwable;

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :catchall_2
    move-exception v0

    .line 178
    move-object v3, v2

    .line 179
    move-object v4, v3

    .line 180
    :goto_4
    :try_start_4
    iput-object v0, v1, LD0/c;->d:Ljava/lang/Throwable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 181
    .line 182
    if-eqz v2, :cond_3

    .line 183
    .line 184
    :try_start_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 185
    .line 186
    .line 187
    :cond_3
    if-eqz v4, :cond_4

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 190
    .line 191
    .line 192
    :cond_4
    if-eqz v3, :cond_5

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 195
    .line 196
    .line 197
    :cond_5
    :goto_5
    return-object v1

    .line 198
    :catchall_3
    move-exception v0

    .line 199
    if-eqz v2, :cond_6

    .line 200
    .line 201
    :try_start_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :catch_1
    move-exception v2

    .line 206
    goto :goto_7

    .line 207
    :cond_6
    :goto_6
    if-eqz v4, :cond_7

    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 210
    .line 211
    .line 212
    :cond_7
    if-eqz v3, :cond_8

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 215
    .line 216
    .line 217
    goto :goto_8

    .line 218
    :goto_7
    iput-object v2, v1, LD0/c;->d:Ljava/lang/Throwable;

    .line 219
    .line 220
    :cond_8
    :goto_8
    throw v0
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, LC/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/o;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/z;->J()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
