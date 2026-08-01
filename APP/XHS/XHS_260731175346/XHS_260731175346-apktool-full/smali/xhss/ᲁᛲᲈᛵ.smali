.class public final Lxhss/ᲁᛲᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static ᛱᛱᛲᲇ:Landroid/app/Application;

.field public static ᛷᛵᛵᲈ:Lxhss/ᲁᛲᲈᛵ;


# direct methods
.method public static ᛱᛱᛲᲇ()Landroid/app/Activity;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "android.app.ActivityThread"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "currentActivityThread"

    .line 9
    .line 10
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "mActivities"

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/util/ArrayMap;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/util/ArrayMap;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, v3, :cond_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    invoke-virtual {v1}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v5, "paused"

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    const-string v1, "activity"

    .line 79
    .line 80
    invoke-virtual {v4, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    return-object v1

    .line 94
    :catch_0
    move-exception v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-object v0
.end method

.method public static ᛳᲁᲇᛸ(Landroid/content/Context;Lxhss/ᛳᛴᲀᲁ;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/app/Application;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 12
    .line 13
    const-string p0, ">>>"

    .line 14
    .line 15
    const-string p1, "DialogX \u672a\u521d\u59cb\u5316(E1)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 16
    .line 17
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sput-object p0, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 22
    .line 23
    sget-object p1, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲁᛲᲈᛵ;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance p1, Lxhss/ᲁᛲᲈᛵ;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object p1, Lxhss/ᲁᛲᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲁᛲᲈᛵ;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    sget-object p0, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    invoke-static {p0, p1}, Lxhss/ᲁᛲᲈᛵ;->ᛳᲁᲇᛸ(Landroid/content/Context;Lxhss/ᛳᛴᲀᲁ;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public static ᛷᛵᛵᲈ()Landroid/app/Application;
    .locals 4

    .line 1
    const-string v0, "android.app.ActivityThread"

    .line 2
    .line 3
    sget-object v1, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "currentApplication"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/app/Application;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :catch_0
    :try_start_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "currentActivityThread"

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "getApplication"

    .line 41
    .line 42
    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/app/Application;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    return-object v0

    .line 53
    :catch_1
    :try_start_2
    const-string v0, "android.app.AppGlobals"

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v2, "getInitialApplication"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/app/Application;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :catch_2
    return-object v1
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᲇᛲ(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-ne p0, p1, :cond_1

    .line 6
    .line 7
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    sput-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᲁᛴᲁ(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityPreResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᲇᛲ(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_2

    .line 12
    .line 13
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    :goto_0
    if-ltz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-ne v2, p1, :cond_1

    .line 43
    .line 44
    iget-boolean v2, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const v2, 0x64080051

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    instance-of v2, v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    check-cast v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 70
    .line 71
    iget-boolean v2, v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_0

    .line 80
    .line 81
    if-eq p0, v1, :cond_0

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲁᛲᲈᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
