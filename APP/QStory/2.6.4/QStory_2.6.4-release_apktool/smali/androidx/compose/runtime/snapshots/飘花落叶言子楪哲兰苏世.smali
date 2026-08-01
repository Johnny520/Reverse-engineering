.class public final Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    new-instance v2, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 9
    .line 10
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-direct {v2, v3, v4, v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;-><init>(JL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)V

    .line 19
    .line 20
    .line 21
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲苏兰世()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    new-instance v3, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 30
    .line 31
    const-wide/16 v4, 0x1

    .line 32
    .line 33
    invoke-direct {v3, v4, v5, v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;-><init>(JL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)V

    .line 34
    .line 35
    .line 36
    iput-object v3, v2, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 37
    .line 38
    :cond_0
    iput-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    const-class p1, Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_1
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_0
    if-ge v2, v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-class p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v1, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子世苏哲兰楪/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-virtual {v1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世兰哲苏;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    new-instance p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 41
    .line 42
    invoke-virtual {v1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>(L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世苏兰哲;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    iget p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    .line 57
    new-instance p0, Lcom/google/android/material/stateful/ExtendableSavedState;

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/stateful/ExtendableSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 58
    :pswitch_0
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    invoke-direct {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 59
    :pswitch_1
    new-instance p0, Landroidx/viewpager/widget/ViewPager$SavedState;

    invoke-direct {p0, p1, v0}, Landroidx/viewpager/widget/ViewPager$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 60
    :pswitch_2
    new-instance p0, Lcom/google/android/material/internal/ParcelableSparseArray;

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/internal/ParcelableSparseArray;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 61
    :pswitch_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p0

    if-nez p0, :cond_0

    .line 62
    sget-object v0, Landroidx/customview/view/AbsSavedState;->飘花落叶言子楪哲兰世苏:Landroidx/customview/view/AbsSavedState;

    goto :goto_0

    .line 63
    :cond_0
    const-string p0, "superState must be null"

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    :goto_0
    return-object v0

    .line 64
    :pswitch_4
    invoke-static {p1, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    move-result-object p0

    return-object p0

    .line 65
    :pswitch_5
    invoke-static {p1, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0

    nop

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

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/google/android/material/stateful/ExtendableSavedState;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/stateful/ExtendableSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, Landroidx/viewpager/widget/ViewPager$SavedState;

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_2
    new-instance p0, Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/internal/ParcelableSparseArray;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    sget-object p0, Landroidx/customview/view/AbsSavedState;->飘花落叶言子楪哲兰世苏:Landroidx/customview/view/AbsSavedState;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p0, "superState must be null"

    .line 40
    .line 41
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    :goto_0
    return-object p0

    .line 46
    :pswitch_4
    invoke-static {p1, p2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_5
    invoke-static {p1, p2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/material/stateful/ExtendableSavedState;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Landroidx/viewpager/widget/ViewPager$SavedState;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Landroidx/customview/view/AbsSavedState;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 25
    .line 26
    return-object p0

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
