.class public abstract Lu9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:J

.field public static volatile b:J

.field public static volatile c:J


# direct methods
.method public static A(Landroid/app/Activity;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    const/high16 v1, 0x43820000    # 260.0f

    .line 12
    .line 13
    invoke-static {p0, v1}, Lu9;->g(Landroid/content/Context;F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/high16 v2, 0x42880000    # 68.0f

    .line 18
    .line 19
    invoke-static {p0, v2}, Lu9;->g(Landroid/content/Context;F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x43e60000    # 460.0f

    .line 24
    .line 25
    invoke-static {p0, v3}, Lu9;->g(Landroid/content/Context;F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    sub-int/2addr v0, v2

    .line 30
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public static B(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lu9;->x(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p1}, Lu9;->x(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static C(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.mobileqq.qroute.QRoute"

    .line 3
    .line 4
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "api"

    .line 13
    .line 14
    const-class v2, Ljava/lang/Class;

    .line 15
    .line 16
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p0

    .line 37
    :catchall_0
    return-object v0
.end method

.method public static D(Ljava/lang/ClassLoader;Ljava/lang/String;Lpd;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_b

    .line 3
    .line 4
    if-eqz p1, :cond_b

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_b

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget v1, p2, Lpd;->b:I

    .line 15
    .line 16
    iget-object p2, p2, Lpd;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    :try_start_0
    const-string v2, "com.tencent.qqnt.msg.api.IMsgUtilApi"

    .line 27
    .line 28
    invoke-static {p0, v2}, Lu9;->C(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "com.tencent.qqnt.msg.api.IMsgService"

    .line 33
    .line 34
    invoke-static {p0, v3}, Lu9;->C(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v2, :cond_b

    .line 39
    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    invoke-static {v2, p1}, Lu9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    const-string v2, "com.tencent.qqnt.kernel.nativeinterface.Contact"

    .line 52
    .line 53
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string v2, "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"

    .line 61
    .line 62
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :goto_0
    if-nez v2, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/4 v4, 0x1

    .line 70
    if-eq v1, v4, :cond_5

    .line 71
    .line 72
    const/16 v4, 0x64

    .line 73
    .line 74
    if-ne v1, v4, :cond_9

    .line 75
    .line 76
    :cond_5
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_6

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_6
    move v4, v0

    .line 84
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-ge v4, v5, :cond_8

    .line 89
    .line 90
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_7

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    invoke-static {p0, p2}, Lu9;->I(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-lez v4, :cond_9

    .line 113
    .line 114
    move-object p2, p0

    .line 115
    :cond_9
    :goto_2
    invoke-static {v2, p2, v1}, Lu9;->w(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-nez p0, :cond_a

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_a
    new-instance p2, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    invoke-static {v3, p0, p2}, Lu9;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;)Z

    .line 131
    .line 132
    .line 133
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    return p0

    .line 135
    :catchall_0
    move-exception p0

    .line 136
    const-string p1, "cloud-sticker"

    .line 137
    .line 138
    const-string p2, "send-picture"

    .line 139
    .line 140
    invoke-static {p1, p2, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_b
    :goto_3
    return v0
.end method

.method public static E(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const p0, -0x5a5449

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const p0, -0x948d80

    .line 12
    .line 13
    .line 14
    return p0
.end method

.method public static final F(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lpc;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lpc;

    .line 7
    .line 8
    iget-object p0, p0, Lpc;->a:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static G(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const p0, -0x100d09

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const p0, -0xeee7d9

    .line 12
    .line 13
    .line 14
    return p0
.end method

.method public static H(Ljava/util/ArrayList;)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lqd;

    .line 23
    .line 24
    iget-byte v2, v2, Lqd;->a:B

    .line 25
    .line 26
    add-int/lit8 v3, v1, 0x1

    .line 27
    .line 28
    aput-byte v2, v0, v1

    .line 29
    .line 30
    move v1, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public static I(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lu9;->C(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v0, "getUidFromUin"

    .line 11
    .line 12
    const-string v1, "getFriendUidFromUin"

    .line 13
    .line 14
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    aget-object v3, v0, v1

    .line 27
    .line 28
    const-class v4, Ljava/lang/String;

    .line 29
    .line 30
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    instance-of v3, v2, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    move-object v3, v2

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-lez v3, :cond_1

    .line 58
    .line 59
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    return-object v2

    .line 62
    :catchall_0
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    const-string p0, ""

    .line 66
    .line 67
    return-object p0
.end method

.method public static a(Lx2;)V
    .locals 15

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    iget-object p0, p0, Lx2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ge v2, v3, :cond_14

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lxb;

    .line 26
    .line 27
    iget-object v5, v3, Lxb;->s:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    iget-object v6, v3, Lxb;->q:Ljava/lang/String;

    .line 30
    .line 31
    iget v7, v3, Lxb;->i:I

    .line 32
    .line 33
    iget v8, v3, Lxb;->h:I

    .line 34
    .line 35
    iget v9, v3, Lxb;->g:I

    .line 36
    .line 37
    iget-object v10, v3, Lxb;->a:Landroid/view/View;

    .line 38
    .line 39
    if-nez v10, :cond_1

    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_1
    :try_start_0
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    iget v12, v3, Lxb;->b:I

    .line 48
    .line 49
    if-eq v11, v12, :cond_2

    .line 50
    .line 51
    invoke-virtual {v10, v12}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    move v11, v4

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    :cond_2
    move v11, v1

    .line 57
    :goto_1
    :try_start_1
    invoke-virtual {v10}, Landroid/view/View;->getAlpha()F

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    const v13, 0x3c23d70a    # 0.01f

    .line 62
    .line 63
    .line 64
    cmpg-float v12, v12, v13

    .line 65
    .line 66
    if-gtz v12, :cond_3

    .line 67
    .line 68
    iget v12, v3, Lxb;->c:F

    .line 69
    .line 70
    cmpl-float v13, v12, v13

    .line 71
    .line 72
    if-lez v13, :cond_3

    .line 73
    .line 74
    invoke-virtual {v10, v12}, Landroid/view/View;->setAlpha(F)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    move v11, v4

    .line 78
    :catchall_1
    :cond_3
    :try_start_2
    invoke-virtual {v10}, Landroid/view/View;->getMinimumWidth()I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    if-nez v12, :cond_4

    .line 83
    .line 84
    iget v12, v3, Lxb;->d:I

    .line 85
    .line 86
    if-lez v12, :cond_4

    .line 87
    .line 88
    invoke-virtual {v10, v12}, Landroid/view/View;->setMinimumWidth(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    .line 90
    .line 91
    move v11, v4

    .line 92
    :catchall_2
    :cond_4
    :try_start_3
    invoke-virtual {v10}, Landroid/view/View;->getMinimumHeight()I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-nez v12, :cond_5

    .line 97
    .line 98
    iget v12, v3, Lxb;->e:I

    .line 99
    .line 100
    if-lez v12, :cond_5

    .line 101
    .line 102
    invoke-virtual {v10, v12}, Landroid/view/View;->setMinimumHeight(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 103
    .line 104
    .line 105
    move v11, v4

    .line 106
    :catchall_3
    :cond_5
    :try_start_4
    invoke-virtual {v10}, Landroid/view/View;->getPaddingLeft()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-nez v12, :cond_7

    .line 111
    .line 112
    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-nez v12, :cond_7

    .line 117
    .line 118
    invoke-virtual {v10}, Landroid/view/View;->getPaddingRight()I

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-nez v12, :cond_7

    .line 123
    .line 124
    invoke-virtual {v10}, Landroid/view/View;->getPaddingBottom()I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    if-nez v12, :cond_7

    .line 129
    .line 130
    iget v12, v3, Lxb;->f:I

    .line 131
    .line 132
    if-nez v12, :cond_6

    .line 133
    .line 134
    if-nez v9, :cond_6

    .line 135
    .line 136
    if-nez v8, :cond_6

    .line 137
    .line 138
    if-eqz v7, :cond_7

    .line 139
    .line 140
    :cond_6
    invoke-virtual {v10, v12, v9, v8, v7}, Landroid/view/View;->setPadding(IIII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 141
    .line 142
    .line 143
    move v11, v4

    .line 144
    :catchall_4
    :cond_7
    :try_start_5
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-eqz v7, :cond_c

    .line 149
    .line 150
    iget v8, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 151
    .line 152
    if-eqz v8, :cond_8

    .line 153
    .line 154
    iget v8, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 155
    .line 156
    if-nez v8, :cond_c

    .line 157
    .line 158
    :cond_8
    iget v8, v3, Lxb;->j:I

    .line 159
    .line 160
    const/high16 v9, -0x80000000

    .line 161
    .line 162
    if-eq v8, v9, :cond_9

    .line 163
    .line 164
    iput v8, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 165
    .line 166
    :cond_9
    iget v8, v3, Lxb;->k:I

    .line 167
    .line 168
    if-eq v8, v9, :cond_a

    .line 169
    .line 170
    iput v8, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 171
    .line 172
    :cond_a
    iget-boolean v8, v3, Lxb;->p:Z

    .line 173
    .line 174
    if-eqz v8, :cond_b

    .line 175
    .line 176
    instance-of v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 177
    .line 178
    if-eqz v8, :cond_b

    .line 179
    .line 180
    move-object v8, v7

    .line 181
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 182
    .line 183
    iget v9, v3, Lxb;->l:I

    .line 184
    .line 185
    iget v12, v3, Lxb;->m:I

    .line 186
    .line 187
    iget v13, v3, Lxb;->n:I

    .line 188
    .line 189
    iget v14, v3, Lxb;->o:I

    .line 190
    .line 191
    invoke-virtual {v8, v9, v12, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 192
    .line 193
    .line 194
    :cond_b
    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 195
    .line 196
    .line 197
    move v11, v4

    .line 198
    :catchall_5
    :cond_c
    :try_start_6
    iget-boolean v3, v3, Lxb;->r:Z

    .line 199
    .line 200
    if-eqz v3, :cond_e

    .line 201
    .line 202
    instance-of v3, v10, Landroid/widget/TextView;

    .line 203
    .line 204
    if-eqz v3, :cond_e

    .line 205
    .line 206
    move-object v3, v10

    .line 207
    check-cast v3, Landroid/widget/TextView;

    .line 208
    .line 209
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-eqz v3, :cond_d

    .line 214
    .line 215
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-nez v3, :cond_e

    .line 220
    .line 221
    :cond_d
    if-eqz v6, :cond_e

    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-lez v3, :cond_e

    .line 228
    .line 229
    move-object v3, v10

    .line 230
    check-cast v3, Landroid/widget/TextView;

    .line 231
    .line 232
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 233
    .line 234
    .line 235
    move v3, v4

    .line 236
    goto :goto_2

    .line 237
    :catchall_6
    :cond_e
    move v3, v1

    .line 238
    :goto_2
    if-eqz v5, :cond_f

    .line 239
    .line 240
    :try_start_7
    instance-of v6, v10, Landroid/widget/ImageView;

    .line 241
    .line 242
    if-eqz v6, :cond_f

    .line 243
    .line 244
    move-object v6, v10

    .line 245
    check-cast v6, Landroid/widget/ImageView;

    .line 246
    .line 247
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    if-nez v7, :cond_f

    .line 252
    .line 253
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-eqz v5, :cond_f

    .line 262
    .line 263
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 268
    .line 269
    .line 270
    move v3, v4

    .line 271
    :catchall_7
    :cond_f
    if-eqz v11, :cond_10

    .line 272
    .line 273
    :try_start_8
    invoke-virtual {v10}, Landroid/view/View;->requestLayout()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 274
    .line 275
    .line 276
    :catchall_8
    :try_start_9
    invoke-virtual {v10}, Landroid/view/View;->invalidate()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 277
    .line 278
    .line 279
    :catchall_9
    :cond_10
    if-eqz v3, :cond_11

    .line 280
    .line 281
    :try_start_a
    invoke-virtual {v10}, Landroid/view/View;->invalidate()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 282
    .line 283
    .line 284
    :catchall_a
    :cond_11
    if-eqz v11, :cond_12

    .line 285
    .line 286
    aget v5, v0, v1

    .line 287
    .line 288
    add-int/2addr v5, v4

    .line 289
    aput v5, v0, v1

    .line 290
    .line 291
    :cond_12
    if-eqz v3, :cond_13

    .line 292
    .line 293
    aget v3, v0, v4

    .line 294
    .line 295
    add-int/2addr v3, v4

    .line 296
    aput v3, v0, v4

    .line 297
    .line 298
    :cond_13
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_14
    aget p0, v0, v1

    .line 303
    .line 304
    const-wide/16 v1, 0xbb8

    .line 305
    .line 306
    if-lez p0, :cond_16

    .line 307
    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 309
    .line 310
    .line 311
    move-result-wide v5

    .line 312
    sget-wide v7, Lu9;->b:J

    .line 313
    .line 314
    sub-long v7, v5, v7

    .line 315
    .line 316
    cmp-long p0, v7, v1

    .line 317
    .line 318
    if-gez p0, :cond_15

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_15
    sput-wide v5, Lu9;->b:J

    .line 322
    .line 323
    const-string p0, "repeater aio row visibility restored"

    .line 324
    .line 325
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_16
    :goto_4
    aget p0, v0, v4

    .line 329
    .line 330
    if-lez p0, :cond_18

    .line 331
    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 333
    .line 334
    .line 335
    move-result-wide v3

    .line 336
    sget-wide v5, Lu9;->c:J

    .line 337
    .line 338
    sub-long v5, v3, v5

    .line 339
    .line 340
    cmp-long p0, v5, v1

    .line 341
    .line 342
    if-gez p0, :cond_17

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_17
    sput-wide v3, Lu9;->c:J

    .line 346
    .line 347
    const-string p0, "repeater aio row content restored"

    .line 348
    .line 349
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_18
    :goto_5
    return-void
.end method

.method public static b(Ljava/lang/StringBuilder;Ljava/lang/Object;Lu5;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    .line 18
    .line 19
    :goto_0
    if-eqz p2, :cond_2

    .line 20
    .line 21
    check-cast p1, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static c(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const p0, -0xa35b01

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const p0, -0xcb7b01

    .line 12
    .line 13
    .line 14
    return p0
.end method

.method public static d(Landroid/app/Dialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static e(Landroid/view/View;I)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    instance-of v1, p0, Landroid/widget/TextView;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    check-cast v1, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lez v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v4, 0x12

    .line 42
    .line 43
    if-gt v3, v4, :cond_3

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    if-le p1, v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x2b

    .line 53
    .line 54
    if-ne v3, v4, :cond_3

    .line 55
    .line 56
    :cond_1
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v3, "vip"

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    const-string v3, "svip"

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_2

    .line 77
    .line 78
    const-string v3, "lv"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    const-string v3, "level"

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    const-string v3, "\u94ed\u724c"

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_2

    .line 101
    .line 102
    const-string v3, "\u7b49\u7ea7"

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    const-string v3, "\u5e74"

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    const-string v3, "v"

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    :cond_2
    return v2

    .line 127
    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    check-cast p0, Landroid/view/ViewGroup;

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const/16 v3, 0x20

    .line 138
    .line 139
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    move v3, v0

    .line 144
    :goto_0
    if-ge v3, v1, :cond_5

    .line 145
    .line 146
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    add-int/lit8 v5, p1, 0x1

    .line 151
    .line 152
    invoke-static {v4, v5}, Lu9;->e(Landroid/view/View;I)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_4

    .line 157
    .line 158
    return v2

    .line 159
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_5
    :goto_1
    return v0
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    array-length v3, v0

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-string v5, "createPicElement"

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    array-length v5, v4

    .line 33
    const/4 v6, 0x3

    .line 34
    if-ne v5, v6, :cond_1

    .line 35
    .line 36
    aget-object v5, v4, v1

    .line 37
    .line 38
    const-class v6, Ljava/lang/String;

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    aget-object v6, v4, v5

    .line 44
    .line 45
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    if-ne v6, v7, :cond_1

    .line 48
    .line 49
    const/4 v6, 0x2

    .line 50
    aget-object v4, v4, v6

    .line 51
    .line 52
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-eq v4, v6, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    filled-new-array {p1, v4, v5}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    return-object p0

    .line 75
    :catchall_0
    move-exception v3

    .line 76
    const-string v4, "cloud-sticker"

    .line 77
    .line 78
    const-string v5, "create-picture"

    .line 79
    .line 80
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const/4 p0, 0x0

    .line 87
    return-object p0
.end method

.method public static g(Landroid/content/Context;F)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/high16 p0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    :goto_0
    mul-float/2addr p1, p0

    .line 17
    const/high16 p0, 0x3f000000    # 0.5f

    .line 18
    .line 19
    add-float/2addr p1, p0

    .line 20
    float-to-int p0, p1

    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static h(Lca;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lca;->c:I

    .line 4
    .line 5
    iget-object v1, p0, Lca;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lca;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p0}, Lu9;->p(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Lu9;->p(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    if-gez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, "\t"

    .line 33
    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    :goto_0
    const-string p0, ""

    .line 52
    .line 53
    return-object p0
.end method

.method public static i(BBBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lu9;->r(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    shl-int/lit8 v0, p0, 0x1c

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x70

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    shr-int/lit8 v0, v1, 0x1e

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lu9;->r(B)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p3}, Lu9;->r(B)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    and-int/lit8 p0, p0, 0x7

    .line 29
    .line 30
    shl-int/lit8 p0, p0, 0x12

    .line 31
    .line 32
    and-int/lit8 p1, p1, 0x3f

    .line 33
    .line 34
    shl-int/lit8 p1, p1, 0xc

    .line 35
    .line 36
    or-int/2addr p0, p1

    .line 37
    and-int/lit8 p1, p2, 0x3f

    .line 38
    .line 39
    shl-int/lit8 p1, p1, 0x6

    .line 40
    .line 41
    or-int/2addr p0, p1

    .line 42
    and-int/lit8 p1, p3, 0x3f

    .line 43
    .line 44
    or-int/2addr p0, p1

    .line 45
    ushr-int/lit8 p1, p0, 0xa

    .line 46
    .line 47
    const p2, 0xd7c0

    .line 48
    .line 49
    .line 50
    add-int/2addr p1, p2

    .line 51
    int-to-char p1, p1

    .line 52
    aput-char p1, p4, p5

    .line 53
    .line 54
    add-int/lit8 p5, p5, 0x1

    .line 55
    .line 56
    and-int/lit16 p0, p0, 0x3ff

    .line 57
    .line 58
    const p1, 0xdc00

    .line 59
    .line 60
    .line 61
    add-int/2addr p0, p1

    .line 62
    int-to-char p0, p0

    .line 63
    aput-char p0, p4, p5

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    const-string p1, "Invalid UTF-8"

    .line 69
    .line 70
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method public static j(BBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lu9;->r(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const/16 v0, -0x20

    .line 8
    .line 9
    const/16 v1, -0x60

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    if-lt p1, v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v0, -0x13

    .line 16
    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    if-ge p1, v1, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-static {p2}, Lu9;->r(B)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    and-int/lit8 p0, p0, 0xf

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0xc

    .line 30
    .line 31
    and-int/lit8 p1, p1, 0x3f

    .line 32
    .line 33
    shl-int/lit8 p1, p1, 0x6

    .line 34
    .line 35
    or-int/2addr p0, p1

    .line 36
    and-int/lit8 p1, p2, 0x3f

    .line 37
    .line 38
    or-int/2addr p0, p1

    .line 39
    int-to-char p0, p0

    .line 40
    aput-char p0, p3, p4

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p1, "Invalid UTF-8"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static k(BB[CI)V
    .locals 1

    .line 1
    const/16 v0, -0x3e

    .line 2
    .line 3
    if-lt p0, v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Lu9;->r(B)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x1f

    .line 12
    .line 13
    shl-int/lit8 p0, p0, 0x6

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x3f

    .line 16
    .line 17
    or-int/2addr p0, p1

    .line 18
    int-to-char p0, p0

    .line 19
    aput-char p0, p2, p3

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p1, "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p1, "Invalid UTF-8: Illegal leading byte in 2 bytes utf"

    .line 33
    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0
.end method

.method public static l(Landroid/view/View;I[I)V
    .locals 13

    if-eqz p0, :cond_16

    const/16 v0, 0xe

    if-le p1, v0, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v0, 0x0

    .line 1
    aget v1, p2, v0

    const/16 v2, 0x4b0

    if-le v1, v2, :cond_1

    goto/16 :goto_7

    :cond_1
    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 2
    aput v1, p2, v0

    if-lez p1, :cond_12

    if-nez p0, :cond_3

    :cond_2
    :goto_0
    move v1, v0

    goto/16 :goto_5

    .line 3
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 4
    const-string v3, "shine"

    const-string v4, "glow"

    const-string v5, "spark"

    const-string v6, "effect"

    const-string v7, "head"

    const-string v8, "pendant"

    const-string v9, "avatar"

    if-nez v1, :cond_4

    goto/16 :goto_1

    .line 5
    :cond_4
    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "face"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 6
    :cond_5
    const-string v10, "dynamic"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "anim"

    .line 7
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "pag"

    .line 8
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "lottie"

    .line 9
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "svga"

    .line 10
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "vapie"

    .line 11
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "video"

    .line 12
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "live"

    .line 13
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "magic"

    .line 14
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 15
    invoke-virtual {v1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "flash"

    .line 16
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 17
    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 18
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_6

    goto/16 :goto_3

    .line 20
    :cond_6
    :goto_1
    const-string v10, "avatarview"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".avatar"

    invoke-virtual {v1, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "simpleavatar"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_7

    goto/16 :goto_0

    .line 21
    :cond_7
    const-string v10, "aio"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    const-string v11, "label"

    if-eqz v10, :cond_a

    const-string v10, "vip"

    .line 22
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "vas"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "nameplate"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 23
    :cond_8
    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string v10, "badge"

    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v1, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_a

    :cond_9
    move v10, v2

    goto :goto_2

    :cond_a
    move v10, v0

    .line 24
    :goto_2
    const-string v12, "vipicon"

    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_d

    const-string v12, "vip_icon"

    .line 25
    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_d

    const-string v12, "viptag"

    .line 26
    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_d

    const-string v12, "vip_tag"

    .line 27
    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_d

    if-nez v10, :cond_d

    const-string v10, "profilelabel"

    .line 28
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "memberlabel"

    .line 29
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "identitylabel"

    .line 30
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "apollo"

    .line 31
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v1, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_b
    const-string v10, "avatarpendant"

    .line 32
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "headpendant"

    .line 33
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "pendantview"

    .line 34
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "avatarframe"

    .line 35
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "headframe"

    .line 36
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "avatarborder"

    .line 37
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "headdecor"

    .line 38
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "avatardecor"

    .line 39
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "avatarhalo"

    .line 40
    invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_3

    .line 41
    :cond_c
    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_e

    :cond_d
    :goto_3
    move v1, v2

    goto :goto_5

    .line 42
    :cond_e
    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    const-string v5, "star"

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, "particle"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_f

    invoke-virtual {v1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 43
    :cond_f
    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-virtual {v1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_3

    .line 44
    :cond_10
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    const/4 v1, 0x0

    :goto_4
    if-nez v1, :cond_11

    goto/16 :goto_0

    .line 45
    :cond_11
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    const-string v3, "\u5934\u50cf\u6302\u4ef6"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "\u6302\u4ef6"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "\u5934\u50cf\u73a9\u6cd5"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :goto_5
    if-eqz v1, :cond_12

    .line 47
    invoke-static {p0}, Lv4;->q(Ljava/lang/Object;)V

    return-void

    :cond_12
    if-lez p1, :cond_15

    .line 48
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_15

    invoke-static {p0, v0}, Lu9;->e(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    if-lez v1, :cond_13

    const/high16 v4, 0x42200000    # 40.0f

    .line 51
    invoke-static {p0, v4}, Lv4;->i(Landroid/view/View;F)I

    move-result v4

    if-gt v1, v4, :cond_15

    :cond_13
    if-lez v3, :cond_14

    const/high16 v1, 0x43340000    # 180.0f

    invoke-static {p0, v1}, Lv4;->i(Landroid/view/View;F)I

    move-result v1

    if-gt v3, v1, :cond_15

    .line 52
    :cond_14
    invoke-static {p0}, Lv4;->q(Ljava/lang/Object;)V

    return-void

    .line 53
    :cond_15
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_16

    .line 54
    check-cast p0, Landroid/view/ViewGroup;

    .line 55
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/16 v3, 0x78

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_6
    if-ge v0, v1, :cond_16

    .line 56
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    add-int/lit8 v4, p1, 0x1

    invoke-static {v3, v4, p2}, Lu9;->l(Landroid/view/View;I[I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_16
    :goto_7
    return-void
.end method

.method public static m(Landroid/view/View;IIIII[I)V
    .locals 11

    .line 1
    move/from16 v7, p5

    .line 2
    .line 3
    if-eqz p0, :cond_6

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    if-le v7, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    aget v1, p6, v0

    .line 13
    .line 14
    const/16 v2, 0xdc

    .line 15
    .line 16
    if-le v1, v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_1
    const/4 v8, 0x1

    .line 21
    add-int/2addr v1, v8

    .line 22
    aput v1, p6, v0

    .line 23
    .line 24
    if-lez v7, :cond_5

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    if-eq v1, v2, :cond_5

    .line 33
    .line 34
    const-string v1, "\u5207\u6362\u8d26\u53f7"

    .line 35
    .line 36
    invoke-static {p0, v1, v0}, Li5;->Q(Landroid/view/View;Ljava/lang/String;I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p0}, Lrb;->h(Landroid/view/View;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    invoke-static {p0, v0}, Lrb;->a(Landroid/view/View;I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-lez v1, :cond_5

    .line 65
    .line 66
    if-lez v2, :cond_5

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    :try_start_0
    new-array v3, v3, [I

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 72
    .line 73
    .line 74
    aget v5, v3, v0

    .line 75
    .line 76
    sub-int/2addr v5, p1

    .line 77
    int-to-float v5, v5

    .line 78
    int-to-float v1, v1

    .line 79
    int-to-float v2, v2

    .line 80
    aget v3, v3, v8

    .line 81
    .line 82
    sub-int/2addr v3, p2

    .line 83
    int-to-float v3, v3

    .line 84
    const/high16 v6, 0x40000000    # 2.0f

    .line 85
    .line 86
    div-float v9, v2, v6

    .line 87
    .line 88
    add-float/2addr v9, v3

    .line 89
    invoke-static {v8, p4}, Ljava/lang/Math;->max(II)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    int-to-float v3, v3

    .line 94
    div-float/2addr v9, v3

    .line 95
    div-float v3, v1, v6

    .line 96
    .line 97
    add-float/2addr v3, v5

    .line 98
    invoke-static {v8, p3}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    int-to-float v5, v5

    .line 103
    div-float/2addr v3, v5

    .line 104
    const v5, 0x3f2e147b    # 0.68f

    .line 105
    .line 106
    .line 107
    cmpl-float v3, v3, v5

    .line 108
    .line 109
    if-lez v3, :cond_5

    .line 110
    .line 111
    const v3, 0x3e8f5c29    # 0.28f

    .line 112
    .line 113
    .line 114
    cmpl-float v3, v9, v3

    .line 115
    .line 116
    if-lez v3, :cond_5

    .line 117
    .line 118
    const v3, 0x3f666666    # 0.9f

    .line 119
    .line 120
    .line 121
    cmpg-float v3, v9, v3

    .line 122
    .line 123
    if-gez v3, :cond_5

    .line 124
    .line 125
    int-to-float v3, p3

    .line 126
    const v5, 0x3ef5c28f    # 0.48f

    .line 127
    .line 128
    .line 129
    mul-float/2addr v3, v5

    .line 130
    cmpg-float v1, v1, v3

    .line 131
    .line 132
    if-gez v1, :cond_5

    .line 133
    .line 134
    int-to-float v1, p4

    .line 135
    const v3, 0x3f333333    # 0.7f

    .line 136
    .line 137
    .line 138
    mul-float/2addr v1, v3

    .line 139
    cmpg-float v1, v2, v1

    .line 140
    .line 141
    if-gez v1, :cond_5

    .line 142
    .line 143
    :cond_4
    :goto_0
    invoke-static {p0}, Lv4;->q(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :catchall_0
    :cond_5
    :goto_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 148
    .line 149
    if-eqz v1, :cond_6

    .line 150
    .line 151
    check-cast p0, Landroid/view/ViewGroup;

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    const/16 v2, 0x3c

    .line 158
    .line 159
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    move v10, v0

    .line 164
    :goto_2
    if-ge v10, v9, :cond_6

    .line 165
    .line 166
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    add-int/lit8 v5, v7, 0x1

    .line 171
    .line 172
    move v1, p1

    .line 173
    move v2, p2

    .line 174
    move v3, p3

    .line 175
    move v4, p4

    .line 176
    move-object/from16 v6, p6

    .line 177
    .line 178
    invoke-static/range {v0 .. v6}, Lu9;->m(Landroid/view/View;IIIII[I)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v10, v10, 0x1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    :goto_3
    return-void
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    array-length v3, v0

    .line 12
    if-ge v2, v3, :cond_4

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    const-string v4, "sendMsg"

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x1

    .line 34
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    array-length v6, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const-class v7, Ljava/util/List;

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    if-ne v6, v8, :cond_1

    .line 42
    .line 43
    :try_start_1
    aget-object v6, v4, v1

    .line 44
    .line 45
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    aget-object v6, v4, v5

    .line 52
    .line 53
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception v3

    .line 68
    goto :goto_3

    .line 69
    :cond_1
    array-length v6, v4

    .line 70
    const/4 v9, 0x3

    .line 71
    if-ne v6, v9, :cond_3

    .line 72
    .line 73
    aget-object v6, v4, v1

    .line 74
    .line 75
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    aget-object v6, v4, v5

    .line 82
    .line 83
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    aget-object v6, v4, v8

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/Class;->isInterface()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    aget-object v6, v4, v8

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    aget-object v4, v4, v8

    .line 104
    .line 105
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    new-instance v7, Lsb;

    .line 110
    .line 111
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {v6, v4, v7}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    const/4 v4, 0x0

    .line 120
    :goto_1
    filled-new-array {p1, p2, v4}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    :goto_2
    return v5

    .line 128
    :goto_3
    const-string v4, "cloud-sticker"

    .line 129
    .line 130
    const-string v5, "invoke-send"

    .line 131
    .line 132
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    return v1
.end method

.method public static o(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const-string v0, "system"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "ui_theme_mode"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :catchall_0
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    and-int/lit8 p0, p0, 0x30

    .line 22
    .line 23
    const/16 v3, 0x20

    .line 24
    .line 25
    if-ne p0, v3, :cond_0

    .line 26
    .line 27
    move p0, v1

    .line 28
    goto :goto_0

    .line 29
    :catchall_1
    :cond_0
    move p0, v2

    .line 30
    :goto_0
    const-string v3, "dark"

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v1, "light"

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move v1, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v1, p0

    .line 50
    :goto_1
    return v1
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static q(Landroid/view/View;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "recyclerview"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-nez v2, :cond_4

    .line 27
    .line 28
    const-string v2, "recycler"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_4

    .line 35
    .line 36
    const-string v2, "abslistview"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    const-string v2, "xlistview"

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    const-string v2, "listview"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const-string v2, "msglist"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    return v0

    .line 70
    :cond_2
    const-string v1, "getAdapter"

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v4, 0x0

    .line 77
    :try_start_0
    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    :try_start_1
    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    :catchall_1
    move-object v1, v4

    .line 101
    :goto_0
    if-eqz v1, :cond_3

    .line 102
    .line 103
    return v3

    .line 104
    :cond_3
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v1, "getChildAdapterPosition"

    .line 109
    .line 110
    const-class v2, Landroid/view/View;

    .line 111
    .line 112
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 117
    .line 118
    .line 119
    return v3

    .line 120
    :catchall_2
    return v0

    .line 121
    :cond_4
    :goto_1
    return v3
.end method

.method public static r(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, ".mp3"

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    const-string v2, ".m4a"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    const-string v2, ".aac"

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-string v2, ".wav"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    const-string v2, ".flac"

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    const-string v2, ".ogg"

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    const-string v2, ".opus"

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string v0, ".wma"

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    const-string v0, ".aif"

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    const-string v0, ".aiff"

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    const-string v0, ".ape"

    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public static t(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, ".slk"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ".silk"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, ".ptt"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, ".amr"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    const-string v0, ".bin"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    return p0

    .line 50
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 51
    return p0
.end method

.method public static u(I)I
    .locals 1

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    const/4 v0, 0x3

    .line 5
    if-ge p0, v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    if-ge p0, v0, :cond_2

    .line 13
    .line 14
    int-to-float p0, p0

    .line 15
    const/high16 v0, 0x3f400000    # 0.75f

    .line 16
    .line 17
    div-float/2addr p0, v0

    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    add-float/2addr p0, v0

    .line 21
    float-to-int p0, p0

    .line 22
    return p0

    .line 23
    :cond_2
    const p0, 0x7fffffff

    .line 24
    .line 25
    .line 26
    return p0
.end method

.method public static v(Landroid/content/Context;IF)I
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1, p2}, Ljava/lang/Math;->max(FF)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sub-float/2addr v0, p2

    .line 13
    invoke-static {p0}, Lu9;->y(Landroid/content/Context;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    mul-float/2addr v1, v0

    .line 23
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-float v2, v2

    .line 28
    mul-float/2addr v2, p2

    .line 29
    add-float/2addr v2, v1

    .line 30
    float-to-int v1, v2

    .line 31
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    int-to-float v2, v2

    .line 36
    mul-float/2addr v2, v0

    .line 37
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-float v3, v3

    .line 42
    mul-float/2addr v3, p2

    .line 43
    add-float/2addr v3, v2

    .line 44
    float-to-int v2, v3

    .line 45
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-float p1, p1

    .line 50
    mul-float/2addr p1, v0

    .line 51
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    int-to-float p0, p0

    .line 56
    mul-float/2addr p0, p2

    .line 57
    add-float/2addr p0, p1

    .line 58
    float-to-int p0, p0

    .line 59
    invoke-static {v1, v2, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
.end method

.method public static w(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    array-length v3, v2

    .line 17
    const/4 v4, 0x3

    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    aget-object v3, v2, v0

    .line 21
    .line 22
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne v3, v4, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    aget-object v4, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const-class v5, Ljava/lang/String;

    .line 30
    .line 31
    if-ne v4, v5, :cond_0

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    :try_start_1
    aget-object v2, v2, v4

    .line 35
    .line 36
    if-ne v2, v5, :cond_0

    .line 37
    .line 38
    aget-object v0, p0, v1

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    aget-object p0, p0, v1

    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string v0, ""

    .line 50
    .line 51
    filled-new-array {p2, p1, v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    return-object p0

    .line 60
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    :cond_1
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public static x(I)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v0, 0x1

    .line 6
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_1
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static y(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const p0, -0xe2e0db

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, -0x1

    .line 12
    return p0
.end method

.method public static z(Landroid/app/Activity;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 10
    .line 11
    const/high16 v1, 0x433e0000    # 190.0f

    .line 12
    .line 13
    invoke-static {p0, v1}, Lu9;->g(Landroid/content/Context;F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/high16 v2, 0x43b40000    # 360.0f

    .line 18
    .line 19
    invoke-static {p0, v2}, Lu9;->g(Landroid/content/Context;F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x438b0000    # 278.0f

    .line 24
    .line 25
    invoke-static {p0, v3}, Lu9;->g(Landroid/content/Context;F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    sub-int/2addr v0, v2

    .line 30
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method
