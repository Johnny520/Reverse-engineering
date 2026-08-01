.class public final Ll01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lio/github/libxposed/api/XposedInterface$HookHandle;


# direct methods
.method public constructor <init>(Lio/github/libxposed/api/XposedInterface$HookHandle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll01;->α:Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 0

    .line 1
    iget-object p0, p0, Ll01;->α:Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$HookHandle;->unhook()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
