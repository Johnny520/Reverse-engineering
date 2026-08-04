.class public final Lyyds/ᛶᛶᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;


# instance fields
.field public final ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;


# direct methods
.method public constructor <init>(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 2

    .line 1
    const-wide v0, -0x2e0dee68a836eL

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
    iput-object p1, p0, Lyyds/ᛶᛶᛴᲇ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getProcessName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛴᲇ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x2e0e4e68a836eL

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

.method public final isSystemServer()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛴᲇ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->isSystemServer()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
