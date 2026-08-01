.class public abstract Landroidx/activity/g;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Q;
.implements Landroidx/lifecycle/i;
.implements LM/f;
.implements Landroidx/lifecycle/s;
.implements Ly/j;


# instance fields
.field public final b:Landroidx/lifecycle/u;

.field public final c:La/a;

.field public final d:LH/a;

.field public final e:Landroidx/lifecycle/u;

.field public final f:LM/e;

.field public g:Landroidx/lifecycle/P;

.field public h:Landroidx/lifecycle/J;

.field public final i:Landroidx/activity/i;

.field public final j:Landroidx/activity/e;

.field public final k:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/u;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/activity/g;->b:Landroidx/lifecycle/u;

    .line 10
    .line 11
    new-instance v0, La/a;

    .line 12
    .line 13
    invoke-direct {v0}, La/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/activity/g;->c:La/a;

    .line 17
    .line 18
    new-instance v0, LH/a;

    .line 19
    .line 20
    new-instance v1, Landroidx/activity/b;

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    check-cast v2, Le/i;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v1, v3, v2}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LH/a;-><init>(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/activity/g;->d:LH/a;

    .line 33
    .line 34
    new-instance v0, Landroidx/lifecycle/u;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/activity/g;->e:Landroidx/lifecycle/u;

    .line 40
    .line 41
    new-instance v1, LM/e;

    .line 42
    .line 43
    invoke-direct {v1, p0}, LM/e;-><init>(LM/f;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Landroidx/activity/g;->f:LM/e;

    .line 47
    .line 48
    new-instance v3, Landroidx/activity/i;

    .line 49
    .line 50
    new-instance v4, LD/b;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-direct {v4, v5, v2}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v3, v4}, Landroidx/activity/i;-><init>(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 60
    .line 61
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v3, Landroidx/activity/e;

    .line 67
    .line 68
    invoke-direct {v3}, Landroidx/activity/e;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v3, p0, Landroidx/activity/g;->j:Landroidx/activity/e;

    .line 72
    .line 73
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v3, p0, Landroidx/activity/g;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 81
    .line 82
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Landroidx/activity/g;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 86
    .line 87
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, p0, Landroidx/activity/g;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v3, p0, Landroidx/activity/g;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v3, p0, Landroidx/activity/g;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    new-instance v3, Landroidx/activity/ComponentActivity$3;

    .line 109
    .line 110
    invoke-direct {v3, v2}, Landroidx/activity/ComponentActivity$3;-><init>(Le/i;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Landroidx/activity/ComponentActivity$4;

    .line 117
    .line 118
    invoke-direct {v3, v2}, Landroidx/activity/ComponentActivity$4;-><init>(Le/i;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Landroidx/activity/ComponentActivity$5;

    .line 125
    .line 126
    invoke-direct {v3, v2}, Landroidx/activity/ComponentActivity$5;-><init>(Le/i;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, LM/e;->c()V

    .line 133
    .line 134
    .line 135
    iget-object v3, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 136
    .line 137
    sget-object v4, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 138
    .line 139
    if-eq v3, v4, :cond_1

    .line 140
    .line 141
    sget-object v4, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n;

    .line 142
    .line 143
    if-ne v3, v4, :cond_0

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    const-string v1, "Failed requirement."

    .line 149
    .line 150
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_1
    :goto_0
    iget-object v1, v1, LM/e;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, LM/d;

    .line 157
    .line 158
    invoke-virtual {v1}, LM/d;->d()LM/c;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-nez v3, :cond_2

    .line 163
    .line 164
    new-instance v3, Landroidx/lifecycle/H;

    .line 165
    .line 166
    invoke-direct {v3, v1, p0}, Landroidx/lifecycle/H;-><init>(LM/d;Landroidx/activity/g;)V

    .line 167
    .line 168
    .line 169
    const-string v4, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 170
    .line 171
    invoke-virtual {v1, v4, v3}, LM/d;->f(Ljava/lang/String;LM/c;)V

    .line 172
    .line 173
    .line 174
    new-instance v4, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 175
    .line 176
    invoke-direct {v4, v3}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/H;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v4}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 180
    .line 181
    .line 182
    :cond_2
    new-instance v0, Landroidx/activity/c;

    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    invoke-direct {v0, v3, v2}, Landroidx/activity/c;-><init>(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    const-string v3, "android:support:activity-result"

    .line 189
    .line 190
    invoke-virtual {v1, v3, v0}, LM/d;->f(Ljava/lang/String;LM/c;)V

    .line 191
    .line 192
    .line 193
    new-instance v0, Landroidx/activity/d;

    .line 194
    .line 195
    invoke-direct {v0, v2}, Landroidx/activity/d;-><init>(Le/i;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v0}, Landroidx/activity/g;->f(La/b;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public static synthetic e(Le/i;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()LJ/b;
    .locals 4

    .line 1
    new-instance v0, LJ/c;

    .line 2
    .line 3
    sget-object v1, LJ/a;->b:LJ/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ/c;-><init>(LJ/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, LJ/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Landroidx/lifecycle/M;->b:Landroidx/lifecycle/M;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object v1, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/M;

    .line 28
    .line 29
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v1, Landroidx/lifecycle/G;->b:Landroidx/lifecycle/M;

    .line 33
    .line 34
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    sget-object v1, Landroidx/lifecycle/G;->c:Landroidx/lifecycle/M;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_1
    return-object v0
.end method

.method public final b()LM/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->f:LM/e;

    .line 2
    .line 3
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LM/d;

    .line 6
    .line 7
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->e:Landroidx/lifecycle/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "window.decorView"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lb1/h;->q(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-static {p0, v0, p0, p1}, Lb1/h;->r(Ly/j;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "window.decorView"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lb1/h;->q(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final f(La/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->c:La/a;

    .line 2
    .line 3
    iget-object v1, v0, La/a;->b:Landroidx/activity/g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, La/b;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, v0, La/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Landroidx/lifecycle/E;->c:I

    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/C;->b(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final getViewModelStore()Landroidx/lifecycle/P;
    .locals 2

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
    iget-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

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
    check-cast v0, Landroidx/activity/f;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/activity/f;->a:Landroidx/lifecycle/P;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Landroidx/lifecycle/P;

    .line 28
    .line 29
    invoke-direct {v0}, Landroidx/lifecycle/P;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/g;->b:Landroidx/lifecycle/u;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/lifecycle/u;->g()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->j:Landroidx/activity/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/activity/e;->a(IILandroid/content/Intent;)Z

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

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/i;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/g;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lx/a;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Lx/a;->a(Ljava/lang/Object;)V

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
    iget-object v0, p0, Landroidx/activity/g;->f:LM/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM/e;->d(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/g;->c:La/a;

    .line 7
    .line 8
    iput-object p0, v0, La/a;->b:Landroidx/activity/g;

    .line 9
    .line 10
    iget-object v0, v0, La/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/b;

    .line 27
    .line 28
    invoke-interface {v1}, La/b;->a()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/activity/g;->g(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    sget p1, Landroidx/lifecycle/E;->c:I

    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/C;->b(Landroid/app/Activity;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_1

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
    iget-object p1, p0, Landroidx/activity/g;->d:LH/a;

    .line 10
    .line 11
    iget-object p1, p1, LH/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/lang/ClassCastException;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    if-nez p1, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/g;->d:LH/a;

    .line 12
    .line 13
    iget-object p1, p1, LH/a;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/lang/ClassCastException;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/activity/g;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx/a;

    .line 18
    .line 19
    new-instance v1, LG/d;

    .line 20
    .line 21
    const-string v2, "newConfig"

    .line 22
    .line 23
    invoke-static {p2, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x1a

    .line 27
    .line 28
    invoke-direct {v1, v2}, LG/d;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lx/a;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/g;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lx/a;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Lx/a;->a(Ljava/lang/Object;)V

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
    iget-object v0, p0, Landroidx/activity/g;->d:LH/a;

    .line 2
    .line 3
    iget-object v0, v0, LH/a;->c:Ljava/lang/Object;

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
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p1, Ljava/lang/ClassCastException;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public final onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/activity/g;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx/a;

    .line 18
    .line 19
    new-instance v1, LG/d;

    .line 20
    .line 21
    const-string v2, "newConfig"

    .line 22
    .line 23
    invoke-static {p2, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x1b

    .line 27
    .line 28
    invoke-direct {v1, v2}, LG/d;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lx/a;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/activity/g;->d:LH/a;

    .line 7
    .line 8
    iget-object p1, p1, LH/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance p1, Ljava/lang/ClassCastException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 37
    return p1
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
    const/4 v1, -0x1

    .line 19
    iget-object v2, p0, Landroidx/activity/g;->j:Landroidx/activity/e;

    .line 20
    .line 21
    invoke-virtual {v2, p1, v1, v0}, Landroidx/activity/e;->a(IILandroid/content/Intent;)Z

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
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->g:Landroidx/lifecycle/P;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/activity/f;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, v1, Landroidx/activity/f;->a:Landroidx/lifecycle/P;

    .line 14
    .line 15
    :cond_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    new-instance v1, Landroidx/activity/f;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, v1, Landroidx/activity/f;->a:Landroidx/lifecycle/P;

    .line 25
    .line 26
    return-object v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->e:Landroidx/lifecycle/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/u;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/activity/g;->h(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/activity/g;->f:LM/e;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LM/e;->e(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/g;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lx/a;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v1, v2}, Lx/a;->a(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final reportFullyDrawn()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, LD/h;->A()Z

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
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

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
    const-string v1, "<this>"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v2, 0x7f0900bf

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v2, 0x7f0900c2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const v2, 0x7f0900c1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const v1, 0x7f0900c0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
