.class public final Lii;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lii;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final k:Lhx2;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lii;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lii;->d:Lii;

    .line 8
    .line 9
    const v0, 0x790b0071

    .line 10
    .line 11
    .line 12
    sput v0, Lii;->e:I

    .line 13
    .line 14
    const v0, 0x790b007d

    .line 15
    .line 16
    .line 17
    sput v0, Lii;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lii;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "AutoReceiveTransferMoney"

    .line 24
    .line 25
    sput-object v0, Lii;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lii;->i:Z

    .line 29
    .line 30
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lii;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    new-instance v0, Lc0;

    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lhx2;

    .line 44
    .line 45
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 46
    .line 47
    .line 48
    sput-object v1, Lii;->k:Lhx2;

    .line 49
    .line 50
    const-string v7, "receiver_username"

    .line 51
    .line 52
    const-string v8, "feedesc"

    .line 53
    .line 54
    const-string v2, "paysubtype"

    .line 55
    .line 56
    const-string v3, "transcationid"

    .line 57
    .line 58
    const-string v4, "transferid"

    .line 59
    .line 60
    const-string v5, "invalidtime"

    .line 61
    .line 62
    const-string v6, "payer_username"

    .line 63
    .line 64
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lii;->l:Ljava/util/Set;

    .line 73
    .line 74
    const/16 v0, 0xa

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/16 v1, 0xc

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const/16 v2, 0xd

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/16 v3, 0xe

    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Lii;->m:Ljava/util/Set;

    .line 107
    .line 108
    return-void
.end method

