.class public final Lfh/h;
.super Lfh/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Lfh/h;->g:S

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lg6/b;->n(I)V

    .line 3
    .line 4
    .line 5
    iget-short v0, p0, Lfh/h;->g:S

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lg6/b;->d(S)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Lg6/b;->m(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 21
    .line 22
    .line 23
    return v0
.end method
