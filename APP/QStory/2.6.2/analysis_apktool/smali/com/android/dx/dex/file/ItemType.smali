.class public final enum Lcom/android/dx/dex/file/ItemType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/dex/file/ItemType;",
        ">;",
        "Lcom/android/dx/util/ToHuman;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_REF_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_REF_LIST:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_CALL_SITE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_CLASS_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_CLASS_DEF_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_CODE_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_DEBUG_INFO_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_ENCODED_ARRAY_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_EXCEPTION_HANDLER_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_FIELD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_HEADER_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_MAP_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_MAP_LIST:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_METHOD_HANDLE_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_METHOD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_PROTO_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_STRING_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_STRING_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_ITEM:Lcom/android/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_LIST:Lcom/android/dx/dex/file/ItemType;


# instance fields
.field private final humanName:Ljava/lang/String;

.field private final mapValue:I

.field private final typeName:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/android/dx/dex/file/ItemType;
    .locals 25

    .line 1
    sget-object v1, Lcom/android/dx/dex/file/ItemType;->TYPE_HEADER_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    sget-object v2, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 4
    .line 5
    sget-object v3, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 6
    .line 7
    sget-object v4, Lcom/android/dx/dex/file/ItemType;->TYPE_PROTO_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 8
    .line 9
    sget-object v5, Lcom/android/dx/dex/file/ItemType;->TYPE_FIELD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 10
    .line 11
    sget-object v6, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 12
    .line 13
    sget-object v7, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DEF_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 14
    .line 15
    sget-object v8, Lcom/android/dx/dex/file/ItemType;->TYPE_CALL_SITE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 16
    .line 17
    sget-object v9, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_HANDLE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 18
    .line 19
    sget-object v10, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 20
    .line 21
    sget-object v11, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 22
    .line 23
    sget-object v12, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 24
    .line 25
    sget-object v13, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 26
    .line 27
    sget-object v14, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 28
    .line 29
    sget-object v15, Lcom/android/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 30
    .line 31
    sget-object v16, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 32
    .line 33
    sget-object v17, Lcom/android/dx/dex/file/ItemType;->TYPE_DEBUG_INFO_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 34
    .line 35
    sget-object v18, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 36
    .line 37
    sget-object v19, Lcom/android/dx/dex/file/ItemType;->TYPE_ENCODED_ARRAY_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 38
    .line 39
    sget-object v20, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 40
    .line 41
    sget-object v21, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 42
    .line 43
    sget-object v22, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 44
    .line 45
    sget-object v23, Lcom/android/dx/dex/file/ItemType;->TYPE_EXCEPTION_HANDLER_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 46
    .line 47
    sget-object v24, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 48
    .line 49
    filled-new-array/range {v1 .. v24}, [Lcom/android/dx/dex/file/ItemType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "header_item"

    .line 5
    .line 6
    const-string v3, "TYPE_HEADER_ITEM"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_HEADER_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "string_id_item"

    .line 17
    .line 18
    const-string v3, "TYPE_STRING_ID_ITEM"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 24
    .line 25
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "type_id_item"

    .line 29
    .line 30
    const-string v3, "TYPE_TYPE_ID_ITEM"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 36
    .line 37
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "proto_id_item"

    .line 41
    .line 42
    const-string v3, "TYPE_PROTO_ID_ITEM"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_PROTO_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 48
    .line 49
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "field_id_item"

    .line 53
    .line 54
    const-string v3, "TYPE_FIELD_ID_ITEM"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_FIELD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 60
    .line 61
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "method_id_item"

    .line 65
    .line 66
    const-string v3, "TYPE_METHOD_ID_ITEM"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 72
    .line 73
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "class_def_item"

    .line 77
    .line 78
    const-string v3, "TYPE_CLASS_DEF_ITEM"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DEF_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 84
    .line 85
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-string v2, "call_site_id_item"

    .line 89
    .line 90
    const-string v3, "TYPE_CALL_SITE_ID_ITEM"

    .line 91
    .line 92
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_CALL_SITE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 96
    .line 97
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 98
    .line 99
    const/16 v1, 0x8

    .line 100
    .line 101
    const-string v2, "method_handle_item"

    .line 102
    .line 103
    const-string v3, "TYPE_METHOD_HANDLE_ITEM"

    .line 104
    .line 105
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_HANDLE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 109
    .line 110
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 111
    .line 112
    const/16 v1, 0x1000

    .line 113
    .line 114
    const-string v2, "map_list"

    .line 115
    .line 116
    const-string v3, "TYPE_MAP_LIST"

    .line 117
    .line 118
    const/16 v4, 0x9

    .line 119
    .line 120
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 124
    .line 125
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 126
    .line 127
    const/16 v1, 0x1001

    .line 128
    .line 129
    const-string v2, "type_list"

    .line 130
    .line 131
    const-string v3, "TYPE_TYPE_LIST"

    .line 132
    .line 133
    const/16 v4, 0xa

    .line 134
    .line 135
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 139
    .line 140
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 141
    .line 142
    const/16 v1, 0x1002

    .line 143
    .line 144
    const-string v2, "annotation_set_ref_list"

    .line 145
    .line 146
    const-string v3, "TYPE_ANNOTATION_SET_REF_LIST"

    .line 147
    .line 148
    const/16 v4, 0xb

    .line 149
    .line 150
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 154
    .line 155
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 156
    .line 157
    const/16 v1, 0x1003

    .line 158
    .line 159
    const-string v2, "annotation_set_item"

    .line 160
    .line 161
    const-string v3, "TYPE_ANNOTATION_SET_ITEM"

    .line 162
    .line 163
    const/16 v4, 0xc

    .line 164
    .line 165
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 169
    .line 170
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 171
    .line 172
    const/16 v1, 0x2000

    .line 173
    .line 174
    const-string v2, "class_data_item"

    .line 175
    .line 176
    const-string v3, "TYPE_CLASS_DATA_ITEM"

    .line 177
    .line 178
    const/16 v4, 0xd

    .line 179
    .line 180
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 184
    .line 185
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 186
    .line 187
    const/16 v1, 0x2001

    .line 188
    .line 189
    const-string v2, "code_item"

    .line 190
    .line 191
    const-string v3, "TYPE_CODE_ITEM"

    .line 192
    .line 193
    const/16 v4, 0xe

    .line 194
    .line 195
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 199
    .line 200
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 201
    .line 202
    const/16 v1, 0x2002

    .line 203
    .line 204
    const-string v2, "string_data_item"

    .line 205
    .line 206
    const-string v3, "TYPE_STRING_DATA_ITEM"

    .line 207
    .line 208
    const/16 v4, 0xf

    .line 209
    .line 210
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 214
    .line 215
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 216
    .line 217
    const/16 v1, 0x2003

    .line 218
    .line 219
    const-string v2, "debug_info_item"

    .line 220
    .line 221
    const-string v3, "TYPE_DEBUG_INFO_ITEM"

    .line 222
    .line 223
    const/16 v4, 0x10

    .line 224
    .line 225
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_DEBUG_INFO_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 229
    .line 230
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 231
    .line 232
    const/16 v1, 0x2004

    .line 233
    .line 234
    const-string v2, "annotation_item"

    .line 235
    .line 236
    const-string v3, "TYPE_ANNOTATION_ITEM"

    .line 237
    .line 238
    const/16 v4, 0x11

    .line 239
    .line 240
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 244
    .line 245
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 246
    .line 247
    const/16 v1, 0x2005

    .line 248
    .line 249
    const-string v2, "encoded_array_item"

    .line 250
    .line 251
    const-string v3, "TYPE_ENCODED_ARRAY_ITEM"

    .line 252
    .line 253
    const/16 v4, 0x12

    .line 254
    .line 255
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ENCODED_ARRAY_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 259
    .line 260
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 261
    .line 262
    const/16 v1, 0x2006

    .line 263
    .line 264
    const-string v2, "annotations_directory_item"

    .line 265
    .line 266
    const-string v3, "TYPE_ANNOTATIONS_DIRECTORY_ITEM"

    .line 267
    .line 268
    const/16 v4, 0x13

    .line 269
    .line 270
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 271
    .line 272
    .line 273
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 274
    .line 275
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 276
    .line 277
    const-string v1, "map_item"

    .line 278
    .line 279
    const-string v2, "TYPE_MAP_ITEM"

    .line 280
    .line 281
    const/16 v3, 0x14

    .line 282
    .line 283
    const/4 v4, -0x1

    .line 284
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 288
    .line 289
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 290
    .line 291
    const/16 v1, 0x15

    .line 292
    .line 293
    const-string v2, "type_item"

    .line 294
    .line 295
    const-string v3, "TYPE_TYPE_ITEM"

    .line 296
    .line 297
    invoke-direct {v0, v3, v1, v4, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 298
    .line 299
    .line 300
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 301
    .line 302
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 303
    .line 304
    const/16 v1, 0x16

    .line 305
    .line 306
    const-string v2, "exception_handler_item"

    .line 307
    .line 308
    const-string v3, "TYPE_EXCEPTION_HANDLER_ITEM"

    .line 309
    .line 310
    invoke-direct {v0, v3, v1, v4, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 311
    .line 312
    .line 313
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_EXCEPTION_HANDLER_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 314
    .line 315
    new-instance v0, Lcom/android/dx/dex/file/ItemType;

    .line 316
    .line 317
    const/16 v1, 0x17

    .line 318
    .line 319
    const-string v2, "annotation_set_ref_item"

    .line 320
    .line 321
    const-string v3, "TYPE_ANNOTATION_SET_REF_ITEM"

    .line 322
    .line 323
    invoke-direct {v0, v3, v1, v4, v2}, Lcom/android/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 324
    .line 325
    .line 326
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 327
    .line 328
    invoke-static {}, Lcom/android/dx/dex/file/ItemType;->$values()[Lcom/android/dx/dex/file/ItemType;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    sput-object v0, Lcom/android/dx/dex/file/ItemType;->$VALUES:[Lcom/android/dx/dex/file/ItemType;

    .line 333
    .line 334
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/android/dx/dex/file/ItemType;->mapValue:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/android/dx/dex/file/ItemType;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    const-string p1, "_item"

    .line 9
    .line 10
    invoke-virtual {p4, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    const/4 p2, 0x5

    .line 18
    invoke-static {p2, p1, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    :cond_0
    const/16 p1, 0x5f

    .line 23
    .line 24
    const/16 p2, 0x20

    .line 25
    .line 26
    invoke-virtual {p4, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/android/dx/dex/file/ItemType;->humanName:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/dex/file/ItemType;
    .locals 1

    .line 1
    const-class v0, Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/dex/file/ItemType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/android/dx/dex/file/ItemType;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/dex/file/ItemType;->$VALUES:[Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/android/dx/dex/file/ItemType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/android/dx/dex/file/ItemType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMapValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/ItemType;->mapValue:I

    .line 2
    .line 3
    return p0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ItemType;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ItemType;->humanName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
