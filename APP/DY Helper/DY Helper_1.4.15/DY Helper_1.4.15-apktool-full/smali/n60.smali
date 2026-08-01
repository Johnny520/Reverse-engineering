.class public abstract Ln60;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lhr0;
.implements Lr92;
.implements Lsc0;
.implements Lkq1;


# static fields
.field public static final Ψ:Ljava/lang/Object;


# instance fields
.field public Α:Ln60;

.field public Β:I

.field public Γ:I

.field public Δ:Ljava/lang/String;

.field public Ε:Z

.field public Ζ:Z

.field public Η:Z

.field public final Θ:Z

.field public Ι:Z

.field public Κ:Landroid/view/ViewGroup;

.field public Λ:Z

.field public Μ:Z

.field public Ν:Lm60;

.field public Ξ:Z

.field public Ο:Z

.field public Π:Ljava/lang/String;

.field public Ρ:Lcr0;

.field public Σ:Ljr0;

.field public final Τ:Lp11;

.field public Υ:Ln5;

.field public final Φ:Ljava/util/ArrayList;

.field public final Χ:Lk60;

.field public ε:I

.field public ζ:Landroid/os/Bundle;

.field public η:Landroid/util/SparseArray;

.field public θ:Landroid/os/Bundle;

.field public ι:Ljava/lang/String;

.field public κ:Landroid/os/Bundle;

.field public λ:Ln60;

.field public μ:Ljava/lang/String;

.field public ν:I

.field public ξ:Ljava/lang/Boolean;

.field public ο:Z

.field public π:Z

.field public ρ:Z

.field public σ:Z

.field public τ:Z

.field public υ:Z

.field public φ:I

.field public χ:Lb70;

.field public ψ:Lp60;

