.class public final Lnc/a;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Lnc/a;


# instance fields
.field public final g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnc/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnc/a;->i:Lnc/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnc/a;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Loc/c;->f:Loc/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const-class v0, Lnc/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lnc/a;

    .line 16
    .line 17
    iget v0, p0, Lnc/a;->g:I

    .line 18
    .line 19
    iget v1, p1, Lnc/a;->g:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object p1, p1, Lnc/a;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lnc/a;->g:I

    .line 4
    .line 5
    invoke-static {v1}, Lt3/c;->a(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lnc/a;->g:I

    .line 2
    .line 3
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const/16 v2, 0x9

    .line 10
    .line 11
    iget-object v3, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 12
    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v2, 0x10

    .line 16
    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    throw v0

    .line 24
    :pswitch_0
    const-string v0, "ENCODED_ANNOTATION"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_1
    const-string v0, "ENCODED_ARRAY"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_2
    const-string v0, "ENCODED_METHOD_HANDLE"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_3
    const-string v0, "ENCODED_METHOD_TYPE"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_4
    const-string v0, "ENCODED_METHOD"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_5
    const-string v0, "ENCODED_FIELD"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_6
    const-string v0, "ENCODED_ENUM"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_7
    const-string v0, "ENCODED_TYPE"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_8
    const-string v0, "ENCODED_STRING"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_9
    const-string v0, "ENCODED_DOUBLE"

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_a
    const-string v0, "ENCODED_FLOAT"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_b
    const-string v0, "ENCODED_LONG"

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_c
    const-string v0, "ENCODED_INT"

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_d
    const-string v0, "ENCODED_CHAR"

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_e
    const-string v0, "ENCODED_SHORT"

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_f
    const-string v0, "ENCODED_BYTE"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_10
    const-string v0, "ENCODED_BOOLEAN"

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_11
    const-string v0, "ENCODED_NULL"

    .line 76
    .line 77
    :goto_0
    const/16 v1, 0x8

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, ": "

    .line 88
    .line 89
    const-string v3, "}"

    .line 90
    .line 91
    const-string v4, "{"

    .line 92
    .line 93
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :cond_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, "["

    .line 103
    .line 104
    const-string v2, "]"

    .line 105
    .line 106
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :cond_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "{STRING: \""

    .line 116
    .line 117
    const-string v2, "\"}"

    .line 118
    .line 119
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :cond_2
    const-string v0, "null"

    .line 125
    .line 126
    return-object v0

    .line 127
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
