.class public final Lc0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public a:Lc0/c;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lc0/d;->a:Lc0/c;

    .line 2
    .line 3
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    sget-object p3, Lc0/f;->a:LH/a;

    .line 10
    .line 11
    iget-object p3, p3, LH/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p3, LA0/a;

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    iget p3, p3, LA0/a;->a:I

    .line 18
    .line 19
    packed-switch p3, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p1}, Lcom/lu/wxmask/MainHook;->a(Ljava/lang/reflect/Method;Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method
