.class public abstract Lv7/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv7/k;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lv7/k;->h:I

    .line 7
    .line 8
    return-void
.end method

.method public static a([Lv7/k;II)Lv7/k;
    .locals 3

    .line 1
    and-int/2addr p1, p2

    .line 2
    array-length p2, p0

    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    if-ge v0, p2, :cond_1

    .line 5
    .line 6
    aget-object v1, p0, v0

    .line 7
    .line 8
    iget v2, v1, Lv7/k;->h:I

    .line 9
    .line 10
    if-ne p1, v2, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lv7/k;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    iget v0, p0, Lv7/k;->h:I

    .line 8
    .line 9
    iget p1, p1, Lv7/k;->h:I

    .line 10
    .line 11
    invoke-static {v0, p1}, Ly7/a;->b(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/k;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
