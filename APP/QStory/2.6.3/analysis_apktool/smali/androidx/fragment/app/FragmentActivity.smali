.class public Landroidx/fragment/app/FragmentActivity;
.super Landroidx/activity/ComponentActivity;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

.field final mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;-><init>(Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 15
    .line 16
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 23
    .line 24
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->mStopped:Z

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;->init()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Landroidx/activity/ComponentActivity;-><init>(I)V

    .line 31
    new-instance p1, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    invoke-direct {p1, p0}, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 32
    new-instance v0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    invoke-direct {v0, p1}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;-><init>(Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;)V

    .line 33
    iput-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 34
    new-instance p1, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    const/4 v0, 0x1

    .line 35
    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Z)V

    .line 36
    iput-object p1, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 37
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->mStopped:Z

    .line 38
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;->init()V

    return-void
.end method

.method private init()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    const-string v2, "android:support:lifecycle"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲苏兰;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪兰哲苏世;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子楪兰哲苏世;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnConfigurationChangedListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪兰哲苏世;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子楪兰哲苏世;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnNewIntentListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroidx/fragment/app/飘花落叶言子世楪苏哲兰;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Landroidx/fragment/app/飘花落叶言子世楪苏哲兰;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世哲苏兰;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private synthetic lambda$init$0()Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->markFragmentsCreated()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method private synthetic lambda$init$1(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$init$2(Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private lambda$init$3(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p0, p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲(Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static markState(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;Landroidx/lifecycle/Lifecycle$State;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世哲兰苏楪()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰哲世苏:Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2, p1}, Landroidx/fragment/app/FragmentActivity;->markState(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;Landroidx/lifecycle/Lifecycle$State;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏世楪哲兰:Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v2}, Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 52
    .line 53
    .line 54
    iget-object v2, v2, Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世哲苏:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 55
    .line 56
    iget-object v2, v2, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 57
    .line 58
    sget-object v4, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    iget-object v0, v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏世楪哲兰:Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世哲苏:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroidx/lifecycle/Lifecycle$State;)V

    .line 71
    .line 72
    .line 73
    move v0, v3

    .line 74
    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪兰哲世:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 77
    .line 78
    sget-object v4, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_0

    .line 85
    .line 86
    iget-object v0, v1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪兰哲世:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroidx/lifecycle/Lifecycle$State;)V

    .line 89
    .line 90
    .line 91
    move v0, v3

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return v0
.end method

.method public static synthetic 飘花落叶言子楪哲世兰苏(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentActivity;->lambda$init$3(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲兰世苏(Landroidx/fragment/app/FragmentActivity;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentActivity;->lambda$init$2(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏世兰(Landroidx/fragment/app/FragmentActivity;Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentActivity;->lambda$init$1(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏兰世(Landroidx/fragment/app/FragmentActivity;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;->lambda$init$0()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Landroidx/core/app/ComponentActivity;->shouldDumpInternalState([Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Local FragmentActivity "

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, " State:"

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "  "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "mCreated="

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->mCreated:Z

    .line 61
    .line 62
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 63
    .line 64
    .line 65
    const-string v1, " mResumed="

    .line 66
    .line 67
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->mResumed:Z

    .line 71
    .line 72
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 73
    .line 74
    .line 75
    const-string v1, " mStopped="

    .line 76
    .line 77
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->mStopped:Z

    .line 81
    .line 82
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-interface {p0}, Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;->getViewModelStore()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v2, L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏哲兰;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v3, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 104
    .line 105
    sget-object v4, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世苏兰哲;

    .line 106
    .line 107
    invoke-direct {v3, v1, v4, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;Landroidx/lifecycle/飘花落叶言子苏哲兰楪世;L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;)V

    .line 108
    .line 109
    .line 110
    const-class v1, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;

    .line 111
    .line 112
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v3, v2, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;

    .line 135
    .line 136
    iget-object v1, v1, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世兰楪哲;

    .line 137
    .line 138
    iget v2, v1, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 139
    .line 140
    if-lez v2, :cond_4

    .line 141
    .line 142
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v2, "Loaders:"

    .line 146
    .line 147
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget v2, v1, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 151
    .line 152
    if-gtz v2, :cond_1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_1
    const/4 p0, 0x0

    .line 156
    invoke-virtual {v1, p0}, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世兰苏哲(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_2

    .line 161
    .line 162
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_2
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string p1, "  #"

    .line 170
    .line 171
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, v1, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:[I

    .line 175
    .line 176
    aget p0, p1, p0

    .line 177
    .line 178
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 179
    .line 180
    .line 181
    const-string p0, ": "

    .line 182
    .line 183
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/4 p0, 0x0

    .line 187
    throw p0

    .line 188
    :cond_3
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 189
    .line 190
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_4
    :goto_0
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 195
    .line 196
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 197
    .line 198
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 199
    .line 200
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰苏哲世(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public getSupportFragmentManager()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 6
    .line 7
    return-object p0
.end method

.method public getSupportLoaderManager()L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世苏哲兰;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;->getViewModelStore()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p0, v1}, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/fragment/app/FragmentActivity;->markState(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;Landroidx/lifecycle/Lifecycle$State;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪兰哲:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲楪兰:Z

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰:Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;

    .line 23
    .line 24
    iput-boolean p1, v0, Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-virtual {p0, p1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 14
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentActivity;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 15
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 14
    .line 15
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->mResumed:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 18
    .line 19
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_PAUSE:Landroidx/lifecycle/Lifecycle$Event;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onPostResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->onResumeFragments()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->mResumed:Z

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪苏哲兰(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onResumeFragments()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪兰哲:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲楪兰:Z

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰:Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;

    .line 20
    .line 21
    iput-boolean v0, v1, Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->mStopped:Z

    .line 11
    .line 12
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->mCreated:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iput-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->mCreated:Z

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 24
    .line 25
    iput-boolean v0, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪兰哲:Z

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲楪兰:Z

    .line 28
    .line 29
    iget-object v3, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰:Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;

    .line 30
    .line 31
    iput-boolean v0, v3, Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-virtual {v1, v3}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 40
    .line 41
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪苏哲兰(Z)Z

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 58
    .line 59
    iput-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪兰哲:Z

    .line 60
    .line 61
    iput-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲楪兰:Z

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰:Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;

    .line 64
    .line 65
    iput-boolean v0, v1, Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 66
    .line 67
    const/4 v0, 0x5

    .line 68
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public onStateNotSaved()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->mStopped:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->markFragmentsCreated()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->mFragments:Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 15
    .line 16
    iput-boolean v0, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲楪兰:Z

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰:Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;

    .line 19
    .line 20
    iput-boolean v0, v2, Landroidx/fragment/app/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {v1, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 27
    .line 28
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setEnterSharedElementCallback(L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setEnterSharedElementCallback(Landroid/app/SharedElementCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setExitSharedElementCallback(L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setExitSharedElementCallback(Landroid/app/SharedElementCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/FragmentActivity;->startActivityFromFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p3, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0, p2, v0, p4}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p0, p1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    if-eqz p0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲苏兰:L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    new-instance v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v0, p1, p3}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayDeque;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    if-eqz p4, :cond_1

    .line 33
    .line 34
    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 35
    .line 36
    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲苏兰:L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 46
    .line 47
    if-ne p3, v0, :cond_3

    .line 48
    .line 49
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Landroidx/fragment/app/FragmentActivity;

    .line 50
    .line 51
    invoke-virtual {p0, p2, p4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string p0, "Starting activity with a requestCode requires a FragmentActivity host"

    .line 59
    .line 60
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    const-string p0, "Fragment "

    .line 65
    .line 66
    const-string p2, " not attached to Activity"

    .line 67
    .line 68
    invoke-static {p1, p0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 11
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v8, -0x1

    .line 2
    if-ne p3, v8, :cond_0

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p2

    .line 6
    move v2, p3

    .line 7
    move-object v3, p4

    .line 8
    move/from16 v4, p5

    .line 9
    .line 10
    move/from16 v5, p6

    .line 11
    .line 12
    move/from16 v6, p7

    .line 13
    .line 14
    move-object/from16 v7, p8

    .line 15
    .line 16
    invoke-virtual/range {v0 .. v7}, Landroidx/activity/ComponentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    move-object/from16 v7, p8

    .line 21
    .line 22
    iget-object p0, p1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 23
    .line 24
    const-string v0, "Fragment "

    .line 25
    .line 26
    if-eqz p0, :cond_8

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    invoke-static {p0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "FragmentManager"

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v6, " received the following in startIntentSenderForResult() requestCode: "

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v6, " IntentSender: "

    .line 54
    .line 55
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v6, " fillInIntent: "

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v6, " options: "

    .line 70
    .line 71
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget-object v6, v4, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲兰苏:L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;

    .line 89
    .line 90
    if-eqz v6, :cond_6

    .line 91
    .line 92
    if-eqz v7, :cond_4

    .line 93
    .line 94
    if-nez p4, :cond_2

    .line 95
    .line 96
    new-instance v3, Landroid/content/Intent;

    .line 97
    .line 98
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v6, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 102
    .line 103
    const/4 v8, 0x1

    .line 104
    invoke-virtual {v3, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    move-object v3, p4

    .line 109
    :goto_0
    invoke-static {p0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_3

    .line 114
    .line 115
    new-instance v6, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v8, "ActivityOptions "

    .line 118
    .line 119
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v8, " were added to fillInIntent "

    .line 126
    .line 127
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v8, " for fragment "

    .line 134
    .line 135
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_3
    const-string v6, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 149
    .line 150
    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    move-object v3, p4

    .line 155
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v6, Landroidx/activity/result/IntentSenderRequest;

    .line 159
    .line 160
    move/from16 v9, p5

    .line 161
    .line 162
    move/from16 v10, p6

    .line 163
    .line 164
    invoke-direct {v6, p2, v3, v9, v10}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 165
    .line 166
    .line 167
    new-instance p2, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 168
    .line 169
    iget-object v1, p1, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 170
    .line 171
    invoke-direct {p2, v1, p3}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    iget-object p3, v4, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayDeque;

    .line 175
    .line 176
    invoke-virtual {p3, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-eqz p0, :cond_5

    .line 184
    .line 185
    new-instance p0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string p1, "is launching an IntentSender for result "

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {v5, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    :cond_5
    iget-object p0, v4, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲兰苏:L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;

    .line 206
    .line 207
    invoke-virtual {p0, v6}, L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_6
    move/from16 v9, p5

    .line 212
    .line 213
    move/from16 v10, p6

    .line 214
    .line 215
    iget-object p0, v4, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 216
    .line 217
    if-ne p3, v8, :cond_7

    .line 218
    .line 219
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/fragment/app/FragmentActivity;

    .line 220
    .line 221
    move-object v1, p2

    .line 222
    move v2, p3

    .line 223
    move-object v3, p4

    .line 224
    move/from16 v6, p7

    .line 225
    .line 226
    move v4, v9

    .line 227
    move v5, v10

    .line 228
    invoke-virtual/range {v0 .. v7}, Landroidx/activity/ComponentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const-string p0, "Starting intent sender with a requestCode requires a FragmentActivity host"

    .line 236
    .line 237
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_8
    const-string p0, " not attached to Activity"

    .line 242
    .line 243
    invoke-static {p1, v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public supportFinishAfterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->startPostponedEnterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method
