.class public final Lcom/bumptech/glide/ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile ᛷᛲᲈᛱ:Z

.field public static volatile ᛷᲈᲈᲁ:Lcom/bumptech/glide/ᛲᲈᲁ;


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᛲᲁᲈ;

.field public final ᛲᛳᛶᲁ:Ljava/util/ArrayList;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛷᛸ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᲁᛶᲇᛱ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛳᛵᛸᛱ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᲈᛳᛳᛵ;Lyyds/ᛳᛵᛸᛱ;Lyyds/ᲈᛱᛸᛴ;Lyyds/ᲁᛶᲇᛱ;Lyyds/ᛵᲇᛷᛸ;Lyyds/ᛲᲁᲈ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᛷᛲᲇᲀ;Ljava/util/List;Ljava/util/ArrayList;Lyyds/ᛷᛸ;Lyyds/ᛱᛱᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛶᲇᛱ;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛵᛸᛱ;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛷᛸ;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᲈ;

    .line 20
    .line 21
    iget-object p3, p13, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p3, Ljava/util/Map;

    .line 24
    .line 25
    const-class p4, Lyyds/ᛳᛴᲁᲇ;

    .line 26
    .line 27
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    if-nez p3, :cond_0

    .line 32
    .line 33
    new-instance p7, Lyyds/ᛶᲁᛲᲈ;

    .line 34
    .line 35
    invoke-direct {p7, p0, p11, p12}, Lyyds/ᛶᲁᛲᲈ;-><init>(Lcom/bumptech/glide/ᛲᲈᲁ;Ljava/util/ArrayList;Lyyds/ᛷᛸ;)V

    .line 36
    .line 37
    .line 38
    move-object p11, p10

    .line 39
    move-object p10, p9

    .line 40
    move-object p9, p8

    .line 41
    new-instance p8, Lyyds/ᛱᛵᲈᲁ;

    .line 42
    .line 43
    const/16 p3, 0x12

    .line 44
    .line 45
    invoke-direct {p8, p3}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance p4, Lyyds/ᲇᲈᲁᛷ;

    .line 49
    .line 50
    move-object p12, p2

    .line 51
    move-object p6, p5

    .line 52
    move-object p5, p1

    .line 53
    invoke-direct/range {p4 .. p13}, Lyyds/ᲇᲈᲁᛷ;-><init>(Landroid/content/Context;Lyyds/ᲁᛶᲇᛱ;Lyyds/ᛶᲁᛲᲈ;Lyyds/ᛱᛵᲈᲁ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᛷᛲᲇᲀ;Ljava/util/List;Lyyds/ᲈᛳᛳᛵ;Lyyds/ᛱᛱᛴ;)V

    .line 54
    .line 55
    .line 56
    iput-object p4, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0
.end method

.method public static ᛲᛴᛳᛲ(Landroid/view/View;)Lyyds/ᲁᛷᛲ;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᛵᲇᛷᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "Unable to obtain a request manager for a view without a Context"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/app/Activity;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v0, p0}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_2
    instance-of v1, v1, Landroidx/fragment/app/FragmentActivity;

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v0, p0}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_3
    iget-object p0, v0, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛲᲇᲀ;

    .line 90
    .line 91
    invoke-virtual {p0}, Lyyds/ᛴᲈᛲᛷ;->clear()V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    throw p0
.end method

