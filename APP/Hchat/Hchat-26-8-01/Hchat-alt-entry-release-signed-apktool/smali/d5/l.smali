.class public final Ld5/l;
.super Ld5/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ld5/m;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ld5/l;->b:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Le5/a;)V
    .locals 2

    .line 1
    iget v0, p0, Ld5/l;->b:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x2b

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lq5/a;->write(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, v0}, Le5/a;->z(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
