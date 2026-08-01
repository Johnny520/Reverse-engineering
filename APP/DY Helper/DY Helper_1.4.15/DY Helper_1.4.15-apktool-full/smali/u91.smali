.class public final Lu91;
.super Lj02;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lex1;
.implements Lc02;
.implements Lg21;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu91;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ζ:Lcx1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu91;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lj02;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcx1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ltw1;->η()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-direct {v1, p1, v2, v3}, Lcx1;-><init>(IJ)V

    .line 15
    .line 16
    .line 17
    instance-of v0, v0, Lsa0;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lcx1;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    int-to-long v2, v2

    .line 25
    invoke-direct {v0, p1, v2, v3}, Lcx1;-><init>(IJ)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v1, Lk02;->β:Lk02;

    .line 29
    .line 30
    :cond_0
    iput-object v1, p0, Lu91;->ζ:Lcx1;

    .line 31
    .line 32
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

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu91;->η()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Lu91;->θ(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lu91;->ζ:Lcx1;

    .line 2
    .line 3
    invoke-static {v0}, Lax1;->θ(Lk02;)Lk02;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcx1;

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
    iget v0, v0, Lcx1;->γ:I

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
    invoke-virtual {p0}, Lu91;->η()I

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

.method public final α()Lk02;
    .locals 0

    .line 1
    iget-object p0, p0, Lu91;->ζ:Lcx1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final β(Lk02;Lk02;Lk02;)Lk02;
    .locals 0

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Lcx1;

    .line 3
    .line 4
    check-cast p3, Lcx1;

    .line 5
    .line 6
    iget p0, p0, Lcx1;->γ:I

    .line 7
    .line 8
    iget p1, p3, Lcx1;->γ:I

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

.method public final γ(Lk02;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lcx1;

    .line 5
    .line 6
    iput-object p1, p0, Lu91;->ζ:Lcx1;

    .line 7
    .line 8
    return-void
.end method

.method public final δ()Lxn0;
    .locals 0

    .line 1
    sget-object p0, Lxn0;->Δ:Lxn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu91;->ζ:Lcx1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lax1;->υ(Lk02;Li02;)Lk02;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcx1;

    .line 8
    .line 9
    iget p0, p0, Lcx1;->γ:I

    .line 10
    .line 11
    return p0
.end method

.method public final θ(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu91;->ζ:Lcx1;

    .line 2
    .line 3
    invoke-static {v0}, Lax1;->θ(Lk02;)Lk02;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcx1;

    .line 8
    .line 9
    iget v1, v0, Lcx1;->γ:I

    .line 10
    .line 11
    if-eq v1, p1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lu91;->ζ:Lcx1;

    .line 14
    .line 15
    sget-object v2, Lax1;->γ:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_0
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v1, p0, v3, v0}, Lax1;->ο(Lk02;Lj02;Ltw1;Lk02;)Lk02;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcx1;

    .line 27
    .line 28
    iput p1, v0, Lcx1;->γ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v2

    .line 31
    invoke-static {v3, p0}, Lax1;->ξ(Ltw1;Li02;)V

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