.method public static ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Glide"

    .line 10
    .line 11
    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/content/Context;

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const/4 v0, 0x5

    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 86
    .line 87
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    const-class v1, Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 95
    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    sget-boolean v2, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 99
    .line 100
    if-nez v2, :cond_1

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    sput-boolean v2, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    :try_start_2
    invoke-static {p0, v0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    :try_start_3
    sput-boolean v2, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    sput-boolean v2, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 114
    .line 115
    throw p0

    .line 116
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "Glide has been called recursively, this is probably an internal library error!"

    .line 119
    .line 120
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_2
    :goto_1
    monitor-exit v1

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_2
    sget-object p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 130
    .line 131
    return-object p0
.end method

.method public static ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᛵᲇᛷᛸ;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲇᛷᛸ;

    .line 11
    .line 12
    return-object p0
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 29

    .line 1
    new-instance v9, Lyyds/ᛷᛲᲇᲀ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v9, v1}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lyyds/ᲈᲇᲇᛷ;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v3}, Lyyds/ᲈᲇᲇᛷ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v8, Lyyds/ᛴᛲᛷᛸ;

    .line 14
    .line 15
    const/16 v0, 0x11

    .line 16
    .line 17
    invoke-direct {v8, v0}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    const-string v0, "Got app info metadata: "

    .line 27
    .line 28
    const-string v5, "ManifestParser"

    .line 29
    .line 30
    const/4 v6, 0x3

    .line 31
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    const-string v7, "Loading Glide modules"

    .line 38
    .line 39
    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    const/16 v13, 0x80

    .line 57
    .line 58
    invoke-virtual {v10, v12, v13}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    if-eqz v10, :cond_5

    .line 63
    .line 64
    iget-object v12, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 65
    .line 66
    if-nez v12, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-eqz v12, :cond_2

    .line 74
    .line 75
    new-instance v12, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    :goto_0
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-eqz v12, :cond_4

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    check-cast v12, Ljava/lang/String;

    .line 116
    .line 117
    const-string v13, "GlideModule"

    .line 118
    .line 119
    iget-object v14, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 120
    .line 121
    invoke-virtual {v14, v12}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    if-nez v13, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-static {v12}, Lyyds/ᲀᛳᛳᛱ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    throw v0

    .line 137
    :cond_4
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    const-string v0, "Finished loading Glide modules"

    .line 144
    .line 145
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    :goto_2
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    const-string v0, "Got null app info metadata"

    .line 156
    .line 157
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_3
    const/4 v10, 0x6

    .line 162
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_6

    .line 167
    .line 168
    const-string v10, "Failed to parse glide modules"

    .line 169
    .line 170
    invoke-static {v5, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_4
    if-eqz p1, :cond_8

    .line 174
    .line 175
    new-instance v0, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_8

    .line 185
    .line 186
    new-instance v0, Ljava/util/HashSet;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-nez v5, :cond_7

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_8
    :goto_5
    const-string v0, "Glide"

    .line 214
    .line 215
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_a

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-nez v5, :cond_9

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_a
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_12

    .line 252
    .line 253
    new-instance v0, Lyyds/ᛳᲁᲀᛷ;

    .line 254
    .line 255
    invoke-direct {v0, v3}, Lyyds/ᛳᲁᲀᛷ;-><init>(I)V

    .line 256
    .line 257
    .line 258
    sget v5, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 259
    .line 260
    const/4 v6, 0x4

    .line 261
    if-nez v5, :cond_b

    .line 262
    .line 263
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    sput v5, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 276
    .line 277
    :cond_b
    sget v13, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 278
    .line 279
    const-string v5, "source"

    .line 280
    .line 281
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-nez v10, :cond_11

    .line 286
    .line 287
    new-instance v10, Lyyds/ᲀᲇᲇᲀ;

    .line 288
    .line 289
    invoke-direct {v10, v0, v5, v1}, Lyyds/ᲀᲇᲇᲀ;-><init>(Lyyds/ᛳᲁᲀᛷ;Ljava/lang/String;Z)V

    .line 290
    .line 291
    .line 292
    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 293
    .line 294
    new-instance v18, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 295
    .line 296
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 297
    .line 298
    .line 299
    const-wide/16 v15, 0x0

    .line 300
    .line 301
    sget-object v24, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 302
    .line 303
    move v14, v13

    .line 304
    move-object/from16 v19, v10

    .line 305
    .line 306
    move-object/from16 v17, v24

    .line 307
    .line 308
    invoke-direct/range {v12 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 309
    .line 310
    .line 311
    new-instance v0, Lyyds/ᛷᛵᛴᲇ;

    .line 312
    .line 313
    invoke-direct {v0, v12}, Lyyds/ᛷᛵᛴᲇ;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 314
    .line 315
    .line 316
    new-instance v5, Lyyds/ᛳᲁᲀᛷ;

    .line 317
    .line 318
    invoke-direct {v5, v3}, Lyyds/ᛳᲁᲀᛷ;-><init>(I)V

    .line 319
    .line 320
    .line 321
    const-string v10, "disk-cache"

    .line 322
    .line 323
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    if-nez v12, :cond_10

    .line 328
    .line 329
    new-instance v12, Lyyds/ᲀᲇᲇᲀ;

    .line 330
    .line 331
    const/4 v13, 0x1

    .line 332
    invoke-direct {v12, v5, v10, v13}, Lyyds/ᲀᲇᲇᲀ;-><init>(Lyyds/ᛳᲁᲀᛷ;Ljava/lang/String;Z)V

    .line 333
    .line 334
    .line 335
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 336
    .line 337
    new-instance v25, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 338
    .line 339
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 340
    .line 341
    .line 342
    const-wide/16 v22, 0x0

    .line 343
    .line 344
    move/from16 v21, v13

    .line 345
    .line 346
    move-object/from16 v26, v12

    .line 347
    .line 348
    move/from16 v20, v13

    .line 349
    .line 350
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v5, v19

    .line 354
    .line 355
    new-instance v10, Lyyds/ᛷᛵᛴᲇ;

    .line 356
    .line 357
    invoke-direct {v10, v5}, Lyyds/ᛷᛵᛴᲇ;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 358
    .line 359
    .line 360
    sget v5, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 361
    .line 362
    if-nez v5, :cond_c

    .line 363
    .line 364
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    sput v5, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 377
    .line 378
    :cond_c
    sget v5, Lyyds/ᛷᛵᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 379
    .line 380
    if-lt v5, v6, :cond_d

    .line 381
    .line 382
    move/from16 v20, v7

    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_d
    move/from16 v20, v3

    .line 386
    .line 387
    :goto_7
    new-instance v5, Lyyds/ᛳᲁᲀᛷ;

    .line 388
    .line 389
    invoke-direct {v5, v3}, Lyyds/ᛳᲁᲀᛷ;-><init>(I)V

    .line 390
    .line 391
    .line 392
    const-string v6, "animation"

    .line 393
    .line 394
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    if-nez v7, :cond_f

    .line 399
    .line 400
    new-instance v7, Lyyds/ᲀᲇᲇᲀ;

    .line 401
    .line 402
    invoke-direct {v7, v5, v6, v3}, Lyyds/ᲀᲇᲇᲀ;-><init>(Lyyds/ᛳᲁᲀᛷ;Ljava/lang/String;Z)V

    .line 403
    .line 404
    .line 405
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 406
    .line 407
    new-instance v25, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 408
    .line 409
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 410
    .line 411
    .line 412
    const-wide/16 v22, 0x0

    .line 413
    .line 414
    move/from16 v21, v20

    .line 415
    .line 416
    move-object/from16 v26, v7

    .line 417
    .line 418
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v5, v19

    .line 422
    .line 423
    new-instance v6, Lyyds/ᛷᛵᛴᲇ;

    .line 424
    .line 425
    invoke-direct {v6, v5}, Lyyds/ᛷᛵᛴᲇ;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 426
    .line 427
    .line 428
    new-instance v5, Lyyds/ᛳᲈᛷᛳ;

    .line 429
    .line 430
    invoke-direct {v5, v4}, Lyyds/ᛳᲈᛷᛳ;-><init>(Landroid/content/Context;)V

    .line 431
    .line 432
    .line 433
    new-instance v7, Lyyds/ᛶᛲᛶᲇ;

    .line 434
    .line 435
    invoke-direct {v7, v5}, Lyyds/ᛶᛲᛶᲇ;-><init>(Lyyds/ᛳᲈᛷᛳ;)V

    .line 436
    .line 437
    .line 438
    new-instance v5, Lyyds/ᛲᲁᲈ;

    .line 439
    .line 440
    const/16 v12, 0xb

    .line 441
    .line 442
    invoke-direct {v5, v12}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 443
    .line 444
    .line 445
    iget v12, v7, Lyyds/ᛶᛲᛶᲇ;->ᛲᲈᲁ:I

    .line 446
    .line 447
    if-lez v12, :cond_e

    .line 448
    .line 449
    new-instance v13, Lyyds/ᛶᲁᲀᛴ;

    .line 450
    .line 451
    int-to-long v14, v12

    .line 452
    invoke-direct {v13, v14, v15}, Lyyds/ᛶᲁᲀᛴ;-><init>(J)V

    .line 453
    .line 454
    .line 455
    :goto_8
    move-object/from16 v27, v5

    .line 456
    .line 457
    move-object v12, v13

    .line 458
    goto :goto_9

    .line 459
    :cond_e
    new-instance v13, Lyyds/ᛴᛲᛷᛸ;

    .line 460
    .line 461
    const/16 v12, 0x8

    .line 462
    .line 463
    invoke-direct {v13, v12}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 464
    .line 465
    .line 466
    goto :goto_8

    .line 467
    :goto_9
    new-instance v5, Lyyds/ᲁᛶᲇᛱ;

    .line 468
    .line 469
    iget v13, v7, Lyyds/ᛶᛲᛶᲇ;->ᲀᛲᛳᲀ:I

    .line 470
    .line 471
    invoke-direct {v5, v13}, Lyyds/ᲁᛶᲇᛱ;-><init>(I)V

    .line 472
    .line 473
    .line 474
    new-instance v14, Lyyds/ᛳᛵᛸᛱ;

    .line 475
    .line 476
    iget v7, v7, Lyyds/ᛶᛲᛶᲇ;->ᛵᛸᛸᛷ:I

    .line 477
    .line 478
    move-object/from16 v28, v2

    .line 479
    .line 480
    int-to-long v1, v7

    .line 481
    invoke-direct {v14, v1, v2}, Lyyds/ᲁᛱᲈᛳ;-><init>(J)V

    .line 482
    .line 483
    .line 484
    new-instance v15, Lyyds/ᲀᛵᲁᛴ;

    .line 485
    .line 486
    invoke-direct {v15, v4}, Lyyds/ᲀᛵᲁᛴ;-><init>(Landroid/content/Context;)V

    .line 487
    .line 488
    .line 489
    new-instance v2, Lyyds/ᲈᛳᛳᛵ;

    .line 490
    .line 491
    new-instance v1, Lyyds/ᛷᛵᛴᲇ;

    .line 492
    .line 493
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 494
    .line 495
    new-instance v25, Ljava/util/concurrent/SynchronousQueue;

    .line 496
    .line 497
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 498
    .line 499
    .line 500
    new-instance v7, Lyyds/ᲀᲇᲇᲀ;

    .line 501
    .line 502
    new-instance v13, Lyyds/ᛳᲁᲀᛷ;

    .line 503
    .line 504
    invoke-direct {v13, v3}, Lyyds/ᛳᲁᲀᛷ;-><init>(I)V

    .line 505
    .line 506
    .line 507
    const-string v3, "source-unlimited"

    .line 508
    .line 509
    move-object/from16 v16, v2

    .line 510
    .line 511
    const/4 v2, 0x0

    .line 512
    invoke-direct {v7, v13, v3, v2}, Lyyds/ᲀᲇᲇᲀ;-><init>(Lyyds/ᛳᲁᲀᛷ;Ljava/lang/String;Z)V

    .line 513
    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const v21, 0x7fffffff

    .line 518
    .line 519
    .line 520
    const-wide/16 v22, 0x2710

    .line 521
    .line 522
    move-object/from16 v26, v7

    .line 523
    .line 524
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 525
    .line 526
    .line 527
    move-object/from16 v2, v19

    .line 528
    .line 529
    invoke-direct {v1, v2}, Lyyds/ᛷᛵᛴᲇ;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 530
    .line 531
    .line 532
    move-object/from16 v17, v0

    .line 533
    .line 534
    move-object/from16 v18, v1

    .line 535
    .line 536
    move-object/from16 v19, v6

    .line 537
    .line 538
    move-object/from16 v13, v16

    .line 539
    .line 540
    move-object/from16 v16, v10

    .line 541
    .line 542
    invoke-direct/range {v13 .. v19}, Lyyds/ᲈᛳᛳᛵ;-><init>(Lyyds/ᛳᛵᛸᛱ;Lyyds/ᲀᛵᲁᛴ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;)V

    .line 543
    .line 544
    .line 545
    move-object/from16 v16, v13

    .line 546
    .line 547
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 548
    .line 549
    new-instance v13, Lyyds/ᛱᛱᛴ;

    .line 550
    .line 551
    move-object/from16 v1, v28

    .line 552
    .line 553
    invoke-direct {v13, v1}, Lyyds/ᛱᛱᛴ;-><init>(Lyyds/ᲈᲇᲇᛷ;)V

    .line 554
    .line 555
    .line 556
    new-instance v6, Lyyds/ᛵᲇᛷᛸ;

    .line 557
    .line 558
    invoke-direct {v6}, Lyyds/ᛵᲇᛷᛸ;-><init>()V

    .line 559
    .line 560
    .line 561
    new-instance v0, Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 562
    .line 563
    move-object v1, v4

    .line 564
    move-object v4, v12

    .line 565
    move-object v3, v14

    .line 566
    move-object/from16 v2, v16

    .line 567
    .line 568
    move-object/from16 v7, v27

    .line 569
    .line 570
    move-object/from16 v12, p1

    .line 571
    .line 572
    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/ᛲᲈᲁ;-><init>(Landroid/content/Context;Lyyds/ᲈᛳᛳᛵ;Lyyds/ᛳᛵᛸᛱ;Lyyds/ᲈᛱᛸᛴ;Lyyds/ᲁᛶᲇᛱ;Lyyds/ᛵᲇᛷᛸ;Lyyds/ᛲᲁᲈ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᛷᛲᲇᲀ;Ljava/util/List;Ljava/util/ArrayList;Lyyds/ᛷᛸ;Lyyds/ᛱᛱᛴ;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 576
    .line 577
    .line 578
    sput-object v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 579
    .line 580
    return-void

    .line 581
    :cond_f
    const-string v0, "Name must be non-null and non-empty, but given: animation"

    .line 582
    .line 583
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :cond_10
    const-string v0, "Name must be non-null and non-empty, but given: disk-cache"

    .line 588
    .line 589
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :cond_11
    const-string v0, "Name must be non-null and non-empty, but given: source"

    .line 594
    .line 595
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 607
    .line 608
    .line 609
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᛵᲇᛷᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛵᛸᛱ;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lyyds/ᲁᛱᲈᛳ;->ᛲᛴᛳᛲ(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

    .line 12
    .line 13
    invoke-interface {v0}, Lyyds/ᲈᛱᛸᛴ;->ᛷᛵᲇᲀ()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛶᲇᛱ;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 8

    .line 1
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lyyds/ᲁᛷᛲ;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛵᛸᛱ;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    const/16 v2, 0x14

    .line 40
    .line 41
    const/16 v3, 0x28

    .line 42
    .line 43
    if-lt p1, v3, :cond_1

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    invoke-virtual {v1, v4, v5}, Lyyds/ᲁᛱᲈᛳ;->ᛲᛴᛳᛲ(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-ge p1, v2, :cond_2

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    :cond_2
    monitor-enter v1

    .line 56
    :try_start_1
    iget-wide v4, v1, Lyyds/ᲁᛱᲈᛳ;->ᛵᛸᛸᛷ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 57
    .line 58
    monitor-exit v1

    .line 59
    const-wide/16 v6, 0x2

    .line 60
    .line 61
    div-long/2addr v4, v6

    .line 62
    invoke-virtual {v1, v4, v5}, Lyyds/ᲁᛱᲈᛳ;->ᛲᛴᛳᛲ(J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

    .line 66
    .line 67
    invoke-interface {v1, p1}, Lyyds/ᲈᛱᛸᛴ;->ᛲᛳᛶᲁ(I)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛶᲇᛱ;

    .line 71
    .line 72
    monitor-enter p0

    .line 73
    if-lt p1, v3, :cond_4

    .line 74
    .line 75
    :try_start_2
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    const/4 p1, 0x0

    .line 77
    :try_start_3
    invoke-virtual {p0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    .line 79
    .line 80
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 84
    :try_start_6
    throw p1

    .line 85
    :cond_4
    if-ge p1, v2, :cond_5

    .line 86
    .line 87
    if-ne p1, v0, :cond_6

    .line 88
    .line 89
    :cond_5
    iget p1, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ:I

    .line 90
    .line 91
    div-int/lit8 p1, p1, 0x2

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 94
    .line 95
    .line 96
    :cond_6
    :goto_2
    monitor-exit p0

    .line 97
    return-void

    .line 98
    :catchall_2
    move-exception p1

    .line 99
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 100
    throw p1

    .line 101
    :catchall_3
    move-exception p0

    .line 102
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 103
    throw p0

    .line 104
    :goto_3
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 105
    throw p0
.end method
