.class public final synthetic Lc0/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lc0/M;->a:I

    iput-object p2, p0, Lc0/M;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const-string v0, "getName(...)"

    const/4 v1, 0x0

    const-string v2, "field"

    const-string v3, "$item"

    const/4 v4, 0x1

    const-string v5, "method"

    const-string v6, "$message"

    const/4 v7, 0x2

    const/4 v8, 0x0

    iget-object v9, p0, Lc0/M;->b:Ljava/lang/Object;

    iget v10, p0, Lc0/M;->a:I

    packed-switch v10, :pswitch_data_0

    check-cast p1, Ljava/lang/reflect/Field;

    const-string v0, "$value"

    invoke-static {v9, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nested"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v9}, Lc0/Z0;->g(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Field;

    invoke-static {v9, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v9}, Lc0/Z0;->g(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lc0/Z0;->a(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    new-instance v2, LE0/k;

    invoke-direct {v2, v7, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lc0/A;

    const/16 v3, 0x10

    invoke-direct {v0, v3}, Lc0/A;-><init>(I)V

    new-instance v3, LV0/e;

    invoke-direct {v3, v2, v8, v0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v0, Lc0/M;

    const/4 v2, 0x5

    invoke-direct {v0, v2, p1}, Lc0/M;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, v0}, LV0/j;->z0(LV0/e;LP0/l;)LV0/e;

    move-result-object p1

    new-instance v0, LV0/d;

    invoke-direct {v0, p1}, LV0/d;-><init>(LV0/e;)V

    :cond_1
    invoke-virtual {v0}, LV0/d;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, LV0/d;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lc0/Z0;->e(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v1, p1

    :cond_2
    :goto_0
    return-object v1

    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Field;

    invoke-static {v9, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v9}, Lc0/Z0;->g(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-static {v9, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-ne v0, v4, :cond_3

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v9, v0, v8

    goto :goto_1

    :cond_3
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v9, v0, v8

    aput-object v1, v0, v4

    :goto_1
    new-instance v1, Lc0/W;

    invoke-direct {v1, p1, v0}, Lc0/W;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    return-object v1

    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-static {v9, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "isLayoutModeOptical"

    invoke-static {v1, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getParameterTypes(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    if-nez v1, :cond_4

    move v1, v4

    goto :goto_2

    :cond_4
    move v1, v8

    :goto_2
    xor-int/2addr v1, v4

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v8

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v8

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    if-eq v1, v4, :cond_5

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    if-ne v1, v7, :cond_6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    sget-object v2, Lc0/a0;->a:Lc0/a0;

    invoke-static {p1}, Lc0/a0;->U(Ljava/lang/reflect/Method;)Z

    move-result p1

    invoke-static {v1, v0, p1}, LU/S;->a0(Ljava/lang/String;IZ)I

    move-result p1

    if-lez p1, :cond_6

    goto :goto_3

    :cond_6
    move v4, v8

    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-static {v9, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    if-gt v4, v1, :cond_7

    const/4 v2, 0x3

    if-ge v1, v2, :cond_7

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v8

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v8

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "send"

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "resend"

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "forward"

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeat"

    invoke-static {v1, v0, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-gt p1, v2, :cond_7

    goto :goto_4

    :cond_7
    move v4, v8

    :cond_8
    :goto_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
