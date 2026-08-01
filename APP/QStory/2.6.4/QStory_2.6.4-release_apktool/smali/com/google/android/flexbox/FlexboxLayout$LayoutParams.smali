.class public Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/android/flexbox/FlexItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/flexbox/FlexboxLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子世楪苏哲兰:Z

.field public 飘花落叶言子楪兰世哲苏:F

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰哲世苏:I

.field public 飘花落叶言子楪兰哲苏世:I

.field public 飘花落叶言子楪兰苏世哲:I

.field public 飘花落叶言子楪兰苏哲世:I

.field public 飘花落叶言子楪哲兰世苏:F

.field public 飘花落叶言子楪哲兰苏世:F

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/flexbox/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
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

.method public final getOrder()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲兰世苏:F

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲兰苏世:F

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰世哲苏:F

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 24
    .line 25
    .line 26
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏世哲:I

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏哲世:I

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰哲世苏:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰哲苏世:I

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    iget-boolean p2, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子世楪苏哲兰:Z

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 49
    .line 50
    .line 51
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    .line 70
    .line 71
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    .line 75
    .line 76
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final 飘花落叶言子世兰楪苏哲()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰哲世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世哲楪苏兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子世楪苏哲兰:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世哲苏兰楪()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世楪兰苏哲()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰世哲苏:F

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世楪苏兰哲()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲兰世苏:F

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世苏兰楪哲()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏哲世:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子世苏楪兰哲()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪兰世哲苏()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪兰世苏哲()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪兰哲世苏()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪兰哲苏世(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏哲世:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪哲兰苏世:F

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    return p0
.end method
