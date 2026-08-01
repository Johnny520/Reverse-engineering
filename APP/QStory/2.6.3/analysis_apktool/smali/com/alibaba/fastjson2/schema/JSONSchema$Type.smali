.class public final enum Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/schema/JSONSchema;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/schema/JSONSchema$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum AllOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Any:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum AnyOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Array:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Const:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Enum:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum OneOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public static final enum UnresolvedReference:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 14

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 6
    .line 7
    sget-object v3, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Array:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 8
    .line 9
    sget-object v4, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 10
    .line 11
    sget-object v5, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 12
    .line 13
    sget-object v6, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 14
    .line 15
    sget-object v7, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Enum:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 16
    .line 17
    sget-object v8, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Const:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 18
    .line 19
    sget-object v9, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->OneOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 20
    .line 21
    sget-object v10, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AllOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 22
    .line 23
    sget-object v11, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AnyOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 24
    .line 25
    sget-object v12, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Any:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 26
    .line 27
    sget-object v13, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->UnresolvedReference:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 28
    .line 29
    filled-new-array/range {v0 .. v13}, [Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    const-string v1, "Null"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 10
    .line 11
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 12
    .line 13
    const-string v1, "Boolean"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 20
    .line 21
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 22
    .line 23
    const-string v1, "Object"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 30
    .line 31
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 32
    .line 33
    const-string v1, "Array"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Array:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 40
    .line 41
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 42
    .line 43
    const-string v1, "Number"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 50
    .line 51
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 52
    .line 53
    const-string v1, "String"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 60
    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 62
    .line 63
    const-string v1, "Integer"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 70
    .line 71
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 72
    .line 73
    const-string v1, "Enum"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Enum:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 80
    .line 81
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 82
    .line 83
    const-string v1, "Const"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Const:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 91
    .line 92
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 93
    .line 94
    const-string v1, "OneOf"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->OneOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 102
    .line 103
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 104
    .line 105
    const-string v1, "AllOf"

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AllOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 113
    .line 114
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 115
    .line 116
    const-string v1, "AnyOf"

    .line 117
    .line 118
    const/16 v2, 0xb

    .line 119
    .line 120
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AnyOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 124
    .line 125
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 126
    .line 127
    const-string v1, "Any"

    .line 128
    .line 129
    const/16 v2, 0xc

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Any:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 135
    .line 136
    new-instance v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 137
    .line 138
    const-string v1, "UnresolvedReference"

    .line 139
    .line 140
    const/16 v2, 0xd

    .line 141
    .line 142
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->UnresolvedReference:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 146
    .line 147
    invoke-static {}, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->$values()[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->$VALUES:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 152
    .line 153
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static of(Ljava/lang/String;)Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    sparse-switch v1, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :sswitch_0
    const-string v1, "integer"

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_1
    const/16 v2, 0xd

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v1, "Boolean"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_2
    const/16 v2, 0xc

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v1, "array"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_3

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_3
    const/16 v2, 0xb

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v1, "boolean"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_4
    const/16 v2, 0xa

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v1, "Array"

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_5
    const/16 v2, 0x9

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_5
    const-string v1, "null"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_6

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_6
    const/16 v2, 0x8

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v1, "Null"

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    const/4 v2, 0x7

    .line 109
    goto :goto_0

    .line 110
    :sswitch_7
    const-string v1, "Integer"

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_8

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    const/4 v2, 0x6

    .line 120
    goto :goto_0

    .line 121
    :sswitch_8
    const-string v1, "string"

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_9

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_9
    const/4 v2, 0x5

    .line 131
    goto :goto_0

    .line 132
    :sswitch_9
    const-string v1, "object"

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-nez p0, :cond_a

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_a
    const/4 v2, 0x4

    .line 142
    goto :goto_0

    .line 143
    :sswitch_a
    const-string v1, "number"

    .line 144
    .line 145
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_b

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_b
    const/4 v2, 0x3

    .line 153
    goto :goto_0

    .line 154
    :sswitch_b
    const-string v1, "String"

    .line 155
    .line 156
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_c

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_c
    const/4 v2, 0x2

    .line 164
    goto :goto_0

    .line 165
    :sswitch_c
    const-string v1, "Object"

    .line 166
    .line 167
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-nez p0, :cond_d

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_d
    const/4 v2, 0x1

    .line 175
    goto :goto_0

    .line 176
    :sswitch_d
    const-string v1, "Number"

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-nez p0, :cond_e

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_e
    const/4 v2, 0x0

    .line 186
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_0
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Array:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_2
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_4
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_5
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_6
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 209
    .line 210
    return-object p0

    .line 211
    :sswitch_data_0
    .sparse-switch
        -0x74423897 -> :sswitch_d
        -0x739a70a1 -> :sswitch_c
        -0x6bc5b3cf -> :sswitch_b
        -0x3da724b7 -> :sswitch_a
        -0x3cff5cc1 -> :sswitch_9
        -0x352a9fef -> :sswitch_8
        -0x2811e6e2 -> :sswitch_7
        0x2539a7 -> :sswitch_6
        0x33c587 -> :sswitch_5
        0x3c98239 -> :sswitch_4
        0x3db6c28 -> :sswitch_3
        0x58c7259 -> :sswitch_2
        0x67140408 -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->$VALUES:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 8
    .line 9
    return-object v0
.end method
