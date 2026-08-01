.class public final synthetic Lxhss/ᲀᛱᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᲀᛶᛲ;
.implements Lxhss/ᲀᲀᲁᲀ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public native synthetic constructor <init>(Ljava/lang/String;Lxhss/ᲈᲁᲈᲁ;)V
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/GenericDeclaration;I)V
    .locals 0

    .line 10
    iput p2, p0, Lxhss/ᲀᛱᲈᛳ;->ᛱᛱᛲᲇ:I

    iput-object p1, p0, Lxhss/ᲀᛱᲈᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ᛳᲁᲇᛸ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᲀᛱᲈᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲀᛱᲈᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lxhss/ᲇᛴᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛴᛲᲁ;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lxhss/ᲇᛴᛲᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Unable to create instance of "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :pswitch_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    const-string v0, "\' with no args"

    .line 46
    .line 47
    const-string v1, "Failed to invoke constructor \'"

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    :try_start_1
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    return-object p0

    .line 55
    :catch_1
    move-exception p0

    .line 56
    sget-object v0, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 57
    .line 58
    new-instance v0, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :catch_2
    move-exception v2

    .line 67
    new-instance v3, Ljava/lang/RuntimeException;

    .line 68
    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Lxhss/ᲇᛴᛷᲇ;->ᛱᛱᛲᲇ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v3, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw v3

    .line 96
    :catch_3
    move-exception v2

    .line 97
    new-instance v3, Ljava/lang/RuntimeException;

    .line 98
    .line 99
    invoke-static {p0}, Lxhss/ᲇᛴᛷᲇ;->ᛱᛱᛲᲇ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance v4, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-direct {v3, p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v3

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛷᛵᛵᲈ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛱᲈᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛱᛴᛳᛴ;

    .line 6
    .line 7
    sget p1, Lxhss/ᲈᲁᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-lez p1, :cond_3

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-wide v2, -0x13c9f1b858845L

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lxhss/ᲈᲁᲈᲁ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p0, v2

    .line 32
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-wide v2, -0x13cae1b858845L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-wide p0, -0x13cb11b858845L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-wide v1, -0xfd001b858845L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    const-wide v1, -0xfce91b858845L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    move v1, v0

    .line 94
    :goto_1
    if-ge v1, p1, :cond_3

    .line 95
    .line 96
    add-int/lit16 v2, v1, 0x7d0

    .line 97
    .line 98
    if-le v2, p1, :cond_2

    .line 99
    .line 100
    move v2, p1

    .line 101
    :cond_2
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-wide v3, -0xfcf11b858845L

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move v1, v2

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    :goto_2
    sput-boolean v0, Lxhss/ᲈᲁᲈᲁ;->ᛷᛴᛷᛱ:Z

    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    sput-object p0, Lxhss/ᲈᲁᲈᲁ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 127
    .line 128
    sput v0, Lxhss/ᲈᲁᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 129
    .line 130
    return-void
.end method
