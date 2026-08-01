.class public abstract Lt9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static volatile b:Z

.field public static volatile c:Z

.field public static volatile d:Z

.field public static volatile e:Z

.field public static volatile f:Z

.field public static volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.tencent.open.agent.QrAgentLoginManager$a"

    .line 2
    .line 3
    const-string v1, "com.tencent.open.agent.QrAgentLoginManager$2"

    .line 4
    .line 5
    const-string v2, "com.tencent.open.agent.QrAgentLoginManager"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lt9;->a:[Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-boolean v0, Lt9;->b:Z

    .line 15
    .line 16
    sput-boolean v0, Lt9;->c:Z

    .line 17
    .line 18
    sput-boolean v0, Lt9;->d:Z

    .line 19
    .line 20
    sput-boolean v0, Lt9;->e:Z

    .line 21
    .line 22
    sput-boolean v0, Lt9;->f:Z

    .line 23
    .line 24
    sput-boolean v0, Lt9;->g:Z

    .line 25
    .line 26
    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, -0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v5, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v0, :cond_7

    .line 12
    .line 13
    aget-object v6, p0, v4

    .line 14
    .line 15
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-eq v7, v8, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    array-length v8, v7

    .line 29
    const/4 v9, 0x1

    .line 30
    const/4 v10, 0x3

    .line 31
    const/4 v11, 0x4

    .line 32
    if-lt v8, v11, :cond_1

    .line 33
    .line 34
    aget-object v8, v7, v9

    .line 35
    .line 36
    invoke-static {v8}, Lt9;->g(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    const/4 v8, 0x2

    .line 43
    aget-object v8, v7, v8

    .line 44
    .line 45
    const-class v12, Ljava/lang/String;

    .line 46
    .line 47
    if-ne v8, v12, :cond_1

    .line 48
    .line 49
    aget-object v8, v7, v10

    .line 50
    .line 51
    const-class v12, Landroid/os/Bundle;

    .line 52
    .line 53
    if-ne v8, v12, :cond_1

    .line 54
    .line 55
    const/16 v7, 0x64

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    array-length v8, v7

    .line 59
    if-ne v8, v10, :cond_2

    .line 60
    .line 61
    aget-object v8, v7, v3

    .line 62
    .line 63
    invoke-static {v8}, Lt9;->g(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    const/16 v7, 0x5a

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    array-length v8, v7

    .line 73
    if-ne v8, v11, :cond_3

    .line 74
    .line 75
    aget-object v8, v7, v9

    .line 76
    .line 77
    invoke-static {v8}, Lt9;->g(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_3

    .line 82
    .line 83
    const/16 v7, 0x50

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    array-length v8, v7

    .line 87
    move v9, v3

    .line 88
    :goto_1
    if-ge v9, v8, :cond_5

    .line 89
    .line 90
    aget-object v10, v7, v9

    .line 91
    .line 92
    invoke-static {v10}, Lt9;->g(Ljava/lang/Class;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_4

    .line 97
    .line 98
    const/16 v7, 0x1e

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    move v7, v3

    .line 105
    :goto_2
    if-le v7, v1, :cond_6

    .line 106
    .line 107
    move-object v5, v6

    .line 108
    move v1, v7

    .line 109
    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    if-lez v1, :cond_8

    .line 113
    .line 114
    return-object v5

    .line 115
    :cond_8
    return-object v2
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/reflect/Method;
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
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne v7, v8, :cond_2

    .line 25
    .line 26
    array-length v7, v6

    .line 27
    if-ne v7, v4, :cond_2

    .line 28
    .line 29
    aget-object v6, v6, v2

    .line 30
    .line 31
    invoke-static {v6}, Lt9;->g(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_1
    if-nez v1, :cond_2

    .line 63
    .line 64
    move-object v1, v5

    .line 65
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-object v1
.end method

.method public static c(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x61

    .line 3
    .line 4
    :goto_0
    const/16 v2, 0x70

    .line 5
    .line 6
    if-ge v1, v2, :cond_2

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "com.tencent.biz.qrcode.activity.QRLoginAuthActivity$"

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :try_start_0
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-class v4, Landroid/os/CountDownTimer;

    .line 35
    .line 36
    if-eq v3, v4, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    :try_start_1
    new-instance v3, Lp9;

    .line 40
    .line 41
    const/16 v4, 0x5a

    .line 42
    .line 43
    invoke-direct {v3, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception v3

    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v5, "hook known QR timer failed: "

    .line 56
    .line 57
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, " "

    .line 68
    .line 69
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Lt9;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    int-to-char v1, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    if-lez v0, :cond_3

    .line 87
    .line 88
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v1, "hooked QR confirm timer classes: "

    .line 91
    .line 92
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void
.end method

.method public static d(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    :try_start_0
    const-string v0, "com.tencent.biz.qrcode.activity.QRLoginAuthActivity"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_1
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-object v0, v1

    .line 10
    :goto_0
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_0
    :try_start_2
    const-string v2, "confirm_risk_login_btn"

    .line 15
    .line 16
    const-string v3, "com.tencent.mobileqq.R$id"

    .line 17
    .line 18
    filled-new-array {v3}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    aget-object v3, v3, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    :try_start_3
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of v2, p0, Ljava/lang/Integer;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    check-cast p0, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    :cond_1
    move p0, v4

    .line 53
    :goto_1
    :try_start_4
    invoke-static {v0}, Lt9;->b(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    array-length v6, v3

    .line 62
    move v7, v4

    .line 63
    :goto_2
    if-ge v7, v6, :cond_3

    .line 64
    .line 65
    aget-object v8, v3, v7

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    const-string v10, "onClick"

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_2

    .line 82
    .line 83
    array-length v10, v9

    .line 84
    if-ne v10, v5, :cond_2

    .line 85
    .line 86
    const-class v10, Landroid/view/View;

    .line 87
    .line 88
    aget-object v9, v9, v4

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    move-object v8, v1

    .line 104
    :goto_3
    sget-boolean v3, Lt9;->f:Z

    .line 105
    .line 106
    if-nez v3, :cond_4

    .line 107
    .line 108
    if-eqz p0, :cond_4

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    if-eqz v8, :cond_4

    .line 113
    .line 114
    new-instance v3, Lq9;

    .line 115
    .line 116
    invoke-direct {v3, p0, v2}, Lq9;-><init>(ILjava/lang/reflect/Method;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v8, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 120
    .line 121
    .line 122
    sput-boolean v5, Lt9;->f:Z

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v3, "hooked QRLoginAuthActivity confirm click fallback -> "

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-static {v8}, Lt9;->i(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v2}, Lt9;->h(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    array-length v2, v0

    .line 153
    move v3, v4

    .line 154
    :goto_4
    if-ge v3, v2, :cond_6

    .line 155
    .line 156
    aget-object v6, v0, v3

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-eqz v8, :cond_5

    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 177
    .line 178
    if-ne v8, v9, :cond_5

    .line 179
    .line 180
    array-length v8, v7

    .line 181
    if-ne v8, v5, :cond_5

    .line 182
    .line 183
    aget-object v7, v7, v4

    .line 184
    .line 185
    const-class v8, Ljava/lang/String;

    .line 186
    .line 187
    if-ne v7, v8, :cond_5

    .line 188
    .line 189
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    move-object v1, v6

    .line 193
    goto :goto_5

    .line 194
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    :goto_5
    sget-boolean v0, Lt9;->g:Z

    .line 198
    .line 199
    if-nez v0, :cond_8

    .line 200
    .line 201
    if-eqz p0, :cond_8

    .line 202
    .line 203
    if-nez v1, :cond_7

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_7
    new-instance v0, Lr9;

    .line 207
    .line 208
    invoke-direct {v0, p0}, Lr9;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 212
    .line 213
    .line 214
    sput-boolean v5, Lt9;->g:Z

    .line 215
    .line 216
    new-instance p0, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v0, "hooked QRLoginAuthActivity start countdown fallback -> "

    .line 222
    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-static {v1}, Lt9;->i(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 238
    .line 239
    .line 240
    goto :goto_6

    .line 241
    :catchall_2
    move-exception p0

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v1, "hookQrAuthActivityFallback failed: "

    .line 245
    .line 246
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    :goto_6
    return-void
.end method

.method public static e(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    sget-boolean v0, Lt9;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lt9;->e:Z

    .line 8
    .line 9
    :try_start_0
    const-string v0, "com.tencent.mobileqq.utils.DialogUtil"

    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "createCountdownDialog"

    .line 16
    .line 17
    const-class v1, Landroid/content/Context;

    .line 18
    .line 19
    const-class v2, Ljava/lang/String;

    .line 20
    .line 21
    const-class v3, Ljava/lang/CharSequence;

    .line 22
    .line 23
    const-class v4, Ljava/lang/String;

    .line 24
    .line 25
    const-class v5, Ljava/lang/String;

    .line 26
    .line 27
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v9, Landroid/view/View$OnClickListener;

    .line 32
    .line 33
    const-class v10, Landroid/view/View$OnClickListener;

    .line 34
    .line 35
    new-instance v11, Ls9;

    .line 36
    .line 37
    const/16 v8, 0x3c

    .line 38
    .line 39
    invoke-direct {v11, v8}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 40
    .line 41
    .line 42
    move-object v8, v7

    .line 43
    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 48
    .line 49
    .line 50
    const-string p0, "hooked QR confirm fast-path openSdk createCountdownDialog"

    .line 51
    .line 52
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "hookQrConfirmFastPathOpenSdk failed: "

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static declared-synchronized f(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-class v0, Lt9;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lt9;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

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
    sget-object v1, Lt9;->a:[Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v4, v2

    .line 15
    :goto_0
    const/4 v5, 0x3

    .line 16
    if-ge v3, v5, :cond_3

    .line 17
    .line 18
    aget-object v5, v1, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    :try_start_2
    invoke-static {v5, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-object v5, v2

    .line 26
    :goto_1
    if-nez v5, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :try_start_3
    invoke-static {v5}, Lt9;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception p0

    .line 40
    goto :goto_4

    .line 41
    :cond_3
    :goto_3
    const/4 p0, 0x1

    .line 42
    if-nez v4, :cond_5

    .line 43
    .line 44
    sget-boolean v1, Lt9;->c:Z

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    sput-boolean p0, Lt9;->c:Z

    .line 49
    .line 50
    const-string p0, "QR gallery gate: target method not found in QR agent candidates"

    .line 51
    .line 52
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    .line 54
    .line 55
    :cond_4
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :cond_5
    :try_start_4
    invoke-virtual {v4, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {v4}, Lt9;->j(Ljava/lang/reflect/Method;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    new-instance v2, Lo9;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Lo9;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v4, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 70
    .line 71
    .line 72
    sput-boolean p0, Lt9;->b:Z

    .line 73
    .line 74
    new-instance p0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v1, "hooked QR gallery gate -> "

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-static {v4}, Lt9;->i(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :goto_4
    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v2, "hookQrGalleryGate failed: "

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Lt9;->h(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 117
    .line 118
    .line 119
    :goto_5
    monitor-exit v0

    .line 120
    return-void

    .line 121
    :catchall_2
    move-exception p0

    .line 122
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 123
    throw p0
.end method

.method public static g(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

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

.method public static h(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->shouldLogMessage(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Elaris: "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    array-length v2, p0

    .line 40
    if-ge v1, v2, :cond_1

    .line 41
    .line 42
    if-lez v1, :cond_0

    .line 43
    .line 44
    const/16 v2, 0x2c

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_0
    aget-object v2, p0, v1

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/16 p0, 0x29

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static j(Ljava/lang/reflect/Method;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x4

    .line 9
    if-lt v0, v3, :cond_0

    .line 10
    .line 11
    aget-object v0, p0, v2

    .line 12
    .line 13
    invoke-static {v0}, Lt9;->g(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    aget-object v0, p0, v0

    .line 21
    .line 22
    const-class v4, Ljava/lang/String;

    .line 23
    .line 24
    if-ne v0, v4, :cond_0

    .line 25
    .line 26
    aget-object v0, p0, v1

    .line 27
    .line 28
    const-class v4, Landroid/os/Bundle;

    .line 29
    .line 30
    if-ne v0, v4, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    array-length v0, p0

    .line 34
    const/4 v4, 0x0

    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    aget-object v0, p0, v4

    .line 38
    .line 39
    invoke-static {v0}, Lt9;->g(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    return v4

    .line 46
    :cond_1
    array-length v0, p0

    .line 47
    if-ne v0, v3, :cond_2

    .line 48
    .line 49
    aget-object v0, p0, v2

    .line 50
    .line 51
    invoke-static {v0}, Lt9;->g(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    :goto_0
    return v2

    .line 58
    :cond_2
    :goto_1
    array-length v0, p0

    .line 59
    if-ge v4, v0, :cond_4

    .line 60
    .line 61
    aget-object v0, p0, v4

    .line 62
    .line 63
    invoke-static {v0}, Lt9;->g(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    return v4

    .line 70
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 p0, -0x1

    .line 74
    return p0
.end method
