.class public final Lcom/google/android/material/badge/BadgeState$State;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/badge/BadgeState$State;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子世兰楪哲苏:Ljava/lang/Boolean;

.field public 飘花落叶言子世兰楪苏哲:Ljava/lang/Integer;

.field public 飘花落叶言子世兰苏楪哲:Ljava/lang/Integer;

.field public 飘花落叶言子世哲兰楪苏:Ljava/lang/Integer;

.field public 飘花落叶言子世哲兰苏楪:Ljava/lang/Integer;

.field public 飘花落叶言子世哲楪兰苏:Ljava/lang/Integer;

.field public 飘花落叶言子世哲楪苏兰:Ljava/lang/Integer;

.field public 飘花落叶言子世哲苏兰楪:Ljava/lang/Integer;

.field public 飘花落叶言子世哲苏楪兰:Ljava/lang/Integer;

.field public 飘花落叶言子世楪兰哲苏:Ljava/lang/String;

.field public 飘花落叶言子世楪兰苏哲:Ljava/util/Locale;

.field public 飘花落叶言子世楪哲兰苏:I

.field public 飘花落叶言子世楪哲苏兰:I

.field public 飘花落叶言子世楪苏兰哲:I

.field public 飘花落叶言子世楪苏哲兰:Ljava/lang/String;

.field public 飘花落叶言子世苏兰哲楪:Ljava/lang/Integer;

.field public 飘花落叶言子世苏兰楪哲:Ljava/lang/Integer;

.field public 飘花落叶言子世苏哲兰楪:Ljava/lang/Boolean;

.field public 飘花落叶言子世苏哲楪兰:Ljava/lang/Integer;

.field public 飘花落叶言子世苏楪兰哲:I

.field public 飘花落叶言子世苏楪哲兰:Ljava/lang/String;

.field public 飘花落叶言子楪兰世哲苏:Ljava/lang/Integer;

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Integer;

.field public 飘花落叶言子楪兰哲世苏:Ljava/lang/Integer;

.field public 飘花落叶言子楪兰哲苏世:I

.field public 飘花落叶言子楪兰苏世哲:Ljava/lang/Integer;

.field public 飘花落叶言子楪兰苏哲世:Ljava/lang/Integer;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/Integer;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Integer;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/badge/BadgeState$State;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪哲兰世苏:Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪哲兰苏世:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰世苏哲:Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰世哲苏:Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰苏世哲:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰苏哲世:Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰哲世苏:Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 39
    .line 40
    .line 41
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子楪兰哲苏世:I

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪苏哲兰:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪苏兰哲:I

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪哲苏兰:I

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪哲兰苏:I

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪兰哲苏:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    if-eqz p2, :cond_0

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object p2, v0

    .line 77
    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏楪哲兰:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz p2, :cond_1

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏楪兰哲:I

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏哲楪兰:Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏兰楪哲:Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏兰哲楪:Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 109
    .line 110
    .line 111
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲楪苏兰:Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 114
    .line 115
    .line 116
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲楪兰苏:Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 119
    .line 120
    .line 121
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲苏楪兰:Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 124
    .line 125
    .line 126
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲苏兰楪:Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 129
    .line 130
    .line 131
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世兰楪苏哲:Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 134
    .line 135
    .line 136
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲兰楪苏:Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世哲兰苏楪:Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 144
    .line 145
    .line 146
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世苏哲兰楪:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世楪兰苏哲:Ljava/util/Locale;

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世兰楪哲苏:Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Lcom/google/android/material/badge/BadgeState$State;->飘花落叶言子世兰苏楪哲:Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method
