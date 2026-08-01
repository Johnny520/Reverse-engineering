.class public final Landroidx/compose/runtime/snapshots/SnapshotStateSet;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/os/Parcelable;
.implements Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;
.implements Ljava/util/Set;
.implements Ljava/util/RandomAccess;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世兰哲苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Landroidx/compose/runtime/snapshots/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Ljava/util/Set<",
        "TT;>;",
        "Ljava/util/RandomAccess;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateSet;",
        "T",
        "Landroid/os/Parcelable;",
        "Landroidx/compose/runtime/snapshots/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
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
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲兰苏世;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget v2, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏哲兰世;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v3

    .line 43
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 52
    .line 53
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;IL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 54
    .line 55
    .line 56
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    monitor-exit v3

    .line 58
    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 59
    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    monitor-exit v3

    .line 67
    throw p0

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    monitor-exit v0

    .line 70
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    .line 1
    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget v2, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    invoke-direct {v0, v1}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏哲兰世;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_1
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v3

    .line 51
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 60
    .line 61
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;IL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    monitor-exit v3

    .line 66
    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 67
    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    monitor-exit v3

    .line 75
    throw p0

    .line 76
    :catchall_1
    move-exception p0

    .line 77
    monitor-exit v0

    .line 78
    throw p0
.end method

.method public final clear()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, p0, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 18
    .line 19
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    sget-object v4, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    iput-object v4, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iget v4, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    iput v4, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    monitor-exit v1

    .line 34
    invoke-static {v2, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception p0

    .line 41
    :try_start_3
    monitor-exit v3

    .line 42
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :goto_0
    monitor-exit v1

    .line 44
    throw p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪哲兰;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget v2, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏哲兰世;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v3

    .line 43
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 52
    .line 53
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;IL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 54
    .line 55
    .line 56
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    monitor-exit v3

    .line 58
    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 59
    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    monitor-exit v3

    .line 67
    throw p0

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    monitor-exit v0

    .line 70
    throw p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 5

    .line 1
    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget v2, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    invoke-direct {v0, v1}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏哲兰世;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_1
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v3

    .line 51
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v1, p0, v4}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 60
    .line 61
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;IL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    monitor-exit v3

    .line 66
    invoke-static {v4, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 67
    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    monitor-exit v3

    .line 75
    throw p0

    .line 76
    :catchall_1
    move-exception p0

    .line 77
    monitor-exit v0

    .line 78
    throw p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 6

    .line 1
    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget v2, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    new-instance v0, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    invoke-direct {v0, v1}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)V

    .line 25
    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, Ljava/lang/Iterable;

    .line 29
    .line 30
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰哲苏楪世(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/util/Collection;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v0}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏哲兰世;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v4, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 56
    .line 57
    monitor-enter v4

    .line 58
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v1, p0, v5}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 67
    .line 68
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;IL飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    monitor-exit v4

    .line 73
    invoke-static {v5, p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V

    .line 74
    .line 75
    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    monitor-exit v4

    .line 81
    throw p0

    .line 82
    :cond_1
    :goto_0
    return v3

    .line 83
    :cond_2
    const-string p0, "No set to mutate"

    .line 84
    .line 85
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "SnapshotStateSet(value="

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ")@"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p2, p2, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    iput-object v0, p1, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子世苏楪兰哲;

    .line 8
    .line 9
    return-void
.end method
