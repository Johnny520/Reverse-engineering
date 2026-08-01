.class public interface abstract Lio/github/libxposed/service/XposedService$OnScopeEventListener;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/libxposed/service/XposedService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnScopeEventListener"
.end annotation


# direct methods
.method public static synthetic a(Lio/github/libxposed/service/XposedService$OnScopeEventListener;Lio/github/libxposed/service/XposedService$OnScopeEventListener;)Lio/github/libxposed/service/IXposedScopeCallback;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/github/libxposed/service/XposedService$OnScopeEventListener;->lambda$asInterface$0(Lio/github/libxposed/service/XposedService$OnScopeEventListener;)Lio/github/libxposed/service/IXposedScopeCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private asInterface()Lio/github/libxposed/service/IXposedScopeCallback;
    .locals 3

    .line 1
    invoke-static {}, Lio/github/libxposed/service/XposedService;->b()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lye;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2, p0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lio/github/libxposed/service/IXposedScopeCallback;

    .line 16
    .line 17
    return-object p0
.end method

.method public static bridge synthetic b(Lio/github/libxposed/service/XposedService$OnScopeEventListener;)Lio/github/libxposed/service/IXposedScopeCallback;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/service/XposedService$OnScopeEventListener;->asInterface()Lio/github/libxposed/service/IXposedScopeCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private synthetic lambda$asInterface$0(Lio/github/libxposed/service/XposedService$OnScopeEventListener;)Lio/github/libxposed/service/IXposedScopeCallback;
    .locals 1

    .line 1
    new-instance v0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;-><init>(Lio/github/libxposed/service/XposedService$OnScopeEventListener;Lio/github/libxposed/service/XposedService$OnScopeEventListener;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public onScopeRequestApproved(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public onScopeRequestFailed(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
