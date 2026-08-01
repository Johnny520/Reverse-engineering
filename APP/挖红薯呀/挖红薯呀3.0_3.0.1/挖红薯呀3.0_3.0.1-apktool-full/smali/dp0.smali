.class public final Ldp0;
.super Le41;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lwg0;
.implements Lx21;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldp0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public e:Lv21;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo1;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lo1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldp0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Le41;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lt21;->j()Ll21;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lv21;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll21;->g()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-direct {v1, p1, v2, v3}, Lv21;-><init>(IJ)V

    .line 15
    .line 16
    .line 17
    instance-of v0, v0, Lqx;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lv21;

    .line 22
    .line 23
    const-wide/16 v2, 0x1

    .line 24
    .line 25
    invoke-direct {v0, p1, v2, v3}, Lv21;-><init>(IJ)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v1, Lf41;->b:Lf41;

    .line 29
    .line 30
    :cond_0
    iput-object v1, p0, Ldp0;->e:Lv21;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lf41;
    .locals 0

    .line 1
    iget-object p0, p0, Ldp0;->e:Lv21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lf41;Lf41;Lf41;)Lf41;
    .locals 0

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Lv21;

    .line 3
    .line 4
    check-cast p3, Lv21;

    .line 5
    .line 6
    iget p0, p0, Lv21;->c:I

    .line 7
    .line 8
    iget p1, p3, Lv21;->c:I

    .line 9
    .line 10
    if-ne p0, p1, :cond_0

    .line 11
    .line 12
    return-object p2

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public final c(Lf41;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lv21;

    .line 5
    .line 6
    iput-object p1, p0, Ldp0;->e:Lv21;

    .line 7
    .line 8
    return-void
.end method

.method public final d()Ln2;
    .locals 0

    .line 1
    sget-object p0, Ln2;->U:Ln2;

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

.method public final g()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldp0;->e:Lv21;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lt21;->t(Lf41;Ld41;)Lf41;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv21;

    .line 8
    .line 9
    iget p0, p0, Lv21;->c:I

    .line 10
    .line 11
    return p0
.end method

.method public final h(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldp0;->e:Lv21;

    .line 2
    .line 3
    invoke-static {v0}, Lt21;->h(Lf41;)Lf41;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv21;

    .line 8
    .line 9
    iget v1, v0, Lv21;->c:I

    .line 10
    .line 11
    if-eq v1, p1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Ldp0;->e:Lv21;

    .line 14
    .line 15
    sget-object v2, Lt21;->c:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_0
    invoke-static {}, Lt21;->j()Ll21;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v1, p0, v3, v0}, Lt21;->o(Lf41;Le41;Ll21;Lf41;)Lf41;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lv21;

    .line 27
    .line 28
    iput p1, v0, Lv21;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v2

    .line 31
    invoke-static {v3, p0}, Lt21;->n(Ll21;Ld41;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    monitor-exit v2

    .line 37
    throw p0

    .line 38
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ldp0;->e:Lv21;

    .line 2
    .line 3
    invoke-static {v0}, Lt21;->h(Lf41;)Lf41;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv21;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "MutableIntState(value="

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, v0, Lv21;->c:I

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldp0;->g()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
