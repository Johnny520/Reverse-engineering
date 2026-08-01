.class public Landroidx/versionedparcelable/ParcelImpl;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    invoke-direct {v0, p1}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏兰哲;-><init>(Landroid/os/Parcel;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
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
    .locals 0

    .line 1
    new-instance p2, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {p2, p1}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏兰哲;-><init>(Landroid/os/Parcel;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/versionedparcelable/ParcelImpl;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    invoke-virtual {p2, p0}, L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(L飘花落叶言子兰苏哲楪世/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
