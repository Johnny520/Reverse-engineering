.class public final Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

.field public static final 飘花落叶言子楪世苏兰哲:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public 飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;[I)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v1, p0, :cond_7

    .line 12
    .line 13
    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-array v1, v2, [I

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-boolean v0, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Z

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-boolean v1, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v0, v1

    .line 54
    :goto_1
    iget-boolean v3, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object p1, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast p1, Landroid/graphics/PorterDuff$Mode;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    sget-object p1, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏:Landroid/graphics/PorterDuff$Mode;

    .line 64
    .line 65
    :goto_2
    if-eqz v0, :cond_6

    .line 66
    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    invoke-virtual {v0, p2, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {p2, p1}, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰苏哲(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_7
    const-string p0, "ResourceManagerInternal"

    .line 83
    .line 84
    const-string p1, "Mutated drawable is not the same instance as the input."

    .line 85
    .line 86
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static declared-synchronized 飘花落叶言子楪世哲兰苏()V
    .locals 4

    .line 1
    const-class v0, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    invoke-static {}, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲()Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;

    .line 20
    .line 21
    sget-object v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;

    .line 24
    .line 25
    new-instance v2, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v2, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;-><init>(I)V

    .line 29
    .line 30
    .line 31
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    :try_start_1
    iput-object v2, v1, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 39
    :catchall_1
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 44
    throw v1
.end method

.method public static declared-synchronized 飘花落叶言子楪世哲苏兰(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    .line 1
    const-class v0, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰苏哲(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p0
.end method

.method public static declared-synchronized 飘花落叶言子楪世苏哲兰()Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;
    .locals 2

    .line 1
    const-class v0, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    sget-object v1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v1
.end method


# virtual methods
.method public final declared-synchronized 飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;

    .line 3
    .line 4
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method
