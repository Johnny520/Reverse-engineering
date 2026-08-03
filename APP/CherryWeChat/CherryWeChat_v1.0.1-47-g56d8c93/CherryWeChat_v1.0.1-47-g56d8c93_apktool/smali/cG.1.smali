.class public abstract LcG;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/LinkedHashMap;

.field public static b:I

.field public static final c:LcA;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const/4 v0, -0x1

    sput v0, LcG;->b:I

    new-instance v0, Ld;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    new-instance v1, LcA;

    invoke-direct {v1, v0}, LcA;-><init>(LUi;)V

    sput-object v1, LcG;->c:LcA;

    return-void
.end method

.method public static a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 2

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LFd;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LgG;->c:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, Lzl;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    :cond_0
    new-instance v0, LbG;

    invoke-direct {v0, v1, p0, p1}, LbG;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    sget-object p1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 2

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LDd;

    invoke-direct {v1, v0}, LDd;-><init>(Ljava/lang/String;)V

    sget-object v0, LgG;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v1, v0}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v1

    :cond_0
    new-instance v0, LbG;

    invoke-direct {v0, v1, p0, p1}, LbG;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    sget-object p1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static c()Ljava/lang/reflect/Method;
    .locals 3

    const-wide v0, -0x2e992fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/reflect/Method;

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static d()Landroid/content/SharedPreferences;
    .locals 1

    sget-object v0, LcG;->c:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static e()Ljava/lang/reflect/Method;
    .locals 3

    const-wide v0, -0x21652fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/reflect/Method;

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static f()Ljava/lang/Class;
    .locals 3

    const-wide v0, -0x21348fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/Class;

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static g()Ljava/lang/reflect/Method;
    .locals 3

    const-wide v0, -0x21786fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/reflect/Method;

    return-object v0

    :cond_1
    return-object v1
.end method