.field public ω:Lb70;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln60;->Ψ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Ln60;->ε:I

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ln60;->ι:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Ln60;->μ:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Ln60;->ξ:Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v0, Lb70;

    .line 23
    .line 24
    invoke-direct {v0}, Lb70;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ln60;->ω:Lb70;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ln60;->Θ:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Ln60;->Μ:Z

    .line 33
    .line 34
    new-instance v0, Lss;

    .line 35
    .line 36
    move-object v1, p0

    .line 37
    check-cast v1, Lws;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v0, v1, v2}, Lss;-><init>(Lws;I)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lcr0;->ι:Lcr0;

    .line 44
    .line 45
    iput-object v0, p0, Ln60;->Ρ:Lcr0;

    .line 46
    .line 47
    new-instance v0, Lp11;

    .line 48
    .line 49
    invoke-direct {v0}, Lp11;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Ln60;->Τ:Lp11;

    .line 53
    .line 54
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Ln60;->Φ:Ljava/util/ArrayList;

    .line 65
    .line 66
    new-instance v0, Lk60;

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lk60;-><init>(Lws;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Ln60;->Χ:Lk60;

    .line 72
    .line 73
    invoke-virtual {p0}, Ln60;->ι()V

    .line 74
    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ln60;->Ι:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln60;->ψ:Lp60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, v0, Lp60;->φ:Landroidx/fragment/app/FragmentActivity;

    .line 8
    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    const-string p1, "Fragment "

    .line 16
    .line 17
    const-string p2, " not attached to an activity."

    .line 18
    .line 19
    invoke-static {p1, p0, p2}, Lγ;->θ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln60;->Ι:Z

    .line 3
    .line 4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "{"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "} ("

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Ln60;->ι:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Ln60;->Β:I

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    const-string v1, " id=0x"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v1, p0, Ln60;->Β:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v1, p0, Ln60;->Δ:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v1, " tag="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Ln60;->Δ:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_1
    const-string p0, ")"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final α()Ln5;
    .locals 0

    .line 1
    iget-object p0, p0, Ln60;->Υ:Ln5;

    .line 2
    .line 3
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ln5;

    .line 6
    .line 7
    return-object p0
.end method

.method public final β()Lk11;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln60;->π()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Landroid/app/Application;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-static {v1}, Lb70;->Η(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Could not find Application instance from Context "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ln60;->π()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "FragmentManager"

    .line 65
    .line 66
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :cond_2
    new-instance v1, Lk11;

    .line 70
    .line 71
    invoke-direct {v1}, Lk11;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, Lhq;->α:Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    sget-object v3, Lo92;->η:Lzz1;

    .line 79
    .line 80
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_3
    sget-object v0, Lln0;->ζ:Lrk0;

    .line 84
    .line 85
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Lln0;->η:Lrk0;

    .line 89
    .line 90
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Ln60;->κ:Landroid/os/Bundle;

    .line 94
    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    sget-object v0, Lln0;->θ:Lrk0;

    .line 98
    .line 99
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_4
    return-object v1
.end method

.method public final γ()Lq92;
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ln60;->η()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 13
    .line 14
    iget-object v0, v0, Lb70;->Ξ:Le70;

    .line 15
    .line 16
    iget-object v0, v0, Le70;->δ:Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v1, p0, Ln60;->ι:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lq92;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lq92;

    .line 29
    .line 30
    invoke-direct {v1}, Lq92;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Ln60;->ι:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object v1

    .line 39
    :cond_1
    const-string p0, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    .line 40
    .line 41
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_2
    const-string p0, "Can\'t access ViewModels from detached fragment"

    .line 47
    .line 48
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0
.end method

.method public final δ()Ljr0;
    .locals 0

    .line 1
    iget-object p0, p0, Ln60;->Σ:Ljr0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ε()Lm60;
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->Ν:Lm60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm60;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Ln60;->Ψ:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v1, v0, Lm60;->η:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, v0, Lm60;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v1, v0, Lm60;->ι:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Lm60;->κ:Landroid/view/View;

    .line 20
    .line 21
    iput-object v0, p0, Ln60;->Ν:Lm60;

    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Ln60;->Ν:Lm60;

    .line 24
    .line 25
    return-object p0
.end method

.method public final ζ()Lb70;
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->ψ:Lp60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ln60;->ω:Lb70;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string v0, "Fragment "

    .line 9
    .line 10
    const-string v1, " has not been attached yet."

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lγ;->θ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final η()I
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->Ρ:Lcr0;

    .line 2
    .line 3
    sget-object v1, Lcr0;->ζ:Lcr0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Ln60;->Α:Ln60;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Ln60;->Α:Ln60;

    .line 17
    .line 18
    invoke-virtual {p0}, Ln60;->η()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final θ()Lb70;
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Fragment "

    .line 7
    .line 8
    const-string v1, " not associated with a fragment manager."

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Lγ;->θ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public final ι()V
    .locals 3

    .line 1
    new-instance v0, Ljr0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljr0;-><init>(Lhr0;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ln60;->Σ:Ljr0;

    .line 7
    .line 8
    new-instance v0, Ljq1;

    .line 9
    .line 10
    new-instance v1, Lη;

    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    invoke-direct {v1, v2, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Ljq1;-><init>(Lkq1;Lη;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ln5;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ln5;-><init>(Ljq1;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Ln60;->Υ:Ln5;

    .line 26
    .line 27
    iget-object v0, p0, Ln60;->Φ:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v1, p0, Ln60;->Χ:Lk60;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    iget p0, p0, Ln60;->ε:I

    .line 38
    .line 39
    if-ltz p0, :cond_1

    .line 40
    .line 41
    iget-object p0, v1, Lk60;->α:Lws;

    .line 42
    .line 43
    iget-object v0, p0, Ln60;->Υ:Ln5;

    .line 44
    .line 45
    iget-object v0, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljq1;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljq1;->α()V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lln0;->χ(Lkq1;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    const-string v1, "registryState"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x0

    .line 67
    :goto_0
    iget-object p0, p0, Ln60;->Υ:Ln5;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ln5;->Π(Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final κ()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ln60;->ι()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ln60;->ι:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Ln60;->Π:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Ln60;->ι:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ln60;->ο:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Ln60;->π:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Ln60;->ρ:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Ln60;->σ:Z

    .line 26
    .line 27
    iput-boolean v0, p0, Ln60;->τ:Z

    .line 28
    .line 29
    iput v0, p0, Ln60;->φ:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Ln60;->χ:Lb70;

    .line 33
    .line 34
    new-instance v2, Lb70;

    .line 35
    .line 36
    invoke-direct {v2}, Lb70;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Ln60;->ω:Lb70;

    .line 40
    .line 41
    iput-object v1, p0, Ln60;->ψ:Lp60;

    .line 42
    .line 43
    iput v0, p0, Ln60;->Β:I

    .line 44
    .line 45
    iput v0, p0, Ln60;->Γ:I

    .line 46
    .line 47
    iput-object v1, p0, Ln60;->Δ:Ljava/lang/String;

    .line 48
    .line 49
    iput-boolean v0, p0, Ln60;->Ε:Z

    .line 50
    .line 51
    iput-boolean v0, p0, Ln60;->Ζ:Z

    .line 52
    .line 53
    return-void
.end method

.method public final λ()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ln60;->Ε:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Ln60;->Α:Ln60;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move p0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ln60;->λ()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    return v1

    .line 27
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final μ()Z
    .locals 0

    .line 1
    iget p0, p0, Ln60;->φ:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final ν(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Fragment "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, " received the following in onActivityResult(): requestCode: "

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, " resultCode: "

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " data: "

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "FragmentManager"

    .line 47
    .line 48
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public abstract ξ(Landroid/os/Bundle;)V
.end method

.method public final ο()Landroid/view/LayoutInflater;
    .locals 9

    .line 1
    check-cast p0, Lws;

    .line 2
    .line 3
    iget-object v0, p0, Ln60;->ψ:Lp60;

    .line 4
    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Ln60;->ω:Lb70;

    .line 18
    .line 19
    iget-object v1, v1, Lb70;->ζ:Lr60;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p0, Lws;->д:Z

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    const-string v3, "FragmentManager"

    .line 28
    .line 29
    if-eqz v1, :cond_a

    .line 30
    .line 31
    iget-boolean v4, p0, Lws;->ж:Z

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_0
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    iget-boolean v1, p0, Lws;->л:Z

    .line 42
    .line 43
    if-nez v1, :cond_8

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v4, 0x1

    .line 47
    :try_start_0
    iput-boolean v4, p0, Lws;->ж:Z

    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    invoke-static {v5}, Lb70;->Η(I)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v7, "onCreateDialog called for DialogFragment "

    .line 59
    .line 60
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    :cond_2
    new-instance v6, Lxm;

    .line 74
    .line 75
    invoke-virtual {p0}, Ln60;->π()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget v8, p0, Lws;->в:I

    .line 80
    .line 81
    invoke-direct {v6, v7, v8}, Lxm;-><init>(Landroid/content/Context;I)V

    .line 82
    .line 83
    .line 84
    iput-object v6, p0, Lws;->и:Lxm;

    .line 85
    .line 86
    iget-boolean v7, p0, Lws;->д:Z

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    if-eqz v7, :cond_7

    .line 90
    .line 91
    iget v7, p0, Lws;->б:I

    .line 92
    .line 93
    if-eq v7, v4, :cond_4

    .line 94
    .line 95
    if-eq v7, v2, :cond_4

    .line 96
    .line 97
    if-eq v7, v5, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    const/16 v7, 0x18

    .line 107
    .line 108
    invoke-virtual {v5, v7}, Landroid/view/Window;->addFlags(I)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {v6, v4}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 112
    .line 113
    .line 114
    :goto_0
    iget-object v5, p0, Ln60;->ψ:Lp60;

    .line 115
    .line 116
    if-nez v5, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    iget-object v8, v5, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 120
    .line 121
    :goto_1
    if-eqz v8, :cond_6

    .line 122
    .line 123
    iget-object v5, p0, Lws;->и:Lxm;

    .line 124
    .line 125
    invoke-virtual {v5, v8}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    :goto_2
    iget-object v5, p0, Lws;->и:Lxm;

    .line 132
    .line 133
    iget-boolean v6, p0, Lws;->г:Z

    .line 134
    .line 135
    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 136
    .line 137
    .line 138
    iget-object v5, p0, Lws;->и:Lxm;

    .line 139
    .line 140
    iget-object v6, p0, Lws;->Ω:Lts;

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 143
    .line 144
    .line 145
    iget-object v5, p0, Lws;->и:Lxm;

    .line 146
    .line 147
    iget-object v6, p0, Lws;->а:Lus;

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 150
    .line 151
    .line 152
    iput-boolean v4, p0, Lws;->л:Z

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    iput-object v8, p0, Lws;->и:Lxm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    :goto_3
    iput-boolean v1, p0, Lws;->ж:Z

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :goto_4
    iput-boolean v1, p0, Lws;->ж:Z

    .line 161
    .line 162
    throw v0

    .line 163
    :cond_8
    :goto_5
    invoke-static {v2}, Lb70;->Η(I)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    new-instance v1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string v2, "get layout inflater for DialogFragment "

    .line 172
    .line 173
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v2, " from dialog context"

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    :cond_9
    iget-object p0, p0, Lws;->и:Lxm;

    .line 192
    .line 193
    if-eqz p0, :cond_c

    .line 194
    .line 195
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_a
    :goto_6
    invoke-static {v2}, Lb70;->Η(I)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_c

    .line 209
    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v2, "getting layout inflater for DialogFragment "

    .line 213
    .line 214
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    iget-boolean p0, p0, Lws;->д:Z

    .line 225
    .line 226
    if-nez p0, :cond_b

    .line 227
    .line 228
    const-string p0, "mShowsDialog = false: "

    .line 229
    .line 230
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_b
    const-string p0, "mCreatingDialog = true: "

    .line 239
    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    :cond_c
    return-object v0

    .line 248
    :cond_d
    const-string p0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    .line 249
    .line 250
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const/4 p0, 0x0

    .line 254
    return-object p0
.end method

.method public final π()Landroid/content/Context;
    .locals 2

    .line 1
    iget-object v0, p0, Ln60;->ψ:Lp60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, v0, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 8
    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    const-string v0, "Fragment "

    .line 13
    .line 14
    const-string v1, " not attached to a context."

    .line 15
    .line 16
    invoke-static {v0, p0, v1}, Lγ;->θ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final ρ(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln60;->Ν:Lm60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput p1, v0, Lm60;->β:I

    .line 19
    .line 20
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput p2, p1, Lm60;->γ:I

    .line 25
    .line 26
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput p3, p1, Lm60;->δ:I

    .line 31
    .line 32
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iput p4, p0, Lm60;->ε:I

    .line 37
    .line 38
    return-void
.end method
