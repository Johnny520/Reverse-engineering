.class public final Lxhss/ᛴᛳᛸᲇ;
.super Lxhss/ᲈᲁᛳᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


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
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    sget p0, Lxhss/ᛲᛷᛲᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    sget-object p0, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;->Companion:Lxhss/ᛵᛶᛲᲈ;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance p0, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;

    .line 9
    .line 10
    invoke-direct {p0}, Lxhss/ᛲᛷᛲᲀ$ᛷᛵᛵᲈ;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance v0, Lxhss/ᛲᛷᛲᲀ;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/app/Fragment;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0, p1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
