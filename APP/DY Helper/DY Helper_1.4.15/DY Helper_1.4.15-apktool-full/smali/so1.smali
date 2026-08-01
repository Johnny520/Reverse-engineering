.class public final Lso1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lso1;->α:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lso1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lso1;

    .line 7
    .line 8
    iget p1, p1, Lso1;->α:I

    .line 9
    .line 10
    iget p0, p0, Lso1;->α:I

    .line 11
    .line 12
    if-eq p0, p1, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lso1;->α:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iget p0, p0, Lso1;->α:I

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const-string p0, "Checkbox"

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const-string p0, "Switch"

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const/4 v0, 0x3

    .line 16
    if-ne p0, v0, :cond_2

    .line 17
    .line 18
    const-string p0, "RadioButton"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_2
    const/4 v0, 0x4

    .line 22
    if-ne p0, v0, :cond_3

    .line 23
    .line 24
    const-string p0, "Tab"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_3
    const/4 v0, 0x5

    .line 28
    if-ne p0, v0, :cond_4

    .line 29
    .line 30
    const-string p0, "Image"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_4
    const/4 v0, 0x6

    .line 34
    if-ne p0, v0, :cond_5

    .line 35
    .line 36
    const-string p0, "DropdownList"

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_5
    const/4 v0, 0x7

    .line 40
    if-ne p0, v0, :cond_6

    .line 41
    .line 42
    const-string p0, "Picker"

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_6
    const/16 v0, 0x8

    .line 46
    .line 47
    if-ne p0, v0, :cond_7

    .line 48
    .line 49
    const-string p0, "Carousel"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_7
    const-string p0, "Unknown"

    .line 53
    .line 54
    return-object p0
.end method
