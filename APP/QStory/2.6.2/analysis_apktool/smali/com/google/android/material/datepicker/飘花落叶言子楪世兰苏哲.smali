.class public final Lcom/google/android/material/datepicker/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class p0, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x2

    .line 16
    sget-object v1, Lcom/google/android/material/datepicker/CompositeDateValidator;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/datepicker/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    sget-object v1, Lcom/google/android/material/datepicker/CompositeDateValidator;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/datepicker/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    :cond_1
    :goto_0
    new-instance p1, Lcom/google/android/material/datepicker/CompositeDateValidator;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p0, v1}, Lcom/google/android/material/datepicker/CompositeDateValidator;-><init>(Ljava/util/ArrayList;Lcom/google/android/material/datepicker/飘花落叶言子楪世兰哲苏;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p0, p1, [Lcom/google/android/material/datepicker/CompositeDateValidator;

    .line 2
    .line 3
    return-object p0
.end method
