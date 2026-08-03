.class public final Lc0/j;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/j;->b:I

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    sget-object p1, Lc0/G;->a:Lc0/G;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 3
    :pswitch_1
    sget-object p1, Lc0/w1;->a:Lc0/w1;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 5
    :pswitch_2
    sget-object p1, Lc0/k1;->a:Lc0/k1;

    .line 6
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 7
    :pswitch_3
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 9
    :pswitch_4
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    .line 10
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 11
    :pswitch_5
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    .line 12
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 13
    :pswitch_6
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    .line 14
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 15
    :pswitch_7
    sget-object p1, Lc0/n0;->a:Lc0/n0;

    .line 16
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 17
    :pswitch_8
    sget-object p1, Lc0/n0;->a:Lc0/n0;

    .line 18
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 19
    :pswitch_9
    sget-object p1, Lc0/a0;->a:Lc0/a0;

    .line 20
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 21
    :pswitch_a
    sget-object p1, Lc0/I;->a:Lc0/I;

    .line 22
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 23
    :pswitch_b
    sget-object p1, Lc0/I;->a:Lc0/I;

    .line 24
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 25
    :pswitch_c
    sget-object p1, Lc0/I;->a:Lc0/I;

    .line 26
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 27
    :pswitch_d
    sget-object p1, Lc0/G;->a:Lc0/G;

    .line 28
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 29
    :pswitch_e
    sget-object p1, Lc0/G;->a:Lc0/G;

    .line 30
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 31
    :pswitch_f
    sget-object p1, Lc0/G;->a:Lc0/G;

    .line 32
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/j;->b:I

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 19

    move-object/from16 v0, p1

    const-string v1, ""

    const-string v2, "field_content"

    const-string v3, "field_type"

    const-string v4, "args"

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object/from16 v9, p0

    iget v10, v9, Lc0/j;->b:I

    packed-switch v10, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v1

    iget-boolean v2, v1, Lc0/x1;->a:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lc0/w1;->a:Lc0/w1;

    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    iget v1, v1, Lc0/x1;->b:F

    invoke-static {v2, v0, v1}, Lc0/w1;->a(Lc0/w1;Ljava/lang/Object;F)V

    :goto_0
    return-void

    :pswitch_2
    sget-object v1, Lc0/q1;->a:Lc0/q1;

    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto/16 :goto_c

    :cond_1
    sget-object v1, Lc0/q1;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD0/e;

    sget-object v2, Lc0/q1;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP0/l;

    if-nez v1, :cond_2

    if-nez v2, :cond_2

    goto/16 :goto_c

    :cond_2
    if-eqz v1, :cond_3

    iget-object v1, v1, LD0/e;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v1, v8

    :goto_1
    const-string v3, "r"

    invoke-static {v0, v3}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "f150798r"

    if-nez v4, :cond_4

    invoke-static {v0, v5}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    const-string v4, "f150798R"

    invoke-static {v0, v4}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :cond_4
    const/16 v6, 0x10

    const-string v10, "f231704f"

    if-eqz v4, :cond_9

    invoke-static {v4, v10}, Lc0/q1;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-static {v11}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v12

    xor-int/2addr v12, v7

    if-eqz v12, :cond_5

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-gt v12, v6, :cond_5

    goto :goto_2

    :cond_5
    move-object v11, v8

    :goto_2
    if-eqz v11, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v11, "f"

    invoke-static {v4, v11}, Lc0/q1;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-static {v11}, Lc0/q1;->j(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_3

    :cond_7
    move-object v11, v8

    :goto_3
    if-eqz v11, :cond_8

    goto/16 :goto_6

    :cond_8
    invoke-static {v4}, Lc0/q1;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    const-string v4, "f206693n"

    invoke-static {v0, v4}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a

    const-string v4, "n"

    invoke-static {v0, v4}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :cond_a
    if-eqz v4, :cond_f

    const-string v11, "f66769b"

    invoke-static {v4, v11}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_b

    const-string v11, "b"

    invoke-static {v4, v11}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_b

    move-object v4, v8

    goto :goto_4

    :cond_b
    const-string v4, "f66756a"

    invoke-static {v11, v4}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c

    const-string v4, "a"

    invoke-static {v11, v4}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :cond_c
    :goto_4
    if-eqz v4, :cond_f

    invoke-static {v4, v10}, Lc0/q1;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_e

    invoke-static {v10}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v11

    xor-int/2addr v11, v7

    if-eqz v11, :cond_d

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-gt v11, v6, :cond_d

    move-object v11, v10

    goto :goto_5

    :cond_d
    move-object v11, v8

    :goto_5
    if-eqz v11, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v4}, Lc0/q1;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_f

    goto :goto_6

    :cond_f
    invoke-static {v0}, Lc0/q1;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_10

    goto :goto_6

    :cond_10
    move-object v11, v8

    :goto_6
    if-eqz v11, :cond_12

    invoke-static {v11}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_7

    :cond_11
    new-instance v4, Lc0/n1;

    invoke-static {v11}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Lc0/n1;-><init>(Ljava/lang/String;)V

    goto :goto_8

    :cond_12
    :goto_7
    sget-object v4, Lc0/o1;->a:Lc0/o1;

    :goto_8
    :try_start_0
    invoke-static {v0, v3}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_13

    invoke-static {v0, v5}, Lc0/q1;->m(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_13
    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_14
    move-object v0, v8

    goto :goto_a

    :goto_9
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_a
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_15

    goto :goto_b

    :cond_15
    move-object v8, v0

    :goto_b
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "cgi cb sender="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " name="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " result="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " resp="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V

    instance-of v0, v4, Lc0/n1;

    if-eqz v0, :cond_16

    if-eqz v1, :cond_16

    sget-object v3, Lc0/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v5, v4

    check-cast v5, Lc0/n1;

    iget-object v5, v5, Lc0/n1;->a:Ljava/lang/String;

    invoke-virtual {v3, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lc0/q1;->q()V

    :cond_16
    if-eqz v2, :cond_17

    :try_start_1
    invoke-interface {v2, v4}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_c

    :cond_17
    if-eqz v0, :cond_18

    if-eqz v1, :cond_18

    sget-object v0, Lc0/q1;->g:Landroid/os/Handler;

    new-instance v2, Lc0/l1;

    invoke-direct {v2, v1, v4, v7}, Lc0/l1;-><init>(Ljava/lang/String;Lc0/p1;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_18
    :goto_c
    return-void

    :pswitch_3
    sget-object v1, Lc0/k1;->g:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    goto :goto_d

    :cond_19
    move-object v1, v8

    :goto_d
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    if-ne v1, v0, :cond_1a

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lc0/k1;->g:Ljava/lang/ref/WeakReference;

    :cond_1a
    return-void

    :pswitch_4
    iget-object v10, v0, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    instance-of v11, v10, Ljava/lang/Number;

    if-eqz v11, :cond_1b

    check-cast v10, Ljava/lang/Number;

    goto :goto_e

    :cond_1b
    move-object v10, v8

    :goto_e
    if-eqz v10, :cond_1c

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    cmp-long v5, v10, v5

    if-gtz v5, :cond_1c

    goto/16 :goto_1d

    :cond_1c
    iget-object v5, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v5

    const/4 v10, 0x0

    move v11, v10

    :goto_f
    if-ge v11, v6, :cond_1e

    aget-object v12, v5, v11

    instance-of v13, v12, Ljava/lang/String;

    if-eqz v13, :cond_1d

    goto :goto_10

    :cond_1d
    add-int/2addr v11, v7

    goto :goto_f

    :cond_1e
    move-object v12, v8

    :goto_10
    instance-of v5, v12, Ljava/lang/String;

    if-eqz v5, :cond_1f

    check-cast v12, Ljava/lang/String;

    goto :goto_11

    :cond_1f
    move-object v12, v8

    :goto_11
    if-nez v12, :cond_20

    goto/16 :goto_1d

    :cond_20
    const-string v5, "message"

    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    goto/16 :goto_1d

    :cond_21
    iget-object v0, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v0, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v0

    move v5, v10

    :goto_12
    if-ge v5, v4, :cond_23

    aget-object v6, v0, v5

    instance-of v11, v6, Landroid/content/ContentValues;

    if-eqz v11, :cond_22

    goto :goto_13

    :cond_22
    add-int/2addr v5, v7

    goto :goto_12

    :cond_23
    move-object v6, v8

    :goto_13
    instance-of v0, v6, Landroid/content/ContentValues;

    if-eqz v0, :cond_24

    check-cast v6, Landroid/content/ContentValues;

    goto :goto_14

    :cond_24
    move-object v6, v8

    :goto_14
    if-nez v6, :cond_25

    goto/16 :goto_1d

    :cond_25
    sget-object v0, Lc0/I0;->a:Lc0/I0;

    :try_start_2
    invoke-static {}, Lc0/F0;->a()Lc0/J0;

    move-result-object v0

    iget-boolean v4, v0, Lc0/J0;->a:Z

    if-eqz v4, :cond_31

    iget-boolean v0, v0, Lc0/J0;->b:Z

    if-nez v0, :cond_26

    goto/16 :goto_1d

    :cond_26
    const-string v0, "isSend"

    invoke-virtual {v6, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_27

    :goto_15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_16

    :catchall_2
    move-exception v0

    goto/16 :goto_1b

    :cond_27
    const-string v0, "field_isSend"

    invoke-virtual {v6, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_28

    goto :goto_15

    :cond_28
    move v0, v10

    :goto_16
    if-eq v0, v7, :cond_29

    goto/16 :goto_1d

    :cond_29
    const-string v0, "type"

    invoke-virtual {v6, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2a

    :goto_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_18

    :cond_2a
    invoke-virtual {v6, v3}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_31

    goto :goto_17

    :goto_18
    const-string v3, "content"

    invoke-virtual {v6, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2c

    invoke-virtual {v6, v2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2b

    goto :goto_19

    :cond_2b
    move-object v1, v2

    goto :goto_19

    :cond_2c
    move-object v1, v3

    :goto_19
    sget-object v2, Lc0/I0;->e:Lc0/r1;

    invoke-static {v6, v0, v1}, Lc0/I0;->h(Landroid/content/ContentValues;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc0/r1;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2d

    goto :goto_1d

    :cond_2d
    sget-object v2, Lc0/I0;->g:Landroid/content/Context;

    if-eqz v2, :cond_2e

    const-string v3, "abc_input_stats"

    invoke-virtual {v2, v3, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    :cond_2e
    if-nez v8, :cond_2f

    goto :goto_1d

    :cond_2f
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v2}, Lc0/I0;->g(Landroid/content/SharedPreferences;Ljava/lang/String;)Lc0/K0;

    move-result-object v2

    invoke-static {v2, v0, v1}, LU/S;->b(Lc0/K0;ILjava/lang/String;)Lc0/K0;

    move-result-object v0

    invoke-static {v8, v0}, Lc0/I0;->i(Landroid/content/SharedPreferences;Lc0/K0;)V

    sget-object v0, Lc0/I0;->h:Landroid/view/View;

    if-nez v0, :cond_30

    goto :goto_1a

    :cond_30
    new-instance v1, LD/u;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, LD/u;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_1a
    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1c

    :goto_1b
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1c
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    :cond_31
    :goto_1d
    return-void

    :pswitch_5
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v1, Lc0/q0;->c:Z

    if-nez v1, :cond_32

    goto :goto_1e

    :cond_32
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0}, Lc0/q0;->c(Ljava/lang/Object;)V

    :goto_1e
    return-void

    :pswitch_6
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v1, Lc0/q0;->c:Z

    if-nez v1, :cond_33

    goto :goto_1f

    :cond_33
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0}, Lc0/q0;->c(Ljava/lang/Object;)V

    :goto_1f
    return-void

    :pswitch_7
    sget-object v1, Lc0/n0;->a:Lc0/n0;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v2

    if-nez v2, :cond_34

    goto :goto_20

    :cond_34
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/Menu;

    if-eqz v2, :cond_35

    move-object v8, v0

    check-cast v8, Landroid/view/Menu;

    :cond_35
    if-nez v8, :cond_36

    goto :goto_20

    :cond_36
    invoke-static {v1, v8}, Lc0/n0;->b(Lc0/n0;Landroid/view/Menu;)V

    :goto_20
    return-void

    :pswitch_8
    sget-object v1, Lc0/a0;->a:Lc0/a0;

    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    sput-object v0, Lc0/a0;->B:Ljava/lang/Object;

    return-void

    :pswitch_9
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    sput-object v0, Lc0/a0;->A:Ljava/lang/Object;

    return-void

    :pswitch_a
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_37

    move-object v8, v0

    check-cast v8, Landroid/view/ViewGroup;

    :cond_37
    if-nez v8, :cond_38

    goto :goto_22

    :cond_38
    sget-object v0, Lc0/I;->a:Lc0/I;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_21
    if-eqz v0, :cond_3a

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-static {v8}, Lc0/I;->a(Landroid/view/ViewGroup;)V

    goto :goto_22

    :cond_39
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_21

    :cond_3a
    :goto_22
    return-void

    :pswitch_b
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3b

    move-object v8, v0

    check-cast v8, Landroid/view/ViewGroup;

    :cond_3b
    if-nez v8, :cond_3c

    goto :goto_23

    :cond_3c
    invoke-static {v8}, Lc0/I;->a(Landroid/view/ViewGroup;)V

    :goto_23
    return-void

    :pswitch_c
    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3d

    move-object v8, v0

    check-cast v8, Landroid/view/ViewGroup;

    :cond_3d
    if-nez v8, :cond_3e

    goto :goto_24

    :cond_3e
    invoke-static {v8}, Lc0/I;->a(Landroid/view/ViewGroup;)V

    :goto_24
    return-void

    :pswitch_d
    invoke-static {}, Lc0/y;->b()Z

    return-void

    :pswitch_e
    invoke-static {}, Lc0/y;->b()Z

    return-void

    :pswitch_f
    invoke-static {}, Lc0/y;->b()Z

    move-result v1

    if-nez v1, :cond_3f

    goto/16 :goto_2a

    :cond_3f
    sget-object v1, Lc0/G;->a:Lc0/G;

    iget-object v5, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const-string v0, "thisObject"

    invoke-static {v5, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_3
    const-string v0, "mViewPager"

    invoke-static {v5, v0}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_40

    check-cast v0, Landroid/view/ViewGroup;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_26

    :catchall_3
    move-exception v0

    goto :goto_25

    :cond_40
    move-object v0, v8

    goto :goto_26

    :goto_25
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_26
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_41

    move-object v0, v8

    :cond_41
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    :try_start_4
    const-string v0, "mTabsAdapter"

    invoke-static {v5, v0}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_27

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_27
    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_42

    move-object v6, v8

    goto :goto_28

    :cond_42
    move-object v6, v0

    :goto_28
    if-eqz v1, :cond_48

    if-nez v6, :cond_43

    goto :goto_29

    :cond_43
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_44

    move-object v8, v0

    check-cast v8, Landroid/view/ViewGroup;

    :cond_44
    move-object v3, v8

    if-nez v3, :cond_45

    const-string v0, "skip: no parent"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    goto :goto_2a

    :cond_45
    sget-object v0, Lc0/G;->c:Ld0/s;

    if-eqz v0, :cond_47

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_47

    sput-object v6, Lc0/G;->d:Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lc0/G;->h(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-nez v1, :cond_46

    sget-object v1, Lc0/G;->e:Ljava/lang/reflect/Method;

    :cond_46
    sput-object v1, Lc0/G;->e:Ljava/lang/reflect/Method;

    invoke-static {v3}, Lc0/G;->j(Landroid/view/ViewGroup;)V

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const-string v0, "already attached, re-hide native"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    goto :goto_2a

    :cond_47
    new-instance v0, Lc0/B;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Lc0/B;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2a

    :cond_48
    :goto_29
    const-string v0, "skip: pager/adapter missing"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :goto_2a
    return-void

    :pswitch_10
    iget-object v7, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, LE0/j;->m0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_49

    goto/16 :goto_37

    :cond_49
    sget-object v7, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v0, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    sput-object v0, Lc0/n;->j:Ljava/lang/Object;

    sget-object v0, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v4, v3}, Lc0/n;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/Number;

    if-eqz v3, :cond_4a

    check-cast v0, Ljava/lang/Number;

    goto :goto_2b

    :cond_4a
    move-object v0, v8

    :goto_2b
    if-eqz v0, :cond_4b

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2c

    :cond_4b
    move-object v0, v8

    :goto_2c
    if-eqz v0, :cond_57

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static {v4, v2}, Lc0/n;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_4c

    check-cast v0, Ljava/lang/String;

    goto :goto_2d

    :cond_4c
    move-object v0, v8

    :goto_2d
    if-nez v0, :cond_4d

    move-object v12, v1

    goto :goto_2e

    :cond_4d
    move-object v12, v0

    :goto_2e
    const-string v0, "field_talker"

    invoke-static {v4, v0}, Lc0/n;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4e

    check-cast v0, Ljava/lang/String;

    goto :goto_2f

    :cond_4e
    move-object v0, v8

    :goto_2f
    const-string v1, "field_msgSvrId"

    invoke-static {v4, v1}, Lc0/n;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_4f

    :goto_30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_31

    :cond_4f
    const-string v1, "field_newMsgId"

    invoke-static {v4, v1}, Lc0/n;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_50

    goto :goto_30

    :cond_50
    move-wide v1, v5

    :goto_31
    invoke-static {v12}, Lc0/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_52

    if-eqz v0, :cond_51

    invoke-static {v0}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_51

    invoke-static {v0}, Lc0/o;->g(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_51

    move-object/from16 v16, v0

    goto :goto_32

    :cond_51
    move-object/from16 v16, v8

    goto :goto_32

    :cond_52
    move-object/from16 v16, v3

    :goto_32
    new-instance v3, Lc0/e1;

    const-string v7, "field_createTime"

    invoke-static {v4, v7}, Lc0/n;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_53

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    move-wide v14, v7

    goto :goto_33

    :cond_53
    move-wide v14, v5

    :goto_33
    move-object v10, v3

    move-object v13, v0

    move-wide/from16 v17, v1

    invoke-direct/range {v10 .. v18}, Lc0/e1;-><init>(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V

    const-string v7, "field_msgId"

    invoke-static {v4, v7}, Lc0/n;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_54

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_34

    :cond_54
    move-wide v7, v5

    :goto_34
    move-object v13, v3

    move-wide v14, v7

    move-wide/from16 v16, v1

    move-object/from16 v18, v0

    invoke-static/range {v13 .. v18}, Lc0/n;->m(Lc0/e1;JJLjava/lang/String;)V

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, LE0/j;->l0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_55
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_56

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    cmp-long v3, v7, v5

    if-lez v3, :cond_55

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_35

    :cond_56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_57

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lc0/n;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_36

    :cond_57
    :goto_37
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 22

    move-object/from16 v1, p1

    const/4 v0, 0x4

    const/16 v2, 0x8

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p0

    iget v9, v8, Lc0/j;->b:I

    sparse-switch v9, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v2, v0, Lc0/x1;->a:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    iget v0, v0, Lc0/x1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v1, v5

    sget-object v1, Lc0/w1;->a:Lc0/w1;

    const-string v2, "drawable.<init>"

    invoke-static {v1, v2, v0}, Lc0/w1;->b(Lc0/w1;Ljava/lang/String;F)V

    :goto_0
    return-void

    :sswitch_1
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v2, v0, Lc0/x1;->a:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v5, "args"

    invoke-static {v2, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_2

    move-object v6, v2

    check-cast v6, Landroid/graphics/Bitmap;

    :cond_2
    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    array-length v2, v2

    if-ge v2, v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v4, v2, v4

    if-gtz v4, :cond_5

    goto :goto_1

    :cond_5
    iget-object v1, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    iget v0, v0, Lc0/x1;->b:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v1, v3

    :cond_6
    :goto_1
    return-void

    :sswitch_2
    sget-object v0, Lc0/q0;->i:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_9

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    :cond_9
    if-nez v6, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {v6}, Lc0/q0;->a(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_2

    :cond_b
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v7

    :goto_2
    return-void

    :sswitch_3
    sget-object v0, Lc0/q0;->i:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_4

    :cond_c
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_d

    goto :goto_4

    :cond_d
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v3, v0, Landroid/view/View;

    if-eqz v3, :cond_e

    check-cast v0, Landroid/view/View;

    goto :goto_3

    :cond_e
    move-object v0, v6

    :goto_3
    if-nez v0, :cond_f

    goto :goto_4

    :cond_f
    invoke-static {v0}, Lc0/q0;->a(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_4

    :cond_10
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v0, v0, v7

    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_11

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    :cond_11
    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v2, :cond_12

    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v7

    :cond_12
    :goto_4
    return-void

    :sswitch_4
    sget-object v2, Lc0/n0;->a:Lc0/n0;

    iget-object v1, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    if-nez v1, :cond_13

    goto/16 :goto_6

    :cond_13
    sget-boolean v2, Lc0/n0;->m:Z

    if-eqz v2, :cond_14

    goto/16 :goto_6

    :cond_14
    sget-object v2, Lc0/n0;->l:Ljava/util/Set;

    const-string v6, "dbIdentitySeen"

    invoke-static {v2, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v2

    :try_start_0
    sget-boolean v6, Lc0/n0;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_15

    monitor-exit v2

    goto/16 :goto_6

    :cond_15
    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_16

    monitor-exit v2

    goto/16 :goto_6

    :cond_16
    :try_start_2
    sget-object v6, Lc0/n0;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_17

    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_17

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_17
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_18

    sget-object v0, Lc0/n0;->l:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    goto :goto_6

    :cond_19
    :goto_5
    :try_start_3
    sget-object v6, Lc0/n0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    new-instance v9, Lc0/A;

    const/4 v10, 0x7

    invoke-direct {v9, v10}, Lc0/A;-><init>(I)V

    new-instance v10, Lc0/O;

    invoke-direct {v10, v9, v4}, Lc0/O;-><init>(LP0/l;I)V

    invoke-virtual {v6, v7, v10}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v4, :cond_1a

    monitor-exit v2

    goto :goto_6

    :cond_1a
    :try_start_4
    sget-object v4, Lc0/n0;->l:Ljava/util/Set;

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v4, Lc0/n0;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v6

    if-lt v6, v0, :cond_1b

    sput-boolean v5, Lc0/n0;->m:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v2

    goto :goto_6

    :cond_1b
    monitor-exit v2

    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v2

    if-lt v2, v0, :cond_1c

    sput-boolean v5, Lc0/n0;->m:Z

    :cond_1c
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-gt v0, v3, :cond_1d

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remember db="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " total="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_1d
    :goto_6
    return-void

    :goto_7
    monitor-exit v2

    throw v0

    :sswitch_5
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v0

    iget-boolean v0, v0, Lc0/q;->h:Z

    if-nez v0, :cond_1e

    goto/16 :goto_e

    :cond_1e
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1f

    check-cast v0, Landroid/view/View;

    goto :goto_8

    :cond_1f
    move-object v0, v6

    :goto_8
    if-nez v0, :cond_20

    goto/16 :goto_e

    :cond_20
    const v2, 0x7f090012

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_21

    check-cast v2, Ljava/lang/Integer;

    goto :goto_9

    :cond_21
    move-object v2, v6

    :goto_9
    if-eqz v2, :cond_29

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v3, 0x7f090015

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_22

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_a

    :cond_22
    move-object v3, v6

    :goto_a
    if-eqz v3, :cond_23

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_b

    :cond_23
    const-string v3, ""

    invoke-static {v3, v2}, Lc0/K;->a(Ljava/lang/String;I)Z

    move-result v2

    :goto_b
    sget-object v3, Lc0/K;->a:LW0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "MMNeat7extView"

    invoke-static {v3, v4, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_24

    if-eqz v2, :cond_24

    goto :goto_c

    :cond_24
    move v5, v7

    :goto_c
    const v2, 0x7f090014

    if-nez v5, :cond_25

    invoke-virtual {v0, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_e

    :cond_25
    const v3, 0x7f090010

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_26

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_d

    :cond_26
    move-object v3, v6

    :goto_d
    if-eqz v3, :cond_29

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    sget-object v4, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v4, Lc0/a0;->E:Ljava/lang/String;

    invoke-static {v4, v3}, Lc0/U;->g(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v9, "args"

    invoke-static {v5, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v5}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v9, v5, Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_27

    move-object v6, v5

    check-cast v6, Landroid/graphics/drawable/Drawable;

    :cond_27
    if-eqz v6, :cond_28

    const v5, 0x7f090013

    invoke-virtual {v0, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "getContext(...)"

    invoke-static {v5, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/a0;->E:Ljava/lang/String;

    invoke-static {v5, v6, v3}, Lc0/U;->e(Landroid/content/Context;Ljava/lang/String;Z)Lc0/Q;

    move-result-object v3

    if-eqz v3, :cond_29

    iget-object v1, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    iget-object v3, v3, Lc0/Q;->a:Landroid/graphics/drawable/Drawable;

    aput-object v3, v1, v7

    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_29
    :goto_e
    return-void

    :sswitch_6
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-eqz v0, :cond_2e

    sget-boolean v0, Lc0/G;->j:Z

    if-eqz v0, :cond_2a

    goto :goto_10

    :cond_2a
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_2b

    check-cast v0, Landroid/view/View;

    goto :goto_f

    :cond_2b
    move-object v0, v6

    :goto_f
    if-nez v0, :cond_2c

    goto :goto_10

    :cond_2c
    invoke-static {v0}, Lc0/G;->a(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto :goto_10

    :cond_2d
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v1, v0, v7

    if-eqz v1, :cond_2e

    aput-object v6, v0, v7

    :cond_2e
    :goto_10
    return-void

    :sswitch_7
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-eqz v0, :cond_33

    sget-boolean v0, Lc0/G;->j:Z

    if-eqz v0, :cond_2f

    goto :goto_11

    :cond_2f
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_30

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    :cond_30
    if-nez v6, :cond_31

    goto :goto_11

    :cond_31
    invoke-static {v6}, Lc0/G;->a(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_32

    goto :goto_11

    :cond_32
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v7

    :cond_33
    :goto_11
    return-void

    :sswitch_8
    iget-object v3, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_34

    check-cast v3, Landroid/view/View;

    goto :goto_12

    :cond_34
    move-object v3, v6

    :goto_12
    if-nez v3, :cond_35

    goto :goto_13

    :cond_35
    invoke-static {}, Lc0/y;->b()Z

    move-result v4

    if-eqz v4, :cond_39

    sget-boolean v4, Lc0/G;->j:Z

    if-eqz v4, :cond_36

    goto :goto_13

    :cond_36
    invoke-static {v3}, Lc0/G;->a(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_37

    goto :goto_13

    :cond_37
    iget-object v3, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v3, v3, v7

    instance-of v4, v3, Ljava/lang/Number;

    if-eqz v4, :cond_38

    move-object v6, v3

    check-cast v6, Ljava/lang/Number;

    :cond_38
    if-eqz v6, :cond_39

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eq v3, v2, :cond_39

    if-eq v3, v0, :cond_39

    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v7

    :cond_39
    :goto_13
    return-void

    :sswitch_9
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-eqz v0, :cond_48

    sget-boolean v0, Lc0/G;->p:Z

    if-eqz v0, :cond_3a

    goto/16 :goto_16

    :cond_3a
    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/widget/TextView;

    if-eqz v2, :cond_3b

    check-cast v0, Landroid/widget/TextView;

    goto :goto_14

    :cond_3b
    move-object v0, v6

    :goto_14
    if-nez v0, :cond_3c

    goto/16 :goto_16

    :cond_3c
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x1020014

    if-eq v2, v3, :cond_3d

    goto/16 :goto_16

    :cond_3d
    sget-object v2, Lc0/G;->a:Lc0/G;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lc0/G;->r(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3e

    goto :goto_16

    :cond_3e
    invoke-static {v0}, Lc0/G;->o(Landroid/widget/TextView;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto :goto_16

    :cond_3f
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_40

    goto :goto_16

    :cond_40
    instance-of v2, v0, Ljava/lang/CharSequence;

    if-eqz v2, :cond_41

    check-cast v0, Ljava/lang/CharSequence;

    goto :goto_15

    :cond_41
    move-object v0, v6

    :goto_15
    if-eqz v0, :cond_48

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_42

    goto :goto_16

    :cond_42
    invoke-static {v0}, Lc0/G;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_46

    invoke-static {}, Lc0/y;->c()Ljava/util/List;

    move-result-object v2

    sget v3, Lc0/G;->q:I

    invoke-static {v2, v3}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_44

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_43

    invoke-static {v0}, Lc0/G;->t(Ljava/lang/String;)LD0/e;

    move-result-object v3

    iget-object v3, v3, LD0/e;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lc0/G;->q(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_44

    :cond_43
    move-object v6, v2

    :cond_44
    if-nez v6, :cond_45

    goto :goto_16

    :cond_45
    move-object v2, v6

    :cond_46
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_47

    goto :goto_16

    :cond_47
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aput-object v2, v0, v7

    :cond_48
    :goto_16
    return-void

    :sswitch_a
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-eqz v0, :cond_4d

    sget-boolean v0, Lc0/G;->p:Z

    if-eqz v0, :cond_49

    goto :goto_17

    :cond_49
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_4a

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    :cond_4a
    if-nez v6, :cond_4b

    goto :goto_17

    :cond_4b
    invoke-static {v6}, Lc0/G;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4c

    goto :goto_17

    :cond_4c
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4d

    iget-object v1, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aput-object v0, v1, v7

    :cond_4d
    :goto_17
    return-void

    :sswitch_b
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_4e

    goto :goto_18

    :cond_4e
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v0, v0, v7

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_4f

    move-object v6, v0

    check-cast v6, Ljava/lang/Number;

    :cond_4f
    if-eqz v6, :cond_50

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_50

    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v7

    :cond_50
    :goto_18
    return-void

    :sswitch_c
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v0

    iget-boolean v2, v0, Lc0/q;->a:Z

    if-nez v2, :cond_51

    goto/16 :goto_22

    :cond_51
    iget-object v2, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v3, "args"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_52

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_19

    :cond_52
    move-object v2, v6

    :goto_19
    const-string v9, ""

    if-nez v2, :cond_53

    move-object v2, v9

    :cond_53
    iget-object v10, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v10, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v10}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Ljava/lang/Number;

    if-eqz v11, :cond_54

    check-cast v10, Ljava/lang/Number;

    goto :goto_1a

    :cond_54
    move-object v10, v6

    :goto_1a
    const-wide/16 v11, 0x0

    if-eqz v10, :cond_55

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v13

    goto :goto_1b

    :cond_55
    move-wide v13, v11

    :goto_1b
    iget-object v10, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v10, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v10}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_56

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1c

    :cond_56
    move-object v3, v6

    :goto_1c
    if-nez v3, :cond_57

    goto :goto_1d

    :cond_57
    move-object v9, v3

    :goto_1d
    invoke-static {v9}, Lc0/o;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_58

    new-array v4, v5, [J

    aput-wide v13, v4, v7

    invoke-static {v4}, Lc0/A1;->a([J)V

    sget-object v4, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MARKED self revoke source serverId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc0/n;->q(Ljava/lang/String;)V

    iget-boolean v4, v0, Lc0/q;->c:Z

    if-nez v4, :cond_58

    goto/16 :goto_22

    :cond_58
    iget-boolean v4, v0, Lc0/q;->b:Z

    if-eqz v4, :cond_62

    sget-object v5, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v5, "inserted source revoke notice serverId="

    cmp-long v7, v13, v11

    if-lez v7, :cond_62

    if-nez v4, :cond_59

    goto/16 :goto_21

    :cond_59
    sget-object v4, Lc0/n;->j:Ljava/lang/Object;

    if-nez v4, :cond_5a

    goto/16 :goto_21

    :cond_5a
    sget-object v7, Lc0/n;->i:Ljava/lang/reflect/Method;

    if-nez v7, :cond_5b

    goto/16 :goto_21

    :cond_5b
    sget-object v10, Lc0/n;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_5c

    goto/16 :goto_21

    :cond_5c
    invoke-static {v13, v14, v13, v14, v2}, Lc0/n;->n(JJLjava/lang/String;)Lc0/e1;

    move-result-object v15

    invoke-static {v9}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_5d

    const-string v9, "recalled a message"

    :cond_5d
    invoke-static {v9}, Lc0/o;->i(Ljava/lang/String;)Z

    move-result v11

    invoke-static {v11, v15, v2, v9}, Lc0/o;->o(ZLc0/e1;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lc0/b0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    new-instance v11, Lc0/u1;

    const/16 v12, 0x2710

    invoke-direct {v11, v13, v14, v12, v9}, Lc0/u1;-><init>(JILjava/lang/String;)V

    iget-boolean v9, v0, Lc0/q;->c:Z

    iget-object v0, v0, Lc0/q;->d:Ljava/lang/String;

    const/16 v19, 0x1

    move-object/from16 v21, v15

    move-object v15, v11

    move-object/from16 v16, v21

    move/from16 v17, v9

    move-object/from16 v18, v0

    invoke-static/range {v15 .. v20}, Lc0/o;->a(Lc0/u1;Lc0/e1;ZLjava/lang/String;ZLjava/lang/String;)LU/S;

    move-result-object v0

    sget-object v9, Lc0/s1;->z:Lc0/s1;

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5e

    goto/16 :goto_21

    :cond_5e
    instance-of v9, v0, Lc0/t1;

    if-eqz v9, :cond_61

    check-cast v0, Lc0/t1;

    iget-object v0, v0, Lc0/t1;->z:Ljava/lang/String;

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5f

    goto/16 :goto_21

    :cond_5f
    :try_start_5
    const-string v9, "field_type"

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11, v9}, Lc0/n;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "field_content"

    invoke-static {v10, v0, v9}, Lc0/n;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "field_createTime"

    move-object/from16 v11, v21

    if-eqz v11, :cond_60

    iget-wide v11, v11, Lc0/e1;->d:J

    goto :goto_1e

    :cond_60
    const-wide/16 v11, 0x0

    :goto_1e
    const-wide/16 v15, 0x1

    add-long/2addr v11, v15

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v10, v11, v9}, Lc0/n;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "x0"

    invoke-static {v10, v0, v9}, Lc0/n;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v10, v9, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1f

    :catchall_1
    :try_start_7
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v10, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1f
    const/16 v4, 0x30

    invoke-static {v0, v4}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " notice="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_20

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_20
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_62

    sget-object v4, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "source revoke notice failed serverId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    goto :goto_21

    :cond_61
    new-instance v0, LD0/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_62
    :goto_21
    invoke-virtual {v1, v6}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    sget-object v0, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BLOCKED source revoke serverId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " talker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " self="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    :goto_22
    return-void

    :sswitch_d
    sget-object v0, Lc0/b0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v0, v1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0}, Lc0/b0;->m(Ljava/lang/Object;)V

    return-void

    :sswitch_e
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v0

    iget-boolean v0, v0, Lc0/q;->f:Z

    if-nez v0, :cond_63

    goto/16 :goto_29

    :cond_63
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    move v3, v7

    :goto_23
    if-ge v3, v2, :cond_65

    aget-object v4, v0, v3

    instance-of v4, v4, Ljava/lang/String;

    if-eqz v4, :cond_64

    goto :goto_24

    :cond_64
    add-int/2addr v3, v5

    goto :goto_23

    :cond_65
    const/4 v3, -0x1

    :goto_24
    if-gez v3, :cond_66

    goto/16 :goto_29

    :cond_66
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v0, v0, v3

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_67

    check-cast v0, Ljava/lang/String;

    goto :goto_25

    :cond_67
    move-object v0, v6

    :goto_25
    if-nez v0, :cond_68

    goto/16 :goto_29

    :cond_68
    sget-object v2, Lc0/l;->a:LW0/g;

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_69

    goto :goto_28

    :cond_69
    const-string v2, "(sourceType & 2 != 0 )  AND"

    invoke-static {v0, v2, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const-string v9, ""

    if-eqz v4, :cond_6a

    invoke-static {v0, v2, v9, v7}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move v2, v5

    goto :goto_26

    :cond_6a
    move v2, v7

    :goto_26
    const-string v4, "(sourceType & 2 != 0)  AND"

    invoke-static {v0, v4, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_6b

    invoke-static {v0, v4, v9, v7}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move v2, v5

    :cond_6b
    const-string v4, "(sourceType & 2 != 0) AND"

    invoke-static {v0, v4, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_6c

    invoke-static {v0, v4, v9, v7}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move v2, v5

    :cond_6c
    const-string v4, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))"

    invoke-static {v0, v4, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_6d

    const-string v2, "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))"

    invoke-static {v0, v4, v2, v7}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move v2, v5

    :cond_6d
    const-string v4, "WHERE SnsInfo.userName="

    invoke-static {v0, v4, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_6e

    const-string v4, "(snsId >="

    invoke-static {v0, v4, v7}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_6e

    const-string v2, "(1=1 or snsId >="

    invoke-static {v0, v4, v2, v7}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_27

    :cond_6e
    move v5, v2

    :goto_27
    if-eqz v5, :cond_6f

    move-object v6, v0

    :cond_6f
    :goto_28
    if-nez v6, :cond_70

    goto :goto_29

    :cond_70
    iget-object v0, v1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aput-object v6, v0, v3

    :goto_29
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_e
        0x1 -> :sswitch_d
        0x3 -> :sswitch_c
        0x4 -> :sswitch_b
        0x6 -> :sswitch_a
        0x7 -> :sswitch_9
        0x8 -> :sswitch_8
        0x9 -> :sswitch_7
        0xa -> :sswitch_6
        0x11 -> :sswitch_5
        0x13 -> :sswitch_4
        0x15 -> :sswitch_3
        0x16 -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method
