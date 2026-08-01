.class public final Lcom/android/dx/rop/cst/Zeroes;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

.method public static zeroFor(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/Constant;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "no zero for type: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :pswitch_0
    sget-object p0, Lcom/android/dx/rop/cst/CstKnownNull;->THE_ONE:Lcom/android/dx/rop/cst/CstKnownNull;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    sget-object p0, Lcom/android/dx/rop/cst/CstShort;->VALUE_0:Lcom/android/dx/rop/cst/CstShort;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_2
    sget-object p0, Lcom/android/dx/rop/cst/CstLong;->VALUE_0:Lcom/android/dx/rop/cst/CstLong;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_3
    sget-object p0, Lcom/android/dx/rop/cst/CstInteger;->VALUE_0:Lcom/android/dx/rop/cst/CstInteger;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_4
    sget-object p0, Lcom/android/dx/rop/cst/CstFloat;->VALUE_0:Lcom/android/dx/rop/cst/CstFloat;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_5
    sget-object p0, Lcom/android/dx/rop/cst/CstDouble;->VALUE_0:Lcom/android/dx/rop/cst/CstDouble;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_6
    sget-object p0, Lcom/android/dx/rop/cst/CstChar;->VALUE_0:Lcom/android/dx/rop/cst/CstChar;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_7
    sget-object p0, Lcom/android/dx/rop/cst/CstByte;->VALUE_0:Lcom/android/dx/rop/cst/CstByte;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_8
    sget-object p0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_FALSE:Lcom/android/dx/rop/cst/CstBoolean;

    .line 57
    .line 58
    return-object p0

    .line 59
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