.method public static q(Lhi;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhi;->e:I

    .line 4
    .line 5
    iget-object v3, v0, Lhi;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, v0, Lhi;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    sget-object v5, Lii;->k:Lhx2;

    .line 20
    .line 21
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v7, 0xa

    .line 35
    .line 36
    invoke-static {v7, v6}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {v6}, Lii;->u(Ljava/lang/Class;)Ljava/lang/Number;

    .line 43
    .line 44
    .line 45
    move-result-object v12

    .line 46
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    packed-switch v6, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    :pswitch_0
    const-string v0, "Unsupported transfer confirm constructor: "

    .line 54
    .line 55
    invoke-static {v0, v5}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    return-object v0

    .line 60
    :pswitch_1
    iget-object v6, v0, Lhi;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/16 v8, 0xb

    .line 71
    .line 72
    aget-object v1, v1, v8

    .line 73
    .line 74
    invoke-static {v1}, Lii;->u(Ljava/lang/Class;)Ljava/lang/Number;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    iget-object v14, v0, Lhi;->c:Ljava/lang/String;

    .line 79
    .line 80
    const-string v15, ""

    .line 81
    .line 82
    move-object v0, v5

    .line 83
    const-string v5, "confirm"

    .line 84
    .line 85
    const-string v8, ""

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const-string v11, ""

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    filled-new-array/range {v2 .. v15}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_0

    .line 100
    :pswitch_2
    move-object v15, v5

    .line 101
    iget-object v6, v0, Lhi;->c:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-object v13, v0, Lhi;->c:Ljava/lang/String;

    .line 108
    .line 109
    const-string v14, ""

    .line 110
    .line 111
    const-string v5, "confirm"

    .line 112
    .line 113
    const-string v8, ""

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    filled-new-array/range {v2 .. v14}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v15, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_0

    .line 126
    :pswitch_3
    move-object v15, v5

    .line 127
    iget-object v6, v0, Lhi;->c:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const/4 v11, 0x0

    .line 134
    iget-object v13, v0, Lhi;->c:Ljava/lang/String;

    .line 135
    .line 136
    const-string v5, "confirm"

    .line 137
    .line 138
    const-string v8, ""

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    filled-new-array/range {v2 .. v13}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v15, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_0

    .line 150
    :pswitch_4
    move-object v15, v5

    .line 151
    iget-object v6, v0, Lhi;->c:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    const/4 v9, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    const-string v5, "confirm"

    .line 160
    .line 161
    const-string v8, ""

    .line 162
    .line 163
    filled-new-array/range {v2 .. v11}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v15, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static r()Ldi;
    .locals 14

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ldi;

    .line 8
    .line 9
    invoke-direct {v1}, Ldi;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Ldi;->Companion:Lci;

    .line 13
    .line 14
    invoke-virtual {v2}, Lci;->serializer()Lw41;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "AutoReceiveTransferMoney/config"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v3}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ldi;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Ldi;

    .line 33
    .line 34
    invoke-direct {v0}, Ldi;-><init>()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-wide v1, v0, Ldi;->a:J

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    const-wide/32 v5, 0xea60

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lci0;->E(JJJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v8

    .line 48
    iget-object v1, v0, Ldi;->c:Ljava/util/Set;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Iterable;

    .line 51
    .line 52
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v3, v2

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_1

    .line 79
    .line 80
    invoke-interface {v11, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iget-object v1, v0, Ldi;->d:Ljava/util/Set;

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Iterable;

    .line 87
    .line 88
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    move-object v3, v2

    .line 108
    check-cast v3, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_3

    .line 115
    .line 116
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-boolean v10, v0, Ldi;->b:Z

    .line 121
    .line 122
    iget-object v13, v0, Ldi;->e:Lgi;

    .line 123
    .line 124
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v7, Ldi;

    .line 128
    .line 129
    invoke-direct/range {v7 .. v13}, Ldi;-><init>(JZLjava/util/Set;Ljava/util/Set;Lgi;)V

    .line 130
    .line 131
    .line 132
    return-object v7
.end method

.method public static s(Lyi1;)Lhi;
    .locals 11

    .line 1
    iget-object v7, p0, Lyi1;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lyi1;->h:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    const-string v1, "<msg"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, v1, v2, v2, v0}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lce0;->h:Lce0;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, Ljava/io/StringReader;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v4, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, v4}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    :goto_0
    if-eq v4, v1, :cond_2

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    sget-object v4, Lii;->l:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v5}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    :goto_1
    const-string v3, "paysubtype"

    .line 89
    .line 90
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    const-string v4, "1"

    .line 97
    .line 98
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    const/4 v5, 0x0

    .line 103
    if-nez v4, :cond_3

    .line 104
    .line 105
    new-instance p0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v0, "Skipping transfer with pay subtype "

    .line 108
    .line 109
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    sget-object v0, Lii;->h:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v0, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v5

    .line 125
    :cond_3
    const-string v3, "transcationid"

    .line 126
    .line 127
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Ljava/lang/String;

    .line 132
    .line 133
    const-string v4, ""

    .line 134
    .line 135
    if-nez v3, :cond_4

    .line 136
    .line 137
    move-object v3, v4

    .line 138
    :cond_4
    const-string v6, "transferid"

    .line 139
    .line 140
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Ljava/lang/String;

    .line 145
    .line 146
    if-nez v6, :cond_5

    .line 147
    .line 148
    move-object v6, v4

    .line 149
    :cond_5
    const-string v8, "invalidtime"

    .line 150
    .line 151
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    check-cast v9, Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v9, :cond_6

    .line 158
    .line 159
    invoke-static {v9}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    goto :goto_2

    .line 164
    :cond_6
    move-object v9, v5

    .line 165
    :goto_2
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-nez v10, :cond_e

    .line 170
    .line 171
    invoke-static {v6}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-nez v10, :cond_e

    .line 176
    .line 177
    if-eqz v9, :cond_e

    .line 178
    .line 179
    const-string v1, "payer_username"

    .line 180
    .line 181
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/String;

    .line 186
    .line 187
    if-nez v1, :cond_7

    .line 188
    .line 189
    move-object v1, v4

    .line 190
    :cond_7
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-eqz v8, :cond_b

    .line 195
    .line 196
    sget-object v1, Lii;->d:Lii;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const-string v1, "@chatroom"

    .line 202
    .line 203
    invoke-static {v7, v1, v2}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_8

    .line 208
    .line 209
    :goto_3
    move-object v1, v7

    .line 210
    goto :goto_4

    .line 211
    :cond_8
    const/16 v1, 0x3a

    .line 212
    .line 213
    invoke-static {p0, v1}, Lpv2;->G0(Ljava/lang/String;C)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {p0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_9

    .line 230
    .line 231
    const/16 v1, 0x3c

    .line 232
    .line 233
    invoke-static {p0, v1}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_9

    .line 238
    .line 239
    move-object v5, p0

    .line 240
    :cond_9
    if-nez v5, :cond_a

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_a
    move-object v1, v5

    .line 244
    :cond_b
    :goto_4
    const-string p0, "receiver_username"

    .line 245
    .line 246
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, Ljava/lang/String;

    .line 251
    .line 252
    if-nez p0, :cond_c

    .line 253
    .line 254
    move-object p0, v4

    .line 255
    :cond_c
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    const-string v2, "feedesc"

    .line 260
    .line 261
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/String;

    .line 266
    .line 267
    if-nez v0, :cond_d

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_d
    move-object v4, v0

    .line 271
    :goto_5
    new-instance v0, Lhi;

    .line 272
    .line 273
    move-object v2, v3

    .line 274
    move-object v3, v1

    .line 275
    move-object v1, v2

    .line 276
    move-object v2, v6

    .line 277
    move-object v6, v4

    .line 278
    move-object v4, p0

    .line 279
    invoke-direct/range {v0 .. v7}, Lhi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v0

    .line 283
    :cond_e
    move-object v2, v6

    .line 284
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 285
    .line 286
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    xor-int/2addr v3, v1

    .line 291
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    xor-int/2addr v1, v2

    .line 296
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v2, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v4, "Incomplete transfer data: transactionId="

    .line 303
    .line 304
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v3, ", transferId="

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v1, ", invalidTime="

    .line 319
    .line 320
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw p0
.end method

.method public static t(Lhi;Lgi;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lgi;->a:Z

    .line 2
    .line 3
    iget-object p1, p1, Lgi;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-string v0, "$amount"

    .line 15
    .line 16
    iget-object v1, p0, Lhi;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, Lhi;->g:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lgd3;->l(Ljava/lang/String;Ljava/lang/String;)Lso2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    instance-of p1, p0, Lro2;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of p1, p0, Lqo2;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    check-cast p0, Lqo2;

    .line 39
    .line 40
    iget-object p0, p0, Lqo2;->a:Ljo2;

    .line 41
    .line 42
    :goto_0
    if-eqz p0, :cond_3

    .line 43
    .line 44
    sget-object p1, Lii;->d:Lii;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Ljo2;->c:Ljava/lang/String;

    .line 50
    .line 51
    const-string p1, "Transfer auto reply failed: "

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lii;->h:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-static {}, Lc80;->s()V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    return-void
.end method

.method public static u(Ljava/lang/Class;)Ljava/lang/Number;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    const-class v0, Ljava/lang/Long;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_4

    .line 26
    .line 27
    const-class v0, Ljava/lang/Short;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    const-class v0, Ljava/lang/Byte;

    .line 45
    .line 46
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    :goto_0
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_5
    :goto_2
    const-wide/16 v0, 0x0

    .line 69
    .line 70
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lii;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lvb1;)V
    .locals 2

    .line 1
    invoke-static {}, Lii;->r()Ldi;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lid3;->e:Lid3;

    .line 5
    .line 6
    new-instance v0, Lw;

    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0, v0}, Lvb1;->a(Ltb1;Lin0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    sget-object p0, Lii;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lii;->r()Ldi;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-boolean v0, p0, Ldi;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Ldi;->c:Ljava/util/Set;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Ldi;->d:Ljava/util/Set;

    .line 16
    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const v0, 0x790b0093

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const v0, 0x790b0076

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ldi;->e:Lgi;

    .line 46
    .line 47
    iget-boolean v1, v1, Lgi;->a:Z

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    const v1, 0x790b0074

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const v1, 0x790b0073

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-wide v2, p0, Ldi;->a:J

    .line 66
    .line 67
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    filled-new-array {p0, v0, v1}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const v0, 0x790b0078

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lii;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Lii;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lii;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lii;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Lii;->r()Ldi;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lx;

    .line 44
    .line 45
    const/4 v1, 0x5

    .line 46
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkw;

    .line 50
    .line 51
    const p2, 0x288162ab

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p1, p2, v1, v0}, Lkw;-><init>(IZLun0;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lt7;

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    invoke-direct {p2, v0, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
