.class public final synthetic Lc0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Lc0/j0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lc0/j0;Ljava/lang/String;Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/f0;->a:Landroid/widget/EditText;

    iput-object p2, p0, Lc0/f0;->b:Lc0/j0;

    iput-object p3, p0, Lc0/f0;->c:Ljava/lang/String;

    iput-object p4, p0, Lc0/f0;->d:Landroid/widget/TextView;

    iput-object p5, p0, Lc0/f0;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 19

    move-object/from16 v1, p0

    iget-object v0, v1, Lc0/f0;->a:Landroid/widget/EditText;

    const-string v2, "$input"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lc0/f0;->b:Lc0/j0;

    const-string v3, "$ref"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v1, Lc0/f0;->c:Ljava/lang/String;

    const-string v3, "$originalText"

    invoke-static {v9, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v1, Lc0/f0;->d:Landroid/widget/TextView;

    const-string v3, "$tv"

    invoke-static {v10, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v1, Lc0/f0;->e:Landroid/content/Context;

    const-string v3, "$ctx"

    invoke-static {v11, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v12, v0

    sget-object v13, Lc0/n0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    iget-wide v14, v2, Lc0/j0;->a:J

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v4, 0x1

    xor-int/2addr v0, v4

    if-eqz v0, :cond_2

    sget-object v0, Lc0/n0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v0, Lc0/n0;->a:Lc0/n0;

    iget-object v0, v2, Lc0/j0;->c:Ljava/lang/String;

    invoke-static {v0}, Lc0/n0;->z(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    const/4 v8, 0x0

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/lit8 v6, v5, -0x3

    invoke-static {v0, v6}, LW0/r;->I0(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v5, -0x2

    :goto_1
    invoke-virtual {v0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "substring(...)"

    invoke-static {v6, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "wxid_"

    invoke-static {v6, v4, v8}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "[a-zA-Z][\\w@.\\-]{4,80}"

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v3, "compile(...)"

    invoke-static {v4, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, v12

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v0, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_6
    move-object v3, v12

    :goto_4
    iget-object v0, v2, Lc0/j0;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v5, Lc0/l0;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v6}, Lc0/l0;-><init>(Ljava/lang/Class;LH0/a;)V

    invoke-static {v5}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v0

    :goto_5
    invoke-virtual {v0}, LV0/i;->hasNext()Z

    move-result v5

    const-class v6, Ljava/lang/String;

    if-eqz v5, :cond_8

    invoke-virtual {v0}, LV0/i;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/reflect/Method;

    const-string v8, "setContent"

    move-object/from16 v17, v0

    const-string v0, "setMsgContent"

    filled-new-array {v8, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v8, 0x1

    if-ne v0, v8, :cond_7

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/4 v7, 0x0

    aget-object v0, v0, v7

    invoke-static {v0, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :cond_7
    move-object/from16 v0, v17

    const/4 v8, 0x0

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_6
    check-cast v5, Ljava/lang/reflect/Method;

    const-string v7, ": "

    const-string v8, "."

    if-eqz v5, :cond_a

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    instance-of v1, v0, LD0/f;

    const/16 v17, 0x1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_9

    move-object/from16 v18, v11

    move-object/from16 v17, v13

    const/4 v6, 0x1

    goto/16 :goto_c

    :cond_9
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v13

    new-instance v13, Ljava/lang/StringBuilder;

    move-object/from16 v18, v11

    const-string v11, "content setter fail "

    invoke-direct {v13, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    goto :goto_8

    :cond_a
    move-object/from16 v18, v11

    move-object/from16 v17, v13

    :goto_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lc0/k0;

    const/4 v5, 0x0

    invoke-direct {v1, v0, v5}, Lc0/k0;-><init>(Ljava/lang/Class;LH0/a;)V

    invoke-static {v1}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v0

    :goto_9
    invoke-virtual {v0}, LV0/i;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, LV0/i;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/reflect/Field;

    const-string v13, "field_content"

    const-string v5, "content"

    filled-new-array {v13, v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_a

    :cond_b
    const/4 v5, 0x0

    goto :goto_9

    :cond_c
    const/4 v1, 0x0

    :goto_a
    check-cast v1, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_e

    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    instance-of v5, v0, LD0/f;

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    if-eqz v5, :cond_d

    check-cast v0, LD0/l;

    :goto_c
    move v0, v6

    goto :goto_e

    :cond_d
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "content field fail "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_e
    :goto_d
    const/4 v0, 0x0

    goto :goto_e

    :cond_f
    move-object/from16 v18, v11

    move-object/from16 v17, v13

    goto :goto_d

    :goto_e
    const-wide/16 v4, 0x0

    cmp-long v1, v14, v4

    if-gtz v1, :cond_10

    const/4 v1, 0x0

    const/4 v8, 0x0

    goto :goto_10

    :cond_10
    sget-object v1, Lc0/n0;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v1}, LE0/l;->o0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v7, 0x0

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    const-string v8, "msgId=?"

    invoke-static {v5, v3, v8, v6}, Lc0/n0;->m(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_11

    add-int/2addr v7, v6

    goto :goto_f

    :cond_11
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "msgId="

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    new-array v11, v8, [Ljava/lang/String;

    invoke-static {v5, v3, v6, v11}, Lc0/n0;->m(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v7, v5

    goto :goto_f

    :cond_12
    const/4 v8, 0x0

    if-gtz v7, :cond_13

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "db update missed msgId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " dbs="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_13
    move v1, v7

    :goto_10
    invoke-static {v2, v10, v9, v12}, Lc0/n0;->d(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    new-instance v13, Lc0/i0;

    const/16 v16, 0x0

    move-object v3, v13

    move-object v4, v2

    move-object v5, v10

    move-object v6, v9

    move-object v7, v12

    move/from16 p1, v11

    move v11, v8

    move/from16 v8, v16

    invoke-direct/range {v3 .. v8}, Lc0/i0;-><init>(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v10, v13}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v13, Lc0/i0;

    const/4 v8, 0x1

    move-object v3, v13

    invoke-direct/range {v3 .. v8}, Lc0/i0;-><init>(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;I)V

    const-wide/16 v3, 0x78

    invoke-virtual {v10, v13, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v13, Lc0/i0;

    const/4 v8, 0x2

    move-object v3, v13

    move-object v4, v2

    invoke-direct/range {v3 .. v8}, Lc0/i0;-><init>(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;I)V

    const-wide/16 v2, 0x1a4

    invoke-virtual {v10, v13, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    const-string v2, "\u5df2\u4fee\u6539\u672c\u5730\u663e\u793a"

    move-object/from16 v3, v18

    invoke-static {v3, v2, v11}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual/range {v17 .. v17}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "edited msgId="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " objectApplied="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " dbRows="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " views="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " oldLen="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " len="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " cache="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    return-void
.end method
