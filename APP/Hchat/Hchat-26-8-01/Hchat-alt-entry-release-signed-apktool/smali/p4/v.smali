.class public final Lp4/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Lu4/t;


# direct methods
.method public constructor <init>(ILu4/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lp4/v;->a:I

    .line 9
    .line 10
    iput-object p2, p0, Lp4/v;->b:Lu4/t;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "position == null"

    .line 14
    .line 15
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    const-string p1, "address < 0"

    .line 21
    .line 22
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1
.end method
