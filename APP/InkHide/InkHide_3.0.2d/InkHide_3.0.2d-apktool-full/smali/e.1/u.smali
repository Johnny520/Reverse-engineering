.class public final Le/u;
.super Le/k;
.source "SourceFile"

# interfaces
.implements Lh/k;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final Z:Ll/k;

.field public static final a0:[I

.field public static final b0:Z

.field public static final c0:Z


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:[Le/t;

.field public G:Le/t;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Landroid/content/res/Configuration;

.field public final M:I

.field public N:I

.field public O:Z

.field public P:Z

.field public Q:Le/q;

.field public R:Le/q;

.field public S:Z

.field public T:I

.field public final U:Le/l;

.field public V:Z

.field public W:Landroid/graphics/Rect;

.field public X:Landroid/graphics/Rect;

.field public Y:Le/y;

.field public final d:Ljava/lang/Object;

.field public final e:Landroid/content/Context;

.field public f:Landroid/view/Window;

.field public g:Le/p;

.field public final h:Ljava/lang/Object;

.field public i:Le/E;

.field public j:Lg/i;

.field public k:Ljava/lang/CharSequence;

.field public l:Li/n0;

.field public m:Le/m;

.field public n:Le/m;

.field public o:Lg/a;

.field public p:Landroidx/appcompat/widget/ActionBarContextView;

.field public q:Landroid/widget/PopupWindow;

.field public r:Le/l;

.field public s:Ly/S;

.field public t:Z

.field public u:Landroid/view/ViewGroup;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/view/View;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ll/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le/u;->Z:Ll/k;

    .line 7
    .line 8
    const v0, 0x1010054

    .line 9
    .line 10
    .line 11
    filled-new-array {v0}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Le/u;->a0:[I

    .line 16
    .line 17
    const-string v0, "robolectric"

    .line 18
    .line 19
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    xor-int/2addr v0, v1

    .line 27
    sput-boolean v0, Le/u;->b0:Z

    .line 28
    .line 29
    sput-boolean v1, Le/u;->c0:Z

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Le/j;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Le/u;->s:Ly/S;

    .line 6
    .line 7
    const/16 v1, -0x64

    .line 8
    .line 9
    iput v1, p0, Le/u;->M:I

    .line 10
    .line 11
    new-instance v2, Le/l;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, v3}, Le/l;-><init>(Le/u;I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Le/u;->U:Le/l;

    .line 18
    .line 19
    iput-object p1, p0, Le/u;->e:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p3, p0, Le/u;->h:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p4, p0, Le/u;->d:Ljava/lang/Object;

    .line 24
    .line 25
    instance-of p3, p4, Landroid/app/Dialog;

    .line 26
    .line 27
    if-eqz p3, :cond_2

    .line 28
    .line 29
    :goto_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    instance-of p3, p1, Le/i;

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    check-cast p1, Le/i;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    .line 39
    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    check-cast p1, Landroid/content/ContextWrapper;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p1, v0

    .line 50
    :goto_1
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Le/i;->i()Le/k;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Le/u;

    .line 57
    .line 58
    iget p1, p1, Le/u;->M:I

    .line 59
    .line 60
    iput p1, p0, Le/u;->M:I

    .line 61
    .line 62
    :cond_2
    iget p1, p0, Le/u;->M:I

    .line 63
    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    sget-object p1, Le/u;->Z:Ll/k;

    .line 67
    .line 68
    iget-object p3, p0, Le/u;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-virtual {p1, p3, v0}, Ll/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz p3, :cond_3

    .line 85
    .line 86
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    iput p3, p0, Le/u;->M:I

    .line 91
    .line 92
    iget-object p3, p0, Le/u;->d:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-virtual {p1, p3}, Ll/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    if-eqz p2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0, p2}, Le/u;->n(Landroid/view/Window;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-static {}, Li/u;->c()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static r(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p0, p0, 0x30

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p0, 0x20

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 p0, 0x10

    .line 32
    .line 33
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    iput p3, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p2, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p2, p2, -0x31

    .line 49
    .line 50
    or-int/2addr p0, p2

    .line 51
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    return-object p1
.end method


# virtual methods
.method public final A(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_5

    .line 5
    .line 6
    if-eq p2, v1, :cond_4

    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_4

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Le/u;->R:Le/q;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Le/q;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Le/q;-><init>(Le/u;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Le/u;->R:Le/q;

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Le/u;->R:Le/q;

    .line 31
    .line 32
    invoke-virtual {p1}, Le/q;->f()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string v0, "uimode"

    .line 50
    .line 51
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Landroid/app/UiModeManager;

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p0, p1}, Le/u;->w(Landroid/content/Context;)Landroidx/fragment/app/g;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroidx/fragment/app/g;->f()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1

    .line 73
    :cond_4
    return p2

    .line 74
    :cond_5
    :goto_0
    return v1
.end method

.method public final B(Le/t;Landroid/view/KeyEvent;)V
    .locals 13

    .line 1
    iget-boolean v0, p1, Le/t;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_1a

    .line 4
    .line 5
    iget-boolean v0, p0, Le/u;->K:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_9

    .line 10
    .line 11
    :cond_0
    iget v0, p1, Le/t;->a:I

    .line 12
    .line 13
    iget-object v1, p0, Le/u;->e:Landroid/content/Context;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v2, v2, Landroid/content/res/Configuration;->screenLayout:I

    .line 26
    .line 27
    and-int/lit8 v2, v2, 0xf

    .line 28
    .line 29
    const/4 v3, 0x4

    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    goto/16 :goto_9

    .line 33
    .line 34
    :cond_1
    iget-object v2, p0, Le/u;->f:Landroid/view/Window;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 44
    .line 45
    invoke-interface {v2, v0, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0, p1, v3}, Le/u;->q(Le/t;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const-string v0, "window"

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/view/WindowManager;

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p0, p1, p2}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_4

    .line 72
    .line 73
    goto/16 :goto_9

    .line 74
    .line 75
    :cond_4
    iget-object p2, p1, Le/t;->e:Le/s;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v4, -0x2

    .line 79
    if-eqz p2, :cond_6

    .line 80
    .line 81
    iget-boolean v5, p1, Le/t;->n:Z

    .line 82
    .line 83
    if-eqz v5, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    iget-object p2, p1, Le/t;->g:Landroid/view/View;

    .line 87
    .line 88
    if-eqz p2, :cond_18

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_18

    .line 95
    .line 96
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 97
    .line 98
    const/4 v1, -0x1

    .line 99
    if-ne p2, v1, :cond_18

    .line 100
    .line 101
    move v6, v1

    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_6
    :goto_0
    if-nez p2, :cond_b

    .line 105
    .line 106
    invoke-virtual {p0}, Le/u;->y()V

    .line 107
    .line 108
    .line 109
    iget-object p2, p0, Le/u;->i:Le/E;

    .line 110
    .line 111
    if-eqz p2, :cond_7

    .line 112
    .line 113
    invoke-virtual {p2}, Le/E;->R()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    const/4 p2, 0x0

    .line 119
    :goto_1
    if-nez p2, :cond_8

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_8
    move-object v1, p2

    .line 123
    :goto_2
    new-instance p2, Landroid/util/TypedValue;

    .line 124
    .line 125
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v5, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 141
    .line 142
    .line 143
    const v6, 0x7f040002

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 147
    .line 148
    .line 149
    iget v6, p2, Landroid/util/TypedValue;->resourceId:I

    .line 150
    .line 151
    if-eqz v6, :cond_9

    .line 152
    .line 153
    invoke-virtual {v5, v6, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 154
    .line 155
    .line 156
    :cond_9
    const v6, 0x7f0400c7

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 160
    .line 161
    .line 162
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 163
    .line 164
    if-eqz p2, :cond_a

    .line 165
    .line 166
    invoke-virtual {v5, p2, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    const p2, 0x7f1000f5

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, p2, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 174
    .line 175
    .line 176
    :goto_3
    new-instance p2, Lg/d;

    .line 177
    .line 178
    invoke-direct {p2, v1, v2}, Lg/d;-><init>(Landroid/content/Context;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Lg/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 186
    .line 187
    .line 188
    iput-object p2, p1, Le/t;->j:Lg/d;

    .line 189
    .line 190
    sget-object v1, Ld/a;->j:[I

    .line 191
    .line 192
    invoke-virtual {p2, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    const/16 v1, 0x56

    .line 197
    .line 198
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    iput v1, p1, Le/t;->b:I

    .line 203
    .line 204
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    iput v1, p1, Le/t;->d:I

    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 211
    .line 212
    .line 213
    new-instance p2, Le/s;

    .line 214
    .line 215
    iget-object v1, p1, Le/t;->j:Lg/d;

    .line 216
    .line 217
    invoke-direct {p2, p0, v1}, Le/s;-><init>(Le/u;Lg/d;)V

    .line 218
    .line 219
    .line 220
    iput-object p2, p1, Le/t;->e:Le/s;

    .line 221
    .line 222
    const/16 p2, 0x51

    .line 223
    .line 224
    iput p2, p1, Le/t;->c:I

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_b
    iget-boolean v1, p1, Le/t;->n:Z

    .line 228
    .line 229
    if-eqz v1, :cond_c

    .line 230
    .line 231
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-lez p2, :cond_c

    .line 236
    .line 237
    iget-object p2, p1, Le/t;->e:Le/s;

    .line 238
    .line 239
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 240
    .line 241
    .line 242
    :cond_c
    :goto_4
    iget-object p2, p1, Le/t;->g:Landroid/view/View;

    .line 243
    .line 244
    if-eqz p2, :cond_d

    .line 245
    .line 246
    iput-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_d
    iget-object p2, p1, Le/t;->h:Lh/m;

    .line 250
    .line 251
    if-nez p2, :cond_e

    .line 252
    .line 253
    goto/16 :goto_8

    .line 254
    .line 255
    :cond_e
    iget-object p2, p0, Le/u;->n:Le/m;

    .line 256
    .line 257
    if-nez p2, :cond_f

    .line 258
    .line 259
    new-instance p2, Le/m;

    .line 260
    .line 261
    const/4 v1, 0x3

    .line 262
    invoke-direct {p2, p0, v1}, Le/m;-><init>(Le/u;I)V

    .line 263
    .line 264
    .line 265
    iput-object p2, p0, Le/u;->n:Le/m;

    .line 266
    .line 267
    :cond_f
    iget-object p2, p0, Le/u;->n:Le/m;

    .line 268
    .line 269
    iget-object v1, p1, Le/t;->i:Lh/i;

    .line 270
    .line 271
    if-nez v1, :cond_10

    .line 272
    .line 273
    new-instance v1, Lh/i;

    .line 274
    .line 275
    iget-object v5, p1, Le/t;->j:Lg/d;

    .line 276
    .line 277
    invoke-direct {v1, v5}, Lh/i;-><init>(Landroid/content/ContextWrapper;)V

    .line 278
    .line 279
    .line 280
    iput-object v1, p1, Le/t;->i:Lh/i;

    .line 281
    .line 282
    iput-object p2, v1, Lh/i;->f:Lh/y;

    .line 283
    .line 284
    iget-object p2, p1, Le/t;->h:Lh/m;

    .line 285
    .line 286
    iget-object v5, p2, Lh/m;->a:Landroid/content/Context;

    .line 287
    .line 288
    invoke-virtual {p2, v1, v5}, Lh/m;->b(Lh/z;Landroid/content/Context;)V

    .line 289
    .line 290
    .line 291
    :cond_10
    iget-object p2, p1, Le/t;->i:Lh/i;

    .line 292
    .line 293
    iget-object v1, p1, Le/t;->e:Le/s;

    .line 294
    .line 295
    iget-object v5, p2, Lh/i;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 296
    .line 297
    if-nez v5, :cond_12

    .line 298
    .line 299
    iget-object v5, p2, Lh/i;->c:Landroid/view/LayoutInflater;

    .line 300
    .line 301
    const v6, 0x7f0c000d

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v6, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 309
    .line 310
    iput-object v1, p2, Lh/i;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 311
    .line 312
    iget-object v1, p2, Lh/i;->g:Lh/h;

    .line 313
    .line 314
    if-nez v1, :cond_11

    .line 315
    .line 316
    new-instance v1, Lh/h;

    .line 317
    .line 318
    invoke-direct {v1, p2}, Lh/h;-><init>(Lh/i;)V

    .line 319
    .line 320
    .line 321
    iput-object v1, p2, Lh/i;->g:Lh/h;

    .line 322
    .line 323
    :cond_11
    iget-object v1, p2, Lh/i;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 324
    .line 325
    iget-object v5, p2, Lh/i;->g:Lh/h;

    .line 326
    .line 327
    invoke-virtual {v1, v5}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 328
    .line 329
    .line 330
    iget-object v1, p2, Lh/i;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 331
    .line 332
    invoke-virtual {v1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 333
    .line 334
    .line 335
    :cond_12
    iget-object p2, p2, Lh/i;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 336
    .line 337
    iput-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 338
    .line 339
    if-eqz p2, :cond_19

    .line 340
    .line 341
    :goto_5
    iget-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 342
    .line 343
    if-nez p2, :cond_13

    .line 344
    .line 345
    goto/16 :goto_8

    .line 346
    .line 347
    :cond_13
    iget-object p2, p1, Le/t;->g:Landroid/view/View;

    .line 348
    .line 349
    if-eqz p2, :cond_14

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_14
    iget-object p2, p1, Le/t;->i:Lh/i;

    .line 353
    .line 354
    iget-object v1, p2, Lh/i;->g:Lh/h;

    .line 355
    .line 356
    if-nez v1, :cond_15

    .line 357
    .line 358
    new-instance v1, Lh/h;

    .line 359
    .line 360
    invoke-direct {v1, p2}, Lh/h;-><init>(Lh/i;)V

    .line 361
    .line 362
    .line 363
    iput-object v1, p2, Lh/i;->g:Lh/h;

    .line 364
    .line 365
    :cond_15
    iget-object p2, p2, Lh/i;->g:Lh/h;

    .line 366
    .line 367
    invoke-virtual {p2}, Lh/h;->getCount()I

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    if-lez p2, :cond_19

    .line 372
    .line 373
    :goto_6
    iget-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 374
    .line 375
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    if-nez p2, :cond_16

    .line 380
    .line 381
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 382
    .line 383
    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 384
    .line 385
    .line 386
    :cond_16
    iget v1, p1, Le/t;->b:I

    .line 387
    .line 388
    iget-object v5, p1, Le/t;->e:Le/s;

    .line 389
    .line 390
    invoke-virtual {v5, v1}, Le/s;->setBackgroundResource(I)V

    .line 391
    .line 392
    .line 393
    iget-object v1, p1, Le/t;->f:Landroid/view/View;

    .line 394
    .line 395
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    instance-of v5, v1, Landroid/view/ViewGroup;

    .line 400
    .line 401
    if-eqz v5, :cond_17

    .line 402
    .line 403
    check-cast v1, Landroid/view/ViewGroup;

    .line 404
    .line 405
    iget-object v5, p1, Le/t;->f:Landroid/view/View;

    .line 406
    .line 407
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 408
    .line 409
    .line 410
    :cond_17
    iget-object v1, p1, Le/t;->e:Le/s;

    .line 411
    .line 412
    iget-object v5, p1, Le/t;->f:Landroid/view/View;

    .line 413
    .line 414
    invoke-virtual {v1, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 415
    .line 416
    .line 417
    iget-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 418
    .line 419
    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    .line 420
    .line 421
    .line 422
    move-result p2

    .line 423
    if-nez p2, :cond_18

    .line 424
    .line 425
    iget-object p2, p1, Le/t;->f:Landroid/view/View;

    .line 426
    .line 427
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 428
    .line 429
    .line 430
    :cond_18
    move v6, v4

    .line 431
    :goto_7
    iput-boolean v2, p1, Le/t;->l:Z

    .line 432
    .line 433
    new-instance v5, Landroid/view/WindowManager$LayoutParams;

    .line 434
    .line 435
    const/4 v9, 0x0

    .line 436
    const/16 v10, 0x3ea

    .line 437
    .line 438
    const/4 v7, -0x2

    .line 439
    const/4 v8, 0x0

    .line 440
    const/high16 v11, 0x820000

    .line 441
    .line 442
    const/4 v12, -0x3

    .line 443
    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 444
    .line 445
    .line 446
    iget p2, p1, Le/t;->c:I

    .line 447
    .line 448
    iput p2, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 449
    .line 450
    iget p2, p1, Le/t;->d:I

    .line 451
    .line 452
    iput p2, v5, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 453
    .line 454
    iget-object p2, p1, Le/t;->e:Le/s;

    .line 455
    .line 456
    invoke-interface {v0, p2, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 457
    .line 458
    .line 459
    iput-boolean v3, p1, Le/t;->m:Z

    .line 460
    .line 461
    return-void

    .line 462
    :cond_19
    :goto_8
    iput-boolean v3, p1, Le/t;->n:Z

    .line 463
    .line 464
    :cond_1a
    :goto_9
    return-void
.end method

.method public final C(Le/t;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, Le/t;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p1, p1, Le/t;->h:Lh/m;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p2, p3, v0}, Lh/m;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
.end method

.method public final D(Le/t;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Le/u;->K:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p1, Le/t;->k:Z

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return v2

    .line 14
    :cond_1
    iget-object v0, p0, Le/u;->G:Le/t;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eq v0, p1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Le/u;->q(Le/t;Z)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v3, p1, Le/t;->a:I

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, p1, Le/t;->g:Landroid/view/View;

    .line 38
    .line 39
    :cond_3
    const/16 v4, 0x6c

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    if-ne v3, v4, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v5, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_0
    move v5, v2

    .line 49
    :goto_1
    if-eqz v5, :cond_6

    .line 50
    .line 51
    iget-object v6, p0, Le/u;->l:Li/n0;

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 56
    .line 57
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 58
    .line 59
    .line 60
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 61
    .line 62
    check-cast v6, Li/m1;

    .line 63
    .line 64
    iput-boolean v2, v6, Li/m1;->l:Z

    .line 65
    .line 66
    :cond_6
    iget-object v6, p1, Le/t;->g:Landroid/view/View;

    .line 67
    .line 68
    if-nez v6, :cond_1d

    .line 69
    .line 70
    iget-object v6, p1, Le/t;->h:Lh/m;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    if-eqz v6, :cond_7

    .line 74
    .line 75
    iget-boolean v8, p1, Le/t;->o:Z

    .line 76
    .line 77
    if-eqz v8, :cond_17

    .line 78
    .line 79
    :cond_7
    if-nez v6, :cond_10

    .line 80
    .line 81
    iget-object v6, p0, Le/u;->e:Landroid/content/Context;

    .line 82
    .line 83
    if-eqz v3, :cond_8

    .line 84
    .line 85
    if-ne v3, v4, :cond_c

    .line 86
    .line 87
    :cond_8
    iget-object v4, p0, Le/u;->l:Li/n0;

    .line 88
    .line 89
    if-eqz v4, :cond_c

    .line 90
    .line 91
    new-instance v4, Landroid/util/TypedValue;

    .line 92
    .line 93
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    const v9, 0x7f040009

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 104
    .line 105
    .line 106
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    .line 107
    .line 108
    const v10, 0x7f04000a

    .line 109
    .line 110
    .line 111
    if-eqz v9, :cond_9

    .line 112
    .line 113
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 122
    .line 123
    .line 124
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    .line 125
    .line 126
    invoke-virtual {v9, v11, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_9
    invoke-virtual {v8, v10, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    move-object v9, v7

    .line 137
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    .line 138
    .line 139
    if-eqz v10, :cond_b

    .line 140
    .line 141
    if-nez v9, :cond_a

    .line 142
    .line 143
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 152
    .line 153
    .line 154
    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 155
    .line 156
    invoke-virtual {v9, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 157
    .line 158
    .line 159
    :cond_b
    if-eqz v9, :cond_c

    .line 160
    .line 161
    new-instance v4, Lg/d;

    .line 162
    .line 163
    invoke-direct {v4, v6, v1}, Lg/d;-><init>(Landroid/content/Context;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Lg/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 171
    .line 172
    .line 173
    move-object v6, v4

    .line 174
    :cond_c
    new-instance v4, Lh/m;

    .line 175
    .line 176
    invoke-direct {v4, v6}, Lh/m;-><init>(Landroid/content/Context;)V

    .line 177
    .line 178
    .line 179
    iput-object p0, v4, Lh/m;->e:Lh/k;

    .line 180
    .line 181
    iget-object v6, p1, Le/t;->h:Lh/m;

    .line 182
    .line 183
    if-ne v4, v6, :cond_d

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_d
    if-eqz v6, :cond_e

    .line 187
    .line 188
    iget-object v8, p1, Le/t;->i:Lh/i;

    .line 189
    .line 190
    invoke-virtual {v6, v8}, Lh/m;->r(Lh/z;)V

    .line 191
    .line 192
    .line 193
    :cond_e
    iput-object v4, p1, Le/t;->h:Lh/m;

    .line 194
    .line 195
    iget-object v6, p1, Le/t;->i:Lh/i;

    .line 196
    .line 197
    if-eqz v6, :cond_f

    .line 198
    .line 199
    iget-object v8, v4, Lh/m;->a:Landroid/content/Context;

    .line 200
    .line 201
    invoke-virtual {v4, v6, v8}, Lh/m;->b(Lh/z;Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    :cond_f
    :goto_3
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 205
    .line 206
    if-nez v4, :cond_10

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_10
    if-eqz v5, :cond_12

    .line 210
    .line 211
    iget-object v4, p0, Le/u;->l:Li/n0;

    .line 212
    .line 213
    if-eqz v4, :cond_12

    .line 214
    .line 215
    iget-object v6, p0, Le/u;->m:Le/m;

    .line 216
    .line 217
    if-nez v6, :cond_11

    .line 218
    .line 219
    new-instance v6, Le/m;

    .line 220
    .line 221
    const/4 v8, 0x2

    .line 222
    invoke-direct {v6, p0, v8}, Le/m;-><init>(Le/u;I)V

    .line 223
    .line 224
    .line 225
    iput-object v6, p0, Le/u;->m:Le/m;

    .line 226
    .line 227
    :cond_11
    iget-object v6, p1, Le/t;->h:Lh/m;

    .line 228
    .line 229
    iget-object v8, p0, Le/u;->m:Le/m;

    .line 230
    .line 231
    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 232
    .line 233
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/m;Lh/y;)V

    .line 234
    .line 235
    .line 236
    :cond_12
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 237
    .line 238
    invoke-virtual {v4}, Lh/m;->w()V

    .line 239
    .line 240
    .line 241
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 242
    .line 243
    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-nez v3, :cond_16

    .line 248
    .line 249
    iget-object p2, p1, Le/t;->h:Lh/m;

    .line 250
    .line 251
    if-nez p2, :cond_13

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_13
    if-eqz p2, :cond_14

    .line 255
    .line 256
    iget-object v0, p1, Le/t;->i:Lh/i;

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Lh/m;->r(Lh/z;)V

    .line 259
    .line 260
    .line 261
    :cond_14
    iput-object v7, p1, Le/t;->h:Lh/m;

    .line 262
    .line 263
    :goto_4
    if-eqz v5, :cond_15

    .line 264
    .line 265
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 266
    .line 267
    if-eqz p1, :cond_15

    .line 268
    .line 269
    iget-object p2, p0, Le/u;->m:Le/m;

    .line 270
    .line 271
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 272
    .line 273
    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/m;Lh/y;)V

    .line 274
    .line 275
    .line 276
    :cond_15
    :goto_5
    return v1

    .line 277
    :cond_16
    iput-boolean v1, p1, Le/t;->o:Z

    .line 278
    .line 279
    :cond_17
    iget-object v3, p1, Le/t;->h:Lh/m;

    .line 280
    .line 281
    invoke-virtual {v3}, Lh/m;->w()V

    .line 282
    .line 283
    .line 284
    iget-object v3, p1, Le/t;->p:Landroid/os/Bundle;

    .line 285
    .line 286
    if-eqz v3, :cond_18

    .line 287
    .line 288
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 289
    .line 290
    invoke-virtual {v4, v3}, Lh/m;->s(Landroid/os/Bundle;)V

    .line 291
    .line 292
    .line 293
    iput-object v7, p1, Le/t;->p:Landroid/os/Bundle;

    .line 294
    .line 295
    :cond_18
    iget-object v3, p1, Le/t;->g:Landroid/view/View;

    .line 296
    .line 297
    iget-object v4, p1, Le/t;->h:Lh/m;

    .line 298
    .line 299
    invoke-interface {v0, v1, v3, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-nez v0, :cond_1a

    .line 304
    .line 305
    if-eqz v5, :cond_19

    .line 306
    .line 307
    iget-object p2, p0, Le/u;->l:Li/n0;

    .line 308
    .line 309
    if-eqz p2, :cond_19

    .line 310
    .line 311
    iget-object v0, p0, Le/u;->m:Le/m;

    .line 312
    .line 313
    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 314
    .line 315
    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Lh/m;Lh/y;)V

    .line 316
    .line 317
    .line 318
    :cond_19
    iget-object p1, p1, Le/t;->h:Lh/m;

    .line 319
    .line 320
    invoke-virtual {p1}, Lh/m;->v()V

    .line 321
    .line 322
    .line 323
    return v1

    .line 324
    :cond_1a
    if-eqz p2, :cond_1b

    .line 325
    .line 326
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    goto :goto_6

    .line 331
    :cond_1b
    const/4 p2, -0x1

    .line 332
    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 337
    .line 338
    .line 339
    move-result p2

    .line 340
    if-eq p2, v2, :cond_1c

    .line 341
    .line 342
    move p2, v2

    .line 343
    goto :goto_7

    .line 344
    :cond_1c
    move p2, v1

    .line 345
    :goto_7
    iget-object v0, p1, Le/t;->h:Lh/m;

    .line 346
    .line 347
    invoke-virtual {v0, p2}, Lh/m;->setQwertyMode(Z)V

    .line 348
    .line 349
    .line 350
    iget-object p2, p1, Le/t;->h:Lh/m;

    .line 351
    .line 352
    invoke-virtual {p2}, Lh/m;->v()V

    .line 353
    .line 354
    .line 355
    :cond_1d
    iput-boolean v2, p1, Le/t;->k:Z

    .line 356
    .line 357
    iput-boolean v1, p1, Le/t;->l:Z

    .line 358
    .line 359
    iput-object p1, p0, Le/u;->G:Le/t;

    .line 360
    .line 361
    return v2
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/u;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v1, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/u;->e:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v0, v0, Le/u;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/u;->i:Le/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le/u;->y()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Le/u;->i:Le/E;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Le/u;->z(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/u;->I:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1}, Le/u;->m(Z)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Le/u;->v()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Le/u;->d:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v2, v1, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Lb1/h;->B(Landroid/app/Activity;Landroid/content/ComponentName;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    :catch_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Le/u;->i:Le/E;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iput-boolean v0, p0, Le/u;->V:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v1, v0}, Le/E;->T(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    sget-object v1, Le/k;->c:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v1

    .line 51
    :try_start_3
    invoke-static {p0}, Le/k;->e(Le/u;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Le/k;->b:Ll/c;

    .line 55
    .line 56
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ll/c;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    monitor-exit v1

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    .line 70
    .line 71
    iget-object v2, p0, Le/u;->e:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Le/u;->L:Landroid/content/res/Configuration;

    .line 85
    .line 86
    iput-boolean v0, p0, Le/u;->J:Z

    .line 87
    .line 88
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/u;->d:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Le/k;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {p0}, Le/k;->e(Le/u;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Le/u;->S:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Le/u;->U:Le/l;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Le/u;->K:Z

    .line 35
    .line 36
    iget v0, p0, Le/u;->M:I

    .line 37
    .line 38
    const/16 v1, -0x64

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Le/u;->d:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v1, v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Le/u;->Z:Ll/k;

    .line 57
    .line 58
    iget-object v1, p0, Le/u;->d:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v2, p0, Le/u;->M:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Ll/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Le/u;->Z:Ll/k;

    .line 79
    .line 80
    iget-object v1, p0, Le/u;->d:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ll/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, Le/u;->Q:Le/q;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object v0, p0, Le/u;->R:Le/q;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/fragment/app/g;->c()V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public final f(Lh/m;)V
    .locals 5

    .line 1
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 13
    .line 14
    check-cast p1, Li/m1;

    .line 15
    .line 16
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_6

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 25
    .line 26
    if-eqz p1, :cond_6

    .line 27
    .line 28
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->t:Z

    .line 29
    .line 30
    if-eqz p1, :cond_6

    .line 31
    .line 32
    iget-object p1, p0, Le/u;->e:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 45
    .line 46
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 52
    .line 53
    check-cast p1, Li/m1;

    .line 54
    .line 55
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 58
    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    iget-object v2, p1, Li/k;->v:Li/i;

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {p1}, Li/k;->h()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_6

    .line 74
    .line 75
    :cond_0
    iget-object p1, p0, Le/u;->f:Landroid/view/Window;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, p0, Le/u;->l:Li/n0;

    .line 82
    .line 83
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 86
    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 89
    .line 90
    check-cast v2, Li/m1;

    .line 91
    .line 92
    iget-object v2, v2, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 93
    .line 94
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 95
    .line 96
    if-eqz v2, :cond_1

    .line 97
    .line 98
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 99
    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    invoke-virtual {v2}, Li/k;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    move v2, v1

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    move v2, v0

    .line 111
    :goto_0
    const/16 v3, 0x6c

    .line 112
    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    iget-object v1, p0, Le/u;->l:Li/n0;

    .line 116
    .line 117
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 118
    .line 119
    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 120
    .line 121
    .line 122
    iget-object v1, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 123
    .line 124
    check-cast v1, Li/m1;

    .line 125
    .line 126
    iget-object v1, v1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 127
    .line 128
    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 129
    .line 130
    if-eqz v1, :cond_2

    .line 131
    .line 132
    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 133
    .line 134
    if-eqz v1, :cond_2

    .line 135
    .line 136
    invoke-virtual {v1}, Li/k;->f()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    :cond_2
    iget-boolean v1, p0, Le/u;->K:Z

    .line 141
    .line 142
    if-nez v1, :cond_5

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Le/u;->x(I)Le/t;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v0, v0, Le/t;->h:Lh/m;

    .line 149
    .line 150
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    if-eqz p1, :cond_5

    .line 155
    .line 156
    iget-boolean v2, p0, Le/u;->K:Z

    .line 157
    .line 158
    if-nez v2, :cond_5

    .line 159
    .line 160
    iget-boolean v2, p0, Le/u;->S:Z

    .line 161
    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    iget v2, p0, Le/u;->T:I

    .line 165
    .line 166
    and-int/2addr v1, v2

    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    iget-object v1, p0, Le/u;->f:Landroid/view/Window;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-object v2, p0, Le/u;->U:Le/l;

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Le/l;->run()V

    .line 181
    .line 182
    .line 183
    :cond_4
    invoke-virtual {p0, v0}, Le/u;->x(I)Le/t;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v2, v1, Le/t;->h:Lh/m;

    .line 188
    .line 189
    if-eqz v2, :cond_5

    .line 190
    .line 191
    iget-boolean v4, v1, Le/t;->o:Z

    .line 192
    .line 193
    if-nez v4, :cond_5

    .line 194
    .line 195
    iget-object v4, v1, Le/t;->g:Landroid/view/View;

    .line 196
    .line 197
    invoke-interface {p1, v0, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    iget-object v0, v1, Le/t;->h:Lh/m;

    .line 204
    .line 205
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 209
    .line 210
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 211
    .line 212
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 213
    .line 214
    .line 215
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 216
    .line 217
    check-cast p1, Li/m1;

    .line 218
    .line 219
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 220
    .line 221
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 222
    .line 223
    if-eqz p1, :cond_5

    .line 224
    .line 225
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 226
    .line 227
    if-eqz p1, :cond_5

    .line 228
    .line 229
    invoke-virtual {p1}, Li/k;->l()Z

    .line 230
    .line 231
    .line 232
    :cond_5
    return-void

    .line 233
    :cond_6
    invoke-virtual {p0, v0}, Le/u;->x(I)Le/t;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iput-boolean v1, p1, Le/t;->n:Z

    .line 238
    .line 239
    invoke-virtual {p0, p1, v0}, Le/u;->q(Le/t;Z)V

    .line 240
    .line 241
    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-virtual {p0, p1, v0}, Le/u;->B(Le/t;Landroid/view/KeyEvent;)V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public final g(Lh/m;Landroid/view/MenuItem;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, Le/u;->K:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Lh/m;->k()Lh/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v2, p0, Le/u;->F:[Le/t;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    array-length v3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_0
    move v4, v1

    .line 26
    :goto_1
    if-ge v4, v3, :cond_2

    .line 27
    .line 28
    aget-object v5, v2, v4

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    iget-object v6, v5, Le/t;->h:Lh/m;

    .line 33
    .line 34
    if-ne v6, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v5, 0x0

    .line 41
    :goto_2
    if-eqz v5, :cond_3

    .line 42
    .line 43
    iget p1, v5, Le/t;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    return v1
.end method

.method public final h(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x6d

    .line 2
    .line 3
    const/16 v1, 0x6c

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-string v3, "AppCompatDelegate"

    .line 8
    .line 9
    if-ne p1, v2, :cond_0

    .line 10
    .line 11
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move p1, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x9

    .line 19
    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 23
    .line 24
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move p1, v0

    .line 28
    :cond_1
    :goto_0
    iget-boolean v2, p0, Le/u;->D:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    if-ne p1, v1, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-boolean v2, p0, Le/u;->z:Z

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    iput-boolean v3, p0, Le/u;->z:Z

    .line 44
    .line 45
    :cond_3
    if-eq p1, v4, :cond_9

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    if-eq p1, v2, :cond_8

    .line 49
    .line 50
    const/4 v2, 0x5

    .line 51
    if-eq p1, v2, :cond_7

    .line 52
    .line 53
    const/16 v2, 0xa

    .line 54
    .line 55
    if-eq p1, v2, :cond_6

    .line 56
    .line 57
    if-eq p1, v1, :cond_5

    .line 58
    .line 59
    if-eq p1, v0, :cond_4

    .line 60
    .line 61
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_4
    invoke-virtual {p0}, Le/u;->E()V

    .line 69
    .line 70
    .line 71
    iput-boolean v4, p0, Le/u;->A:Z

    .line 72
    .line 73
    return v4

    .line 74
    :cond_5
    invoke-virtual {p0}, Le/u;->E()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Le/u;->z:Z

    .line 78
    .line 79
    return v4

    .line 80
    :cond_6
    invoke-virtual {p0}, Le/u;->E()V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, Le/u;->B:Z

    .line 84
    .line 85
    return v4

    .line 86
    :cond_7
    invoke-virtual {p0}, Le/u;->E()V

    .line 87
    .line 88
    .line 89
    iput-boolean v4, p0, Le/u;->y:Z

    .line 90
    .line 91
    return v4

    .line 92
    :cond_8
    invoke-virtual {p0}, Le/u;->E()V

    .line 93
    .line 94
    .line 95
    iput-boolean v4, p0, Le/u;->x:Z

    .line 96
    .line 97
    return v4

    .line 98
    :cond_9
    invoke-virtual {p0}, Le/u;->E()V

    .line 99
    .line 100
    .line 101
    iput-boolean v4, p0, Le/u;->D:Z

    .line 102
    .line 103
    return v4
.end method

.method public final i(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/u;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/u;->u:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Le/u;->e:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Le/u;->g:Le/p;

    .line 28
    .line 29
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Le/p;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final j(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/u;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/u;->u:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Le/u;->g:Le/p;

    .line 22
    .line 23
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Le/p;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/u;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/u;->u:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Le/u;->g:Le/p;

    .line 22
    .line 23
    iget-object p2, p0, Le/u;->f:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Le/p;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final l(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Le/u;->k:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Le/u;->l:Li/n0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Li/n0;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Le/u;->i:Le/E;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Le/E;->t:Li/o0;

    .line 16
    .line 17
    check-cast v0, Li/m1;

    .line 18
    .line 19
    iget-boolean v1, v0, Li/m1;->g:Z

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    iput-object p1, v0, Li/m1;->h:Ljava/lang/CharSequence;

    .line 24
    .line 25
    iget v1, v0, Li/m1;->b:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, v0, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, v0, Li/m1;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, p1}, Ly/L;->j(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Le/u;->v:Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final m(Z)Z
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-boolean v1, p0, Le/u;->K:Z

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    iget v1, p0, Le/u;->M:I

    .line 9
    .line 10
    const/16 v3, -0x64

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v1, v3

    .line 16
    :goto_0
    iget-object v3, p0, Le/u;->e:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p0, v3, v1}, Le/u;->A(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v3, v4, v5, v2}, Le/u;->r(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-boolean v6, p0, Le/u;->P:Z

    .line 28
    .line 29
    iget-object v7, p0, Le/u;->d:Ljava/lang/Object;

    .line 30
    .line 31
    if-nez v6, :cond_5

    .line 32
    .line 33
    instance-of v6, v7, Landroid/app/Activity;

    .line 34
    .line 35
    if-eqz v6, :cond_5

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    move v6, v2

    .line 44
    goto :goto_5

    .line 45
    :cond_2
    :try_start_0
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v9, 0x1d

    .line 48
    .line 49
    if-lt v8, v9, :cond_3

    .line 50
    .line 51
    const/high16 v8, 0x100c0000

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/high16 v8, 0xc0000

    .line 55
    .line 56
    :goto_1
    new-instance v9, Landroid/content/ComponentName;

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-direct {v9, v3, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6, v9, v8}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    iget v6, v6, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 72
    .line 73
    and-int/lit16 v6, v6, 0x200

    .line 74
    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    move v6, v0

    .line 78
    goto :goto_2

    .line 79
    :catch_0
    move-exception v6

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v6, v2

    .line 82
    :goto_2
    iput-boolean v6, p0, Le/u;->O:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :goto_3
    const-string v8, "AppCompatDelegate"

    .line 86
    .line 87
    const-string v9, "Exception while getting ActivityInfo"

    .line 88
    .line 89
    invoke-static {v8, v9, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 90
    .line 91
    .line 92
    iput-boolean v2, p0, Le/u;->O:Z

    .line 93
    .line 94
    :cond_5
    :goto_4
    iput-boolean v0, p0, Le/u;->P:Z

    .line 95
    .line 96
    iget-boolean v6, p0, Le/u;->O:Z

    .line 97
    .line 98
    :goto_5
    iget-object v8, p0, Le/u;->L:Landroid/content/res/Configuration;

    .line 99
    .line 100
    if-nez v8, :cond_6

    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    :cond_6
    iget v8, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 111
    .line 112
    and-int/lit8 v8, v8, 0x30

    .line 113
    .line 114
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 115
    .line 116
    and-int/lit8 v4, v4, 0x30

    .line 117
    .line 118
    const/16 v9, 0x1c

    .line 119
    .line 120
    if-eq v8, v4, :cond_9

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    if-nez v6, :cond_9

    .line 125
    .line 126
    iget-boolean p1, p0, Le/u;->I:Z

    .line 127
    .line 128
    if-eqz p1, :cond_9

    .line 129
    .line 130
    sget-boolean p1, Le/u;->b0:Z

    .line 131
    .line 132
    if-nez p1, :cond_7

    .line 133
    .line 134
    iget-boolean p1, p0, Le/u;->J:Z

    .line 135
    .line 136
    if-eqz p1, :cond_9

    .line 137
    .line 138
    :cond_7
    instance-of p1, v7, Landroid/app/Activity;

    .line 139
    .line 140
    if-eqz p1, :cond_9

    .line 141
    .line 142
    move-object p1, v7

    .line 143
    check-cast p1, Landroid/app/Activity;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-nez v10, :cond_9

    .line 150
    .line 151
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 152
    .line 153
    if-lt v2, v9, :cond_8

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    new-instance v2, Landroid/os/Handler;

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-direct {v2, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 166
    .line 167
    .line 168
    new-instance v10, LA0/v;

    .line 169
    .line 170
    invoke-direct {v10, p1, v0}, LA0/v;-><init>(Landroid/app/Activity;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 174
    .line 175
    .line 176
    :goto_6
    move v2, v0

    .line 177
    :cond_9
    if-nez v2, :cond_17

    .line 178
    .line 179
    if-eq v8, v4, :cond_17

    .line 180
    .line 181
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance v2, Landroid/content/res/Configuration;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-direct {v2, v8}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    iget v8, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 199
    .line 200
    and-int/lit8 v8, v8, -0x31

    .line 201
    .line 202
    or-int/2addr v4, v8

    .line 203
    iput v4, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 204
    .line 205
    invoke-virtual {p1, v2, v5}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 206
    .line 207
    .line 208
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    const/16 v8, 0x1a

    .line 211
    .line 212
    if-ge v4, v8, :cond_14

    .line 213
    .line 214
    if-lt v4, v9, :cond_a

    .line 215
    .line 216
    goto/16 :goto_e

    .line 217
    .line 218
    :cond_a
    sget-boolean v4, Lb1/h;->h:Z

    .line 219
    .line 220
    const-string v8, "ResourcesFlusher"

    .line 221
    .line 222
    if-nez v4, :cond_b

    .line 223
    .line 224
    :try_start_1
    const-class v4, Landroid/content/res/Resources;

    .line 225
    .line 226
    const-string v9, "mResourcesImpl"

    .line 227
    .line 228
    invoke-virtual {v4, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    sput-object v4, Lb1/h;->g:Ljava/lang/reflect/Field;

    .line 233
    .line 234
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :catch_1
    move-exception v4

    .line 239
    const-string v9, "Could not retrieve Resources#mResourcesImpl field"

    .line 240
    .line 241
    invoke-static {v8, v9, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 242
    .line 243
    .line 244
    :goto_7
    sput-boolean v0, Lb1/h;->h:Z

    .line 245
    .line 246
    :cond_b
    sget-object v4, Lb1/h;->g:Ljava/lang/reflect/Field;

    .line 247
    .line 248
    if-nez v4, :cond_c

    .line 249
    .line 250
    goto/16 :goto_e

    .line 251
    .line 252
    :cond_c
    :try_start_2
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 256
    goto :goto_8

    .line 257
    :catch_2
    move-exception p1

    .line 258
    const-string v4, "Could not retrieve value from Resources#mResourcesImpl"

    .line 259
    .line 260
    invoke-static {v8, v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 261
    .line 262
    .line 263
    move-object p1, v5

    .line 264
    :goto_8
    if-nez p1, :cond_d

    .line 265
    .line 266
    goto/16 :goto_e

    .line 267
    .line 268
    :cond_d
    sget-boolean v4, Lb1/h;->b:Z

    .line 269
    .line 270
    if-nez v4, :cond_e

    .line 271
    .line 272
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    const-string v9, "mDrawableCache"

    .line 277
    .line 278
    invoke-virtual {v4, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    sput-object v4, Lb1/h;->a:Ljava/lang/reflect/Field;

    .line 283
    .line 284
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3

    .line 285
    .line 286
    .line 287
    goto :goto_9

    .line 288
    :catch_3
    move-exception v4

    .line 289
    const-string v9, "Could not retrieve ResourcesImpl#mDrawableCache field"

    .line 290
    .line 291
    invoke-static {v8, v9, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 292
    .line 293
    .line 294
    :goto_9
    sput-boolean v0, Lb1/h;->b:Z

    .line 295
    .line 296
    :cond_e
    sget-object v4, Lb1/h;->a:Ljava/lang/reflect/Field;

    .line 297
    .line 298
    if-eqz v4, :cond_f

    .line 299
    .line 300
    :try_start_4
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 304
    goto :goto_a

    .line 305
    :catch_4
    move-exception p1

    .line 306
    const-string v4, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    .line 307
    .line 308
    invoke-static {v8, v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 309
    .line 310
    .line 311
    :cond_f
    move-object p1, v5

    .line 312
    :goto_a
    if-eqz p1, :cond_14

    .line 313
    .line 314
    sget-boolean v4, Lb1/h;->d:Z

    .line 315
    .line 316
    if-nez v4, :cond_10

    .line 317
    .line 318
    :try_start_5
    const-string v4, "android.content.res.ThemedResourceCache"

    .line 319
    .line 320
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    sput-object v4, Lb1/h;->c:Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :catch_5
    move-exception v4

    .line 328
    const-string v9, "Could not find ThemedResourceCache class"

    .line 329
    .line 330
    invoke-static {v8, v9, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 331
    .line 332
    .line 333
    :goto_b
    sput-boolean v0, Lb1/h;->d:Z

    .line 334
    .line 335
    :cond_10
    sget-object v4, Lb1/h;->c:Ljava/lang/Class;

    .line 336
    .line 337
    if-nez v4, :cond_11

    .line 338
    .line 339
    goto :goto_e

    .line 340
    :cond_11
    sget-boolean v9, Lb1/h;->f:Z

    .line 341
    .line 342
    if-nez v9, :cond_12

    .line 343
    .line 344
    :try_start_6
    const-string v9, "mUnthemedEntries"

    .line 345
    .line 346
    invoke-virtual {v4, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    sput-object v4, Lb1/h;->e:Ljava/lang/reflect/Field;

    .line 351
    .line 352
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    .line 353
    .line 354
    .line 355
    goto :goto_c

    .line 356
    :catch_6
    move-exception v4

    .line 357
    const-string v9, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    .line 358
    .line 359
    invoke-static {v8, v9, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 360
    .line 361
    .line 362
    :goto_c
    sput-boolean v0, Lb1/h;->f:Z

    .line 363
    .line 364
    :cond_12
    sget-object v4, Lb1/h;->e:Ljava/lang/reflect/Field;

    .line 365
    .line 366
    if-nez v4, :cond_13

    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_13
    :try_start_7
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    check-cast p1, Landroid/util/LongSparseArray;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    .line 374
    .line 375
    move-object v5, p1

    .line 376
    goto :goto_d

    .line 377
    :catch_7
    move-exception p1

    .line 378
    const-string v4, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    .line 379
    .line 380
    invoke-static {v8, v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 381
    .line 382
    .line 383
    :goto_d
    if-eqz v5, :cond_14

    .line 384
    .line 385
    invoke-static {v5}, Le/z;->a(Landroid/util/LongSparseArray;)V

    .line 386
    .line 387
    .line 388
    :cond_14
    :goto_e
    iget p1, p0, Le/u;->N:I

    .line 389
    .line 390
    if-eqz p1, :cond_15

    .line 391
    .line 392
    invoke-virtual {v3, p1}, Landroid/content/Context;->setTheme(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    iget v4, p0, Le/u;->N:I

    .line 400
    .line 401
    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 402
    .line 403
    .line 404
    :cond_15
    if-eqz v6, :cond_18

    .line 405
    .line 406
    instance-of p1, v7, Landroid/app/Activity;

    .line 407
    .line 408
    if-eqz p1, :cond_18

    .line 409
    .line 410
    move-object p1, v7

    .line 411
    check-cast p1, Landroid/app/Activity;

    .line 412
    .line 413
    instance-of v4, p1, Landroidx/lifecycle/s;

    .line 414
    .line 415
    if-eqz v4, :cond_16

    .line 416
    .line 417
    move-object v4, p1

    .line 418
    check-cast v4, Landroidx/lifecycle/s;

    .line 419
    .line 420
    invoke-interface {v4}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    iget-object v4, v4, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 425
    .line 426
    sget-object v5, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n;

    .line 427
    .line 428
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-ltz v4, :cond_18

    .line 433
    .line 434
    invoke-virtual {p1, v2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 435
    .line 436
    .line 437
    goto :goto_f

    .line 438
    :cond_16
    iget-boolean v4, p0, Le/u;->J:Z

    .line 439
    .line 440
    if-eqz v4, :cond_18

    .line 441
    .line 442
    iget-boolean v4, p0, Le/u;->K:Z

    .line 443
    .line 444
    if-nez v4, :cond_18

    .line 445
    .line 446
    invoke-virtual {p1, v2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 447
    .line 448
    .line 449
    goto :goto_f

    .line 450
    :cond_17
    move v0, v2

    .line 451
    :cond_18
    :goto_f
    if-eqz v0, :cond_19

    .line 452
    .line 453
    instance-of p1, v7, Le/i;

    .line 454
    .line 455
    if-eqz p1, :cond_19

    .line 456
    .line 457
    check-cast v7, Le/i;

    .line 458
    .line 459
    :cond_19
    if-nez v1, :cond_1a

    .line 460
    .line 461
    invoke-virtual {p0, v3}, Le/u;->w(Landroid/content/Context;)Landroidx/fragment/app/g;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    invoke-virtual {p1}, Landroidx/fragment/app/g;->i()V

    .line 466
    .line 467
    .line 468
    goto :goto_10

    .line 469
    :cond_1a
    iget-object p1, p0, Le/u;->Q:Le/q;

    .line 470
    .line 471
    if-eqz p1, :cond_1b

    .line 472
    .line 473
    invoke-virtual {p1}, Landroidx/fragment/app/g;->c()V

    .line 474
    .line 475
    .line 476
    :cond_1b
    :goto_10
    const/4 p1, 0x3

    .line 477
    if-ne v1, p1, :cond_1d

    .line 478
    .line 479
    iget-object p1, p0, Le/u;->R:Le/q;

    .line 480
    .line 481
    if-nez p1, :cond_1c

    .line 482
    .line 483
    new-instance p1, Le/q;

    .line 484
    .line 485
    invoke-direct {p1, p0, v3}, Le/q;-><init>(Le/u;Landroid/content/Context;)V

    .line 486
    .line 487
    .line 488
    iput-object p1, p0, Le/u;->R:Le/q;

    .line 489
    .line 490
    :cond_1c
    iget-object p1, p0, Le/u;->R:Le/q;

    .line 491
    .line 492
    invoke-virtual {p1}, Landroidx/fragment/app/g;->i()V

    .line 493
    .line 494
    .line 495
    goto :goto_11

    .line 496
    :cond_1d
    iget-object p1, p0, Le/u;->R:Le/q;

    .line 497
    .line 498
    if-eqz p1, :cond_1e

    .line 499
    .line 500
    invoke-virtual {p1}, Landroidx/fragment/app/g;->c()V

    .line 501
    .line 502
    .line 503
    :cond_1e
    :goto_11
    return v0
.end method

.method public final n(Landroid/view/Window;)V
    .locals 6

    .line 1
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 2
    .line 3
    const-string v1, "AppCompat has already installed itself into the Window"

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v2, v0, Le/p;

    .line 12
    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    new-instance v1, Le/p;

    .line 16
    .line 17
    invoke-direct {v1, p0, v0}, Le/p;-><init>(Le/u;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Le/u;->g:Le/p;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Le/u;->a0:[I

    .line 26
    .line 27
    iget-object v1, p0, Le/u;->e:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Li/u;->a()Li/u;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v2, v4, Li/u;->a:Li/N0;

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-virtual {v2, v1, v3, v5}, Li/N0;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1

    .line 64
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Le/u;->f:Landroid/view/Window;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public final o(ILe/t;Lh/m;)V
    .locals 3

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Le/u;->F:[Le/t;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Le/t;->h:Lh/m;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Le/t;->m:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, Le/u;->K:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Le/u;->g:Le/p;

    .line 30
    .line 31
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_0
    iput-boolean v1, p2, Le/p;->e:Z

    .line 43
    .line 44
    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p2, Le/p;->e:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iput-boolean v2, p2, Le/p;->e:Z

    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x3

    const/4 v6, -0x1

    const/4 v7, 0x4

    const/4 v8, 0x1

    .line 1
    iget-object v0, v1, Le/u;->Y:Le/y;

    const/4 v9, 0x0

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Ld/a;->j:[I

    iget-object v10, v1, Le/u;->e:Landroid/content/Context;

    invoke-virtual {v10, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v11, 0x74

    .line 3
    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_0

    .line 4
    new-instance v0, Le/y;

    invoke-direct {v0}, Le/y;-><init>()V

    iput-object v0, v1, Le/u;->Y:Le/y;

    goto :goto_0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/y;

    iput-object v0, v1, Le/u;->Y:Le/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "Failed to instantiate custom view inflater "

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ". Falling back to default."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "AppCompatDelegate"

    invoke-static {v11, v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    new-instance v0, Le/y;

    invoke-direct {v0}, Le/y;-><init>()V

    iput-object v0, v1, Le/u;->Y:Le/y;

    .line 10
    :cond_1
    :goto_0
    iget-object v0, v1, Le/u;->Y:Le/y;

    .line 11
    sget v10, Li/r1;->a:I

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    sget-object v10, Ld/a;->y:[I

    const/4 v14, 0x0

    invoke-virtual {v3, v4, v10, v14, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v10

    .line 14
    invoke-virtual {v10, v7, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    if-eqz v11, :cond_2

    .line 15
    const-string v12, "AppCompatViewInflater"

    const-string v13, "app:theme is now deprecated. Please move to using android:theme instead."

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    :cond_2
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v11, :cond_4

    .line 17
    instance-of v10, v3, Lg/d;

    if-eqz v10, :cond_3

    move-object v10, v3

    check-cast v10, Lg/d;

    .line 18
    iget v10, v10, Lg/d;->a:I

    if-eq v10, v11, :cond_4

    .line 19
    :cond_3
    new-instance v10, Lg/d;

    invoke-direct {v10, v3, v11}, Lg/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_4
    move-object v10, v3

    .line 20
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    :goto_2
    move v7, v6

    goto/16 :goto_3

    :sswitch_0
    const-string v7, "Button"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_2

    :cond_5
    const/16 v7, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v7, "EditText"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_2

    :cond_6
    const/16 v7, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v7, "CheckBox"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_2

    :cond_7
    const/16 v7, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v7, "AutoCompleteTextView"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_2

    :cond_8
    const/16 v7, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v7, "ImageView"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_2

    :cond_9
    const/16 v7, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v7, "ToggleButton"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_2

    :cond_a
    const/16 v7, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v7, "RadioButton"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_2

    :cond_b
    const/4 v7, 0x7

    goto :goto_3

    :sswitch_7
    const-string v7, "Spinner"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_2

    :cond_c
    const/4 v7, 0x6

    goto :goto_3

    :sswitch_8
    const-string v7, "SeekBar"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_2

    :cond_d
    const/4 v7, 0x5

    goto :goto_3

    :sswitch_9
    const-string v11, "ImageButton"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    goto :goto_2

    :sswitch_a
    const-string v7, "TextView"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_2

    :cond_e
    move v7, v5

    goto :goto_3

    :sswitch_b
    const-string v7, "MultiAutoCompleteTextView"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto/16 :goto_2

    :cond_f
    const/4 v7, 0x2

    goto :goto_3

    :sswitch_c
    const-string v7, "CheckedTextView"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    goto/16 :goto_2

    :cond_10
    move v7, v8

    goto :goto_3

    :sswitch_d
    const-string v7, "RatingBar"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto/16 :goto_2

    :cond_11
    const/4 v7, 0x0

    :cond_12
    :goto_3
    packed-switch v7, :pswitch_data_0

    move-object v7, v9

    goto :goto_4

    .line 21
    :pswitch_0
    new-instance v7, Li/q;

    invoke-direct {v7, v10, v4}, Li/q;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 22
    :pswitch_1
    new-instance v7, Li/v;

    invoke-direct {v7, v10, v4}, Li/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 23
    :pswitch_2
    new-instance v7, Li/r;

    invoke-direct {v7, v10, v4}, Li/r;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 24
    :pswitch_3
    new-instance v7, Li/o;

    .line 25
    invoke-direct {v7, v10, v4}, Li/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 26
    :pswitch_4
    new-instance v7, Li/z;

    .line 27
    invoke-direct {v7, v10, v4, v14}, Li/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 28
    :pswitch_5
    new-instance v7, Li/l0;

    invoke-direct {v7, v10, v4}, Li/l0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 29
    :pswitch_6
    new-instance v7, Li/D;

    invoke-direct {v7, v10, v4}, Li/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_7
    new-instance v7, Li/U;

    invoke-direct {v7, v10, v4}, Li/U;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 31
    :pswitch_8
    new-instance v7, Li/G;

    invoke-direct {v7, v10, v4}, Li/G;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 32
    :pswitch_9
    new-instance v7, Li/x;

    const v11, 0x7f04009b

    .line 33
    invoke-direct {v7, v10, v4, v11}, Li/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 34
    :pswitch_a
    new-instance v7, Li/d0;

    invoke-direct {v7, v10, v4}, Li/d0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 35
    :pswitch_b
    new-instance v7, Li/A;

    invoke-direct {v7, v10, v4}, Li/A;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 36
    :pswitch_c
    new-instance v7, Li/s;

    invoke-direct {v7, v10, v4}, Li/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 37
    :pswitch_d
    new-instance v7, Li/E;

    invoke-direct {v7, v10, v4}, Li/E;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v7, :cond_17

    if-eq v3, v10, :cond_17

    .line 38
    iget-object v3, v0, Le/y;->a:[Ljava/lang/Object;

    const-string v7, "view"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 39
    const-string v2, "class"

    invoke-interface {v4, v9, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 40
    :cond_13
    :try_start_1
    aput-object v10, v3, v14

    .line 41
    aput-object v4, v3, v8

    const/16 v7, 0x2e

    .line 42
    invoke-virtual {v2, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-ne v6, v7, :cond_16

    move v6, v14

    .line 43
    :goto_5
    sget-object v7, Le/y;->g:[Ljava/lang/String;

    if-ge v6, v5, :cond_15

    .line 44
    aget-object v7, v7, v6

    invoke-virtual {v0, v10, v2, v7}, Le/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v7, :cond_14

    .line 45
    aput-object v9, v3, v14

    .line 46
    aput-object v9, v3, v8

    move-object v9, v7

    goto :goto_7

    :cond_14
    add-int/2addr v6, v8

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    .line 47
    :cond_15
    aput-object v9, v3, v14

    .line 48
    aput-object v9, v3, v8

    goto :goto_7

    .line 49
    :cond_16
    :try_start_2
    invoke-virtual {v0, v10, v2, v9}, Le/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    aput-object v9, v3, v14

    .line 51
    aput-object v9, v3, v8

    move-object v9, v0

    goto :goto_7

    .line 52
    :goto_6
    aput-object v9, v3, v14

    .line 53
    aput-object v9, v3, v8

    .line 54
    throw v0

    .line 55
    :catch_0
    aput-object v9, v3, v14

    .line 56
    aput-object v9, v3, v8

    :goto_7
    move-object v7, v9

    :cond_17
    if-eqz v7, :cond_1f

    .line 57
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 58
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1a

    .line 59
    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 60
    invoke-virtual {v7}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_8

    .line 61
    :cond_18
    sget-object v2, Le/y;->c:[I

    invoke-virtual {v0, v4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 62
    invoke-virtual {v0, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_19

    .line 63
    new-instance v3, Le/x;

    invoke-direct {v3, v7, v2}, Le/x;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    :cond_19
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 65
    :cond_1a
    :goto_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1c

    if-le v0, v15, :cond_1b

    goto :goto_9

    .line 66
    :cond_1b
    sget-object v0, Le/y;->d:[I

    invoke-virtual {v10, v4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 67
    invoke-virtual {v0, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const-class v13, Ljava/lang/Boolean;

    if-eqz v2, :cond_1c

    .line 68
    invoke-virtual {v0, v14, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    .line 69
    sget-object v3, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 70
    new-instance v11, Ly/x;

    const v12, 0x7f09009a

    const/16 v16, 0x2

    .line 71
    invoke-direct/range {v11 .. v16}, Ly/x;-><init>(ILjava/lang/Class;III)V

    .line 72
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v11, v7, v2}, LG/c;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 73
    :cond_1c
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    sget-object v0, Le/y;->e:[I

    invoke-virtual {v10, v4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 75
    invoke-virtual {v0, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 76
    invoke-virtual {v0, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Ly/L;->j(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 77
    :cond_1d
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    sget-object v0, Le/y;->f:[I

    invoke-virtual {v10, v4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 79
    invoke-virtual {v0, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 80
    invoke-virtual {v0, v14, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    .line 81
    sget-object v3, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 82
    new-instance v11, Ly/x;

    const v12, 0x7f09009f

    const/16 v16, 0x0

    .line 83
    invoke-direct/range {v11 .. v16}, Ly/x;-><init>(ILjava/lang/Class;III)V

    .line 84
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v11, v7, v2}, LG/c;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 85
    :cond_1e
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1f
    :goto_9
    return-object v7

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, v0, p1, p2, p3}, Le/u;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lh/m;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/u;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Le/u;->E:Z

    .line 8
    .line 9
    iget-object v0, p0, Le/u;->l:Li/n0;

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 17
    .line 18
    check-cast v0, Li/m1;

    .line 19
    .line 20
    iget-object v0, v0, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Li/k;->f()Z

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Li/k;->u:Li/g;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lh/x;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lh/x;->i:Lh/u;

    .line 44
    .line 45
    invoke-interface {v0}, Lh/D;->dismiss()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-boolean v1, p0, Le/u;->K:Z

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    const/16 v1, 0x6c

    .line 61
    .line 62
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Le/u;->E:Z

    .line 67
    .line 68
    return-void
.end method

.method public final q(Le/t;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Le/t;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Le/u;->l:Li/n0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 17
    .line 18
    check-cast v0, Li/m1;

    .line 19
    .line 20
    iget-object v0, v0, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Li/k;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Le/t;->h:Lh/m;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Le/u;->p(Lh/m;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Le/u;->e:Landroid/content/Context;

    .line 43
    .line 44
    const-string v1, "window"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/WindowManager;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-boolean v2, p1, Le/t;->m:Z

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget-object v2, p1, Le/t;->e:Le/s;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    iget p2, p1, Le/t;->a:I

    .line 69
    .line 70
    invoke-virtual {p0, p2, p1, v1}, Le/u;->o(ILe/t;Lh/m;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 p2, 0x0

    .line 74
    iput-boolean p2, p1, Le/t;->k:Z

    .line 75
    .line 76
    iput-boolean p2, p1, Le/t;->l:Z

    .line 77
    .line 78
    iput-boolean p2, p1, Le/t;->m:Z

    .line 79
    .line 80
    iput-object v1, p1, Le/t;->f:Landroid/view/View;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p1, Le/t;->n:Z

    .line 84
    .line 85
    iget-object p2, p0, Le/u;->G:Le/t;

    .line 86
    .line 87
    if-ne p2, p1, :cond_2

    .line 88
    .line 89
    iput-object v1, p0, Le/u;->G:Le/t;

    .line 90
    .line 91
    :cond_2
    return-void
.end method

.method public final s(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Le/u;->d:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ly/j;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Le/w;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, Lb1/h;->q(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v3, 0x52

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Le/u;->g:Le/p;

    .line 38
    .line 39
    iget-object v4, p0, Le/u;->f:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    :try_start_0
    iput-boolean v2, v0, Le/p;->d:Z

    .line 49
    .line 50
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iput-boolean v1, v0, Le/p;->d:Z

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :catchall_0
    move-exception p1

    .line 61
    iput-boolean v1, v0, Le/p;->d:Z

    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    if-eq v0, v5, :cond_4

    .line 76
    .line 77
    if-eq v0, v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_9

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_16

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Le/u;->x(I)Le/t;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v1, v0, Le/t;->m:Z

    .line 92
    .line 93
    if-nez v1, :cond_16

    .line 94
    .line 95
    invoke-virtual {p0, v0, p1}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    and-int/lit16 p1, p1, 0x80

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move v2, v1

    .line 109
    :goto_0
    iput-boolean v2, p0, Le/u;->H:Z

    .line 110
    .line 111
    return v1

    .line 112
    :cond_6
    if-eq v0, v5, :cond_10

    .line 113
    .line 114
    if-eq v0, v3, :cond_7

    .line 115
    .line 116
    goto/16 :goto_9

    .line 117
    .line 118
    :cond_7
    iget-object v0, p0, Le/u;->o:Lg/a;

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :cond_8
    invoke-virtual {p0, v1}, Le/u;->x(I)Le/t;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v3, p0, Le/u;->l:Li/n0;

    .line 129
    .line 130
    iget-object v4, p0, Le/u;->e:Landroid/content/Context;

    .line 131
    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 137
    .line 138
    .line 139
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 140
    .line 141
    check-cast v3, Li/m1;

    .line 142
    .line 143
    iget-object v3, v3, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 144
    .line 145
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_a

    .line 150
    .line 151
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 152
    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->t:Z

    .line 156
    .line 157
    if-eqz v3, :cond_a

    .line 158
    .line 159
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    iget-object v3, p0, Le/u;->l:Li/n0;

    .line 170
    .line 171
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 172
    .line 173
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 174
    .line 175
    .line 176
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 177
    .line 178
    check-cast v3, Li/m1;

    .line 179
    .line 180
    iget-object v3, v3, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 181
    .line 182
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 183
    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 187
    .line 188
    if-eqz v3, :cond_9

    .line 189
    .line 190
    invoke-virtual {v3}, Li/k;->h()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_9

    .line 195
    .line 196
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 197
    .line 198
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 201
    .line 202
    .line 203
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 204
    .line 205
    check-cast p1, Li/m1;

    .line 206
    .line 207
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 208
    .line 209
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 210
    .line 211
    if-eqz p1, :cond_d

    .line 212
    .line 213
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 214
    .line 215
    if-eqz p1, :cond_d

    .line 216
    .line 217
    invoke-virtual {p1}, Li/k;->f()Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_d

    .line 222
    .line 223
    :goto_1
    goto :goto_3

    .line 224
    :cond_9
    iget-boolean v3, p0, Le/u;->K:Z

    .line 225
    .line 226
    if-nez v3, :cond_d

    .line 227
    .line 228
    invoke-virtual {p0, v0, p1}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_d

    .line 233
    .line 234
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 235
    .line 236
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 237
    .line 238
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 239
    .line 240
    .line 241
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Li/o0;

    .line 242
    .line 243
    check-cast p1, Li/m1;

    .line 244
    .line 245
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 246
    .line 247
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 248
    .line 249
    if-eqz p1, :cond_d

    .line 250
    .line 251
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 252
    .line 253
    if-eqz p1, :cond_d

    .line 254
    .line 255
    invoke-virtual {p1}, Li/k;->l()Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_d

    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_a
    iget-boolean v3, v0, Le/t;->m:Z

    .line 263
    .line 264
    if-nez v3, :cond_e

    .line 265
    .line 266
    iget-boolean v5, v0, Le/t;->l:Z

    .line 267
    .line 268
    if-eqz v5, :cond_b

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_b
    iget-boolean v3, v0, Le/t;->k:Z

    .line 272
    .line 273
    if-eqz v3, :cond_d

    .line 274
    .line 275
    iget-boolean v3, v0, Le/t;->o:Z

    .line 276
    .line 277
    if-eqz v3, :cond_c

    .line 278
    .line 279
    iput-boolean v1, v0, Le/t;->k:Z

    .line 280
    .line 281
    invoke-virtual {p0, v0, p1}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    goto :goto_2

    .line 286
    :cond_c
    move v3, v2

    .line 287
    :goto_2
    if-eqz v3, :cond_d

    .line 288
    .line 289
    invoke-virtual {p0, v0, p1}, Le/u;->B(Le/t;Landroid/view/KeyEvent;)V

    .line 290
    .line 291
    .line 292
    :goto_3
    move p1, v2

    .line 293
    goto :goto_5

    .line 294
    :cond_d
    move p1, v1

    .line 295
    goto :goto_5

    .line 296
    :cond_e
    :goto_4
    invoke-virtual {p0, v0, v2}, Le/u;->q(Le/t;Z)V

    .line 297
    .line 298
    .line 299
    move p1, v3

    .line 300
    :goto_5
    if-eqz p1, :cond_16

    .line 301
    .line 302
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string v0, "audio"

    .line 307
    .line 308
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    check-cast p1, Landroid/media/AudioManager;

    .line 313
    .line 314
    if-eqz p1, :cond_f

    .line 315
    .line 316
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 317
    .line 318
    .line 319
    return v2

    .line 320
    :cond_f
    const-string p1, "AppCompatDelegate"

    .line 321
    .line 322
    const-string v0, "Couldn\'t get audio manager"

    .line 323
    .line 324
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    return v2

    .line 328
    :cond_10
    iget-boolean p1, p0, Le/u;->H:Z

    .line 329
    .line 330
    iput-boolean v1, p0, Le/u;->H:Z

    .line 331
    .line 332
    invoke-virtual {p0, v1}, Le/u;->x(I)Le/t;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    iget-boolean v3, v0, Le/t;->m:Z

    .line 337
    .line 338
    if-eqz v3, :cond_11

    .line 339
    .line 340
    if-nez p1, :cond_16

    .line 341
    .line 342
    invoke-virtual {p0, v0, v2}, Le/u;->q(Le/t;Z)V

    .line 343
    .line 344
    .line 345
    return v2

    .line 346
    :cond_11
    iget-object p1, p0, Le/u;->o:Lg/a;

    .line 347
    .line 348
    if-eqz p1, :cond_13

    .line 349
    .line 350
    invoke-virtual {p1}, Lg/a;->a()V

    .line 351
    .line 352
    .line 353
    :cond_12
    :goto_6
    move p1, v2

    .line 354
    goto :goto_7

    .line 355
    :cond_13
    invoke-virtual {p0}, Le/u;->y()V

    .line 356
    .line 357
    .line 358
    iget-object p1, p0, Le/u;->i:Le/E;

    .line 359
    .line 360
    if-eqz p1, :cond_15

    .line 361
    .line 362
    iget-object p1, p1, Le/E;->t:Li/o0;

    .line 363
    .line 364
    if-eqz p1, :cond_15

    .line 365
    .line 366
    check-cast p1, Li/m1;

    .line 367
    .line 368
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 369
    .line 370
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->M:Li/h1;

    .line 371
    .line 372
    if-eqz p1, :cond_15

    .line 373
    .line 374
    iget-object v0, p1, Li/h1;->c:Lh/o;

    .line 375
    .line 376
    if-eqz v0, :cond_15

    .line 377
    .line 378
    if-nez p1, :cond_14

    .line 379
    .line 380
    const/4 v0, 0x0

    .line 381
    :cond_14
    if-eqz v0, :cond_12

    .line 382
    .line 383
    invoke-virtual {v0}, Lh/o;->collapseActionView()Z

    .line 384
    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_15
    move p1, v1

    .line 388
    :goto_7
    if-eqz p1, :cond_17

    .line 389
    .line 390
    :cond_16
    :goto_8
    return v2

    .line 391
    :cond_17
    :goto_9
    return v1
.end method

.method public final t(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Le/u;->x(I)Le/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Le/t;->h:Lh/m;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Le/t;->h:Lh/m;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lh/m;->t(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    iput-object v1, v0, Le/t;->p:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Le/t;->h:Lh/m;

    .line 28
    .line 29
    invoke-virtual {v1}, Lh/m;->w()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Le/t;->h:Lh/m;

    .line 33
    .line 34
    invoke-virtual {v1}, Lh/m;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, Le/t;->o:Z

    .line 39
    .line 40
    iput-boolean v1, v0, Le/t;->n:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Le/u;->l:Li/n0;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Le/u;->x(I)Le/t;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, Le/t;->k:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final u()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-boolean v2, p0, Le/u;->t:Z

    .line 4
    .line 5
    if-nez v2, :cond_1b

    .line 6
    .line 7
    sget-object v2, Ld/a;->j:[I

    .line 8
    .line 9
    iget-object v3, p0, Le/u;->e:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/16 v5, 0x75

    .line 16
    .line 17
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_1a

    .line 22
    .line 23
    const/16 v6, 0x7e

    .line 24
    .line 25
    invoke-virtual {v4, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/16 v7, 0x6c

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Le/u;->h(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v7}, Le/u;->h(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v5, 0x76

    .line 47
    .line 48
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/16 v6, 0x6d

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v6}, Le/u;->h(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v5, 0x77

    .line 60
    .line 61
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    const/16 v5, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v5}, Le/u;->h(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v4, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iput-boolean v5, p0, Le/u;->C:Z

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Le/u;->v()V

    .line 82
    .line 83
    .line 84
    iget-object v4, p0, Le/u;->f:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-boolean v5, p0, Le/u;->D:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v5, :cond_9

    .line 97
    .line 98
    iget-boolean v5, p0, Le/u;->C:Z

    .line 99
    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    const v5, 0x7f0c000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v1, p0, Le/u;->A:Z

    .line 112
    .line 113
    iput-boolean v1, p0, Le/u;->z:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v4, p0, Le/u;->z:Z

    .line 118
    .line 119
    if-eqz v4, :cond_8

    .line 120
    .line 121
    new-instance v4, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const v9, 0x7f040009

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v9, v4, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v5, v4, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    new-instance v5, Lg/d;

    .line 141
    .line 142
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v5, v3, v4}, Lg/d;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v5, v3

    .line 149
    :goto_1
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const v5, 0x7f0c0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v5, 0x7f09004b

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Li/n0;

    .line 170
    .line 171
    iput-object v5, p0, Le/u;->l:Li/n0;

    .line 172
    .line 173
    iget-object v9, p0, Le/u;->f:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-interface {v5, v9}, Li/n0;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v5, p0, Le/u;->A:Z

    .line 183
    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    iget-object v5, p0, Le/u;->l:Li/n0;

    .line 187
    .line 188
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 189
    .line 190
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    iget-boolean v5, p0, Le/u;->x:Z

    .line 194
    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    iget-object v5, p0, Le/u;->l:Li/n0;

    .line 198
    .line 199
    const/4 v6, 0x2

    .line 200
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 201
    .line 202
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-boolean v5, p0, Le/u;->y:Z

    .line 206
    .line 207
    if-eqz v5, :cond_b

    .line 208
    .line 209
    iget-object v5, p0, Le/u;->l:Li/n0;

    .line 210
    .line 211
    const/4 v6, 0x5

    .line 212
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 213
    .line 214
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    move-object v4, v8

    .line 219
    goto :goto_2

    .line 220
    :cond_9
    iget-boolean v5, p0, Le/u;->B:Z

    .line 221
    .line 222
    if-eqz v5, :cond_a

    .line 223
    .line 224
    const v5, 0x7f0c0016

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Landroid/view/ViewGroup;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_a
    const v5, 0x7f0c0015

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v5, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    check-cast v4, Landroid/view/ViewGroup;

    .line 242
    .line 243
    :cond_b
    :goto_2
    if-eqz v4, :cond_19

    .line 244
    .line 245
    new-instance v5, Le/m;

    .line 246
    .line 247
    invoke-direct {v5, p0, v1}, Le/m;-><init>(Le/u;I)V

    .line 248
    .line 249
    .line 250
    sget-object v6, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    invoke-static {v4, v5}, Ly/B;->u(Landroid/view/View;Ly/p;)V

    .line 253
    .line 254
    .line 255
    iget-object v5, p0, Le/u;->l:Li/n0;

    .line 256
    .line 257
    if-nez v5, :cond_c

    .line 258
    .line 259
    const v5, 0x7f0900aa

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, Landroid/widget/TextView;

    .line 267
    .line 268
    iput-object v5, p0, Le/u;->v:Landroid/widget/TextView;

    .line 269
    .line 270
    :cond_c
    sget-object v5, Li/t1;->a:Ljava/lang/reflect/Method;

    .line 271
    .line 272
    const-string v5, "Could not invoke makeOptionalFitsSystemWindows"

    .line 273
    .line 274
    const-string v6, "ViewUtils"

    .line 275
    .line 276
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    const-string v10, "makeOptionalFitsSystemWindows"

    .line 281
    .line 282
    invoke-virtual {v9, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-nez v10, :cond_d

    .line 291
    .line 292
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :catch_0
    move-exception v9

    .line 297
    goto :goto_4

    .line 298
    :catch_1
    move-exception v9

    .line 299
    goto :goto_5

    .line 300
    :cond_d
    :goto_3
    invoke-virtual {v9, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_4
    invoke-static {v6, v5, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :goto_5
    invoke-static {v6, v5, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :catch_2
    const-string v5, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    .line 313
    .line 314
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    :goto_6
    const v5, 0x7f090028

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    check-cast v5, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 325
    .line 326
    iget-object v6, p0, Le/u;->f:Landroid/view/Window;

    .line 327
    .line 328
    const v9, 0x1020002

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    check-cast v6, Landroid/view/ViewGroup;

    .line 336
    .line 337
    if-eqz v6, :cond_f

    .line 338
    .line 339
    :goto_7
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-lez v10, :cond_e

    .line 344
    .line 345
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_e
    const/4 v10, -0x1

    .line 357
    invoke-virtual {v6, v10}, Landroid/view/View;->setId(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5, v9}, Landroid/view/View;->setId(I)V

    .line 361
    .line 362
    .line 363
    instance-of v10, v6, Landroid/widget/FrameLayout;

    .line 364
    .line 365
    if-eqz v10, :cond_f

    .line 366
    .line 367
    check-cast v6, Landroid/widget/FrameLayout;

    .line 368
    .line 369
    invoke-virtual {v6, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 370
    .line 371
    .line 372
    :cond_f
    iget-object v6, p0, Le/u;->f:Landroid/view/Window;

    .line 373
    .line 374
    invoke-virtual {v6, v4}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 375
    .line 376
    .line 377
    new-instance v6, Le/m;

    .line 378
    .line 379
    invoke-direct {v6, p0, v0}, Le/m;-><init>(Le/u;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Li/m0;)V

    .line 383
    .line 384
    .line 385
    iput-object v4, p0, Le/u;->u:Landroid/view/ViewGroup;

    .line 386
    .line 387
    iget-object v4, p0, Le/u;->d:Ljava/lang/Object;

    .line 388
    .line 389
    instance-of v5, v4, Landroid/app/Activity;

    .line 390
    .line 391
    if-eqz v5, :cond_10

    .line 392
    .line 393
    check-cast v4, Landroid/app/Activity;

    .line 394
    .line 395
    invoke-virtual {v4}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    goto :goto_8

    .line 400
    :cond_10
    iget-object v4, p0, Le/u;->k:Ljava/lang/CharSequence;

    .line 401
    .line 402
    :goto_8
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-nez v5, :cond_13

    .line 407
    .line 408
    iget-object v5, p0, Le/u;->l:Li/n0;

    .line 409
    .line 410
    if-eqz v5, :cond_11

    .line 411
    .line 412
    invoke-interface {v5, v4}, Li/n0;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_11
    iget-object v5, p0, Le/u;->i:Le/E;

    .line 417
    .line 418
    if-eqz v5, :cond_12

    .line 419
    .line 420
    iget-object v5, v5, Le/E;->t:Li/o0;

    .line 421
    .line 422
    check-cast v5, Li/m1;

    .line 423
    .line 424
    iget-boolean v6, v5, Li/m1;->g:Z

    .line 425
    .line 426
    if-nez v6, :cond_13

    .line 427
    .line 428
    iput-object v4, v5, Li/m1;->h:Ljava/lang/CharSequence;

    .line 429
    .line 430
    iget v6, v5, Li/m1;->b:I

    .line 431
    .line 432
    and-int/lit8 v6, v6, 0x8

    .line 433
    .line 434
    if-eqz v6, :cond_13

    .line 435
    .line 436
    iget-object v6, v5, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 437
    .line 438
    invoke-virtual {v6, v4}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 439
    .line 440
    .line 441
    iget-boolean v5, v5, Li/m1;->g:Z

    .line 442
    .line 443
    if-eqz v5, :cond_13

    .line 444
    .line 445
    invoke-virtual {v6}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    invoke-static {v5, v4}, Ly/L;->j(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_12
    iget-object v5, p0, Le/u;->v:Landroid/widget/TextView;

    .line 454
    .line 455
    if-eqz v5, :cond_13

    .line 456
    .line 457
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    .line 459
    .line 460
    :cond_13
    :goto_9
    iget-object v4, p0, Le/u;->u:Landroid/view/ViewGroup;

    .line 461
    .line 462
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    check-cast v4, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 467
    .line 468
    iget-object v5, p0, Le/u;->f:Landroid/view/Window;

    .line 469
    .line 470
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    .line 483
    .line 484
    .line 485
    move-result v9

    .line 486
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    iget-object v10, v4, Landroidx/appcompat/widget/ContentFrameLayout;->h:Landroid/graphics/Rect;

    .line 491
    .line 492
    invoke-virtual {v10, v6, v8, v9, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 493
    .line 494
    .line 495
    sget-object v5, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 496
    .line 497
    invoke-virtual {v4}, Landroid/view/View;->isLaidOut()Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-eqz v5, :cond_14

    .line 502
    .line 503
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 504
    .line 505
    .line 506
    :cond_14
    invoke-virtual {v3, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    const/16 v3, 0x7c

    .line 511
    .line 512
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 517
    .line 518
    .line 519
    const/16 v3, 0x7d

    .line 520
    .line 521
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 526
    .line 527
    .line 528
    const/16 v3, 0x7a

    .line 529
    .line 530
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    if-eqz v5, :cond_15

    .line 535
    .line 536
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 541
    .line 542
    .line 543
    :cond_15
    const/16 v3, 0x7b

    .line 544
    .line 545
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    if-eqz v5, :cond_16

    .line 550
    .line 551
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 556
    .line 557
    .line 558
    :cond_16
    const/16 v3, 0x78

    .line 559
    .line 560
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    if-eqz v5, :cond_17

    .line 565
    .line 566
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 571
    .line 572
    .line 573
    :cond_17
    const/16 v3, 0x79

    .line 574
    .line 575
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    if-eqz v5, :cond_18

    .line 580
    .line 581
    invoke-virtual {v4}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 586
    .line 587
    .line 588
    :cond_18
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 592
    .line 593
    .line 594
    iput-boolean v0, p0, Le/u;->t:Z

    .line 595
    .line 596
    invoke-virtual {p0, v1}, Le/u;->x(I)Le/t;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    iget-boolean v1, p0, Le/u;->K:Z

    .line 601
    .line 602
    if-nez v1, :cond_1b

    .line 603
    .line 604
    iget-object v0, v0, Le/t;->h:Lh/m;

    .line 605
    .line 606
    if-nez v0, :cond_1b

    .line 607
    .line 608
    invoke-virtual {p0, v7}, Le/u;->z(I)V

    .line 609
    .line 610
    .line 611
    goto :goto_a

    .line 612
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 613
    .line 614
    new-instance v1, Ljava/lang/StringBuilder;

    .line 615
    .line 616
    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 617
    .line 618
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    iget-boolean v2, p0, Le/u;->z:Z

    .line 622
    .line 623
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    const-string v2, ", windowActionBarOverlay: "

    .line 627
    .line 628
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    iget-boolean v2, p0, Le/u;->A:Z

    .line 632
    .line 633
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    const-string v2, ", android:windowIsFloating: "

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    iget-boolean v2, p0, Le/u;->C:Z

    .line 642
    .line 643
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    const-string v2, ", windowActionModeOverlay: "

    .line 647
    .line 648
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    iget-boolean v2, p0, Le/u;->B:Z

    .line 652
    .line 653
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    const-string v2, ", windowNoTitle: "

    .line 657
    .line 658
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    iget-boolean v2, p0, Le/u;->D:Z

    .line 662
    .line 663
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    const-string v2, " }"

    .line 667
    .line 668
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    throw v0

    .line 679
    :cond_1a
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 680
    .line 681
    .line 682
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 683
    .line 684
    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 685
    .line 686
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    throw v0

    .line 690
    :cond_1b
    :goto_a
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le/u;->d:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Le/u;->n(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Le/u;->f:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "We have not been given a Window"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final w(Landroid/content/Context;)Landroidx/fragment/app/g;
    .locals 4

    .line 1
    iget-object v0, p0, Le/u;->Q:Le/q;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Le/q;

    .line 6
    .line 7
    sget-object v1, LC/h;->e:LC/h;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, LC/h;

    .line 16
    .line 17
    const-string v2, "location"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/location/LocationManager;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v3, Le/B;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v3, v1, LC/h;->d:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, v1, LC/h;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v2, v1, LC/h;->c:Ljava/lang/Object;

    .line 38
    .line 39
    sput-object v1, LC/h;->e:LC/h;

    .line 40
    .line 41
    :cond_0
    sget-object p1, LC/h;->e:LC/h;

    .line 42
    .line 43
    invoke-direct {v0, p0, p1}, Le/q;-><init>(Le/u;LC/h;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Le/u;->Q:Le/q;

    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Le/u;->Q:Le/q;

    .line 49
    .line 50
    return-object p1
.end method

.method public final x(I)Le/t;
    .locals 4

    .line 1
    iget-object v0, p0, Le/u;->F:[Le/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p1, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    new-array v2, v2, [Le/t;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, Le/u;->F:[Le/t;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object v2, v0, p1

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    new-instance v2, Le/t;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, v2, Le/t;->a:I

    .line 32
    .line 33
    iput-boolean v1, v2, Le/t;->n:Z

    .line 34
    .line 35
    aput-object v2, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object v2
.end method

.method public final y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/u;->u()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Le/u;->z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Le/u;->i:Le/E;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Le/u;->d:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Le/E;

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, Le/u;->A:Z

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Le/E;-><init>(Landroid/app/Activity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Le/u;->i:Le/E;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    new-instance v1, Le/E;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Le/E;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Le/u;->i:Le/E;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Le/u;->i:Le/E;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-boolean v1, p0, Le/u;->V:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Le/E;->T(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void
.end method

.method public final z(I)V
    .locals 3

    .line 1
    iget v0, p0, Le/u;->T:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Le/u;->T:I

    .line 8
    .line 9
    iget-boolean p1, p0, Le/u;->S:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Le/u;->f:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Le/u;->U:Le/l;

    .line 20
    .line 21
    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Le/u;->S:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method
