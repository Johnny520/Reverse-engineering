.class public abstract Lv6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/util/Map;

.field public static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.msglist.holder.component.avatar.b"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lv6;->a:[Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lv6;->b:Ljava/util/Map;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    move-object v3, v0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/4 v4, 0x1

    .line 9
    if-ge v2, v4, :cond_b

    .line 10
    .line 11
    sget-object v5, Lv6;->a:[Ljava/lang/String;

    .line 12
    .line 13
    aget-object v5, v5, v2

    .line 14
    .line 15
    invoke-static {v5, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-eqz v5, :cond_5

    .line 20
    .line 21
    const-class v6, Landroid/view/View$OnLongClickListener;

    .line 22
    .line 23
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_5

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    array-length v7, v6

    .line 34
    move v8, v1

    .line 35
    move v9, v8

    .line 36
    :goto_1
    if-ge v8, v7, :cond_2

    .line 37
    .line 38
    aget-object v10, v6, v8

    .line 39
    .line 40
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-nez v11, :cond_1

    .line 49
    .line 50
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {p1, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    add-int/lit8 v9, v9, 0x1

    .line 61
    .line 62
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    if-eq v9, v4, :cond_3

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    array-length v6, v5

    .line 73
    move-object v8, v0

    .line 74
    move v7, v1

    .line 75
    :goto_2
    if-ge v7, v6, :cond_8

    .line 76
    .line 77
    aget-object v9, v5, v7

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    const-string v11, "onLongClick"

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_7

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-nez v11, :cond_7

    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 110
    .line 111
    if-ne v11, v12, :cond_7

    .line 112
    .line 113
    array-length v11, v10

    .line 114
    if-ne v11, v4, :cond_7

    .line 115
    .line 116
    aget-object v10, v10, v1

    .line 117
    .line 118
    const-class v11, Landroid/view/View;

    .line 119
    .line 120
    if-eq v10, v11, :cond_4

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_4
    if-eqz v8, :cond_6

    .line 124
    .line 125
    :cond_5
    :goto_3
    move-object v8, v0

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    move-object v8, v9

    .line 128
    :cond_7
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_8
    :goto_5
    if-nez v8, :cond_9

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_9
    if-eqz v3, :cond_a

    .line 135
    .line 136
    invoke-virtual {v3, v8}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_a

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_a
    move-object v3, v8

    .line 144
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_b
    return-object v3
.end method
