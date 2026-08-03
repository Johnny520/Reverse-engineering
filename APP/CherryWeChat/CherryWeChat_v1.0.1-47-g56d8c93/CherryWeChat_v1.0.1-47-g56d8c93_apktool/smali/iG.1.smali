.class public final LiG;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/reflect/Method;

.field public d:Lfj;

.field public e:LI7;

.field public f:Lfj;

.field public g:Lfj;

.field public h:Lfj;

.field public i:Lfj;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Class;

    iput-object p1, p0, LiG;->b:Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/reflect/Method;

    iput-object p1, p0, LiG;->c:Ljava/lang/reflect/Method;

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, LiG;->b:Ljava/lang/Class;

    iput-object p1, p0, LiG;->a:Ljava/lang/Object;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lfj;)V
    .locals 2

    const-wide v0, -0x20c21fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LiG;->i:Lfj;

    invoke-virtual {p0}, LiG;->j()V

    return-void
.end method

.method public final b(Lfj;)V
    .locals 2

    const-wide v0, -0x20c18fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LiG;->h:Lfj;

    invoke-virtual {p0}, LiG;->j()V

    return-void
.end method

.method public final varargs c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-wide v0, -0x20cd8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LiG;->a:Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_3

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final varargs d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x20cddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_2
    return-object v1
.end method

.method public final e()Ljava/lang/reflect/Method;
    .locals 13

    const/4 v0, 0x0

    iget-object v1, p0, LiG;->b:Ljava/lang/Class;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v2, p0, LiG;->d:Lfj;

    iget-object v3, p0, LiG;->e:LI7;

    iget-object v4, p0, LiG;->f:Lfj;

    iget-object v5, p0, LiG;->g:Lfj;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v7, 0x0

    :goto_0
    array-length v8, v6

    if-ge v7, v8, :cond_6

    add-int/lit8 v8, v7, 0x1

    :try_start_0
    aget-object v7, v6, v7
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_2

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v9

    const-wide v10, -0x20ce2fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v3, v9}, LI7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move v7, v8

    goto :goto_0

    :cond_2
    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    const-wide v10, -0x20cf5fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v4, v9}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_1

    :cond_4
    const/4 v9, 0x1

    if-nez v5, :cond_5

    invoke-virtual {v7, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_3
    move-object v0, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    const-wide v11, -0x20c82fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v5, v10}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v7, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_3

    :catch_0
    move-exception v0

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_4
    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x20c78fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v3, -0x20c09fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LiG;->f:Lfj;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x20c50fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ls8;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ls8;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, LiG;->f:Lfj;

    return-void
.end method

.method public final varargs g([Ljava/lang/Object;)V
    .locals 2

    const-wide v0, -0x20c5afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LdG;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LdG;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LiG;->g:Lfj;

    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Ls;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p1}, Ls;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LiG;->h:Lfj;

    invoke-virtual {p0}, LiG;->j()V

    return-void
.end method

.method public final i(Ljava/lang/Class;)V
    .locals 3

    const-wide v0, -0x20dbafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LI7;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, LI7;-><init>(ILjava/lang/Class;)V

    const-wide v1, -0x20c45fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iput-object v0, p0, LiG;->e:LI7;

    return-void
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, LiG;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, LeG;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, LeG;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x20c37fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LiG;->b:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v2, -0x20cc9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LiG;->f:Lfj;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
