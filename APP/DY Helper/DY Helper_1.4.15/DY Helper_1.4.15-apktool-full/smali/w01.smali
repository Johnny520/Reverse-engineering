.class public final Lw01;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/content/res/Resources;

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/ClassLoader;

.field public ε:Landroid/view/LayoutInflater;

.field public ζ:Landroid/content/res/Resources$Theme;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 11
    .line 12
    iput-object p3, p0, Lw01;->β:Ljava/lang/String;

    .line 13
    .line 14
    const-string p1, "com.example.dyhelper"

    .line 15
    .line 16
    iput-object p1, p0, Lw01;->γ:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p4, p0, Lw01;->δ:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getAssets()Landroid/content/res/AssetManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lw01;->δ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-class v0, Lx01;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    return-object v0
.end method

.method public final getPackageCodePath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lw01;->β:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lw01;->γ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPackageResourcePath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lw01;->β:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 0

    .line 1
    iget-object p0, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "layout_inflater"

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lw01;->ε:Landroid/view/LayoutInflater;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lw01;->ε:Landroid/view/LayoutInflater;

    .line 29
    .line 30
    :cond_0
    return-object p1

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final getTheme()Landroid/content/res/Resources$Theme;
    .locals 3

    .line 1
    iget-object v0, p0, Lw01;->ζ:Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lw01;->α:Landroid/content/res/Resources;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 v1, v1, 0x30

    .line 26
    .line 27
    const/16 v2, 0x20

    .line 28
    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    const v1, 0x103022e

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const v1, 0x1030241

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v2, 0x1

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lw01;->ζ:Landroid/content/res/Resources$Theme;

    .line 43
    .line 44
    :cond_1
    return-object v0
.end method
