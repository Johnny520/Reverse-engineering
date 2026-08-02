.class public final synthetic Ltd2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxn0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv20;


# direct methods
.method public synthetic constructor <init>(Lv20;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltd2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltd2;->b:Lv20;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ltd2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ltd2;->b:Lv20;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    :try_start_0
    invoke-static {v0, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    aget-object v2, p1, v1

    .line 17
    .line 18
    const-string v3, "length"

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    const-wide/32 v6, 0x7fffffff

    .line 23
    .line 24
    .line 25
    invoke-static/range {v2 .. v7}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p1, v0

    .line 30
    invoke-virtual {p0, p1}, Lv20;->g(I)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    array-length p1, p0

    .line 35
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Lkotlin/UByteArray;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lkotlin/UByteArray;-><init>([B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p0, v0

    .line 51
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_0
    return-object p0

    .line 56
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :try_start_1
    invoke-static {v1, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/16 p1, 0x10

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lv20;->g(I)[B

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 p1, 0x6

    .line 69
    aget-byte v0, p0, p1

    .line 70
    .line 71
    and-int/lit8 v0, v0, 0xf

    .line 72
    .line 73
    or-int/lit8 v0, v0, 0x40

    .line 74
    .line 75
    int-to-byte v0, v0

    .line 76
    aput-byte v0, p0, p1

    .line 77
    .line 78
    const/16 p1, 0x8

    .line 79
    .line 80
    aget-byte v0, p0, p1

    .line 81
    .line 82
    and-int/lit8 v0, v0, 0x3f

    .line 83
    .line 84
    or-int/lit16 v0, v0, 0x80

    .line 85
    .line 86
    int-to-byte v0, v0

    .line 87
    aput-byte v0, p0, p1

    .line 88
    .line 89
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance p1, Ljava/util/UUID;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-direct {p1, v0, v1, v2, v3}, Ljava/util/UUID;-><init>(JJ)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    goto :goto_1

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    move-object p0, v0

    .line 120
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :goto_1
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
