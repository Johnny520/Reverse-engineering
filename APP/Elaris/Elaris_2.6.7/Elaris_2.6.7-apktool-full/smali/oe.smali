.class public final Loe;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/ClassLoader;

.field public final synthetic c:Lv9;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ClassLoader;Lv9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loe;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Loe;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Loe;->c:Lv9;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object p1, Lcom/mr/elaris/w;->a:[Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p0, Loe;->a:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 13
    .line 14
    const-class v1, Ljava/lang/Object;

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    :try_start_0
    const-string v1, "dismiss"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    array-length v3, v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    :cond_2
    :goto_1
    iget-object p1, p0, Loe;->b:Ljava/lang/ClassLoader;

    .line 46
    .line 47
    iget-object p0, p0, Loe;->c:Lv9;

    .line 48
    .line 49
    invoke-static {p1, p0}, Lcom/mr/elaris/w;->b(Ljava/lang/ClassLoader;Lv9;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
