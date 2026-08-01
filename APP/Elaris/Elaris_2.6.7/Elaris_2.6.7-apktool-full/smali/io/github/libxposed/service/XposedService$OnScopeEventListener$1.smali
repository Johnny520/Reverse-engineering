.class Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;
.super Lio/github/libxposed/service/IXposedScopeCallback$Stub;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/libxposed/service/XposedService$OnScopeEventListener;->asInterface()Lio/github/libxposed/service/IXposedScopeCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

.field final synthetic val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;


# direct methods
.method public constructor <init>(Lio/github/libxposed/service/XposedService$OnScopeEventListener;Lio/github/libxposed/service/XposedService$OnScopeEventListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->this$0:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 2
    .line 3
    iput-object p2, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 4
    .line 5
    invoke-direct {p0}, Lio/github/libxposed/service/IXposedScopeCallback$Stub;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onScopeRequestApproved(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/github/libxposed/service/XposedService$OnScopeEventListener;->onScopeRequestApproved(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/github/libxposed/service/XposedService;->b()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onScopeRequestFailed(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/github/libxposed/service/XposedService$OnScopeEventListener;->onScopeRequestFailed(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/github/libxposed/service/XposedService;->b()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lio/github/libxposed/service/XposedService$OnScopeEventListener$1;->val$listener:Lio/github/libxposed/service/XposedService$OnScopeEventListener;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method
