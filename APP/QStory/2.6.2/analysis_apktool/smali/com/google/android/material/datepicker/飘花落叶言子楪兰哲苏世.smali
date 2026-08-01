.class public final Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-class v0, Ljava/lang/Long;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lcom/google/android/material/datepicker/SingleDateSelector;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Long;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    new-instance p0, Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世苏哲:Ljava/lang/Long;

    .line 37
    .line 38
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Long;

    .line 49
    .line 50
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Long;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    new-instance p0, Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    invoke-direct {p0, v0, v1}, Lcom/google/android/material/datepicker/DateValidatorPointForward;-><init>(J)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    new-instance p0, Lcom/google/android/material/datepicker/DateValidatorPointBackward;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-direct {p0, v0, v1}, Lcom/google/android/material/datepicker/DateValidatorPointBackward;-><init>(J)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p0, p1}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世哲苏兰(II)Lcom/google/android/material/datepicker/Month;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/material/datepicker/SingleDateSelector;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/material/datepicker/DateValidatorPointBackward;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/material/datepicker/Month;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
