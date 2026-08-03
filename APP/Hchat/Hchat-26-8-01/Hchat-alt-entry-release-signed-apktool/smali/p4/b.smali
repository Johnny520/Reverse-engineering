.class public final Lp4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lv4/d0;

.field public final h:I


# direct methods
.method public constructor <init>(Lv4/d0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p2, :cond_0

    .line 5
    .line 6
    iput p2, p0, Lp4/b;->h:I

    .line 7
    .line 8
    iput-object p1, p0, Lp4/b;->g:Lv4/d0;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "handler < 0"

    .line 12
    .line 13
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method


# virtual methods
.method public final a(Lp4/b;)I
    .locals 2

    .line 1
    iget v0, p1, Lp4/b;->h:I

    .line 2
    .line 3
    iget v1, p0, Lp4/b;->h:I

    .line 4
    .line 5
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    if-le v1, v0, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    iget-object v0, p0, Lp4/b;->g:Lv4/d0;

    .line 14
    .line 15
    iget-object p1, p1, Lp4/b;->g:Lv4/d0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp4/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp4/b;->a(Lp4/b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lp4/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lp4/b;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lp4/b;->a(Lp4/b;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lp4/b;->h:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lp4/b;->g:Lv4/d0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lv4/d0;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    return v1
.end method
