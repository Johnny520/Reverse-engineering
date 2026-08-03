.class public final synthetic Lf0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/ClassLoader;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V
    .locals 0

    iput p4, p0, Lf0/X;->a:I

    iput-object p1, p0, Lf0/X;->b:Landroid/content/Context;

    iput-object p2, p0, Lf0/X;->c:Ljava/lang/ClassLoader;

    iput-object p3, p0, Lf0/X;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, v1, Lf0/X;->d:Ljava/lang/String;

    iget-object v6, v1, Lf0/X;->b:Landroid/content/Context;

    const-string v0, "$ctx"

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    const-string v0, "$cl"

    invoke-static {v7, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lc0/n0;->a:Lc0/n0;

    const-class v9, Landroid/view/MenuItem;

    sget-object v10, LD0/l;->a:LD0/l;

    sget-object v0, Lc0/n0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_32

    :cond_0
    invoke-static {}, Lc0/n0;->p()Z

    move-result v0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "install enabled="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    sget-object v0, Lc0/n0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v11, "getDeclaredMethods(...)"

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "com.tencent.wcdb.database.SQLiteDatabase"

    const-string v13, "android.database.sqlite.SQLiteDatabase"

    filled-new-array {v0, v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v14, v0

    invoke-static {v14}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    instance-of v14, v0, LD0/f;

    if-eqz v14, :cond_3

    const/4 v0, 0x0

    :cond_3
    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_2

    move-object v13, v0

    goto :goto_1

    :cond_4
    const/4 v13, 0x0

    :goto_1
    if-nez v13, :cond_5

    const-string v0, "database class not ready"

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_5
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    array-length v15, v0

    :goto_2
    if-ge v3, v15, :cond_7

    aget-object v12, v0, v3

    const-string v2, "rawQuery"

    const-string v4, "query"

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    const/4 v2, 0x1

    add-int/2addr v3, v2

    move v4, v2

    goto :goto_2

    :cond_7
    move v2, v4

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v12, Lc0/j;

    const/16 v14, 0x13

    invoke-direct {v12, v14}, Lc0/j;-><init>(I)V

    invoke-static {v0, v12}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/2addr v4, v2

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_4
    const/4 v2, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "database capture hooks="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :goto_5
    :try_start_2
    const-class v0, Landroid/widget/TextView;

    const-string v2, "setText"

    const-class v3, Ljava/lang/CharSequence;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v2, Lc0/m0;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lc0/m0;-><init>(I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const-string v0, "text rebind hook installed"

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v10

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "text rebind hook fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_9
    :try_start_3
    const-class v0, Landroid/view/View;

    const-string v2, "performLongClick"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v2, Lc0/m0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lc0/m0;-><init>(I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const-string v0, "long-press observer installed"

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v0, v10

    goto :goto_7

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "long-press observer fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_a
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    :try_start_4
    const-string v0, "l75.g4"

    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_8
    const-string v21, "l65.g4"

    const-string v22, "l85.g4"

    const-string v17, "l75.g4"

    const-string v18, "m75.g4"

    const-string v19, "k75.g4"

    const-string v20, "n75.g4"

    const-string v23, "l75.f4"

    const-string v24, "l75.h4"

    filled-new-array/range {v17 .. v24}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-class v4, Landroid/view/Menu;

    if-eqz v0, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_5
    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_9

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_9

    :cond_c
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-string v0, "iterator(...)"

    invoke-static {v3, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v13, "add"

    if-eqz v0, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v14, "next(...)"

    invoke-static {v0, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v14

    if-nez v14, :cond_11

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v14

    const-string v15, "getInterfaces(...)"

    invoke-static {v14, v15}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v14

    move-object/from16 v17, v3

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v1, :cond_e

    aget-object v18, v14, v3

    move/from16 v19, v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v4

    const-string v4, "Menu"

    move/from16 v20, v12

    const/4 v12, 0x0

    invoke-static {v1, v4, v12}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_d

    :cond_d
    const/4 v1, 0x1

    add-int/2addr v3, v1

    move-object/from16 v4, v18

    move/from16 v1, v19

    move/from16 v12, v20

    goto :goto_b

    :cond_e
    move-object/from16 v18, v4

    move/from16 v20, v12

    const/4 v12, 0x0

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v15}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, v1

    move v4, v12

    :goto_c
    if-ge v4, v3, :cond_10

    aget-object v14, v1, v4

    const-class v15, Landroid/view/ContextMenu;

    invoke-static {v14, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    goto :goto_d

    :cond_f
    const/4 v14, 0x1

    add-int/2addr v4, v14

    goto :goto_c

    :cond_10
    move-object/from16 v1, p0

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    move/from16 v12, v20

    goto :goto_a

    :cond_11
    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move/from16 v20, v12

    const/4 v12, 0x0

    :goto_d
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    move v4, v12

    :goto_e
    if-ge v4, v3, :cond_14

    aget-object v14, v0, v4

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_13

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    const/4 v12, 0x2

    if-gt v15, v12, :cond_12

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    array-length v15, v15

    const/4 v12, 0x1

    if-gt v12, v15, :cond_12

    const/4 v12, 0x5

    if-ge v15, v12, :cond_12

    goto :goto_10

    :cond_12
    :goto_f
    const/4 v12, 0x1

    goto :goto_11

    :cond_13
    :goto_10
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :goto_11
    add-int/2addr v4, v12

    const/4 v12, 0x0

    goto :goto_e

    :cond_14
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_15
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/reflect/Method;

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const-string v14, "toString(...)"

    invoke-static {v12, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_16
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v12, v20

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_6
    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v3, Lc0/j;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lc0/j;-><init>(I)V

    invoke-static {v0, v3}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    const/4 v3, 0x1

    add-int/2addr v12, v3

    goto :goto_13

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_13

    :cond_17
    move-object/from16 v1, p0

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    goto/16 :goto_a

    :cond_18
    move/from16 v20, v12

    :try_start_7
    const-string v0, "com.android.internal.view.menu.MenuBuilder"

    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    const/4 v4, 0x0

    :goto_14
    if-ge v4, v3, :cond_1a

    aget-object v12, v0, v4

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    const/4 v12, 0x1

    goto :goto_15

    :catchall_7
    move-exception v0

    move/from16 v12, v20

    goto :goto_17

    :goto_15
    add-int/2addr v4, v12

    goto :goto_14

    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move/from16 v12, v20

    :goto_16
    :try_start_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v3, Lc0/m0;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lc0/m0;-><init>(I)V

    invoke-static {v1, v3}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    const/4 v1, 0x1

    add-int/2addr v12, v1

    goto :goto_16

    :catchall_8
    move-exception v0

    :goto_17
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_1b
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v2, v1}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_1c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "wechat context menu hooks="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " classes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    const-string v1, "getParameterTypes(...)"

    :try_start_9
    const-string v17, "l75.h4"

    const-string v18, "m75.h4"

    const-string v19, "k75.h4"

    const-string v20, "n75.h4"

    const-string v21, "l65.h4"

    const-string v22, "l85.h4"

    const-string v23, "l75.i4"

    filled-new-array/range {v17 .. v23}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_e

    const/4 v3, 0x0

    :goto_19
    :try_start_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    :try_start_b
    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    goto :goto_1a

    :catchall_9
    move-exception v0

    move-object v4, v0

    :try_start_c
    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    :goto_1a
    :try_start_d
    instance-of v4, v0, LD0/f;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    if-eqz v4, :cond_1d

    const/4 v0, 0x0

    :cond_1d
    :try_start_e
    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v16, v2

    move/from16 v17, v3

    goto/16 :goto_21

    :cond_1f
    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    array-length v13, v4

    const/4 v14, 0x0

    :goto_1b
    if-ge v14, v13, :cond_23

    aget-object v15, v4, v14

    move-object/from16 v16, v2

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v2

    if-nez v2, :cond_22

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    move/from16 v17, v3

    :try_start_f
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_1d

    :catchall_a
    move-exception v0

    :goto_1c
    move/from16 v3, v17

    goto :goto_22

    :cond_20
    :goto_1d
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    :goto_1e
    const/4 v2, 0x1

    goto :goto_1f

    :catchall_b
    move-exception v0

    move/from16 v17, v3

    goto :goto_22

    :cond_22
    move/from16 v17, v3

    goto :goto_1e

    :goto_1f
    add-int/2addr v14, v2

    move-object/from16 v2, v16

    move/from16 v3, v17

    goto :goto_1b

    :cond_23
    move-object/from16 v16, v2

    move/from16 v17, v3

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move/from16 v3, v17

    :goto_20
    :try_start_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    const/4 v12, 0x1

    invoke-virtual {v4, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v12, Lc0/d;

    invoke-direct {v12, v0, v4}, Lc0/d;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    invoke-static {v4, v12}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    const/4 v3, 0x1

    goto :goto_20

    :catchall_c
    move-exception v0

    goto :goto_22

    :cond_24
    move-object/from16 v2, v16

    goto/16 :goto_19

    :goto_21
    move-object/from16 v2, v16

    move/from16 v3, v17

    goto/16 :goto_19

    :catchall_d
    move-exception v0

    move/from16 v17, v3

    goto :goto_1c

    :cond_25
    move/from16 v17, v3

    goto :goto_23

    :catchall_e
    move-exception v0

    const/4 v3, 0x0

    :goto_22
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_23
    :try_start_11
    const-string v0, "com.android.internal.view.menu.MenuItemImpl"

    invoke-static {v7, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v4, 0x0

    :goto_24
    if-ge v4, v2, :cond_27

    aget-object v11, v0, v4

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "invoke"

    invoke-static {v12, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_26

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v12

    if-nez v12, :cond_26

    goto :goto_26

    :cond_26
    const/4 v11, 0x1

    goto :goto_25

    :catchall_f
    move-exception v0

    goto :goto_27

    :goto_25
    add-int/2addr v4, v11

    goto :goto_24

    :cond_27
    const/4 v11, 0x0

    :goto_26
    if-nez v11, :cond_28

    goto :goto_28

    :cond_28
    new-instance v0, Lc0/m0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc0/m0;-><init>(I)V

    invoke-static {v11, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_f

    const/4 v3, 0x1

    goto :goto_28

    :goto_27
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_28
    if-eqz v3, :cond_29

    const-string v0, "wechat menu item click hook installed"

    goto :goto_29

    :cond_29
    const-string v0, "menu item click hook skipped (long-press path still works)"

    :goto_29
    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :try_start_12
    invoke-static {v6, v5}, Lc0/n0;->r(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    const/4 v1, 0x1

    invoke-virtual {v0, v7, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_13

    :try_start_13
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    const-string v1, "com.tencent.mm.ui.chatting.viewitems"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;

    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v3, "MicroMsg.ChattingItem"

    const-string v4, "msg is null!"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_2a
    :goto_2a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    :try_start_14
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lc0/n0;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    goto :goto_2b

    :catchall_10
    move-exception v0

    :try_start_15
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2b
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_2b

    const/4 v0, 0x0

    :cond_2b
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_2c

    goto :goto_2a

    :cond_2c
    invoke-virtual {v8, v0}, Lc0/n0;->k(Ljava/lang/reflect/Method;)Z

    move-result v0

    if-eqz v0, :cond_2a

    const/4 v4, 0x1

    add-int/2addr v3, v4

    goto :goto_2a

    :catchall_11
    move-exception v0

    move-object v1, v0

    goto/16 :goto_2f

    :cond_2d
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    const-string v1, "com.tencent.mm.ui.chatting"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;

    new-instance v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v18, "onMMMenuItemSelected"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x6

    const/16 v22, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v17 .. v22}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    const-string v5, "TYPE"

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    filled-new-array {v9, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    :try_start_16
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lc0/n0;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_12

    goto :goto_2d

    :catchall_12
    move-exception v0

    :try_start_17
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2d
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_2e

    const/4 v0, 0x0

    :cond_2e
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_2f

    goto :goto_2e

    :cond_2f
    invoke-virtual {v8, v0}, Lc0/n0;->l(Ljava/lang/reflect/Method;)Z

    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    if-eqz v0, :cond_30

    const/4 v5, 0x1

    add-int/2addr v4, v5

    goto :goto_2c

    :cond_30
    :goto_2e
    const/4 v5, 0x1

    goto :goto_2c

    :cond_31
    const/4 v1, 0x0

    :try_start_18
    invoke-static {v2, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wechat concrete menu hooks create="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_13

    move-object v0, v10

    goto :goto_31

    :catchall_13
    move-exception v0

    goto :goto_30

    :goto_2f
    :try_start_19
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    :catchall_14
    move-exception v0

    move-object v3, v0

    :try_start_1a
    invoke-static {v2, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    :goto_30
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_31
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_32

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "wechat concrete menu selection hook fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_32
    :goto_32
    return-object v10
.end method

.method private final c()Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v4, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v5, v1, Lf0/X;->d:Ljava/lang/String;

    const-string v6, "$ctx"

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$cl"

    invoke-static {v4, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/G;->a:Lc0/G;

    const-string v6, "com.tencent.mm.ui.FrostedContentView"

    sget-object v7, Lc0/G;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v7, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v7

    sget-object v8, LD0/l;->a:LD0/l;

    if-nez v7, :cond_0

    move-object/from16 v18, v8

    goto/16 :goto_32

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v7

    :goto_0
    sput-object v0, Lc0/G;->s:Landroid/content/Context;

    sput-object v5, Lc0/G;->t:Ljava/lang/String;

    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "install floating="

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :try_start_0
    const-string v0, "com.tencent.mm.ui.MainTabUI"

    invoke-static {v4, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_2

    const/4 v0, 0x0

    :cond_2
    move-object v5, v0

    check-cast v5, Ljava/lang/Class;

    const-string v9, "getParameterTypes(...)"

    if-nez v5, :cond_3

    const-string v0, "MainTabUI not found"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_3
    new-instance v10, Lc0/j;

    const/4 v0, 0x5

    invoke-direct {v10, v0, v3}, Lc0/j;-><init>(IZ)V

    :try_start_1
    const-string v0, "d"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5, v0, v11}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    const-string v0, "hooked MainTabUI.d"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v11, v2

    goto :goto_4

    :goto_2
    move v11, v2

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move v11, v3

    :goto_3
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_4
    if-nez v11, :cond_6

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v12

    :cond_4
    :goto_5
    invoke-virtual {v12}, LE0/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    invoke-static {v13, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v13, v13

    if-nez v13, :cond_4

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v14}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    :try_start_3
    invoke-static {v0, v10}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    add-int/2addr v11, v2

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v13, v0

    invoke-static {v13}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v10, "hooked MainTabUI void methods="

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_6
    :try_start_4
    const-string v0, "com.tencent.mm.ui.MainTabUI$TabsAdapter"

    invoke-static {v4, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    instance-of v10, v0, LD0/f;

    if-eqz v10, :cond_7

    const/4 v0, 0x0

    :cond_7
    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lc0/G;->k(Ljava/lang/Class;)V

    goto :goto_a

    :cond_8
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_9
    :goto_7
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "TabsAdapter"

    invoke-static {v10, v11, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_b

    invoke-virtual {v5}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v10

    const-string v11, "getInterfaces(...)"

    invoke-static {v10, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v10

    move v12, v3

    :goto_8
    if-ge v12, v11, :cond_9

    aget-object v13, v10, v12

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "OnPageChangeListener"

    invoke-static {v13, v14, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v13

    if-eqz v13, :cond_a

    goto :goto_9

    :cond_a
    add-int/2addr v12, v2

    goto :goto_8

    :cond_b
    :goto_9
    invoke-static {v5}, Lc0/G;->k(Ljava/lang/Class;)V

    goto :goto_7

    :cond_c
    :goto_a
    :try_start_5
    const-string v0, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-static {v4, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_b

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_d

    const/4 v0, 0x0

    :cond_d
    move-object v5, v0

    check-cast v5, Ljava/lang/Class;

    sget-object v0, Lc0/G;->a:Lc0/G;

    const-class v10, Ljava/lang/String;

    if-nez v5, :cond_e

    move-object/from16 v19, v4

    move-object/from16 v20, v6

    move-object/from16 v18, v8

    goto/16 :goto_1d

    :cond_e
    sget-object v0, Lc0/G;->s:Landroid/content/Context;

    sget-object v11, Lc0/G;->t:Ljava/lang/String;

    const-string v12, "updateMainTabUnread %d"

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v12

    invoke-static {v0, v4, v11, v5, v12}, Lc0/G;->n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v12

    const-string v13, "[updateFriendTabUnread] unread : "

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v13

    invoke-static {v0, v4, v11, v5, v13}, Lc0/G;->n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v13

    const-string v14, "[updateContactTabUnread] unread : "

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v0, v4, v11, v5, v14}, Lc0/G;->n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v14

    const-string v15, "[showFriendPoint] show : "

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v0, v4, v11, v5, v15}, Lc0/G;->n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v15

    const-string v16, "showFriendTextPoint show:"

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v4, v11, v5, v7}, Lc0/G;->n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v7

    new-instance v0, Lc0/A;

    const/4 v11, 0x3

    invoke-direct {v0, v11}, Lc0/A;-><init>(I)V

    invoke-static {v12, v0}, Lc0/G;->m(Ljava/lang/reflect/Method;LP0/l;)Z

    move-result v11

    new-instance v0, Lb0/e;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lb0/e;-><init>(I)V

    invoke-static {v14, v0}, Lc0/G;->m(Ljava/lang/reflect/Method;LP0/l;)Z

    move-result v2

    new-instance v0, Lb0/e;

    const/16 v3, 0x1a

    invoke-direct {v0, v3}, Lb0/e;-><init>(I)V

    invoke-static {v13, v0}, Lc0/G;->m(Ljava/lang/reflect/Method;LP0/l;)Z

    move-result v3

    new-instance v0, Lb0/e;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    const-string v1, "hooked unread bool "

    move-object/from16 v18, v8

    const-string v8, "."

    if-nez v15, :cond_f

    move-object/from16 v19, v4

    :goto_c
    const/4 v1, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v19, v4

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v4

    if-nez v4, :cond_10

    goto :goto_d

    :cond_10
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v9, 0x0

    aget-object v4, v4, v9

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :goto_d
    goto :goto_c

    :cond_11
    const/4 v4, 0x1

    :try_start_6
    invoke-virtual {v15, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v9, Lc0/E;

    invoke-direct {v9, v0, v4}, Lc0/E;-><init>(LP0/l;I)V

    invoke-static {v15, v9}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_e

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_e
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_12

    move-object v0, v1

    :cond_12
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v1, v0

    :goto_f
    const-string v0, "hooked unread text "

    const/4 v4, 0x2

    if-nez v7, :cond_14

    :cond_13
    :goto_10
    move-object/from16 v20, v6

    const/4 v4, 0x0

    goto/16 :goto_13

    :cond_14
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    if-ne v9, v4, :cond_13

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    const/16 v17, 0x0

    aget-object v9, v9, v17

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v9, 0x1

    aget-object v4, v4, v9

    invoke-static {v4, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_10

    :cond_15
    :try_start_7
    invoke-virtual {v7, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v4, Lc0/j;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    const/16 v9, 0xb

    move-object/from16 v20, v6

    const/4 v6, 0x0

    :try_start_8
    invoke-direct {v4, v9, v6}, Lc0/j;-><init>(IZ)V

    invoke-static {v7, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_12

    :catchall_7
    move-exception v0

    goto :goto_11

    :catchall_8
    move-exception v0

    move-object/from16 v20, v6

    :goto_11
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_12
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_16

    move-object v0, v4

    :cond_16
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v4, v0

    :goto_13
    if-eqz v12, :cond_17

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_14

    :cond_17
    const/4 v0, 0x0

    :goto_14
    if-eqz v14, :cond_18

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_15

    :cond_18
    const/4 v6, 0x0

    :goto_15
    if-eqz v13, :cond_19

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    goto :goto_16

    :cond_19
    const/4 v8, 0x0

    :goto_16
    if-eqz v15, :cond_1a

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_17

    :cond_1a
    const/4 v9, 0x0

    :goto_17
    if-eqz v7, :cond_1b

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    goto :goto_18

    :cond_1b
    const/4 v7, 0x0

    :goto_18
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "unread via DexKit main="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v13, "("

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") contact="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") friend="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") dot="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") text="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    if-eqz v11, :cond_1c

    if-nez v3, :cond_21

    :cond_1c
    const-string v0, "DexKit resolution incomplete for main/friend, using signature fallback (sync-only)"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v2

    :cond_1d
    :goto_19
    invoke-virtual {v2}, LE0/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {v2}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1f

    const/4 v6, 0x0

    aget-object v7, v5, v6

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    aget-object v7, v5, v6

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    goto :goto_1a

    :cond_1e
    const/4 v8, 0x2

    goto :goto_1b

    :cond_1f
    const/4 v6, 0x0

    :goto_1a
    array-length v7, v5

    const/4 v8, 0x2

    if-ne v7, v8, :cond_1d

    aget-object v7, v5, v6

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const/4 v7, 0x1

    aget-object v5, v5, v7

    invoke-static {v5, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    :goto_1b
    :try_start_9
    new-instance v5, Lc0/j;

    const/16 v7, 0xc

    invoke-direct {v5, v7, v6}, Lc0/j;-><init>(IZ)V

    invoke-static {v0, v5}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_19

    :catchall_9
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_19

    :cond_20
    const/4 v8, 0x2

    goto :goto_19

    :cond_21
    if-eqz v11, :cond_22

    if-eqz v3, :cond_22

    const/4 v0, 0x1

    goto :goto_1c

    :cond_22
    const/4 v0, 0x0

    :goto_1c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    if-nez v11, :cond_23

    const-string v5, "\u4e3b tab \u672a\u8bfb\u65b9\u6cd5\u672a\u547d\u4e2d;"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_23
    if-nez v3, :cond_24

    const-string v3, "\u53d1\u73b0 tab \u8bc4\u8bba/\u70b9\u8d5e\u65b9\u6cd5\u672a\u547d\u4e2d;"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_24
    if-nez v1, :cond_25

    const-string v1, "\u670b\u53cb\u5708\u7ea2\u70b9\u65b9\u6cd5\u672a\u547d\u4e2d;"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_25
    if-nez v4, :cond_26

    const-string v1, "\u6587\u5b57\u6307\u793a\u65b9\u6cd5\u672a\u547d\u4e2d;"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_27

    const-string v1, "\u5168\u90e8\u672a\u8bfb\u65b9\u6cd5\u5747\u5df2\u89e3\u6790"

    :cond_27
    const-string v2, "BottomTabFloating"

    invoke-static {v2, v1, v0}, Le0/c;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1d
    const-class v1, Landroid/view/View;

    :try_start_a
    const-string v0, "setVisibility"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v3, Lc0/j;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lc0/j;-><init>(I)V

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked setVisibility for bottom tab"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto :goto_1e

    :catchall_a
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1e
    :try_start_b
    const-string v0, "setBackgroundColor"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v3, Lc0/j;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lc0/j;-><init>(I)V

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    goto :goto_1f

    :catchall_b
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1f
    :try_start_c
    const-string v0, "setBackgroundDrawable"

    const-class v2, Landroid/graphics/drawable/Drawable;

    new-instance v3, Lc0/j;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lc0/j;-><init>(I)V

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    :goto_20
    move-object/from16 v1, v19

    move-object/from16 v2, v20

    goto :goto_21

    :catchall_c
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_20

    :goto_21
    :try_start_d
    invoke-static {v1, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_22

    :catchall_d
    move-exception v0

    move-object v3, v0

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_22
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_28

    const/4 v0, 0x0

    :cond_28
    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    if-nez v3, :cond_29

    const-string v0, "FrostedContentView not found"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    goto/16 :goto_25

    :cond_29
    :try_start_e
    const-string v0, "a"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    new-instance v7, Lc0/m;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lc0/m;-><init>(I)V

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked FrostedContentView.a"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    move-object/from16 v0, v18

    goto :goto_23

    :catchall_e
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_23
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Frosted.a: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_2a
    :try_start_f
    const-string v0, "setBottomBlurAreaHeight"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v5, Lc0/j;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lc0/j;-><init>(IZ)V

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked FrostedContentView.setBottomBlurAreaHeight"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    move-object/from16 v0, v18

    goto :goto_24

    :catchall_f
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_24
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "setBottomBlurAreaHeight: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_2b
    :goto_25
    const-class v3, Ljava/lang/CharSequence;

    const-string v4, "setText"

    const-class v5, Landroid/widget/TextView;

    new-instance v6, Lc0/j;

    const/4 v0, 0x7

    const/4 v7, 0x0

    invoke-direct {v6, v0, v7}, Lc0/j;-><init>(IZ)V

    :try_start_10
    filled-new-array {v3, v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v4, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    const/4 v9, 0x1

    goto :goto_26

    :catchall_10
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    const/4 v9, 0x0

    :goto_26
    :try_start_11
    const-class v0, Landroid/widget/TextView$BufferType;

    filled-new-array {v3, v0, v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v4, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    const/4 v3, 0x1

    add-int/2addr v9, v3

    goto :goto_27

    :catchall_11
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "hooked ActionBar text1 setText overloads="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :try_start_12
    const-string v0, "com.tencent.mm.ui.ga"

    invoke-static {v1, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_2c
    :goto_28
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2c

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v6, 0x0

    aget-object v4, v4, v6

    invoke-static {v4, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v7, "C0"

    invoke-static {v4, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    new-instance v4, Lc0/j;

    const/4 v7, 0x6

    invoke-direct {v4, v7}, Lc0/j;-><init>(I)V

    invoke-static {v3, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const-string v3, "hooked ga.C0"

    invoke-static {v3}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    goto :goto_28

    :catchall_12
    move-exception v0

    goto :goto_29

    :cond_2d
    move-object/from16 v0, v18

    goto :goto_2a

    :goto_29
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2a
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ga.C0 hook: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_2e
    const-class v3, Landroid/view/MotionEvent;

    const-string v4, "dispatchTouchEvent"

    new-instance v5, Lc0/F;

    invoke-direct {v5}, Lde/robv/android/xposed/c;-><init>()V

    :try_start_13
    const-class v0, Landroid/widget/AbsListView;

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v4, v6}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked AbsListView dispatchTouchEvent for auto hide"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    move-object/from16 v0, v18

    goto :goto_2b

    :catchall_13
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AbsListView touch hook fail: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_2f
    :try_start_14
    const-string v0, "androidx.recyclerview.widget.RecyclerView"

    invoke-static {v1, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    goto :goto_2c

    :catchall_14
    move-exception v0

    :try_start_15
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2c
    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_30

    const/4 v7, 0x0

    goto :goto_2d

    :cond_30
    move-object v7, v0

    :goto_2d
    check-cast v7, Ljava/lang/Class;

    if-nez v7, :cond_31

    const-string v0, "android.support.v7.widget.RecyclerView"

    invoke-static {v1, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    goto :goto_2e

    :catchall_15
    move-exception v0

    goto :goto_2f

    :cond_31
    :goto_2e
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7, v4, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked RecyclerView dispatchTouchEvent for auto hide"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    move-object/from16 v0, v18

    goto :goto_30

    :goto_2f
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_30
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_32

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "RecyclerView touch hook fail: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_32
    :try_start_16
    invoke-static {v1, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v4, v1}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked FrostedContentView dispatchTouchEvent for auto hide"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_16

    move-object/from16 v0, v18

    goto :goto_31

    :catchall_16
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_31
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FrostedContentView touch hook fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_33
    const-string v0, "ready"

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :goto_32
    return-object v18
.end method

.method private final d()Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    iget-object v8, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v9, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v10, v1, Lf0/X;->d:Ljava/lang/String;

    const-string v0, "$ctx"

    invoke-static {v8, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$cl"

    invoke-static {v9, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf0/Y;

    invoke-direct {v0, v6}, Lf0/Y;-><init>(I)V

    sput-object v0, LU/S;->k:LP0/l;

    new-instance v0, Lf0/Y;

    invoke-direct {v0, v7}, Lf0/Y;-><init>(I)V

    sput-object v0, LU/S;->l:LP0/l;

    new-instance v0, Lf0/Y;

    invoke-direct {v0, v5}, Lf0/Y;-><init>(I)V

    sput-object v0, LU/S;->m:LP0/l;

    new-instance v0, Lf0/Y;

    invoke-direct {v0, v4}, Lf0/Y;-><init>(I)V

    sput-object v0, LU/S;->n:LP0/l;

    new-instance v0, Lf0/Y;

    invoke-direct {v0, v3}, Lf0/Y;-><init>(I)V

    sput-object v0, LU/S;->o:LP0/l;

    sget-object v0, Lc0/D0;->a:Lc0/D0;

    const-string v11, "com.tencent.mm.ui.LauncherUI"

    const-class v12, Ljava/lang/String;

    sget-object v13, LD0/l;->a:LD0/l;

    sget-object v0, Lc0/D0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1e

    :cond_0
    sput-object v9, Lc0/D0;->d:Ljava/lang/ClassLoader;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v8

    :cond_1
    sput-object v0, Lc0/D0;->e:Landroid/content/Context;

    sput-object v10, Lc0/D0;->f:Ljava/lang/String;

    :try_start_0
    const-string v0, "com.tencent.mm.pluginsdk.ui.u"

    invoke-static {v0, v6, v9}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v15, "a"

    const-class v14, Landroid/widget/ImageView;

    filled-new-array {v14, v12}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v0, v15, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v14

    invoke-virtual {v14, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v14, Lc0/D0;->t:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v14, "getMethods(...)"

    invoke-static {v0, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v14, v0

    move v15, v6

    :goto_0
    if-ge v15, v14, :cond_3

    aget-object v16, v0, v15

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "c"

    invoke-static {v3, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getParameterTypes(...)"

    invoke-static {v3, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, v3

    if-nez v3, :cond_2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v0, v16

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_2
    add-int/2addr v15, v7

    const/4 v3, 0x4

    const/4 v4, 0x3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    sput-object v0, Lc0/D0;->u:Ljava/lang/reflect/Method;

    sget-object v0, Lc0/D0;->t:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_5

    move v0, v7

    goto :goto_3

    :cond_5
    move v0, v6

    :goto_3
    sget-object v3, Lc0/D0;->u:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_6

    move v3, v7

    goto :goto_4

    :cond_6
    move v3, v6

    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "warmReflect ok factoryA="

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " factoryC="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v13

    goto :goto_6

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    sget-object v3, Lc0/D0;->a:Lc0/D0;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "warmReflect fail: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_7
    invoke-static {v7}, Lc0/D0;->h(Z)Z

    move-result v0

    sput-boolean v0, Lc0/D0;->p:Z

    sget-boolean v0, Lc0/D0;->p:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "install enabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    new-instance v0, Lc0/H;

    invoke-direct {v0, v5, v9}, Lc0/H;-><init>(ILjava/lang/Object;)V

    new-instance v3, Lc0/x0;

    invoke-direct {v3, v9, v10, v6}, Lc0/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v0, LU/S;->t:LP0/l;

    sput-object v3, LU/S;->u:LP0/a;

    :try_start_1
    invoke-static {v9, v11}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_8

    const/4 v0, 0x0

    :cond_8
    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    if-nez v3, :cond_9

    const-string v0, "LauncherUI miss"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_9
    :try_start_2
    const-string v0, "onResume"

    new-instance v4, Lc0/B0;

    const/4 v10, 0x5

    invoke-direct {v4, v10}, Lc0/B0;-><init>(I)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked LauncherUI.onResume"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v13

    goto :goto_8

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_8
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "LauncherUI.onResume: "

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_a
    :try_start_3
    const-string v0, "onWindowFocusChanged"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v10, Lc0/B0;

    invoke-direct {v10, v2}, Lc0/B0;-><init>(I)V

    filled-new-array {v4, v10}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked LauncherUI.onWindowFocusChanged"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v0, v13

    goto :goto_9

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "LauncherUI.onWindowFocusChanged: "

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_b
    :try_start_4
    const-string v0, "onBackPressed"

    new-instance v4, Lc0/B0;

    const/4 v10, 0x7

    invoke-direct {v4, v10}, Lc0/B0;-><init>(I)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked LauncherUI.onBackPressed"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v0, v13

    goto :goto_a

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_a
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LauncherUI.onBackPressed: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_c
    :goto_b
    :try_start_5
    const-string v0, "com.tencent.mm.ui.MainTabUI"

    invoke-static {v9, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_c

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_c
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_d

    const/4 v0, 0x0

    :cond_d
    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    if-nez v3, :cond_e

    goto/16 :goto_16

    :cond_e
    :try_start_6
    const-string v0, "com.tencent.mm.ui.MainTabUI$TabsAdapter"

    invoke-static {v9, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_d

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_d
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_f

    const/4 v0, 0x0

    :cond_f
    if-nez v0, :cond_14

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    const-string v4, "getDeclaredClasses(...)"

    invoke-static {v0, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v0

    move v10, v6

    :goto_e
    if-ge v10, v4, :cond_13

    aget-object v14, v0, v10

    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v15

    const-string v2, "TabsAdapter"

    invoke-static {v15, v2, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v14}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    const-string v15, "getInterfaces(...)"

    invoke-static {v2, v15}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v15, v2

    move v5, v6

    :goto_f
    if-ge v5, v15, :cond_11

    aget-object v17, v2, v5

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v17, v0

    const-string v0, "OnPageChangeListener"

    invoke-static {v7, v0, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_10

    :cond_10
    const/4 v7, 0x1

    add-int/2addr v5, v7

    move-object/from16 v0, v17

    goto :goto_f

    :cond_11
    move-object/from16 v17, v0

    add-int/2addr v10, v7

    const/4 v2, 0x6

    const/4 v5, 0x2

    goto :goto_e

    :cond_12
    :goto_10
    move-object v0, v14

    goto :goto_11

    :cond_13
    const/4 v0, 0x0

    :cond_14
    :goto_11
    if-eqz v0, :cond_17

    :try_start_7
    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_15
    :goto_12
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "onPageSelected"

    invoke-static {v4, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    new-instance v4, Lc0/B0;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lc0/B0;-><init>(I)V

    invoke-static {v2, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_12

    :catchall_7
    move-exception v0

    goto :goto_13

    :cond_16
    const-string v0, "hooked TabsAdapter.onPageSelected"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-object v0, v13

    goto :goto_14

    :goto_13
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_14
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TabsAdapter.onPageSelected: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_17
    :try_start_8
    const-string v0, "d"

    new-instance v2, Lc0/B0;

    const/16 v4, 0x9

    invoke-direct {v2, v4}, Lc0/B0;-><init>(I)V

    invoke-static {v3, v0, v2}, Lde/robv/android/xposed/d;->a(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/c;)V

    const-string v0, "hooked MainTabUI.d -> edge swipe"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    move-object v0, v13

    goto :goto_15

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_15
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MainTabUI.d hook fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_18
    :goto_16
    const-class v2, Landroid/os/Bundle;

    :try_start_9
    invoke-static {v9, v11}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "startChatting"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v5, Lc0/B0;

    invoke-direct {v5, v6}, Lc0/B0;-><init>(I)V

    filled-new-array {v12, v2, v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v3, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked LauncherUI.startChatting hide avatar"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    move-object v0, v13

    goto :goto_17

    :catchall_9
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_17
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LauncherUI.startChatting hide: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_19
    :try_start_a
    const-string v0, "com.tencent.mm.ui.NewChattingTabUI"

    invoke-static {v9, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "r"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v5, Lc0/B0;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lc0/B0;-><init>(I)V

    filled-new-array {v12, v2, v4, v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v3, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v2, "q"

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v5, Lc0/B0;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lc0/B0;-><init>(I)V

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v2, "f"

    new-instance v3, Lc0/B0;

    const/4 v5, 0x3

    invoke-direct {v3, v5}, Lc0/B0;-><init>(I)V

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked NewChattingTabUI avatar visibility"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    move-object v0, v13

    goto :goto_18

    :catchall_a
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_18
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NewChattingTabUI avatar visibility: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_1a
    instance-of v0, v8, Landroid/app/Application;

    if-eqz v0, :cond_1b

    move-object v0, v8

    check-cast v0, Landroid/app/Application;

    goto :goto_19

    :cond_1b
    const/4 v0, 0x0

    :goto_19
    if-nez v0, :cond_1e

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v2, v0, Landroid/app/Application;

    if-eqz v2, :cond_1c

    move-object v14, v0

    check-cast v14, Landroid/app/Application;

    goto :goto_1a

    :cond_1c
    const/4 v14, 0x0

    :goto_1a
    if-nez v14, :cond_1d

    goto :goto_1c

    :cond_1d
    move-object v0, v14

    :cond_1e
    :try_start_b
    new-instance v2, Lc0/C0;

    invoke-direct {v2}, Lc0/C0;-><init>()V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    move-object v0, v13

    goto :goto_1b

    :catchall_b
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "lifecycle guard fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_1f
    :goto_1c
    :try_start_c
    const-class v0, Landroid/app/Dialog;

    const-string v2, "show"

    new-instance v3, Lc0/B0;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lc0/B0;-><init>(I)V

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/d;->a(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/c;)V

    const-string v0, "hooked Dialog.show"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    move-object v0, v13

    goto :goto_1d

    :catchall_c
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dialog.show hook: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_20
    sget-object v0, Lc0/D0;->c:Landroid/os/Handler;

    new-instance v2, LA0/d;

    const/4 v3, 0x6

    invoke-direct {v2, v3, v9}, LA0/d;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x190

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1e
    return-object v13
.end method

.method private final e()Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v0, v1, Lf0/X;->d:Ljava/lang/String;

    iget-object v4, v1, Lf0/X;->b:Landroid/content/Context;

    const-string v5, "$ctx"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    const-string v6, "$cl"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-boolean v6, Lc0/n;->k:Z

    sget-object v7, LD0/l;->a:LD0/l;

    if-nez v6, :cond_0

    goto/16 :goto_1a

    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "install requested from "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc0/n;->q(Ljava/lang/String;)V

    sget-object v6, Lc0/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v6

    const/4 v8, 0x0

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    invoke-static {v4, v0}, Lc0/n;->i(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, v5, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v4, v5}, Lc0/n;->f(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {v4, v5}, Lc0/n;->g(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v4, v8}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v0, v7

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v6, v0

    :try_start_3
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    move-object v9, v0

    :try_start_4
    invoke-static {v4, v6}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "DexKit hook setup failed: "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    :cond_2
    :goto_2
    sget-object v4, Lc0/n;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-class v6, Ljava/lang/String;

    const-string v9, "getDeclaredMethods(...)"

    if-nez v0, :cond_a

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_9

    :cond_3
    const-string v15, "iy0.v"

    const-string v16, "iz0.u"

    const-string v10, "iy0.u"

    const-string v11, "jy0.u"

    const-string v12, "hy0.u"

    const-string v13, "ky0.u"

    const-string v14, "iy0.t"

    const-string v17, "ix0.u"

    const-string v18, "hz0.u"

    filled-new-array/range {v10 .. v18}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_5
    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-static {v11, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    array-length v13, v11

    move v14, v2

    :goto_4
    if-ge v14, v13, :cond_5

    aget-object v15, v11, v14

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    const/4 v8, 0x6

    if-ne v3, v8, :cond_4

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v8, 0x1

    aget-object v3, v3, v8

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    const/4 v3, 0x1

    goto :goto_5

    :catchall_3
    move-exception v0

    goto :goto_7

    :goto_5
    add-int/2addr v14, v3

    const/4 v8, 0x0

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Method;

    invoke-static {v8}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "fallback:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lc0/n;->h(Ljava/lang/String;Ljava/lang/reflect/Method;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v3, 0x1

    xor-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_8

    :goto_7
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_8
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v8, v0, LD0/f;

    if-eqz v8, :cond_7

    move-object v0, v3

    :cond_7
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_9

    :cond_8
    const/4 v3, 0x1

    const/4 v8, 0x0

    goto/16 :goto_3

    :cond_9
    const-string v0, "static doRevokeMsg fallback not found (DexKit primary for 69-76)"

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    :cond_a
    :goto_9
    sget-object v3, Lc0/n;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-string v4, "hooked "

    const-class v8, Landroid/content/ContentValues;

    if-eqz v0, :cond_b

    goto/16 :goto_10

    :cond_b
    const-string v0, "com.tencent.wcdb.database.SQLiteDatabase"

    const-string v10, "android.database.sqlite.SQLiteDatabase"

    filled-new-array {v0, v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_6
    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception v0

    move-object v11, v0

    invoke-static {v11}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_a
    instance-of v11, v0, LD0/f;

    if-eqz v11, :cond_d

    const/4 v0, 0x0

    :cond_d
    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_c

    move-object v10, v0

    goto :goto_b

    :cond_e
    const/4 v10, 0x0

    :goto_b
    if-nez v10, :cond_f

    const-string v0, "database class not ready"

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_f
    const-string v0, "insert"

    filled-new-array {v6, v6, v8}, [Ljava/lang/Class;

    move-result-object v11

    invoke-static {v10, v0, v11}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v0

    const-string v11, "insertOrThrow"

    filled-new-array {v6, v6, v8}, [Ljava/lang/Class;

    move-result-object v12

    invoke-static {v10, v11, v12}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v11

    add-int/2addr v0, v11

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v11}, LQ0/g;->b(Ljava/lang/Object;)V

    filled-new-array {v6, v6, v8, v11}, [Ljava/lang/Class;

    move-result-object v12

    const-string v13, "insertWithOnConflict"

    invoke-static {v10, v13, v12}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v12

    add-int/2addr v0, v12

    const-string v12, "replace"

    filled-new-array {v6, v6, v8}, [Ljava/lang/Class;

    move-result-object v13

    invoke-static {v10, v12, v13}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v12

    add-int/2addr v0, v12

    const-string v12, "replaceOrThrow"

    filled-new-array {v6, v6, v8}, [Ljava/lang/Class;

    move-result-object v13

    invoke-static {v10, v12, v13}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v12

    add-int/2addr v0, v12

    const-class v12, [Ljava/lang/String;

    filled-new-array {v6, v8, v6, v12}, [Ljava/lang/Class;

    move-result-object v13

    const-string v14, "update"

    invoke-static {v10, v14, v13}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v13

    add-int/2addr v0, v13

    filled-new-array {v6, v8, v6, v12, v11}, [Ljava/lang/Class;

    move-result-object v11

    const-string v13, "updateWithOnConflict"

    invoke-static {v10, v13, v11}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v11

    add-int/2addr v0, v11

    const-string v11, "delete"

    filled-new-array {v6, v6, v12}, [Ljava/lang/Class;

    move-result-object v6

    invoke-static {v10, v11, v6}, Lc0/n;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v6

    add-int/2addr v6, v0

    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    array-length v12, v0

    move v13, v2

    :goto_c
    if-ge v13, v12, :cond_11

    aget-object v14, v0, v13

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v2, "rawQuery"

    invoke-static {v15, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    const/4 v2, 0x1

    add-int/2addr v13, v2

    const/4 v2, 0x0

    goto :goto_c

    :cond_11
    const/4 v2, 0x1

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_7
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v13, Lc0/j;

    const/4 v14, 0x0

    invoke-direct {v13, v2, v14}, Lc0/j;-><init>(IZ)V

    invoke-static {v0, v13}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    add-int/2addr v12, v2

    goto :goto_e

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_e
    const/4 v2, 0x1

    goto :goto_d

    :cond_12
    if-lez v12, :cond_13

    const/4 v0, 0x1

    goto :goto_f

    :cond_13
    const/4 v0, 0x0

    :goto_f
    add-int/2addr v6, v0

    if-lez v6, :cond_14

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " DB methods on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    goto :goto_10

    :cond_14
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "no DB method signatures matched on "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    :goto_10
    sget-object v0, Lc0/n;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_1a

    :cond_15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "k"

    const-string v3, "m"

    const-string v6, "b"

    const-string v10, "t"

    const-string v11, "s"

    filled-new-array {v6, v2, v3, v10, v11}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v6, 0x61

    move v10, v6

    :goto_11
    const/16 v11, 0x7b

    if-ge v10, v11, :cond_16

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "com.tencent.mm.storage."

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v12, v6

    :goto_12
    if-ge v12, v11, :cond_17

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x1

    add-int/2addr v12, v14

    int-to-char v12, v12

    goto :goto_12

    :cond_17
    const/4 v14, 0x1

    add-int/2addr v10, v14

    int-to-char v10, v10

    goto :goto_11

    :cond_18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v14, 0x0

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    :try_start_8
    invoke-static {v5, v3}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_14

    :catchall_6
    move-exception v0

    move-object v6, v0

    invoke-static {v6}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_14
    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_19

    const/4 v0, 0x0

    :cond_19
    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_1a

    const/4 v1, 0x1

    goto :goto_19

    :cond_1a
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-static {v6, v9}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v10, v6

    move v11, v14

    const/4 v14, 0x0

    :goto_15
    if-ge v14, v10, :cond_1d

    aget-object v0, v6, v14

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getName(...)"

    invoke-static {v12, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "access$"

    const/4 v15, 0x0

    invoke-static {v12, v13, v15}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-nez v12, :cond_1b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    const-string v13, "getParameterTypes(...)"

    invoke-static {v12, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v13, v12

    :goto_16
    if-ge v15, v13, :cond_1b

    aget-object v1, v12, v15

    invoke-static {v1, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    const/4 v1, 0x1

    :try_start_9
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v12, Lc0/f;

    invoke-direct {v12, v3, v0}, Lc0/f;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;)V

    invoke-static {v0, v12}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    add-int/2addr v11, v1

    goto :goto_17

    :catchall_7
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_1b
    :goto_17
    const/4 v1, 0x1

    goto :goto_18

    :cond_1c
    const/4 v1, 0x1

    add-int/2addr v15, v1

    move-object/from16 v1, p0

    goto :goto_16

    :goto_18
    add-int/2addr v14, v1

    move-object/from16 v1, p0

    goto :goto_15

    :cond_1d
    const/4 v1, 0x1

    move v14, v11

    :goto_19
    move-object/from16 v1, p0

    goto :goto_13

    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " storage ContentValues methods"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/n;->q(Ljava/lang/String;)V

    :goto_1a
    return-object v7
.end method

.method private final f()Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v5, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v6, v1, Lf0/X;->d:Ljava/lang/String;

    const-string v0, "$ctx"

    invoke-static {v4, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$cl"

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lc0/a0;->a:Lc0/a0;

    sget-object v8, LD0/l;->a:LD0/l;

    if-nez v6, :cond_0

    sget-object v0, Lc0/a0;->E:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    sput-object v0, Lc0/a0;->E:Ljava/lang/String;

    sget-object v0, Lc0/a0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v19, v8

    goto/16 :goto_29

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v9, "install requested from "

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :try_start_0
    const-string v0, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v9

    const-string v10, "getDeclaredConstructors(...)"

    invoke-static {v9, v10}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v10, v9

    move v11, v2

    :goto_1
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    invoke-static {v12}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v13, Lc0/j;

    const/16 v14, 0x10

    invoke-direct {v13, v14}, Lc0/j;-><init>(I)V

    invoke-static {v12, v13}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v11, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v0, v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "hooked ChatFooter constructors: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v8

    goto :goto_3

    :goto_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    sget-object v9, Lc0/a0;->a:Lc0/a0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ChatFooter hook skipped: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_3
    sget-object v9, Lc0/a0;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v9, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v10, "#"

    const-string v11, "getMethods(...)"

    const-string v12, "com.tencent.mm.ui.widget.MMNeat7extView"

    const-string v13, "toString(...)"

    if-nez v0, :cond_4

    move-object/from16 v19, v8

    goto/16 :goto_a

    :cond_4
    :try_start_1
    invoke-static {v5, v12}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    array-length v15, v0

    :goto_4
    if-ge v2, v15, :cond_6

    aget-object v3, v0, v2

    move-object/from16 v18, v0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setBackground"

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const/16 v16, 0x0

    aget-object v1, v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    const/4 v1, 0x1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v19, v8

    goto/16 :goto_8

    :goto_5
    add-int/2addr v2, v1

    move v3, v1

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/reflect/Method;

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v2

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v19, v8

    :try_start_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v2, v18

    move-object/from16 v8, v19

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_8

    :cond_8
    move-object/from16 v19, v8

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-static {v2}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v3, Lc0/j;

    const/16 v8, 0x11

    const/4 v14, 0x0

    invoke-direct {v3, v8, v14}, Lc0/j;-><init>(IZ)V

    invoke-static {v2, v3}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hooked MMNeat7extView setBackground methods: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v0, v19

    goto :goto_9

    :goto_8
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MMNeat7extView background hook skipped: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_a
    :goto_a
    sget-object v0, Lc0/a0;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-class v1, Ljava/lang/String;

    const-class v2, Ljava/lang/CharSequence;

    const-string v3, "getParameterTypes(...)"

    const-string v8, "setText"

    if-nez v0, :cond_b

    move-object/from16 v20, v4

    move-object/from16 v21, v7

    goto/16 :goto_15

    :cond_b
    :try_start_3
    const-string v0, "com.tencent.mm.view.x2c.X2CTextView"

    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v11}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    array-length v11, v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    const/4 v14, 0x0

    :goto_b
    if-ge v14, v11, :cond_10

    :try_start_4
    aget-object v15, v0, v14

    move-object/from16 v18, v0

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v20, v11

    array-length v11, v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object/from16 v21, v7

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v11, :cond_e

    move/from16 v22, v11

    :try_start_5
    aget-object v11, v0, v7

    invoke-virtual {v2, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v23

    if-nez v23, :cond_d

    invoke-static {v11, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_e

    :cond_c
    const/4 v11, 0x1

    add-int/2addr v7, v11

    move/from16 v11, v22

    goto :goto_c

    :catchall_3
    move-exception v0

    :goto_d
    move-object/from16 v20, v4

    goto/16 :goto_13

    :cond_d
    :goto_e
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_f
    const/4 v7, 0x1

    goto :goto_10

    :catchall_4
    move-exception v0

    move-object/from16 v21, v7

    goto :goto_d

    :cond_f
    move-object/from16 v21, v7

    move/from16 v20, v11

    goto :goto_f

    :goto_10
    add-int/2addr v14, v7

    move-object/from16 v0, v18

    move/from16 v11, v20

    move-object/from16 v7, v21

    goto :goto_b

    :cond_10
    move-object/from16 v21, v7

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Ljava/lang/reflect/Method;

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v9

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v20, v4

    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    move-object/from16 v9, v18

    move-object/from16 v4, v20

    goto :goto_11

    :catchall_5
    move-exception v0

    goto :goto_13

    :cond_12
    move-object/from16 v20, v4

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v9, Lc0/u;

    const/4 v10, 0x4

    invoke-direct {v9, v10, v4}, Lc0/u;-><init>(ILjava/lang/reflect/Method;)V

    invoke-static {v4, v9}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_12

    :cond_13
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hooked X2CTextView recall cleanup methods: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    move-object/from16 v0, v19

    goto :goto_14

    :catchall_6
    move-exception v0

    move-object/from16 v20, v4

    move-object/from16 v21, v7

    :goto_13
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_14
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "X2CTextView recall cleanup hook skipped: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_14
    :goto_15
    sget-object v0, Lc0/a0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v4, "getDeclaredMethods(...)"

    if-nez v0, :cond_16

    :cond_15
    :goto_16
    move-object/from16 v1, v20

    goto/16 :goto_20

    :cond_16
    :try_start_7
    invoke-static {v5, v12}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    array-length v9, v0

    const/4 v10, 0x0

    :goto_17
    if-ge v10, v9, :cond_1a

    aget-object v11, v0, v10

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v14, "getName(...)"

    invoke-static {v12, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v12, v8, v14}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_19

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v15, v12

    :goto_18
    if-ge v14, v15, :cond_19

    move-object/from16 v18, v0

    aget-object v0, v12, v14

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v22

    if-nez v22, :cond_18

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_19

    :cond_17
    const/16 v17, 0x1

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, v18

    goto :goto_18

    :catchall_7
    move-exception v0

    goto/16 :goto_1e

    :cond_18
    :goto_19
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1a
    const/4 v11, 0x1

    goto :goto_1b

    :cond_19
    move-object/from16 v18, v0

    goto :goto_1a

    :goto_1b
    add-int/2addr v10, v11

    move-object/from16 v0, v18

    goto :goto_17

    :cond_1a
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1b
    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/reflect/Method;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_1c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v3, Lc0/u;

    const/4 v7, 0x3

    invoke-direct {v3, v7, v2}, Lc0/u;-><init>(ILjava/lang/reflect/Method;)V

    invoke-static {v2, v3}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_1d

    :cond_1d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hooked MMNeat setText recall cleanup methods: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-object/from16 v0, v19

    goto :goto_1f

    :goto_1e
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1f
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MMNeat recall text cleanup hook skipped: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    goto/16 :goto_16

    :goto_20
    :try_start_8
    invoke-static {v1, v6}, Lc0/a0;->W(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    const/4 v1, 0x1

    invoke-virtual {v0, v5, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    :try_start_9
    invoke-static {v2, v5}, Lc0/a0;->A(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {v2, v5}, Lc0/a0;->B(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {v2, v5}, Lc0/a0;->H(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    move-object/from16 v1, v21

    invoke-virtual {v1, v2, v5}, Lc0/a0;->K(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    const/4 v0, 0x0

    :try_start_a
    invoke-static {v2, v0}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    move-object/from16 v0, v19

    goto :goto_22

    :catchall_8
    move-exception v0

    goto :goto_21

    :catchall_9
    move-exception v0

    move-object v1, v0

    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    :catchall_a
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-static {v2, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :goto_21
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_22
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DexKit setup failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_1e
    :try_start_d
    const-string v0, "com.tencent.mm.ui.chatting.adapter.k"

    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_23
    if-ge v3, v2, :cond_20

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "F"

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v6, v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1f

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x1

    aget-object v6, v6, v7

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    const/4 v4, 0x1

    goto :goto_24

    :catchall_b
    move-exception v0

    goto :goto_26

    :goto_24
    add-int/2addr v3, v4

    goto :goto_23

    :cond_20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    const-string v2, "current:adapter.k.F"

    invoke-static {v2, v1}, Lc0/a0;->O(Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    goto :goto_25

    :cond_21
    move-object/from16 v0, v19

    goto :goto_27

    :goto_26
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_27
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "current adapter fallback skipped: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_22
    :try_start_e
    const-string v0, "com.tencent.mm.ui.chatting.component.ma"

    invoke-static {v5, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "current:component.ma"

    invoke-static {v0, v1}, Lc0/a0;->P(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    move-object/from16 v0, v19

    goto :goto_28

    :catchall_c
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_28
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "current component fallback skipped: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_23
    :try_start_f
    const-class v0, Landroid/app/Activity;

    const-string v1, "onActivityResult"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v3, Landroid/content/Intent;

    new-instance v4, Lc0/Z;

    invoke-direct {v4}, Lc0/Z;-><init>()V

    filled-new-array {v2, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    goto :goto_29

    :catchall_d
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_29
    return-object v19
.end method

.method private final g()Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v7, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v8, v1, Lf0/X;->d:Ljava/lang/String;

    const-string v0, "$ctx"

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$cl"

    invoke-static {v7, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/k1;->a:Lc0/k1;

    const-string v9, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    sget-object v10, LD0/l;->a:LD0/l;

    sget-object v0, Lc0/k1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_19

    :cond_0
    invoke-static {}, Lc0/k1;->g()Z

    move-result v0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "install enabled="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v7, v9}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12}, Lc0/k1;->j(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v0, "onAttachedToWindow"

    new-instance v13, Lc0/i1;

    invoke-direct {v13, v4}, Lc0/i1;-><init>(I)V

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12, v0, v13}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    :try_start_3
    const-string v0, "onDetachedFromWindow"

    new-instance v13, Lc0/j;

    const/16 v14, 0x1a

    invoke-direct {v13, v14}, Lc0/j;-><init>(I)V

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12, v0, v13}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v12, "getDeclaredConstructors(...)"

    invoke-static {v0, v12}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v0

    move v13, v4

    :goto_2
    if-ge v13, v12, :cond_1

    aget-object v14, v0, v13

    invoke-static {v14}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v15, Lc0/i1;

    invoke-direct {v15, v5}, Lc0/i1;-><init>(I)V

    invoke-static {v14, v15}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v13, v5

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_1
    sget-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "ChatFooter hooked clearMethod="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object v0, v10

    goto :goto_5

    :goto_4
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_5
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    sget-object v12, Lc0/k1;->a:Lc0/k1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "ChatFooter hook failed: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    :cond_3
    sget-object v0, Lc0/k1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_7

    :cond_4
    :try_start_5
    const-class v0, Landroid/widget/TextView;

    const-string v12, "onCreateInputConnection"

    const-class v13, Landroid/view/inputmethod/EditorInfo;

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v12, Lc0/i1;

    invoke-direct {v12, v3}, Lc0/i1;-><init>(I)V

    invoke-static {v0, v12}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const-string v0, "IME delete hook installed (always; gate at runtime)"

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v0, v10

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "IME hook failed: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    :cond_5
    :goto_7
    const-string v12, "void"

    sget-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    const-string v13, "#"

    const-string v14, "next(...)"

    const-string v15, "boolean"

    const-string v3, "iterator(...)"

    if-eqz v0, :cond_6

    goto/16 :goto_11

    :cond_6
    sget-object v0, Lc0/k1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_11

    :cond_7
    :try_start_6
    invoke-static {v6, v8}, Lc0/k1;->i(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, v7, v5}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-virtual {v4, v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setDeclaredClass(Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    filled-new-array {v15, v15}, [Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v11, "handleQuoteMsgFillingFrom"

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v4}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-static {v4, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lc0/k1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception v0

    :try_start_9
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    instance-of v11, v0, LD0/f;

    if-eqz v11, :cond_9

    const/4 v0, 0x0

    :cond_9
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_a

    goto :goto_8

    :cond_a
    invoke-static {v0}, Lc0/k1;->f(Ljava/lang/reflect/Method;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "DexKit clearQuote: "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    const/4 v4, 0x0

    :try_start_a
    invoke-static {v2, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto/16 :goto_11

    :catchall_5
    move-exception v0

    goto/16 :goto_f

    :goto_a
    move-object v4, v0

    goto/16 :goto_e

    :catchall_6
    move-exception v0

    goto :goto_a

    :cond_b
    :try_start_b
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-virtual {v4, v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setDeclaredClass(Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    filled-new-array {v15, v15}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v9, "openim_card_type_name"

    const-string v11, "err_not_started"

    filled-new-array {v9, v11}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v4}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-static {v4, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_c
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :try_start_c
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lc0/k1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto :goto_c

    :catchall_7
    move-exception v0

    :try_start_d
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_c
    instance-of v9, v0, LD0/f;

    if-eqz v9, :cond_d

    const/4 v0, 0x0

    :cond_d
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_e

    goto :goto_b

    :cond_e
    invoke-static {v0}, Lc0/k1;->f(Ljava/lang/reflect/Method;)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "DexKit clearQuote alt: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    const/4 v4, 0x0

    :try_start_e
    invoke-static {v2, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_11

    :cond_f
    const/4 v4, 0x0

    invoke-static {v2, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_d

    :cond_10
    const/4 v4, 0x0

    :goto_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DexKit clearQuote not found, keep reflection="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    move-object v0, v10

    goto :goto_10

    :goto_e
    :try_start_f
    throw v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :catchall_8
    move-exception v0

    move-object v9, v0

    :try_start_10
    invoke-static {v2, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v9
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :goto_f
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_10
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "DexKit clearQuote fail: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    :cond_11
    :goto_11
    sget-object v0, Lc0/k1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_19

    :cond_12
    :try_start_11
    invoke-static {v6, v8}, Lc0/k1;->i(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, v7, v5}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    :try_start_12
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v6, "onKey"

    invoke-virtual {v4, v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setName(Ljava/lang/String;)V

    invoke-virtual {v4, v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    const/4 v6, 0x3

    invoke-virtual {v4, v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setParamCount(I)V

    const-string v6, "ChatFooterKtHelper"

    const-string v8, "supportAutoComplete err"

    filled-new-array {v6, v8}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v4}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-static {v4, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v14}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    :try_start_13
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lc0/k1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    goto :goto_13

    :catchall_9
    move-exception v0

    :try_start_14
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_13
    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_13

    const/4 v0, 0x0

    :cond_13
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_15

    const/4 v8, 0x2

    const/4 v9, 0x0

    :cond_14
    :goto_14
    const/4 v11, 0x3

    goto :goto_12

    :cond_15
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v8, v6

    const/4 v9, 0x3

    if-ne v8, v9, :cond_17

    const-class v8, Landroid/view/View;

    const/4 v9, 0x0

    aget-object v11, v6, v9

    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_16

    const/4 v8, 0x2

    aget-object v6, v6, v8

    const-class v11, Landroid/view/KeyEvent;

    invoke-static {v6, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    new-instance v6, Lc0/i1;

    const/4 v11, 0x3

    invoke-direct {v6, v11}, Lc0/i1;-><init>(I)V

    invoke-static {v0, v6}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v3, v5

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "onKey hooked: "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    goto :goto_12

    :goto_15
    move-object v3, v0

    goto :goto_16

    :catchall_a
    move-exception v0

    goto :goto_15

    :cond_16
    const/4 v8, 0x2

    goto :goto_14

    :cond_17
    move v11, v9

    const/4 v8, 0x2

    const/4 v9, 0x0

    goto/16 :goto_12

    :cond_18
    if-nez v3, :cond_19

    const-string v0, "onKey DexKit: no method"

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    :cond_19
    const/4 v3, 0x0

    :try_start_15
    invoke-static {v2, v3}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    move-object v0, v10

    goto :goto_18

    :catchall_b
    move-exception v0

    goto :goto_17

    :goto_16
    :try_start_16
    throw v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    :catchall_c
    move-exception v0

    move-object v4, v0

    :try_start_17
    invoke-static {v2, v3}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    :goto_17
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_18
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onKey DexKit fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k1;->m(Ljava/lang/String;)V

    :cond_1a
    :goto_19
    return-object v10
.end method

.method private final h()Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    const-string v0, "execSQL"

    const-string v2, "rawQuery"

    const-string v3, "update"

    iget-object v4, v1, Lf0/X;->d:Ljava/lang/String;

    iget-object v5, v1, Lf0/X;->b:Landroid/content/Context;

    const-string v6, "$ctx"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    const-string v7, "$cl"

    invoke-static {v6, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lc0/k;->a:Lc0/k;

    sget-object v8, Lc0/k;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_c

    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "install requested from "

    invoke-virtual {v11, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc0/k;->k(Ljava/lang/String;)V

    const-string v8, "com.tencent.mm.plugin.sns.storage.SnsSqliteDB"

    const-string v11, "DexKit installed "

    sget-object v12, Lc0/k;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v12, v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v12

    const-string v13, "delete"

    const/4 v14, 0x0

    if-nez v12, :cond_1

    move v0, v9

    goto/16 :goto_5

    :cond_1
    :try_start_0
    invoke-static {v5, v4}, Lc0/k;->i(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v4, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v4, v6, v10}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    filled-new-array {v8, v3}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v12, Lc0/h;

    const/4 v15, 0x0

    invoke-direct {v12, v15}, Lc0/h;-><init>(I)V

    invoke-static {v4, v6, v5, v3, v12}, Lc0/k;->f(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v3

    filled-new-array {v8, v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v12, Lc0/h;

    const/4 v15, 0x1

    invoke-direct {v12, v15}, Lc0/h;-><init>(I)V

    invoke-static {v4, v6, v5, v2, v12}, Lc0/k;->f(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v2

    add-int/2addr v3, v2

    filled-new-array {v8, v0}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, Lc0/h;

    const/4 v12, 0x2

    invoke-direct {v5, v12}, Lc0/h;-><init>(I)V

    invoke-static {v4, v6, v2, v0, v5}, Lc0/k;->f(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v0

    add-int/2addr v3, v0

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lc0/h;

    const/4 v5, 0x3

    invoke-direct {v2, v5}, Lc0/h;-><init>(I)V

    invoke-static {v4, v6, v0, v13, v2}, Lc0/k;->f(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v0

    add-int/2addr v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " sns db hooks"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k;->k(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez v3, :cond_2

    move v0, v10

    goto :goto_0

    :cond_2
    move v0, v9

    :goto_0
    :try_start_2
    invoke-static {v4, v14}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :goto_1
    move-object v2, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1

    :goto_2
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-static {v4, v2}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_4
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DexKit setup failed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_4

    move-object v0, v2

    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_5
    if-nez v0, :cond_e

    :try_start_5
    const-string v0, "com.tencent.mm.plugin.sns.storage.n2"

    invoke-static {v6, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_5

    goto :goto_7

    :cond_5
    move-object v14, v0

    :goto_7
    check-cast v14, Ljava/lang/Class;

    if-nez v14, :cond_6

    const-string v0, "static fallback class n2 not found"

    invoke-static {v0}, Lc0/k;->k(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_6
    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v2, "getDeclaredMethods(...)"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    move v3, v9

    move v4, v3

    :goto_8
    if-ge v3, v2, :cond_d

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v8, v6

    const/4 v11, 0x4

    const-string v15, "static:"

    const-class v12, Ljava/lang/String;

    if-ne v8, v11, :cond_7

    aget-object v8, v6, v9

    invoke-static {v8, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    aget-object v8, v6, v10

    const-class v11, Landroid/content/ContentValues;

    invoke-static {v8, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v8, 0x2

    aget-object v11, v6, v8

    invoke-static {v11, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v8, 0x3

    aget-object v11, v6, v8

    const-class v8, [Ljava/lang/String;

    invoke-static {v11, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6, v5}, Lc0/k;->h(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_9
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_b

    :cond_7
    array-length v8, v6

    if-nez v8, :cond_8

    move v8, v10

    goto :goto_a

    :cond_8
    move v8, v9

    :goto_a
    xor-int/2addr v8, v10

    if-eqz v8, :cond_9

    aget-object v8, v6, v9

    invoke-static {v8, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "Cursor"

    invoke-static {v8, v11, v9}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lc0/k;->g(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_9

    :cond_9
    array-length v8, v6

    const/4 v11, 0x2

    if-ne v8, v11, :cond_b

    aget-object v8, v6, v9

    invoke-static {v8, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    aget-object v8, v6, v10

    invoke-static {v8, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6, v5}, Lc0/k;->e(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_9

    :cond_b
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    array-length v8, v6

    const/4 v11, 0x3

    if-ne v8, v11, :cond_c

    aget-object v6, v6, v9

    invoke-static {v6, v12}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    const-string v6, "static:delete"

    invoke-virtual {v7, v6, v5}, Lc0/k;->d(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_9

    :cond_c
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_8

    :cond_d
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "static fallback installed "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " hooks on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/k;->k(Ljava/lang/String;)V

    :cond_e
    :goto_c
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method

.method private final i()Ljava/lang/Object;
    .locals 15

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "setCommentDelFlag"

    iget-object v3, p0, Lf0/X;->d:Ljava/lang/String;

    iget-object v4, p0, Lf0/X;->b:Landroid/content/Context;

    const-string v5, "$ctx"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lf0/X;->c:Ljava/lang/ClassLoader;

    const-string v6, "$cl"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/g;->a:Lc0/g;

    const-string v6, "com.tencent.mm.plugin.sns.storage.SnsComment"

    sget-object v7, Lc0/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-static {}, Lc0/g;->j()Z

    move-result v7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "install enabled="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc0/g;->r(Ljava/lang/String;)V

    const-string v7, "com.tencent.mm.plugin.sns.storage.SnsCommentStorage"

    const/4 v9, 0x0

    :try_start_0
    invoke-static {v4, v3}, Lc0/g;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v10, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v10, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v11, "deleteComment"

    filled-new-array {v11, v7}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v12, "SnsCommentStorage.deleteComment"

    new-instance v13, Lc0/a;

    const/4 v14, 0x5

    invoke-direct {v13, v14}, Lc0/a;-><init>(I)V

    invoke-static {v10, v5, v11, v12, v13}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v11

    const-string v12, "deleteBySnsId"

    filled-new-array {v12, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v12, "SnsCommentStorage.deleteBySnsId"

    new-instance v13, Lc0/a;

    const/4 v14, 0x6

    invoke-direct {v13, v14}, Lc0/a;-><init>(I)V

    invoke-static {v10, v5, v7, v12, v13}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/2addr v11, v7

    :try_start_2
    invoke-static {v10, v9}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v7

    goto :goto_0

    :catchall_1
    move-exception v7

    :try_start_3
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v11

    :try_start_4
    invoke-static {v10, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {v7}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v7

    :goto_1
    invoke-static {v7}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    sget-object v11, Lc0/g;->a:Lc0/g;

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "SnsCommentStorage DexKit fail: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_1
    instance-of v10, v7, LD0/f;

    if-eqz v10, :cond_2

    move-object v7, v8

    :cond_2
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    :try_start_5
    invoke-static {v4, v3}, Lc0/g;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v10, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v10, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    filled-new-array {v2, v6}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    new-instance v12, Lc0/a;

    invoke-direct {v12, v1}, Lc0/a;-><init>(I)V

    invoke-static {v10, v5, v11, v2, v12}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-static {v10, v9}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    goto :goto_2

    :catchall_4
    move-exception v1

    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v2

    :try_start_9
    invoke-static {v10, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :goto_2
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_3
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "setCommentDelFlag fail: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_3
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_4

    move-object v1, v8

    :cond_4
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, v7

    :try_start_a
    invoke-static {v4, v3}, Lc0/g;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v2, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :try_start_b
    const-string v7, "convertFrom"

    filled-new-array {v7, v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v7, "SnsComment.convertFrom"

    new-instance v10, Lc0/a;

    const/4 v11, 0x4

    invoke-direct {v10, v11}, Lc0/a;-><init>(I)V

    invoke-static {v2, v5, v6, v7, v10}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :try_start_c
    invoke-static {v2, v9}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception v2

    goto :goto_4

    :catchall_7
    move-exception v6

    :try_start_d
    throw v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :catchall_8
    move-exception v7

    :try_start_e
    invoke-static {v2, v6}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v7
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :goto_4
    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_5
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "convertFrom fail: "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_5
    instance-of v6, v2, LD0/f;

    if-eqz v6, :cond_6

    move-object v2, v8

    :cond_6
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/2addr v2, v1

    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsSqliteDB"

    :try_start_f
    invoke-static {v4, v3}, Lc0/g;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v6, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v6, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v6
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    :try_start_10
    const-string v7, "execSQL"

    filled-new-array {v1, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v10, "SnsSqliteDB.execSQL"

    new-instance v11, Lc0/a;

    invoke-direct {v11, v0}, Lc0/a;-><init>(I)V

    invoke-static {v6, v5, v7, v10, v11}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v7

    const-string v10, "MicroMsg.SnsCommentStorage"

    const-string v11, "set sns del"

    filled-new-array {v10, v11}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v11, "setCommentDeleted"

    new-instance v12, Lc0/a;

    const/4 v13, 0x2

    invoke-direct {v12, v13}, Lc0/a;-><init>(I)V

    invoke-static {v6, v5, v10, v11, v12}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v10

    add-int/2addr v7, v10

    const-string v10, "update"

    filled-new-array {v1, v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v10, "SnsSqliteDB.update"

    new-instance v11, Lc0/a;

    const/4 v12, 0x3

    invoke-direct {v11, v12}, Lc0/a;-><init>(I)V

    invoke-static {v6, v5, v1, v10, v11}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    add-int/2addr v7, v1

    :try_start_11
    invoke-static {v6, v9}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception v1

    goto :goto_6

    :catchall_a
    move-exception v1

    :try_start_12
    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    :catchall_b
    move-exception v7

    :try_start_13
    invoke-static {v6, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v7
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    :goto_6
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_7
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "execSQL safety fail: "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_7
    instance-of v6, v1, LD0/f;

    if-eqz v6, :cond_8

    move-object v1, v8

    :cond_8
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, v2

    :try_start_14
    invoke-static {v4, v3}, Lc0/g;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v2, v5, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :try_start_15
    const-string v2, "setAttrBuf"

    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "SnsInfo.setAttrBuf"

    new-instance v4, Lc0/b;

    invoke-direct {v4, v5}, Lc0/b;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {v0, v5, v2, v3, v4}, Lc0/g;->h(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;LP0/l;)I

    move-result v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    :try_start_16
    invoke-static {v0, v9}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    goto :goto_9

    :catchall_c
    move-exception v0

    goto :goto_8

    :catchall_d
    move-exception v2

    :try_start_17
    throw v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    :catchall_e
    move-exception v3

    :try_start_18
    invoke-static {v0, v2}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    :goto_8
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "setAttrBuf merge fail: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_9
    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_a

    goto :goto_a

    :cond_a
    move-object v8, v0

    :goto_a
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "install done hooks="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/g;->r(Ljava/lang/String;)V

    sget-object v1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u64a4\u56de\u5df2\u5b89\u88c5 hooks="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    :goto_b
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method

.method private final j()Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x1

    iget-object v1, p0, Lf0/X;->b:Landroid/content/Context;

    iget-object v2, p0, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v3, p0, Lf0/X;->d:Ljava/lang/String;

    const-string v4, "$ctx"

    invoke-static {v1, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$cl"

    invoke-static {v2, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/q1;->a:Lc0/q1;

    sget-object v4, Lc0/q1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v4

    sget-object v6, LD0/l;->a:LD0/l;

    if-nez v4, :cond_0

    goto/16 :goto_10

    :cond_0
    sput-object v2, Lc0/q1;->p:Ljava/lang/ClassLoader;

    const-string v4, "substring(...)"

    const-string v7, "/storage/emulated/0/Android/media/com.tencent.mm/OKK/real_names.json"

    invoke-static {v7}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    sget-object v9, Lc0/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    :try_start_0
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_1

    sget-object v8, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v10, v8}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v10, "{"

    invoke-static {v8, v10, v5}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_3

    new-instance v10, LW0/g;

    const-string v11, "\"([^\"]+)\"\\s*:\\s*\"([^\"]*)\""

    invoke-direct {v10, v11}, LW0/g;-><init>(Ljava/lang/String;)V

    invoke-static {v10, v8}, LW0/g;->a(LW0/g;Ljava/lang/String;)LN0/i;

    move-result-object v8

    new-instance v10, LV0/g;

    invoke-direct {v10, v8}, LV0/g;-><init>(LN0/i;)V

    :cond_2
    :goto_1
    invoke-virtual {v10}, LV0/g;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v10}, LV0/g;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW0/d;

    invoke-virtual {v8}, LW0/d;->a()Ljava/util/List;

    move-result-object v11

    check-cast v11, LE0/z;

    invoke-virtual {v11, v0}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v8}, LW0/d;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, LE0/z;

    const/4 v12, 0x2

    invoke-virtual {v8, v12}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_2

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_2

    invoke-virtual {v9, v11, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v8

    goto :goto_3

    :cond_3
    invoke-static {v8}, LW0/j;->S0(Ljava/lang/CharSequence;)LV0/f;

    move-result-object v8

    iget-object v10, v8, LV0/f;->b:LV0/h;

    invoke-interface {v10}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, v8, LV0/f;->c:LP0/l;

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v11, v12}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const/16 v12, 0x3d

    const/4 v13, 0x6

    invoke-static {v11, v12, v5, v5, v13}, LW0/j;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v12

    if-lez v12, :cond_4

    invoke-virtual {v11, v5, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    add-int/2addr v12, v0

    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_4

    invoke-virtual {v9, v13, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_3
    invoke-static {v8}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v0

    if-eqz v4, :cond_6

    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "cache loaded size="

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc0/q1;->s(Ljava/lang/String;)V

    :cond_6
    invoke-static {}, Lc0/q1;->g()Z

    move-result v4

    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v5

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "install enabled="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " cache="

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc0/q1;->s(Ljava/lang/String;)V

    const-string v4, "com.tencent.mm.plugin.remittance.model.i"

    const-string v5, "com.tencent.mm.plugin.remittance.model.NetSceneBeforeTransfer"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    :try_start_1
    invoke-virtual {v2, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v8

    invoke-static {v8}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v8

    :goto_5
    instance-of v9, v8, LD0/f;

    if-eqz v9, :cond_8

    move-object v8, v7

    :cond_8
    check-cast v8, Ljava/lang/Class;

    if-nez v8, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v8}, Lc0/q1;->r(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "scene="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V

    invoke-static {v8}, Lc0/q1;->e(Ljava/lang/Class;)V

    invoke-static {v2}, Lc0/q1;->p(Ljava/lang/ClassLoader;)V

    goto/16 :goto_b

    :cond_a
    :try_start_2
    invoke-static {v1, v3}, Lc0/q1;->i(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    new-instance v1, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    const-string v4, "/cgi-bin/mmpay-bin/beforetransfer"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v3, "iterator(...)"

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez v3, :cond_c

    goto :goto_6

    :cond_c
    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v4

    :try_start_5
    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v4

    :goto_7
    instance-of v5, v4, LD0/f;

    if-eqz v5, :cond_d

    move-object v4, v7

    :cond_d
    check-cast v4, Ljava/lang/Class;

    if-nez v4, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v4}, Lc0/q1;->r(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scene dexkit="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/q1;->s(Ljava/lang/String;)V

    invoke-static {v4}, Lc0/q1;->e(Ljava/lang/Class;)V

    invoke-static {v2}, Lc0/q1;->p(Ljava/lang/ClassLoader;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-static {v0, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_b

    :catchall_3
    move-exception v0

    goto :goto_9

    :catchall_4
    move-exception v1

    goto :goto_8

    :cond_f
    invoke-static {v0, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string v0, "beforetransfer scene NOT found"

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v0, v6

    goto :goto_a

    :goto_8
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :catchall_5
    move-exception v3

    :try_start_8
    invoke-static {v0, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_9
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_a
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    sget-object v1, Lc0/q1;->a:Lc0/q1;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "resolve scene: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V

    :cond_10
    :goto_b
    :try_start_9
    const-string v0, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    invoke-static {v2, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_c

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_c
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_11

    goto :goto_d

    :cond_11
    move-object v7, v0

    :goto_d
    check-cast v7, Ljava/lang/Class;

    if-nez v7, :cond_12

    goto :goto_10

    :cond_12
    :try_start_a
    const-string v0, "initView"

    new-instance v1, Lc0/f;

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lc0/f;-><init>(Ljava/lang/ClassLoader;I)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v0, v1}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_e

    :catchall_7
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_e
    :try_start_b
    const-string v0, "com.tencent.mm.ui.base.preference.r"

    invoke-static {v2, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "com.tencent.mm.ui.base.preference.Preference"

    invoke-static {v2, v1}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "onPreferenceTreeClick"

    new-instance v3, Lc0/m;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lc0/m;-><init>(I)V

    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7, v2, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_f

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_f
    const-string v0, "profile page hooked"

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V

    :goto_10
    return-object v6
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    const-string v2, ": "

    const-string v4, "DexKit fail: "

    const/4 v5, 0x6

    const-class v6, Ljava/lang/String;

    const-string v0, "install enabled="

    const/4 v7, 0x0

    const-string v8, "$cl"

    const-string v9, "$ctx"

    const/4 v10, 0x0

    const/4 v11, 0x1

    iget v12, v1, Lf0/X;->a:I

    packed-switch v12, :pswitch_data_0

    iget-object v2, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v3, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v12, v1, Lf0/X;->d:Ljava/lang/String;

    invoke-static {v2, v9}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v8}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lc0/N0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v8, v10, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v8

    sget-object v9, LD0/l;->a:LD0/l;

    if-nez v8, :cond_0

    goto/16 :goto_a

    :cond_0
    sput-object v3, Lc0/N0;->i:Ljava/lang/ClassLoader;

    invoke-static {}, Lc0/N0;->e()Z

    move-result v8

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N0;->k(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v2, v12}, Lc0/N0;->f(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, v3, v11}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v8, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v12, "MicroMsg.ChatRoomMember"

    const-string v13, "getChatroomData hashMap is null!"

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-string v0, "iterator(...)"

    invoke-static {v8, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v12, "#"

    if-eqz v0, :cond_4

    :try_start_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v13, "next(...)"

    invoke-static {v0, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lc0/N0;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    instance-of v13, v0, LD0/f;

    if-eqz v13, :cond_2

    move-object v0, v7

    :cond_2
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    array-length v13, v13

    if-ne v13, v11, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    aget-object v13, v13, v10

    invoke-static {v13, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v0, Lc0/N0;->f:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "getChatroomData="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N0;->k(Ljava/lang/String;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    goto/16 :goto_7

    :cond_4
    :goto_2
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v8, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v13, "MicroMsg.ChatroomStorage"

    const-string v14, "[getMemberCount] cost:%sms"

    filled-new-array {v13, v14}, [Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v13}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v0, :cond_6

    :try_start_5
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v8

    const-string v13, "->"

    invoke-static {v8, v13, v10, v10, v5}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v5

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    sub-int/2addr v5, v11

    invoke-virtual {v0, v11, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v5, "substring(...)"

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x2f

    const/16 v8, 0x2e

    invoke-static {v0, v5, v8}, LW0/r;->G0(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_3
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_5

    move-object v0, v7

    :cond_5
    check-cast v0, Ljava/lang/Class;

    goto :goto_4

    :cond_6
    move-object v0, v7

    :goto_4
    sget-object v5, Lc0/N0;->f:Ljava/lang/reflect/Method;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_5

    :cond_7
    move-object v5, v7

    :goto_5
    if-eqz v0, :cond_a

    if-eqz v5, :cond_a

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-static {v8}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v8

    :cond_8
    invoke-virtual {v8}, LE0/c;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v8}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/reflect/Method;

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v14, v14

    if-ne v14, v11, :cond_8

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    aget-object v14, v14, v10

    invoke-static {v14, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-virtual {v13, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v13, Lc0/N0;->g:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getGroup="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " -> "

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lc0/N0;->k(Ljava/lang/String;)V

    :cond_9
    invoke-static {v3, v0}, Lc0/N0;->i(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_a
    :try_start_7
    invoke-static {v2, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v0, Lc0/N0;->f:Ljava/lang/reflect/Method;

    if-nez v0, :cond_b

    const-string v0, "getChatroomData not found"

    invoke-static {v0}, Lc0/N0;->k(Ljava/lang/String;)V

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_8

    :cond_b
    :goto_6
    sget-object v0, Lc0/N0;->g:Ljava/lang/reflect/Method;

    if-nez v0, :cond_c

    const-string v0, "getGroup not found"

    invoke-static {v0}, Lc0/N0;->k(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :cond_c
    move-object v0, v9

    goto :goto_9

    :goto_7
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move-object v5, v0

    :try_start_9
    invoke-static {v2, v3}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :goto_8
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_d

    sget-object v2, Lc0/N0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N0;->k(Ljava/lang/String;)V

    :cond_d
    :goto_a
    return-object v9

    :pswitch_0
    invoke-direct/range {p0 .. p0}, Lf0/X;->j()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p0}, Lf0/X;->i()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p0}, Lf0/X;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p0}, Lf0/X;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct/range {p0 .. p0}, Lf0/X;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-direct/range {p0 .. p0}, Lf0/X;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-direct/range {p0 .. p0}, Lf0/X;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct/range {p0 .. p0}, Lf0/X;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v12, v1, Lf0/X;->b:Landroid/content/Context;

    iget-object v13, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    iget-object v14, v1, Lf0/X;->d:Ljava/lang/String;

    invoke-static {v12, v9}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v8}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lc0/w1;->a:Lc0/w1;

    sget-object v0, Lc0/w1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v10, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    sget-object v9, LD0/l;->a:LD0/l;

    if-nez v0, :cond_e

    move-object/from16 v21, v9

    goto/16 :goto_27

    :cond_e
    sget-object v0, Lc0/v1;->b:Lc0/x1;

    const-wide/16 v15, 0x0

    sput-wide v15, Lc0/v1;->a:J

    sget-object v0, Lc0/b1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v15, v0, Lc0/x1;->a:Z

    iget v7, v0, Lc0/x1;->b:F

    iget-object v0, v0, Lc0/x1;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "install v1 enabled="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " radius="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, " src="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V

    const-string v0, "com.tencent.mm.pluginsdk.ui.u"

    invoke-static {v13, v0}, Lc0/w1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v5, "getDeclaredMethods(...)"

    if-nez v3, :cond_f

    move/from16 v17, v10

    goto/16 :goto_11

    :cond_f
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v15, v0

    move/from16 v17, v10

    :goto_b
    if-ge v10, v15, :cond_12

    aget-object v7, v0, v10

    invoke-static {v7}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v7}, Lc0/w1;->f(Ljava/lang/reflect/Method;)Z

    move-result v18

    if-eqz v18, :cond_11

    sput-object v7, Lc0/w1;->e:Ljava/lang/reflect/Method;

    const-string v11, "u.b"

    invoke-virtual {v8, v11, v7}, Lc0/w1;->e(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v7

    if-eqz v7, :cond_10

    const/4 v7, 0x1

    add-int/lit8 v17, v17, 0x1

    goto :goto_c

    :cond_10
    const/4 v7, 0x1

    goto :goto_c

    :cond_11
    move v7, v11

    :goto_c
    add-int/2addr v10, v7

    move v11, v7

    goto :goto_b

    :cond_12
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v7, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v10, v7

    const/4 v11, 0x0

    :goto_d
    if-ge v11, v10, :cond_17

    aget-object v0, v7, v11

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v15

    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v15

    if-nez v15, :cond_13

    move-object/from16 v19, v7

    move/from16 v20, v10

    goto :goto_f

    :cond_13
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v19, v7

    array-length v7, v15

    move/from16 v20, v10

    const/4 v10, 0x2

    if-ne v7, v10, :cond_15

    const-class v7, Landroid/widget/ImageView;

    const/4 v10, 0x0

    aget-object v1, v15, v10

    invoke-virtual {v7, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, 0x1

    aget-object v7, v15, v1

    invoke-static {v7, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    const-string v7, "u.a"

    const-string v10, "hooked "

    :try_start_a
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v1, Lc0/d;

    invoke-direct {v1, v3}, Lc0/d;-><init>(Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_e

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_e
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v7, v0, LD0/f;

    if-eqz v7, :cond_14

    move-object v0, v1

    :cond_14
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v1, 0x1

    add-int/lit8 v17, v17, 0x1

    goto :goto_10

    :cond_15
    :goto_f
    const/4 v1, 0x1

    :cond_16
    :goto_10
    add-int/2addr v11, v1

    move-object/from16 v1, p0

    move-object/from16 v7, v19

    move/from16 v10, v20

    goto :goto_d

    :cond_17
    :goto_11
    const-string v0, "com.tencent.mm.pluginsdk.ui.x"

    invoke-static {v13, v0}, Lc0/w1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v3, Ljava/lang/Float;

    if-nez v1, :cond_18

    move-object/from16 v21, v9

    const/4 v15, 0x0

    goto/16 :goto_17

    :cond_18
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v7

    const-string v0, "getDeclaredConstructors(...)"

    invoke-static {v7, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v10, v7

    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_12
    if-ge v11, v10, :cond_1b

    aget-object v0, v7, v11

    move-object/from16 v19, v7

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    move/from16 v20, v10

    array-length v10, v7

    move-object/from16 v21, v9

    const/4 v9, 0x2

    if-ne v10, v9, :cond_1a

    const/4 v9, 0x0

    aget-object v10, v7, v9

    invoke-static {v10, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    const/4 v9, 0x1

    aget-object v10, v7, v9

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    const/4 v9, 0x1

    aget-object v7, v7, v9

    invoke-static {v7, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    goto :goto_13

    :cond_19
    const/4 v9, 0x1

    :goto_13
    :try_start_b
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v7, Lc0/j;

    const/16 v10, 0x1d

    invoke-direct {v7, v10}, Lc0/j;-><init>(I)V

    invoke-static {v0, v7}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v15, v9

    const-string v0, "hooked drawable ctor"

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :cond_1a
    :goto_14
    const/4 v7, 0x1

    goto :goto_15

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_14

    :goto_15
    add-int/2addr v11, v7

    move-object/from16 v7, v19

    move/from16 v10, v20

    move-object/from16 v9, v21

    goto :goto_12

    :cond_1b
    move-object/from16 v21, v9

    :try_start_c
    const-string v0, "draw"

    const-class v6, Landroid/graphics/Canvas;

    new-instance v7, Lc0/m;

    const/4 v9, 0x6

    invoke-direct {v7, v9}, Lc0/m;-><init>(I)V

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1, v0, v6}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const/4 v1, 0x1

    add-int/2addr v15, v1

    const-string v0, "hooked drawable.draw"

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    move-object/from16 v0, v21

    goto :goto_16

    :catchall_7
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_16
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "drawable.draw skip: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V

    :cond_1c
    :goto_17
    add-int v17, v17, v15

    const-string v1, "com.tencent.mm.sdk.platformtools.x"

    invoke-static {v13, v1}, Lc0/w1;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v7, Landroid/graphics/Bitmap;

    if-nez v0, :cond_1d

    move-object/from16 v22, v2

    const/4 v5, 0x1

    const/4 v11, 0x0

    goto/16 :goto_1e

    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-static {v9, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_18
    if-ge v10, v5, :cond_27

    aget-object v0, v9, v10

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    array-length v6, v15

    move/from16 v19, v5

    const/4 v5, 0x3

    move-object/from16 v20, v9

    const-class v9, Ljava/lang/Boolean;

    if-ne v6, v5, :cond_20

    const/4 v5, 0x0

    aget-object v6, v15, v5

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    const/4 v5, 0x1

    aget-object v6, v15, v5

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    const/4 v5, 0x1

    aget-object v6, v15, v5

    invoke-static {v6, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    :cond_1e
    const/4 v5, 0x2

    aget-object v6, v15, v5

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    const/4 v5, 0x2

    aget-object v6, v15, v5

    invoke-static {v6, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    :cond_1f
    const/4 v5, 0x1

    goto :goto_19

    :cond_20
    const/4 v5, 0x0

    :goto_19
    array-length v6, v15

    move-object/from16 v22, v2

    const/4 v2, 0x4

    if-lt v6, v2, :cond_22

    const/4 v2, 0x0

    aget-object v6, v15, v2

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 v2, 0x1

    aget-object v6, v15, v2

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    const/4 v2, 0x1

    aget-object v6, v15, v2

    invoke-static {v6, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    :cond_21
    const/4 v2, 0x2

    goto :goto_1a

    :cond_22
    const/4 v2, 0x2

    goto :goto_1b

    :goto_1a
    aget-object v6, v15, v2

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_23

    aget-object v6, v15, v2

    invoke-static {v6, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_24

    :cond_23
    const/4 v6, 0x1

    goto :goto_1c

    :cond_24
    :goto_1b
    const/4 v6, 0x0

    :goto_1c
    if-nez v5, :cond_25

    if-eqz v6, :cond_26

    :cond_25
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    const/4 v5, 0x1

    :try_start_d
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v6, Lc0/u;

    const/4 v9, 0x5

    invoke-direct {v6, v9, v0}, Lc0/u;-><init>(ILjava/lang/reflect/Method;)V

    invoke-static {v0, v6}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v11, v5

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toString(...)"

    invoke-static {v5, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "hooked BitmapUtil."

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_1d

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_26
    :goto_1d
    const/4 v5, 0x1

    add-int/2addr v10, v5

    move/from16 v5, v19

    move-object/from16 v9, v20

    move-object/from16 v2, v22

    goto/16 :goto_18

    :cond_27
    move-object/from16 v22, v2

    const/4 v5, 0x1

    :goto_1e
    add-int v17, v17, v11

    :try_start_e
    invoke-static {v12, v14}, Lc0/w1;->g(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, v13, v5}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    :try_start_f
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v5, "MicroMsg.AvatarDrawable"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const/4 v5, 0x4

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :cond_28
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    :try_start_10
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Lc0/w1;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    goto :goto_20

    :catchall_9
    move-exception v0

    :try_start_11
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_20
    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_29

    const/4 v0, 0x0

    :cond_29
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_2a

    goto :goto_1f

    :cond_2a
    invoke-static {v0}, Lc0/w1;->f(Ljava/lang/reflect/Method;)Z

    move-result v6

    if-eqz v6, :cond_28

    sput-object v0, Lc0/w1;->e:Ljava/lang/reflect/Method;

    const-string v6, "DexKit.b"

    invoke-virtual {v8, v6, v0}, Lc0/w1;->e(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    move-result v0

    if-eqz v0, :cond_28

    const/4 v6, 0x1

    add-int/2addr v5, v6

    goto :goto_1f

    :catchall_a
    move-exception v0

    move-object v1, v0

    goto/16 :goto_23

    :cond_2b
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    const-string v6, "getRoundedCornerBitmap in bitmap is null"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const/4 v6, 0x5

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2c
    :goto_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    :try_start_12
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Lc0/w1;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    goto :goto_22

    :catchall_b
    move-exception v0

    :try_start_13
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_22
    instance-of v6, v0, LD0/f;

    if-eqz v6, :cond_2d

    const/4 v0, 0x0

    :cond_2d
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_2e

    goto :goto_21

    :cond_2e
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2c

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    if-eqz v6, :cond_2c

    const/4 v6, 0x1

    :try_start_14
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v8, Lc0/j;

    const/16 v9, 0x1c

    const/4 v10, 0x0

    invoke-direct {v8, v9, v10}, Lc0/j;-><init>(IZ)V

    invoke-static {v0, v8}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v5, v6

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "hooked DexKit BitmapUtil "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "."

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    goto :goto_21

    :catchall_c
    move-exception v0

    :try_start_15
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    goto :goto_21

    :cond_2f
    const/4 v1, 0x0

    :try_start_16
    invoke-static {v2, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    goto :goto_25

    :catchall_d
    move-exception v0

    goto :goto_24

    :goto_23
    :try_start_17
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    :catchall_e
    move-exception v0

    move-object v3, v0

    :try_start_18
    invoke-static {v2, v1}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :goto_24
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_25
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_30

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v22

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/w1;->i(Ljava/lang/String;)V

    :cond_30
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_31

    move-object v0, v2

    :cond_31
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int v0, v0, v17

    sget-object v1, Lc0/w1;->e:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_32

    const/4 v10, 0x1

    goto :goto_26

    :cond_32
    const/4 v10, 0x0

    :goto_26
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "done hooks="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " methodB="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w1;->i(Ljava/lang/String;)V

    :goto_27
    return-object v21

    :pswitch_9
    invoke-direct/range {p0 .. p0}, Lf0/X;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v3, v1, Lf0/X;->d:Ljava/lang/String;

    iget-object v4, v1, Lf0/X;->b:Landroid/content/Context;

    invoke-static {v4, v9}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lf0/X;->c:Ljava/lang/ClassLoader;

    invoke-static {v5, v8}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/N1;->a:Lc0/N1;

    sget-object v7, Lc0/N1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v7

    sget-object v8, LD0/l;->a:LD0/l;

    if-nez v7, :cond_33

    goto/16 :goto_2f

    :cond_33
    sget-object v7, Lc0/L1;->a:Lc0/L1;

    invoke-static {v7}, Lc0/L1;->e(Lc0/L1;)LD0/i;

    move-result-object v7

    iget-object v7, v7, LD0/i;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N1;->f(Ljava/lang/String;)V

    sget-object v0, Lc0/N1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v7, 0x1

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_34

    goto :goto_29

    :cond_34
    :try_start_19
    const-class v0, Landroid/location/Location;

    invoke-static {v0}, Lc0/N1;->b(Ljava/lang/Class;)V

    const-string v0, "hooked android.location.Location getters"

    invoke-static {v0}, Lc0/N1;->f(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    move-object v0, v8

    goto :goto_28

    :catchall_f
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_28
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_35

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "android.location.Location hook failed: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N1;->f(Ljava/lang/String;)V

    :cond_35
    :goto_29
    const-string v0, "MicroMsg.DefaultTencentLocationManager"

    sget-object v7, Lc0/N1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v7

    if-nez v7, :cond_36

    goto/16 :goto_2f

    :cond_36
    :try_start_1a
    invoke-static {v4, v3}, Lc0/N1;->d(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v3, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v3, v5, v9}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_11

    :try_start_1b
    const-string v4, "MicroMsg.SLocationListener"

    const-string v7, "MicroMsg.SLocationListenerWgs84"

    filled-new-array {v4, v7, v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_37

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v3, v5, v7, v9}, Lc0/N1;->c(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    add-int/2addr v10, v7

    goto :goto_2a

    :goto_2b
    move-object v4, v0

    goto :goto_2c

    :catchall_10
    move-exception v0

    goto :goto_2b

    :cond_37
    const-string v4, "DefaultTencentLocationManager"

    const-string v7, "[mlocationListener]error:%d, reason:%s"

    filled-new-array {v0, v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v3, v5, v4, v0}, Lc0/N1;->c(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v10, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DexKit onLocationChanged hooks: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N1;->f(Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    const/4 v4, 0x0

    :try_start_1c
    invoke-static {v3, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    move-object v0, v8

    goto :goto_2e

    :catchall_11
    move-exception v0

    goto :goto_2d

    :goto_2c
    :try_start_1d
    throw v4
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_12

    :catchall_12
    move-exception v0

    move-object v5, v0

    :try_start_1e
    invoke-static {v3, v4}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_11

    :goto_2d
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2e
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_38

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DexKit setup failed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/N1;->f(Ljava/lang/String;)V

    :cond_38
    :goto_2f
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
