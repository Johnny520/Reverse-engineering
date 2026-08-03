.class public final Lc0/i;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/k;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lc0/k;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lc0/i;->b:I

    iput-object p1, p0, Lc0/i;->c:Lc0/k;

    iput-object p2, p0, Lc0/i;->d:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lde/robv/android/xposed/b;)V
    .locals 11

    iget-object v0, p0, Lc0/i;->d:Ljava/lang/String;

    iget-object v1, p0, Lc0/i;->c:Lc0/k;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "SnsInfo"

    const/4 v5, 0x0

    const-string v6, "args"

    iget v7, p0, Lc0/i;->b:I

    packed-switch v7, :pswitch_data_0

    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v7

    iget-boolean v7, v7, Lc0/q;->f:Z

    if-nez v7, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_15

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    goto/16 :goto_a

    :cond_1
    sget-object v8, Lc0/l;->a:LW0/g;

    invoke-static {v7, v4, v3}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_a

    :cond_2
    iget-object v4, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v4, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Landroid/content/ContentValues;

    if-eqz v6, :cond_3

    check-cast v4, Landroid/content/ContentValues;

    goto :goto_0

    :cond_3
    move-object v4, v2

    :goto_0
    if-nez v4, :cond_4

    goto/16 :goto_a

    :cond_4
    const-string v6, "sourceType"

    invoke-virtual {v4, v6}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_15

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v7, :cond_15

    const/4 v7, 0x2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    goto :goto_1

    :cond_5
    move-object p1, v2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "(\u5df2\u5220\u9664)"

    const-string v6, "[\u5df2\u5220\u9664]"

    const-string v7, "ContentDesc"

    const-string v8, "content"

    invoke-virtual {v4, v8}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, [B

    if-eqz v10, :cond_6

    check-cast v9, [B

    goto :goto_2

    :cond_6
    move-object v9, v2

    :goto_2
    if-nez v9, :cond_7

    goto/16 :goto_9

    :cond_7
    array-length v10, v9

    if-nez v10, :cond_8

    goto/16 :goto_9

    :cond_8
    if-nez p1, :cond_9

    goto/16 :goto_9

    :cond_9
    :try_start_0
    const-string v10, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    invoke-static {p1, v10}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v10

    invoke-static {p1}, Lc0/k;->b(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-nez p1, :cond_a

    goto/16 :goto_6

    :cond_a
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {p1, v10, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_b

    goto :goto_3

    :cond_b
    move-object v10, p1

    :goto_3
    invoke-static {v10, v7}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v9, p1, Ljava/lang/String;

    if-eqz v9, :cond_c

    check-cast p1, Ljava/lang/String;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_c
    move-object p1, v2

    :goto_4
    if-nez p1, :cond_d

    goto :goto_6

    :cond_d
    invoke-static {p1, v6, v5}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-nez v9, :cond_13

    invoke-static {p1, v1, v5}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-nez v9, :cond_13

    invoke-static {p1, v6, v5}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_5

    :cond_e
    invoke-static {p1, v1, v5}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-static {p1, v1}, LW0/j;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_f
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_5
    invoke-static {v10, p1, v7}, LU/S;->j0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lc0/k;->c(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-nez p1, :cond_10

    goto :goto_6

    :cond_10
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1, v10, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, [B

    if-eqz v1, :cond_11

    move-object v2, p1

    check-cast v2, [B

    :cond_11
    if-nez v2, :cond_12

    goto :goto_6

    :cond_12
    invoke-virtual {v4, v8, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string p1, "marked ContentDesc deleted prefix"

    invoke-static {p1}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_13
    :goto_6
    sget-object p1, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :goto_7
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_8
    invoke-static {p1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_14

    sget-object v1, Lc0/k;->a:Lc0/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ContentDesc mark skipped: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_14
    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "BLOCKED sns delete-update via "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_15
    :goto_a
    return-void

    :pswitch_0
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v7

    iget-boolean v7, v7, Lc0/q;->f:Z

    if-nez v7, :cond_16

    goto :goto_d

    :cond_16
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_17
    move-object v5, v2

    :goto_b
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_18
    sget-object v6, Lc0/l;->a:LW0/g;

    invoke-static {v5, v4, v3}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_19

    goto :goto_d

    :cond_19
    if-nez v2, :cond_1a

    const-string v2, ""

    :cond_1a
    sget-object v4, Lc0/l;->a:LW0/g;

    iget-object v4, v4, LW0/g;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_1b

    goto :goto_c

    :cond_1b
    const-string v4, "sourceType = sourceType & -3"

    invoke-static {v2, v4, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1c

    const-string v4, "sourceType=sourceType&-3"

    invoke-static {v2, v4, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1d

    :cond_1c
    :goto_c
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v2}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "BLOCKED sns clear-visible-bit execSQL via "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_1d
    :goto_d
    return-void

    :pswitch_1
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v7

    iget-boolean v7, v7, Lc0/q;->f:Z

    if-nez v7, :cond_1e

    goto :goto_e

    :cond_1e
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_1f

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1f
    sget-object v6, Lc0/l;->a:LW0/g;

    invoke-static {v2, v4, v3}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_20

    goto :goto_e

    :cond_20
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "BLOCKED sns physical delete via "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/k;->k(Ljava/lang/String;)V

    :goto_e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
