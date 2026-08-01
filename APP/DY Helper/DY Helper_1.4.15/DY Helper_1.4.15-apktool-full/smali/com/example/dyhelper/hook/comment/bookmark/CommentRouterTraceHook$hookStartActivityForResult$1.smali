.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookStartActivityForResult$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->hookStartActivityForResult()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm01;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lk01;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 5
    .line 6
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object p1, p1, v1

    .line 12
    .line 13
    const-string v1, "Activity.startActivityForResult"

    .line 14
    .line 15
    invoke-static {p0, v1, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->access$dumpIntent(Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
