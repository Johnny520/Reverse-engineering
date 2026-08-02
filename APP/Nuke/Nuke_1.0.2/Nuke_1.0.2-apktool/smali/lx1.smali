.class public final Llx1;
.super Lqu2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lis2;
.implements Lgu2;
.implements Lxk1;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Llx1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public i:Lhs2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld5;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ld5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llx1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lqu2;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lds2;->j()Lvr2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lhs2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lvr2;->g()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-direct {v1, v2, v3, p1, p2}, Lhs2;-><init>(JJ)V

    .line 15
    .line 16
    .line 17
    instance-of v0, v0, Lhq0;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lhs2;

    .line 22
    .line 23
    const-wide/16 v2, 0x1

    .line 24
    .line 25
    invoke-direct {v0, v2, v3, p1, p2}, Lhs2;-><init>(JJ)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v1, Lru2;->b:Lru2;

    .line 29
    .line 30
    :cond_0
    iput-object v1, p0, Llx1;->i:Lhs2;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lru2;
    .locals 0

    .line 1
    iget-object p0, p0, Llx1;->i:Lhs2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lru2;Lru2;Lru2;)Lru2;
    .locals 2

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Lhs2;

    .line 3
    .line 4
    check-cast p3, Lhs2;

    .line 5
    .line 6
    iget-wide p0, p0, Lhs2;->c:J

    .line 7
    .line 8
    iget-wide v0, p3, Lhs2;->c:J

    .line 9
    .line 10
    cmp-long p0, p0, v0

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final c(Lru2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lhs2;

    .line 5
    .line 6
    iput-object p1, p0, Llx1;->i:Lhs2;

    .line 7
    .line 8
    return-void
.end method

.method public final d()Lks2;
    .locals 0

    .line 1
    sget-object p0, Lsn;->T:Lsn;

    .line 2
    .line 3
    return-object p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-object v0, p0, Llx1;->i:Lhs2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lds2;->t(Lru2;Lpu2;)Lru2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhs2;

    .line 8
    .line 9
    iget-wide v0, p0, Lhs2;->c:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Llx1;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final h(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Llx1;->i:Lhs2;

    .line 2
    .line 3
    invoke-static {v0}, Lds2;->h(Lru2;)Lru2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhs2;

    .line 8
    .line 9
    iget-wide v1, v0, Lhs2;->c:J

    .line 10
    .line 11
    cmp-long v1, v1, p1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Llx1;->i:Lhs2;

    .line 16
    .line 17
    sget-object v2, Lds2;->c:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    invoke-static {}, Lds2;->j()Lvr2;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v1, p0, v3, v0}, Lds2;->o(Lru2;Lqu2;Lvr2;Lru2;)Lru2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lhs2;

    .line 29
    .line 30
    iput-wide p1, v0, Lhs2;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit v2

    .line 33
    invoke-static {v3, p0}, Lds2;->n(Lvr2;Lpu2;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    monitor-exit v2

    .line 39
    throw p0

    .line 40
    :cond_0
    return-void
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Llx1;->h(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Llx1;->i:Lhs2;

    .line 2
    .line 3
    invoke-static {v0}, Lds2;->h(Lru2;)Lru2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhs2;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "MutableLongState(value="

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-wide v2, v0, Lhs2;->c:J

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ")@"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Llx1;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
