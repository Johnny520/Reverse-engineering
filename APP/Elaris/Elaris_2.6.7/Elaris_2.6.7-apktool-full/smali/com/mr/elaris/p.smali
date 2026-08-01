.class public final Lcom/mr/elaris/p;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/ClassLoader;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/mr/elaris/p;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p6, p0, Lcom/mr/elaris/p;->b:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/mr/elaris/p;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/mr/elaris/p;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p4, p0, Lcom/mr/elaris/p;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/mr/elaris/p;->f:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-static {p3}, Lcom/mr/elaris/MessageRepeater;->i([Ljava/lang/Object;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    if-eqz p3, :cond_3

    .line 7
    .line 8
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-static {p3}, Lcom/mr/elaris/MessageRepeater;->p(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_3

    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mr/elaris/p;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-boolean v1, p0, Lcom/mr/elaris/p;->b:Z

    .line 31
    .line 32
    invoke-static {v0, p3, v1}, Lcom/mr/elaris/MessageRepeater;->m(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    iget-object v1, p0, Lcom/mr/elaris/p;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/mr/elaris/p;->e:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/mr/elaris/p;->c:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    iget-object p0, p0, Lcom/mr/elaris/p;->d:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    :try_start_1
    invoke-static {v3, p0, v2, v1, p3}, Lcom/mr/elaris/MessageRepeater;->B(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_2
    invoke-static {v3, p0, v2, v1, p3}, Lcom/mr/elaris/MessageRepeater;->A(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_3
    :goto_1
    const-string p0, "getMsgs callback empty"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-nez p2, :cond_4

    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_2
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->d(Ljava/lang/Class;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    return-object p0

    .line 72
    :goto_3
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->E(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance p3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v0, "getMsgs callback "

    .line 79
    .line 80
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ": "

    .line 95
    .line 96
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_4
    if-nez p2, :cond_5

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_5
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->d(Ljava/lang/Class;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
