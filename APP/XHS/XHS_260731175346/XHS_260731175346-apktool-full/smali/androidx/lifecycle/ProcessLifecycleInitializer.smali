.class public final Landroidx/lifecycle/ProcessLifecycleInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛶᛲᛵᲁ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxhss/\u16f6\u16f2\u16f5\u1c81;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lxhss/ᛷᛱᛳᲁ;->ᛷᲁᲁ(Landroid/content/Context;)Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/HashSet;

    .line 8
    .line 9
    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lxhss/ᛱᛱᛷᲇ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Landroid/app/Application;

    .line 32
    .line 33
    new-instance v0, Lxhss/ᛴᛳᛸᲇ;

    .line 34
    .line 35
    invoke-direct {v0}, Lxhss/ᛴᛳᛸᲇ;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p0, Lxhss/ᛷᛸᛴᛵ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛸᛴᛵ;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛴᛷᛱ:Landroid/os/Handler;

    .line 52
    .line 53
    iget-object v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 54
    .line 55
    sget-object v1, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Landroid/app/Application;

    .line 65
    .line 66
    new-instance v0, Lxhss/ᛷᛸᛸᲀ;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lxhss/ᛷᛸᛸᲀ;-><init>(Lxhss/ᛷᛸᛴᛵ;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const-string p0, "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml"

    .line 76
    .line 77
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 2
    .line 3
    return-object p0
.end method
