.class public final L۟/z7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/z7$e;,
        L۟/z7$b;,
        L۟/z7$c;,
        L۟/z7$f;,
        L۟/z7$d;
    }
.end annotation


# static fields
.field public static final ۥ۠:L۟/z7$a;

.field public static volatile ۥ۠۟:L۟/z7;


# instance fields
.field public final ۥ:L۟/z7$f;

.field public final ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/y8;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Landroid/content/Context;

.field public final ۥ۟۠:L۟/s1;

.field public final ۥ۟ۡ:L۟/e0;

.field public final ۥ۟ۢ:L۟/fa;

.field public final ۥۣ۟:Ljava/util/WeakHashMap;

.field public final ۥ۟ۤ:Ljava/util/WeakHashMap;

.field public final ۥ۟ۥ:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟ۦ:Landroid/graphics/Bitmap$Config;

.field public ۥ۟ۧ:Z

.field public volatile ۥ۟ۨ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, L۟/z7$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, L۟/z7$a;-><init>(Landroid/os/Looper;)V

    sput-object v0, L۟/z7;->ۥ۠:L۟/z7$a;

    const/4 v0, 0x0

    sput-object v0, L۟/z7;->ۥ۠۟:L۟/z7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;L۟/s1;L۟/e0;L۟/z7$f;L۟/fa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/z7;->ۥ۟۟:Landroid/content/Context;

    iput-object p2, p0, L۟/z7;->ۥ۟۠:L۟/s1;

    iput-object p3, p0, L۟/z7;->ۥ۟ۡ:L۟/e0;

    const/4 p3, 0x0

    iput-object p4, p0, L۟/z7;->ۥ:L۟/z7$f;

    iput-object p3, p0, L۟/z7;->ۥ۟ۦ:Landroid/graphics/Bitmap$Config;

    new-instance p3, Ljava/util/ArrayList;

    const/4 p4, 0x7

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance p4, L۟/z8;

    invoke-direct {p4, p1}, L۟/z8;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, L۟/q0;

    invoke-direct {p4, p1}, L۟/q0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, L۟/s5;

    invoke-direct {p4, p1}, L۟/s5;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, L۟/r0;

    invoke-direct {p4, p1}, L۟/r0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, L۟/v;

    invoke-direct {p4, p1}, L۟/v;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, L۟/u2;

    invoke-direct {p4, p1}, L۟/u2;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, L۟/v6;

    iget-object p2, p2, L۟/s1;->ۥ۟۟:L۟/x1;

    invoke-direct {p1, p2, p5}, L۟/v6;-><init>(L۟/x1;L۟/fa;)V

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L۟/z7;->ۥ۟:Ljava/util/List;

    iput-object p5, p0, L۟/z7;->ۥ۟ۢ:L۟/fa;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, L۟/z7;->ۥۣ۟:Ljava/util/WeakHashMap;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, L۟/z7;->ۥ۟ۤ:Ljava/util/WeakHashMap;

    const/4 p1, 0x0

    iput-boolean p1, p0, L۟/z7;->ۥ۟ۧ:Z

    iput-boolean p1, p0, L۟/z7;->ۥ۟ۨ:Z

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, L۟/z7;->ۥ۟ۥ:Ljava/lang/ref/ReferenceQueue;

    new-instance p2, L۟/z7$c;

    sget-object p3, L۟/z7;->ۥ۠:L۟/z7$a;

    invoke-direct {p2, p1, p3}, L۟/z7$c;-><init>(Ljava/lang/ref/ReferenceQueue;L۟/z7$a;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ۥ۟۠(L۟/z7;)V
    .locals 2

    const-class v0, L۟/z7;

    monitor-enter v0

    :try_start_0
    sget-object v1, L۟/z7;->ۥ۠۟:L۟/z7;

    if-nez v1, :cond_0

    sput-object p0, L۟/z7;->ۥ۠۟:L۟/z7;

    monitor-exit v0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Singleton instance already exists."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ۥ(Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_4

    .line 21
    .line 22
    iget-object v0, p0, L۟/z7;->ۥۣ۟:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, L۟/f;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, L۟/f;->ۥ()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, L۟/z7;->ۥ۟۠:L۟/s1;

    .line 36
    .line 37
    iget-object v1, v1, L۟/s1;->ۥ۟ۤ:L۟/s1$a;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    check-cast p1, Landroid/widget/ImageView;

    .line 52
    .line 53
    iget-object v0, p0, L۟/z7;->ۥ۟ۤ:Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, L۟/i1;

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_3
    :goto_1
    return-void

    .line 70
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v0, "Method call should happen from the main thread."

    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public final ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;L۟/f;)V
    .locals 2

    .line 1
    iget-boolean v0, p3, L۟/f;->ۥ۟ۨ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p3, L۟/f;->ۥ۟ۧ:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, L۟/z7;->ۥۣ۟:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p3}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_1
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p3, p1, p2}, L۟/f;->ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, L۟/z7;->ۥ۟ۨ:Z

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    iget-object p1, p3, L۟/f;->ۥ۟:L۟/w8;

    .line 31
    .line 32
    invoke-virtual {p1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 40
    .line 41
    const-string p2, "LoadedFrom cannot be null."

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_3
    invoke-virtual {p3}, L۟/f;->ۥ۟۟()V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, p0, L۟/z7;->ۥ۟ۨ:Z

    .line 51
    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object p1, p3, L۟/f;->ۥ۟:L۟/w8;

    .line 55
    .line 56
    invoke-virtual {p1}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :goto_0
    sget-object p1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method public final ۥ۟۟(L۟/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, L۟/z7;->ۥۣ۟:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v1, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, L۟/z7;->ۥ(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L۟/z7;->ۥۣ۟:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-virtual {v1, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, L۟/z7;->ۥ۟۠:L۟/s1;

    .line 24
    .line 25
    iget-object v0, v0, L۟/s1;->ۥ۟ۤ:L۟/s1$a;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method
