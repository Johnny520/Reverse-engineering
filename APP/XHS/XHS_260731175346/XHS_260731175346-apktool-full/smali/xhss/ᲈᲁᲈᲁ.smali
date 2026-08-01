.class public final Lxhss/ᲈᲁᲈᲁ;
.super Lxhss/ᲇᛱᲈᛸ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static volatile ᛷᛴᛷᛱ:Z

.field public static final ᛸᛲᲀᛵ:Ljava/util/Set;

.field public static final ᛸᛴᛶᛳ:Ljava/util/WeakHashMap;

.field public static final ᛸᛷᲈᲈ:Ljava/util/WeakHashMap;

.field public static volatile ᲀᲇᛳᲁ:Ljava/lang/String;

.field public static final ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

.field public static volatile ᲇᛶᛴᲀ:I

.field public static final ᲈᛳᲀ:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᲈᲁᲈᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᲇᛱᲈᛸ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxhss/ᲈᲁᲈᲁ;->ᛸᛴᛶᛳ:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-wide v1, -0x1410b1b858845L

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    sput-object v0, Lxhss/ᲈᲁᲈᲁ;->ᛸᛲᲀᛵ:Ljava/util/Set;

    .line 33
    .line 34
    new-instance v0, Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lxhss/ᲈᲁᲈᲁ;->ᛸᛷᲈᲈ:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    new-instance v0, Lxhss/ᲈᲀᛶᛸ;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lxhss/ᲈᲁᲈᲁ;->ᲈᛳᲀ:Ljava/lang/ThreadLocal;

    .line 51
    .line 52
    return-void
.end method

.method public static ᛱᛳᲁᲈ(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lxhss/ᲈᲁᲈᲁ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lxhss/ᲈᲁᲈᲁ;->ᲈᛳᲀ:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :try_start_0
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, p0}, Lio/github/libxposed/api/XposedModule;->getInvoker(Ljava/lang/reflect/Method;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Lio/github/libxposed/api/XposedInterface$Invoker$Type;->ORIGIN:Lio/github/libxposed/api/XposedInterface$Invoker$Type$Origin;

    .line 31
    .line 32
    invoke-interface {v2, v3}, Lio/github/libxposed/api/XposedInterface$Invoker;->setType(Lio/github/libxposed/api/XposedInterface$Invoker$Type;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    array-length v3, p2

    .line 37
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {v2, p1, p2}, Lio/github/libxposed/api/XposedInterface$Invoker;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-wide v2, -0x139a01b858845L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-wide p2, -0x139a91b858845L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/16 p2, 0x2e

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-wide p1, -0xfd001b858845L

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    const-wide p1, -0xfce91b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_0

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    move p2, v0

    .line 131
    :goto_0
    if-ge p2, p1, :cond_2

    .line 132
    .line 133
    add-int/lit16 p3, p2, 0x7d0

    .line 134
    .line 135
    if-le p3, p1, :cond_1

    .line 136
    .line 137
    move p3, p1

    .line 138
    :cond_1
    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    const-wide v2, -0xfcf11b858845L

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {p2}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    move p2, p3

    .line 159
    goto :goto_0

    .line 160
    :cond_2
    :goto_1
    invoke-static {}, Lxhss/ᲈᲁᲈᲁ;->ᲁᲁᛴᲁ()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    add-int/lit8 p0, p0, -0x1

    .line 165
    .line 166
    if-gez p0, :cond_3

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move v0, p0

    .line 170
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {v1, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    invoke-static {}, Lxhss/ᲈᲁᲈᲁ;->ᲁᲁᛴᲁ()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    add-int/lit8 p1, p1, -0x1

    .line 184
    .line 185
    if-gez p1, :cond_4

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    move v0, p1

    .line 189
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {v1, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    throw p0
.end method

.method public static native ᛱᲈᛳᛴ(Ljava/lang/String;)Lxhss/ᲇᛲᛲᛲ;
.end method

.method public static native ᛲᛴᲀᲈ()Z
.end method

.method public static native ᛲᛴᲇᛲ(Landroid/view/View;)Z
.end method

.method public static native ᛳᛶᛷᲀ(Ljava/lang/Object;)Landroid/view/View;
.end method

.method public static native ᛳᛸᛵᲀ(Ljava/lang/Class;)Z
.end method

.method public static native ᛳᲈᲈᛲ(Ljava/lang/Class;)Lxhss/ᲈᛱᛱᲀ;
.end method

.method public static varargs native ᛴᲈᛱᛴ([Ljava/lang/Object;)Landroid/content/Context;
.end method

.method public static native ᛵᛲᲁᛶ(Lxhss/ᛱᛶᛳ;Ljava/lang/String;)V
.end method

.method public static native ᛵᛷᛲᛸ(Lxhss/ᛱᛶᛳ;Ljava/lang/String;)Z
.end method

.method public static native ᛶᲇᲈᛸ(Landroid/view/View;Ljava/util/Set;)V
.end method

.method public static native ᛸᛲᛷᛱ(Landroid/content/Context;)Landroid/app/Activity;
.end method

.method public static native ᛸᛶᛴᲈ(Ljava/lang/Object;)Landroid/content/Context;
.end method

.method public static varargs native ᲁᛲᛴᛴ(Z[Ljava/lang/Object;)Lxhss/ᛱᛶᛳ;
.end method

.method public static native ᲁᲁᛴᲁ()I
.end method


# virtual methods
.method public final native ᲀᛷᲁᲀ()V
.end method

.method public final native ᲁᛴᛴᛸ(Landroid/content/Context;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)Z
.end method

.method public final native ᲁᛴᲇᛲ()V
.end method

.method public final native ᲇᛴᲇᛵ()V
.end method

.method public final native ᲈᛲᛵᲁ()V
.end method
