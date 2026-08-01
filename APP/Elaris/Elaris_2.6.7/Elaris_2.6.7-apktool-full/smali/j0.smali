.class public final Lj0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/Class;

.field public final e:Ljava/lang/reflect/Field;

.field public final f:Ljava/lang/reflect/Field;

.field public final g:Ljava/lang/reflect/Field;

.field public final h:Ljava/lang/reflect/Method;

.field public final i:Ljava/lang/reflect/Method;

.field public final j:Ljava/lang/reflect/Method;

.field public final k:Ljava/lang/reflect/Method;

.field public final l:Ljava/lang/reflect/Method;

.field public final m:Ljava/lang/reflect/Method;

.field public final n:Ljava/lang/reflect/Method;

.field public final o:Ljava/lang/reflect/Method;

.field public final p:Ljava/lang/reflect/Method;

.field public final q:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj0;->a:Ljava/lang/Class;

    .line 3
    iput-object p2, p0, Lj0;->b:Ljava/lang/Class;

    .line 4
    iput-object p3, p0, Lj0;->c:Ljava/lang/Class;

    .line 5
    iput-object p4, p0, Lj0;->d:Ljava/lang/Class;

    .line 6
    iput-object p5, p0, Lj0;->e:Ljava/lang/reflect/Field;

    .line 7
    iput-object p6, p0, Lj0;->f:Ljava/lang/reflect/Field;

    .line 8
    iput-object p7, p0, Lj0;->g:Ljava/lang/reflect/Field;

    .line 9
    iput-object p8, p0, Lj0;->h:Ljava/lang/reflect/Method;

    .line 10
    iput-object p9, p0, Lj0;->i:Ljava/lang/reflect/Method;

    .line 11
    iput-object p10, p0, Lj0;->j:Ljava/lang/reflect/Method;

    .line 12
    iput-object p11, p0, Lj0;->k:Ljava/lang/reflect/Method;

    .line 13
    iput-object p12, p0, Lj0;->l:Ljava/lang/reflect/Method;

    .line 14
    iput-object p13, p0, Lj0;->m:Ljava/lang/reflect/Method;

    .line 15
    iput-object p14, p0, Lj0;->n:Ljava/lang/reflect/Method;

    .line 16
    iput-object p15, p0, Lj0;->o:Ljava/lang/reflect/Method;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lj0;->p:Ljava/lang/reflect/Method;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lj0;->q:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static a(Ljava/lang/ClassLoader;)Lj0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "com.tencent.mobileqq.aio.msglist.holder.AIOMsgItemUIState$AIOMsgItemState"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v2, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-string v2, "com.tencent.mobileqq.aio.msg.GrayTipsMsgItem"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v2, "com.tencent.qqnt.aio.holder.template.BubbleLayoutCompatPress"

    .line 28
    .line 29
    invoke-static {v0, v2}, Lr0;->s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const-class v2, Ljava/lang/Object;

    .line 40
    .line 41
    if-eq v0, v2, :cond_0

    .line 42
    .line 43
    const-class v2, Landroid/view/View;

    .line 44
    .line 45
    invoke-static {v1, v2}, Lr0;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {v1, v5}, Lr0;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-static {v4, v0}, Lr0;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    const-string v0, "getMsgRecord"

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "getChatType"

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    const-string v2, "getPeerUid"

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    const-string v2, "getMsgSeq"

    .line 81
    .line 82
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    const-string v2, "getMsgId"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    const-string v2, "getMsgRandom"

    .line 93
    .line 94
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-string v3, "getSenderUid"

    .line 99
    .line 100
    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object/from16 v16, v4

    .line 105
    .line 106
    const-string v4, "getSenderUin"

    .line 107
    .line 108
    invoke-virtual {v0, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    move-object/from16 v17, v5

    .line 113
    .line 114
    const-string v5, "getRecallTime"

    .line 115
    .line 116
    invoke-virtual {v0, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    move-object/from16 v18, v6

    .line 121
    .line 122
    const-string v6, "getMsgTime"

    .line 123
    .line 124
    invoke-virtual {v0, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const/4 v1, 0x1

    .line 129
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v13, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v14, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v19, v5

    .line 169
    .line 170
    move-object/from16 v5, v17

    .line 171
    .line 172
    move-object/from16 v17, v3

    .line 173
    .line 174
    new-instance v3, Lj0;

    .line 175
    .line 176
    move-object/from16 v20, v0

    .line 177
    .line 178
    move-object/from16 v6, v18

    .line 179
    .line 180
    move-object/from16 v18, v4

    .line 181
    .line 182
    move-object/from16 v4, v16

    .line 183
    .line 184
    move-object/from16 v16, v2

    .line 185
    .line 186
    invoke-direct/range {v3 .. v20}, Lj0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 187
    .line 188
    .line 189
    return-object v3

    .line 190
    :cond_0
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 191
    .line 192
    const-string v1, "AIOMsgItem base class missing"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0
.end method
