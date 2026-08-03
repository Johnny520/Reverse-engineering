.class public final Lv4/i;
.super Lv4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lv4/q;

.field public final h:I


# direct methods
.method public constructor <init>(Lv4/q;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lv4/i;->g:Lv4/q;

    .line 7
    .line 8
    iput p2, p0, Lv4/i;->h:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "invokeDynamic == null"

    .line 12
    .line 13
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/i;->g:Lv4/q;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/q;->k:Lv4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv4/h;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 2

    .line 1
    check-cast p1, Lv4/i;

    .line 2
    .line 3
    iget-object v0, p0, Lv4/i;->g:Lv4/q;

    .line 4
    .line 5
    iget-object v1, p1, Lv4/i;->g:Lv4/q;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget v0, p0, Lv4/i;->h:I

    .line 15
    .line 16
    iget p1, p1, Lv4/i;->h:I

    .line 17
    .line 18
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CallSiteRef"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/i;->g:Lv4/q;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/q;->k:Lv4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv4/h;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
