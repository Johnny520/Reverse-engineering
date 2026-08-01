.class public abstract Lr0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/Map;

.field public static volatile b:Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

.field public static volatile c:Z

.field public static volatile d:J

.field public static volatile e:Lg0;

.field public static volatile f:Landroid/content/Context;

.field public static volatile g:Lj0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lr0;->a:Ljava/util/Map;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Lm0;Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-object p1, p0, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/view/ViewGroup;

    .line 10
    .line 11
    iget-object v0, p0, Lm0;->c:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lr0;->g:Lj0;

    .line 18
    .line 19
    if-eqz p1, :cond_4

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :try_start_0
    iget-object v2, v1, Lj0;->f:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v2, v1, Lj0;->b:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget-object v2, v1, Lj0;->c:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v0, 0x0

    .line 50
    :goto_0
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-static {p1}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object v2, p0, Lm0;->d:Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    if-ne v2, v0, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {p0, v0, v1}, Lr0;->o(Lm0;Ljava/lang/Object;Lj0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_1
    invoke-static {p1}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 74
    .line 75
    .line 76
    const-string p1, "message-status-row"

    .line 77
    .line 78
    const-string v0, "validate-attached"

    .line 79
    .line 80
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_2
    return-void
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v1, :cond_3

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    if-ne v5, p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    if-nez v2, :cond_1

    .line 30
    .line 31
    move-object v2, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "multiple "

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, " fields in "

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const/4 p0, 0x1

    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, " field in "

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0
.end method

.method public static c(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Lq0;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    check-cast v0, Lq0;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance v0, Lq0;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x1

    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    :cond_2
    move v1, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_3
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 41
    .line 42
    and-int/lit8 v1, v1, 0x30

    .line 43
    .line 44
    if-ne v1, v3, :cond_2

    .line 45
    .line 46
    move v1, v2

    .line 47
    :goto_1
    iget-boolean v5, v0, Lq0;->b:Z

    .line 48
    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    iget-boolean v5, v0, Lq0;->a:Z

    .line 52
    .line 53
    if-ne v5, v1, :cond_4

    .line 54
    .line 55
    :goto_2
    return-void

    .line 56
    :cond_4
    iput-boolean v1, v0, Lq0;->a:Z

    .line 57
    .line 58
    iput-boolean v2, v0, Lq0;->b:Z

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    const/16 v0, 0x22

    .line 66
    .line 67
    const/16 v2, 0x26

    .line 68
    .line 69
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    const/4 v0, -0x1

    .line 75
    :goto_3
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 84
    .line 85
    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    const/16 v1, 0xaa

    .line 89
    .line 90
    const/16 v2, 0xb2

    .line 91
    .line 92
    const/16 v3, 0xe0

    .line 93
    .line 94
    const/16 v4, 0xa6

    .line 95
    .line 96
    invoke-static {v3, v4, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    const/16 v1, 0x7a

    .line 102
    .line 103
    const/16 v2, 0x84

    .line 104
    .line 105
    const/16 v3, 0xe6

    .line 106
    .line 107
    const/16 v4, 0x76

    .line 108
    .line 109
    invoke-static {v3, v4, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    :goto_4
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const/high16 v2, 0x41100000    # 9.0f

    .line 121
    .line 122
    invoke-static {v1, v2}, Lr0;->f(Landroid/content/Context;F)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    int-to-float v1, v1

    .line 127
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-virtual {p0, v0}, Landroid/view/View;->setElevation(F)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static d()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lr0;->a:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    monitor-enter v1

    .line 18
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 19
    .line 20
    .line 21
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lm0;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget-object v3, v2, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v4, v2, Lm0;->j:Ll0;

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-static {v2}, Lr0;->h(Lm0;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    return-void

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    throw v0

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    throw v0
.end method

.method public static e(Lp0;)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lp0;->c:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    iget-object v1, p0, Lp0;->b:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, Lp0;->e:Landroid/widget/FrameLayout;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lp0;->h:Lo0;

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    const-string v0, "message-status-row"

    .line 41
    .line 42
    const-string v1, "remove-row-overlay"

    .line 43
    .line 44
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public static f(Landroid/content/Context;F)I
    .locals 1

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    :goto_0
    add-float/2addr p1, v0

    .line 6
    float-to-int p0, p1

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    mul-float/2addr p1, p0

    .line 19
    goto :goto_0
.end method

.method public static g(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v0, :cond_3

    .line 11
    .line 12
    aget-object v5, p0, v3

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    const-string v7, "handleUIState"

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-eqz v7, :cond_2

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne v7, v8, :cond_2

    .line 37
    .line 38
    array-length v7, v6

    .line 39
    if-ne v7, v4, :cond_2

    .line 40
    .line 41
    aget-object v4, v6, v2

    .line 42
    .line 43
    if-ne v4, p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    if-nez v1, :cond_1

    .line 57
    .line 58
    move-object v1, v5

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 61
    .line 62
    const-string p1, "multiple handleUIState(MviUIState) methods"

    .line 63
    .line 64
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_4
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 78
    .line 79
    const-string p1, "handleUIState(MviUIState)"

    .line 80
    .line 81
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0
.end method

.method public static h(Lm0;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lm0;->i:Lp0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lm0;->i:Lp0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Lr0;->e(Lp0;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    return-void
.end method

.method public static i(Ljava/lang/Object;Lj0;)Lk0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lk0;

    .line 8
    .line 9
    const-wide/16 v10, 0x0

    .line 10
    .line 11
    const-wide/16 v12, 0x0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, ""

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const-string v9, ""

    .line 23
    .line 24
    invoke-direct/range {v0 .. v13}, Lk0;-><init>(ILjava/lang/String;JJJLjava/lang/String;JJ)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-object v2, v1, Lj0;->i:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    iget-object v2, v1, Lj0;->j:Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v4, ""

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    move-object v6, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v6, v2

    .line 58
    :goto_0
    iget-object v2, v1, Lj0;->k:Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    iget-object v2, v1, Lj0;->l:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    iget-object v2, v1, Lj0;->m:Ljava/lang/reflect/Method;

    .line 83
    .line 84
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    iget-object v2, v1, Lj0;->n:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-nez v2, :cond_2

    .line 101
    .line 102
    move-object v2, v4

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-nez v13, :cond_4

    .line 113
    .line 114
    iget-object v2, v1, Lj0;->o:Ljava/lang/reflect/Method;

    .line 115
    .line 116
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-nez v2, :cond_3

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    :goto_2
    move-object v13, v4

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move-object v13, v2

    .line 130
    :goto_3
    iget-object v2, v1, Lj0;->p:Ljava/lang/reflect/Method;

    .line 131
    .line 132
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v14

    .line 142
    iget-object v1, v1, Lj0;->q:Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    instance-of v1, v0, Ljava/lang/Number;

    .line 149
    .line 150
    const-wide/16 v2, 0x0

    .line 151
    .line 152
    if-nez v1, :cond_6

    .line 153
    .line 154
    :cond_5
    :goto_4
    move-wide/from16 v16, v2

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_6
    check-cast v0, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    const-wide v16, 0xe8d4a51000L

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    cmp-long v4, v0, v16

    .line 169
    .line 170
    if-ltz v4, :cond_7

    .line 171
    .line 172
    const-wide v16, 0x3bb2cc3d800L

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    cmp-long v4, v0, v16

    .line 178
    .line 179
    if-gtz v4, :cond_7

    .line 180
    .line 181
    move-wide/from16 v16, v0

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_7
    const-wide/32 v16, 0x3b9aca00

    .line 185
    .line 186
    .line 187
    cmp-long v4, v0, v16

    .line 188
    .line 189
    if-ltz v4, :cond_5

    .line 190
    .line 191
    const-wide v16, 0xf4865700L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    cmp-long v4, v0, v16

    .line 197
    .line 198
    if-gtz v4, :cond_5

    .line 199
    .line 200
    const-wide/16 v2, 0x3e8

    .line 201
    .line 202
    mul-long/2addr v2, v0

    .line 203
    goto :goto_4

    .line 204
    :goto_5
    new-instance v4, Lk0;

    .line 205
    .line 206
    invoke-direct/range {v4 .. v17}, Lk0;-><init>(ILjava/lang/String;JJJLjava/lang/String;JJ)V

    .line 207
    .line 208
    .line 209
    return-object v4
.end method

.method public static declared-synchronized j(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "message status row hooked: "

    .line 2
    .line 3
    const-class v1, Lr0;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-boolean v2, Lr0;->c:Z

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lr0;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v1

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :try_start_1
    invoke-static {p0}, Lj0;->a(Ljava/lang/ClassLoader;)Lj0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"

    .line 26
    .line 27
    invoke-static {p0, v3}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "com.tencent.mvi.base.mvi.MviUIState"

    .line 32
    .line 33
    invoke-static {p0, v4}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v3, p0}, Lr0;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v3, Lf0;

    .line 42
    .line 43
    invoke-direct {v3, v2}, Lf0;-><init>(Lj0;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    sput-object v3, Lr0;->b:Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 51
    .line 52
    sput-object v2, Lr0;->g:Lj0;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    sput-boolean v2, Lr0;->c:Z

    .line 56
    .line 57
    invoke-static {}, Lr0;->v()V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lr0;->u()V

    .line 61
    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v3, "."

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string p0, "message status row hooks installed count=1 path=qq93-direct"

    .line 114
    .line 115
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_1
    move-exception p0

    .line 120
    const/4 v0, 0x0

    .line 121
    :try_start_2
    sput-boolean v0, Lr0;->c:Z

    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    sput-object v0, Lr0;->b:Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 125
    .line 126
    sput-object v0, Lr0;->g:Lj0;

    .line 127
    .line 128
    const-string v0, "message-status-row"

    .line 129
    .line 130
    const-string v2, "install-qq93-direct"

    .line 131
    .line 132
    invoke-static {v0, v2, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    const-string p0, "message status row hook skipped reason=qq93 target missing"

    .line 136
    .line 137
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    .line 139
    .line 140
    :goto_0
    monitor-exit v1

    .line 141
    return-void

    .line 142
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 143
    throw p0
.end method

.method public static declared-synchronized k()V
    .locals 6

    .line 1
    const-class v0, Lr0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr0;->e:Lg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    move-object v1, v2

    .line 25
    :cond_2
    new-instance v2, Lg0;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/content/BroadcastReceiver;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    .line 29
    .line 30
    :try_start_3
    new-instance v3, Landroid/content/IntentFilter;

    .line 31
    .line 32
    const-string v4, "com.mr.elaris.action.ANTI_RECALL_STATUS_CHANGED"

    .line 33
    .line 34
    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v5, 0x21

    .line 40
    .line 41
    if-lt v4, v5, :cond_3

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    :goto_0
    sput-object v1, Lr0;->f:Landroid/content/Context;

    .line 54
    .line 55
    sput-object v2, Lr0;->e:Lg0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :goto_1
    :try_start_4
    const-string v2, "message-status-row"

    .line 59
    .line 60
    const-string v3, "register-status-receiver"

    .line 61
    .line 62
    invoke-static {v2, v3, v1}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    .line 64
    .line 65
    :goto_2
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :catchall_1
    move-exception v1

    .line 68
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 69
    throw v1
.end method

.method public static l(Lm0;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lm0;->i:Lp0;

    .line 4
    .line 5
    if-eqz v1, :cond_11

    .line 6
    .line 7
    iget-object v0, v0, Lm0;->e:Lk0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Lp0;->a:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    iget-object v2, v1, Lp0;->g:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v3, v1, Lp0;->f:Landroid/widget/TextView;

    .line 18
    .line 19
    iget-boolean v4, v1, Lp0;->d:Z

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    iget-object v5, v1, Lp0;->b:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Landroid/view/ViewGroup;

    .line 34
    .line 35
    iget-object v6, v1, Lp0;->c:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Landroid/view/ViewGroup;

    .line 42
    .line 43
    iget-object v7, v1, Lp0;->e:Landroid/widget/FrameLayout;

    .line 44
    .line 45
    if-eqz v0, :cond_11

    .line 46
    .line 47
    if-eqz v5, :cond_11

    .line 48
    .line 49
    if-eqz v6, :cond_11

    .line 50
    .line 51
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    const/high16 v9, 0x40000000    # 2.0f

    .line 64
    .line 65
    invoke-static {v8, v9}, Lr0;->f(Landroid/content/Context;F)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    :goto_0
    if-eqz v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    :goto_1
    if-lez v9, :cond_11

    .line 92
    .line 93
    if-gtz v10, :cond_4

    .line 94
    .line 95
    goto/16 :goto_8

    .line 96
    .line 97
    :cond_4
    sget-object v11, Lyc;->a:Ljava/util/Map;

    .line 98
    .line 99
    const/4 v11, 0x0

    .line 100
    move v12, v11

    .line 101
    move v13, v12

    .line 102
    :goto_2
    if-eqz v6, :cond_9

    .line 103
    .line 104
    const/16 v14, 0xa

    .line 105
    .line 106
    if-ge v12, v14, :cond_9

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/view/View;->getScaleX()F

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    const/4 v15, 0x0

    .line 113
    cmpg-float v14, v14, v15

    .line 114
    .line 115
    if-gez v14, :cond_5

    .line 116
    .line 117
    xor-int/lit8 v13, v13, 0x1

    .line 118
    .line 119
    :cond_5
    invoke-virtual {v6}, Landroid/view/View;->getRotationY()F

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    const/high16 v16, 0x43b40000    # 360.0f

    .line 124
    .line 125
    rem-float v14, v14, v16

    .line 126
    .line 127
    cmpg-float v15, v14, v15

    .line 128
    .line 129
    if-gez v15, :cond_6

    .line 130
    .line 131
    add-float v14, v14, v16

    .line 132
    .line 133
    :cond_6
    const/high16 v15, 0x42b40000    # 90.0f

    .line 134
    .line 135
    cmpl-float v15, v14, v15

    .line 136
    .line 137
    if-lez v15, :cond_7

    .line 138
    .line 139
    const/high16 v15, 0x43870000    # 270.0f

    .line 140
    .line 141
    cmpg-float v14, v14, v15

    .line 142
    .line 143
    if-gez v14, :cond_7

    .line 144
    .line 145
    xor-int/lit8 v13, v13, 0x1

    .line 146
    .line 147
    :cond_7
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    instance-of v14, v6, Landroid/view/View;

    .line 152
    .line 153
    if-eqz v14, :cond_8

    .line 154
    .line 155
    check-cast v6, Landroid/view/View;

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    const/4 v6, 0x0

    .line 159
    :goto_3
    add-int/lit8 v12, v12, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    if-eqz v13, :cond_a

    .line 163
    .line 164
    const/high16 v6, -0x40800000    # -1.0f

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_a
    const/high16 v6, 0x3f800000    # 1.0f

    .line 168
    .line 169
    :goto_4
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    iget-boolean v14, v1, Lp0;->i:Z

    .line 182
    .line 183
    if-nez v14, :cond_b

    .line 184
    .line 185
    iget v14, v1, Lp0;->j:I

    .line 186
    .line 187
    if-ne v14, v9, :cond_b

    .line 188
    .line 189
    iget v14, v1, Lp0;->k:I

    .line 190
    .line 191
    if-ne v14, v10, :cond_b

    .line 192
    .line 193
    iget v14, v1, Lp0;->l:I

    .line 194
    .line 195
    if-ne v14, v12, :cond_b

    .line 196
    .line 197
    iget v14, v1, Lp0;->m:I

    .line 198
    .line 199
    if-ne v14, v13, :cond_b

    .line 200
    .line 201
    iget v14, v1, Lp0;->n:I

    .line 202
    .line 203
    if-ne v14, v5, :cond_b

    .line 204
    .line 205
    iget v14, v1, Lp0;->o:F

    .line 206
    .line 207
    invoke-static {v14, v6}, Ljava/lang/Float;->compare(FF)I

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    if-nez v14, :cond_b

    .line 212
    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :cond_b
    invoke-virtual {v7, v6}, Landroid/view/View;->setScaleX(F)V

    .line 216
    .line 217
    .line 218
    const/high16 v14, 0x40000000    # 2.0f

    .line 219
    .line 220
    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    invoke-virtual {v7, v15, v14}, Landroid/view/View;->measure(II)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v11, v11, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    const/high16 v14, -0x80000000

    .line 239
    .line 240
    if-nez v7, :cond_d

    .line 241
    .line 242
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    invoke-static {v7, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 255
    .line 256
    .line 257
    move-result v15

    .line 258
    invoke-virtual {v3, v7, v15}, Landroid/view/View;->measure(II)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    if-eqz v4, :cond_c

    .line 270
    .line 271
    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 276
    .line 277
    .line 278
    move-result v16

    .line 279
    invoke-static {v11, v7}, Ljava/lang/Math;->max(II)I

    .line 280
    .line 281
    .line 282
    move-result v17

    .line 283
    sub-int v16, v16, v17

    .line 284
    .line 285
    sub-int v11, v16, v14

    .line 286
    .line 287
    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    move-object/from16 v16, v0

    .line 292
    .line 293
    const/4 v0, 0x0

    .line 294
    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    .line 295
    .line 296
    .line 297
    move-result v18

    .line 298
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    .line 299
    .line 300
    .line 301
    move-result v19

    .line 302
    sub-int v18, v18, v19

    .line 303
    .line 304
    sub-int v0, v18, v14

    .line 305
    .line 306
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    new-instance v14, Lq2;

    .line 311
    .line 312
    invoke-direct {v14, v11, v0}, Lq2;-><init>(II)V

    .line 313
    .line 314
    .line 315
    move/from16 v18, v4

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_c
    move-object/from16 v16, v0

    .line 319
    .line 320
    move v0, v11

    .line 321
    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 330
    .line 331
    .line 332
    move-result v17

    .line 333
    sub-int v14, v14, v17

    .line 334
    .line 335
    sub-int/2addr v14, v11

    .line 336
    invoke-static {v11, v14}, Ljava/lang/Math;->max(II)I

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    invoke-static {v0, v13}, Ljava/lang/Math;->max(II)I

    .line 341
    .line 342
    .line 343
    move-result v18

    .line 344
    sub-int v18, v18, v17

    .line 345
    .line 346
    sub-int v0, v18, v11

    .line 347
    .line 348
    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    const/4 v14, 0x0

    .line 357
    invoke-static {v14, v12}, Ljava/lang/Math;->max(II)I

    .line 358
    .line 359
    .line 360
    move-result v17

    .line 361
    move/from16 v18, v4

    .line 362
    .line 363
    add-int v4, v17, v11

    .line 364
    .line 365
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 366
    .line 367
    .line 368
    move-result v19

    .line 369
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 370
    .line 371
    .line 372
    move-result v20

    .line 373
    sub-int v19, v19, v20

    .line 374
    .line 375
    sub-int v11, v19, v11

    .line 376
    .line 377
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    new-instance v14, Lq2;

    .line 382
    .line 383
    invoke-direct {v14, v0, v4}, Lq2;-><init>(II)V

    .line 384
    .line 385
    .line 386
    :goto_5
    iget v0, v14, Lq2;->a:I

    .line 387
    .line 388
    iget v4, v14, Lq2;->b:I

    .line 389
    .line 390
    add-int/2addr v7, v0

    .line 391
    add-int/2addr v15, v4

    .line 392
    invoke-virtual {v3, v0, v4, v7, v15}, Landroid/view/View;->layout(IIII)V

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_d
    move-object/from16 v16, v0

    .line 397
    .line 398
    move/from16 v18, v4

    .line 399
    .line 400
    :goto_6
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_10

    .line 405
    .line 406
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getWidth()I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    const/4 v14, 0x0

    .line 411
    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v18, :cond_e

    .line 416
    .line 417
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    :cond_e
    invoke-static {v14, v3}, Ljava/lang/Math;->max(II)I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    const/high16 v3, -0x80000000

    .line 430
    .line 431
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    invoke-static {v14, v10}, Ljava/lang/Math;->max(II)I

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    invoke-virtual {v2, v0, v3}, Landroid/view/View;->measure(II)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v18, :cond_f

    .line 455
    .line 456
    invoke-static {v14, v8}, Ljava/lang/Math;->max(II)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    sub-int/2addr v7, v8

    .line 469
    sub-int/2addr v7, v4

    .line 470
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 471
    .line 472
    .line 473
    move-result v7

    .line 474
    new-instance v8, Lq2;

    .line 475
    .line 476
    invoke-direct {v8, v7, v4}, Lq2;-><init>(II)V

    .line 477
    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_f
    invoke-static {v14, v8}, Ljava/lang/Math;->max(II)I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 489
    .line 490
    .line 491
    move-result v8

    .line 492
    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    .line 493
    .line 494
    .line 495
    move-result v11

    .line 496
    sub-int/2addr v11, v8

    .line 497
    sub-int/2addr v11, v4

    .line 498
    sub-int/2addr v7, v8

    .line 499
    sub-int/2addr v7, v4

    .line 500
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 501
    .line 502
    .line 503
    move-result v7

    .line 504
    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    .line 505
    .line 506
    .line 507
    move-result v7

    .line 508
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    add-int v8, v12, v4

    .line 513
    .line 514
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    new-instance v8, Lq2;

    .line 519
    .line 520
    invoke-direct {v8, v7, v4}, Lq2;-><init>(II)V

    .line 521
    .line 522
    .line 523
    :goto_7
    iget v4, v8, Lq2;->a:I

    .line 524
    .line 525
    iget v7, v8, Lq2;->b:I

    .line 526
    .line 527
    add-int/2addr v0, v4

    .line 528
    add-int/2addr v3, v7

    .line 529
    invoke-virtual {v2, v4, v7, v0, v3}, Landroid/view/View;->layout(IIII)V

    .line 530
    .line 531
    .line 532
    :cond_10
    iput v9, v1, Lp0;->j:I

    .line 533
    .line 534
    iput v10, v1, Lp0;->k:I

    .line 535
    .line 536
    iput v12, v1, Lp0;->l:I

    .line 537
    .line 538
    iput v13, v1, Lp0;->m:I

    .line 539
    .line 540
    iput v5, v1, Lp0;->n:I

    .line 541
    .line 542
    iput v6, v1, Lp0;->o:F

    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    iput-boolean v14, v1, Lp0;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    .line 547
    return-void

    .line 548
    :catchall_0
    move-exception v0

    .line 549
    const-string v1, "message-status-row"

    .line 550
    .line 551
    const-string v2, "layout-row-overlay"

    .line 552
    .line 553
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    :cond_11
    :goto_8
    return-void
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lk0;Ln0;)Lm0;
    .locals 9

    .line 1
    sget-object v1, Lr0;->a:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lm0;

    .line 9
    .line 10
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v2, Lm0;

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    move-object v4, p1

    .line 17
    move-object v5, p2

    .line 18
    move-object v6, p3

    .line 19
    move-object v7, p4

    .line 20
    move-object v8, p5

    .line 21
    invoke-direct/range {v2 .. v8}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lk0;Ln0;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v2, Lm0;->j:Ll0;

    .line 25
    .line 26
    invoke-virtual {v5, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 27
    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_1
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    monitor-exit v1

    .line 34
    return-object v2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p0

    .line 39
    :cond_0
    move-object v3, p0

    .line 40
    move-object v4, p1

    .line 41
    move-object v6, p3

    .line 42
    move-object v7, p4

    .line 43
    move-object v8, p5

    .line 44
    iget-object p0, v0, Lm0;->b:Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    if-ne p0, v6, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v0}, Lr0;->h(Lm0;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-direct {p0, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p0, v0, Lm0;->b:Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-direct {p0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object p0, v0, Lm0;->c:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    invoke-direct {p0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput-object p0, v0, Lm0;->d:Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    iput-object v7, v0, Lm0;->e:Lk0;

    .line 82
    .line 83
    iget-boolean p0, v8, Ln0;->b:Z

    .line 84
    .line 85
    iput-boolean p0, v0, Lm0;->f:Z

    .line 86
    .line 87
    iget p0, v8, Ln0;->a:I

    .line 88
    .line 89
    iput p0, v0, Lm0;->g:I

    .line 90
    .line 91
    iget-object p0, v8, Ln0;->c:Ljava/io/Serializable;

    .line 92
    .line 93
    check-cast p0, Ljava/lang/String;

    .line 94
    .line 95
    iput-object p0, v0, Lm0;->h:Ljava/lang/String;

    .line 96
    .line 97
    return-object v0

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    move-object p0, v0

    .line 100
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    throw p0
.end method

.method public static n(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const-string v0, "chat_message_corner_time"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "eq_message_guard"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    if-eqz v0, :cond_2

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, Lr0;->j(Ljava/lang/ClassLoader;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-static {}, Lr0;->v()V

    .line 29
    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-static {}, Lr0;->p()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lr0;->u()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    invoke-static {}, Lr0;->d()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static o(Lm0;Ljava/lang/Object;Lj0;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Lj0;->h:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v3, v2}, Lr0;->i(Ljava/lang/Object;Lj0;)Lk0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v0, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-virtual {v2}, Lk0;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_6

    .line 31
    .line 32
    iget-object v4, v0, Lm0;->e:Lk0;

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    iget v5, v2, Lk0;->a:I

    .line 37
    .line 38
    iget-object v6, v2, Lk0;->b:Ljava/lang/String;

    .line 39
    .line 40
    iget-wide v7, v2, Lk0;->c:J

    .line 41
    .line 42
    iget-wide v9, v2, Lk0;->d:J

    .line 43
    .line 44
    iget-wide v11, v2, Lk0;->e:J

    .line 45
    .line 46
    iget-object v13, v2, Lk0;->f:Ljava/lang/String;

    .line 47
    .line 48
    iget v14, v4, Lk0;->a:I

    .line 49
    .line 50
    iget-object v15, v4, Lk0;->b:Ljava/lang/String;

    .line 51
    .line 52
    move-wide/from16 v16, v7

    .line 53
    .line 54
    iget-wide v7, v4, Lk0;->c:J

    .line 55
    .line 56
    move-wide/from16 v18, v7

    .line 57
    .line 58
    iget-wide v7, v4, Lk0;->d:J

    .line 59
    .line 60
    move-wide/from16 v20, v7

    .line 61
    .line 62
    iget-wide v7, v4, Lk0;->e:J

    .line 63
    .line 64
    iget-object v4, v4, Lk0;->f:Ljava/lang/String;

    .line 65
    .line 66
    if-ne v5, v14, :cond_6

    .line 67
    .line 68
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_0
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    cmp-long v14, v9, v5

    .line 79
    .line 80
    if-lez v14, :cond_1

    .line 81
    .line 82
    cmp-long v14, v20, v5

    .line 83
    .line 84
    if-lez v14, :cond_1

    .line 85
    .line 86
    cmp-long v9, v9, v20

    .line 87
    .line 88
    if-nez v9, :cond_1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    cmp-long v9, v16, v5

    .line 92
    .line 93
    if-lez v9, :cond_6

    .line 94
    .line 95
    cmp-long v9, v16, v18

    .line 96
    .line 97
    if-eqz v9, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    cmp-long v9, v11, v5

    .line 101
    .line 102
    const-wide v14, 0xffffffffL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    const-wide/32 v16, -0x80000000

    .line 108
    .line 109
    .line 110
    if-gez v9, :cond_3

    .line 111
    .line 112
    cmp-long v9, v11, v16

    .line 113
    .line 114
    if-ltz v9, :cond_3

    .line 115
    .line 116
    and-long/2addr v11, v14

    .line 117
    :cond_3
    cmp-long v9, v7, v5

    .line 118
    .line 119
    if-gez v9, :cond_4

    .line 120
    .line 121
    cmp-long v9, v7, v16

    .line 122
    .line 123
    if-ltz v9, :cond_4

    .line 124
    .line 125
    and-long/2addr v7, v14

    .line 126
    :cond_4
    cmp-long v9, v11, v5

    .line 127
    .line 128
    if-lez v9, :cond_5

    .line 129
    .line 130
    cmp-long v5, v7, v5

    .line 131
    .line 132
    if-lez v5, :cond_5

    .line 133
    .line 134
    cmp-long v5, v11, v7

    .line 135
    .line 136
    if-nez v5, :cond_5

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-lez v5, :cond_6

    .line 144
    .line 145
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_6

    .line 150
    .line 151
    :goto_0
    const-string v3, "eq_message_guard"

    .line 152
    .line 153
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {v2, v3}, Lr0;->t(Lk0;Z)Ln0;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 162
    .line 163
    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iput-object v4, v0, Lm0;->d:Ljava/lang/ref/WeakReference;

    .line 167
    .line 168
    iput-object v2, v0, Lm0;->e:Lk0;

    .line 169
    .line 170
    iget-boolean v1, v3, Ln0;->b:Z

    .line 171
    .line 172
    iput-boolean v1, v0, Lm0;->f:Z

    .line 173
    .line 174
    iget v1, v3, Ln0;->a:I

    .line 175
    .line 176
    iput v1, v0, Lm0;->g:I

    .line 177
    .line 178
    iget-object v1, v3, Ln0;->c:Ljava/io/Serializable;

    .line 179
    .line 180
    check-cast v1, Ljava/lang/String;

    .line 181
    .line 182
    iput-object v1, v0, Lm0;->h:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v0}, Lr0;->r(Lm0;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_6
    :goto_1
    if-eqz v3, :cond_7

    .line 189
    .line 190
    invoke-static {v3}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    return-void
.end method

.method public static p()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lr0;->a:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v1, v2, :cond_5

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lm0;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    iget-object v3, v2, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/view/ViewGroup;

    .line 40
    .line 41
    iget-object v4, v2, Lm0;->c:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    sget-object v5, Lr0;->g:Lj0;

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    :try_start_1
    iget-object v6, v5, Lj0;->f:Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-virtual {v6, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-object v6, v5, Lj0;->b:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    iget-object v6, v5, Lj0;->c:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/4 v4, 0x0

    .line 80
    :goto_1
    if-nez v4, :cond_3

    .line 81
    .line 82
    invoke-static {v3}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_0
    move-exception v2

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v2, v4, v5}, Lr0;->o(Lm0;Ljava/lang/Object;Lj0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :goto_2
    invoke-static {v3}, Lr0;->q(Landroid/view/ViewGroup;)V

    .line 93
    .line 94
    .line 95
    const-string v3, "message-status-row"

    .line 96
    .line 97
    const-string v4, "refresh-bound"

    .line 98
    .line 99
    invoke-static {v3, v4, v2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    return-void

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    throw v0
.end method

.method public static q(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    sget-object v0, Lr0;->a:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lm0;

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lm0;->j:Ll0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {p0}, Lr0;->h(Lm0;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p0
.end method

.method public static r(Lm0;)V
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    iget-object v0, v2, Lm0;->e:Lk0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_b

    .line 8
    .line 9
    :cond_0
    const-string v1, "chat_message_corner_time"

    .line 10
    .line 11
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-wide v3, v0, Lk0;->h:J

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    cmp-long v1, v3, v5

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    move v12, v11

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v12, v10

    .line 30
    :goto_0
    const-string v1, "eq_message_guard"

    .line 31
    .line 32
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-boolean v1, v2, Lm0;->f:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move v13, v11

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v13, v10

    .line 45
    :goto_1
    invoke-virtual {v0}, Lk0;->a()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v14, 0x2

    .line 50
    const/4 v1, 0x3

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    if-nez v12, :cond_3

    .line 54
    .line 55
    if-eqz v13, :cond_4

    .line 56
    .line 57
    :cond_3
    move v0, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    move v0, v14

    .line 60
    :goto_2
    if-ne v0, v1, :cond_1b

    .line 61
    .line 62
    iget-object v0, v2, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v3, v0

    .line 69
    check-cast v3, Landroid/view/ViewGroup;

    .line 70
    .line 71
    iget-object v0, v2, Lm0;->b:Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v4, v0

    .line 78
    check-cast v4, Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v3, :cond_1c

    .line 81
    .line 82
    if-nez v4, :cond_5

    .line 83
    .line 84
    goto/16 :goto_b

    .line 85
    .line 86
    :cond_5
    iget-object v0, v2, Lm0;->i:Lp0;

    .line 87
    .line 88
    iget-object v1, v2, Lm0;->d:Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    move v6, v11

    .line 97
    goto :goto_3

    .line 98
    :cond_6
    move v6, v10

    .line 99
    :goto_3
    const-string v15, "\u5df2\u64a4\u56de"

    .line 100
    .line 101
    const-string v16, "\u7ba1\u7406\u5458\u64a4\u56de"

    .line 102
    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    iget-object v1, v0, Lp0;->a:Ljava/lang/ref/WeakReference;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, v3, :cond_7

    .line 112
    .line 113
    iget-object v1, v0, Lp0;->b:Ljava/lang/ref/WeakReference;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-ne v1, v4, :cond_7

    .line 120
    .line 121
    iget-boolean v1, v0, Lp0;->d:Z

    .line 122
    .line 123
    if-eq v1, v6, :cond_b

    .line 124
    .line 125
    :cond_7
    invoke-static {v2}, Lr0;->h(Lm0;)V

    .line 126
    .line 127
    .line 128
    if-eqz v6, :cond_8

    .line 129
    .line 130
    move-object v5, v4

    .line 131
    goto :goto_4

    .line 132
    :cond_8
    move-object v5, v3

    .line 133
    :goto_4
    new-instance v7, Landroid/widget/FrameLayout;

    .line 134
    .line 135
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {v7, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v10}, Landroid/view/View;->setClickable(Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v10}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v8, Landroid/widget/TextView;

    .line 168
    .line 169
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lg1;->a()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 177
    .line 178
    .line 179
    const/high16 v1, 0x41200000    # 10.0f

    .line 180
    .line 181
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 182
    .line 183
    .line 184
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 185
    .line 186
    invoke-virtual {v8, v1, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 193
    .line 194
    .line 195
    const/high16 v9, 0x40800000    # 4.0f

    .line 196
    .line 197
    invoke-static {v0, v9}, Lr0;->f(Landroid/content/Context;F)I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    move/from16 v17, v11

    .line 202
    .line 203
    const/high16 v11, 0x3f800000    # 1.0f

    .line 204
    .line 205
    invoke-static {v0, v11}, Lr0;->f(Landroid/content/Context;F)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {v8, v9, v0, v9, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v10}, Landroid/view/View;->setClickable(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8, v10}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v9, Landroid/widget/TextView;

    .line 232
    .line 233
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 234
    .line 235
    .line 236
    new-instance v11, Lq0;

    .line 237
    .line 238
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v9, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-static/range {v17 .. v17}, Lu9;->x(I)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    if-ne v11, v14, :cond_9

    .line 249
    .line 250
    move-object/from16 v11, v16

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_9
    move-object v11, v15

    .line 254
    :goto_5
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    .line 256
    .line 257
    const/high16 v11, 0x41100000    # 9.0f

    .line 258
    .line 259
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v1, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 266
    .line 267
    .line 268
    move/from16 v1, v17

    .line 269
    .line 270
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 271
    .line 272
    .line 273
    const/16 v1, 0x11

    .line 274
    .line 275
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 276
    .line 277
    .line 278
    const/high16 v1, 0x41900000    # 18.0f

    .line 279
    .line 280
    invoke-static {v0, v1}, Lr0;->f(Landroid/content/Context;F)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 285
    .line 286
    .line 287
    const/high16 v1, 0x40c00000    # 6.0f

    .line 288
    .line 289
    invoke-static {v0, v1}, Lr0;->f(Landroid/content/Context;F)I

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 294
    .line 295
    invoke-static {v0, v14}, Lr0;->f(Landroid/content/Context;F)I

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    invoke-static {v0, v1}, Lr0;->f(Landroid/content/Context;F)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-static {v0, v14}, Lr0;->f(Landroid/content/Context;F)I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v9, v11, v10, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 308
    .line 309
    .line 310
    const/4 v1, 0x0

    .line 311
    invoke-virtual {v9, v1}, Landroid/view/View;->setClickable(Z)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v9, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v9, v1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 318
    .line 319
    .line 320
    const/4 v1, 0x1

    .line 321
    invoke-virtual {v9, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 322
    .line 323
    .line 324
    invoke-static {v9}, Lr0;->c(Landroid/widget/TextView;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 328
    .line 329
    const/4 v1, -0x2

    .line 330
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 334
    .line 335
    .line 336
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 337
    .line 338
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 342
    .line 343
    .line 344
    new-instance v1, Lp0;

    .line 345
    .line 346
    invoke-direct/range {v1 .. v9}, Lp0;-><init>(Lm0;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ZLandroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 347
    .line 348
    .line 349
    :try_start_0
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0, v7}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 354
    .line 355
    .line 356
    iget-object v0, v1, Lp0;->h:Lo0;

    .line 357
    .line 358
    invoke-virtual {v4, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    .line 360
    .line 361
    move-object v0, v1

    .line 362
    goto :goto_6

    .line 363
    :catchall_0
    move-exception v0

    .line 364
    invoke-static {v1}, Lr0;->e(Lp0;)V

    .line 365
    .line 366
    .line 367
    const-string v1, "message-status-row"

    .line 368
    .line 369
    const-string v5, "create-row-overlay"

    .line 370
    .line 371
    invoke-static {v1, v5, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    const/4 v0, 0x0

    .line 375
    :goto_6
    if-nez v0, :cond_a

    .line 376
    .line 377
    goto/16 :goto_b

    .line 378
    .line 379
    :cond_a
    iput-object v0, v2, Lm0;->i:Lp0;

    .line 380
    .line 381
    :cond_b
    if-eqz v12, :cond_f

    .line 382
    .line 383
    iget-object v1, v2, Lm0;->e:Lk0;

    .line 384
    .line 385
    iget-wide v5, v1, Lk0;->h:J

    .line 386
    .line 387
    sget v1, Lg1;->a:I

    .line 388
    .line 389
    const-string v1, "chat_message_corner_time_format"

    .line 390
    .line 391
    const-string v7, "ah:mm"

    .line 392
    .line 393
    invoke-static {v1, v7}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    if-nez v1, :cond_c

    .line 398
    .line 399
    const-string v1, ""

    .line 400
    .line 401
    :cond_c
    sget-object v7, Lg1;->d:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    if-nez v7, :cond_d

    .line 408
    .line 409
    invoke-static {v1}, Lp2;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    sput-object v7, Lg1;->e:Ljava/lang/String;

    .line 414
    .line 415
    sput-object v1, Lg1;->d:Ljava/lang/String;

    .line 416
    .line 417
    :cond_d
    sget-object v1, Lg1;->e:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v5, v6, v1}, Lp2;->a(JLjava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    iget-object v5, v0, Lp0;->f:Landroid/widget/TextView;

    .line 424
    .line 425
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v1, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-nez v5, :cond_e

    .line 434
    .line 435
    iget-object v5, v0, Lp0;->f:Landroid/widget/TextView;

    .line 436
    .line 437
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    .line 439
    .line 440
    const/4 v1, 0x1

    .line 441
    iput-boolean v1, v0, Lp0;->i:Z

    .line 442
    .line 443
    :cond_e
    invoke-static {}, Lg1;->a()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    iget-object v5, v0, Lp0;->f:Landroid/widget/TextView;

    .line 448
    .line 449
    invoke-virtual {v5}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    if-eq v5, v1, :cond_f

    .line 454
    .line 455
    iget-object v5, v0, Lp0;->f:Landroid/widget/TextView;

    .line 456
    .line 457
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 458
    .line 459
    .line 460
    :cond_f
    iget-object v1, v0, Lp0;->f:Landroid/widget/TextView;

    .line 461
    .line 462
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    const/16 v5, 0x8

    .line 467
    .line 468
    if-eqz v12, :cond_10

    .line 469
    .line 470
    const/4 v6, 0x0

    .line 471
    goto :goto_7

    .line 472
    :cond_10
    move v6, v5

    .line 473
    :goto_7
    if-eq v1, v6, :cond_11

    .line 474
    .line 475
    const/4 v1, 0x1

    .line 476
    iput-boolean v1, v0, Lp0;->i:Z

    .line 477
    .line 478
    :cond_11
    iget-object v1, v0, Lp0;->f:Landroid/widget/TextView;

    .line 479
    .line 480
    if-eqz v12, :cond_12

    .line 481
    .line 482
    const/4 v6, 0x0

    .line 483
    goto :goto_8

    .line 484
    :cond_12
    move v6, v5

    .line 485
    :goto_8
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 486
    .line 487
    .line 488
    iget v1, v2, Lm0;->g:I

    .line 489
    .line 490
    invoke-static {v1}, Lu9;->x(I)I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    const/4 v6, 0x2

    .line 495
    if-ne v1, v6, :cond_13

    .line 496
    .line 497
    move-object/from16 v15, v16

    .line 498
    .line 499
    :cond_13
    iget-object v1, v0, Lp0;->g:Landroid/widget/TextView;

    .line 500
    .line 501
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-virtual {v15, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-nez v1, :cond_14

    .line 510
    .line 511
    iget-object v1, v0, Lp0;->g:Landroid/widget/TextView;

    .line 512
    .line 513
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    .line 515
    .line 516
    const/4 v1, 0x1

    .line 517
    iput-boolean v1, v0, Lp0;->i:Z

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_14
    const/4 v1, 0x1

    .line 521
    :goto_9
    iget-object v6, v0, Lp0;->g:Landroid/widget/TextView;

    .line 522
    .line 523
    invoke-static {v6}, Lr0;->c(Landroid/widget/TextView;)V

    .line 524
    .line 525
    .line 526
    iget-object v6, v0, Lp0;->g:Landroid/widget/TextView;

    .line 527
    .line 528
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    if-eqz v13, :cond_15

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    goto :goto_a

    .line 536
    :cond_15
    move v7, v5

    .line 537
    :goto_a
    if-eq v6, v7, :cond_16

    .line 538
    .line 539
    iput-boolean v1, v0, Lp0;->i:Z

    .line 540
    .line 541
    :cond_16
    iget-object v1, v0, Lp0;->g:Landroid/widget/TextView;

    .line 542
    .line 543
    if-eqz v13, :cond_17

    .line 544
    .line 545
    const/4 v5, 0x0

    .line 546
    :cond_17
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Lp0;->e:Landroid/widget/FrameLayout;

    .line 550
    .line 551
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    if-eqz v1, :cond_18

    .line 556
    .line 557
    iget-object v0, v0, Lp0;->e:Landroid/widget/FrameLayout;

    .line 558
    .line 559
    const/4 v1, 0x0

    .line 560
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 561
    .line 562
    .line 563
    :cond_18
    invoke-static {v2}, Lr0;->l(Lm0;)V

    .line 564
    .line 565
    .line 566
    iget-object v0, v2, Lm0;->h:Ljava/lang/String;

    .line 567
    .line 568
    const-string v1, "debug_log"

    .line 569
    .line 570
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-nez v1, :cond_19

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 578
    .line 579
    .line 580
    move-result-wide v1

    .line 581
    sget-wide v5, Lr0;->d:J

    .line 582
    .line 583
    sub-long v5, v1, v5

    .line 584
    .line 585
    const-wide/32 v7, 0xea60

    .line 586
    .line 587
    .line 588
    cmp-long v5, v5, v7

    .line 589
    .line 590
    if-gez v5, :cond_1a

    .line 591
    .line 592
    goto :goto_b

    .line 593
    :cond_1a
    sput-wide v1, Lr0;->d:J

    .line 594
    .line 595
    new-instance v1, Ljava/lang/StringBuilder;

    .line 596
    .line 597
    const-string v2, "message status row hit path=qq93-direct row="

    .line 598
    .line 599
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    const-string v2, " bubble="

    .line 614
    .line 615
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    const-string v2, " time="

    .line 630
    .line 631
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-string v2, " recall="

    .line 638
    .line 639
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    const-string v2, " source="

    .line 646
    .line 647
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_1b
    move v6, v14

    .line 662
    if-ne v0, v6, :cond_1c

    .line 663
    .line 664
    invoke-static {v2}, Lr0;->h(Lm0;)V

    .line 665
    .line 666
    .line 667
    :cond_1c
    :goto_b
    return-void
.end method

.method public static s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public static t(Lk0;Z)Ln0;
    .locals 14

    .line 1
    const-string v0, "none"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    iget v3, p0, Lk0;->a:I

    .line 7
    .line 8
    iget-object v4, p0, Lk0;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-wide v5, p0, Lk0;->c:J

    .line 11
    .line 12
    iget-wide v7, p0, Lk0;->d:J

    .line 13
    .line 14
    iget-wide v9, p0, Lk0;->e:J

    .line 15
    .line 16
    iget-object v11, p0, Lk0;->f:Ljava/lang/String;

    .line 17
    .line 18
    sget-object p1, Lc0;->a:[Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v12

    .line 24
    sget-object v2, Lc0;->b:Lt0;

    .line 25
    .line 26
    invoke-virtual/range {v2 .. v13}, Lt0;->d(ILjava/lang/String;JJJLjava/lang/String;J)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    sget-object v2, Lc0;->c:Le0;

    .line 31
    .line 32
    iget-object v2, v2, Le0;->a:Lt0;

    .line 33
    .line 34
    invoke-virtual/range {v2 .. v13}, Lt0;->d(ILjava/lang/String;JJJLjava/lang/String;J)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {p1, v2}, Lu9;->B(II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    new-instance p0, Ln0;

    .line 45
    .line 46
    const-string v0, "verified-event"

    .line 47
    .line 48
    invoke-direct {p0, v0, p1}, Ln0;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    iget-wide p0, p0, Lk0;->g:J

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    cmp-long p0, p0, v2

    .line 57
    .line 58
    if-lez p0, :cond_1

    .line 59
    .line 60
    new-instance p0, Ln0;

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    const-string v0, "record"

    .line 64
    .line 65
    invoke-direct {p0, v0, p1}, Ln0;-><init>(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    new-instance p0, Ln0;

    .line 70
    .line 71
    invoke-direct {p0, v0, v1}, Ln0;-><init>(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_2
    new-instance p0, Ln0;

    .line 76
    .line 77
    invoke-direct {p0, v0, v1}, Ln0;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method

.method public static u()V
    .locals 3

    .line 1
    sget-boolean v0, Lr0;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v0, "eq_message_guard"

    .line 6
    .line 7
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-instance v1, Li0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v0, v2}, Li0;-><init>(II)V

    .line 22
    .line 23
    .line 24
    const-string v0, "Elaris-anti-recall-status-cache"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static declared-synchronized v()V
    .locals 2

    .line 1
    const-class v0, Lr0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lr0;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "eq_message_guard"

    .line 9
    .line 10
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lr0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v1
.end method
