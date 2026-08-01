.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookIntentSetData$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->hookIntentSetData()V
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
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    aget-object p0, p0, p1

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 19
    .line 20
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->access$isInteresting(Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string p1, "Intent.setData = "

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "rfd109da2e72860ec"

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-static {p1, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lln0;->з(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/16 v2, 0x1388

    .line 49
    .line 50
    invoke-static {p0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v2, "stack="

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p1, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-void
.end method
