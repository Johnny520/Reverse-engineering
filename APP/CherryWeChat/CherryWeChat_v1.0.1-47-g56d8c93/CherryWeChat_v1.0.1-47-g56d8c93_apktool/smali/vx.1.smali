.class public final Lvx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/io/Serializable;

.field public c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;)V
    .locals 6

    .line 1
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lvx;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lvx;->a:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, Lvx;->b:Ljava/io/Serializable;

    .line 13
    iput-object p3, p0, Lvx;->c:Ljava/lang/Object;

    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lvx;->d:Ljava/io/Serializable;

    .line 15
    iput-object p5, p0, Lvx;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 2

    const-wide v0, -0x2b28fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2b2cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2b35fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lvx;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lvx;->b:Ljava/io/Serializable;

    .line 5
    iput-object p3, p0, Lvx;->c:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, Lvx;->d:Ljava/io/Serializable;

    .line 7
    iput-object p5, p0, Lvx;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;I)V
    .locals 6

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const-wide v0, -0x2b3bfffff835L

    .line 8
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x8

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object v4, v0

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_2

    move-object v5, v0

    move-object v1, p1

    move-object v3, p3

    move-object v0, p0

    goto :goto_1

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    .line 9
    :goto_1
    invoke-direct/range {v0 .. v5}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lvx;->b()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lvx;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Ljava/lang/reflect/Field;
    .locals 11

    iget-object v0, p0, Lvx;->b:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/Class;

    iget-object v1, p0, Lvx;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Field;

    if-nez v1, :cond_8

    iget-object v1, p0, Lvx;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lvx;->d:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    const-wide v6, -0x20d27fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    array-length v6, v5

    move v7, v3

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object v2, v8

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lvx;->d:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/Class;

    iget-object v5, p0, Lvx;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    const-wide v7, -0x20d10fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_7

    aget-object v9, v6, v8

    if-eqz v1, :cond_5

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v9, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object v2, v9

    goto :goto_2

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_4

    :goto_2
    iput-object v2, p0, Lvx;->e:Ljava/lang/Object;

    :cond_8
    iget-object v0, p0, Lvx;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x20d0bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, Lvx;->a:Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lvx;->c:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lvx;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Field;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lvx;->b()Ljava/lang/reflect/Field;

    move-result-object v1

    iput-object v1, p0, Lvx;->e:Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lvx;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iget-object v1, p0, Lvx;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x20d06fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget v0, LgG;->a:I

    invoke-static {p1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lvx;->d:Ljava/io/Serializable;

    return-void
.end method
