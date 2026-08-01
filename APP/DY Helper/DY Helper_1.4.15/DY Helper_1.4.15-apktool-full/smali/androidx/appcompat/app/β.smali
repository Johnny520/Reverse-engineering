.class public final Landroidx/appcompat/app/β;
.super Landroidx/appcompat/app/α;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lgz0;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final п:Lfw1;

.field public static final р:[I

.field public static final с:Z


# instance fields
.field public Α:Lｗ;

.field public Β:Landroidx/appcompat/widget/ActionBarContextView;

.field public Γ:Landroid/widget/PopupWindow;

.field public Δ:Lw4;

.field public Ε:Lx92;

.field public Ζ:Z

.field public Η:Landroid/view/ViewGroup;

.field public Θ:Landroid/widget/TextView;

.field public Ι:Landroid/view/View;

.field public Κ:Z

.field public Λ:Z

.field public Μ:Z

.field public Ν:Z

.field public Ξ:Z

.field public Ο:Z

.field public Π:Z

.field public Ρ:Z

.field public Σ:[Lg5;

.field public Τ:Lg5;

.field public Υ:Z

.field public Φ:Z

.field public Χ:Z

.field public Ψ:Z

.field public Ω:Landroid/content/res/Configuration;

.field public final ξ:Ljava/lang/Object;

.field public final ο:Landroid/content/Context;

.field public π:Landroid/view/Window;

.field public ρ:Ld5;

.field public final σ:Ljava/lang/Object;

.field public τ:Ltb2;

.field public υ:Ls12;

.field public φ:Ljava/lang/CharSequence;

.field public χ:Lxq;

.field public ψ:Lx4;

.field public ω:Lx4;

.field public final а:I

.field public б:I

.field public в:I

.field public г:Z

.field public д:Le5;

.field public е:Le5;

.field public ж:Z

.field public з:I

.field public final и:Lw4;

.field public й:Z

.field public к:Landroid/graphics/Rect;

.field public л:Landroid/graphics/Rect;

.field public м:Ll6;

.field public н:Landroid/window/OnBackInvokedDispatcher;

.field public о:Landroid/window/OnBackInvokedCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfw1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lfw1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/appcompat/app/β;->п:Lfw1;

    .line 8
    .line 9
    const v0, 0x1010054

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Landroidx/appcompat/app/β;->р:[I

    .line 17
    .line 18
    const-string v0, "robolectric"

    .line 19
    .line 20
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    sput-boolean v0, Landroidx/appcompat/app/β;->с:Z

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lp4;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/appcompat/app/β;->Ε:Lx92;

    .line 6
    .line 7
    const/16 v1, -0x64

    .line 8
    .line 9
    iput v1, p0, Landroidx/appcompat/app/β;->а:I

    .line 10
    .line 11
    new-instance v2, Lw4;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, v3}, Lw4;-><init>(Landroidx/appcompat/app/β;I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Landroidx/appcompat/app/β;->и:Lw4;

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p3, p0, Landroidx/appcompat/app/β;->σ:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p4, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    instance-of p3, p1, Landroidx/appcompat/app/AppCompatActivity;

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    .line 40
    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    check-cast p1, Landroid/content/ContextWrapper;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Landroidx/appcompat/app/β;

    .line 57
    .line 58
    iget p1, p1, Landroidx/appcompat/app/β;->а:I

    .line 59
    .line 60
    iput p1, p0, Landroidx/appcompat/app/β;->а:I

    .line 61
    .line 62
    :cond_2
    iget p1, p0, Landroidx/appcompat/app/β;->а:I

    .line 63
    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p3, Landroidx/appcompat/app/β;->п:Lfw1;

    .line 77
    .line 78
    invoke-virtual {p3, p1}, Lfw1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, Landroidx/appcompat/app/β;->а:I

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p3, p1}, Lfw1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    if-eqz p2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0, p2}, Landroidx/appcompat/app/β;->ξ(Landroid/view/Window;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-static {}, Lj5;->γ()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static ο(Landroid/content/Context;)Lcv0;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Landroidx/appcompat/app/α;->η:Lcv0;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object v0, v0, Lcv0;->α:Ldv0;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, La5;->β(Landroid/content/res/Configuration;)Lcv0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object v1, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v0, Lcv0;->β:Lcv0;

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    :goto_1
    iget-object v3, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, p0, Lcv0;->α:Ldv0;

    .line 56
    .line 57
    iget-object v4, v4, Ldv0;->α:Landroid/os/LocaleList;

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/2addr v4, v3

    .line 64
    if-ge v2, v4, :cond_5

    .line 65
    .line 66
    iget-object v3, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-ge v2, v3, :cond_3

    .line 73
    .line 74
    iget-object v3, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    iget-object v3, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    sub-int v3, v2, v3

    .line 88
    .line 89
    iget-object v4, p0, Lcv0;->α:Ldv0;

    .line 90
    .line 91
    iget-object v4, v4, Ldv0;->α:Landroid/os/LocaleList;

    .line 92
    .line 93
    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :goto_2
    if-eqz v3, :cond_4

    .line 98
    .line 99
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    new-array v0, v0, [Ljava/util/Locale;

    .line 110
    .line 111
    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, [Ljava/util/Locale;

    .line 116
    .line 117
    new-instance v1, Landroid/os/LocaleList;

    .line 118
    .line 119
    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, Lcv0;

    .line 123
    .line 124
    new-instance v2, Ldv0;

    .line 125
    .line 126
    invoke-direct {v2, v1}, Ldv0;-><init>(Landroid/os/LocaleList;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v2}, Lcv0;-><init>(Ldv0;)V

    .line 130
    .line 131
    .line 132
    :goto_3
    iget-object v1, v0, Lcv0;->α:Ldv0;

    .line 133
    .line 134
    iget-object v1, v1, Ldv0;->α:Landroid/os/LocaleList;

    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_6
    return-object v0
.end method

.method public static τ(Landroid/content/Context;ILcv0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
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
    if-eqz p4, :cond_0

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
    const/4 p4, 0x0

    .line 39
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p3, p3, -0x31

    .line 49
    .line 50
    or-int/2addr p0, p3

    .line 51
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-static {p1, p2}, La5;->δ(Landroid/content/res/Configuration;Lcv0;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 7

    .line 1
    iget-object p1, p0, Landroidx/appcompat/app/β;->м:Ll6;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    sget-object p1, Lkk1;->λ:[I

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v2, 0x74

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance p1, Ll6;

    .line 26
    .line 27
    invoke-direct {p1}, Ll6;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/appcompat/app/β;->м:Ll6;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ll6;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/appcompat/app/β;->м:Ll6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "Failed to instantiate custom view inflater "

    .line 58
    .line 59
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, ". Falling back to default."

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "AppCompatDelegate"

    .line 75
    .line 76
    invoke-static {v2, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    new-instance p1, Ll6;

    .line 80
    .line 81
    invoke-direct {p1}, Ll6;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Landroidx/appcompat/app/β;->м:Ll6;

    .line 85
    .line 86
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/appcompat/app/β;->м:Ll6;

    .line 87
    .line 88
    sget p1, Lk72;->α:I

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object p1, Lkk1;->Γ:[I

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-virtual {p3, p4, p1, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const/4 v2, 0x4

    .line 101
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    const-string v4, "AppCompatViewInflater"

    .line 108
    .line 109
    const-string v5, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 110
    .line 111
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    instance-of p1, p3, Lnp;

    .line 120
    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    move-object p1, p3

    .line 124
    check-cast p1, Lnp;

    .line 125
    .line 126
    iget p1, p1, Lnp;->α:I

    .line 127
    .line 128
    if-eq p1, v3, :cond_4

    .line 129
    .line 130
    :cond_3
    new-instance p1, Lnp;

    .line 131
    .line 132
    invoke-direct {p1, p3, v3}, Lnp;-><init>(Landroid/content/Context;I)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    move-object p1, p3

    .line 137
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/4 v4, 0x3

    .line 145
    const/4 v5, 0x1

    .line 146
    const/4 v6, -0x1

    .line 147
    sparse-switch v3, :sswitch_data_0

    .line 148
    .line 149
    .line 150
    :goto_2
    move v2, v6

    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :sswitch_0
    const-string v2, "Button"

    .line 154
    .line 155
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_5

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    const/16 v2, 0xd

    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :sswitch_1
    const-string v2, "EditText"

    .line 167
    .line 168
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_6

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    const/16 v2, 0xc

    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :sswitch_2
    const-string v2, "CheckBox"

    .line 180
    .line 181
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-nez v2, :cond_7

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_7
    const/16 v2, 0xb

    .line 189
    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    :sswitch_3
    const-string v2, "AutoCompleteTextView"

    .line 193
    .line 194
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_8

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_8
    const/16 v2, 0xa

    .line 202
    .line 203
    goto/16 :goto_3

    .line 204
    .line 205
    :sswitch_4
    const-string v2, "ImageView"

    .line 206
    .line 207
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_9
    const/16 v2, 0x9

    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :sswitch_5
    const-string v2, "ToggleButton"

    .line 219
    .line 220
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-nez v2, :cond_a

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_a
    const/16 v2, 0x8

    .line 228
    .line 229
    goto/16 :goto_3

    .line 230
    .line 231
    :sswitch_6
    const-string v2, "RadioButton"

    .line 232
    .line 233
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-nez v2, :cond_b

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_b
    const/4 v2, 0x7

    .line 241
    goto :goto_3

    .line 242
    :sswitch_7
    const-string v2, "Spinner"

    .line 243
    .line 244
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-nez v2, :cond_c

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_c
    const/4 v2, 0x6

    .line 252
    goto :goto_3

    .line 253
    :sswitch_8
    const-string v2, "SeekBar"

    .line 254
    .line 255
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-nez v2, :cond_d

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_d
    const/4 v2, 0x5

    .line 263
    goto :goto_3

    .line 264
    :sswitch_9
    const-string v3, "ImageButton"

    .line 265
    .line 266
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-nez v3, :cond_12

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :sswitch_a
    const-string v2, "TextView"

    .line 274
    .line 275
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-nez v2, :cond_e

    .line 280
    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_e
    move v2, v4

    .line 284
    goto :goto_3

    .line 285
    :sswitch_b
    const-string v2, "MultiAutoCompleteTextView"

    .line 286
    .line 287
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-nez v2, :cond_f

    .line 292
    .line 293
    goto/16 :goto_2

    .line 294
    .line 295
    :cond_f
    const/4 v2, 0x2

    .line 296
    goto :goto_3

    .line 297
    :sswitch_c
    const-string v2, "CheckedTextView"

    .line 298
    .line 299
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-nez v2, :cond_10

    .line 304
    .line 305
    goto/16 :goto_2

    .line 306
    .line 307
    :cond_10
    move v2, v5

    .line 308
    goto :goto_3

    .line 309
    :sswitch_d
    const-string v2, "RatingBar"

    .line 310
    .line 311
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-nez v2, :cond_11

    .line 316
    .line 317
    goto/16 :goto_2

    .line 318
    .line 319
    :cond_11
    move v2, v1

    .line 320
    :cond_12
    :goto_3
    const v3, 0x7f040031

    .line 321
    .line 322
    .line 323
    packed-switch v2, :pswitch_data_0

    .line 324
    .line 325
    .line 326
    move-object v2, v0

    .line 327
    goto/16 :goto_4

    .line 328
    .line 329
    :pswitch_0
    new-instance v2, Landroidx/appcompat/widget/AppCompatButton;

    .line 330
    .line 331
    const v3, 0x7f040047

    .line 332
    .line 333
    .line 334
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :pswitch_1
    new-instance v2, Landroidx/appcompat/widget/AppCompatEditText;

    .line 339
    .line 340
    const v3, 0x7f040083

    .line 341
    .line 342
    .line 343
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :pswitch_2
    new-instance v2, Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 348
    .line 349
    const v3, 0x7f04004e

    .line 350
    .line 351
    .line 352
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 353
    .line 354
    .line 355
    goto :goto_4

    .line 356
    :pswitch_3
    new-instance v2, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;

    .line 357
    .line 358
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :pswitch_4
    new-instance v2, Landroidx/appcompat/widget/AppCompatImageView;

    .line 363
    .line 364
    invoke-direct {v2, p1, p4, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :pswitch_5
    new-instance v2, Landroidx/appcompat/widget/AppCompatToggleButton;

    .line 369
    .line 370
    invoke-direct {v2, p1, p4}, Landroidx/appcompat/widget/AppCompatToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 371
    .line 372
    .line 373
    goto :goto_4

    .line 374
    :pswitch_6
    new-instance v2, Landroidx/appcompat/widget/AppCompatRadioButton;

    .line 375
    .line 376
    const v3, 0x7f0400e2

    .line 377
    .line 378
    .line 379
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 380
    .line 381
    .line 382
    goto :goto_4

    .line 383
    :pswitch_7
    new-instance v2, Landroidx/appcompat/widget/AppCompatSpinner;

    .line 384
    .line 385
    invoke-direct {v2, p1, p4}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 386
    .line 387
    .line 388
    goto :goto_4

    .line 389
    :pswitch_8
    new-instance v2, Landroidx/appcompat/widget/AppCompatSeekBar;

    .line 390
    .line 391
    const v3, 0x7f0400ed

    .line 392
    .line 393
    .line 394
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :pswitch_9
    new-instance v2, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 399
    .line 400
    const v3, 0x7f0400aa

    .line 401
    .line 402
    .line 403
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 404
    .line 405
    .line 406
    goto :goto_4

    .line 407
    :pswitch_a
    new-instance v2, Landroidx/appcompat/widget/AppCompatTextView;

    .line 408
    .line 409
    invoke-direct {v2, p1, p4}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 410
    .line 411
    .line 412
    goto :goto_4

    .line 413
    :pswitch_b
    new-instance v2, Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;

    .line 414
    .line 415
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 416
    .line 417
    .line 418
    goto :goto_4

    .line 419
    :pswitch_c
    new-instance v2, Landroidx/appcompat/widget/AppCompatCheckedTextView;

    .line 420
    .line 421
    const v3, 0x7f04004f

    .line 422
    .line 423
    .line 424
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 425
    .line 426
    .line 427
    goto :goto_4

    .line 428
    :pswitch_d
    new-instance v2, Landroidx/appcompat/widget/AppCompatRatingBar;

    .line 429
    .line 430
    const v3, 0x7f0400e3

    .line 431
    .line 432
    .line 433
    invoke-direct {v2, p1, p4, v3}, Landroidx/appcompat/widget/AppCompatRatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 434
    .line 435
    .line 436
    :goto_4
    if-nez v2, :cond_17

    .line 437
    .line 438
    if-eq p3, p1, :cond_17

    .line 439
    .line 440
    iget-object p3, p0, Ll6;->α:[Ljava/lang/Object;

    .line 441
    .line 442
    const-string v2, "view"

    .line 443
    .line 444
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-eqz v2, :cond_13

    .line 449
    .line 450
    const-string p2, "class"

    .line 451
    .line 452
    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p2

    .line 456
    :cond_13
    :try_start_1
    aput-object p1, p3, v1

    .line 457
    .line 458
    aput-object p4, p3, v5

    .line 459
    .line 460
    const/16 v2, 0x2e

    .line 461
    .line 462
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-ne v6, v2, :cond_16

    .line 467
    .line 468
    move v2, v1

    .line 469
    :goto_5
    sget-object v3, Ll6;->δ:[Ljava/lang/String;

    .line 470
    .line 471
    if-ge v2, v4, :cond_15

    .line 472
    .line 473
    aget-object v3, v3, v2

    .line 474
    .line 475
    invoke-virtual {p0, p1, p2, v3}, Ll6;->α(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 476
    .line 477
    .line 478
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 479
    if-eqz v3, :cond_14

    .line 480
    .line 481
    aput-object v0, p3, v1

    .line 482
    .line 483
    aput-object v0, p3, v5

    .line 484
    .line 485
    move-object v0, v3

    .line 486
    goto :goto_7

    .line 487
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 488
    .line 489
    goto :goto_5

    .line 490
    :catchall_1
    move-exception p0

    .line 491
    goto :goto_6

    .line 492
    :cond_15
    aput-object v0, p3, v1

    .line 493
    .line 494
    aput-object v0, p3, v5

    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_16
    :try_start_2
    invoke-virtual {p0, p1, p2, v0}, Ll6;->α(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 498
    .line 499
    .line 500
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 501
    aput-object v0, p3, v1

    .line 502
    .line 503
    aput-object v0, p3, v5

    .line 504
    .line 505
    move-object v0, p0

    .line 506
    goto :goto_7

    .line 507
    :goto_6
    aput-object v0, p3, v1

    .line 508
    .line 509
    aput-object v0, p3, v5

    .line 510
    .line 511
    throw p0

    .line 512
    :catch_0
    aput-object v0, p3, v1

    .line 513
    .line 514
    aput-object v0, p3, v5

    .line 515
    .line 516
    :goto_7
    move-object v2, v0

    .line 517
    :cond_17
    if-eqz v2, :cond_1a

    .line 518
    .line 519
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 524
    .line 525
    if-eqz p1, :cond_1a

    .line 526
    .line 527
    invoke-virtual {v2}, Landroid/view/View;->hasOnClickListeners()Z

    .line 528
    .line 529
    .line 530
    move-result p1

    .line 531
    if-nez p1, :cond_18

    .line 532
    .line 533
    goto :goto_8

    .line 534
    :cond_18
    sget-object p1, Ll6;->γ:[I

    .line 535
    .line 536
    invoke-virtual {p0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    invoke-virtual {p0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    if-eqz p1, :cond_19

    .line 545
    .line 546
    new-instance p2, Lk6;

    .line 547
    .line 548
    invoke-direct {p2, v2, p1}, Lk6;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 552
    .line 553
    .line 554
    :cond_19
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 555
    .line 556
    .line 557
    :cond_1a
    :goto_8
    return-object v2

    .line 558
    nop

    .line 559
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

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
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

    .line 559
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/appcompat/app/β;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final Α(I)Lg5;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->Σ:[Lg5;

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
    new-array v2, v2, [Lg5;

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
    iput-object v2, p0, Landroidx/appcompat/app/β;->Σ:[Lg5;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object p0, v0, p1

    .line 23
    .line 24
    if-nez p0, :cond_3

    .line 25
    .line 26
    new-instance p0, Lg5;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, p0, Lg5;->α:I

    .line 32
    .line 33
    iput-boolean v1, p0, Lg5;->ξ:Z

    .line 34
    .line 35
    aput-object p0, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object p0
.end method

.method public final Β()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Ltb2;

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->Ν:Z

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Ltb2;-><init>(Landroid/app/Activity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

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
    new-instance v1, Ltb2;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Ltb2;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-boolean p0, p0, Landroidx/appcompat/app/β;->й:Z

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ltb2;->δ(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void
.end method

.method public final Γ(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/app/β;->з:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Landroidx/appcompat/app/β;->з:I

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->ж:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/appcompat/app/β;->и:Lw4;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Landroidx/appcompat/app/β;->ж:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final Δ(Landroid/content/Context;I)I
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
    iget-object p2, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Le5;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Le5;-><init>(Landroidx/appcompat/app/β;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 31
    .line 32
    invoke-virtual {p0}, Le5;->η()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    const-string p0, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 38
    .line 39
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "uimode"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Landroid/app/UiModeManager;

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/β;->ω(Landroid/content/Context;)Lр;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lр;->η()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :cond_4
    return p2

    .line 73
    :cond_5
    :goto_0
    return v1
.end method

.method public final Ε()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Υ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/appcompat/app/β;->Υ:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-boolean v3, v2, Lg5;->ν:Z

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0, v2, v4}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 18
    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->Α:Lｗ;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lｗ;->α()V

    .line 26
    .line 27
    .line 28
    return v4

    .line 29
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    iget-object p0, p0, Ltb2;->ε:Lyq;

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    check-cast v0, Lb52;

    .line 42
    .line 43
    iget-object v0, v0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget-object v0, v0, Lv42;->ζ:Llz0;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p0, Lb52;

    .line 54
    .line 55
    iget-object p0, p0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p0, p0, Lv42;->ζ:Llz0;

    .line 64
    .line 65
    :goto_0
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Llz0;->collapseActionView()Z

    .line 68
    .line 69
    .line 70
    :cond_3
    return v4

    .line 71
    :cond_4
    return v1
.end method

.method public final Ζ(Lg5;Landroid/view/KeyEvent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lg5;->ν:Z

    .line 6
    .line 7
    iget v3, v1, Lg5;->α:I

    .line 8
    .line 9
    if-nez v2, :cond_1a

    .line 10
    .line 11
    iget-boolean v2, v0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_1
    iget-object v4, v0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-object v6, v1, Lg5;->θ:Liz0;

    .line 48
    .line 49
    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v1, v5}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string v4, "window"

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/view/WindowManager;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    invoke-virtual/range {p0 .. p2}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_4
    iget-object v6, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, -0x2

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    iget-boolean v9, v1, Lg5;->ξ:Z

    .line 86
    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object v2, v1, Lg5;->η:Landroid/view/View;

    .line 91
    .line 92
    if-eqz v2, :cond_18

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_18

    .line 99
    .line 100
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 101
    .line 102
    const/4 v6, -0x1

    .line 103
    if-ne v2, v6, :cond_18

    .line 104
    .line 105
    move v10, v6

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_6
    :goto_0
    if-nez v6, :cond_b

    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/appcompat/app/β;->Β()V

    .line 111
    .line 112
    .line 113
    iget-object v6, v0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 114
    .line 115
    if-eqz v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v6}, Ltb2;->β()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_1

    .line 122
    :cond_7
    const/4 v6, 0x0

    .line 123
    :goto_1
    if-nez v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v2, v6

    .line 127
    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    .line 128
    .line 129
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 145
    .line 146
    .line 147
    const v10, 0x7f040002

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 151
    .line 152
    .line 153
    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 158
    .line 159
    .line 160
    :cond_9
    const v10, 0x7f0400d5

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 164
    .line 165
    .line 166
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 167
    .line 168
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    const v6, 0x7f10010c

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 178
    .line 179
    .line 180
    :goto_3
    new-instance v6, Lnp;

    .line 181
    .line 182
    invoke-direct {v6, v2, v7}, Lnp;-><init>(Landroid/content/Context;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Lnp;->getTheme()Landroid/content/res/Resources$Theme;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 190
    .line 191
    .line 192
    iput-object v6, v1, Lg5;->κ:Lnp;

    .line 193
    .line 194
    sget-object v2, Lkk1;->λ:[I

    .line 195
    .line 196
    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v6, 0x56

    .line 201
    .line 202
    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iput v6, v1, Lg5;->β:I

    .line 207
    .line 208
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    iput v6, v1, Lg5;->δ:I

    .line 213
    .line 214
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 215
    .line 216
    .line 217
    new-instance v2, Landroidx/appcompat/app/AppCompatDelegateImpl$ListMenuDecorView;

    .line 218
    .line 219
    iget-object v6, v1, Lg5;->κ:Lnp;

    .line 220
    .line 221
    invoke-direct {v2, v0, v6}, Landroidx/appcompat/app/AppCompatDelegateImpl$ListMenuDecorView;-><init>(Landroidx/appcompat/app/β;Lnp;)V

    .line 222
    .line 223
    .line 224
    iput-object v2, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 225
    .line 226
    const/16 v2, 0x51

    .line 227
    .line 228
    iput v2, v1, Lg5;->γ:I

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_b
    iget-boolean v2, v1, Lg5;->ξ:Z

    .line 232
    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_c

    .line 240
    .line 241
    iget-object v2, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_4
    iget-object v2, v1, Lg5;->η:Landroid/view/View;

    .line 247
    .line 248
    if-eqz v2, :cond_d

    .line 249
    .line 250
    iput-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    iget-object v2, v1, Lg5;->θ:Liz0;

    .line 254
    .line 255
    if-nez v2, :cond_e

    .line 256
    .line 257
    goto/16 :goto_8

    .line 258
    .line 259
    :cond_e
    iget-object v2, v0, Landroidx/appcompat/app/β;->ω:Lx4;

    .line 260
    .line 261
    if-nez v2, :cond_f

    .line 262
    .line 263
    new-instance v2, Lx4;

    .line 264
    .line 265
    const/4 v6, 0x3

    .line 266
    invoke-direct {v2, v0, v6}, Lx4;-><init>(Landroidx/appcompat/app/β;I)V

    .line 267
    .line 268
    .line 269
    iput-object v2, v0, Landroidx/appcompat/app/β;->ω:Lx4;

    .line 270
    .line 271
    :cond_f
    iget-object v2, v0, Landroidx/appcompat/app/β;->ω:Lx4;

    .line 272
    .line 273
    iget-object v6, v1, Lg5;->ι:Lcu0;

    .line 274
    .line 275
    if-nez v6, :cond_10

    .line 276
    .line 277
    new-instance v6, Lcu0;

    .line 278
    .line 279
    iget-object v9, v1, Lg5;->κ:Lnp;

    .line 280
    .line 281
    invoke-direct {v6, v9}, Lcu0;-><init>(Landroid/content/ContextWrapper;)V

    .line 282
    .line 283
    .line 284
    iput-object v6, v1, Lg5;->ι:Lcu0;

    .line 285
    .line 286
    iput-object v2, v6, Lcu0;->ι:Ltz0;

    .line 287
    .line 288
    iget-object v2, v1, Lg5;->θ:Liz0;

    .line 289
    .line 290
    iget-object v9, v2, Liz0;->α:Landroid/content/Context;

    .line 291
    .line 292
    invoke-virtual {v2, v6, v9}, Liz0;->β(Luz0;Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    :cond_10
    iget-object v2, v1, Lg5;->ι:Lcu0;

    .line 296
    .line 297
    iget-object v6, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 298
    .line 299
    iget-object v9, v2, Lcu0;->θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 300
    .line 301
    if-nez v9, :cond_12

    .line 302
    .line 303
    iget-object v9, v2, Lcu0;->ζ:Landroid/view/LayoutInflater;

    .line 304
    .line 305
    const v10, 0x7f0c000d

    .line 306
    .line 307
    .line 308
    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 313
    .line 314
    iput-object v6, v2, Lcu0;->θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 315
    .line 316
    iget-object v6, v2, Lcu0;->κ:Lbu0;

    .line 317
    .line 318
    if-nez v6, :cond_11

    .line 319
    .line 320
    new-instance v6, Lbu0;

    .line 321
    .line 322
    invoke-direct {v6, v2}, Lbu0;-><init>(Lcu0;)V

    .line 323
    .line 324
    .line 325
    iput-object v6, v2, Lcu0;->κ:Lbu0;

    .line 326
    .line 327
    :cond_11
    iget-object v6, v2, Lcu0;->θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 328
    .line 329
    iget-object v9, v2, Lcu0;->κ:Lbu0;

    .line 330
    .line 331
    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 332
    .line 333
    .line 334
    iget-object v6, v2, Lcu0;->θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 335
    .line 336
    invoke-virtual {v6, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 337
    .line 338
    .line 339
    :cond_12
    iget-object v2, v2, Lcu0;->θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 340
    .line 341
    iput-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 342
    .line 343
    if-eqz v2, :cond_19

    .line 344
    .line 345
    :goto_5
    iget-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 346
    .line 347
    if-nez v2, :cond_13

    .line 348
    .line 349
    goto/16 :goto_8

    .line 350
    .line 351
    :cond_13
    iget-object v2, v1, Lg5;->η:Landroid/view/View;

    .line 352
    .line 353
    if-eqz v2, :cond_14

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_14
    iget-object v2, v1, Lg5;->ι:Lcu0;

    .line 357
    .line 358
    iget-object v6, v2, Lcu0;->κ:Lbu0;

    .line 359
    .line 360
    if-nez v6, :cond_15

    .line 361
    .line 362
    new-instance v6, Lbu0;

    .line 363
    .line 364
    invoke-direct {v6, v2}, Lbu0;-><init>(Lcu0;)V

    .line 365
    .line 366
    .line 367
    iput-object v6, v2, Lcu0;->κ:Lbu0;

    .line 368
    .line 369
    :cond_15
    iget-object v2, v2, Lcu0;->κ:Lbu0;

    .line 370
    .line 371
    invoke-virtual {v2}, Lbu0;->getCount()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-lez v2, :cond_19

    .line 376
    .line 377
    :goto_6
    iget-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 378
    .line 379
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-nez v2, :cond_16

    .line 384
    .line 385
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 386
    .line 387
    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 388
    .line 389
    .line 390
    :cond_16
    iget v6, v1, Lg5;->β:I

    .line 391
    .line 392
    iget-object v9, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 393
    .line 394
    invoke-virtual {v9, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 395
    .line 396
    .line 397
    iget-object v6, v1, Lg5;->ζ:Landroid/view/View;

    .line 398
    .line 399
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    instance-of v9, v6, Landroid/view/ViewGroup;

    .line 404
    .line 405
    if-eqz v9, :cond_17

    .line 406
    .line 407
    check-cast v6, Landroid/view/ViewGroup;

    .line 408
    .line 409
    iget-object v9, v1, Lg5;->ζ:Landroid/view/View;

    .line 410
    .line 411
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    :cond_17
    iget-object v6, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 415
    .line 416
    iget-object v9, v1, Lg5;->ζ:Landroid/view/View;

    .line 417
    .line 418
    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 419
    .line 420
    .line 421
    iget-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 422
    .line 423
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-nez v2, :cond_18

    .line 428
    .line 429
    iget-object v2, v1, Lg5;->ζ:Landroid/view/View;

    .line 430
    .line 431
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 432
    .line 433
    .line 434
    :cond_18
    move v10, v8

    .line 435
    :goto_7
    iput-boolean v7, v1, Lg5;->μ:Z

    .line 436
    .line 437
    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    .line 438
    .line 439
    const/high16 v15, 0x820000

    .line 440
    .line 441
    const/16 v16, -0x3

    .line 442
    .line 443
    const/4 v11, -0x2

    .line 444
    const/4 v12, 0x0

    .line 445
    const/4 v13, 0x0

    .line 446
    const/16 v14, 0x3ea

    .line 447
    .line 448
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 449
    .line 450
    .line 451
    iget v2, v1, Lg5;->γ:I

    .line 452
    .line 453
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 454
    .line 455
    iget v2, v1, Lg5;->δ:I

    .line 456
    .line 457
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 458
    .line 459
    iget-object v2, v1, Lg5;->ε:Landroid/view/ViewGroup;

    .line 460
    .line 461
    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 462
    .line 463
    .line 464
    iput-boolean v5, v1, Lg5;->ν:Z

    .line 465
    .line 466
    if-nez v3, :cond_1a

    .line 467
    .line 468
    invoke-virtual {v0}, Landroidx/appcompat/app/β;->Κ()V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_19
    :goto_8
    iput-boolean v5, v1, Lg5;->ξ:Z

    .line 473
    .line 474
    :cond_1a
    :goto_9
    return-void
.end method

.method public final Η(Lg5;ILandroid/view/KeyEvent;)Z
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
    iget-boolean v0, p1, Lg5;->λ:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p0, p1, Lg5;->θ:Liz0;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {p0, p2, p3, p1}, Liz0;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
.end method

.method public final Θ(Lg5;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Ψ:Z

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
    iget-boolean v0, p1, Lg5;->λ:Z

    .line 9
    .line 10
    iget v2, p1, Lg5;->α:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v3

    .line 16
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/β;->Τ:Lg5;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eq v0, p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, p1, Lg5;->η:Landroid/view/View;

    .line 38
    .line 39
    :cond_3
    const/16 v4, 0x6c

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    if-ne v2, v4, :cond_4

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
    move v5, v3

    .line 49
    :goto_1
    if-eqz v5, :cond_6

    .line 50
    .line 51
    iget-object v6, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 56
    .line 57
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 58
    .line 59
    .line 60
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 61
    .line 62
    check-cast v6, Lb52;

    .line 63
    .line 64
    iput-boolean v3, v6, Lb52;->μ:Z

    .line 65
    .line 66
    :cond_6
    iget-object v6, p1, Lg5;->η:Landroid/view/View;

    .line 67
    .line 68
    if-nez v6, :cond_1d

    .line 69
    .line 70
    iget-object v6, p1, Lg5;->θ:Liz0;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    if-eqz v6, :cond_7

    .line 74
    .line 75
    iget-boolean v8, p1, Lg5;->ο:Z

    .line 76
    .line 77
    if-eqz v8, :cond_17

    .line 78
    .line 79
    :cond_7
    if-nez v6, :cond_10

    .line 80
    .line 81
    iget-object v6, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 82
    .line 83
    if-eqz v2, :cond_8

    .line 84
    .line 85
    if-ne v2, v4, :cond_c

    .line 86
    .line 87
    :cond_8
    iget-object v4, p0, Landroidx/appcompat/app/β;->χ:Lxq;

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
    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

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
    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_9
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

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
    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 157
    .line 158
    .line 159
    :cond_b
    if-eqz v9, :cond_c

    .line 160
    .line 161
    new-instance v4, Lnp;

    .line 162
    .line 163
    invoke-direct {v4, v6, v1}, Lnp;-><init>(Landroid/content/Context;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Lnp;->getTheme()Landroid/content/res/Resources$Theme;

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
    new-instance v4, Liz0;

    .line 175
    .line 176
    invoke-direct {v4, v6}, Liz0;-><init>(Landroid/content/Context;)V

    .line 177
    .line 178
    .line 179
    iput-object p0, v4, Liz0;->ε:Lgz0;

    .line 180
    .line 181
    iget-object v6, p1, Lg5;->θ:Liz0;

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
    iget-object v8, p1, Lg5;->ι:Lcu0;

    .line 189
    .line 190
    invoke-virtual {v6, v8}, Liz0;->σ(Luz0;)V

    .line 191
    .line 192
    .line 193
    :cond_e
    iput-object v4, p1, Lg5;->θ:Liz0;

    .line 194
    .line 195
    iget-object v6, p1, Lg5;->ι:Lcu0;

    .line 196
    .line 197
    if-eqz v6, :cond_f

    .line 198
    .line 199
    iget-object v8, v4, Liz0;->α:Landroid/content/Context;

    .line 200
    .line 201
    invoke-virtual {v4, v6, v8}, Liz0;->β(Luz0;Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    :cond_f
    :goto_3
    iget-object v4, p1, Lg5;->θ:Liz0;

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
    iget-object v4, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 212
    .line 213
    if-eqz v4, :cond_12

    .line 214
    .line 215
    iget-object v6, p0, Landroidx/appcompat/app/β;->ψ:Lx4;

    .line 216
    .line 217
    if-nez v6, :cond_11

    .line 218
    .line 219
    new-instance v6, Lx4;

    .line 220
    .line 221
    const/4 v8, 0x2

    .line 222
    invoke-direct {v6, p0, v8}, Lx4;-><init>(Landroidx/appcompat/app/β;I)V

    .line 223
    .line 224
    .line 225
    iput-object v6, p0, Landroidx/appcompat/app/β;->ψ:Lx4;

    .line 226
    .line 227
    :cond_11
    iget-object v6, p1, Lg5;->θ:Liz0;

    .line 228
    .line 229
    iget-object v8, p0, Landroidx/appcompat/app/β;->ψ:Lx4;

    .line 230
    .line 231
    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 232
    .line 233
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->μ(Landroid/view/Menu;Ltz0;)V

    .line 234
    .line 235
    .line 236
    :cond_12
    iget-object v4, p1, Lg5;->θ:Liz0;

    .line 237
    .line 238
    invoke-virtual {v4}, Liz0;->ψ()V

    .line 239
    .line 240
    .line 241
    iget-object v4, p1, Lg5;->θ:Liz0;

    .line 242
    .line 243
    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_16

    .line 248
    .line 249
    iget-object p2, p1, Lg5;->θ:Liz0;

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
    iget-object v0, p1, Lg5;->ι:Lcu0;

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Liz0;->σ(Luz0;)V

    .line 259
    .line 260
    .line 261
    :cond_14
    iput-object v7, p1, Lg5;->θ:Liz0;

    .line 262
    .line 263
    :goto_4
    if-eqz v5, :cond_15

    .line 264
    .line 265
    iget-object p1, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 266
    .line 267
    if-eqz p1, :cond_15

    .line 268
    .line 269
    iget-object p0, p0, Landroidx/appcompat/app/β;->ψ:Lx4;

    .line 270
    .line 271
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 272
    .line 273
    invoke-virtual {p1, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->μ(Landroid/view/Menu;Ltz0;)V

    .line 274
    .line 275
    .line 276
    :cond_15
    :goto_5
    return v1

    .line 277
    :cond_16
    iput-boolean v1, p1, Lg5;->ο:Z

    .line 278
    .line 279
    :cond_17
    iget-object v2, p1, Lg5;->θ:Liz0;

    .line 280
    .line 281
    invoke-virtual {v2}, Liz0;->ψ()V

    .line 282
    .line 283
    .line 284
    iget-object v2, p1, Lg5;->π:Landroid/os/Bundle;

    .line 285
    .line 286
    if-eqz v2, :cond_18

    .line 287
    .line 288
    iget-object v4, p1, Lg5;->θ:Liz0;

    .line 289
    .line 290
    invoke-virtual {v4, v2}, Liz0;->τ(Landroid/os/Bundle;)V

    .line 291
    .line 292
    .line 293
    iput-object v7, p1, Lg5;->π:Landroid/os/Bundle;

    .line 294
    .line 295
    :cond_18
    iget-object v2, p1, Lg5;->η:Landroid/view/View;

    .line 296
    .line 297
    iget-object v4, p1, Lg5;->θ:Liz0;

    .line 298
    .line 299
    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

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
    iget-object p2, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 308
    .line 309
    if-eqz p2, :cond_19

    .line 310
    .line 311
    iget-object p0, p0, Landroidx/appcompat/app/β;->ψ:Lx4;

    .line 312
    .line 313
    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 314
    .line 315
    invoke-virtual {p2, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->μ(Landroid/view/Menu;Ltz0;)V

    .line 316
    .line 317
    .line 318
    :cond_19
    iget-object p0, p1, Lg5;->θ:Liz0;

    .line 319
    .line 320
    invoke-virtual {p0}, Liz0;->χ()V

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
    if-eq p2, v3, :cond_1c

    .line 341
    .line 342
    move p2, v3

    .line 343
    goto :goto_7

    .line 344
    :cond_1c
    move p2, v1

    .line 345
    :goto_7
    iget-object v0, p1, Lg5;->θ:Liz0;

    .line 346
    .line 347
    invoke-virtual {v0, p2}, Liz0;->setQwertyMode(Z)V

    .line 348
    .line 349
    .line 350
    iget-object p2, p1, Lg5;->θ:Liz0;

    .line 351
    .line 352
    invoke-virtual {p2}, Liz0;->χ()V

    .line 353
    .line 354
    .line 355
    :cond_1d
    iput-boolean v3, p1, Lg5;->λ:Z

    .line 356
    .line 357
    iput-boolean v1, p1, Lg5;->μ:Z

    .line 358
    .line 359
    iput-object p1, p0, Landroidx/appcompat/app/β;->Τ:Lg5;

    .line 360
    .line 361
    return v3
.end method

.method public final Ι()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Landroidx/appcompat/app/β;->Ζ:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v0, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final Κ()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v0, v0, Lg5;->ν:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/β;->Α:Lｗ;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lc5;->β(Ljava/lang/Object;Landroidx/appcompat/app/β;)Landroid/window/OnBackInvokedCallback;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    if-nez v1, :cond_4

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lc5;->γ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 57
    .line 58
    :cond_4
    return-void
.end method

.method public final α()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

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
    move-result-object p0

    .line 21
    instance-of p0, p0, Landroidx/appcompat/app/β;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v0, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final γ()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/app/β;->Φ:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/app/β;->ν(ZZ)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->ψ()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    invoke-static {v1, v2}, Lyh;->Ξ(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

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
    iget-object v1, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iput-boolean v0, p0, Landroidx/appcompat/app/β;->й:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v1, v0}, Ltb2;->δ(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    sget-object v1, Landroidx/appcompat/app/α;->μ:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v1

    .line 51
    :try_start_3
    invoke-static {p0}, Landroidx/appcompat/app/α;->ζ(Landroidx/appcompat/app/β;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Landroidx/appcompat/app/α;->λ:Ld7;

    .line 55
    .line 56
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ld7;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    monitor-exit v1

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    .line 70
    .line 71
    iget-object v2, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

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
    iput-object v1, p0, Landroidx/appcompat/app/β;->Ω:Landroid/content/res/Configuration;

    .line 85
    .line 86
    iput-boolean v0, p0, Landroidx/appcompat/app/β;->Χ:Z

    .line 87
    .line 88
    return-void
.end method

.method public final δ(Liz0;Landroid/view/MenuItem;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

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
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Liz0;->λ()Liz0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, Landroidx/appcompat/app/β;->Σ:[Lg5;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v1

    .line 25
    :goto_0
    move v3, v1

    .line 26
    :goto_1
    if-ge v3, v2, :cond_2

    .line 27
    .line 28
    aget-object v4, p0, v3

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-object v5, v4, Lg5;->θ:Liz0;

    .line 33
    .line 34
    if-ne v5, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v4, 0x0

    .line 41
    :goto_2
    if-eqz v4, :cond_3

    .line 42
    .line 43
    iget p0, v4, Lg5;->α:I

    .line 44
    .line 45
    invoke-interface {v0, p0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_3
    return v1
.end method

.method public final ε()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/appcompat/app/α;->μ:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/α;->ζ(Landroidx/appcompat/app/β;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p0

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->ж:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Landroidx/appcompat/app/β;->и:Lw4;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 35
    .line 36
    iget v0, p0, Landroidx/appcompat/app/β;->а:I

    .line 37
    .line 38
    const/16 v1, -0x64

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    sget-object v0, Landroidx/appcompat/app/β;->п:Lfw1;

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    iget v2, p0, Landroidx/appcompat/app/β;->а:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Lfw1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Landroidx/appcompat/app/β;->п:Lfw1;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    invoke-virtual {v0, v1}, Lfw1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, Landroidx/appcompat/app/β;->д:Le5;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Lр;->γ()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p0, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 101
    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, Lр;->γ()V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public final η(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x6d

    .line 4
    .line 5
    const/16 v2, 0x6c

    .line 6
    .line 7
    const-string v3, "AppCompatDelegate"

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0x9

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 23
    .line 24
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move p1, v1

    .line 28
    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Π:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-ne p1, v2, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    iput-boolean v3, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 44
    .line 45
    :cond_3
    if-eq p1, v4, :cond_9

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p1, v0, :cond_8

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    if-eq p1, v0, :cond_7

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    if-eq p1, v0, :cond_6

    .line 56
    .line 57
    if-eq p1, v2, :cond_5

    .line 58
    .line 59
    if-eq p1, v1, :cond_4

    .line 60
    .line 61
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_4
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 69
    .line 70
    .line 71
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Ν:Z

    .line 72
    .line 73
    return v4

    .line 74
    :cond_5
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 78
    .line 79
    return v4

    .line 80
    :cond_6
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Ξ:Z

    .line 84
    .line 85
    return v4

    .line 86
    :cond_7
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 87
    .line 88
    .line 89
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Λ:Z

    .line 90
    .line 91
    return v4

    .line 92
    :cond_8
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 93
    .line 94
    .line 95
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Κ:Z

    .line 96
    .line 97
    return v4

    .line 98
    :cond_9
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ι()V

    .line 99
    .line 100
    .line 101
    iput-boolean v4, p0, Landroidx/appcompat/app/β;->Π:Z

    .line 102
    .line 103
    return v4
.end method

.method public final θ(Liz0;)V
    .locals 5

    .line 1
    iget-object p1, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 13
    .line 14
    check-cast p1, Lb52;

    .line 15
    .line 16
    iget-object p1, p1, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->ψ:Z

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

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
    iget-object p1, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 45
    .line 46
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 52
    .line 53
    check-cast p1, Lb52;

    .line 54
    .line 55
    iget-object p1, p1, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iget-object v2, p1, Landroidx/appcompat/widget/γ;->Α:Lｓ;

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/appcompat/widget/γ;->θ()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 82
    .line 83
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 86
    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 89
    .line 90
    check-cast v2, Lb52;

    .line 91
    .line 92
    iget-object v2, v2, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 93
    .line 94
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 95
    .line 96
    const/16 v3, 0x6c

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/appcompat/widget/γ;->θ()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    iget-object v0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 111
    .line 112
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 118
    .line 119
    check-cast v0, Lb52;

    .line 120
    .line 121
    iget-object v0, v0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 122
    .line 123
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 124
    .line 125
    if-eqz v0, :cond_1

    .line 126
    .line 127
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    invoke-virtual {v0}, Landroidx/appcompat/widget/γ;->δ()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    :cond_1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 136
    .line 137
    if-nez v0, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p0, p0, Lg5;->θ:Liz0;

    .line 144
    .line 145
    invoke-interface {p1, v3, p0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    if-eqz p1, :cond_4

    .line 150
    .line 151
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 152
    .line 153
    if-nez v2, :cond_4

    .line 154
    .line 155
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->ж:Z

    .line 156
    .line 157
    if-eqz v2, :cond_3

    .line 158
    .line 159
    iget v2, p0, Landroidx/appcompat/app/β;->з:I

    .line 160
    .line 161
    and-int/2addr v0, v2

    .line 162
    if-eqz v0, :cond_3

    .line 163
    .line 164
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v2, p0, Landroidx/appcompat/app/β;->и:Lw4;

    .line 171
    .line 172
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Lw4;->run()V

    .line 176
    .line 177
    .line 178
    :cond_3
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v2, v0, Lg5;->θ:Liz0;

    .line 183
    .line 184
    if-eqz v2, :cond_4

    .line 185
    .line 186
    iget-boolean v4, v0, Lg5;->ο:Z

    .line 187
    .line 188
    if-nez v4, :cond_4

    .line 189
    .line 190
    iget-object v4, v0, Lg5;->η:Landroid/view/View;

    .line 191
    .line 192
    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_4

    .line 197
    .line 198
    iget-object v0, v0, Lg5;->θ:Liz0;

    .line 199
    .line 200
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 204
    .line 205
    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 206
    .line 207
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 208
    .line 209
    .line 210
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 211
    .line 212
    check-cast p0, Lb52;

    .line 213
    .line 214
    iget-object p0, p0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 215
    .line 216
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 217
    .line 218
    if-eqz p0, :cond_4

    .line 219
    .line 220
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 221
    .line 222
    if-eqz p0, :cond_4

    .line 223
    .line 224
    invoke-virtual {p0}, Landroidx/appcompat/widget/γ;->μ()Z

    .line 225
    .line 226
    .line 227
    :cond_4
    return-void

    .line 228
    :cond_5
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iput-boolean v0, p1, Lg5;->ξ:Z

    .line 233
    .line 234
    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/β;->Ζ(Lg5;Landroid/view/KeyEvent;)V

    .line 239
    .line 240
    .line 241
    return-void
.end method

.method public final ι(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

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
    iget-object v1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

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
    iget-object p1, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 28
    .line 29
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Ld5;->α(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final κ(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

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
    iget-object p1, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 22
    .line 23
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, Ld5;->α(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final λ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

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
    iget-object p1, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 22
    .line 23
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, Ld5;->α(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final μ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/appcompat/app/β;->φ:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lxq;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, v0, Ltb2;->ε:Lyq;

    .line 16
    .line 17
    check-cast p0, Lb52;

    .line 18
    .line 19
    iget-boolean v0, p0, Lb52;->η:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 24
    .line 25
    iput-object p1, p0, Lb52;->θ:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget v1, p0, Lb52;->β:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, 0x8

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-boolean p0, p0, Lb52;->η:Z

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0, p1}, Lb92;->η(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/app/β;->Θ:Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final ν(ZZ)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/16 v0, -0x64

    .line 8
    .line 9
    iget v2, p0, Landroidx/appcompat/app/β;->а:I

    .line 10
    .line 11
    if-eq v2, v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    sget v2, Landroidx/appcompat/app/α;->ζ:I

    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p0, v0, v2}, Landroidx/appcompat/app/β;->Δ(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v5, 0x21

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    if-ge v4, v5, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/appcompat/app/β;->ο(Landroid/content/Context;)Lcv0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v4, v6

    .line 35
    :goto_1
    if-nez p2, :cond_3

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, La5;->β(Landroid/content/res/Configuration;)Lcv0;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_3
    invoke-static {v0, v3, v4, v6, v1}, Landroidx/appcompat/app/β;->τ(Landroid/content/Context;ILcv0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->г:Z

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    iget-object v7, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    instance-of v3, v7, Landroid/app/Activity;

    .line 63
    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    move v3, v1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    :try_start_0
    new-instance v8, Landroid/content/ComponentName;

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-direct {v8, v0, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    const/high16 v9, 0x100c0000

    .line 84
    .line 85
    invoke-virtual {v3, v8, v9}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    iget v3, v3, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 92
    .line 93
    iput v3, p0, Landroidx/appcompat/app/β;->в:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catch_0
    move-exception v3

    .line 97
    const-string v8, "AppCompatDelegate"

    .line 98
    .line 99
    const-string v9, "Exception while getting ActivityInfo"

    .line 100
    .line 101
    invoke-static {v8, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 102
    .line 103
    .line 104
    iput v1, p0, Landroidx/appcompat/app/β;->в:I

    .line 105
    .line 106
    :cond_5
    :goto_2
    iput-boolean v5, p0, Landroidx/appcompat/app/β;->г:Z

    .line 107
    .line 108
    iget v3, p0, Landroidx/appcompat/app/β;->в:I

    .line 109
    .line 110
    :goto_3
    iget-object v8, p0, Landroidx/appcompat/app/β;->Ω:Landroid/content/res/Configuration;

    .line 111
    .line 112
    if-nez v8, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    :cond_6
    iget v9, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 123
    .line 124
    and-int/lit8 v9, v9, 0x30

    .line 125
    .line 126
    iget v10, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 127
    .line 128
    and-int/lit8 v10, v10, 0x30

    .line 129
    .line 130
    invoke-static {v8}, La5;->β(Landroid/content/res/Configuration;)Lcv0;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    if-nez v4, :cond_7

    .line 135
    .line 136
    move-object v4, v6

    .line 137
    goto :goto_4

    .line 138
    :cond_7
    invoke-static {p2}, La5;->β(Landroid/content/res/Configuration;)Lcv0;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    :goto_4
    if-eq v9, v10, :cond_8

    .line 143
    .line 144
    const/16 v9, 0x200

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_8
    move v9, v1

    .line 148
    :goto_5
    if-eqz v4, :cond_9

    .line 149
    .line 150
    invoke-virtual {v8, v4}, Lcv0;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-nez v8, :cond_9

    .line 155
    .line 156
    or-int/lit16 v9, v9, 0x2004

    .line 157
    .line 158
    :cond_9
    not-int v8, v3

    .line 159
    and-int/2addr v8, v9

    .line 160
    if-eqz v8, :cond_c

    .line 161
    .line 162
    if-eqz p1, :cond_c

    .line 163
    .line 164
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Φ:Z

    .line 165
    .line 166
    if-eqz p1, :cond_c

    .line 167
    .line 168
    sget-boolean p1, Landroidx/appcompat/app/β;->с:Z

    .line 169
    .line 170
    if-nez p1, :cond_a

    .line 171
    .line 172
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Χ:Z

    .line 173
    .line 174
    if-eqz p1, :cond_c

    .line 175
    .line 176
    :cond_a
    instance-of p1, v7, Landroid/app/Activity;

    .line 177
    .line 178
    if-eqz p1, :cond_c

    .line 179
    .line 180
    move-object p1, v7

    .line 181
    check-cast p1, Landroid/app/Activity;

    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-nez v8, :cond_c

    .line 188
    .line 189
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 190
    .line 191
    const/16 v11, 0x1f

    .line 192
    .line 193
    if-lt v8, v11, :cond_b

    .line 194
    .line 195
    and-int/lit16 v8, v9, 0x2000

    .line 196
    .line 197
    if-eqz v8, :cond_b

    .line 198
    .line 199
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-virtual {v8}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    invoke-virtual {v8, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 212
    .line 213
    .line 214
    :cond_b
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 215
    .line 216
    .line 217
    move p1, v5

    .line 218
    goto :goto_6

    .line 219
    :cond_c
    move p1, v1

    .line 220
    :goto_6
    if-nez p1, :cond_11

    .line 221
    .line 222
    if-eqz v9, :cond_11

    .line 223
    .line 224
    and-int p1, v9, v3

    .line 225
    .line 226
    if-ne p1, v9, :cond_d

    .line 227
    .line 228
    move v1, v5

    .line 229
    :cond_d
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    new-instance p2, Landroid/content/res/Configuration;

    .line 234
    .line 235
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-direct {p2, v3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 247
    .line 248
    and-int/lit8 v3, v3, -0x31

    .line 249
    .line 250
    or-int/2addr v3, v10

    .line 251
    iput v3, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 252
    .line 253
    if-eqz v4, :cond_e

    .line 254
    .line 255
    invoke-static {p2, v4}, La5;->δ(Landroid/content/res/Configuration;Lcv0;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    invoke-virtual {p1, p2, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 259
    .line 260
    .line 261
    iget p1, p0, Landroidx/appcompat/app/β;->б:I

    .line 262
    .line 263
    if-eqz p1, :cond_f

    .line 264
    .line 265
    invoke-virtual {v0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iget v3, p0, Landroidx/appcompat/app/β;->б:I

    .line 273
    .line 274
    invoke-virtual {p1, v3, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 275
    .line 276
    .line 277
    :cond_f
    if-eqz v1, :cond_12

    .line 278
    .line 279
    instance-of p1, v7, Landroid/app/Activity;

    .line 280
    .line 281
    if-eqz p1, :cond_12

    .line 282
    .line 283
    check-cast v7, Landroid/app/Activity;

    .line 284
    .line 285
    instance-of p1, v7, Lhr0;

    .line 286
    .line 287
    if-eqz p1, :cond_10

    .line 288
    .line 289
    move-object p1, v7

    .line 290
    check-cast p1, Lhr0;

    .line 291
    .line 292
    invoke-interface {p1}, Lhr0;->δ()Ljr0;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget-object p1, p1, Ljr0;->γ:Lcr0;

    .line 297
    .line 298
    sget-object v1, Lcr0;->η:Lcr0;

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-ltz p1, :cond_12

    .line 305
    .line 306
    invoke-virtual {v7, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_10
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Χ:Z

    .line 311
    .line 312
    if-eqz p1, :cond_12

    .line 313
    .line 314
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 315
    .line 316
    if-nez p1, :cond_12

    .line 317
    .line 318
    invoke-virtual {v7, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_11
    move v5, p1

    .line 323
    :cond_12
    :goto_7
    if-eqz v4, :cond_13

    .line 324
    .line 325
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-static {p1}, La5;->β(Landroid/content/res/Configuration;)Lcv0;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-static {p1}, La5;->γ(Lcv0;)V

    .line 338
    .line 339
    .line 340
    :cond_13
    if-nez v2, :cond_14

    .line 341
    .line 342
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/β;->ω(Landroid/content/Context;)Lр;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {p1}, Lр;->ω()V

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_14
    iget-object p1, p0, Landroidx/appcompat/app/β;->д:Le5;

    .line 351
    .line 352
    if-eqz p1, :cond_15

    .line 353
    .line 354
    invoke-virtual {p1}, Lр;->γ()V

    .line 355
    .line 356
    .line 357
    :cond_15
    :goto_8
    iget-object p1, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 358
    .line 359
    const/4 p2, 0x3

    .line 360
    if-ne v2, p2, :cond_17

    .line 361
    .line 362
    if-nez p1, :cond_16

    .line 363
    .line 364
    new-instance p1, Le5;

    .line 365
    .line 366
    invoke-direct {p1, p0, v0}, Le5;-><init>(Landroidx/appcompat/app/β;Landroid/content/Context;)V

    .line 367
    .line 368
    .line 369
    iput-object p1, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 370
    .line 371
    :cond_16
    iget-object p0, p0, Landroidx/appcompat/app/β;->е:Le5;

    .line 372
    .line 373
    invoke-virtual {p0}, Lр;->ω()V

    .line 374
    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_17
    if-eqz p1, :cond_18

    .line 378
    .line 379
    invoke-virtual {p1}, Lр;->γ()V

    .line 380
    .line 381
    .line 382
    :cond_18
    :goto_9
    return v5
.end method

.method public final ξ(Landroid/view/Window;)V
    .locals 7

    .line 1
    const-string v0, "AppCompat has already installed itself into the Window"

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 4
    .line 5
    if-nez v1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Ld5;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    new-instance v0, Ld5;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Ld5;-><init>(Landroidx/appcompat/app/β;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, Landroidx/appcompat/app/β;->р:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Lj5;->α()Lj5;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v5, v4, Lj5;->α:Ltn1;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v0, v3, v6}, Ltn1;->ε(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p0

    .line 64
    :cond_0
    move-object v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v0, 0x21

    .line 78
    .line 79
    if-lt p1, v0, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-static {p1, v1}, Lc5;->γ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, Landroidx/appcompat/app/β;->о:Landroid/window/OnBackInvokedCallback;

    .line 97
    .line 98
    :cond_2
    instance-of p1, v0, Landroid/app/Activity;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    check-cast v0, Landroid/app/Activity;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, Lc5;->α(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    iput-object v2, p0, Landroidx/appcompat/app/β;->н:Landroid/window/OnBackInvokedDispatcher;

    .line 118
    .line 119
    :goto_1
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Κ()V

    .line 120
    .line 121
    .line 122
    :cond_4
    return-void

    .line 123
    :cond_5
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final π(ILg5;Liz0;)V
    .locals 2

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
    iget-object v0, p0, Landroidx/appcompat/app/β;->Σ:[Lg5;

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
    iget-object p3, p2, Lg5;->θ:Liz0;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Lg5;->ν:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    const/4 v1, 0x0

    .line 42
    :try_start_0
    iput-boolean v0, p2, Ld5;->θ:Z

    .line 43
    .line 44
    invoke-interface {p0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p2, Ld5;->θ:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    iput-boolean v1, p2, Ld5;->θ:Z

    .line 52
    .line 53
    throw p0

    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public final ρ(Liz0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Ρ:Z

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
    iput-boolean v0, p0, Landroidx/appcompat/app/β;->Ρ:Z

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 17
    .line 18
    check-cast v0, Lb52;

    .line 19
    .line 20
    iget-object v0, v0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/appcompat/widget/γ;->δ()Z

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Landroidx/appcompat/widget/γ;->ω:Lｑ;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lqz0;->β()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lqz0;->ι:Loz0;

    .line 44
    .line 45
    invoke-interface {v0}, Lew1;->dismiss()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

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
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ψ:Z

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
    iput-boolean p1, p0, Landroidx/appcompat/app/β;->Ρ:Z

    .line 67
    .line 68
    return-void
.end method

.method public final σ(Lg5;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lg5;->α:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 17
    .line 18
    check-cast v0, Lb52;

    .line 19
    .line 20
    iget-object v0, v0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/appcompat/widget/γ;->θ()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Lg5;->θ:Liz0;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/β;->ρ(Liz0;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

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
    iget-boolean v2, p1, Lg5;->ν:Z

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget-object v2, p1, Lg5;->ε:Landroid/view/ViewGroup;

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
    iget p2, p1, Lg5;->α:I

    .line 69
    .line 70
    invoke-virtual {p0, p2, p1, v1}, Landroidx/appcompat/app/β;->π(ILg5;Liz0;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 p2, 0x0

    .line 74
    iput-boolean p2, p1, Lg5;->λ:Z

    .line 75
    .line 76
    iput-boolean p2, p1, Lg5;->μ:Z

    .line 77
    .line 78
    iput-boolean p2, p1, Lg5;->ν:Z

    .line 79
    .line 80
    iput-object v1, p1, Lg5;->ζ:Landroid/view/View;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p1, Lg5;->ξ:Z

    .line 84
    .line 85
    iget-object p2, p0, Landroidx/appcompat/app/β;->Τ:Lg5;

    .line 86
    .line 87
    if-ne p2, p1, :cond_2

    .line 88
    .line 89
    iput-object v1, p0, Landroidx/appcompat/app/β;->Τ:Lg5;

    .line 90
    .line 91
    :cond_2
    iget p1, p1, Lg5;->α:I

    .line 92
    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Κ()V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void
.end method

.method public final υ(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lxo0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    instance-of v0, v0, Lw;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/16 v2, 0x52

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v0, v2, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    :try_start_0
    iput-boolean v3, v0, Ld5;->η:Z

    .line 43
    .line 44
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 45
    .line 46
    .line 47
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    iput-boolean v1, v0, Ld5;->η:Z

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :catchall_0
    move-exception p0

    .line 55
    iput-boolean v1, v0, Ld5;->η:Z

    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/4 v5, 0x4

    .line 67
    if-nez v4, :cond_6

    .line 68
    .line 69
    if-eq v0, v5, :cond_4

    .line 70
    .line 71
    if-eq v0, v2, :cond_3

    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_11

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v1, v0, Lg5;->ν:Z

    .line 86
    .line 87
    if-nez v1, :cond_11

    .line 88
    .line 89
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 90
    .line 91
    .line 92
    return v3

    .line 93
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    and-int/lit16 p1, p1, 0x80

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    move v3, v1

    .line 103
    :goto_0
    iput-boolean v3, p0, Landroidx/appcompat/app/β;->Υ:Z

    .line 104
    .line 105
    return v1

    .line 106
    :cond_6
    if-eq v0, v5, :cond_10

    .line 107
    .line 108
    if-eq v0, v2, :cond_7

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_7
    iget-object v0, p0, Landroidx/appcompat/app/β;->Α:Lｗ;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_8
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 123
    .line 124
    iget-object v4, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 125
    .line 126
    if-eqz v2, :cond_a

    .line 127
    .line 128
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 131
    .line 132
    .line 133
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 134
    .line 135
    check-cast v2, Lb52;

    .line 136
    .line 137
    iget-object v2, v2, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-nez v5, :cond_a

    .line 144
    .line 145
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 146
    .line 147
    if-eqz v2, :cond_a

    .line 148
    .line 149
    iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView;->ψ:Z

    .line 150
    .line 151
    if-eqz v2, :cond_a

    .line 152
    .line 153
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_a

    .line 162
    .line 163
    iget-object v2, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 164
    .line 165
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 168
    .line 169
    .line 170
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 171
    .line 172
    check-cast v2, Lb52;

    .line 173
    .line 174
    iget-object v2, v2, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 175
    .line 176
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 177
    .line 178
    if-eqz v2, :cond_9

    .line 179
    .line 180
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 181
    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/appcompat/widget/γ;->θ()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_9

    .line 189
    .line 190
    iget-object p0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 191
    .line 192
    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 198
    .line 199
    check-cast p0, Lb52;

    .line 200
    .line 201
    iget-object p0, p0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 202
    .line 203
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 204
    .line 205
    if-eqz p0, :cond_d

    .line 206
    .line 207
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 208
    .line 209
    if-eqz p0, :cond_d

    .line 210
    .line 211
    invoke-virtual {p0}, Landroidx/appcompat/widget/γ;->δ()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_d

    .line 216
    .line 217
    :goto_1
    goto :goto_3

    .line 218
    :cond_9
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 219
    .line 220
    if-nez v2, :cond_d

    .line 221
    .line 222
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_d

    .line 227
    .line 228
    iget-object p0, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 229
    .line 230
    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 231
    .line 232
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->λ()V

    .line 233
    .line 234
    .line 235
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ι:Lyq;

    .line 236
    .line 237
    check-cast p0, Lb52;

    .line 238
    .line 239
    iget-object p0, p0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 240
    .line 241
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 242
    .line 243
    if-eqz p0, :cond_d

    .line 244
    .line 245
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 246
    .line 247
    if-eqz p0, :cond_d

    .line 248
    .line 249
    invoke-virtual {p0}, Landroidx/appcompat/widget/γ;->μ()Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-eqz p0, :cond_d

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_a
    iget-boolean v2, v0, Lg5;->ν:Z

    .line 257
    .line 258
    if-nez v2, :cond_e

    .line 259
    .line 260
    iget-boolean v5, v0, Lg5;->μ:Z

    .line 261
    .line 262
    if-eqz v5, :cond_b

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_b
    iget-boolean v2, v0, Lg5;->λ:Z

    .line 266
    .line 267
    if-eqz v2, :cond_d

    .line 268
    .line 269
    iget-boolean v2, v0, Lg5;->ο:Z

    .line 270
    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    iput-boolean v1, v0, Lg5;->λ:Z

    .line 274
    .line 275
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    goto :goto_2

    .line 280
    :cond_c
    move v2, v3

    .line 281
    :goto_2
    if-eqz v2, :cond_d

    .line 282
    .line 283
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/β;->Ζ(Lg5;Landroid/view/KeyEvent;)V

    .line 284
    .line 285
    .line 286
    :goto_3
    move p0, v3

    .line 287
    goto :goto_5

    .line 288
    :cond_d
    move p0, v1

    .line 289
    goto :goto_5

    .line 290
    :cond_e
    :goto_4
    invoke-virtual {p0, v0, v3}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 291
    .line 292
    .line 293
    move p0, v2

    .line 294
    :goto_5
    if-eqz p0, :cond_11

    .line 295
    .line 296
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    const-string p1, "audio"

    .line 301
    .line 302
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    check-cast p0, Landroid/media/AudioManager;

    .line 307
    .line 308
    if-eqz p0, :cond_f

    .line 309
    .line 310
    invoke-virtual {p0, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 311
    .line 312
    .line 313
    return v3

    .line 314
    :cond_f
    const-string p0, "AppCompatDelegate"

    .line 315
    .line 316
    const-string p1, "Couldn\'t get audio manager"

    .line 317
    .line 318
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    return v3

    .line 322
    :cond_10
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Ε()Z

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    if-eqz p0, :cond_12

    .line 327
    .line 328
    :cond_11
    :goto_6
    return v3

    .line 329
    :cond_12
    :goto_7
    return v1
.end method

.method public final φ(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lg5;->θ:Liz0;

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
    iget-object v2, v0, Lg5;->θ:Liz0;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Liz0;->υ(Landroid/os/Bundle;)V

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
    iput-object v1, v0, Lg5;->π:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Lg5;->θ:Liz0;

    .line 28
    .line 29
    invoke-virtual {v1}, Liz0;->ψ()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lg5;->θ:Liz0;

    .line 33
    .line 34
    invoke-virtual {v1}, Liz0;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, Lg5;->ο:Z

    .line 39
    .line 40
    iput-boolean v1, v0, Lg5;->ξ:Z

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
    iget-object p1, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, Lg5;->λ:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/β;->Θ(Lg5;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final χ()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Ζ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Lkk1;->λ:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x75

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1a

    .line 20
    .line 21
    const/16 v4, 0x7e

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0x6c

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v7}, Landroidx/appcompat/app/β;->η(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v6}, Landroidx/appcompat/app/β;->η(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v3, 0x76

    .line 47
    .line 48
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x6d

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Landroidx/appcompat/app/β;->η(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v3, 0x77

    .line 60
    .line 61
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const/16 v3, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/β;->η(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput-boolean v3, p0, Landroidx/appcompat/app/β;->Ο:Z

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->ψ()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Π:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v3, :cond_9

    .line 97
    .line 98
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Ο:Z

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    const v3, 0x7f0c000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v5, p0, Landroidx/appcompat/app/β;->Ν:Z

    .line 112
    .line 113
    iput-boolean v5, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v2, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 118
    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    new-instance v2, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v9, 0x7f040009

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    new-instance v3, Lnp;

    .line 141
    .line 142
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v3, v0, v2}, Lnp;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v3, v0

    .line 149
    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const v3, 0x7f0c0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v3, 0x7f0900fb

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lxq;

    .line 170
    .line 171
    iput-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 172
    .line 173
    iget-object v9, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-interface {v3, v9}, Lxq;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Ν:Z

    .line 183
    .line 184
    if-eqz v3, :cond_6

    .line 185
    .line 186
    iget-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 187
    .line 188
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 189
    .line 190
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->κ(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Κ:Z

    .line 194
    .line 195
    if-eqz v3, :cond_7

    .line 196
    .line 197
    iget-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 198
    .line 199
    const/4 v4, 0x2

    .line 200
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->κ(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Λ:Z

    .line 206
    .line 207
    if-eqz v3, :cond_b

    .line 208
    .line 209
    iget-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 210
    .line 211
    const/4 v4, 0x5

    .line 212
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 213
    .line 214
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->κ(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    move-object v2, v8

    .line 219
    goto :goto_2

    .line 220
    :cond_9
    iget-boolean v3, p0, Landroidx/appcompat/app/β;->Ξ:Z

    .line 221
    .line 222
    if-eqz v3, :cond_a

    .line 223
    .line 224
    const v3, 0x7f0c0016

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Landroid/view/ViewGroup;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_a
    const v3, 0x7f0c0015

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    check-cast v2, Landroid/view/ViewGroup;

    .line 242
    .line 243
    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    .line 244
    .line 245
    new-instance v3, Lx4;

    .line 246
    .line 247
    invoke-direct {v3, p0, v5}, Lx4;-><init>(Landroidx/appcompat/app/β;I)V

    .line 248
    .line 249
    .line 250
    sget-object v4, Lb92;->α:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    invoke-static {v2, v3}, Lu82;->θ(Landroid/view/View;Lv41;)V

    .line 253
    .line 254
    .line 255
    iget-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 256
    .line 257
    if-nez v3, :cond_c

    .line 258
    .line 259
    const v3, 0x7f0902eb

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Landroid/widget/TextView;

    .line 267
    .line 268
    iput-object v3, p0, Landroidx/appcompat/app/β;->Θ:Landroid/widget/TextView;

    .line 269
    .line 270
    :cond_c
    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    .line 271
    .line 272
    const-string v4, "ViewUtils"

    .line 273
    .line 274
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    const-string v10, "makeOptionalFitsSystemWindows"

    .line 279
    .line 280
    invoke-virtual {v9, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-nez v10, :cond_d

    .line 289
    .line 290
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :catch_0
    move-exception v9

    .line 295
    goto :goto_4

    .line 296
    :catch_1
    move-exception v9

    .line 297
    goto :goto_5

    .line 298
    :cond_d
    :goto_3
    invoke-virtual {v9, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :goto_4
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :goto_5
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    .line 311
    .line 312
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    :goto_6
    const v3, 0x7f090028

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 323
    .line 324
    iget-object v4, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 325
    .line 326
    const v9, 0x1020002

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    check-cast v4, Landroid/view/ViewGroup;

    .line 334
    .line 335
    if-eqz v4, :cond_f

    .line 336
    .line 337
    :goto_7
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    if-lez v10, :cond_e

    .line 342
    .line 343
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 351
    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_e
    const/4 v10, -0x1

    .line 355
    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    .line 359
    .line 360
    .line 361
    instance-of v10, v4, Landroid/widget/FrameLayout;

    .line 362
    .line 363
    if-eqz v10, :cond_f

    .line 364
    .line 365
    check-cast v4, Landroid/widget/FrameLayout;

    .line 366
    .line 367
    invoke-virtual {v4, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 368
    .line 369
    .line 370
    :cond_f
    iget-object v4, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 371
    .line 372
    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 373
    .line 374
    .line 375
    new-instance v4, Lx4;

    .line 376
    .line 377
    invoke-direct {v4, p0, v7}, Lx4;-><init>(Landroidx/appcompat/app/β;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Ldp;)V

    .line 381
    .line 382
    .line 383
    iput-object v2, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 384
    .line 385
    iget-object v2, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

    .line 386
    .line 387
    instance-of v3, v2, Landroid/app/Activity;

    .line 388
    .line 389
    if-eqz v3, :cond_10

    .line 390
    .line 391
    check-cast v2, Landroid/app/Activity;

    .line 392
    .line 393
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    goto :goto_8

    .line 398
    :cond_10
    iget-object v2, p0, Landroidx/appcompat/app/β;->φ:Ljava/lang/CharSequence;

    .line 399
    .line 400
    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-nez v3, :cond_13

    .line 405
    .line 406
    iget-object v3, p0, Landroidx/appcompat/app/β;->χ:Lxq;

    .line 407
    .line 408
    if-eqz v3, :cond_11

    .line 409
    .line 410
    invoke-interface {v3, v2}, Lxq;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 411
    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_11
    iget-object v3, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 415
    .line 416
    if-eqz v3, :cond_12

    .line 417
    .line 418
    iget-object v3, v3, Ltb2;->ε:Lyq;

    .line 419
    .line 420
    check-cast v3, Lb52;

    .line 421
    .line 422
    iget-boolean v4, v3, Lb52;->η:Z

    .line 423
    .line 424
    if-nez v4, :cond_13

    .line 425
    .line 426
    iget-object v4, v3, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 427
    .line 428
    iput-object v2, v3, Lb52;->θ:Ljava/lang/CharSequence;

    .line 429
    .line 430
    iget v8, v3, Lb52;->β:I

    .line 431
    .line 432
    and-int/lit8 v8, v8, 0x8

    .line 433
    .line 434
    if-eqz v8, :cond_13

    .line 435
    .line 436
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 437
    .line 438
    .line 439
    iget-boolean v3, v3, Lb52;->η:Z

    .line 440
    .line 441
    if-eqz v3, :cond_13

    .line 442
    .line 443
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    invoke-static {v3, v2}, Lb92;->η(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_12
    iget-object v3, p0, Landroidx/appcompat/app/β;->Θ:Landroid/widget/TextView;

    .line 452
    .line 453
    if-eqz v3, :cond_13

    .line 454
    .line 455
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    .line 457
    .line 458
    :cond_13
    :goto_9
    iget-object v2, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 459
    .line 460
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 465
    .line 466
    iget-object v3, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 467
    .line 468
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 481
    .line 482
    .line 483
    move-result v9

    .line 484
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->λ:Landroid/graphics/Rect;

    .line 489
    .line 490
    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-eqz v3, :cond_14

    .line 498
    .line 499
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 500
    .line 501
    .line 502
    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    const/16 v1, 0x7c

    .line 507
    .line 508
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 513
    .line 514
    .line 515
    const/16 v1, 0x7d

    .line 516
    .line 517
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 522
    .line 523
    .line 524
    const/16 v1, 0x7a

    .line 525
    .line 526
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-eqz v3, :cond_15

    .line 531
    .line 532
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 537
    .line 538
    .line 539
    :cond_15
    const/16 v1, 0x7b

    .line 540
    .line 541
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    if-eqz v3, :cond_16

    .line 546
    .line 547
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 552
    .line 553
    .line 554
    :cond_16
    const/16 v1, 0x78

    .line 555
    .line 556
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    if-eqz v3, :cond_17

    .line 561
    .line 562
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 567
    .line 568
    .line 569
    :cond_17
    const/16 v1, 0x79

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    if-eqz v3, :cond_18

    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 582
    .line 583
    .line 584
    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 588
    .line 589
    .line 590
    iput-boolean v7, p0, Landroidx/appcompat/app/β;->Ζ:Z

    .line 591
    .line 592
    invoke-virtual {p0, v5}, Landroidx/appcompat/app/β;->Α(I)Lg5;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 597
    .line 598
    if-nez v1, :cond_1b

    .line 599
    .line 600
    iget-object v0, v0, Lg5;->θ:Liz0;

    .line 601
    .line 602
    if-nez v0, :cond_1b

    .line 603
    .line 604
    invoke-virtual {p0, v6}, Landroidx/appcompat/app/β;->Γ(I)V

    .line 605
    .line 606
    .line 607
    goto :goto_a

    .line 608
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    const-string v1, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 611
    .line 612
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 616
    .line 617
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-string v1, ", windowActionBarOverlay: "

    .line 621
    .line 622
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ν:Z

    .line 626
    .line 627
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    const-string v1, ", android:windowIsFloating: "

    .line 631
    .line 632
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ο:Z

    .line 636
    .line 637
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string v1, ", windowActionModeOverlay: "

    .line 641
    .line 642
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ξ:Z

    .line 646
    .line 647
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    const-string v1, ", windowNoTitle: "

    .line 651
    .line 652
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    iget-boolean p0, p0, Landroidx/appcompat/app/β;->Π:Z

    .line 656
    .line 657
    const-string v1, " }"

    .line 658
    .line 659
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 668
    .line 669
    .line 670
    const-string p0, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 671
    .line 672
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    :cond_1b
    :goto_a
    return-void
.end method

.method public final ψ()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/β;->ξ:Ljava/lang/Object;

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
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/β;->ξ(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "We have not been given a Window"

    .line 26
    .line 27
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final ω(Landroid/content/Context;)Lр;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/β;->д:Le5;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Le5;

    .line 6
    .line 7
    sget-object v1, Lm6;->λ:Lm6;

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
    new-instance v1, Lm6;

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
    invoke-direct {v1, p1, v2}, Lm6;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lm6;->λ:Lm6;

    .line 29
    .line 30
    :cond_0
    sget-object p1, Lm6;->λ:Lm6;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Le5;-><init>(Landroidx/appcompat/app/β;Lm6;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/appcompat/app/β;->д:Le5;

    .line 36
    .line 37
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/app/β;->д:Le5;

    .line 38
    .line 39
    return-object p0
.end method
