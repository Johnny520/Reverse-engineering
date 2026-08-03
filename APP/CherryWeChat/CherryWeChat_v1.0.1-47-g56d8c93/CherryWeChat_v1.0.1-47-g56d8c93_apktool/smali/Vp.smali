.class public abstract LVp;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ls1;

    const-class v1, LUp;

    const/16 v2, 0x8

    invoke-direct {v0, v2, v1}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    aget-object v3, v0, v2

    iget-object v4, v3, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v2

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    sget v0, LQv;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, LVp;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "KeyTypeManager constructed with duplicate factories for primitive "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()V
    .locals 7

    sget-object v0, LYp;->c:LYp;

    invoke-static {v0}, LOv;->h(Luu;)V

    sget-object v0, Lq9;->a:Lq9;

    invoke-static {v0}, LOv;->h(Luu;)V

    new-instance v0, Lu1;

    invoke-direct {v0}, Lu1;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, LOv;->f(Lin;Z)V

    sget-object v0, LJk;->a:LIt;

    sget-object v0, Lzs;->b:Lzs;

    sget-object v2, LJk;->a:LIt;

    invoke-virtual {v0, v2}, Lzs;->e(LIt;)V

    sget-object v2, LJk;->b:LHt;

    invoke-virtual {v0, v2}, Lzs;->d(LHt;)V

    sget-object v2, LJk;->c:Lbn;

    invoke-virtual {v0, v2}, Lzs;->c(Lbn;)V

    sget-object v2, LJk;->d:Lan;

    invoke-virtual {v0, v2}, Lzs;->b(Lan;)V

    sget-object v2, Lxs;->b:Lxs;

    sget-object v3, Lu1;->f:Llu;

    invoke-virtual {v2, v3}, Lxs;->b(Llu;)V

    invoke-static {}, LhB;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    new-instance v3, Lu1;

    new-instance v4, Ls1;

    const-class v5, LUp;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v4

    const-class v5, Ln1;

    invoke-direct {v3, v5, v4, v6}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    invoke-static {v3, v1}, LOv;->f(Lin;Z)V

    sget-object v1, Lz1;->a:LIt;

    invoke-virtual {v0, v1}, Lzs;->e(LIt;)V

    sget-object v1, Lz1;->b:LHt;

    invoke-virtual {v0, v1}, Lzs;->d(LHt;)V

    sget-object v1, Lz1;->c:Lbn;

    invoke-virtual {v0, v1}, Lzs;->c(Lbn;)V

    sget-object v1, Lz1;->d:Lan;

    invoke-virtual {v0, v1}, Lzs;->b(Lan;)V

    sget-object v0, Lu1;->e:Llu;

    invoke-virtual {v2, v0}, Lxs;->b(Llu;)V

    return-void
.end method
