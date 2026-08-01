.class public final LD/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LD/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LD/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Li/S;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, v0, Li/S;->a:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Landroidx/fragment/app/D;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Landroidx/fragment/app/D;-><init>(Landroid/os/Parcel;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_1
    new-instance v0, Landroidx/fragment/app/A;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput-object v1, v0, Landroidx/fragment/app/A;->e:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Landroidx/fragment/app/A;->f:Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, Landroidx/fragment/app/A;->g:Ljava/util/ArrayList;

    .line 50
    .line 51
    sget-object v1, Landroidx/fragment/app/D;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, v0, Landroidx/fragment/app/A;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, v0, Landroidx/fragment/app/A;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    sget-object v1, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, [Landroidx/fragment/app/b;

    .line 72
    .line 73
    iput-object v1, v0, Landroidx/fragment/app/A;->c:[Landroidx/fragment/app/b;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iput v1, v0, Landroidx/fragment/app/A;->d:I

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, v0, Landroidx/fragment/app/A;->e:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, v0, Landroidx/fragment/app/A;->f:Ljava/util/ArrayList;

    .line 92
    .line 93
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, v0, Landroidx/fragment/app/A;->g:Ljava/util/ArrayList;

    .line 100
    .line 101
    sget-object v1, Landroidx/fragment/app/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v0, Landroidx/fragment/app/A;->h:Ljava/util/ArrayList;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_2
    new-instance v0, Landroidx/fragment/app/y;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, Landroidx/fragment/app/y;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    iput p1, v0, Landroidx/fragment/app/y;->b:I

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_3
    new-instance v0, Landroidx/fragment/app/b;

    .line 129
    .line 130
    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    .line 131
    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_4
    new-instance v0, Landroidx/activity/result/a;

    .line 135
    .line 136
    invoke-direct {v0, p1}, Landroidx/activity/result/a;-><init>(Landroid/os/Parcel;)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    :pswitch_5
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 141
    .line 142
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_6
    new-instance v0, LD/o;

    .line 147
    .line 148
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iput p1, v0, LD/o;->a:I

    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LD/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Li/S;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Landroidx/fragment/app/D;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Landroidx/fragment/app/A;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Landroidx/fragment/app/y;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Landroidx/fragment/app/b;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Landroidx/activity/result/a;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LD/o;

    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
