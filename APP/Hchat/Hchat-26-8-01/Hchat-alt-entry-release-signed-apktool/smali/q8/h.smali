.class public final Lq8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Le8/c;

.field public final d:Lib/b;

.field public final e:Ljava/io/File;

.field public final f:Ljava/util/HashSet;

.field public g:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public volatile h:Ljava/lang/Class;

.field public volatile i:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Le8/c;Lib/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq8/h;->f:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, p1

    .line 23
    :goto_0
    iput-object v0, p0, Lq8/h;->a:Landroid/content/Context;

    .line 24
    .line 25
    iput-object p2, p0, Lq8/h;->b:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    iput-object p3, p0, Lq8/h;->c:Le8/c;

    .line 28
    .line 29
    iput-object p4, p0, Lq8/h;->d:Lib/b;

    .line 30
    .line 31
    new-instance p2, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p3, "Hchat_proxy_classes"

    .line 38
    .line 39
    invoke-direct {p2, p1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lq8/h;->e:Ljava/io/File;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static a(Lq8/h;Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lq8/h;->m(Ljava/lang/Object;)Landroid/widget/BaseAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lq8/h;->h(Ljava/lang/Object;Landroid/widget/BaseAdapter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v0, "[Hchat:SettingsInjector] [PlusMenu] \u663e\u793a\u65f6\u6dfb\u52a0\u5165\u53e3\u5931\u8d25: "

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1, p0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 4

    .line 1
    const v0, -0x48435850

    .line 2
    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, -0x1

    .line 8
    if-ne p1, v0, :cond_2

    .line 9
    .line 10
    invoke-static {p0}, Lq8/h;->n(Landroid/view/View;)Landroid/widget/ImageView;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const v0, 0x1080030

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v3, p0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-static {p0}, Lq8/h;->n(Landroid/view/View;)Landroid/widget/ImageView;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-nez p0, :cond_3

    .line 68
    .line 69
    :goto_0
    return-void

    .line 70
    :cond_3
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lq8/a;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-direct {p1, v3, v0}, Lq8/a;-><init>(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static c(Lq8/h;Ljava/lang/Object;)Landroid/content/Context;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :goto_0
    if-eqz p0, :cond_3

    .line 9
    .line 10
    const-class v0, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq p0, v0, :cond_3

    .line 13
    .line 14
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    const-class v2, Landroid/content/Context;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    instance-of v2, v1, Landroid/content/Context;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    check-cast v1, Landroid/content/Context;

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public static d(Lq8/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Lq8/h;->c:Le8/c;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Le8/c;->w:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    if-eqz v0, :cond_3

    .line 15
    .line 16
    const-class v1, Ljava/lang/Object;

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/reflect/Field;

    .line 39
    .line 40
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    iget-object v3, p0, Le8/c;->w:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public static e(Lq8/h;Ljava/util/Map;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-ne v1, p2, :cond_3

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_3
    instance-of v2, v1, Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    check-cast v2, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_4
    instance-of v2, v1, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_5
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_c

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Ljava/util/Map$Entry;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    instance-of v0, p2, Ljava/lang/Iterable;

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    check-cast p2, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    :cond_7
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    instance-of v1, v0, Ljava/lang/Class;

    .line 111
    .line 112
    if-nez v1, :cond_8

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_8
    move-object v1, v0

    .line 116
    check-cast v1, Ljava/lang/Class;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    array-length v2, p3

    .line 123
    const/4 v3, 0x0

    .line 124
    :goto_1
    if-ge v3, v2, :cond_7

    .line 125
    .line 126
    aget-object v4, p3, v3

    .line 127
    .line 128
    if-nez v4, :cond_9

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_9
    if-eq v0, v4, :cond_b

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_a

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_a
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_b
    :goto_3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_c
    :goto_4
    const/4 p0, 0x0

    .line 153
    return-object p0
.end method

.method public static f(Lq8/h;Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-static {p1}, Lq8/h;->p(Ljava/lang/Object;)Landroid/util/SparseArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 p1, -0x80000000

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    if-ltz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge p2, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lq8/h;->v(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eq v0, p1, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lq8/h;->v(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public static g(Lq8/h;Ljava/lang/Object;ILjava/lang/Class;)Ljava/lang/Class;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    :catchall_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/reflect/Field;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v3, Ljava/lang/Class;

    .line 34
    .line 35
    if-eq v2, v3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-ne v0, p2, :cond_2

    .line 43
    .line 44
    instance-of v2, v1, Ljava/lang/Class;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    move-object p3, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_1
    return-object p3
.end method

.method public static i(Landroid/util/SparseArray;Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, ""

    .line 15
    .line 16
    filled-new-array {v0, p4, v3, v2, v2}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p2, v0}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    filled-new-array {p3, p4, v3, v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p2, p3}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    :goto_1
    return v1

    .line 53
    :cond_2
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    :goto_2
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-eqz p3, :cond_3

    .line 66
    .line 67
    add-int/lit8 p2, p2, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-virtual {p0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public static j(Landroid/util/SparseArray;ILjava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2, p2, p1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return v0
.end method

.method public static l(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "getView"

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    array-length v3, v2

    .line 50
    const/4 v4, 0x3

    .line 51
    if-ne v3, v4, :cond_0

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    aget-object v3, v2, v3

    .line 55
    .line 56
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    if-ne v3, v4, :cond_0

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    aget-object v3, v2, v3

    .line 62
    .line 63
    const-class v4, Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    aget-object v2, v2, v3

    .line 73
    .line 74
    const-class v3, Landroid/view/ViewGroup;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_0

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static m(Ljava/lang/Object;)Landroid/widget/BaseAdapter;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_3

    .line 9
    .line 10
    const-class v1, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-class v3, Landroid/widget/BaseAdapter;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v3, v2, Landroid/widget/BaseAdapter;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    check-cast v2, Landroid/widget/BaseAdapter;

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public static n(Landroid/view/View;)Landroid/widget/ImageView;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge v0, v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lq8/h;->n(Landroid/view/View;)Landroid/widget/ImageView;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {v1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/reflect/Field;

    .line 65
    .line 66
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_4

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne v3, v4, :cond_4

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 82
    return-object p0
.end method

.method public static p(Ljava/lang/Object;)Landroid/util/SparseArray;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    if-eqz v0, :cond_3

    .line 9
    .line 10
    const-class v1, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-class v3, Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v3, v2, Landroid/util/SparseArray;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    check-cast v2, Landroid/util/SparseArray;

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public static u(Ljava/lang/Object;Ljava/lang/String;I)Z
    .locals 9

    .line 1
    invoke-static {p0}, Lq8/h;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_5

    .line 9
    .line 10
    :cond_0
    const v2, -0x48435853

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne p2, v2, :cond_1

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v2, v1

    .line 19
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    move v5, v1

    .line 32
    move v6, v5

    .line 33
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_6

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-static {v7, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    instance-of v8, v7, Ljava/lang/Integer;

    .line 57
    .line 58
    if-eqz v8, :cond_4

    .line 59
    .line 60
    move-object v8, v7

    .line 61
    check-cast v8, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-ne v8, p2, :cond_4

    .line 68
    .line 69
    move v5, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-eqz v8, :cond_5

    .line 74
    .line 75
    move-object v8, v7

    .line 76
    check-cast v8, Ljava/lang/CharSequence;

    .line 77
    .line 78
    invoke-virtual {p1, v8}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_5

    .line 83
    .line 84
    :goto_2
    move v6, v3

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    instance-of v8, v7, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    if-nez v5, :cond_11

    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    if-eqz v6, :cond_7

    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    :cond_8
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_10

    .line 122
    .line 123
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Ljava/lang/reflect/Field;

    .line 128
    .line 129
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_9

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_9
    invoke-static {v5, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    instance-of v6, v5, Ljava/lang/Integer;

    .line 141
    .line 142
    if-eqz v6, :cond_a

    .line 143
    .line 144
    move-object v6, v5

    .line 145
    check-cast v6, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-ne v6, p2, :cond_a

    .line 152
    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_a
    if-eqz v2, :cond_b

    .line 156
    .line 157
    instance-of v6, v5, Ljava/lang/CharSequence;

    .line 158
    .line 159
    if-eqz v6, :cond_b

    .line 160
    .line 161
    move-object v6, v5

    .line 162
    check-cast v6, Ljava/lang/CharSequence;

    .line 163
    .line 164
    invoke-virtual {p1, v6}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_b

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_b
    if-eqz v2, :cond_c

    .line 172
    .line 173
    instance-of v6, v5, Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v6, :cond_c

    .line 176
    .line 177
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_c

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_c
    if-eqz v5, :cond_8

    .line 185
    .line 186
    if-eq v5, v0, :cond_8

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-nez v7, :cond_8

    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const-string v7, "java."

    .line 203
    .line 204
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-nez v6, :cond_8

    .line 209
    .line 210
    if-eqz v2, :cond_8

    .line 211
    .line 212
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    :cond_d
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_8

    .line 229
    .line 230
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, Ljava/lang/reflect/Field;

    .line 235
    .line 236
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_e

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_e
    invoke-static {v7, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 248
    .line 249
    if-eqz v8, :cond_f

    .line 250
    .line 251
    move-object v8, v7

    .line 252
    check-cast v8, Ljava/lang/CharSequence;

    .line 253
    .line 254
    invoke-virtual {p1, v8}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_f

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_f
    instance-of v8, v7, Ljava/lang/String;

    .line 262
    .line 263
    if-eqz v8, :cond_d

    .line 264
    .line 265
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-eqz v7, :cond_d

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_10
    :goto_5
    return v1

    .line 273
    :cond_11
    :goto_6
    return v3
.end method

.method public static v(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const-string v0, "Hchat"

    .line 2
    .line 3
    const v1, -0x48435853

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, v1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-string v0, "\u5168\u90e8\u5df2\u8bfb"

    .line 14
    .line 15
    const v1, -0x48435851

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const-string v0, "\u5feb\u6377\u7ec8\u6b62"

    .line 26
    .line 27
    const v1, -0x48435850

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    const-string v0, "\u63d2\u4ef6 Agent"

    .line 38
    .line 39
    const v1, -0x4843584f

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0, v1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    return v1

    .line 49
    :cond_3
    const/high16 p0, -0x80000000

    .line 50
    .line 51
    return p0
.end method

.method public static w(Landroid/util/SparseArray;ILjava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ltz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v3, p2, p1}, Lq8/h;->u(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 21
    .line 22
    .line 23
    move v2, v1

    .line 24
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v2
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Landroid/widget/BaseAdapter;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Lq8/h;->p(Ljava/lang/Object;)Landroid/util/SparseArray;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    const-string v3, "plus_menu_enable"

    .line 14
    .line 15
    iget-object v4, v0, Lq8/h;->d:Lib/b;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const-string v6, "Hchat"

    .line 19
    .line 20
    const v7, -0x48435853

    .line 21
    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    iget-object v8, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    invoke-interface {v8, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_1

    .line 32
    .line 33
    move v8, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {v2, v7, v6}, Lq8/h;->w(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    :goto_0
    iget-object v9, v0, Lq8/h;->a:Landroid/content/Context;

    .line 40
    .line 41
    invoke-static {v9}, Lya/i;->c(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    const-string v11, "\u5168\u90e8\u5df2\u8bfb"

    .line 46
    .line 47
    const v12, -0x48435851

    .line 48
    .line 49
    .line 50
    if-nez v10, :cond_2

    .line 51
    .line 52
    invoke-static {v2, v12, v11}, Lq8/h;->w(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    or-int/2addr v8, v10

    .line 57
    :cond_2
    invoke-static {v9}, Lf8/i;->T(Landroid/content/Context;)Z

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    const-string v13, "\u5feb\u6377\u7ec8\u6b62"

    .line 62
    .line 63
    const v14, -0x48435850

    .line 64
    .line 65
    .line 66
    if-nez v10, :cond_3

    .line 67
    .line 68
    invoke-static {v2, v14, v13}, Lq8/h;->w(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    or-int/2addr v8, v10

    .line 73
    :cond_3
    const-string v10, "plugin_agent_plus_menu_enable"

    .line 74
    .line 75
    const-string v15, "\u63d2\u4ef6 Agent"

    .line 76
    .line 77
    const v14, -0x4843584f

    .line 78
    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    iget-object v12, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    invoke-interface {v12, v10, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-eqz v12, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-static {v2, v14, v15}, Lq8/h;->w(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    or-int/2addr v8, v12

    .line 96
    :goto_1
    invoke-virtual {v0}, Lq8/h;->t()Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-nez v12, :cond_5

    .line 101
    .line 102
    if-eqz v8, :cond_e

    .line 103
    .line 104
    if-eqz v1, :cond_e

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    invoke-static {v2, v7, v6}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    if-eqz v12, :cond_6

    .line 115
    .line 116
    const v12, -0x48435851

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v12, v11}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    if-eqz v16, :cond_6

    .line 124
    .line 125
    invoke-static {v2, v14, v15}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-eqz v12, :cond_6

    .line 130
    .line 131
    const v12, -0x48435850

    .line 132
    .line 133
    .line 134
    invoke-static {v2, v12, v13}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    if-eqz v16, :cond_6

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lq8/h;->k(Landroid/widget/BaseAdapter;)V

    .line 141
    .line 142
    .line 143
    if-eqz v1, :cond_e

    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    if-lez v12, :cond_7

    .line 154
    .line 155
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    goto :goto_2

    .line 160
    :cond_7
    const/4 v12, 0x0

    .line 161
    :goto_2
    if-nez v12, :cond_8

    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_8
    invoke-static {v12}, Lq8/h;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    if-nez v14, :cond_9

    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_9
    invoke-virtual {v0, v1}, Lq8/h;->k(Landroid/widget/BaseAdapter;)V

    .line 174
    .line 175
    .line 176
    if-eqz v4, :cond_a

    .line 177
    .line 178
    iget-object v7, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 179
    .line 180
    invoke-interface {v7, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_a

    .line 185
    .line 186
    const v3, -0x48435853

    .line 187
    .line 188
    .line 189
    invoke-static {v2, v3, v6}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-nez v7, :cond_a

    .line 194
    .line 195
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-static {v2, v7, v14, v3, v6}, Lq8/h;->i(Landroid/util/SparseArray;Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    or-int/2addr v8, v3

    .line 204
    :cond_a
    if-eqz v4, :cond_b

    .line 205
    .line 206
    iget-object v3, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 207
    .line 208
    invoke-interface {v3, v10, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_b

    .line 213
    .line 214
    const v3, -0x4843584f

    .line 215
    .line 216
    .line 217
    invoke-static {v2, v3, v15}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_b

    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-static {v2, v4, v14, v3, v15}, Lq8/h;->i(Landroid/util/SparseArray;Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    or-int/2addr v8, v3

    .line 232
    :cond_b
    invoke-static {v9}, Lya/i;->c(Landroid/content/Context;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_c

    .line 237
    .line 238
    const v3, -0x48435851

    .line 239
    .line 240
    .line 241
    invoke-static {v2, v3, v11}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-nez v4, :cond_c

    .line 246
    .line 247
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v2, v4, v14, v3, v11}, Lq8/h;->i(Landroid/util/SparseArray;Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    or-int/2addr v8, v3

    .line 256
    :cond_c
    invoke-static {v9}, Lf8/i;->T(Landroid/content/Context;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_d

    .line 261
    .line 262
    const v3, -0x48435850

    .line 263
    .line 264
    .line 265
    invoke-static {v2, v3, v13}, Lq8/h;->j(Landroid/util/SparseArray;ILjava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-nez v4, :cond_d

    .line 270
    .line 271
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v2, v4, v14, v3, v13}, Lq8/h;->i(Landroid/util/SparseArray;Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    or-int/2addr v8, v2

    .line 280
    :cond_d
    if-eqz v8, :cond_e

    .line 281
    .line 282
    if-eqz v1, :cond_e

    .line 283
    .line 284
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 285
    .line 286
    .line 287
    :cond_e
    :goto_3
    return-void
.end method

.method public final k(Landroid/widget/BaseAdapter;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lq8/h;->f:Ljava/util/HashSet;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lq8/h;->f:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {p1}, Lq8/h;->l(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :cond_2
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 32
    .line 33
    new-instance v3, Lq8/d;

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    invoke-direct {v3, p0, v4}, Lq8/d;-><init>(Lq8/h;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lq8/h;->f:Ljava/util/HashSet;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p1
.end method

.method public final q(Ljava/lang/Class;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-ne v5, v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 82
    .line 83
    new-instance v5, Lq8/d;

    .line 84
    .line 85
    const/4 v6, 0x4

    .line 86
    invoke-direct {v5, p0, v6}, Lq8/d;-><init>(Lq8/h;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance v1, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_3
    if-eqz p1, :cond_9

    .line 107
    .line 108
    const-class v3, Ljava/lang/Object;

    .line 109
    .line 110
    if-eq p1, v3, :cond_9

    .line 111
    .line 112
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_8

    .line 125
    .line 126
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Ljava/lang/reflect/Method;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-nez v6, :cond_6

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-ne v6, v2, :cond_6

    .line 147
    .line 148
    array-length v6, v5

    .line 149
    if-eqz v6, :cond_7

    .line 150
    .line 151
    array-length v6, v5

    .line 152
    const/4 v7, 0x1

    .line 153
    if-ne v6, v7, :cond_6

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    aget-object v5, v5, v6

    .line 157
    .line 158
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 159
    .line 160
    if-ne v5, v6, :cond_6

    .line 161
    .line 162
    :cond_7
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    goto :goto_3

    .line 171
    :cond_9
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_b

    .line 180
    .line 181
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/reflect/Method;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_a

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_a
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 195
    .line 196
    new-instance v3, Lq8/d;

    .line 197
    .line 198
    const/4 v4, 0x5

    .line 199
    invoke-direct {v3, p0, v4}, Lq8/d;-><init>(Lq8/h;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v1, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    return-void
.end method

.method public final r()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lq8/h;->c:Le8/c;

    .line 4
    .line 5
    iget-object v2, v0, Le8/c;->z:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object v3, v0, Le8/c;->f:Ljava/lang/Class;

    .line 12
    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    iget-object v3, v0, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-eqz v3, :cond_5

    .line 19
    .line 20
    iget-object v3, v0, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    if-eqz v3, :cond_5

    .line 23
    .line 24
    iget-object v3, v0, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    if-eqz v3, :cond_5

    .line 27
    .line 28
    iget-object v3, v0, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    :try_start_0
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 34
    .line 35
    const-string v4, "initView"

    .line 36
    .line 37
    new-instance v5, Lq8/d;

    .line 38
    .line 39
    const/4 v6, 0x6

    .line 40
    invoke-direct {v5, v1, v6}, Lq8/d;-><init>(Lq8/h;I)V

    .line 41
    .line 42
    .line 43
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v2, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v3, v2}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Le8/c;->z:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    const-string v3, "onPreferenceTreeClick"

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const/4 v2, 0x0

    .line 92
    :goto_0
    if-eqz v2, :cond_5

    .line 93
    .line 94
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 95
    .line 96
    new-instance v3, Lq8/d;

    .line 97
    .line 98
    const/4 v4, 0x7

    .line 99
    invoke-direct {v3, v1, v4}, Lq8/d;-><init>(Lq8/h;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v3, "[Hchat:SettingsInjector] [Legacy] Hook \u5931\u8d25: "

    .line 112
    .line 113
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_2
    iget-object v0, v1, Lq8/h;->c:Le8/c;

    .line 120
    .line 121
    iget-object v3, v0, Le8/c;->n:Ljava/lang/Class;

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    if-nez v3, :cond_6

    .line 125
    .line 126
    goto/16 :goto_f

    .line 127
    .line 128
    :cond_6
    iget-object v2, v0, Le8/c;->l:Ljava/lang/Class;

    .line 129
    .line 130
    if-nez v2, :cond_7

    .line 131
    .line 132
    goto/16 :goto_f

    .line 133
    .line 134
    :cond_7
    iget-object v2, v0, Le8/c;->m:Ljava/lang/Class;

    .line 135
    .line 136
    if-nez v2, :cond_8

    .line 137
    .line 138
    goto/16 :goto_f

    .line 139
    .line 140
    :cond_8
    iget-object v2, v0, Le8/c;->k:Ljava/lang/Class;

    .line 141
    .line 142
    if-nez v2, :cond_9

    .line 143
    .line 144
    goto/16 :goto_f

    .line 145
    .line 146
    :cond_9
    :try_start_1
    iget-object v5, v0, Le8/c;->q:Ljava/lang/Class;

    .line 147
    .line 148
    iget-object v12, v0, Le8/c;->p:Ljava/lang/Class;

    .line 149
    .line 150
    if-eqz v5, :cond_21

    .line 151
    .line 152
    if-nez v12, :cond_a

    .line 153
    .line 154
    goto/16 :goto_f

    .line 155
    .line 156
    :cond_a
    iget-object v2, v0, Le8/c;->o:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 159
    .line 160
    if-eqz v2, :cond_18

    .line 161
    .line 162
    :try_start_2
    iget-object v0, v0, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 163
    .line 164
    if-eqz v0, :cond_18

    .line 165
    .line 166
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_c

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    const-class v7, Ljava/lang/Class;

    .line 191
    .line 192
    if-ne v6, v7, :cond_b

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    goto :goto_3

    .line 199
    :catchall_1
    move-exception v0

    .line 200
    goto/16 :goto_e

    .line 201
    .line 202
    :cond_c
    const/4 v0, 0x0

    .line 203
    :goto_3
    iget-object v2, v1, Lq8/h;->c:Le8/c;

    .line 204
    .line 205
    iget-object v2, v2, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v6, v1, Lq8/h;->c:Le8/c;

    .line 212
    .line 213
    iget-object v6, v6, Le8/c;->o:Ljava/lang/Class;

    .line 214
    .line 215
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    :cond_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_e

    .line 228
    .line 229
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    check-cast v7, Ljava/lang/reflect/Method;

    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    const/4 v9, 0x3

    .line 240
    if-ne v8, v9, :cond_d

    .line 241
    .line 242
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    goto :goto_4

    .line 247
    :cond_e
    const/4 v6, 0x0

    .line 248
    :goto_4
    iget-object v7, v1, Lq8/h;->c:Le8/c;

    .line 249
    .line 250
    iget-object v8, v7, Le8/c;->v:Ljava/lang/reflect/Method;

    .line 251
    .line 252
    if-eqz v8, :cond_f

    .line 253
    .line 254
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    goto :goto_7

    .line 259
    :cond_f
    iget-object v7, v7, Le8/c;->o:Ljava/lang/Class;

    .line 260
    .line 261
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    if-eqz v8, :cond_13

    .line 274
    .line 275
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    check-cast v8, Ljava/lang/reflect/Method;

    .line 280
    .line 281
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    const-class v13, Ljava/lang/String;

    .line 286
    .line 287
    if-ne v9, v13, :cond_10

    .line 288
    .line 289
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-nez v9, :cond_10

    .line 294
    .line 295
    iget-object v9, v1, Lq8/h;->c:Le8/c;

    .line 296
    .line 297
    iget-object v9, v9, Le8/c;->l:Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 298
    .line 299
    if-eqz v9, :cond_12

    .line 300
    .line 301
    :goto_5
    if-eqz v9, :cond_12

    .line 302
    .line 303
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    invoke-static {v9, v13, v14}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 312
    .line 313
    .line 314
    move-result-object v13

    .line 315
    if-eqz v13, :cond_11

    .line 316
    .line 317
    invoke-static {v13}, Lh/Hchat/utils/KavaReflector;->modifiers(Ljava/lang/reflect/Method;)I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    goto :goto_6

    .line 322
    :cond_11
    new-instance v13, Ljava/lang/NoSuchMethodException;

    .line 323
    .line 324
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    invoke-direct {v13, v14}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 332
    :catchall_2
    :try_start_4
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    goto :goto_5

    .line 337
    :cond_12
    move v9, v11

    .line 338
    :goto_6
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->isAbstract(I)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-eqz v9, :cond_10

    .line 343
    .line 344
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    goto :goto_7

    .line 349
    :cond_13
    const/4 v7, 0x0

    .line 350
    :goto_7
    iget-object v8, v1, Lq8/h;->c:Le8/c;

    .line 351
    .line 352
    iget-object v8, v8, Le8/c;->o:Ljava/lang/Class;

    .line 353
    .line 354
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    const/4 v9, 0x0

    .line 363
    :cond_14
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    if-eqz v13, :cond_15

    .line 368
    .line 369
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v13

    .line 373
    check-cast v13, Ljava/lang/reflect/Method;

    .line 374
    .line 375
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v14

    .line 379
    iget-object v15, v1, Lq8/h;->c:Le8/c;

    .line 380
    .line 381
    iget-object v15, v15, Le8/c;->m:Ljava/lang/Class;

    .line 382
    .line 383
    if-ne v14, v15, :cond_14

    .line 384
    .line 385
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    goto :goto_8

    .line 390
    :cond_15
    iget-object v8, v1, Lq8/h;->c:Le8/c;

    .line 391
    .line 392
    iget-object v8, v8, Le8/c;->o:Ljava/lang/Class;

    .line 393
    .line 394
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    const/4 v13, 0x0

    .line 403
    :cond_16
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v14

    .line 407
    if-eqz v14, :cond_17

    .line 408
    .line 409
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v14

    .line 413
    check-cast v14, Ljava/lang/reflect/Method;

    .line 414
    .line 415
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v15

    .line 419
    if-ne v15, v4, :cond_16

    .line 420
    .line 421
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v15

    .line 425
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v15

    .line 429
    if-nez v15, :cond_16

    .line 430
    .line 431
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v13

    .line 435
    goto :goto_9

    .line 436
    :cond_17
    move-object/from16 v16, v2

    .line 437
    .line 438
    move-object v2, v0

    .line 439
    move-object/from16 v0, v16

    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_18
    const/4 v0, 0x0

    .line 443
    const/4 v2, 0x0

    .line 444
    const/4 v6, 0x0

    .line 445
    const/4 v7, 0x0

    .line 446
    const/4 v9, 0x0

    .line 447
    const/4 v13, 0x0

    .line 448
    :goto_a
    if-eqz v2, :cond_21

    .line 449
    .line 450
    if-eqz v6, :cond_21

    .line 451
    .line 452
    if-eqz v7, :cond_21

    .line 453
    .line 454
    if-eqz v9, :cond_21

    .line 455
    .line 456
    if-nez v13, :cond_19

    .line 457
    .line 458
    goto/16 :goto_f

    .line 459
    .line 460
    :cond_19
    iget-object v8, v1, Lq8/h;->g:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 461
    .line 462
    if-eqz v8, :cond_1a

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_1a
    const-class v8, Landroid/content/Context;

    .line 466
    .line 467
    const-string v14, "getString"

    .line 468
    .line 469
    new-instance v15, Lba/f;

    .line 470
    .line 471
    const/16 v10, 0x16

    .line 472
    .line 473
    invoke-direct {v15, v10}, Lba/f;-><init>(I)V

    .line 474
    .line 475
    .line 476
    filled-new-array {v4, v15}, [Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    invoke-static {v8, v14, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    iput-object v4, v1, Lq8/h;->g:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 485
    .line 486
    sget-object v8, Lr8/i;->b:Lr8/i;

    .line 487
    .line 488
    invoke-virtual {v8, v4}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 489
    .line 490
    .line 491
    :goto_b
    const-string v4, "androidx.appcompat.app.AppCompatActivity"

    .line 492
    .line 493
    iget-object v8, v1, Lq8/h;->b:Ljava/lang/ClassLoader;

    .line 494
    .line 495
    invoke-static {v4, v8}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    move-object v4, v0

    .line 500
    new-instance v0, Lq8/b;

    .line 501
    .line 502
    move-object v8, v5

    .line 503
    move-object v5, v6

    .line 504
    move-object v6, v7

    .line 505
    move-object v7, v9

    .line 506
    move-object v9, v13

    .line 507
    invoke-direct/range {v0 .. v9}, Lq8/b;-><init>(Lq8/h;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    move-object v5, v8

    .line 511
    iget-object v2, v1, Lq8/h;->c:Le8/c;

    .line 512
    .line 513
    iget-object v2, v2, Le8/c;->l:Ljava/lang/Class;

    .line 514
    .line 515
    new-instance v4, Ly4/c;

    .line 516
    .line 517
    invoke-direct {v4, v2}, Ly4/c;-><init>(Ljava/lang/Class;)V

    .line 518
    .line 519
    .line 520
    iget-object v2, v1, Lq8/h;->e:Ljava/io/File;

    .line 521
    .line 522
    new-instance v6, Ljava/io/File;

    .line 523
    .line 524
    new-instance v7, Ljava/lang/StringBuilder;

    .line 525
    .line 526
    const-string v8, "v"

    .line 527
    .line 528
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    const/4 v8, 0x1

    .line 532
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    iput-object v6, v4, Ly4/c;->c:Ljava/io/File;

    .line 547
    .line 548
    invoke-virtual {v6}, Ljava/io/File;->mkdir()Z

    .line 549
    .line 550
    .line 551
    iget-object v2, v1, Lq8/h;->b:Ljava/lang/ClassLoader;

    .line 552
    .line 553
    iput-object v2, v4, Ly4/c;->b:Ljava/lang/ClassLoader;

    .line 554
    .line 555
    invoke-virtual {v4}, Ly4/c;->a()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-static {v7, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 568
    .line 569
    new-instance v6, Lb9/e;

    .line 570
    .line 571
    const/16 v9, 0x17

    .line 572
    .line 573
    invoke-direct {v6, v0, v9}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 577
    .line 578
    .line 579
    iput-object v3, v1, Lq8/h;->h:Ljava/lang/Class;

    .line 580
    .line 581
    iput-object v5, v1, Lq8/h;->i:Ljava/lang/Class;

    .line 582
    .line 583
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    :cond_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    if-eqz v6, :cond_1c

    .line 596
    .line 597
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    check-cast v6, Ljava/lang/reflect/Method;

    .line 602
    .line 603
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    iget-object v10, v1, Lq8/h;->c:Le8/c;

    .line 608
    .line 609
    iget-object v10, v10, Le8/c;->m:Ljava/lang/Class;

    .line 610
    .line 611
    if-ne v9, v10, :cond_1b

    .line 612
    .line 613
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 614
    .line 615
    new-instance v9, Lq8/e;

    .line 616
    .line 617
    invoke-direct {v9, v1, v3, v5, v7}, Lq8/e;-><init>(Lq8/h;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4, v6, v9}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    :cond_1c
    iget-object v4, v1, Lq8/h;->c:Le8/c;

    .line 627
    .line 628
    iget-object v4, v4, Le8/c;->k:Ljava/lang/Class;

    .line 629
    .line 630
    if-nez v4, :cond_1e

    .line 631
    .line 632
    :cond_1d
    const/4 v10, 0x0

    .line 633
    goto :goto_c

    .line 634
    :cond_1e
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    :cond_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    if-eqz v6, :cond_1d

    .line 647
    .line 648
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    check-cast v6, Ljava/lang/reflect/Method;

    .line 653
    .line 654
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    if-nez v9, :cond_1f

    .line 659
    .line 660
    const-class v9, Ljava/util/Map;

    .line 661
    .line 662
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v10

    .line 666
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    if-eqz v9, :cond_1f

    .line 671
    .line 672
    move-object v10, v6

    .line 673
    :goto_c
    if-nez v10, :cond_20

    .line 674
    .line 675
    goto :goto_d

    .line 676
    :cond_20
    sget-object v9, Lr8/i;->b:Lr8/i;

    .line 677
    .line 678
    move-object v4, v3

    .line 679
    move-object v3, v0

    .line 680
    new-instance v0, Lq8/f;

    .line 681
    .line 682
    move-object v6, v12

    .line 683
    invoke-direct/range {v0 .. v7}, Lq8/f;-><init>(Lq8/h;Ljava/lang/reflect/Constructor;Lq8/b;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v9, v10, v0}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 687
    .line 688
    .line 689
    :goto_d
    iget-object v0, v1, Lq8/h;->c:Le8/c;

    .line 690
    .line 691
    iget-object v0, v0, Le8/c;->r:Ljava/lang/Class;

    .line 692
    .line 693
    invoke-virtual {v1, v0, v7, v8}, Lq8/h;->s(Ljava/lang/Class;Ljava/lang/Class;Z)V

    .line 694
    .line 695
    .line 696
    iget-object v0, v1, Lq8/h;->c:Le8/c;

    .line 697
    .line 698
    iget-object v0, v0, Le8/c;->t:Ljava/lang/Class;

    .line 699
    .line 700
    invoke-virtual {v1, v0, v7, v11}, Lq8/h;->s(Ljava/lang/Class;Ljava/lang/Class;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 701
    .line 702
    .line 703
    goto :goto_f

    .line 704
    :goto_e
    new-instance v2, Ljava/lang/StringBuilder;

    .line 705
    .line 706
    const-string v3, "[Hchat:SettingsInjector] [Modern] \u5b89\u88c5\u5931\u8d25: "

    .line 707
    .line 708
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 712
    .line 713
    .line 714
    :cond_21
    :goto_f
    :try_start_5
    const-string v0, "com.tencent.mm.ui.LauncherUI"

    .line 715
    .line 716
    iget-object v2, v1, Lq8/h;->b:Ljava/lang/ClassLoader;

    .line 717
    .line 718
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    if-nez v0, :cond_22

    .line 723
    .line 724
    goto :goto_10

    .line 725
    :cond_22
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 726
    .line 727
    const-string v3, "onCreate"

    .line 728
    .line 729
    const-class v4, Landroid/os/Bundle;

    .line 730
    .line 731
    new-instance v5, Lba/f;

    .line 732
    .line 733
    const/16 v6, 0x17

    .line 734
    .line 735
    invoke-direct {v5, v1, v6}, Lba/f;-><init>(Ljava/lang/Object;I)V

    .line 736
    .line 737
    .line 738
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-virtual {v2, v3}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 747
    .line 748
    .line 749
    const-string v3, "onNewIntent"

    .line 750
    .line 751
    const-class v4, Landroid/content/Intent;

    .line 752
    .line 753
    new-instance v5, Lba/f;

    .line 754
    .line 755
    const/16 v6, 0x18

    .line 756
    .line 757
    invoke-direct {v5, v1, v6}, Lba/f;-><init>(Ljava/lang/Object;I)V

    .line 758
    .line 759
    .line 760
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-virtual {v2, v0}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 769
    .line 770
    .line 771
    goto :goto_10

    .line 772
    :catchall_3
    move-exception v0

    .line 773
    new-instance v2, Ljava/lang/StringBuilder;

    .line 774
    .line 775
    const-string v3, "[Hchat:SettingsInjector] [LauncherUI] Hook \u5931\u8d25: "

    .line 776
    .line 777
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 781
    .line 782
    .line 783
    :goto_10
    invoke-virtual {v1}, Lq8/h;->t()Z

    .line 784
    .line 785
    .line 786
    move-result v0

    .line 787
    if-eqz v0, :cond_24

    .line 788
    .line 789
    iget-object v0, v1, Lq8/h;->c:Le8/c;

    .line 790
    .line 791
    iget-object v2, v0, Le8/c;->w:Ljava/lang/Class;

    .line 792
    .line 793
    if-eqz v2, :cond_24

    .line 794
    .line 795
    iget-object v2, v0, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 796
    .line 797
    if-eqz v2, :cond_24

    .line 798
    .line 799
    iget-object v3, v0, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 800
    .line 801
    if-nez v3, :cond_23

    .line 802
    .line 803
    goto :goto_11

    .line 804
    :cond_23
    :try_start_6
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 805
    .line 806
    new-instance v4, Lq8/d;

    .line 807
    .line 808
    const/4 v5, 0x1

    .line 809
    invoke-direct {v4, v1, v5}, Lq8/d;-><init>(Lq8/h;I)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v3, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 813
    .line 814
    .line 815
    iget-object v2, v0, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 816
    .line 817
    new-instance v4, Lq8/d;

    .line 818
    .line 819
    const/4 v5, 0x2

    .line 820
    invoke-direct {v4, v1, v5}, Lq8/d;-><init>(Lq8/h;I)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v3, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 824
    .line 825
    .line 826
    iget-object v2, v0, Le8/c;->w:Ljava/lang/Class;

    .line 827
    .line 828
    invoke-virtual {v1, v2}, Lq8/h;->q(Ljava/lang/Class;)V

    .line 829
    .line 830
    .line 831
    iget-object v0, v0, Le8/c;->w:Ljava/lang/Class;

    .line 832
    .line 833
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 834
    .line 835
    .line 836
    goto :goto_11

    .line 837
    :catchall_4
    move-exception v0

    .line 838
    new-instance v2, Ljava/lang/StringBuilder;

    .line 839
    .line 840
    const-string v3, "[Hchat:SettingsInjector] [PlusMenu] Hook \u5931\u8d25: "

    .line 841
    .line 842
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 846
    .line 847
    .line 848
    :cond_24
    :goto_11
    iget-object v0, v1, Lq8/h;->d:Lib/b;

    .line 849
    .line 850
    if-eqz v0, :cond_26

    .line 851
    .line 852
    iget-object v0, v0, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 853
    .line 854
    const-string v2, "plus_long_press_enable"

    .line 855
    .line 856
    invoke-interface {v0, v2, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    if-eqz v0, :cond_26

    .line 861
    .line 862
    :try_start_7
    const-string v0, "com.tencent.mm.ui.HomeUI$PlusActionView"

    .line 863
    .line 864
    iget-object v2, v1, Lq8/h;->b:Ljava/lang/ClassLoader;

    .line 865
    .line 866
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    if-nez v0, :cond_25

    .line 871
    .line 872
    goto :goto_13

    .line 873
    :cond_25
    new-instance v2, Lq8/d;

    .line 874
    .line 875
    const/4 v3, 0x0

    .line 876
    invoke-direct {v2, v1, v3}, Lq8/d;-><init>(Lq8/h;I)V

    .line 877
    .line 878
    .line 879
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-eqz v2, :cond_26

    .line 892
    .line 893
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 898
    .line 899
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 900
    .line 901
    invoke-virtual {v3, v2}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 902
    .line 903
    .line 904
    goto :goto_12

    .line 905
    :catchall_5
    move-exception v0

    .line 906
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 907
    .line 908
    .line 909
    goto :goto_13

    .line 910
    :catchall_6
    move-exception v0

    .line 911
    new-instance v2, Ljava/lang/StringBuilder;

    .line 912
    .line 913
    const-string v3, "[Hchat:SettingsInjector] [PlusLongPress] Hook \u5931\u8d25: "

    .line 914
    .line 915
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 919
    .line 920
    .line 921
    :cond_26
    :goto_13
    return-void
.end method

.method public final s(Ljava/lang/Class;Ljava/lang/Class;Z)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    const-string v2, "superImportUIComponents"

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v3, 0x0

    .line 48
    aget-object v2, v2, v3

    .line 49
    .line 50
    const-class v3, Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v1, 0x0

    .line 60
    :goto_0
    if-nez v1, :cond_3

    .line 61
    .line 62
    :goto_1
    return-void

    .line 63
    :cond_3
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 64
    .line 65
    new-instance v2, Lq8/g;

    .line 66
    .line 67
    invoke-direct {v2, p0, p3, p2, p1}, Lq8/g;-><init>(Lq8/h;ZLjava/lang/Class;Ljava/lang/Class;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final t()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lq8/h;->d:Lib/b;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-object v2, v1, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    const-string v3, "plus_menu_enable"

    .line 9
    .line 10
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v1, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string v2, "plugin_agent_plus_menu_enable"

    .line 22
    .line 23
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v1, p0, Lq8/h;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v1}, Lya/i;->c(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Lf8/i;->T(Landroid/content/Context;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return v0

    .line 46
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 47
    return v0
.end method
