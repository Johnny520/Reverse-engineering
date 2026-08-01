.class public L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

.field public static final 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪苏兰世哲()Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x67

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰楪哲([Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x68

    .line 20
    .line 21
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    filled-new-array {v1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪([Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰()Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-nez v0, :cond_0

    .line 43
    .line 44
    const/16 v0, 0x69

    .line 45
    .line 46
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_0
    return-object v0
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 9

    .line 1
    sget-object v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_3

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    const-class v7, Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    filled-new-array {v6, v7, v8, v6}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v7, v5, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 52
    .line 53
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 54
    .line 55
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    sput-object v5, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const/16 v5, 0x65

    .line 78
    .line 79
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sput-object p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catch_1
    move-exception p0

    .line 100
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    return-object p0

    .line 105
    :cond_3
    :goto_2
    sget-object p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    .line 106
    .line 107
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 10

    .line 1
    const/16 p1, 0x61

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    array-length v0, p1

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    const/16 v3, 0x62

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v6, p1, v2

    .line 29
    .line 30
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v6, v5

    .line 56
    :goto_1
    invoke-static {v6}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-class v0, Landroid/view/ViewGroup;

    .line 61
    .line 62
    const-class v2, Ljava/util/List;

    .line 63
    .line 64
    filled-new-array {v0, v2}, [Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v6, p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    iput-object v0, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v2, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;

    .line 79
    .line 80
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 84
    .line 85
    .line 86
    const/16 p1, 0x63

    .line 87
    .line 88
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    array-length v0, p1

    .line 101
    move v2, v1

    .line 102
    :goto_2
    if-ge v2, v0, :cond_3

    .line 103
    .line 104
    aget-object v6, p1, v2

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    array-length v8, v7

    .line 111
    const/4 v9, 0x3

    .line 112
    if-ne v8, v9, :cond_2

    .line 113
    .line 114
    aget-object v8, v7, v1

    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    const/16 v9, 0x64

    .line 121
    .line 122
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_2

    .line 131
    .line 132
    aget-object v8, v7, v4

    .line 133
    .line 134
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_2

    .line 147
    .line 148
    const/4 v8, 0x2

    .line 149
    aget-object v7, v7, v8

    .line 150
    .line 151
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 152
    .line 153
    if-ne v7, v8, :cond_2

    .line 154
    .line 155
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 156
    .line 157
    .line 158
    move-object v5, v6

    .line 159
    goto :goto_3

    .line 160
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    :goto_3
    new-instance p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;

    .line 164
    .line 165
    invoke-direct {p1, p0, v4}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v5, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x60

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
