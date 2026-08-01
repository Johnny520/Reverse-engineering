.class final Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;
.super Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;",
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u4e16\u5170\u696a\u82cf;",
        "Landroid/os/Parcelable;",
        "runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 2

    .line 1
    iget-object p2, p0, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;

    .line 4
    .line 5
    invoke-static {p2, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;

    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲苏兰:D

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
