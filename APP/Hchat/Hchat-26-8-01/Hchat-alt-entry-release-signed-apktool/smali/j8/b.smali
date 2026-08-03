.class public abstract synthetic Lj8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(I)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lt3/c;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p0, v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq p0, v1, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    return v0
.end method

.method public static final b(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    throw p0

    .line 11
    :pswitch_0
    const-string v1, "STAGED_ALIAS"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_1
    const-string v1, "OVERLAYABLE_POLICY"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_2
    const-string v1, "OVERLAYABLE"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_3
    const-string v1, "LIBRARY"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_4
    const-string v1, "SPEC"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_5
    const-string v1, "TYPE"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_6
    const-string v1, "PACKAGE"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_7
    const-string v1, "XML_RESOURCE_MAP"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_8
    const-string v1, "XML_LAST_CHUNK"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_9
    const-string v1, "XML_CDATA"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_a
    const-string v1, "XML_END_ELEMENT"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_b
    const-string v1, "XML_START_ELEMENT"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_c
    const-string v1, "XML_END_NAMESPACE"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_d
    const-string v1, "XML_START_NAMESPACE"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_e
    const-string v1, "XML"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_f
    const-string v1, "TABLE"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_10
    const-string v1, "STRING"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_11
    const-string v1, "NULL"

    .line 63
    .line 64
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, "("

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, Lj8/b;->c(I)S

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p0}, Ly7/a;->o(S)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, ")"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic c(I)S
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0

    .line 6
    :pswitch_0
    const/16 p0, 0x206

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/16 p0, 0x205

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_2
    const/16 p0, 0x204

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_3
    const/16 p0, 0x203

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_4
    const/16 p0, 0x202

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_5
    const/16 p0, 0x201

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_6
    const/16 p0, 0x200

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_7
    const/16 p0, 0x180

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_8
    const/16 p0, 0x17f

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_9
    const/16 p0, 0x104

    .line 34
    .line 35
    return p0

    .line 36
    :pswitch_a
    const/16 p0, 0x103

    .line 37
    .line 38
    return p0

    .line 39
    :pswitch_b
    const/16 p0, 0x102

    .line 40
    .line 41
    return p0

    .line 42
    :pswitch_c
    const/16 p0, 0x101

    .line 43
    .line 44
    return p0

    .line 45
    :pswitch_d
    const/16 p0, 0x100

    .line 46
    .line 47
    return p0

    .line 48
    :pswitch_e
    const/4 p0, 0x3

    .line 49
    return p0

    .line 50
    :pswitch_f
    const/4 p0, 0x2

    .line 51
    return p0

    .line 52
    :pswitch_10
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :pswitch_11
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static e(Ljava/util/List;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p0, p1

    .line 6
    mul-int/2addr p0, p2

    .line 7
    return p0
.end method

.method public static f()Lg8/d;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public static g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    .locals 0

    .line 1
    invoke-static {p0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lgg/f;->a:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static m(Lokio/Path;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static n(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    invoke-direct {v0, p2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static o()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2, p1, p0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p4, p3}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static r(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic u(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "null"

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    const-string p0, "STAGED_ALIAS"

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    const-string p0, "OVERLAYABLE_POLICY"

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    const-string p0, "OVERLAYABLE"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    const-string p0, "LIBRARY"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    const-string p0, "SPEC"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    const-string p0, "TYPE"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    const-string p0, "PACKAGE"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    const-string p0, "XML_RESOURCE_MAP"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_8
    const-string p0, "XML_LAST_CHUNK"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_9
    const-string p0, "XML_CDATA"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_a
    const-string p0, "XML_END_ELEMENT"

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_b
    const-string p0, "XML_START_ELEMENT"

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_c
    const-string p0, "XML_END_NAMESPACE"

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_d
    const-string p0, "XML_START_NAMESPACE"

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_e
    const-string p0, "XML"

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_f
    const-string p0, "TABLE"

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_10
    const-string p0, "STRING"

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_11
    const-string p0, "NULL"

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic v(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "null"

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    const-string p0, "INVOKE_INTERFACE"

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    const-string p0, "INVOKE_CONSTRUCTOR"

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    const-string p0, "INVOKE_DIRECT"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    const-string p0, "INVOKE_INSTANCE"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    const-string p0, "INVOKE_STATIC"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    const-string p0, "INSTANCE_GET"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    const-string p0, "INSTANCE_PUT"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    const-string p0, "STATIC_GET"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_8
    const-string p0, "STATIC_PUT"

    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic w(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "null"

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    const-string p0, "ENCODED_ANNOTATION"

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    const-string p0, "ENCODED_ARRAY"

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    const-string p0, "ENCODED_METHOD_HANDLE"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    const-string p0, "ENCODED_METHOD_TYPE"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    const-string p0, "ENCODED_METHOD"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    const-string p0, "ENCODED_FIELD"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    const-string p0, "ENCODED_ENUM"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    const-string p0, "ENCODED_TYPE"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_8
    const-string p0, "ENCODED_STRING"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_9
    const-string p0, "ENCODED_DOUBLE"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_a
    const-string p0, "ENCODED_FLOAT"

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_b
    const-string p0, "ENCODED_LONG"

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_c
    const-string p0, "ENCODED_INT"

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_d
    const-string p0, "ENCODED_CHAR"

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_e
    const-string p0, "ENCODED_SHORT"

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_f
    const-string p0, "ENCODED_BYTE"

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_10
    const-string p0, "ENCODED_BOOLEAN"

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_11
    const-string p0, "ENCODED_NULL"

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
