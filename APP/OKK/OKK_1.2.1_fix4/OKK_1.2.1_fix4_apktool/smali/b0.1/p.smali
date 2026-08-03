.class public final Lb0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "receiver"

    invoke-static {p0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, p1

    :goto_0
    const/4 v3, 0x0

    if-ge v0, v2, :cond_5

    aget-object v4, p1, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    array-length v6, v1

    const-string v7, "name"

    invoke-static {v4, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lb0/o;

    invoke-direct {v7, v5, v3}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    invoke-static {v7}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v5

    :cond_0
    invoke-virtual {v5}, LV0/i;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    invoke-virtual {v5}, LV0/i;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v7}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v7

    :cond_1
    invoke-virtual {v7}, LE0/c;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v7}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/reflect/Method;

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v10, v10

    if-ne v10, v6, :cond_1

    invoke-virtual {v9, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_1

    :cond_2
    move-object v9, v3

    :goto_1
    if-nez v9, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :try_start_0
    invoke-virtual {v9, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v9, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_2
    instance-of p1, p0, LD0/f;

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, p0

    :cond_5
    :goto_3
    return-object v3
.end method

.method public static b(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "instance"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lb0/o;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    invoke-static {v2}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v1

    :cond_0
    invoke-virtual {v1}, LV0/i;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, LV0/i;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {v2}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-virtual {v2}, LE0/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    const/4 v4, 0x1

    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    instance-of v5, v4, Ljava/util/List;

    if-nez v5, :cond_3

    invoke-static {v4}, LQ0/q;->b(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :catchall_0
    move-exception v3

    goto :goto_2

    :cond_3
    :goto_1
    new-instance v5, LD0/e;

    invoke-direct {v5, v3, v4}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_0

    :cond_4
    return-object v0
.end method
