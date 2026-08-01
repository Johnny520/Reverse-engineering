.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookUriParse$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->hookUriParse()V
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
    instance-of p1, p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    if-nez p0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->access$isInteresting(Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const-string p1, "Uri.parse = "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "rfd109da2e72860ec"

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-static {p1, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, Ljava/lang/Throwable;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lln0;->з(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/16 v2, 0x1388

    .line 51
    .line 52
    invoke-static {p0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v2, "stack="

    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    return-void
.end method
