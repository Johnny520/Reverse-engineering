.class public final La/w8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# instance fields
.field public final a:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/database/Cursor;",
            "La/Re;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, La/w8;->a:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/util/HashSet;)I
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {v2}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-virtual {v2}, La/G1;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, La/G1;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/util/List;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v3, Ljava/util/List;

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v3, p1}, La/w8;->b(Ljava/util/List;Ljava/util/HashSet;)I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static b(Ljava/util/List;Ljava/util/HashSet;)I
    .locals 5

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Ljava/util/IdentityHashMap;

    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "newSetFromMap(...)"

    invoke-static {v3, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1, v0, v3}, La/w8;->d(Ljava/lang/Object;Ljava/util/HashSet;ILjava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static c()Z
    .locals 1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->l:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/Object;Ljava/util/HashSet;ILjava/util/Set;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_c

    const/4 v1, 0x3

    if-gt p2, v1, :cond_c

    invoke-interface {p3, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    instance-of v1, p0, Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    instance-of v1, p0, [Ljava/lang/Object;

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    check-cast p0, [Ljava/lang/Object;

    array-length v1, p0

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_c

    aget-object v4, p0, v3

    add-int/lit8 v5, p2, 0x1

    invoke-static {v4, p1, v5, p3}, La/w8;->d(Ljava/lang/Object;Ljava/util/HashSet;ILjava/util/Set;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    instance-of v1, p0, Ljava/lang/Iterable;

    if-eqz v1, :cond_6

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, p2, 0x1

    invoke-static {v1, p1, v3, p3}, La/w8;->d(Ljava/lang/Object;Ljava/util/HashSet;ILjava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "java."

    invoke-static {v1, v3, v0}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "android."

    invoke-static {v1, v3, v0}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "kotlin."

    invoke-static {v1, v3, v0}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "androidx."

    invoke-static {v1, v3, v0}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_c

    const-class v3, Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-static {v3}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v3

    :catchall_0
    :cond_8
    :goto_2
    invoke-virtual {v3}, La/G1;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v3}, La/G1;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Field;

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_2

    :cond_9
    :try_start_0
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    add-int/lit8 v5, p2, 0x1

    invoke-static {v4, p1, v5, p3}, La/w8;->d(Ljava/lang/Object;Ljava/util/HashSet;ILjava/util/Set;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_8

    :goto_3
    return v2

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_1

    :cond_c
    :goto_4
    return v0
.end method

.method public static e()Ljava/util/HashSet;
    .locals 3

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, La/t3;->u0(Ljava/util/ArrayList;)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "notifyDataSetChanged"

    const/4 v5, 0x1

    const-string v0, "session"

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->c:Ljava/lang/Class;

    const-string v7, "getParameterTypes(...)"

    if-nez v0, :cond_0

    const-string v0, "[HideSnsInteraction] ctor: CommentListAdapter cls NULL"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v8, "getDeclaredConstructors(...)"

    invoke-static {v0, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    array-length v9, v0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_4

    aget-object v11, v0, v10

    invoke-virtual {v11}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v13, v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v14, v13, :cond_2

    aget-object v6, v12, v14

    const-class v4, Ljava/util/List;

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/2addr v15, v5

    :cond_1
    add-int/2addr v14, v5

    goto :goto_1

    :cond_2
    if-lt v15, v5, :cond_3

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/2addr v10, v5

    goto :goto_0

    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "[HideSnsInteraction] ctor: no List-param ctor"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    :try_start_0
    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v8, La/v8;

    const/4 v9, 0x0

    invoke-direct {v8, v1, v9}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v0, v8}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v6, v5

    goto :goto_2

    :catchall_0
    move-exception v0

    const-string v8, "[HideSnsInteraction] ctor hook fail"

    filled-new-array {v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    const-string v0, "[HideSnsInteraction] OK ctor hooks="

    invoke-static {v0, v6}, La/z;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    if-lez v6, :cond_7

    move v4, v5

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v4, 0x0

    :goto_4
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->b:Ljava/lang/Class;

    if-nez v0, :cond_8

    const-string v0, "[HideSnsInteraction] initView: snsCommentDetailUICls NULL"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_6

    :cond_8
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v6, "initView"

    new-instance v8, La/l8;

    const/4 v9, 0x7

    invoke-direct {v8, v1, v9}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v8}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v0, "[HideSnsInteraction] OK initView"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    add-int/2addr v4, v5

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_9
    const-string v0, "[HideSnsInteraction] initView NOT FOUND"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :goto_5
    const-string v6, "[HideSnsInteraction] initView FAILED"

    filled-new-array {v6, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_6
    sget-boolean v0, La/Ed;->a:Z

    sget-object v0, La/Ed;->c:Ljava/lang/Class;

    const/4 v6, 0x0

    if-nez v0, :cond_a

    const-string v0, "[HideSnsInteraction] ndc: CommentListAdapter cls NULL"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_b

    :cond_a
    const/4 v9, 0x0

    :try_start_2
    new-array v8, v9, [Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v10, v0

    :goto_7
    if-eqz v10, :cond_b

    :try_start_3
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ljava/lang/Class;

    invoke-virtual {v10, v3, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_8

    :catch_0
    :try_start_4
    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v10

    const/4 v9, 0x0

    goto :goto_7

    :cond_b
    move-object v9, v6

    :goto_8
    if-nez v9, :cond_c

    const-class v8, Landroid/widget/BaseAdapter;

    invoke-virtual {v8, v3, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_a

    :cond_c
    :goto_9
    invoke-static {v9}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v9}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v3

    new-instance v8, La/m2;

    invoke-direct {v8, v1, v0}, La/m2;-><init>(La/w8;Ljava/lang/Class;)V

    invoke-interface {v3, v8}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    const-string v0, "[HideSnsInteraction] OK ndc"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    add-int/2addr v4, v5

    goto :goto_b

    :goto_a
    const-string v3, "[HideSnsInteraction] ndc FAILED"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_b
    const-string v0, "[HideSnsInteraction] OK b8 hooks="

    sget-boolean v3, La/Ed;->a:Z

    sget-object v3, La/Ed;->b:Ljava/lang/Class;

    if-nez v3, :cond_d

    const-string v0, "[HideSnsInteraction] b8: snsCommentDetailUICls NULL"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_d

    :cond_d
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v8, La/l8;

    const/16 v9, 0xc

    invoke-direct {v8, v9}, La/l8;-><init>(I)V

    new-instance v9, La/l8;

    const/16 v10, 0xd

    invoke-direct {v9, v1, v10}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v3, v8, v9}, La/J8;->b(La/J8;Ljava/lang/String;La/D7;La/D7;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    add-int/2addr v4, v5

    goto :goto_d

    :catchall_3
    move-exception v0

    goto :goto_c

    :cond_e
    const-string v0, "[HideSnsInteraction] b8 NOT FOUND"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_d

    :goto_c
    const-string v3, "[HideSnsInteraction] b8 FAILED"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_d
    const-string v3, "[HideSnsInteraction] OK timeline model hooks ok="

    const-string v8, "[HideSnsInteraction] timeline: P0 not found on "

    const-string v9, "[HideSnsInteraction] timeline: getCommentList not found on "

    new-instance v10, La/fd;

    sget v0, La/B1;->a:I

    const/4 v11, -0x1

    if-ne v0, v11, :cond_f

    :try_start_6
    sget-object v0, La/w1;->p:Landroid/content/Context;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v12, "com.tencent.mm"
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    const/4 v13, 0x0

    :try_start_7
    invoke-virtual {v0, v12, v13}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v11, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_f

    :catch_1
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    const/4 v13, 0x0

    :goto_e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_f
    sput v11, La/B1;->a:I

    goto :goto_10

    :cond_f
    const/4 v13, 0x0

    :goto_10
    sget v0, La/B1;->a:I

    iget-object v11, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-direct {v10, v0, v11}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    sget-object v0, La/hd;->a:La/hd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "sns_info_model"

    invoke-static {v0, v10}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v0

    iget-object v10, v0, La/gd;->b:Ljava/lang/Class;

    if-eqz v10, :cond_12

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :try_start_8
    new-instance v6, La/l8;

    const/16 v10, 0x8

    invoke-direct {v6, v10}, La/l8;-><init>(I)V

    new-instance v10, La/l8;

    const/16 v11, 0x9

    invoke-direct {v10, v1, v11}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v10}, La/J8;->b(La/J8;Ljava/lang/String;La/D7;La/D7;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_10

    move v9, v5

    goto :goto_11

    :cond_10
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La/x1;->e([Ljava/lang/Object;)V

    move v9, v13

    :goto_11
    new-instance v6, La/l8;

    const/16 v10, 0xa

    invoke-direct {v6, v10}, La/l8;-><init>(I)V

    new-instance v10, La/l8;

    const/16 v11, 0xb

    invoke-direct {v10, v1, v11}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v10}, La/J8;->b(La/J8;Ljava/lang/String;La/D7;La/D7;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_11

    add-int/2addr v9, v5

    goto :goto_12

    :cond_11
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La/x1;->e([Ljava/lang/Object;)V

    :goto_12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "/2 ("

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-lez v9, :cond_14

    add-int/2addr v4, v5

    goto :goto_13

    :catchall_4
    move-exception v0

    const-string v3, "[HideSnsInteraction] timeline FAILED"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    goto :goto_13

    :cond_12
    iget-object v0, v0, La/gd;->c:La/j6;

    if-eqz v0, :cond_13

    iget-object v6, v0, La/j6;->c:Ljava/lang/String;

    :cond_13
    const-string v0, "[HideSnsInteraction] sns_info_model resolve FAILED: "

    invoke-static {v0, v6}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_14
    :goto_13
    :try_start_9
    const-string v0, "com.tencent.mm.plugin.sns.ui.rm"

    const-string v3, "com.tencent.mm.plugin.sns.ui.bm"

    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v9, v13

    :cond_15
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v6, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v6, v3}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-nez v6, :cond_16

    goto :goto_14

    :cond_16
    :goto_15
    if-eqz v6, :cond_19

    if-nez v9, :cond_19

    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-static {v8}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v8

    :cond_17
    invoke-virtual {v8}, La/G1;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v8}, La/G1;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/reflect/Method;

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    invoke-static {v11, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v11

    if-nez v11, :cond_17

    const-class v11, Landroid/database/Cursor;

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-virtual {v2, v10}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v8

    new-instance v9, La/m2;

    const/4 v11, 0x6

    invoke-direct {v9, v11, v1}, La/m2;-><init>(ILjava/lang/Object;)V

    invoke-interface {v8, v9}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "[HideSnsInteraction] OK snsMsg cursor hook via "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " -> "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    move v9, v5

    goto :goto_16

    :catchall_5
    move-exception v0

    goto :goto_17

    :cond_18
    :goto_16
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    goto :goto_15

    :cond_19
    if-eqz v9, :cond_15

    :cond_1a
    if-nez v9, :cond_1b

    const-string v0, "[HideSnsInteraction] snsMsg: no cursor method found on rm/bm"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_18

    :goto_17
    const-string v2, "[HideSnsInteraction] snsMsg FAILED"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v8, 0x2

    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    move v9, v13

    :cond_1b
    :goto_18
    if-eqz v9, :cond_1c

    add-int/2addr v4, v5

    :cond_1c
    const-string v0, "[HideSnsInteraction] registered "

    const-string v2, "/6 OK"

    invoke-static {v4, v0, v2}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "registered="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/6"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "F007"

    const-string v3, "snsInteraction"

    invoke-static {v2, v3, v0}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
