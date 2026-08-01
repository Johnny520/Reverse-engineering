.class public final Lcom/android/dx/rop/code/RegOps;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final ADD:I = 0xe

.field public static final AGET:I = 0x26

.field public static final AND:I = 0x14

.field public static final APUT:I = 0x27

.field public static final ARRAY_LENGTH:I = 0x22

.field public static final CHECK_CAST:I = 0x2b

.field public static final CMPG:I = 0x1c

.field public static final CMPL:I = 0x1b

.field public static final CONST:I = 0x5

.field public static final CONV:I = 0x1d

.field public static final DIV:I = 0x11

.field public static final FILLED_NEW_ARRAY:I = 0x2a

.field public static final FILL_ARRAY_DATA:I = 0x39

.field public static final GET_FIELD:I = 0x2d

.field public static final GET_STATIC:I = 0x2e

.field public static final GOTO:I = 0x6

.field public static final IF_EQ:I = 0x7

.field public static final IF_GE:I = 0xa

.field public static final IF_GT:I = 0xc

.field public static final IF_LE:I = 0xb

.field public static final IF_LT:I = 0x9

.field public static final IF_NE:I = 0x8

.field public static final INSTANCE_OF:I = 0x2c

.field public static final INVOKE_CUSTOM:I = 0x3b

.field public static final INVOKE_DIRECT:I = 0x34

.field public static final INVOKE_INTERFACE:I = 0x35

.field public static final INVOKE_POLYMORPHIC:I = 0x3a

.field public static final INVOKE_STATIC:I = 0x31

.field public static final INVOKE_SUPER:I = 0x33

.field public static final INVOKE_VIRTUAL:I = 0x32

.field public static final MARK_LOCAL:I = 0x36

.field public static final MONITOR_ENTER:I = 0x24

.field public static final MONITOR_EXIT:I = 0x25

.field public static final MOVE:I = 0x2

.field public static final MOVE_EXCEPTION:I = 0x4

.field public static final MOVE_PARAM:I = 0x3

.field public static final MOVE_RESULT:I = 0x37

.field public static final MOVE_RESULT_PSEUDO:I = 0x38

.field public static final MUL:I = 0x10

.field public static final NEG:I = 0x13

.field public static final NEW_ARRAY:I = 0x29

.field public static final NEW_INSTANCE:I = 0x28

.field public static final NOP:I = 0x1

.field public static final NOT:I = 0x1a

.field public static final OR:I = 0x15

.field public static final PUT_FIELD:I = 0x2f

.field public static final PUT_STATIC:I = 0x30

.field public static final REM:I = 0x12

.field public static final RETURN:I = 0x21

.field public static final SHL:I = 0x17

.field public static final SHR:I = 0x18

.field public static final SUB:I = 0xf

.field public static final SWITCH:I = 0xd

.field public static final THROW:I = 0x23

.field public static final TO_BYTE:I = 0x1e

.field public static final TO_CHAR:I = 0x1f

.field public static final TO_SHORT:I = 0x20

.field public static final USHR:I = 0x19

.field public static final XOR:I = 0x16


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static flippedIfOpcode(I)I
    .locals 1

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string v0, "Unrecognized IF regop: "

    .line 5
    .line 6
    invoke-static {p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :pswitch_0
    const/16 p0, 0x9

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_1
    const/16 p0, 0xa

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_2
    const/16 p0, 0xb

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_3
    const/16 p0, 0xc

    .line 25
    .line 26
    :pswitch_4
    return p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static opName(I)Ljava/lang/String;
    .locals 2

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "unknown-"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_1
    const-string p0, "invoke-custom"

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    const-string p0, "invoke-polymorphic"

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_3
    const-string p0, "fill-array-data"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_4
    const-string p0, "move-result-pseudo"

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_5
    const-string p0, "move-result"

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_6
    const-string p0, "invoke-interface"

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_7
    const-string p0, "invoke-direct"

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_8
    const-string p0, "invoke-super"

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_9
    const-string p0, "invoke-virtual"

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_a
    const-string p0, "invoke-static"

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_b
    const-string p0, "put-static"

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_c
    const-string p0, "put-field"

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_d
    const-string p0, "get-static"

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_e
    const-string p0, "get-field"

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_f
    const-string p0, "instance-of"

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_10
    const-string p0, "check-cast"

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_11
    const-string p0, "filled-new-array"

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_12
    const-string p0, "new-array"

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_13
    const-string p0, "new-instance"

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_14
    const-string p0, "aput"

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_15
    const-string p0, "aget"

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_16
    const-string p0, "monitor-exit"

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_17
    const-string p0, "monitor-enter"

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_18
    const-string p0, "throw"

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_19
    const-string p0, "array-length"

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_1a
    const-string p0, "return"

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_1b
    const-string p0, "to-short"

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1c
    const-string p0, "to-char"

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_1d
    const-string p0, "to-byte"

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1e
    const-string p0, "conv"

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_1f
    const-string p0, "cmpg"

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_20
    const-string p0, "cmpl"

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_21
    const-string p0, "not"

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_22
    const-string p0, "ushr"

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_23
    const-string p0, "shr"

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_24
    const-string p0, "shl"

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_25
    const-string p0, "xor"

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_26
    const-string p0, "or"

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_27
    const-string p0, "and"

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_28
    const-string p0, "neg"

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_29
    const-string p0, "rem"

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_2a
    const-string p0, "div"

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_2b
    const-string p0, "mul"

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_2c
    const-string p0, "sub"

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_2d
    const-string p0, "add"

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_2e
    const-string p0, "switch"

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_2f
    const-string p0, "if-gt"

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_30
    const-string p0, "if-le"

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_31
    const-string p0, "if-ge"

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_32
    const-string p0, "if-lt"

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_33
    const-string p0, "if-ne"

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_34
    const-string p0, "if-eq"

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_35
    const-string p0, "goto"

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_36
    const-string p0, "const"

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_37
    const-string p0, "move-exception"

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_38
    const-string p0, "move-param"

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_39
    const-string p0, "move"

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_3a
    const-string p0, "nop"

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
