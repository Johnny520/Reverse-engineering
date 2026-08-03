.class public abstract Lyd;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ls1;

    const/4 v1, 0x6

    const-class v2, Lxd;

    invoke-direct {v0, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x0

    aget-object v5, v0, v4

    iget-object v6, v5, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v4

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    sget v0, LQv;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    sget-object v0, LAd;->b:LAd;

    invoke-static {v0}, LOv;->h(Luu;)V

    invoke-static {}, LhB;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lu1;

    const-class v3, Lo2;

    new-instance v4, Ls1;

    invoke-direct {v4, v1, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v4}, [Ls1;

    move-result-object v2

    invoke-direct {v0, v3, v2, v1}, Lu1;-><init>(Ljava/lang/Class;[Ls1;I)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, LOv;->f(Lin;Z)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "KeyTypeManager constructed with duplicate factories for primitive "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
