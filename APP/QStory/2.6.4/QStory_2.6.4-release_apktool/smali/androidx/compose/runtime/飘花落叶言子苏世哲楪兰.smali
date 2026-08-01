.class public final Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:I

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
    .locals 5

    .line 1
    iget p0, p0, Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;-><init>(J)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-direct {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;-><init>(F)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-direct {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v2, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-direct {v2, v3, v4, v0, v1}, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;-><init>(JD)V

    .line 57
    .line 58
    .line 59
    instance-of p1, p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    if-nez p1, :cond_0

    .line 62
    .line 63
    new-instance p1, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;

    .line 64
    .line 65
    const-wide/16 v3, 0x1

    .line 66
    .line 67
    invoke-direct {p1, v3, v4, v0, v1}, Landroidx/compose/runtime/飘花落叶言子哲世苏兰楪;-><init>(JD)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v2, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 71
    .line 72
    :cond_0
    iput-object v2, p0, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/runtime/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
