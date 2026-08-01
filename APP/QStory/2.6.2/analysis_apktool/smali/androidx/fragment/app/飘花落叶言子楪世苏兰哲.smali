.class public final Landroidx/fragment/app/飘花落叶言子楪世苏兰哲;
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
    iput p1, p0, Landroidx/fragment/app/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

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
    .locals 1

    .line 1
    iget p0, p0, Landroidx/fragment/app/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/fragment/app/FragmentTabHost$SavedState;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost$SavedState;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p0, Landroidx/fragment/app/FragmentState;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentState;-><init>(Landroid/os/Parcel;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, Landroidx/fragment/app/FragmentManagerState;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰苏哲世:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 57
    .line 58
    sget-object v0, Landroidx/fragment/app/BackStackRecordState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, [Landroidx/fragment/app/BackStackRecordState;

    .line 65
    .line 66
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪哲兰苏世:[Landroidx/fragment/app/BackStackRecordState;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 85
    .line 86
    sget-object v0, Landroidx/fragment/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰苏哲世:Ljava/util/ArrayList;

    .line 93
    .line 94
    sget-object v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Landroidx/fragment/app/FragmentManagerState;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    new-instance p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 104
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iput p1, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲兰世苏:I

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_3
    new-instance p0, Landroidx/fragment/app/BackStackState;

    .line 122
    .line 123
    invoke-direct {p0, p1}, Landroidx/fragment/app/BackStackState;-><init>(Landroid/os/Parcel;)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_4
    new-instance p0, Landroidx/fragment/app/BackStackRecordState;

    .line 128
    .line 129
    invoke-direct {p0, p1}, Landroidx/fragment/app/BackStackRecordState;-><init>(Landroid/os/Parcel;)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Landroidx/fragment/app/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Landroidx/fragment/app/FragmentTabHost$SavedState;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Landroidx/fragment/app/FragmentState;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Landroidx/fragment/app/FragmentManagerState;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Landroidx/fragment/app/BackStackState;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroidx/fragment/app/BackStackRecordState;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
