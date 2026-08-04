.class public final Lyyds/ᛲᲇᲀᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;


# instance fields
.field public final ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;


# direct methods
.method public constructor <init>(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V
    .locals 2

    .line 1
    const-wide v0, -0x2e091e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x2e0abe68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final getDefaultClassLoader()Ljava/lang/ClassLoader;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x2e0c3e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x2e097e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final isFirstPackage()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->isFirstPackage()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
