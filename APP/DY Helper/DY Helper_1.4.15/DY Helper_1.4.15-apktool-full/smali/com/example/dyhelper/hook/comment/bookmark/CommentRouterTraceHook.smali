.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

.field private static final TAG:Ljava/lang/String; = "rfd109da2e72860ec"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$dumpIntent(Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->dumpIntent(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$isInteresting(Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->isInteresting(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final dumpBundle(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v0, "{"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "="

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    instance-of v1, v2, Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    instance-of v1, v2, Ljava/lang/Number;

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    instance-of v1, v2, Ljava/lang/Boolean;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    goto :goto_1

    .line 69
    :cond_2
    const/4 v1, 0x0

    .line 70
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ":"

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_2
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :goto_3
    const-string v1, ", "

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const-string p1, "}"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_4

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    new-instance p1, Leo1;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    move-object p0, p1

    .line 108
    :goto_4
    instance-of p1, p0, Leo1;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    const-string p0, "bundle dump failed"

    .line 113
    .line 114
    :cond_5
    check-cast p0, Ljava/lang/String;

    .line 115
    .line 116
    return-object p0
.end method

.method private final dumpIntent(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    instance-of v0, p3, Landroid/content/Intent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p3, Landroid/content/Intent;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p3, v1

    .line 10
    :goto_0
    if-nez p3, :cond_1

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object v2, v1

    .line 29
    :goto_1
    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-direct {p0, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->dumpBundle(Landroid/os/Bundle;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v5, " "

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-direct {p0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->isInteresting(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_3

    .line 72
    .line 73
    :goto_2
    return-void

    .line 74
    :cond_3
    if-eqz p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object p0, v1

    .line 86
    :goto_3
    const-string p2, " caller="

    .line 87
    .line 88
    const-string v4, ", action="

    .line 89
    .line 90
    invoke-static {p1, p2, p0, v4, v3}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string p1, ", data="

    .line 95
    .line 96
    const-string p2, ", component="

    .line 97
    .line 98
    invoke-static {p0, p1, v0, p2, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string p1, ", extras="

    .line 102
    .line 103
    invoke-static {p0, p1, p3}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "rfd109da2e72860ec"

    .line 108
    .line 109
    const/4 p2, 0x4

    .line 110
    invoke-static {p1, p0, v1, p2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, Ljava/lang/Throwable;

    .line 114
    .line 115
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-static {p0}, Lln0;->з(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    const/16 p3, 0x1388

    .line 123
    .line 124
    invoke-static {p0, p3}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const-string p3, "stack="

    .line 129
    .line 130
    invoke-virtual {p3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p1, p0, v1, p2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method private final hookIntentSetData()V
    .locals 3

    .line 1
    :try_start_0
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-class p0, Landroid/content/Intent;

    .line 4
    .line 5
    const-string v0, "setData"

    .line 6
    .line 7
    const-class v1, Landroid/net/Uri;

    .line 8
    .line 9
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookIntentSetData$1;

    .line 10
    .line 11
    invoke-direct {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookIntentSetData$1;-><init>()V

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    const-string v0, "rfd109da2e72860ec"

    .line 24
    .line 25
    const-string v1, "hook Intent.setData failed"

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final hookStartActivity()V
    .locals 3

    .line 1
    :try_start_0
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-class p0, Landroid/app/Activity;

    .line 4
    .line 5
    const-string v0, "startActivity"

    .line 6
    .line 7
    const-class v1, Landroid/content/Intent;

    .line 8
    .line 9
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookStartActivity$1;

    .line 10
    .line 11
    invoke-direct {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookStartActivity$1;-><init>()V

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    const-string v0, "rfd109da2e72860ec"

    .line 24
    .line 25
    const-string v1, "hook startActivity failed"

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final hookStartActivityForResult()V
    .locals 4

    .line 1
    :try_start_0
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-class p0, Landroid/app/Activity;

    .line 4
    .line 5
    const-string v0, "startActivityForResult"

    .line 6
    .line 7
    const-class v1, Landroid/content/Intent;

    .line 8
    .line 9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookStartActivityForResult$1;

    .line 12
    .line 13
    invoke-direct {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookStartActivityForResult$1;-><init>()V

    .line 14
    .line 15
    .line 16
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p0, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    const-string v0, "rfd109da2e72860ec"

    .line 26
    .line 27
    const-string v1, "hook startActivityForResult failed"

    .line 28
    .line 29
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private final hookUriParse()V
    .locals 3

    .line 1
    :try_start_0
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-class p0, Landroid/net/Uri;

    .line 4
    .line 5
    const-string v0, "parse"

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookUriParse$1;

    .line 10
    .line 11
    invoke-direct {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook$hookUriParse$1;-><init>()V

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    const-string v0, "rfd109da2e72860ec"

    .line 24
    .line 25
    const-string v1, "hook Uri.parse failed"

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final isInteresting(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v0, "comment"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-string v0, "aweme/detail"

    .line 21
    .line 22
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const-string v0, "itemId"

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    const-string v0, "comment_id"

    .line 37
    .line 38
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, "click_share_comment"

    .line 45
    .line 46
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const-string v0, "10500"

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return p0

    .line 62
    :cond_2
    :goto_0
    return v1

    .line 63
    :cond_3
    :goto_1
    return p0
.end method


# virtual methods
.method public final init(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->hookStartActivity()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->hookStartActivityForResult()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
