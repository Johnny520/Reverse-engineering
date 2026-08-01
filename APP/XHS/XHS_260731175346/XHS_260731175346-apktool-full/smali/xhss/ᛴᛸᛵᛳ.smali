.class public final Lxhss/ᛴᛸᛵᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛸᛵᲇᲈ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛸᛵᲇᲈ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛴᛸᛵᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛴᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛵᲇᲈ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛴᛸᛵᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛴᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛵᲇᲈ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Member;

    .line 9
    .line 10
    new-instance v0, Lxhss/ᛸᛴᲁᛸ;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/reflect/Field;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lxhss/ᛸᛴᲁᛸ;-><init>(Ljava/lang/reflect/Field;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lxhss/ᛸᛴᲁᛸ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)Lxhss/ᛶᛸᲇᲀ;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Member;

    .line 26
    .line 27
    new-instance v0, Lxhss/ᲀᛴᛳᛴ;

    .line 28
    .line 29
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lxhss/ᲀᛴᛳᛴ;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Member;

    .line 38
    .line 39
    new-instance v0, Lxhss/ᛲᲀᛱ;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Lxhss/ᛲᲀᛱ;-><init>(Ljava/lang/reflect/Method;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lxhss/ᛲᲀᛱ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)Lxhss/ᛶᛸᲇᲀ;

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object v0

    .line 54
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Member;

    .line 55
    .line 56
    new-instance v0, Lxhss/ᛸᛴᲁᛸ;

    .line 57
    .line 58
    check-cast p1, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lxhss/ᛸᛴᲁᛸ;-><init>(Ljava/lang/reflect/Field;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Lxhss/ᛸᛴᲁᛸ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)Lxhss/ᛶᛸᲇᲀ;

    .line 68
    .line 69
    .line 70
    :cond_2
    return-object v0

    .line 71
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Member;

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲀᛴᛳᛴ;

    .line 74
    .line 75
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    invoke-direct {v0, p1}, Lxhss/ᲀᛴᛳᛴ;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Member;

    .line 84
    .line 85
    new-instance v0, Lxhss/ᛲᲀᛱ;

    .line 86
    .line 87
    check-cast p1, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-direct {v0, p1}, Lxhss/ᛲᲀᛱ;-><init>(Ljava/lang/reflect/Method;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lxhss/ᛸᛵᲇᲈ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Lxhss/ᛲᲀᛱ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)Lxhss/ᛶᛸᲇᲀ;

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
