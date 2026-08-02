.class public final Lhg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lyf1;


# direct methods
.method public synthetic constructor <init>(Lyf1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhg1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lhg1;->i:Lyf1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lhg1;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lhg1;->i:Lyf1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Member;

    .line 9
    .line 10
    new-instance v0, Lpi0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lpi0;-><init>(Ljava/lang/reflect/Field;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lpi0;->f0(Ljava/lang/Object;)Ll01;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Member;

    .line 29
    .line 30
    new-instance v0, Lkz;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lkz;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Member;

    .line 44
    .line 45
    new-instance v0, Lzg1;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast p1, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Lzg1;-><init>(Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Lzg1;->f0(Ljava/lang/Object;)Ll01;

    .line 60
    .line 61
    .line 62
    :cond_1
    return-object v0

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Member;

    .line 64
    .line 65
    new-instance v0, Lpi0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lpi0;-><init>(Ljava/lang/reflect/Field;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 76
    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lpi0;->f0(Ljava/lang/Object;)Ll01;

    .line 80
    .line 81
    .line 82
    :cond_2
    return-object v0

    .line 83
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Member;

    .line 84
    .line 85
    new-instance v0, Lkz;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 91
    .line 92
    invoke-direct {v0, p1}, Lkz;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Member;

    .line 99
    .line 100
    new-instance v0, Lzg1;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast p1, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-direct {v0, p1}, Lzg1;-><init>(Ljava/lang/reflect/Method;)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lyf1;->b:Ljava/lang/Object;

    .line 111
    .line 112
    if-eqz p0, :cond_3

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Lzg1;->f0(Ljava/lang/Object;)Ll01;

    .line 115
    .line 116
    .line 117
    :cond_3
    return-object v0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
