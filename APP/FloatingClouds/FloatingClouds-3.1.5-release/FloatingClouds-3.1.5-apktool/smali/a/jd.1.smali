.class public final synthetic La/jd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/g3;


# direct methods
.method public synthetic constructor <init>(La/g3;I)V
    .locals 0

    iput p2, p0, La/jd;->a:I

    iput-object p1, p0, La/jd;->b:La/g3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, La/jd;->a:I

    check-cast p1, La/fd;

    packed-switch v0, :pswitch_data_0

    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object p1, p1, La/fd;->b:Ljava/lang/ClassLoader;

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, La/ld;->a:La/ld;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, La/ld;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "zn3.t0"

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "xm3.t0"

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-nez v0, :cond_2

    const-string v0, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"

    iget-object p1, p1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_2
    return-object v0

    :pswitch_1
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    return-object p1

    :pswitch_2
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-nez v0, :cond_3

    const-string v0, "zn3.o0"

    iget-object p1, p1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_3
    return-object v0

    :pswitch_3
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v2, "getDeclaredMethods(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "K"

    invoke-static {v5, v6}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getParameterTypes(...)"

    invoke-static {v5, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v5

    if-nez v5, :cond_4

    const-class v5, Ljava/util/List;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const-string v0, "dj4.m0"

    iget-object p1, p1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_2
    return-object v0

    :pswitch_4
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    return-object p1

    :pswitch_5
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    return-object p1

    :pswitch_6
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    return-object p1

    :pswitch_7
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-nez v0, :cond_6

    const-string v0, "com.tencent.mm.storage.g4"

    iget-object p1, p1, La/fd;->b:Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_6

    const-string v0, "d53.b"

    invoke-static {p1, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_6
    return-object v0

    :pswitch_8
    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/jd;->b:La/g3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v0

    sget-object v1, La/ld;->a:La/ld;

    iget-object v2, p1, La/fd;->b:Ljava/lang/ClassLoader;

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, La/ld;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_d

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/a5;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v3, "F004_contact_adapter_locator_anchor"

    if-eqz v0, :cond_8

    const-string v4, "rule_class_"

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_8
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_9

    invoke-static {v2, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_d

    :cond_9
    :try_start_0
    const-string v0, "com.tencent.mm.ui.contact.address.AddressLiveList"

    invoke-static {v2, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_a
    move-object v0, v1

    goto :goto_5

    :goto_4
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_5
    instance-of v4, v0, La/wd$a;

    if-eqz v4, :cond_b

    move-object v0, v1

    :cond_b
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_c

    const-string v0, "com.tencent.mm.ui.contact.address"

    :cond_c
    invoke-static {v0}, La/w1;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v2, v7}, La/ld;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_10

    const-string v4, "3.t0"

    invoke-static {v4}, La/w1;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v2, v7}, La/ld;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_10
    sget-object v4, La/ld;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v4

    if-eqz v4, :cond_11

    const/16 v4, 0x3f

    invoke-static {v5, v1, v1, v4}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "anchorPkg="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " candidates="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "F004Diag"

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    const-class v9, Ljava/lang/Object;

    :try_start_1
    invoke-static {v2, v8}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    :goto_8
    if-eqz v8, :cond_14

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_13

    move v8, v7

    goto :goto_9

    :cond_13
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v8

    goto :goto_8

    :catchall_1
    move-exception v8

    goto :goto_a

    :cond_14
    move v8, v6

    :goto_9
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    :goto_a
    invoke-static {v8}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v8

    :goto_b
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v10, v8, La/wd$a;

    if-eqz v10, :cond_15

    move-object v8, v9

    :cond_15
    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_12

    goto :goto_c

    :cond_16
    move-object v4, v1

    :goto_c
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_17

    invoke-static {v5}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    :cond_17
    if-eqz v4, :cond_18

    invoke-static {v2, v4}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    :cond_18
    if-eqz v1, :cond_19

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, La/a5;->h(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_d

    :cond_19
    sget-object v0, La/Cd;->a:La/Cd;

    new-instance v1, La/g3;

    const-string v2, "m3.t0"

    const/16 v3, 0x1c

    const-string v4, "F004_contact_adapter_locator"

    invoke-direct {v1, v4, v2, v6, v3}, La/g3;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    move-object v0, p1

    :goto_d
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
