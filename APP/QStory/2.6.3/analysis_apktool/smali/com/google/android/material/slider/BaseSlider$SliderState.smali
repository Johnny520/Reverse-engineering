.class Lcom/google/android/material/slider/BaseSlider$SliderState;
.super Landroid/view/View$BaseSavedState;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/slider/BaseSlider$SliderState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:F

.field public 飘花落叶言子楪哲兰世苏:F

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

.field public 飘花落叶言子楪哲苏兰世:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/slider/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/slider/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/slider/BaseSlider$SliderState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->飘花落叶言子楪哲苏兰世:F

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 7
    .line 8
    .line 9
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->飘花落叶言子楪哲兰世苏:F

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->飘花落叶言子楪兰世苏哲:F

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 22
    .line 23
    .line 24
    iget-boolean p0, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->飘花落叶言子楪兰世哲苏:Z

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    new-array p2, p2, [Z

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    aput-boolean p0, p2, v0

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
