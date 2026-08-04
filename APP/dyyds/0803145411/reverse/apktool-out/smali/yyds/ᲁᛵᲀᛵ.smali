.class public final Lyyds/ᲁᛵᲀᛵ;
.super Lyyds/ᛱᛲᲁᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᛵᲀᛵ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲁᛵᲀᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lyyds/ᛱᛲᲁᲀ;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᲁᛵᲀᛵ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲁᛵᲀᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lyyds/ᛳᛲᛷᛷ;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const-class v1, Lyyds/ᛲᛸᛶᲁ;

    .line 18
    .line 19
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lyyds/ᛴᛶᛳᛴ;

    .line 24
    .line 25
    invoke-interface {v2}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v3, v2}, Lyyds/ᛴᛶᛳᛴ;-><init>(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    new-array v3, v2, [Lyyds/ᛴᛶᛳᛴ;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, [Lyyds/ᛴᛶᛳᛴ;

    .line 43
    .line 44
    array-length v3, v0

    .line 45
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, [Lyyds/ᛴᛶᛳᛴ;

    .line 50
    .line 51
    invoke-interface {p0}, Lyyds/ᛳᛲᛷᛷ;->ᲇᲈᛵᛷ()Lyyds/ᲁᛵᛱᲇ;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    instance-of v4, p0, Lyyds/ᲈᛵᛴᲇ;

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    check-cast p0, Lyyds/ᲈᛵᛴᲇ;

    .line 60
    .line 61
    invoke-interface {p0}, Lyyds/ᲈᛵᛴᲇ;->ᲀᛲᛳᲀ()Lyyds/ᛳᲇᛸᲁ;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object p0, Lyyds/ᛲᛲᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛲᲇᲁ;

    .line 67
    .line 68
    :goto_0
    iget-object v3, v3, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    const-string v4, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lyyds/ᛲᛸᛶᲁ;

    .line 77
    .line 78
    invoke-virtual {v1, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-interface {v5, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 98
    .line 99
    invoke-interface {v5, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :try_start_0
    array-length p0, v0

    .line 103
    const/4 v5, 0x0

    .line 104
    :goto_1
    if-ge v2, p0, :cond_3

    .line 105
    .line 106
    aget-object v6, v0, v2

    .line 107
    .line 108
    iget-object v6, v6, Lyyds/ᛴᛶᛳᛴ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-static {v6, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_2

    .line 115
    .line 116
    new-instance v5, Lyyds/ᛲᛸᛶᲁ;

    .line 117
    .line 118
    invoke-direct {v5}, Lyyds/ᛲᛸᛶᲁ;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    if-eqz v5, :cond_4

    .line 125
    .line 126
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Lyyds/ᛲᛸᛶᲁ;

    .line 131
    .line 132
    :goto_2
    return-object v5

    .line 133
    :cond_4
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v1, "No initializer set for given class "

    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    .line 149
    :catch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 150
    .line 151
    const-string v0, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    .line 152
    .line 153
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :pswitch_0
    check-cast p0, Landroidx/activity/ᛲᲈᲁ;

    .line 158
    .line 159
    invoke-virtual {p0}, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ()V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :pswitch_1
    check-cast p0, Landroidx/activity/ᛲᲈᲁ;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
