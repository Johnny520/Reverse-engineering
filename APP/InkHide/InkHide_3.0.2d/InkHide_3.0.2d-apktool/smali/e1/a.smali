.class public abstract Le1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;

.field public static final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    .line 1
    new-instance v0, LE0/c;

    .line 2
    .line 3
    const-string v9, "boolean"

    .line 4
    .line 5
    const-string v10, "Z"

    .line 6
    .line 7
    invoke-direct {v0, v9, v10}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, LE0/c;

    .line 11
    .line 12
    const-string v11, "byte"

    .line 13
    .line 14
    const-string v12, "B"

    .line 15
    .line 16
    invoke-direct {v1, v11, v12}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, LE0/c;

    .line 20
    .line 21
    const-string v13, "char"

    .line 22
    .line 23
    const-string v14, "C"

    .line 24
    .line 25
    invoke-direct {v2, v13, v14}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, LE0/c;

    .line 29
    .line 30
    const-string v15, "short"

    .line 31
    .line 32
    const-string v4, "S"

    .line 33
    .line 34
    invoke-direct {v3, v15, v4}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v5, v4

    .line 38
    new-instance v4, LE0/c;

    .line 39
    .line 40
    const-string v6, "int"

    .line 41
    .line 42
    const-string v7, "I"

    .line 43
    .line 44
    invoke-direct {v4, v6, v7}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v8, v5

    .line 48
    new-instance v5, LE0/c;

    .line 49
    .line 50
    move-object/from16 v16, v15

    .line 51
    .line 52
    const-string v15, "float"

    .line 53
    .line 54
    move-object/from16 v17, v13

    .line 55
    .line 56
    const-string v13, "F"

    .line 57
    .line 58
    invoke-direct {v5, v15, v13}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v18, v6

    .line 62
    .line 63
    new-instance v6, LE0/c;

    .line 64
    .line 65
    move-object/from16 v19, v13

    .line 66
    .line 67
    const-string v13, "long"

    .line 68
    .line 69
    move-object/from16 v20, v15

    .line 70
    .line 71
    const-string v15, "J"

    .line 72
    .line 73
    invoke-direct {v6, v13, v15}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v21, v7

    .line 77
    .line 78
    new-instance v7, LE0/c;

    .line 79
    .line 80
    move-object/from16 v22, v13

    .line 81
    .line 82
    const-string v13, "double"

    .line 83
    .line 84
    move-object/from16 v23, v15

    .line 85
    .line 86
    const-string v15, "D"

    .line 87
    .line 88
    invoke-direct {v7, v13, v15}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v24, v8

    .line 92
    .line 93
    new-instance v8, LE0/c;

    .line 94
    .line 95
    move-object/from16 v25, v13

    .line 96
    .line 97
    const-string v13, "void"

    .line 98
    .line 99
    move-object/from16 v26, v15

    .line 100
    .line 101
    const-string v15, "V"

    .line 102
    .line 103
    invoke-direct {v8, v13, v15}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object/from16 v27, v18

    .line 107
    .line 108
    move-object/from16 v18, v15

    .line 109
    .line 110
    move-object/from16 v15, v27

    .line 111
    .line 112
    move-object/from16 v27, v13

    .line 113
    .line 114
    move-object/from16 v28, v21

    .line 115
    .line 116
    move-object/from16 v13, v24

    .line 117
    .line 118
    filled-new-array/range {v0 .. v8}, [LE0/c;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, LF0/v;->a0([LE0/c;)Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, Le1/a;->a:Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    new-instance v0, LE0/c;

    .line 129
    .line 130
    invoke-direct {v0, v10, v9}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, LE0/c;

    .line 134
    .line 135
    invoke-direct {v1, v12, v11}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v2, LE0/c;

    .line 139
    .line 140
    move-object/from16 v3, v17

    .line 141
    .line 142
    invoke-direct {v2, v14, v3}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v3, LE0/c;

    .line 146
    .line 147
    move-object/from16 v4, v16

    .line 148
    .line 149
    invoke-direct {v3, v13, v4}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance v4, LE0/c;

    .line 153
    .line 154
    move-object/from16 v5, v28

    .line 155
    .line 156
    invoke-direct {v4, v5, v15}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v5, LE0/c;

    .line 160
    .line 161
    move-object/from16 v7, v19

    .line 162
    .line 163
    move-object/from16 v6, v20

    .line 164
    .line 165
    invoke-direct {v5, v7, v6}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    new-instance v6, LE0/c;

    .line 169
    .line 170
    move-object/from16 v7, v22

    .line 171
    .line 172
    move-object/from16 v8, v23

    .line 173
    .line 174
    invoke-direct {v6, v8, v7}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    new-instance v7, LE0/c;

    .line 178
    .line 179
    move-object/from16 v8, v25

    .line 180
    .line 181
    move-object/from16 v9, v26

    .line 182
    .line 183
    invoke-direct {v7, v9, v8}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance v8, LE0/c;

    .line 187
    .line 188
    move-object/from16 v10, v18

    .line 189
    .line 190
    move-object/from16 v9, v27

    .line 191
    .line 192
    invoke-direct {v8, v10, v9}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v29, v0

    .line 196
    .line 197
    move-object/from16 v30, v1

    .line 198
    .line 199
    move-object/from16 v31, v2

    .line 200
    .line 201
    move-object/from16 v32, v3

    .line 202
    .line 203
    move-object/from16 v33, v4

    .line 204
    .line 205
    move-object/from16 v34, v5

    .line 206
    .line 207
    move-object/from16 v35, v6

    .line 208
    .line 209
    move-object/from16 v36, v7

    .line 210
    .line 211
    move-object/from16 v37, v8

    .line 212
    .line 213
    filled-new-array/range {v29 .. v37}, [LE0/c;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, LF0/v;->a0([LE0/c;)Ljava/util/LinkedHashMap;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, Le1/a;->b:Ljava/util/LinkedHashMap;

    .line 222
    .line 223
    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "typeSign"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x5b

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "(this as java.lang.String).substring(startIndex)"

    .line 21
    .line 22
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "[]"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ne v1, v3, :cond_2

    .line 52
    .line 53
    sget-object v0, Le1/a;->b:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v1, "Unknown primitive typeSign: "

    .line 67
    .line 68
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v1, 0x4c

    .line 81
    .line 82
    if-ne v0, v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    sub-int/2addr v0, v3

    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/16 v1, 0x3b

    .line 94
    .line 95
    if-ne v0, v1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    sub-int/2addr v0, v3

    .line 102
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 107
    .line 108
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/16 v0, 0x2f

    .line 112
    .line 113
    const/16 v1, 0x2e

    .line 114
    .line 115
    invoke-static {p0, v0, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string v1, "Unknown class sign: "

    .line 123
    .line 124
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "typeName"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "[]"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, -0x2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 26
    .line 27
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Le1/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "["

    .line 35
    .line 36
    invoke-static {v0, p0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    sget-object v0, Le1/a;->a:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const/16 v0, 0x2e

    .line 52
    .line 53
    const/16 v1, 0x2f

    .line 54
    .line 55
    invoke-static {p0, v0, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "L"

    .line 60
    .line 61
    const-string v1, ";"

    .line 62
    .line 63
    invoke-static {v0, p0, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_1
    return-object v0
.end method
