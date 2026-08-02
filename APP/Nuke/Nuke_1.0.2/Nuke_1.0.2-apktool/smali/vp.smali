.class public final Lvp;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final h:Lr30;

.field public final i:I


# direct methods
.method public constructor <init>(Lr30;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p2, :cond_0

    .line 5
    .line 6
    iput p2, p0, Lvp;->i:I

    .line 7
    .line 8
    iput-object p1, p0, Lvp;->h:Lr30;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "handler < 0"

    .line 12
    .line 13
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public final a(Lvp;)I
    .locals 2

    .line 1
    iget v0, p1, Lvp;->i:I

    .line 2
    .line 3
    iget v1, p0, Lvp;->i:I

    .line 4
    .line 5
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    if-le v1, v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    iget-object p0, p0, Lvp;->h:Lr30;

    .line 14
    .line 15
    iget-object p1, p1, Lvp;->h:Lr30;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lvp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lvp;->a(Lvp;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lvp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lvp;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lvp;->a(Lvp;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lvp;->i:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Lvp;->h:Lr30;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr30;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method
