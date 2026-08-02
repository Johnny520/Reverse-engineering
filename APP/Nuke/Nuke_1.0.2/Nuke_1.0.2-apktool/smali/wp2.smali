.class public final Lwp2;
.super Lvj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lwp2;

.field public static final e:Ljava/lang/String;

.field public static final f:Z

.field public static final g:Lhx2;

.field public static final h:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwp2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwp2;->d:Lwp2;

    .line 8
    .line 9
    const-string v0, "SettingMenuInjector"

    .line 10
    .line 11
    sput-object v0, Lwp2;->e:Ljava/lang/String;

    .line 12
    .line 13
    sput-boolean v1, Lwp2;->f:Z

    .line 14
    .line 15
    new-instance v0, Lhn1;

    .line 16
    .line 17
    const/16 v1, 0x11

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lhx2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lwp2;->g:Lhx2;

    .line 28
    .line 29
    new-instance v0, Lhn1;

    .line 30
    .line 31
    const/16 v1, 0x12

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lhx2;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lwp2;->h:Lhx2;

    .line 42
    .line 43
    return-void
.end method

.method public static j()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lwp2;->g:Lhx2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    return-object v0
.end method

.method public static l()V
    .locals 82

    .line 1
    sget-object v0, Lqp2;->b:Lqp2;

    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    move-result-object v3

    .line 2
    sget-object v0, Lwp2;->g:Lhx2;

    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .line 4
    sget-object v1, Ltp2;->b:Ltp2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    :try_start_0
    invoke-virtual {v1}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v1, 0x0

    :goto_0
    const/4 v15, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_1

    :cond_0
    move v1, v15

    .line 6
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    array-length v4, v0

    move v5, v15

    :goto_2
    const-string v16, "Array contains no element matching the predicate."

    if-ge v5, v4, :cond_42

    aget-object v6, v0, v5

    .line 8
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v7

    if-nez v7, :cond_41

    .line 9
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/Class;

    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_41

    .line 10
    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_40

    :goto_3
    add-int/lit8 v5, v4, -0x1

    .line 11
    aget-object v4, v0, v4

    .line 12
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v7

    if-nez v7, :cond_3f

    .line 13
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3f

    .line 14
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eqz v1, :cond_3

    .line 15
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    :goto_4
    add-int/lit8 v7, v1, -0x1

    .line 16
    aget-object v1, v0, v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v8

    if-nez v8, :cond_1

    .line 18
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 19
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ltp2;->b:Ltp2;

    invoke-virtual {v9}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_6

    :cond_1
    if-ltz v7, :cond_2

    move v1, v7

    goto :goto_4

    .line 20
    :cond_2
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    .line 21
    :cond_3
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3e

    :goto_5
    add-int/lit8 v7, v1, -0x1

    .line 22
    aget-object v1, v0, v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v8

    if-nez v8, :cond_3d

    .line 24
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3d

    .line 25
    :goto_6
    array-length v7, v0

    move v8, v15

    :goto_7
    if-ge v8, v7, :cond_3c

    aget-object v9, v0, v8

    .line 26
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_3b

    .line 27
    new-instance v18, Lz70;

    .line 28
    sget-object v0, Lop2;->b:Lop2;

    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    move-result-object v0

    .line 29
    sget-object v7, Lrp2;->b:Lrp2;

    invoke-virtual {v7}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v7

    .line 30
    sget-object v8, Lpp2;->b:Lpp2;

    invoke-virtual {v8}, Lv70;->d()Ljava/lang/Class;

    move-result-object v8

    .line 31
    sget-object v10, Lvp2;->b:Lvp2;

    invoke-virtual {v10}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v10

    move-object v12, v4

    move-object v4, v7

    .line 32
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    sget-object v6, Ltp2;->b:Ltp2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    :try_start_1
    invoke-virtual {v6}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :catchall_1
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_4

    .line 35
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_9

    :cond_4
    const/4 v6, 0x0

    .line 36
    :goto_9
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    sget-object v13, Lup2;->b:Lup2;

    invoke-virtual {v13}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v11

    .line 38
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    sget-object v1, Lsp2;->b:Lsp2;

    invoke-virtual {v1}, Lv70;->e()Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v24, v2

    move-object v2, v0

    move/from16 v0, v24

    move-object/from16 v24, v5

    move-object v5, v8

    move-object v8, v6

    move-object v6, v10

    move-object v10, v13

    move-object v13, v1

    move-object/from16 v1, v18

    .line 41
    invoke-direct/range {v1 .. v13}, Lz70;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lz70;->m:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    sget-object v4, Lup0;->i:Landroid/content/Context;

    const-string v5, "hostContext"

    if-eqz v4, :cond_3a

    const v6, 0x790b0142

    .line 43
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 44
    sget-object v6, Lwp2;->d:Lwp2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    sget-object v6, Lwp2;->h:Lhx2;

    invoke-virtual {v6}, Lhx2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v19, v6

    check-cast v19, Ljava/lang/Class;

    .line 46
    new-instance v6, Lml2;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Lml2;-><init>(I)V

    .line 47
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    iget v7, v1, Lz70;->a:I

    add-int/lit8 v8, v7, -0x1

    iput v8, v1, Lz70;->a:I

    .line 49
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "Nuke"

    invoke-virtual {v2, v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_5

    .line 50
    iget v8, v1, Lz70;->a:I

    add-int/lit8 v9, v8, -0x1

    iput v9, v1, Lz70;->a:I

    .line 51
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v2, v9, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_a

    :cond_5
    const/16 v22, 0x0

    .line 53
    :goto_a
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    array-length v3, v2

    move v4, v15

    :goto_b
    if-ge v4, v3, :cond_39

    aget-object v8, v2, v4

    .line 55
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    move-result v9

    const/4 v10, 0x2

    if-ne v9, v10, :cond_38

    .line 56
    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    new-instance v17, Lmh1;

    move-object/from16 v18, v1

    move-object/from16 v23, v6

    move/from16 v21, v7

    move-object/from16 v20, v8

    invoke-direct/range {v17 .. v23}, Lmh1;-><init>(Lz70;Ljava/lang/Class;Ljava/lang/reflect/Constructor;ILjava/lang/Integer;Lml2;)V

    move-object/from16 v2, v17

    .line 58
    sget-object v3, Lup0;->j:Ljava/lang/ClassLoader;

    const-string v4, "hostClassLoader"

    if-eqz v3, :cond_37

    .line 59
    new-instance v6, Lph1;

    invoke-direct {v6, v3}, Lph1;-><init>(Ljava/lang/ClassLoader;)V

    .line 60
    sget-object v3, Lup0;->j:Ljava/lang/ClassLoader;

    if-eqz v3, :cond_36

    .line 61
    const-string v4, "androidx.appcompat.app.AppCompatActivity"

    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v1, Lz70;->o:Ljava/io/Serializable;

    .line 63
    iget-object v3, v1, Lz70;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Class;

    .line 64
    new-instance v4, Li42;

    invoke-direct {v4, v3}, Li42;-><init>(Ljava/lang/Class;)V

    .line 65
    sget-object v3, Lup0;->i:Landroid/content/Context;

    if-eqz v3, :cond_35

    .line 66
    invoke-virtual {v3}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    const-string v5, "nuke_setting_proxy"

    invoke-static {v3, v5}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 69
    new-instance v5, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "v"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v5, v4, Li42;->c:Ljava/io/File;

    .line 70
    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    .line 71
    iput-object v6, v4, Li42;->b:Ljava/lang/ClassLoader;

    .line 72
    iget-object v3, v1, Lz70;->o:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_34

    .line 73
    const-class v3, Lnh1;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 74
    aget-object v3, v3, v15

    .line 75
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result v5

    if-eqz v5, :cond_33

    .line 76
    iget-object v5, v4, Li42;->e:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 77
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_6
    iget-object v3, v4, Li42;->b:Ljava/lang/ClassLoader;

    .line 79
    new-instance v6, Lh42;

    iget-object v7, v4, Li42;->a:Ljava/lang/Class;

    invoke-direct {v6, v7, v5, v3}, Lh42;-><init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 80
    sget-object v3, Li42;->f:Ljava/util/Map;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    if-eqz v8, :cond_7

    move-object/from16 v29, v2

    goto/16 :goto_30

    .line 81
    :cond_7
    new-instance v8, Lsz0;

    const/16 v9, 0xc

    invoke-direct {v8, v9}, Lsz0;-><init>(I)V

    .line 82
    invoke-virtual {v5}, Ljava/util/ArrayList;->hashCode()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    .line 83
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "."

    const-string v15, "/"

    invoke-virtual {v12, v13, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "_Proxy"

    .line 84
    invoke-static {v11, v9, v12}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 85
    const-string v11, "L"

    const-string v12, ";"

    .line 86
    invoke-static {v11, v9, v12}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 87
    new-instance v12, La63;

    .line 88
    :try_start_2
    const-string v13, "V"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    .line 89
    sget-object v13, Lo43;->v:Lo43;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_c

    .line 90
    :cond_8
    invoke-static {v11}, Lo43;->g(Ljava/lang/String;)Lo43;

    move-result-object v13

    .line 91
    :goto_c
    invoke-direct {v12, v11, v13}, La63;-><init>(Ljava/lang/String;Lo43;)V

    .line 92
    invoke-static {v7}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v11

    .line 93
    const-class v13, Ljava/lang/reflect/InvocationHandler;

    invoke-static {v13}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v15

    .line 94
    const-class v16, [Ljava/lang/reflect/Method;

    const/16 v18, 0x0

    invoke-static/range {v16 .. v16}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v14

    .line 95
    new-instance v0, Lli0;

    move-object/from16 v20, v5

    const-string v5, "$__handler"

    invoke-direct {v0, v12, v15, v5}, Lli0;-><init>(La63;La63;Ljava/lang/String;)V

    .line 96
    invoke-virtual {v8, v0, v10}, Lsz0;->y(Lli0;I)V

    .line 97
    new-instance v0, Lli0;

    const-string v15, "$__methodArray"

    invoke-direct {v0, v12, v14, v15}, Lli0;-><init>(La63;La63;Ljava/lang/String;)V

    const/16 v14, 0xa

    .line 98
    invoke-virtual {v8, v0, v14}, Lsz0;->y(Lli0;I)V

    .line 99
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 100
    array-length v14, v0

    const/4 v10, 0x0

    :goto_d
    const-string v22, "static methods cannot access \'this\'"

    if-ge v10, v14, :cond_f

    aget-object v23, v0, v10

    move-object/from16 v25, v0

    .line 101
    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v0

    move/from16 v26, v10

    const/16 v10, 0x10

    if-ne v0, v10, :cond_9

    move-object/from16 v29, v2

    move-object/from16 v28, v7

    move-object/from16 v23, v13

    move/from16 v27, v14

    goto/16 :goto_11

    .line 102
    :cond_9
    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 103
    array-length v10, v0

    move-object/from16 v23, v13

    new-array v13, v10, [La63;

    move-object/from16 v28, v7

    move/from16 v27, v14

    const/4 v14, 0x0

    .line 104
    :goto_e
    array-length v7, v0

    if-ge v14, v7, :cond_a

    .line 105
    aget-object v7, v0, v14

    invoke-static {v7}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v7

    aput-object v7, v13, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_e

    .line 106
    :cond_a
    new-instance v0, Lvg1;

    sget-object v7, La63;->l:La63;

    new-instance v14, Le63;

    invoke-direct {v14, v13}, Le63;-><init>([La63;)V

    move-object/from16 v29, v2

    const-string v2, "<init>"

    invoke-direct {v0, v12, v7, v2, v14}, Lvg1;-><init>(La63;La63;Ljava/lang/String;Le63;)V

    .line 107
    invoke-virtual {v8, v0}, Lsz0;->t(Lvg1;)Lwt;

    move-result-object v0

    .line 108
    iget-object v7, v0, Lwt;->e:Lyb1;

    if-eqz v7, :cond_e

    .line 109
    invoke-static {v7, v12}, Lwt;->d(Lyb1;La63;)V

    .line 110
    new-array v14, v10, [Lyb1;

    move-object/from16 v34, v7

    const/4 v7, 0x0

    :goto_f
    if-ge v7, v10, :cond_b

    move/from16 v30, v10

    .line 111
    aget-object v10, v13, v7

    invoke-virtual {v0, v7, v10}, Lwt;->e(ILa63;)Lyb1;

    move-result-object v10

    aput-object v10, v14, v7

    add-int/lit8 v7, v7, 0x1

    move/from16 v10, v30

    goto :goto_f

    .line 112
    :cond_b
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    new-instance v7, Lvg1;

    sget-object v10, La63;->l:La63;

    move-object/from16 v30, v0

    new-instance v0, Le63;

    invoke-direct {v0, v13}, Le63;-><init>([La63;)V

    invoke-direct {v7, v11, v10, v2, v0}, Lvg1;-><init>(La63;La63;Ljava/lang/String;Le63;)V

    const/4 v0, 0x1

    .line 114
    invoke-virtual {v7, v0}, Lvg1;->a(Z)Ljava/lang/String;

    move-result-object v2

    .line 115
    sget-object v0, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld42;

    if-eqz v10, :cond_c

    goto :goto_10

    .line 116
    :cond_c
    invoke-static {v2}, Ld42;->b(Ljava/lang/String;)Ld42;

    move-result-object v10

    .line 117
    iget-object v2, v10, Ld42;->h:Ljava/lang/String;

    .line 118
    invoke-virtual {v0, v2, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld42;

    if-eqz v0, :cond_d

    move-object v10, v0

    .line 119
    :cond_d
    :goto_10
    sget-object v0, Lcb2;->a:Lza2;

    .line 120
    new-instance v0, Lza2;

    .line 121
    invoke-virtual {v10}, Ld42;->c()Lwu2;

    move-result-object v2

    sget-object v10, Lwu2;->q:Lwu2;

    const/16 v13, 0x34

    invoke-direct {v0, v13, v2, v10}, Lza2;-><init>(ILwu2;Ld63;)V

    const/16 v33, 0x0

    move-object/from16 v31, v0

    move-object/from16 v32, v7

    move-object/from16 v35, v14

    .line 122
    invoke-virtual/range {v30 .. v35}, Lwt;->g(Lza2;Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 123
    invoke-virtual/range {v30 .. v30}, Lwt;->m()V

    :goto_11
    add-int/lit8 v10, v26, 0x1

    move-object/from16 v13, v23

    move-object/from16 v0, v25

    move/from16 v14, v27

    move-object/from16 v7, v28

    move-object/from16 v2, v29

    goto/16 :goto_d

    .line 124
    :cond_e
    invoke-static/range {v22 .. v22}, Ls;->l(Ljava/lang/String;)V

    return-void

    :cond_f
    move-object/from16 v29, v2

    move-object/from16 v28, v7

    move-object/from16 v23, v13

    .line 125
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 126
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    :goto_12
    if-eqz v7, :cond_10

    .line 127
    invoke-static {v0, v2, v7}, Li42;->b(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    .line 128
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_12

    :cond_10
    move-object/from16 v7, v28

    :goto_13
    if-eqz v7, :cond_12

    .line 129
    invoke-virtual {v7}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v10

    array-length v13, v10

    const/4 v14, 0x0

    :goto_14
    if-ge v14, v13, :cond_11

    move-object/from16 v25, v7

    aget-object v7, v10, v14

    .line 130
    invoke-static {v0, v2, v7}, Li42;->b(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v7, v25

    goto :goto_14

    :cond_11
    move-object/from16 v25, v7

    .line 131
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_13

    .line 132
    :cond_12
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Class;

    .line 133
    invoke-static {v0, v2, v10}, Li42;->b(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    goto :goto_15

    .line 134
    :cond_13
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v2

    new-array v7, v2, [Ljava/lang/reflect/Method;

    .line 135
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v10, 0x0

    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg42;

    add-int/lit8 v14, v10, 0x1

    .line 136
    iget-object v13, v13, Lg42;->d:Ljava/lang/reflect/Method;

    aput-object v13, v7, v10

    move v10, v14

    goto :goto_16

    .line 137
    :cond_14
    new-instance v0, Lsl0;

    const/16 v10, 0x11

    .line 138
    invoke-direct {v0, v10}, Lsl0;-><init>(I)V

    .line 139
    invoke-static {v7, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 140
    invoke-static/range {v23 .. v23}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v0

    .line 141
    invoke-static/range {v16 .. v16}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v10

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    new-instance v13, Lo30;

    new-instance v14, Lq30;

    invoke-direct {v14, v5}, Lq30;-><init>(Ljava/lang/String;)V

    new-instance v5, Lq30;

    move-object/from16 v23, v1

    iget-object v1, v0, La63;->a:Ljava/lang/String;

    invoke-direct {v5, v1}, Lq30;-><init>(Ljava/lang/String;)V

    invoke-direct {v13, v14, v5}, Lo30;-><init>(Lq30;Lq30;)V

    .line 144
    new-instance v1, Lc30;

    .line 145
    iget-object v5, v12, La63;->c:Lr30;

    invoke-direct {v1, v5, v13}, Lm30;-><init>(Lr30;Lo30;)V

    .line 146
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    new-instance v13, Lo30;

    new-instance v14, Lq30;

    invoke-direct {v14, v15}, Lq30;-><init>(Ljava/lang/String;)V

    move-object/from16 v35, v1

    new-instance v1, Lq30;

    move-object/from16 v16, v3

    iget-object v3, v10, La63;->a:Ljava/lang/String;

    invoke-direct {v1, v3}, Lq30;-><init>(Ljava/lang/String;)V

    invoke-direct {v13, v14, v1}, Lo30;-><init>(Lq30;Lq30;)V

    .line 148
    new-instance v1, Lc30;

    .line 149
    invoke-direct {v1, v5, v13}, Lm30;-><init>(Lr30;Lo30;)V

    .line 150
    const-class v3, Ljava/lang/reflect/Method;

    invoke-static {v3}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v3

    .line 151
    const-class v5, [Ljava/lang/Object;

    invoke-static {v5}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v5

    .line 152
    sget-object v13, La63;->m:La63;

    const-string v14, "invoke"

    move-object/from16 v41, v1

    filled-new-array {v13, v3, v5}, [La63;

    move-result-object v1

    invoke-virtual {v0, v13, v14, v1}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    move-result-object v1

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v2, :cond_30

    .line 153
    aget-object v14, v7, v13

    move/from16 v25, v2

    .line 154
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    move/from16 v26, v13

    .line 155
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    move-object/from16 v27, v6

    .line 156
    array-length v6, v13

    move-object/from16 v48, v7

    new-array v7, v6, [La63;

    move-object/from16 v49, v15

    const/4 v15, 0x0

    :goto_18
    if-ge v15, v6, :cond_15

    .line 157
    aget-object v30, v13, v15

    invoke-static/range {v30 .. v30}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v30

    aput-object v30, v7, v15

    add-int/lit8 v15, v15, 0x1

    goto :goto_18

    .line 158
    :cond_15
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v50, v4

    .line 159
    invoke-static {v15}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v4

    move-object/from16 v51, v9

    .line 160
    invoke-virtual {v12, v4, v2, v7}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    move-result-object v9

    .line 161
    const-class v30, Ljava/lang/AbstractMethodError;

    move-object/from16 v52, v14

    .line 162
    invoke-static/range {v30 .. v30}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v14

    .line 163
    invoke-virtual {v8, v9}, Lsz0;->t(Lvg1;)Lwt;

    move-result-object v9

    move-object/from16 v53, v8

    .line 164
    iget-object v8, v9, Lwt;->e:Lyb1;

    if-eqz v8, :cond_2f

    .line 165
    invoke-static {v8, v12}, Lwt;->d(Lyb1;La63;)V

    move-object/from16 v54, v12

    .line 166
    iget-object v12, v9, Lwt;->j:Lwu2;

    move-object/from16 v55, v1

    iget-object v1, v9, Lwt;->h:Lkt2;

    move-object/from16 v56, v8

    .line 167
    invoke-virtual {v9, v0}, Lwt;->k(La63;)Lyb1;

    move-result-object v8

    move/from16 v57, v6

    iget-object v6, v8, Lyb1;->b:La63;

    move-object/from16 v58, v8

    .line 168
    sget-object v8, La63;->m:La63;

    invoke-virtual {v9, v8}, Lwt;->k(La63;)Lyb1;

    move-result-object v59

    move-object/from16 v42, v6

    .line 169
    sget-object v6, La63;->i:La63;

    move-object/from16 v60, v1

    invoke-virtual {v9, v6}, Lwt;->k(La63;)Lyb1;

    move-result-object v1

    move-object/from16 v61, v1

    .line 170
    invoke-virtual {v9, v5}, Lwt;->k(La63;)Lyb1;

    move-result-object v1

    move-object/from16 v62, v5

    iget-object v5, v1, Lyb1;->b:La63;

    move-object/from16 v63, v1

    .line 171
    invoke-virtual {v9, v6}, Lwt;->k(La63;)Lyb1;

    move-result-object v1

    .line 172
    invoke-virtual {v9, v8}, Lwt;->k(La63;)Lyb1;

    move-result-object v45

    .line 173
    invoke-virtual {v9, v4}, Lwt;->k(La63;)Lyb1;

    move-result-object v8

    move-object/from16 v64, v8

    .line 174
    invoke-virtual {v9, v10}, Lwt;->k(La63;)Lyb1;

    move-result-object v8

    move-object/from16 v65, v10

    .line 175
    invoke-virtual {v9, v3}, Lwt;->k(La63;)Lyb1;

    move-result-object v10

    .line 176
    invoke-virtual {v9, v6}, Lwt;->k(La63;)Lyb1;

    move-result-object v6

    move-object/from16 v66, v3

    .line 177
    sget-object v3, Li42;->g:Ljava/util/HashMap;

    invoke-virtual {v3, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_16

    .line 178
    invoke-static {v3}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v3

    invoke-virtual {v9, v3}, Lwt;->k(La63;)Lyb1;

    move-result-object v3

    move-object/from16 v67, v3

    goto :goto_19

    :cond_16
    move-object/from16 v67, v18

    .line 179
    :goto_19
    invoke-virtual {v9, v0}, Lwt;->k(La63;)Lyb1;

    move-result-object v3

    move-object/from16 v68, v0

    .line 180
    invoke-virtual/range {v52 .. v52}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_17

    .line 181
    array-length v0, v13

    new-array v0, v0, [Lyb1;

    .line 182
    invoke-virtual {v9, v4}, Lwt;->k(La63;)Lyb1;

    move-result-object v30

    .line 183
    invoke-virtual {v11, v4, v2, v7}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    move-result-object v2

    move-object/from16 v69, v11

    move-object/from16 v71, v13

    move-object/from16 v70, v14

    move-object/from16 v13, v30

    move-object v11, v0

    move-object v14, v2

    move-object/from16 v0, v18

    move-object v2, v0

    :goto_1a
    move-object/from16 v72, v4

    goto :goto_1b

    .line 184
    :cond_17
    sget-object v0, La63;->n:La63;

    invoke-virtual {v9, v0}, Lwt;->k(La63;)Lyb1;

    move-result-object v0

    .line 185
    invoke-virtual {v9, v14}, Lwt;->k(La63;)Lyb1;

    move-result-object v2

    move-object/from16 v69, v11

    move-object/from16 v71, v13

    move-object/from16 v70, v14

    move-object/from16 v11, v18

    move-object v13, v11

    move-object v14, v13

    goto :goto_1a

    .line 186
    :goto_1b
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v9, v6, v4}, Lwt;->i(Lyb1;Ljava/lang/Object;)V

    .line 187
    new-instance v36, Lj23;

    iget-object v4, v8, Lyb1;->b:La63;

    iget-object v4, v4, La63;->b:Lo43;

    sget-object v30, Lcb2;->a:Lza2;

    move-object/from16 v30, v6

    .line 188
    iget v6, v4, Lo43;->i:I

    packed-switch v6, :pswitch_data_0

    .line 189
    invoke-static {v4}, Lcb2;->a(Lw53;)V

    throw v18

    .line 190
    :pswitch_0
    sget-object v4, Lcb2;->a2:Lza2;

    :goto_1c
    move-object/from16 v37, v4

    goto :goto_1d

    .line 191
    :pswitch_1
    sget-object v4, Lcb2;->e2:Lza2;

    goto :goto_1c

    .line 192
    :pswitch_2
    sget-object v4, Lcb2;->X1:Lza2;

    goto :goto_1c

    .line 193
    :pswitch_3
    sget-object v4, Lcb2;->W1:Lza2;

    goto :goto_1c

    .line 194
    :pswitch_4
    sget-object v4, Lcb2;->Y1:Lza2;

    goto :goto_1c

    .line 195
    :pswitch_5
    sget-object v4, Lcb2;->Z1:Lza2;

    goto :goto_1c

    .line 196
    :pswitch_6
    sget-object v4, Lcb2;->d2:Lza2;

    goto :goto_1c

    .line 197
    :pswitch_7
    sget-object v4, Lcb2;->c2:Lza2;

    goto :goto_1c

    .line 198
    :pswitch_8
    sget-object v4, Lcb2;->b2:Lza2;

    goto :goto_1c

    .line 199
    :goto_1d
    iget-object v4, v9, Lwt;->h:Lkt2;

    sget-object v39, Ls72;->j:Ls72;

    iget-object v6, v9, Lwt;->j:Lwu2;

    move-object/from16 v38, v4

    move-object/from16 v40, v6

    invoke-direct/range {v36 .. v41}, Lj23;-><init>(Lza2;Lkt2;Ls72;Ld63;Ldz;)V

    move-object/from16 v6, v18

    move-object/from16 v4, v36

    .line 200
    invoke-virtual {v9, v4, v6}, Lwt;->a(Li01;Lv51;)V

    const/4 v4, 0x1

    .line 201
    invoke-virtual {v9, v8, v4}, Lwt;->j(Lyb1;Z)V

    .line 202
    new-instance v4, Lk23;

    iget-object v6, v10, Lyb1;->b:La63;

    iget-object v6, v6, La63;->b:Lo43;

    move-object/from16 v31, v8

    .line 203
    iget v8, v6, Lo43;->i:I

    packed-switch v8, :pswitch_data_1

    .line 204
    invoke-static {v6}, Lcb2;->a(Lw53;)V

    throw v18

    .line 205
    :pswitch_9
    sget-object v6, Lcb2;->o1:Lza2;

    goto :goto_1e

    .line 206
    :pswitch_a
    sget-object v6, Lcb2;->s1:Lza2;

    goto :goto_1e

    .line 207
    :pswitch_b
    sget-object v6, Lcb2;->l1:Lza2;

    goto :goto_1e

    .line 208
    :pswitch_c
    sget-object v6, Lcb2;->k1:Lza2;

    goto :goto_1e

    .line 209
    :pswitch_d
    sget-object v6, Lcb2;->m1:Lza2;

    goto :goto_1e

    .line 210
    :pswitch_e
    sget-object v6, Lcb2;->n1:Lza2;

    goto :goto_1e

    .line 211
    :pswitch_f
    sget-object v6, Lcb2;->r1:Lza2;

    goto :goto_1e

    .line 212
    :pswitch_10
    sget-object v6, Lcb2;->q1:Lza2;

    goto :goto_1e

    .line 213
    :pswitch_11
    sget-object v6, Lcb2;->p1:Lza2;

    .line 214
    :goto_1e
    invoke-virtual/range {v31 .. v31}, Lyb1;->a()Lr72;

    move-result-object v8

    move-object/from16 v36, v7

    invoke-virtual/range {v30 .. v30}, Lyb1;->a()Lr72;

    move-result-object v7

    invoke-static {v8, v7}, Ls72;->i(Lr72;Lr72;)Ls72;

    move-result-object v7

    move-object/from16 v8, v60

    invoke-direct {v4, v6, v8, v7, v12}, Lk23;-><init>(Lza2;Lkt2;Ls72;Ld63;)V

    const/4 v6, 0x0

    .line 215
    invoke-virtual {v9, v4, v6}, Lwt;->a(Li01;Lv51;)V

    const/4 v4, 0x1

    .line 216
    invoke-virtual {v9, v10, v4}, Lwt;->j(Lyb1;Z)V

    .line 217
    invoke-static/range {v57 .. v57}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v9, v1, v4}, Lwt;->i(Lyb1;Ljava/lang/Object;)V

    .line 218
    new-instance v73, Lj23;

    iget-object v4, v5, La63;->b:Lo43;

    .line 219
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    invoke-virtual {v4}, Lo43;->f()Lo43;

    move-result-object v7

    .line 221
    iget v7, v7, Lo43;->i:I

    packed-switch v7, :pswitch_data_2

    .line 222
    invoke-static {v4}, Lcb2;->a(Lw53;)V

    throw v6

    .line 223
    :pswitch_12
    new-instance v74, Lza2;

    sget-object v77, Lwu2;->k:Lwu2;

    sget-object v78, Ltg0;->d:Lwu2;

    const/16 v79, 0x6

    const/16 v80, 0x0

    const/16 v75, 0x29

    .line 224
    const-string v81, "new-array-object"

    move-object/from16 v76, v4

    invoke-direct/range {v74 .. v81}, Lza2;-><init>(ILo43;Ld63;Ld63;IZLjava/lang/String;)V

    goto :goto_1f

    .line 225
    :pswitch_13
    sget-object v74, Lcb2;->K1:Lza2;

    goto :goto_1f

    .line 226
    :pswitch_14
    sget-object v74, Lcb2;->E1:Lza2;

    goto :goto_1f

    .line 227
    :pswitch_15
    sget-object v74, Lcb2;->D1:Lza2;

    goto :goto_1f

    .line 228
    :pswitch_16
    sget-object v74, Lcb2;->F1:Lza2;

    goto :goto_1f

    .line 229
    :pswitch_17
    sget-object v74, Lcb2;->G1:Lza2;

    goto :goto_1f

    .line 230
    :pswitch_18
    sget-object v74, Lcb2;->J1:Lza2;

    goto :goto_1f

    .line 231
    :pswitch_19
    sget-object v74, Lcb2;->I1:Lza2;

    goto :goto_1f

    .line 232
    :pswitch_1a
    sget-object v74, Lcb2;->H1:Lza2;

    .line 233
    :goto_1f
    iget-object v4, v9, Lwt;->h:Lkt2;

    .line 234
    invoke-virtual {v1}, Lyb1;->a()Lr72;

    move-result-object v1

    invoke-static {v1}, Ls72;->h(Lr72;)Ls72;

    move-result-object v76

    iget-object v1, v9, Lwt;->j:Lwu2;

    iget-object v5, v5, La63;->c:Lr30;

    move-object/from16 v77, v1

    move-object/from16 v75, v4

    move-object/from16 v78, v5

    invoke-direct/range {v73 .. v78}, Lj23;-><init>(Lza2;Lkt2;Ls72;Ld63;Ldz;)V

    move-object/from16 v1, v73

    const/4 v6, 0x0

    .line 235
    invoke-virtual {v9, v1, v6}, Lwt;->a(Li01;Lv51;)V

    move-object/from16 v1, v63

    const/4 v4, 0x1

    .line 236
    invoke-virtual {v9, v1, v4}, Lwt;->j(Lyb1;Z)V

    .line 237
    new-instance v30, Lj23;

    move-object/from16 v4, v42

    iget-object v5, v4, La63;->b:Lo43;

    .line 238
    iget v7, v5, Lo43;->i:I

    packed-switch v7, :pswitch_data_3

    .line 239
    invoke-static {v5}, Lcb2;->a(Lw53;)V

    throw v6

    .line 240
    :pswitch_1b
    sget-object v5, Lcb2;->R1:Lza2;

    :goto_20
    move-object/from16 v31, v5

    goto :goto_21

    .line 241
    :pswitch_1c
    sget-object v5, Lcb2;->V1:Lza2;

    goto :goto_20

    .line 242
    :pswitch_1d
    sget-object v5, Lcb2;->O1:Lza2;

    goto :goto_20

    .line 243
    :pswitch_1e
    sget-object v5, Lcb2;->N1:Lza2;

    goto :goto_20

    .line 244
    :pswitch_1f
    sget-object v5, Lcb2;->P1:Lza2;

    goto :goto_20

    .line 245
    :pswitch_20
    sget-object v5, Lcb2;->Q1:Lza2;

    goto :goto_20

    .line 246
    :pswitch_21
    sget-object v5, Lcb2;->U1:Lza2;

    goto :goto_20

    .line 247
    :pswitch_22
    sget-object v5, Lcb2;->T1:Lza2;

    goto :goto_20

    .line 248
    :pswitch_23
    sget-object v5, Lcb2;->S1:Lza2;

    goto :goto_20

    .line 249
    :goto_21
    iget-object v5, v9, Lwt;->h:Lkt2;

    .line 250
    invoke-virtual/range {v56 .. v56}, Lyb1;->a()Lr72;

    move-result-object v6

    invoke-static {v6}, Ls72;->h(Lr72;)Ls72;

    move-result-object v33

    iget-object v6, v9, Lwt;->j:Lwu2;

    move-object/from16 v32, v5

    move-object/from16 v34, v6

    invoke-direct/range {v30 .. v35}, Lj23;-><init>(Lza2;Lkt2;Ls72;Ld63;Ldz;)V

    move-object/from16 v5, v30

    const/4 v6, 0x0

    .line 251
    invoke-virtual {v9, v5, v6}, Lwt;->a(Li01;Lv51;)V

    move-object/from16 v5, v58

    const/4 v7, 0x1

    .line 252
    invoke-virtual {v9, v5, v7}, Lwt;->j(Lyb1;Z)V

    .line 253
    invoke-virtual {v9, v3, v6}, Lwt;->i(Lyb1;Ljava/lang/Object;)V

    .line 254
    new-instance v6, Lv51;

    invoke-direct {v6}, Lv51;-><init>()V

    .line 255
    invoke-virtual {v9, v6}, Lwt;->b(Lv51;)V

    .line 256
    iget-object v7, v3, Lyb1;->b:La63;

    iget-object v7, v7, La63;->b:Lo43;

    iget-object v4, v4, La63;->b:Lo43;

    invoke-static {v7, v4}, Lwu2;->i(Lo43;Lo43;)Lwu2;

    move-result-object v4

    .line 257
    sget-object v7, Lcb2;->s:Lza2;

    sget-object v30, Lcb2;->y:Lza2;

    sget-object v31, Lcb2;->A:Lza2;

    sget-object v32, Lcb2;->G:Lza2;

    move-object/from16 v33, v3

    .line 258
    move-object v3, v4

    check-cast v3, Lkj0;

    .line 259
    iget-object v3, v3, Lkj0;->i:[Ljava/lang/Object;

    .line 260
    array-length v3, v3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_19

    const/4 v5, 0x2

    if-ne v3, v5, :cond_1a

    const/4 v3, 0x0

    .line 261
    invoke-interface {v4, v3}, Ld63;->getType(I)Lo43;

    move-result-object v5

    invoke-virtual {v5}, Lo43;->d()I

    move-result v3

    const/4 v5, 0x1

    .line 262
    invoke-interface {v4, v5}, Ld63;->getType(I)Lo43;

    move-result-object v7

    invoke-virtual {v7}, Lo43;->d()I

    move-result v5

    if-ne v3, v5, :cond_1a

    const/4 v5, 0x6

    if-eq v3, v5, :cond_18

    const/16 v5, 0x9

    if-ne v3, v5, :cond_1a

    if-eqz v32, :cond_1a

    move-object/from16 v7, v32

    goto :goto_22

    :cond_18
    move-object/from16 v7, v31

    goto :goto_22

    :cond_19
    const/4 v3, 0x0

    .line 263
    invoke-interface {v4, v3}, Ld63;->getType(I)Lo43;

    move-result-object v5

    invoke-virtual {v5}, Lo43;->d()I

    move-result v3

    const/4 v5, 0x6

    if-eq v3, v5, :cond_1b

    const/16 v5, 0x9

    if-ne v3, v5, :cond_1a

    if-eqz v30, :cond_1a

    move-object/from16 v7, v30

    goto :goto_22

    .line 264
    :cond_1a
    const-string v3, "bad types: "

    invoke-static {v3, v4}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v7, 0x0

    .line 265
    :cond_1b
    :goto_22
    new-instance v3, Lxz1;

    .line 266
    invoke-virtual/range {v33 .. v33}, Lyb1;->a()Lr72;

    move-result-object v4

    invoke-virtual/range {v58 .. v58}, Lyb1;->a()Lr72;

    move-result-object v5

    invoke-static {v4, v5}, Ls72;->i(Lr72;Lr72;)Ls72;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v7, v8, v5, v4}, Lxz1;-><init>(Lza2;Lkt2;Lr72;Ls72;)V

    .line 267
    invoke-virtual {v9, v3, v6}, Lwt;->a(Li01;Lv51;)V

    const/4 v3, 0x0

    :goto_23
    move/from16 v4, v57

    if-ge v3, v4, :cond_1f

    .line 268
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v7, v61

    invoke-virtual {v9, v7, v5}, Lwt;->i(Lyb1;Ljava/lang/Object;)V

    .line 269
    aget-object v5, v36, v3

    invoke-virtual {v9, v3, v5}, Lwt;->e(ILa63;)Lyb1;

    move-result-object v5

    move/from16 v30, v3

    .line 270
    sget-object v3, Li42;->h:Ljava/util/HashMap;

    move/from16 v57, v4

    .line 271
    iget-object v4, v5, Lyb1;->b:La63;

    .line 272
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvg1;

    if-nez v3, :cond_1c

    move-object/from16 v61, v7

    move-object v3, v9

    goto :goto_25

    .line 273
    :cond_1c
    filled-new-array {v5}, [Lyb1;

    move-result-object v47

    const/4 v4, 0x1

    .line 274
    invoke-virtual {v3, v4}, Lvg1;->a(Z)Ljava/lang/String;

    move-result-object v5

    .line 275
    sget-object v4, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v31

    check-cast v31, Ld42;

    if-eqz v31, :cond_1d

    move-object/from16 v44, v3

    goto :goto_24

    .line 276
    :cond_1d
    invoke-static {v5}, Ld42;->b(Ljava/lang/String;)Ld42;

    move-result-object v5

    move-object/from16 v44, v3

    .line 277
    iget-object v3, v5, Ld42;->h:Ljava/lang/String;

    .line 278
    invoke-virtual {v4, v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v31, v3

    check-cast v31, Ld42;

    if-eqz v31, :cond_1e

    goto :goto_24

    :cond_1e
    move-object/from16 v31, v5

    .line 279
    :goto_24
    sget-object v3, Lcb2;->a:Lza2;

    .line 280
    new-instance v3, Lza2;

    .line 281
    invoke-virtual/range {v31 .. v31}, Ld42;->c()Lwu2;

    move-result-object v4

    sget-object v5, Lwu2;->q:Lwu2;

    move-object/from16 v61, v7

    const/16 v7, 0x31

    invoke-direct {v3, v7, v4, v5}, Lza2;-><init>(ILwu2;Ld63;)V

    const/16 v46, 0x0

    move-object/from16 v43, v3

    move-object/from16 v42, v9

    .line 282
    invoke-virtual/range {v42 .. v47}, Lwt;->g(Lza2;Lvg1;Lyb1;Lyb1;[Lyb1;)V

    move-object/from16 v3, v42

    move-object/from16 v5, v45

    .line 283
    :goto_25
    new-instance v4, Lk23;

    iget-object v7, v5, Lyb1;->b:La63;

    iget-object v7, v7, La63;->b:Lo43;

    sget-object v9, Lcb2;->a:Lza2;

    .line 284
    iget v9, v7, Lo43;->i:I

    packed-switch v9, :pswitch_data_4

    .line 285
    invoke-static {v7}, Lcb2;->a(Lw53;)V

    const/16 v18, 0x0

    throw v18

    .line 286
    :pswitch_24
    sget-object v7, Lcb2;->x1:Lza2;

    goto :goto_26

    .line 287
    :pswitch_25
    sget-object v7, Lcb2;->B1:Lza2;

    goto :goto_26

    .line 288
    :pswitch_26
    sget-object v7, Lcb2;->u1:Lza2;

    goto :goto_26

    .line 289
    :pswitch_27
    sget-object v7, Lcb2;->t1:Lza2;

    goto :goto_26

    .line 290
    :pswitch_28
    sget-object v7, Lcb2;->v1:Lza2;

    goto :goto_26

    .line 291
    :pswitch_29
    sget-object v7, Lcb2;->w1:Lza2;

    goto :goto_26

    .line 292
    :pswitch_2a
    sget-object v7, Lcb2;->A1:Lza2;

    goto :goto_26

    .line 293
    :pswitch_2b
    sget-object v7, Lcb2;->z1:Lza2;

    goto :goto_26

    .line 294
    :pswitch_2c
    sget-object v7, Lcb2;->y1:Lza2;

    .line 295
    :goto_26
    invoke-virtual {v5}, Lyb1;->a()Lr72;

    move-result-object v5

    invoke-virtual {v1}, Lyb1;->a()Lr72;

    move-result-object v9

    move-object/from16 v31, v0

    invoke-virtual/range {v61 .. v61}, Lyb1;->a()Lr72;

    move-result-object v0

    move-object/from16 v32, v2

    .line 296
    new-instance v2, Ls72;

    move-object/from16 v33, v13

    const/4 v13, 0x3

    .line 297
    invoke-direct {v2, v13}, Lkj0;-><init>(I)V

    const/4 v13, 0x0

    .line 298
    invoke-virtual {v2, v13, v5}, Lkj0;->f(ILjava/lang/Object;)V

    const/4 v5, 0x1

    .line 299
    invoke-virtual {v2, v5, v9}, Lkj0;->f(ILjava/lang/Object;)V

    const/4 v9, 0x2

    .line 300
    invoke-virtual {v2, v9, v0}, Lkj0;->f(ILjava/lang/Object;)V

    .line 301
    invoke-direct {v4, v7, v8, v2, v12}, Lk23;-><init>(Lza2;Lkt2;Ls72;Ld63;)V

    const/4 v0, 0x0

    .line 302
    invoke-virtual {v3, v4, v0}, Lwt;->a(Li01;Lv51;)V

    add-int/lit8 v0, v30, 0x1

    move-object v9, v3

    move-object/from16 v2, v32

    move-object/from16 v13, v33

    move v3, v0

    move-object/from16 v0, v31

    goto/16 :goto_23

    :cond_1f
    move-object/from16 v31, v0

    move-object/from16 v32, v2

    move-object v3, v9

    move-object/from16 v33, v13

    move-object/from16 v0, v56

    const/4 v5, 0x1

    const/4 v9, 0x2

    .line 303
    filled-new-array {v0, v10, v1}, [Lyb1;

    move-result-object v47

    move-object/from16 v1, v55

    .line 304
    invoke-virtual {v1, v5}, Lvg1;->a(Z)Ljava/lang/String;

    move-result-object v2

    .line 305
    sget-object v4, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld42;

    if-eqz v5, :cond_20

    goto :goto_27

    .line 306
    :cond_20
    invoke-static {v2}, Ld42;->b(Ljava/lang/String;)Ld42;

    move-result-object v5

    .line 307
    iget-object v2, v5, Ld42;->h:Ljava/lang/String;

    .line 308
    invoke-virtual {v4, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld42;

    if-eqz v2, :cond_21

    move-object v5, v2

    .line 309
    :cond_21
    :goto_27
    sget-object v2, Lcb2;->a:Lza2;

    .line 310
    new-instance v2, Lza2;

    .line 311
    invoke-virtual {v5}, Ld42;->c()Lwu2;

    move-result-object v5

    sget-object v7, Lwu2;->q:Lwu2;

    const/16 v10, 0x35

    invoke-direct {v2, v10, v5, v7}, Lza2;-><init>(ILwu2;Ld63;)V

    move-object/from16 v44, v1

    move-object/from16 v43, v2

    move-object/from16 v42, v3

    move-object/from16 v46, v58

    move-object/from16 v45, v59

    .line 312
    invoke-virtual/range {v42 .. v47}, Lwt;->g(Lza2;Lvg1;Lyb1;Lyb1;[Lyb1;)V

    move-object/from16 v2, v45

    .line 313
    sget-object v5, Li42;->i:Ljava/util/HashMap;

    invoke-virtual {v5, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eqz v10, :cond_24

    move-object/from16 v10, v67

    .line 314
    invoke-virtual {v3, v10, v2}, Lwt;->c(Lyb1;Lyb1;)V

    .line 315
    invoke-virtual {v5, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvg1;

    const/4 v13, 0x0

    .line 316
    new-array v5, v13, [Lyb1;

    const/4 v13, 0x1

    .line 317
    invoke-virtual {v2, v13}, Lvg1;->a(Z)Ljava/lang/String;

    move-result-object v9

    .line 318
    invoke-virtual {v4, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld42;

    if-eqz v13, :cond_22

    goto :goto_28

    .line 319
    :cond_22
    invoke-static {v9}, Ld42;->b(Ljava/lang/String;)Ld42;

    move-result-object v13

    .line 320
    iget-object v9, v13, Ld42;->h:Ljava/lang/String;

    .line 321
    invoke-virtual {v4, v9, v13}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld42;

    if-eqz v4, :cond_23

    move-object v13, v4

    .line 322
    :cond_23
    :goto_28
    new-instance v4, Lza2;

    const/16 v9, 0x32

    .line 323
    invoke-virtual {v13}, Ld42;->c()Lwu2;

    move-result-object v13

    invoke-direct {v4, v9, v13, v7}, Lza2;-><init>(ILwu2;Ld63;)V

    move-object/from16 v44, v2

    move-object/from16 v42, v3

    move-object/from16 v43, v4

    move-object/from16 v47, v5

    move-object/from16 v46, v10

    move-object/from16 v45, v64

    .line 324
    invoke-virtual/range {v42 .. v47}, Lwt;->g(Lza2;Lvg1;Lyb1;Lyb1;[Lyb1;)V

    move-object/from16 v4, v45

    .line 325
    invoke-virtual {v3, v4}, Lwt;->l(Lyb1;)V

    goto :goto_29

    :cond_24
    move-object/from16 v4, v64

    .line 326
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    .line 327
    invoke-virtual {v3}, Lwt;->m()V

    goto :goto_29

    .line 328
    :cond_25
    invoke-virtual {v3, v4, v2}, Lwt;->c(Lyb1;Lyb1;)V

    .line 329
    invoke-virtual {v3, v4}, Lwt;->l(Lyb1;)V

    .line 330
    :goto_29
    invoke-virtual {v3, v6}, Lwt;->b(Lv51;)V

    .line 331
    iget-boolean v2, v6, Lv51;->c:Z

    if-nez v2, :cond_2e

    const/4 v4, 0x1

    .line 332
    iput-boolean v4, v6, Lv51;->c:Z

    .line 333
    iget-object v2, v3, Lwt;->c:Lv51;

    if-eqz v2, :cond_26

    .line 334
    invoke-virtual {v3, v6}, Lwt;->b(Lv51;)V

    .line 335
    new-instance v2, Lxz1;

    sget-object v4, Lcb2;->r:Lza2;

    sget-object v5, Ls72;->j:Ls72;

    const/4 v7, 0x0

    invoke-direct {v2, v4, v8, v7, v5}, Lxz1;-><init>(Lza2;Lkt2;Lr72;Ls72;)V

    invoke-virtual {v3, v2, v6}, Lwt;->a(Li01;Lv51;)V

    .line 336
    :cond_26
    iput-object v6, v3, Lwt;->c:Lv51;

    .line 337
    invoke-virtual/range {v52 .. v52}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    and-int/lit16 v2, v2, 0x400

    if-nez v2, :cond_29

    const/4 v2, 0x0

    .line 338
    :goto_2a
    array-length v4, v11

    if-ge v2, v4, :cond_27

    .line 339
    aget-object v4, v36, v2

    invoke-virtual {v3, v2, v4}, Lwt;->e(ILa63;)Lyb1;

    move-result-object v4

    aput-object v4, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2a

    .line 340
    :cond_27
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    const/4 v6, 0x0

    .line 341
    invoke-virtual {v3, v14, v6, v0, v11}, Lwt;->h(Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 342
    invoke-virtual {v3}, Lwt;->m()V

    :goto_2b
    move-object/from16 v0, v52

    goto :goto_2c

    :cond_28
    move-object/from16 v2, v33

    .line 343
    invoke-virtual {v3, v14, v2, v0, v11}, Lwt;->h(Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 344
    invoke-virtual {v3, v2}, Lwt;->l(Lyb1;)V

    goto :goto_2b

    :cond_29
    move-object/from16 v2, v31

    move-object/from16 v4, v32

    move-object/from16 v0, v52

    .line 345
    invoke-static {v3, v0, v2, v4}, Li42;->d(Lwt;Ljava/lang/reflect/Method;Lyb1;Lyb1;)V

    .line 346
    :goto_2c
    invoke-static {v0}, Li42;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v36

    move-object/from16 v3, v54

    move-object/from16 v5, v72

    .line 347
    invoke-virtual {v3, v5, v2, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    move-result-object v2

    move-object/from16 v6, v53

    .line 348
    invoke-virtual {v6, v2}, Lsz0;->t(Lvg1;)Lwt;

    move-result-object v2

    .line 349
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v7

    and-int/lit16 v7, v7, 0x400

    if-nez v7, :cond_2d

    .line 350
    iget-object v0, v2, Lwt;->e:Lyb1;

    if-eqz v0, :cond_2c

    .line 351
    invoke-static {v0, v3}, Lwt;->d(Lyb1;La63;)V

    move-object/from16 v7, v71

    .line 352
    array-length v7, v7

    new-array v8, v7, [Lyb1;

    const/4 v9, 0x0

    :goto_2d
    if-ge v9, v7, :cond_2a

    .line 353
    aget-object v10, v4, v9

    invoke-virtual {v2, v9, v10}, Lwt;->e(ILa63;)Lyb1;

    move-result-object v10

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_2d

    .line 354
    :cond_2a
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    const/4 v7, 0x0

    .line 355
    invoke-virtual {v2, v14, v7, v0, v8}, Lwt;->h(Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 356
    invoke-virtual {v2}, Lwt;->m()V

    goto :goto_2e

    .line 357
    :cond_2b
    invoke-virtual {v2, v5}, Lwt;->k(La63;)Lyb1;

    move-result-object v4

    .line 358
    invoke-virtual {v2, v14, v4, v0, v8}, Lwt;->h(Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 359
    invoke-virtual {v2, v4}, Lwt;->l(Lyb1;)V

    goto :goto_2e

    .line 360
    :cond_2c
    invoke-static/range {v22 .. v22}, Ls;->l(Ljava/lang/String;)V

    return-void

    .line 361
    :cond_2d
    sget-object v4, La63;->n:La63;

    invoke-virtual {v2, v4}, Lwt;->k(La63;)Lyb1;

    move-result-object v4

    move-object/from16 v5, v70

    .line 362
    invoke-virtual {v2, v5}, Lwt;->k(La63;)Lyb1;

    move-result-object v5

    .line 363
    invoke-static {v2, v0, v4, v5}, Li42;->d(Lwt;Ljava/lang/reflect/Method;Lyb1;Lyb1;)V

    :goto_2e
    add-int/lit8 v13, v26, 0x1

    move-object v12, v3

    move-object v8, v6

    move/from16 v2, v25

    move-object/from16 v6, v27

    move-object/from16 v7, v48

    move-object/from16 v15, v49

    move-object/from16 v4, v50

    move-object/from16 v9, v51

    move-object/from16 v5, v62

    move-object/from16 v10, v65

    move-object/from16 v3, v66

    move-object/from16 v0, v68

    move-object/from16 v11, v69

    const/16 v18, 0x0

    goto/16 :goto_17

    .line 364
    :cond_2e
    const-string v0, "already marked"

    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    return-void

    .line 365
    :cond_2f
    invoke-static/range {v22 .. v22}, Ls;->l(Ljava/lang/String;)V

    return-void

    :cond_30
    move-object/from16 v50, v4

    move-object/from16 v27, v6

    move-object/from16 v48, v7

    move-object v6, v8

    move-object/from16 v51, v9

    move-object/from16 v69, v11

    move-object v3, v12

    move-object/from16 v49, v15

    .line 366
    const-string v0, ".generated"

    move-object/from16 v1, v51

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 367
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [La63;

    .line 368
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_31

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Class;

    add-int/lit8 v8, v5, 0x1

    .line 369
    invoke-static {v7}, La63;->a(Ljava/lang/Class;)La63;

    move-result-object v7

    aput-object v7, v2, v5

    move v5, v8

    goto :goto_2f

    .line 370
    :cond_31
    invoke-virtual {v6, v3}, Lsz0;->H(La63;)Lf80;

    move-result-object v4

    .line 371
    iget-boolean v5, v4, Lf80;->b:Z

    if-nez v5, :cond_32

    const/4 v5, 0x1

    .line 372
    iput-boolean v5, v4, Lf80;->b:Z

    .line 373
    iput v5, v4, Lf80;->c:I

    move-object/from16 v3, v69

    .line 374
    iput-object v3, v4, Lf80;->d:La63;

    .line 375
    iput-object v0, v4, Lf80;->e:Ljava/lang/String;

    .line 376
    new-instance v0, Le63;

    invoke-direct {v0, v2}, Le63;-><init>([La63;)V

    .line 377
    iput-object v0, v4, Lf80;->f:Le63;

    move-object/from16 v0, v50

    .line 378
    iget-object v2, v0, Li42;->b:Ljava/lang/ClassLoader;

    iget-object v0, v0, Li42;->c:Ljava/io/File;

    invoke-virtual {v6, v2, v0}, Lsz0;->B(Ljava/lang/ClassLoader;Ljava/io/File;)Ljava/lang/ClassLoader;

    move-result-object v0

    .line 379
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/IllegalAccessError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    move-object/from16 v0, v49

    .line 380
    :try_start_4
    invoke-virtual {v8, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v4, 0x1

    .line 381
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object/from16 v1, v48

    const/4 v6, 0x0

    .line 382
    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v1, v16

    move-object/from16 v0, v27

    .line 383
    invoke-interface {v1, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v23

    .line 384
    :goto_30
    iput-object v8, v1, Lz70;->n:Ljava/lang/Object;

    .line 385
    new-instance v0, Loh1;

    move-object/from16 v2, v29

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2}, Loh1;-><init>(ILjava/lang/Object;)V

    .line 386
    invoke-static {v8, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 387
    iget-object v0, v1, Lz70;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    new-instance v2, Loh1;

    const/4 v4, 0x1

    invoke-direct {v2, v4, v1}, Loh1;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 388
    const-string v0, "getString"

    filled-new-array/range {v24 .. v24}, [Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 389
    new-instance v2, Lqh1;

    const/4 v13, 0x0

    invoke-direct {v2, v13, v1}, Lqh1;-><init>(ILz70;)V

    .line 390
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 391
    iget-object v0, v1, Lz70;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    .line 392
    new-instance v2, Lqh1;

    const/4 v9, 0x1

    invoke-direct {v2, v9, v1}, Lqh1;-><init>(ILz70;)V

    .line 393
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 394
    const-string v0, "\u65b0\u7248\u8bbe\u7f6e Hook \u5b89\u88c5\u6210\u529f"

    invoke-static {v0}, Lwp2;->m(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    .line 395
    invoke-static {v0}, Ls;->i(Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    .line 396
    invoke-static {v0}, Ls;->i(Ljava/lang/Object;)V

    return-void

    :catch_2
    move-exception v0

    .line 397
    invoke-static {v0}, Ls;->i(Ljava/lang/Object;)V

    return-void

    :catch_3
    move-exception v0

    .line 398
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cannot proxy inaccessible class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, v28

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 399
    :cond_32
    const-string v0, "already declared: "

    invoke-static {v0, v3}, Lc80;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 400
    :catch_4
    const-string v0, "descriptor == null"

    invoke-static {v0}, Lum2;->f(Ljava/lang/String;)V

    return-void

    .line 401
    :cond_33
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Not an interface: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    return-void

    .line 402
    :cond_34
    const-string v0, "activityConstructorType"

    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    const/16 v18, 0x0

    throw v18

    :cond_35
    const/16 v18, 0x0

    .line 403
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    throw v18

    :cond_36
    const/16 v18, 0x0

    .line 404
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    throw v18

    :cond_37
    const/16 v18, 0x0

    .line 405
    invoke-static {v4}, Lt11;->S(Ljava/lang/String;)V

    throw v18

    :cond_38
    move v9, v0

    move-object/from16 v23, v6

    move/from16 v21, v7

    move v13, v15

    const/16 v18, 0x0

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_b

    .line 406
    :cond_39
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    :cond_3a
    const/16 v18, 0x0

    .line 407
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    throw v18

    :cond_3b
    move v9, v2

    move-object v12, v4

    move-object/from16 v24, v5

    move v13, v15

    const/16 v18, 0x0

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_7

    .line 408
    :cond_3c
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    :cond_3d
    move v9, v2

    move-object v12, v4

    move-object/from16 v24, v5

    move v13, v15

    const/16 v18, 0x0

    if-ltz v7, :cond_3e

    move v1, v7

    move v2, v9

    move-object v4, v12

    move v15, v13

    move-object/from16 v5, v24

    goto/16 :goto_5

    .line 409
    :cond_3e
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    :cond_3f
    move v9, v2

    move v13, v15

    const/16 v18, 0x0

    if-ltz v5, :cond_40

    move v4, v5

    move v2, v9

    move v15, v13

    goto/16 :goto_3

    .line 410
    :cond_40
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    :cond_41
    move v9, v2

    move v13, v15

    const/16 v18, 0x0

    add-int/lit8 v5, v5, 0x1

    move v2, v9

    move v15, v13

    goto/16 :goto_2

    .line 411
    :cond_42
    invoke-static/range {v16 .. v16}, Lum2;->i(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch
.end method

.method public static m(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[SettingMenuInjector] "

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lqp2;->b:Lqp2;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lup2;->b:Lup2;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Ltp2;->b:Ltp2;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object p0, Lsp2;->b:Lsp2;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    sget-object p0, Lop2;->b:Lop2;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget-object p0, Lvp2;->b:Lvp2;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object p0, Lrp2;->b:Lrp2;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object p0, Lpp2;->b:Lpp2;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final b()Z
    .locals 0

    .line 1
    sget-boolean p0, Lwp2;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwp2;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object v0, La83;->a:La83;

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lwp2;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    move-object v2, v0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    new-instance v2, Lx92;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lwp2;->d:Lwp2;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {v1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v3, "\u65b0\u7248\u8bbe\u7f6e\u521d\u59cb\u5316\u5931\u8d25\uff1a\n"

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lwp2;->m(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lwp2;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception p0

    .line 43
    new-instance v0, Lx92;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "\u65e7\u7248\u8bbe\u7f6e\u521d\u59cb\u5316\u5931\u8d25\uff1a\n"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Lwp2;->m(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final k()V
    .locals 8

    .line 1
    :try_start_0
    const-string v0, "com.tencent.mm.ui.base.preference.MMPreference"

    .line 2
    .line 3
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.mm.ui.base.preference.Preference"

    .line 8
    .line 9
    invoke-static {v1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "createAdapter"

    .line 22
    .line 23
    iput-object v2, v0, Lzf1;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lzg1;

    .line 34
    .line 35
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    array-length v2, v0

    .line 49
    const/4 v3, 0x0

    .line 50
    :goto_0
    const/4 v4, 0x0

    .line 51
    if-ge v3, v2, :cond_0

    .line 52
    .line 53
    aget-object v5, v0, v3

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v6, Lq90;

    .line 59
    .line 60
    invoke-direct {v6, v1, p0}, Lq90;-><init>(Ljava/lang/Class;Lwp2;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Lkg3;

    .line 64
    .line 65
    invoke-direct {v7, p0, v4, v6}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v7}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Lg80;

    .line 79
    .line 80
    const-string v1, "Lcom/tencent/mm/ui/widget/listview/PullDownListView;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lg80;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Lup0;->j:Ljava/lang/ClassLoader;

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0, v1, v4}, Lg80;->a(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, Lml2;

    .line 94
    .line 95
    const/4 v2, 0x6

    .line 96
    invoke-direct {v1, v2}, Lml2;-><init>(I)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Lkg3;

    .line 100
    .line 101
    invoke-direct {v2, p0, v1, v4}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const-string p0, "\u65e7\u7248\u8bbe\u7f6e Hook \u5b89\u88c5\u6210\u529f"

    .line 112
    .line 113
    invoke-static {p0}, Lwp2;->m(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, La83;->a:La83;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    const-string p0, "hostClassLoader"

    .line 120
    .line 121
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :catchall_0
    move-exception p0

    .line 126
    new-instance v0, Lx92;

    .line 127
    .line 128
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object p0, v0

    .line 132
    :goto_1
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_2

    .line 137
    .line 138
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string v0, "\u65e7\u7248\u8bbe\u7f6e Hook \u5931\u8d25\uff1a\n"

    .line 143
    .line 144
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object v0, Lwp2;->d:Lwp2;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {p0}, Lwp2;->m(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    return-void
.end method
