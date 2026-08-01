.class public final Lo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo/a;->a:I

    iput-object p1, p0, Lo/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lo/a;->a:I

    iput-object p1, p0, Lo/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lo/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv/e;

    .line 9
    .line 10
    iget-object v1, p0, Lo/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lv/e;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lo/a;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LC/j;

    .line 19
    .line 20
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Li/W;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lo/a;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/graphics/Typeface;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Li/W;->b(Landroid/graphics/Typeface;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_1
    :try_start_0
    sget-object v0, Lo/c;->d:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    iget-object v1, p0, Lo/a;->b:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v2, p0, Lo/a;->c:Ljava/lang/Object;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    :try_start_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    const-string v4, "AppCompat recreation"

    .line 45
    .line 46
    filled-new-array {v1, v3, v4}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    sget-object v0, Lo/c;->e:Ljava/lang/reflect/Method;

    .line 59
    .line 60
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_0
    const-string v1, "ActivityRecreator"

    .line 71
    .line 72
    const-string v2, "Exception while invoking performStopActivity"

    .line 73
    .line 74
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-class v2, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    if-ne v1, v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "Unable to stop"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    throw v0

    .line 106
    :cond_3
    :goto_2
    return-void

    .line 107
    :pswitch_2
    iget-object v0, p0, Lo/a;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Landroid/app/Application;

    .line 110
    .line 111
    iget-object v1, p0, Lo/a;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lo/b;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_3
    iget-object v0, p0, Lo/a;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lo/b;

    .line 122
    .line 123
    iget-object v1, p0, Lo/a;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v1, v0, Lo/b;->a:Ljava/lang/Object;

    .line 126
    .line 127
    return-void

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
