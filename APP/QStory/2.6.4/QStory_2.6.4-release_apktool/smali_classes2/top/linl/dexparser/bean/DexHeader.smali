.class public Ltop/linl/dexparser/bean/DexHeader;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public checkSum:J

.field public class_defs_off:I

.field public class_defs_size:I

.field public data_off:I

.field public data_size:I

.field public endian_tag:I

.field public field_ids_off:I

.field public field_ids_size:I

.field public file_size:I

.field public header_size:I

.field public link_off:I

.field public link_size:I

.field public magic:Ljava/lang/String;

.field public map_off:I

.field public method_ids_off:I

.field public method_ids_size:I

.field public proto_ids_off:I

.field public proto_ids_size:I

.field public signature:Ljava/lang/String;

.field public string_ids_off:I

.field public string_ids_size:I

.field public type_ids_off:I

.field public type_ids_size:I


# direct methods
.method public constructor <init>(Ltop/linl/dexparser/util/ByteReader;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/String;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ltop/linl/dexparser/bean/DexHeader;->magic:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byte2Int([B)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iput-wide v1, p0, Ltop/linl/dexparser/bean/DexHeader;->checkSum:J

    .line 29
    .line 30
    const/16 v1, 0x14

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToHex([B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Ltop/linl/dexparser/bean/DexHeader;->signature:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->file_size:I

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->header_size:I

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->endian_tag:I

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->link_size:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->link_off:I

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->map_off:I

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->string_ids_size:I

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->string_ids_off:I

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->type_ids_size:I

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->type_ids_off:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_size:I

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_off:I

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->field_ids_size:I

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->field_ids_off:I

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->method_ids_size:I

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->method_ids_off:I

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->class_defs_size:I

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->class_defs_off:I

    .line 221
    .line 222
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iput v1, p0, Ltop/linl/dexparser/bean/DexHeader;->data_size:I

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    iput p1, p0, Ltop/linl/dexparser/bean/DexHeader;->data_off:I

    .line 241
    .line 242
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DexHeader{magic=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/bean/DexHeader;->magic:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', checkSum="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Ltop/linl/dexparser/bean/DexHeader;->checkSum:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", signature=\'"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ltop/linl/dexparser/bean/DexHeader;->signature:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "\', file_size="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->file_size:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", header_size="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->header_size:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", endian_tag="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->endian_tag:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", link_size="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->link_size:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", link_off="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->link_off:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", map_off="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->map_off:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", string_ids_size="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->string_ids_size:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", string_ids_off="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->string_ids_off:I

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", type_ids_size="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->type_ids_size:I

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", type_ids_off="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->type_ids_off:I

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", proto_ids_size="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_size:I

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", proto_ids_off="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_off:I

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, ", field_ids_size="

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->field_ids_size:I

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, ", field_ids_off="

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->field_ids_off:I

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, ", method_ids_size="

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->method_ids_size:I

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, ", method_ids_off="

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->method_ids_off:I

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v1, ", class_defs_size="

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->class_defs_size:I

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v1, ", class_defs_off="

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->class_defs_off:I

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v1, ", data_size="

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget v1, p0, Ltop/linl/dexparser/bean/DexHeader;->data_size:I

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v1, ", data_off="

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    iget p0, p0, Ltop/linl/dexparser/bean/DexHeader;->data_off:I

    .line 229
    .line 230
    const/16 v1, 0x7d

    .line 231
    .line 232
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0
.end method
