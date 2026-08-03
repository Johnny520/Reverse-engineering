.class Lbsh/BSHAssignment;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public operator:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 17
    .line 18
    if-eq p2, v0, :cond_4

    .line 19
    .line 20
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    instance-of v0, p1, Ljava/lang/Character;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    instance-of v0, p1, Ljava/lang/Number;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    instance-of v0, p1, Lbsh/Primitive;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    :cond_1
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    instance-of v0, p2, Ljava/lang/Character;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    instance-of v0, p2, Ljava/lang/Number;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    instance-of v0, p2, Lbsh/Primitive;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v0, Lbsh/UtilEvalError;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "Non primitive value in operator: "

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    sget-object p1, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 70
    .line 71
    aget-object p1, p1, p3

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const-string p3, " "

    .line 78
    .line 79
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :cond_3
    :goto_0
    invoke-static {p1, p2, p3}, Lbsh/Operators;->binaryOperation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_4
    new-instance p1, Lbsh/UtilEvalError;

    .line 105
    .line 106
    const-string p2, "Illegal use of null object or \'null\' literal"

    .line 107
    .line 108
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_5
    :goto_1
    invoke-static {p1, p2, p3}, Lbsh/Operators;->arbitraryObjectsBinaryOperation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Lbsh/SafeNavigate; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p1

    .line 15
    :catch_0
    sget-object p1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lbsh/BSHPrimaryExpression;

    .line 23
    .line 24
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, p1, p2}, Lbsh/BSHPrimaryExpression;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v2, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v3, 0x55

    .line 39
    .line 40
    if-eq v2, v3, :cond_1

    .line 41
    .line 42
    :try_start_1
    invoke-virtual {v0}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    goto :goto_0

    .line 47
    :catch_1
    move-exception p2

    .line 48
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    throw p1

    .line 53
    :cond_1
    const/4 v2, 0x0

    .line 54
    :goto_0
    iget-object v4, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/16 v5, 0x92

    .line 61
    .line 62
    if-ne v4, v5, :cond_2

    .line 63
    .line 64
    sget-object v4, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 65
    .line 66
    if-eq v4, v2, :cond_2

    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_2
    const/4 v4, 0x1

    .line 70
    invoke-virtual {p0, v4}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-interface {v6, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    sget-object v6, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 79
    .line 80
    if-eq p2, v6, :cond_7

    .line 81
    .line 82
    :try_start_2
    iget-object v6, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eq v6, v3, :cond_5

    .line 89
    .line 90
    if-eq v6, v5, :cond_4

    .line 91
    .line 92
    packed-switch v6, :pswitch_data_0

    .line 93
    .line 94
    .line 95
    new-instance p2, Lbsh/InterpreterError;

    .line 96
    .line 97
    const-string v0, "unimplemented operator in assignment BSH"

    .line 98
    .line 99
    invoke-direct {p2, v0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2

    .line 103
    :catch_2
    move-exception p2

    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :pswitch_0
    const/16 v3, 0x7a

    .line 107
    .line 108
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :pswitch_1
    const/16 v3, 0x78

    .line 118
    .line 119
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :pswitch_2
    const/16 v3, 0x76

    .line 129
    .line 130
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_3
    const/16 v3, 0x74

    .line 140
    .line 141
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    :pswitch_4
    const/16 v3, 0x72

    .line 151
    .line 152
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :pswitch_5
    const/16 v3, 0x70

    .line 162
    .line 163
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_6
    const/16 v3, 0x6e

    .line 173
    .line 174
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    return-object p1

    .line 183
    :pswitch_7
    const/16 v3, 0x6c

    .line 184
    .line 185
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1

    .line 194
    :pswitch_8
    const/16 v3, 0x6b

    .line 195
    .line 196
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :pswitch_9
    const/16 v3, 0x6a

    .line 206
    .line 207
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :pswitch_a
    const/16 v3, 0x69

    .line 217
    .line 218
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    return-object p1

    .line 227
    :pswitch_b
    sget-object v3, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 228
    .line 229
    if-ne v3, v2, :cond_3

    .line 230
    .line 231
    invoke-virtual {v0}, Lbsh/LHS;->getType()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    const-class v4, Ljava/lang/String;

    .line 236
    .line 237
    if-ne v3, v4, :cond_3

    .line 238
    .line 239
    const-string v2, "null"

    .line 240
    .line 241
    :cond_3
    const/16 v3, 0x68

    .line 242
    .line 243
    invoke-direct {p0, v2, p2, v3}, Lbsh/BSHAssignment;->operation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    :cond_4
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1

    .line 257
    :cond_5
    invoke-virtual {v0}, Lbsh/LHS;->isFinal()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_6

    .line 262
    .line 263
    invoke-virtual {v0}, Lbsh/LHS;->getVariable()Lbsh/Variable;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0, p2, v4}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 268
    .line 269
    .line 270
    return-object p2

    .line 271
    :cond_6
    invoke-virtual {v0, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_2

    .line 275
    return-object p1

    .line 276
    :goto_1
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    throw p1

    .line 281
    :cond_7
    new-instance p2, Lbsh/EvalException;

    .line 282
    .line 283
    const-string v0, "illegal void assignment"

    .line 284
    .line 285
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 286
    .line 287
    .line 288
    throw p2

    .line 289
    :pswitch_data_0
    .packed-switch 0x7c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, ": "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    aget-object v2, v2, v3

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method
