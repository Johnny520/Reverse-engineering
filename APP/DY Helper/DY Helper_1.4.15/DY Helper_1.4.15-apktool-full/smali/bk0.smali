.class public abstract Lbk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/LinkedHashSet;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final η:Ljava/lang/String;

.field public static final θ:Ljava/lang/String;

.field public static final ι:Ljava/lang/String;

.field public static final κ:Ljava/lang/String;

.field public static final λ:Ljava/lang/String;

.field public static final μ:Ljava/util/Set;

.field public static final ν:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbk0;->β:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lbk0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lbk0;->δ:Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lbk0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lbk0;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    sget-object v0, Lef0;->α:Lef0;

    .line 45
    .line 46
    const-string v1, "~7970EC7CD9CBB3D5D6D9830C2CAFCC6E0D91B665B0F8A4FD0EA9B3279456E91AEDDA175032282343FD516949D9359C568DCC5F0F08E731B080"

    .line 47
    .line 48
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sput-object v1, Lbk0;->η:Ljava/lang/String;

    .line 57
    .line 58
    const-string v1, "~7960BFBB1EAA71B0B732B18FE89DAAFC6DE1CCCFE61B84336C347D35BA7831D8252A478BD78FEFBA25FA666D4EEB3FE052B3F80DDFAE061317F687E8C4"

    .line 59
    .line 60
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sput-object v1, Lbk0;->θ:Ljava/lang/String;

    .line 69
    .line 70
    const-string v1, "~7908F94551A999F71196F64AC0FC29F9E6492C7E20375977DD764F5AA7407A32F0AE9900A1F277"

    .line 71
    .line 72
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sput-object v1, Lbk0;->ι:Ljava/lang/String;

    .line 81
    .line 82
    const-string v1, "~7918AA8296C85B92707DC4C904CE4F6B863956D476D479B9BFEB8148896EA2F0385EC9"

    .line 83
    .line 84
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sput-object v1, Lbk0;->κ:Ljava/lang/String;

    .line 93
    .line 94
    const-string v1, "~79C18A011DCF4473465F4AB94363DD36A2B0195EE0"

    .line 95
    .line 96
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v2, "."

    .line 105
    .line 106
    invoke-static {v1, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sput-object v1, Lbk0;->λ:Ljava/lang/String;

    .line 111
    .line 112
    const-string v7, "mark_message_read_body"

    .line 113
    .line 114
    const-string v8, "mark_read_body"

    .line 115
    .line 116
    const-string v2, "mark_conversation_read_body"

    .line 117
    .line 118
    const-string v3, "batch_mark_read_body"

    .line 119
    .line 120
    const-string v4, "mark_stranger_conversation_read_body"

    .line 121
    .line 122
    const-string v5, "mark_stranger_all_conversation_read_body"

    .line 123
    .line 124
    const-string v6, "mark_message_read_request_body"

    .line 125
    .line 126
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sput-object v1, Lbk0;->μ:Ljava/util/Set;

    .line 135
    .line 136
    const-string v1, "~7978C51F3AFB5B869E8BCAF33113CFE4E2C2AC557672253161FAA9FDEFAE5C8AC152041CF77877A9C9ED92FCD623137EE71824A04D089B24A68585"

    .line 137
    .line 138
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v1, "~7897B8FA5B94D53FF3B00AD1EFBDBBCD1F40C4D8FAFE0B1E30C54E16957A8B4C64F9CAA2F0F95FF9C39904251F78DFF163D38DE123BCC62359D818577942989C"

    .line 147
    .line 148
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    const-string v1, "~789B0C8B36881875CC4FDD774605BD8EC5D5CD17B297C11746DAD89EF02A66185AE5969EF2DA2D73A296B65A0BF9A45F84A3918443B82D806E34DBFC58520FD2B580BF"

    .line 157
    .line 158
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    const-string v1, "~788FC25E7FC5FF09DA0971AD3633DED59063A4426A97B300261A879FE3A1BD1191B99F7FD839D0F3008BF3C588AAE365CA595559BC275025F6B91507D7FA22D3415358D8C745"

    .line 167
    .line 168
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const-string v1, "~794CAD4478EC442949BD7B3992FD5526A0F842EFCC66F8DC8D952E4CC80883A87ED530711D1EE9C247969EAFE9C014AF9A9EBD3ED9C5"

    .line 177
    .line 178
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const-string v1, "~789F9199B8A43D6CBBE2432EF201B847F013DEE83C7493CE4487498DCD8F65D34952D3B3368B0A19ED25FFCC275769C02732CF696C7775B37258C92A784C10C8B030"

    .line 187
    .line 188
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    const-string v1, "~796C0BCA73B6BCFA88CD66294125ACBFB774C500AE725726013AF6FCFC2587830A3221C8D7878F2D6FE9DB4C64665E7698FCFB40899FE890151C6540D523"

    .line 197
    .line 198
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sput-object v0, Lbk0;->ν:Ljava/util/Set;

    .line 215
    .line 216
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, Lbk0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_5

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object v2, p0

    .line 15
    :goto_0
    if-eqz v2, :cond_3

    .line 16
    .line 17
    const-class v3, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_3

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    array-length v5, v3

    .line 38
    const/4 v6, 0x0

    .line 39
    :goto_1
    if-ge v6, v5, :cond_1

    .line 40
    .line 41
    aget-object v7, v3, v6

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-nez v8, :cond_0

    .line 52
    .line 53
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/lang/reflect/Field;

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :catchall_0
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-nez p0, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move-object v1, p0

    .line 96
    :cond_5
    :goto_3
    check-cast v1, Ljava/util/List;

    .line 97
    .line 98
    return-object v1
.end method

.method public static β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_11

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p2, v1, :cond_11

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_12

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_12

    .line 30
    .line 31
    const-class v2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_12

    .line 38
    .line 39
    const-class v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_12

    .line 46
    .line 47
    const-class v2, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_12

    .line 54
    .line 55
    const-class v2, Ljava/lang/Character;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_12

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "java."

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_12

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "kotlin."

    .line 81
    .line 82
    invoke-static {v1, v2, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_2
    instance-of v1, p0, [Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    check-cast p0, [Ljava/lang/Object;

    .line 111
    .line 112
    array-length v1, p0

    .line 113
    :goto_0
    if-ge v4, v1, :cond_12

    .line 114
    .line 115
    aget-object v2, p0, v4

    .line 116
    .line 117
    add-int/lit8 v3, p2, 0x1

    .line 118
    .line 119
    invoke-static {v2, p1, v3, p3}, Lbk0;->β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-nez v2, :cond_3

    .line 124
    .line 125
    add-int/lit8 v4, v4, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    return-object v2

    .line 129
    :cond_4
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    check-cast p0, Ljava/lang/Iterable;

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_12

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    add-int/lit8 v2, p2, 0x1

    .line 150
    .line 151
    invoke-static {v1, p1, v2, p3}, Lbk0;->β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_6
    instance-of v1, p0, Ljava/util/Map;

    .line 159
    .line 160
    if-eqz v1, :cond_8

    .line 161
    .line 162
    check-cast p0, Ljava/util/Map;

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Ljava/lang/Iterable;

    .line 169
    .line 170
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_12

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    add-int/lit8 v2, p2, 0x1

    .line 185
    .line 186
    invoke-static {v1, p1, v2, p3}, Lbk0;->β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-eqz v1, :cond_7

    .line 191
    .line 192
    return-object v1

    .line 193
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    sget-object v2, Lbk0;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v3, :cond_d

    .line 204
    .line 205
    invoke-static {v1}, Lbk0;->α(Ljava/lang/Class;)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    new-instance v5, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    :cond_9
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-eqz v6, :cond_b

    .line 223
    .line 224
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    move-object v7, v6

    .line 229
    check-cast v7, Ljava/lang/reflect/Field;

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    sget-object v9, Lbk0;->ι:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-nez v8, :cond_a

    .line 246
    .line 247
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    sget-object v9, Lbk0;->κ:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-nez v8, :cond_a

    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    sget-object v9, Lbk0;->θ:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    if-nez v8, :cond_a

    .line 278
    .line 279
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    sget-object v8, Lbk0;->λ:Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v7, v8, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    if-eqz v7, :cond_9

    .line 294
    .line 295
    :cond_a
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_b
    invoke-virtual {v2, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    if-nez v1, :cond_c

    .line 304
    .line 305
    move-object v3, v5

    .line 306
    goto :goto_2

    .line 307
    :cond_c
    move-object v3, v1

    .line 308
    :cond_d
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 309
    .line 310
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v2, :cond_10

    .line 319
    .line 320
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    check-cast v2, Ljava/lang/reflect/Field;

    .line 325
    .line 326
    :try_start_0
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    goto :goto_3

    .line 331
    :catchall_0
    move-exception v2

    .line 332
    new-instance v3, Leo1;

    .line 333
    .line 334
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    move-object v2, v3

    .line 338
    :goto_3
    instance-of v3, v2, Leo1;

    .line 339
    .line 340
    if-eqz v3, :cond_f

    .line 341
    .line 342
    move-object v2, v0

    .line 343
    :cond_f
    add-int/lit8 v3, p2, 0x1

    .line 344
    .line 345
    invoke-static {v2, p1, v3, p3}, Lbk0;->β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    if-eqz v2, :cond_e

    .line 350
    .line 351
    move-object v0, v2

    .line 352
    :cond_10
    return-object v0

    .line 353
    :cond_11
    :goto_4
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-eqz p1, :cond_12

    .line 358
    .line 359
    return-object p0

    .line 360
    :cond_12
    :goto_5
    return-object v0
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    :try_start_0
    sget-object v0, Lbk0;->ι:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p0, v1}, Lbk0;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const-string p0, "DYHelperIMPrivacyStatusHook"

    .line 19
    .line 20
    const-string v0, "IM \u8bf7\u6c42\u53d1\u9001\u5165\u53e3\u672a\u5b89\u88c5\uff0c\u5df2\u8bfb\u4e0a\u62a5\u65e0\u6cd5\u4fdd\u8bc1\u62e6\u622a"

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p0, v0, v2, v1, v2}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-static {v3}, Lbk0;->η(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    sget-object v5, Lbk0;->δ:Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    :try_start_1
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    :try_start_2
    monitor-exit v5

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    monitor-exit v5

    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    .line 63
    .line 64
    sget-object v4, Lxq0;->α:Lxq0;

    .line 65
    .line 66
    new-instance v5, Lak0;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct {v5, v0, v3, v6}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    monitor-exit v5

    .line 80
    throw p0

    .line 81
    :cond_2
    const-string v0, "DYHelperIMPrivacyStatusHook"

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v3, "\u5df2 Hook IM \u8bf7\u6c42\u7f51\u7edc\u53d1\u9001\u5165\u53e3, new="

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, " total="

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :catchall_1
    move-exception p0

    .line 117
    const-string v0, "DYHelperIMPrivacyStatusHook"

    .line 118
    .line 119
    const-string v1, "Hook IM \u8bf7\u6c42\u53d1\u9001\u5165\u53e3\u5931\u8d25"

    .line 120
    .line 121
    :goto_1
    instance-of v2, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 122
    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    move-object v2, p0

    .line 126
    check-cast v2, Ljava/lang/reflect/InvocationTargetException;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-eqz v3, :cond_3

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public static δ(Ljava/lang/reflect/Method;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_6

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    array-length v3, v0

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget-object v4, Lbk0;->η:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    sget-object v4, Lbk0;->ι:Ljava/lang/String;

    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    array-length p0, v0

    .line 82
    move v2, v1

    .line 83
    :goto_0
    if-ge v2, p0, :cond_6

    .line 84
    .line 85
    aget-object v3, v0, v2

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_5

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    sget-object v7, Lbk0;->κ:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_5

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    sget-object v6, Lbk0;->θ:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_3

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    array-length p0, v0

    .line 136
    const/4 v2, 0x3

    .line 137
    if-ne p0, v2, :cond_6

    .line 138
    .line 139
    aget-object p0, v0, v1

    .line 140
    .line 141
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_6

    .line 148
    .line 149
    aget-object p0, v0, v5

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eqz p0, :cond_6

    .line 160
    .line 161
    const/4 p0, 0x2

    .line 162
    aget-object v2, v0, p0

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    aget-object p0, v0, p0

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    const-class v0, Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-eqz p0, :cond_6

    .line 183
    .line 184
    :cond_5
    :goto_1
    return v5

    .line 185
    :cond_6
    :goto_2
    return v1
.end method

.method public static ε(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lbk0;->η:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljz;->ε:Ljz;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    :goto_0
    if-eqz p0, :cond_1

    .line 20
    .line 21
    const-class v1, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v3, v2

    .line 69
    check-cast v3, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    invoke-static {v3}, Lbk0;->η(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    move-object v2, v1

    .line 105
    check-cast v2, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-static {v2}, Lbk0;->δ(Ljava/lang/reflect/Method;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    new-instance v0, Ljava/util/HashSet;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    move-object v3, v2

    .line 142
    check-cast v3, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-static {v3}, Lbk0;->η(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    return-object v1
.end method

.method public static ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->ｑ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v1, v0

    .line 38
    check-cast v1, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-static {v1}, Lbk0;->δ(Ljava/lang/reflect/Method;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance p1, Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object v2, v1

    .line 75
    check-cast v2, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    invoke-static {v2}, Lbk0;->η(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    return-object v0

    .line 92
    :cond_5
    :goto_2
    invoke-static {p0}, Lbk0;->ε(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_7

    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    return-object v1

    .line 108
    :cond_7
    if-eqz p1, :cond_9

    .line 109
    .line 110
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_8

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_8
    new-instance p1, Lt20;

    .line 120
    .line 121
    const/16 v1, 0xa

    .line 122
    .line 123
    invoke-direct {p1, p0, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 124
    .line 125
    .line 126
    const-string v1, "\u5b9a\u4f4d\u79c1\u4fe1\u72b6\u6001\u4e0a\u62a5\u53d1\u9001\u5165\u53e3"

    .line 127
    .line 128
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :cond_9
    :goto_3
    sget-object p0, Ljz;->ε:Ljz;

    .line 134
    .line 135
    return-object p0
.end method

.method public static η(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

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
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lwj0;

    .line 42
    .line 43
    const/16 v3, 0x12

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lwj0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x1e

    .line 49
    .line 50
    const-string v4, ","

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "):"

    .line 58
    .line 59
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static θ(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_7

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_5

    .line 32
    .line 33
    array-length v4, v3

    .line 34
    const/4 v5, 0x0

    .line 35
    :goto_1
    if-ge v5, v4, :cond_2

    .line 36
    .line 37
    aget-object v6, v3, v5

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    const-string v8, "getMethodInstance"

    .line 44
    .line 45
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-class v8, Ljava/lang/ClassLoader;

    .line 56
    .line 57
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-static {v7, v8}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto :goto_5

    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v6, v2

    .line 74
    :goto_2
    if-nez v6, :cond_3

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    const/4 v3, 0x1

    .line 78
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 79
    .line 80
    .line 81
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v6, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    instance-of v4, v1, Ljava/lang/reflect/Method;

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    check-cast v1, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v1, v2

    .line 97
    :goto_3
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_5
    :goto_4
    move-object v1, v2

    .line 104
    goto :goto_6

    .line 105
    :goto_5
    new-instance v3, Leo1;

    .line 106
    .line 107
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    goto :goto_7

    .line 111
    :goto_6
    move-object v3, v1

    .line 112
    :goto_7
    instance-of v1, v3, Leo1;

    .line 113
    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    goto :goto_8

    .line 117
    :cond_6
    move-object v2, v3

    .line 118
    :goto_8
    check-cast v2, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    if-eqz v2, :cond_0

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    return-object v0
.end method
