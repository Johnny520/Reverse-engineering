.class public final synthetic Lc0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc0/b;->a:I

    iput-object p1, p0, Lc0/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc0/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc0/b;->a:I

    sget-object v0, Lc0/g;->a:Lc0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc0/b;->b:Ljava/lang/Object;

    iput-object p1, p0, Lc0/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, LD0/l;->a:LD0/l;

    iget-object v1, p0, Lc0/b;->c:Ljava/lang/Object;

    const/4 v2, 0x1

    iget-object v3, p0, Lc0/b;->b:Ljava/lang/Object;

    const/4 v4, 0x0

    iget v5, p0, Lc0/b;->a:I

    packed-switch v5, :pswitch_data_0

    check-cast p1, Lc0/p1;

    check-cast v3, Ljava/lang/String;

    const-string v5, "$sender"

    invoke-static {v3, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "result"

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, p1, Lc0/n1;

    sget-object v6, Lc0/q1;->a:Lc0/q1;

    if-eqz v5, :cond_6

    sget-object v5, Lc0/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v6, p1

    check-cast v6, Lc0/n1;

    iget-object v6, v6, Lc0/n1;->a:Ljava/lang/String;

    invoke-virtual {v5, v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lc0/q1;->q()V

    invoke-static {v6}, Lc0/q1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_0

    const-string v2, ""

    goto :goto_2

    :cond_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    move v9, v4

    :goto_0
    if-ge v9, v8, :cond_2

    invoke-virtual {v5, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x2a

    if-eq v10, v11, :cond_1

    const v11, 0xff0a

    if-eq v10, v11, :cond_1

    const/16 v11, 0x78

    if-eq v10, v11, :cond_1

    const/16 v11, 0x58

    if-eq v10, v11, :cond_1

    const/16 v11, 0x3f

    if-eq v10, v11, :cond_1

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_1
    add-int/2addr v9, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v7, "toString(...)"

    invoke-static {v2, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v2}, LW0/j;->L0(Ljava/lang/CharSequence;)I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    :goto_1
    move-object v2, v5

    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "got "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " => "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " tail="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/q1;->s(Ljava/lang/String;)V

    check-cast v1, LP0/l;

    if-eqz v1, :cond_4

    invoke-interface {v1, v6}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object v1, Lc0/q1;->g:Landroid/os/Handler;

    new-instance v2, Lc0/l1;

    invoke-direct {v2, v3, p1, v4}, Lc0/l1;-><init>(Ljava/lang/String;Lc0/p1;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Char sequence is empty."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    sget-object v1, Lc0/o1;->a:Lc0/o1;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string p1, "no real name "

    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/q1;->s(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    instance-of v1, p1, Lc0/m1;

    if-eqz v1, :cond_8

    sget-object v1, Lc0/q1;->i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    check-cast p1, Lc0/m1;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fetch fail "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lc0/m1;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/q1;->s(Ljava/lang/String;)V

    :goto_3
    return-object v0

    :cond_8
    new-instance p1, LD0/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v5, "$done"

    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v3, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$activity"

    check-cast v1, Landroid/app/Activity;

    invoke-static {v1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    sget-object v2, Lc0/q1;->g:Landroid/os/Handler;

    new-instance v3, LS/h;

    const/4 v4, 0x2

    invoke-direct {v3, v1, p1, v4}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_4
    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    const-string v0, "$this_runCatching"

    check-cast v3, Lc0/g;

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/ClassLoader;

    const-string v0, "$classLoader"

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-eq v0, v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v4

    const-class v3, [B

    invoke-static {v0, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v0, Lc0/f;

    invoke-direct {v0, v1, v4}, Lc0/f;-><init>(Ljava/lang/ClassLoader;I)V

    invoke-static {p1, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v1, p1, LD0/f;

    if-eqz v1, :cond_c

    move-object p1, v0

    :cond_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
