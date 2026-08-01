.class public final synthetic Lxhss/ᲁᛱᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲁᛱᲀᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lxhss/ᲁᛱᲀᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lxhss/ᲁᛴᛷᛵ;

    .line 9
    .line 10
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_0
    if-nez p1, :cond_0

    .line 14
    .line 15
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :pswitch_1
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    check-cast p2, Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eq p1, p0, :cond_1

    .line 41
    .line 42
    move v0, v1

    .line 43
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    check-cast p2, Ljava/lang/reflect/Field;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ne p1, p0, :cond_2

    .line 61
    .line 62
    move v0, v1

    .line 63
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    check-cast p2, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eq p1, p0, :cond_3

    .line 81
    .line 82
    move v0, v1

    .line 83
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    check-cast p2, Ljava/lang/reflect/Method;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ne p1, p0, :cond_4

    .line 101
    .line 102
    move v0, v1

    .line 103
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
