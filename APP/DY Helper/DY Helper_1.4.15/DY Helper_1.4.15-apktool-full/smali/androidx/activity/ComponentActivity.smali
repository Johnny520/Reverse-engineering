.class public Landroidx/activity/ComponentActivity;
.super Landroidx/core/app/ComponentActivity;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lr92;
.implements Lsc0;
.implements Lkq1;


# static fields
.field public static final synthetic χ:I


# instance fields
.field public final ζ:La;

.field public final η:Lm6;

.field public final θ:Ljr0;

.field public final ι:Ln5;

.field public κ:Lq92;

.field public λ:Ld51;

.field public final μ:Lwm;

.field public final ν:Lo70;

.field public final ξ:Lsm;

.field public final ο:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final π:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final σ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final τ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public υ:Z

.field public φ:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/core/app/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, La;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->ζ:La;

    .line 11
    .line 12
    new-instance v0, Lm6;

    .line 13
    .line 14
    new-instance v1, Lν;

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    invoke-direct {v1, v2, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lm6;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 25
    .line 26
    new-instance v0, Ljr0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljr0;-><init>(Lhr0;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->θ:Ljr0;

    .line 32
    .line 33
    new-instance v1, Ljq1;

    .line 34
    .line 35
    new-instance v2, Lη;

    .line 36
    .line 37
    const/16 v3, 0xe

    .line 38
    .line 39
    invoke-direct {v2, v3, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, v2}, Ljq1;-><init>(Lkq1;Lη;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Ln5;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Ln5;-><init>(Ljq1;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->λ:Ld51;

    .line 54
    .line 55
    new-instance v3, Lwm;

    .line 56
    .line 57
    invoke-direct {v3, p0}, Lwm;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    .line 61
    .line 62
    new-instance v4, Lo70;

    .line 63
    .line 64
    new-instance v5, Lη;

    .line 65
    .line 66
    const/4 v6, 0x7

    .line 67
    invoke-direct {v5, v6, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v4, v3, v5}, Lo70;-><init>(Lwm;Lη;)V

    .line 71
    .line 72
    .line 73
    iput-object v4, p0, Landroidx/activity/ComponentActivity;->ν:Lo70;

    .line 74
    .line 75
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v3, Lsm;

    .line 81
    .line 82
    invoke-direct {v3}, Lsm;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 86
    .line 87
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->ο:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->π:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 109
    .line 110
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->σ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 114
    .line 115
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 116
    .line 117
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v3, p0, Landroidx/activity/ComponentActivity;->τ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    iput-boolean v3, p0, Landroidx/activity/ComponentActivity;->υ:Z

    .line 124
    .line 125
    iput-boolean v3, p0, Landroidx/activity/ComponentActivity;->φ:Z

    .line 126
    .line 127
    new-instance v3, Ltm;

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-direct {v3, p0, v4}, Ltm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v3}, Ljr0;->α(Lgr0;)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Ltm;

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    invoke-direct {v3, p0, v4}, Ltm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v3}, Ljr0;->α(Lgr0;)V

    .line 143
    .line 144
    .line 145
    new-instance v3, Ltm;

    .line 146
    .line 147
    const/4 v4, 0x2

    .line 148
    invoke-direct {v3, p0, v4}, Ltm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Ljr0;->α(Lgr0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljq1;->α()V

    .line 155
    .line 156
    .line 157
    invoke-static {p0}, Lln0;->χ(Lkq1;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v2, Ln5;->η:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Ln5;

    .line 163
    .line 164
    new-instance v1, Lqm;

    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    invoke-direct {v1, v2, p0}, Lqm;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    const-string v2, "android:support:activity-result"

    .line 171
    .line 172
    invoke-virtual {v0, v2, v1}, Ln5;->Σ(Ljava/lang/String;Lhq1;)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Lrm;

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    invoke-direct {v0, p0, v1}, Lrm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->η(Le51;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public static synthetic ε(Landroidx/activity/ComponentActivity;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lwm;->α(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lsm;->α(IILandroid/content/Intent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onBackPressed()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->θ()Ld51;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ld51;->α()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ο:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lap;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lap;->accept(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln5;->Π(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ζ:La;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p0, v0, La;->β:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, La;->α:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Le51;

    .line 32
    .line 33
    invoke-interface {v1}, Le51;->α()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    sget p1, Ljn1;->ε:I

    .line 41
    .line 42
    invoke-static {p0}, Lhn1;->β(Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 10
    .line 11
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lv60;

    .line 30
    .line 31
    iget-object p1, p1, Lv60;->α:Lb70;

    .line 32
    .line 33
    invoke-virtual {p1}, Lb70;->κ()Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p2, 0x0

    .line 10
    if-nez p1, :cond_2

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 13
    .line 14
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lv60;

    .line 33
    .line 34
    iget-object p1, p1, Lv60;->α:Lb70;

    .line 35
    .line 36
    invoke-virtual {p1}, Lb70;->ο()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    return v0

    .line 43
    :cond_2
    return p2
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 2

    .line 45
    iget-boolean v0, p0, Landroidx/activity/ComponentActivity;->υ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->σ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lap;

    .line 47
    new-instance v1, Lj11;

    invoke-direct {v1, p1}, Lj11;-><init>(Z)V

    invoke-interface {v0, v1}, Lap;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->υ:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->υ:Z

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->σ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lap;

    .line 27
    .line 28
    new-instance v1, Lj11;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p1}, Lj11;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Lap;->accept(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->υ:Z

    .line 43
    .line 44
    throw p1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lap;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lap;->accept(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 2
    .line 3
    iget-object v0, v0, Lm6;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lv60;

    .line 22
    .line 23
    iget-object v1, v1, Lv60;->α:Lb70;

    .line 24
    .line 25
    invoke-virtual {v1}, Lb70;->π()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 2

    .line 45
    iget-boolean v0, p0, Landroidx/activity/ComponentActivity;->φ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->τ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lap;

    .line 47
    new-instance v1, Lah1;

    invoke-direct {v1, p1}, Lah1;-><init>(Z)V

    invoke-interface {v0, v1}, Lap;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->φ:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->φ:Z

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->τ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lap;

    .line 27
    .line 28
    new-instance v1, Lah1;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p1}, Lah1;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Lap;->accept(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->φ:Z

    .line 43
    .line 44
    throw p1
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 7
    .line 8
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lv60;

    .line 27
    .line 28
    iget-object p1, p1, Lv60;->α:Lb70;

    .line 29
    .line 30
    invoke-virtual {p1}, Lb70;->τ()Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    invoke-virtual {v1, p1, v2, v0}, Lsm;->α(IILandroid/content/Intent;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lvm;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lvm;->α:Lq92;

    .line 14
    .line 15
    :cond_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, Lvm;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lvm;->α:Lq92;

    .line 25
    .line 26
    return-object p0
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->θ:Ljr0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "setCurrentState"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljr0;->γ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcr0;->η:Lcr0;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljr0;->ε(Lcr0;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ln5;->Ρ(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->π:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lap;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Lap;->accept(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final reportFullyDrawn()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lo52;->α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "reportFullyDrawn() for ComponentActivity"

    .line 8
    .line 9
    invoke-static {v0}, Le81;->β(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ν:Lo70;

    .line 16
    .line 17
    iget-object v0, p0, Lo70;->α:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    const/4 v1, 0x1

    .line 21
    :try_start_1
    iput-boolean v1, p0, Lo70;->β:Z

    .line 22
    .line 23
    iget-object v1, p0, Lo70;->γ:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lp70;

    .line 40
    .line 41
    invoke-interface {v2}, Lp70;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object p0, p0, Lo70;->γ:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_3
    monitor-exit v0

    .line 58
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    throw p0
.end method

.method public setContentView(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lwm;->α(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2

    .line 21
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    invoke-virtual {v1, v0}, Lwm;->α(Landroid/view/View;)V

    .line 23
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    invoke-virtual {v1, v0}, Lwm;->α(Landroid/view/View;)V

    .line 26
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final α()Ln5;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

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
    new-instance v0, Lk11;

    .line 2
    .line 3
    invoke-direct {v0}, Lk11;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v0, Lhq;->α:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Lo92;->η:Lzz1;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object v1, Lln0;->ζ:Lrk0;

    .line 24
    .line 25
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v1, Lln0;->η:Lrk0;

    .line 29
    .line 30
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    sget-object v1, Lln0;->θ:Lrk0;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    return-object v0
.end method

.method public final γ()Lq92;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lvm;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lvm;->α:Lq92;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lq92;

    .line 28
    .line 29
    invoke-direct {v0}, Lq92;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 33
    .line 34
    :cond_1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    const-string p0, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    .line 38
    .line 39
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public final δ()Ljr0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->θ:Ljr0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ(Lap;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ο:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final η(Le51;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ζ:La;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Le51;->α()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, La;->α:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final θ()Ld51;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->λ:Ld51;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ld51;

    .line 6
    .line 7
    new-instance v1, Ld1;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ld51;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->λ:Ld51;

    .line 17
    .line 18
    new-instance v0, Ltm;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {v0, p0, v1}, Ltm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->θ:Ljr0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljr0;->α(Lgr0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->λ:Ld51;

    .line 30
    .line 31
    return-object p0
.end method

.method public final ι()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v1, 0x7f090386

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const v1, 0x7f090389

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const v1, 0x7f090388

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const v1, 0x7f090387

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const v1, 0x7f090267

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
