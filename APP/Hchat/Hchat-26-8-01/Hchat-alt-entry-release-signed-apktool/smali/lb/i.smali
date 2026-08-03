.class public final Llb/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final A:[Ljava/lang/String;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Landroid/os/Handler;

.field public final m:Ljava/util/concurrent/ExecutorService;

.field public volatile n:Ljava/lang/reflect/Method;

.field public volatile o:Ljava/lang/ref/WeakReference;

.field public final p:Ljava/util/Map;

.field public final q:Ljava/util/Map;

.field public final r:Ljava/util/Map;

.field public final s:Ljava/util/concurrent/ConcurrentHashMap;

.field public final t:Ljava/util/Set;

.field public final u:Landroid/content/SharedPreferences;

.field public volatile v:Z

.field public volatile w:Z

.field public volatile x:Z

.field public volatile y:Z

.field public volatile z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "androidx.recyclerview.widget.RecyclerView"

    .line 2
    .line 3
    const-string v1, "android.support.v7.widget.RecyclerView"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Llb/i;->A:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llb/i;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Llb/i;->b:Lia/t;

    .line 10
    .line 11
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Llb/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Llb/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Llb/i;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Llb/i;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Llb/i;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Llb/i;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Llb/i;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, Llb/i;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Llb/i;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    new-instance p2, Landroid/os/Handler;

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Llb/i;->l:Landroid/os/Handler;

    .line 84
    .line 85
    new-instance p2, Lc9/q;

    .line 86
    .line 87
    const/16 v0, 0x14

    .line 88
    .line 89
    invoke-direct {p2, v0}, Lc9/q;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iput-object p2, p0, Llb/i;->m:Ljava/util/concurrent/ExecutorService;

    .line 97
    .line 98
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-direct {p2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    iput-object p2, p0, Llb/i;->p:Ljava/util/Map;

    .line 111
    .line 112
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iput-object p2, p0, Llb/i;->q:Ljava/util/Map;

    .line 117
    .line 118
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    iput-object p2, p0, Llb/i;->r:Ljava/util/Map;

    .line 123
    .line 124
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    .line 126
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p2, p0, Llb/i;->s:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    iput-object p2, p0, Llb/i;->t:Ljava/util/Set;

    .line 136
    .line 137
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 138
    .line 139
    const-string p2, "Hchat_swipe_quote_method_cache"

    .line 140
    .line 141
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, p0, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 146
    .line 147
    return-void
.end method

.method public static A(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-array v0, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1, p0, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static E(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x4

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v1, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast p0, Landroid/view/View;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method

.method public static G(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->j()Lk8/g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_6

    .line 27
    .line 28
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v1, v2

    .line 47
    :goto_0
    if-eqz v1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 51
    .line 52
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v1, "title"

    .line 60
    .line 61
    invoke-static {v3, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    move-object v2, v1

    .line 72
    :cond_3
    if-eqz v2, :cond_4

    .line 73
    .line 74
    move-object v1, v2

    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_1
    :try_start_0
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 81
    .line 82
    invoke-virtual {v0, v2, v3, p1, v1}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    new-instance p1, Lsf/f;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object p0, p1

    .line 98
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    instance-of v0, p0, Lsf/f;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    move-object p0, p1

    .line 105
    :cond_5
    check-cast p0, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 113
    return p0
.end method

.method public static I(Llb/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Llb/g;->d:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-wide/16 v2, 0x60

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Lg3/g;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-direct {v2, v0, v3}, Lg3/g;-><init>(Landroid/view/View;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Llb/g;->d:Landroid/view/View;

    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public static J(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p0, v1, :cond_e

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "com.tencent.mm.storage."

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v2, p1, v3}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    array-length v5, v5

    .line 73
    if-nez v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const-string v6, "getMsgId"

    .line 80
    .line 81
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-string v6, "getMsgID"

    .line 92
    .line 93
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    :cond_3
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_4

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-class v5, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    :cond_4
    invoke-static {p1}, Llb/i;->x(Ljava/lang/Object;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    const-wide/16 v6, 0x0

    .line 128
    .line 129
    cmp-long v2, v4, v6

    .line 130
    .line 131
    if-lez v2, :cond_5

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_5
    :goto_0
    const-string v2, "java."

    .line 135
    .line 136
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_e

    .line 141
    .line 142
    const-string v2, "android."

    .line 143
    .line 144
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :cond_6
    instance-of v1, p1, Landroid/view/View;

    .line 153
    .line 154
    if-nez v1, :cond_e

    .line 155
    .line 156
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 157
    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_7
    instance-of v1, p1, Ljava/util/Collection;

    .line 162
    .line 163
    if-eqz v1, :cond_9

    .line 164
    .line 165
    check-cast p1, Ljava/util/Collection;

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    add-int/lit8 v2, p0, 0x1

    .line 182
    .line 183
    invoke-static {v2, v1, p2}, Llb/i;->J(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_8

    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :goto_1
    if-eqz v1, :cond_e

    .line 195
    .line 196
    const-class v2, Ljava/lang/Object;

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-nez v2, :cond_e

    .line 203
    .line 204
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    :cond_a
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_d

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/reflect/Field;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_b

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_b
    const-class v5, Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-nez v5, :cond_a

    .line 248
    .line 249
    const-class v5, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_c

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_c
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    if-eqz v3, :cond_a

    .line 263
    .line 264
    add-int/lit8 v4, p0, 0x1

    .line 265
    .line 266
    invoke-static {v4, v3, p2}, Llb/i;->J(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    if-eqz v3, :cond_a

    .line 271
    .line 272
    return-object v3

    .line 273
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    goto :goto_1

    .line 278
    :cond_e
    :goto_3
    return-object v0
.end method

.method public static K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/util/Set;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, p0, v0}, Llb/i;->J(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static L(Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/String;)I
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v4, v1

    .line 18
    check-cast v4, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 19
    .line 20
    iget-wide v4, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 21
    .line 22
    cmp-long v4, v4, v2

    .line 23
    .line 24
    if-lez v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v4, 0x0

    .line 29
    :goto_0
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    :goto_1
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-wide v2, v1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 38
    .line 39
    :cond_3
    move-wide v6, v2

    .line 40
    new-instance v8, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 60
    .line 61
    invoke-static {}, La/a;->E()Luf/c;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {v1}, La/a;->t(Luf/c;)Luf/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v8, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const/16 v9, 0x3e8

    .line 98
    .line 99
    move-object v4, p1

    .line 100
    move-object v5, p2

    .line 101
    invoke-static/range {v4 .. v9}, Lj8/e;->d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    return p0
.end method

.method public static final N(Ljava/util/ArrayList;Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_2
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
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 32
    .line 33
    if-ne v1, p1, :cond_3

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_4
    :goto_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_5
    :goto_2
    return-void
.end method

.method public static a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V
    .locals 8

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    :goto_0
    if-eqz p2, :cond_9

    .line 9
    .line 10
    const-class v0, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_9

    .line 17
    .line 18
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_8

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/reflect/Field;

    .line 37
    .line 38
    const-class v2, Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x0

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    check-cast v1, Ljava/util/List;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v1, v3

    .line 66
    :goto_2
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const/4 v4, 0x0

    .line 73
    move v5, v4

    .line 74
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_5

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-eq v6, p1, :cond_6

    .line 85
    .line 86
    instance-of v7, v6, Landroid/view/MenuItem;

    .line 87
    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    check-cast v6, Landroid/view/MenuItem;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    move-object v6, v3

    .line 94
    :goto_4
    if-eqz v6, :cond_4

    .line 95
    .line 96
    invoke-interface {v6}, Landroid/view/MenuItem;->getItemId()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const v7, 0x48435250    # 200009.25f

    .line 101
    .line 102
    .line 103
    if-ne v6, v7, :cond_4

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    const/4 v5, -0x1

    .line 110
    :cond_6
    :goto_5
    if-lez v5, :cond_7

    .line 111
    .line 112
    :try_start_1
    invoke-interface {v1, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-interface {v1, v4, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    .line 119
    :catchall_1
    :cond_7
    if-ltz v5, :cond_0

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    goto :goto_0

    .line 127
    :cond_9
    :goto_6
    return-void
.end method

.method public static b(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpg-float v0, v0, v1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/high16 v1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static f(Ljava/lang/Object;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    const v0, 0x48435250    # 200009.25f

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "findItem"

    .line 13
    .line 14
    invoke-static {p0, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/view/MenuItem;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/view/MenuItem;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static h(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p3, v1, :cond_a

    .line 6
    .line 7
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    invoke-static {p1, p0}, Llb/i;->v(ILjava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-static {v1}, Llb/i;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    move v4, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, v3

    .line 32
    :goto_0
    if-eqz v4, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v1, v0

    .line 36
    :goto_1
    if-eqz v1, :cond_3

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v4, "java."

    .line 48
    .line 49
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_a

    .line 54
    .line 55
    const-string v4, "android."

    .line 56
    .line 57
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    instance-of v1, p0, Landroid/view/View;

    .line 65
    .line 66
    if-nez v1, :cond_a

    .line 67
    .line 68
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :goto_2
    if-eqz v1, :cond_a

    .line 78
    .line 79
    const-class v3, Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_a

    .line 86
    .line 87
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_9

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Ljava/lang/reflect/Field;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-nez v6, :cond_6

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_7

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    const-class v6, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-nez v6, :cond_6

    .line 131
    .line 132
    const-class v6, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    invoke-static {v4, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-eqz v4, :cond_6

    .line 146
    .line 147
    add-int/lit8 v5, p3, 0x1

    .line 148
    .line 149
    invoke-static {v4, p1, p2, v5}, Llb/i;->h(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    return-object v4

    .line 156
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    goto :goto_2

    .line 161
    :cond_a
    :goto_4
    return-object v0
.end method

.method public static t(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    array-length v0, v0

    .line 35
    const/4 v2, 0x3

    .line 36
    if-ne v0, v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    aget-object v0, v0, v1

    .line 43
    .line 44
    const-class v2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v2, 0x1

    .line 57
    aget-object v0, v0, v2

    .line 58
    .line 59
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    aget-object p0, p0, v2

    .line 72
    .line 73
    const-class v0, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    :cond_0
    return v2

    .line 82
    :cond_1
    return v1
.end method

.method public static u(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    array-length v0, v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    const-class v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    return v2

    .line 53
    :cond_0
    return v1
.end method

.method public static v(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-gez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge p0, v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "get"

    .line 38
    .line 39
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v0, v3, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v0, p1, p0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public static x(Ljava/lang/Object;)J
    .locals 8

    .line 1
    const-string v0, "getMsgID"

    .line 2
    .line 3
    const-string v1, "getId"

    .line 4
    .line 5
    const-string v2, "getMsgId"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    if-lt v2, v5, :cond_2

    .line 17
    .line 18
    const-string v0, "msgID"

    .line 19
    .line 20
    const-string v2, "id"

    .line 21
    .line 22
    const-string v5, "field_msgId"

    .line 23
    .line 24
    const-string v6, "msgId"

    .line 25
    .line 26
    filled-new-array {v5, v6, v0, v2}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :goto_1
    const/4 v0, 0x4

    .line 31
    if-lt v1, v0, :cond_0

    .line 32
    .line 33
    return-wide v3

    .line 34
    :cond_0
    aget-object v0, v5, v1

    .line 35
    .line 36
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Llb/i;->A(Ljava/lang/Object;)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    cmp-long v0, v6, v3

    .line 51
    .line 52
    if-lez v0, :cond_1

    .line 53
    .line 54
    return-wide v6

    .line 55
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    aget-object v5, v0, v2

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    new-array v7, v1, [Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {v6, v5, v7}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-array v6, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v5, p0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5}, Llb/i;->A(Ljava/lang/Object;)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    cmp-long v3, v5, v3

    .line 87
    .line 88
    if-lez v3, :cond_3

    .line 89
    .line 90
    return-wide v5

    .line 91
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0
.end method

.method public static z(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final C(Ljava/lang/Object;J)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "getChattingContext"

    .line 5
    .line 6
    invoke-static {p1, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    new-array v3, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v4, "a"

    .line 16
    .line 17
    invoke-static {v1, v4, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const-string v3, "c"

    .line 24
    .line 25
    invoke-static {v1, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Llb/i;->a:Lr8/g;

    .line 32
    .line 33
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 34
    .line 35
    const-string v5, "rb4.i1"

    .line 36
    .line 37
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 49
    .line 50
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v6, v4, v7}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-eqz v6, :cond_1

    .line 79
    .line 80
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v6, v1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-eqz v5, :cond_1

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {p0, v6}, Llb/i;->e(Ljava/lang/Class;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-nez v6, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    move-object v5, v2

    .line 106
    :goto_1
    if-eqz v5, :cond_a

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, "i"

    .line 113
    .line 114
    invoke-static {v1, v3}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 125
    .line 126
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_3

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const-class v4, Ljava/lang/Long;

    .line 137
    .line 138
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_4

    .line 143
    .line 144
    :cond_3
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-static {v1, v5, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    const-string p3, "g"

    .line 156
    .line 157
    invoke-static {p2, p3}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-eqz p2, :cond_7

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    const-class v1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {p3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p3

    .line 173
    if-eqz p3, :cond_7

    .line 174
    .line 175
    const-string p3, "getLastText"

    .line 176
    .line 177
    new-array v1, v0, [Ljava/lang/Object;

    .line 178
    .line 179
    invoke-static {p1, p3, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    instance-of v1, p3, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v1, :cond_5

    .line 186
    .line 187
    check-cast p3, Ljava/lang/String;

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    move-object p3, v2

    .line 191
    :goto_2
    if-eqz p3, :cond_6

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_6
    const-string p3, ""

    .line 195
    .line 196
    :goto_3
    invoke-static {p2, v5, p3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    :cond_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p0, p2}, Llb/i;->e(Ljava/lang/Class;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    if-eqz p3, :cond_8

    .line 216
    .line 217
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    check-cast p3, Ljava/lang/reflect/Method;

    .line 222
    .line 223
    new-array v1, v0, [Ljava/lang/Object;

    .line 224
    .line 225
    invoke-static {p3, v5, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    instance-of p2, p1, Landroid/view/View;

    .line 230
    .line 231
    if-eqz p2, :cond_9

    .line 232
    .line 233
    move-object v2, p1

    .line 234
    check-cast v2, Landroid/view/View;

    .line 235
    .line 236
    :cond_9
    invoke-static {v2}, Llb/i;->E(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    :cond_a
    return-void
.end method

.method public final D(Ljava/lang/Object;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Llb/i;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const-class v3, Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object v2, v0

    .line 21
    :goto_0
    if-eqz v2, :cond_4

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-nez v6, :cond_4

    .line 28
    .line 29
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_3

    .line 42
    .line 43
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-nez v9, :cond_1

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    const-string v10, "setMsgQuoteRlVisibility"

    .line 80
    .line 81
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_1

    .line 86
    .line 87
    array-length v9, v8

    .line 88
    const/4 v10, 0x1

    .line 89
    if-ne v9, v10, :cond_1

    .line 90
    .line 91
    aget-object v9, v8, v5

    .line 92
    .line 93
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_2

    .line 100
    .line 101
    aget-object v8, v8, v5

    .line 102
    .line 103
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_1

    .line 108
    .line 109
    :cond_2
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_0

    .line 124
    :cond_4
    move-object v2, v4

    .line 125
    :cond_5
    :goto_1
    if-eqz v2, :cond_7

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v2, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    instance-of v0, p1, Landroid/view/View;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    move-object v4, p1

    .line 146
    check-cast v4, Landroid/view/View;

    .line 147
    .line 148
    :cond_6
    invoke-static {v4}, Llb/i;->E(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_2
    if-eqz v0, :cond_c

    .line 157
    .line 158
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_c

    .line 163
    .line 164
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_b

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Ljava/lang/reflect/Field;

    .line 183
    .line 184
    const-class v6, Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-nez v6, :cond_9

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_9
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    instance-of v6, v2, Landroid/view/View;

    .line 202
    .line 203
    if-eqz v6, :cond_a

    .line 204
    .line 205
    check-cast v2, Landroid/view/View;

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_a
    move-object v2, v4

    .line 209
    :goto_4
    if-eqz v2, :cond_8

    .line 210
    .line 211
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    if-eqz v6, :cond_8

    .line 216
    .line 217
    move-object v4, v2

    .line 218
    goto :goto_5

    .line 219
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    goto :goto_2

    .line 224
    :cond_c
    :goto_5
    if-eqz v4, :cond_d

    .line 225
    .line 226
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    invoke-static {v4}, Llb/i;->E(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    :cond_d
    return-void
.end method

.method public final F(Llb/c;)Z
    .locals 8

    .line 1
    iget-object v5, p1, Llb/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lq8/m;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    :cond_1
    move-object v6, v0

    .line 20
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    :cond_2
    :goto_1
    move-object v2, p0

    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_3
    iget-object v0, p1, Llb/c;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_4

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_4
    :try_start_0
    invoke-virtual {p0, p1}, Llb/i;->H(Llb/c;)Llb/e;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object v2, p1, Llb/e;->a:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 46
    .line 47
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 48
    .line 49
    .line 50
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 51
    const/4 v7, 0x1

    .line 52
    if-nez v0, :cond_6

    .line 53
    .line 54
    :try_start_1
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    move v0, v1

    .line 62
    goto :goto_3

    .line 63
    :cond_6
    :goto_2
    move v0, v7

    .line 64
    :goto_3
    if-eqz v0, :cond_7

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_7
    :try_start_2
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 68
    .line 69
    .line 70
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    :try_start_3
    invoke-static {v2, v6}, Llb/i;->G(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    if-eqz v0, :cond_8

    .line 78
    .line 79
    return v7

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p1, v0

    .line 82
    move-object v2, p0

    .line 83
    goto :goto_7

    .line 84
    :cond_8
    :try_start_4
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_b

    .line 89
    .line 90
    iget-object v0, p1, Llb/e;->b:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 91
    .line 92
    iget-object p1, p1, Llb/e;->c:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 93
    .line 94
    filled-new-array {v0, p1}, [Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_9

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_9
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_b

    .line 110
    .line 111
    iget-object v4, p1, Lj8/p;->b:Lj8/y;

    .line 112
    .line 113
    if-eqz v4, :cond_b

    .line 114
    .line 115
    invoke-virtual {v4}, Lj8/y;->b()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_a

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_a
    iget-object p1, p0, Llb/i;->m:Ljava/util/concurrent/ExecutorService;

    .line 123
    .line 124
    new-instance v0, Lc9/w;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 125
    .line 126
    move-object v1, p0

    .line 127
    :try_start_5
    invoke-direct/range {v0 .. v6}, Lc9/w;-><init>(Llb/i;Lh/Hchat/hooks/api/model/WeChatMessage;[Lh/Hchat/hooks/api/model/WeChatMessage;Lj8/y;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 128
    .line 129
    .line 130
    move-object v2, v1

    .line 131
    :try_start_6
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 132
    .line 133
    .line 134
    return v7

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    move-object v2, v1

    .line 137
    goto :goto_4

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object v2, p0

    .line 140
    :goto_4
    move-object p1, v0

    .line 141
    goto :goto_7

    .line 142
    :cond_b
    :goto_5
    move-object p1, v2

    .line 143
    move-object v2, p0

    .line 144
    invoke-static {p1, v5}, Lfb/v0;->e(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/Object;)Lk8/t;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_c

    .line 149
    .line 150
    invoke-virtual {p0, v6, p1}, Llb/i;->M(Ljava/lang/String;Lk8/t;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 158
    goto :goto_8

    .line 159
    :catchall_3
    move-exception v0

    .line 160
    goto :goto_4

    .line 161
    :cond_c
    :goto_6
    return v1

    .line 162
    :goto_7
    new-instance v0, Lsf/f;

    .line 163
    .line 164
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object p1, v0

    .line 168
    :goto_8
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-nez v0, :cond_d

    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_d
    iget-object p1, v2, Llb/i;->b:Lia/t;

    .line 176
    .line 177
    const-string v1, "\u590d\u8bfb\u6d88\u606f\u5904\u7406\u5931\u8d25"

    .line 178
    .line 179
    invoke-virtual {p1, v1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    :goto_9
    check-cast p1, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    return p1
.end method

.method public final H(Llb/c;)Llb/e;
    .locals 5

    .line 1
    iget-wide v0, p1, Llb/c;->b:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v3, v0, v1}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 11
    .line 12
    .line 13
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_1

    .line 15
    :catchall_0
    move-exception v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v2

    .line 18
    goto :goto_1

    .line 19
    :goto_0
    :try_start_1
    new-instance v4, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v3, v4

    .line 25
    :goto_1
    nop

    .line 26
    instance-of v4, v3, Lsf/f;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    move-object v3, v2

    .line 31
    :cond_1
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 32
    .line 33
    iget-object v4, p1, Llb/c;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, p1, Llb/c;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, v0, v1, p1, v4}, Llb/i;->w(JLjava/lang/String;Ljava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-static {p1}, Lfb/v0;->y(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    invoke-static {v3}, Lfb/v0;->y(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    :cond_2
    move-object v0, p1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    if-eqz v3, :cond_2

    .line 70
    .line 71
    move-object v0, v3

    .line 72
    :goto_2
    if-eqz v0, :cond_4

    .line 73
    .line 74
    new-instance v1, Llb/e;

    .line 75
    .line 76
    invoke-direct {v1, v0, v3, p1}, Llb/e;-><init>(Lh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-object v1, v2

    .line 83
    goto :goto_4

    .line 84
    :goto_3
    new-instance v1, Lsf/f;

    .line 85
    .line 86
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :goto_4
    instance-of p1, v1, Lsf/f;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_5
    move-object v2, v1

    .line 95
    :goto_5
    check-cast v2, Llb/e;

    .line 96
    .line 97
    return-object v2
.end method

.method public final M(Ljava/lang/String;Lk8/t;)Z
    .locals 6

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Llb/i;->a:Lr8/g;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 20
    .line 21
    :goto_1
    new-instance v3, Landroid/content/Intent;

    .line 22
    .line 23
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v4, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 33
    .line 34
    invoke-virtual {v3, v1, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/high16 v0, 0x10000000

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    :cond_2
    const-string v0, "Retr_MsgQuickShare"

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    const-string v0, "Select_Conv_User"

    .line 51
    .line 52
    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string p1, "custom_send_text"

    .line 56
    .line 57
    const-string v0, ""

    .line 58
    .line 59
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string p1, "Retr_Msg_Type"

    .line 63
    .line 64
    iget v0, p2, Lk8/t;->d:I

    .line 65
    .line 66
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    const-string p1, "Retr_Msg_Id"

    .line 70
    .line 71
    iget-wide v4, p2, Lk8/t;->a:J

    .line 72
    .line 73
    invoke-virtual {v3, p1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    const-string p1, "Retr_MsgTalker"

    .line 77
    .line 78
    iget-object v0, p2, Lk8/t;->b:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    const-string p1, "Retr_Msg_content"

    .line 84
    .line 85
    iget-object v0, p2, Lk8/t;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    const-string p1, "Retr_File_Name"

    .line 91
    .line 92
    iget-object v0, p2, Lk8/t;->f:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    const-string p1, "Edit_Mode_Sigle_Msg"

    .line 98
    .line 99
    invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    const-string p1, "Retr_MsgFromScene"

    .line 103
    .line 104
    iget v0, p2, Lk8/t;->e:I

    .line 105
    .line 106
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    const-string p1, "Retr_show_success_tips"

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    const-string p1, "Retr_go_to_chattingUI"

    .line 116
    .line 117
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    const-string p1, "Retr_start_where_you_are"

    .line 121
    .line 122
    invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    const-string p1, "hchat_silent_repeat"

    .line 126
    .line 127
    invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    const-string p1, "scene_from"

    .line 131
    .line 132
    const/16 v0, 0x11

    .line 133
    .line 134
    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    iget p1, p2, Lk8/t;->g:I

    .line 138
    .line 139
    if-lez p1, :cond_3

    .line 140
    .line 141
    const-string p2, "Retr_length"

    .line 142
    .line 143
    invoke-virtual {v3, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 144
    .line 145
    .line 146
    :cond_3
    :try_start_0
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 147
    .line 148
    .line 149
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception p1

    .line 153
    new-instance p2, Lsf/f;

    .line 154
    .line 155
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p1, p2

    .line 159
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-nez p2, :cond_4

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    iget-object p1, p0, Llb/i;->b:Lia/t;

    .line 167
    .line 168
    const-string v0, "\u590d\u8bfb\u542f\u52a8\u5fae\u4fe1\u8f6c\u53d1\u5931\u8d25"

    .line 169
    .line 170
    invoke-virtual {p1, v0, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 174
    .line 175
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    return p1
.end method

.method public final c(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Llb/i;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    mul-float/2addr p1, v0

    .line 16
    return p1
.end method

.method public final d(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    check-cast p1, Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_1
    if-lt v1, v0, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v2}, Llb/i;->d(Landroid/view/View;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_2
    const/4 p1, 0x0

    .line 72
    return-object p1
.end method

.method public final e(Ljava/lang/Class;)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Llb/i;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    move-object v2, p1

    .line 18
    :goto_0
    if-eqz v2, :cond_4

    .line 19
    .line 20
    const-class v3, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_4

    .line 27
    .line 28
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    array-length v5, v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    const-string v6, "M0"

    .line 86
    .line 87
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_1

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-object v1
.end method

.method public final varargs g([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Llb/i;->a:Lr8/g;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v3, p1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    :try_start_1
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v2

    .line 57
    :try_start_2
    new-instance v3, Lsf/f;

    .line 58
    .line 59
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v3

    .line 63
    :goto_1
    nop

    .line 64
    instance-of v3, v2, Lsf/f;

    .line 65
    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    :cond_1
    check-cast v2, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    new-instance v1, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    iget-object v0, p0, Llb/i;->b:Lia/t;

    .line 91
    .line 92
    const-string v1, "\u5de6\u6ed1\u5f15\u7528\u5b9a\u4f4d\u65b9\u6cd5\u5931\u8d25"

    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 98
    .line 99
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 100
    .line 101
    return-object v1
.end method

.method public final i(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    iget-object v0, p0, Llb/i;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    const-class v3, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_6

    .line 23
    .line 24
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, "itemView"

    .line 50
    .line 51
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-class v6, Landroid/view/View;

    .line 62
    .line 63
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v5, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    const/4 v5, 0x1

    .line 73
    :goto_2
    if-eqz v5, :cond_1

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    :cond_4
    check-cast v2, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_0

    .line 89
    :cond_6
    return-object v2
.end method

.method public final j(Landroid/view/View;)Llb/c;
    .locals 3

    .line 1
    iget-object v0, p0, Llb/i;->p:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llb/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-lt v1, v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2}, Llb/i;->j(Landroid/view/View;)Llb/c;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "U0"

    .line 8
    .line 9
    invoke-static {p1, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    const-string v1, "setToSendTextColor"

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "setMode"

    .line 35
    .line 36
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, v3, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :goto_0
    const/4 v1, 0x1

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, p1, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, p1, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_1
    instance-of v0, p1, Landroid/view/View;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    check-cast p1, Landroid/view/View;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    const/4 p1, 0x0

    .line 93
    :goto_2
    if-eqz p1, :cond_4

    .line 94
    .line 95
    new-instance v0, Le9/o;

    .line 96
    .line 97
    const/4 v1, 0x1

    .line 98
    invoke-direct {v0, p0, p1, v2, v1}, Le9/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    const-wide/16 v1, 0x50

    .line 102
    .line 103
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void
.end method

.method public final l(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-class v0, Landroid/view/MotionEvent;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, p2, v0}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_2

    .line 34
    .line 35
    :try_start_0
    sget-object p1, Lr8/i;->b:Lr8/i;

    .line 36
    .line 37
    new-instance v1, Llb/h;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, p0, v2}, Llb/h;-><init>(Llb/i;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 44
    .line 45
    .line 46
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    new-instance v0, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const-string p1, "\u5de6\u6ed1\u5f15\u7528\u5217\u8868\u89e6\u6478Hook\u5931\u8d25: "

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p2, p0, Llb/i;->b:Lia/t;

    .line 70
    .line 71
    invoke-virtual {p2, p1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_2
    const/4 p1, 0x0

    .line 84
    return p1
.end method

.method public final m(Ljava/lang/reflect/Method;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget-object v0, p0, Llb/i;->t:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    new-instance v2, Lf9/d;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v2, p2, p0, v3}, Lf9/d;-><init>(ZLjava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 41
    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    new-instance v1, Lsf/f;

    .line 48
    .line 49
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p2, v1

    .line 53
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, "\u957f\u6309\u590d\u8bfb\u83dc\u5355Hook\u5b89\u88c5\u5931\u8d25: "

    .line 70
    .line 71
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p2, p0, Llb/i;->b:Lia/t;

    .line 82
    .line 83
    invoke-virtual {p2, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 87
    .line 88
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1

    .line 95
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 96
    return p1
.end method

.method public final n()Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Llb/i;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Llb/i;->y()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iget-object v3, p0, Llb/i;->a:Lr8/g;

    .line 14
    .line 15
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    const-string v4, "adapter_bind"

    .line 18
    .line 19
    invoke-static {v2, v0, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Llb/i;->s(Ljava/lang/reflect/Method;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v3, v5

    .line 34
    :goto_0
    if-eqz v3, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const-string v3, "_onBindViewHolder["

    .line 38
    .line 39
    const-string v6, "msgInfo"

    .line 40
    .line 41
    const-string v7, "MicroMsg.ChattingDataAdapterV3"

    .line 42
    .line 43
    filled-new-array {v7, v3, v6}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p0, v3}, Llb/i;->g([Ljava/lang/String;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    const-string v3, "holder"

    .line 58
    .line 59
    const-string v6, "itemView"

    .line 60
    .line 61
    filled-new-array {v7, v3, v6}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p0, v3}, Llb/i;->g([Ljava/lang/String;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_5

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    move-object v7, v6

    .line 84
    check-cast v7, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-virtual {p0, v7}, Llb/i;->s(Ljava/lang/reflect/Method;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move-object v6, v5

    .line 94
    :goto_1
    move-object v3, v6

    .line 95
    check-cast v3, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    invoke-static {v2, v0, v4, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    const-string v6, "cache.key"

    .line 104
    .line 105
    :try_start_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const-string v8, ""

    .line 110
    .line 111
    invoke-interface {v2, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_7

    .line 120
    .line 121
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-interface {v2, v6, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-interface {v7, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    .line 135
    :catchall_0
    :goto_2
    if-eqz v3, :cond_9

    .line 136
    .line 137
    :try_start_1
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 138
    .line 139
    new-instance v2, Llb/h;

    .line 140
    .line 141
    const/4 v4, 0x1

    .line 142
    invoke-direct {v2, p0, v4}, Llb/h;-><init>(Llb/i;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 146
    .line 147
    .line 148
    iput-boolean v1, p0, Llb/i;->v:Z

    .line 149
    .line 150
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    new-instance v1, Lsf/f;

    .line 155
    .line 156
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    move-object v0, v1

    .line 160
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-nez v1, :cond_8

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    iget-object v0, p0, Llb/i;->b:Lia/t;

    .line 168
    .line 169
    const-string v2, "\u5de6\u6ed1\u5f15\u7528\u804a\u5929\u9002\u914d\u5668Hook\u5931\u8d25"

    .line 170
    .line 171
    invoke-virtual {v0, v2, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    return v0

    .line 183
    :cond_9
    iget-object v0, p0, Llb/i;->b:Lia/t;

    .line 184
    .line 185
    const-string v1, "\u5de6\u6ed1\u5f15\u7528\u5b9a\u4f4d\u804a\u5929\u9002\u914d\u5668\u5931\u8d25"

    .line 186
    .line 187
    invoke-virtual {v0, v1, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const/4 v0, 0x0

    .line 191
    return v0
.end method

.method public final o()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Llb/i;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Llb/i;->a:Lr8/g;

    .line 8
    .line 9
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    const-string v2, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 12
    .line 13
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    const-string v3, "onAttachedToWindow"

    .line 21
    .line 22
    new-array v4, v2, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {v0, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    const-string v4, "onDetachedFromWindow"

    .line 31
    .line 32
    new-array v2, v2, [Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v0, v4, v2}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :try_start_0
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 39
    .line 40
    new-instance v4, Llb/h;

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    invoke-direct {v4, p0, v5}, Llb/h;-><init>(Llb/i;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    new-instance v3, Llb/h;

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-direct {v3, p0, v4}, Llb/h;-><init>(Llb/i;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    iput-boolean v1, p0, Llb/i;->y:Z

    .line 64
    .line 65
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_1
    new-instance v1, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object v0, v1

    .line 74
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    iget-object v0, p0, Llb/i;->b:Lia/t;

    .line 82
    .line 83
    const-string v2, "\u5de6\u6ed1\u5f15\u7528\u8f93\u5165\u680f\u751f\u547d\u5468\u671fHook\u5931\u8d25"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    return v0

    .line 97
    :cond_3
    return v2
.end method

.method public final p()Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Llb/i;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Llb/i;->x:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-boolean v0, p0, Llb/i;->w:Z

    .line 12
    .line 13
    iget-boolean v2, p0, Llb/i;->x:Z

    .line 14
    .line 15
    sget-object v3, Llb/i;->A:[Ljava/lang/String;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    const/4 v6, 0x2

    .line 20
    if-lt v5, v6, :cond_2

    .line 21
    .line 22
    iput-boolean v0, p0, Llb/i;->w:Z

    .line 23
    .line 24
    iput-boolean v2, p0, Llb/i;->x:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    return v4

    .line 32
    :cond_2
    aget-object v6, v3, v5

    .line 33
    .line 34
    iget-object v7, p0, Llb/i;->a:Lr8/g;

    .line 35
    .line 36
    iget-object v7, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 37
    .line 38
    invoke-static {v6, v7}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-eqz v6, :cond_4

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    const-string v0, "onInterceptTouchEvent"

    .line 47
    .line 48
    invoke-virtual {p0, v6, v0}, Llb/i;->l(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :cond_3
    if-nez v2, :cond_4

    .line 53
    .line 54
    const-string v2, "onTouchEvent"

    .line 55
    .line 56
    invoke-virtual {p0, v6, v2}, Llb/i;->l(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0
.end method

.method public final q()Z
    .locals 11

    .line 1
    iget-boolean v0, p0, Llb/i;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Llb/i;->y()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v2, Le8/b;->a:Le8/b;

    .line 12
    .line 13
    iget-object v3, p0, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    iget-object v4, p0, Llb/i;->a:Lr8/g;

    .line 16
    .line 17
    iget-object v5, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    const-string v6, "retransmit_done"

    .line 20
    .line 21
    invoke-static {v3, v0, v5, v6}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_2

    .line 39
    .line 40
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    move-object v9, v8

    .line 45
    check-cast v9, Ljava/lang/reflect/Method;

    .line 46
    .line 47
    invoke-static {v9}, Llb/i;->u(Ljava/lang/reflect/Method;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_1

    .line 52
    .line 53
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    new-instance v5, Ljava/util/HashSet;

    .line 58
    .line 59
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v8, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_4

    .line 76
    .line 77
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    move-object v10, v9

    .line 82
    check-cast v10, Ljava/lang/reflect/Method;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_3

    .line 93
    .line 94
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_5

    .line 103
    .line 104
    goto/16 :goto_7

    .line 105
    .line 106
    :cond_5
    :try_start_0
    iget-object v5, v4, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 107
    .line 108
    new-instance v7, Lch/e;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    new-instance v8, Lfh/k;

    .line 114
    .line 115
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v9, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 119
    .line 120
    const/4 v10, 0x5

    .line 121
    invoke-virtual {v8, v10, v9}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v9, "sendResult"

    .line 125
    .line 126
    const-string v10, "SendMsgUsernames"

    .line 127
    .line 128
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-static {v9}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-static {v8, v9}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 137
    .line 138
    .line 139
    iput-object v8, v7, Lch/e;->h:Lfh/k;

    .line 140
    .line 141
    invoke-virtual {v5, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    new-instance v7, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_8

    .line 159
    .line 160
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 165
    .line 166
    :try_start_1
    iget-object v9, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 167
    .line 168
    invoke-virtual {v8, v9}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 169
    .line 170
    .line 171
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    goto :goto_3

    .line 173
    :catchall_0
    move-exception v8

    .line 174
    :try_start_2
    new-instance v9, Lsf/f;

    .line 175
    .line 176
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    move-object v8, v9

    .line 180
    :goto_3
    nop

    .line 181
    instance-of v9, v8, Lsf/f;

    .line 182
    .line 183
    if-eqz v9, :cond_7

    .line 184
    .line 185
    const/4 v8, 0x0

    .line 186
    :cond_7
    check-cast v8, Ljava/lang/reflect/Method;

    .line 187
    .line 188
    if-eqz v8, :cond_6

    .line 189
    .line 190
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :catchall_1
    move-exception v4

    .line 195
    goto :goto_6

    .line 196
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :cond_9
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_a

    .line 210
    .line 211
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    move-object v8, v7

    .line 216
    check-cast v8, Ljava/lang/reflect/Method;

    .line 217
    .line 218
    invoke-static {v8}, Llb/i;->u(Ljava/lang/reflect/Method;)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-eqz v8, :cond_9

    .line 223
    .line 224
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    new-instance v5, Ljava/util/HashSet;

    .line 229
    .line 230
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 231
    .line 232
    .line 233
    new-instance v7, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    if-eqz v8, :cond_c

    .line 247
    .line 248
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    move-object v9, v8

    .line 253
    check-cast v9, Ljava/lang/reflect/Method;

    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-eqz v9, :cond_b

    .line 264
    .line 265
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :goto_6
    new-instance v7, Lsf/f;

    .line 270
    .line 271
    invoke-direct {v7, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    :cond_c
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 275
    .line 276
    instance-of v5, v7, Lsf/f;

    .line 277
    .line 278
    if-eqz v5, :cond_d

    .line 279
    .line 280
    move-object v7, v4

    .line 281
    :cond_d
    move-object v8, v7

    .line 282
    check-cast v8, Ljava/util/List;

    .line 283
    .line 284
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-nez v4, :cond_e

    .line 289
    .line 290
    invoke-virtual {v2, v3, v0, v6, v8}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_e
    const-string v2, "cache.key"

    .line 295
    .line 296
    :try_start_3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    const-string v5, ""

    .line 301
    .line 302
    invoke-interface {v3, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-nez v3, :cond_f

    .line 311
    .line 312
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 317
    .line 318
    .line 319
    :cond_f
    invoke-interface {v4, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 324
    .line 325
    .line 326
    :catchall_2
    :goto_7
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    const/4 v2, 0x0

    .line 331
    if-eqz v0, :cond_10

    .line 332
    .line 333
    return v2

    .line 334
    :cond_10
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_12

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Ljava/lang/reflect/Method;

    .line 349
    .line 350
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    if-eqz v3, :cond_11

    .line 355
    .line 356
    :try_start_4
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 357
    .line 358
    new-instance v5, Lba/f;

    .line 359
    .line 360
    const/16 v6, 0x11

    .line 361
    .line 362
    invoke-direct {v5, v6}, Lba/f;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 366
    .line 367
    .line 368
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 369
    goto :goto_8

    .line 370
    :catchall_3
    move-exception v3

    .line 371
    new-instance v4, Lsf/f;

    .line 372
    .line 373
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    move-object v3, v4

    .line 377
    :goto_8
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    if-eqz v3, :cond_11

    .line 382
    .line 383
    iget-object v0, p0, Llb/i;->b:Lia/t;

    .line 384
    .line 385
    const-string v1, "\u5de6\u6ed1\u53f3\u6ed1\u91cd\u53d1\u5b8c\u6210Hook\u5931\u8d25"

    .line 386
    .line 387
    invoke-virtual {v0, v1, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    return v2

    .line 391
    :cond_12
    iput-boolean v1, p0, Llb/i;->z:Z

    .line 392
    .line 393
    return v1
.end method

.method public final r(Ljava/lang/Object;J)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Llb/i;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move-object v2, v0

    .line 19
    :goto_0
    if-eqz v2, :cond_4

    .line 20
    .line 21
    const-class v5, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_4

    .line 28
    .line 29
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-nez v8, :cond_1

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    const-string v9, "setLastQuoteMsgId"

    .line 80
    .line 81
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_1

    .line 86
    .line 87
    array-length v8, v7

    .line 88
    if-ne v8, v3, :cond_1

    .line 89
    .line 90
    aget-object v8, v7, v4

    .line 91
    .line 92
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-nez v8, :cond_2

    .line 99
    .line 100
    aget-object v7, v7, v4

    .line 101
    .line 102
    const-class v8, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_1

    .line 109
    .line 110
    :cond_2
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_0

    .line 125
    :cond_4
    const/4 v2, 0x0

    .line 126
    :cond_5
    :goto_1
    if-eqz v2, :cond_7

    .line 127
    .line 128
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {v2, p1, p2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_6

    .line 141
    .line 142
    return v3

    .line 143
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    :cond_7
    return v4
.end method

.method public final s(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_7

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    aget-object v1, p1, v0

    .line 12
    .line 13
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_7

    .line 20
    .line 21
    aget-object p1, p1, v2

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v1, p0, Llb/i;->a:Lr8/g;

    .line 28
    .line 29
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    const-string v3, "androidx.recyclerview.widget.RecyclerView$ViewHolder"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    new-instance v3, Lsf/f;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v3

    .line 53
    :goto_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    instance-of v4, v1, Lsf/f;

    .line 56
    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    move-object v1, v3

    .line 60
    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {p0, p1}, Llb/i;->i(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    if-eqz p1, :cond_7

    .line 77
    .line 78
    const-class v1, Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_7

    .line 85
    .line 86
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-class v4, Landroid/view/View;

    .line 120
    .line 121
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_5

    .line 126
    .line 127
    :goto_2
    move v2, v0

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    goto :goto_1

    .line 134
    :cond_7
    :goto_4
    return v2
.end method

.method public final w(JLjava/lang/String;Ljava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 37

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const-string v1, "field_content"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    const-string v4, ""

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    if-eqz v1, :cond_2

    .line 31
    .line 32
    :goto_2
    move-object/from16 v6, p0

    .line 33
    .line 34
    move-object/from16 v30, v1

    .line 35
    .line 36
    move-object/from16 v18, v4

    .line 37
    .line 38
    move v8, v5

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    goto/16 :goto_15

    .line 42
    .line 43
    :cond_2
    const-string v1, "content"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    instance-of v6, v1, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    const/4 v1, 0x0

    .line 57
    :goto_3
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_4

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    const/4 v1, 0x0

    .line 67
    :goto_4
    if-eqz v1, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object/from16 v6, p0

    .line 75
    .line 76
    iget-object v7, v6, Llb/i;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-virtual {v7, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    const-string v9, "getContent"

    .line 83
    .line 84
    if-nez v8, :cond_1b

    .line 85
    .line 86
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    new-instance v10, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    :cond_6
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    const-string v12, "W0"

    .line 104
    .line 105
    const-string v13, "U1"

    .line 106
    .line 107
    const-string v14, "A1"

    .line 108
    .line 109
    const-string v15, "j"

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const-class v3, Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v11, :cond_7

    .line 116
    .line 117
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    move-object/from16 v17, v11

    .line 122
    .line 123
    check-cast v17, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    array-length v2, v2

    .line 133
    if-nez v2, :cond_6

    .line 134
    .line 135
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    filled-new-array {v9, v15, v14, v13, v12}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v2, v3}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_11

    .line 177
    .line 178
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    new-array v11, v5, [Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v10, v0, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    instance-of v5, v11, Ljava/lang/String;

    .line 191
    .line 192
    if-eqz v5, :cond_8

    .line 193
    .line 194
    check-cast v11, Ljava/lang/String;

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_8
    move-object/from16 v11, v16

    .line 198
    .line 199
    :goto_7
    if-eqz v11, :cond_f

    .line 200
    .line 201
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_9

    .line 206
    .line 207
    move-object/from16 v18, v4

    .line 208
    .line 209
    const/4 v4, 0x0

    .line 210
    goto :goto_a

    .line 211
    :cond_9
    const-string v5, "voicelength"

    .line 212
    .line 213
    move-object/from16 v18, v4

    .line 214
    .line 215
    const/4 v4, 0x1

    .line 216
    invoke-static {v11, v5, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-nez v5, :cond_b

    .line 221
    .line 222
    const-string v5, "length="

    .line 223
    .line 224
    invoke-static {v11, v5, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_a

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_a
    move v5, v4

    .line 232
    goto :goto_9

    .line 233
    :cond_b
    :goto_8
    const/16 v5, 0xd

    .line 234
    .line 235
    :goto_9
    const/16 v4, 0x3a

    .line 236
    .line 237
    invoke-static {v11, v4}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_c

    .line 242
    .line 243
    add-int/lit8 v5, v5, 0x4

    .line 244
    .line 245
    :cond_c
    const/16 v4, 0x3c

    .line 246
    .line 247
    invoke-static {v11, v4}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_d

    .line 252
    .line 253
    add-int/lit8 v4, v5, 0x2

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_d
    move v4, v5

    .line 257
    :goto_a
    if-gtz v4, :cond_e

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_e
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    new-instance v5, Lsf/e;

    .line 265
    .line 266
    invoke-direct {v5, v10, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_c

    .line 270
    :cond_f
    move-object/from16 v18, v4

    .line 271
    .line 272
    :goto_b
    move-object/from16 v5, v16

    .line 273
    .line 274
    :goto_c
    if-eqz v5, :cond_10

    .line 275
    .line 276
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    :cond_10
    move-object/from16 v4, v18

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    goto :goto_6

    .line 283
    :cond_11
    move-object/from16 v18, v4

    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-nez v4, :cond_12

    .line 294
    .line 295
    move-object/from16 v4, v16

    .line 296
    .line 297
    goto :goto_d

    .line 298
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-nez v5, :cond_13

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :cond_13
    move-object v5, v4

    .line 310
    check-cast v5, Lsf/e;

    .line 311
    .line 312
    iget-object v5, v5, Lsf/e;->h:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v5, Ljava/lang/Number;

    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    move-object v10, v8

    .line 329
    check-cast v10, Lsf/e;

    .line 330
    .line 331
    iget-object v10, v10, Lsf/e;->h:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v10, Ljava/lang/Number;

    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    invoke-virtual {v5, v10}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    if-gez v11, :cond_15

    .line 348
    .line 349
    move-object v4, v8

    .line 350
    move-object v5, v10

    .line 351
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    if-nez v8, :cond_14

    .line 356
    .line 357
    :goto_d
    check-cast v4, Lsf/e;

    .line 358
    .line 359
    if-eqz v4, :cond_16

    .line 360
    .line 361
    iget-object v2, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v2, Ljava/lang/reflect/Method;

    .line 364
    .line 365
    if-eqz v2, :cond_16

    .line 366
    .line 367
    goto :goto_10

    .line 368
    :cond_16
    filled-new-array {v9, v15, v14, v13, v12}, [Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/4 v4, 0x0

    .line 373
    :goto_e
    const/4 v5, 0x5

    .line 374
    if-ge v4, v5, :cond_19

    .line 375
    .line 376
    aget-object v5, v2, v4

    .line 377
    .line 378
    const/4 v8, 0x0

    .line 379
    new-array v10, v8, [Ljava/lang/Class;

    .line 380
    .line 381
    invoke-static {v1, v5, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    if-eqz v5, :cond_17

    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    array-length v8, v8

    .line 395
    if-nez v8, :cond_17

    .line 396
    .line 397
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-eqz v8, :cond_17

    .line 406
    .line 407
    goto :goto_f

    .line 408
    :cond_17
    move-object/from16 v5, v16

    .line 409
    .line 410
    :goto_f
    if-eqz v5, :cond_18

    .line 411
    .line 412
    move-object v2, v5

    .line 413
    goto :goto_10

    .line 414
    :cond_18
    add-int/lit8 v4, v4, 0x1

    .line 415
    .line 416
    goto :goto_e

    .line 417
    :cond_19
    move-object/from16 v2, v16

    .line 418
    .line 419
    :goto_10
    invoke-virtual {v7, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-nez v1, :cond_1a

    .line 424
    .line 425
    move-object v8, v2

    .line 426
    goto :goto_11

    .line 427
    :cond_1a
    move-object v8, v1

    .line 428
    goto :goto_11

    .line 429
    :cond_1b
    move-object/from16 v18, v4

    .line 430
    .line 431
    const/16 v16, 0x0

    .line 432
    .line 433
    :goto_11
    check-cast v8, Ljava/lang/reflect/Method;

    .line 434
    .line 435
    if-eqz v8, :cond_1e

    .line 436
    .line 437
    const/4 v1, 0x0

    .line 438
    new-array v2, v1, [Ljava/lang/Object;

    .line 439
    .line 440
    invoke-static {v8, v0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    instance-of v2, v1, Ljava/lang/String;

    .line 445
    .line 446
    if-eqz v2, :cond_1c

    .line 447
    .line 448
    check-cast v1, Ljava/lang/String;

    .line 449
    .line 450
    goto :goto_12

    .line 451
    :cond_1c
    move-object/from16 v1, v16

    .line 452
    .line 453
    :goto_12
    if-eqz v1, :cond_1e

    .line 454
    .line 455
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-nez v2, :cond_1d

    .line 460
    .line 461
    goto :goto_13

    .line 462
    :cond_1d
    move-object/from16 v1, v16

    .line 463
    .line 464
    :goto_13
    if-eqz v1, :cond_1e

    .line 465
    .line 466
    move-object/from16 v30, v1

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    goto :goto_15

    .line 470
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    const/4 v8, 0x0

    .line 475
    new-array v2, v8, [Ljava/lang/Class;

    .line 476
    .line 477
    invoke-static {v1, v9, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    new-array v2, v8, [Ljava/lang/Object;

    .line 482
    .line 483
    invoke-static {v1, v0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    instance-of v2, v1, Ljava/lang/String;

    .line 488
    .line 489
    if-eqz v2, :cond_1f

    .line 490
    .line 491
    check-cast v1, Ljava/lang/String;

    .line 492
    .line 493
    goto :goto_14

    .line 494
    :cond_1f
    move-object/from16 v1, v16

    .line 495
    .line 496
    :goto_14
    if-nez v1, :cond_20

    .line 497
    .line 498
    move-object/from16 v30, v18

    .line 499
    .line 500
    goto :goto_15

    .line 501
    :cond_20
    move-object/from16 v30, v1

    .line 502
    .line 503
    :goto_15
    const-string v1, "field_type"

    .line 504
    .line 505
    const-string v2, "type"

    .line 506
    .line 507
    const-string v3, "getType"

    .line 508
    .line 509
    invoke-static {v0, v3, v1, v2}, Llb/i;->B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-static {v1}, Llb/i;->z(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-eqz v1, :cond_23

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-lez v2, :cond_21

    .line 524
    .line 525
    const/4 v2, 0x1

    .line 526
    goto :goto_16

    .line 527
    :cond_21
    move v2, v8

    .line 528
    :goto_16
    if-eqz v2, :cond_22

    .line 529
    .line 530
    goto :goto_17

    .line 531
    :cond_22
    move-object/from16 v1, v16

    .line 532
    .line 533
    :goto_17
    if-eqz v1, :cond_23

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    :goto_18
    move/from16 v24, v1

    .line 540
    .line 541
    goto :goto_19

    .line 542
    :cond_23
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-static/range {v30 .. v30}, Ll8/d;->f(Ljava/lang/String;)I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    goto :goto_18

    .line 552
    :goto_19
    if-gtz v24, :cond_24

    .line 553
    .line 554
    return-object v16

    .line 555
    :cond_24
    const-string v1, "field_imgPath"

    .line 556
    .line 557
    const-string v2, "imgPath"

    .line 558
    .line 559
    const-string v3, "getImgPath"

    .line 560
    .line 561
    invoke-static {v0, v3, v1, v2}, Llb/i;->B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    instance-of v2, v1, Ljava/lang/String;

    .line 566
    .line 567
    if-eqz v2, :cond_25

    .line 568
    .line 569
    check-cast v1, Ljava/lang/String;

    .line 570
    .line 571
    goto :goto_1a

    .line 572
    :cond_25
    move-object/from16 v1, v16

    .line 573
    .line 574
    :goto_1a
    if-eqz v1, :cond_26

    .line 575
    .line 576
    move-object/from16 v31, v1

    .line 577
    .line 578
    goto :goto_1b

    .line 579
    :cond_26
    move-object/from16 v31, v18

    .line 580
    .line 581
    :goto_1b
    const-string v1, "field_talker"

    .line 582
    .line 583
    const-string v2, "talker"

    .line 584
    .line 585
    const-string v3, "getTalker"

    .line 586
    .line 587
    invoke-static {v0, v3, v1, v2}, Llb/i;->B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    instance-of v2, v1, Ljava/lang/String;

    .line 592
    .line 593
    if-eqz v2, :cond_27

    .line 594
    .line 595
    check-cast v1, Ljava/lang/String;

    .line 596
    .line 597
    goto :goto_1c

    .line 598
    :cond_27
    move-object/from16 v1, v16

    .line 599
    .line 600
    :goto_1c
    if-eqz v1, :cond_28

    .line 601
    .line 602
    move-object/from16 v29, v1

    .line 603
    .line 604
    goto :goto_1d

    .line 605
    :cond_28
    move-object/from16 v29, p3

    .line 606
    .line 607
    :goto_1d
    const-string v1, "field_msgSource"

    .line 608
    .line 609
    const-string v2, "msgSource"

    .line 610
    .line 611
    const-string v3, "getMsgSource"

    .line 612
    .line 613
    invoke-static {v0, v3, v1, v2}, Llb/i;->B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    instance-of v2, v1, Ljava/lang/String;

    .line 618
    .line 619
    if-eqz v2, :cond_29

    .line 620
    .line 621
    move-object v3, v1

    .line 622
    check-cast v3, Ljava/lang/String;

    .line 623
    .line 624
    goto :goto_1e

    .line 625
    :cond_29
    move-object/from16 v3, v16

    .line 626
    .line 627
    :goto_1e
    if-eqz v3, :cond_2a

    .line 628
    .line 629
    move-object/from16 v35, v3

    .line 630
    .line 631
    goto :goto_1f

    .line 632
    :cond_2a
    move-object/from16 v35, v18

    .line 633
    .line 634
    :goto_1f
    const-string v1, "field_isSend"

    .line 635
    .line 636
    const-string v2, "isSend"

    .line 637
    .line 638
    const-string v3, "getIsSend"

    .line 639
    .line 640
    invoke-static {v0, v3, v1, v2}, Llb/i;->B(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-static {v0}, Llb/i;->z(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    if-eqz v0, :cond_2b

    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    move/from16 v26, v5

    .line 655
    .line 656
    goto :goto_20

    .line 657
    :cond_2b
    move/from16 v26, v8

    .line 658
    .line 659
    :goto_20
    new-instance v19, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 660
    .line 661
    const/16 v34, 0x0

    .line 662
    .line 663
    const-string v36, ""

    .line 664
    .line 665
    const-wide/16 v22, 0x0

    .line 666
    .line 667
    const/16 v25, 0x0

    .line 668
    .line 669
    const-wide/16 v27, 0x0

    .line 670
    .line 671
    const-string v32, ""

    .line 672
    .line 673
    const-string v33, ""

    .line 674
    .line 675
    move-wide/from16 v20, p1

    .line 676
    .line 677
    invoke-direct/range {v19 .. v36}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    return-object v19
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Llb/i;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method
